package com.tencent.mm.plugin.appbrand.jsapi;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.ipc.AppBrandMainProcessService;
import com.tencent.mm.sdk.platformtools.bg;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class ai
  extends k
{
  public static final int CTRL_INDEX = 17;
  public static final String NAME = "getStorageSync";
  
  public ai()
  {
    GMTrace.i(10479585984512L, 78079);
    GMTrace.o(10479585984512L, 78079);
  }
  
  public final String a(com.tencent.mm.plugin.appbrand.k paramk, JSONObject paramJSONObject)
  {
    GMTrace.i(10479720202240L, 78080);
    paramJSONObject = paramJSONObject.optString("key");
    if (bg.mZ(paramJSONObject))
    {
      paramk = d("fail", null);
      GMTrace.o(10479720202240L, 78080);
      return paramk;
    }
    JsApiGetStorageTask localJsApiGetStorageTask = new JsApiGetStorageTask();
    localJsApiGetStorageTask.appId = paramk.iqL;
    localJsApiGetStorageTask.amo = paramJSONObject;
    AppBrandMainProcessService.b(localJsApiGetStorageTask);
    HashMap localHashMap;
    if (localJsApiGetStorageTask.value == null)
    {
      paramk = "fail";
      localHashMap = new HashMap();
      if (localJsApiGetStorageTask.value != null) {
        break label151;
      }
      paramJSONObject = "";
      label95:
      localHashMap.put("data", paramJSONObject);
      if (localJsApiGetStorageTask.type != null) {
        break label159;
      }
    }
    label151:
    label159:
    for (paramJSONObject = "";; paramJSONObject = localJsApiGetStorageTask.type)
    {
      localHashMap.put("dataType", paramJSONObject);
      paramk = d(paramk, localHashMap);
      GMTrace.o(10479720202240L, 78080);
      return paramk;
      paramk = "ok";
      break;
      paramJSONObject = localJsApiGetStorageTask.value;
      break label95;
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/ai.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */