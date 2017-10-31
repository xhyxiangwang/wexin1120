package com.tencent.mm.plugin.appbrand.jsapi.b;

import android.annotation.TargetApi;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCallback;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattService;
import android.bluetooth.BluetoothManager;
import android.content.Context;
import android.util.Base64;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.compatible.util.f;
import com.tencent.mm.plugin.appbrand.jsapi.e;
import com.tencent.mm.plugin.appbrand.k;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.x.q.b;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@TargetApi(18)
public final class d
  extends com.tencent.mm.plugin.appbrand.jsapi.a
{
  private static final int CTRL_INDEX = 180;
  private static final String NAME = "createBLEConnection";
  
  public d()
  {
    GMTrace.i(14329218859008L, 106761);
    GMTrace.o(14329218859008L, 106761);
  }
  
  public final void a(k paramk, JSONObject paramJSONObject, int paramInt)
  {
    GMTrace.i(14329353076736L, 106762);
    if (paramJSONObject == null)
    {
      w.e("MicroMsg.JsApiCreateBLEConnection", "JsApiCreateBLEConnection data is null");
      paramk.v(paramInt, d("fail:data is null", null));
      GMTrace.o(14329353076736L, 106762);
      return;
    }
    w.i("MicroMsg.JsApiCreateBLEConnection", "createBLEConnection data %s", new Object[] { paramJSONObject.toString() });
    if (f.eu(18))
    {
      w.e("MicroMsg.JsApiCreateBLEConnection", "API version is below 18!");
      paramJSONObject = new HashMap();
      paramJSONObject.put("errCode", Integer.valueOf(10009));
      paramk.v(paramInt, d("fail", paramJSONObject));
      GMTrace.o(14329353076736L, 106762);
      return;
    }
    if (!a.iUJ)
    {
      w.e("MicroMsg.JsApiCreateBLEConnection", "bluetooth is not init!");
      paramJSONObject = new HashMap();
      paramJSONObject.put("errCode", Integer.valueOf(10000));
      paramk.v(paramInt, d("fail", paramJSONObject));
      GMTrace.o(14329353076736L, 106762);
      return;
    }
    paramJSONObject = paramJSONObject.optString("deviceId");
    Object localObject1 = (BluetoothManager)paramk.mContext.getSystemService("bluetooth");
    if (localObject1 == null)
    {
      w.e("MicroMsg.JsApiCreateBLEConnection", "bluetoothManager is null!");
      paramJSONObject = new HashMap();
      paramJSONObject.put("errCode", Integer.valueOf(10001));
      paramk.v(paramInt, d("fail", paramJSONObject));
      GMTrace.o(14329353076736L, 106762);
      return;
    }
    localObject1 = ((BluetoothManager)localObject1).getAdapter();
    if (localObject1 == null)
    {
      w.e("MicroMsg.JsApiCreateBLEConnection", "bluetoothAdapter is null!");
      paramJSONObject = new HashMap();
      paramJSONObject.put("errCode", Integer.valueOf(10001));
      paramk.v(paramInt, d("fail", paramJSONObject));
      GMTrace.o(14329353076736L, 106762);
      return;
    }
    if (!((BluetoothAdapter)localObject1).isEnabled())
    {
      paramJSONObject = new HashMap();
      paramJSONObject.put("isDiscovering", Boolean.valueOf(false));
      paramJSONObject.put("errCode", Integer.valueOf(10001));
      paramk.v(paramInt, d("fail", paramJSONObject));
      GMTrace.o(14329353076736L, 106762);
      return;
    }
    w.i("MicroMsg.JsApiCreateBLEConnection", " get bluetoothDevice with deviceId : " + paramJSONObject);
    try
    {
      Object localObject2 = ((BluetoothAdapter)localObject1).getRemoteDevice(paramJSONObject);
      if (localObject2 == null)
      {
        w.e("MicroMsg.JsApiCreateBLEConnection", "bluetoothDevice is null!");
        paramJSONObject = new HashMap();
        paramJSONObject.put("errCode", Integer.valueOf(10002));
        paramk.v(paramInt, d("fail", paramJSONObject));
        GMTrace.o(14329353076736L, 106762);
        return;
      }
      localObject1 = a.g(paramk);
      localObject2 = ((BluetoothDevice)localObject2).connectGatt(paramk.mContext, false, new a(paramk, paramInt, (byte)0));
      if (localObject2 == null)
      {
        w.e("MicroMsg.JsApiCreateBLEConnection", "bluetoothGatt is null!");
        paramJSONObject = new HashMap();
        paramJSONObject.put("errCode", Integer.valueOf(10003));
        paramk.v(paramInt, d("fail", paramJSONObject));
        GMTrace.o(14329353076736L, 106762);
        return;
      }
      ((q.b)localObject1).k("key_bluetooth_gatt" + paramJSONObject, localObject2);
      GMTrace.o(14329353076736L, 106762);
      return;
    }
    catch (IllegalArgumentException paramJSONObject)
    {
      w.e("MicroMsg.JsApiCreateBLEConnection", "macAddress is wrong!");
      paramJSONObject = new HashMap();
      paramJSONObject.put("errCode", Integer.valueOf(10002));
      paramk.v(paramInt, d("fail", paramJSONObject));
      GMTrace.o(14329353076736L, 106762);
    }
  }
  
  private final class a
    extends BluetoothGattCallback
  {
    private int iPM;
    private WeakReference<k> iUP;
    private String iqL;
    
    private a(k paramk, int paramInt)
    {
      GMTrace.i(14563026141184L, 108503);
      this.iUP = new WeakReference(paramk);
      this.iqL = paramk.iqL;
      this.iPM = paramInt;
      GMTrace.o(14563026141184L, 108503);
    }
    
    private void qb(String paramString)
    {
      GMTrace.i(14563160358912L, 108504);
      if (this.iUP.get() != null) {
        ((k)this.iUP.get()).v(this.iPM, paramString);
      }
      GMTrace.o(14563160358912L, 108504);
    }
    
    public final void onCharacteristicChanged(BluetoothGatt paramBluetoothGatt, BluetoothGattCharacteristic paramBluetoothGattCharacteristic)
    {
      GMTrace.i(14563697229824L, 108508);
      d.b localb = new d.b();
      String str1 = new String(Base64.encode(paramBluetoothGattCharacteristic.getValue(), 2));
      String str2 = paramBluetoothGattCharacteristic.getUuid().toString().toUpperCase();
      paramBluetoothGatt = paramBluetoothGatt.getDevice().getAddress();
      String str3 = paramBluetoothGattCharacteristic.getService().getUuid().toString().toUpperCase();
      paramBluetoothGattCharacteristic = new JSONObject();
      try
      {
        paramBluetoothGattCharacteristic.put("value", str1);
        paramBluetoothGattCharacteristic.put("serviceId", str3);
        paramBluetoothGattCharacteristic.put("characteristicId", str2);
        paramBluetoothGattCharacteristic.put("deviceId", paramBluetoothGatt);
        w.i("MicroMsg.JsApiCreateBLEConnection", "value %s, serviceId %s, uuid %s, deviceId %s", new Object[] { str1, str3, str2, paramBluetoothGatt });
        if (!a.iUJ)
        {
          w.e("MicroMsg.JsApiCreateBLEConnection", "bluetooth is not init,return...");
          GMTrace.o(14563697229824L, 108508);
          return;
        }
      }
      catch (JSONException localJSONException)
      {
        for (;;)
        {
          w.e("MicroMsg.JsApiCreateBLEConnection", "put JSON data error : %s", new Object[] { localJSONException });
        }
        paramBluetoothGatt = localb.aj(this.iqL, 0);
        paramBluetoothGatt.mData = paramBluetoothGattCharacteristic.toString();
        paramBluetoothGatt.VI();
        GMTrace.o(14563697229824L, 108508);
      }
    }
    
    public final void onCharacteristicRead(BluetoothGatt paramBluetoothGatt, BluetoothGattCharacteristic paramBluetoothGattCharacteristic, int paramInt)
    {
      GMTrace.i(14563563012096L, 108507);
      if (paramInt == 0)
      {
        d.b localb = new d.b();
        String str1 = new String(Base64.encode(paramBluetoothGattCharacteristic.getValue(), 2));
        String str2 = paramBluetoothGattCharacteristic.getUuid().toString().toUpperCase();
        paramBluetoothGatt = paramBluetoothGatt.getDevice().getAddress();
        String str3 = paramBluetoothGattCharacteristic.getService().getUuid().toString().toUpperCase();
        paramBluetoothGattCharacteristic = new JSONObject();
        try
        {
          paramBluetoothGattCharacteristic.put("value", str1);
          paramBluetoothGattCharacteristic.put("serviceId", str3);
          paramBluetoothGattCharacteristic.put("characteristicId", str2);
          paramBluetoothGattCharacteristic.put("deviceId", paramBluetoothGatt);
          w.i("MicroMsg.JsApiCreateBLEConnection", "read value %s, serviceId %s, uuid %s, deviceId %s", new Object[] { str1, str3, str2, paramBluetoothGatt });
          if (!a.iUJ)
          {
            w.e("MicroMsg.JsApiCreateBLEConnection", "bluetooth is not init,return...");
            GMTrace.o(14563563012096L, 108507);
            return;
          }
        }
        catch (JSONException localJSONException)
        {
          for (;;)
          {
            w.e("MicroMsg.JsApiCreateBLEConnection", "put JSON data error : %s", new Object[] { localJSONException });
          }
          paramBluetoothGatt = localb.aj(this.iqL, 0);
          paramBluetoothGatt.mData = paramBluetoothGattCharacteristic.toString();
          paramBluetoothGatt.VI();
        }
      }
      GMTrace.o(14563563012096L, 108507);
    }
    
    public final void onCharacteristicWrite(BluetoothGatt paramBluetoothGatt, BluetoothGattCharacteristic paramBluetoothGattCharacteristic, int paramInt)
    {
      GMTrace.i(14563831447552L, 108509);
      String str = new String(paramBluetoothGattCharacteristic.getValue());
      w.i("MicroMsg.JsApiCreateBLEConnection", "write name %s, uuid %s, value %s, status %s", new Object[] { paramBluetoothGatt.getDevice().getName(), paramBluetoothGattCharacteristic.getUuid().toString().toUpperCase(), str, Integer.valueOf(paramInt) });
      if (!a.iUJ)
      {
        w.e("MicroMsg.JsApiCreateBLEConnection", "bluetooth is not init,return...");
        GMTrace.o(14563831447552L, 108509);
        return;
      }
      if (paramInt == 0)
      {
        a.Wl().v(a.Wm(), "{\"errCode\":0,\"errMsg\":\"writeBLECharacteristicValue:ok\"}");
        GMTrace.o(14563831447552L, 108509);
        return;
      }
      a.Wl().v(a.Wm(), "{\"errCode\":10008,\"errMsg\":\"writeBLECharacteristicValue:fail\"}");
      GMTrace.o(14563831447552L, 108509);
    }
    
    public final void onConnectionStateChange(BluetoothGatt paramBluetoothGatt, int paramInt1, int paramInt2)
    {
      GMTrace.i(14563294576640L, 108505);
      boolean bool = false;
      if (paramInt2 == 2)
      {
        w.i("MicroMsg.JsApiCreateBLEConnection", "Attempting to start service discovery");
        paramBluetoothGatt.discoverServices();
        bool = true;
      }
      for (;;)
      {
        d.c localc = new d.c();
        Object localObject = new JSONObject();
        String str = paramBluetoothGatt.getDevice().getAddress();
        Map localMap;
        JSONObject localJSONObject;
        JSONArray localJSONArray;
        if (bool)
        {
          localMap = a.Wj();
          if (!localMap.containsKey(str))
          {
            localJSONObject = new JSONObject();
            localJSONArray = new JSONArray();
          }
        }
        try
        {
          localJSONObject.put("deviceId", str);
          localJSONObject.put("name", paramBluetoothGatt.getDevice().getName());
          localJSONObject.put("RSSI", 0);
          localJSONObject.put("advertisData", "");
          localJSONObject.put("advertisServiceUUIDs", localJSONArray);
          localJSONObject.put("localName", "");
          localMap.put(str, localJSONObject);
          w.i("MicroMsg.JsApiCreateBLEConnection", "onConnectionStateChange with deviceId : " + str);
        }
        catch (JSONException paramBluetoothGatt)
        {
          try
          {
            ((JSONObject)localObject).put("deviceId", str);
            ((JSONObject)localObject).put("connected", bool);
            w.i("MicroMsg.JsApiCreateBLEConnection", "deviceId %s, state %s", new Object[] { str, Boolean.valueOf(bool) });
            if (!a.iUJ)
            {
              w.e("MicroMsg.JsApiCreateBLEConnection", "bluetooth is not init,return...");
              GMTrace.o(14563294576640L, 108505);
              return;
              if (paramInt2 != 0) {
                continue;
              }
              bool = false;
              paramBluetoothGatt.close();
              w.e("MicroMsg.JsApiCreateBLEConnection", "device not connected!");
              localObject = new HashMap();
              ((Map)localObject).put("errCode", Integer.valueOf(10003));
              qb(d.this.d("fail", (Map)localObject));
              continue;
              paramBluetoothGatt = paramBluetoothGatt;
              w.e("MicroMsg.JsApiCreateBLEConnection", "put JSON data error : %s", new Object[] { paramBluetoothGatt });
            }
          }
          catch (JSONException paramBluetoothGatt)
          {
            for (;;)
            {
              w.e("MicroMsg.JsApiCreateBLEConnection", "put JSON data error : %s", new Object[] { paramBluetoothGatt });
            }
            paramBluetoothGatt = localc.aj(this.iqL, 0);
            paramBluetoothGatt.mData = ((JSONObject)localObject).toString();
            paramBluetoothGatt.VI();
            GMTrace.o(14563294576640L, 108505);
          }
        }
      }
    }
    
    public final void onReadRemoteRssi(BluetoothGatt paramBluetoothGatt, int paramInt1, int paramInt2)
    {
      GMTrace.i(14563965665280L, 108510);
      GMTrace.o(14563965665280L, 108510);
    }
    
    public final void onServicesDiscovered(BluetoothGatt paramBluetoothGatt, int paramInt)
    {
      GMTrace.i(14563428794368L, 108506);
      if (this.iUP.get() == null)
      {
        GMTrace.o(14563428794368L, 108506);
        return;
      }
      String str1;
      q.b localb;
      HashMap localHashMap;
      Object localObject1;
      boolean bool;
      label129:
      String str2;
      String str3;
      label251:
      BluetoothGattCharacteristic localBluetoothGattCharacteristic;
      String str4;
      if (paramInt == 0)
      {
        str1 = paramBluetoothGatt.getDevice().getAddress();
        w.i("MicroMsg.JsApiCreateBLEConnection", "onServicesDiscovered GATT_SUCCESS with deviceId : " + str1);
        localb = a.g((k)this.iUP.get());
        localHashMap = new HashMap();
        paramBluetoothGatt = paramBluetoothGatt.getServices().iterator();
        if (paramBluetoothGatt.hasNext())
        {
          localObject1 = (BluetoothGattService)paramBluetoothGatt.next();
          if (((BluetoothGattService)localObject1).getType() == 0)
          {
            bool = true;
            str2 = ((BluetoothGattService)localObject1).getUuid().toString().toUpperCase();
            localHashMap.put(str2, Boolean.valueOf(bool));
            w.i("MicroMsg.JsApiCreateBLEConnection", "type %s, serviceId %s", new Object[] { Boolean.valueOf(bool), str2 });
            str3 = new StringBuilder("key_bluetooth_gatt_service").append(str1).append(str2).toString().hashCode();
            Object localObject2 = ((BluetoothGattService)localObject1).getCharacteristics();
            localObject1 = new JSONArray();
            if (localObject2 == null) {
              break label508;
            }
            localObject2 = ((List)localObject2).iterator();
            if (!((Iterator)localObject2).hasNext()) {
              break label508;
            }
            localBluetoothGattCharacteristic = (BluetoothGattCharacteristic)((Iterator)localObject2).next();
            str4 = localBluetoothGattCharacteristic.getUuid().toString().toUpperCase();
            paramInt = localBluetoothGattCharacteristic.getProperties();
          }
        }
      }
      for (;;)
      {
        try
        {
          localJSONObject1 = new JSONObject();
          if ((paramInt & 0x2) == 0) {
            continue;
          }
          bool = true;
          localJSONObject1.put("read", bool);
          if ((paramInt & 0x8) != 0) {
            break label671;
          }
          if ((paramInt & 0x4) == 0) {
            continue;
          }
        }
        catch (JSONException localJSONException)
        {
          JSONObject localJSONObject1;
          JSONObject localJSONObject2;
          w.e("MicroMsg.JsApiCreateBLEConnection", "JSONException %s", new Object[] { localJSONException.getMessage() });
          continue;
        }
        localJSONObject1.put("write", bool);
        if ((paramInt & 0x10) != 0)
        {
          bool = true;
          localJSONObject1.put("notify", bool);
          if ((paramInt & 0x20) == 0) {
            continue;
          }
          bool = true;
          localJSONObject1.put("indicate", bool);
          localJSONObject2 = new JSONObject();
          localJSONObject2.put("uuid", str4);
          localJSONObject2.put("properties", localJSONObject1);
          ((JSONArray)localObject1).put(localJSONObject2);
          localb.k(str1 + str2 + str4, localBluetoothGattCharacteristic);
          break label251;
          bool = false;
          break label129;
          bool = false;
          continue;
          bool = false;
          continue;
        }
        bool = false;
        continue;
        bool = false;
        continue;
        label508:
        w.i("MicroMsg.JsApiCreateBLEConnection", "jsonArray %s", new Object[] { ((JSONArray)localObject1).toString() });
        localb.k(str3, localObject1);
        break;
        localb.k("key_bluetooth_services_uuid" + str1, localHashMap);
        paramBluetoothGatt = new HashMap();
        paramBluetoothGatt.put("errCode", Integer.valueOf(0));
        qb(d.this.d("ok", paramBluetoothGatt));
        GMTrace.o(14563428794368L, 108506);
        return;
        w.i("MicroMsg.JsApiCreateBLEConnection", "onServicesDiscovered fail..");
        paramBluetoothGatt = new HashMap();
        paramBluetoothGatt.put("errCode", Integer.valueOf(10006));
        qb(d.this.d("fail", paramBluetoothGatt));
        GMTrace.o(14563428794368L, 108506);
        return;
        label671:
        bool = true;
      }
    }
  }
  
  private static final class b
    extends e
  {
    private static final int CTRL_INDEX = 187;
    private static final String NAME = "onBLECharacteristicValueChange";
    
    public b()
    {
      GMTrace.i(14331366342656L, 106777);
      GMTrace.o(14331366342656L, 106777);
    }
  }
  
  private static final class c
    extends e
  {
    private static final int CTRL_INDEX = 188;
    private static final String NAME = "onBLEConnectionStateChanged";
    
    public c()
    {
      GMTrace.i(14335258656768L, 106806);
      GMTrace.o(14335258656768L, 106806);
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/b/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */