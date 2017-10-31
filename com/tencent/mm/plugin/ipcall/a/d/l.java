package com.tencent.mm.plugin.ipcall.a.d;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ac.b.a;
import com.tencent.mm.ac.b.b;
import com.tencent.mm.ac.b.c;
import com.tencent.mm.ac.k;
import com.tencent.mm.network.j;
import com.tencent.mm.network.p;
import com.tencent.mm.platformtools.n;
import com.tencent.mm.plugin.ipcall.a.i;
import com.tencent.mm.plugin.ipcall.b.c;
import com.tencent.mm.protocal.c.ato;
import com.tencent.mm.protocal.c.atp;
import com.tencent.mm.sdk.platformtools.w;

public final class l
  extends k
  implements j
{
  private com.tencent.mm.ac.b gMC;
  private com.tencent.mm.ac.e gMF;
  private ato mZu;
  private atp mZv;
  
  public l(int paramInt, long paramLong, boolean paramBoolean)
  {
    GMTrace.i(11581916184576L, 86292);
    this.gMC = null;
    this.mZu = null;
    this.mZv = null;
    Object localObject1 = new b.a();
    ((b.a)localObject1).hlX = new ato();
    ((b.a)localObject1).hlY = new atp();
    ((b.a)localObject1).hlW = 227;
    ((b.a)localObject1).uri = "/cgi-bin/micromsg-bin/pstnreport";
    ((b.a)localObject1).hlZ = 0;
    ((b.a)localObject1).hma = 0;
    this.gMC = ((b.a)localObject1).DA();
    this.mZu = ((ato)this.gMC.hlU.hmc);
    this.mZu.tNa = paramInt;
    this.mZu.uoM = paramLong;
    localObject1 = this.mZu;
    if (paramBoolean) {}
    for (paramInt = 1;; paramInt = 0)
    {
      ((ato)localObject1).upf = paramInt;
      w.d("MicroMsg.NetSceneIPCallReport", "NetSceneIPCallReport, roomId: %d, callseq: %d, gotAnswer: %d", new Object[] { Integer.valueOf(this.mZu.tNa), Long.valueOf(this.mZu.uoM), Integer.valueOf(this.mZu.upf) });
      localObject1 = this.mZu;
      Object localObject2 = i.aHn();
      localObject2 = ((com.tencent.mm.plugin.ipcall.a.c.b)localObject2).mXg + "," + ((com.tencent.mm.plugin.ipcall.a.c.b)localObject2).mXh + "," + ((com.tencent.mm.plugin.ipcall.a.c.b)localObject2).mYG + "," + ((com.tencent.mm.plugin.ipcall.a.c.b)localObject2).ilw + "," + ((com.tencent.mm.plugin.ipcall.a.c.b)localObject2).mYH + "," + ((com.tencent.mm.plugin.ipcall.a.c.b)localObject2).mYw + "," + ((com.tencent.mm.plugin.ipcall.a.c.b)localObject2).mYx + "," + ((com.tencent.mm.plugin.ipcall.a.c.b)localObject2).mYy + "," + ((com.tencent.mm.plugin.ipcall.a.c.b)localObject2).mYz + "," + ((com.tencent.mm.plugin.ipcall.a.c.b)localObject2).mYA + "," + ((com.tencent.mm.plugin.ipcall.a.c.b)localObject2).mYB + "," + ((com.tencent.mm.plugin.ipcall.a.c.b)localObject2).mYC + "," + ((com.tencent.mm.plugin.ipcall.a.c.b)localObject2).mYD + "," + ((com.tencent.mm.plugin.ipcall.a.c.b)localObject2).mYE + "," + ((com.tencent.mm.plugin.ipcall.a.c.b)localObject2).mYF + "," + ((com.tencent.mm.plugin.ipcall.a.c.b)localObject2).mYI + "," + c.aIC() + "," + ((com.tencent.mm.plugin.ipcall.a.c.b)localObject2).mYR + "," + ((com.tencent.mm.plugin.ipcall.a.c.b)localObject2).countryCode + "," + ((com.tencent.mm.plugin.ipcall.a.c.b)localObject2).mYS + "," + ((com.tencent.mm.plugin.ipcall.a.c.b)localObject2).mYT + "," + ((com.tencent.mm.plugin.ipcall.a.c.b)localObject2).mYU + ((com.tencent.mm.plugin.ipcall.a.c.b)localObject2).mYP + "," + ((com.tencent.mm.plugin.ipcall.a.c.b)localObject2).mYW;
      w.i("MicroMsg.IPCallReportHelper", "getPstnClientReportString, result: %s", new Object[] { localObject2 });
      ((ato)localObject1).upc = n.mV((String)localObject2);
      localObject1 = this.mZu;
      localObject2 = i.aHn();
      localObject2 = ((com.tencent.mm.plugin.ipcall.a.c.b)localObject2).mXg + "," + ((com.tencent.mm.plugin.ipcall.a.c.b)localObject2).mXh + "," + ((com.tencent.mm.plugin.ipcall.a.c.b)localObject2).mYG + ((com.tencent.mm.plugin.ipcall.a.c.b)localObject2).mYO;
      w.i("MicroMsg.IPCallReportHelper", "getPstnChannelReportString, result: %s", new Object[] { localObject2 });
      ((ato)localObject1).upd = n.mV((String)localObject2);
      localObject1 = this.mZu;
      localObject2 = i.aHn();
      localObject2 = ((com.tencent.mm.plugin.ipcall.a.c.b)localObject2).mXg + "," + ((com.tencent.mm.plugin.ipcall.a.c.b)localObject2).mXh + "," + ((com.tencent.mm.plugin.ipcall.a.c.b)localObject2).mYG + ((com.tencent.mm.plugin.ipcall.a.c.b)localObject2).mYN;
      w.i("MicroMsg.IPCallReportHelper", "getPstnEngineReport, result: %s", new Object[] { localObject2 });
      ((ato)localObject1).upe = n.mV((String)localObject2);
      GMTrace.o(11581916184576L, 86292);
      return;
    }
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ac.e parame1)
  {
    GMTrace.i(11582184620032L, 86294);
    this.gMF = parame1;
    int i = a(parame, this.gMC, this);
    GMTrace.o(11582184620032L, 86294);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, p paramp, byte[] paramArrayOfByte)
  {
    GMTrace.i(11582318837760L, 86295);
    w.i("MicroMsg.NetSceneIPCallReport", "onGYNetEnd, errType: %d, errCode: %d", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    this.mZv = ((atp)((com.tencent.mm.ac.b)paramp).hlV.hmc);
    if (this.gMF != null) {
      this.gMF.a(paramInt2, paramInt3, paramString, this);
    }
    GMTrace.o(11582318837760L, 86295);
  }
  
  public final int getType()
  {
    GMTrace.i(11582050402304L, 86293);
    GMTrace.o(11582050402304L, 86293);
    return 227;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/ipcall/a/d/l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */