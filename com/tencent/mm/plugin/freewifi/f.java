package com.tencent.mm.plugin.freewifi;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.wifi.WifiManager;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.w;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

final class f
{
  private WifiManager aKu;
  private Context context;
  public Condition fiI;
  private int mbE;
  public Lock mbr;
  private BroadcastReceiver mbu;
  
  public f(Context paramContext)
  {
    GMTrace.i(7128571969536L, 53112);
    this.context = paramContext;
    this.mbr = new ReentrantLock();
    this.fiI = this.mbr.newCondition();
    this.aKu = ((WifiManager)ab.getContext().getSystemService("wifi"));
    this.mbE = 10;
    GMTrace.o(7128571969536L, 53112);
  }
  
  public final void azr()
  {
    GMTrace.i(7128840404992L, 53114);
    try
    {
      this.context.unregisterReceiver(this.mbu);
      GMTrace.o(7128840404992L, 53114);
      return;
    }
    catch (IllegalArgumentException localIllegalArgumentException)
    {
      GMTrace.o(7128840404992L, 53114);
    }
  }
  
  public final int azt()
  {
    GMTrace.i(7128706187264L, 53113);
    if (3 == this.aKu.getWifiState())
    {
      GMTrace.o(7128706187264L, 53113);
      return 0;
    }
    this.mbu = new BroadcastReceiver()
    {
      public final void onReceive(Context paramAnonymousContext, Intent paramAnonymousIntent)
      {
        GMTrace.i(7265071398912L, 54129);
        if ("android.net.wifi.WIFI_STATE_CHANGED".equals(paramAnonymousIntent.getAction()))
        {
          int i = paramAnonymousIntent.getIntExtra("wifi_state", 0);
          w.i("MicroMsg.FreeWifi.EnableWifiHelper", "wifi enabled state=" + i);
          if (i == 3) {
            try
            {
              f.this.mbr.lock();
              f.this.fiI.signalAll();
              f.this.azr();
              f.this.mbr.unlock();
              GMTrace.o(7265071398912L, 54129);
              return;
            }
            finally
            {
              f.this.azr();
              f.this.mbr.unlock();
            }
          }
        }
        GMTrace.o(7265071398912L, 54129);
      }
    };
    try
    {
      this.mbr.lock();
      IntentFilter localIntentFilter = new IntentFilter();
      localIntentFilter.addAction("android.net.wifi.WIFI_STATE_CHANGED");
      this.context.registerReceiver(this.mbu, localIntentFilter);
      this.aKu.setWifiEnabled(true);
      boolean bool = this.fiI.await(this.mbE, TimeUnit.SECONDS);
      if (bool)
      {
        azr();
        this.mbr.unlock();
        GMTrace.o(7128706187264L, 53113);
        return 0;
      }
      azr();
      this.mbr.unlock();
      GMTrace.o(7128706187264L, 53113);
      return 1;
    }
    catch (InterruptedException localInterruptedException)
    {
      localInterruptedException = localInterruptedException;
      azr();
      this.mbr.unlock();
      GMTrace.o(7128706187264L, 53113);
      return 2;
    }
    finally
    {
      localObject = finally;
      azr();
      this.mbr.unlock();
      throw ((Throwable)localObject);
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/freewifi/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */