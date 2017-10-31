package com.tencent.mm.plugin.ipcall.a.e;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.report.service.g;

public final class b
  extends a
{
  private long mZC;
  public long mZD;
  public long mZE;
  public long mZF;
  public long mZG;
  
  public b()
  {
    GMTrace.i(11603391021056L, 86452);
    this.mZE = 0L;
    this.mZF = 0L;
    this.mZG = 0L;
    GMTrace.o(11603391021056L, 86452);
  }
  
  protected final void aHP()
  {
    GMTrace.i(11603793674240L, 86455);
    g.paX.i(12930, new Object[] { Long.valueOf(this.mZC), Long.valueOf(this.mZD), Long.valueOf(this.mZE), Long.valueOf(this.mZF), Long.valueOf(this.mZG) });
    GMTrace.o(11603793674240L, 86455);
  }
  
  public final void reset()
  {
    GMTrace.i(11603659456512L, 86454);
    this.mZC = 0L;
    this.mZD = 0L;
    this.mZE = 0L;
    this.mZF = 0L;
    this.mZG = 0L;
    GMTrace.o(11603659456512L, 86454);
  }
  
  public final void start()
  {
    GMTrace.i(11603525238784L, 86453);
    super.start();
    this.mZC = System.currentTimeMillis();
    GMTrace.o(11603525238784L, 86453);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/ipcall/a/e/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */