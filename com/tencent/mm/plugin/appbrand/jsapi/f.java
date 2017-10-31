package com.tencent.mm.plugin.appbrand.jsapi;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.bg;
import java.util.Map;

final class f
{
  static Map<String, d> iPA;
  static Map<String, d> iPz;
  
  static void a(d paramd)
  {
    GMTrace.i(10425362022400L, 77675);
    if (bg.mZ(paramd.getName()))
    {
      GMTrace.o(10425362022400L, 77675);
      return;
    }
    iPz.put(paramd.getName(), paramd);
    GMTrace.o(10425362022400L, 77675);
  }
  
  static void b(d paramd)
  {
    GMTrace.i(10425496240128L, 77676);
    if (bg.mZ(paramd.getName()))
    {
      GMTrace.o(10425496240128L, 77676);
      return;
    }
    iPA.put(paramd.getName(), paramd);
    GMTrace.o(10425496240128L, 77676);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */