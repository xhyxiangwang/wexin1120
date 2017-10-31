package com.tencent.mm.plugin.appbrand.jsapi;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.k;
import com.tencent.mm.plugin.appbrand.page.AppBrandPageView;
import com.tencent.mm.plugin.appbrand.page.AppBrandPageView.17;
import org.json.JSONObject;

public final class bx
  extends a
{
  public static final int CTRL_INDEX = 12;
  public static final String NAME = "stopPullDownRefresh";
  
  public bx()
  {
    GMTrace.i(10343623426048L, 77066);
    GMTrace.o(10343623426048L, 77066);
  }
  
  public final void a(k paramk, JSONObject paramJSONObject, int paramInt)
  {
    GMTrace.i(10343757643776L, 77067);
    paramJSONObject = b(paramk);
    if (paramJSONObject == null)
    {
      paramk.v(paramInt, d("fail", null));
      GMTrace.o(10343757643776L, 77067);
      return;
    }
    paramJSONObject.runOnUiThread(new AppBrandPageView.17(paramJSONObject));
    paramk.v(paramInt, d("ok", null));
    GMTrace.o(10343757643776L, 77067);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/bx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */