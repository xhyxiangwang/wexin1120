package com.tencent.mm.plugin.card.sharecard.model;

import android.text.TextUtils;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ac.b.a;
import com.tencent.mm.ac.b.b;
import com.tencent.mm.ac.b.c;
import com.tencent.mm.network.j;
import com.tencent.mm.network.p;
import com.tencent.mm.plugin.card.model.al;
import com.tencent.mm.plugin.card.sharecard.a.a;
import com.tencent.mm.plugin.card.sharecard.a.a.2;
import com.tencent.mm.protocal.c.bbs;
import com.tencent.mm.protocal.c.bbt;
import com.tencent.mm.protocal.c.bbu;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import com.tencent.mm.storage.w.a;
import com.tencent.mm.x.ap;
import java.util.Iterator;
import java.util.List;

public final class h
  extends com.tencent.mm.ac.k
  implements j
{
  private final com.tencent.mm.ac.b gMC;
  private com.tencent.mm.ac.e gMF;
  
  public h()
  {
    GMTrace.i(5069806239744L, 37773);
    Object localObject = new b.a();
    ((b.a)localObject).hlX = new bbt();
    ((b.a)localObject).hlY = new bbu();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/sharecardsync";
    ((b.a)localObject).hlW = 906;
    ((b.a)localObject).hlZ = 0;
    ((b.a)localObject).hma = 0;
    this.gMC = ((b.a)localObject).DA();
    localObject = (bbt)this.gMC.hlU.hmc;
    ap.AS();
    ((bbt)localObject).utY = ((Long)com.tencent.mm.x.c.xi().get(w.a.uVx, Long.valueOf(0L))).longValue();
    GMTrace.o(5069806239744L, 37773);
  }
  
  private static boolean a(bbs parambbs)
  {
    GMTrace.i(5070343110656L, 37777);
    if (parambbs == null)
    {
      w.e("MicroMsg.NetSceneShareCardSync", "processShareCardCmdItem fail, null cmd");
      GMTrace.o(5070343110656L, 37777);
      return false;
    }
    w.i("MicroMsg.NetSceneShareCardSync", "processShareCardCmdItem, item card_id = %s, seq = %d", new Object[] { parambbs.fMv, Long.valueOf(parambbs.utX) });
    for (;;)
    {
      boolean bool;
      try
      {
        w.i("MicroMsg.NetSceneShareCardSync", "processShareCardCmdItem, card user item, Status = %d", new Object[] { Integer.valueOf(parambbs.kqG) });
        switch (parambbs.kqG)
        {
        case 0: 
          w.e("MicroMsg.NetSceneShareCardSync", "processShareCardCmdItem, card user item, unknown StateFlag = %d", new Object[] { Integer.valueOf(parambbs.kqG) });
          GMTrace.o(5070343110656L, 37777);
          return false;
        }
      }
      catch (Exception parambbs)
      {
        w.e("MicroMsg.NetSceneShareCardSync", "processShareCardCmdItem fail, ex = %s", new Object[] { parambbs.getMessage() });
        GMTrace.o(5070343110656L, 37777);
        return false;
      }
      Object localObject1 = al.ajJ();
      if (parambbs == null)
      {
        w.e("MicroMsg.ShareCardBatchGetCardMgr", "scsmgr push fail, ShareCardSyncItem is null");
        if ((parambbs.kqG != 0) && (parambbs.kqG != 5))
        {
          ap.AS();
          localObject1 = (String)com.tencent.mm.x.c.xi().get(w.a.uVF, "");
          ap.AS();
          bool = ((Boolean)com.tencent.mm.x.c.xi().get(w.a.uVG, Boolean.valueOf(false))).booleanValue();
          if ((bool) && (!TextUtils.isEmpty((CharSequence)localObject1)) && (((String)localObject1).equals(parambbs.fMv)))
          {
            w.i("MicroMsg.NetSceneShareCardSync", "need check is true, do clearRedDotAndWording()");
            com.tencent.mm.plugin.card.a.k.ajq();
          }
        }
        else
        {
          GMTrace.o(5070343110656L, 37777);
          return true;
        }
      }
      else
      {
        ??? = al.ajK().tR(parambbs.fMv);
        Object localObject3 = parambbs.fMv;
        long l;
        if (??? == null)
        {
          l = 0L;
          w.i("MicroMsg.ShareCardBatchGetCardMgr", "scsmgr pushShareCardSyncItem, card_id = %s, localSeq = %d, svrSeq = %d", new Object[] { localObject3, Long.valueOf(l), Long.valueOf(parambbs.utX) });
          if ((??? != null) && (((ShareCardInfo)???).field_updateSeq == parambbs.utX)) {
            w.e("MicroMsg.ShareCardBatchGetCardMgr", "scsmgr push ShareCardSyncItem fail, card.field_updateSeq == item.seq");
          }
        }
        else
        {
          l = ((ShareCardInfo)???).field_updateSeq;
          continue;
        }
        localObject3 = n.b(parambbs);
        synchronized (((a)localObject1).hur)
        {
          if (!((a)localObject1).kmr.contains(localObject3)) {}
        }
        if (((a)localObject1).kms.contains(localObject3)) {
          continue;
        }
        ((a)localObject1).kmr.add(localObject3);
        w.i("MicroMsg.ShareCardBatchGetCardMgr", "scsmgr pushShareCardSyncItem, insertRet = %b", new Object[] { Boolean.valueOf(al.ajL().b((com.tencent.mm.sdk.e.c)localObject3)) });
        continue;
        localObject1 = al.ajJ();
        if (parambbs == null)
        {
          w.e("MicroMsg.ShareCardBatchGetCardMgr", "delete item is  null");
          continue;
        }
        ??? = al.ajK().tR(parambbs.fMv);
        al.ajK().tQ(parambbs.fMv);
        w.i("MicroMsg.ShareCardBatchGetCardMgr", "delete share card for id " + parambbs.fMv);
        if (??? != null) {
          com.tencent.mm.plugin.card.sharecard.a.b.a(ab.getContext(), (com.tencent.mm.plugin.card.base.b)???);
        }
        for (;;)
        {
          ((a)localObject1).ahA();
          break;
          w.e("MicroMsg.ShareCardBatchGetCardMgr", "info is null");
        }
      }
      if (bool) {
        w.i("MicroMsg.NetSceneShareCardSync", "need check is true, but card id is diff!");
      } else {
        w.i("MicroMsg.NetSceneShareCardSync", "need check is false");
      }
    }
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ac.e parame1)
  {
    GMTrace.i(5070074675200L, 37775);
    this.gMF = parame1;
    int i = a(parame, this.gMC, this);
    GMTrace.o(5070074675200L, 37775);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, p arg5, byte[] paramArrayOfByte)
  {
    GMTrace.i(5070208892928L, 37776);
    w.i("MicroMsg.NetSceneShareCardSync", "onGYNetEnd, cmdType = %d, errType = %d, errCode = %d", new Object[] { Integer.valueOf(906), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    if ((paramInt2 != 0) || (paramInt3 != 0))
    {
      w.e("MicroMsg.NetSceneShareCardSync", "onGYNetEnd, share card sync fail, errType = %d, errCode = %d", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
      this.gMF.a(paramInt2, paramInt3, paramString, this);
      GMTrace.o(5070208892928L, 37776);
      return;
    }
    paramArrayOfByte = (bbu)this.gMC.hlV.hmc;
    if (paramArrayOfByte.hdL == null)
    {
      ??? = null;
      if (??? != null) {
        break label245;
      }
      paramInt1 = 0;
      label135:
      w.i("MicroMsg.NetSceneShareCardSync", "onGYNetEnd, share card cmd list size = %d, continueFlag = %d, req = %d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramArrayOfByte.utZ), Long.valueOf(paramArrayOfByte.utX) });
      if ((??? == null) || (???.size() <= 0)) {
        break label391;
      }
      paramInt1 = 0;
      ??? = ???.iterator();
      label202:
      if (!???.hasNext()) {
        break label256;
      }
      if (a((bbs)???.next())) {
        break label478;
      }
      paramInt1 += 1;
    }
    label245:
    label256:
    label391:
    label478:
    for (;;)
    {
      break label202;
      ??? = paramArrayOfByte.hdL;
      break;
      paramInt1 = ???.size();
      break label135;
      w.i("MicroMsg.NetSceneShareCardSync", "onGYNetEnd, %d fail share cmds", new Object[] { Integer.valueOf(paramInt1) });
      al.ajJ().aiX();
      for (;;)
      {
        ap.AS();
        com.tencent.mm.x.c.xi().a(w.a.uVx, Long.valueOf(paramArrayOfByte.utX));
        al.ajJ().kqy = paramArrayOfByte.kqy;
        if (paramArrayOfByte.utZ > 0)
        {
          w.i("MicroMsg.NetSceneShareCardSync", "onGYNetEnd, should continue, continueFlag = %d", new Object[] { Integer.valueOf(paramArrayOfByte.utZ) });
          ??? = al.ajJ();
          ???.mHandler.post(new a.2(???));
        }
        this.gMF.a(paramInt2, paramInt3, paramString, this);
        GMTrace.o(5070208892928L, 37776);
        return;
        w.i("MicroMsg.NetSceneShareCardSync", "share cmdList == null or size is 0");
        a locala = al.ajJ();
        w.i("MicroMsg.ShareCardBatchGetCardMgr", "scsmgr sharecardsync retryAll, getNow = %b", new Object[] { Boolean.valueOf(true) });
        synchronized (locala.hur)
        {
          locala.kmr.addAll(locala.kms);
          locala.kms.clear();
          locala.aiX();
        }
      }
    }
  }
  
  public final int getType()
  {
    GMTrace.i(5069940457472L, 37774);
    GMTrace.o(5069940457472L, 37774);
    return 906;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/card/sharecard/model/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */