package com.tencent.mm.plugin.appbrand.widget.input;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.page.AppBrandPageView;
import com.tencent.mm.plugin.appbrand.page.AppBrandPageView.b;
import com.tencent.mm.plugin.appbrand.page.AppBrandPageView.c;
import com.tencent.mm.ui.MMActivity;
import java.lang.ref.WeakReference;

final class j
  implements AppBrandPageView.b, AppBrandPageView.c
{
  final WeakReference<AppBrandPageView> jAL;
  
  j(AppBrandPageView paramAppBrandPageView)
  {
    GMTrace.i(14321165795328L, 106701);
    this.jAL = new WeakReference(paramAppBrandPageView);
    paramAppBrandPageView.a(this);
    paramAppBrandPageView.a(this);
    GMTrace.o(14321165795328L, 106701);
  }
  
  public final void VS()
  {
    GMTrace.i(14321300013056L, 106702);
    AppBrandPageView localAppBrandPageView = (AppBrandPageView)this.jAL.get();
    if (localAppBrandPageView != null) {
      m.j(localAppBrandPageView);
    }
    GMTrace.o(14321300013056L, 106702);
  }
  
  public final void onDestroy()
  {
    GMTrace.i(14321434230784L, 106703);
    AppBrandPageView localAppBrandPageView = (AppBrandPageView)this.jAL.get();
    if (localAppBrandPageView != null)
    {
      if ((localAppBrandPageView.mContext instanceof MMActivity)) {
        ((MMActivity)localAppBrandPageView.mContext).aKl();
      }
      m.j(localAppBrandPageView);
      m.l(localAppBrandPageView);
      localAppBrandPageView.b(this);
      localAppBrandPageView.b(this);
      if (localAppBrandPageView.jlc != null) {
        f.abN().o(localAppBrandPageView.jlc);
      }
    }
    GMTrace.o(14321434230784L, 106703);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/widget/input/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */