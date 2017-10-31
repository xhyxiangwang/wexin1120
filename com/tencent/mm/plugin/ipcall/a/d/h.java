package com.tencent.mm.plugin.ipcall.a.d;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ac.b;
import com.tencent.mm.ac.b.a;
import com.tencent.mm.ac.b.b;
import com.tencent.mm.ac.b.c;
import com.tencent.mm.ac.k;
import com.tencent.mm.network.j;
import com.tencent.mm.network.p;
import com.tencent.mm.protocal.c.ath;
import com.tencent.mm.protocal.c.ati;
import com.tencent.mm.sdk.platformtools.w;

public final class h
  extends k
  implements j
{
  private b gMC;
  private com.tencent.mm.ac.e gMF;
  public ath mZm;
  private ati mZn;
  
  public h(int paramInt, long paramLong1, long paramLong2)
  {
    GMTrace.i(11581379313664L, 86288);
    this.gMC = null;
    this.mZm = null;
    this.mZn = null;
    this.gMF = null;
    b.a locala = new b.a();
    locala.hlX = new ath();
    locala.hlY = new ati();
    locala.hlW = 824;
    locala.uri = "/cgi-bin/micromsg-bin/pstnheartbeat";
    locala.hlZ = 0;
    locala.hma = 0;
    this.gMC = locala.DA();
    long l = System.currentTimeMillis();
    this.mZm = ((ath)this.gMC.hlU.hmc);
    this.mZm.tNa = paramInt;
    this.mZm.tNb = paramLong1;
    this.mZm.uoM = paramLong2;
    this.mZm.uoJ = l;
    w.d("MicroMsg.NetSceneIPCallHeartBeat", "heartbeat, roomId: %d, roomKey: %d, callSeq: %d, timestamp: %d", new Object[] { Integer.valueOf(paramInt), Long.valueOf(paramLong1), Long.valueOf(paramLong2), Long.valueOf(l) });
    GMTrace.o(11581379313664L, 86288);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ac.e parame1)
  {
    GMTrace.i(11581647749120L, 86290);
    this.gMF = parame1;
    int i = a(parame, this.gMC, this);
    GMTrace.o(11581647749120L, 86290);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, p paramp, byte[] paramArrayOfByte)
  {
    GMTrace.i(11581781966848L, 86291);
    w.i("MicroMsg.NetSceneIPCallHeartBeat", "onGYNetEnd, errType: %d, errCode: %d", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    this.mZn = ((ati)((b)paramp).hlV.hmc);
    if (this.gMF != null) {
      this.gMF.a(paramInt2, paramInt3, paramString, this);
    }
    GMTrace.o(11581781966848L, 86291);
  }
  
  public final int getType()
  {
    GMTrace.i(11581513531392L, 86289);
    GMTrace.o(11581513531392L, 86289);
    return 824;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/ipcall/a/d/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */