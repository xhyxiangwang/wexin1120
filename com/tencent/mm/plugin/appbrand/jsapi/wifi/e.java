package com.tencent.mm.plugin.appbrand.jsapi.wifi;

import android.content.Context;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.jsapi.a;
import com.tencent.mm.plugin.appbrand.k;
import com.tencent.mm.sdk.platformtools.w;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class e
  extends a
{
  public static final int CTRL_INDEX = 315;
  public static final String NAME = "stopWifi";
  
  public e()
  {
    GMTrace.i(19817113321472L, 147649);
    GMTrace.o(19817113321472L, 147649);
  }
  
  public final void a(k paramk, JSONObject paramJSONObject, int paramInt)
  {
    GMTrace.i(19817247539200L, 147650);
    w.i("MicroMsg.JsApiStopWifi", "invoke registerHotspotHelper");
    paramJSONObject = paramk.mContext;
    if (paramJSONObject == null)
    {
      w.e("MicroMsg.JsApiStopWifi", "mContext is null, invoke fail!");
      paramk.v(paramInt, d("fail", null));
      GMTrace.o(19817247539200L, 147650);
      return;
    }
    if (!d.jfj)
    {
      w.e("MicroMsg.JsApiStopWifi", "not invoke startWifi");
      paramJSONObject = new HashMap();
      paramJSONObject.put("errCode", Integer.valueOf(12000));
      paramk.v(paramInt, d("fail:not invoke startWifi", paramJSONObject));
      GMTrace.o(19817247539200L, 147650);
      return;
    }
    if (d.jfk != null)
    {
      w.i("MicroMsg.JsApiStopWifi", "unregisterReceiver");
      paramJSONObject.unregisterReceiver(d.jfk);
      d.jfj = false;
      d.jfk = null;
    }
    paramJSONObject = new HashMap();
    paramJSONObject.put("errCode", Integer.valueOf(0));
    paramk.v(paramInt, d("ok", paramJSONObject));
    GMTrace.o(19817247539200L, 147650);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/wifi/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */