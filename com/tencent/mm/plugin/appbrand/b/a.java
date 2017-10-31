package com.tencent.mm.plugin.appbrand.b;

import com.tencent.gmtrace.GMTrace;

public enum a
{
  static
  {
    GMTrace.i(18871817863168L, 140606);
    iCG = new a("FOREGROUND", 0);
    iCH = new a("BACKGROUND", 1);
    iCI = new a("SUSPEND", 2);
    iCJ = new a("DESTROYED", 3);
    iCK = new a[] { iCG, iCH, iCI, iCJ };
    GMTrace.o(18871817863168L, 140606);
  }
  
  private a()
  {
    GMTrace.i(18871683645440L, 140605);
    GMTrace.o(18871683645440L, 140605);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/b/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */