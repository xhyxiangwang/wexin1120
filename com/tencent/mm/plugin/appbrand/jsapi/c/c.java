package com.tencent.mm.plugin.appbrand.jsapi.c;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.jsapi.base.b;
import org.json.JSONObject;

public final class c
  extends b
{
  public static final int CTRL_INDEX = -2;
  public static final String NAME = "removeContainer";
  
  public c()
  {
    GMTrace.i(15466043015168L, 115231);
    GMTrace.o(15466043015168L, 115231);
  }
  
  protected final int i(JSONObject paramJSONObject)
  {
    GMTrace.i(15466177232896L, 115232);
    int i = paramJSONObject.getInt("containerId");
    GMTrace.o(15466177232896L, 115232);
    return i;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/c/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */