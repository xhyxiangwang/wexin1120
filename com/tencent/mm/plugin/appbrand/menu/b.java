package com.tencent.mm.plugin.appbrand.menu;

import android.content.Context;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.f;
import com.tencent.mm.plugin.appbrand.p.i;
import com.tencent.mm.plugin.appbrand.page.AppBrandPageView;
import com.tencent.mm.plugin.appbrand.page.s;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.ui.base.m;

public final class b
  extends com.tencent.mm.plugin.appbrand.menu.a.a
{
  public b()
  {
    super(l.jin - 1);
    GMTrace.i(19693633011712L, 146729);
    GMTrace.o(19693633011712L, 146729);
  }
  
  public final void a(Context paramContext, AppBrandPageView paramAppBrandPageView, m paramm, String paramString)
  {
    GMTrace.i(19693767229440L, 146730);
    paramm.e(this.jix, paramContext.getString(p.i.iwR));
    GMTrace.o(19693767229440L, 146730);
  }
  
  public final void a(Context paramContext, AppBrandPageView paramAppBrandPageView, String paramString, k paramk)
  {
    GMTrace.i(19693901447168L, 146731);
    paramAppBrandPageView.irS.iqR.YY();
    com.tencent.mm.plugin.appbrand.report.a.a(paramString, paramAppBrandPageView.jlc.jlW, 17, "", bg.Po(), 1, 0);
    GMTrace.o(19693901447168L, 146731);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/menu/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */