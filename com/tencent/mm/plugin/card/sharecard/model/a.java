package com.tencent.mm.plugin.card.sharecard.model;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ac.b;
import com.tencent.mm.ac.b.a;
import com.tencent.mm.ac.b.b;
import com.tencent.mm.ac.b.c;
import com.tencent.mm.network.j;
import com.tencent.mm.network.p;
import com.tencent.mm.plugin.card.model.al;
import com.tencent.mm.protocal.c.ot;
import com.tencent.mm.protocal.c.ou;
import com.tencent.mm.sdk.platformtools.w;

public final class a
  extends com.tencent.mm.ac.k
  implements j
{
  private String fMv;
  private final b gMC;
  private com.tencent.mm.ac.e gMF;
  public int kpr;
  
  public a(String paramString)
  {
    GMTrace.i(5071953723392L, 37789);
    this.fMv = "";
    b.a locala = new b.a();
    locala.hlX = new ot();
    locala.hlY = new ou();
    locala.uri = "/cgi-bin/mmbiz-bin/card/delsharecard";
    locala.hlW = 1163;
    locala.hlZ = 0;
    locala.hma = 0;
    this.gMC = locala.DA();
    ((ot)this.gMC.hlU.hmc).fMv = paramString;
    this.fMv = paramString;
    GMTrace.o(5071953723392L, 37789);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ac.e parame1)
  {
    GMTrace.i(5072356376576L, 37792);
    this.gMF = parame1;
    int i = a(parame, this.gMC, this);
    GMTrace.o(5072356376576L, 37792);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, p paramp, byte[] paramArrayOfByte)
  {
    GMTrace.i(5072087941120L, 37790);
    w.i("MicroMsg.NetSceneDelShareCard", "onGYNetEnd, cmdType = %d, errType = %d, errCode = %d", new Object[] { Integer.valueOf(1163), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    if ((paramInt2 == 0) && (paramInt3 == 0))
    {
      paramp = (ou)this.gMC.hlV.hmc;
      w.i("MicroMsg.NetSceneDelShareCard", "ret_code:" + paramp.kpr);
      this.kpr = paramp.kpr;
      if (this.kpr == 0) {
        al.ajK().tQ(this.fMv);
      }
    }
    this.gMF.a(paramInt2, paramInt3, paramString, this);
    GMTrace.o(5072087941120L, 37790);
  }
  
  public final int getType()
  {
    GMTrace.i(15361487405056L, 114452);
    GMTrace.o(15361487405056L, 114452);
    return 1163;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/card/sharecard/model/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */