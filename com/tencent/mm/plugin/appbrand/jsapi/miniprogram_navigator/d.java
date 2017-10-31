package com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.compatible.util.p;
import com.tencent.mm.plugin.appbrand.config.AppBrandInitConfig;
import com.tencent.mm.plugin.appbrand.config.AppBrandLaunchReferrer;
import com.tencent.mm.plugin.appbrand.d.c;
import com.tencent.mm.plugin.appbrand.f;
import com.tencent.mm.plugin.appbrand.g;
import com.tencent.mm.plugin.appbrand.ipc.AppBrandMainProcessService;
import com.tencent.mm.plugin.appbrand.k;
import com.tencent.mm.plugin.appbrand.page.AppBrandPageView;
import com.tencent.mm.plugin.appbrand.page.j;
import com.tencent.mm.plugin.appbrand.page.l;
import com.tencent.mm.plugin.appbrand.page.s;
import com.tencent.mm.plugin.appbrand.report.AppBrandStatObject;
import com.tencent.mm.plugin.appbrand.ui.AppBrandPreInitTask;
import com.tencent.mm.plugin.appbrand.ui.AppBrandPreInitTask.a;
import com.tencent.mm.sdk.platformtools.bg;
import org.json.JSONObject;

final class d
{
  static void a(final k paramk, String paramString1, int paramInt, final String paramString2, JSONObject paramJSONObject, a parama)
  {
    GMTrace.i(19831608836096L, 147757);
    String str = "";
    final Object localObject1 = paramk.irS.iqR;
    final Object localObject2;
    if ((localObject1 != null) && (((l)localObject1).YZ() != null))
    {
      localObject1 = ((l)localObject1).YZ().YO();
      if (localObject1 != null) {
        str = ((AppBrandPageView)localObject1).jlc.jlW;
      }
      localObject2 = paramk.iqL + ":" + bg.mY(p.encode(str));
      localObject1 = new AppBrandStatObject();
      ((AppBrandStatObject)localObject1).scene = 1037;
      ((AppBrandStatObject)localObject1).fNU = com.tencent.mm.plugin.appbrand.a.ny(paramk.iqL).fNU;
      ((AppBrandStatObject)localObject1).fty = ((String)localObject2);
      localObject2 = new AppBrandLaunchReferrer();
      ((AppBrandLaunchReferrer)localObject2).appId = paramk.iqL;
      if (paramJSONObject != null) {
        break label230;
      }
    }
    label230:
    for (paramJSONObject = "{}";; paramJSONObject = paramJSONObject.toString())
    {
      ((AppBrandLaunchReferrer)localObject2).iIC = paramJSONObject;
      ((AppBrandLaunchReferrer)localObject2).iIB = 1;
      ((AppBrandLaunchReferrer)localObject2).url = str;
      paramk = new AppBrandPreInitTask(paramString1, paramInt, (AppBrandStatObject)localObject1, new AppBrandPreInitTask.a()
      {
        public final void a(AppBrandInitConfig paramAnonymousAppBrandInitConfig)
        {
          GMTrace.i(19830266658816L, 147747);
          if (paramAnonymousAppBrandInitConfig == null)
          {
            if (this.iZt != null) {
              this.iZt.cg(false);
            }
            GMTrace.o(19830266658816L, 147747);
            return;
          }
          if (this.iZt != null) {
            this.iZt.cg(true);
          }
          paramAnonymousAppBrandInitConfig.startTime = System.currentTimeMillis();
          paramAnonymousAppBrandInitConfig.iIy = com.tencent.mm.plugin.appbrand.appcache.a.nW(paramString2);
          paramAnonymousAppBrandInitConfig.iIA.a(localObject2);
          com.tencent.mm.plugin.appbrand.d.a(paramk.iqL, d.c.iqG);
          f localf = paramk.irS;
          AppBrandStatObject localAppBrandStatObject = localObject1;
          localf.iqK.a(localf, paramAnonymousAppBrandInitConfig, localAppBrandStatObject);
          GMTrace.o(19830266658816L, 147747);
        }
      });
      paramk.VD();
      AppBrandMainProcessService.a(paramk);
      GMTrace.o(19831608836096L, 147757);
      return;
      localObject1 = null;
      break;
    }
  }
  
  static abstract interface a
  {
    public abstract void cg(boolean paramBoolean);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/miniprogram_navigator/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */