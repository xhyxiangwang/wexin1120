package com.tencent.mm.plugin.appbrand.jsapi;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.k;
import com.tencent.mm.sdk.platformtools.am;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class ac
  extends a
{
  public static final int CTRL_INDEX = 39;
  public static final String NAME = "getNetworkType";
  
  public ac()
  {
    GMTrace.i(10299734228992L, 76739);
    GMTrace.o(10299734228992L, 76739);
  }
  
  public final void a(k paramk, JSONObject paramJSONObject, int paramInt)
  {
    GMTrace.i(10299868446720L, 76740);
    paramJSONObject = new HashMap();
    if (!am.isConnected(paramk.mContext)) {
      paramJSONObject.put("networkType", "none");
    }
    for (;;)
    {
      paramk.v(paramInt, d("ok", paramJSONObject));
      GMTrace.o(10299868446720L, 76740);
      return;
      if (am.is2G(paramk.mContext)) {
        paramJSONObject.put("networkType", "2g");
      } else if (am.is3G(paramk.mContext)) {
        paramJSONObject.put("networkType", "3g");
      } else if (am.is4G(paramk.mContext)) {
        paramJSONObject.put("networkType", "4g");
      } else if (am.isWifi(paramk.mContext)) {
        paramJSONObject.put("networkType", "wifi");
      } else {
        paramJSONObject.put("networkType", "unknown");
      }
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/ac.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */