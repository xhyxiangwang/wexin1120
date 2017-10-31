package com.tencent.mm.plugin.appbrand.dynamic.jsapi.core;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.bg;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public final class b
{
  private static final Map<String, MiniJsApiFwContext> iMa;
  
  static
  {
    GMTrace.i(19933480091648L, 148516);
    iMa = new ConcurrentHashMap();
    GMTrace.o(19933480091648L, 148516);
  }
  
  public static boolean a(String paramString, MiniJsApiFwContext paramMiniJsApiFwContext)
  {
    GMTrace.i(19933077438464L, 148513);
    if ((bg.mZ(paramString)) || (paramMiniJsApiFwContext == null))
    {
      GMTrace.o(19933077438464L, 148513);
      return false;
    }
    iMa.put(paramString, paramMiniJsApiFwContext);
    GMTrace.o(19933077438464L, 148513);
    return true;
  }
  
  public static MiniJsApiFwContext pu(String paramString)
  {
    GMTrace.i(19933211656192L, 148514);
    if (bg.mZ(paramString))
    {
      GMTrace.o(19933211656192L, 148514);
      return null;
    }
    paramString = (MiniJsApiFwContext)iMa.get(paramString);
    GMTrace.o(19933211656192L, 148514);
    return paramString;
  }
  
  public static MiniJsApiFwContext pv(String paramString)
  {
    GMTrace.i(19933345873920L, 148515);
    if (bg.mZ(paramString))
    {
      GMTrace.o(19933345873920L, 148515);
      return null;
    }
    paramString = (MiniJsApiFwContext)iMa.remove(paramString);
    GMTrace.o(19933345873920L, 148515);
    return paramString;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/dynamic/jsapi/core/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */