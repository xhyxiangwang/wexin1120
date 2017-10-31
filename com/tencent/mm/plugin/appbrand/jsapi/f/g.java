package com.tencent.mm.plugin.appbrand.jsapi.f;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.jsapi.d;
import com.tencent.mm.plugin.appbrand.jsapi.e;
import com.tencent.mm.plugin.appbrand.k;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class g
  extends com.tencent.mm.plugin.appbrand.jsapi.a
{
  public static final int CTRL_INDEX = 270;
  public static final String NAME = "operateDownloadTask";
  
  public g()
  {
    GMTrace.i(17683990970368L, 131756);
    GMTrace.o(17683990970368L, 131756);
  }
  
  public final void a(k paramk, JSONObject paramJSONObject, int paramInt)
  {
    GMTrace.i(17684125188096L, 131757);
    w.d("MicroMsg.JsApiOperateDownloadTask", "JsApiOperateDownloadTask");
    if (paramJSONObject == null)
    {
      paramk.v(paramInt, d("fail:data is null", null));
      w.e("MicroMsg.JsApiOperateDownloadTask", "data is null");
      GMTrace.o(17684125188096L, 131757);
      return;
    }
    String str = paramJSONObject.optString("downloadTaskId");
    if (bg.mZ(str))
    {
      w.e("MicroMsg.JsApiOperateDownloadTask", "downloadTaskId is null");
      paramk.v(paramInt, d("fail:downloadTaskId is null or nil", null));
      GMTrace.o(17684125188096L, 131757);
      return;
    }
    paramJSONObject = paramJSONObject.optString("operationType");
    if (bg.mZ(paramJSONObject))
    {
      w.e("MicroMsg.JsApiOperateDownloadTask", "operationType is null");
      paramk.v(paramInt, d("fail:operationType is null or nil", null));
      GMTrace.o(17684125188096L, 131757);
      return;
    }
    if (paramJSONObject.equals("abort"))
    {
      paramJSONObject = com.tencent.mm.plugin.appbrand.h.b.Yy().qX(paramk.iqL);
      if (paramJSONObject == null)
      {
        paramk.v(paramInt, d("fail:no task", null));
        w.w("MicroMsg.JsApiOperateDownloadTask", "download is null");
        GMTrace.o(17684125188096L, 131757);
        return;
      }
      com.tencent.mm.plugin.appbrand.h.a.b localb = paramJSONObject.qW(str);
      if (localb == null)
      {
        paramk.v(paramInt, d("fail:no task", null));
        w.w("MicroMsg.JsApiOperateDownloadTask", "downloadWorker is null %s", new Object[] { str });
        GMTrace.o(17684125188096L, 131757);
        return;
      }
      if (localb != null)
      {
        paramJSONObject.qU(localb.uri);
        localb.YG();
      }
      paramk.v(paramInt, d("ok", null));
      paramJSONObject = new HashMap();
      paramJSONObject.put("downloadTaskId", str);
      paramJSONObject.put("state", "fail");
      paramJSONObject.put("errMsg", "abort");
      paramJSONObject = new JSONObject(paramJSONObject).toString();
      paramk = new c.a().a(paramk);
      paramk.mData = paramJSONObject;
      paramk.VI();
      w.d("MicroMsg.JsApiOperateDownloadTask", "abortTask finish %s", new Object[] { str });
      GMTrace.o(17684125188096L, 131757);
      return;
    }
    paramk.v(paramInt, d("fail:unknown operationType", null));
    GMTrace.o(17684125188096L, 131757);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/f/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */