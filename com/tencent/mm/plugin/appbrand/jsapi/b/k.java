package com.tencent.mm.plugin.appbrand.jsapi.b;

import android.annotation.TargetApi;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.compatible.util.f;
import com.tencent.mm.plugin.appbrand.d.b;
import com.tencent.mm.plugin.appbrand.d.c;
import com.tencent.mm.plugin.appbrand.jsapi.e;
import com.tencent.mm.sdk.platformtools.w;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

@TargetApi(18)
public final class k
  extends com.tencent.mm.plugin.appbrand.jsapi.a
{
  private static final int CTRL_INDEX = 173;
  private static final String NAME = "openBluetoothAdapter";
  public static BroadcastReceiver iUS;
  
  public k()
  {
    GMTrace.i(14334184914944L, 106798);
    GMTrace.o(14334184914944L, 106798);
  }
  
  public final void a(final com.tencent.mm.plugin.appbrand.k paramk, JSONObject paramJSONObject, int paramInt)
  {
    GMTrace.i(14334319132672L, 106799);
    w.i("MicroMsg.JsApiOpenBluetoothAdapter", "openBluetoothAdapter!");
    paramJSONObject = new HashMap();
    if (f.eu(18))
    {
      w.e("MicroMsg.JsApiOpenBluetoothAdapter", "API version is below 18!");
      paramJSONObject.put("errCode", Integer.valueOf(10009));
      paramk.v(paramInt, d("fail", paramJSONObject));
      GMTrace.o(14334319132672L, 106799);
      return;
    }
    Object localObject = (BluetoothManager)paramk.mContext.getSystemService("bluetooth");
    if (localObject == null)
    {
      w.e("MicroMsg.JsApiOpenBluetoothAdapter", "bluetoothManager is null!");
      paramk.v(paramInt, d("fail", null));
      GMTrace.o(14334319132672L, 106799);
      return;
    }
    if (!paramk.mContext.getPackageManager().hasSystemFeature("android.hardware.bluetooth_le"))
    {
      w.e("MicroMsg.JsApiOpenBluetoothAdapter", "not support ble feature!");
      paramk.v(paramInt, d("fail", null));
      GMTrace.o(14334319132672L, 106799);
      return;
    }
    localObject = ((BluetoothManager)localObject).getAdapter();
    if (localObject == null)
    {
      w.e("MicroMsg.JsApiOpenBluetoothAdapter", "bluetoothAdapter is null!");
      paramk.v(paramInt, d("fail", null));
      GMTrace.o(14334319132672L, 106799);
      return;
    }
    if (iUS == null)
    {
      iUS = new BroadcastReceiver()
      {
        public final void onReceive(Context paramAnonymousContext, Intent paramAnonymousIntent)
        {
          GMTrace.i(14331768995840L, 106780);
          if (paramAnonymousIntent == null)
          {
            w.i("MicroMsg.JsApiOpenBluetoothAdapter", "Receive intent failed");
            GMTrace.o(14331768995840L, 106780);
            return;
          }
          paramAnonymousContext = BluetoothAdapter.getDefaultAdapter();
          int j;
          boolean bool;
          int i;
          if (paramAnonymousContext != null)
          {
            j = paramAnonymousContext.getState();
            if (j == 12)
            {
              bool = true;
              i = 1;
              w.i("MicroMsg.JsApiOpenBluetoothAdapter", "bluetoothAdapter state: %s", new Object[] { Integer.valueOf(j) });
            }
          }
          for (;;)
          {
            if (i != 0)
            {
              if (!a.iUJ)
              {
                w.e("MicroMsg.JsApiOpenBluetoothAdapter", "bluetooth is not init,return...");
                GMTrace.o(14331768995840L, 106780);
                return;
                if (j != 10) {
                  break label234;
                }
                bool = false;
                i = 1;
                break;
              }
              paramAnonymousIntent = new k.a();
              paramAnonymousContext = new JSONObject();
            }
            try
            {
              paramAnonymousContext.put("available", bool);
              paramAnonymousContext.put("discovering", false);
              w.i("MicroMsg.JsApiOpenBluetoothAdapter", "OnBluetoothAdapterStateChange %s", new Object[] { paramAnonymousContext.toString() });
              if (paramk != null)
              {
                paramAnonymousIntent = paramAnonymousIntent.aj(paramk.iqL, paramk.hashCode());
                paramAnonymousIntent.mData = paramAnonymousContext.toString();
                paramAnonymousIntent.VI();
              }
              GMTrace.o(14331768995840L, 106780);
              return;
            }
            catch (JSONException localJSONException)
            {
              for (;;)
              {
                w.e("MicroMsg.JsApiOpenBluetoothAdapter", "put JSON data error : %s", new Object[] { localJSONException });
              }
            }
            label234:
            bool = false;
            i = 0;
            break;
            bool = false;
            i = 0;
          }
        }
      };
      w.i("MicroMsg.JsApiOpenBluetoothAdapter", "registerReceiver");
      IntentFilter localIntentFilter = new IntentFilter();
      localIntentFilter.addAction("android.bluetooth.adapter.action.STATE_CHANGED");
      paramk.mContext.registerReceiver(iUS, localIntentFilter);
    }
    com.tencent.mm.plugin.appbrand.d.a(paramk.iqL, new d.b()
    {
      public final void a(d.c paramAnonymousc)
      {
        GMTrace.i(18948456185856L, 141177);
        GMTrace.o(18948456185856L, 141177);
      }
      
      public final void onDestroy()
      {
        GMTrace.i(18948590403584L, 141178);
        w.i("MicroMsg.JsApiOpenBluetoothAdapter", "lifecycle destroy...");
        if (paramk != null)
        {
          if (k.iUS != null)
          {
            w.i("MicroMsg.JsApiOpenBluetoothAdapter", "unregisterReceiver");
            paramk.mContext.unregisterReceiver(k.iUS);
            k.iUS = null;
          }
          com.tencent.mm.plugin.appbrand.d.b(paramk.iqL, this);
        }
        GMTrace.o(18948590403584L, 141178);
      }
      
      public final void onResume()
      {
        GMTrace.i(18948321968128L, 141176);
        GMTrace.o(18948321968128L, 141176);
      }
    });
    if (!((BluetoothAdapter)localObject).isEnabled())
    {
      w.e("MicroMsg.JsApiOpenBluetoothAdapter", "bluetoothAdapter not enabled!");
      a.iUJ = true;
      paramJSONObject.put("errCode", Integer.valueOf(10001));
      paramk.v(paramInt, d("fail", paramJSONObject));
      GMTrace.o(14334319132672L, 106799);
      return;
    }
    a.iUJ = true;
    paramk.v(paramInt, d("ok", null));
    GMTrace.o(14334319132672L, 106799);
  }
  
  private static final class a
    extends e
  {
    private static final int CTRL_INDEX = 189;
    private static final String NAME = "onBluetoothAdapterStateChange";
    
    public a()
    {
      GMTrace.i(14333111173120L, 106790);
      GMTrace.o(14333111173120L, 106790);
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/b/k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */