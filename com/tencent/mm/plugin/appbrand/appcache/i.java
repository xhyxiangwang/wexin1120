package com.tencent.mm.plugin.appbrand.appcache;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.e.e;

public final class i
  extends com.tencent.mm.sdk.e.i<h>
{
  public static final String[] iAV;
  
  static
  {
    GMTrace.i(19690680221696L, 146707);
    iAV = new String[] { com.tencent.mm.sdk.e.i.a(h.iAU, "PkgUpdateStats") };
    GMTrace.o(19690680221696L, 146707);
  }
  
  public i(e parame)
  {
    super(parame, h.iAU, "PkgUpdateStats", h.fSf);
    GMTrace.i(19690411786240L, 146705);
    GMTrace.o(19690411786240L, 146705);
  }
  
  final boolean S(String paramString, int paramInt)
  {
    GMTrace.i(19690546003968L, 146706);
    h localh = new h();
    localh.field_key = paramString;
    localh.field_version = paramInt;
    boolean bool = super.a(localh, h.iAT);
    GMTrace.o(19690546003968L, 146706);
    return bool;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/appcache/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */