package com.tencent.mm.plugin.search.ui.c;

import android.content.Context;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.kernel.h;
import com.tencent.mm.plugin.fts.a.a.f;
import com.tencent.mm.plugin.fts.a.a.i;
import com.tencent.mm.plugin.fts.a.b.b;
import com.tencent.mm.plugin.fts.d.c;
import com.tencent.mm.plugin.fts.d.i.a;
import com.tencent.mm.plugin.fts.d.i.b;
import com.tencent.mm.sdk.platformtools.ae;
import java.util.HashSet;
import java.util.List;

public final class e
  extends c
{
  public e(Context paramContext, i.b paramb, int paramInt)
  {
    super(paramContext, paramb, paramInt);
    GMTrace.i(16463683387392L, 122664);
    GMTrace.o(16463683387392L, 122664);
  }
  
  protected final com.tencent.mm.plugin.fts.a.a.a a(ae paramae, HashSet<String> paramHashSet)
  {
    GMTrace.i(18365280157696L, 136832);
    f localf = new f();
    localf.mku = 48;
    localf.fIW = this.fIW;
    localf.mkv = new int[] { 131072 };
    localf.mkx = 3;
    localf.mkz = b.mkU;
    localf.mky = paramHashSet;
    localf.mkA = this;
    localf.handler = paramae;
    paramae = ((com.tencent.mm.plugin.fts.a.l)h.j(com.tencent.mm.plugin.fts.a.l.class)).search(2, localf);
    GMTrace.o(18365280157696L, 136832);
    return paramae;
  }
  
  public final com.tencent.mm.plugin.fts.d.a.a a(int paramInt, i parami, List<String> paramList)
  {
    GMTrace.i(18365548593152L, 136834);
    Object localObject = null;
    if (parami.type == 131072)
    {
      localObject = new com.tencent.mm.plugin.search.ui.a.l(paramInt);
      ((com.tencent.mm.plugin.search.ui.a.l)localObject).iOg = parami;
      ((com.tencent.mm.plugin.search.ui.a.l)localObject).iOh = paramList;
      ((com.tencent.mm.plugin.search.ui.a.l)localObject).cf(parami.type, parami.hJy);
    }
    for (;;)
    {
      GMTrace.o(18365548593152L, 136834);
      return (com.tencent.mm.plugin.fts.d.a.a)localObject;
      if ((parami.type == 131073) || (parami.type == 131074))
      {
        localObject = new com.tencent.mm.plugin.search.ui.a.g(paramInt);
        ((com.tencent.mm.plugin.search.ui.a.g)localObject).iOg = parami;
        ((com.tencent.mm.plugin.search.ui.a.g)localObject).iOh = paramList;
        ((com.tencent.mm.plugin.search.ui.a.g)localObject).cf(parami.type, parami.hJy);
      }
    }
  }
  
  protected final com.tencent.mm.plugin.fts.d.a.a a(int paramInt, i.a parama)
  {
    GMTrace.i(16464086040576L, 122667);
    int i = 0;
    if (parama.mnh)
    {
      i = paramInt - parama.mng - 1;
      if ((i < parama.mnk.size()) && (i >= 0))
      {
        i locali = (i)parama.mnk.get(i);
        parama = a(paramInt, locali, parama.iOh);
        if (parama != null) {
          parama.cf(locali.type, locali.hJy);
        }
        paramInt = i;
      }
    }
    for (;;)
    {
      if (parama != null) {
        parama.mnA = (paramInt + 1);
      }
      GMTrace.o(16464086040576L, 122667);
      return parama;
      paramInt = i;
      parama = null;
      continue;
      parama = null;
      paramInt = i;
    }
  }
  
  protected final void a(com.tencent.mm.plugin.fts.a.a.g paramg, HashSet<String> paramHashSet)
  {
    GMTrace.i(18365414375424L, 136833);
    paramg = paramg.mkD;
    paramHashSet = new i.a();
    paramHashSet.hJx = -4;
    paramHashSet.mnk = paramg;
    paramHashSet.mnh = aG(paramg);
    paramHashSet.iOh = this.iOh;
    if (paramHashSet.mnk.size() > 3)
    {
      paramHashSet.mnj = true;
      paramHashSet.mnk = paramHashSet.mnk.subList(0, 3);
    }
    if (aG(paramg)) {
      this.mmR.add(paramHashSet);
    }
    GMTrace.o(18365414375424L, 136833);
  }
  
  public final int getType()
  {
    GMTrace.i(11864310284288L, 88396);
    GMTrace.o(11864310284288L, 88396);
    return 32;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/search/ui/c/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */