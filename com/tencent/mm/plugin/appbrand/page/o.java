package com.tencent.mm.plugin.appbrand.page;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.report.e;

public final class o
{
  public final e jlu;
  public volatile long jlv;
  public volatile long jlw;
  
  o(int paramInt)
  {
    GMTrace.i(18356556005376L, 136767);
    this.jlv = 0L;
    this.jlw = 0L;
    this.jlu = new e("MicroMsg.AppBrandPageViewStatistics[" + paramInt + "]");
    GMTrace.o(18356556005376L, 136767);
  }
  
  public final boolean Zg()
  {
    GMTrace.i(16149345468416L, 120322);
    if ((this.jlv > 0L) && (this.jlw <= 0L))
    {
      GMTrace.o(16149345468416L, 120322);
      return true;
    }
    GMTrace.o(16149345468416L, 120322);
    return false;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/page/o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */