package com.tencent.mm.wallet_core.c;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ac.b.a;
import com.tencent.mm.ac.b.b;
import com.tencent.mm.network.p;
import com.tencent.mm.protocal.c.arl;
import com.tencent.mm.protocal.c.arm;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;

public final class h
  extends k
{
  private com.tencent.mm.ac.b gMC;
  private com.tencent.mm.ac.e gMF;
  
  public h(String paramString)
  {
    this(paramString, null, null, -1, -1, -1);
    GMTrace.i(1454651736064L, 10838);
    GMTrace.o(1454651736064L, 10838);
  }
  
  public h(String paramString1, String paramString2, String paramString3, int paramInt1, int paramInt2, int paramInt3)
  {
    GMTrace.i(16670244470784L, 124203);
    Object localObject = new b.a();
    ((b.a)localObject).hlX = new arl();
    ((b.a)localObject).hlY = new arm();
    ((b.a)localObject).uri = "/cgi-bin/mmpay-bin/paysubscribe";
    ((b.a)localObject).hlW = 421;
    ((b.a)localObject).hlZ = 0;
    ((b.a)localObject).hma = 0;
    this.gMC = ((b.a)localObject).DA();
    localObject = (arl)this.gMC.hlU.hmc;
    ((arl)localObject).uny = paramString1;
    ((arl)localObject).tEh = com.tencent.mm.plugin.wallet_core.model.h.bww();
    ((arl)localObject).unz = paramString3;
    if (!bg.mZ(paramString2)) {
      ((arl)localObject).unA = new com.tencent.mm.bl.b(paramString2.getBytes());
    }
    if (paramInt1 >= 0) {
      ((arl)localObject).unB = paramInt1;
    }
    if (paramInt2 >= 0) {
      ((arl)localObject).tsr = paramInt2;
    }
    if (paramInt3 >= 0) {
      ((arl)localObject).unC = paramInt3;
    }
    GMTrace.o(16670244470784L, 124203);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ac.e parame1)
  {
    GMTrace.i(1454920171520L, 10840);
    this.gMF = parame1;
    int i = a(parame, this.gMC, this);
    GMTrace.o(1454920171520L, 10840);
    return i;
  }
  
  public final void e(int paramInt1, int paramInt2, String paramString, p paramp)
  {
    GMTrace.i(1455054389248L, 10841);
    w.d("MicroMsg.NetScenePaySubscribe", "errType:" + paramInt1 + ",errCode:" + paramInt2 + ",errMsg" + paramString);
    this.gMF.a(paramInt1, paramInt2, paramString, this);
    GMTrace.o(1455054389248L, 10841);
  }
  
  public final int getType()
  {
    GMTrace.i(1455188606976L, 10842);
    GMTrace.o(1455188606976L, 10842);
    return 421;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/wallet_core/c/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */