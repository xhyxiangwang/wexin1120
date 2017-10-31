package com.tencent.mm.plugin.appbrand.widget.input.b;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.widget.input.x;

public enum g
{
  static
  {
    GMTrace.i(17282948399104L, 128768);
    jGA = new g("LEFT", 0);
    jGB = new g("RIGHT", 1);
    jGC = new g("CENTER", 2);
    jGD = new g[] { jGA, jGB, jGC };
    GMTrace.o(17282948399104L, 128768);
  }
  
  private g()
  {
    GMTrace.i(17282545745920L, 128765);
    GMTrace.o(17282545745920L, 128765);
  }
  
  public static g sC(String paramString)
  {
    GMTrace.i(17282679963648L, 128766);
    paramString = d.g(paramString, g.class);
    g localg = jGA;
    if (paramString == null) {
      paramString = localg;
    }
    for (;;)
    {
      paramString = (g)paramString;
      GMTrace.o(17282679963648L, 128766);
      return paramString;
    }
  }
  
  public final void a(x paramx)
  {
    GMTrace.i(18286091698176L, 136242);
    if (paramx == null)
    {
      GMTrace.o(18286091698176L, 136242);
      return;
    }
    switch (1.jGE[ordinal()])
    {
    }
    for (;;)
    {
      GMTrace.o(18286091698176L, 136242);
      return;
      paramx.acA();
      GMTrace.o(18286091698176L, 136242);
      return;
      paramx.acB();
      GMTrace.o(18286091698176L, 136242);
      return;
      paramx.acC();
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/widget/input/b/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */