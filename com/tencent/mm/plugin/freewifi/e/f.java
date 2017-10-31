package com.tencent.mm.plugin.freewifi.e;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.wifi.WifiManager;
import android.os.Looper;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.l;
import com.tencent.mm.plugin.freewifi.ConnectSsidPasswordHelper.2;
import com.tencent.mm.plugin.freewifi.c.1;
import com.tencent.mm.plugin.freewifi.c.a;
import com.tencent.mm.plugin.freewifi.k;
import com.tencent.mm.plugin.freewifi.k.a;
import com.tencent.mm.plugin.freewifi.k.b;
import com.tencent.mm.plugin.freewifi.m;
import com.tencent.mm.plugin.freewifi.model.d;
import com.tencent.mm.plugin.freewifi.model.j;
import com.tencent.mm.plugin.freewifi.ui.FreeWifiCopyPwdUI;
import com.tencent.mm.plugin.freewifi.ui.FreeWifiFrontPageUI;
import com.tencent.mm.plugin.freewifi.ui.FreeWifiFrontPageUI.a;
import com.tencent.mm.plugin.freewifi.ui.FreeWifiFrontPageUI.d;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.p;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

public final class f
  extends e
  implements a
{
  private String mbz;
  
  public f(FreeWifiFrontPageUI paramFreeWifiFrontPageUI)
  {
    super(paramFreeWifiFrontPageUI);
    GMTrace.i(7236751458304L, 53918);
    this.mbz = this.intent.getStringExtra("free_wifi_passowrd");
    w.i("MicroMsg.FreeWifi.ProtocolFour", "sessionKey=%s, step=%d, desc=Data retrieved. password=%s", new Object[] { m.B(this.intent), Integer.valueOf(m.C(this.intent)), this.mbz });
    GMTrace.o(7236751458304L, 53918);
  }
  
  public final void connect()
  {
    GMTrace.i(7236885676032L, 53919);
    final com.tencent.mm.plugin.freewifi.c localc = new com.tencent.mm.plugin.freewifi.c(this.ssid, this.meA, this.mbz);
    j.aAc();
    j.aAh().azR().post(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(7244267651072L, 53974);
        com.tencent.mm.plugin.freewifi.c localc = localc;
        c.1 local1 = new c.1(localc, new c.a()
        {
          public final void nC(int paramAnonymous2Int)
          {
            GMTrace.i(7240375336960L, 53945);
            w.i("MicroMsg.FreeWifi.ProtocolFour", "sessionKey=%s, step=%d, method=connect, desc=An attempt to connect to ssid failed. ssid=%s, errCode=%d", new Object[] { m.B(f.this.intent), Integer.valueOf(m.C(f.this.intent)), f.this.ssid, Integer.valueOf(paramAnonymous2Int) });
            Object localObject = k.azB();
            ((k.a)localObject).ssid = f.this.ssid;
            ((k.a)localObject).bssid = m.xN("MicroMsg.FreeWifi.ProtocolFour");
            ((k.a)localObject).fvG = m.xO("MicroMsg.FreeWifi.ProtocolFour");
            ((k.a)localObject).fvF = f.this.fvF;
            ((k.a)localObject).mbW = f.this.appId;
            ((k.a)localObject).mbX = m.B(f.this.intent);
            ((k.a)localObject).mbY = m.D(f.this.intent);
            ((k.a)localObject).mbZ = k.b.mck.mcK;
            ((k.a)localObject).mca = k.b.mck.name;
            ((k.a)localObject).result = paramAnonymous2Int;
            ((k.a)localObject).fIC = m.E(f.this.intent);
            ((k.a)localObject).azD().azC();
            if (paramAnonymous2Int == -16)
            {
              f.this.intent.setClass(f.this.meA.vov.voR, FreeWifiCopyPwdUI.class);
              f.this.meA.finish();
              f.this.meA.startActivity(f.this.intent);
              GMTrace.o(7240375336960L, 53945);
              return;
            }
            if ((paramAnonymous2Int == -14) || (paramAnonymous2Int == -18))
            {
              localObject = f.this.meA;
              locald = FreeWifiFrontPageUI.d.mhe;
              locala = new FreeWifiFrontPageUI.a();
              locala.mgC = R.l.eaN;
              locala.mgD = m.a(f.this.meC, k.b.mck, paramAnonymous2Int);
              ((FreeWifiFrontPageUI)localObject).a(locald, locala);
              GMTrace.o(7240375336960L, 53945);
              return;
            }
            localObject = f.this.meA;
            FreeWifiFrontPageUI.d locald = FreeWifiFrontPageUI.d.mhe;
            FreeWifiFrontPageUI.a locala = new FreeWifiFrontPageUI.a();
            locala.mgC = R.l.eaM;
            locala.mgD = m.a(f.this.meC, k.b.mck, paramAnonymous2Int);
            ((FreeWifiFrontPageUI)localObject).a(locald, locala);
            GMTrace.o(7240375336960L, 53945);
          }
          
          public final void onSuccess()
          {
            GMTrace.i(7240241119232L, 53944);
            w.i("MicroMsg.FreeWifi.ProtocolFour", "sessionKey=%s, step=%d, desc=connect ssid succeeded. ", new Object[] { m.B(f.this.intent), Integer.valueOf(m.C(f.this.intent)) });
            k.a locala = k.azB();
            locala.ssid = f.this.ssid;
            locala.bssid = m.xN("MicroMsg.FreeWifi.ProtocolFour");
            locala.fvG = m.xO("MicroMsg.FreeWifi.ProtocolFour");
            locala.fvF = f.this.fvF;
            locala.mbW = f.this.appId;
            locala.mbX = m.B(f.this.intent);
            locala.mbY = m.D(f.this.intent);
            locala.mbZ = k.b.mck.mcK;
            locala.mca = k.b.mck.name;
            locala.result = 0;
            locala.fIC = m.E(f.this.intent);
            locala.azD().azC();
            m.a(f.this.intent, f.this.fvF, f.this.meC, f.this.fjU, f.this.meA, "MicroMsg.FreeWifi.ProtocolFour");
            GMTrace.o(7240241119232L, 53944);
          }
        });
        if ((((ConnectivityManager)ab.getContext().getSystemService("connectivity")).getNetworkInfo(1).isConnected()) && (localc.ssid.equals(d.azY())))
        {
          local1.onSuccess();
          GMTrace.o(7244267651072L, 53974);
          return;
        }
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
          throw new RuntimeException("ConnectNetworkHelper组件不能在主线程中运行。");
        }
        localc.mbu = new ConnectSsidPasswordHelper.2(localc);
        IntentFilter localIntentFilter = new IntentFilter();
        localIntentFilter.addAction("android.net.wifi.STATE_CHANGE");
        localIntentFilter.addAction("android.net.wifi.supplicant.STATE_CHANGE");
        for (;;)
        {
          try
          {
            localc.mbr.lock();
            localc.activity.registerReceiver(localc.mbu, localIntentFilter);
            if (!localc.aKu.isWifiEnabled())
            {
              i = new com.tencent.mm.plugin.freewifi.e(localc.activity).azt();
              w.i("MicroMsg.FreeWifi.ConnectSsidPasswordHelper", "enable ret = " + i);
              if (i != 0)
              {
                local1.nC(i);
                localc.azr();
                localc.mbr.unlock();
                GMTrace.o(7244267651072L, 53974);
                return;
              }
            }
            int i = d.d(localc.ssid, localc.mbz, 3, false);
            if (i != 0)
            {
              localc.azr();
              local1.nC(i);
              localc.azr();
              localc.mbr.unlock();
              GMTrace.o(7244267651072L, 53974);
              return;
            }
            try
            {
              if ((localc.connected) || (localc.mby)) {
                break label494;
              }
              bool = localc.fiI.await(localc.hmZ, TimeUnit.MILLISECONDS);
              if (!bool)
              {
                local1.nC(-16);
                localc.azr();
                localc.mbr.unlock();
                GMTrace.o(7244267651072L, 53974);
                return;
              }
            }
            catch (InterruptedException localInterruptedException)
            {
              w.i("MicroMsg.FreeWifi.ConnectSsidPasswordHelper", "sessionKey=%s, step=%d, desc=ConnectNetworkHelper encounter interrupted exception. msg=%s", new Object[] { m.B(localc.activity.getIntent()), Integer.valueOf(m.C(localc.activity.getIntent())), localInterruptedException.getMessage() });
              local1.nC(-17);
              localc.azr();
              localc.mbr.unlock();
              GMTrace.o(7244267651072L, 53974);
              return;
            }
            if (localc.connected)
            {
              local1.onSuccess();
              continue;
            }
            if (!localc.mby) {
              continue;
            }
          }
          finally
          {
            localc.azr();
            localc.mbr.unlock();
          }
          ((c.a)localObject).nC(-18);
          continue;
          label494:
          boolean bool = false;
        }
      }
    });
    GMTrace.o(7236885676032L, 53919);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/freewifi/e/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */