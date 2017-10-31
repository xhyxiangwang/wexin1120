package com.tencent.mm.plugin.appbrand.jsapi.wifi;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.NetworkInfo;
import android.net.NetworkInfo.State;
import android.text.TextUtils;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.d.b;
import com.tencent.mm.plugin.appbrand.jsapi.a;
import com.tencent.mm.plugin.appbrand.jsapi.e;
import com.tencent.mm.plugin.appbrand.jsapi.wifi.wifisdk.b;
import com.tencent.mm.plugin.appbrand.k;
import com.tencent.mm.sdk.platformtools.w;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public final class d
  extends a
{
  public static final int CTRL_INDEX = 314;
  public static final String NAME = "startWifi";
  public static boolean jfj;
  public static BroadcastReceiver jfk;
  
  static
  {
    GMTrace.i(19816710668288L, 147646);
    jfj = false;
    jfk = null;
    GMTrace.o(19816710668288L, 147646);
  }
  
  public d()
  {
    GMTrace.i(19816308015104L, 147643);
    GMTrace.o(19816308015104L, 147643);
  }
  
  public static void j(k paramk)
  {
    GMTrace.i(19816576450560L, 147645);
    try
    {
      a.a locala = new a.a();
      HashMap localHashMap = new HashMap();
      localHashMap.put("wifi", new b().or());
      locala.aj(paramk.iqL, 0).r(localHashMap).VI();
      GMTrace.o(19816576450560L, 147645);
      return;
    }
    catch (JSONException paramk)
    {
      w.e("MicroMsg.JsApiStartWifi", "mWiFiEventReceiver is error");
      w.printErrStackTrace("MicroMsg.JsApiStartWifi", paramk, "", new Object[0]);
      GMTrace.o(19816576450560L, 147645);
    }
  }
  
  public final void a(final k paramk, final JSONObject paramJSONObject, int paramInt)
  {
    GMTrace.i(19816442232832L, 147644);
    w.i("MicroMsg.JsApiStartWifi", "invoke startWifi");
    paramJSONObject = paramk.mContext;
    if (paramJSONObject == null)
    {
      w.e("MicroMsg.JsApiStartWifi", "mContext is null, invoke fail!");
      paramk.v(paramInt, d("fail", null));
      GMTrace.o(19816442232832L, 147644);
      return;
    }
    com.tencent.mm.plugin.appbrand.jsapi.wifi.wifisdk.d.bN(paramJSONObject);
    if (!jfj)
    {
      IntentFilter localIntentFilter = new IntentFilter();
      localIntentFilter.addAction("android.net.wifi.STATE_CHANGE");
      localIntentFilter.addAction("android.net.wifi.WIFI_STATE_CHANGED");
      localIntentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
      localIntentFilter.setPriority(Integer.MAX_VALUE);
      jfk = new BroadcastReceiver()
      {
        public final void onReceive(Context paramAnonymousContext, Intent paramAnonymousIntent)
        {
          GMTrace.i(19815905361920L, 147640);
          if (paramAnonymousIntent == null)
          {
            GMTrace.o(19815905361920L, 147640);
            return;
          }
          paramAnonymousContext = paramAnonymousIntent.getAction();
          if (TextUtils.isEmpty(paramAnonymousContext))
          {
            GMTrace.o(19815905361920L, 147640);
            return;
          }
          w.i("MicroMsg.JsApiStartWifi", "actiong:%s", new Object[] { paramAnonymousContext });
          int i;
          if ("android.net.wifi.WIFI_STATE_CHANGED".equals(paramAnonymousContext))
          {
            i = paramAnonymousIntent.getIntExtra("wifi_state", 0);
            w.i("MicroMsg.JsApiStartWifi", "wifiState" + i);
          }
          label153:
          int j;
          switch (i)
          {
          default: 
            if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(paramAnonymousContext)) {
              break label328;
            }
            paramAnonymousContext = paramAnonymousIntent.getParcelableExtra("networkInfo");
            if (paramAnonymousContext == null) {
              break label328;
            }
            paramAnonymousContext = (NetworkInfo)paramAnonymousContext;
            if (paramAnonymousContext.getState() == NetworkInfo.State.CONNECTED)
            {
              i = 1;
              if (paramAnonymousContext.getType() != 1) {
                break label227;
              }
              j = 1;
            }
            break;
          }
          for (;;)
          {
            if ((i != 0) && (j != 0))
            {
              paramAnonymousContext = com.tencent.mm.plugin.appbrand.jsapi.wifi.wifisdk.d.XQ();
              w.i("MicroMsg.JsApiStartWifi", "[mWiFiEventReceiver]currentWifi:%s", new Object[] { paramAnonymousContext });
              if (paramAnonymousContext == null)
              {
                w.e("MicroMsg.JsApiStartWifi", "[CONNECTIVITY_ACTION]currentWIfi is null");
                GMTrace.o(19815905361920L, 147640);
                return;
                d.j(paramk);
                break;
                i = 0;
                break label153;
                label227:
                j = 0;
                continue;
              }
              try
              {
                paramAnonymousIntent = new a.a();
                HashMap localHashMap = new HashMap();
                localHashMap.put("wifi", paramAnonymousContext.or());
                paramAnonymousIntent.aj(paramk.iqL, 0).r(localHashMap).VI();
                GMTrace.o(19815905361920L, 147640);
                return;
              }
              catch (JSONException paramAnonymousContext)
              {
                w.e("MicroMsg.JsApiStartWifi", "IConnectWiFiCallback is error");
                w.printErrStackTrace("MicroMsg.JsApiStartWifi", paramAnonymousContext, "", new Object[0]);
                GMTrace.o(19815905361920L, 147640);
                return;
              }
            }
          }
          d.j(paramk);
          label328:
          GMTrace.o(19815905361920L, 147640);
        }
      };
      paramJSONObject.registerReceiver(jfk, localIntentFilter);
      jfj = true;
    }
    paramJSONObject = new d.b()
    {
      public final void onDestroy()
      {
        GMTrace.i(19816979103744L, 147648);
        if (d.jfk != null)
        {
          w.i("MicroMsg.JsApiStartWifi", "unregisterReceiver");
          paramJSONObject.unregisterReceiver(d.jfk);
          d.jfj = false;
          d.jfk = null;
        }
        com.tencent.mm.plugin.appbrand.d.b(paramk.iqL, this);
        GMTrace.o(19816979103744L, 147648);
      }
    };
    com.tencent.mm.plugin.appbrand.d.a(paramk.iqL, paramJSONObject);
    paramJSONObject = new HashMap();
    paramJSONObject.put("errCode", Integer.valueOf(0));
    paramk.v(paramInt, d("ok", paramJSONObject));
    GMTrace.o(19816442232832L, 147644);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/wifi/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */