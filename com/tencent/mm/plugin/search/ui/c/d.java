package com.tencent.mm.plugin.search.ui.c;

import android.content.Context;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.kernel.h;
import com.tencent.mm.plugin.fts.a.a.f;
import com.tencent.mm.plugin.fts.a.a.g;
import com.tencent.mm.plugin.fts.a.a.i;
import com.tencent.mm.plugin.fts.a.b.b;
import com.tencent.mm.plugin.fts.d.c;
import com.tencent.mm.plugin.fts.d.i.a;
import com.tencent.mm.plugin.fts.d.i.b;
import com.tencent.mm.sdk.platformtools.ae;
import java.util.HashSet;
import java.util.List;

public final class d
  extends c
{
  public d(Context paramContext, i.b paramb, int paramInt)
  {
    super(paramContext, paramb, paramInt);
    GMTrace.i(16463146516480L, 122660);
    GMTrace.o(16463146516480L, 122660);
  }
  
  protected final com.tencent.mm.plugin.fts.a.a.a a(ae paramae, HashSet<String> paramHashSet)
  {
    GMTrace.i(18364072198144L, 136823);
    f localf = new f();
    localf.fIW = this.fIW;
    localf.mkv = new int[] { 131072 };
    localf.mkz = b.mkU;
    localf.mky = paramHashSet;
    localf.mkA = this;
    localf.handler = paramae;
    localf.mku = 16;
    paramae = ((com.tencent.mm.plugin.fts.a.l)h.j(com.tencent.mm.plugin.fts.a.l.class)).search(2, localf);
    GMTrace.o(18364072198144L, 136823);
    return paramae;
  }
  
  protected final com.tencent.mm.plugin.fts.d.a.a a(int paramInt, i.a parama)
  {
    GMTrace.i(16463549169664L, 122663);
    int i = paramInt - parama.mng - 1;
    i locali = null;
    Object localObject = locali;
    if (i < parama.mnk.size())
    {
      localObject = locali;
      if (i >= 0)
      {
        locali = (i)parama.mnk.get(i);
        localObject = new com.tencent.mm.plugin.search.ui.a.l(paramInt);
        ((com.tencent.mm.plugin.search.ui.a.l)localObject).iOg = locali;
        ((com.tencent.mm.plugin.search.ui.a.l)localObject).iOh = parama.iOh;
        ((com.tencent.mm.plugin.search.ui.a.l)localObject).cf(locali.type, locali.hJy);
      }
    }
    if (localObject != null) {
      ((com.tencent.mm.plugin.fts.d.a.a)localObject).mnA = (i + 1);
    }
    GMTrace.o(16463549169664L, 122663);
    return (com.tencent.mm.plugin.fts.d.a.a)localObject;
  }
  
  protected final void a(g paramg, HashSet<String> paramHashSet)
  {
    GMTrace.i(18364206415872L, 136824);
    paramg = paramg.mkD;
    if (aG(paramg))
    {
      paramHashSet = new i.a();
      paramHashSet.hJx = -4;
      paramHashSet.mnk = paramg;
      paramHashSet.iOh = this.iOh;
      paramHashSet.mnj = false;
      this.mmR.add(paramHashSet);
    }
    GMTrace.o(18364206415872L, 136824);
  }
  
  public final int getType()
  {
    GMTrace.i(11865786679296L, 88407);
    GMTrace.o(11865786679296L, 88407);
    return 4112;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/search/ui/c/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */