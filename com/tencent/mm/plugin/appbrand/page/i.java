package com.tencent.mm.plugin.appbrand.page;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.jsapi.e;

public final class i
  extends e
{
  private static final int CTRL_INDEX = -2;
  private static final String NAME = "onTapStatusBar";
  private static i jkf;
  
  static
  {
    GMTrace.i(10229269921792L, 76214);
    jkf = new i();
    GMTrace.o(10229269921792L, 76214);
  }
  
  public i()
  {
    GMTrace.i(10229001486336L, 76212);
    GMTrace.o(10229001486336L, 76212);
  }
  
  public static void ap(String paramString, int paramInt)
  {
    GMTrace.i(10229135704064L, 76213);
    jkf.aj(paramString, 0).f(new int[] { paramInt });
    GMTrace.o(10229135704064L, 76213);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/page/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */