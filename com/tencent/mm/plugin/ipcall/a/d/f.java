package com.tencent.mm.plugin.ipcall.a.d;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ac.b;
import com.tencent.mm.ac.b.a;
import com.tencent.mm.ac.b.b;
import com.tencent.mm.ac.b.c;
import com.tencent.mm.ac.k;
import com.tencent.mm.network.j;
import com.tencent.mm.network.p;
import com.tencent.mm.protocal.c.aeg;
import com.tencent.mm.protocal.c.aeh;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;

public final class f
  extends k
  implements j
{
  private b gMC;
  private com.tencent.mm.ac.e gMF;
  private aeg mZh;
  public aeh mZi;
  public boolean mZj;
  
  public f(String paramString1, String paramString2)
  {
    GMTrace.i(11586748022784L, 86328);
    this.gMC = null;
    this.mZh = null;
    this.mZi = null;
    this.mZj = true;
    if (bg.mZ(paramString2))
    {
      this.mZj = true;
      paramString2 = "";
    }
    for (;;)
    {
      b.a locala = new b.a();
      locala.hlX = new aeg();
      locala.hlY = new aeh();
      locala.hlW = 929;
      locala.uri = "/cgi-bin/micromsg-bin/getwcoproductlist";
      locala.hlZ = 0;
      locala.hma = 0;
      this.gMC = locala.DA();
      this.mZh = ((aeg)this.gMC.hlU.hmc);
      this.mZh.tZO = paramString1;
      this.mZh.tZP = paramString2;
      w.i("MicroMsg.NetSceneIPCallGetProductList", "NetSceneIPCallGetProductList");
      GMTrace.o(11586748022784L, 86328);
      return;
      this.mZj = false;
    }
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ac.e parame1)
  {
    GMTrace.i(11587016458240L, 86330);
    this.gMF = parame1;
    int i = a(parame, this.gMC, this);
    GMTrace.o(11587016458240L, 86330);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, p paramp, byte[] paramArrayOfByte)
  {
    GMTrace.i(11587150675968L, 86331);
    w.i("MicroMsg.NetSceneIPCallGetProductList", "onGYNetEnd, errType: %d, errCode: %d", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    this.mZi = ((aeh)((b)paramp).hlV.hmc);
    if (this.gMF != null) {
      this.gMF.a(paramInt2, paramInt3, paramString, this);
    }
    GMTrace.o(11587150675968L, 86331);
  }
  
  public final int getType()
  {
    GMTrace.i(11586882240512L, 86329);
    GMTrace.o(11586882240512L, 86329);
    return 929;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/ipcall/a/d/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */