package com.tencent.mm.plugin.aa.a.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ac.b;
import com.tencent.mm.ac.b.a;
import com.tencent.mm.ac.b.b;
import com.tencent.mm.ac.b.c;
import com.tencent.mm.ac.k;
import com.tencent.mm.network.j;
import com.tencent.mm.network.p;
import com.tencent.mm.protocal.c.d;
import com.tencent.mm.sdk.platformtools.w;

public final class e
  extends k
  implements j
{
  private com.tencent.mm.ac.e gMF;
  private b hMN;
  private d ihm;
  public com.tencent.mm.protocal.c.e ihn;
  public int scene;
  
  public e(String paramString1, int paramInt, String paramString2)
  {
    GMTrace.i(5596208168960L, 41695);
    b.a locala = new b.a();
    locala.hlX = new d();
    locala.hlY = new com.tencent.mm.protocal.c.e();
    locala.hlW = 1530;
    locala.uri = "/cgi-bin/mmpay-bin/newaaclose";
    locala.hlZ = 0;
    locala.hma = 0;
    this.hMN = locala.DA();
    this.ihm = ((d)this.hMN.hlU.hmc);
    this.ihm.trt = paramString2;
    this.ihm.trs = paramString1;
    this.ihm.scene = paramInt;
    this.scene = paramInt;
    w.d("MicroMsg.NetSceneAAClose", "NetSceneAAClose, billNo: %s, scene: %s", new Object[] { this.ihm.trs, Integer.valueOf(paramInt) });
    GMTrace.o(5596208168960L, 41695);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ac.e parame1)
  {
    GMTrace.i(5596476604416L, 41697);
    w.i("MicroMsg.NetSceneAAClose", "doScene");
    this.gMF = parame1;
    int i = a(parame, this.hMN, this);
    GMTrace.o(5596476604416L, 41697);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, p paramp, byte[] paramArrayOfByte)
  {
    GMTrace.i(5596610822144L, 41698);
    w.i("MicroMsg.NetSceneAAClose", "onGYNetEnd, errType: %s, errCode: %s", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    this.ihn = ((com.tencent.mm.protocal.c.e)((b)paramp).hlV.hmc);
    w.i("MicroMsg.NetSceneAAClose", "retcode: %s, retmsg: %s", new Object[] { Integer.valueOf(this.ihn.kKx), this.ihn.kKy });
    if (this.gMF != null) {
      this.gMF.a(paramInt2, paramInt3, paramString, this);
    }
    GMTrace.o(5596610822144L, 41698);
  }
  
  public final int getType()
  {
    GMTrace.i(5596342386688L, 41696);
    GMTrace.o(5596342386688L, 41696);
    return 1530;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/aa/a/a/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */