package com.tencent.mm.plugin.collect.reward.b;

import com.tencent.gmtrace.GMTrace;

public abstract interface b
{
  public static final Integer[] kLp;
  
  static
  {
    GMTrace.i(19380771487744L, 144398);
    kLp = new Integer[] { Integer.valueOf(100), Integer.valueOf(500), Integer.valueOf(1000), Integer.valueOf(2000), Integer.valueOf(5000), Integer.valueOf(10000) };
    GMTrace.o(19380771487744L, 144398);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/collect/reward/b/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */