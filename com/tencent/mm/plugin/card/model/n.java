package com.tencent.mm.plugin.card.model;

import com.tencent.gmtrace.GMTrace;

public final class n
{
  public static int kpi;
  
  static
  {
    GMTrace.i(4903778910208L, 36536);
    kpi = 1;
    GMTrace.o(4903778910208L, 36536);
  }
  
  public static enum a
  {
    static
    {
      GMTrace.i(4922300956672L, 36674);
      kpj = 1;
      kpk = 2;
      kpl = 3;
      kpm = 4;
      kpn = 5;
      kpo = 6;
      kpp = new int[] { kpj, kpk, kpl, kpm, kpn, kpo };
      GMTrace.o(4922300956672L, 36674);
    }
    
    public static int[] ajy()
    {
      GMTrace.i(4922166738944L, 36673);
      int[] arrayOfInt = (int[])kpp.clone();
      GMTrace.o(4922166738944L, 36673);
      return arrayOfInt;
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/card/model/n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */