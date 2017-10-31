package com.tencent.mm.plugin.appbrand.dynamic.jsapi;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build.VERSION;
import android.util.DisplayMetrics;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.compatible.d.p;
import com.tencent.mm.jsapi.b.b.a;
import com.tencent.mm.protocal.d;
import com.tencent.mm.sdk.platformtools.f;
import com.tencent.mm.sdk.platformtools.v;
import com.tencent.mm.x.q.b;
import java.util.HashMap;
import org.json.JSONObject;

public final class c
  extends com.tencent.mm.jsapi.b.a
{
  public c(int paramInt)
  {
    super("getSystemInfo", paramInt);
    GMTrace.i(19927171858432L, 148469);
    GMTrace.o(19927171858432L, 148469);
  }
  
  protected final void b(com.tencent.mm.jsapi.core.a parama, JSONObject paramJSONObject, b.a parama1)
  {
    GMTrace.i(19927306076160L, 148470);
    paramJSONObject = parama.getContext();
    parama = parama.ww();
    DisplayMetrics localDisplayMetrics = paramJSONObject.getResources().getDisplayMetrics();
    float f = localDisplayMetrics.density;
    HashMap localHashMap = new HashMap();
    localHashMap.put("model", p.tj());
    localHashMap.put("pixelRatio", Float.valueOf(f));
    localHashMap.put("windowWidth", Integer.valueOf(com.tencent.mm.plugin.appbrand.n.c.jE(parama.getInt("__page_view_width", 0))));
    localHashMap.put("windowHeight", Integer.valueOf(com.tencent.mm.plugin.appbrand.n.c.jE(parama.getInt("__page_view_height", 0))));
    localHashMap.put("screenWidth", Integer.valueOf(com.tencent.mm.plugin.appbrand.n.c.jE(localDisplayMetrics.widthPixels)));
    localHashMap.put("screenHeight", Integer.valueOf(com.tencent.mm.plugin.appbrand.n.c.jE(localDisplayMetrics.heightPixels)));
    localHashMap.put("language", v.eq(paramJSONObject));
    localHashMap.put("version", f.aa(null, d.toX));
    localHashMap.put("system", "Android " + Build.VERSION.RELEASE);
    parama1.c(a(true, "", localHashMap));
    GMTrace.o(19927306076160L, 148470);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/dynamic/jsapi/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */