package com.tencent.mm.plugin.appbrand.widget.input;

import com.tencent.gmtrace.GMTrace;

public abstract interface y
{
  public abstract void a(String paramString, int paramInt, a parama);
  
  public static enum a
  {
    static
    {
      GMTrace.i(18282199384064L, 136213);
      jDD = new a("COMPLETE", 0);
      jDE = new a("CONFIRM", 1);
      jDF = new a("CHANGED", 2);
      jDG = new a[] { jDD, jDE, jDF };
      GMTrace.o(18282199384064L, 136213);
    }
    
    private a()
    {
      GMTrace.i(18282065166336L, 136212);
      GMTrace.o(18282065166336L, 136212);
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/widget/input/y.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */