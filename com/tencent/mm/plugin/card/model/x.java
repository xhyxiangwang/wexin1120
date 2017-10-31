package com.tencent.mm.plugin.card.model;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ac.b;
import com.tencent.mm.ac.b.a;
import com.tencent.mm.ac.b.c;
import com.tencent.mm.ac.k;
import com.tencent.mm.network.j;
import com.tencent.mm.network.p;
import com.tencent.mm.protocal.c.xa;
import com.tencent.mm.protocal.c.xb;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import com.tencent.mm.x.ap;
import com.tencent.mm.x.c;

public final class x
  extends k
  implements j
{
  private final b gMC;
  private com.tencent.mm.ac.e gMF;
  private String kpB;
  
  public x()
  {
    GMTrace.i(4903913127936L, 36537);
    this.kpB = "";
    b.a locala = new b.a();
    locala.hlX = new xa();
    locala.hlY = new xb();
    locala.uri = "/cgi-bin/micromsg-bin/getcardconfiginfo";
    locala.hlW = 692;
    locala.hlZ = 0;
    locala.hma = 0;
    this.gMC = locala.DA();
    GMTrace.o(4903913127936L, 36537);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ac.e parame1)
  {
    GMTrace.i(4904181563392L, 36539);
    this.gMF = parame1;
    int i = a(parame, this.gMC, this);
    GMTrace.o(4904181563392L, 36539);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, p paramp, byte[] paramArrayOfByte)
  {
    GMTrace.i(4904315781120L, 36540);
    w.i("MicroMsg.NetSceneGetCardConfigInfo", "onGYNetEnd, errType = " + paramInt2 + " errCode = " + paramInt3);
    if ((paramInt2 == 0) && (paramInt3 == 0))
    {
      this.kpB = ((xb)this.gMC.hlV.hmc).kpq;
      ap.AS();
      c.xi().set(282885, this.kpB);
    }
    this.gMF.a(paramInt2, paramInt3, paramString, this);
    GMTrace.o(4904315781120L, 36540);
  }
  
  public final int getType()
  {
    GMTrace.i(4904047345664L, 36538);
    GMTrace.o(4904047345664L, 36538);
    return 692;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/card/model/x.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */