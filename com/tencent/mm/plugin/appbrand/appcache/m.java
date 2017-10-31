package com.tencent.mm.plugin.appbrand.appcache;

import android.content.Context;
import android.content.res.AssetManager;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.w;
import java.io.InputStream;

public final class m
{
  private static Boolean iBh;
  
  static
  {
    GMTrace.i(10611522011136L, 79062);
    iBh = null;
    GMTrace.o(10611522011136L, 79062);
  }
  
  public static WxaPkgWrappingInfo Sw()
  {
    GMTrace.i(10611387793408L, 79061);
    WxaPkgWrappingInfo localWxaPkgWrappingInfo = new WxaPkgWrappingInfo();
    localWxaPkgWrappingInfo.iCE = true;
    localWxaPkgWrappingInfo.iCy = 63;
    localWxaPkgWrappingInfo.iCA = true;
    GMTrace.o(10611387793408L, 79061);
    return localWxaPkgWrappingInfo;
  }
  
  private static InputStream nZ(String paramString)
  {
    GMTrace.i(15544023515136L, 115812);
    Object localObject = ab.getContext().getAssets();
    try
    {
      localObject = ((AssetManager)localObject).open(paramString);
      GMTrace.o(15544023515136L, 115812);
      return (InputStream)localObject;
    }
    catch (Exception localException)
    {
      w.v("MicroMsg.AppBrand.WxaLocalLibPkg", "openRead file( %s ) failed, exp = %s", new Object[] { paramString, localException });
      GMTrace.o(15544023515136L, 115812);
    }
    return null;
  }
  
  public static InputStream openRead(String paramString)
  {
    GMTrace.i(17289256632320L, 128815);
    paramString = a.nX(paramString);
    if (iBh == null)
    {
      ab.bNb();
      iBh = Boolean.valueOf(false);
    }
    if (iBh.booleanValue())
    {
      InputStream localInputStream = nZ("wxa_library/local" + paramString);
      if (localInputStream != null)
      {
        GMTrace.o(17289256632320L, 128815);
        return localInputStream;
      }
      localInputStream = nZ("wxa_library/develop" + paramString);
      if (localInputStream != null)
      {
        GMTrace.o(17289256632320L, 128815);
        return localInputStream;
      }
    }
    paramString = nZ("wxa_library" + paramString);
    if (paramString != null)
    {
      GMTrace.o(17289256632320L, 128815);
      return paramString;
    }
    GMTrace.o(17289256632320L, 128815);
    return null;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/appcache/m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */