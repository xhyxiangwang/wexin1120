package com.tencent.mm.plugin.walletlock.gesture.a;

import com.tencent.gmtrace.GMTrace;
import java.lang.reflect.Array;

public final class f
{
  private static f[][] sft;
  public int sfr;
  public int sfs;
  
  static
  {
    GMTrace.i(20240436035584L, 150803);
    sft = (f[][])Array.newInstance(f.class, new int[] { 3, 3 });
    int i = 0;
    while (i < 3)
    {
      int j = 0;
      while (j < 3)
      {
        sft[i][j] = new f(i, j);
        j += 1;
      }
      i += 1;
    }
    GMTrace.o(20240436035584L, 150803);
  }
  
  private f(int paramInt1, int paramInt2)
  {
    GMTrace.i(20240033382400L, 150800);
    this.sfr = 0;
    this.sfs = 0;
    this.sfr = paramInt1;
    this.sfs = paramInt2;
    GMTrace.o(20240033382400L, 150800);
  }
  
  public static f dy(int paramInt1, int paramInt2)
  {
    try
    {
      GMTrace.i(20240167600128L, 150801);
      if ((paramInt1 < 0) || (paramInt1 > 2)) {
        throw new IllegalArgumentException("row id should be in range [0..2]");
      }
    }
    finally {}
    if ((paramInt2 < 0) || (paramInt2 > 2)) {
      throw new IllegalArgumentException("col id should be in range [0..2]");
    }
    f localf = sft[paramInt1][paramInt2];
    GMTrace.o(20240167600128L, 150801);
    return localf;
  }
  
  public final String toString()
  {
    GMTrace.i(20240301817856L, 150802);
    String str = String.format("{row: %d, col: %d}", new Object[] { Integer.valueOf(this.sfr), Integer.valueOf(this.sfs) });
    GMTrace.o(20240301817856L, 150802);
    return str;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/walletlock/gesture/a/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */