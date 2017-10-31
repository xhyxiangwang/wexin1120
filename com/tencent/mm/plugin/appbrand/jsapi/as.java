package com.tencent.mm.plugin.appbrand.jsapi;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.f;
import com.tencent.mm.plugin.appbrand.k;
import com.tencent.mm.plugin.appbrand.page.l;
import org.json.JSONObject;

public final class as
  extends a
{
  public static final int CTRL_INDEX = 15;
  public static final String NAME = "navigateBack";
  
  public as()
  {
    GMTrace.i(10304700284928L, 76776);
    GMTrace.o(10304700284928L, 76776);
  }
  
  public final void a(k paramk, JSONObject paramJSONObject, int paramInt)
  {
    GMTrace.i(10304834502656L, 76777);
    int i = paramJSONObject.optInt("delta", 1);
    paramk.irS.iqR.ja(i);
    paramk.v(paramInt, d("ok", null));
    GMTrace.o(10304834502656L, 76777);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/as.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */