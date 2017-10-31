package com.tencent.mm.plugin.appbrand.jsapi.file;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.appstorage.AppBrandLocalMediaObject;
import com.tencent.mm.plugin.appbrand.appstorage.c;
import com.tencent.mm.plugin.appbrand.config.h;
import com.tencent.mm.plugin.appbrand.jsapi.a;
import com.tencent.mm.plugin.appbrand.jsapi.d;
import com.tencent.mm.plugin.appbrand.k;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.io.File;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import org.json.JSONObject;

public final class e
  extends a
{
  public static final int CTRL_INDEX = 51;
  public static final String NAME = "saveFile";
  
  public e()
  {
    GMTrace.i(10389525889024L, 77408);
    GMTrace.o(10389525889024L, 77408);
  }
  
  public final void a(k paramk, JSONObject paramJSONObject, int paramInt)
  {
    GMTrace.i(10389660106752L, 77409);
    String str = paramk.iqL;
    paramJSONObject = paramJSONObject.optString("tempFilePath");
    if (bg.mZ(paramJSONObject))
    {
      w.e("MicroMsg.JsApiSaveFile", "temp localId is null or nil");
      paramk.v(paramInt, d("fail", null));
      GMTrace.o(10389660106752L, 77409);
      return;
    }
    paramJSONObject = c.aI(str, paramJSONObject);
    if ((paramJSONObject != null) && (com.tencent.mm.a.e.aZ(paramJSONObject.hhT))) {}
    for (boolean bool = true;; bool = false)
    {
      w.i("MicroMsg.JsApiSaveFile", "get temp obj = %s, fileExists = %b", new Object[] { paramJSONObject, Boolean.valueOf(bool) });
      if ((bool) && (!bg.mZ(paramJSONObject.hhT))) {
        break;
      }
      paramk.v(paramInt, d("fail:file doesn't exist", null));
      GMTrace.o(10389660106752L, 77409);
      return;
    }
    if (paramJSONObject.iDw)
    {
      paramk.v(paramInt, d("ok", null));
      GMTrace.o(10389660106752L, 77409);
      return;
    }
    long l1 = h.oT(str);
    long l2 = c.om(str);
    long l3 = new File(paramJSONObject.hhT).length();
    w.i("MicroMsg.JsApiSaveFile", "before markPermanent, quota = %d, occupation = %d, fileLength = %d", new Object[] { Long.valueOf(l1), Long.valueOf(l2), Long.valueOf(l3) });
    if (l2 + l3 > l1)
    {
      paramk.v(paramInt, d(String.format(Locale.US, "fail:exceed quota %dM", new Object[] { Long.valueOf(l1 / 1048576L) }), null));
      GMTrace.o(10389660106752L, 77409);
      return;
    }
    AppBrandLocalMediaObject localAppBrandLocalMediaObject = c.a(paramJSONObject);
    if (localAppBrandLocalMediaObject == null)
    {
      bool = true;
      if (localAppBrandLocalMediaObject != null) {
        break label426;
      }
      paramJSONObject = null;
      label313:
      if (localAppBrandLocalMediaObject != null) {
        break label435;
      }
    }
    label426:
    label435:
    for (str = null;; str = localAppBrandLocalMediaObject.hhT)
    {
      w.i("MicroMsg.JsApiSaveFile", "after markPermanent, (obj==null): %b, obj.localId: %s, obj.path: %s", new Object[] { Boolean.valueOf(bool), paramJSONObject, str });
      if ((localAppBrandLocalMediaObject == null) || (bg.mZ(localAppBrandLocalMediaObject.fAx)) || (bg.mZ(localAppBrandLocalMediaObject.hhT))) {
        break label445;
      }
      paramJSONObject = new HashMap(1);
      paramJSONObject.put("savedFilePath", localAppBrandLocalMediaObject.fAx);
      paramk.v(paramInt, d("ok", paramJSONObject));
      GMTrace.o(10389660106752L, 77409);
      return;
      bool = false;
      break;
      paramJSONObject = localAppBrandLocalMediaObject.fAx;
      break label313;
    }
    label445:
    paramk.v(paramInt, d("fail", null));
    GMTrace.o(10389660106752L, 77409);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/file/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */