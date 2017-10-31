package com.tencent.mm.plugin.appbrand.jsapi.file;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.appstorage.AppBrandLocalMediaObject;
import com.tencent.mm.plugin.appbrand.appstorage.c;
import com.tencent.mm.plugin.appbrand.jsapi.a;
import com.tencent.mm.plugin.appbrand.jsapi.d;
import com.tencent.mm.plugin.appbrand.k;
import com.tencent.mm.sdk.platformtools.bg;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

public final class b
  extends a
{
  private static final int CTRL_INDEX = 116;
  private static final String NAME = "getSavedFileInfo";
  
  public b()
  {
    GMTrace.i(10391539154944L, 77423);
    GMTrace.o(10391539154944L, 77423);
  }
  
  public final void a(k paramk, JSONObject paramJSONObject, int paramInt)
  {
    GMTrace.i(10391673372672L, 77424);
    Object localObject = paramk.iqL;
    paramJSONObject = paramJSONObject.optString("filePath", "");
    if (bg.mZ(paramJSONObject))
    {
      paramk.v(paramInt, d("fail:invalid data", null));
      GMTrace.o(10391673372672L, 77424);
      return;
    }
    paramJSONObject = c.aI((String)localObject, paramJSONObject);
    if (paramJSONObject == null)
    {
      paramk.v(paramInt, d("fail:file doesn't exist", null));
      GMTrace.o(10391673372672L, 77424);
      return;
    }
    paramJSONObject = new File(paramJSONObject.hhT);
    localObject = new HashMap(3);
    ((Map)localObject).put("size", Long.valueOf(paramJSONObject.length()));
    ((Map)localObject).put("createTime", Long.valueOf(TimeUnit.MILLISECONDS.toSeconds(paramJSONObject.lastModified())));
    paramk.v(paramInt, d("ok", (Map)localObject));
    GMTrace.o(10391673372672L, 77424);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/file/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */