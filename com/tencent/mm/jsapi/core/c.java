package com.tencent.mm.jsapi.core;

import android.content.Context;
import android.util.Log;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.jsapi.b.b.a;
import com.tencent.mm.jsapi.b.e;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.x.q.b;
import java.util.Map;
import org.json.JSONObject;

public final class c
{
  public a gPW;
  private com.tencent.mm.jsapi.c.a gPX;
  public d gPY;
  public b gPZ;
  
  public c(Context paramContext, MiniJsBridge paramMiniJsBridge, com.tencent.mm.jsapi.c.a parama, b paramb)
  {
    GMTrace.i(20023540187136L, 149187);
    this.gPW = new a(paramContext, paramMiniJsBridge);
    this.gPX = parama;
    this.gPZ = paramb;
    GMTrace.o(20023540187136L, 149187);
  }
  
  public final String b(String paramString1, String paramString2, final int paramInt)
  {
    GMTrace.i(20023674404864L, 149188);
    try
    {
      Object localObject = this.gPY;
      if (bg.mZ(paramString1)) {}
      for (localObject = null; localObject == null; localObject = (com.tencent.mm.jsapi.b.b)((d)localObject).gQe.get(paramString1))
      {
        paramString2 = this.gPZ.eq(paramString1);
        GMTrace.o(20023674404864L, 149188);
        return paramString2;
      }
      paramString2 = this.gPZ.a(this.gPW, this.gPX, (com.tencent.mm.jsapi.b.b)localObject, paramString2, new b.a()
      {
        public final void c(JSONObject paramAnonymousJSONObject)
        {
          GMTrace.i(20022198009856L, 149177);
          MiniJsBridge localMiniJsBridge = c.this.gPW.gQc;
          int i = paramInt;
          if (paramAnonymousJSONObject == null) {}
          for (paramAnonymousJSONObject = "";; paramAnonymousJSONObject = paramAnonymousJSONObject.toString())
          {
            Object localObject = paramAnonymousJSONObject;
            if (bg.mZ(paramAnonymousJSONObject)) {
              localObject = "{}";
            }
            localMiniJsBridge.gQi.evaluateJavascript(String.format("typeof WeixinJSBridge !== 'undefined' && WeixinJSBridge.invokeCallbackHandler(%d, %s)", new Object[] { Integer.valueOf(i), localObject }), null);
            GMTrace.o(20022198009856L, 149177);
            return;
          }
        }
      });
      GMTrace.o(20023674404864L, 149188);
      return paramString2;
    }
    catch (Exception paramString2)
    {
      w.e("MicroMsg.MiniJsApiCore", "Invoke JsApi error: %s, %s", new Object[] { paramString1, Log.getStackTraceString(paramString2) });
      throw paramString2;
    }
  }
  
  private static final class a
    implements a
  {
    MiniJsBridge gQc;
    public q.b gQd;
    Context mContext;
    
    a(Context paramContext, MiniJsBridge paramMiniJsBridge)
    {
      GMTrace.i(20020587397120L, 149165);
      this.mContext = paramContext;
      this.gQc = paramMiniJsBridge;
      this.gQd = new q.b();
      GMTrace.o(20020587397120L, 149165);
    }
    
    public final Context getContext()
    {
      GMTrace.i(20020721614848L, 149166);
      Context localContext = this.mContext;
      GMTrace.o(20020721614848L, 149166);
      return localContext;
    }
    
    public final q.b ww()
    {
      GMTrace.i(20020855832576L, 149167);
      q.b localb = this.gQd;
      GMTrace.o(20020855832576L, 149167);
      return localb;
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/jsapi/core/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */