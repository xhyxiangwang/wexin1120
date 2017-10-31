package com.tencent.mm.plugin.appbrand.f;

import android.content.Context;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.kernel.h;
import com.tencent.mm.plugin.fts.a.a.i;
import com.tencent.mm.plugin.fts.a.l;
import com.tencent.mm.plugin.fts.d.c;
import com.tencent.mm.plugin.fts.d.i.a;
import com.tencent.mm.plugin.fts.d.i.b;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.w;
import java.util.HashSet;
import java.util.List;

public final class f
  extends c
{
  public f(Context paramContext, i.b paramb, int paramInt)
  {
    super(paramContext, paramb, paramInt);
    GMTrace.i(16547972120576L, 123292);
    GMTrace.o(16547972120576L, 123292);
  }
  
  protected final com.tencent.mm.plugin.fts.a.a.a a(ae paramae, HashSet<String> paramHashSet)
  {
    GMTrace.i(18199252828160L, 135595);
    com.tencent.mm.plugin.fts.a.a.f localf = new com.tencent.mm.plugin.fts.a.a.f();
    localf.fIW = this.fIW;
    localf.mkz = com.tencent.mm.plugin.fts.a.b.d.mkW;
    localf.mkA = this;
    localf.handler = paramae;
    localf.mky = paramHashSet;
    paramae = ((l)h.j(l.class)).search(7, localf);
    GMTrace.o(18199252828160L, 135595);
    return paramae;
  }
  
  protected final com.tencent.mm.plugin.fts.d.a.a a(int paramInt, i.a parama)
  {
    GMTrace.i(16548374773760L, 123295);
    int i = paramInt - parama.mng - 1;
    i locali = null;
    Object localObject = locali;
    if (i < parama.mnk.size())
    {
      localObject = locali;
      if (i >= 0)
      {
        locali = (i)parama.mnk.get(i);
        localObject = new d(paramInt);
        ((d)localObject).iOg = locali;
        ((d)localObject).iOh = parama.iOh;
      }
    }
    if (localObject != null) {
      ((com.tencent.mm.plugin.fts.d.a.a)localObject).mnA = (i + 1);
    }
    GMTrace.o(16548374773760L, 123295);
    return (com.tencent.mm.plugin.fts.d.a.a)localObject;
  }
  
  protected final void a(com.tencent.mm.plugin.fts.a.a.g paramg, HashSet<String> paramHashSet)
  {
    GMTrace.i(18199387045888L, 135596);
    List localList = paramg.mkD;
    if ((localList != null) && (!localList.isEmpty()))
    {
      com.tencent.mm.modelsns.d locald = new com.tencent.mm.modelsns.d();
      paramHashSet = this.fIW;
      paramg = paramHashSet;
      if (paramHashSet != null) {
        paramg = paramHashSet.replaceAll(",", " ");
      }
      locald.m("20KeyWordId", paramg + ",");
      locald.m("21ViewType", "2,");
      locald.m("22OpType", "1,");
      locald.m("23ResultCount", localList.size() + ",");
      locald.m("24ClickPos", ",");
      locald.m("25ClickAppUserName", ",");
      w.i("MicroMsg.FTSWeAppDetailUIUnit", "report oreh LocalSearchWeApp(13963), %s", new Object[] { locald.LL() });
      com.tencent.mm.plugin.report.service.g.paX.i(13963, new Object[] { locald });
    }
    if (aG(localList))
    {
      paramg = new i.a();
      paramg.hJx = -13;
      paramg.iOh = this.iOh;
      paramg.mnk = localList;
      this.mmR.add(paramg);
    }
    GMTrace.o(18199387045888L, 135596);
  }
  
  public final int getType()
  {
    GMTrace.i(10655142772736L, 79387);
    GMTrace.o(10655142772736L, 79387);
    return 4208;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/f/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */