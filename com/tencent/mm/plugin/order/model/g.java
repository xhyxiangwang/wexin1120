package com.tencent.mm.plugin.order.model;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ac.b;
import com.tencent.mm.ac.b.a;
import com.tencent.mm.ac.b.b;
import com.tencent.mm.network.p;
import com.tencent.mm.plugin.wallet_core.model.h;
import com.tencent.mm.protocal.c.aqw;
import com.tencent.mm.protocal.c.aqx;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.wallet_core.c.k;

public final class g
  extends k
{
  private b gMC;
  private com.tencent.mm.ac.e gMF;
  
  public g(String paramString1, String paramString2, int paramInt)
  {
    GMTrace.i(6622034264064L, 49338);
    Object localObject = new b.a();
    ((b.a)localObject).hlX = new aqw();
    ((b.a)localObject).hlY = new aqx();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/paydeluserroll";
    ((b.a)localObject).hlW = 389;
    ((b.a)localObject).hlZ = 187;
    ((b.a)localObject).hma = 1000000187;
    this.gMC = ((b.a)localObject).DA();
    localObject = (aqw)this.gMC.hlU.hmc;
    ((aqw)localObject).umY = 1;
    if (!bg.mZ(paramString1)) {
      ((aqw)localObject).orR = paramString1;
    }
    if (!bg.mZ(paramString2)) {
      ((aqw)localObject).osk = paramString2;
    }
    ((aqw)localObject).tEh = h.bww();
    GMTrace.o(6622034264064L, 49338);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ac.e parame1)
  {
    GMTrace.i(6622705352704L, 49343);
    this.gMF = parame1;
    int i = a(parame, this.gMC, this);
    GMTrace.o(6622705352704L, 49343);
    return i;
  }
  
  public final int aVi()
  {
    GMTrace.i(6622302699520L, 49340);
    int i = ((aqw)this.gMC.hlU.hmc).umY;
    GMTrace.o(6622302699520L, 49340);
    return i;
  }
  
  public final String aVj()
  {
    GMTrace.i(6622436917248L, 49341);
    String str = ((aqw)this.gMC.hlU.hmc).orR;
    GMTrace.o(6622436917248L, 49341);
    return str;
  }
  
  public final void e(int paramInt1, int paramInt2, String paramString, p paramp)
  {
    GMTrace.i(6622168481792L, 49339);
    w.d("MicroMsg.NetScenePayDelUserRoll", "errType:" + paramInt1 + ",errCode:" + paramInt2 + ",errMsg" + paramString);
    this.gMF.a(paramInt1, paramInt2, paramString, this);
    GMTrace.o(6622168481792L, 49339);
  }
  
  public final int getType()
  {
    GMTrace.i(6622571134976L, 49342);
    GMTrace.o(6622571134976L, 49342);
    return 389;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/order/model/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */