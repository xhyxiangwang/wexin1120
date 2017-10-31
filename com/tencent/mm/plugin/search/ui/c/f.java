package com.tencent.mm.plugin.search.ui.c;

import android.content.Context;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.kernel.h;
import com.tencent.mm.plugin.fts.a.a.g;
import com.tencent.mm.plugin.fts.a.a.i;
import com.tencent.mm.plugin.fts.a.l;
import com.tencent.mm.plugin.fts.d.i.a;
import com.tencent.mm.plugin.fts.d.i.b;
import com.tencent.mm.plugin.search.ui.a.d;
import com.tencent.mm.sdk.platformtools.ae;
import java.util.HashSet;
import java.util.List;

public final class f
  extends com.tencent.mm.plugin.fts.d.c
{
  public f(Context paramContext, i.b paramb, int paramInt)
  {
    super(paramContext, paramb, paramInt);
    GMTrace.i(16467844136960L, 122695);
    GMTrace.o(16467844136960L, 122695);
  }
  
  protected final com.tencent.mm.plugin.fts.a.a.a a(ae paramae, HashSet<String> paramHashSet)
  {
    GMTrace.i(18364340633600L, 136825);
    com.tencent.mm.plugin.fts.a.a.f localf = new com.tencent.mm.plugin.fts.a.a.f();
    localf.fIW = this.fIW;
    localf.handler = paramae;
    localf.mky = paramHashSet;
    localf.mkA = this;
    localf.mkz = com.tencent.mm.plugin.fts.a.b.c.mkV;
    paramae = ((l)h.j(l.class)).search(4, localf);
    GMTrace.o(18364340633600L, 136825);
    return paramae;
  }
  
  public final com.tencent.mm.plugin.fts.d.a.a a(int paramInt, i parami, List<String> paramList)
  {
    GMTrace.i(18364609069056L, 136827);
    d locald = new d(paramInt);
    locald.iOg = parami;
    locald.iOh = paramList;
    locald.cf(parami.type, parami.hJy);
    GMTrace.o(18364609069056L, 136827);
    return locald;
  }
  
  protected final com.tencent.mm.plugin.fts.d.a.a a(int paramInt, i.a parama)
  {
    GMTrace.i(16468246790144L, 122698);
    int i = paramInt - parama.mng - 1;
    Object localObject2 = null;
    Object localObject1 = localObject2;
    if (i < parama.mnk.size())
    {
      localObject1 = localObject2;
      if (i >= 0) {
        localObject1 = a(paramInt, (i)parama.mnk.get(i), parama.iOh);
      }
    }
    if (localObject1 != null) {
      ((com.tencent.mm.plugin.fts.d.a.a)localObject1).mnA = (i + 1);
    }
    GMTrace.o(16468246790144L, 122698);
    return (com.tencent.mm.plugin.fts.d.a.a)localObject1;
  }
  
  protected final void a(g paramg, HashSet<String> paramHashSet)
  {
    GMTrace.i(18364474851328L, 136826);
    paramg = paramg.mkD;
    if (aG(paramg))
    {
      paramHashSet = new i.a();
      paramHashSet.hJx = -6;
      paramHashSet.iOh = this.iOh;
      paramHashSet.mnk = paramg;
      this.mmR.add(paramHashSet);
    }
    GMTrace.o(18364474851328L, 136826);
  }
  
  public final int getType()
  {
    GMTrace.i(11859881099264L, 88363);
    GMTrace.o(11859881099264L, 88363);
    return 64;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/search/ui/c/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */