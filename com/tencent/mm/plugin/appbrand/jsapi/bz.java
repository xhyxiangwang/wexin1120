package com.tencent.mm.plugin.appbrand.jsapi;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.config.a.d;
import com.tencent.mm.plugin.appbrand.f;
import com.tencent.mm.plugin.appbrand.k;
import com.tencent.mm.plugin.appbrand.page.l;
import org.json.JSONObject;

public final class bz
  extends a
{
  public static final int CTRL_INDEX = 150;
  public static final String NAME = "switchTab";
  
  public bz()
  {
    GMTrace.i(10295170826240L, 76705);
    GMTrace.o(10295170826240L, 76705);
  }
  
  public final void a(k paramk, JSONObject paramJSONObject, int paramInt)
  {
    GMTrace.i(10295305043968L, 76706);
    paramJSONObject = paramJSONObject.optString("url");
    if (!paramk.irS.iqP.iHB.oP(paramJSONObject))
    {
      paramk.v(paramInt, d("fail:can not switch to non-TabBar page", null));
      GMTrace.o(10295305043968L, 76706);
      return;
    }
    paramk.irS.iqR.rr(paramJSONObject);
    paramk.v(paramInt, d("ok", null));
    GMTrace.o(10295305043968L, 76706);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/bz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */