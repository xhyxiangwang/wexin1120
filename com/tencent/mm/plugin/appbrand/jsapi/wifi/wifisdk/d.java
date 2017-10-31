package com.tencent.mm.plugin.appbrand.jsapi.wifi.wifisdk;

import android.content.Context;
import android.content.IntentFilter;
import android.net.wifi.ScanResult;
import android.net.wifi.WifiConfiguration;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Handler;
import android.text.TextUtils;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.jsapi.wifi.wifisdk.internal.WiFiConnector.2;
import com.tencent.mm.sdk.platformtools.w;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Iterator;
import java.util.List;

public final class d
{
  private static boolean jfu;
  private static WeakReference<com.tencent.mm.plugin.appbrand.jsapi.wifi.wifisdk.internal.a> jfv;
  private static b jfw;
  private static a jfx;
  private static Context mContext;
  
  static
  {
    GMTrace.i(19818455498752L, 147659);
    jfu = false;
    jfv = null;
    jfw = null;
    GMTrace.o(19818455498752L, 147659);
  }
  
  public static b XQ()
  {
    GMTrace.i(19817918627840L, 147655);
    WifiInfo localWifiInfo = com.tencent.mm.plugin.appbrand.jsapi.wifi.wifisdk.internal.c.getConnectionInfo();
    String str = "";
    Object localObject = str;
    if (localWifiInfo != null)
    {
      localObject = str;
      if (!TextUtils.isEmpty(localWifiInfo.getSSID())) {
        localObject = com.tencent.mm.plugin.appbrand.jsapi.wifi.wifisdk.internal.d.qG(localWifiInfo.getSSID());
      }
    }
    if ((jfw != null) && (jfw.jfn.compareTo((String)localObject) == 0))
    {
      localObject = jfw;
      GMTrace.o(19817918627840L, 147655);
      return (b)localObject;
    }
    if (localWifiInfo != null)
    {
      XR();
      localObject = jfw;
      GMTrace.o(19817918627840L, 147655);
      return (b)localObject;
    }
    GMTrace.o(19817918627840L, 147655);
    return null;
  }
  
  public static c XR()
  {
    GMTrace.i(19818052845568L, 147656);
    c localc = new c();
    jfw = null;
    Object localObject2;
    if ((jfu) && (com.tencent.mm.plugin.appbrand.jsapi.wifi.wifisdk.internal.c.isWifiEnabled()))
    {
      com.tencent.mm.plugin.appbrand.jsapi.wifi.wifisdk.internal.c.startScan();
      localObject2 = com.tencent.mm.plugin.appbrand.jsapi.wifi.wifisdk.internal.c.getScanResults();
      localc.jft = new ArrayList();
      localc.iRD = "ok";
      if (localObject2 != null)
      {
        w.d("MicroMsg.WiFiManagerWrapper", "[getWifiList] ScanResult:%s, size:%d", new Object[] { localObject2, Integer.valueOf(((List)localObject2).size()) });
        localObject1 = com.tencent.mm.plugin.appbrand.jsapi.wifi.wifisdk.internal.c.getConnectionInfo();
        w.d("MicroMsg.WiFiManagerWrapper", "[getWifiList] currentWiFiInfo:%s", new Object[] { localObject1 });
        if ((localObject1 == null) || (TextUtils.isEmpty(((WifiInfo)localObject1).getSSID()))) {
          break label377;
        }
      }
    }
    label233:
    label246:
    label323:
    label328:
    label377:
    for (Object localObject1 = com.tencent.mm.plugin.appbrand.jsapi.wifi.wifisdk.internal.d.qG(((WifiInfo)localObject1).getSSID());; localObject1 = null)
    {
      localObject2 = ((List)localObject2).iterator();
      while (((Iterator)localObject2).hasNext())
      {
        ScanResult localScanResult = (ScanResult)((Iterator)localObject2).next();
        if (localScanResult != null)
        {
          int j = com.tencent.mm.plugin.appbrand.jsapi.wifi.wifisdk.internal.d.a(localScanResult);
          if ((j == 0) || (j == 2))
          {
            b localb = new b();
            localb.jfn = com.tencent.mm.plugin.appbrand.jsapi.wifi.wifisdk.internal.d.qG(localScanResult.SSID);
            localb.jfo = localScanResult.BSSID;
            int i = localScanResult.level;
            boolean bool;
            if (i <= -100)
            {
              i = 0;
              localb.jfp = i;
              if (j != 2) {
                break label323;
              }
              bool = true;
              localb.jfq = bool;
              if ((localObject1 == null) || (localb.jfn.compareTo((String)localObject1) != 0)) {
                break label328;
              }
            }
            for (i = 1;; i = 0)
            {
              if (i != 0) {
                jfw = localb;
              }
              localc.jft.add(localb);
              break;
              if (i >= -55)
              {
                i = 99;
                break label233;
              }
              i = (int)((i + 100) * 99.0F / 45.0F);
              break label233;
              bool = false;
              break label246;
            }
            w.e("MicroMsg.WiFiManagerWrapper", "wifiList is null");
          }
        }
      }
      for (;;)
      {
        GMTrace.o(19818052845568L, 147656);
        return localc;
        if (jfu) {
          localc.iRD = "wifi is disable";
        } else {
          localc.iRD = "sdk not init";
        }
      }
    }
  }
  
  public static void a(a parama)
  {
    GMTrace.i(19818321281024L, 147658);
    jfx = parama;
    GMTrace.o(19818321281024L, 147658);
  }
  
  public static void bN(Context paramContext)
  {
    GMTrace.i(19817784410112L, 147654);
    if ((!jfu) && (paramContext != null))
    {
      mContext = paramContext;
      paramContext = (WifiManager)paramContext.getSystemService("wifi");
      if (paramContext != null)
      {
        com.tencent.mm.plugin.appbrand.jsapi.wifi.wifisdk.internal.c.aDZ = paramContext;
        jfu = true;
      }
    }
    GMTrace.o(19817784410112L, 147654);
  }
  
  public static void z(String paramString1, String paramString2, String paramString3)
  {
    String str = null;
    GMTrace.i(19818187063296L, 147657);
    if (jfv != null)
    {
      locala = (com.tencent.mm.plugin.appbrand.jsapi.wifi.wifisdk.internal.a)jfv.get();
      if ((locala != null) && (!locala.XS())) {
        locala.qF("duplicated request");
      }
    }
    com.tencent.mm.plugin.appbrand.jsapi.wifi.wifisdk.internal.a locala = new com.tencent.mm.plugin.appbrand.jsapi.wifi.wifisdk.internal.a(jfx, mContext);
    new StringBuilder("ssid:").append(paramString1).append(" bssid:").append(paramString2).append(" psw:").append(paramString3);
    locala.jfn = paramString1;
    locala.jfo = paramString2;
    if (TextUtils.isEmpty(paramString3))
    {
      i = 0;
      if ((paramString1 != null) && (paramString1.length() > 0)) {
        break label381;
      }
      paramString2 = null;
      List localList = com.tencent.mm.plugin.appbrand.jsapi.wifi.wifisdk.internal.c.getConfiguredNetworks();
      paramString3 = str;
      if (localList != null) {
        paramString3 = com.tencent.mm.plugin.appbrand.jsapi.wifi.wifisdk.internal.b.a(paramString1, i, localList);
      }
      if (paramString2 == null) {
        break label546;
      }
      str = paramString2;
      if (paramString3 != null)
      {
        if (!com.tencent.mm.plugin.appbrand.jsapi.wifi.wifisdk.internal.b.an(paramString1, i)) {
          break label558;
        }
        com.tencent.mm.plugin.appbrand.jsapi.wifi.wifisdk.internal.c.saveConfiguration();
      }
    }
    label381:
    label546:
    label558:
    for (int i = 1;; i = 0)
    {
      str = paramString2;
      if (i == 0)
      {
        paramString2.networkId = com.tencent.mm.plugin.appbrand.jsapi.wifi.wifisdk.internal.b.b(paramString2);
        str = paramString2;
        if (paramString2.networkId == com.tencent.mm.plugin.appbrand.jsapi.wifi.wifisdk.internal.d.jfI) {
          str = paramString3;
        }
      }
      if (str.networkId == com.tencent.mm.plugin.appbrand.jsapi.wifi.wifisdk.internal.d.jfI) {
        str.networkId = com.tencent.mm.plugin.appbrand.jsapi.wifi.wifisdk.internal.b.b(str);
      }
      if ((str.networkId != com.tencent.mm.plugin.appbrand.jsapi.wifi.wifisdk.internal.d.jfI) && (locala.a(str)))
      {
        locala.iL(1);
        locala.jfB = str;
        if (!locala.jfj)
        {
          paramString1 = new IntentFilter();
          paramString1.addAction("android.net.wifi.supplicant.STATE_CHANGE");
          paramString1.addAction("android.net.wifi.STATE_CHANGE");
          paramString1.addAction("android.net.conn.CONNECTIVITY_CHANGE");
          paramString1.setPriority(Integer.MAX_VALUE);
          locala.jfk = new WiFiConnector.2(locala);
          locala.jfy.registerReceiver(locala.jfk, paramString1);
          locala.jfj = true;
        }
        locala.mHandler.sendEmptyMessageDelayed(1, 13000L);
      }
      for (;;)
      {
        jfv = new WeakReference(locala);
        GMTrace.o(19818187063296L, 147657);
        return;
        i = 2;
        break;
        paramString2 = new WifiConfiguration();
        paramString2.allowedAuthAlgorithms.clear();
        paramString2.allowedGroupCiphers.clear();
        paramString2.allowedKeyManagement.clear();
        paramString2.allowedPairwiseCiphers.clear();
        paramString2.allowedProtocols.clear();
        paramString2.SSID = ("\"" + paramString1 + "\"");
        paramString2.hiddenSSID = true;
        switch (i)
        {
        default: 
          paramString2.allowedKeyManagement.set(0);
        }
        for (;;)
        {
          paramString2.status = 2;
          break;
          if (paramString3.length() != 0) {
            if (paramString3.matches("[0-9A-Fa-f]{64}")) {
              paramString2.preSharedKey = paramString3;
            } else {
              paramString2.preSharedKey = ("\"" + paramString3 + '"');
            }
          }
        }
        locala.e(false, "fail to connect wifi:invalid network id");
      }
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/wifi/wifisdk/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */