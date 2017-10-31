package com.tencent.mm.plugin.appbrand.jsapi.map;

import android.view.View;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.kernel.h;
import com.tencent.mm.plugin.appbrand.compat.a.b;
import com.tencent.mm.plugin.appbrand.compat.a.b.f;
import com.tencent.mm.plugin.appbrand.compat.a.c;
import com.tencent.mm.plugin.appbrand.jsapi.a;
import com.tencent.mm.plugin.appbrand.jsapi.d;
import com.tencent.mm.plugin.appbrand.k;
import com.tencent.mm.plugin.appbrand.page.AppBrandPageView;
import com.tencent.mm.plugin.appbrand.page.t;
import com.tencent.mm.sdk.platformtools.w;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class e
  extends a
{
  public static final int CTRL_INDEX = 144;
  public static final String NAME = "getMapCenterLocation";
  
  public e()
  {
    GMTrace.i(10451802914816L, 77872);
    GMTrace.o(10451802914816L, 77872);
  }
  
  private static int i(JSONObject paramJSONObject)
  {
    GMTrace.i(10451937132544L, 77873);
    try
    {
      int i = paramJSONObject.optInt("mapId");
      GMTrace.o(10451937132544L, 77873);
      return i;
    }
    catch (Exception paramJSONObject)
    {
      w.e("MicroMsg.JsApiGetMapCenterLocation", "get mapId error, exception : %s", new Object[] { paramJSONObject });
      GMTrace.o(10451937132544L, 77873);
    }
    return 0;
  }
  
  public final void a(k paramk, JSONObject paramJSONObject, int paramInt)
  {
    GMTrace.i(16001303314432L, 119219);
    if (paramJSONObject == null)
    {
      w.e("MicroMsg.JsApiGetMapCenterLocation", "getMapCenterLocation data is null");
      paramk.v(paramInt, d("fail:data is null", null));
      GMTrace.o(16001303314432L, 119219);
      return;
    }
    Object localObject = b(paramk);
    if (localObject == null)
    {
      w.e("MicroMsg.JsApiGetMapCenterLocation", "getMapCenterLocation pv is null");
      GMTrace.o(16001303314432L, 119219);
      return;
    }
    w.i("MicroMsg.JsApiGetMapCenterLocation", "getMapCenterLocation data:%s", new Object[] { paramJSONObject.toString() });
    try
    {
      View localView = ((AppBrandPageView)localObject).jla.jl(i(paramJSONObject));
      localObject = ((c)h.h(c.class)).bE(localView);
      if (localView == null)
      {
        w.e("MicroMsg.JsApiGetMapCenterLocation", "get view by id failed, id:%d", new Object[] { Integer.valueOf(i(paramJSONObject)) });
        paramk.v(paramInt, d("fail", null));
        GMTrace.o(16001303314432L, 119219);
        return;
      }
    }
    catch (Exception paramJSONObject)
    {
      w.printErrStackTrace("MicroMsg.JsApiGetMapCenterLocation", paramJSONObject, "get SoSoMapView by id failed, exception", new Object[0]);
      paramk.v(paramInt, d("fail", null));
      GMTrace.o(16001303314432L, 119219);
      return;
    }
    paramJSONObject = new HashMap();
    if (localObject != null)
    {
      localObject = ((b)localObject).TO();
      paramJSONObject.put("latitude", Double.valueOf(((b.f)localObject).TW()));
      paramJSONObject.put("longitude", Double.valueOf(((b.f)localObject).TX()));
      w.i("MicroMsg.JsApiGetMapCenterLocation", "ok, values:%s", new Object[] { paramJSONObject.toString() });
      paramk.v(paramInt, d("ok", paramJSONObject));
      GMTrace.o(16001303314432L, 119219);
      return;
    }
    w.e("MicroMsg.JsApiGetMapCenterLocation", "get SoSoMapView by id failed");
    paramk.v(paramInt, d("fail", null));
    GMTrace.o(16001303314432L, 119219);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/map/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */