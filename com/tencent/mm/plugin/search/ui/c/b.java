package com.tencent.mm.plugin.search.ui.c;

import android.content.Context;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.kernel.h;
import com.tencent.mm.plugin.fts.a.a.f;
import com.tencent.mm.plugin.fts.a.a.g;
import com.tencent.mm.plugin.fts.a.a.i;
import com.tencent.mm.plugin.fts.a.l;
import com.tencent.mm.plugin.fts.d.i.a;
import com.tencent.mm.plugin.fts.d.i.b;
import com.tencent.mm.plugin.search.ui.a.k;
import com.tencent.mm.sdk.platformtools.ae;
import java.util.HashSet;
import java.util.List;

public final class b
  extends com.tencent.mm.plugin.fts.d.c
{
  public b(Context paramContext, i.b paramb, int paramInt)
  {
    super(paramContext, paramb, paramInt);
    GMTrace.i(16466636177408L, 122686);
    GMTrace.o(16466636177408L, 122686);
  }
  
  protected final com.tencent.mm.plugin.fts.a.a.a a(ae paramae, HashSet<String> paramHashSet)
  {
    GMTrace.i(18363535327232L, 136819);
    f localf = new f();
    localf.mku = 32;
    localf.fIW = this.fIW;
    localf.mky = paramHashSet;
    localf.mkz = com.tencent.mm.plugin.fts.a.b.a.mkT;
    localf.mkA = this;
    localf.handler = paramae;
    paramae = ((l)h.j(l.class)).search(2, localf);
    GMTrace.o(18363535327232L, 136819);
    return paramae;
  }
  
  protected final com.tencent.mm.plugin.fts.d.a.a a(int paramInt, i.a parama)
  {
    GMTrace.i(16467038830592L, 122689);
    int i = paramInt - parama.mng - 1;
    i locali = null;
    Object localObject = locali;
    if (i < parama.mnk.size())
    {
      localObject = locali;
      if (i >= 0)
      {
        locali = (i)parama.mnk.get(i);
        if (!locali.mkj.equals("create_chatroom​")) {
          break label116;
        }
        localObject = new com.tencent.mm.plugin.search.ui.a.c(paramInt);
        ((com.tencent.mm.plugin.search.ui.a.c)localObject).iOh = parama.iOh;
      }
    }
    for (;;)
    {
      if (localObject != null) {
        ((com.tencent.mm.plugin.fts.d.a.a)localObject).mnA = (i + 1);
      }
      GMTrace.o(16467038830592L, 122689);
      return (com.tencent.mm.plugin.fts.d.a.a)localObject;
      label116:
      localObject = new k(paramInt);
      ((k)localObject).iOg = locali;
      ((k)localObject).iOh = parama.iOh;
      ((k)localObject).cf(locali.type, locali.hJy);
    }
  }
  
  protected final void a(g paramg, HashSet<String> paramHashSet)
  {
    GMTrace.i(18363669544960L, 136820);
    paramg = paramg.mkD;
    if (aG(paramg))
    {
      paramHashSet = new i.a();
      paramHashSet.hJx = -3;
      paramHashSet.mnk = paramg;
      paramHashSet.iOh = this.iOh;
      paramHashSet.mnj = false;
      this.mmR.add(paramHashSet);
    }
    GMTrace.o(18363669544960L, 136820);
  }
  
  public final int getType()
  {
    GMTrace.i(11860686405632L, 88369);
    GMTrace.o(11860686405632L, 88369);
    return 4128;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/search/ui/c/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */