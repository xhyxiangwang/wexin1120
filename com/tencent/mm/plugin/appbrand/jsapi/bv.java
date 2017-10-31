package com.tencent.mm.plugin.appbrand.jsapi;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.k;
import com.tencent.mm.plugin.appbrand.page.AppBrandPageView;
import org.json.JSONObject;

public final class bv
  extends a
{
  public static final int CTRL_INDEX = 9;
  public static final String NAME = "showNavigationBarLoading";
  
  public bv()
  {
    GMTrace.i(10357045198848L, 77166);
    GMTrace.o(10357045198848L, 77166);
  }
  
  public final void a(k paramk, JSONObject paramJSONObject, int paramInt)
  {
    GMTrace.i(10357179416576L, 77167);
    paramJSONObject = b(paramk);
    if (paramJSONObject == null)
    {
      paramk.v(paramInt, d("fail", null));
      GMTrace.o(10357179416576L, 77167);
      return;
    }
    paramJSONObject.ct(true);
    paramk.v(paramInt, d("ok", null));
    GMTrace.o(10357179416576L, 77167);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/bv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */