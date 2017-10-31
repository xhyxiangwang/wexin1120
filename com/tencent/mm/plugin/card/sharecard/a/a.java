package com.tencent.mm.plugin.card.sharecard.a;

import android.os.Looper;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ac.k;
import com.tencent.mm.bt.g;
import com.tencent.mm.plugin.card.base.d;
import com.tencent.mm.plugin.card.model.al;
import com.tencent.mm.plugin.card.sharecard.model.h;
import com.tencent.mm.plugin.card.sharecard.model.o;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.x.ap;
import com.tencent.mm.x.c;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class a
  implements com.tencent.mm.ac.e
{
  public byte[] hur;
  private Runnable kL;
  public List<com.tencent.mm.plugin.card.sharecard.model.n> kmr;
  public List<com.tencent.mm.plugin.card.sharecard.model.n> kms;
  private List<WeakReference<d>> kmu;
  public com.tencent.mm.plugin.card.sharecard.model.e kqw;
  private int kqx;
  public int kqy;
  public ae mHandler;
  
  public a()
  {
    GMTrace.i(5099065704448L, 37991);
    this.hur = new byte[0];
    this.kmu = new ArrayList();
    this.kqx = 0;
    this.kqy = 5;
    this.mHandler = new ae(Looper.getMainLooper());
    this.kL = new Runnable()
    {
      public final void run()
      {
        GMTrace.i(5097857744896L, 37982);
        w.i("MicroMsg.ShareCardBatchGetCardMgr", "doShareCardSyncNetScene after 5s");
        h localh = new h();
        ap.wT().a(localh, 0);
        GMTrace.o(5097857744896L, 37982);
      }
    };
    this.kmr = al.ajL().ajz();
    this.kms = new ArrayList();
    w.i("MicroMsg.ShareCardBatchGetCardMgr", "scsmgr <init>, init pending list size = %d", new Object[] { Integer.valueOf(this.kmr.size()) });
    ap.wT().a(903, this);
    GMTrace.o(5099065704448L, 37991);
  }
  
  private ArrayList<com.tencent.mm.plugin.card.sharecard.model.n> F(LinkedList<String> paramLinkedList)
  {
    GMTrace.i(5099468357632L, 37994);
    ArrayList localArrayList = new ArrayList();
    LinkedList localLinkedList = new LinkedList();
    for (;;)
    {
      int i;
      synchronized (this.hur)
      {
        if (this.kmr.size() == 0)
        {
          w.e("MicroMsg.ShareCardBatchGetCardMgr", "getSuccessShareCardSyncItem pendingList size is 0");
          GMTrace.o(5099468357632L, 37994);
          return localArrayList;
        }
        localLinkedList.addAll(this.kmr);
        i = 0;
        if (i >= paramLinkedList.size()) {
          break;
        }
        ??? = (String)paramLinkedList.get(i);
        int j = 0;
        if (j < localLinkedList.size())
        {
          if ((??? != null) && (localLinkedList.get(j) != null) && (((String)???).equals(((com.tencent.mm.plugin.card.sharecard.model.n)localLinkedList.get(j)).field_card_id))) {
            localArrayList.add(localLinkedList.get(j));
          }
          j += 1;
        }
      }
      i += 1;
    }
    GMTrace.o(5099468357632L, 37994);
    return localArrayList;
  }
  
  public final void a(int paramInt1, int paramInt2, String arg3, k paramk)
  {
    GMTrace.i(5099334139904L, 37993);
    w.i("MicroMsg.ShareCardBatchGetCardMgr", "scsmgr onSceneEnd, errType = %d, errCode = %d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    this.kqw = null;
    com.tencent.mm.plugin.card.sharecard.model.n localn;
    if ((paramInt1 != 0) || (paramInt2 != 0))
    {
      w.e("MicroMsg.ShareCardBatchGetCardMgr", "scsmgr onSceneEnd fail, stop batch get, errType = %d, errCode = %d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
      paramk = F(((com.tencent.mm.plugin.card.sharecard.model.e)paramk).kpv);
      synchronized (this.hur)
      {
        if (paramk.size() > 0)
        {
          this.kmr.removeAll(paramk);
          this.kms.addAll(paramk);
        }
        ??? = al.ajL();
        if (paramk.size() == 0)
        {
          w.e("MicroMsg.ShareCardSyncItemInfoStorage", "increaseRetryCount fail, share card list is empty");
          GMTrace.o(5099334139904L, 37993);
          return;
        }
      }
      paramk = paramk.iterator();
      while (paramk.hasNext())
      {
        localn = (com.tencent.mm.plugin.card.sharecard.model.n)paramk.next();
        if (localn != null)
        {
          localn.field_retryCount += 1;
          ???.c(localn, new String[0]);
        }
      }
      GMTrace.o(5099334139904L, 37993);
      return;
    }
    paramk = F(((com.tencent.mm.plugin.card.sharecard.model.e)paramk).kpw);
    w.i("MicroMsg.ShareCardBatchGetCardMgr", "scsmgr onSceneEnd, batch get succ, remove succ id list, size = %d", new Object[] { Integer.valueOf(paramk.size()) });
    for (;;)
    {
      synchronized (this.hur)
      {
        this.kmr.removeAll(paramk);
        long l1 = System.currentTimeMillis();
        ap.AS();
        long l2 = c.yI().cA(Thread.currentThread().getId());
        ??? = al.ajL();
        if (paramk.size() == 0)
        {
          w.e("MicroMsg.ShareCardSyncItemInfoStorage", "deleteList fail, share card list is empty");
          ap.AS();
          c.yI().aJ(l2);
          w.i("MicroMsg.ShareCardBatchGetCardMgr", "onSceneEnd do transaction use time %s", new Object[] { Long.valueOf(System.currentTimeMillis() - l1) });
          aiX();
          ahA();
          GMTrace.o(5099334139904L, 37993);
          return;
        }
      }
      paramk = paramk.iterator();
      while (paramk.hasNext())
      {
        localn = (com.tencent.mm.plugin.card.sharecard.model.n)paramk.next();
        if (localn != null) {
          ???.a(localn, new String[0]);
        }
      }
    }
  }
  
  public final void a(d paramd)
  {
    GMTrace.i(5099871010816L, 37997);
    if (this.kmu == null) {
      this.kmu = new ArrayList();
    }
    if (paramd != null) {
      this.kmu.add(new WeakReference(paramd));
    }
    GMTrace.o(5099871010816L, 37997);
  }
  
  public final void ahA()
  {
    GMTrace.i(5099736793088L, 37996);
    if (this.kmu == null)
    {
      GMTrace.o(5099736793088L, 37996);
      return;
    }
    int i = 0;
    while (i < this.kmu.size())
    {
      Object localObject = (WeakReference)this.kmu.get(i);
      if (localObject != null)
      {
        localObject = (d)((WeakReference)localObject).get();
        if (localObject != null) {
          ((d)localObject).aiV();
        }
      }
      i += 1;
    }
    GMTrace.o(5099736793088L, 37996);
  }
  
  public final void aiX()
  {
    GMTrace.i(5099199922176L, 37992);
    LinkedList localLinkedList1 = new LinkedList();
    synchronized (this.hur)
    {
      if (this.kmr.size() == 0)
      {
        w.i("MicroMsg.ShareCardBatchGetCardMgr", "scsmgr getNow, no pending cardinfo ,no need to get");
        GMTrace.o(5099199922176L, 37992);
        return;
      }
      localLinkedList1.addAll(this.kmr);
      if (this.kqw != null)
      {
        w.i("MicroMsg.ShareCardBatchGetCardMgr", "scsmgr getNow, already doing scene, not trigger now");
        GMTrace.o(5099199922176L, 37992);
        return;
      }
    }
    ??? = new LinkedList();
    if (localCollection.size() <= 10) {
      ((LinkedList)???).addAll(localCollection);
    }
    LinkedList localLinkedList2;
    for (;;)
    {
      localLinkedList2 = new LinkedList();
      int i = 0;
      while (i < ((LinkedList)???).size())
      {
        localLinkedList2.add(((com.tencent.mm.plugin.card.sharecard.model.n)((LinkedList)???).get(i)).field_card_id);
        i += 1;
      }
      ((LinkedList)???).addAll(localLinkedList2.subList(0, 10));
    }
    this.kqw = new com.tencent.mm.plugin.card.sharecard.model.e(localLinkedList2);
    ap.wT().a(this.kqw, 0);
    GMTrace.o(5099199922176L, 37992);
  }
  
  public final void ajT()
  {
    GMTrace.i(5099602575360L, 37995);
    w.i("MicroMsg.ShareCardBatchGetCardMgr", "doShareCardSyncNetScene");
    int j = (int)(System.currentTimeMillis() / 1000L);
    int k = j - this.kqx;
    int i;
    if (this.kqy <= 0)
    {
      i = 5;
      if (k < i) {
        break label89;
      }
      h localh = new h();
      ap.wT().a(localh, 0);
    }
    for (;;)
    {
      this.kqx = j;
      GMTrace.o(5099602575360L, 37995);
      return;
      i = this.kqy;
      break;
      label89:
      w.i("MicroMsg.ShareCardBatchGetCardMgr", "sync interval is " + k);
      this.mHandler.removeCallbacks(this.kL);
      this.mHandler.postDelayed(this.kL, i * 1000);
    }
  }
  
  public final void b(d paramd)
  {
    GMTrace.i(5100005228544L, 37998);
    if ((this.kmu == null) || (paramd == null))
    {
      GMTrace.o(5100005228544L, 37998);
      return;
    }
    int i = 0;
    while (i < this.kmu.size())
    {
      WeakReference localWeakReference = (WeakReference)this.kmu.get(i);
      if (localWeakReference != null)
      {
        d locald = (d)localWeakReference.get();
        if ((locald != null) && (locald.equals(paramd)))
        {
          this.kmu.remove(localWeakReference);
          GMTrace.o(5100005228544L, 37998);
          return;
        }
      }
      i += 1;
    }
    GMTrace.o(5100005228544L, 37998);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/card/sharecard/a/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */