package com.tencent.mm.plugin.appbrand.menu;

import android.content.Context;
import android.widget.Toast;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo;
import com.tencent.mm.plugin.appbrand.config.AppBrandSysConfig;
import com.tencent.mm.plugin.appbrand.p.i;
import com.tencent.mm.plugin.appbrand.page.AppBrandPageView;
import com.tencent.mm.plugin.appbrand.performance.AppBrandPerformanceManager;
import com.tencent.mm.ui.base.m;

public final class e
  extends com.tencent.mm.plugin.appbrand.menu.a.a
{
  public e()
  {
    super(l.jim - 1);
    GMTrace.i(15559458553856L, 115927);
    GMTrace.o(15559458553856L, 115927);
  }
  
  public final void a(Context paramContext, AppBrandPageView paramAppBrandPageView, m paramm, String paramString)
  {
    GMTrace.i(17666542665728L, 131626);
    if (com.tencent.mm.plugin.appbrand.a.nx(paramString).iJa.iCx == 1) {
      if (!com.tencent.mm.plugin.appbrand.a.nx(paramString).iII) {
        break label62;
      }
    }
    label62:
    for (paramContext = paramContext.getString(p.i.ixK);; paramContext = paramContext.getString(p.i.ixR))
    {
      paramm.e(l.jim - 1, paramContext);
      GMTrace.o(17666542665728L, 131626);
      return;
    }
  }
  
  public final void a(Context paramContext, AppBrandPageView paramAppBrandPageView, String paramString, k paramk)
  {
    GMTrace.i(15559726989312L, 115929);
    if (!com.tencent.mm.plugin.appbrand.a.nx(paramString).iII) {}
    for (int i = 1; i != 0; i = 0)
    {
      AppBrandPerformanceManager.rF(paramString);
      Toast.makeText(paramContext, p.i.ixS, 0).show();
      GMTrace.o(15559726989312L, 115929);
      return;
    }
    AppBrandPerformanceManager.rG(paramString);
    Toast.makeText(paramContext, p.i.ixL, 0).show();
    GMTrace.o(15559726989312L, 115929);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/menu/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */