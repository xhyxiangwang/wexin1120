package com.tencent.mm.plugin.appbrand.jsapi;

import android.view.View;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.jsapi.base.b;
import com.tencent.mm.plugin.appbrand.page.AppBrandPageView;
import com.tencent.mm.plugin.appbrand.page.t;
import org.json.JSONObject;

public final class bd
  extends b
{
  private static final int CTRL_INDEX = 255;
  public static final String NAME = "removeImageView";
  
  public bd()
  {
    GMTrace.i(17688017502208L, 131786);
    GMTrace.o(17688017502208L, 131786);
  }
  
  protected final boolean c(AppBrandPageView paramAppBrandPageView, int paramInt, View paramView, JSONObject paramJSONObject)
  {
    GMTrace.i(17688285937664L, 131788);
    paramAppBrandPageView.jla.jm(paramInt);
    boolean bool = super.c(paramAppBrandPageView, paramInt, paramView, paramJSONObject);
    GMTrace.o(17688285937664L, 131788);
    return bool;
  }
  
  protected final int i(JSONObject paramJSONObject)
  {
    GMTrace.i(17688151719936L, 131787);
    int i = paramJSONObject.getInt("viewId");
    GMTrace.o(17688151719936L, 131787);
    return i;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/bd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */