package com.tencent.mm.plugin.order.model;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ac.b;
import com.tencent.mm.ac.b.a;
import com.tencent.mm.ac.b.b;
import com.tencent.mm.network.p;
import com.tencent.mm.plugin.wallet_core.model.h;
import com.tencent.mm.protocal.c.qy;
import com.tencent.mm.protocal.c.qz;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.wallet_core.c.k;

public final class f
  extends k
{
  private b gMC;
  private com.tencent.mm.ac.e gMF;
  
  public f(String paramString1, String paramString2, int paramInt)
  {
    GMTrace.i(6626060795904L, 49368);
    Object localObject = new b.a();
    ((b.a)localObject).hlX = new qy();
    ((b.a)localObject).hlY = new qz();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/evaluateorder";
    ((b.a)localObject).hlW = 583;
    ((b.a)localObject).hlZ = 0;
    ((b.a)localObject).hma = 0;
    this.gMC = ((b.a)localObject).DA();
    localObject = (qy)this.gMC.hlU.hmc;
    ((qy)localObject).tNg = paramString1;
    ((qy)localObject).mDD = paramString2;
    ((qy)localObject).pau = paramInt;
    ((qy)localObject).tEh = h.bww();
    GMTrace.o(6626060795904L, 49368);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ac.e parame1)
  {
    GMTrace.i(6626463449088L, 49371);
    this.gMF = parame1;
    int i = a(parame, this.gMC, this);
    GMTrace.o(6626463449088L, 49371);
    return i;
  }
  
  public final void e(int paramInt1, int paramInt2, String paramString, p paramp)
  {
    GMTrace.i(6626195013632L, 49369);
    w.d("MicroMsg.NetSceneEvaluateOrder", "errType:" + paramInt1 + ",errCode:" + paramInt2 + ",errMsg" + paramString);
    this.gMF.a(paramInt1, paramInt2, paramString, this);
    GMTrace.o(6626195013632L, 49369);
  }
  
  public final int getType()
  {
    GMTrace.i(6626329231360L, 49370);
    GMTrace.o(6626329231360L, 49370);
    return 583;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/order/model/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */