package com.tencent.mm.plugin.wallet.balance.a.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.protocal.c.auk;
import com.tencent.mm.protocal.c.mv;
import com.tencent.mm.vending.c.b;
import com.tencent.mm.vending.h.e;

public class h
  implements b<g>
{
  protected g rBG;
  public final b rBH;
  public final a rBI;
  
  public h()
  {
    this(new g());
    GMTrace.i(18418161942528L, 137226);
    GMTrace.o(18418161942528L, 137226);
  }
  
  private h(g paramg)
  {
    GMTrace.i(18418296160256L, 137227);
    this.rBH = new b();
    this.rBI = new a();
    this.rBG = paramg;
    GMTrace.o(18418296160256L, 137227);
  }
  
  public final class a
    implements e<mv, String>
  {
    public a()
    {
      GMTrace.i(18423530651648L, 137266);
      GMTrace.o(18423530651648L, 137266);
    }
    
    public final String PD()
    {
      GMTrace.i(18423664869376L, 137267);
      GMTrace.o(18423664869376L, 137267);
      return "Vending.LOGIC";
    }
  }
  
  public final class b
    implements e<auk, Void>
  {
    public b()
    {
      GMTrace.i(18417759289344L, 137223);
      GMTrace.o(18417759289344L, 137223);
    }
    
    public final String PD()
    {
      GMTrace.i(18417893507072L, 137224);
      GMTrace.o(18417893507072L, 137224);
      return "Vending.LOGIC";
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/wallet/balance/a/a/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */