package com.tencent.mm.plugin.appbrand.jsapi;

import android.content.Intent;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.k;
import com.tencent.mm.sdk.platformtools.bg;
import org.json.JSONObject;

public final class az
  extends a
{
  public static final int CTRL_INDEX = 201;
  public static final String NAME = "openUrl";
  
  public az()
  {
    GMTrace.i(14338211446784L, 106828);
    GMTrace.o(14338211446784L, 106828);
  }
  
  public final void a(k paramk, JSONObject paramJSONObject, int paramInt)
  {
    GMTrace.i(14338345664512L, 106829);
    paramJSONObject = paramJSONObject.optString("url");
    if (bg.mZ(paramJSONObject))
    {
      paramk.v(paramInt, d("fail", null));
      GMTrace.o(14338345664512L, 106829);
      return;
    }
    paramJSONObject = new Intent().putExtra("rawUrl", paramJSONObject).putExtra("appbrand_report_key_target_url", paramJSONObject);
    if (paramk.mContext != null)
    {
      com.tencent.mm.bi.d.b(paramk.mContext, "webview", ".ui.tools.WebViewUI", paramJSONObject);
      paramk.v(paramInt, d("ok", null));
      GMTrace.o(14338345664512L, 106829);
      return;
    }
    paramk.v(paramInt, d("fail", null));
    GMTrace.o(14338345664512L, 106829);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/az.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */