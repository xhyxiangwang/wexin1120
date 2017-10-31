package com.tencent.mm.plugin.appbrand.jsapi;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.config.AppBrandGlobalSystemConfig;
import com.tencent.mm.plugin.appbrand.config.AppBrandSysConfig;
import com.tencent.mm.plugin.appbrand.ipc.AppBrandMainProcessService;
import com.tencent.mm.plugin.appbrand.k;
import com.tencent.mm.sdk.platformtools.bg;
import org.json.JSONObject;

public final class bt
  extends a
{
  public static final int CTRL_INDEX = 16;
  public static final String NAME = "setStorage";
  
  public bt()
  {
    GMTrace.i(10328725258240L, 76955);
    GMTrace.o(10328725258240L, 76955);
  }
  
  public final void a(final k paramk, JSONObject paramJSONObject, final int paramInt)
  {
    GMTrace.i(10328859475968L, 76956);
    String str1 = paramJSONObject.optString("key");
    String str2 = paramJSONObject.optString("data");
    paramJSONObject = paramJSONObject.optString("dataType");
    if (bg.mZ(str1))
    {
      paramk.v(paramInt, d("fail", null));
      GMTrace.o(10328859475968L, 76956);
      return;
    }
    int j = com.tencent.mm.plugin.appbrand.a.nx(paramk.iqL).iJc.iIe;
    int k = str1.length();
    if (str2 == null) {}
    for (int i = 0; i + k > j; i = str2.length())
    {
      paramk.v(paramInt, d("fail:entry size limit reached", null));
      GMTrace.o(10328859475968L, 76956);
      return;
    }
    final JsApiSetStorageTask localJsApiSetStorageTask = new JsApiSetStorageTask();
    localJsApiSetStorageTask.appId = paramk.iqL;
    localJsApiSetStorageTask.x(str1, str2, paramJSONObject);
    localJsApiSetStorageTask.iQi = new Runnable()
    {
      public final void run()
      {
        GMTrace.i(10425227804672L, 77674);
        paramk.v(paramInt, bt.this.d(localJsApiSetStorageTask.result, null));
        localJsApiSetStorageTask.VE();
        GMTrace.o(10425227804672L, 77674);
      }
    };
    localJsApiSetStorageTask.VD();
    AppBrandMainProcessService.a(localJsApiSetStorageTask);
    GMTrace.o(10328859475968L, 76956);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/bt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */