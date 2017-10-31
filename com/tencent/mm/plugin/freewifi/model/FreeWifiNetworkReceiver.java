package com.tencent.mm.plugin.freewifi.model;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.NetworkInfo;
import android.net.NetworkInfo.State;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;

public class FreeWifiNetworkReceiver
  extends BroadcastReceiver
{
  public b mdS;
  public a mdT;
  
  public FreeWifiNetworkReceiver()
  {
    GMTrace.i(7137967210496L, 53182);
    GMTrace.o(7137967210496L, 53182);
  }
  
  public void onReceive(Context paramContext, Intent paramIntent)
  {
    GMTrace.i(7138101428224L, 53183);
    if (paramIntent == null)
    {
      w.e("MicroMsg.FreeWifi.WifiStateChangedReceiver", "intent is null");
      GMTrace.o(7138101428224L, 53183);
      return;
    }
    paramContext = paramIntent.getAction();
    w.i("MicroMsg.FreeWifi.WifiStateChangedReceiver", "FreeWifiNetworkReceiver action : %s", new Object[] { paramContext });
    if (bg.mZ(paramContext))
    {
      w.e("MicroMsg.FreeWifi.WifiStateChangedReceiver", "action is null");
      GMTrace.o(7138101428224L, 53183);
      return;
    }
    if (paramContext.equals("android.net.wifi.WIFI_STATE_CHANGED"))
    {
      int i = paramIntent.getIntExtra("wifi_state", 0);
      w.i("MicroMsg.FreeWifi.WifiStateChangedReceiver", "now wifi state : %d", new Object[] { Integer.valueOf(i) });
      if (this.mdS != null) {
        this.mdS.nJ(i);
      }
      GMTrace.o(7138101428224L, 53183);
      return;
    }
    if (paramContext.equals("android.net.wifi.STATE_CHANGE"))
    {
      paramContext = paramIntent.getParcelableExtra("networkInfo");
      if (paramContext != null)
      {
        paramContext = (NetworkInfo)paramContext;
        if ((paramContext != null) && (this.mdT != null)) {
          this.mdT.a(paramContext.getState());
        }
      }
    }
    GMTrace.o(7138101428224L, 53183);
  }
  
  public static abstract interface a
  {
    public abstract void a(NetworkInfo.State paramState);
  }
  
  public static abstract interface b
  {
    public abstract void nJ(int paramInt);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/freewifi/model/FreeWifiNetworkReceiver.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */