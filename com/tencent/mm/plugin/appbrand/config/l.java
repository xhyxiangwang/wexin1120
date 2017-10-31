package com.tencent.mm.plugin.appbrand.config;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.bt.g;
import com.tencent.mm.plugin.appbrand.o.d;
import com.tencent.mm.sdk.e.e;
import com.tencent.mm.sdk.e.i;

@Deprecated
final class l
{
  public static final String[] iJm;
  final g iCj;
  private final a iJn;
  
  static
  {
    GMTrace.i(10580517715968L, 78831);
    iJm = new String[] { a.iJo };
    GMTrace.o(10580517715968L, 78831);
  }
  
  l(g paramg)
  {
    GMTrace.i(10579309756416L, 78822);
    this.iJn = new a(paramg);
    this.iCj = paramg;
    d.xC();
    GMTrace.o(10579309756416L, 78822);
  }
  
  private static final class a
    extends i<m>
  {
    public static final String iJo;
    
    static
    {
      GMTrace.i(10572330434560L, 78770);
      iJo = i.a(m.iBQ, "AppBrandWxaAppInfo");
      GMTrace.o(10572330434560L, 78770);
    }
    
    a(e parame)
    {
      super(m.iBQ, "AppBrandWxaAppInfo", m.fSf);
      GMTrace.i(10571659345920L, 78765);
      GMTrace.o(10571659345920L, 78765);
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/config/l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */