package com.tencent.mm.plugin.appbrand.menu;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.d;
import com.tencent.mm.plugin.appbrand.d.c;
import com.tencent.mm.plugin.appbrand.p.c;
import com.tencent.mm.plugin.appbrand.p.i;
import com.tencent.mm.plugin.appbrand.page.AppBrandPageView;
import com.tencent.mm.plugin.appbrand.page.s;
import com.tencent.mm.sdk.a.b;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.ui.base.m;

public final class f
  extends com.tencent.mm.plugin.appbrand.menu.a.a
{
  public f()
  {
    super(l.jio - 1);
    GMTrace.i(15560934948864L, 115938);
    GMTrace.o(15560934948864L, 115938);
  }
  
  public final void a(Context paramContext, AppBrandPageView paramAppBrandPageView, m paramm, String paramString)
  {
    GMTrace.i(17667079536640L, 131630);
    if (b.bMv()) {
      paramm.a(this.jix, paramContext.getResources().getColor(p.c.aPX), paramContext.getString(p.i.iwv));
    }
    GMTrace.o(17667079536640L, 131630);
  }
  
  public final void a(Context paramContext, AppBrandPageView paramAppBrandPageView, String paramString, k paramk)
  {
    GMTrace.i(15561203384320L, 115940);
    d.a(paramString, d.c.iqA);
    if ((paramContext instanceof Activity))
    {
      ((Activity)paramContext).finish();
      com.tencent.mm.plugin.appbrand.report.a.a(paramString, paramAppBrandPageView.jlc.jlV, 10, "", bg.Po(), 1, 0);
    }
    GMTrace.o(15561203384320L, 115940);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/menu/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */