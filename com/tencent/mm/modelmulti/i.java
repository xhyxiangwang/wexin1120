package com.tencent.mm.modelmulti;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ac.b;
import com.tencent.mm.ac.b.a;
import com.tencent.mm.ac.b.b;
import com.tencent.mm.ac.k;
import com.tencent.mm.network.j;
import com.tencent.mm.network.p;
import com.tencent.mm.protocal.c.asn;
import com.tencent.mm.protocal.c.aso;
import com.tencent.mm.protocal.c.bib;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.j.a;

public final class i
  extends k
  implements j
{
  private b gMC;
  private com.tencent.mm.ac.e gMF;
  private int hEx;
  
  public i(int paramInt, String paramString)
  {
    GMTrace.i(411511554048L, 3066);
    this.hEx = 0;
    Object localObject = new b.a();
    ((b.a)localObject).hlX = new asn();
    ((b.a)localObject).hlY = new aso();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/postinvitefriendsmsg";
    ((b.a)localObject).hlW = 1804;
    this.gMC = ((b.a)localObject).DA();
    asn localasn = (asn)this.gMC.hlU.hmc;
    localasn.tWt = paramInt;
    localasn.tWv = paramString;
    if ((paramInt & 0x10) > 0)
    {
      a locala = new a();
      localObject = new bib();
      if (locala.wPt == null) {
        break label191;
      }
      paramString = (String)localObject;
      if (!bg.mZ(locala.wPt.token))
      {
        ((bib)localObject).uzi = locala.wPt.token;
        ((bib)localObject).uzj = locala.wPt.uih;
      }
    }
    label191:
    for (paramString = (String)localObject;; paramString = null)
    {
      localasn.uob = paramString;
      this.hEx = paramInt;
      GMTrace.o(411511554048L, 3066);
      return;
    }
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ac.e parame1)
  {
    GMTrace.i(411914207232L, 3069);
    w.d("MicroMsg.NetScenePostInviteFriendsMsg", "doScene");
    this.gMF = parame1;
    int i = a(parame, this.gMC, this);
    GMTrace.o(411914207232L, 3069);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, p paramp, byte[] paramArrayOfByte)
  {
    GMTrace.i(411645771776L, 3067);
    w.d("MicroMsg.NetScenePostInviteFriendsMsg", "onGYNetEnd errType:" + paramInt2 + " errCode:" + paramInt3);
    if ((paramInt2 != 0) || (paramInt3 != 0))
    {
      this.gMF.a(paramInt2, paramInt3, paramString, this);
      GMTrace.o(411645771776L, 3067);
      return;
    }
    this.gMF.a(paramInt2, paramInt3, paramString, this);
    GMTrace.o(411645771776L, 3067);
  }
  
  public final int getType()
  {
    GMTrace.i(411779989504L, 3068);
    GMTrace.o(411779989504L, 3068);
    return 1804;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/modelmulti/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */