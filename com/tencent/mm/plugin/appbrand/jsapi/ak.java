package com.tencent.mm.plugin.appbrand.jsapi;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.k;
import com.tencent.mm.plugin.appbrand.page.AppBrandPageView;
import org.json.JSONObject;

public final class ak
  extends a
{
  public static final int CTRL_INDEX = 10;
  public static final String NAME = "hideNavigationBarLoading";
  
  public ak()
  {
    GMTrace.i(10456232099840L, 77905);
    GMTrace.o(10456232099840L, 77905);
  }
  
  public final void a(k paramk, JSONObject paramJSONObject, int paramInt)
  {
    GMTrace.i(10456366317568L, 77906);
    paramJSONObject = b(paramk);
    if (paramJSONObject == null)
    {
      paramk.v(paramInt, d("fail", null));
      GMTrace.o(10456366317568L, 77906);
      return;
    }
    paramJSONObject.ct(false);
    paramk.v(paramInt, d("ok", null));
    GMTrace.o(10456366317568L, 77906);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/ak.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */