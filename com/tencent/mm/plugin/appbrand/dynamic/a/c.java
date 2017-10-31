package com.tencent.mm.plugin.appbrand.dynamic.a;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.modelappbrand.e;
import com.tencent.mm.modelappbrand.h;
import com.tencent.mm.modelappbrand.j;
import com.tencent.mm.modelappbrand.q;
import com.tencent.mm.plugin.appbrand.dynamic.g.a.a;
import com.tencent.mm.plugin.appbrand.dynamic.i.a.1;
import com.tencent.mm.plugin.appbrand.dynamic.jsapi.core.MiniJsApiFramework;
import com.tencent.mm.plugin.appbrand.dynamic.widget.IPCDynamicPageView;
import com.tencent.mm.plugin.appbrand.dynamic.widget.IPCDynamicPageView.3;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.ai;
import com.tencent.mm.sdk.platformtools.ai.c;
import com.tencent.mm.sdk.platformtools.w;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import junit.framework.Assert;

public final class c
  implements View.OnAttachStateChangeListener, e, a.a, ai.c
{
  private String hyx;
  private volatile com.tencent.mm.modelappbrand.c iKI;
  private volatile b iKP;
  private volatile d iKQ;
  
  public c()
  {
    GMTrace.i(17738751803392L, 132164);
    GMTrace.o(17738751803392L, 132164);
  }
  
  private com.tencent.mm.modelappbrand.c UD()
  {
    GMTrace.i(17739557109760L, 132170);
    if (this.iKI == null) {}
    try
    {
      if (this.iKI == null) {
        this.iKI = new a();
      }
      com.tencent.mm.modelappbrand.c localc = this.iKI;
      GMTrace.o(17739557109760L, 132170);
      return localc;
    }
    finally {}
  }
  
  public final com.tencent.mm.modelappbrand.d CH()
  {
    GMTrace.i(17739691327488L, 132171);
    if (this.iKP == null) {}
    try
    {
      if (this.iKP == null) {
        this.iKP = new b(UD());
      }
      b localb = this.iKP;
      GMTrace.o(17739691327488L, 132171);
      return localb;
    }
    finally {}
  }
  
  public final h CI()
  {
    GMTrace.i(18312129937408L, 136436);
    if (this.iKQ == null) {}
    try
    {
      if (this.iKQ == null) {
        this.iKQ = new d();
      }
      d locald = this.iKQ;
      GMTrace.o(18312129937408L, 136436);
      return locald;
    }
    finally {}
  }
  
  public final void a(String paramString, View paramView)
  {
    GMTrace.i(17817269174272L, 132749);
    if (!(paramView instanceof IPCDynamicPageView))
    {
      GMTrace.o(17817269174272L, 132749);
      return;
    }
    paramView = (IPCDynamicPageView)paramView;
    w.v("MicroMsg.DynamicPageService", "onUnBindView(%s)", new Object[] { paramView.gQf });
    paramView.removeOnAttachStateChangeListener(this);
    UD().h(paramString, paramView);
    com.tencent.mm.plugin.appbrand.dynamic.g.a.Vb().b(paramString, paramView);
    paramView.detach();
    GMTrace.o(17817269174272L, 132749);
  }
  
  public final void a(String paramString, IPCDynamicPageView paramIPCDynamicPageView)
  {
    GMTrace.i(18312264155136L, 136437);
    w.v("MicroMsg.DynamicPageService", "onOverLength(sessionId : %s, view : %s)", new Object[] { paramString, paramIPCDynamicPageView.gQf });
    a(paramString, paramIPCDynamicPageView);
    GMTrace.o(18312264155136L, 136437);
  }
  
  public final void a(String paramString, Throwable paramThrowable)
  {
    GMTrace.i(19922742673408L, 148436);
    w.e("MicroMsg.DynamicPageService", "uncaughtException(%s)", new Object[] { Log.getStackTraceString(paramThrowable) });
    shutdown();
    GMTrace.o(19922742673408L, 148436);
  }
  
  public final boolean a(String paramString, View paramView, Bundle paramBundle, q paramq)
  {
    GMTrace.i(18941208428544L, 141123);
    if (!(paramView instanceof IPCDynamicPageView))
    {
      GMTrace.o(18941208428544L, 141123);
      return false;
    }
    String str = com.tencent.mm.plugin.appbrand.n.g.aO(System.nanoTime());
    com.tencent.mm.plugin.appbrand.collector.c.c("widget_launch", str, "on_bind_view", true);
    com.tencent.mm.plugin.appbrand.collector.c.aM(str, "init_finish");
    IPCDynamicPageView localIPCDynamicPageView = (IPCDynamicPageView)paramView;
    paramView = null;
    Object localObject = null;
    if (paramBundle != null)
    {
      paramView = paramBundle.getString("app_id");
      localObject = paramBundle.getString("msg_id");
      paramBundle.putString("__session_id", paramString);
      paramBundle.putLong("__on_bind_nano_time", System.nanoTime());
      paramBundle.putString("__session_id", str);
      paramBundle.putParcelable("__cost_time_session", com.tencent.mm.plugin.appbrand.collector.c.oz(str));
    }
    str = MiniJsApiFramework.aU(paramView, (String)localObject);
    localIPCDynamicPageView.removeOnAttachStateChangeListener(this);
    localIPCDynamicPageView.addOnAttachStateChangeListener(this);
    Assert.assertNotNull(str);
    localIPCDynamicPageView.iNQ = System.currentTimeMillis();
    if (paramq != null)
    {
      localObject = paramq.CQ();
      if ((localIPCDynamicPageView.gQf != null) && (!str.equals(localIPCDynamicPageView.gQf))) {
        localIPCDynamicPageView.cleanup();
      }
      if (((!str.equals(localIPCDynamicPageView.gQf)) && (localObject != null)) || (!localIPCDynamicPageView.iNP)) {
        ((com.tencent.mm.modelappbrand.f)localObject).q(localIPCDynamicPageView, 0);
      }
      localIPCDynamicPageView.iNP = false;
      IPCDynamicPageView.iKp.post(new IPCDynamicPageView.3(localIPCDynamicPageView, str, paramBundle, paramq, paramView));
      w.v("MicroMsg.DynamicPageService", "onBindView(%s)", new Object[] { str });
      paramView = com.tencent.mm.plugin.appbrand.dynamic.g.a.Vb();
      if ((this != null) && (paramString != null) && (paramString.length() != 0)) {
        break label327;
      }
    }
    for (;;)
    {
      com.tencent.mm.plugin.appbrand.dynamic.g.a.Vb().c(paramString, localIPCDynamicPageView);
      UD().g(paramString, localIPCDynamicPageView);
      GMTrace.o(18941208428544L, 141123);
      return true;
      localObject = null;
      break;
      label327:
      paramView.iMN.put(paramString, this);
    }
  }
  
  public final View aY(Context paramContext)
  {
    GMTrace.i(17739154456576L, 132167);
    paramContext = new IPCDynamicPageView(paramContext);
    GMTrace.o(17739154456576L, 132167);
    return paramContext;
  }
  
  public final j bB(View paramView)
  {
    GMTrace.i(19922608455680L, 148435);
    if ((paramView instanceof IPCDynamicPageView))
    {
      paramView = (j)paramView;
      GMTrace.o(19922608455680L, 148435);
      return paramView;
    }
    GMTrace.o(19922608455680L, 148435);
    return null;
  }
  
  public final void hc(String paramString)
  {
    GMTrace.i(17739422892032L, 132169);
    com.tencent.mm.plugin.appbrand.dynamic.g.a.Vb().iMM.remove(paramString);
    Object localObject = com.tencent.mm.plugin.appbrand.dynamic.g.a.Vb();
    if ((paramString == null) || (paramString.length() == 0)) {}
    for (;;)
    {
      paramString = UD().aA(paramString);
      if ((paramString != null) && (!paramString.isEmpty())) {
        break;
      }
      GMTrace.o(17739422892032L, 132169);
      return;
      ((com.tencent.mm.plugin.appbrand.dynamic.g.a)localObject).iMN.remove(paramString);
    }
    paramString = paramString.iterator();
    while (paramString.hasNext())
    {
      localObject = (View)paramString.next();
      if ((localObject != null) && ((localObject instanceof IPCDynamicPageView)))
      {
        localObject = (IPCDynamicPageView)localObject;
        w.v("MicroMsg.DynamicPageService", "onUnbindAllView, do unBindView(%s)", new Object[] { ((IPCDynamicPageView)localObject).gQf });
        ((IPCDynamicPageView)localObject).removeOnAttachStateChangeListener(this);
        ((IPCDynamicPageView)localObject).detach();
      }
    }
    if (UD().CG().isEmpty())
    {
      if (!com.tencent.mm.ipcinvoker.f.ek("com.tencent.mm:support"))
      {
        w.i("MicroMsg.DynamicPkgUpdater", "has not Connected RemoteService, abort clearCache");
        GMTrace.o(17739422892032L, 132169);
        return;
      }
      com.tencent.mm.bu.a.post(new a.1());
    }
    GMTrace.o(17739422892032L, 132169);
  }
  
  public final void initialize()
  {
    GMTrace.i(17738886021120L, 132165);
    if ((this.hyx != null) && (this.hyx.length() != 0)) {
      shutdown();
    }
    this.hyx = ("Token#" + System.nanoTime());
    ai.a(this);
    com.tencent.mm.plugin.appbrand.appcache.g.a(new com.tencent.mm.plugin.appbrand.dynamic.b.d());
    GMTrace.o(17738886021120L, 132165);
  }
  
  public final void onViewAttachedToWindow(View paramView)
  {
    GMTrace.i(17739959762944L, 132173);
    if ((paramView == null) || (!(paramView instanceof IPCDynamicPageView)))
    {
      GMTrace.o(17739959762944L, 132173);
      return;
    }
    paramView = (IPCDynamicPageView)paramView;
    w.d("MicroMsg.DynamicPageService", "onViewAttachedToWindow(%s)", new Object[] { paramView.gQf });
    paramView.onResume();
    GMTrace.o(17739959762944L, 132173);
  }
  
  public final void onViewDetachedFromWindow(View paramView)
  {
    GMTrace.i(17740093980672L, 132174);
    if ((paramView == null) || (!(paramView instanceof IPCDynamicPageView)))
    {
      GMTrace.o(17740093980672L, 132174);
      return;
    }
    paramView = (IPCDynamicPageView)paramView;
    w.d("MicroMsg.DynamicPageService", "onViewDetachedFromWindow(%s)", new Object[] { paramView.gQf });
    paramView.onPause();
    GMTrace.o(17740093980672L, 132174);
  }
  
  public final void shutdown()
  {
    GMTrace.i(17739020238848L, 132166);
    Object localObject1 = UD().CG();
    if ((localObject1 == null) || (((Map)localObject1).isEmpty()))
    {
      GMTrace.o(17739020238848L, 132166);
      return;
    }
    localObject1 = new LinkedHashSet(((Map)localObject1).keySet()).iterator();
    while (((Iterator)localObject1).hasNext())
    {
      Object localObject2 = ((Iterator)localObject1).next();
      if ((localObject2 != null) && ((localObject2 instanceof String))) {
        hc((String)localObject2);
      }
    }
    GMTrace.o(17739020238848L, 132166);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/dynamic/a/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */