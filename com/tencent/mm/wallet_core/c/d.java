package com.tencent.mm.wallet_core.c;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ac.b;
import com.tencent.mm.ac.b.a;
import com.tencent.mm.ac.b.b;
import com.tencent.mm.network.p;
import com.tencent.mm.plugin.wallet_core.model.h;
import com.tencent.mm.protocal.c.iy;
import com.tencent.mm.protocal.c.iz;
import com.tencent.mm.sdk.platformtools.w;

public final class d
  extends k
{
  private b gMC;
  private com.tencent.mm.ac.e gMF;
  
  public d(String paramString1, String paramString2)
  {
    GMTrace.i(1455993913344L, 10848);
    Object localObject = new b.a();
    ((b.a)localObject).hlX = new iy();
    ((b.a)localObject).hlY = new iz();
    ((b.a)localObject).uri = "/cgi-bin/mmpay-bin/cancelqrpay";
    ((b.a)localObject).hlW = 410;
    ((b.a)localObject).hlZ = 198;
    ((b.a)localObject).hma = 1000000198;
    this.gMC = ((b.a)localObject).DA();
    localObject = (iy)this.gMC.hlU.hmc;
    ((iy)localObject).tEg = paramString1;
    ((iy)localObject).txj = paramString2;
    ((iy)localObject).tEh = h.bww();
    GMTrace.o(1455993913344L, 10848);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ac.e parame1)
  {
    GMTrace.i(1456396566528L, 10851);
    this.gMF = parame1;
    int i = a(parame, this.gMC, this);
    GMTrace.o(1456396566528L, 10851);
    return i;
  }
  
  public final void e(int paramInt1, int paramInt2, String paramString, p paramp)
  {
    GMTrace.i(1456128131072L, 10849);
    w.d("MicroMsg.NetSceneCancelQRPay", "errType:" + paramInt1 + ",errCode:" + paramInt2 + ",errMsg" + paramString);
    this.gMF.a(paramInt1, paramInt2, paramString, this);
    GMTrace.o(1456128131072L, 10849);
  }
  
  public final int getType()
  {
    GMTrace.i(1456262348800L, 10850);
    GMTrace.o(1456262348800L, 10850);
    return 410;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/wallet_core/c/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */