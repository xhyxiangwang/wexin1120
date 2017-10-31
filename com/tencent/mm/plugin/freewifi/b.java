package com.tencent.mm.plugin.freewifi;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.wifi.WifiManager;
import android.os.Looper;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.freewifi.model.d;
import com.tencent.mm.sdk.platformtools.w;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public final class b
{
  private WifiManager aKu;
  private Context context;
  public Condition fiI;
  private long hmZ;
  public Lock mbr;
  public boolean mbs;
  public boolean mbt;
  private BroadcastReceiver mbu;
  public String ssid;
  
  public b(String paramString, Context paramContext)
  {
    GMTrace.i(7258628947968L, 54081);
    this.mbs = false;
    this.mbt = false;
    this.hmZ = 15000L;
    this.ssid = paramString;
    this.mbr = new ReentrantLock();
    this.fiI = this.mbr.newCondition();
    this.aKu = ((WifiManager)paramContext.getSystemService("wifi"));
    this.context = paramContext;
    GMTrace.o(7258628947968L, 54081);
  }
  
  private void azr()
  {
    GMTrace.i(7258897383424L, 54083);
    try
    {
      this.context.unregisterReceiver(this.mbu);
      GMTrace.o(7258897383424L, 54083);
      return;
    }
    catch (IllegalArgumentException localIllegalArgumentException)
    {
      GMTrace.o(7258897383424L, 54083);
    }
  }
  
  public final int azs()
  {
    GMTrace.i(7258763165696L, 54082);
    if ((((ConnectivityManager)this.context.getSystemService("connectivity")).getNetworkInfo(1).isConnected()) && (this.ssid.equals(d.azY())))
    {
      GMTrace.o(7258763165696L, 54082);
      return 0;
    }
    if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
      throw new RuntimeException("ConnectNetworkHelper组件不能在主线程中运行。");
    }
    this.mbu = new BroadcastReceiver()
    {
      public final void onReceive(Context paramAnonymousContext, Intent paramAnonymousIntent)
      {
        GMTrace.i(7265339834368L, 54131);
        if (paramAnonymousIntent.getAction().equals("android.net.wifi.STATE_CHANGE"))
        {
          paramAnonymousContext = (NetworkInfo)paramAnonymousIntent.getParcelableExtra("networkInfo");
          if (paramAnonymousContext != null) {
            w.i("MicroMsg.FreeWifi.ConnectNetworkHelper", "WifiManager.NETWORK_STATE_CHANGED_ACTION broadcastReceiver, targetssid=%s, Utils.getConnectedWifiSsid(TAG)=%s,networkInfo.isConnected()=%b, networkInfo.isConnectedOrConnecting()=%b, networkInfo.getExtraInfo()=%s, networkInfo.getType()=%d, networkInfo.toString()=%s", new Object[] { b.this.ssid, m.xM("MicroMsg.FreeWifi.ConnectNetworkHelper"), Boolean.valueOf(paramAnonymousContext.isConnected()), Boolean.valueOf(paramAnonymousContext.isConnectedOrConnecting()), paramAnonymousContext.getExtraInfo(), Integer.valueOf(paramAnonymousContext.getType()), paramAnonymousContext.toString() });
          }
          if ((paramAnonymousContext != null) && (paramAnonymousContext.isConnected()) && (paramAnonymousContext.getType() == 1) && (b.this.ssid.equals(m.xK(paramAnonymousContext.getExtraInfo())))) {
            try
            {
              b.this.mbr.lock();
              b.this.mbs = true;
              w.i("MicroMsg.FreeWifi.ConnectNetworkHelper", "WifiManager.NETWORK_STATE_CHANGED_ACTION broadcastreceiver signal connected state.");
              b.this.fiI.signalAll();
              b.this.mbr.unlock();
              GMTrace.o(7265339834368L, 54131);
              return;
            }
            finally
            {
              b.this.mbr.unlock();
            }
          }
          GMTrace.o(7265339834368L, 54131);
          return;
        }
        if (paramAnonymousIntent.getAction().equals("android.net.conn.CONNECTIVITY_CHANGE"))
        {
          paramAnonymousContext = (NetworkInfo)paramAnonymousIntent.getParcelableExtra("networkInfo");
          if (paramAnonymousContext != null) {
            w.i("MicroMsg.FreeWifi.ConnectNetworkHelper", "ConnectivityManager.CONNECTIVITY_ACTION broadcastReceiver, targetssid=%s, Utils.getConnectedWifiSsid(TAG)=%s,networkInfo.isConnected()=%b, networkInfo.isConnectedOrConnecting()=%b, networkInfo.getExtraInfo()=%s, networkInfo.getType()=%d, networkInfo.toString()=%s", new Object[] { b.this.ssid, m.xM("MicroMsg.FreeWifi.ConnectNetworkHelper"), Boolean.valueOf(paramAnonymousContext.isConnected()), Boolean.valueOf(paramAnonymousContext.isConnectedOrConnecting()), paramAnonymousContext.getExtraInfo(), Integer.valueOf(paramAnonymousContext.getType()), paramAnonymousContext.toString() });
          }
          if ((paramAnonymousContext != null) && (paramAnonymousContext.isConnected()) && (paramAnonymousContext.getType() == 1) && (b.this.ssid.equals(m.xK(paramAnonymousContext.getExtraInfo())))) {
            try
            {
              b.this.mbr.lock();
              b.this.mbt = true;
              w.i("MicroMsg.FreeWifi.ConnectNetworkHelper", "ConnectivityManager.CONNECTIVITY_ACTION broadcastreceiver signal connected state.");
              b.this.fiI.signalAll();
              b.this.mbr.unlock();
              GMTrace.o(7265339834368L, 54131);
              return;
            }
            finally
            {
              b.this.mbr.unlock();
            }
          }
        }
        GMTrace.o(7265339834368L, 54131);
      }
    };
    try
    {
      this.mbr.lock();
      IntentFilter localIntentFilter = new IntentFilter();
      localIntentFilter.addAction("android.net.wifi.STATE_CHANGE");
      localIntentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
      this.context.registerReceiver(this.mbu, localIntentFilter);
      if (!this.aKu.isWifiEnabled())
      {
        i = new f(this.context).azt();
        w.i("MicroMsg.FreeWifi.ConnectNetworkHelper", "enable ret = " + i);
        if (i != 0)
        {
          azr();
          this.mbr.unlock();
          GMTrace.o(7258763165696L, 54082);
          return i;
        }
      }
      int i = d.xT(this.ssid);
      if (i != 0)
      {
        azr();
        azr();
        this.mbr.unlock();
        GMTrace.o(7258763165696L, 54082);
        return i;
      }
      boolean bool1 = false;
      boolean bool2;
      for (;;)
      {
        try
        {
          if (this.mbs)
          {
            bool2 = bool1;
            if (this.mbt) {
              break;
            }
          }
          long l = System.currentTimeMillis();
          bool1 = this.fiI.await(this.hmZ, TimeUnit.MILLISECONDS);
          bool2 = bool1;
          if (!bool1) {
            break;
          }
          l = System.currentTimeMillis() - l;
          this.hmZ -= l;
          w.i("MicroMsg.FreeWifi.ConnectNetworkHelper", "costMillis=" + l + "; left timeout=" + this.hmZ);
          if (this.hmZ > 0L)
          {
            l = this.hmZ;
            this.hmZ = l;
          }
          else
          {
            l = 3000L;
          }
        }
        catch (InterruptedException localInterruptedException)
        {
          w.i("MicroMsg.FreeWifi.ConnectNetworkHelper", "desc=ConnectNetworkHelper encounter interrupted exception. msg=%s", new Object[] { localInterruptedException.getMessage() });
          azr();
          this.mbr.unlock();
          GMTrace.o(7258763165696L, 54082);
          return -17;
        }
      }
      if (!bool2)
      {
        azr();
        this.mbr.unlock();
        GMTrace.o(7258763165696L, 54082);
        return -16;
      }
      azr();
      this.mbr.unlock();
      GMTrace.o(7258763165696L, 54082);
      return 0;
    }
    finally
    {
      azr();
      this.mbr.unlock();
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/freewifi/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */