package com.tencent.mm.plugin.ipcall.a.d;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ac.b;
import com.tencent.mm.ac.b.a;
import com.tencent.mm.ac.b.b;
import com.tencent.mm.ac.b.c;
import com.tencent.mm.ac.k;
import com.tencent.mm.network.j;
import com.tencent.mm.network.p;
import com.tencent.mm.protocal.c.ats;
import com.tencent.mm.protocal.c.att;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.x.m;

public final class o
  extends k
  implements j
{
  private b gMC;
  private com.tencent.mm.ac.e gMF;
  public ats mZA;
  public att mZB;
  
  public o(int paramInt1, long paramLong1, int paramInt2, long paramLong2, boolean paramBoolean)
  {
    GMTrace.i(11584063668224L, 86308);
    this.gMC = null;
    this.mZA = null;
    this.mZB = null;
    b.a locala = new b.a();
    locala.hlX = new ats();
    locala.hlY = new att();
    locala.hlW = 819;
    locala.uri = "/cgi-bin/micromsg-bin/pstnsync";
    locala.hlZ = 0;
    locala.hma = 0;
    this.gMC = locala.DA();
    long l = System.currentTimeMillis();
    this.mZA = ((ats)this.gMC.hlU.hmc);
    this.mZA.upg = m.zF();
    this.mZA.tNa = paramInt1;
    this.mZA.tNb = paramLong1;
    this.mZA.uoJ = l;
    this.mZA.uph = paramInt2;
    this.mZA.uoM = paramLong2;
    if (!paramBoolean) {}
    for (this.mZA.upi = 0;; this.mZA.upi = 1)
    {
      w.i("MicroMsg.NetSceneIPCallSync", "roomId: %d, roomKey: %d, syncKey: %d, callSeq: %d,dataFlag: %d, timestamp: %d", new Object[] { Integer.valueOf(paramInt1), Long.valueOf(paramLong1), Integer.valueOf(paramInt2), Long.valueOf(paramLong2), Integer.valueOf(this.mZA.upi), Long.valueOf(l) });
      GMTrace.o(11584063668224L, 86308);
      return;
    }
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ac.e parame1)
  {
    GMTrace.i(11584332103680L, 86310);
    this.gMF = parame1;
    int i = a(parame, this.gMC, this);
    GMTrace.o(11584332103680L, 86310);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, p paramp, byte[] paramArrayOfByte)
  {
    GMTrace.i(11584466321408L, 86311);
    w.i("MicroMsg.NetSceneIPCallSync", "onGYNetEnd, errType: %d, errCode: %d", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    this.mZB = ((att)((b)paramp).hlV.hmc);
    this.gMF.a(paramInt2, paramInt3, paramString, this);
    GMTrace.o(11584466321408L, 86311);
  }
  
  public final int getType()
  {
    GMTrace.i(11584197885952L, 86309);
    GMTrace.o(11584197885952L, 86309);
    return 819;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/ipcall/a/d/o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */