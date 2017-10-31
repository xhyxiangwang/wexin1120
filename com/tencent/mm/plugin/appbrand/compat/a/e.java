package com.tencent.mm.plugin.appbrand.compat.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.kernel.c.a;

public abstract interface e
  extends a
{
  public abstract void a(a parama);
  
  public abstract void b(a parama);
  
  public static abstract interface a
  {
    public abstract void a(double paramDouble1, double paramDouble2, e.b paramb, double paramDouble3, double paramDouble4, double paramDouble5);
  }
  
  public static enum b
  {
    static
    {
      GMTrace.i(20036693524480L, 149285);
      iHw = new b("GPS", 0);
      iHx = new b("NETWORK", 1);
      iHy = new b[] { iHw, iHx };
      GMTrace.o(20036693524480L, 149285);
    }
    
    private b()
    {
      GMTrace.i(20036425089024L, 149283);
      GMTrace.o(20036425089024L, 149283);
    }
    
    public static b oM(String paramString)
    {
      GMTrace.i(20036559306752L, 149284);
      if ("gps".equals(paramString))
      {
        paramString = iHw;
        GMTrace.o(20036559306752L, 149284);
        return paramString;
      }
      paramString = iHx;
      GMTrace.o(20036559306752L, 149284);
      return paramString;
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/compat/a/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */