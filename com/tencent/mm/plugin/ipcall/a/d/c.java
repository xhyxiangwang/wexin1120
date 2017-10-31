package com.tencent.mm.plugin.ipcall.a.d;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ac.b;
import com.tencent.mm.ac.b.a;
import com.tencent.mm.ac.b.b;
import com.tencent.mm.ac.b.c;
import com.tencent.mm.ac.k;
import com.tencent.mm.network.j;
import com.tencent.mm.network.p;
import com.tencent.mm.protocal.c.aea;
import com.tencent.mm.protocal.c.aeb;
import com.tencent.mm.sdk.platformtools.w;

public final class c
  extends k
  implements j
{
  private b gMC;
  private com.tencent.mm.ac.e gMF;
  private aea mZb;
  public aeb mZc;
  
  public c()
  {
    GMTrace.i(15066208403456L, 112252);
    this.gMC = null;
    this.mZb = null;
    this.mZc = null;
    this.gMF = null;
    b.a locala = new b.a();
    locala.hlX = new aea();
    locala.hlY = new aeb();
    locala.hlW = 746;
    locala.uri = "/cgi-bin/micromsg-bin/getwcocallinfo";
    locala.hlZ = 0;
    locala.hma = 0;
    this.gMC = locala.DA();
    this.mZb = ((aea)this.gMC.hlU.hmc);
    w.i("MicroMsg.NetSceneIPCallGetCallInfo", "NetSceneIPCallGetCallInfo");
    GMTrace.o(15066208403456L, 112252);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ac.e parame1)
  {
    GMTrace.i(15066476838912L, 112254);
    this.gMF = parame1;
    int i = a(parame, this.gMC, this);
    GMTrace.o(15066476838912L, 112254);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, p paramp, byte[] paramArrayOfByte)
  {
    GMTrace.i(15066611056640L, 112255);
    w.i("MicroMsg.NetSceneIPCallGetCallInfo", "onGYNetEnd, errType: %d, errCode: %d", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    this.mZc = ((aeb)((b)paramp).hlV.hmc);
    if (this.gMF != null) {
      this.gMF.a(paramInt2, paramInt3, paramString, this);
    }
    GMTrace.o(15066611056640L, 112255);
  }
  
  public final int getType()
  {
    GMTrace.i(15066342621184L, 112253);
    GMTrace.o(15066342621184L, 112253);
    return 746;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/ipcall/a/d/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */