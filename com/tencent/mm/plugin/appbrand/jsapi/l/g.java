package com.tencent.mm.plugin.appbrand.jsapi.l;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.jsapi.base.b;
import org.json.JSONObject;

public final class g
  extends b
{
  public static final int CTRL_INDEX = 299;
  public static final String NAME = "removeHTMLWebView";
  
  public g()
  {
    GMTrace.i(19753762553856L, 147177);
    GMTrace.o(19753762553856L, 147177);
  }
  
  protected final int i(JSONObject paramJSONObject)
  {
    GMTrace.i(19753896771584L, 147178);
    int i = paramJSONObject.getInt("htmlId");
    GMTrace.o(19753896771584L, 147178);
    return i;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/l/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */