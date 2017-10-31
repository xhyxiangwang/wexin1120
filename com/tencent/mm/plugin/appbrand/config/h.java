package com.tencent.mm.plugin.appbrand.config;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.a;
import com.tencent.mm.sdk.platformtools.w;

public enum h
{
  static
  {
    GMTrace.i(10594073706496L, 78932);
    iJh = new h[0];
    GMTrace.o(10594073706496L, 78932);
  }
  
  public static long oT(String paramString)
  {
    GMTrace.i(10593939488768L, 78931);
    paramString = a.nx(paramString);
    boolean bool;
    if (paramString == null)
    {
      bool = true;
      if (paramString != null) {
        break label89;
      }
      l = -1L;
      label27:
      w.i("MicroMsg.AppServiceSettingRemoteManager", "getMaxFileStorageSize, (null == config) = %b, MaxFileStorageSize = %d", new Object[] { Boolean.valueOf(bool), Long.valueOf(l) });
      if ((paramString == null) || (paramString.iIP <= 0L)) {
        break label97;
      }
    }
    label89:
    label97:
    for (long l = paramString.iIP;; l = 10L)
    {
      GMTrace.o(10593939488768L, 78931);
      return l * 1048576L;
      bool = false;
      break;
      l = paramString.iIP;
      break label27;
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/config/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */