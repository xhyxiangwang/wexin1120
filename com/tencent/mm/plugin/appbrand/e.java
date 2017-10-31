package com.tencent.mm.plugin.appbrand;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.appcache.s;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.b.c;
import com.tencent.mm.sdk.platformtools.af;

public final class e
{
  private static final c<com.tencent.mm.g.a.e> iqI;
  
  static
  {
    GMTrace.i(10569109209088L, 78746);
    iqI = new c() {};
    GMTrace.o(10569109209088L, 78746);
  }
  
  public static void Rw()
  {
    GMTrace.i(16057674760192L, 119639);
    com.tencent.mm.plugin.appbrand.o.d.xC().C(s.iBR);
    com.tencent.mm.plugin.appbrand.o.d.xC().C(com.tencent.mm.plugin.appbrand.appstorage.d.iBR);
    GMTrace.o(16057674760192L, 119639);
  }
  
  public static void release()
  {
    GMTrace.i(10568840773632L, 78744);
    a.uLm.c(iqI);
    GMTrace.o(10568840773632L, 78744);
  }
  
  public static void setup()
  {
    GMTrace.i(10568706555904L, 78743);
    a.uLm.a(iqI);
    GMTrace.o(10568706555904L, 78743);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */