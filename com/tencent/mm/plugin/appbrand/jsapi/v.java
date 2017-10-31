package com.tencent.mm.plugin.appbrand.jsapi;

import android.view.View;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.canvas.widget.a;
import com.tencent.mm.plugin.appbrand.jsapi.base.c;
import com.tencent.mm.plugin.appbrand.page.AppBrandPageView;
import com.tencent.mm.sdk.platformtools.w;
import org.json.JSONArray;
import org.json.JSONObject;

public class v
  extends c
{
  public static final int CTRL_INDEX = 69;
  public static final String NAME = "drawCanvas";
  
  public v()
  {
    GMTrace.i(10351139618816L, 77122);
    GMTrace.o(10351139618816L, 77122);
  }
  
  protected final boolean a(AppBrandPageView paramAppBrandPageView, int paramInt, View paramView, JSONObject paramJSONObject)
  {
    GMTrace.i(10351810707456L, 77127);
    w.d("MicroMsg.JsApiDrawCanvas", "drawCanvas(id : %s)", new Object[] { Integer.valueOf(paramInt) });
    if (!(paramView instanceof a))
    {
      w.i("MicroMsg.JsApiDrawCanvas", "drawCanvas failed, view is not a instance of AppBrandDrawableView.(%s)", new Object[] { Integer.valueOf(paramInt) });
      GMTrace.o(10351810707456L, 77127);
      return false;
    }
    long l = System.currentTimeMillis();
    JSONArray localJSONArray = paramJSONObject.optJSONArray("actions");
    boolean bool = paramJSONObject.optBoolean("reserve");
    a locala = (a)paramView;
    if (bool) {
      locala.e(localJSONArray);
    }
    for (;;)
    {
      locala.TC();
      w.v("MicroMsg.JsApiDrawCanvas", "post drawCanvas cost : %sms", new Object[] { Long.valueOf(System.currentTimeMillis() - l) });
      bool = super.a(paramAppBrandPageView, paramInt, paramView, paramJSONObject);
      GMTrace.o(10351810707456L, 77127);
      return bool;
      locala.d(localJSONArray);
    }
  }
  
  protected final int i(JSONObject paramJSONObject)
  {
    GMTrace.i(10351408054272L, 77124);
    int i = paramJSONObject.getInt("canvasId");
    GMTrace.o(10351408054272L, 77124);
    return i;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/v.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */