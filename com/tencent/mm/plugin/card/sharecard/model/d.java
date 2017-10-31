package com.tencent.mm.plugin.card.sharecard.model;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ac.b;
import com.tencent.mm.ac.b.a;
import com.tencent.mm.ac.b.b;
import com.tencent.mm.ac.b.c;
import com.tencent.mm.ac.k;
import com.tencent.mm.network.j;
import com.tencent.mm.network.p;
import com.tencent.mm.protocal.c.ach;
import com.tencent.mm.protocal.c.aci;
import com.tencent.mm.sdk.platformtools.w;

public final class d
  extends k
  implements j
{
  private final b gMC;
  private com.tencent.mm.ac.e gMF;
  public String kpq;
  public int kpr;
  public String kps;
  
  public d(String paramString1, String paramString2, String paramString3)
  {
    GMTrace.i(5060008345600L, 37700);
    Object localObject = new b.a();
    ((b.a)localObject).hlX = new ach();
    ((b.a)localObject).hlY = new aci();
    ((b.a)localObject).uri = "/cgi-bin/mmbiz-bin/card/getsharecardconsumedinfo";
    ((b.a)localObject).hlW = 910;
    ((b.a)localObject).hlZ = 0;
    ((b.a)localObject).hma = 0;
    this.gMC = ((b.a)localObject).DA();
    localObject = (ach)this.gMC.hlU.hmc;
    ((ach)localObject).fMv = paramString1;
    ((ach)localObject).scene = 20;
    ((ach)localObject).knp = paramString2;
    ((ach)localObject).code = paramString3;
    GMTrace.o(5060008345600L, 37700);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ac.e parame1)
  {
    GMTrace.i(5060410998784L, 37703);
    this.gMF = parame1;
    int i = a(parame, this.gMC, this);
    GMTrace.o(5060410998784L, 37703);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, p paramp, byte[] paramArrayOfByte)
  {
    GMTrace.i(5060142563328L, 37701);
    w.i("MicroMsg.NetSceneGetShareCardConsumedInfo", "onGYNetEnd, cmdType = %d, errType = %d, errCode = %d", new Object[] { Integer.valueOf(910), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    if ((paramInt2 == 0) && (paramInt3 == 0))
    {
      paramp = (aci)this.gMC.hlV.hmc;
      w.v("MicroMsg.NetSceneGetShareCardConsumedInfo", "json:" + paramp.kpq);
      this.kpq = paramp.kpq;
      this.kps = paramp.kps;
    }
    this.gMF.a(paramInt2, paramInt3, paramString, this);
    GMTrace.o(5060142563328L, 37701);
  }
  
  public final int getType()
  {
    GMTrace.i(15360950534144L, 114448);
    GMTrace.o(15360950534144L, 114448);
    return 910;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/card/sharecard/model/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */