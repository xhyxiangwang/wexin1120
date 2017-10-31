package com.tencent.mm.plugin.appbrand.jsapi;

import android.app.Activity;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.k;
import org.json.JSONObject;

final class y
  extends a
{
  static final int CTRL_INDEX = 191;
  static final String NAME = "exitMiniProgram";
  
  y()
  {
    GMTrace.i(10375969898496L, 77307);
    GMTrace.o(10375969898496L, 77307);
  }
  
  public final void a(k paramk, JSONObject paramJSONObject, int paramInt)
  {
    GMTrace.i(10376104116224L, 77308);
    paramJSONObject = paramk.mContext;
    if ((paramJSONObject != null) && ((paramJSONObject instanceof Activity)))
    {
      ((Activity)paramJSONObject).finish();
      paramk.v(paramInt, d("ok", null));
      GMTrace.o(10376104116224L, 77308);
      return;
    }
    paramk.v(paramInt, d("fail", null));
    GMTrace.o(10376104116224L, 77308);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/y.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */