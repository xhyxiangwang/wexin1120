package com.tencent.mm.plugin.appbrand.jsapi;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.config.AppBrandSysConfig;
import com.tencent.mm.plugin.appbrand.f;
import com.tencent.mm.plugin.appbrand.k;
import com.tencent.mm.plugin.appbrand.menu.MenuDelegate_EnableDebug;
import org.json.JSONObject;

public final class bn
  extends a
{
  public static final int CTRL_INDEX = 249;
  public static final String NAME = "setEnableDebug";
  
  public bn()
  {
    GMTrace.i(17381329993728L, 129501);
    GMTrace.o(17381329993728L, 129501);
  }
  
  public final void a(k paramk, JSONObject paramJSONObject, int paramInt)
  {
    GMTrace.i(17381464211456L, 129502);
    boolean bool = paramJSONObject.optBoolean("enableDebug", false);
    if (paramk.irS.iqO.iIH == bool)
    {
      paramk.v(paramInt, d("ok", null));
      GMTrace.o(17381464211456L, 129502);
      return;
    }
    MenuDelegate_EnableDebug.e(paramk.mContext, paramk.iqL, bool);
    paramk.v(paramInt, d("ok", null));
    GMTrace.o(17381464211456L, 129502);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/bn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */