package com.tencent.mm.plugin.card.model;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ac.b;
import com.tencent.mm.ac.b.a;
import com.tencent.mm.ac.b.b;
import com.tencent.mm.ac.b.c;
import com.tencent.mm.ac.k;
import com.tencent.mm.network.j;
import com.tencent.mm.network.p;
import com.tencent.mm.protocal.c.xe;
import com.tencent.mm.protocal.c.xf;
import com.tencent.mm.sdk.platformtools.w;

public final class z
  extends k
  implements j
{
  private final b gMC;
  private com.tencent.mm.ac.e gMF;
  public CardGiftInfo kpt;
  
  public z(int paramInt, String paramString)
  {
    GMTrace.i(4913308368896L, 36607);
    Object localObject = new b.a();
    ((b.a)localObject).hlX = new xe();
    ((b.a)localObject).hlY = new xf();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/getcardgiftinfo";
    ((b.a)localObject).hlW = 1165;
    ((b.a)localObject).hlZ = 0;
    ((b.a)localObject).hma = 0;
    this.gMC = ((b.a)localObject).DA();
    localObject = (xe)this.gMC.hlU.hmc;
    ((xe)localObject).ttf = paramInt;
    ((xe)localObject).ttg = paramString;
    GMTrace.o(4913308368896L, 36607);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ac.e parame1)
  {
    GMTrace.i(4913711022080L, 36610);
    this.gMF = parame1;
    int i = a(parame, this.gMC, this);
    GMTrace.o(4913711022080L, 36610);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, p paramp, byte[] paramArrayOfByte)
  {
    GMTrace.i(4913442586624L, 36608);
    w.i("MicroMsg.NetSceneGetCardGiftInfo", "onGYNetEnd, errType = %d, errCode = %d ,errMsg:%s", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    if ((paramInt2 == 0) && (paramInt3 == 0))
    {
      this.kpt = CardGiftInfo.a((xf)this.gMC.hlV.hmc);
      w.d("MicroMsg.NetSceneGetCardGiftInfo", "%s", new Object[] { this.kpt.toString() });
    }
    this.gMF.a(paramInt2, paramInt3, paramString, this);
    GMTrace.o(4913442586624L, 36608);
  }
  
  public final int getType()
  {
    GMTrace.i(4913576804352L, 36609);
    GMTrace.o(4913576804352L, 36609);
    return 1165;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/card/model/z.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */