package com.tencent.mm.plugin.appbrand.jsapi.b;

import android.annotation.TargetApi;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothManager;
import android.content.Context;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.compatible.util.f;
import com.tencent.mm.plugin.appbrand.jsapi.d;
import com.tencent.mm.plugin.appbrand.k;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.x.q.b;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

@TargetApi(18)
public final class b
  extends com.tencent.mm.plugin.appbrand.jsapi.a
{
  private static final int CTRL_INDEX = 181;
  private static final String NAME = "closeBLEConnection";
  
  public b()
  {
    GMTrace.i(14330829471744L, 106773);
    GMTrace.o(14330829471744L, 106773);
  }
  
  public final void a(k paramk, JSONObject paramJSONObject, int paramInt)
  {
    GMTrace.i(14330963689472L, 106774);
    if (paramJSONObject == null)
    {
      w.e("MicroMsg.JsApiCloseBLEConnection", "JsApiCloseBLEConnection data is null");
      paramk.v(paramInt, d("fail:data is null", null));
      GMTrace.o(14330963689472L, 106774);
      return;
    }
    w.i("MicroMsg.JsApiCloseBLEConnection", "closeBLEConnection!");
    Object localObject1 = paramJSONObject.optString("deviceId");
    w.i("MicroMsg.JsApiCloseBLEConnection", "closeBLEConnection with deviceId : " + (String)localObject1);
    paramJSONObject = new HashMap();
    if (f.eu(18))
    {
      w.e("MicroMsg.JsApiCloseBLEConnection", "API version is below 18!");
      paramJSONObject.put("errCode", Integer.valueOf(10009));
      paramk.v(paramInt, d("fail", paramJSONObject));
      GMTrace.o(14330963689472L, 106774);
      return;
    }
    if (!a.iUJ)
    {
      w.e("MicroMsg.JsApiCloseBLEConnection", "bluetooth is not init!");
      paramJSONObject.put("errCode", Integer.valueOf(10000));
      paramk.v(paramInt, d("fail", paramJSONObject));
      GMTrace.o(14330963689472L, 106774);
      return;
    }
    Object localObject2 = (BluetoothManager)paramk.mContext.getSystemService("bluetooth");
    if (localObject2 == null)
    {
      w.e("MicroMsg.JsApiCloseBLEConnection", "bluetoothManager is null!");
      paramJSONObject.put("errCode", Integer.valueOf(10001));
      paramk.v(paramInt, d("fail", paramJSONObject));
      GMTrace.o(14330963689472L, 106774);
      return;
    }
    localObject2 = ((BluetoothManager)localObject2).getAdapter();
    if ((localObject2 == null) || (!((BluetoothAdapter)localObject2).isEnabled()))
    {
      w.e("MicroMsg.JsApiCloseBLEConnection", "adapter is null or not enabled!");
      paramJSONObject.put("errCode", Integer.valueOf(10001));
      paramk.v(paramInt, d("fail", paramJSONObject));
      GMTrace.o(14330963689472L, 106774);
      return;
    }
    localObject1 = (BluetoothGatt)a.g(paramk).get("key_bluetooth_gatt" + (String)localObject1, null);
    if (localObject1 == null)
    {
      w.e("MicroMsg.JsApiCloseBLEConnection", "get bluetoothGatt failed, bluetoothGatt is null!");
      paramJSONObject.put("errCode", Integer.valueOf(10001));
      paramk.v(paramInt, d("fail", paramJSONObject));
      GMTrace.o(14330963689472L, 106774);
      return;
    }
    ((BluetoothGatt)localObject1).disconnect();
    ((BluetoothGatt)localObject1).close();
    paramJSONObject.put("errCode", Integer.valueOf(0));
    paramk.v(paramInt, d("ok", paramJSONObject));
    GMTrace.o(14330963689472L, 106774);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/b/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */