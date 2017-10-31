package com.tencent.mm.plugin.shake.d.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ac.b.a;
import com.tencent.mm.ac.b.b;
import com.tencent.mm.ac.k;
import com.tencent.mm.ac.k.b;
import com.tencent.mm.network.j;
import com.tencent.mm.network.p;
import com.tencent.mm.protocal.c.acv;
import com.tencent.mm.protocal.c.acw;
import com.tencent.mm.sdk.platformtools.w;

public final class b
  extends k
  implements j
{
  public com.tencent.mm.ac.b gMC;
  private com.tencent.mm.ac.e gMF;
  private String pxs;
  private int scene;
  
  public b(String paramString, int paramInt)
  {
    GMTrace.i(6609417797632L, 49244);
    this.pxs = paramString;
    this.scene = paramInt;
    GMTrace.o(6609417797632L, 49244);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ac.e parame1)
  {
    GMTrace.i(6609552015360L, 49245);
    this.gMF = parame1;
    parame1 = new b.a();
    parame1.hlX = new acv();
    parame1.hlY = new acw();
    parame1.uri = "/cgi-bin/micromsg-bin/gettvinfo";
    parame1.hlW = 552;
    parame1.hlZ = 0;
    parame1.hma = 0;
    this.gMC = parame1.DA();
    parame1 = (acv)this.gMC.hlU.hmc;
    parame1.tYK = this.pxs;
    parame1.ttY = this.scene;
    int i = a(parame, this.gMC, this);
    GMTrace.o(6609552015360L, 49245);
    return i;
  }
  
  protected final int a(p paramp)
  {
    GMTrace.i(6609686233088L, 49246);
    paramp = (acv)((com.tencent.mm.ac.b)paramp).hlU.hmc;
    if ((paramp.ttY < 0) || (paramp.tYK == null) || (paramp.tYK.length() <= 0))
    {
      w.e("MicroMsg.scanner.NetSceneGetTVInfo", "ERR: Security Check Failed, Scene = %s", new Object[] { Integer.valueOf(paramp.ttY) });
      i = k.b.hmF;
      GMTrace.o(6609686233088L, 49246);
      return i;
    }
    int i = k.b.hmE;
    GMTrace.o(6609686233088L, 49246);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, p paramp, byte[] paramArrayOfByte)
  {
    GMTrace.i(6609820450816L, 49247);
    w.d("MicroMsg.scanner.NetSceneGetTVInfo", "onGYNetEnd errtype:" + paramInt2 + " errcode:" + paramInt3 + " errMsg:" + paramString);
    this.gMF.a(paramInt2, paramInt3, paramString, this);
    GMTrace.o(6609820450816L, 49247);
  }
  
  public final int getType()
  {
    GMTrace.i(6609954668544L, 49248);
    GMTrace.o(6609954668544L, 49248);
    return 552;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/shake/d/a/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */