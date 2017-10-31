package com.tencent.mm.plugin.ipcall.a.d;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ac.b;
import com.tencent.mm.ac.b.a;
import com.tencent.mm.ac.b.b;
import com.tencent.mm.ac.b.c;
import com.tencent.mm.ac.k;
import com.tencent.mm.network.j;
import com.tencent.mm.network.p;
import com.tencent.mm.protocal.c.aec;
import com.tencent.mm.protocal.c.aed;
import com.tencent.mm.sdk.platformtools.w;

public final class d
  extends k
  implements j
{
  private b gMC;
  private com.tencent.mm.ac.e gMF;
  private aec mZd;
  public aed mZe;
  
  public d()
  {
    GMTrace.i(11582453055488L, 86296);
    this.gMC = null;
    this.mZd = null;
    this.mZe = null;
    b.a locala = new b.a();
    locala.hlX = new aec();
    locala.hlY = new aed();
    locala.hlW = 288;
    locala.uri = "/cgi-bin/micromsg-bin/getwcogiftcardlist";
    locala.hlZ = 0;
    locala.hma = 0;
    this.gMC = locala.DA();
    this.mZd = ((aec)this.gMC.hlU.hmc);
    w.i("MicroMsg.NetSceneIPCallGetGiftCardList", "NetSceneIPCallGetGiftCardList");
    GMTrace.o(11582453055488L, 86296);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ac.e parame1)
  {
    GMTrace.i(11582721490944L, 86298);
    this.gMF = parame1;
    int i = a(parame, this.gMC, this);
    GMTrace.o(11582721490944L, 86298);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, p paramp, byte[] paramArrayOfByte)
  {
    GMTrace.i(11582855708672L, 86299);
    w.i("MicroMsg.NetSceneIPCallGetGiftCardList", "onGYNetEnd, errType: %d, errCode: %d", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    this.mZe = ((aed)((b)paramp).hlV.hmc);
    if (this.gMF != null) {
      this.gMF.a(paramInt2, paramInt3, paramString, this);
    }
    GMTrace.o(11582855708672L, 86299);
  }
  
  public final int getType()
  {
    GMTrace.i(11582587273216L, 86297);
    GMTrace.o(11582587273216L, 86297);
    return 288;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/ipcall/a/d/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */