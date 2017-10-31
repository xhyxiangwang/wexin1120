package com.tencent.mm.plugin.ipcall.a.e;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.report.service.g;

public final class j
  extends a
{
  private long mZC;
  public long mZD;
  public long nac;
  public long nad;
  public long nae;
  
  public j()
  {
    GMTrace.i(11601109319680L, 86435);
    this.nac = 0L;
    this.nad = 0L;
    this.nae = 0L;
    GMTrace.o(11601109319680L, 86435);
  }
  
  protected final void aHP()
  {
    GMTrace.i(11601511972864L, 86438);
    g.paX.i(12934, new Object[] { Long.valueOf(this.mZC), Long.valueOf(this.mZD), Long.valueOf(this.nac), Long.valueOf(this.nad), Long.valueOf(this.nae) });
    GMTrace.o(11601511972864L, 86438);
  }
  
  public final void reset()
  {
    GMTrace.i(11601377755136L, 86437);
    this.mZC = 0L;
    this.mZD = 0L;
    this.nac = 0L;
    this.nad = 0L;
    this.nae = 0L;
    GMTrace.o(11601377755136L, 86437);
  }
  
  public final void start()
  {
    GMTrace.i(11601243537408L, 86436);
    super.start();
    this.mZC = System.currentTimeMillis();
    GMTrace.o(11601243537408L, 86436);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/ipcall/a/e/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */