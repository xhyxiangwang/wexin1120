package com.tencent.mm.plugin.appbrand.launching.a;

import android.net.Uri;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.p.i;
import com.tencent.mm.plugin.appbrand.ui.AppBrand404PageUI;

final class e
  extends a
{
  e()
  {
    GMTrace.i(17332072087552L, 129134);
    GMTrace.o(17332072087552L, 129134);
  }
  
  final void a(Uri paramUri, int paramInt)
  {
    int i = 1;
    GMTrace.i(17332206305280L, 129135);
    if (paramUri == null) {}
    for (String str = "";; str = paramUri.getQueryParameter("appid")) {
      switch (1.jgO[(paramInt - 1)])
      {
      default: 
        AppBrand404PageUI.show(p.i.iwL);
        GMTrace.o(17332206305280L, 129135);
        return;
      }
    }
    if ((paramUri != null) && (paramUri.getBooleanQueryParameter("debug", false)))
    {
      paramInt = 1;
      AppBrand404PageUI.show(p.i.iyA);
      if (paramInt == 0) {
        break label133;
      }
    }
    label133:
    for (paramInt = i;; paramInt = 0)
    {
      com.tencent.mm.plugin.appbrand.report.a.x(str, 2, paramInt + 1);
      GMTrace.o(17332206305280L, 129135);
      return;
      paramInt = 0;
      break;
    }
    AppBrand404PageUI.show(p.i.iyv);
    com.tencent.mm.plugin.appbrand.report.a.x("", 3, 2);
    GMTrace.o(17332206305280L, 129135);
    return;
    AppBrand404PageUI.show(p.i.iyw);
    com.tencent.mm.plugin.appbrand.report.a.x("", 4, 2);
    GMTrace.o(17332206305280L, 129135);
    return;
    GMTrace.o(17332206305280L, 129135);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/launching/a/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */