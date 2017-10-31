package com.tencent.mm.plugin.freewifi.model;

import android.content.Context;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.wifi.ScanResult;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build.VERSION;
import android.os.RemoteException;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ac.d.a;
import com.tencent.mm.bt.g.d;
import com.tencent.mm.g.a.ae;
import com.tencent.mm.g.a.bg;
import com.tencent.mm.g.a.er;
import com.tencent.mm.g.a.eu;
import com.tencent.mm.g.a.gd;
import com.tencent.mm.g.a.gd.a;
import com.tencent.mm.g.a.ge;
import com.tencent.mm.g.a.nq;
import com.tencent.mm.kernel.h;
import com.tencent.mm.network.m.a;
import com.tencent.mm.platformtools.n;
import com.tencent.mm.plugin.freewifi.d.g;
import com.tencent.mm.plugin.freewifi.e.c.1;
import com.tencent.mm.plugin.freewifi.i;
import com.tencent.mm.plugin.freewifi.i.a;
import com.tencent.mm.plugin.freewifi.k.a;
import com.tencent.mm.plugin.freewifi.k.b;
import com.tencent.mm.protocal.c.aya;
import com.tencent.mm.protocal.c.bu;
import com.tencent.mm.protocal.c.cj;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.x.am;
import com.tencent.mm.x.ap;
import com.tencent.mm.x.bn;
import com.tencent.mm.x.bp;
import com.tencent.mm.x.bp.a;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class j
  implements am
{
  private static HashMap<Integer, g.d> gBa;
  private com.tencent.mm.sdk.b.c iHr;
  private bp.a loP;
  private d mdY;
  private com.tencent.mm.plugin.freewifi.g.d mdZ;
  private com.tencent.mm.plugin.freewifi.g.b mea;
  private com.tencent.mm.plugin.freewifi.g.f meb;
  private c mec;
  private c med;
  private a mee;
  private e mef;
  private com.tencent.mm.network.m meg;
  private com.tencent.mm.sdk.b.c meh;
  private com.tencent.mm.sdk.b.c mei;
  private com.tencent.mm.sdk.b.c mej;
  private com.tencent.mm.sdk.b.c mek;
  private com.tencent.mm.sdk.b.c mel;
  private com.tencent.mm.sdk.b.c mem;
  
  static
  {
    GMTrace.i(7140517347328L, 53201);
    HashMap localHashMap = new HashMap();
    gBa = localHashMap;
    localHashMap.put(Integer.valueOf("FREEWIFIINFO_TABLE".hashCode()), new g.d()
    {
      public final String[] rk()
      {
        GMTrace.i(7142127960064L, 53213);
        String[] arrayOfString = com.tencent.mm.plugin.freewifi.g.d.gMz;
        GMTrace.o(7142127960064L, 53213);
        return arrayOfString;
      }
    });
    gBa.put(Integer.valueOf("FREEWIFICONFIG_TABLE".hashCode()), new g.d()
    {
      public final String[] rk()
      {
        GMTrace.i(7145483403264L, 53238);
        String[] arrayOfString = com.tencent.mm.plugin.freewifi.g.b.gMz;
        GMTrace.o(7145483403264L, 53238);
        return arrayOfString;
      }
    });
    gBa.put(Integer.valueOf("FREEWIFILOG_TABLE".hashCode()), new g.d()
    {
      public final String[] rk()
      {
        GMTrace.i(7134745985024L, 53158);
        String[] arrayOfString = com.tencent.mm.plugin.freewifi.g.f.gMz;
        GMTrace.o(7134745985024L, 53158);
        return arrayOfString;
      }
    });
    GMTrace.o(7140517347328L, 53201);
  }
  
  public j()
  {
    GMTrace.i(7138504081408L, 53186);
    this.meg = new m.a()
    {
      private byte[] gBF;
      
      public final void db(int paramAnonymousInt)
      {
        GMTrace.i(7130719453184L, 53128);
        for (;;)
        {
          synchronized (this.gBF)
          {
            if (!ap.AV())
            {
              w.e("MicroMsg.FreeWifi.SubCoreFreeWifi", "account not ready");
              GMTrace.o(7130719453184L, 53128);
              return;
            }
            w.i("MicroMsg.FreeWifi.SubCoreFreeWifi.onNetworkChangeFreeWifi", "onNetworkChange state=" + paramAnonymousInt + ".(-1=NETWORK_UNKNOWN; 0=NETWORK_UNAVAILABLE; 1=NETWORK_CONNECTED; 2=GATEWAY_FAILED; 3=SERVER_FAILED; 4=CONNECTTING; 5=CONNECTED; 6=SERVER_DOWN)");
            Object localObject2 = (ConnectivityManager)ab.getContext().getSystemService("connectivity");
            NetworkInfo localNetworkInfo = ((ConnectivityManager)localObject2).getNetworkInfo(1);
            if (localNetworkInfo != null)
            {
              w.i("MicroMsg.FreeWifi.SubCoreFreeWifi.onNetworkChangeFreeWifi", "wifiNetwork:" + localNetworkInfo);
              w.i("MicroMsg.FreeWifi.SubCoreFreeWifi.onNetworkChangeFreeWifi", " wifiNetwork.isAvailable()=%b,wifiNetwork.isConnected()=%b,wifiNetwork.isConnectedOrConnecting()=%b", new Object[] { Boolean.valueOf(localNetworkInfo.isAvailable()), Boolean.valueOf(localNetworkInfo.isConnected()), Boolean.valueOf(localNetworkInfo.isConnectedOrConnecting()) });
            }
            localObject2 = ((ConnectivityManager)localObject2).getNetworkInfo(0);
            if (localObject2 != null)
            {
              w.i("MicroMsg.FreeWifi.SubCoreFreeWifi.onNetworkChangeFreeWifi", "mobileNetworkInfo", new Object[] { localObject2 });
              w.i("MicroMsg.FreeWifi.SubCoreFreeWifi.onNetworkChangeFreeWifi", " mobileNetworkInfo.isAvailable()=%b,mobileNetworkInfo.isConnected()=%b,mobileNetworkInfo.isConnectedOrConnecting()=%b", new Object[] { Boolean.valueOf(((NetworkInfo)localObject2).isAvailable()), Boolean.valueOf(((NetworkInfo)localObject2).isConnected()), Boolean.valueOf(((NetworkInfo)localObject2).isConnectedOrConnecting()) });
              break label314;
              if (!localNetworkInfo.isConnected())
              {
                f.a.mdI.azZ();
                GMTrace.o(7130719453184L, 53128);
                return;
              }
              boolean bool = f.a.mdI.a(d.azW());
              w.i("MicroMsg.FreeWifi.SubCoreFreeWifi", "isWifiIndeedChanged=%b", new Object[] { Boolean.valueOf(bool) });
              if (bool) {
                j.aAj().azP();
              }
              GMTrace.o(7130719453184L, 53128);
              return;
            }
          }
          label314:
          if ((6 != paramAnonymousInt) && (4 != paramAnonymousInt) && (paramAnonymousInt != 0) && (-1 != paramAnonymousInt)) {
            if (-9 != paramAnonymousInt) {}
          }
        }
      }
    };
    this.meh = new com.tencent.mm.sdk.b.c() {};
    this.mei = new com.tencent.mm.sdk.b.c() {};
    this.mej = new com.tencent.mm.sdk.b.c()
    {
      private static boolean a(gd paramAnonymousgd)
      {
        GMTrace.i(7137430339584L, 53178);
        String str1;
        f.b localb;
        if ((paramAnonymousgd.fCo.data == "MAIN_UI_EVENT_UPDATE_VIEW") && (com.tencent.mm.plugin.freewifi.m.azE()))
        {
          str1 = "InterruptedProtocol31-" + System.currentTimeMillis();
          localb = f.a.mdI.aAa();
          if ((localb != null) && (!localb.mdM) && (System.currentTimeMillis() - localb.mdz <= 180000L) && (!com.tencent.mm.plugin.freewifi.m.xJ(localb.mdK)) && (!com.tencent.mm.plugin.freewifi.m.xJ(localb.mdJ)) && (!com.tencent.mm.plugin.freewifi.m.xJ(localb.mdL))) {
            break label118;
          }
        }
        for (;;)
        {
          GMTrace.o(7137430339584L, 53178);
          return false;
          label118:
          w.i("MicroMsg.FreeWifi.Protocol31Handler", "sessionKey=%s, step=%d, method=Protocol31Handler.handleInterruptedProtocol31Schema, desc=It gets info of the wifi switched to last time. apSSid=%s, apBssid=%s, mobileMac=%s, time=%d", new Object[] { str1, Integer.valueOf(1), localb.mdJ, localb.mdK, localb.mdL, Long.valueOf(localb.mdz) });
          paramAnonymousgd = d.azW();
          w.i("MicroMsg.FreeWifi.Protocol31Handler", "sessionKey=%s, step=%d, method=Protocol31Handler.handleInterruptedProtocol31Schema, desc=It gets info of the wifi connected right now. wifiinfo = %s", new Object[] { str1, Integer.valueOf(2), paramAnonymousgd });
          if (paramAnonymousgd != null)
          {
            String str2 = com.tencent.mm.plugin.freewifi.m.xK(paramAnonymousgd.getSSID());
            if (com.tencent.mm.plugin.freewifi.m.xK(localb.mdJ).equals(str2))
            {
              String str3 = paramAnonymousgd.getBSSID();
              ??? = paramAnonymousgd.getMacAddress();
              paramAnonymousgd = (gd)???;
              if (Build.VERSION.SDK_INT > 22) {
                if (??? != null)
                {
                  paramAnonymousgd = (gd)???;
                  if (!((String)???).equals("02:00:00:00:00:00")) {}
                }
                else
                {
                  paramAnonymousgd = com.tencent.mm.plugin.freewifi.m.azG();
                }
              }
              synchronized (f.a.mdI)
              {
                if (localb == f.a.mdI.aAa()) {}
              }
              w.i("MicroMsg.FreeWifi.Protocol31Handler", "sessionKey=%s, step=%d, method=Protocol31Handler.handleInterruptedProtocol31Schema, desc=it starts net request [GetInterruptedProtocol31] for schema url. apSSid=%s, apBssid=%s, mobileMac=%s", new Object[] { str1, Integer.valueOf(3), str2, str3, paramAnonymousgd });
              new g(str2, str3, paramAnonymousgd).b(new c.1(str1, localb));
            }
          }
        }
      }
    };
    this.mek = new com.tencent.mm.sdk.b.c() {};
    this.mel = new com.tencent.mm.sdk.b.c() {};
    this.mem = new com.tencent.mm.sdk.b.c() {};
    this.iHr = new com.tencent.mm.sdk.b.c() {};
    this.loP = new bp.a()
    {
      public final void a(d.a paramAnonymousa)
      {
        GMTrace.i(14550946545664L, 108413);
        e locale = j.aAk();
        paramAnonymousa = paramAnonymousa.hme;
        if (1 != i.a.mbS.getInt("LOCAL_CONFIG_FEATURES_DEFINE_ONCE_RECV_FREEWIFI_SYSMSG", 0)) {
          i.a.mbS.ba("LOCAL_CONFIG_FEATURES_DEFINE_ONCE_RECV_FREEWIFI_SYSMSG", 1);
        }
        if ((paramAnonymousa == null) || (paramAnonymousa.tvq == null))
        {
          w.e("MicroMsg.FreeWifi.FreeWifiMessageService", "cmdAddMsg is null");
          GMTrace.o(14550946545664L, 108413);
          return;
        }
        Object localObject = n.a(paramAnonymousa.tvq);
        w.i("MicroMsg.FreeWifi.FreeWifiMessageService", "freewifi push message cmdAM.NewMsgId=%d, msgContent=%s", new Object[] { Long.valueOf(paramAnonymousa.tvv), localObject });
        if (com.tencent.mm.plugin.freewifi.m.xJ((String)localObject))
        {
          w.e("MicroMsg.FreeWifi.FreeWifiMessageService", "msgContent is empty. return.");
          GMTrace.o(14550946545664L, 108413);
          return;
        }
        localObject = com.tencent.mm.plugin.freewifi.c.a.xQ((String)localObject);
        if (localObject == null)
        {
          w.e("MicroMsg.FreeWifi.FreeWifiMessageService", "parse schemaMsg failed. return.");
          GMTrace.o(14550946545664L, 108413);
          return;
        }
        String str = com.tencent.mm.plugin.freewifi.m.xO("MicroMsg.FreeWifi.FreeWifiMessageService");
        new com.tencent.mm.plugin.freewifi.d.d(com.tencent.mm.plugin.freewifi.m.xM("MicroMsg.FreeWifi.FreeWifiMessageService"), com.tencent.mm.plugin.freewifi.m.xN("MicroMsg.FreeWifi.FreeWifiMessageService"), str, ((com.tencent.mm.plugin.freewifi.c.a)localObject).mdr, ((com.tencent.mm.plugin.freewifi.c.a)localObject).mdo, ((com.tencent.mm.plugin.freewifi.c.a)localObject).mds, ((com.tencent.mm.plugin.freewifi.c.a)localObject).ssid, ((com.tencent.mm.plugin.freewifi.c.a)localObject).bssid).b(new e.1(locale, paramAnonymousa));
        GMTrace.o(14550946545664L, 108413);
      }
    };
    GMTrace.o(7138504081408L, 53186);
  }
  
  public static j aAc()
  {
    GMTrace.i(7138638299136L, 53187);
    j localj2 = (j)ap.AL().gJ("plugin.freewifi");
    j localj1 = localj2;
    if (localj2 == null)
    {
      w.w("MicroMsg.FreeWifi.SubCoreFreeWifi", "not found in MMCore, new one");
      localj1 = new j();
      ap.AL().a("plugin.freewifi", localj1);
    }
    GMTrace.o(7138638299136L, 53187);
    return localj1;
  }
  
  public static d aAd()
  {
    GMTrace.i(7138772516864L, 53188);
    h.xx().wH();
    if (aAc().mdY == null) {
      aAc().mdY = new d();
    }
    d locald = aAc().mdY;
    GMTrace.o(7138772516864L, 53188);
    return locald;
  }
  
  public static com.tencent.mm.plugin.freewifi.g.d aAe()
  {
    GMTrace.i(7138906734592L, 53189);
    h.xx().wH();
    if (aAc().mdZ == null)
    {
      localObject = aAc();
      ap.AS();
      ((j)localObject).mdZ = new com.tencent.mm.plugin.freewifi.g.d(com.tencent.mm.x.c.yI());
    }
    Object localObject = aAc().mdZ;
    GMTrace.o(7138906734592L, 53189);
    return (com.tencent.mm.plugin.freewifi.g.d)localObject;
  }
  
  public static com.tencent.mm.plugin.freewifi.g.b aAf()
  {
    GMTrace.i(7139040952320L, 53190);
    h.xx().wH();
    if (aAc().mea == null)
    {
      localObject = aAc();
      ap.AS();
      ((j)localObject).mea = new com.tencent.mm.plugin.freewifi.g.b(com.tencent.mm.x.c.yI());
    }
    Object localObject = aAc().mea;
    GMTrace.o(7139040952320L, 53190);
    return (com.tencent.mm.plugin.freewifi.g.b)localObject;
  }
  
  public static com.tencent.mm.plugin.freewifi.g.f aAg()
  {
    GMTrace.i(7139175170048L, 53191);
    h.xx().wH();
    if (aAc().meb == null)
    {
      localObject = aAc();
      ap.AS();
      ((j)localObject).meb = new com.tencent.mm.plugin.freewifi.g.f(com.tencent.mm.x.c.yI());
    }
    Object localObject = aAc().meb;
    GMTrace.o(7139175170048L, 53191);
    return (com.tencent.mm.plugin.freewifi.g.f)localObject;
  }
  
  public static c aAh()
  {
    GMTrace.i(7139309387776L, 53192);
    h.xx().wH();
    if (aAc().mec == null) {
      aAc().mec = new c();
    }
    c localc = aAc().mec;
    GMTrace.o(7139309387776L, 53192);
    return localc;
  }
  
  public static c aAi()
  {
    GMTrace.i(7139443605504L, 53193);
    h.xx().wH();
    if (aAc().med == null) {
      aAc().med = new c();
    }
    c localc = aAc().med;
    GMTrace.o(7139443605504L, 53193);
    return localc;
  }
  
  public static a aAj()
  {
    GMTrace.i(7139577823232L, 53194);
    h.xx().wH();
    if (aAc().mee == null) {
      aAc().mee = new a();
    }
    a locala = aAc().mee;
    GMTrace.o(7139577823232L, 53194);
    return locala;
  }
  
  public static e aAk()
  {
    GMTrace.i(7140383129600L, 53200);
    h.xx().wH();
    if (aAc().mef == null) {
      aAc().mef = new e();
    }
    e locale = aAc().mef;
    GMTrace.o(7140383129600L, 53200);
    return locale;
  }
  
  public final void aW(boolean paramBoolean)
  {
    GMTrace.i(7139846258688L, 53196);
    ap.getSysCmdMsgExtension().a("freewifi", this.loP, true);
    ap.a(this.meg);
    com.tencent.mm.sdk.b.a.uLm.b(this.meh);
    com.tencent.mm.sdk.b.a.uLm.b(this.mei);
    com.tencent.mm.sdk.b.a.uLm.b(this.mej);
    com.tencent.mm.sdk.b.a.uLm.b(this.mek);
    com.tencent.mm.sdk.b.a.uLm.b(this.mel);
    com.tencent.mm.sdk.b.a.uLm.b(this.mem);
    com.tencent.mm.sdk.b.a.uLm.b(this.iHr);
    try
    {
      this.meg.db(-9);
      b localb = b.b.mdB;
      w.i("MicroMsg.FreeWifi.FreeWifiConnChangedManager", "initialized");
      try
      {
        localObject1 = (ConnectivityManager)ab.getContext().getSystemService("connectivity");
        localObject2 = ((ConnectivityManager)localObject1).getNetworkInfo(1);
        w.i("MicroMsg.FreeWifi.FreeWifiConnChangedManager", "networkInfoWifi=%s", new Object[] { ((NetworkInfo)localObject2).toString() });
        if ((localObject2 == null) || (!((NetworkInfo)localObject2).isConnected())) {
          break label356;
        }
        localObject2 = ((WifiManager)ab.getContext().getSystemService("wifi")).getConnectionInfo();
        localObject1 = com.tencent.mm.plugin.freewifi.m.xK(((WifiInfo)localObject2).getSSID());
        localObject2 = com.tencent.mm.plugin.freewifi.m.xL(((WifiInfo)localObject2).getBSSID()).toLowerCase();
        b.a locala = new b.a();
        locala.mdz = System.currentTimeMillis();
        locala.type = 1;
        locala.ssid = ((String)localObject1);
        locala.bssid = ((String)localObject2);
        locala.mdA = "";
        b.b(localb.mdw.azQ(), locala);
        localb.mdw = locala;
      }
      catch (Exception localException)
      {
        for (;;)
        {
          Object localObject1;
          Object localObject2 = com.tencent.mm.plugin.freewifi.k.azB();
          ((k.a)localObject2).fvF = "UnExpectedException";
          ((k.a)localObject2).result = -1;
          ((k.a)localObject2).kCB = com.tencent.mm.plugin.freewifi.m.d(localException);
          ((k.a)localObject2).azD().azC();
          w.e("MicroMsg.FreeWifi.UnExcepctedException", com.tencent.mm.plugin.freewifi.m.e(localException));
        }
      }
      localObject1 = new IntentFilter();
      ((IntentFilter)localObject1).addAction("android.net.conn.CONNECTIVITY_CHANGE");
      localb.azr();
      ab.getContext().registerReceiver(localb.mdx, (IntentFilter)localObject1);
      GMTrace.o(7139846258688L, 53196);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        w.e("MicroMsg.FreeWifi.SubCoreFreeWifi", "netChanged.onNetworkChange(NETWORK_ACCOUNT_POST_RESET) error. e.getMessage()=" + localRemoteException.getMessage());
        continue;
        label356:
        localObject1 = ((ConnectivityManager)localObject1).getNetworkInfo(0);
        w.i("MicroMsg.FreeWifi.FreeWifiConnChangedManager", "networkInfoMobile=%s", new Object[] { ((NetworkInfo)localObject1).toString() });
        if ((localObject1 != null) && (((NetworkInfo)localObject1).isConnected()))
        {
          localObject2 = new b.a();
          ((b.a)localObject2).mdz = System.currentTimeMillis();
          ((b.a)localObject2).type = 0;
          ((b.a)localObject2).ssid = "";
          ((b.a)localObject2).bssid = "";
          ((b.a)localObject2).mdA = com.tencent.mm.plugin.freewifi.m.xL(((NetworkInfo)localObject1).getExtraInfo());
          b.a(localRemoteException.mdw.azQ(), (b.a)localObject2);
          localRemoteException.mdw = ((b.a)localObject2);
        }
      }
    }
  }
  
  public final void aX(boolean paramBoolean)
  {
    GMTrace.i(7139980476416L, 53197);
    GMTrace.o(7139980476416L, 53197);
  }
  
  public final void eI(int paramInt)
  {
    GMTrace.i(7139712040960L, 53195);
    GMTrace.o(7139712040960L, 53195);
  }
  
  public final void onAccountRelease()
  {
    GMTrace.i(7140114694144L, 53198);
    ap.getSysCmdMsgExtension().b("freewifi", this.loP, true);
    aAd();
    d.release();
    aAh().release();
    ap.b(this.meg);
    com.tencent.mm.sdk.b.a.uLm.c(this.meh);
    com.tencent.mm.sdk.b.a.uLm.c(this.mei);
    com.tencent.mm.sdk.b.a.uLm.c(this.mej);
    com.tencent.mm.sdk.b.a.uLm.c(this.mek);
    com.tencent.mm.sdk.b.a.uLm.c(this.mel);
    com.tencent.mm.sdk.b.a.uLm.c(this.mem);
    com.tencent.mm.sdk.b.a.uLm.c(this.iHr);
    b.b.mdB.azr();
    GMTrace.o(7140114694144L, 53198);
  }
  
  public final HashMap<Integer, g.d> vM()
  {
    GMTrace.i(7140248911872L, 53199);
    HashMap localHashMap = gBa;
    GMTrace.o(7140248911872L, 53199);
    return localHashMap;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/freewifi/model/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */