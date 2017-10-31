package com.tencent.mm.plugin.appbrand.jsapi.wifi.wifisdk;

import com.tencent.gmtrace.GMTrace;
import org.json.JSONObject;

public final class b
{
  public String jfn;
  public String jfo;
  public int jfp;
  public boolean jfq;
  public boolean jfr;
  public boolean jfs;
  
  public b()
  {
    GMTrace.i(19818589716480L, 147660);
    this.jfn = "";
    this.jfo = "";
    this.jfq = false;
    this.jfr = false;
    this.jfs = false;
    GMTrace.o(19818589716480L, 147660);
  }
  
  public final JSONObject or()
  {
    GMTrace.i(19818858151936L, 147662);
    JSONObject localJSONObject = new JSONObject();
    localJSONObject.put("SSID", this.jfn);
    localJSONObject.put("BSSID", this.jfo);
    localJSONObject.put("secure", this.jfq);
    localJSONObject.put("signalStrength", this.jfp);
    GMTrace.o(19818858151936L, 147662);
    return localJSONObject;
  }
  
  public final String toString()
  {
    GMTrace.i(19818723934208L, 147661);
    String str = "WiFiItem{mSsid='" + this.jfn + '\'' + ", mBssid='" + this.jfo + '\'' + ", mSignalStrength=" + this.jfp + ", mSecurity=" + this.jfq + '}';
    GMTrace.o(19818723934208L, 147661);
    return str;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/wifi/wifisdk/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */