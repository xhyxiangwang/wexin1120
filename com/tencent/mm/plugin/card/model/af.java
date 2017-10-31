package com.tencent.mm.plugin.card.model;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ac.b;
import com.tencent.mm.ac.b.a;
import com.tencent.mm.ac.b.b;
import com.tencent.mm.ac.b.c;
import com.tencent.mm.ac.k;
import com.tencent.mm.network.j;
import com.tencent.mm.network.p;
import com.tencent.mm.protocal.c.aey;
import com.tencent.mm.protocal.c.aez;
import com.tencent.mm.sdk.platformtools.w;

public final class af
  extends k
  implements j
{
  public String fMw;
  private final b gMC;
  private com.tencent.mm.ac.e gMF;
  public int kpr;
  public String kps;
  
  public af(String paramString1, String paramString2, int paramInt)
  {
    GMTrace.i(4904449998848L, 36541);
    Object localObject = new b.a();
    ((b.a)localObject).hlX = new aey();
    ((b.a)localObject).hlY = new aez();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/giftcarditem";
    ((b.a)localObject).hlW = 652;
    ((b.a)localObject).hlZ = 0;
    ((b.a)localObject).hma = 0;
    this.gMC = ((b.a)localObject).DA();
    localObject = (aey)this.gMC.hlU.hmc;
    ((aey)localObject).fMv = paramString1;
    ((aey)localObject).uaJ = paramString2;
    ((aey)localObject).uaK = paramInt;
    GMTrace.o(4904449998848L, 36541);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ac.e parame1)
  {
    GMTrace.i(4904718434304L, 36543);
    this.gMF = parame1;
    int i = a(parame, this.gMC, this);
    GMTrace.o(4904718434304L, 36543);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, p paramp, byte[] paramArrayOfByte)
  {
    GMTrace.i(4904852652032L, 36544);
    w.i("MicroMsg.NetSceneGiftCardItem", "onGYNetEnd, errType = " + paramInt2 + " errCode = " + paramInt3);
    if ((paramInt2 == 0) && (paramInt3 == 0))
    {
      paramp = (aez)this.gMC.hlV.hmc;
      if (paramp != null)
      {
        this.fMw = paramp.fMw;
        this.kps = paramp.kps;
        this.kpr = paramp.kpr;
      }
    }
    for (;;)
    {
      this.gMF.a(paramInt2, paramInt3, paramString, this);
      GMTrace.o(4904852652032L, 36544);
      return;
      paramp = (aez)this.gMC.hlV.hmc;
      if (paramp != null)
      {
        this.fMw = paramp.fMw;
        this.kps = paramp.kps;
        this.kpr = paramp.kpr;
      }
    }
  }
  
  public final int getType()
  {
    GMTrace.i(4904584216576L, 36542);
    GMTrace.o(4904584216576L, 36542);
    return 652;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/card/model/af.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */