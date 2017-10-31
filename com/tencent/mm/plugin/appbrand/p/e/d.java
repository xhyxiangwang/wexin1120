package com.tencent.mm.plugin.appbrand.p.e;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.w;

public final class d
  extends g
  implements b
{
  private String jxr;
  
  public d()
  {
    GMTrace.i(10188467732480L, 75910);
    this.jxr = "*";
    GMTrace.o(10188467732480L, 75910);
  }
  
  public final String abp()
  {
    GMTrace.i(10188736167936L, 75912);
    String str = this.jxr;
    GMTrace.o(10188736167936L, 75912);
    return str;
  }
  
  public final void si(String paramString)
  {
    GMTrace.i(10188601950208L, 75911);
    if (paramString == null)
    {
      w.i("MicroMsg.AppBrandNetWork.HandshakeImpl1Client", "http resource descriptor must not be null");
      GMTrace.o(10188601950208L, 75911);
      return;
    }
    this.jxr = paramString;
    GMTrace.o(10188601950208L, 75911);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/p/e/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */