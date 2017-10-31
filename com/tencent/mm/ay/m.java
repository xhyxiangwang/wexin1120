package com.tencent.mm.ay;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ac.b;
import com.tencent.mm.ac.b.a;
import com.tencent.mm.ac.b.b;
import com.tencent.mm.ac.k;
import com.tencent.mm.network.j;
import com.tencent.mm.network.p;
import com.tencent.mm.protocal.c.aza;
import com.tencent.mm.protocal.c.azb;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.v;
import com.tencent.mm.sdk.platformtools.w;

public final class m
  extends k
  implements j
{
  public b gMC;
  private com.tencent.mm.ac.e gMF;
  
  public m(String paramString)
  {
    GMTrace.i(19135018827776L, 142567);
    Object localObject = new b.a();
    ((b.a)localObject).hlW = 1944;
    ((b.a)localObject).uri = "/cgi-bin/mmsearch-bin/searchlocalpage";
    ((b.a)localObject).hlX = new aza();
    ((b.a)localObject).hlY = new azb();
    this.gMC = ((b.a)localObject).DA();
    localObject = (aza)this.gMC.hlU.hmc;
    ((aza)localObject).usI = paramString;
    ((aza)localObject).ttY = 25;
    ((aza)localObject).lph = v.eq(ab.getContext());
    ((aza)localObject).ugD = d.CP();
    GMTrace.o(19135018827776L, 142567);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ac.e parame1)
  {
    GMTrace.i(19135287263232L, 142569);
    this.gMF = parame1;
    int i = a(parame, this.gMC, this);
    GMTrace.o(19135287263232L, 142569);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, p paramp, byte[] paramArrayOfByte)
  {
    GMTrace.i(19135421480960L, 142570);
    w.i("MicroMsg.FTS.NetSceneWebSearchLocalPage", "netId %d | errType %d | errCode %d | errMsg %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    if (this.gMF != null) {
      this.gMF.a(paramInt2, paramInt3, paramString, this);
    }
    GMTrace.o(19135421480960L, 142570);
  }
  
  public final int getType()
  {
    GMTrace.i(19135153045504L, 142568);
    int i = this.gMC.hlW;
    GMTrace.o(19135153045504L, 142568);
    return i;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/ay/m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */