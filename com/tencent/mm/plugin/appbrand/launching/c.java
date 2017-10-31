package com.tencent.mm.plugin.appbrand.launching;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.bi.d;
import com.tencent.mm.k.e;
import com.tencent.mm.k.g;
import com.tencent.mm.plugin.appbrand.app.f;
import com.tencent.mm.plugin.appbrand.config.AppBrandInitConfig;
import com.tencent.mm.plugin.appbrand.config.AppBrandSysConfig;
import com.tencent.mm.plugin.appbrand.config.WxaAttributes;
import com.tencent.mm.plugin.appbrand.config.WxaAttributes.a;
import com.tencent.mm.plugin.appbrand.config.o;
import com.tencent.mm.plugin.appbrand.m;
import com.tencent.mm.plugin.appbrand.p.i;
import com.tencent.mm.plugin.appbrand.report.AppBrandStatObject;
import com.tencent.mm.plugin.appbrand.report.a;
import com.tencent.mm.plugin.appbrand.task.b;
import com.tencent.mm.plugin.appbrand.ui.AppBrand404PageUI;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.w;

public final class c
  implements Runnable
{
  private final String appId;
  private final int iCy;
  private final String iIy;
  private final int iQS;
  private final a jfY;
  private AppBrandStatObject jfZ;
  private final String username;
  
  public c(AppBrandLaunchProxyUI.LaunchParcel paramLaunchParcel, a parama)
  {
    GMTrace.i(17329790386176L, 129117);
    this.jfY = parama;
    this.iQS = paramLaunchParcel.iQS;
    this.appId = paramLaunchParcel.appId;
    this.username = paramLaunchParcel.username;
    this.iCy = paramLaunchParcel.version;
    this.jfZ = paramLaunchParcel.jfW;
    this.iIy = paramLaunchParcel.iIy;
    GMTrace.o(17329790386176L, 129117);
  }
  
  public c(String paramString, int paramInt, AppBrandStatObject paramAppBrandStatObject, a parama)
  {
    GMTrace.i(17329924603904L, 129118);
    this.jfY = parama;
    this.appId = paramString;
    this.iQS = paramInt;
    this.username = null;
    this.iCy = 0;
    this.jfZ = paramAppBrandStatObject;
    this.iIy = null;
    GMTrace.o(17329924603904L, 129118);
  }
  
  private void onError()
  {
    GMTrace.i(17330193039360L, 129120);
    if (this.jfY != null) {
      this.jfY.b(null, null);
    }
    GMTrace.o(17330193039360L, 129120);
  }
  
  public final void run()
  {
    GMTrace.i(17330058821632L, 129119);
    AppBrandStatObject localAppBrandStatObject;
    Object localObject1;
    try
    {
      AppBrandSysConfig localAppBrandSysConfig = new p(this.username, this.appId, this.iQS, this.iCy, this.iIy).Yh();
      if (localAppBrandSysConfig == null)
      {
        w.i("MicroMsg.AppBrandPreLaunchProcess", "onGetWxaAttr null return");
        onError();
        GMTrace.o(17330058821632L, 129119);
        return;
      }
    }
    catch (Exception localException)
    {
      for (;;)
      {
        w.printErrStackTrace("MicroMsg.AppBrandPreLaunchProcess", localException, "get attr ", new Object[0]);
        localAppBrandStatObject = null;
      }
      localObject1 = new i(localAppBrandStatObject.appId);
      Object localObject2;
      int i;
      if (g.uz().getInt("WeAppForbiddenSwitch", 0) == 1)
      {
        w.i("MicroMsg.AppBrand.PreLaunchCheckForOversea", "startApp, WeAppForbiddenSwitch == 1, go webview, appId %s", new Object[] { ((i)localObject1).appId });
        localObject1 = new Intent().putExtra("rawUrl", m.nS(((i)localObject1).appId)).putExtra("forceHideShare", true);
        localObject2 = ab.getContext();
        if (!(localObject2 instanceof Activity)) {
          ((Intent)localObject1).addFlags(268435456);
        }
        d.b((Context)localObject2, "webview", ".ui.tools.WebViewUI", (Intent)localObject1);
        i = 1;
        if (i == 0) {
          break label216;
        }
        i = 1;
      }
      for (;;)
      {
        if (i == 0) {
          break label555;
        }
        onError();
        GMTrace.o(17330058821632L, 129119);
        return;
        i = 0;
        break;
        label216:
        if (2 == this.iQS)
        {
          localObject1 = localAppBrandStatObject.appId;
          bool = b.rS(localAppBrandStatObject.appId);
          i = new r((String)localObject1, q.ao((String)localObject1, 2), q.ao((String)localObject1, 10001), bool).Va();
          w.i("MicroMsg.AppBrand.PrepareStepOpBan", "checkDemoInfo, appId %s, ret %d, ignoreCgiError %b", new Object[] { localObject1, Integer.valueOf(i), Boolean.valueOf(bool) });
          localObject2 = r.a.iP(i);
          if (localObject2 == null) {
            switch (i)
            {
            default: 
              if (bool) {
                i = 1;
              }
              break;
            }
          }
          for (;;)
          {
            if (i != 0) {
              break label503;
            }
            i = 1;
            break;
            l.iO(p.i.iwG);
            a.x((String)localObject1, 13, 3);
            i = 0;
            continue;
            l.iO(p.i.iwH);
            a.x((String)localObject1, 12, 3);
            i = 0;
            continue;
            l.qL(ab.getResources().getString(p.i.iyq, new Object[] { Integer.valueOf(3), Integer.valueOf(i) }));
            i = 0;
            continue;
            if (bool) {
              i = 1;
            } else {
              switch (q.1.jgy[localObject2.ordinal()])
              {
              default: 
                l.iO(p.i.iwE);
                a.x((String)localObject1, 13, 3);
                i = 0;
                break;
              case 1: 
                i = 1;
                break;
              case 2: 
                l.iO(p.i.iwF);
                a.x((String)localObject1, 13, 3);
                i = 0;
              }
            }
          }
        }
        label503:
        if (this.iQS == 0)
        {
          if (1 == localAppBrandStatObject.iJe)
          {
            AppBrand404PageUI.show(p.i.ixD);
            a.x(localAppBrandStatObject.appId, 14, 1);
          }
          for (i = 0;; i = 1)
          {
            if (i != 0) {
              break label550;
            }
            i = 1;
            break;
          }
        }
        label550:
        i = 0;
      }
      label555:
      localObject1 = new AppBrandInitConfig();
      ((AppBrandInitConfig)localObject1).appId = localAppBrandStatObject.appId;
      ((AppBrandInitConfig)localObject1).fxq = localAppBrandStatObject.fxq;
      ((AppBrandInitConfig)localObject1).iCo = this.iQS;
      ((AppBrandInitConfig)localObject1).iconUrl = localAppBrandStatObject.iIF;
      if (f.Sa().e(localAppBrandStatObject.appId, new String[] { "appInfo" }).Uq().iJG == 0) {}
    }
    for (boolean bool = true;; bool = false)
    {
      ((AppBrandInitConfig)localObject1).iIw = bool;
      if (this.jfZ == null) {
        this.jfZ = new AppBrandStatObject();
      }
      localAppBrandStatObject = this.jfZ;
      if (this.jfY != null) {
        this.jfY.b((AppBrandInitConfig)localObject1, localAppBrandStatObject);
      }
      GMTrace.o(17330058821632L, 129119);
      return;
    }
  }
  
  public static abstract interface a
  {
    public abstract void b(AppBrandInitConfig paramAppBrandInitConfig, AppBrandStatObject paramAppBrandStatObject);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/launching/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */