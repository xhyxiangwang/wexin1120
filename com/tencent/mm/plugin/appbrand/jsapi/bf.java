package com.tencent.mm.plugin.appbrand.jsapi;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.ipc.AppBrandMainProcessService;
import com.tencent.mm.sdk.platformtools.bg;
import org.json.JSONObject;

public final class bf
  extends k
{
  public static final int CTRL_INDEX = 98;
  public static final String NAME = "removeStorageSync";
  
  public bf()
  {
    GMTrace.i(10295439261696L, 76707);
    GMTrace.o(10295439261696L, 76707);
  }
  
  public final String a(com.tencent.mm.plugin.appbrand.k paramk, JSONObject paramJSONObject)
  {
    GMTrace.i(10295573479424L, 76708);
    paramJSONObject = paramJSONObject.optString("key");
    if (bg.mZ(paramJSONObject))
    {
      paramk = d("fail", null);
      GMTrace.o(10295573479424L, 76708);
      return paramk;
    }
    JsApiRemoveStorageTask localJsApiRemoveStorageTask = new JsApiRemoveStorageTask();
    localJsApiRemoveStorageTask.appId = paramk.iqL;
    localJsApiRemoveStorageTask.amo = paramJSONObject;
    AppBrandMainProcessService.b(localJsApiRemoveStorageTask);
    paramk = d("ok", null);
    GMTrace.o(10295573479424L, 76708);
    return paramk;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/bf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */