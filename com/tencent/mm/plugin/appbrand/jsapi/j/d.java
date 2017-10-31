package com.tencent.mm.plugin.appbrand.jsapi.j;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.d.b;
import com.tencent.mm.plugin.appbrand.jsapi.a;
import com.tencent.mm.plugin.appbrand.k;
import com.tencent.mm.plugin.appbrand.ui.banner.AppBrandStickyBannerLogic.a;
import org.json.JSONObject;

public final class d
  extends a
{
  private static final int CTRL_INDEX = 241;
  private static final String NAME = "setTopBarText";
  
  public d()
  {
    GMTrace.i(17379853598720L, 129490);
    GMTrace.o(17379853598720L, 129490);
  }
  
  public final void a(final k paramk, JSONObject paramJSONObject, int paramInt)
  {
    GMTrace.i(17379987816448L, 129491);
    paramJSONObject = paramJSONObject.optString("text");
    AppBrandStickyBannerLogic.a.bj(paramk.iqL, paramJSONObject);
    paramk.v(paramInt, d("ok", null));
    com.tencent.mm.plugin.appbrand.d.a(paramk.iqL, new d.b()
    {
      public final void onDestroy()
      {
        GMTrace.i(17671374503936L, 131662);
        AppBrandStickyBannerLogic.a.bj(paramk.iqL, "");
        GMTrace.o(17671374503936L, 131662);
      }
    });
    GMTrace.o(17379987816448L, 129491);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/j/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */