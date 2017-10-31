package com.tencent.mm.plugin.freewifi;

import android.app.Activity;
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

public final class e
{
  private WifiManager aKu;
  private Activity activity;
  public Condition fiI;
  private int mbE;
  public Lock mbr;
  private BroadcastReceiver mbu;
  
  public e(Activity paramActivity)
  {
    GMTrace.i(7127766663168L, 53106);
    this.activity = paramActivity;
    this.mbr = new ReentrantLock();
    this.fiI = this.mbr.newCondition();
    this.aKu = ((WifiManager)ab.getContext().getSystemService("wifi"));
    this.mbE = 10;
    GMTrace.o(7127766663168L, 53106);
  }
  
  public final void azr()
  {
    GMTrace.i(7128035098624L, 53108);
    try
    {
      this.activity.unregisterReceiver(this.mbu);
      GMTrace.o(7128035098624L, 53108);
      return;
    }
    catch (IllegalArgumentException localIllegalArgumentException)
    {
      GMTrace.o(7128035098624L, 53108);
    }
  }
  
  public final int azt()
  {
    GMTrace.i(7127900880896L, 53107);
    if (3 == this.aKu.getWifiState())
    {
      GMTrace.o(7127900880896L, 53107);
      return 0;
    }
    this.mbu = new BroadcastReceiver()
    {
      public final void onReceive(Context paramAnonymousContext, Intent paramAnonymousIntent)
      {
        GMTrace.i(7148973064192L, 53264);
        if ("android.net.wifi.WIFI_STATE_CHANGED".equals(paramAnonymousIntent.getAction()))
        {
          int i = paramAnonymousIntent.getIntExtra("wifi_state", 0);
          w.i("MicroMsg.FreeWifi.EnableWifiHelper", "wifi enabled state=" + i);
          if (i == 3) {
            try
            {
              e.this.mbr.lock();
              e.this.fiI.signalAll();
              e.this.azr();
              e.this.mbr.unlock();
              GMTrace.o(7148973064192L, 53264);
              return;
            }
            finally
            {
              e.this.azr();
              e.this.mbr.unlock();
            }
          }
        }
        GMTrace.o(7148973064192L, 53264);
      }
    };
    try
    {
      this.mbr.lock();
      IntentFilter localIntentFilter = new IntentFilter();
      localIntentFilter.addAction("android.net.wifi.WIFI_STATE_CHANGED");
      this.activity.registerReceiver(this.mbu, localIntentFilter);
      this.aKu.setWifiEnabled(true);
      boolean bool = this.fiI.await(this.mbE, TimeUnit.SECONDS);
      if (bool)
      {
        azr();
        this.mbr.unlock();
        GMTrace.o(7127900880896L, 53107);
        return 0;
      }
      azr();
      this.mbr.unlock();
      GMTrace.o(7127900880896L, 53107);
      return 1;
    }
    catch (InterruptedException localInterruptedException)
    {
      localInterruptedException = localInterruptedException;
      azr();
      this.mbr.unlock();
      GMTrace.o(7127900880896L, 53107);
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


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/freewifi/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */