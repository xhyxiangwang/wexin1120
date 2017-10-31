package com.tencent.mm.plugin.appbrand.jsapi.b;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.k;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.x.q;
import com.tencent.mm.x.q.b;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONObject;

public final class a
{
  public static boolean iUJ;
  public static k iUK;
  public static int iUL;
  private static Map<String, JSONObject> iUM;
  private static JSONArray iUN;
  private static JSONArray iUO;
  
  static
  {
    GMTrace.i(14332976955392L, 106789);
    iUJ = false;
    iUK = null;
    iUL = 0;
    GMTrace.o(14332976955392L, 106789);
  }
  
  public static Map<String, JSONObject> Wj()
  {
    GMTrace.i(14331903213568L, 106781);
    if (iUM == null) {
      iUM = new ConcurrentHashMap();
    }
    Map localMap = iUM;
    GMTrace.o(14331903213568L, 106781);
    return localMap;
  }
  
  public static void Wk()
  {
    GMTrace.i(14332037431296L, 106782);
    if (iUM != null)
    {
      iUM.clear();
      iUM = null;
    }
    GMTrace.o(14332037431296L, 106782);
  }
  
  public static k Wl()
  {
    GMTrace.i(18211198205952L, 135684);
    k localk = iUK;
    GMTrace.o(18211198205952L, 135684);
    return localk;
  }
  
  public static int Wm()
  {
    GMTrace.i(18211466641408L, 135686);
    int i = iUL;
    GMTrace.o(18211466641408L, 135686);
    return i;
  }
  
  public static void Wn()
  {
    GMTrace.i(16283965849600L, 121325);
    if (iUN != null) {
      iUN = null;
    }
    GMTrace.o(16283965849600L, 121325);
  }
  
  public static void Wo()
  {
    GMTrace.i(14332440084480L, 106785);
    if (iUO != null) {
      iUO = null;
    }
    GMTrace.o(14332440084480L, 106785);
  }
  
  public static void e(k paramk)
  {
    GMTrace.i(18211332423680L, 135685);
    iUK = paramk;
    GMTrace.o(18211332423680L, 135685);
  }
  
  private static String f(k paramk)
  {
    GMTrace.i(14332574302208L, 106786);
    paramk = "JsApi#BluetoothSessionId" + paramk.hashCode();
    GMTrace.o(14332574302208L, 106786);
    return paramk;
  }
  
  public static q.b g(k paramk)
  {
    GMTrace.i(14332708519936L, 106787);
    String str = f(paramk);
    q.b localb = q.Aw().gg(str);
    paramk = localb;
    if (localb == null)
    {
      w.d("MicroMsg.JsApiBluetoothUtil", "getDataStore true!");
      paramk = q.Aw().n(str, true);
    }
    GMTrace.o(14332708519936L, 106787);
    return paramk;
  }
  
  public static void h(k paramk)
  {
    GMTrace.i(14332842737664L, 106788);
    paramk = f(paramk);
    paramk = q.Aw().gh(paramk);
    if (paramk != null)
    {
      paramk.recycle();
      w.d("MicroMsg.JsApiBluetoothUtil", "removeDataKeyValueSet!");
    }
    GMTrace.o(14332842737664L, 106788);
  }
  
  public static void iA(int paramInt)
  {
    GMTrace.i(18211600859136L, 135687);
    iUL = paramInt;
    GMTrace.o(18211600859136L, 135687);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/b/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */