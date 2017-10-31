package com.tencent.mm.plugin.appbrand.jsapi;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.k;
import com.tencent.mm.plugin.appbrand.page.AppBrandPageView;
import com.tencent.mm.plugin.appbrand.widget.input.m;
import org.json.JSONObject;

final class bp
  extends a
{
  private static final int CTRL_INDEX = 77;
  private static final String NAME = "setKeyboardValue";
  
  bp()
  {
    GMTrace.i(10419590660096L, 77632);
    GMTrace.o(10419590660096L, 77632);
  }
  
  public final void a(k paramk, JSONObject paramJSONObject, int paramInt)
  {
    GMTrace.i(10419724877824L, 77633);
    AppBrandPageView localAppBrandPageView = b(paramk);
    if (localAppBrandPageView == null)
    {
      GMTrace.o(10419724877824L, 77633);
      return;
    }
    try
    {
      str = paramJSONObject.getString("value");
    }
    catch (Exception paramJSONObject)
    {
      String str;
      int i;
      label50:
      paramk.v(paramInt, d("fail:invalid data", null));
      GMTrace.o(10419724877824L, 77633);
      return;
    }
    try
    {
      i = paramJSONObject.getInt("cursor");
      paramJSONObject = Integer.valueOf(i);
    }
    catch (Exception paramJSONObject)
    {
      paramJSONObject = null;
      break label50;
    }
    m.a(localAppBrandPageView, str, paramJSONObject);
    paramk.v(paramInt, d("ok", null));
    GMTrace.o(10419724877824L, 77633);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/bp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */