package com.tencent.mm.plugin.card.model;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ac.b;
import com.tencent.mm.ac.b.a;
import com.tencent.mm.ac.b.b;
import com.tencent.mm.ac.k;
import com.tencent.mm.network.j;
import com.tencent.mm.network.p;
import com.tencent.mm.protocal.c.awu;
import com.tencent.mm.protocal.c.awv;
import com.tencent.mm.sdk.platformtools.w;

public final class u
  extends k
  implements j
{
  private final b gMC;
  private com.tencent.mm.ac.e gMF;
  
  public u(float paramFloat1, float paramFloat2, String paramString1, String paramString2, int paramInt)
  {
    GMTrace.i(4903242039296L, 36532);
    Object localObject = new b.a();
    ((b.a)localObject).hlX = new awu();
    ((b.a)localObject).hlY = new awv();
    ((b.a)localObject).uri = "/cgi-bin/mmbiz-bin/card/reportlocation";
    ((b.a)localObject).hlW = 1253;
    ((b.a)localObject).hlZ = 0;
    ((b.a)localObject).hma = 0;
    this.gMC = ((b.a)localObject).DA();
    localObject = (awu)this.gMC.hlU.hmc;
    ((awu)localObject).latitude = paramFloat1;
    ((awu)localObject).longitude = paramFloat2;
    ((awu)localObject).fMv = paramString1;
    ((awu)localObject).knp = paramString2;
    ((awu)localObject).urp = paramInt;
    GMTrace.o(4903242039296L, 36532);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ac.e parame1)
  {
    GMTrace.i(4903510474752L, 36534);
    this.gMF = parame1;
    int i = a(parame, this.gMC, this);
    GMTrace.o(4903510474752L, 36534);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, p paramp, byte[] paramArrayOfByte)
  {
    GMTrace.i(4903644692480L, 36535);
    w.i("MicroMsg.NetSceneCardReportLocation", "onGYNetEnd, errType = " + paramInt2 + " errCode = " + paramInt3);
    this.gMF.a(paramInt2, paramInt3, paramString, this);
    GMTrace.o(4903644692480L, 36535);
  }
  
  public final int getType()
  {
    GMTrace.i(4903376257024L, 36533);
    GMTrace.o(4903376257024L, 36533);
    return 1253;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/card/model/u.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */