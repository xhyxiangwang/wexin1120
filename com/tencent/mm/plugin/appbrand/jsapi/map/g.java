package com.tencent.mm.plugin.appbrand.jsapi.map;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.kernel.h;
import com.tencent.mm.plugin.appbrand.compat.a.b;
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

public final class g
  extends a
{
  public static final int CTRL_INDEX = -2;
  public static final String NAME = "getMapScale";
  
  public g()
  {
    GMTrace.i(17386967138304L, 129543);
    GMTrace.o(17386967138304L, 129543);
  }
  
  private static int i(JSONObject paramJSONObject)
  {
    GMTrace.i(17387101356032L, 129544);
    try
    {
      int i = paramJSONObject.optInt("mapId");
      GMTrace.o(17387101356032L, 129544);
      return i;
    }
    catch (Exception paramJSONObject)
    {
      w.e("MicroMsg.JsApiGetMapScale", "get mapId error, exception : %s", new Object[] { paramJSONObject });
      GMTrace.o(17387101356032L, 129544);
    }
    return 0;
  }
  
  public final void a(k paramk, JSONObject paramJSONObject, int paramInt)
  {
    GMTrace.i(17387235573760L, 129545);
    if (paramJSONObject == null)
    {
      w.e("MicroMsg.JsApiGetMapScale", "JsApiGetMapScale data is null");
      paramk.v(paramInt, d("fail:data is null", null));
      GMTrace.o(17387235573760L, 129545);
      return;
    }
    Object localObject = b(paramk);
    if (localObject == null)
    {
      w.e("MicroMsg.JsApiGetMapScale", "JsApiGetMapScale pv is null");
      paramk.v(paramInt, d("fail:pageView is null", null));
      GMTrace.o(17387235573760L, 129545);
      return;
    }
    w.i("MicroMsg.JsApiGetMapScale", "JsApiGetMapScale data:%s", new Object[] { paramJSONObject.toString() });
    try
    {
      paramJSONObject = ((AppBrandPageView)localObject).jla.jl(i(paramJSONObject));
      if (paramJSONObject == null)
      {
        w.e("MicroMsg.JsApiGetMapScale", "view is null");
        paramk.v(paramInt, d("fail:view is null", null));
        GMTrace.o(17387235573760L, 129545);
        return;
      }
      paramJSONObject = ((c)h.h(c.class)).bE(paramJSONObject);
      localObject = new HashMap();
      if (paramJSONObject != null)
      {
        ((Map)localObject).put("scale", Integer.valueOf(paramJSONObject.getZoomLevel()));
        w.i("MicroMsg.JsApiGetMapScale", "getMapScale ok, values:%s", new Object[] { localObject.toString() });
        paramk.v(paramInt, d("ok", (Map)localObject));
        GMTrace.o(17387235573760L, 129545);
        return;
      }
    }
    catch (Exception paramJSONObject)
    {
      w.e("MicroMsg.JsApiGetMapScale", "get SoSoMapView by id failed, exception : %s", new Object[] { paramJSONObject });
      paramk.v(paramInt, d("fail", null));
      GMTrace.o(17387235573760L, 129545);
      return;
    }
    w.e("MicroMsg.JsApiGetMapScale", "get SoSoMapView by id failed");
    paramk.v(paramInt, d("fail:mapView is null", null));
    GMTrace.o(17387235573760L, 129545);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/map/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */