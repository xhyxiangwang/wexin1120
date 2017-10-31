package com.tencent.mm.plugin.search.ui.c;

import android.content.Context;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.kernel.h;
import com.tencent.mm.plugin.fts.a.a.f;
import com.tencent.mm.plugin.fts.a.a.i;
import com.tencent.mm.plugin.fts.a.l;
import com.tencent.mm.plugin.fts.d.i.a;
import com.tencent.mm.plugin.fts.d.i.b;
import com.tencent.mm.plugin.search.ui.a.e;
import com.tencent.mm.sdk.platformtools.ae;
import java.util.HashSet;
import java.util.List;

public final class g
  extends com.tencent.mm.plugin.fts.d.c
{
  public g(Context paramContext, i.b paramb, int paramInt)
  {
    super(paramContext, paramb, paramInt);
    GMTrace.i(16468515225600L, 122700);
    GMTrace.o(16468515225600L, 122700);
  }
  
  protected final com.tencent.mm.plugin.fts.a.a.a a(ae paramae, HashSet<String> paramHashSet)
  {
    GMTrace.i(18364743286784L, 136828);
    f localf = new f();
    localf.fIW = this.fIW;
    localf.mkA = this;
    localf.handler = paramae;
    localf.mky = paramHashSet;
    localf.mkz = com.tencent.mm.plugin.fts.a.b.c.mkV;
    paramae = ((l)h.j(l.class)).search(5, localf);
    GMTrace.o(18364743286784L, 136828);
    return paramae;
  }
  
  protected final com.tencent.mm.plugin.fts.d.a.a a(int paramInt, i.a parama)
  {
    GMTrace.i(16468917878784L, 122703);
    int i = paramInt - parama.mng - 1;
    i locali = null;
    Object localObject = locali;
    if (i < parama.mnk.size())
    {
      localObject = locali;
      if (i >= 0)
      {
        locali = (i)parama.mnk.get(i);
        localObject = new e(paramInt);
        ((e)localObject).iOg = locali;
        ((e)localObject).iOh = parama.iOh;
        ((e)localObject).cf(locali.type, locali.hJy);
      }
    }
    if (localObject != null) {
      ((com.tencent.mm.plugin.fts.d.a.a)localObject).mnA = (i + 1);
    }
    GMTrace.o(16468917878784L, 122703);
    return (com.tencent.mm.plugin.fts.d.a.a)localObject;
  }
  
  protected final void a(com.tencent.mm.plugin.fts.a.a.g paramg, HashSet<String> paramHashSet)
  {
    GMTrace.i(18364877504512L, 136829);
    paramg = paramg.mkD;
    if (aG(paramg))
    {
      paramHashSet = new i.a();
      paramHashSet.hJx = -5;
      paramHashSet.iOh = this.iOh;
      paramHashSet.mnk = paramg;
      this.mmR.add(paramHashSet);
    }
    GMTrace.o(18364877504512L, 136829);
  }
  
  public final int getType()
  {
    GMTrace.i(16469052096512L, 122704);
    GMTrace.o(16469052096512L, 122704);
    return 4144;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/search/ui/c/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */