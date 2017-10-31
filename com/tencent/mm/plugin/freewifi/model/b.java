package com.tencent.mm.plugin.freewifi.model;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.NetworkInfo.DetailedState;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.freewifi.k;
import com.tencent.mm.plugin.freewifi.k.a;
import com.tencent.mm.plugin.freewifi.m;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.w;

public final class b
{
  public a mdw;
  BroadcastReceiver mdx;
  
  public b()
  {
    GMTrace.i(7136625033216L, 53172);
    this.mdw = new a();
    this.mdx = new BroadcastReceiver()
    {
      public final void onReceive(Context paramAnonymousContext, Intent paramAnonymousIntent)
      {
        GMTrace.i(7129377275904L, 53118);
        if (paramAnonymousIntent.getAction().equals("android.net.conn.CONNECTIVITY_CHANGE")) {
          try
          {
            w.i("MicroMsg.FreeWifi.FreeWifiConnChangedManager", "connChangedBroadcastReceiver");
            paramAnonymousIntent = (NetworkInfo)paramAnonymousIntent.getParcelableExtra("networkInfo");
            if (paramAnonymousIntent == null)
            {
              w.e("MicroMsg.FreeWifi.FreeWifiConnChangedManager", "networkInfo is null");
              GMTrace.o(7129377275904L, 53118);
              return;
            }
            w.v("MicroMsg.FreeWifi.FreeWifiConnChangedManager", "networkInfo=" + paramAnonymousIntent.toString() + "; networkInfo.isConnected()=%b, networkInfo.getState()=%s, networkInfo.getDetailedState()=%s, networkInfo.getExtraInfo()=%s, networkInfo.isConnectedOrConnecting()=%b, networkInfo.isAvailable()=%b, ", new Object[] { Boolean.valueOf(paramAnonymousIntent.isConnected()), paramAnonymousIntent.getState(), paramAnonymousIntent.getDetailedState(), paramAnonymousIntent.getExtraInfo(), Boolean.valueOf(paramAnonymousIntent.isConnectedOrConnecting()), Boolean.valueOf(paramAnonymousIntent.isAvailable()) });
            if (!paramAnonymousIntent.isConnected())
            {
              w.v("MicroMsg.FreeWifi.FreeWifiConnChangedManager", "network is not connected.");
              GMTrace.o(7129377275904L, 53118);
              return;
            }
            if ((paramAnonymousIntent.getType() != 0) && (paramAnonymousIntent.getType() != 1))
            {
              w.v("MicroMsg.FreeWifi.FreeWifiConnChangedManager", "network type is not wifi or mobile.");
              GMTrace.o(7129377275904L, 53118);
              return;
            }
            if (paramAnonymousContext == null)
            {
              w.e("MicroMsg.FreeWifi.FreeWifiConnChangedManager", "context is null.");
              GMTrace.o(7129377275904L, 53118);
              return;
            }
            if (paramAnonymousIntent.getType() == 1)
            {
              paramAnonymousContext = (WifiManager)paramAnonymousContext.getSystemService("wifi");
              if (paramAnonymousContext == null)
              {
                w.e("MicroMsg.FreeWifi.FreeWifiConnChangedManager", "wifiManager is null.");
                GMTrace.o(7129377275904L, 53118);
                return;
              }
              Object localObject = paramAnonymousContext.getConnectionInfo();
              if (localObject == null)
              {
                w.e("MicroMsg.FreeWifi.FreeWifiConnChangedManager", "wifiInfo is null.");
                GMTrace.o(7129377275904L, 53118);
                return;
              }
              paramAnonymousContext = m.xK(((WifiInfo)localObject).getSSID());
              localObject = m.xL(((WifiInfo)localObject).getBSSID()).toLowerCase();
              paramAnonymousIntent = m.xK(m.xL(paramAnonymousIntent.getExtraInfo()));
              w.i("MicroMsg.FreeWifi.FreeWifiConnChangedManager", "networkInfo.getExtraInfo()=%s, wifiInfo.getSsid()=%s, wifiInfo.getBssid=%s", new Object[] { paramAnonymousIntent, paramAnonymousContext, localObject });
              if (!m.xL(paramAnonymousIntent).equals(paramAnonymousContext))
              {
                w.e("MicroMsg.FreeWifi.FreeWifiConnChangedManager", "wifiManage ssid is not equal to networkInfo.getExtraInfo(). networkwork might changed. return.");
                GMTrace.o(7129377275904L, 53118);
                return;
              }
              if ((b.this.mdw.type == 1) && (m.xL(b.this.mdw.ssid).equals(paramAnonymousContext)) && (m.xL(b.this.mdw.bssid).equals(localObject)))
              {
                w.e("MicroMsg.FreeWifi.FreeWifiConnChangedManager", "Dulplicated intent.");
                GMTrace.o(7129377275904L, 53118);
                return;
              }
              paramAnonymousIntent = new b.a();
              paramAnonymousIntent.mdz = System.currentTimeMillis();
              paramAnonymousIntent.type = 1;
              paramAnonymousIntent.ssid = paramAnonymousContext;
              paramAnonymousIntent.bssid = ((String)localObject);
              paramAnonymousIntent.mdA = "";
              b.b(b.this.mdw.azQ(), paramAnonymousIntent);
              b.this.mdw = paramAnonymousIntent;
              GMTrace.o(7129377275904L, 53118);
              return;
            }
            if (paramAnonymousIntent.getType() == 0)
            {
              if ((b.this.mdw.type == 0) && (m.xL(b.this.mdw.mdA).equals(m.xL(paramAnonymousIntent.getExtraInfo()))))
              {
                w.e("MicroMsg.FreeWifi.FreeWifiConnChangedManager", "Dulplicated intent.");
                GMTrace.o(7129377275904L, 53118);
                return;
              }
              paramAnonymousContext = (ConnectivityManager)paramAnonymousContext.getSystemService("connectivity");
              if (paramAnonymousContext == null)
              {
                w.e("MicroMsg.FreeWifi.FreeWifiConnChangedManager", "connManager is null.");
                GMTrace.o(7129377275904L, 53118);
                return;
              }
              paramAnonymousContext = paramAnonymousContext.getNetworkInfo(1);
              if (paramAnonymousContext == null)
              {
                w.e("MicroMsg.FreeWifi.FreeWifiConnChangedManager", "networkInfoWifi is null.");
                GMTrace.o(7129377275904L, 53118);
                return;
              }
              w.i("MicroMsg.FreeWifi.FreeWifiConnChangedManager", "networkInfoWifi.getState()=%s, networkInfoWifi.getDetailedState()=%s", new Object[] { paramAnonymousContext.getState(), paramAnonymousContext.getDetailedState() });
              if (paramAnonymousContext.getDetailedState() != NetworkInfo.DetailedState.DISCONNECTED)
              {
                w.i("MicroMsg.FreeWifi.FreeWifiConnChangedManager", "It receives a type mobile connected event, but wifi network is not disconnected, so in fact user is probably switching wifi among ssids, not trying to connect to mobile network. ");
                GMTrace.o(7129377275904L, 53118);
                return;
              }
              paramAnonymousContext = new b.a();
              paramAnonymousContext.mdz = System.currentTimeMillis();
              paramAnonymousContext.type = 0;
              paramAnonymousContext.ssid = "";
              paramAnonymousContext.bssid = "";
              paramAnonymousContext.mdA = m.xL(paramAnonymousIntent.getExtraInfo());
              b.a(b.this.mdw.azQ(), paramAnonymousContext);
              b.this.mdw = paramAnonymousContext;
              GMTrace.o(7129377275904L, 53118);
              return;
            }
            GMTrace.o(7129377275904L, 53118);
            return;
          }
          catch (Exception paramAnonymousContext)
          {
            paramAnonymousIntent = k.azB();
            paramAnonymousIntent.fvF = "UnExpectedException";
            paramAnonymousIntent.result = -1;
            paramAnonymousIntent.kCB = m.d(paramAnonymousContext);
            paramAnonymousIntent.azD().azC();
            w.e("MicroMsg.FreeWifi.UnExcepctedException", m.e(paramAnonymousContext));
          }
        }
        GMTrace.o(7129377275904L, 53118);
      }
    };
    GMTrace.o(7136625033216L, 53172);
  }
  
  public static void a(a parama1, a parama2)
  {
    GMTrace.i(7136893468672L, 53174);
    m.xP("on mobile connected.");
    w.i("MicroMsg.FreeWifi.FreeWifiConnChangedManager", "onMobileConnected. lastRecord=%s, newRecord=%s", new Object[] { parama1.toString(), parama2.toString() });
    com.tencent.mm.plugin.freewifi.f.b.nK(0);
    GMTrace.o(7136893468672L, 53174);
  }
  
  public static void b(a parama1, a parama2)
  {
    GMTrace.i(7137027686400L, 53175);
    m.xP("on wifi connected.");
    w.i("MicroMsg.FreeWifi.FreeWifiConnChangedManager", "onWifiConnected. lastRecord=%s, newRecord=%s", new Object[] { parama1.toString(), parama2.toString() });
    if ((parama1.type == 1) && (parama1.ssid.equals(parama2.ssid)) && (!parama1.bssid.equals(parama2.bssid)))
    {
      String str = parama1.ssid;
      parama1 = parama1.bssid;
      parama2 = parama2.bssid;
      m.xP("on wifi roaming.");
      w.i("MicroMsg.FreeWifi.FreeWifiConnChangedManager", "WifiRoaming. ssid=%s, fromBssid=%s, toBssid=%s", new Object[] { str, parama1, parama2 });
    }
    com.tencent.mm.plugin.freewifi.f.b.nK(1);
    GMTrace.o(7137027686400L, 53175);
  }
  
  public final void azr()
  {
    GMTrace.i(7136759250944L, 53173);
    try
    {
      ab.getContext().unregisterReceiver(this.mdx);
      GMTrace.o(7136759250944L, 53173);
      return;
    }
    catch (IllegalArgumentException localIllegalArgumentException)
    {
      GMTrace.o(7136759250944L, 53173);
    }
  }
  
  private static final class a
  {
    String bssid;
    String mdA;
    long mdz;
    String ssid;
    int type;
    
    public a()
    {
      GMTrace.i(7143335919616L, 53222);
      this.ssid = "";
      this.bssid = "";
      this.mdA = "";
      GMTrace.o(7143335919616L, 53222);
    }
    
    public final a azQ()
    {
      GMTrace.i(7143470137344L, 53223);
      a locala = new a();
      locala.mdz = this.mdz;
      locala.type = this.type;
      locala.ssid = this.ssid;
      locala.bssid = this.bssid;
      locala.mdA = this.mdA;
      GMTrace.o(7143470137344L, 53223);
      return locala;
    }
    
    public final String toString()
    {
      GMTrace.i(7143604355072L, 53224);
      String str = String.format("NetworkInfoConnectedRecord(timeMillis=%d, type=%d, ssid=%s, bssid=%s, mobileNetworkType=%s)", new Object[] { Long.valueOf(this.mdz), Integer.valueOf(this.type), this.ssid, this.bssid, this.mdA });
      GMTrace.o(7143604355072L, 53224);
      return str;
    }
  }
  
  private static final class b
  {
    public static b mdB;
    
    static
    {
      GMTrace.i(7129645711360L, 53120);
      mdB = new b();
      GMTrace.o(7129645711360L, 53120);
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/freewifi/model/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */