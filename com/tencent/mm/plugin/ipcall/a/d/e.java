package com.tencent.mm.plugin.ipcall.a.d;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ac.b;
import com.tencent.mm.ac.b.a;
import com.tencent.mm.ac.b.b;
import com.tencent.mm.ac.b.c;
import com.tencent.mm.ac.k;
import com.tencent.mm.network.j;
import com.tencent.mm.network.p;
import com.tencent.mm.protocal.c.aee;
import com.tencent.mm.protocal.c.aef;
import com.tencent.mm.sdk.platformtools.w;

public final class e
  extends k
  implements j
{
  private b gMC;
  private com.tencent.mm.ac.e gMF;
  private aee mZf;
  public aef mZg;
  
  public e()
  {
    GMTrace.i(15066745274368L, 112256);
    this.gMC = null;
    this.mZf = null;
    this.mZg = null;
    this.gMF = null;
    b.a locala = new b.a();
    locala.hlX = new aee();
    locala.hlY = new aef();
    locala.hlW = 831;
    locala.uri = "/cgi-bin/micromsg-bin/getwcopackageproductlist";
    locala.hlZ = 0;
    locala.hma = 0;
    this.gMC = locala.DA();
    this.mZf = ((aee)this.gMC.hlU.hmc);
    w.i("MicroMsg.NetSceneIPCallGetPackageProductList", "NetSceneIPCallGetPackageProductList");
    GMTrace.o(15066745274368L, 112256);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ac.e parame1)
  {
    GMTrace.i(15067013709824L, 112258);
    this.gMF = parame1;
    int i = a(parame, this.gMC, this);
    GMTrace.o(15067013709824L, 112258);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, p paramp, byte[] paramArrayOfByte)
  {
    GMTrace.i(15067147927552L, 112259);
    w.i("MicroMsg.NetSceneIPCallGetPackageProductList", "onGYNetEnd, errType: %d, errCode: %d", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    this.mZg = ((aef)((b)paramp).hlV.hmc);
    if (this.gMF != null) {
      this.gMF.a(paramInt2, paramInt3, paramString, this);
    }
    GMTrace.o(15067147927552L, 112259);
  }
  
  public final int getType()
  {
    GMTrace.i(15066879492096L, 112257);
    GMTrace.o(15066879492096L, 112257);
    return 831;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/ipcall/a/d/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */