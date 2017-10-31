package com.tencent.mm.plugin.card.model;

import android.text.TextUtils;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mars.smc.IDKey;
import com.tencent.mm.ac.b;
import com.tencent.mm.ac.b.a;
import com.tencent.mm.ac.b.b;
import com.tencent.mm.ac.b.c;
import com.tencent.mm.ac.k;
import com.tencent.mm.network.j;
import com.tencent.mm.network.p;
import com.tencent.mm.plugin.card.b.f;
import com.tencent.mm.plugin.card.b.l;
import com.tencent.mm.protocal.c.ez;
import com.tencent.mm.protocal.c.fa;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.x.ap;
import com.tencent.mm.x.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public final class s
  extends k
  implements j
{
  private final b gMC;
  private com.tencent.mm.ac.e gMF;
  private LinkedList<aj> kpv;
  public LinkedList<aj> kpw;
  
  public s(LinkedList<aj> paramLinkedList)
  {
    GMTrace.i(4911563538432L, 36594);
    this.kpw = new LinkedList();
    this.kpv = paramLinkedList;
    b.a locala = new b.a();
    locala.hlX = new ez();
    locala.hlY = new fa();
    locala.uri = "/cgi-bin/micromsg-bin/batchgetcarditem";
    locala.hlW = 559;
    locala.hlZ = 0;
    locala.hma = 0;
    this.gMC = locala.DA();
    ((ez)this.gMC.hlU.hmc).tyT = E(paramLinkedList);
    GMTrace.o(4911563538432L, 36594);
  }
  
  private static LinkedList<String> E(LinkedList<aj> paramLinkedList)
  {
    GMTrace.i(4912100409344L, 36598);
    LinkedList localLinkedList = new LinkedList();
    if ((paramLinkedList == null) || (paramLinkedList.size() == 0))
    {
      GMTrace.o(4912100409344L, 36598);
      return localLinkedList;
    }
    paramLinkedList = paramLinkedList.iterator();
    while (paramLinkedList.hasNext())
    {
      aj localaj = (aj)paramLinkedList.next();
      if (localaj != null) {
        localLinkedList.add(localaj.field_cardUserId);
      }
    }
    GMTrace.o(4912100409344L, 36598);
    return localLinkedList;
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ac.e parame1)
  {
    GMTrace.i(4911831973888L, 36596);
    this.gMF = parame1;
    int i = a(parame, this.gMC, this);
    GMTrace.o(4911831973888L, 36596);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, p paramp, byte[] paramArrayOfByte)
  {
    GMTrace.i(4911966191616L, 36597);
    w.d("MicroMsg.NetSceneBatchGetCardItem", "onGYNetEnd, errType = %d, errCode = %d", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    if ((paramInt2 != 0) || (paramInt3 != 0))
    {
      w.e("MicroMsg.NetSceneBatchGetCardItem", "onGYNetEnd, batch get fail, errType = %d, errCode = %d", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
      this.gMF.a(paramInt2, paramInt3, paramString, this);
      GMTrace.o(4911966191616L, 36597);
      return;
    }
    paramp = ((fa)this.gMC.hlV.hmc).kpq;
    if (TextUtils.isEmpty(paramp))
    {
      w.e("MicroMsg.NetSceneBatchGetCardItem", "onGYNetEnd fail, resp json_ret is null");
      this.gMF.a(4, -1, null, this);
      GMTrace.o(4911966191616L, 36597);
      return;
    }
    long l1 = System.currentTimeMillis();
    paramp = f.ud(paramp);
    if (paramp != null)
    {
      if (this.kpv != null) {
        this.kpw.addAll(this.kpv);
      }
      long l2 = System.currentTimeMillis();
      ap.AS();
      long l3 = c.yI().cA(Thread.currentThread().getId());
      paramInt1 = 0;
      paramArrayOfByte = paramp.iterator();
      Object localObject1;
      Object localObject2;
      Object localObject3;
      for (paramInt2 = 0; paramArrayOfByte.hasNext(); paramInt2 = paramInt3)
      {
        localObject1 = (CardInfo)paramArrayOfByte.next();
        paramInt3 = paramInt2 + 1;
        paramInt2 = paramInt1;
        if (!l.b((CardInfo)localObject1))
        {
          paramInt1 += 1;
          localObject2 = this.kpw;
          paramInt2 = paramInt1;
          if (localObject1 != null)
          {
            localObject3 = new aj();
            ((aj)localObject3).field_cardUserId = ((CardInfo)localObject1).field_card_id;
            ((LinkedList)localObject2).remove(localObject3);
            paramInt2 = paramInt1;
          }
        }
        paramInt1 = paramInt2;
      }
      ap.AS();
      c.yI().aJ(l3);
      w.i("MicroMsg.NetSceneBatchGetCardItem", "onGYNetEnd do transaction use time %s", new Object[] { Long.valueOf(System.currentTimeMillis() - l2) });
      w.e("MicroMsg.NetSceneBatchGetCardItem", "onGYNetEnd, deal CardObject %d fail of %d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
      l.amj();
      if (paramp.size() > 0)
      {
        paramInt1 = (int)(System.currentTimeMillis() - l1);
        paramArrayOfByte = new ArrayList();
        localObject1 = new IDKey();
        ((IDKey)localObject1).SetID(281);
        ((IDKey)localObject1).SetKey(43);
        ((IDKey)localObject1).SetValue(1L);
        localObject2 = new IDKey();
        ((IDKey)localObject2).SetID(281);
        ((IDKey)localObject2).SetKey(44);
        ((IDKey)localObject2).SetValue(paramInt1);
        localObject3 = new IDKey();
        ((IDKey)localObject3).SetID(281);
        ((IDKey)localObject3).SetKey(45);
        ((IDKey)localObject3).SetValue(paramp.size());
        IDKey localIDKey = new IDKey();
        localIDKey.SetID(281);
        localIDKey.SetKey(47);
        localIDKey.SetValue(paramInt1 / paramp.size());
        paramArrayOfByte.add(localObject1);
        paramArrayOfByte.add(localObject2);
        paramArrayOfByte.add(localObject3);
        paramArrayOfByte.add(localIDKey);
        com.tencent.mm.plugin.report.service.g.paX.b(paramArrayOfByte, true);
      }
    }
    this.gMF.a(0, 0, paramString, this);
    GMTrace.o(4911966191616L, 36597);
  }
  
  public final int getType()
  {
    GMTrace.i(4911697756160L, 36595);
    GMTrace.o(4911697756160L, 36595);
    return 559;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/card/model/s.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */