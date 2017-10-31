package com.tencent.mm.plugin.appbrand.jsapi;

import android.view.View;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.jsapi.base.b;
import com.tencent.mm.plugin.appbrand.page.AppBrandPageView;
import com.tencent.mm.plugin.appbrand.page.t;
import org.json.JSONObject;

public final class bg
  extends b
{
  private static final int CTRL_INDEX = 255;
  public static final String NAME = "removeTextView";
  
  public bg()
  {
    GMTrace.i(17673119334400L, 131675);
    GMTrace.o(17673119334400L, 131675);
  }
  
  protected final boolean c(AppBrandPageView paramAppBrandPageView, int paramInt, View paramView, JSONObject paramJSONObject)
  {
    GMTrace.i(17673387769856L, 131677);
    paramAppBrandPageView.jla.jm(paramInt);
    boolean bool = super.c(paramAppBrandPageView, paramInt, paramView, paramJSONObject);
    GMTrace.o(17673387769856L, 131677);
    return bool;
  }
  
  protected final int i(JSONObject paramJSONObject)
  {
    GMTrace.i(17673253552128L, 131676);
    int i = paramJSONObject.getInt("viewId");
    GMTrace.o(17673253552128L, 131676);
    return i;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/bg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */