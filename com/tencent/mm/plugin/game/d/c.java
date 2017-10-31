package com.tencent.mm.plugin.game.d;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.graphics.Color;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Bundle;
import android.os.HandlerThread;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.i;
import com.tencent.mm.R.m;
import com.tencent.mm.an.a.a.c.a;
import com.tencent.mm.an.n;
import com.tencent.mm.g.a.jy;
import com.tencent.mm.plugin.appbrand.report.AppBrandStatObject;
import com.tencent.mm.plugin.game.c.v;
import com.tencent.mm.plugin.game.model.SubCoreGameCenter;
import com.tencent.mm.plugin.game.model.a.a;
import com.tencent.mm.plugin.game.model.ai;
import com.tencent.mm.plugin.game.model.e;
import com.tencent.mm.plugin.game.model.q;
import com.tencent.mm.plugin.game.model.q.a;
import com.tencent.mm.plugin.game.model.t;
import com.tencent.mm.plugin.game.model.u;
import com.tencent.mm.plugin.game.ui.GameDetailUI2;
import com.tencent.mm.pluginsdk.model.app.an;
import com.tencent.mm.pluginsdk.model.app.f;
import com.tencent.mm.pluginsdk.model.app.i;
import com.tencent.mm.pluginsdk.model.app.m;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.j;
import java.io.File;
import java.net.URLDecoder;
import java.util.Iterator;
import java.util.LinkedList;

public final class c
{
  private static int hIj;
  private static volatile af hmL;
  private static final Object jwi;
  private static DisplayMetrics mMw;
  private static int mRq;
  private static int maxSize;
  private static Rect rect;
  
  static
  {
    GMTrace.i(12575395807232L, 93694);
    maxSize = -1;
    hIj = -1;
    mRq = -1;
    jwi = new Object();
    rect = new Rect();
    GMTrace.o(12575395807232L, 93694);
  }
  
  public static void U(LinkedList<String> paramLinkedList)
  {
    GMTrace.i(12574590500864L, 93688);
    if (bg.bX(paramLinkedList))
    {
      GMTrace.o(12574590500864L, 93688);
      return;
    }
    LinkedList localLinkedList = new LinkedList();
    paramLinkedList = paramLinkedList.iterator();
    while (paramLinkedList.hasNext())
    {
      String str = (String)paramLinkedList.next();
      f localf = com.tencent.mm.pluginsdk.model.app.g.aM(str, true);
      if ((localf != null) && (bg.mZ(localf.field_openId))) {
        localLinkedList.add(str);
      }
    }
    if (!bg.bX(localLinkedList)) {
      an.aUW().bS(localLinkedList);
    }
    GMTrace.o(12574590500864L, 93688);
  }
  
  public static int a(Context paramContext, String paramString1, String paramString2, Bundle paramBundle)
  {
    GMTrace.i(12574858936320L, 93690);
    if (!bg.mZ(paramString1))
    {
      a.a locala = com.tencent.mm.plugin.game.model.a.za(paramString1);
      if ((locala.fJg == 2) && (!bg.mZ(locala.url)))
      {
        i = p(paramContext, locala.url, "game_center_detail");
        GMTrace.o(12574858936320L, 93690);
        return i;
      }
    }
    if (!bg.mZ(paramString2))
    {
      i = p(paramContext, paramString2, "game_center_detail");
      GMTrace.o(12574858936320L, 93690);
      return i;
    }
    int i = e.aEg();
    if (i == 2)
    {
      i = ac(paramContext, paramString1);
      GMTrace.o(12574858936320L, 93690);
      return i;
    }
    if (i == 1)
    {
      c(paramContext, paramBundle);
      GMTrace.o(12574858936320L, 93690);
      return 6;
    }
    paramString2 = bg.bOa();
    if ((bg.mZ(paramString2)) || (paramString2.toLowerCase().equals("cn")))
    {
      i = ac(paramContext, paramString1);
      GMTrace.o(12574858936320L, 93690);
      return i;
    }
    c(paramContext, paramBundle);
    GMTrace.o(12574858936320L, 93690);
    return 6;
  }
  
  public static void a(Context paramContext, q paramq, String paramString)
  {
    GMTrace.i(15197875994624L, 113233);
    Intent localIntent = new Intent();
    localIntent.putExtra("rawUrl", paramq.mAF.url);
    localIntent.putExtra("finishviewifloadfailed", true);
    localIntent.putExtra("show_full_screen", paramq.mAF.mAa);
    localIntent.putExtra("disable_progress_bar", paramq.mAF.mAa);
    int i = -1;
    switch (paramq.mAF.orientation)
    {
    }
    for (;;)
    {
      localIntent.putExtra("screen_orientation", i);
      localIntent.putExtra("geta8key_scene", 32);
      localIntent.putExtra("KPublisherId", paramString);
      paramq = new jy();
      paramq.fHo.type = 1;
      paramq.fHo.context = paramContext;
      paramq.fHo.intent = localIntent;
      com.tencent.mm.sdk.b.a.uLm.m(paramq);
      GMTrace.o(15197875994624L, 113233);
      return;
      i = 0;
      continue;
      i = 1;
      continue;
      i = 1001;
      continue;
      i = 1002;
    }
  }
  
  public static void a(Context paramContext, String paramString1, String paramString2, boolean paramBoolean, q paramq, int paramInt)
  {
    GMTrace.i(17973632827392L, 133914);
    if (bg.mZ(paramString1))
    {
      GMTrace.o(17973632827392L, 133914);
      return;
    }
    Intent localIntent = new Intent();
    localIntent.putExtra("rawUrl", paramString1);
    localIntent.putExtra("geta8key_scene", 32);
    localIntent.putExtra("KPublisherId", paramString2);
    localIntent.putExtra("game_check_float", paramBoolean);
    if ((paramBoolean) && (paramq != null))
    {
      paramq.aEq();
      if (paramq.mAF.mBc) {
        localIntent.putExtra("game_transparent_float_url", paramq.mAF.url);
      }
      localIntent.putExtra("game_sourceScene", paramInt);
    }
    y(localIntent, paramContext);
    GMTrace.o(17973632827392L, 133914);
  }
  
  public static void a(q paramq, int paramInt)
  {
    GMTrace.i(17973767045120L, 133915);
    if (paramq != null) {}
    q localq;
    do
    {
      paramq.aEq();
      w.i("MicroMsg.GameCenterUtil", "float layer report");
      if (!bg.mZ(paramq.mAF.url))
      {
        int i = paramq.field_msgType;
        if (paramq.field_msgType == 100) {
          i = paramq.mAX;
        }
        ai.a(ab.getContext(), 10, 1006, 1, 1, 0, paramq.field_appId, paramInt, i, paramq.field_gameMsgId, paramq.mAY, null);
        paramq.field_isRead = true;
        SubCoreGameCenter.aFe().c(paramq, new String[0]);
      }
      SubCoreGameCenter.aFf();
      t.aEu();
      GMTrace.o(17973767045120L, 133915);
      return;
      SubCoreGameCenter.aFf();
      localq = t.aEt();
      paramq = localq;
    } while (localq != null);
    GMTrace.o(17973767045120L, 133915);
  }
  
  public static boolean a(View paramView, Context paramContext)
  {
    GMTrace.i(12573919412224L, 93683);
    if ((paramView.getTag() == null) || (!(paramView.getTag() instanceof String)))
    {
      w.e("MicroMsg.GameCenterUtil", "Invalid Jump URL");
      GMTrace.o(12573919412224L, 93683);
      return false;
    }
    paramView = (String)paramView.getTag();
    if (bg.mZ(paramView))
    {
      w.e("MicroMsg.GameCenterUtil", "Invalid Jump URL");
      GMTrace.o(12573919412224L, 93683);
      return false;
    }
    Intent localIntent = new Intent();
    localIntent.putExtra("rawUrl", paramView);
    localIntent.putExtra("show_bottom", false);
    y(localIntent, paramContext);
    GMTrace.o(12573919412224L, 93683);
    return true;
  }
  
  public static LinkedList<f> aFO()
  {
    GMTrace.i(12574724718592L, 93689);
    Cursor localCursor = an.aUV().bGD();
    LinkedList localLinkedList = new LinkedList();
    if (localCursor == null) {
      w.e("MicroMsg.GameCenterUtil", "getGameAppInfo failed: curosr is null");
    }
    for (;;)
    {
      GMTrace.o(12574724718592L, 93689);
      return localLinkedList;
      if (localCursor.moveToFirst()) {
        do
        {
          f localf = new f();
          localf.b(localCursor);
          localLinkedList.add(localf);
        } while (localCursor.moveToNext());
      }
      localCursor.close();
    }
  }
  
  public static int aa(Context paramContext, String paramString)
  {
    GMTrace.i(19275544788992L, 143614);
    int i = p(paramContext, paramString, null);
    GMTrace.o(19275544788992L, 143614);
    return i;
  }
  
  public static void aaX()
  {
    GMTrace.i(15198010212352L, 113234);
    if (hmL == null)
    {
      GMTrace.o(15198010212352L, 113234);
      return;
    }
    synchronized (jwi)
    {
      if (hmL != null)
      {
        com.tencent.mm.vending.h.g.Wr("SubCoreGameCenter#WorkThread");
        hmL.nTP.quit();
        hmL = null;
      }
      GMTrace.o(15198010212352L, 113234);
      return;
    }
  }
  
  private static boolean ab(Context paramContext, String paramString)
  {
    GMTrace.i(19275813224448L, 143616);
    paramString = Uri.parse(paramString).getQueryParameter("weapp");
    if (!bg.mZ(paramString)) {}
    for (;;)
    {
      try
      {
        Object localObject1 = Uri.parse(URLDecoder.decode(paramString, "utf-8"));
        paramString = ((Uri)localObject1).getAuthority();
        if (bg.mZ(paramString))
        {
          w.w("MicroMsg.GameCenterUtil", "targetAppId is null");
          GMTrace.o(19275813224448L, 143616);
          return false;
        }
        localObject2 = ((Uri)localObject1).getQueryParameter("env_version");
        localObject1 = ((Uri)localObject1).getQueryParameter("path");
        localObject2 = bg.mY((String)localObject2);
        i = -1;
        switch (((String)localObject2).hashCode())
        {
        case 1559690845: 
          localObject2 = new AppBrandStatObject();
          ((AppBrandStatObject)localObject2).scene = 1079;
          ((com.tencent.mm.plugin.appbrand.k.c)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.appbrand.k.c.class)).a(paramContext, null, paramString, i, 0, (String)localObject1, (AppBrandStatObject)localObject2);
          GMTrace.o(19275813224448L, 143616);
          return true;
        }
      }
      catch (Exception paramContext)
      {
        Object localObject2;
        boolean bool;
        w.e("MicroMsg.GameCenterUtil", "checkJumpWeApp: " + paramContext.getMessage());
      }
      if (((String)localObject2).equals("develop"))
      {
        i = 0;
        break label265;
        bool = ((String)localObject2).equals("trial");
        if (bool)
        {
          i = 1;
          break label265;
          i = 1;
          continue;
          i = 2;
          continue;
          GMTrace.o(19275813224448L, 143616);
          return false;
        }
      }
      label265:
      switch (i)
      {
      }
      int i = 0;
    }
  }
  
  public static int ac(Context paramContext, String paramString)
  {
    GMTrace.i(19275947442176L, 143617);
    if (bg.mZ(paramString))
    {
      GMTrace.o(19275947442176L, 143617);
      return 0;
    }
    Object localObject = com.tencent.mm.plugin.game.model.g.aEh().aEi();
    if (localObject != null)
    {
      localObject = ((v)localObject).mDg;
      if (bg.mZ((String)localObject)) {
        break label101;
      }
    }
    label101:
    for (paramString = (String)localObject + "?appid=" + paramString;; paramString = "game.weixin.qq.com/cgi-bin/h5/static/gamecenter/detail.html?appid=" + paramString)
    {
      int i = p(paramContext, paramString, "game_center_detail");
      GMTrace.o(19275947442176L, 143617);
      return i;
      localObject = "";
      break;
    }
  }
  
  public static void c(Context paramContext, Bundle paramBundle)
  {
    GMTrace.i(12575127371776L, 93692);
    Intent localIntent = new Intent(paramContext, GameDetailUI2.class);
    localIntent.putExtras(paramBundle);
    paramContext.startActivity(localIntent);
    GMTrace.o(12575127371776L, 93692);
  }
  
  public static Dialog cD(Context paramContext)
  {
    GMTrace.i(12574053629952L, 93684);
    View localView = View.inflate(paramContext, R.i.cWT, null);
    final j localj = new j(paramContext, R.m.fdj);
    localj.setContentView(localView);
    localj.setCancelable(true);
    localj.setCanceledOnTouchOutside(false);
    localj.setOnCancelListener(new DialogInterface.OnCancelListener()
    {
      public final void onCancel(DialogInterface paramAnonymousDialogInterface)
      {
        GMTrace.i(12576201113600L, 93700);
        if ((this.val$context instanceof MMActivity)) {
          ((MMActivity)this.val$context).finish();
        }
        localj.setOnCancelListener(null);
        GMTrace.o(12576201113600L, 93700);
      }
    });
    GMTrace.o(12574053629952L, 93684);
    return localj;
  }
  
  public static boolean cr(String paramString1, String paramString2)
  {
    GMTrace.i(19276215877632L, 143619);
    paramString1 = new File(paramString1);
    String str = com.tencent.mm.a.g.h(paramString1);
    if ((bg.mZ(paramString2)) || (bg.mZ(str)))
    {
      w.i("MicroMsg.GameCenterUtil", "checkPkgMD5Valid, md5 is null");
      bool = paramString1.exists();
      GMTrace.o(19276215877632L, 143619);
      return bool;
    }
    w.i("MicroMsg.GameCenterUtil", "checkPkgMD5Valid, md5 = %s, calculateMD5 = %s", new Object[] { paramString2, str });
    boolean bool = paramString2.equalsIgnoreCase(str);
    GMTrace.o(19276215877632L, 143619);
    return bool;
  }
  
  public static int getScreenWidth(Context paramContext)
  {
    GMTrace.i(12573382541312L, 93679);
    if (paramContext == null)
    {
      GMTrace.o(12573382541312L, 93679);
      return 0;
    }
    if (mMw == null)
    {
      mMw = new DisplayMetrics();
      ((WindowManager)paramContext.getSystemService("window")).getDefaultDisplay().getMetrics(mMw);
    }
    int i = mMw.widthPixels;
    GMTrace.o(12573382541312L, 93679);
    return i;
  }
  
  public static int p(Context paramContext, String paramString1, String paramString2)
  {
    GMTrace.i(19275679006720L, 143615);
    if (bg.mZ(paramString1))
    {
      GMTrace.o(19275679006720L, 143615);
      return 0;
    }
    if (ab(paramContext, paramString1))
    {
      GMTrace.o(19275679006720L, 143615);
      return 30;
    }
    Intent localIntent = new Intent();
    localIntent.putExtra("rawUrl", paramString1);
    localIntent.putExtra("show_bottom", false);
    localIntent.putExtra("geta8key_scene", 32);
    localIntent.putExtra("KPublisherId", paramString2);
    y(localIntent, paramContext);
    GMTrace.o(19275679006720L, 143615);
    return 7;
  }
  
  public static int parseColor(String paramString)
  {
    GMTrace.i(19276081659904L, 143618);
    int i = 0;
    try
    {
      int j = Color.parseColor(paramString);
      i = j;
    }
    catch (Exception paramString)
    {
      for (;;)
      {
        w.e("MicroMsg.GameCenterUtil", "parseColor: " + paramString.getMessage());
      }
    }
    GMTrace.o(19276081659904L, 143618);
    return i;
  }
  
  public static af xC()
  {
    GMTrace.i(15198144430080L, 113235);
    if (hmL == null) {}
    synchronized (jwi)
    {
      if (hmL == null)
      {
        hmL = new af("SubCoreGameCenter#WorkThread");
        com.tencent.mm.vending.h.g.a("SubCoreGameCenter#WorkThread", new com.tencent.mm.vending.h.h(hmL.nTP.getLooper(), "SubCoreGameCenter#WorkThread"));
      }
      ??? = hmL;
      GMTrace.o(15198144430080L, 113235);
      return (af)???;
    }
  }
  
  private static void y(Intent paramIntent, Context paramContext)
  {
    GMTrace.i(12575261589504L, 93693);
    jy localjy = new jy();
    localjy.fHo.type = 0;
    localjy.fHo.context = paramContext;
    localjy.fHo.intent = paramIntent;
    com.tencent.mm.sdk.b.a.uLm.m(localjy);
    GMTrace.o(12575261589504L, 93693);
  }
  
  public static int zp(String paramString)
  {
    GMTrace.i(12574187847680L, 93685);
    if (bg.mZ(paramString))
    {
      w.w("MicroMsg.GameCenterUtil", "Null or Nil packageName");
      GMTrace.o(12574187847680L, 93685);
      return 0;
    }
    try
    {
      paramString = ab.getContext().getPackageManager().getPackageInfo(paramString, 0);
      if (paramString == null)
      {
        GMTrace.o(12574187847680L, 93685);
        return 0;
      }
    }
    catch (Exception paramString)
    {
      for (;;)
      {
        w.w("MicroMsg.GameCenterUtil", "Exception: %s", new Object[] { paramString.toString() });
        paramString = null;
      }
      int i = paramString.versionCode;
      GMTrace.o(12574187847680L, 93685);
      return i;
    }
  }
  
  public static int zq(String paramString)
  {
    GMTrace.i(12574322065408L, 93686);
    if (bg.mZ(paramString))
    {
      w.w("MicroMsg.GameCenterUtil", "Null or Nil path");
      GMTrace.o(12574322065408L, 93686);
      return 0;
    }
    paramString = ab.getContext().getPackageManager().getPackageArchiveInfo(paramString, 0);
    if (paramString == null)
    {
      GMTrace.o(12574322065408L, 93686);
      return 0;
    }
    int i = paramString.versionCode;
    GMTrace.o(12574322065408L, 93686);
    return i;
  }
  
  public static void zr(String paramString)
  {
    GMTrace.i(12574456283136L, 93687);
    com.tencent.mm.an.a.a locala = n.Ja();
    c.a locala1 = new c.a();
    locala1.hCO = true;
    locala.a(paramString, null, locala1.Jk());
    GMTrace.o(12574456283136L, 93687);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/game/d/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */