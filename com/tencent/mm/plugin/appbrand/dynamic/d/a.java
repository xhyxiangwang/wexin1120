package com.tencent.mm.plugin.appbrand.dynamic.d;

import com.tencent.gmtrace.GMTrace;

public class a
{
  private static volatile com.tencent.mm.jsapi.core.f iMe;
  private static volatile com.tencent.mm.jsapi.core.f iMf;
  
  public a()
  {
    GMTrace.i(19924219068416L, 148447);
    GMTrace.o(19924219068416L, 148447);
  }
  
  private static com.tencent.mm.jsapi.core.f US()
  {
    GMTrace.i(19924487503872L, 148449);
    if (iMe == null) {}
    try
    {
      if (iMe == null)
      {
        localf = new com.tencent.mm.jsapi.core.f();
        localf.a(new b(302));
        localf.a(new c(303));
        localf.a(new d(308));
        localf.a(new f());
        localf.a(new g());
        iMe = localf;
      }
      com.tencent.mm.jsapi.core.f localf = iMe;
      GMTrace.o(19924487503872L, 148449);
      return localf;
    }
    finally {}
  }
  
  private static com.tencent.mm.jsapi.core.f UT()
  {
    GMTrace.i(19924621721600L, 148450);
    if (iMf == null) {}
    try
    {
      if (iMf == null)
      {
        localf = new com.tencent.mm.jsapi.core.f();
        localf.a(new b(262));
        localf.a(new c(263));
        localf.a(new d(268));
        localf.a(new f());
        localf.a(new g());
        localf.a(new e((byte)0));
        iMf = localf;
      }
      com.tencent.mm.jsapi.core.f localf = iMf;
      GMTrace.o(19924621721600L, 148450);
      return localf;
    }
    finally {}
  }
  
  public static com.tencent.mm.jsapi.core.f ig(int paramInt)
  {
    GMTrace.i(19924353286144L, 148448);
    if (paramInt == 1)
    {
      localf = UT();
      GMTrace.o(19924353286144L, 148448);
      return localf;
    }
    com.tencent.mm.jsapi.core.f localf = US();
    GMTrace.o(19924353286144L, 148448);
    return localf;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/dynamic/d/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */