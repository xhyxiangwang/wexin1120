package com.tencent.mm.plugin.freewifi;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.net.wifi.WifiManager;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.w;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public final class c
{
  public WifiManager aKu;
  public Activity activity;
  public boolean connected;
  public Condition fiI;
  public long hmZ;
  public Lock mbr;
  public BroadcastReceiver mbu;
  public boolean mby;
  public String mbz;
  public String ssid;
  
  public c(String paramString1, Activity paramActivity, String paramString2)
  {
    GMTrace.i(7259300036608L, 54086);
    this.connected = false;
    this.mby = false;
    this.activity = paramActivity;
    this.hmZ = 30000L;
    this.ssid = paramString1;
    this.mbz = paramString2;
    this.mbr = new ReentrantLock();
    this.fiI = this.mbr.newCondition();
    this.aKu = ((WifiManager)ab.getContext().getSystemService("wifi"));
    GMTrace.o(7259300036608L, 54086);
  }
  
  public final void azr()
  {
    GMTrace.i(7259434254336L, 54087);
    try
    {
      this.activity.unregisterReceiver(this.mbu);
      GMTrace.o(7259434254336L, 54087);
      return;
    }
    catch (IllegalArgumentException localIllegalArgumentException)
    {
      GMTrace.o(7259434254336L, 54087);
    }
  }
  
  public static abstract interface a
  {
    public abstract void nC(int paramInt);
    
    public abstract void onSuccess();
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/freewifi/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */