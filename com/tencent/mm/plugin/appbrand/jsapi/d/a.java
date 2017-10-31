package com.tencent.mm.plugin.appbrand.jsapi.d;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.k;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class a
{
  private static Map<String, JSONObject> iWk;
  
  public static Map<String, JSONObject> Wy()
  {
    GMTrace.i(15471411724288L, 115271);
    if (iWk == null) {
      iWk = new HashMap();
    }
    Map localMap = iWk;
    GMTrace.o(15471411724288L, 115271);
    return localMap;
  }
  
  public static void Wz()
  {
    GMTrace.i(15471545942016L, 115272);
    if (iWk != null) {
      iWk = null;
    }
    GMTrace.o(15471545942016L, 115272);
  }
  
  public static String i(k paramk)
  {
    GMTrace.i(15471680159744L, 115273);
    paramk = "JsApi#BeaconSessionId" + paramk.hashCode();
    GMTrace.o(15471680159744L, 115273);
    return paramk;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/d/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */