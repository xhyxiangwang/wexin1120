package com.tencent.mm.plugin.appbrand.dynamic.jsapi;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.jsapi.b.b.a;
import com.tencent.mm.sdk.platformtools.am;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class b
  extends com.tencent.mm.jsapi.b.a
{
  public b(int paramInt)
  {
    super("getNetworkType", paramInt);
    GMTrace.i(19939922542592L, 148564);
    GMTrace.o(19939922542592L, 148564);
  }
  
  protected final void b(com.tencent.mm.jsapi.core.a parama, JSONObject paramJSONObject, b.a parama1)
  {
    GMTrace.i(19940056760320L, 148565);
    parama = parama.getContext();
    paramJSONObject = new HashMap();
    if (!am.isConnected(parama)) {
      paramJSONObject.put("networkType", "none");
    }
    for (;;)
    {
      parama1.c(a(true, "", paramJSONObject));
      GMTrace.o(19940056760320L, 148565);
      return;
      if (am.is2G(parama)) {
        paramJSONObject.put("networkType", "2g");
      } else if (am.is3G(parama)) {
        paramJSONObject.put("networkType", "3g");
      } else if (am.is4G(parama)) {
        paramJSONObject.put("networkType", "4g");
      } else if (am.isWifi(parama)) {
        paramJSONObject.put("networkType", "wifi");
      } else {
        paramJSONObject.put("networkType", "unknown");
      }
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/dynamic/jsapi/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */