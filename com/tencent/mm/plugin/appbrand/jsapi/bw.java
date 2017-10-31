package com.tencent.mm.plugin.appbrand.jsapi;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.k;
import com.tencent.mm.plugin.appbrand.page.AppBrandPageView;
import com.tencent.mm.plugin.appbrand.page.AppBrandPageView.16;
import org.json.JSONObject;

public final class bw
  extends a
{
  public static final int CTRL_INDEX = 284;
  public static final String NAME = "startPullDownRefresh";
  
  public bw()
  {
    GMTrace.i(17670703415296L, 131657);
    GMTrace.o(17670703415296L, 131657);
  }
  
  public final void a(k paramk, JSONObject paramJSONObject, int paramInt)
  {
    GMTrace.i(17670837633024L, 131658);
    paramJSONObject = b(paramk);
    if (paramJSONObject == null)
    {
      paramk.v(paramInt, d("fail", null));
      GMTrace.o(17670837633024L, 131658);
      return;
    }
    paramJSONObject.runOnUiThread(new AppBrandPageView.16(paramJSONObject));
    paramk.v(paramInt, d("ok", null));
    GMTrace.o(17670837633024L, 131658);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/bw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */