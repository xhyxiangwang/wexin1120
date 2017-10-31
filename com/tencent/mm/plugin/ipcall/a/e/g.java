package com.tencent.mm.plugin.ipcall.a.e;

import com.tencent.gmtrace.GMTrace;

public final class g
  extends a
{
  private long mZC;
  public long mZD;
  public long mZR;
  public String mZS;
  public String mZT;
  public long mZU;
  public long mZV;
  public long mZW;
  public String mZX;
  
  public g()
  {
    GMTrace.i(11602854150144L, 86448);
    this.mZR = 0L;
    this.mZS = "";
    this.mZT = "";
    this.mZU = 0L;
    this.mZV = 0L;
    this.mZW = 0L;
    this.mZX = "";
    GMTrace.o(11602854150144L, 86448);
  }
  
  protected final void aHP()
  {
    GMTrace.i(11603256803328L, 86451);
    com.tencent.mm.plugin.report.service.g.paX.i(12933, new Object[] { Long.valueOf(this.mZC), Long.valueOf(this.mZD), Long.valueOf(this.mZR), this.mZS, this.mZT, Long.valueOf(this.mZU), Long.valueOf(this.mZV), Long.valueOf(this.mZW), this.mZX });
    GMTrace.o(11603256803328L, 86451);
  }
  
  public final void reset()
  {
    GMTrace.i(11603122585600L, 86450);
    this.mZC = 0L;
    this.mZD = 0L;
    this.mZR = 0L;
    this.mZS = "";
    this.mZT = "";
    this.mZU = 0L;
    this.mZV = 0L;
    this.mZW = 0L;
    this.mZX = "";
    GMTrace.o(11603122585600L, 86450);
  }
  
  public final void start()
  {
    GMTrace.i(11602988367872L, 86449);
    super.start();
    this.mZC = System.currentTimeMillis();
    GMTrace.o(11602988367872L, 86449);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/ipcall/a/e/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */