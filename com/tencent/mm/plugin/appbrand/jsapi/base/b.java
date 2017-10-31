package com.tencent.mm.plugin.appbrand.jsapi.base;

import android.view.View;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.jsapi.c;
import com.tencent.mm.plugin.appbrand.k;
import com.tencent.mm.plugin.appbrand.page.AppBrandPageView;
import com.tencent.mm.plugin.appbrand.page.t;
import com.tencent.mm.sdk.platformtools.w;
import org.json.JSONException;
import org.json.JSONObject;

public abstract class b
  extends d
{
  public b()
  {
    GMTrace.i(10466566864896L, 77982);
    GMTrace.o(10466566864896L, 77982);
  }
  
  private void a(c paramc, int paramInt, AppBrandPageView paramAppBrandPageView, JSONObject paramJSONObject)
  {
    GMTrace.i(15500134318080L, 115485);
    for (;;)
    {
      try
      {
        int i = i(paramJSONObject);
        boolean bool1 = false;
        View localView = paramAppBrandPageView.jla.jl(i);
        if (paramAppBrandPageView.jla.jk(i))
        {
          boolean bool2 = paramAppBrandPageView.jla.jh(i);
          bool1 = bool2;
          if (bool2) {
            bool1 = c(paramAppBrandPageView, i, localView, paramJSONObject);
          }
        }
        if (bool1) {
          paramAppBrandPageView.jla.jm(i);
        }
        w.i("MicroMsg.BaseRemoveViewJsApi", "remove view(parentId : %s, viewId : %s, r : %s)", new Object[] { Integer.valueOf(paramJSONObject.optInt("parentId", 0)), Integer.valueOf(i), Boolean.valueOf(bool1) });
        if (bool1)
        {
          paramAppBrandPageView = "ok";
          paramc.v(paramInt, d(paramAppBrandPageView, null));
          GMTrace.o(15500134318080L, 115485);
          return;
        }
      }
      catch (JSONException paramAppBrandPageView)
      {
        w.e("MicroMsg.BaseRemoveViewJsApi", "get viewId error. exception : %s", new Object[] { paramAppBrandPageView });
        paramc.v(paramInt, d("fail:view id do not exist", null));
        GMTrace.o(15500134318080L, 115485);
        return;
      }
      paramAppBrandPageView = "fail";
    }
  }
  
  public final void a(k paramk, JSONObject paramJSONObject, int paramInt)
  {
    GMTrace.i(10466835300352L, 77984);
    super.a(paramk, paramJSONObject, paramInt);
    AppBrandPageView localAppBrandPageView = b(paramk);
    if (localAppBrandPageView == null)
    {
      w.w("MicroMsg.BaseRemoveViewJsApi", "Remove view failed, AppBrandPageView is null.");
      paramk.v(paramInt, d("fail:page is null", null));
      GMTrace.o(10466835300352L, 77984);
      return;
    }
    a(paramk, paramInt, localAppBrandPageView, paramJSONObject);
    GMTrace.o(10466835300352L, 77984);
  }
  
  public final void a(AppBrandPageView paramAppBrandPageView, JSONObject paramJSONObject, int paramInt)
  {
    GMTrace.i(10466701082624L, 77983);
    super.a(paramAppBrandPageView, paramJSONObject, paramInt);
    a(paramAppBrandPageView, paramInt, paramAppBrandPageView, paramJSONObject);
    GMTrace.o(10466701082624L, 77983);
  }
  
  public boolean c(AppBrandPageView paramAppBrandPageView, int paramInt, View paramView, JSONObject paramJSONObject)
  {
    GMTrace.i(17395020201984L, 129603);
    GMTrace.o(17395020201984L, 129603);
    return true;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/base/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */