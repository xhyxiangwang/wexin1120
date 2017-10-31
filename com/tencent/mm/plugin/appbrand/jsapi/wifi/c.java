package com.tencent.mm.plugin.appbrand.jsapi.wifi;

import android.content.Context;
import android.location.LocationManager;
import android.os.Build.VERSION;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.jsapi.a;
import com.tencent.mm.plugin.appbrand.jsapi.e;
import com.tencent.mm.plugin.appbrand.k;
import com.tencent.mm.plugin.appbrand.ui.g;
import com.tencent.mm.sdk.platformtools.w;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public final class c
  extends a
{
  public static final int CTRL_INDEX = 317;
  public static final String NAME = "getWifiList";
  
  public c()
  {
    GMTrace.i(19823824207872L, 147699);
    GMTrace.o(19823824207872L, 147699);
  }
  
  public final void a(k paramk, JSONObject paramJSONObject, int paramInt)
  {
    GMTrace.i(19823958425600L, 147700);
    if (!d.jfj)
    {
      w.e("MicroMsg.JsApiGetWifiList", "not invoke startWifi");
      paramJSONObject = new HashMap();
      paramJSONObject.put("errCode", Integer.valueOf(12000));
      paramk.v(paramInt, d("fail:not invoke startWifi", paramJSONObject));
      GMTrace.o(19823958425600L, 147700);
      return;
    }
    Object localObject = paramk.mContext;
    if (localObject == null)
    {
      w.e("MicroMsg.JsApiGetWifiList", "mContext is null, invoke fail!");
      paramk.v(paramInt, d("fail", null));
      GMTrace.o(19823958425600L, 147700);
      return;
    }
    com.tencent.mm.plugin.appbrand.jsapi.wifi.wifisdk.d.bN((Context)localObject);
    if (!com.tencent.mm.plugin.appbrand.jsapi.wifi.wifisdk.internal.c.isWifiEnabled())
    {
      w.e("MicroMsg.JsApiGetWifiList", "wifi is disable,invoke fail!");
      paramJSONObject = new HashMap();
      paramJSONObject.put("errCode", Integer.valueOf(12005));
      paramk.v(paramInt, d("fail:wifi is disable", paramJSONObject));
      GMTrace.o(19823958425600L, 147700);
      return;
    }
    paramJSONObject = com.tencent.mm.plugin.appbrand.jsapi.wifi.wifisdk.d.XR();
    if (paramJSONObject.iRD.equals("ok")) {
      try
      {
        w.i("MicroMsg.JsApiGetWifiList", "onGetWifiList size:%d", new Object[] { Integer.valueOf(paramJSONObject.jft.size()) });
        if ((paramJSONObject.jft.size() == 0) && (Build.VERSION.SDK_INT >= 23) && (!g.tJ()) && (!((LocationManager)((Context)localObject).getSystemService("location")).isProviderEnabled("gps")))
        {
          paramJSONObject = new HashMap();
          paramJSONObject.put("errCode", Integer.valueOf(12006));
          paramk.v(paramInt, d("fail:may be not open GPS", paramJSONObject));
          w.e("MicroMsg.JsApiGetWifiList", "wifiList is empty, may be not open GPS");
          GMTrace.o(19823958425600L, 147700);
          return;
        }
        localObject = new HashMap();
        ((Map)localObject).put("errCode", Integer.valueOf(0));
        paramk.v(paramInt, d("ok", (Map)localObject));
        w.d("MicroMsg.JsApiGetWifiList", "onGetWifiList %s", new Object[] { paramJSONObject });
        localObject = new a();
        HashMap localHashMap = new HashMap();
        localHashMap.put("wifiList", paramJSONObject.XP());
        ((a)localObject).aj(paramk.iqL, 0).r(localHashMap).VI();
        GMTrace.o(19823958425600L, 147700);
        return;
      }
      catch (JSONException paramJSONObject)
      {
        w.printErrStackTrace("MicroMsg.JsApiGetWifiList", paramJSONObject, "", new Object[0]);
        paramk.v(paramInt, d("fail", null));
        GMTrace.o(19823958425600L, 147700);
        return;
      }
    }
    w.e("MicroMsg.JsApiGetWifiList", "error, mErrorMsg:%s", new Object[] { paramJSONObject.iRD });
    paramk.v(paramInt, d("fail:" + paramJSONObject.iRD, null));
    GMTrace.o(19823958425600L, 147700);
  }
  
  public static final class a
    extends e
  {
    private static final int CTRL_INDEX = 321;
    private static final String NAME = "onGetWifiList";
    
    public a()
    {
      GMTrace.i(19824629514240L, 147705);
      GMTrace.o(19824629514240L, 147705);
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/wifi/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */