package com.tencent.mm.plugin.sns.abtest;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.view.ContextMenu;
import android.view.Display;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.AbsoluteLayout;
import android.widget.AbsoluteLayout.LayoutParams;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.bi.d;
import com.tencent.mm.g.a.bp;
import com.tencent.mm.g.a.gb;
import com.tencent.mm.g.a.oy;
import com.tencent.mm.plugin.sns.data.i;
import com.tencent.mm.plugin.sns.i.e;
import com.tencent.mm.plugin.sns.i.f;
import com.tencent.mm.plugin.sns.i.j;
import com.tencent.mm.plugin.sns.model.ae;
import com.tencent.mm.plugin.sns.storage.m;
import com.tencent.mm.plugin.sns.ui.SnsNotInterestUI;
import com.tencent.mm.plugin.sns.ui.SnsPermissionUI;
import com.tencent.mm.plugin.sns.ui.a.a.c;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.x.a.f;
import com.tencent.mm.x.a.g;
import java.util.Arrays;

public final class a
{
  public static Context context;
  private static boolean pUQ;
  private static String pUR;
  private static View.OnClickListener pUS;
  public static int pUT;
  private static int pUU;
  public static long pUV;
  private static View pUW;
  private static b pUX;
  private static NotInterestMenu.c pUY;
  private static com.tencent.mm.sdk.b.c pUZ;
  private static com.tencent.mm.sdk.b.c pVa;
  
  static
  {
    GMTrace.i(8877428965376L, 66142);
    pUQ = false;
    pUR = "0";
    pUS = null;
    pUT = -1;
    pUU = -1;
    pUV = 0L;
    pUW = null;
    pUX = null;
    pUY = null;
    context = null;
    pUZ = new com.tencent.mm.sdk.b.c() {};
    pVa = new com.tencent.mm.sdk.b.c() {};
    GMTrace.o(8877428965376L, 66142);
  }
  
  public static void a(Context paramContext, m paramm)
  {
    int i = 2;
    GMTrace.i(8875818352640L, 66130);
    Intent localIntent;
    if ((pUQ) && (paramm != null) && (paramContext != null))
    {
      pUV = paramm.field_snsId;
      a(paramm);
      localIntent = new Intent(paramContext, SnsNotInterestUI.class);
      localIntent.putExtra("sns_info_svr_id", pUV);
      if ((!pUQ) || (bg.mZ(pUR))) {
        break label161;
      }
      if ((!pUR.equals("1")) && (!pUR.equals("2"))) {
        break label117;
      }
      i = 1;
    }
    for (;;)
    {
      localIntent.putExtra("sns_info_not_interest_scene", i);
      paramContext.startActivity(localIntent);
      GMTrace.o(8875818352640L, 66130);
      return;
      label117:
      if (pUR.equals("3"))
      {
        if (i.f(paramm)) {
          i = 4;
        } else if (paramm.field_type == 1) {
          i = 3;
        } else if (paramm.field_type == 2) {}
      }
      else {
        label161:
        i = 0;
      }
    }
  }
  
  public static void a(ContextMenu paramContextMenu, m paramm)
  {
    GMTrace.i(8875952570368L, 66131);
    if ((pUQ) && (pUR.equals("3")) && (paramm != null) && (!paramm.uF(32)) && (!paramm.field_userName.equals(ae.bgV())) && (paramm.field_type != 15)) {
      paramContextMenu.add(0, 13, 0, i.j.pSC);
    }
    GMTrace.o(8875952570368L, 66131);
  }
  
  public static void a(View paramView, Context paramContext, m paramm)
  {
    GMTrace.i(16047205777408L, 119561);
    if (paramContext == null)
    {
      GMTrace.o(16047205777408L, 119561);
      return;
    }
    if (paramm != null) {
      pUV = paramm.field_snsId;
    }
    b localb = pUX;
    if ((paramView == null) || (localb.pVw))
    {
      GMTrace.o(16047205777408L, 119561);
      return;
    }
    bp localbp = new bp();
    com.tencent.mm.sdk.b.a.uLm.m(localbp);
    if (localb.pVu)
    {
      localb.bfN();
      GMTrace.o(16047205777408L, 119561);
      return;
    }
    if (localb.jsW == 0) {
      localb.jsW = com.tencent.mm.pluginsdk.e.dH(paramContext);
    }
    if (localb.LW == 0) {
      localb.LW = com.tencent.mm.pluginsdk.e.dG(paramContext);
    }
    if (localb.pVp == 0)
    {
      localb.pVp = paramView.getMeasuredHeight();
      if (localb.pVp <= 0) {
        localb.pVp = com.tencent.mm.bq.a.fromDPToPix(paramContext, 15);
      }
    }
    if (localb.pVq <= 0) {
      localb.pVq = com.tencent.mm.bq.a.fromDPToPix(paramContext, 8);
    }
    if (localb.pVr <= 0) {
      localb.pVr = com.tencent.mm.bq.a.fromDPToPix(paramContext, 3);
    }
    if (localb.mScreenHeight == 0)
    {
      localb.mScreenHeight = ((WindowManager)paramContext.getSystemService("window")).getDefaultDisplay().getHeight();
      localb.mScreenHeight -= localb.LW;
      localb.mScreenHeight -= localb.jsW;
    }
    if (localb.pVs == 0) {
      localb.pVs = com.tencent.mm.bq.a.fromDPToPix(paramContext, 150);
    }
    if (localb.pVt == 0) {
      localb.pVt = com.tencent.mm.bq.a.fromDPToPix(paramContext, 13);
    }
    localb.pVi = new NotInterestMenu(paramContext);
    if (localb.pVd != null) {
      localb.pVi.pVd = localb.pVd;
    }
    localb.pVi.pVe = localb.pVk;
    localb.pVi.pFU = paramm;
    paramm = new int[2];
    paramView.getLocationInWindow(paramm);
    w.d("MicroMsg.NotInterestMenuHelper", "hateLocation: %s", new Object[] { Arrays.toString(paramm) });
    int i = paramm[1];
    int j = i - localb.jsW - localb.LW + localb.pVp - localb.pVq;
    w.d("MicroMsg.NotInterestMenuHelper", "getDownModeMenuYCoord, hateClickViewYCoord:%d, y:%d, mStatusBarHeight:%d, actionBarHeight:%d, hateClickViewHeight:%d, mHateClickDownPadding:%d", new Object[] { Integer.valueOf(i), Integer.valueOf(j), Integer.valueOf(localb.jsW), Integer.valueOf(localb.LW), Integer.valueOf(localb.pVp), Integer.valueOf(localb.pVq) });
    w.d("MicroMsg.NotInterestMenuHelper", "isEnoughHeightToDownMenu, y:%d, menuHeight:%d, screenHeight:%d", new Object[] { Integer.valueOf(j), Integer.valueOf(localb.pVs), Integer.valueOf(localb.mScreenHeight) });
    if (localb.pVs + j > localb.mScreenHeight)
    {
      i = 0;
      if (i == 0) {
        break label750;
      }
      localb.pVi.setBackgroundResource(i.e.pHe);
      localb.pVx = true;
      i = j;
    }
    for (;;)
    {
      if (localb.pVv == null)
      {
        localb.pVv = new AbsoluteLayout(paramContext);
        paramView = new FrameLayout.LayoutParams(-1, -1);
        localb.pVv.setBackgroundDrawable(paramContext.getResources().getDrawable(i.e.pGJ));
        localb.pVv.setPadding(localb.pVt, 0, localb.pVt, 0);
        localb.pVv.setLayoutParams(paramView);
      }
      if (localb.pVj != null) {
        localb.pVj.addView(localb.pVv);
      }
      paramView = new AbsoluteLayout.LayoutParams(-1, -2, 0, i);
      localb.pVv.addView(localb.pVi, paramView);
      localb.pVi.setVisibility(4);
      if (!localb.pVx) {
        break label887;
      }
      localb.pVi.startAnimation(localb.pVl);
      GMTrace.o(16047205777408L, 119561);
      return;
      i = 1;
      break;
      label750:
      localb.pVi.setBackgroundResource(i.e.pHf);
      j = paramm[1];
      i = j - localb.jsW - localb.LW - localb.pVs + localb.pVr;
      w.d("MicroMsg.NotInterestMenuHelper", "getUpModeMenuYCoord, hateClickViewYCoord:%d, y:%d, mStatusBarHeight:%d, actionBarHeight:%d, hateClickViewHeight:%d, mHateClickUpPadding:%d, mMenuHeight:%d", new Object[] { Integer.valueOf(j), Integer.valueOf(i), Integer.valueOf(localb.jsW), Integer.valueOf(localb.LW), Integer.valueOf(localb.pVp), Integer.valueOf(localb.pVr), Integer.valueOf(localb.pVs) });
      localb.pVx = false;
    }
    label887:
    localb.pVi.startAnimation(localb.pVm);
    GMTrace.o(16047205777408L, 119561);
  }
  
  public static void a(View paramView, a.c paramc)
  {
    GMTrace.i(8876086788096L, 66132);
    if ((pUQ) && (!bg.mZ(pUR)) && (!pUR.equals("0")))
    {
      paramc.qUz = ((ImageView)paramView.findViewById(i.f.pMe));
      paramc.qUz.setVisibility(8);
      paramc.qUA = false;
      if (!pUR.equals("3")) {
        paramc.qUz.setOnClickListener(pUS);
      }
    }
    GMTrace.o(8876086788096L, 66132);
  }
  
  private static void a(m paramm)
  {
    GMTrace.i(8875684134912L, 66129);
    boolean bool = pUR.equals("3");
    if (paramm.field_type == 1)
    {
      if (bool)
      {
        pUU = 5;
        GMTrace.o(8875684134912L, 66129);
        return;
      }
      pUU = 0;
      GMTrace.o(8875684134912L, 66129);
      return;
    }
    if (paramm.field_type == 2)
    {
      if (bool)
      {
        pUU = 4;
        GMTrace.o(8875684134912L, 66129);
        return;
      }
      pUU = 1;
      GMTrace.o(8875684134912L, 66129);
      return;
    }
    if (paramm.field_type == 15)
    {
      if (!bool)
      {
        pUU = 2;
        GMTrace.o(8875684134912L, 66129);
      }
    }
    else if (i.f(paramm))
    {
      if (bool)
      {
        pUU = 6;
        GMTrace.o(8875684134912L, 66129);
        return;
      }
      pUU = 3;
    }
    GMTrace.o(8875684134912L, 66129);
  }
  
  public static void b(Context paramContext, m paramm)
  {
    GMTrace.i(16047339995136L, 119562);
    if ((paramm != null) && (paramContext != null))
    {
      a(paramm);
      String str = paramm.field_userName;
      Intent localIntent = new Intent();
      localIntent.putExtra("sns_permission_userName", str);
      localIntent.putExtra("sns_permission_snsinfo_svr_id", paramm.field_snsId);
      localIntent.putExtra("sns_permission_block_scene", 6);
      localIntent.setClass(paramContext, SnsPermissionUI.class);
      paramContext.startActivity(localIntent);
    }
    GMTrace.o(16047339995136L, 119562);
  }
  
  public static void b(m paramm)
  {
    GMTrace.i(8876221005824L, 66133);
    if (pUQ)
    {
      pUV = paramm.field_snsId;
      a(paramm);
    }
    GMTrace.o(8876221005824L, 66133);
  }
  
  public static void bfJ()
  {
    GMTrace.i(8875549917184L, 66128);
    if (pUX != null) {
      pUX.bfN();
    }
    GMTrace.o(8875549917184L, 66128);
  }
  
  public static void bfK()
  {
    GMTrace.i(16047608430592L, 119564);
    if ((pUQ) && (pUV != 0L))
    {
      String str = pUT + "|" + pUU + "|" + pUV;
      g.BZ().gL("7").hif = 4L;
      g.BZ().gL("7").result = str;
      f.a(g.BZ().gL("7"));
      w.d("MicroMsg.NotInteresetABTestManager", "report not interest abtest, scene:%d, result:%s", new Object[] { Integer.valueOf(4), str });
    }
    pUU = -1;
    pUT = -1;
    pUV = 0L;
    GMTrace.o(16047608430592L, 119564);
  }
  
  public static void c(Context paramContext, m paramm)
  {
    GMTrace.i(16047474212864L, 119563);
    Intent localIntent;
    long l;
    if ((paramm != null) && (paramContext != null))
    {
      a(paramm);
      localIntent = new Intent();
      w.i("MicroMsg.NotInteresetABTestManager", "expose id " + paramm.bjM());
      localIntent.putExtra("showShare", false);
      if (paramm != null) {
        break label149;
      }
      l = 0L;
      localIntent.putExtra("k_expose_msg_id", l);
      if (paramm != null) {
        break label157;
      }
    }
    label149:
    label157:
    for (paramm = "";; paramm = paramm.field_userName)
    {
      localIntent.putExtra("k_username", paramm);
      localIntent.putExtra("rawUrl", String.format("https://weixin110.qq.com/security/readtemplate?t=weixin_report/w_type&scene=%d#wechat_redirect", new Object[] { Integer.valueOf(33) }));
      d.b(paramContext, "webview", ".ui.tools.WebViewUI", localIntent);
      GMTrace.o(16047474212864L, 119563);
      return;
      l = paramm.field_snsId;
      break;
    }
  }
  
  public static void clean()
  {
    GMTrace.i(8876355223552L, 66134);
    pUU = -1;
    pUT = -1;
    pUV = 0L;
    pUS = null;
    pUY = null;
    pUW = null;
    context = null;
    pUQ = false;
    pUR = "0";
    f.gQ("7");
    com.tencent.mm.sdk.b.a.uLm.c(pUZ);
    com.tencent.mm.sdk.b.a.uLm.c(pVa);
    GMTrace.o(8876355223552L, 66134);
  }
  
  public static void d(Context paramContext, ViewGroup paramViewGroup)
  {
    GMTrace.i(8875415699456L, 66127);
    if (g.BZ().gL("7") != null)
    {
      pUQ = true;
      pUR = g.BZ().gL("7").value;
      w.d("MicroMsg.NotInteresetABTestManager", "start not interest abtest, testStyle:%s", new Object[] { pUR });
      pUW = paramViewGroup;
      pUX = new b(paramViewGroup);
      context = paramContext;
      com.tencent.mm.sdk.b.a.uLm.b(pUZ);
      com.tencent.mm.sdk.b.a.uLm.b(pVa);
      pUS = new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(8870449643520L, 66090);
          if ((paramAnonymousView.getTag() instanceof m))
          {
            m localm = (m)paramAnonymousView.getTag();
            a.a(paramAnonymousView, paramAnonymousView.getContext(), localm);
          }
          GMTrace.o(8870449643520L, 66090);
        }
      };
      pUY = new NotInterestMenu.c()
      {
        public final void c(m paramAnonymousm)
        {
          GMTrace.i(8878234271744L, 66148);
          a.a(a.context, paramAnonymousm);
          GMTrace.o(8878234271744L, 66148);
        }
        
        public final void d(m paramAnonymousm)
        {
          GMTrace.i(8878368489472L, 66149);
          a.b(a.context, paramAnonymousm);
          GMTrace.o(8878368489472L, 66149);
        }
        
        public final void e(m paramAnonymousm)
        {
          GMTrace.i(8878502707200L, 66150);
          a.c(a.context, paramAnonymousm);
          GMTrace.o(8878502707200L, 66150);
        }
      };
      pUX.pVd = pUY;
    }
    GMTrace.o(8875415699456L, 66127);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/sns/abtest/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */