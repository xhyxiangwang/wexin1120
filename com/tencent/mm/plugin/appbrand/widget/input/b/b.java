package com.tencent.mm.plugin.appbrand.widget.input.b;

import com.tencent.gmtrace.GMTrace;

public enum b
{
  public final int jFN;
  
  static
  {
    GMTrace.i(17281874657280L, 128760);
    jFI = new b("DONE", 0, 6);
    jFJ = new b("SEARCH", 1, 3);
    jFK = new b("NEXT", 2, 5);
    jFL = new b("GO", 3, 2);
    jFM = new b("SEND", 4, 4);
    jFO = new b[] { jFI, jFJ, jFK, jFL, jFM };
    GMTrace.o(17281874657280L, 128760);
  }
  
  private b(int paramInt)
  {
    GMTrace.i(17281472004096L, 128757);
    this.jFN = paramInt;
    GMTrace.o(17281472004096L, 128757);
  }
  
  public static b acZ()
  {
    GMTrace.i(17281606221824L, 128758);
    b localb = jFI;
    GMTrace.o(17281606221824L, 128758);
    return localb;
  }
  
  public static b sA(String paramString)
  {
    GMTrace.i(17281740439552L, 128759);
    paramString = (b)d.g(paramString, b.class);
    GMTrace.o(17281740439552L, 128759);
    return paramString;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/widget/input/b/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */