package com.tencent.mm.plugin.card.model;

import android.text.TextUtils;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ac.b.a;
import com.tencent.mm.ac.b.c;
import com.tencent.mm.ac.k;
import com.tencent.mm.network.j;
import com.tencent.mm.network.p;
import com.tencent.mm.plugin.card.b.l;
import com.tencent.mm.plugin.card.sharecard.a.a;
import com.tencent.mm.protocal.c.xc;
import com.tencent.mm.protocal.c.xd;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import com.tencent.mm.storage.w.a;
import com.tencent.mm.x.ap;
import com.tencent.mm.x.c;

public final class y
  extends k
  implements j
{
  private final com.tencent.mm.ac.b gMC;
  private com.tencent.mm.ac.e gMF;
  
  public y()
  {
    GMTrace.i(4915321634816L, 36622);
    b.a locala = new b.a();
    locala.hlX = new xc();
    locala.hlY = new xd();
    locala.uri = "/cgi-bin/micromsg-bin/getcardcount";
    locala.hlW = 663;
    locala.hlZ = 0;
    locala.hma = 0;
    this.gMC = locala.DA();
    GMTrace.o(4915321634816L, 36622);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ac.e parame1)
  {
    GMTrace.i(4915590070272L, 36624);
    this.gMF = parame1;
    int i = a(parame, this.gMC, this);
    GMTrace.o(4915590070272L, 36624);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, p paramp, byte[] paramArrayOfByte)
  {
    GMTrace.i(4915724288000L, 36625);
    w.i("MicroMsg.NetSceneGetCardCount", "onGYNetEnd, errType = " + paramInt2 + " errCode = " + paramInt3);
    if ((paramInt2 == 0) && (paramInt3 == 0))
    {
      paramp = (xd)this.gMC.hlV.hmc;
      w.i("MicroMsg.NetSceneGetCardCount", "has_card_item:" + paramp.tUo + " has_share_card:" + paramp.tUp);
      if (paramp.tUo > 0)
      {
        l.amj();
        ap.AS();
        if (TextUtils.isEmpty((String)c.xi().get(w.a.uVn, null)))
        {
          al.ajB();
          com.tencent.mm.plugin.card.a.b.lt(1);
        }
      }
      if (paramp.tUp > 0)
      {
        l.aml();
        ap.AS();
        paramp = (Long)c.xi().get(w.a.uVx, Long.valueOf(0L));
        if ((paramp != null) && (paramp.longValue() == 0L)) {
          al.ajJ().ajT();
        }
      }
    }
    ap.AS();
    c.xi().set(282882, Integer.valueOf((int)(System.currentTimeMillis() / 1000L)));
    this.gMF.a(paramInt2, paramInt3, paramString, this);
    GMTrace.o(4915724288000L, 36625);
  }
  
  public final int getType()
  {
    GMTrace.i(4915455852544L, 36623);
    GMTrace.o(4915455852544L, 36623);
    return 663;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/card/model/y.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */