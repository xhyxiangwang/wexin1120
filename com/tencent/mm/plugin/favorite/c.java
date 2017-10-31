package com.tencent.mm.plugin.favorite;

import android.content.Context;
import android.content.Intent;
import android.widget.Toast;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.l;
import com.tencent.mm.platformtools.d;
import com.tencent.mm.pluginsdk.h;
import com.tencent.mm.pluginsdk.i;
import com.tencent.mm.pluginsdk.k;
import com.tencent.mm.protocal.c.sw;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.x.m;
import com.tencent.mm.x.q;
import com.tencent.mm.x.q.b;
import com.tencent.mm.x.x.a;
import com.tencent.mm.x.x.b;
import java.util.ArrayList;

public final class c
  implements k
{
  public static i ifM;
  public static h ifN;
  
  public c()
  {
    GMTrace.i(6256022519808L, 46611);
    GMTrace.o(6256022519808L, 46611);
  }
  
  public static void a(long paramLong, sw paramsw, String paramString1, String paramString2, ArrayList<String> paramArrayList, Context paramContext)
  {
    GMTrace.i(6256425172992L, 46614);
    if ((paramsw == null) || (paramContext == null))
    {
      GMTrace.o(6256425172992L, 46614);
      return;
    }
    Intent localIntent = new Intent();
    localIntent.putExtra("KFavLocSigleView", true);
    localIntent.putExtra("map_view_type", 2);
    localIntent.putExtra("kFavInfoLocalId", paramLong);
    localIntent.putExtra("kwebmap_slat", paramsw.lat);
    localIntent.putExtra("kwebmap_lng", paramsw.lng);
    localIntent.putExtra("kPoiName", paramsw.fJh);
    localIntent.putExtra("Kwebmap_locaion", paramsw.label);
    if (paramsw.fFj >= 0) {
      localIntent.putExtra("kwebmap_scale", paramsw.fFj);
    }
    localIntent.putExtra("kisUsername", paramString1);
    localIntent.putExtra("kwebmap_from_to", true);
    localIntent.putExtra("kRemark", paramString2);
    localIntent.putExtra("kTags", paramArrayList);
    localIntent.putExtra("kFavCanDel", true);
    localIntent.putExtra("kFavCanRemark", true);
    ifM.o(localIntent, paramContext);
    GMTrace.o(6256425172992L, 46614);
  }
  
  public static void a(String paramString1, String paramString2, Context paramContext)
  {
    GMTrace.i(6256827826176L, 46617);
    if (bg.mZ(paramString1))
    {
      w.w("MicroMsg.FavApplication", "save image fail, path is null");
      GMTrace.o(6256827826176L, 46617);
      return;
    }
    if (!d.a(paramString1, paramContext, R.l.dPq)) {
      Toast.makeText(paramContext, paramString2, 1).show();
    }
    GMTrace.o(6256827826176L, 46617);
  }
  
  public static String bY(long paramLong)
  {
    GMTrace.i(6257230479360L, 46620);
    if (paramLong == 0L)
    {
      GMTrace.o(6257230479360L, 46620);
      return "0KB";
    }
    String str;
    if (paramLong * 1.0D / 1048576.0D >= 1.0D)
    {
      str = String.format("%dMB", new Object[] { Integer.valueOf((int)(paramLong * 1.0D / 1048576.0D)) });
      GMTrace.o(6257230479360L, 46620);
      return str;
    }
    if (paramLong * 1.0D / 1024.0D >= 1.0D)
    {
      str = String.format("%dKB", new Object[] { Integer.valueOf((int)(paramLong * 1.0D / 1024.0D)) });
      GMTrace.o(6257230479360L, 46620);
      return str;
    }
    GMTrace.o(6257230479360L, 46620);
    return "1KB";
  }
  
  public static void c(String paramString, Context paramContext)
  {
    GMTrace.i(6256559390720L, 46615);
    if (bg.mZ(paramString))
    {
      w.w("MicroMsg.FavApplication", "share image to timeline fail, filePath is null");
      GMTrace.o(6256559390720L, 46615);
      return;
    }
    Intent localIntent = new Intent();
    String str1 = "fav_" + m.zF() + "_0";
    String str2 = q.gi(str1);
    q.Aw().n(str2, true).k("prePublishId", str1);
    localIntent.putExtra("reportSessionId", str2);
    ifM.a(paramString, localIntent, paramContext);
    GMTrace.o(6256559390720L, 46615);
  }
  
  public static void d(String paramString, Context paramContext)
  {
    GMTrace.i(6256693608448L, 46616);
    if (bg.mZ(paramString))
    {
      w.w("MicroMsg.FavApplication", "share image to friend fail, imgPath is null");
      GMTrace.o(6256693608448L, 46616);
      return;
    }
    Intent localIntent = new Intent();
    localIntent.putExtra("Retr_File_Name", paramString);
    localIntent.putExtra("Retr_Compress_Type", 0);
    localIntent.putExtra("Retr_Msg_Type", 0);
    ifM.l(localIntent, paramContext);
    GMTrace.o(6256693608448L, 46616);
  }
  
  public static String getAppName(Context paramContext, String paramString)
  {
    GMTrace.i(6256962043904L, 46618);
    x.b localb = x.a.hfp;
    if (localb != null)
    {
      paramContext = localb.m(paramContext, paramString);
      GMTrace.o(6256962043904L, 46618);
      return paramContext;
    }
    GMTrace.o(6256962043904L, 46618);
    return "";
  }
  
  public static void j(Intent paramIntent, Context paramContext)
  {
    GMTrace.i(6256290955264L, 46613);
    paramIntent.putExtra("geta8key_scene", 14);
    ifM.j(paramIntent, paramContext);
    GMTrace.o(6256290955264L, 46613);
  }
  
  public final void a(h paramh)
  {
    GMTrace.i(6257096261632L, 46619);
    ifN = paramh;
    GMTrace.o(6257096261632L, 46619);
  }
  
  public final void a(i parami)
  {
    GMTrace.i(6256156737536L, 46612);
    ifM = parami;
    GMTrace.o(6256156737536L, 46612);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/favorite/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */