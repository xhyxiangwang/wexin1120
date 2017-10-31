package com.tencent.mm.plugin.card.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ac.e;
import com.tencent.mm.ac.k;
import com.tencent.mm.ac.n;
import com.tencent.mm.bt.g;
import com.tencent.mm.plugin.card.base.d;
import com.tencent.mm.plugin.card.model.aj;
import com.tencent.mm.plugin.card.model.ak;
import com.tencent.mm.plugin.card.model.al;
import com.tencent.mm.plugin.card.model.s;
import com.tencent.mm.x.ap;
import com.tencent.mm.x.c;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class b
  implements e
{
  public byte[] hur;
  public List<aj> kmr;
  public List<aj> kms;
  private s kmt;
  public List<WeakReference<d>> kmu;
  
  public b()
  {
    GMTrace.i(5124567072768L, 38181);
    this.hur = new byte[0];
    this.kmu = new ArrayList();
    this.kmr = al.ajD().ajz();
    this.kms = new ArrayList();
    com.tencent.mm.sdk.platformtools.w.i("MicroMsg.BatchGetCardMgr", "<init>, init pending list size = %d", new Object[] { Integer.valueOf(this.kmr.size()) });
    ap.wT().a(559, this);
    GMTrace.o(5124567072768L, 38181);
  }
  
  public static void lt(int paramInt)
  {
    GMTrace.i(5125103943680L, 38185);
    com.tencent.mm.plugin.card.model.w localw = new com.tencent.mm.plugin.card.model.w(paramInt);
    ap.wT().a(localw, 0);
    GMTrace.o(5125103943680L, 38185);
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, k arg4)
  {
    GMTrace.i(5124969725952L, 38184);
    com.tencent.mm.sdk.platformtools.w.i("MicroMsg.BatchGetCardMgr", "onSceneEnd, errType = %d, errCode = %d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    this.kmt = null;
    paramString = ((s)???).kpw;
    aj localaj;
    if ((paramInt1 != 0) || (paramInt2 != 0))
    {
      com.tencent.mm.sdk.platformtools.w.e("MicroMsg.BatchGetCardMgr", "onSceneEnd fail, stop batch get, errType = %d, errCode = %d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
      ??? = this.hur;
      if (paramString != null) {}
      try
      {
        if (paramString.size() > 0)
        {
          this.kmr.removeAll(paramString);
          this.kms.addAll(paramString);
        }
        ??? = al.ajD();
        if ((paramString == null) || (paramString.size() == 0))
        {
          com.tencent.mm.sdk.platformtools.w.e("MicroMsg.PendingCardIdInfoStorage", "increaseRetryCount fail, list is empty");
          GMTrace.o(5124969725952L, 38184);
          return;
        }
      }
      finally {}
      paramString = paramString.iterator();
      while (paramString.hasNext())
      {
        localaj = (aj)paramString.next();
        if (localaj != null)
        {
          localaj.field_retryCount += 1;
          ???.c(localaj, new String[0]);
        }
      }
      GMTrace.o(5124969725952L, 38184);
      return;
    }
    if (paramString == null)
    {
      paramInt1 = 0;
      com.tencent.mm.sdk.platformtools.w.i("MicroMsg.BatchGetCardMgr", "onSceneEnd, batch get succ, remove succ id list, size = %d", new Object[] { Integer.valueOf(paramInt1) });
      if (paramString == null) {}
    }
    for (;;)
    {
      synchronized (this.hur)
      {
        this.kmr.removeAll(paramString);
        long l1 = System.currentTimeMillis();
        ap.AS();
        long l2 = c.yI().cA(Thread.currentThread().getId());
        ??? = al.ajD();
        if ((paramString == null) || (paramString.size() == 0))
        {
          com.tencent.mm.sdk.platformtools.w.e("MicroMsg.PendingCardIdInfoStorage", "deleteList fail, list is empty");
          ap.AS();
          c.yI().aJ(l2);
          com.tencent.mm.sdk.platformtools.w.i("MicroMsg.BatchGetCardMgr", "onSceneEnd do transaction use time %s", new Object[] { Long.valueOf(System.currentTimeMillis() - l1) });
          aiX();
          if (this.kmu == null) {
            break;
          }
          paramInt1 = 0;
          if (paramInt1 >= this.kmu.size()) {
            break;
          }
          paramString = (WeakReference)this.kmu.get(paramInt1);
          if (paramString != null)
          {
            paramString = (d)paramString.get();
            if (paramString != null) {
              paramString.aiV();
            }
          }
          paramInt1 += 1;
          continue;
          paramInt1 = paramString.size();
        }
      }
      paramString = paramString.iterator();
      while (paramString.hasNext())
      {
        localaj = (aj)paramString.next();
        if (localaj != null) {
          ???.a(localaj, new String[0]);
        }
      }
    }
    GMTrace.o(5124969725952L, 38184);
  }
  
  public final void aiX()
  {
    GMTrace.i(5124835508224L, 38183);
    if (this.kmr.size() == 0)
    {
      com.tencent.mm.sdk.platformtools.w.i("MicroMsg.BatchGetCardMgr", "getNow, no pending cardinfo ,no need to get");
      GMTrace.o(5124835508224L, 38183);
      return;
    }
    if (this.kmt != null)
    {
      com.tencent.mm.sdk.platformtools.w.i("MicroMsg.BatchGetCardMgr", "getNow, already doing scene, not trigger now");
      GMTrace.o(5124835508224L, 38183);
      return;
    }
    LinkedList localLinkedList = new LinkedList();
    if (this.kmr.size() <= 10) {
      localLinkedList.addAll(this.kmr);
    }
    for (;;)
    {
      this.kmt = new s(localLinkedList);
      ap.wT().a(this.kmt, 0);
      GMTrace.o(5124835508224L, 38183);
      return;
      localLinkedList.addAll(this.kmr.subList(0, 10));
    }
  }
  
  public final void detach()
  {
    GMTrace.i(5124701290496L, 38182);
    this.kmr.clear();
    this.kms.clear();
    if (this.kmt != null) {
      ap.wT().c(this.kmt);
    }
    ap.wT().b(559, this);
    GMTrace.o(5124701290496L, 38182);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/card/a/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */