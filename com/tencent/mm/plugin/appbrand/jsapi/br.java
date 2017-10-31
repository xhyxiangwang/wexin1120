package com.tencent.mm.plugin.appbrand.jsapi;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.k;
import com.tencent.mm.plugin.appbrand.page.AppBrandPageView;
import org.json.JSONObject;

public final class br
  extends a
{
  public static final int CTRL_INDEX = 8;
  public static final String NAME = "setNavigationBarTitle";
  
  public br()
  {
    GMTrace.i(10399323783168L, 77481);
    GMTrace.o(10399323783168L, 77481);
  }
  
  public final void a(k paramk, JSONObject paramJSONObject, int paramInt)
  {
    GMTrace.i(10399458000896L, 77482);
    paramJSONObject = paramJSONObject.optString("title");
    AppBrandPageView localAppBrandPageView = b(paramk);
    if (localAppBrandPageView == null)
    {
      paramk.v(paramInt, d("fail", null));
      GMTrace.o(10399458000896L, 77482);
      return;
    }
    localAppBrandPageView.rw(paramJSONObject);
    paramk.v(paramInt, d("ok", null));
    GMTrace.o(10399458000896L, 77482);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/br.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */