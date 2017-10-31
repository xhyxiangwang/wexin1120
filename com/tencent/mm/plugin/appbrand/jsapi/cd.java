package com.tencent.mm.plugin.appbrand.jsapi;

import android.view.View;
import android.widget.ImageView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.jsapi.base.c;
import com.tencent.mm.plugin.appbrand.jsapi.k.a;
import com.tencent.mm.plugin.appbrand.jsapi.k.d;
import com.tencent.mm.plugin.appbrand.page.AppBrandPageView;
import org.json.JSONObject;

public final class cd
  extends c
{
  private static final int CTRL_INDEX = 254;
  public static final String NAME = "updateImageView";
  
  public cd()
  {
    GMTrace.i(17687614849024L, 131783);
    GMTrace.o(17687614849024L, 131783);
  }
  
  protected final boolean a(AppBrandPageView paramAppBrandPageView, int paramInt, View paramView, JSONObject paramJSONObject)
  {
    GMTrace.i(17687883284480L, 131785);
    d.a(paramView, paramJSONObject.optJSONObject("style"));
    a.a(paramAppBrandPageView, (ImageView)paramView, paramJSONObject);
    boolean bool = super.a(paramAppBrandPageView, paramInt, paramView, paramJSONObject);
    GMTrace.o(17687883284480L, 131785);
    return bool;
  }
  
  protected final int i(JSONObject paramJSONObject)
  {
    GMTrace.i(17687749066752L, 131784);
    int i = paramJSONObject.getInt("viewId");
    GMTrace.o(17687749066752L, 131784);
    return i;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/cd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */