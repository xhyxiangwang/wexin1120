package com.tencent.mm.plugin.backup.a;

import com.tencent.gmtrace.GMTrace;

public final class d
  implements Cloneable, Comparable<d>
{
  public String jKU;
  public long jKV;
  public long jKW;
  public long jKX;
  public long jKY;
  
  public d()
  {
    GMTrace.i(14722745237504L, 109693);
    this.jKV = 0L;
    this.jKW = 0L;
    this.jKX = -1L;
    this.jKY = -1L;
    GMTrace.o(14722745237504L, 109693);
  }
  
  public final d adF()
  {
    GMTrace.i(18450508414976L, 137467);
    d locald = new d();
    locald.jKU = this.jKU;
    locald.jKV = this.jKV;
    locald.jKW = this.jKW;
    locald.jKX = this.jKX;
    locald.jKY = this.jKY;
    GMTrace.o(18450508414976L, 137467);
    return locald;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/backup/a/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */