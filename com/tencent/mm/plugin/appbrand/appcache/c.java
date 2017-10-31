package com.tencent.mm.plugin.appbrand.appcache;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.compatible.loader.a;

public abstract interface c
{
  public static final int[] iAC;
  public static final int[] iAD;
  
  static
  {
    GMTrace.i(17655134158848L, 131541);
    iAC = new int[] { 0, 10002, 10102 };
    iAD = new int[] { 1, 2, 999, 10000, 10001, 10100, 10101 };
    GMTrace.o(17655134158848L, 131541);
  }
  
  public static enum a
  {
    static
    {
      GMTrace.i(10606958608384L, 79028);
      iAE = new a[0];
      GMTrace.o(10606958608384L, 79028);
    }
    
    public static boolean fx(int paramInt)
    {
      GMTrace.i(17654999941120L, 131540);
      boolean bool = a.b(c.iAD, paramInt);
      GMTrace.o(17654999941120L, 131540);
      return bool;
    }
    
    public static boolean hK(int paramInt)
    {
      GMTrace.i(17654865723392L, 131539);
      boolean bool = a.b(c.iAC, paramInt);
      GMTrace.o(17654865723392L, 131539);
      return bool;
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/appcache/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */