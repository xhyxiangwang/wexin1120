package com.tencent.mm.plugin.appbrand.jsapi;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.f;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.util.HashMap;
import org.json.JSONObject;

public abstract class c
{
  g iPi;
  
  public c()
  {
    GMTrace.i(17387772444672L, 129549);
    this.iPi = new g();
    GMTrace.o(17387772444672L, 129549);
  }
  
  public abstract f RQ();
  
  public abstract com.tencent.mm.plugin.appbrand.c RR();
  
  public abstract void a(String paramString1, String paramString2, int[] paramArrayOfInt);
  
  public String getAppId()
  {
    GMTrace.i(10405766234112L, 77529);
    String str = RQ().iqL;
    GMTrace.o(10405766234112L, 77529);
    return str;
  }
  
  public void h(String paramString1, String paramString2, int paramInt)
  {
    GMTrace.i(17387906662400L, 129550);
    String str = paramString2;
    if (bg.mZ(paramString2)) {
      str = "{}";
    }
    w.d("MicroMsg.AppBrandComponent", "dispatch, event: %s, data size: %s, srcId: %d", new Object[] { paramString1, Integer.valueOf(str.length()), Integer.valueOf(paramInt) });
    com.tencent.mm.plugin.appbrand.c localc = RR();
    if (paramInt == 0) {}
    for (paramString2 = "undefined";; paramString2 = String.valueOf(paramInt))
    {
      HashMap localHashMap = new HashMap();
      localHashMap.put("nativeTime", Long.valueOf(System.currentTimeMillis()));
      localc.evaluateJavascript(String.format("typeof WeixinJSCoreAndroid !== 'undefined' && WeixinJSCoreAndroid.subscribeHandler(\"%s\", %s, %s, %s)", new Object[] { paramString1, str, paramString2, new JSONObject(localHashMap).toString() }), null);
      GMTrace.o(17387906662400L, 129550);
      return;
    }
  }
  
  public abstract boolean isRunning();
  
  public final void v(int paramInt, String paramString)
  {
    GMTrace.i(10405497798656L, 77527);
    String str = paramString;
    if (bg.mZ(paramString)) {
      str = "{}";
    }
    w.d("MicroMsg.AppBrandComponent", "callbackId: %d, data size: %d", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(str.length()) });
    RR().evaluateJavascript(String.format("typeof WeixinJSCoreAndroid !== 'undefined' && WeixinJSCoreAndroid.invokeCallbackHandler(%d, %s)", new Object[] { Integer.valueOf(paramInt), str }), null);
    this.iPi.w(paramInt, str);
    GMTrace.o(10405497798656L, 77527);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */