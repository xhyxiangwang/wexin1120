package com.tencent.mm.plugin.sns.e;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.a.pe;
import com.tencent.mm.plugin.sns.data.i;
import com.tencent.mm.plugin.sns.model.ae;
import com.tencent.mm.plugin.sns.model.am;
import com.tencent.mm.plugin.sns.model.b;
import com.tencent.mm.plugin.sns.model.b.b;
import com.tencent.mm.sdk.b.c;
import com.tencent.mm.sdk.platformtools.w;

public final class a
  implements b.b
{
  public c pYF;
  
  public a()
  {
    GMTrace.i(8861993926656L, 66027);
    this.pYF = new c() {};
    com.tencent.mm.sdk.b.a.uLm.b(this.pYF);
    ae.bhk().a(this);
    GMTrace.o(8861993926656L, 66027);
  }
  
  public final void Gm(String paramString)
  {
    GMTrace.i(8862128144384L, 66028);
    w.i("MicroMsg.FTS.FTSSnsImageDownloadLogic", "onThumbFinish mediaId=%s", new Object[] { paramString });
    pe localpe = new pe();
    localpe.fNe.fvy = 2;
    localpe.fNe.mediaId = paramString;
    String str = am.dt(ae.getAccSnsPath(), paramString);
    localpe.fNe.path = (str + i.FV(paramString));
    com.tencent.mm.sdk.b.a.uLm.m(localpe);
    GMTrace.o(8862128144384L, 66028);
  }
  
  public final void ar(String paramString, boolean paramBoolean)
  {
    GMTrace.i(8862262362112L, 66029);
    GMTrace.o(8862262362112L, 66029);
  }
  
  public final void as(String paramString, boolean paramBoolean)
  {
    GMTrace.i(8862530797568L, 66031);
    GMTrace.o(8862530797568L, 66031);
  }
  
  public final void bgh()
  {
    GMTrace.i(8862396579840L, 66030);
    GMTrace.o(8862396579840L, 66030);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/sns/e/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */