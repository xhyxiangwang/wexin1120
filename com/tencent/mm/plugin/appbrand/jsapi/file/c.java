package com.tencent.mm.plugin.appbrand.jsapi.file;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.appstorage.AppBrandLocalMediaObject;
import com.tencent.mm.plugin.appbrand.jsapi.a;
import com.tencent.mm.plugin.appbrand.k;
import com.tencent.mm.sdk.platformtools.bg;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONObject;

public final class c
  extends a
{
  private static final int CTRL_INDEX = 115;
  private static final String NAME = "getSavedFileList";
  
  public c()
  {
    GMTrace.i(10389257453568L, 77406);
    GMTrace.o(10389257453568L, 77406);
  }
  
  public final void a(k paramk, JSONObject paramJSONObject, int paramInt)
  {
    GMTrace.i(10389391671296L, 77407);
    Object localObject = com.tencent.mm.plugin.appbrand.appstorage.c.oj(paramk.iqL);
    paramJSONObject = new JSONArray();
    if (!bg.bX((List)localObject))
    {
      localObject = ((List)localObject).iterator();
      while (((Iterator)localObject).hasNext())
      {
        AppBrandLocalMediaObject localAppBrandLocalMediaObject = (AppBrandLocalMediaObject)((Iterator)localObject).next();
        try
        {
          JSONObject localJSONObject = new JSONObject();
          localJSONObject.put("filePath", localAppBrandLocalMediaObject.fAx);
          localJSONObject.put("size", localAppBrandLocalMediaObject.ieX);
          localJSONObject.put("createTime", TimeUnit.MILLISECONDS.toSeconds(localAppBrandLocalMediaObject.iDx));
          paramJSONObject.put(localJSONObject);
        }
        catch (Exception localException) {}
      }
    }
    localObject = new HashMap(1);
    ((Map)localObject).put("fileList", paramJSONObject);
    paramk.v(paramInt, d("ok", (Map)localObject));
    GMTrace.o(10389391671296L, 77407);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/file/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */