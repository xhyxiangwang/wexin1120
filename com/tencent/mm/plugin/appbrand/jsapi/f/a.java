package com.tencent.mm.plugin.appbrand.jsapi.f;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.h.j;
import com.tencent.mm.plugin.appbrand.h.k.a;
import com.tencent.mm.plugin.appbrand.jsapi.d;
import com.tencent.mm.plugin.appbrand.p.c;
import com.tencent.mm.sdk.platformtools.w;
import org.json.JSONObject;

public final class a
  extends com.tencent.mm.plugin.appbrand.jsapi.a
{
  public static final int CTRL_INDEX = 21;
  public static final String NAME = "closeSocket";
  
  public a()
  {
    GMTrace.i(18237639098368L, 135881);
    GMTrace.o(18237639098368L, 135881);
  }
  
  public final void a(com.tencent.mm.plugin.appbrand.k paramk, JSONObject paramJSONObject, int paramInt)
  {
    GMTrace.i(18237773316096L, 135882);
    Object localObject = k.a.jju.ri(paramk.iqL);
    if (localObject != null)
    {
      int i = paramJSONObject.optInt("code", 1000);
      if ((i != 1000) && ((i < 3000) || (i >= 5000)))
      {
        paramk.v(paramInt, d("fail:The code must be either 1000, or between 3000 and 4999", null));
        GMTrace.o(18237773316096L, 135882);
        return;
      }
      paramJSONObject = paramJSONObject.optString("reason", "");
      if (((j)localObject).jjo != null) {}
      try
      {
        w.i("MicroMsg.AppBrandNetworkWebSocket", "try to close socket");
        localObject = ((j)localObject).jjo;
        if (((com.tencent.mm.plugin.appbrand.p.a.a)localObject).jxy != null) {
          ((com.tencent.mm.plugin.appbrand.p.a.a)localObject).jxt.c(i, paramJSONObject, false);
        }
        paramk.v(paramInt, d("ok", null));
        w.d("MicroMsg.JsApiCloseSocket", "code %d, reason %s", new Object[] { Integer.valueOf(i), paramJSONObject });
        GMTrace.o(18237773316096L, 135882);
        return;
      }
      catch (Exception localException)
      {
        for (;;)
        {
          w.e("MicroMsg.AppBrandNetworkWebSocket", "send error" + localException.toString());
        }
      }
    }
    paramk.v(paramInt, d("ok", null));
    GMTrace.o(18237773316096L, 135882);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/f/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */