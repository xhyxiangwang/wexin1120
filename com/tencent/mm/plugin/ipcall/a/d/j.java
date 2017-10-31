package com.tencent.mm.plugin.ipcall.a.d;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ac.b;
import com.tencent.mm.ac.b.a;
import com.tencent.mm.ac.b.b;
import com.tencent.mm.ac.b.c;
import com.tencent.mm.ac.k;
import com.tencent.mm.network.p;
import com.tencent.mm.protocal.c.bol;
import com.tencent.mm.protocal.c.bom;
import com.tencent.mm.sdk.platformtools.w;

public final class j
  extends k
  implements com.tencent.mm.network.j
{
  private b gMC;
  private com.tencent.mm.ac.e gMF;
  public bol mZq;
  public bom mZr;
  
  public j(String paramString)
  {
    GMTrace.i(15067282145280L, 112260);
    this.gMC = null;
    this.mZq = null;
    this.mZr = null;
    this.gMF = null;
    b.a locala = new b.a();
    locala.hlX = new bol();
    locala.hlY = new bom();
    locala.hlW = 277;
    locala.uri = "/cgi-bin/micromsg-bin/wcopurchasepackage";
    locala.hlZ = 0;
    locala.hma = 0;
    this.gMC = locala.DA();
    this.mZq = ((bol)this.gMC.hlU.hmc);
    this.mZq.txh = paramString;
    w.i("MicroMsg.NetSceneIPCallPurchasePackage", "NetSceneIPCallPurchasePackage ProductID:%s", new Object[] { this.mZq.txh });
    GMTrace.o(15067282145280L, 112260);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ac.e parame1)
  {
    GMTrace.i(15067550580736L, 112262);
    this.gMF = parame1;
    int i = a(parame, this.gMC, this);
    GMTrace.o(15067550580736L, 112262);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, p paramp, byte[] paramArrayOfByte)
  {
    GMTrace.i(15067684798464L, 112263);
    w.i("MicroMsg.NetSceneIPCallPurchasePackage", "onGYNetEnd, errType: %d, errCode: %d", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    this.mZr = ((bom)((b)paramp).hlV.hmc);
    if (this.gMF != null) {
      this.gMF.a(paramInt2, paramInt3, paramString, this);
    }
    GMTrace.o(15067684798464L, 112263);
  }
  
  public final int getType()
  {
    GMTrace.i(15067416363008L, 112261);
    GMTrace.o(15067416363008L, 112261);
    return 277;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/ipcall/a/d/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */