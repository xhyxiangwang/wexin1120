package com.tencent.mm.plugin.appbrand.jsapi.share;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.jsapi.a;
import com.tencent.mm.plugin.appbrand.jsapi.d;
import com.tencent.mm.plugin.appbrand.k;
import com.tencent.mm.plugin.appbrand.menu.l;
import com.tencent.mm.plugin.appbrand.page.AppBrandPageView;
import org.json.JSONObject;

public final class e
  extends a
{
  public static final int CTRL_INDEX = 146;
  public static final String NAME = "showShareMenu";
  
  public e()
  {
    GMTrace.i(18230659776512L, 135829);
    GMTrace.o(18230659776512L, 135829);
  }
  
  public final void a(k paramk, JSONObject paramJSONObject, int paramInt)
  {
    GMTrace.i(18230793994240L, 135830);
    paramJSONObject = b(paramk);
    if (paramJSONObject != null) {
      paramJSONObject.s(l.jii, false);
    }
    paramk.v(paramInt, d("ok", null));
    GMTrace.o(18230793994240L, 135830);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/share/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */