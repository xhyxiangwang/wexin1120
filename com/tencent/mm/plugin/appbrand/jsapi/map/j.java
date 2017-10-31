package com.tencent.mm.plugin.appbrand.jsapi.map;

import android.view.View;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.kernel.h;
import com.tencent.mm.plugin.appbrand.compat.a.b;
import com.tencent.mm.plugin.appbrand.page.AppBrandPageView;
import com.tencent.mm.plugin.appbrand.page.t;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.x.q.b;
import org.json.JSONObject;

public final class j
  extends com.tencent.mm.plugin.appbrand.jsapi.base.c
{
  public static final int CTRL_INDEX = 141;
  public static final String NAME = "moveToMapLocation";
  
  public j()
  {
    GMTrace.i(10443481415680L, 77810);
    GMTrace.o(10443481415680L, 77810);
  }
  
  protected final boolean a(AppBrandPageView paramAppBrandPageView, int paramInt, View paramView, JSONObject paramJSONObject)
  {
    GMTrace.i(10443884068864L, 77813);
    paramAppBrandPageView = paramAppBrandPageView.jla.t(paramInt, true);
    if (paramAppBrandPageView == null)
    {
      w.i("MicroMsg.JsApiMoveToMapLocation", "KeyValueSet(%s) is null.", new Object[] { Integer.valueOf(paramInt) });
      GMTrace.o(10443884068864L, 77813);
      return false;
    }
    try
    {
      paramView = ((com.tencent.mm.plugin.appbrand.compat.a.c)h.h(com.tencent.mm.plugin.appbrand.compat.a.c.class)).bE(paramView);
      paramAppBrandPageView = (AppbrandMapLocationPoint)paramAppBrandPageView.get(String.valueOf(paramInt), null);
      if (paramAppBrandPageView != null)
      {
        paramView.animateTo(paramAppBrandPageView.iWZ, paramAppBrandPageView.iXa);
        GMTrace.o(10443884068864L, 77813);
        return true;
      }
    }
    catch (Exception paramAppBrandPageView)
    {
      w.e("MicroMsg.JsApiMoveToMapLocation", "get SoSoMapView(%s) by id failed, exception : %s", new Object[] { Integer.valueOf(paramInt), paramAppBrandPageView });
      GMTrace.o(10443884068864L, 77813);
      return false;
    }
    w.e("MicroMsg.JsApiMoveToMapLocation", "appbrandMapLocationPoint is null");
    GMTrace.o(10443884068864L, 77813);
    return false;
  }
  
  protected final int i(JSONObject paramJSONObject)
  {
    GMTrace.i(10443615633408L, 77811);
    try
    {
      int i = paramJSONObject.optInt("mapId");
      GMTrace.o(10443615633408L, 77811);
      return i;
    }
    catch (Exception paramJSONObject)
    {
      w.e("MicroMsg.JsApiMoveToMapLocation", "get mapId error, exception : %s", new Object[] { paramJSONObject });
      GMTrace.o(10443615633408L, 77811);
    }
    return 0;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/map/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */