package com.tencent.mm.plugin.appbrand.jsapi.d;

import android.annotation.TargetApi;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothManager;
import android.content.Context;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.compatible.util.f;
import com.tencent.mm.plugin.appbrand.jsapi.e;
import com.tencent.mm.plugin.appbrand.k;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.x.q;
import com.tencent.mm.x.q.b;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

@TargetApi(18)
public final class d
  extends com.tencent.mm.plugin.appbrand.jsapi.a
{
  private static final int CTRL_INDEX = 222;
  private static final String NAME = "stopBeaconDiscovery";
  
  public d()
  {
    GMTrace.i(15473156554752L, 115284);
    GMTrace.o(15473156554752L, 115284);
  }
  
  public final void a(k paramk, JSONObject paramJSONObject, int paramInt)
  {
    GMTrace.i(15473290772480L, 115285);
    w.i("MicroMsg.JsApiStopBeaconDiscovery", "stopBeaconDiscovery!");
    Object localObject1 = new HashMap();
    if (f.eu(18))
    {
      w.e("MicroMsg.JsApiStopBeaconDiscovery", "API version is below 18!");
      ((Map)localObject1).put("errCode", Integer.valueOf(11000));
      paramk.v(paramInt, d("fail", (Map)localObject1));
      GMTrace.o(15473290772480L, 115285);
      return;
    }
    paramJSONObject = (BluetoothManager)paramk.mContext.getSystemService("bluetooth");
    if (paramJSONObject == null)
    {
      w.e("MicroMsg.JsApiStopBeaconDiscovery", "bluetoothManager is null!");
      paramk.v(paramInt, d("fail", (Map)localObject1));
      GMTrace.o(15473290772480L, 115285);
      return;
    }
    paramJSONObject = paramJSONObject.getAdapter();
    if (paramJSONObject == null)
    {
      w.e("MicroMsg.JsApiStopBeaconDiscovery", "bluetoothAdapter is null!");
      paramk.v(paramInt, d("fail", (Map)localObject1));
      GMTrace.o(15473290772480L, 115285);
      return;
    }
    Object localObject2 = a.i(paramk);
    localObject2 = q.Aw().gh((String)localObject2);
    if (localObject2 == null)
    {
      w.e("MicroMsg.JsApiStopBeaconDiscovery", "keyValueSet is null.");
      paramk.v(paramInt, d("fail", (Map)localObject1));
      GMTrace.o(15473290772480L, 115285);
      return;
    }
    c.a locala = (c.a)((q.b)localObject2).get("key_bluetooth_le_scaner", null);
    if (locala == null)
    {
      w.e("MicroMsg.JsApiStopBeaconDiscovery", "bluetoothLEScaner is null!");
      paramk.v(paramInt, d("fail", (Map)localObject1));
      GMTrace.o(15473290772480L, 115285);
      return;
    }
    a.Wz();
    paramJSONObject.stopLeScan(locala);
    ((q.b)localObject2).recycle();
    paramk.v(paramInt, d("ok", (Map)localObject1));
    localObject2 = new a();
    localObject1 = new JSONObject();
    for (;;)
    {
      try
      {
        if (!paramJSONObject.isEnabled()) {
          continue;
        }
        ((JSONObject)localObject1).put("available", true);
        ((JSONObject)localObject1).put("discovering", false);
      }
      catch (JSONException paramJSONObject)
      {
        w.e("MicroMsg.JsApiStopBeaconDiscovery", "put JSON data error : %s", new Object[] { paramJSONObject });
        continue;
      }
      w.i("MicroMsg.JsApiStopBeaconDiscovery", "OnBeaconServiceChangedEvent %s", new Object[] { ((JSONObject)localObject1).toString() });
      paramk = ((a)localObject2).aj(paramk.iqL, paramk.hashCode());
      paramk.mData = ((JSONObject)localObject1).toString();
      paramk.VI();
      GMTrace.o(15473290772480L, 115285);
      return;
      ((JSONObject)localObject1).put("available", false);
    }
  }
  
  private static final class a
    extends e
  {
    private static final int CTRL_INDEX = 225;
    private static final String NAME = "onBeaconServiceChanged";
    
    public a()
    {
      GMTrace.i(15472082812928L, 115276);
      GMTrace.o(15472082812928L, 115276);
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/d/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */