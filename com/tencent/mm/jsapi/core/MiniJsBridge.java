package com.tencent.mm.jsapi.core;

import android.webkit.JavascriptInterface;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.jsapi.c.a;
import com.tencent.mm.sdk.platformtools.w;
import org.json.JSONObject;

public class MiniJsBridge
{
  public volatile boolean UF;
  public String gQf;
  public c gQg;
  public e gQh;
  public com.tencent.mm.jsapi.b.e gQi;
  private volatile boolean gQj;
  public a gQk;
  
  public MiniJsBridge()
  {
    GMTrace.i(20022600663040L, 149180);
    GMTrace.o(20022600663040L, 149180);
  }
  
  public final boolean a(com.tencent.mm.jsapi.b.c paramc)
  {
    GMTrace.i(20023003316224L, 149183);
    e locale = this.gQh;
    if (paramc == null)
    {
      w.i("MicroMsg.MiniJsEventDispatcher", "dispatchJsEvent failed, event is null.");
      GMTrace.o(20023003316224L, 149183);
      return false;
    }
    Object localObject = locale.gQl.er(paramc.name);
    if (localObject == null)
    {
      w.i("MicroMsg.MiniJsEventDispatcher", "JsEvent(%s) do not exist.", new Object[] { paramc });
      GMTrace.o(20023003316224L, 149183);
      return false;
    }
    if (!locale.gPX.eS(((com.tencent.mm.jsapi.b.f)localObject).getIndex()))
    {
      w.i("MicroMsg.MiniJsEventDispatcher", "JsEvent(%s) no permission.", new Object[] { paramc });
      GMTrace.o(20023003316224L, 149183);
      return false;
    }
    localObject = paramc.or().toString();
    w.d("MicroMsg.MiniJsEventDispatcher", "dispatch, event: %s, data size: %s, srcId: %d", new Object[] { paramc.name, Integer.valueOf(((String)localObject).length()), Integer.valueOf(0) });
    locale.gQi.evaluateJavascript(String.format("typeof WeixinJSBridge !== 'undefined' && WeixinJSBridge.subscribeHandler(\"%s\", %s, %s, %s)", new Object[] { paramc.name, localObject, "undefined", e.wx() }), null);
    GMTrace.o(20023003316224L, 149183);
    return true;
  }
  
  public final void b(com.tencent.mm.jsapi.b.c paramc)
  {
    GMTrace.i(20023137533952L, 149184);
    if (this.gQj)
    {
      GMTrace.o(20023137533952L, 149184);
      return;
    }
    w.v("MicroMsg.MiniJsBridge", "onPause(%s)", new Object[] { this.gQf });
    this.gQj = true;
    if (this.gQi.wu()) {
      this.gQi.pause();
    }
    for (;;)
    {
      if (this.gQk != null) {
        this.gQk.r(this.gQf, 3);
      }
      GMTrace.o(20023137533952L, 149184);
      return;
      a(paramc);
    }
  }
  
  public final void c(com.tencent.mm.jsapi.b.c paramc)
  {
    GMTrace.i(20023271751680L, 149185);
    if (!this.gQj)
    {
      GMTrace.o(20023271751680L, 149185);
      return;
    }
    w.v("MicroMsg.MiniJsBridge", "onResume(%s)", new Object[] { this.gQf });
    if (this.gQi.wu()) {
      this.gQi.resume();
    }
    for (;;)
    {
      this.gQj = false;
      if (this.gQk != null) {
        this.gQk.r(this.gQf, 2);
      }
      GMTrace.o(20023271751680L, 149185);
      return;
      a(paramc);
    }
  }
  
  @JavascriptInterface
  public String invokeHandler(String paramString1, String paramString2, int paramInt)
  {
    GMTrace.i(20022869098496L, 149182);
    if (!this.UF)
    {
      paramString1 = this.gQg.gPZ.z(paramString1, "fail:JsApi core not started");
      GMTrace.o(20022869098496L, 149182);
      return paramString1;
    }
    paramString1 = this.gQg.b(paramString1, paramString2, paramInt);
    GMTrace.o(20022869098496L, 149182);
    return paramString1;
  }
  
  public final void onStart()
  {
    GMTrace.i(20023405969408L, 149186);
    if (this.UF)
    {
      GMTrace.o(20023405969408L, 149186);
      return;
    }
    w.v("MicroMsg.MiniJsBridge", "onStart(%s)", new Object[] { this.gQf });
    this.UF = true;
    if (this.gQk != null) {
      this.gQk.r(this.gQf, 1);
    }
    GMTrace.o(20023405969408L, 149186);
  }
  
  @JavascriptInterface
  public void publishHandler(String paramString1, String paramString2, String paramString3)
  {
    int i = 0;
    GMTrace.i(20022734880768L, 149181);
    if (paramString2 == null) {}
    for (;;)
    {
      w.d("MicroMsg.MiniJsBridge", "publishHandler, event: %s, data size: %d", new Object[] { paramString1, Integer.valueOf(i) });
      GMTrace.o(20022734880768L, 149181);
      return;
      i = paramString2.length();
    }
  }
  
  public static abstract interface a
  {
    public abstract void r(String paramString, int paramInt);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/jsapi/core/MiniJsBridge.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */