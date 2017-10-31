package com.tencent.mm.plugin.card.sharecard.model;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ac.b;
import com.tencent.mm.ac.b.a;
import com.tencent.mm.ac.b.b;
import com.tencent.mm.ac.b.c;
import com.tencent.mm.ac.k;
import com.tencent.mm.network.j;
import com.tencent.mm.network.p;
import com.tencent.mm.protocal.c.acl;
import com.tencent.mm.protocal.c.acm;
import com.tencent.mm.sdk.platformtools.w;

public final class c
  extends k
  implements j
{
  private final b gMC;
  private com.tencent.mm.ac.e gMF;
  public String kpq;
  
  public c(String paramString)
  {
    GMTrace.i(5058934603776L, 37692);
    b.a locala = new b.a();
    locala.hlX = new acl();
    locala.hlY = new acm();
    locala.uri = "/cgi-bin/micromsg-bin/getsharecard";
    locala.hlW = 904;
    locala.hlZ = 0;
    locala.hma = 0;
    this.gMC = locala.DA();
    ((acl)this.gMC.hlU.hmc).fMv = paramString;
    GMTrace.o(5058934603776L, 37692);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ac.e parame1)
  {
    GMTrace.i(5059337256960L, 37695);
    this.gMF = parame1;
    int i = a(parame, this.gMC, this);
    GMTrace.o(5059337256960L, 37695);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, p paramp, byte[] paramArrayOfByte)
  {
    GMTrace.i(5059068821504L, 37693);
    w.i("MicroMsg.NetSceneGetShareCard", "onGYNetEnd, cmdType = %d, errType = %d, errCode = %d", new Object[] { Integer.valueOf(904), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    if ((paramInt2 == 0) && (paramInt3 == 0))
    {
      paramp = (acm)this.gMC.hlV.hmc;
      w.v("MicroMsg.NetSceneGetShareCard", "json:" + paramp.kpq);
      this.kpq = paramp.kpq;
    }
    this.gMF.a(paramInt2, paramInt3, paramString, this);
    GMTrace.o(5059068821504L, 37693);
  }
  
  public final int getType()
  {
    GMTrace.i(15360682098688L, 114446);
    GMTrace.o(15360682098688L, 114446);
    return 904;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/card/sharecard/model/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */