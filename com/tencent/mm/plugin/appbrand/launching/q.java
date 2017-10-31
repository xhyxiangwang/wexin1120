package com.tencent.mm.plugin.appbrand.launching;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.a.e;
import com.tencent.mm.a.g;
import com.tencent.mm.plugin.appbrand.app.f;
import com.tencent.mm.plugin.appbrand.appcache.r;
import com.tencent.mm.plugin.appbrand.appcache.v;
import com.tencent.mm.sdk.platformtools.bg;

final class q
{
  static String ao(String paramString, int paramInt)
  {
    GMTrace.i(17667750625280L, 131635);
    Object localObject = null;
    r localr = f.Sh().a(paramString, paramInt, new String[] { "versionMd5", "pkgPath" });
    paramString = (String)localObject;
    if (localr != null)
    {
      paramString = (String)localObject;
      if (!bg.mZ(localr.field_pkgPath))
      {
        paramString = (String)localObject;
        if (e.aZ(localr.field_pkgPath))
        {
          paramString = (String)localObject;
          if (!bg.mZ(localr.field_versionMd5))
          {
            paramString = (String)localObject;
            if (localr.field_pkgPath.equals(g.bg(localr.field_pkgPath))) {
              paramString = localr.field_versionMd5;
            }
          }
        }
      }
    }
    GMTrace.o(17667750625280L, 131635);
    return paramString;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/launching/q.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */