package com.tencent.pb.common.b;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import com.tencent.pb.common.c.c;
import com.tencent.pb.common.c.d;

public final class g
{
  private NetworkInfo gBA = null;
  private WifiInfo gBB = null;
  private int xnA = 1;
  
  public final boolean rq()
  {
    WifiInfo localWifiInfo1 = null;
    for (;;)
    {
      try
      {
        localObject2 = (ConnectivityManager)d.rwf.getSystemService("connectivity");
        if (localObject2 != null) {
          continue;
        }
        c.k("NetworkChangeMgr", new Object[] { "can't get ConnectivityManager" });
        this.xnA = 1;
        this.gBB = null;
        this.gBA = null;
        bool = true;
      }
      catch (Exception localException)
      {
        Object localObject2;
        c.k("NetworkChangeMgr", new Object[] { localException });
        this.xnA = 1;
        this.gBB = null;
        this.gBA = null;
        bool = true;
        continue;
        if (((NetworkInfo)localObject2).getType() != 1) {
          break label456;
        }
        localWifiInfo2 = ((WifiManager)d.rwf.getSystemService("wifi")).getConnectionInfo();
        i = 2;
        continue;
        if (i != 2) {
          continue;
        }
        if ((localWifiInfo2 == null) || (this.gBB == null) || (!this.gBB.getBSSID().equals(localWifiInfo2.getBSSID())) || (!this.gBB.getSSID().equals(localWifiInfo2.getSSID())) || (this.gBB.getNetworkId() != localWifiInfo2.getNetworkId())) {
          break label461;
        }
        bool = false;
        continue;
        if ((this.gBA == null) || (this.gBA.getExtraInfo() == null) || (((NetworkInfo)localObject2).getExtraInfo() == null) || (!this.gBA.getExtraInfo().equals(((NetworkInfo)localObject2).getExtraInfo())) || (this.gBA.getSubtype() != ((NetworkInfo)localObject2).getSubtype()) || (this.gBA.getType() != ((NetworkInfo)localObject2).getType())) {
          continue;
        }
        bool = false;
        continue;
        if ((this.gBA == null) || (this.gBA.getExtraInfo() != null) || (((NetworkInfo)localObject2).getExtraInfo() != null) || (this.gBA.getSubtype() != ((NetworkInfo)localObject2).getSubtype())) {
          continue;
        }
        j = this.gBA.getType();
        k = ((NetworkInfo)localObject2).getType();
        if (j != k) {
          continue;
        }
        bool = false;
        continue;
        bool = true;
        continue;
      }
      finally {}
      return bool;
      localObject2 = ((ConnectivityManager)localObject2).getActiveNetworkInfo();
      if (localObject2 != null) {
        continue;
      }
      this.xnA = 1;
      this.gBB = null;
      this.gBA = null;
      bool = true;
    }
    c.d("NetworkChangeMgr", new Object[] { "NetworkChangeMgr ", localObject2 });
    int i;
    if (!((NetworkInfo)localObject2).isConnected())
    {
      i = 1;
      label122:
      if (i != this.xnA) {
        break label443;
      }
      if (i != 1) {
        break label225;
      }
    }
    label225:
    label443:
    label456:
    label461:
    for (boolean bool = false;; bool = true)
    {
      this.xnA = i;
      this.gBB = localWifiInfo1;
      this.gBA = ((NetworkInfo)localObject2);
      break;
      WifiInfo localWifiInfo2;
      int j;
      int k;
      i = 3;
      break label122;
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/pb/common/b/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */