package com.tencent.mm.plugin.backup.bakoldlogic.a;

import com.tencent.gmtrace.GMTrace;

public final class a
  implements Cloneable, Comparable<a>
{
  public String jKU;
  public long jKX;
  public long jKY;
  
  public a()
  {
    GMTrace.i(14810523631616L, 110347);
    GMTrace.o(14810523631616L, 110347);
  }
  
  public final a afo()
  {
    GMTrace.i(14810657849344L, 110348);
    a locala = new a();
    locala.jKU = this.jKU;
    locala.jKX = this.jKX;
    locala.jKY = this.jKY;
    GMTrace.o(14810657849344L, 110348);
    return locala;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/backup/bakoldlogic/a/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */