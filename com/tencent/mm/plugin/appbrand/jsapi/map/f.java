package com.tencent.mm.plugin.appbrand.jsapi.map;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.kernel.h;
import com.tencent.mm.plugin.appbrand.compat.a.b;
import com.tencent.mm.plugin.appbrand.compat.a.b.f;
import com.tencent.mm.plugin.appbrand.compat.a.b.g;
import com.tencent.mm.plugin.appbrand.compat.a.b.q;
import com.tencent.mm.plugin.appbrand.compat.a.b.r;
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

public final class f
  extends a
{
  public static final int CTRL_INDEX = -2;
  public static final String NAME = "getMapRegion";
  
  public f()
  {
    GMTrace.i(17387369791488L, 129546);
    GMTrace.o(17387369791488L, 129546);
  }
  
  private static int i(JSONObject paramJSONObject)
  {
    GMTrace.i(17387504009216L, 129547);
    try
    {
      int i = paramJSONObject.optInt("mapId");
      GMTrace.o(17387504009216L, 129547);
      return i;
    }
    catch (Exception paramJSONObject)
    {
      w.e("MicroMsg.JsApiGetMapRegion", "get mapId error, exception : %s", new Object[] { paramJSONObject });
      GMTrace.o(17387504009216L, 129547);
    }
    return 0;
  }
  
  public final void a(k paramk, JSONObject paramJSONObject, int paramInt)
  {
    GMTrace.i(17387638226944L, 129548);
    if (paramJSONObject == null)
    {
      w.e("MicroMsg.JsApiGetMapRegion", "JsApiGetMapRegion data is null");
      paramk.v(paramInt, d("fail:data is null", null));
      GMTrace.o(17387638226944L, 129548);
      return;
    }
    Object localObject1 = b(paramk);
    if (localObject1 == null)
    {
      w.e("MicroMsg.JsApiGetMapRegion", "JsApiGetMapRegion pv is null");
      paramk.v(paramInt, d("fail:pageView is null", null));
      GMTrace.o(17387638226944L, 129548);
      return;
    }
    w.i("MicroMsg.JsApiGetMapRegion", "JsApiGetMapRegion data:%s", new Object[] { paramJSONObject.toString() });
    try
    {
      paramJSONObject = ((AppBrandPageView)localObject1).jla.jl(i(paramJSONObject));
      if (paramJSONObject == null)
      {
        w.e("MicroMsg.JsApiGetMapRegion", "view is null");
        paramk.v(paramInt, d("fail:view is null", null));
        GMTrace.o(17387638226944L, 129548);
        return;
      }
      paramJSONObject = ((c)h.h(c.class)).bE(paramJSONObject);
      if (paramJSONObject == null)
      {
        w.e("MicroMsg.JsApiGetMapRegion", "get SoSoMapView by id failed");
        paramk.v(paramInt, d("fail:mapView is null", null));
        GMTrace.o(17387638226944L, 129548);
        return;
      }
    }
    catch (Exception paramJSONObject)
    {
      w.e("MicroMsg.JsApiGetMapRegion", "get SoSoMapView by id failed, exception : %s", new Object[] { paramJSONObject });
      paramk.v(paramInt, d("fail", null));
      GMTrace.o(17387638226944L, 129548);
      return;
    }
    paramJSONObject = paramJSONObject.TP().TZ().Ua();
    localObject1 = paramJSONObject.TU();
    Object localObject2 = paramJSONObject.TV();
    paramJSONObject = new HashMap();
    paramJSONObject.put("latitude", Double.valueOf(((b.f)localObject1).TW()));
    paramJSONObject.put("longitude", Double.valueOf(((b.f)localObject1).TX()));
    localObject1 = new HashMap();
    ((Map)localObject1).put("latitude", Double.valueOf(((b.f)localObject2).TW()));
    ((Map)localObject1).put("longitude", Double.valueOf(((b.f)localObject2).TX()));
    localObject2 = new HashMap();
    ((Map)localObject2).put("southwest", paramJSONObject);
    ((Map)localObject2).put("northeast", localObject1);
    w.i("MicroMsg.JsApiGetMapRegion", "getMapRegion ok, values:%s", new Object[] { localObject2.toString() });
    paramk.v(paramInt, d("ok", (Map)localObject2));
    GMTrace.o(17387638226944L, 129548);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/map/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */