package com.tencent.mm.plugin.ipcall.a.d;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ac.b;
import com.tencent.mm.ac.b.a;
import com.tencent.mm.ac.b.b;
import com.tencent.mm.ac.b.c;
import com.tencent.mm.ac.k;
import com.tencent.mm.network.j;
import com.tencent.mm.network.p;
import com.tencent.mm.protocal.c.atq;
import com.tencent.mm.protocal.c.atr;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.x.m;

public final class n
  extends k
  implements j
{
  private b gMC;
  private com.tencent.mm.ac.e gMF;
  public atq mZy;
  private atr mZz;
  
  public n(int paramInt1, long paramLong1, long paramLong2, int paramInt2)
  {
    GMTrace.i(11583526797312L, 86304);
    this.gMC = null;
    this.mZy = null;
    this.mZz = null;
    this.gMF = null;
    b.a locala = new b.a();
    locala.hlX = new atq();
    locala.hlY = new atr();
    locala.hlW = 723;
    locala.uri = "/cgi-bin/micromsg-bin/pstnshutdown";
    locala.hlZ = 0;
    locala.hma = 0;
    this.gMC = locala.DA();
    long l = System.currentTimeMillis();
    this.mZy = ((atq)this.gMC.hlU.hmc);
    this.mZy.mGB = m.zF();
    this.mZy.tNa = paramInt1;
    this.mZy.tNb = paramLong1;
    this.mZy.uoM = paramLong2;
    this.mZy.jXo = paramInt2;
    this.mZy.uoJ = l;
    w.i("MicroMsg.NetSceneIPCallShutDown", "roomId: %d, roomKey: %d, callSeq: %d, status: %d, timestamp: %d", new Object[] { Integer.valueOf(paramInt1), Long.valueOf(paramLong1), Long.valueOf(paramLong2), Integer.valueOf(paramInt2), Long.valueOf(l) });
    GMTrace.o(11583526797312L, 86304);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ac.e parame1)
  {
    GMTrace.i(11583795232768L, 86306);
    this.gMF = parame1;
    int i = a(parame, this.gMC, this);
    GMTrace.o(11583795232768L, 86306);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, p paramp, byte[] paramArrayOfByte)
  {
    GMTrace.i(11583929450496L, 86307);
    w.i("MicroMsg.NetSceneIPCallShutDown", "onGYNetEnd, errType: %d, errCode: %d", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    this.mZz = ((atr)((b)paramp).hlV.hmc);
    if (this.gMF != null) {
      this.gMF.a(paramInt2, paramInt3, paramString, this);
    }
    GMTrace.o(11583929450496L, 86307);
  }
  
  public final int getType()
  {
    GMTrace.i(11583661015040L, 86305);
    GMTrace.o(11583661015040L, 86305);
    return 723;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/ipcall/a/d/n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */