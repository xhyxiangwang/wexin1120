package com.tencent.mm.plugin.appbrand;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Paint.FontMetrics;
import android.graphics.Rect;
import android.os.Parcelable;
import android.text.TextUtils;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.a.g;
import com.tencent.mm.compatible.d.p;
import com.tencent.mm.g.a.bq;
import com.tencent.mm.g.a.bq.a;
import com.tencent.mm.g.a.bq.b;
import com.tencent.mm.kernel.h;
import com.tencent.mm.plugin.base.model.c;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;

public final class l
{
  public static Intent a(Context paramContext, bq parambq, int paramInt, Bitmap paramBitmap, boolean paramBoolean)
  {
    GMTrace.i(19685579948032L, 146669);
    if ((paramContext == null) || (parambq.fvQ.username == null))
    {
      w.e("MicroMsg.AppBrandShortcutManager", "buildIntent, wrong parameters");
      GMTrace.o(19685579948032L, 146669);
      return null;
    }
    if ((paramBitmap == null) && (paramBoolean))
    {
      w.e("MicroMsg.AppBrandShortcutManager", "no bmp");
      GMTrace.o(19685579948032L, 146669);
      return null;
    }
    Object localObject2 = parambq.fvQ.username;
    if (TextUtils.isEmpty(parambq.fvR.fvS)) {}
    String str;
    for (Object localObject1 = localObject2;; localObject1 = parambq.fvR.fvS)
    {
      str = parambq.fvR.appId;
      localObject3 = c.tb((String)localObject2);
      if (!bg.mZ((String)localObject3)) {
        break;
      }
      GMTrace.o(19685579948032L, 146669);
      return null;
    }
    if (paramBoolean) {}
    StringBuilder localStringBuilder;
    for (localObject2 = "com.android.launcher.action.INSTALL_SHORTCUT";; localObject2 = "com.android.launcher.action.UNINSTALL_SHORTCUT")
    {
      localStringBuilder = new StringBuilder();
      parambq = parambq.fvR.fvT;
      int j = parambq.length;
      int i = 0;
      while (i < j)
      {
        localStringBuilder.append(parambq[i]);
        i += 1;
      }
    }
    parambq = g.n(((String)localObject1 + localStringBuilder.toString()).getBytes());
    localObject2 = new Intent((String)localObject2);
    ((Intent)localObject2).putExtra("android.intent.extra.shortcut.NAME", (String)localObject1);
    ((Intent)localObject2).putExtra("duplicate", false);
    localObject1 = new Intent("com.tencent.mm.action.WX_SHORTCUT");
    ((Intent)localObject1).putExtra("type", 1);
    ((Intent)localObject1).putExtra("id", (String)localObject3);
    ((Intent)localObject1).putExtra("ext_info", c.tb(str));
    Object localObject3 = new StringBuilder();
    h.xx();
    ((Intent)localObject1).putExtra("token", c.bp(str, com.tencent.mm.kernel.a.wy()));
    ((Intent)localObject1).putExtra("digest", parambq);
    ((Intent)localObject1).putExtra("ext_info_1", paramInt);
    ((Intent)localObject1).setPackage(paramContext.getPackageName());
    ((Intent)localObject1).addFlags(67108864);
    ((Intent)localObject2).putExtra("android.intent.extra.shortcut.INTENT", (Parcelable)localObject1);
    ((Intent)localObject2).putExtra("android.intent.extra.shortcut.ICON", paramBitmap);
    GMTrace.o(19685579948032L, 146669);
    return (Intent)localObject2;
  }
  
  public static Bitmap a(Context paramContext, Bitmap paramBitmap, int paramInt)
  {
    Object localObject = null;
    GMTrace.i(19685848383488L, 146671);
    if ((paramContext == null) || (paramBitmap == null) || (paramBitmap.isRecycled()))
    {
      GMTrace.o(19685848383488L, 146671);
      return null;
    }
    int i = (int)(com.tencent.mm.bq.a.getDensity(paramContext) * 48.0F);
    Bitmap localBitmap = Bitmap.createScaledBitmap(paramBitmap, i, i, false);
    paramBitmap = (Bitmap)localObject;
    if (localBitmap != null)
    {
      paramBitmap = localBitmap.copy(Bitmap.Config.ARGB_8888, true);
      localBitmap.recycle();
    }
    if (paramInt == 2) {
      a(paramContext, paramBitmap, com.tencent.mm.bq.a.W(paramContext, p.i.iyD));
    }
    for (;;)
    {
      GMTrace.o(19685848383488L, 146671);
      return paramBitmap;
      if (paramInt == 1) {
        a(paramContext, paramBitmap, com.tencent.mm.bq.a.W(paramContext, p.i.iyE));
      }
    }
  }
  
  public static Bitmap a(bq parambq)
  {
    GMTrace.i(19685714165760L, 146670);
    String[] arrayOfString = parambq.fvR.fvT;
    int j = arrayOfString.length;
    int i = 0;
    parambq = null;
    while (i < j)
    {
      Object localObject = arrayOfString[i];
      if (!bg.mZ((String)localObject))
      {
        localObject = com.tencent.mm.modelappbrand.a.b.CT().hh((String)localObject);
        if (localObject != null)
        {
          parambq = (bq)localObject;
          if (!((Bitmap)localObject).isRecycled()) {}
        }
        else
        {
          parambq = null;
        }
      }
      i += 1;
    }
    GMTrace.o(19685714165760L, 146670);
    return parambq;
  }
  
  private static void a(Context paramContext, Bitmap paramBitmap, String paramString)
  {
    GMTrace.i(19685982601216L, 146672);
    if ((paramContext == null) || (paramBitmap == null) || (paramBitmap.isRecycled()))
    {
      GMTrace.o(19685982601216L, 146672);
      return;
    }
    if (bg.mZ(paramString))
    {
      GMTrace.o(19685982601216L, 146672);
      return;
    }
    int i = paramBitmap.getWidth();
    float f3 = com.tencent.mm.bq.a.getDensity(paramContext);
    float f1 = 4.0F * f3;
    float f2 = 2.0F * f3;
    paramContext = new Paint();
    paramContext.setTextSize(f3 * 6.0F);
    paramContext.setFakeBoldText(true);
    paramContext.setAntiAlias(true);
    f3 = paramContext.measureText(paramString);
    Paint.FontMetrics localFontMetrics = paramContext.getFontMetrics();
    float f4 = localFontMetrics.bottom;
    float f5 = localFontMetrics.top;
    paramContext.setColor(Color.parseColor("#459AE9"));
    paramBitmap = new Canvas(paramBitmap);
    Rect localRect = new Rect((int)(i - f3 - 2.0F * f1), i * 2 / 3, i, (int)(f4 - f5 + i * 2 / 3 + 2.0F * f2));
    paramBitmap.drawRect(localRect, paramContext);
    paramContext.setColor(-1);
    paramBitmap.drawText(paramString, localRect.left + f1, localRect.top + f2 - localFontMetrics.ascent, paramContext);
    GMTrace.o(19685982601216L, 146672);
  }
  
  public static boolean d(Context paramContext, String paramString, int paramInt)
  {
    GMTrace.i(19685445730304L, 146668);
    if ((paramContext == null) || (paramString == null))
    {
      w.e("MicroMsg.AppBrandShortcutManager", "add fail, invalid argument");
      GMTrace.o(19685445730304L, 146668);
      return false;
    }
    Object localObject1 = new bq();
    ((bq)localObject1).fvQ.username = paramString;
    com.tencent.mm.sdk.b.a.uLm.m((com.tencent.mm.sdk.b.b)localObject1);
    if (((bq)localObject1).fvR.fvT == null)
    {
      w.e("MicroMsg.AppBrandShortcutManager", "no such user");
      GMTrace.o(19685445730304L, 146668);
      return false;
    }
    Object localObject2 = a((bq)localObject1);
    if (localObject2 == null)
    {
      w.i("MicroMsg.AppBrandShortcutManager", "bitmap do not exist, delay get.");
      GMTrace.o(19685445730304L, 146668);
      return true;
    }
    localObject2 = a(paramContext, (bq)localObject1, paramInt, a(paramContext, (Bitmap)localObject2, paramInt), true);
    if (localObject2 == null)
    {
      w.e("MicroMsg.AppBrandShortcutManager", "add fail, intent is null");
      GMTrace.o(19685445730304L, 146668);
      return false;
    }
    if ((Intent)((Intent)localObject2).getParcelableExtra("android.intent.extra.shortcut.INTENT") != null)
    {
      String str = ((bq)localObject1).fvR.appId;
      localObject1 = com.tencent.mm.plugin.base.model.b.bo(str + String.valueOf(paramInt), p.te());
      if (localObject1 != null)
      {
        localObject1 = com.tencent.mm.plugin.base.model.b.W(((String)localObject1).getBytes());
        w.i("MicroMsg.AppBrandShortcutManager", "alvinluo appId: %s, shortcutId: %s", new Object[] { str, localObject1 });
      }
    }
    for (;;)
    {
      com.tencent.mm.plugin.base.model.b.a(paramContext, (Intent)localObject2, (String)localObject1, true);
      w.i("MicroMsg.AppBrandShortcutManager", "add shortcut %s", new Object[] { paramString });
      GMTrace.o(19685445730304L, 146668);
      return true;
      localObject1 = null;
      break;
      localObject1 = null;
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */