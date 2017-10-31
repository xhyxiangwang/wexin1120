package com.tencent.mm.plugin.appbrand.launching;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.app.f;
import com.tencent.mm.plugin.appbrand.config.AppBrandInitConfig;
import com.tencent.mm.plugin.appbrand.config.WxaAttributes;
import com.tencent.mm.plugin.appbrand.config.WxaAttributes.a;
import com.tencent.mm.plugin.appbrand.config.o;
import com.tencent.mm.plugin.appbrand.config.p;
import com.tencent.mm.sdk.e.j.a;
import com.tencent.mm.sdk.e.l;
import com.tencent.mm.sdk.platformtools.bg;
import java.util.Map;

public final class a
  implements j.a
{
  private static a jfJ;
  final Map<String, AppBrandInitConfig> jfK;
  final Map<String, String> jfL;
  
  private a()
  {
    GMTrace.i(17334488006656L, 129152);
    this.jfK = new android.support.v4.e.a();
    this.jfL = new android.support.v4.e.a();
    GMTrace.o(17334488006656L, 129152);
  }
  
  public static a XT()
  {
    GMTrace.i(17334890659840L, 129155);
    try
    {
      a locala = jfJ;
      GMTrace.o(17334890659840L, 129155);
      return locala;
    }
    finally {}
  }
  
  private static AppBrandInitConfig b(WxaAttributes paramWxaAttributes)
  {
    GMTrace.i(17335427530752L, 129159);
    AppBrandInitConfig localAppBrandInitConfig = null;
    if (paramWxaAttributes != null)
    {
      localAppBrandInitConfig = new AppBrandInitConfig();
      localAppBrandInitConfig.appId = paramWxaAttributes.field_appId;
      localAppBrandInitConfig.fxq = paramWxaAttributes.field_nickname;
      localAppBrandInitConfig.iconUrl = paramWxaAttributes.field_brandIconURL;
      if (paramWxaAttributes.Uq().iJG == 0) {
        break label73;
      }
    }
    label73:
    for (boolean bool = true;; bool = false)
    {
      localAppBrandInitConfig.iIw = bool;
      GMTrace.o(17335427530752L, 129159);
      return localAppBrandInitConfig;
    }
  }
  
  public static void init()
  {
    GMTrace.i(17334622224384L, 129153);
    try
    {
      jfJ = new a();
      p.Up().c(jfJ);
      GMTrace.o(17334622224384L, 129153);
      return;
    }
    finally {}
  }
  
  private AppBrandInitConfig qI(String paramString)
  {
    GMTrace.i(17335293313024L, 129158);
    if (bg.mZ(paramString))
    {
      GMTrace.o(17335293313024L, 129158);
      return null;
    }
    Object localObject2;
    synchronized (this.jfL)
    {
      localObject2 = (String)this.jfL.get(paramString);
      if (bg.mZ((String)localObject2))
      {
        localObject2 = b(f.Sa().d(paramString, new String[] { "appId", "appInfo", "brandIconURL", "nickname" }));
        ??? = localObject2;
        if (localObject2 == null) {}
      }
    }
    for (;;)
    {
      synchronized (this.jfL)
      {
        this.jfL.put(paramString, ((AppBrandInitConfig)localObject2).appId);
        ??? = localObject2;
        GMTrace.o(17335293313024L, 129158);
        return (AppBrandInitConfig)???;
        paramString = finally;
        throw paramString;
      }
      ??? = qJ((String)localObject2);
    }
  }
  
  public static void release()
  {
    GMTrace.i(17334756442112L, 129154);
    try
    {
      jfJ = null;
      GMTrace.o(17334756442112L, 129154);
      return;
    }
    finally {}
  }
  
  public final void a(String arg1, l paraml)
  {
    GMTrace.i(17335024877568L, 129156);
    if ("single".equals(???))
    {
      if (String.class.isInstance(paraml.obj))
      {
        ??? = String.valueOf(paraml.obj);
        if (!bg.mZ(???)) {
          qI(???);
        }
      }
      GMTrace.o(17335024877568L, 129156);
      return;
    }
    if ("batch".equals(???)) {
      synchronized (this.jfK)
      {
        this.jfK.clear();
        GMTrace.o(17335024877568L, 129156);
        return;
      }
    }
    GMTrace.o(17335024877568L, 129156);
  }
  
  final String qH(String paramString)
  {
    GMTrace.i(17335159095296L, 129157);
    if (bg.mZ(paramString))
    {
      GMTrace.o(17335159095296L, 129157);
      return null;
    }
    synchronized (this.jfL)
    {
      paramString = (String)this.jfL.get(paramString);
      GMTrace.o(17335159095296L, 129157);
      return paramString;
    }
  }
  
  final AppBrandInitConfig qJ(String paramString)
  {
    GMTrace.i(17335561748480L, 129160);
    if (bg.mZ(paramString))
    {
      GMTrace.o(17335561748480L, 129160);
      return null;
    }
    synchronized (this.jfK)
    {
      AppBrandInitConfig localAppBrandInitConfig = (AppBrandInitConfig)this.jfK.remove(paramString);
      ??? = localAppBrandInitConfig;
      if (localAppBrandInitConfig == null) {
        ??? = b(f.Sa().e(paramString, new String[] { "appInfo", "brandIconURL", "nickname" }));
      }
      GMTrace.o(17335561748480L, 129160);
      return (AppBrandInitConfig)???;
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/launching/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */