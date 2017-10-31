package com.tencent.mm.plugin.appbrand.jsapi;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.ipc.AppBrandMainProcessService;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class ah
  extends k
{
  public static final int CTRL_INDEX = 113;
  public static final String NAME = "getStorageInfoSync";
  
  public ah()
  {
    GMTrace.i(10434354610176L, 77742);
    GMTrace.o(10434354610176L, 77742);
  }
  
  public final String a(com.tencent.mm.plugin.appbrand.k paramk, JSONObject paramJSONObject)
  {
    GMTrace.i(10434488827904L, 77743);
    paramJSONObject = new JsApiGetStorageInfoTask();
    paramJSONObject.appId = paramk.iqL;
    AppBrandMainProcessService.b(paramJSONObject);
    paramk = new HashMap();
    paramk.put("keys", paramJSONObject.iQq);
    paramk.put("currentSize", Integer.valueOf(paramJSONObject.size));
    paramk.put("limitSize", Integer.valueOf(paramJSONObject.aCW));
    paramk = d("ok", paramk);
    GMTrace.o(10434488827904L, 77743);
    return paramk;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/ah.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */