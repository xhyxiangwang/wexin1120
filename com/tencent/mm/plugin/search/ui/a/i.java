package com.tencent.mm.plugin.search.ui.a;

import android.content.Context;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.b.af;
import com.tencent.mm.plugin.fts.d.a.a;
import com.tencent.mm.plugin.fts.d.a.a.a;
import com.tencent.mm.plugin.fts.d.e;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.storage.ar;
import com.tencent.mm.storage.q;
import com.tencent.mm.x.ap;
import com.tencent.mm.x.c;
import com.tencent.mm.x.n;

public final class i
  extends f
{
  public q pop;
  public String poq;
  private a por;
  
  public i(int paramInt)
  {
    super(paramInt);
    GMTrace.i(16470528491520L, 122715);
    this.por = new a();
    GMTrace.o(16470528491520L, 122715);
  }
  
  public final com.tencent.mm.plugin.fts.d.a.a.b Vk()
  {
    GMTrace.i(16470662709248L, 122716);
    a locala = this.por;
    GMTrace.o(16470662709248L, 122716);
    return locala;
  }
  
  public final void a(Context paramContext, a.a parama, Object... paramVarArgs)
  {
    GMTrace.i(16470796926976L, 122717);
    super.a(paramContext, parama, paramVarArgs);
    ap.AS();
    paramContext = c.yL().SL(this.iOg.fAJ);
    if (paramContext == null)
    {
      this.poq = n.fc(this.iOg.mkj);
      GMTrace.o(16470796926976L, 122717);
      return;
    }
    if (bg.mZ(paramContext.field_conRemark))
    {
      if (this.pop != null)
      {
        paramContext = this.pop.fc(this.iOg.fAJ);
        if (!bg.mZ(paramContext))
        {
          this.poq = paramContext;
          GMTrace.o(16470796926976L, 122717);
          return;
        }
        this.poq = n.fb(this.iOg.fAJ);
        GMTrace.o(16470796926976L, 122717);
        return;
      }
      this.poq = n.fb(this.iOg.fAJ);
      GMTrace.o(16470796926976L, 122717);
      return;
    }
    this.poq = paramContext.field_conRemark;
    GMTrace.o(16470796926976L, 122717);
  }
  
  public final class a
    extends f.b
  {
    public a()
    {
      super();
      GMTrace.i(16473749716992L, 122739);
      GMTrace.o(16473749716992L, 122739);
    }
    
    public final void a(Context paramContext, a.a parama, a paramVarArgs)
    {
      GMTrace.i(16473883934720L, 122740);
      paramContext = (i)paramVarArgs;
      parama = (f.a)parama;
      cj(parama.iiK);
      if (bg.mZ(paramContext.iOg.fAJ)) {
        com.tencent.mm.pluginsdk.ui.a.b.a(parama.iiL, paramContext.iOg.mkj);
      }
      for (;;)
      {
        e.a(paramContext.poq, parama.kfQ);
        e.a(paramContext.iiH, parama.kGV);
        GMTrace.o(16473883934720L, 122740);
        return;
        com.tencent.mm.pluginsdk.ui.a.b.a(parama.iiL, paramContext.iOg.fAJ);
      }
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/search/ui/a/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */