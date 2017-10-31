package com.tencent.mm.plugin.appbrand.jsapi.f;

import android.util.Base64;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.h.k.a;
import com.tencent.mm.plugin.appbrand.jsapi.d;
import com.tencent.mm.plugin.appbrand.p.a.b;
import com.tencent.mm.plugin.appbrand.p.c;
import com.tencent.mm.sdk.platformtools.w;
import java.nio.ByteBuffer;
import org.json.JSONObject;

public final class j
  extends com.tencent.mm.plugin.appbrand.jsapi.a
{
  public static final int CTRL_INDEX = 22;
  public static final String NAME = "sendSocketMessage";
  
  public j()
  {
    GMTrace.i(18241799847936L, 135912);
    GMTrace.o(18241799847936L, 135912);
  }
  
  public final void a(com.tencent.mm.plugin.appbrand.k paramk, JSONObject paramJSONObject, int paramInt)
  {
    GMTrace.i(18241934065664L, 135913);
    Object localObject2 = k.a.jju.ri(paramk.iqL);
    if (localObject2 != null)
    {
      Object localObject1 = paramJSONObject.optString("data");
      if (localObject1 != null)
      {
        for (;;)
        {
          try
          {
            if (!paramJSONObject.optBoolean("isBuffer")) {
              continue;
            }
            paramJSONObject = ByteBuffer.wrap(Base64.decode(((String)localObject1).getBytes("utf-8"), 2));
            localObject1 = ((com.tencent.mm.plugin.appbrand.h.j)localObject2).jjo.jxt;
            if (paramJSONObject != null) {
              continue;
            }
            w.i("MicroMsg.AppBrandNetWork.WebSocketImpl", "Cannot send 'null' data to a WebSocketImpl.");
          }
          catch (Exception paramJSONObject)
          {
            w.e("MicroMsg.JsApiSendSocketMessage", "sendSocketMessage error : %s", new Object[] { paramJSONObject });
            paramk.v(paramInt, d("fail", null));
            continue;
            bool = false;
            continue;
            paramJSONObject = ((com.tencent.mm.plugin.appbrand.h.j)localObject2).jjo.jxt;
            if (localObject1 != null) {
              continue;
            }
            w.i("MicroMsg.AppBrandNetWork.WebSocketImpl", "Cannot send 'null' data to a WebSocketImpl.");
            continue;
            localObject2 = paramJSONObject.jxj;
            if (paramJSONObject.jxk != a.b.jwW) {
              break label237;
            }
          }
          paramk.v(paramInt, d("ok", null));
          GMTrace.o(18241934065664L, 135913);
          return;
          localObject2 = ((c)localObject1).jxj;
          if (((c)localObject1).jxk != a.b.jwW) {
            continue;
          }
          bool = true;
          ((c)localObject1).d(((com.tencent.mm.plugin.appbrand.p.b.a)localObject2).a(paramJSONObject, bool));
        }
        label237:
        for (boolean bool = true;; bool = false)
        {
          paramJSONObject.d(((com.tencent.mm.plugin.appbrand.p.b.a)localObject2).O((String)localObject1, bool));
          break;
        }
      }
      paramk.v(paramInt, d("fail:message is null or nil", null));
      GMTrace.o(18241934065664L, 135913);
      return;
    }
    paramk.v(paramInt, d("fail:webSocket is not connected", null));
    GMTrace.o(18241934065664L, 135913);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/f/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */