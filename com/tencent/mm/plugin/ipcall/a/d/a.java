package com.tencent.mm.plugin.ipcall.a.d;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ac.b;
import com.tencent.mm.ac.b.a;
import com.tencent.mm.ac.b.b;
import com.tencent.mm.ac.b.c;
import com.tencent.mm.ac.k;
import com.tencent.mm.network.j;
import com.tencent.mm.network.p;
import com.tencent.mm.protocal.c.atd;
import com.tencent.mm.protocal.c.ate;
import com.tencent.mm.sdk.platformtools.w;

public final class a
  extends k
  implements j
{
  private b gMC;
  private com.tencent.mm.ac.e gMF;
  public atd mYX;
  private ate mYY;
  
  public a(int paramInt1, long paramLong1, String paramString1, String paramString2, int paramInt2, long paramLong2)
  {
    GMTrace.i(11586211151872L, 86324);
    this.gMC = null;
    this.mYX = null;
    this.mYY = null;
    this.gMF = null;
    b.a locala = new b.a();
    locala.hlX = new atd();
    locala.hlY = new ate();
    locala.hlW = 843;
    locala.uri = "/cgi-bin/micromsg-bin/pstncancelinvite";
    locala.hlZ = 0;
    locala.hma = 0;
    this.gMC = locala.DA();
    long l = System.currentTimeMillis();
    this.mYX = ((atd)this.gMC.hlU.hmc);
    this.mYX.tNa = paramInt1;
    this.mYX.tNb = paramLong1;
    this.mYX.mGA = paramString1;
    this.mYX.uoJ = l;
    this.mYX.uoK = paramInt2;
    this.mYX.uoL = paramString2;
    this.mYX.uoM = paramLong2;
    w.d("MicroMsg.NetSceneIPCallCancel", "roomId: %d, roomKey: %d, toUsername: %s, timestamp: %d, inviteId: %d, phoneNumber: %s, callseq: %d", new Object[] { Integer.valueOf(paramInt1), Long.valueOf(paramLong1), paramString1, Long.valueOf(l), Integer.valueOf(paramInt2), paramString2, Long.valueOf(paramLong2) });
    GMTrace.o(11586211151872L, 86324);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ac.e parame1)
  {
    GMTrace.i(11586479587328L, 86326);
    this.gMF = parame1;
    int i = a(parame, this.gMC, this);
    GMTrace.o(11586479587328L, 86326);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, p paramp, byte[] paramArrayOfByte)
  {
    GMTrace.i(11586613805056L, 86327);
    w.i("MicroMsg.NetSceneIPCallCancel", "errType: %d, errCode: %d", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    this.mYY = ((ate)((b)paramp).hlV.hmc);
    if (this.gMF != null) {
      this.gMF.a(paramInt2, paramInt3, paramString, this);
    }
    GMTrace.o(11586613805056L, 86327);
  }
  
  public final int getType()
  {
    GMTrace.i(11586345369600L, 86325);
    GMTrace.o(11586345369600L, 86325);
    return 843;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/ipcall/a/d/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */