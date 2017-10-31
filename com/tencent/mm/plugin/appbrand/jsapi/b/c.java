package com.tencent.mm.plugin.appbrand.jsapi.b;

import android.annotation.TargetApi;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothManager;
import android.content.Context;
import android.content.pm.PackageManager;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.compatible.util.f;
import com.tencent.mm.plugin.appbrand.jsapi.d;
import com.tencent.mm.sdk.platformtools.w;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

@TargetApi(18)
public final class c
  extends com.tencent.mm.plugin.appbrand.jsapi.a
{
  private static final int CTRL_INDEX = 174;
  private static final String NAME = "closeBluetoothAdapter";
  
  public c()
  {
    GMTrace.i(14334721785856L, 106802);
    GMTrace.o(14334721785856L, 106802);
  }
  
  public final void a(com.tencent.mm.plugin.appbrand.k paramk, JSONObject paramJSONObject, int paramInt)
  {
    GMTrace.i(14334856003584L, 106803);
    w.i("MicroMsg.JsApiCloseBluetoothAdapter", "closeBluetoothAdapter!");
    paramJSONObject = new HashMap();
    if (f.eu(18))
    {
      w.e("MicroMsg.JsApiCloseBluetoothAdapter", "API version is below 18!");
      paramJSONObject.put("errCode", Integer.valueOf(10009));
      paramk.v(paramInt, d("fail", paramJSONObject));
      GMTrace.o(14334856003584L, 106803);
      return;
    }
    if (!a.iUJ)
    {
      w.e("MicroMsg.JsApiCloseBluetoothAdapter", "bluetooth is not init!");
      paramJSONObject.put("errCode", Integer.valueOf(10000));
      paramk.v(paramInt, d("fail", paramJSONObject));
      GMTrace.o(14334856003584L, 106803);
      return;
    }
    Object localObject = (BluetoothManager)paramk.mContext.getSystemService("bluetooth");
    if (localObject == null)
    {
      w.e("MicroMsg.JsApiCloseBluetoothAdapter", "bluetoothManager is null!");
      paramJSONObject.put("errCode", Integer.valueOf(10001));
      paramk.v(paramInt, d("fail", paramJSONObject));
      GMTrace.o(14334856003584L, 106803);
      return;
    }
    if (!paramk.mContext.getPackageManager().hasSystemFeature("android.hardware.bluetooth_le"))
    {
      w.e("MicroMsg.JsApiCloseBluetoothAdapter", "not support ble feature!");
      paramJSONObject.put("errCode", Integer.valueOf(10001));
      paramk.v(paramInt, d("fail", paramJSONObject));
      GMTrace.o(14334856003584L, 106803);
      return;
    }
    localObject = ((BluetoothManager)localObject).getAdapter();
    if ((localObject == null) || (!((BluetoothAdapter)localObject).isEnabled()))
    {
      w.e("MicroMsg.JsApiCloseBluetoothAdapter", "bluetoothAdapter is null!");
      paramJSONObject.put("errCode", Integer.valueOf(10001));
      paramk.v(paramInt, d("fail", paramJSONObject));
      GMTrace.o(14334856003584L, 106803);
      return;
    }
    if (((BluetoothAdapter)localObject).isDiscovering()) {
      ((BluetoothAdapter)localObject).cancelDiscovery();
    }
    if (k.iUS != null) {
      w.i("MicroMsg.JsApiCloseBluetoothAdapter", "unregisterReceiver");
    }
    try
    {
      paramk.mContext.unregisterReceiver(k.iUS);
      k.iUS = null;
      a.Wk();
      a.Wn();
      a.h(paramk);
      a.iUJ = false;
      a.e(null);
      a.iA(0);
      w.i("MicroMsg.JsApiCloseBluetoothAdapter", "closeBluetoothAdapter end with success!");
      paramk.v(paramInt, d("ok", null));
      GMTrace.o(14334856003584L, 106803);
      return;
    }
    catch (Exception paramJSONObject)
    {
      for (;;)
      {
        w.e("MicroMsg.JsApiCloseBluetoothAdapter", "unregisterReceiver error!");
      }
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/b/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */