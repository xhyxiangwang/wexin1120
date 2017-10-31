package com.tencent.mm.plugin.appbrand.g;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ac.b.b;
import com.tencent.mm.ac.k;
import com.tencent.mm.network.j;
import com.tencent.mm.network.p;
import com.tencent.mm.protocal.c.ail;
import com.tencent.mm.protocal.c.aim;
import com.tencent.mm.protocal.c.bta;
import com.tencent.mm.sdk.platformtools.w;

public final class b
  extends k
  implements j
{
  public final com.tencent.mm.ac.b gMC;
  private com.tencent.mm.ac.e gPR;
  private a<b> jiz;
  
  private b(String paramString1, String paramString2, String paramString3, int paramInt1, int paramInt2, int paramInt3)
  {
    GMTrace.i(15528588476416L, 115697);
    w.i("MicroMsg.webview.NetSceneJSOperateWxData", "NetSceneJSLogin doScene appId [%s], data [%s], grantScope [%s], versionType [%d], opt [%d], extScene [%d]", new Object[] { paramString1, paramString2, paramString3, Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    Object localObject = new com.tencent.mm.ac.b.a();
    ((com.tencent.mm.ac.b.a)localObject).hlX = new ail();
    ((com.tencent.mm.ac.b.a)localObject).hlY = new aim();
    ((com.tencent.mm.ac.b.a)localObject).uri = "/cgi-bin/mmbiz-bin/js-operatewxdata";
    ((com.tencent.mm.ac.b.a)localObject).hlW = 1133;
    ((com.tencent.mm.ac.b.a)localObject).hlZ = 0;
    ((com.tencent.mm.ac.b.a)localObject).hma = 0;
    this.gMC = ((com.tencent.mm.ac.b.a)localObject).DA();
    localObject = (ail)this.gMC.hlU.hmc;
    ((ail)localObject).mDD = paramString1;
    if (paramString2.getBytes() == null) {}
    for (paramString1 = new byte[0];; paramString1 = paramString2.getBytes())
    {
      ((ail)localObject).jWD = new com.tencent.mm.bl.b(paramString1);
      ((ail)localObject).udm = paramString3;
      ((ail)localObject).ude = paramInt1;
      ((ail)localObject).udd = paramInt2;
      if (paramInt3 > 0)
      {
        ((ail)localObject).udf = new bta();
        ((ail)localObject).udf.scene = paramInt3;
      }
      GMTrace.o(15528588476416L, 115697);
      return;
    }
  }
  
  public b(String paramString1, String paramString2, String paramString3, int paramInt1, int paramInt2, int paramInt3, a<b> parama)
  {
    this(paramString1, paramString2, paramString3, paramInt1, paramInt2, paramInt3);
    GMTrace.i(15528454258688L, 115696);
    this.jiz = parama;
    GMTrace.o(15528454258688L, 115696);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ac.e parame1)
  {
    GMTrace.i(10559579750400L, 78675);
    w.i("MicroMsg.webview.NetSceneJSOperateWxData", "doScene");
    this.gPR = parame1;
    int i = a(parame, this.gMC, this);
    GMTrace.o(10559579750400L, 78675);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, p paramp, byte[] paramArrayOfByte)
  {
    GMTrace.i(10559311314944L, 78673);
    w.i("MicroMsg.webview.NetSceneJSOperateWxData", "errType = %d, errCode = %d, errMsg = %s", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    if (this.gPR != null) {
      this.gPR.a(paramInt2, paramInt3, paramString, this);
    }
    if (this.jiz != null) {
      this.jiz.b(paramInt2, paramInt3, paramString, this);
    }
    GMTrace.o(10559311314944L, 78673);
  }
  
  public final int getType()
  {
    GMTrace.i(10559445532672L, 78674);
    GMTrace.o(10559445532672L, 78674);
    return 1133;
  }
  
  public static abstract interface a<T extends k>
  {
    public abstract void b(int paramInt1, int paramInt2, String paramString, T paramT);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/g/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */