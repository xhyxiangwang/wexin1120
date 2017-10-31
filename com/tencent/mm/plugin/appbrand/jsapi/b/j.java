package com.tencent.mm.plugin.appbrand.jsapi.b;

import android.annotation.TargetApi;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattDescriptor;
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
import java.util.UUID;
import org.json.JSONObject;

@TargetApi(18)
public final class j
  extends com.tencent.mm.plugin.appbrand.jsapi.a
{
  private static final int CTRL_INDEX = 186;
  private static final String NAME = "notifyBLECharacteristicValueChanged";
  protected static final UUID iUR;
  
  static
  {
    GMTrace.i(16543140282368L, 123256);
    iUR = UUID.fromString("00002902-0000-1000-8000-00805f9b34fb");
    GMTrace.o(16543140282368L, 123256);
  }
  
  public j()
  {
    GMTrace.i(14328950423552L, 106759);
    GMTrace.o(14328950423552L, 106759);
  }
  
  public final void a(k paramk, JSONObject paramJSONObject, int paramInt)
  {
    GMTrace.i(14329084641280L, 106760);
    if (paramJSONObject == null)
    {
      w.e("MicroMsg.JsApiNotifyBLECharacteristicValueChanged", "JsApiNotifyBLECharacteristicValueChanged data is null");
      paramk.v(paramInt, d("fail:data is null", null));
      GMTrace.o(14329084641280L, 106760);
      return;
    }
    w.i("MicroMsg.JsApiNotifyBLECharacteristicValueChanged", "notifyBLECharacteristicValueChanged!");
    HashMap localHashMap = new HashMap();
    if (f.eu(18))
    {
      w.e("MicroMsg.JsApiNotifyBLECharacteristicValueChanged", "API version is below 18!");
      localHashMap.put("errCode", Integer.valueOf(10009));
      paramk.v(paramInt, d("fail", localHashMap));
      GMTrace.o(14329084641280L, 106760);
      return;
    }
    if (!a.iUJ)
    {
      w.e("MicroMsg.JsApiNotifyBLECharacteristicValueChanged", "bluetooth is not init!");
      localHashMap.put("errCode", Integer.valueOf(10000));
      paramk.v(paramInt, d("fail", localHashMap));
      GMTrace.o(14329084641280L, 106760);
      return;
    }
    Object localObject1 = (BluetoothManager)paramk.mContext.getSystemService("bluetooth");
    if (localObject1 == null)
    {
      w.e("MicroMsg.JsApiNotifyBLECharacteristicValueChanged", "bluetoothManager is null!");
      localHashMap.put("errCode", Integer.valueOf(10001));
      paramk.v(paramInt, d("fail", localHashMap));
      GMTrace.o(14329084641280L, 106760);
      return;
    }
    localObject1 = ((BluetoothManager)localObject1).getAdapter();
    if ((localObject1 == null) || (!((BluetoothAdapter)localObject1).isEnabled()))
    {
      w.e("MicroMsg.JsApiNotifyBLECharacteristicValueChanged", "adapter is null or not enabled!");
      localHashMap.put("errCode", Integer.valueOf(10001));
      paramk.v(paramInt, d("fail", localHashMap));
      GMTrace.o(14329084641280L, 106760);
      return;
    }
    Object localObject2 = paramJSONObject.optString("deviceId");
    String str1 = paramJSONObject.optString("serviceId");
    String str2 = paramJSONObject.optString("characteristicId");
    boolean bool2 = paramJSONObject.optBoolean("state");
    w.i("MicroMsg.JsApiNotifyBLECharacteristicValueChanged", " notifyBLECharacteristicValueChanged deviceID : " + (String)localObject2 + ",serviceId : " + str1 + ", characteristicId : " + str2 + ",state : " + bool2);
    paramJSONObject = a.g(paramk);
    localObject1 = (BluetoothGatt)paramJSONObject.get("key_bluetooth_gatt" + (String)localObject2, null);
    if (localObject1 == null)
    {
      w.e("MicroMsg.JsApiNotifyBLECharacteristicValueChanged", "get bluetoothGatt failed, bluetoothGatt is null!");
      localHashMap.put("errCode", Integer.valueOf(10001));
      paramk.v(paramInt, d("fail", localHashMap));
      GMTrace.o(14329084641280L, 106760);
      return;
    }
    paramJSONObject = (BluetoothGattCharacteristic)paramJSONObject.get((String)localObject2 + str1 + str2, null);
    if (paramJSONObject == null)
    {
      w.e("MicroMsg.JsApiNotifyBLECharacteristicValueChanged", "get characteristics failed !");
      localHashMap.put("errCode", Integer.valueOf(10005));
      paramk.v(paramInt, d("fail", localHashMap));
      GMTrace.o(14329084641280L, 106760);
      return;
    }
    int i = paramJSONObject.getProperties();
    if (((i & 0x10) == 0) && ((i & 0x20) == 0))
    {
      w.i("MicroMsg.JsApiNotifyBLECharacteristicValueChanged", "not support notify and not support indicate...");
      localHashMap.put("errCode", Integer.valueOf(10007));
      paramk.v(paramInt, d("fail", localHashMap));
      GMTrace.o(14329084641280L, 106760);
      return;
    }
    boolean bool1 = ((BluetoothGatt)localObject1).setCharacteristicNotification(paramJSONObject, bool2);
    w.i("MicroMsg.JsApiNotifyBLECharacteristicValueChanged", "setCharacteristicNotification，state: " + bool2 + ",suc?" + bool1);
    localObject2 = paramJSONObject.getDescriptor(iUR);
    if (localObject2 == null)
    {
      w.e("MicroMsg.JsApiNotifyBLECharacteristicValueChanged", "Can not get configure descriptor");
      paramk.v(paramInt, d("fail", localHashMap));
      GMTrace.o(14329084641280L, 106760);
      return;
    }
    w.i("MicroMsg.JsApiNotifyBLECharacteristicValueChanged", "Configure descriptor permissions: " + ((BluetoothGattDescriptor)localObject2).getPermissions());
    if (((i & 0x10) != 0) && ((i & 0x20) == 0))
    {
      w.i("MicroMsg.JsApiNotifyBLECharacteristicValueChanged", "support notify. not support indicate...");
      if (bool2) {}
      for (paramJSONObject = BluetoothGattDescriptor.ENABLE_NOTIFICATION_VALUE;; paramJSONObject = BluetoothGattDescriptor.DISABLE_NOTIFICATION_VALUE)
      {
        ((BluetoothGattDescriptor)localObject2).setValue(paramJSONObject);
        bool2 = ((BluetoothGatt)localObject1).writeDescriptor((BluetoothGattDescriptor)localObject2);
        w.i("MicroMsg.JsApiNotifyBLECharacteristicValueChanged", "writeDescriptor isWriteDescriptorSuc:" + bool2);
        if (bool1) {
          break;
        }
        w.e("MicroMsg.JsApiNotifyBLECharacteristicValueChanged", "setCharacteristicNotification failed!");
        localHashMap.put("errCode", Integer.valueOf(10008));
        paramk.v(paramInt, d("fail", localHashMap));
        GMTrace.o(14329084641280L, 106760);
        return;
      }
    }
    if (((i & 0x10) == 0) && ((i & 0x20) != 0))
    {
      w.i("MicroMsg.JsApiNotifyBLECharacteristicValueChanged", "not support notify .support indicate...");
      if (bool2) {}
      for (paramJSONObject = BluetoothGattDescriptor.ENABLE_INDICATION_VALUE;; paramJSONObject = BluetoothGattDescriptor.DISABLE_NOTIFICATION_VALUE)
      {
        ((BluetoothGattDescriptor)localObject2).setValue(paramJSONObject);
        bool2 = ((BluetoothGatt)localObject1).writeDescriptor((BluetoothGattDescriptor)localObject2);
        w.i("MicroMsg.JsApiNotifyBLECharacteristicValueChanged", "writeDescriptor isWriteDescriptorSuc:" + bool2);
        break;
      }
    }
    w.i("MicroMsg.JsApiNotifyBLECharacteristicValueChanged", "support both notify and indicate...");
    if (bool2) {}
    for (paramJSONObject = BluetoothGattDescriptor.ENABLE_INDICATION_VALUE;; paramJSONObject = BluetoothGattDescriptor.DISABLE_NOTIFICATION_VALUE)
    {
      ((BluetoothGattDescriptor)localObject2).setValue(paramJSONObject);
      bool2 = ((BluetoothGatt)localObject1).writeDescriptor((BluetoothGattDescriptor)localObject2);
      w.i("MicroMsg.JsApiNotifyBLECharacteristicValueChanged", "writeDescriptor isWriteDescriptorSuc:" + bool2);
      break;
    }
    localHashMap.put("errCode", Integer.valueOf(0));
    paramk.v(paramInt, d("ok", localHashMap));
    GMTrace.o(14329084641280L, 106760);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/b/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */