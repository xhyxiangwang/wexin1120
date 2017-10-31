package com.tencent.mm.plugin.appbrand.jsapi.f;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.h.c;
import com.tencent.mm.plugin.appbrand.jsapi.a;
import com.tencent.mm.plugin.appbrand.k;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class h
  extends a
{
  public static final int CTRL_INDEX = 243;
  public static final String NAME = "operateRequestTask";
  
  public h()
  {
    GMTrace.i(17685333147648L, 131766);
    GMTrace.o(17685333147648L, 131766);
  }
  
  public final void a(k paramk, JSONObject paramJSONObject, int paramInt)
  {
    GMTrace.i(17685467365376L, 131767);
    w.d("MicroMsg.JsApiOperateRequestTask", "JsApiOperateRequestTask");
    if (paramJSONObject == null)
    {
      paramk.v(paramInt, d("fail:data is null", null));
      w.e("MicroMsg.JsApiOperateRequestTask", "data is null");
      GMTrace.o(17685467365376L, 131767);
      return;
    }
    String str = paramJSONObject.optString("requestTaskId");
    if (bg.mZ(str))
    {
      w.e("MicroMsg.JsApiOperateRequestTask", "requestTaskId is null");
      paramk.v(paramInt, d("fail:requestTaskId is null or nil", null));
      GMTrace.o(17685467365376L, 131767);
      return;
    }
    paramJSONObject = paramJSONObject.optString("operationType");
    if (bg.mZ(paramJSONObject))
    {
      w.e("MicroMsg.JsApiOperateRequestTask", "operationType is null");
      paramk.v(paramInt, d("fail:operationType is null or nil", null));
      GMTrace.o(17685467365376L, 131767);
      return;
    }
    if (paramJSONObject.equals("abort"))
    {
      paramJSONObject = com.tencent.mm.plugin.appbrand.h.e.YA().ra(paramk.iqL);
      if (paramJSONObject == null)
      {
        paramk.v(paramInt, d("fail:no task", null));
        w.w("MicroMsg.JsApiOperateRequestTask", "request is null");
        GMTrace.o(17685467365376L, 131767);
        return;
      }
      com.tencent.mm.plugin.appbrand.h.d locald = paramJSONObject.qZ(str);
      if (locald == null)
      {
        paramk.v(paramInt, d("fail:no task", null));
        w.w("MicroMsg.JsApiOperateRequestTask", "requestInfo is null %s", new Object[] { str });
        GMTrace.o(17685467365376L, 131767);
        return;
      }
      w.d("MicroMsg.AppBrandNetworkRequest", "try to abortTask");
      paramJSONObject.a(locald.mUrl, locald.jjb);
      paramk.v(paramInt, d("ok", null));
      paramJSONObject = new HashMap();
      paramJSONObject.put("requestTaskId", str);
      paramJSONObject.put("state", "fail");
      paramJSONObject.put("errMsg", "abort");
      paramJSONObject = new JSONObject(paramJSONObject).toString();
      paramk = new d.a().a(paramk);
      paramk.mData = paramJSONObject;
      paramk.VI();
      w.d("MicroMsg.JsApiOperateRequestTask", "abortTask finish %s", new Object[] { str });
      GMTrace.o(17685467365376L, 131767);
      return;
    }
    paramk.v(paramInt, d("fail:unknown operationType", null));
    GMTrace.o(17685467365376L, 131767);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/f/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */