package com.tencent.mm.plugin.appbrand.jsapi;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.ipc.AppBrandMainProcessService;
import org.json.JSONObject;

public final class t
  extends k
{
  public static final int CTRL_INDEX = 18;
  public static final String NAME = "clearStorageSync";
  
  public t()
  {
    GMTrace.i(10481196597248L, 78091);
    GMTrace.o(10481196597248L, 78091);
  }
  
  public final String a(com.tencent.mm.plugin.appbrand.k paramk, JSONObject paramJSONObject)
  {
    GMTrace.i(10481330814976L, 78092);
    paramJSONObject = new JsApiClearStorageTask();
    paramJSONObject.appId = paramk.iqL;
    AppBrandMainProcessService.b(paramJSONObject);
    paramk = d("ok", null);
    GMTrace.o(10481330814976L, 78092);
    return paramk;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/t.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */