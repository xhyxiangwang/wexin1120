package com.tencent.mm.plugin.appbrand.widget.input.b;

import com.tencent.gmtrace.GMTrace;

public enum c
{
  public final int style;
  
  static
  {
    GMTrace.i(17281069350912L, 128754);
    jFP = new c("NORMAL", 0, 0);
    jFQ = new c("BOLD", 1, 1);
    jFR = new c[] { jFP, jFQ };
    GMTrace.o(17281069350912L, 128754);
  }
  
  private c(int paramInt)
  {
    GMTrace.i(17280800915456L, 128752);
    this.style = paramInt;
    GMTrace.o(17280800915456L, 128752);
  }
  
  public static c sB(String paramString)
  {
    GMTrace.i(17280935133184L, 128753);
    paramString = d.g(paramString, c.class);
    c localc = jFP;
    if (paramString == null) {
      paramString = localc;
    }
    for (;;)
    {
      paramString = (c)paramString;
      GMTrace.o(17280935133184L, 128753);
      return paramString;
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/widget/input/b/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */