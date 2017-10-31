package com.tencent.mm.plugin.search.ui;

import android.os.Looper;
import android.os.Message;
import android.widget.AbsListView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.a.on;
import com.tencent.mm.g.a.on.b;
import com.tencent.mm.k.e;
import com.tencent.mm.plugin.fts.d.i.a;
import com.tencent.mm.plugin.fts.d.i.b;
import com.tencent.mm.plugin.sns.b.f;
import com.tencent.mm.plugin.sns.b.n;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.d;
import com.tencent.mm.x.m;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public final class g
  extends b
  implements i.b
{
  private ae plB;
  int plQ;
  boolean pmA;
  private List<com.tencent.mm.plugin.fts.d.i> pmI;
  private com.tencent.mm.ay.h pmJ;
  private b pmK;
  private long pmL;
  private long pmM;
  private long pmN;
  private long pmO;
  private ae pmP;
  private int pmQ;
  boolean pmR;
  private boolean pmS;
  private boolean pmx;
  private boolean pmy;
  
  public g(c paramc, int paramInt, b paramb)
  {
    super(paramc);
    GMTrace.i(19516062957568L, 145406);
    this.pmK = null;
    this.plQ = 1;
    this.pmP = new ae(Looper.getMainLooper())
    {
      public final void handleMessage(Message paramAnonymousMessage)
      {
        GMTrace.i(11842432794624L, 88233);
        switch (paramAnonymousMessage.what)
        {
        }
        for (;;)
        {
          GMTrace.o(11842432794624L, 88233);
          return;
          if ((!g.f(g.this)) && (g.this.getCount() > 0))
          {
            com.tencent.mm.plugin.search.a.c.bbO().aBB();
            n.pXS.start();
            g.this.notifyDataSetChanged();
          }
        }
      }
    };
    this.plB = new ae(Looper.getMainLooper());
    this.pmQ = -1;
    this.pmJ = new com.tencent.mm.ay.h();
    paramc = new HashSet();
    paramc.add(Integer.valueOf(16));
    paramc.add(Integer.valueOf(32));
    paramc.add(Integer.valueOf(48));
    paramc.add(Integer.valueOf(64));
    paramc.add(Integer.valueOf(80));
    paramc.add(Integer.valueOf(128));
    paramc.add(Integer.valueOf(96));
    paramc.add(Integer.valueOf(112));
    if (com.tencent.mm.kernel.h.xx().wM())
    {
      on localon = new on();
      com.tencent.mm.sdk.b.a.uLm.m(localon);
      com.tencent.mm.storage.c localc = com.tencent.mm.x.c.c.Cu().em("100193");
      if ((!localc.isValid()) || (!"1".equals(localc.bPn().get("isOpenLocalSearch"))) || (!localon.fMB.fMD)) {}
    }
    for (;;)
    {
      if (i != 0) {
        paramc.add(Integer.valueOf(144));
      }
      this.pmI = com.tencent.mm.plugin.fts.d.h.a(paramc, getContext(), this, paramInt);
      this.pmK = paramb;
      GMTrace.o(19516062957568L, 145406);
      return;
      i = 0;
    }
  }
  
  private void c(HashSet<String> paramHashSet)
  {
    GMTrace.i(11880416411648L, 88516);
    this.pmQ += 1;
    if (this.pmQ < this.pmI.size()) {
      ((com.tencent.mm.plugin.fts.d.i)this.pmI.get(this.pmQ)).a(this.fIW, this.plB, paramHashSet);
    }
    GMTrace.o(11880416411648L, 88516);
  }
  
  public final void a(com.tencent.mm.plugin.fts.d.i parami, String paramString)
  {
    GMTrace.i(16477239377920L, 122765);
    Object localObject = (com.tencent.mm.plugin.fts.d.c)parami;
    if (paramString.equals(this.fIW)) {
      c(((com.tencent.mm.plugin.fts.d.c)localObject).mky);
    }
    int k = ((com.tencent.mm.plugin.fts.d.c)localObject).mmR.size();
    int j = 0;
    int i = 0;
    while (i < k)
    {
      j += ((i.a)((com.tencent.mm.plugin.fts.d.c)localObject).mmR.get(i)).mnk.size();
      i += 1;
    }
    if ((j > 0) && (this.pmL == 0L))
    {
      this.pmL = (System.currentTimeMillis() - this.pmb);
      com.tencent.mm.ay.g.j(9, this.pmL);
      w.i("MicroMsg.FTS.FTSMainAdapter", "firstItemTime=%d", new Object[] { Long.valueOf(this.pmL) });
    }
    com.tencent.mm.ay.h localh;
    switch (((com.tencent.mm.plugin.fts.d.c)localObject).getType())
    {
    default: 
      localh = this.pmJ;
      localObject = ((com.tencent.mm.plugin.fts.d.c)localObject).mmR.iterator();
    }
    for (;;)
    {
      if (!((Iterator)localObject).hasNext()) {
        break label623;
      }
      i.a locala = (i.a)((Iterator)localObject).next();
      switch (locala.hJx)
      {
      case -10: 
      case -9: 
      default: 
        break;
      case -11: 
        localh.hKa = locala.mnk.size();
        continue;
        if (this.pmM != 0L) {
          break;
        }
        this.pmM = (System.currentTimeMillis() - this.pmb);
        w.i("MicroMsg.FTS.FTSMainAdapter", "firstGetTopHitsTime=%d", new Object[] { Long.valueOf(this.pmM) });
        com.tencent.mm.ay.g.j(0, this.pmM);
        break;
        if (this.pmN != 0L) {
          break;
        }
        this.pmN = (System.currentTimeMillis() - this.pmb);
        w.i("MicroMsg.FTS.FTSMainAdapter", "firstGetContactTime=%d", new Object[] { Long.valueOf(this.pmN) });
        com.tencent.mm.ay.g.j(3, this.pmN);
        break;
        if (this.pmO != 0L) {
          break;
        }
        this.pmO = (System.currentTimeMillis() - this.pmb);
        w.i("MicroMsg.FTS.FTSMainAdapter", "firstGetChatroomTime=%d", new Object[] { Long.valueOf(this.pmO) });
        com.tencent.mm.ay.g.j(6, this.pmO);
        break;
      case -2: 
        localh.hJW = locala.mnk.size();
        break;
      case -4: 
        localh.hJT = locala.mnk.size();
        break;
      case -6: 
        localh.hJX = locala.mnk.size();
        break;
      case -3: 
        localh.hJU = locala.mnk.size();
        break;
      case -1: 
        localh.hJY = locala.mnk.size();
        break;
      case -7: 
        localh.hJV = locala.mnk.size();
        break;
      case -5: 
        localh.hJZ = locala.mnk.size();
        break;
      case -8: 
        localh.hJS = locala.mnk.size();
      }
    }
    label623:
    new a(parami, paramString).run();
    GMTrace.o(16477239377920L, 122765);
  }
  
  protected final boolean a(com.tencent.mm.plugin.fts.d.a.a parama)
  {
    GMTrace.i(16477105160192L, 122764);
    if (parama.mnG)
    {
      this.pmS = true;
      w.d("MicroMsg.FTS.FTSMainAdapter", "searchType=%d | searchScene=%d | kvPosition=%d | kvSubPosition=%d | kvSearchId=%s | kvDocId=%d", new Object[] { Integer.valueOf(parama.mny), Integer.valueOf(parama.mmQ), Integer.valueOf(parama.mnz), Integer.valueOf(parama.mnA), parama.mnB, Long.valueOf(parama.mnC) });
      String str;
      int i;
      if (!this.pmx)
      {
        str = this.fIW;
        i = bbW();
        if (this.pmJ.hJS <= 0) {
          break label178;
        }
      }
      label178:
      for (boolean bool = true;; bool = false)
      {
        com.tencent.mm.ay.g.a(str, true, i, 0, bool);
        this.pmx = true;
        if (!bg.mZ(this.fIW)) {
          com.tencent.mm.ay.i.d(this.fIW, this.plQ, 1, 3);
        }
        com.tencent.mm.ay.g.a(parama, this.pmJ);
        GMTrace.o(16477105160192L, 122764);
        return true;
      }
    }
    if ((parama instanceof com.tencent.mm.plugin.search.ui.a.c))
    {
      this.pmA = true;
      if (!bg.mZ(this.fIW)) {
        com.tencent.mm.ay.i.d(this.fIW, this.plQ, 1, 3);
      }
      com.tencent.mm.ay.g.a(parama, this.pmJ);
    }
    GMTrace.o(16477105160192L, 122764);
    return false;
  }
  
  protected final void bbR()
  {
    GMTrace.i(11879611105280L, 88510);
    this.pmx = false;
    this.pmA = false;
    this.pmQ = -1;
    this.pmR = false;
    this.pmJ.reset();
    this.plQ = 1;
    this.pmL = 0L;
    this.pmM = 0L;
    this.pmN = 0L;
    this.pmO = 0L;
    HashSet localHashSet = new HashSet();
    localHashSet.add("filehelper");
    boolean bool2 = m.Am();
    boolean bool1 = bool2;
    if (!bool2) {
      if (bg.getInt(com.tencent.mm.k.g.uz().getValue("BindQQSwitch"), 1) != 1) {
        break label173;
      }
    }
    label173:
    for (bool1 = true;; bool1 = false)
    {
      if (!bool1)
      {
        w.i("MicroMsg.FTS.FTSMainAdapter", "summerqq BindQQSwitch off");
        localHashSet.add("22");
        localHashSet.add("23");
      }
      w.d("MicroMsg.FTS.FTSMainAdapter", "summerqq doSearch blockSet[%d]", new Object[] { Integer.valueOf(localHashSet.size()) });
      c(localHashSet);
      GMTrace.o(11879611105280L, 88510);
      return;
    }
  }
  
  protected final void clearCache()
  {
    GMTrace.i(11879879540736L, 88512);
    super.clearCache();
    Iterator localIterator = this.pmI.iterator();
    while (localIterator.hasNext())
    {
      com.tencent.mm.plugin.fts.d.i locali = (com.tencent.mm.plugin.fts.d.i)localIterator.next();
      locali.aBw();
      locali.Tn();
    }
    GMTrace.o(11879879540736L, 88512);
  }
  
  public final void finish()
  {
    boolean bool = true;
    GMTrace.i(11879745323008L, 88511);
    String str;
    int i;
    if (!this.pmx)
    {
      this.pmx = true;
      if (!this.pmA)
      {
        str = this.fIW;
        i = bbW();
        if (this.pmJ.hJS <= 0) {
          break label106;
        }
      }
    }
    for (;;)
    {
      com.tencent.mm.ay.g.a(str, false, i, 0, bool);
      if ((!this.pmA) && (!this.pmS)) {
        com.tencent.mm.ay.i.d(this.fIW, this.plQ, 3, 3);
      }
      this.pmJ.reset();
      super.finish();
      GMTrace.o(11879745323008L, 88511);
      return;
      label106:
      bool = false;
    }
  }
  
  protected final com.tencent.mm.plugin.fts.d.a.a nR(int paramInt)
  {
    GMTrace.i(16476970942464L, 122763);
    Object localObject1 = null;
    Iterator localIterator = this.pmI.iterator();
    Object localObject2;
    while (localIterator.hasNext())
    {
      localObject2 = ((com.tencent.mm.plugin.fts.d.i)localIterator.next()).nR(paramInt);
      localObject1 = localObject2;
      if (localObject2 != null) {
        localObject1 = localObject2;
      }
    }
    int i;
    if (localObject1 != null)
    {
      localObject2 = new LinkedList();
      localIterator = this.pmI.iterator();
      while (localIterator.hasNext()) {
        ((LinkedList)localObject2).addAll(((com.tencent.mm.plugin.fts.d.i)localIterator.next()).aBx());
      }
      i = ((LinkedList)localObject2).size() - 1;
    }
    for (;;)
    {
      int j = paramInt;
      if (i >= 0)
      {
        if (paramInt > ((Integer)((LinkedList)localObject2).get(i)).intValue()) {
          j = paramInt - i;
        }
      }
      else
      {
        ((com.tencent.mm.plugin.fts.d.a.a)localObject1).mnz = j;
        if (((com.tencent.mm.plugin.fts.d.a.a)localObject1).position == getCount() - 1) {
          ((com.tencent.mm.plugin.fts.d.a.a)localObject1).mnx = true;
        }
        GMTrace.o(16476970942464L, 122763);
        return (com.tencent.mm.plugin.fts.d.a.a)localObject1;
      }
      i -= 1;
    }
  }
  
  public final void onScroll(AbsListView paramAbsListView, int paramInt1, int paramInt2, int paramInt3)
  {
    GMTrace.i(11880550629376L, 88517);
    super.onScroll(paramAbsListView, paramInt1, paramInt2, paramInt3);
    if ((paramAbsListView.getLastVisiblePosition() == getCount()) && (this.pmR))
    {
      this.plQ = 2;
      if (this.pmK != null) {
        this.pmK.bcj();
      }
    }
    GMTrace.o(11880550629376L, 88517);
  }
  
  public final void onScrollStateChanged(AbsListView paramAbsListView, int paramInt)
  {
    GMTrace.i(11880684847104L, 88518);
    super.onScrollStateChanged(paramAbsListView, paramInt);
    if (paramInt == 2)
    {
      this.pmy = true;
      com.tencent.mm.plugin.fts.d.h.aBF().aBz();
      n.pXS.pause();
      GMTrace.o(11880684847104L, 88518);
      return;
    }
    this.pmy = false;
    if (!com.tencent.mm.plugin.fts.d.h.aBF().aBA())
    {
      this.pmP.removeMessages(1);
      this.pmP.sendEmptyMessageDelayed(1, 200L);
    }
    GMTrace.o(11880684847104L, 88518);
  }
  
  public final void stopSearch()
  {
    GMTrace.i(11880013758464L, 88513);
    this.pmP.removeMessages(1);
    super.stopSearch();
    GMTrace.o(11880013758464L, 88513);
  }
  
  private final class a
    implements Runnable
  {
    private String fIW;
    private com.tencent.mm.plugin.fts.d.i pmU;
    
    a(com.tencent.mm.plugin.fts.d.i parami, String paramString)
    {
      GMTrace.i(16483816046592L, 122814);
      this.fIW = paramString;
      this.pmU = parami;
      GMTrace.o(16483816046592L, 122814);
    }
    
    public final void run()
    {
      GMTrace.i(11822031699968L, 88081);
      if ((!g.a(g.this)) && (((com.tencent.mm.plugin.fts.d.i)g.b(g.this).get(g.b(g.this).size() - 1)).getType() == this.pmU.getType())) {
        g.c(g.this);
      }
      Iterator localIterator = g.b(g.this).iterator();
      for (int i = 0; localIterator.hasNext(); i = ((com.tencent.mm.plugin.fts.d.i)localIterator.next()).nQ(i)) {}
      g.this.tp(i);
      g.this.notifyDataSetChanged();
      g.this.C(i, g.d(g.this));
      if (g.d(g.this)) {
        g.e(g.this).hJr = System.currentTimeMillis();
      }
      GMTrace.o(11822031699968L, 88081);
    }
  }
  
  public static abstract interface b
  {
    public abstract void bcj();
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/search/ui/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */