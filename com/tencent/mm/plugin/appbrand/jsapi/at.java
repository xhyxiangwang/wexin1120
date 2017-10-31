package com.tencent.mm.plugin.appbrand.jsapi;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.config.AppBrandSysConfig;
import com.tencent.mm.plugin.appbrand.config.a.d;
import com.tencent.mm.plugin.appbrand.f;
import com.tencent.mm.plugin.appbrand.k;
import com.tencent.mm.plugin.appbrand.page.l;
import com.tencent.mm.plugin.appbrand.page.l.12;
import com.tencent.mm.sdk.platformtools.w;
import org.json.JSONObject;

public final class at
  extends a
{
  public static final int CTRL_INDEX = 14;
  public static final String NAME = "navigateTo";
  
  public at()
  {
    GMTrace.i(10331409612800L, 76975);
    GMTrace.o(10331409612800L, 76975);
  }
  
  public final void a(k paramk, JSONObject paramJSONObject, int paramInt)
  {
    GMTrace.i(10331543830528L, 76976);
    int i = com.tencent.mm.plugin.appbrand.a.nx(paramk.iqL).iIK;
    if (paramk.irS.iqR.getPageCount() >= i)
    {
      paramk.v(paramInt, d("fail:page limit exceeded: " + i, null));
      w.e("MicroMsg.JsApiNavigateTo", "page limit exceeded: " + i);
      GMTrace.o(10331543830528L, 76976);
      return;
    }
    paramJSONObject = paramJSONObject.optString("url");
    if (paramk.irS.iqP.iHB.oP(paramJSONObject))
    {
      paramk.v(paramInt, d("fail:can not navigate to a tab bar page", null));
      GMTrace.o(10331543830528L, 76976);
      return;
    }
    l locall = paramk.irS.iqR;
    locall.runOnUiThread(new l.12(locall, paramJSONObject));
    paramk.v(paramInt, d("ok", null));
    GMTrace.o(10331543830528L, 76976);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/at.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */