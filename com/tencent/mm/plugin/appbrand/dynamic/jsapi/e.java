package com.tencent.mm.plugin.appbrand.dynamic.jsapi;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.jsapi.b.b;
import com.tencent.mm.jsapi.b.b.a;
import com.tencent.mm.modelappbrand.LogInfo;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.x.q.b;
import com.tencent.recovery.util.Util;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class e
  extends com.tencent.mm.jsapi.b.a
{
  public e(int paramInt)
  {
    super("log", paramInt);
    GMTrace.i(19926903422976L, 148467);
    GMTrace.o(19926903422976L, 148467);
  }
  
  protected final void b(com.tencent.mm.jsapi.core.a parama, JSONObject paramJSONObject, b.a parama1)
  {
    GMTrace.i(19927037640704L, 148468);
    for (;;)
    {
      int i;
      try
      {
        paramJSONObject = paramJSONObject.getJSONArray("dataArray");
        ArrayList localArrayList = new ArrayList(paramJSONObject.length());
        i = 0;
        if (i < paramJSONObject.length())
        {
          JSONObject localJSONObject = paramJSONObject.getJSONObject(i);
          if (localJSONObject != null)
          {
            LogInfo localLogInfo = new LogInfo();
            localLogInfo.hjv = localJSONObject.optLong("ts");
            localLogInfo.level = (localJSONObject.optInt("level") + 1);
            localLogInfo.message = localJSONObject.optString("msg");
            localArrayList.add(localLogInfo);
            w.d("MicroMsg.JsApiFunc_Log", "ts : %s, level : %d, msg : %s", new Object[] { Util.fk(localLogInfo.hjv), Integer.valueOf(localLogInfo.level), localLogInfo.message });
          }
        }
        else
        {
          com.tencent.mm.plugin.appbrand.dynamic.debugger.a.a(parama.ww().getString("__page_view_id", null), localArrayList);
          parama1.c(a(true, "", null));
          GMTrace.o(19927037640704L, 148468);
          return;
        }
      }
      catch (JSONException parama)
      {
        parama1.c(a(false, "dataArray is null", null));
        GMTrace.o(19927037640704L, 148468);
        return;
      }
      i += 1;
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/dynamic/jsapi/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */