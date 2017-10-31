package com.tencent.mm.plugin.card.model;

import android.text.TextUtils;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ac.b;
import com.tencent.mm.ac.b.a;
import com.tencent.mm.ac.b.b;
import com.tencent.mm.ac.b.c;
import com.tencent.mm.ac.k;
import com.tencent.mm.network.j;
import com.tencent.mm.network.p;
import com.tencent.mm.protocal.c.ep;
import com.tencent.mm.protocal.c.eq;
import com.tencent.mm.sdk.platformtools.w;
import java.util.Iterator;
import java.util.LinkedList;

public final class r
  extends k
  implements j
{
  private final b gMC;
  private com.tencent.mm.ac.e gMF;
  private int kpu;
  
  public r(LinkedList<String> paramLinkedList)
  {
    GMTrace.i(4921361432576L, 36667);
    this.kpu = 0;
    b.a locala = new b.a();
    locala.hlX = new ep();
    locala.hlY = new eq();
    locala.uri = "/cgi-bin/micromsg-bin/batchdelcarditem";
    locala.hlW = 560;
    locala.hlZ = 0;
    locala.hma = 0;
    this.gMC = locala.DA();
    ((ep)this.gMC.hlU.hmc).tyT = paramLinkedList;
    GMTrace.o(4921361432576L, 36667);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ac.e parame1)
  {
    GMTrace.i(4921629868032L, 36669);
    this.gMF = parame1;
    int i = a(parame, this.gMC, this);
    GMTrace.o(4921629868032L, 36669);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, p paramp, byte[] paramArrayOfByte)
  {
    GMTrace.i(4921764085760L, 36670);
    w.i("MicroMsg.NetSceneBatchDelCardItem", "onGYNetEnd, errType = %d, errCode = %d", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    if ((paramInt2 == 0) && (paramInt3 == 0))
    {
      paramp = ((eq)this.gMC.hlV.hmc).tyU;
      if (paramp != null) {
        break label127;
      }
      paramInt1 = 0;
      w.i("MicroMsg.NetSceneBatchDelCardItem", "onGYNetEnd, resp list count = %d", new Object[] { Integer.valueOf(paramInt1) });
      if ((paramp != null) && (paramp.size() != 0)) {
        break label136;
      }
      w.e("MicroMsg.NetSceneBatchDelCardItem", "onGYNetEnd fail, resp list is null");
    }
    for (;;)
    {
      this.gMF.a(paramInt2, paramInt3, paramString, this);
      GMTrace.o(4921764085760L, 36670);
      return;
      label127:
      paramInt1 = paramp.size();
      break;
      label136:
      this.kpu = 0;
      paramp = paramp.iterator();
      label256:
      while (paramp.hasNext())
      {
        paramArrayOfByte = (String)paramp.next();
        boolean bool;
        if (TextUtils.isEmpty(paramArrayOfByte))
        {
          w.e("MicroMsg.NetSceneBatchDelCardItem", "processDelCardItem fail, id is null");
          bool = false;
        }
        for (;;)
        {
          if (bool) {
            break label256;
          }
          this.kpu += 1;
          break;
          CardInfo localCardInfo = new CardInfo();
          localCardInfo.field_card_id = paramArrayOfByte;
          bool = al.ajC().a(localCardInfo, new String[0]);
          w.i("MicroMsg.NetSceneBatchDelCardItem", "processDelCardItem, delRet = %b", new Object[] { Boolean.valueOf(bool) });
        }
      }
      w.d("MicroMsg.NetSceneBatchDelCardItem", "onGYNetEnd, %d fail items", new Object[] { Integer.valueOf(this.kpu) });
    }
  }
  
  public final int getType()
  {
    GMTrace.i(4921495650304L, 36668);
    GMTrace.o(4921495650304L, 36668);
    return 560;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/card/model/r.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */