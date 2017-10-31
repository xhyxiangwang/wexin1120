package com.tencent.mm.plugin.appbrand.jsapi;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.a;
import com.tencent.mm.plugin.appbrand.config.AppBrandGlobalSystemConfig;
import com.tencent.mm.plugin.appbrand.config.AppBrandSysConfig;
import com.tencent.mm.plugin.appbrand.ipc.AppBrandMainProcessService;
import com.tencent.mm.sdk.platformtools.bg;
import org.json.JSONObject;

public final class bu
  extends k
{
  public static final int CTRL_INDEX = 16;
  public static final String NAME = "setStorageSync";
  
  public bu()
  {
    GMTrace.i(10407376846848L, 77541);
    GMTrace.o(10407376846848L, 77541);
  }
  
  public final String a(com.tencent.mm.plugin.appbrand.k paramk, JSONObject paramJSONObject)
  {
    GMTrace.i(10407511064576L, 77542);
    String str1 = paramJSONObject.optString("key");
    String str2 = paramJSONObject.optString("data");
    String str3 = paramJSONObject.optString("dataType");
    if (bg.mZ(str1))
    {
      paramk = d("fail", null);
      GMTrace.o(10407511064576L, 77542);
      return paramk;
    }
    int j = a.nx(paramk.iqL).iJc.iIe;
    int k = str1.length();
    if (str2 == null) {}
    for (int i = 0; i + k > j; i = str2.length())
    {
      paramk = d("fail:entry size limit reached", null);
      GMTrace.o(10407511064576L, 77542);
      return paramk;
    }
    paramJSONObject = "fail";
    JsApiSetStorageTask localJsApiSetStorageTask = new JsApiSetStorageTask();
    localJsApiSetStorageTask.appId = paramk.iqL;
    localJsApiSetStorageTask.x(str1, str2, str3);
    paramk = paramJSONObject;
    if (AppBrandMainProcessService.b(localJsApiSetStorageTask)) {
      paramk = localJsApiSetStorageTask.result;
    }
    paramk = d(paramk, null);
    GMTrace.o(10407511064576L, 77542);
    return paramk;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/bu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */