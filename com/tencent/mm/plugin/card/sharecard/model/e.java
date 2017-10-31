package com.tencent.mm.plugin.card.sharecard.model;

import android.text.TextUtils;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mars.smc.IDKey;
import com.tencent.mm.ac.b.a;
import com.tencent.mm.ac.b.b;
import com.tencent.mm.ac.b.c;
import com.tencent.mm.ac.k;
import com.tencent.mm.network.j;
import com.tencent.mm.network.p;
import com.tencent.mm.plugin.card.b.f;
import com.tencent.mm.plugin.card.b.l;
import com.tencent.mm.protocal.c.acj;
import com.tencent.mm.protocal.c.ack;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.x.ap;
import com.tencent.mm.x.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public final class e
  extends k
  implements j
{
  private final com.tencent.mm.ac.b gMC;
  private com.tencent.mm.ac.e gMF;
  public LinkedList<String> kpv;
  public LinkedList<String> kpw;
  
  public e(LinkedList<String> paramLinkedList)
  {
    GMTrace.i(5069135151104L, 37768);
    this.kpw = new LinkedList();
    this.kpv = paramLinkedList;
    b.a locala = new b.a();
    locala.hlX = new acj();
    locala.hlY = new ack();
    locala.uri = "/cgi-bin/micromsg-bin/getsharecardlist";
    locala.hlW = 903;
    locala.hlZ = 0;
    locala.hma = 0;
    this.gMC = locala.DA();
    ((acj)this.gMC.hlU.hmc).tyT = paramLinkedList;
    w.i("MicroMsg.NetSceneGetShareCardList", "card_ids length is " + paramLinkedList.size());
    GMTrace.o(5069135151104L, 37768);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ac.e parame1)
  {
    GMTrace.i(5069537804288L, 37771);
    this.gMF = parame1;
    int i = a(parame, this.gMC, this);
    GMTrace.o(5069537804288L, 37771);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, p paramp, byte[] paramArrayOfByte)
  {
    GMTrace.i(5069269368832L, 37769);
    w.i("MicroMsg.NetSceneGetShareCardList", "onGYNetEnd, cmdType = %d, errType = %d, errCode = %d", new Object[] { Integer.valueOf(903), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    if ((paramInt2 != 0) || (paramInt3 != 0))
    {
      w.e("MicroMsg.NetSceneGetShareCardList", "onGYNetEnd, batch get fail, errType = %d, errCode = %d", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
      this.gMF.a(paramInt2, paramInt3, paramString, this);
      GMTrace.o(5069269368832L, 37769);
      return;
    }
    paramp = (ack)this.gMC.hlV.hmc;
    w.v("MicroMsg.NetSceneGetShareCardList", "json:" + paramp.kpq);
    paramp = paramp.kpq;
    if (TextUtils.isEmpty(paramp))
    {
      w.e("MicroMsg.NetSceneGetShareCardList", "onGYNetEnd fail, resp json_ret is null");
      this.gMF.a(4, -1, null, this);
      GMTrace.o(5069269368832L, 37769);
      return;
    }
    long l1 = System.currentTimeMillis();
    paramp = f.uc(paramp);
    if (paramp != null)
    {
      if (this.kpv != null) {
        this.kpw.addAll(this.kpv);
      }
      long l2 = System.currentTimeMillis();
      ap.AS();
      long l3 = c.yI().cA(Thread.currentThread().getId());
      paramArrayOfByte = paramp.iterator();
      paramInt1 = 0;
      int i = 0;
      Object localObject;
      while (paramArrayOfByte.hasNext())
      {
        localObject = (ShareCardInfo)paramArrayOfByte.next();
        int j = paramInt1 + 1;
        if (!l.a((ShareCardInfo)localObject))
        {
          i += 1;
          this.kpw.remove(((ShareCardInfo)localObject).field_card_id);
          paramInt1 = j;
        }
        else
        {
          w.i("MicroMsg.NetSceneGetShareCardList", "onGYNetEnd update share card count");
          com.tencent.mm.plugin.card.sharecard.a.b.O(ab.getContext(), ((ShareCardInfo)localObject).field_card_tp_id);
          paramInt1 = j;
          if (((ShareCardInfo)localObject).field_status != 0)
          {
            com.tencent.mm.plugin.card.sharecard.a.b.bw(((ShareCardInfo)localObject).field_card_id, ((ShareCardInfo)localObject).field_card_tp_id);
            paramInt1 = j;
          }
        }
      }
      ap.AS();
      c.yI().aJ(l3);
      w.i("MicroMsg.NetSceneGetShareCardList", "onGYNetEnd do transaction use time %s", new Object[] { Long.valueOf(System.currentTimeMillis() - l2) });
      w.e("MicroMsg.NetSceneGetShareCardList", "onGYNetEnd, deal CardObject %d fail of %d", new Object[] { Integer.valueOf(i), Integer.valueOf(paramInt1) });
      l.aml();
      if (paramp.size() > 0)
      {
        paramInt1 = (int)(System.currentTimeMillis() - l1);
        paramArrayOfByte = new ArrayList();
        localObject = new IDKey();
        ((IDKey)localObject).SetID(281);
        ((IDKey)localObject).SetKey(17);
        ((IDKey)localObject).SetValue(1L);
        IDKey localIDKey1 = new IDKey();
        localIDKey1.SetID(281);
        localIDKey1.SetKey(18);
        localIDKey1.SetValue(paramInt1);
        IDKey localIDKey2 = new IDKey();
        localIDKey2.SetID(281);
        localIDKey2.SetKey(19);
        localIDKey2.SetValue(paramp.size());
        IDKey localIDKey3 = new IDKey();
        localIDKey3.SetID(281);
        localIDKey3.SetKey(21);
        localIDKey3.SetValue(paramInt1 / paramp.size());
        paramArrayOfByte.add(localObject);
        paramArrayOfByte.add(localIDKey1);
        paramArrayOfByte.add(localIDKey2);
        paramArrayOfByte.add(localIDKey3);
        com.tencent.mm.plugin.report.service.g.paX.b(paramArrayOfByte, true);
      }
    }
    this.gMF.a(paramInt2, paramInt3, paramString, this);
    GMTrace.o(5069269368832L, 37769);
  }
  
  public final int getType()
  {
    GMTrace.i(15361218969600L, 114450);
    GMTrace.o(15361218969600L, 114450);
    return 903;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/card/sharecard/model/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */