package com.tencent.mm.plugin.aa.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.protocal.c.v;
import com.tencent.mm.vending.h.e;
import com.tencent.mm.vending.j.f;

public final class c
  implements com.tencent.mm.vending.c.b<b>
{
  protected b igC;
  public final a igD;
  
  public c()
  {
    this(new b());
    GMTrace.i(5602784837632L, 41744);
    GMTrace.o(5602784837632L, 41744);
  }
  
  private c(b paramb)
  {
    GMTrace.i(5602919055360L, 41745);
    this.igD = new a();
    this.igC = paramb;
    GMTrace.o(5602919055360L, 41745);
  }
  
  public final b PB()
  {
    GMTrace.i(5603053273088L, 41746);
    b localb = this.igC;
    GMTrace.o(5603053273088L, 41746);
    return localb;
  }
  
  public final class a
    implements e<v, f<String, Integer, String, String, Integer>>
  {
    public a()
    {
      GMTrace.i(5583323267072L, 41599);
      GMTrace.o(5583323267072L, 41599);
    }
    
    public final String PD()
    {
      GMTrace.i(5583457484800L, 41600);
      GMTrace.o(5583457484800L, 41600);
      return "Vending.LOGIC";
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/aa/a/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */