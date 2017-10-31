package com.tencent.mm.plugin.appbrand.f;

import android.content.Context;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.fts.a.a.f;
import com.tencent.mm.plugin.fts.a.a.i;
import com.tencent.mm.plugin.fts.a.l;
import com.tencent.mm.plugin.fts.d.c;
import com.tencent.mm.plugin.fts.d.i.a;
import com.tencent.mm.plugin.fts.d.i.b;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.w;
import java.util.HashSet;
import java.util.List;

public final class h
  extends c
{
  public h(Context paramContext, i.b paramb, int paramInt)
  {
    super(paramContext, paramb, paramInt);
    GMTrace.i(16545287766016L, 123272);
    GMTrace.o(16545287766016L, 123272);
  }
  
  protected final com.tencent.mm.plugin.fts.a.a.a a(ae paramae, HashSet<String> paramHashSet)
  {
    GMTrace.i(18198984392704L, 135593);
    f localf = new f();
    localf.fIW = this.fIW;
    localf.mkz = com.tencent.mm.plugin.fts.a.b.d.mkW;
    localf.mkA = this;
    localf.handler = paramae;
    localf.mky = paramHashSet;
    paramae = ((l)com.tencent.mm.kernel.h.j(l.class)).search(7, localf);
    GMTrace.o(18198984392704L, 135593);
    return paramae;
  }
  
  protected final com.tencent.mm.plugin.fts.d.a.a a(int paramInt, i.a parama)
  {
    GMTrace.i(16545690419200L, 123275);
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
    GMTrace.o(16545690419200L, 123275);
    return (com.tencent.mm.plugin.fts.d.a.a)localObject;
  }
  
  protected final void a(com.tencent.mm.plugin.fts.a.a.g paramg, HashSet<String> paramHashSet)
  {
    GMTrace.i(18199118610432L, 135594);
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
      locald.m("21ViewType", "1,");
      locald.m("22OpType", "1,");
      locald.m("23ResultCount", localList.size() + ",");
      locald.m("24ClickPos", ",");
      locald.m("25ClickAppUserName", ",");
      w.i("MicroMsg.FTSWeAppUIUnit", "report oreh LocalSearchWeApp(13963), %s", new Object[] { locald.LL() });
      com.tencent.mm.plugin.report.service.g.paX.i(13963, new Object[] { locald });
    }
    if (aG(localList))
    {
      paramg = new i.a();
      paramg.hJx = -13;
      paramg.iOh = this.iOh;
      paramg.mnk = localList;
      if (paramg.mnk.size() > 3)
      {
        paramg.mnj = true;
        paramg.mnk = paramg.mnk.subList(0, 3);
      }
      this.mmR.add(paramg);
    }
    GMTrace.o(18199118610432L, 135594);
  }
  
  public final int getType()
  {
    GMTrace.i(10658095562752L, 79409);
    GMTrace.o(10658095562752L, 79409);
    return 144;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/f/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */