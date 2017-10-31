package com.tencent.mm.plugin.appbrand.jsapi.wifi;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.jsapi.a;
import com.tencent.mm.plugin.appbrand.jsapi.wifi.wifisdk.internal.c;
import com.tencent.mm.plugin.appbrand.k;
import com.tencent.mm.sdk.platformtools.w;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public final class b
  extends a
{
  public static final int CTRL_INDEX = 318;
  public static final String NAME = "getConnectedWifi";
  
  public b()
  {
    GMTrace.i(19815502708736L, 147637);
    GMTrace.o(19815502708736L, 147637);
  }
  
  public final void a(k paramk, JSONObject paramJSONObject, int paramInt)
  {
    GMTrace.i(19815636926464L, 147638);
    super.a(paramk, paramJSONObject, paramInt);
    if (!d.jfj)
    {
      w.e("MicroMsg.JsApiGetConnectedWifi", "not invoke startWifi");
      paramJSONObject = new HashMap();
      paramJSONObject.put("errCode", Integer.valueOf(12000));
      paramk.v(paramInt, d("fail:not invoke startWifi", paramJSONObject));
      GMTrace.o(19815636926464L, 147638);
      return;
    }
    paramJSONObject = paramk.mContext;
    if (paramJSONObject == null)
    {
      w.e("MicroMsg.JsApiGetConnectedWifi", "mContext is null, invoke fail!");
      paramk.v(paramInt, d("fail", null));
      GMTrace.o(19815636926464L, 147638);
      return;
    }
    com.tencent.mm.plugin.appbrand.jsapi.wifi.wifisdk.d.bN(paramJSONObject);
    if (!c.isWifiEnabled())
    {
      w.e("MicroMsg.JsApiGetConnectedWifi", "wifi is disable,invoke fail!");
      paramJSONObject = new HashMap();
      paramJSONObject.put("errCode", Integer.valueOf(12005));
      paramk.v(paramInt, d("fail:wifi is disable", paramJSONObject));
      GMTrace.o(19815636926464L, 147638);
      return;
    }
    paramJSONObject = com.tencent.mm.plugin.appbrand.jsapi.wifi.wifisdk.d.XQ();
    if (paramJSONObject == null)
    {
      w.e("MicroMsg.JsApiGetConnectedWifi", "currentWifi is null");
      paramk.v(paramInt, d("fail:can't gain any info", null));
      GMTrace.o(19815636926464L, 147638);
      return;
    }
    w.i("MicroMsg.JsApiGetConnectedWifi", "[invoke]currentWifi:%s", new Object[] { paramJSONObject });
    try
    {
      HashMap localHashMap = new HashMap();
      localHashMap.put("wifi", paramJSONObject.or());
      localHashMap.put("errCode", Integer.valueOf(0));
      paramk.v(paramInt, d("ok", localHashMap));
      GMTrace.o(19815636926464L, 147638);
      return;
    }
    catch (JSONException paramJSONObject)
    {
      w.printErrStackTrace("MicroMsg.JsApiGetConnectedWifi", paramJSONObject, "", new Object[0]);
      paramk.v(paramInt, d("fail", null));
      GMTrace.o(19815636926464L, 147638);
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/wifi/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */