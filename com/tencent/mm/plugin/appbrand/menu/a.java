package com.tencent.mm.plugin.appbrand.menu;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Paint;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.TextUtils.TruncateAt;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo;
import com.tencent.mm.plugin.appbrand.config.AppBrandSysConfig;
import com.tencent.mm.plugin.appbrand.config.WxaExposedParams.a;
import com.tencent.mm.plugin.appbrand.f;
import com.tencent.mm.plugin.appbrand.i;
import com.tencent.mm.plugin.appbrand.jsapi.op_report.AppBrandOpReportLogic.a;
import com.tencent.mm.plugin.appbrand.p.c;
import com.tencent.mm.plugin.appbrand.p.d;
import com.tencent.mm.plugin.appbrand.p.i;
import com.tencent.mm.plugin.appbrand.page.AppBrandPageView;
import com.tencent.mm.plugin.appbrand.page.s;
import com.tencent.mm.plugin.appbrand.ui.AppBrandProfileUI;
import com.tencent.mm.plugin.appbrand.ui.g;
import com.tencent.mm.plugin.appbrand.widget.f.b;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.ui.base.m;

public final class a
  extends com.tencent.mm.plugin.appbrand.menu.a.a
{
  public a()
  {
    super(l.jir - 1);
    GMTrace.i(15551808143360L, 115870);
    GMTrace.o(15551808143360L, 115870);
  }
  
  public final void a(Context paramContext, AppBrandPageView paramAppBrandPageView, m paramm, String paramString)
  {
    GMTrace.i(17667347972096L, 131632);
    paramAppBrandPageView = paramAppBrandPageView.irS.iqO;
    int i = l.jir;
    paramString = paramAppBrandPageView.fxq;
    int j = paramAppBrandPageView.iJa.iCx;
    paramAppBrandPageView = paramContext.getString(p.i.duu, new Object[] { paramString });
    String str = com.tencent.mm.plugin.appbrand.appcache.a.hJ(j);
    if (bg.mZ(str)) {
      paramContext = paramAppBrandPageView;
    }
    for (;;)
    {
      paramm.e(i - 1, paramContext);
      GMTrace.o(17667347972096L, 131632);
      return;
      paramString = new b(str, com.tencent.mm.bq.a.fromDPToPix(paramContext, 11), com.tencent.mm.bq.a.fromDPToPix(paramContext, 11), com.tencent.mm.bq.a.fromDPToPix(paramContext, 9), Color.parseColor("#42000000"), com.tencent.mm.bq.a.fromDPToPix(paramContext, 2));
      j = paramString.a(null);
      int[] arrayOfInt = g.aat();
      int k = com.tencent.mm.bq.a.U(paramContext, p.d.isx);
      int m = com.tencent.mm.bq.a.c(paramContext, p.c.isl);
      TextPaint localTextPaint = new TextPaint(new Paint(m));
      localTextPaint.setTextSize(k);
      paramAppBrandPageView = TextUtils.ellipsize(paramAppBrandPageView, localTextPaint, arrayOfInt[0] - com.tencent.mm.bq.a.U(paramContext, p.d.isw) - j, TextUtils.TruncateAt.END);
      paramContext = new SpannableStringBuilder(paramAppBrandPageView + str);
      paramContext.setSpan(new AbsoluteSizeSpan(k, false), 0, paramAppBrandPageView.length(), 18);
      paramContext.setSpan(new ForegroundColorSpan(m), 0, paramAppBrandPageView.length(), 18);
      paramContext.setSpan(paramString, paramAppBrandPageView.length(), paramContext.length(), 18);
    }
  }
  
  public final void a(Context paramContext, AppBrandPageView paramAppBrandPageView, String paramString, k paramk)
  {
    GMTrace.i(15552076578816L, 115872);
    AppBrandSysConfig localAppBrandSysConfig = com.tencent.mm.plugin.appbrand.a.nx(paramString);
    if (localAppBrandSysConfig == null)
    {
      GMTrace.o(15552076578816L, 115872);
      return;
    }
    paramk = "";
    if (com.tencent.mm.plugin.appbrand.a.ny(paramString) != null) {
      paramk = bg.mY(i.b(paramAppBrandPageView.irS).irM);
    }
    AppBrandOpReportLogic.a.WQ();
    WxaExposedParams.a locala = new WxaExposedParams.a();
    locala.appId = localAppBrandSysConfig.appId;
    locala.fwk = 3;
    locala.iJY = paramAppBrandPageView.jlc.jlV;
    locala.iCx = localAppBrandSysConfig.iJa.iCx;
    locala.iCy = localAppBrandSysConfig.iJa.iCy;
    AppBrandProfileUI.a(paramContext, localAppBrandSysConfig.ftu, paramk, locala.Uv());
    com.tencent.mm.plugin.appbrand.report.a.a(paramString, paramAppBrandPageView.jlc.jlV, 6, "", bg.Po(), 1, 0);
    GMTrace.o(15552076578816L, 115872);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/menu/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */