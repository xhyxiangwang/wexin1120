package com.tencent.mm.plugin.aa.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.vending.c.b;
import com.tencent.mm.vending.j.d;

public final class j
  implements b<i>
{
  protected i igT;
  public final b igU;
  public final a igV;
  
  public j()
  {
    this(new i());
    GMTrace.i(5582383742976L, 41592);
    GMTrace.o(5582383742976L, 41592);
  }
  
  private j(i parami)
  {
    GMTrace.i(5582517960704L, 41593);
    this.igU = new b();
    this.igV = new a();
    this.igT = parami;
    GMTrace.o(5582517960704L, 41593);
  }
  
  public final i PL()
  {
    GMTrace.i(5582652178432L, 41594);
    i locali = this.igT;
    GMTrace.o(5582652178432L, 41594);
    return locali;
  }
  
  public final class a
    implements com.tencent.mm.vending.h.e<Boolean, com.tencent.mm.vending.j.e<String, Integer, String, Long>>
  {
    public a()
    {
      GMTrace.i(5595805515776L, 41692);
      GMTrace.o(5595805515776L, 41692);
    }
    
    public final String PD()
    {
      GMTrace.i(5595939733504L, 41693);
      GMTrace.o(5595939733504L, 41693);
      return "Vending.LOGIC";
    }
  }
  
  public final class b
    implements com.tencent.mm.vending.h.e<Boolean, d<String, Integer, String>>
  {
    public b()
    {
      GMTrace.i(5602382184448L, 41741);
      GMTrace.o(5602382184448L, 41741);
    }
    
    public final String PD()
    {
      GMTrace.i(5602516402176L, 41742);
      GMTrace.o(5602516402176L, 41742);
      return "Vending.LOGIC";
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/aa/a/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */