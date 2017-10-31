package com.tencent.mm.plugin.appbrand.jsapi;

import android.view.View;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.jsapi.base.c;
import com.tencent.mm.plugin.appbrand.jsapi.k.a;
import com.tencent.mm.plugin.appbrand.jsapi.k.d;
import com.tencent.mm.plugin.appbrand.page.AppBrandPageView;
import org.json.JSONObject;

public final class cf
  extends c
{
  private static final int CTRL_INDEX = 254;
  public static final String NAME = "updateTextView";
  
  public cf()
  {
    GMTrace.i(17688420155392L, 131789);
    GMTrace.o(17688420155392L, 131789);
  }
  
  protected final boolean a(AppBrandPageView paramAppBrandPageView, int paramInt, View paramView, JSONObject paramJSONObject)
  {
    GMTrace.i(17688688590848L, 131791);
    JSONObject localJSONObject = paramJSONObject.optJSONObject("label");
    a.a((TextView)paramView, localJSONObject);
    d.a(paramView, paramJSONObject.optJSONObject("style"));
    boolean bool = super.a(paramAppBrandPageView, paramInt, paramView, paramJSONObject);
    GMTrace.o(17688688590848L, 131791);
    return bool;
  }
  
  protected final int i(JSONObject paramJSONObject)
  {
    GMTrace.i(17688554373120L, 131790);
    int i = paramJSONObject.getInt("viewId");
    GMTrace.o(17688554373120L, 131790);
    return i;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/cf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */