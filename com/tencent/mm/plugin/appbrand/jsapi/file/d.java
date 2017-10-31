package com.tencent.mm.plugin.appbrand.jsapi.file;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.loader.stub.b;
import com.tencent.mm.plugin.appbrand.appstorage.AppBrandLocalMediaObject;
import com.tencent.mm.plugin.appbrand.appstorage.c;
import com.tencent.mm.plugin.appbrand.jsapi.a;
import com.tencent.mm.plugin.appbrand.k;
import com.tencent.mm.sdk.platformtools.bg;
import org.json.JSONObject;

public final class d
  extends a
{
  private static final int CTRL_INDEX = 117;
  private static final String NAME = "removeSavedFile";
  
  public d()
  {
    GMTrace.i(10388317929472L, 77399);
    GMTrace.o(10388317929472L, 77399);
  }
  
  public final void a(k paramk, JSONObject paramJSONObject, int paramInt)
  {
    GMTrace.i(10388452147200L, 77400);
    String str = paramk.iqL;
    paramJSONObject = paramJSONObject.optString("filePath", "");
    if (bg.mZ(paramJSONObject)) {
      paramJSONObject = "fail:invalid data";
    }
    for (;;)
    {
      paramk.v(paramInt, d(paramJSONObject, null));
      GMTrace.o(10388452147200L, 77400);
      return;
      paramJSONObject = c.aI(str, paramJSONObject);
      if ((paramJSONObject != null) && (!bg.mZ(paramJSONObject.hhT)))
      {
        b.deleteFile(paramJSONObject.hhT);
        paramJSONObject = "ok";
      }
      else
      {
        paramJSONObject = "fail:file doesn't exist";
      }
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/file/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */