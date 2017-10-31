package com.tencent.mm.plugin.appbrand.ui;

import android.app.Activity;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.b.b;
import com.tencent.mm.plugin.appbrand.b.c;
import com.tencent.mm.plugin.appbrand.b.e;
import com.tencent.mm.plugin.appbrand.g;

final class f
  extends e
{
  private g iqK;
  
  f(Activity paramActivity, g paramg)
  {
    super(paramActivity);
    GMTrace.i(17307241807872L, 128949);
    this.iqK = paramg;
    GMTrace.o(17307241807872L, 128949);
  }
  
  protected final void SV()
  {
    GMTrace.i(18835847512064L, 140338);
    com.tencent.mm.plugin.appbrand.f localf = this.iqK.RL();
    if (localf != null) {
      localf.irc.iCL.hN(10);
    }
    GMTrace.o(18835847512064L, 140338);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/ui/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */