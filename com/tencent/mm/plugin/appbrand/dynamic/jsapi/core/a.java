package com.tencent.mm.plugin.appbrand.dynamic.jsapi.core;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.util.Log;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.jsapi.b.b.a;
import com.tencent.mm.plugin.appbrand.collector.c;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class a
  implements com.tencent.mm.jsapi.core.b
{
  private Handler iLD;
  public com.tencent.mm.plugin.appbrand.dynamic.h.a iLE;
  
  public a()
  {
    GMTrace.i(19935761793024L, 148533);
    HandlerThread localHandlerThread = new HandlerThread("JsApiExecutor-Thread:" + hashCode());
    localHandlerThread.start();
    this.iLD = new Handler(localHandlerThread.getLooper());
    GMTrace.o(19935761793024L, 148533);
  }
  
  public static JSONObject pt(String paramString)
  {
    GMTrace.i(19936298663936L, 148537);
    String str = paramString;
    try
    {
      if (bg.mZ(paramString)) {
        str = "{}";
      }
      long l = System.nanoTime();
      paramString = com.tencent.mm.plugin.appbrand.dynamic.e.g.pB(str);
      com.tencent.mm.plugin.appbrand.dynamic.h.b.f(System.nanoTime() - l, str.length());
      GMTrace.o(19936298663936L, 148537);
      return paramString;
    }
    catch (Exception paramString)
    {
      w.e("MicroMsg.DefaultJsApiExecutor", Log.getStackTraceString(paramString));
      GMTrace.o(19936298663936L, 148537);
    }
    return null;
  }
  
  public final String a(final com.tencent.mm.jsapi.core.a parama, final com.tencent.mm.jsapi.c.a parama1, final com.tencent.mm.jsapi.b.b paramb, final String paramString, final b.a parama2)
  {
    GMTrace.i(19936030228480L, 148535);
    final String str = paramb.name;
    if (!parama1.eS(paramb.index))
    {
      w.i("MicroMsg.DefaultJsApiExecutor", "JsApiFunc(%s) no permission.", new Object[] { str });
      parama = z(str, "fail:access denied");
      GMTrace.o(19936030228480L, 148535);
      return parama;
    }
    parama1 = com.tencent.mm.plugin.appbrand.n.g.aO(System.nanoTime());
    final boolean bool = com.tencent.mm.plugin.appbrand.dynamic.g.d.oF(str);
    c.c("jsapi_draw_canvas", parama1, "start_jsapi_invoke", bool);
    c.aM(parama1, "after_draw_actions");
    if ((paramb instanceof com.tencent.mm.jsapi.b.d))
    {
      parama1 = pt(paramString);
      if (parama1 == null)
      {
        parama = z(str, "fail:invalid data");
        GMTrace.o(19936030228480L, 148535);
        return parama;
      }
      paramString = new a();
      paramb.a(parama, parama1, paramString);
      if (paramString.iLM == null) {
        parama = "";
      }
    }
    for (;;)
    {
      if (this.iLE != null) {
        this.iLE.pH(str);
      }
      GMTrace.o(19936030228480L, 148535);
      return parama;
      parama = paramString.iLM.toString();
      continue;
      this.iLD.post(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(19936969752576L, 148542);
          c.f(parama1, "parse_json_start", bool);
          Object localObject = a.pt(paramString);
          if (localObject == null)
          {
            localObject = parama2;
            String str = str;
            HashMap localHashMap = new HashMap();
            localHashMap.put("errMsg", str + ":" + "fail:invalid data");
            ((b.a)localObject).c(new JSONObject(localHashMap));
            GMTrace.o(19936969752576L, 148542);
            return;
          }
          c.f(parama1, "parse_json_end", bool);
          com.tencent.mm.plugin.appbrand.dynamic.g.d.a(parama1, paramString, (JSONObject)localObject);
          paramb.a(parama, (JSONObject)localObject, parama2);
          GMTrace.o(19936969752576L, 148542);
        }
      });
      parama = "";
    }
  }
  
  public final String eq(String paramString)
  {
    GMTrace.i(19935896010752L, 148534);
    w.i("MicroMsg.DefaultJsApiExecutor", "JsApiFunc(%s) do not exist.", new Object[] { paramString });
    paramString = z(paramString, "fail:not supported");
    GMTrace.o(19935896010752L, 148534);
    return paramString;
  }
  
  public final void quit()
  {
    GMTrace.i(19936164446208L, 148536);
    this.iLD.getLooper().quit();
    if (this.iLE != null) {
      this.iLE.rB();
    }
    GMTrace.o(19936164446208L, 148536);
  }
  
  public final String z(String paramString1, String paramString2)
  {
    GMTrace.i(19936432881664L, 148538);
    HashMap localHashMap = new HashMap();
    localHashMap.put("errMsg", paramString1 + ":" + paramString2);
    paramString1 = new JSONObject(localHashMap).toString();
    GMTrace.o(19936432881664L, 148538);
    return paramString1;
  }
  
  private static final class a
    implements b.a
  {
    JSONObject iLM;
    
    a()
    {
      GMTrace.i(19936567099392L, 148539);
      GMTrace.o(19936567099392L, 148539);
    }
    
    public final void c(JSONObject paramJSONObject)
    {
      GMTrace.i(19936701317120L, 148540);
      this.iLM = paramJSONObject;
      GMTrace.o(19936701317120L, 148540);
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/dynamic/jsapi/core/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */