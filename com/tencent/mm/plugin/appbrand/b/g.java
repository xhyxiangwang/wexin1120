package com.tencent.mm.plugin.appbrand.b;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.report.c;

abstract class g
  extends c
{
  private final h iDn;
  
  g(h paramh)
  {
    GMTrace.i(18878394531840L, 140655);
    this.iDn = paramh;
    GMTrace.o(18878394531840L, 140655);
  }
  
  public void enter()
  {
    GMTrace.i(18878528749568L, 140656);
    super.enter();
    this.iDn.a(this);
    GMTrace.o(18878528749568L, 140656);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/b/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */