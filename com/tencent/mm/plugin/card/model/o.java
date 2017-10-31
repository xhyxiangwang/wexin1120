package com.tencent.mm.plugin.card.model;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ac.b;
import com.tencent.mm.ac.b.a;
import com.tencent.mm.ac.b.b;
import com.tencent.mm.ac.b.c;
import com.tencent.mm.ac.k;
import com.tencent.mm.network.j;
import com.tencent.mm.network.p;
import com.tencent.mm.protocal.c.ah;
import com.tencent.mm.protocal.c.ai;
import com.tencent.mm.protocal.c.bfe;
import com.tencent.mm.sdk.platformtools.w;

public final class o
  extends k
  implements j
{
  private final b gMC;
  private com.tencent.mm.ac.e gMF;
  public String kpq;
  public int kpr;
  public String kps;
  
  public o(String paramString1, int paramInt1, String paramString2, String paramString3, String paramString4, String paramString5, int paramInt2, int paramInt3, bfe parambfe)
  {
    GMTrace.i(4913845239808L, 36611);
    Object localObject = new b.a();
    ((b.a)localObject).hlX = new ah();
    ((b.a)localObject).hlY = new ai();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/acceptcarditem";
    ((b.a)localObject).hlW = 651;
    ((b.a)localObject).hlZ = 0;
    ((b.a)localObject).hma = 0;
    this.gMC = ((b.a)localObject).DA();
    localObject = (ah)this.gMC.hlU.hmc;
    ((ah)localObject).fMv = paramString1;
    ((ah)localObject).koB = paramString2;
    ((ah)localObject).fMx = paramInt1;
    ((ah)localObject).fMw = paramString3;
    ((ah)localObject).tta = paramString4;
    ((ah)localObject).tsZ = paramString5;
    ((ah)localObject).ttb = paramInt2;
    ((ah)localObject).ttc = paramInt3;
    ((ah)localObject).ttd = parambfe;
    GMTrace.o(4913845239808L, 36611);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ac.e parame1)
  {
    GMTrace.i(4914113675264L, 36613);
    this.gMF = parame1;
    int i = a(parame, this.gMC, this);
    GMTrace.o(4914113675264L, 36613);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, p paramp, byte[] paramArrayOfByte)
  {
    GMTrace.i(4914247892992L, 36614);
    w.i("MicroMsg.NetSceneAcceptCardItem", "onGYNetEnd, errType = " + paramInt2 + " errCode = " + paramInt3);
    if ((paramInt2 == 0) && (paramInt3 == 0))
    {
      paramp = (ai)this.gMC.hlV.hmc;
      if (paramp != null)
      {
        this.kpq = paramp.kpq;
        this.kpr = paramp.kpr;
        this.kps = paramp.kps;
      }
    }
    for (;;)
    {
      this.gMF.a(paramInt2, paramInt3, paramString, this);
      GMTrace.o(4914247892992L, 36614);
      return;
      paramp = (ai)this.gMC.hlV.hmc;
      if (paramp != null)
      {
        this.kpq = paramp.kpq;
        this.kpr = paramp.kpr;
        this.kps = paramp.kps;
      }
    }
  }
  
  public final int getType()
  {
    GMTrace.i(4913979457536L, 36612);
    GMTrace.o(4913979457536L, 36612);
    return 651;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/card/model/o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */