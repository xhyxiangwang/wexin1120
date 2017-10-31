package com.tencent.mm.plugin.ipcall.a.e;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.report.service.g;

public final class h
  extends a
{
  private long mZC;
  public long mZD;
  private long mZY;
  public long mZZ;
  public long naa;
  public long nab;
  
  public h()
  {
    GMTrace.i(11600438231040L, 86430);
    this.mZY = 0L;
    this.mZZ = 0L;
    this.naa = 0L;
    this.nab = 0L;
    GMTrace.o(11600438231040L, 86430);
  }
  
  protected final void aHP()
  {
    GMTrace.i(11600840884224L, 86433);
    g.paX.i(12931, new Object[] { Long.valueOf(this.mZC), Long.valueOf(this.mZD), Long.valueOf(this.mZY), Long.valueOf(this.mZZ), Long.valueOf(this.naa), Long.valueOf(this.nab) });
    GMTrace.o(11600840884224L, 86433);
  }
  
  public final void reset()
  {
    GMTrace.i(11600706666496L, 86432);
    this.mZC = 0L;
    this.mZD = 0L;
    this.mZY = 0L;
    this.mZZ = 0L;
    this.naa = 0L;
    this.nab = 0L;
    GMTrace.o(11600706666496L, 86432);
  }
  
  public final void start()
  {
    GMTrace.i(11600572448768L, 86431);
    super.start();
    this.mZC = System.currentTimeMillis();
    GMTrace.o(11600572448768L, 86431);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/ipcall/a/e/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */