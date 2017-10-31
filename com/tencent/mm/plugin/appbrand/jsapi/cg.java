package com.tencent.mm.plugin.appbrand.jsapi;

import android.content.Context;
import android.os.Vibrator;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.k;
import com.tencent.mm.sdk.platformtools.w;
import org.json.JSONObject;

public final class cg
  extends a
{
  public static final int CTRL_INDEX = 231;
  public static final String NAME = "vibrateLong";
  
  public cg()
  {
    GMTrace.i(15480806965248L, 115341);
    GMTrace.o(15480806965248L, 115341);
  }
  
  public final void a(k paramk, JSONObject paramJSONObject, int paramInt)
  {
    GMTrace.i(15480941182976L, 115342);
    w.d("MicroMsg.JsApiVibrateLong", "JsApiVibrateLong!");
    paramJSONObject = (Vibrator)paramk.mContext.getSystemService("vibrator");
    if (paramJSONObject != null) {
      paramJSONObject.vibrate(400L);
    }
    paramk.v(paramInt, d("ok", null));
    GMTrace.o(15480941182976L, 115342);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/cg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */