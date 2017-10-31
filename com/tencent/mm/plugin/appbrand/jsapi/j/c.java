package com.tencent.mm.plugin.appbrand.jsapi.j;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.jsapi.a;
import com.tencent.mm.plugin.appbrand.jsapi.d;
import com.tencent.mm.plugin.appbrand.k;
import com.tencent.mm.plugin.appbrand.page.AppBrandPageView;
import org.json.JSONObject;

public final class c
  extends a
{
  private static final int CTRL_INDEX = -2;
  private static final String NAME = "setStatusBarStyle";
  
  public c()
  {
    GMTrace.i(17379182510080L, 129485);
    GMTrace.o(17379182510080L, 129485);
  }
  
  public final void a(k paramk, JSONObject paramJSONObject, int paramInt)
  {
    GMTrace.i(17379316727808L, 129486);
    paramJSONObject = paramJSONObject.optString("color", "");
    AppBrandPageView localAppBrandPageView = b(paramk);
    if (localAppBrandPageView == null)
    {
      paramk.v(paramInt, d("fail", null));
      GMTrace.o(17379316727808L, 129486);
      return;
    }
    if (paramJSONObject.equals("white")) {
      localAppBrandPageView.ry("white");
    }
    for (;;)
    {
      paramk.v(paramInt, d("ok", null));
      GMTrace.o(17379316727808L, 129486);
      return;
      if (paramJSONObject.equals("black")) {
        localAppBrandPageView.ry("black");
      }
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/j/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */