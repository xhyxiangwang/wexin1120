package com.tencent.mm.plugin.search.ui.c;

import android.content.Context;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.kernel.h;
import com.tencent.mm.plugin.fts.a.a.g;
import com.tencent.mm.plugin.fts.a.a.i;
import com.tencent.mm.plugin.fts.a.l;
import com.tencent.mm.plugin.fts.d.c;
import com.tencent.mm.plugin.fts.d.i.a;
import com.tencent.mm.plugin.fts.d.i.b;
import com.tencent.mm.sdk.platformtools.ae;
import java.util.HashSet;
import java.util.List;

public final class j
  extends c
{
  public j(Context paramContext, i.b paramb, int paramInt)
  {
    super(paramContext, paramb, paramInt);
    GMTrace.i(16464891346944L, 122673);
    GMTrace.o(16464891346944L, 122673);
  }
  
  protected final com.tencent.mm.plugin.fts.a.a.a a(ae paramae, HashSet<String> paramHashSet)
  {
    GMTrace.i(18362327367680L, 136810);
    com.tencent.mm.plugin.fts.a.a.f localf = new com.tencent.mm.plugin.fts.a.a.f();
    localf.fIW = this.fIW;
    localf.mky = paramHashSet;
    localf.mkA = this;
    localf.handler = paramae;
    localf.mku = 1;
    localf.mkx = 3;
    paramae = ((l)h.j(l.class)).search(3, localf);
    GMTrace.o(18362327367680L, 136810);
    return paramae;
  }
  
  protected final com.tencent.mm.plugin.fts.d.a.a a(int paramInt, i.a parama)
  {
    GMTrace.i(16465294000128L, 122676);
    int i = paramInt - parama.mng - 1;
    i locali = null;
    Object localObject = locali;
    if (i < parama.mnk.size())
    {
      localObject = locali;
      if (i >= 0)
      {
        locali = (i)parama.mnk.get(i);
        localObject = new com.tencent.mm.plugin.search.ui.a.f(paramInt);
        ((com.tencent.mm.plugin.search.ui.a.f)localObject).iOg = locali;
        ((com.tencent.mm.plugin.search.ui.a.f)localObject).iOh = parama.iOh;
        ((com.tencent.mm.plugin.search.ui.a.f)localObject).cf(locali.type, locali.hJy);
      }
    }
    if (localObject != null) {
      ((com.tencent.mm.plugin.fts.d.a.a)localObject).mnA = (i + 1);
    }
    GMTrace.o(16465294000128L, 122676);
    return (com.tencent.mm.plugin.fts.d.a.a)localObject;
  }
  
  protected final void a(g paramg, HashSet<String> paramHashSet)
  {
    GMTrace.i(18362461585408L, 136811);
    paramg = paramg.mkD;
    if (aG(paramg))
    {
      paramHashSet = new i.a();
      paramHashSet.hJx = -2;
      paramHashSet.iOh = this.iOh;
      paramHashSet.mnk = paramg;
      if (paramHashSet.mnk.size() > 3)
      {
        paramHashSet.mnj = true;
        paramHashSet.mnk = paramHashSet.mnk.subList(0, 3);
      }
      this.mmR.add(paramHashSet);
    }
    GMTrace.o(18362461585408L, 136811);
  }
  
  public final int getType()
  {
    GMTrace.i(11861357494272L, 88374);
    GMTrace.o(11861357494272L, 88374);
    return 112;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/search/ui/c/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */