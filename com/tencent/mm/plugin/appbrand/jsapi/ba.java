package com.tencent.mm.plugin.appbrand.jsapi;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.f;
import com.tencent.mm.plugin.appbrand.k;
import com.tencent.mm.plugin.appbrand.page.l;
import org.json.JSONObject;

public final class ba
  extends a
{
  private static final int CTRL_INDEX = 170;
  private static final String NAME = "reLaunch";
  
  public ba()
  {
    GMTrace.i(10454755704832L, 77894);
    GMTrace.o(10454755704832L, 77894);
  }
  
  public final void a(k paramk, JSONObject paramJSONObject, int paramInt)
  {
    GMTrace.i(10454889922560L, 77895);
    paramJSONObject = paramJSONObject.optString("url");
    paramk.irS.iqR.N(paramJSONObject, false);
    paramk.v(paramInt, d("ok", null));
    GMTrace.o(10454889922560L, 77895);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/ba.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */