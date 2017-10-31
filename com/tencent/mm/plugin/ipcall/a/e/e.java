package com.tencent.mm.plugin.ipcall.a.e;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.report.service.g;

public final class e
  extends a
{
  public long mZH;
  public long mZI;
  
  public e()
  {
    GMTrace.i(11602585714688L, 86446);
    this.mZH = 0L;
    this.mZI = 0L;
    GMTrace.o(11602585714688L, 86446);
  }
  
  public final void aHP()
  {
    GMTrace.i(11602719932416L, 86447);
    g.paX.i(12935, new Object[] { Long.valueOf(this.mZH), Long.valueOf(this.mZI) });
    GMTrace.o(11602719932416L, 86447);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/ipcall/a/e/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */