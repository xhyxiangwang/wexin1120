package com.tencent.mm.plugin.appbrand.dynamic.jsapi;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.jsapi.b.b.a;
import com.tencent.mm.plugin.appbrand.dynamic.jsapi.core.MiniJsApiFwContext;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.x.q.b;
import org.json.JSONArray;
import org.json.JSONObject;

public final class j
  extends com.tencent.mm.jsapi.b.a
{
  public j(int paramInt)
  {
    super("reportKeyValue", paramInt);
    GMTrace.i(19929587777536L, 148487);
    GMTrace.o(19929587777536L, 148487);
  }
  
  protected final void b(com.tencent.mm.jsapi.core.a parama, JSONObject paramJSONObject, b.a parama1)
  {
    GMTrace.i(19929721995264L, 148488);
    parama = com.tencent.mm.plugin.appbrand.dynamic.jsapi.core.b.pu(parama.ww().getString("__page_view_id", null));
    if (parama == null)
    {
      parama1.c(a(false, "JsApi Framework Context is null", null));
      GMTrace.o(19929721995264L, 148488);
      return;
    }
    paramJSONObject = paramJSONObject.optJSONArray("dataArray");
    if (paramJSONObject == null)
    {
      parama1.c(a(false, "dataArray is null", null));
      GMTrace.o(19929721995264L, 148488);
      return;
    }
    int i = 0;
    while (i < paramJSONObject.length())
    {
      try
      {
        Object localObject = paramJSONObject.getJSONObject(i);
        int j = ((JSONObject)localObject).optInt("key");
        localObject = ((JSONObject)localObject).optString("value");
        if ((j > 0) && (!bg.mZ((String)localObject))) {
          g.paX.i(j, new Object[] { parama.getAppId(), Integer.valueOf(parama.UM()), Integer.valueOf(com.tencent.mm.plugin.appbrand.dynamic.j.a.iu(parama.UL()) + 1), localObject });
        }
      }
      catch (Exception localException)
      {
        for (;;)
        {
          w.e("MicroMsg.JsApiFunc_ReportKeyValue", "parse report value failed : %s", new Object[] { localException });
        }
      }
      i += 1;
    }
    parama1.c(a(true, "", null));
    GMTrace.o(19929721995264L, 148488);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/dynamic/jsapi/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */