package com.tencent.mm.plugin.card.model;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ac.b;
import com.tencent.mm.ac.b.a;
import com.tencent.mm.ac.b.b;
import com.tencent.mm.ac.b.c;
import com.tencent.mm.ac.k;
import com.tencent.mm.network.j;
import com.tencent.mm.network.p;
import com.tencent.mm.protocal.c.bfe;
import com.tencent.mm.protocal.c.xg;
import com.tencent.mm.protocal.c.xh;
import com.tencent.mm.sdk.platformtools.w;

public final class aa
  extends k
  implements j
{
  private final b gMC;
  private com.tencent.mm.ac.e gMF;
  public String kpq;
  
  public aa(String paramString1, int paramInt1, String paramString2, String paramString3, String paramString4, String paramString5, int paramInt2, String paramString6, bfe parambfe)
  {
    GMTrace.i(4910489796608L, 36586);
    Object localObject = new b.a();
    ((b.a)localObject).hlX = new xg();
    ((b.a)localObject).hlY = new xh();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/getcarditeminfo";
    ((b.a)localObject).hlW = 645;
    ((b.a)localObject).hlZ = 0;
    ((b.a)localObject).hma = 0;
    this.gMC = ((b.a)localObject).DA();
    localObject = (xg)this.gMC.hlU.hmc;
    ((xg)localObject).fMv = paramString1;
    ((xg)localObject).fMx = paramInt1;
    ((xg)localObject).koB = paramString2;
    ((xg)localObject).fMw = paramString3;
    ((xg)localObject).tta = paramString4;
    ((xg)localObject).tsZ = paramString5;
    ((xg)localObject).ttb = paramInt2;
    ((xg)localObject).tUq = paramString6;
    ((xg)localObject).ttd = parambfe;
    GMTrace.o(4910489796608L, 36586);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ac.e parame1)
  {
    GMTrace.i(4910758232064L, 36588);
    this.gMF = parame1;
    int i = a(parame, this.gMC, this);
    GMTrace.o(4910758232064L, 36588);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, p paramp, byte[] paramArrayOfByte)
  {
    GMTrace.i(4910892449792L, 36589);
    w.i("MicroMsg.NetSceneGetCardItemInfo", "onGYNetEnd, errType = %d, errCode = %d", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    if ((paramInt2 == 0) && (paramInt3 == 0)) {
      this.kpq = ((xh)this.gMC.hlV.hmc).kpq;
    }
    this.gMF.a(paramInt2, paramInt3, paramString, this);
    GMTrace.o(4910892449792L, 36589);
  }
  
  public final int getType()
  {
    GMTrace.i(4910624014336L, 36587);
    GMTrace.o(4910624014336L, 36587);
    return 645;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/card/model/aa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */