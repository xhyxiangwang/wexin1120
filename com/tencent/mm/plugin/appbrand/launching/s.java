package com.tencent.mm.plugin.appbrand.launching;

import android.content.Context;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.compatible.util.p;
import com.tencent.mm.modelappbrand.LaunchParamsOptional;
import com.tencent.mm.plugin.appbrand.config.AppBrandLaunchReferrer;
import com.tencent.mm.plugin.appbrand.k.c;
import com.tencent.mm.plugin.appbrand.report.AppBrandStatObject;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.w.f.a;
import junit.framework.Assert;

public final class s
  implements c
{
  public s()
  {
    GMTrace.i(15445507702784L, 115078);
    GMTrace.o(15445507702784L, 115078);
  }
  
  public final void a(Context paramContext, String paramString1, String paramString2, int paramInt1, int paramInt2, String paramString3, AppBrandStatObject paramAppBrandStatObject)
  {
    GMTrace.i(19675782053888L, 146596);
    AppBrandLaunchProxyUI.a(paramContext, paramString1, paramString2, paramString3, paramInt1, paramInt2, paramAppBrandStatObject, null, null);
    GMTrace.o(19675782053888L, 146596);
  }
  
  public final void a(Context paramContext, String paramString1, String paramString2, int paramInt1, int paramInt2, String paramString3, AppBrandStatObject paramAppBrandStatObject, String paramString4)
  {
    GMTrace.i(19675916271616L, 146597);
    AppBrandLaunchReferrer localAppBrandLaunchReferrer = new AppBrandLaunchReferrer();
    switch (paramAppBrandStatObject.scene)
    {
    }
    for (;;)
    {
      localAppBrandLaunchReferrer.appId = paramString4;
      AppBrandLaunchProxyUI.a(paramContext, paramString1, paramString2, paramString3, paramInt1, paramInt2, paramAppBrandStatObject, localAppBrandLaunchReferrer, null);
      GMTrace.o(19675916271616L, 146597);
      return;
      localAppBrandLaunchReferrer.iIB = 4;
      continue;
      localAppBrandLaunchReferrer.iIB = 2;
      continue;
      localAppBrandLaunchReferrer.iIB = 5;
    }
  }
  
  public final void a(Context paramContext, String paramString1, String paramString2, String paramString3, int paramInt, String paramString4)
  {
    GMTrace.i(15445641920512L, 115079);
    if (bg.mZ(paramString3))
    {
      GMTrace.o(15445641920512L, 115079);
      return;
    }
    if ((bg.mZ(paramString3)) || (bg.mZ(paramString2)))
    {
      w.e("MicroMsg.WeAppLauncher", "targetAppId %s referrerAppId %s, Null Or Nil");
      GMTrace.o(15445641920512L, 115079);
      return;
    }
    AppBrandStatObject localAppBrandStatObject = new AppBrandStatObject();
    localAppBrandStatObject.scene = 1055;
    localAppBrandStatObject.fty = (p.encode(bg.mY(paramString1)) + ":" + paramString2);
    AppBrandLaunchReferrer localAppBrandLaunchReferrer = new AppBrandLaunchReferrer();
    localAppBrandLaunchReferrer.appId = paramString2;
    localAppBrandLaunchReferrer.iIB = 2;
    localAppBrandLaunchReferrer.url = paramString1;
    AppBrandLaunchProxyUI.a(paramContext, null, paramString3, paramString4, paramInt, -1, localAppBrandStatObject, localAppBrandLaunchReferrer, null);
    Assert.assertTrue(true);
    GMTrace.o(15445641920512L, 115079);
  }
  
  public final void a(Context paramContext, String paramString1, String paramString2, boolean paramBoolean, f.a parama)
  {
    GMTrace.i(19676050489344L, 146598);
    AppBrandStatObject localAppBrandStatObject = new AppBrandStatObject();
    localAppBrandStatObject.scene = 1036;
    localAppBrandStatObject.fty = (bg.mY(parama.appId) + ":" + bg.mY(p.encode(parama.url)));
    if (paramBoolean) {}
    for (int i = 2;; i = 1)
    {
      localAppBrandStatObject.fNV = i;
      if (paramBoolean) {
        paramString2 = paramString1;
      }
      localAppBrandStatObject.fNW = paramString2;
      paramString2 = null;
      if (!bg.mZ(parama.hdr))
      {
        paramString2 = new LaunchParamsOptional();
        paramString2.hjt = paramString1;
        paramString2.hju = parama.hdr;
      }
      paramString1 = new AppBrandLaunchReferrer();
      paramString1.iIB = 4;
      paramString1.appId = parama.appId;
      AppBrandLaunchProxyUI.a(paramContext, parama.hdl, parama.hdm, parama.hdk, parama.hds, parama.hdt, localAppBrandStatObject, paramString1, paramString2);
      GMTrace.o(19676050489344L, 146598);
      return;
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/launching/s.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */