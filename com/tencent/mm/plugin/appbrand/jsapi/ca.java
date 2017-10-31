package com.tencent.mm.plugin.appbrand.jsapi;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.k;
import com.tencent.mm.plugin.appbrand.page.AppBrandPageView;
import com.tencent.mm.sdk.platformtools.w;
import org.json.JSONObject;

public final class ca
  extends a
{
  public static final int CTRL_INDEX = 65;
  public static final String NAME = "systemLog";
  
  public ca()
  {
    GMTrace.i(10328322605056L, 76952);
    GMTrace.o(10328322605056L, 76952);
  }
  
  public final void a(k paramk, JSONObject paramJSONObject, int paramInt)
  {
    GMTrace.i(10328456822784L, 76953);
    paramJSONObject = paramJSONObject.optString("message");
    w.i("AppBrandLog." + paramk.iqL, paramJSONObject);
    GMTrace.o(10328456822784L, 76953);
  }
  
  public final void a(AppBrandPageView paramAppBrandPageView, JSONObject paramJSONObject, int paramInt)
  {
    GMTrace.i(10328591040512L, 76954);
    paramJSONObject = paramJSONObject.optString("message");
    w.i("AppBrandLog." + paramAppBrandPageView.iqL, paramJSONObject);
    GMTrace.o(10328591040512L, 76954);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/ca.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */