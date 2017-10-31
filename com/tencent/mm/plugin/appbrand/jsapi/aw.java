package com.tencent.mm.plugin.appbrand.jsapi;

import android.content.Intent;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.k;
import com.tencent.mm.sdk.platformtools.bg;
import org.json.JSONObject;

public final class aw
  extends a
{
  public static final int CTRL_INDEX = 247;
  public static final String NAME = "openDeliveryList";
  
  public aw()
  {
    GMTrace.i(16369999413248L, 121966);
    GMTrace.o(16369999413248L, 121966);
  }
  
  public final void a(k paramk, JSONObject paramJSONObject, int paramInt)
  {
    GMTrace.i(16370133630976L, 121967);
    paramJSONObject = paramJSONObject.optString("query");
    if (bg.mZ(paramJSONObject))
    {
      paramk.v(paramInt, d("fail", null));
      GMTrace.o(16370133630976L, 121967);
      return;
    }
    Intent localIntent = new Intent();
    localIntent.putExtra("rawUrl", "https://mp.weixin.qq.com/bizmall/expressentry" + paramJSONObject);
    localIntent.putExtra("show_native_web_view", true);
    localIntent.putExtra("KRightBtn", true);
    if (paramk.mContext != null)
    {
      com.tencent.mm.bi.d.b(paramk.mContext, "webview", ".ui.tools.WebViewUI", localIntent);
      paramk.v(paramInt, d("ok", null));
      GMTrace.o(16370133630976L, 121967);
      return;
    }
    paramk.v(paramInt, d("fail", null));
    GMTrace.o(16370133630976L, 121967);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/aw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */