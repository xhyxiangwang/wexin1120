package com.tencent.mm.plugin.appbrand.menu;

import android.app.Activity;
import android.content.Context;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo;
import com.tencent.mm.plugin.appbrand.config.AppBrandSysConfig;
import com.tencent.mm.plugin.appbrand.d;
import com.tencent.mm.plugin.appbrand.d.c;
import com.tencent.mm.plugin.appbrand.f;
import com.tencent.mm.plugin.appbrand.p.i;
import com.tencent.mm.plugin.appbrand.page.AppBrandPageView;
import com.tencent.mm.plugin.appbrand.page.s;
import com.tencent.mm.plugin.appbrand.ui.banner.AppBrandStickyBannerLogic.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.ui.base.m;

public final class j
  extends com.tencent.mm.plugin.appbrand.menu.a.a
{
  public j()
  {
    super(l.jip - 1);
    GMTrace.i(15558519029760L, 115920);
    GMTrace.o(15558519029760L, 115920);
  }
  
  public final void a(Context paramContext, AppBrandPageView paramAppBrandPageView, m paramm, String paramString)
  {
    GMTrace.i(17667213754368L, 131631);
    boolean bool = AppBrandStickyBannerLogic.a.aw(paramString, paramAppBrandPageView.irS.iqO.iJa.iCx);
    int i = this.jix;
    if (bool) {}
    for (paramContext = paramContext.getString(p.i.iwh);; paramContext = paramContext.getString(p.i.iwg))
    {
      paramm.e(i, paramContext);
      GMTrace.o(17667213754368L, 131631);
      return;
    }
  }
  
  public final void a(Context paramContext, AppBrandPageView paramAppBrandPageView, String paramString, k paramk)
  {
    GMTrace.i(15558787465216L, 115922);
    paramk = com.tencent.mm.plugin.appbrand.a.nx(paramString);
    if (AppBrandStickyBannerLogic.a.aw(paramk.appId, paramk.iJa.iCx))
    {
      AppBrandStickyBannerLogic.a.rY(paramk.appId);
      com.tencent.mm.ui.snackbar.a.a(paramContext, ((Activity)paramContext).findViewById(16908290), paramContext.getString(p.i.iwi));
    }
    for (;;)
    {
      com.tencent.mm.plugin.appbrand.report.a.a(paramString, paramAppBrandPageView.jlc.jlV, 13, "", bg.Po(), 1, 0);
      GMTrace.o(15558787465216L, 115922);
      return;
      d.a(paramString, d.c.iqD);
      if (paramAppBrandPageView == null) {
        paramContext = ab.getContext();
      }
      AppBrandStickyBannerLogic.a.a(paramContext, paramk.appId, paramk.iJa.iCx, paramk.fxq, paramk.iIF);
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/menu/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */