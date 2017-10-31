package com.tencent.mm.plugin.appbrand.p.c;

import com.tencent.gmtrace.GMTrace;

public class b
  extends Exception
{
  public int jxV;
  
  public b()
  {
    GMTrace.i(10187662426112L, 75904);
    this.jxV = 1002;
    GMTrace.o(10187662426112L, 75904);
  }
  
  public b(int paramInt, Throwable paramThrowable)
  {
    super(paramThrowable);
    GMTrace.i(10187930861568L, 75906);
    this.jxV = paramInt;
    GMTrace.o(10187930861568L, 75906);
  }
  
  public b(String paramString)
  {
    super(paramString);
    GMTrace.i(10187796643840L, 75905);
    this.jxV = 1002;
    GMTrace.o(10187796643840L, 75905);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/p/c/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */