package com.tencent.mm.plugin.search.ui;

import android.os.Looper;
import android.os.Message;
import android.widget.AbsListView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.fts.d.a.a;
import com.tencent.mm.plugin.fts.d.h;
import com.tencent.mm.plugin.fts.d.i;
import com.tencent.mm.plugin.fts.d.i.a;
import com.tencent.mm.plugin.fts.d.i.b;
import com.tencent.mm.plugin.sns.b.f;
import com.tencent.mm.plugin.sns.b.n;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.w;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class e
  extends b
  implements i.b
{
  private int mny;
  private boolean nrh;
  private ae plB;
  private boolean pmA;
  private i pmv;
  private com.tencent.mm.ay.c pmw;
  private boolean pmx;
  private boolean pmy;
  private ae pmz;
  
  public e(c paramc, int paramInt1, int paramInt2)
  {
    super(paramc);
    GMTrace.i(11823105441792L, 88089);
    this.plB = new ae(Looper.getMainLooper());
    this.pmz = new ae(Looper.getMainLooper())
    {
      public final void handleMessage(Message paramAnonymousMessage)
      {
        GMTrace.i(11843640754176L, 88242);
        switch (paramAnonymousMessage.what)
        {
        }
        for (;;)
        {
          GMTrace.o(11843640754176L, 88242);
          return;
          w.d("MicroMsg.FTS.FTSDetailAdapter", "ImageEngine attach is true");
          if ((!e.a(e.this)) && (e.this.getCount() > 0))
          {
            com.tencent.mm.plugin.search.a.c.bbO().aBB();
            n.pXS.start();
            e.this.notifyDataSetChanged();
          }
        }
      }
    };
    this.mny = paramInt1;
    paramc = getContext();
    int j = -1;
    int i = j;
    switch (paramInt1)
    {
    default: 
      i = j;
    }
    for (;;)
    {
      w.i("MicroMsg.FTS.FTSDetailAdapter", "searchType=%d | uiLogicType=%d", new Object[] { Integer.valueOf(i), Integer.valueOf(i) });
      HashSet localHashSet = new HashSet();
      localHashSet.add(Integer.valueOf(i));
      this.pmv = ((i)h.a(localHashSet, paramc, this, paramInt2).get(0));
      this.pmw = new com.tencent.mm.ay.c();
      GMTrace.o(11823105441792L, 88089);
      return;
      i = 4112;
      continue;
      i = 4128;
      continue;
      i = 4160;
      continue;
      i = 4144;
      continue;
      i = 4176;
      continue;
      i = 4192;
      continue;
      i = 4208;
    }
  }
  
  public final void a(i parami, String paramString)
  {
    GMTrace.i(16462341210112L, 122654);
    if (paramString.equals(this.fIW)) {
      this.nrh = false;
    }
    tp(parami.nQ(0));
    notifyDataSetChanged();
    C(getCount(), true);
    this.pmw.hJr = System.currentTimeMillis();
    paramString = this.pmw;
    parami = ((com.tencent.mm.plugin.fts.d.c)parami).mmR.iterator();
    while (parami.hasNext())
    {
      i.a locala = (i.a)parami.next();
      int i = paramString.hJs;
      paramString.hJs = (locala.mnk.size() + i);
    }
    GMTrace.o(16462341210112L, 122654);
  }
  
  protected final boolean a(a parama)
  {
    GMTrace.i(16462206992384L, 122653);
    if (parama.mnG)
    {
      w.d("MicroMsg.FTS.FTSDetailAdapter", "searchType=%d | searchScene=%d | kvPosition=%d | kvSubPosition=%d | kvSearchId=%s | kvDocId=%d", new Object[] { Integer.valueOf(parama.mny), Integer.valueOf(parama.mmQ), Integer.valueOf(parama.mnz), Integer.valueOf(parama.mnA), parama.mnB, Long.valueOf(parama.mnC) });
      if (!this.pmx)
      {
        com.tencent.mm.ay.g.a(this.fIW, true, bbW(), parama.mny, false);
        this.pmx = true;
      }
      com.tencent.mm.ay.g.a(parama, this.pmw);
    }
    for (;;)
    {
      GMTrace.o(16462206992384L, 122653);
      return false;
      if ((parama instanceof com.tencent.mm.plugin.search.ui.a.c))
      {
        this.pmA = true;
        com.tencent.mm.ay.g.a(parama, this.pmw);
      }
    }
  }
  
  protected final void bbR()
  {
    GMTrace.i(11823373877248L, 88091);
    this.nrh = true;
    this.pmx = false;
    this.pmw.reset();
    this.pmv.a(this.fIW, this.plB, new HashSet());
    GMTrace.o(11823373877248L, 88091);
  }
  
  protected final void clearCache()
  {
    GMTrace.i(11823508094976L, 88092);
    super.clearCache();
    this.pmv.Tn();
    this.pmv.aBw();
    this.pmz.removeMessages(1);
    GMTrace.o(11823508094976L, 88092);
  }
  
  public final void finish()
  {
    GMTrace.i(11823776530432L, 88094);
    if (!this.pmx)
    {
      this.pmx = true;
      if (!this.pmA) {
        com.tencent.mm.ay.g.a(this.fIW, false, bbW(), this.mny, false);
      }
    }
    this.pmw.reset();
    super.finish();
    GMTrace.o(11823776530432L, 88094);
  }
  
  protected final a nR(int paramInt)
  {
    GMTrace.i(16462072774656L, 122652);
    a locala = this.pmv.nR(paramInt);
    if (locala != null) {
      locala.mnz = paramInt;
    }
    GMTrace.o(16462072774656L, 122652);
    return locala;
  }
  
  public final void onScrollStateChanged(AbsListView paramAbsListView, int paramInt)
  {
    GMTrace.i(11824044965888L, 88096);
    super.onScrollStateChanged(paramAbsListView, paramInt);
    if (paramInt == 2)
    {
      this.pmy = true;
      com.tencent.mm.plugin.search.a.c.bbO().aBz();
      n.pXS.pause();
      w.d("MicroMsg.FTS.FTSDetailAdapter", "ImageEngine attach is false");
      GMTrace.o(11824044965888L, 88096);
      return;
    }
    this.pmy = false;
    if (!com.tencent.mm.plugin.search.a.c.bbO().aBA())
    {
      this.pmz.removeMessages(1);
      this.pmz.sendEmptyMessageDelayed(1, 200L);
    }
    GMTrace.o(11824044965888L, 88096);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/search/ui/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */