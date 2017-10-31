package com.tencent.mm.plugin.appbrand.dynamic.jsapi;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.jsapi.b.b;
import com.tencent.mm.jsapi.b.b.a;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.sdk.platformtools.w;
import org.json.JSONArray;
import org.json.JSONObject;

public final class i
  extends com.tencent.mm.jsapi.b.a
{
  public i(int paramInt)
  {
    super("reportIDKey", paramInt);
    GMTrace.i(19930661519360L, 148495);
    GMTrace.o(19930661519360L, 148495);
  }
  
  protected final void b(com.tencent.mm.jsapi.core.a parama, JSONObject paramJSONObject, b.a parama1)
  {
    GMTrace.i(19930795737088L, 148496);
    parama = paramJSONObject.optJSONArray("dataArray");
    if (parama == null)
    {
      parama1.c(a(false, "dataArray is null", null));
      GMTrace.o(19930795737088L, 148496);
      return;
    }
    int i = 0;
    for (;;)
    {
      if (i < parama.length()) {
        try
        {
          paramJSONObject = parama.getJSONObject(i);
          int j = paramJSONObject.optInt("id");
          int k = paramJSONObject.optInt("key");
          int m = paramJSONObject.optInt("value");
          g.paX.a(j, k, m, false);
          i += 1;
        }
        catch (Exception paramJSONObject)
        {
          for (;;)
          {
            w.e("MicroMsg.JsApiFunc_ReportIDKey", "parse json failed : %s", new Object[] { paramJSONObject.getMessage() });
          }
        }
      }
    }
    parama1.c(a(true, "", null));
    GMTrace.o(19930795737088L, 148496);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/dynamic/jsapi/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */