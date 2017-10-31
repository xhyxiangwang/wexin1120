package com.tencent.mm.plugin.appbrand.dynamic;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ac.b.c;
import com.tencent.mm.jsapi.c.a;
import com.tencent.mm.jsapi.core.MiniJsBridge;
import com.tencent.mm.jsapi.core.MiniJsBridge.a;
import com.tencent.mm.jsapi.core.c.a;
import com.tencent.mm.plugin.appbrand.dynamic.i.b.b;
import com.tencent.mm.plugin.appbrand.widget.k;
import com.tencent.mm.protocal.c.ps;
import com.tencent.mm.protocal.c.pt;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.x.q.b;
import java.util.Iterator;
import java.util.Set;

public final class c
  implements com.tencent.mm.plugin.appbrand.canvas.widget.b
{
  boolean UF;
  public String appId;
  public volatile MiniJsBridge gQc;
  String gQf;
  String hJq;
  String iFw;
  public Runnable iKA;
  public int iKs;
  public k iKt;
  public String iKu;
  volatile boolean iKv;
  private volatile boolean iKw;
  public boolean iKx;
  public boolean iKy;
  private com.tencent.mm.ipcinvoker.wx_extension.b.a iKz;
  Context mContext;
  String mUrl;
  
  public c(Context paramContext)
  {
    GMTrace.i(17751905140736L, 132262);
    this.iKx = false;
    this.iKy = false;
    this.mContext = paramContext;
    this.iKz = new com.tencent.mm.ipcinvoker.wx_extension.b.a()
    {
      public final void a(int paramAnonymousInt1, int paramAnonymousInt2, String paramAnonymousString, com.tencent.mm.ac.b paramAnonymousb)
      {
        GMTrace.i(17720498192384L, 132028);
        w.d("MicroMsg.DynamicPageViewIPCProxy", "getDynamicData result(errType : %s, errCode : %s, errMsg : %s)", new Object[] { Integer.valueOf(paramAnonymousInt1), Integer.valueOf(paramAnonymousInt2), paramAnonymousString });
        k localk = c.this.iKt;
        if ((paramAnonymousInt1 != 0) || (paramAnonymousInt2 != 0))
        {
          com.tencent.mm.plugin.report.service.g.paX.a(638L, 0L, 1L, false);
          if ((c.this.iKs == 1) && (!c.this.iKx)) {
            com.tencent.mm.plugin.report.service.g.paX.i(14452, new Object[] { c.this.iKu + "-" + c.this.appId, Integer.valueOf(10), Long.valueOf(System.currentTimeMillis()) });
          }
          if (localk != null) {}
          for (long l = localk.field_interval;; l = 10L)
          {
            b.e(c.this.iKA, l * 1000L);
            GMTrace.o(17720498192384L, 132028);
            return;
          }
        }
        if ((c.this.iKs == 1) && (!c.this.iKx))
        {
          c.this.iKx = true;
          com.tencent.mm.plugin.report.service.g.paX.i(14452, new Object[] { c.this.iKu + "-" + c.this.appId, Integer.valueOf(9), Long.valueOf(System.currentTimeMillis()) });
        }
        paramAnonymousb = (pt)paramAnonymousb.hlV.hmc;
        if (paramAnonymousb.tLv != null) {}
        for (paramAnonymousString = paramAnonymousb.tLv.bKX(); localk == null; paramAnonymousString = "")
        {
          GMTrace.o(17720498192384L, 132028);
          return;
        }
        if (!bg.mZ(paramAnonymousString)) {
          localk.field_data = paramAnonymousString;
        }
        localk.field_interval = paramAnonymousb.hWK;
        localk.field_updateTime = System.currentTimeMillis();
        paramAnonymousString = (Bundle)com.tencent.mm.ipcinvoker.e.a("com.tencent.mm", localk.qQ(), b.b.class);
        if (paramAnonymousString != null) {
          paramAnonymousString.getBoolean("result", false);
        }
        if (!c.this.UF)
        {
          w.i("MicroMsg.DynamicPageViewIPCProxy", "not running");
          GMTrace.o(17720498192384L, 132028);
          return;
        }
        c.a(c.this.gQc, localk);
        if ((c.this.iKs == 1) && (!c.this.iKy))
        {
          c.this.iKy = true;
          com.tencent.mm.plugin.report.service.g.paX.i(14452, new Object[] { c.this.iKu + "-" + c.this.appId, Integer.valueOf(11), Long.valueOf(System.currentTimeMillis()) });
        }
        if (localk.field_interval > 0) {
          c.this.UA();
        }
        GMTrace.o(17720498192384L, 132028);
      }
    };
    this.iKA = new Runnable()
    {
      public final void run()
      {
        GMTrace.i(17729356562432L, 132094);
        c.this.UA();
        GMTrace.o(17729356562432L, 132094);
      }
    };
    GMTrace.o(17751905140736L, 132262);
  }
  
  public static void a(MiniJsBridge paramMiniJsBridge, k paramk)
  {
    boolean bool2 = false;
    GMTrace.i(19941667373056L, 148577);
    if ((paramMiniJsBridge == null) || (paramk == null) || (bg.mZ(paramk.field_data)))
    {
      if (paramMiniJsBridge == null) {}
      for (boolean bool1 = true;; bool1 = false)
      {
        if (paramk == null) {
          bool2 = true;
        }
        w.d("MicroMsg.DynamicPageViewIPCProxy", "pushData failed, jsBridge(isNull : %s) or cacheData(isNull : %s) or cacheData.field_data is null", new Object[] { Boolean.valueOf(bool1), Boolean.valueOf(bool2) });
        GMTrace.o(19941667373056L, 148577);
        return;
      }
    }
    com.tencent.mm.plugin.appbrand.dynamic.d.c localc = new com.tencent.mm.plugin.appbrand.dynamic.d.c();
    localc.data = paramk.field_data;
    paramMiniJsBridge.a(localc);
    GMTrace.o(19941667373056L, 148577);
  }
  
  public final void UA()
  {
    GMTrace.i(17752173576192L, 132264);
    k localk = this.iKt;
    if ((localk == null) || (!this.UF))
    {
      GMTrace.o(17752173576192L, 132264);
      return;
    }
    if (this.iKv)
    {
      this.iKw = true;
      GMTrace.o(17752173576192L, 132264);
      return;
    }
    if (bg.mZ(localk.field_appId))
    {
      w.e("MicroMsg.DynamicPageViewIPCProxy", "tryToRefresh(%s) failed, has no appId", new Object[] { this.gQf });
      GMTrace.o(17752173576192L, 132264);
      return;
    }
    this.iKw = false;
    long l = localk.field_updateTime + localk.field_interval * 1000L - System.currentTimeMillis();
    if (l > 0L)
    {
      w.d("MicroMsg.DynamicPageViewIPCProxy", "post delay refresh(%s) data.", new Object[] { Long.valueOf(l) });
      b.e(this.iKA, l);
      GMTrace.o(17752173576192L, 132264);
      return;
    }
    w.d("MicroMsg.DynamicPageViewIPCProxy", "refresh data(%s, %s, %s)", new Object[] { this.iKt.field_id, this.iKt.field_appId, this.iKt.field_cacheKey });
    com.tencent.mm.ac.b.a locala = new com.tencent.mm.ac.b.a();
    locala.hlW = 1193;
    locala.uri = "/cgi-bin/mmbiz-bin/wxaapp/getdynamicdata";
    ps localps = new ps();
    localps.fKY = localk.field_appId;
    localps.amo = localk.field_cacheKey;
    localps.scene = this.iKs;
    localps.fIW = this.hJq;
    localps.url = this.mUrl;
    locala.hlX = localps;
    locala.hlY = new pt();
    com.tencent.mm.ipcinvoker.wx_extension.b.a(locala.DA(), this.iKz);
    GMTrace.o(17752173576192L, 132264);
  }
  
  public final boolean aS(String paramString1, String paramString2)
  {
    GMTrace.i(19941533155328L, 148576);
    if ((this.gQc == null) || (TextUtils.isEmpty(paramString1)) || (TextUtils.isEmpty(paramString2)))
    {
      GMTrace.o(19941533155328L, 148576);
      return false;
    }
    com.tencent.mm.jsapi.core.e locale = this.gQc.gQh;
    Object localObject = locale.gQl.er(paramString1);
    if (localObject == null)
    {
      w.i("MicroMsg.MiniJsEventDispatcher", "JsEvent(%s) do not exist.", new Object[] { paramString1 });
      GMTrace.o(19941533155328L, 148576);
      return false;
    }
    if (!locale.gPX.eS(((com.tencent.mm.jsapi.b.f)localObject).getIndex()))
    {
      w.i("MicroMsg.MiniJsEventDispatcher", "JsEvent(%s) no permission.", new Object[] { paramString1 });
      GMTrace.o(19941533155328L, 148576);
      return false;
    }
    localObject = paramString2;
    if (bg.mZ(paramString2)) {
      localObject = "{}";
    }
    w.d("MicroMsg.MiniJsEventDispatcher", "dispatch, event: %s, data size: %s, srcId: %d", new Object[] { paramString1, Integer.valueOf(((String)localObject).length()), Integer.valueOf(0) });
    locale.gQi.evaluateJavascript(String.format("typeof WeixinJSBridge !== 'undefined' && WeixinJSBridge.subscribeHandler(\"%s\", %s, %s, %s)", new Object[] { paramString1, localObject, "undefined", com.tencent.mm.jsapi.core.e.wx() }), null);
    GMTrace.o(19941533155328L, 148576);
    return true;
  }
  
  void cleanup()
  {
    GMTrace.i(17752039358464L, 132263);
    if (this.iKt != null) {
      w.i("MicroMsg.DynamicPageViewIPCProxy", "cleanup(%s, %s, %s)", new Object[] { this.iKt.field_id, this.iKt.field_appId, this.iKt.field_cacheKey });
    }
    for (;;)
    {
      if (this.gQc != null)
      {
        MiniJsBridge localMiniJsBridge = this.gQc;
        w.v("MicroMsg.MiniJsBridge", "onStop(%s)", new Object[] { localMiniJsBridge.gQf });
        localMiniJsBridge.UF = false;
        localMiniJsBridge.gQi.cleanup();
        com.tencent.mm.jsapi.core.c localc = localMiniJsBridge.gQg;
        localc.gPZ.quit();
        localc.gPW.gQd.recycle();
        if (localMiniJsBridge.gQk != null)
        {
          localMiniJsBridge.gQk.r(localMiniJsBridge.gQf, 4);
          localMiniJsBridge.gQk = null;
        }
      }
      GMTrace.o(17752039358464L, 132263);
      return;
      w.i("MicroMsg.DynamicPageViewIPCProxy", "cleanup");
    }
  }
  
  public final boolean isPaused()
  {
    GMTrace.i(18854235340800L, 140475);
    boolean bool = this.iKv;
    GMTrace.o(18854235340800L, 140475);
    return bool;
  }
  
  public final void onPause()
  {
    GMTrace.i(18853966905344L, 140473);
    w.i("MicroMsg.DynamicPageViewIPCProxy", "onPause(%s)", new Object[] { this.gQf });
    this.iKv = true;
    if (this.gQc != null) {
      this.gQc.b(new com.tencent.mm.plugin.appbrand.dynamic.d.f());
    }
    GMTrace.o(18853966905344L, 140473);
  }
  
  public final void onResume()
  {
    GMTrace.i(18854101123072L, 140474);
    w.i("MicroMsg.DynamicPageViewIPCProxy", "onResume(%s)", new Object[] { this.gQf });
    boolean bool = this.iKv;
    if (this.gQc != null) {
      this.gQc.c(new com.tencent.mm.plugin.appbrand.dynamic.d.g());
    }
    this.iKv = false;
    if ((bool) && (this.iKw)) {
      UA();
    }
    GMTrace.o(18854101123072L, 140474);
  }
  
  public final void q(Bundle paramBundle)
  {
    GMTrace.i(17752442011648L, 132266);
    if (paramBundle == null)
    {
      GMTrace.o(17752442011648L, 132266);
      return;
    }
    q.b localb = this.gQc.gQg.gPW.gQd;
    Iterator localIterator = paramBundle.keySet().iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      localb.k(str, paramBundle.get(str));
    }
    GMTrace.o(17752442011648L, 132266);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/dynamic/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */