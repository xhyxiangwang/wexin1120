package com.tencent.mm.plugin.appbrand.report.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.report.d;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.sdk.platformtools.bg;

public final class b
{
  private String fty;
  public b joC;
  public int joD;
  public String joE;
  private long joF;
  public a joG;
  
  public b()
  {
    GMTrace.i(16185315819520L, 120590);
    GMTrace.o(16185315819520L, 120590);
  }
  
  public final void rB()
  {
    GMTrace.i(16185450037248L, 120591);
    if ((this.joC == null) || (this.joG == null))
    {
      GMTrace.o(16185450037248L, 120591);
      return;
    }
    this.joF = bg.Pp();
    g.paX.i(13917, d.g(new Object[] { Integer.valueOf(this.joC.value), Integer.valueOf(this.joD), this.joE, Long.valueOf(this.joF), this.fty, Integer.valueOf(this.joG.value) }));
    GMTrace.o(16185450037248L, 120591);
  }
  
  public static enum a
  {
    public final int value;
    
    static
    {
      GMTrace.i(16185181601792L, 120589);
      joH = new a("NEARBY_H5", 0, 1);
      joI = new a("EMPTY_PAGE", 1, 2);
      joJ = new a("LBS_NOT_ALLOW", 2, 3);
      joK = new a[] { joH, joI, joJ };
      GMTrace.o(16185181601792L, 120589);
    }
    
    private a(int paramInt)
    {
      GMTrace.i(16185047384064L, 120588);
      this.value = paramInt;
      GMTrace.o(16185047384064L, 120588);
    }
  }
  
  public static enum b
  {
    public final int value;
    
    static
    {
      GMTrace.i(16184644730880L, 120585);
      joL = new b("DESKTOP_SEARCH", 0, 1);
      joM = new b("RESUME_FROM_WEAPP_EXIT", 1, 2);
      joN = new b("BOTTOM_ENTRANCE_IN_DESKTOP", 2, 3);
      joO = new b("TOP_ENTRANCE_IN_DESKTOP", 3, 4);
      joP = new b[] { joL, joM, joN, joO };
      GMTrace.o(16184644730880L, 120585);
    }
    
    private b(int paramInt)
    {
      GMTrace.i(16184510513152L, 120584);
      this.value = paramInt;
      GMTrace.o(16184510513152L, 120584);
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/report/a/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */