package com.tencent.mm.plugin.ipcall.a.d;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ac.b;
import com.tencent.mm.ac.b.a;
import com.tencent.mm.ac.b.b;
import com.tencent.mm.ac.b.c;
import com.tencent.mm.network.j;
import com.tencent.mm.network.p;
import com.tencent.mm.protocal.c.atm;
import com.tencent.mm.protocal.c.atn;
import com.tencent.mm.sdk.platformtools.w;

public final class k
  extends com.tencent.mm.ac.k
  implements j
{
  private b gMC;
  private com.tencent.mm.ac.e gMF;
  public atm mZs;
  public atn mZt;
  
  public k(int paramInt, long paramLong1, long paramLong2)
  {
    GMTrace.i(11582989926400L, 86300);
    this.gMC = null;
    this.mZs = null;
    this.mZt = null;
    this.gMF = null;
    b.a locala = new b.a();
    locala.hlX = new atm();
    locala.hlY = new atn();
    locala.hlW = 726;
    locala.uri = "/cgi-bin/micromsg-bin/pstnredirect";
    locala.hlZ = 0;
    locala.hma = 0;
    this.gMC = locala.DA();
    this.mZs = ((atm)this.gMC.hlU.hmc);
    this.mZs.tNa = paramInt;
    this.mZs.tNb = paramLong1;
    this.mZs.uoM = paramLong2;
    GMTrace.o(11582989926400L, 86300);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ac.e parame1)
  {
    GMTrace.i(11583258361856L, 86302);
    this.gMF = parame1;
    int i = a(parame, this.gMC, this);
    GMTrace.o(11583258361856L, 86302);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, p paramp, byte[] paramArrayOfByte)
  {
    GMTrace.i(11583392579584L, 86303);
    w.i("MicroMsg.NetSceneIPCallRedirect", "onGYNetEnd, errType: %d, errCode: %d", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    this.mZt = ((atn)((b)paramp).hlV.hmc);
    if (this.gMF != null) {
      this.gMF.a(paramInt2, paramInt3, paramString, this);
    }
    GMTrace.o(11583392579584L, 86303);
  }
  
  public final int getType()
  {
    GMTrace.i(11583124144128L, 86301);
    GMTrace.o(11583124144128L, 86301);
    return 726;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/ipcall/a/d/k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */