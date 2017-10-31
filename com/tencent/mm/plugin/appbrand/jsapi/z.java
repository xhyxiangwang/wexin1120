package com.tencent.mm.plugin.appbrand.jsapi;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.ipc.AppBrandMainProcessService;
import com.tencent.mm.plugin.appbrand.k;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class z
  extends a
{
  public static final int CTRL_INDEX = 101;
  public static final String NAME = "getAppConfig";
  
  public z()
  {
    GMTrace.i(10372346019840L, 77280);
    GMTrace.o(10372346019840L, 77280);
  }
  
  public final void a(final k paramk, final JSONObject paramJSONObject, final int paramInt)
  {
    GMTrace.i(10372480237568L, 77281);
    if (paramJSONObject == null)
    {
      paramk.v(paramInt, d("fail", null));
      w.e("MicroMsg.JsApiGetAppConfig", "data is null");
      GMTrace.o(10372480237568L, 77281);
      return;
    }
    String str = paramk.iqL;
    final int i = paramJSONObject.optInt("type", 0);
    w.i("MicroMsg.JsApiGetAppConfig", "getAppConfig app_id:%s,type:%d", new Object[] { str, Integer.valueOf(i) });
    if (i <= 0)
    {
      paramk.v(paramInt, d("fail", null));
      w.e("MicroMsg.JsApiGetAppConfig", "type %d is invalid", new Object[] { Integer.valueOf(i) });
      GMTrace.o(10372480237568L, 77281);
      return;
    }
    paramJSONObject = new JsApiGetAppConfigTask();
    paramJSONObject.appId = str;
    paramJSONObject.type = i;
    paramJSONObject.iQi = new Runnable()
    {
      public final void run()
      {
        GMTrace.i(10415429910528L, 77601);
        HashMap localHashMap = new HashMap();
        localHashMap.put("type", i);
        localHashMap.put("data", paramJSONObject.value);
        w.i("MicroMsg.JsApiGetAppConfig", "getAppConfig type:%d,data:\n%s", new Object[] { Integer.valueOf(i), paramJSONObject.value });
        if (bg.mZ(paramJSONObject.value)) {
          paramk.v(paramInt, z.this.d("fail", null));
        }
        for (;;)
        {
          paramJSONObject.VE();
          GMTrace.o(10415429910528L, 77601);
          return;
          paramk.v(paramInt, z.this.d("ok", localHashMap));
        }
      }
    };
    paramJSONObject.VD();
    AppBrandMainProcessService.a(paramJSONObject);
    GMTrace.o(10372480237568L, 77281);
  }
  
  public static final class a
    extends e
  {
    private static final int CTRL_INDEX = 109;
    private static final String NAME = "onAppConfig";
    
    public a()
    {
      GMTrace.i(10305505591296L, 76782);
      GMTrace.o(10305505591296L, 76782);
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/z.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */