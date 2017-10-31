package com.tencent.mm.plugin.search.ui;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.kernel.h;
import com.tencent.mm.plugin.fts.a.a.g;
import com.tencent.mm.plugin.fts.a.a.i;
import com.tencent.mm.plugin.fts.a.b.e;
import com.tencent.mm.plugin.fts.a.j;
import com.tencent.mm.plugin.fts.a.l;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.util.List;

public final class d
  extends b
  implements j
{
  private String fAJ;
  private List<String> iOh;
  private ae jht;
  private com.tencent.mm.plugin.fts.a.a.a mkB;
  private List<i> mnk;
  
  public d(c paramc, String paramString)
  {
    super(paramc);
    GMTrace.i(11872766001152L, 88459);
    this.jht = new ae();
    this.fAJ = paramString;
    GMTrace.o(11872766001152L, 88459);
  }
  
  public final void a(g paramg)
  {
    GMTrace.i(18368098729984L, 136853);
    switch (paramg.aHi)
    {
    }
    for (;;)
    {
      GMTrace.o(18368098729984L, 136853);
      return;
      this.mnk = paramg.mkD;
      this.iOh = bg.f(paramg.mkC);
      tp(this.mnk.size());
      notifyDataSetChanged();
      C(getCount(), true);
      GMTrace.o(18368098729984L, 136853);
      return;
      tp(0);
      notifyDataSetChanged();
      C(getCount(), true);
    }
  }
  
  protected final boolean a(com.tencent.mm.plugin.fts.d.a.a parama)
  {
    GMTrace.i(16482339651584L, 122803);
    GMTrace.o(16482339651584L, 122803);
    return false;
  }
  
  protected final void bbR()
  {
    GMTrace.i(11873034436608L, 88461);
    if (this.mkB != null) {
      ((l)h.j(l.class)).cancelSearchTask(this.mkB);
    }
    com.tencent.mm.plugin.fts.a.a.f localf = new com.tencent.mm.plugin.fts.a.a.f();
    localf.fIW = this.fIW;
    localf.fAJ = this.fAJ;
    localf.mkz = e.mkX;
    localf.mkA = this;
    localf.handler = this.jht;
    localf.mku = 3;
    this.mkB = ((l)h.j(l.class)).search(3, localf);
    w.i("MicroMSsg.FTS.FTSChattingTalkerAdapter", "do search %s", new Object[] { this.fIW });
    GMTrace.o(11873034436608L, 88461);
  }
  
  protected final com.tencent.mm.plugin.fts.d.a.a nR(int paramInt)
  {
    GMTrace.i(16482071216128L, 122801);
    com.tencent.mm.plugin.search.ui.a.f localf = new com.tencent.mm.plugin.search.ui.a.f(paramInt);
    localf.iOg = ((i)this.mnk.get(paramInt));
    localf.iOh = this.iOh;
    localf.mny = -12;
    localf.fIW = this.fIW;
    localf.mnz = paramInt;
    if (localf.position == getCount() - 1) {
      localf.mnx = true;
    }
    GMTrace.o(16482071216128L, 122801);
    return localf;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/search/ui/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */