package com.tencent.mm.plugin.appbrand.menu;

import com.tencent.gmtrace.GMTrace;

public final class l
  extends Enum<l>
{
  static
  {
    GMTrace.i(15559324336128L, 115926);
    jii = 1;
    jij = 2;
    jik = 3;
    jil = 4;
    jim = 5;
    jin = 6;
    jio = 7;
    jip = 8;
    jiq = 9;
    jir = 10;
    jis = 11;
    jit = 12;
    jiu = new int[] { jii, jij, jik, jil, jim, jin, jio, jip, jiq, jir, jis, jit };
    GMTrace.o(15559324336128L, 115926);
  }
  
  public static int iW(int paramInt)
  {
    GMTrace.i(15559190118400L, 115925);
    int[] arrayOfInt = (int[])jiu.clone();
    int j = arrayOfInt.length;
    int i = 0;
    while (i < j)
    {
      int k = arrayOfInt[i];
      if (k - 1 == paramInt)
      {
        GMTrace.o(15559190118400L, 115925);
        return k;
      }
      i += 1;
    }
    GMTrace.o(15559190118400L, 115925);
    return 0;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/menu/l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */