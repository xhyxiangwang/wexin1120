package com.tencent.mm.plugin.appbrand.jsapi.wifi;

import android.content.Context;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.d.b;
import com.tencent.mm.plugin.appbrand.jsapi.e;
import com.tencent.mm.plugin.appbrand.jsapi.wifi.wifisdk.b;
import com.tencent.mm.plugin.appbrand.jsapi.wifi.wifisdk.internal.c;
import com.tencent.mm.plugin.appbrand.k;
import com.tencent.mm.sdk.platformtools.w;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public final class a
  extends com.tencent.mm.plugin.appbrand.jsapi.a
{
  public static final int CTRL_INDEX = 316;
  public static final String NAME = "connectWifi";
  
  public a()
  {
    GMTrace.i(19824361078784L, 147703);
    GMTrace.o(19824361078784L, 147703);
  }
  
  public final void a(final k paramk, JSONObject paramJSONObject, final int paramInt)
  {
    GMTrace.i(19824495296512L, 147704);
    super.a(paramk, paramJSONObject, paramInt);
    if (!d.jfj)
    {
      w.e("MicroMsg.JsApiConenctWifi", "not invoke startWifi");
      paramJSONObject = new HashMap();
      paramJSONObject.put("errCode", Integer.valueOf(12000));
      paramk.v(paramInt, d("fail:not invoke startWifi", paramJSONObject));
      GMTrace.o(19824495296512L, 147704);
      return;
    }
    if ((paramJSONObject == null) || (!paramJSONObject.has("SSID")) || (!paramJSONObject.has("BSSID")))
    {
      w.e("MicroMsg.JsApiConenctWifi", "params is invalid");
      paramk.v(paramInt, d("fail:invalid data", null));
      GMTrace.o(19824495296512L, 147704);
      return;
    }
    Object localObject = paramk.mContext;
    if (localObject == null)
    {
      w.e("MicroMsg.JsApiConenctWifi", "mContext is null, invoke fail!");
      paramk.v(paramInt, d("fail", null));
      GMTrace.o(19824495296512L, 147704);
      return;
    }
    com.tencent.mm.plugin.appbrand.jsapi.wifi.wifisdk.d.bN((Context)localObject);
    if (!c.isWifiEnabled())
    {
      w.e("MicroMsg.JsApiConenctWifi", "wifi is disable");
      paramJSONObject = new HashMap();
      paramJSONObject.put("errCode", Integer.valueOf(12005));
      paramk.v(paramInt, d("fail:wifi is disable", paramJSONObject));
      GMTrace.o(19824495296512L, 147704);
      return;
    }
    com.tencent.mm.plugin.appbrand.jsapi.wifi.wifisdk.d.a(new com.tencent.mm.plugin.appbrand.jsapi.wifi.wifisdk.a()
    {
      public final void qE(String paramAnonymousString)
      {
        GMTrace.i(19824226861056L, 147702);
        com.tencent.mm.plugin.appbrand.jsapi.wifi.wifisdk.d.a(null);
        if (paramAnonymousString.equals("ok"))
        {
          paramAnonymousString = com.tencent.mm.plugin.appbrand.jsapi.wifi.wifisdk.d.XQ();
          w.i("MicroMsg.JsApiConenctWifi", "[IConnectWiFiCallback]currentWifi:%s", new Object[] { paramAnonymousString });
          if (paramAnonymousString == null)
          {
            w.e("MicroMsg.JsApiConenctWifi", "[onWiFiConnect]currentWIfi is null");
            paramk.v(paramInt, a.this.d("fail", null));
            GMTrace.o(19824226861056L, 147702);
            return;
          }
          try
          {
            localHashMap = new HashMap();
            localHashMap.put("wifi", paramAnonymousString.or());
            localHashMap.put("errCode", Integer.valueOf(0));
            paramk.v(paramInt, a.this.d("ok", localHashMap));
            GMTrace.o(19824226861056L, 147702);
            return;
          }
          catch (JSONException paramAnonymousString)
          {
            w.e("MicroMsg.JsApiConenctWifi", "IConnectWiFiCallback is error");
            w.printErrStackTrace("MicroMsg.JsApiConenctWifi", paramAnonymousString, "", new Object[0]);
            paramk.v(paramInt, a.this.d("fail", null));
            GMTrace.o(19824226861056L, 147702);
            return;
          }
        }
        HashMap localHashMap = new HashMap();
        if (paramAnonymousString.equals("duplicated request")) {
          localHashMap.put("errCode", Integer.valueOf(12004));
        }
        for (;;)
        {
          w.e("MicroMsg.JsApiConenctWifi", "[IConnectWiFiCallback]errMsg:%s", new Object[] { paramAnonymousString });
          paramk.v(paramInt, a.this.d("fail:" + paramAnonymousString, localHashMap));
          GMTrace.o(19824226861056L, 147702);
          return;
          if (paramAnonymousString.equals("password error")) {
            localHashMap.put("errCode", Integer.valueOf(12002));
          } else {
            localHashMap.put("errCode", Integer.valueOf(12003));
          }
        }
      }
    });
    localObject = new d.b()
    {
      public final void onDestroy()
      {
        GMTrace.i(19816173797376L, 147642);
        w.d("MicroMsg.JsApiConenctWifi", "remove listener");
        com.tencent.mm.plugin.appbrand.jsapi.wifi.wifisdk.d.a(null);
        com.tencent.mm.plugin.appbrand.d.b(paramk.iqL, this);
        GMTrace.o(19816173797376L, 147642);
      }
    };
    com.tencent.mm.plugin.appbrand.d.a(paramk.iqL, (d.b)localObject);
    localObject = paramJSONObject.optString("SSID");
    String str = paramJSONObject.optString("BSSID");
    paramJSONObject = paramJSONObject.optString("password");
    if ((((String)localObject).equals("")) || (str.equals("")))
    {
      w.e("MicroMsg.JsApiConenctWifi", "params is invalid");
      paramk.v(paramInt, d("fail:invalid data", null));
      GMTrace.o(19824495296512L, 147704);
      return;
    }
    w.i("MicroMsg.JsApiConenctWifi", "ssid:%s, bSsid:%s is connecting", new Object[] { localObject, str });
    com.tencent.mm.plugin.appbrand.jsapi.wifi.wifisdk.d.z((String)localObject, str, paramJSONObject);
    GMTrace.o(19824495296512L, 147704);
  }
  
  public static final class a
    extends e
  {
    private static final int CTRL_INDEX = 322;
    private static final String NAME = "onWifiConnected";
    
    public a()
    {
      GMTrace.i(19824763731968L, 147706);
      GMTrace.o(19824763731968L, 147706);
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/wifi/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */