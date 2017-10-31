package com.tencent.mm.plugin.appbrand.jsapi.j;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.jsapi.a;
import com.tencent.mm.plugin.appbrand.jsapi.d;
import com.tencent.mm.plugin.appbrand.k;
import org.json.JSONObject;

public final class b
  extends a
{
  private static final int CTRL_INDEX = 238;
  private static final String NAME = "setNavigationBarRightButton";
  
  public b()
  {
    GMTrace.i(17380122034176L, 129492);
    GMTrace.o(17380122034176L, 129492);
  }
  
  public final void a(k paramk, JSONObject paramJSONObject, int paramInt)
  {
    GMTrace.i(17380256251904L, 129493);
    boolean bool = paramJSONObject.optBoolean("hide", false);
    String str = paramJSONObject.optString("text", "");
    paramJSONObject = paramJSONObject.optString("iconPath", "");
    int i = com.tencent.mm.plugin.appbrand.page.b.a(b(paramk), str, paramJSONObject, bool);
    paramJSONObject = "fail";
    switch (1.jbE[(i - 1)])
    {
    }
    for (;;)
    {
      paramk.v(paramInt, d(paramJSONObject, null));
      GMTrace.o(17380256251904L, 129493);
      return;
      paramJSONObject = "ok";
      continue;
      paramJSONObject = "fail no page available";
      continue;
      paramJSONObject = "fail iconPath not found";
      continue;
      paramJSONObject = "fail invalid text length";
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/j/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */