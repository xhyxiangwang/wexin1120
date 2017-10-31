package com.tencent.mm.plugin.search.ui.c;

import android.content.Context;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.kernel.h;
import com.tencent.mm.plugin.fts.a.a.f;
import com.tencent.mm.plugin.fts.a.a.g;
import com.tencent.mm.plugin.fts.a.l;
import com.tencent.mm.plugin.fts.d.a.b;
import com.tencent.mm.plugin.fts.d.i.a;
import com.tencent.mm.plugin.fts.d.i.b;
import com.tencent.mm.plugin.search.ui.a.j;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.storage.q;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public final class k
  extends com.tencent.mm.plugin.fts.d.c
{
  public String fAJ;
  public q pop;
  
  public k(Context paramContext, i.b paramb, int paramInt)
  {
    super(paramContext, paramb, paramInt);
    GMTrace.i(16462475427840L, 122655);
    GMTrace.o(16462475427840L, 122655);
  }
  
  protected final com.tencent.mm.plugin.fts.a.a.a a(ae paramae, HashSet<String> paramHashSet)
  {
    GMTrace.i(18362864238592L, 136814);
    paramHashSet = new f();
    paramHashSet.fIW = this.fIW;
    paramHashSet.fAJ = this.fAJ;
    paramHashSet.mkA = this;
    paramHashSet.handler = paramae;
    paramHashSet.mku = 3;
    paramae = ((l)h.j(l.class)).search(3, paramHashSet);
    GMTrace.o(18362864238592L, 136814);
    return paramae;
  }
  
  protected final com.tencent.mm.plugin.fts.d.a.a a(int paramInt, i.a parama)
  {
    GMTrace.i(16463012298752L, 122659);
    if (parama.mnh) {}
    for (int i = paramInt - 1;; i = 0)
    {
      com.tencent.mm.plugin.fts.a.a.i locali1;
      if ((i < parama.mnk.size()) && (i >= 0))
      {
        locali1 = (com.tencent.mm.plugin.fts.a.a.i)parama.mnk.get(i);
        if (locali1.mkj.equals("no_result​")) {
          parama = new com.tencent.mm.plugin.fts.d.a.c(paramInt);
        }
      }
      for (;;)
      {
        if (parama != null) {
          parama.mnA = (paramInt + 1);
        }
        GMTrace.o(16463012298752L, 122659);
        return parama;
        com.tencent.mm.plugin.search.ui.a.i locali = new com.tencent.mm.plugin.search.ui.a.i(i);
        locali.iOg = locali1;
        locali.iOh = parama.iOh;
        locali.pop = this.pop;
        locali.cf(locali1.type, locali1.hJy);
        parama = locali;
        continue;
        parama = null;
      }
    }
  }
  
  protected final void a(g paramg, HashSet<String> paramHashSet)
  {
    GMTrace.i(18362998456320L, 136815);
    paramHashSet = paramg.mkD;
    paramg = new i.a();
    paramg.hJx = -2;
    paramg.iOh = this.iOh;
    if (paramHashSet.size() == 0)
    {
      paramg.mnh = false;
      paramHashSet = new com.tencent.mm.plugin.fts.a.a.i();
      paramHashSet.mkj = "no_result​";
      paramg.mnk = new ArrayList();
      paramg.mnk.add(paramHashSet);
    }
    for (;;)
    {
      this.mmR.add(paramg);
      GMTrace.o(18362998456320L, 136815);
      return;
      paramg.mnk = paramHashSet;
    }
  }
  
  protected final b b(int paramInt, i.a parama)
  {
    GMTrace.i(17433003819008L, 129886);
    j localj = new j(paramInt);
    localj.fAJ = this.fAJ;
    localj.count = parama.mnk.size();
    GMTrace.o(17433003819008L, 129886);
    return localj;
  }
  
  public final int getType()
  {
    GMTrace.i(16462609645568L, 122656);
    GMTrace.o(16462609645568L, 122656);
    return 160;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/search/ui/c/k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */