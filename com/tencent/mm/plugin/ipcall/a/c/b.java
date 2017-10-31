package com.tencent.mm.plugin.ipcall.a.c;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.w;

public final class b
{
  public String countryCode;
  public String ilw;
  public long mVR;
  public int mXg;
  public long mXh;
  public int mXj;
  public int mYA;
  public long mYB;
  public long mYC;
  public int mYD;
  public long mYE;
  public int mYF;
  public long mYG;
  public int mYH;
  public String mYI;
  public long mYJ;
  public long mYK;
  public long mYL;
  public long mYM;
  public String mYN;
  public String mYO;
  public String mYP;
  public long mYQ;
  public long mYR;
  public long mYS;
  public int mYT;
  public int mYU;
  public int mYV;
  public int mYW;
  public int mYw;
  public int mYx;
  public int mYy;
  public int mYz;
  
  public b()
  {
    GMTrace.i(11570641895424L, 86208);
    this.mYw = 0;
    this.mYx = 0;
    this.mYy = 0;
    this.mYz = 0;
    this.mYA = 0;
    this.mYB = 0L;
    this.mYC = 0L;
    this.mYD = 0;
    this.mYE = 0L;
    this.mYF = 0;
    this.mXj = 0;
    this.mXg = 0;
    this.mXh = 0L;
    this.mYG = 0L;
    this.ilw = "";
    this.mYH = 0;
    this.mYI = "";
    this.mYJ = 0L;
    this.mYK = 0L;
    this.mVR = 0L;
    this.mYL = 0L;
    this.mYM = 0L;
    this.mYN = "";
    this.mYO = "";
    this.mYP = "";
    this.mYQ = 0L;
    this.mYR = 0L;
    this.countryCode = "";
    this.mYS = 0L;
    this.mYT = 0;
    this.mYU = 0;
    this.mYV = 0;
    this.mYW = 0;
    GMTrace.o(11570641895424L, 86208);
  }
  
  public final void aHJ()
  {
    GMTrace.i(11570776113152L, 86209);
    w.i("MicroMsg.IPCallReportHelper", "selfShutdown");
    this.mYA = 1;
    GMTrace.o(11570776113152L, 86209);
  }
  
  public final void aHK()
  {
    GMTrace.i(11570910330880L, 86210);
    w.i("MicroMsg.IPCallReportHelper", "selfCancel");
    this.mYz = 1;
    if ((this.mYS == 0L) && (this.mYJ != 0L))
    {
      this.mYS = (System.currentTimeMillis() - this.mYJ);
      w.d("MicroMsg.IPCallReportHelper", "cancelTime: %d", new Object[] { Long.valueOf(this.mYS) });
    }
    GMTrace.o(11570910330880L, 86210);
  }
  
  public final void aHL()
  {
    GMTrace.i(11571044548608L, 86211);
    w.i("MicroMsg.IPCallReportHelper", "channelConnect");
    this.mYD = 1;
    GMTrace.o(11571044548608L, 86211);
  }
  
  public final void aHM()
  {
    GMTrace.i(11571178766336L, 86212);
    if (this.mYV == 0) {
      this.mYV = 1;
    }
    GMTrace.o(11571178766336L, 86212);
  }
  
  public final void aHN()
  {
    GMTrace.i(11571312984064L, 86213);
    w.d("MicroMsg.IPCallReportHelper", "markConnect");
    if (this.mYQ == 0L)
    {
      this.mYQ = System.currentTimeMillis();
      this.mYR = (this.mYQ - this.mYJ);
      w.d("MicroMsg.IPCallReportHelper", "connectTime: %d", new Object[] { Long.valueOf(this.mYR) });
    }
    GMTrace.o(11571312984064L, 86213);
  }
  
  public final void aHO()
  {
    GMTrace.i(11571447201792L, 86214);
    w.d("MicroMsg.IPCallReportHelper", "markStartTalk");
    if (this.mYL == 0L) {
      this.mYL = System.currentTimeMillis();
    }
    GMTrace.o(11571447201792L, 86214);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/ipcall/a/c/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */