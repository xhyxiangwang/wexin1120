package com.tencent.mm.plugin.card.sharecard.model;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ac.b.a;
import com.tencent.mm.ac.b.b;
import com.tencent.mm.ac.b.c;
import com.tencent.mm.ac.k;
import com.tencent.mm.network.j;
import com.tencent.mm.network.p;
import com.tencent.mm.protocal.c.xm;
import com.tencent.mm.protocal.c.xn;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import com.tencent.mm.storage.w.a;
import com.tencent.mm.x.ap;
import com.tencent.mm.x.c;

public final class b
  extends k
  implements j
{
  private final com.tencent.mm.ac.b gMC;
  private com.tencent.mm.ac.e gMF;
  public String kpq;
  public String kqI;
  
  public b(double paramDouble1, double paramDouble2, String paramString)
  {
    GMTrace.i(5059471474688L, 37696);
    this.kqI = "";
    Object localObject = new b.a();
    ((b.a)localObject).hlX = new xm();
    ((b.a)localObject).hlY = new xn();
    ((b.a)localObject).uri = "/cgi-bin/mmbiz-bin/card/getcardshomepage";
    ((b.a)localObject).hlW = 1164;
    ((b.a)localObject).hlZ = 0;
    ((b.a)localObject).hma = 0;
    this.gMC = ((b.a)localObject).DA();
    localObject = (xm)this.gMC.hlU.hmc;
    ((xm)localObject).latitude = paramDouble1;
    ((xm)localObject).longitude = paramDouble2;
    ((xm)localObject).kqI = paramString;
    ap.AS();
    ((xm)localObject).tUs = ((String)c.xi().get(w.a.uVq, ""));
    w.d("MicroMsg.NetSceneGetCardsHomePageLayout", "red_buff:" + ((xm)localObject).tUs);
    GMTrace.o(5059471474688L, 37696);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ac.e parame1)
  {
    GMTrace.i(5059874127872L, 37699);
    this.gMF = parame1;
    int i = a(parame, this.gMC, this);
    GMTrace.o(5059874127872L, 37699);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, p paramp, byte[] paramArrayOfByte)
  {
    GMTrace.i(5059605692416L, 37697);
    w.i("MicroMsg.NetSceneGetCardsHomePageLayout", "onGYNetEnd, cmdType = %d, errType = %d, errCode = %d", new Object[] { Integer.valueOf(1164), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    if ((paramInt2 == 0) && (paramInt3 == 0))
    {
      paramp = (xn)this.gMC.hlV.hmc;
      w.v("MicroMsg.NetSceneGetCardsHomePageLayout", "json:" + paramp.kpq);
      this.kpq = paramp.kpq;
      this.kqI = paramp.kqI;
    }
    this.gMF.a(paramInt2, paramInt3, paramString, this);
    GMTrace.o(5059605692416L, 37697);
  }
  
  public final int getType()
  {
    GMTrace.i(15360816316416L, 114447);
    GMTrace.o(15360816316416L, 114447);
    return 1164;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/card/sharecard/model/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */