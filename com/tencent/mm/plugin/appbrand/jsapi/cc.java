package com.tencent.mm.plugin.appbrand.jsapi;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.jsapi.base.c;
import org.json.JSONObject;

public final class cc
  extends c
{
  public static final int CTRL_INDEX = 83;
  public static final String NAME = "updateCanvas";
  
  public cc()
  {
    GMTrace.i(10383486091264L, 77363);
    GMTrace.o(10383486091264L, 77363);
  }
  
  protected final boolean VK()
  {
    GMTrace.i(10384157179904L, 77368);
    GMTrace.o(10384157179904L, 77368);
    return true;
  }
  
  protected final int i(JSONObject paramJSONObject)
  {
    GMTrace.i(10383754526720L, 77365);
    int i = paramJSONObject.optInt("canvasId");
    GMTrace.o(10383754526720L, 77365);
    return i;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/cc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */