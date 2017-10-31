package com.tencent.mm.plugin.appbrand.app;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.compatible.util.k;
import com.tencent.mm.kernel.e.f;
import com.tencent.mm.plugin.appbrand.c.o;
import com.tencent.mm.plugin.appbrand.config.f.1;
import com.tencent.mm.plugin.appbrand.config.n;
import com.tencent.mm.plugin.appbrand.debugger.DebuggerShell;
import com.tencent.mm.plugin.appbrand.dynamic.jsengine.b.a;
import com.tencent.mm.plugin.appbrand.ipc.MMToClientEvent;
import com.tencent.mm.plugin.appbrand.launching.s;
import com.tencent.mm.plugin.appbrand.q;
import com.tencent.mm.plugin.report.service.KVCommCrossProcessReceiver;
import com.tencent.mm.sdk.platformtools.ai;
import com.tencent.mm.sdk.platformtools.ai.c;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.x.ac;
import com.tencent.mm.x.l;
import java.util.LinkedList;
import java.util.List;

@android.support.a.a
public final class PluginAppBrand
  extends com.tencent.mm.kernel.b.d
  implements com.tencent.mm.plugin.appbrand.a.b, ac
{
  static
  {
    GMTrace.i(19680748109824L, 146633);
    if (com.tencent.mm.sdk.platformtools.ab.bNe()) {
      k.b("appbrandcommon", PluginAppBrand.class.getClassLoader());
    }
    GMTrace.o(19680748109824L, 146633);
  }
  
  public PluginAppBrand()
  {
    GMTrace.i(15568585359360L, 115995);
    GMTrace.o(15568585359360L, 115995);
  }
  
  @Deprecated
  private static boolean isAppBrandProcess()
  {
    GMTrace.i(17398107209728L, 129626);
    try
    {
      String str = com.tencent.mm.sdk.platformtools.ab.getPackageName();
      boolean bool = ((com.tencent.mm.kernel.b.f)com.tencent.mm.kernel.h.xw().xa()).gPI.startsWith(str + ":appbrand");
      GMTrace.o(17398107209728L, 129626);
      return bool;
    }
    catch (Exception localException)
    {
      GMTrace.o(17398107209728L, 129626);
    }
    return false;
  }
  
  private static boolean isSupportProcess(String paramString)
  {
    GMTrace.i(19680613892096L, 146632);
    try
    {
      boolean bool = "com.tencent.mm:support".equals(paramString);
      GMTrace.o(19680613892096L, 146632);
      return bool;
    }
    catch (Exception paramString)
    {
      GMTrace.o(19680613892096L, 146632);
    }
    return false;
  }
  
  public final void configure(com.tencent.mm.kernel.b.e parame)
  {
    GMTrace.i(15569122230272L, 115999);
    GMTrace.o(15569122230272L, 115999);
  }
  
  public final void dependency()
  {
    GMTrace.i(15568988012544L, 115998);
    dependsOn(com.tencent.mm.plugin.comm.a.a.class);
    dependsOn(com.tencent.mm.plugin.appbrand.compat.a.h.class);
    GMTrace.o(15568988012544L, 115998);
  }
  
  public final void execute(com.tencent.mm.kernel.b.e parame)
  {
    GMTrace.i(15569256448000L, 116000);
    w.d("MicroMsg.PluginAppBrand", "current process name = %s", new Object[] { ((com.tencent.mm.kernel.b.f)com.tencent.mm.kernel.h.xw().xa()).gPI });
    com.tencent.mm.kernel.h.a(com.tencent.mm.plugin.appbrand.k.c.class, new com.tencent.mm.kernel.c.d(new s()));
    com.tencent.mm.kernel.h.a(com.tencent.mm.modelappbrand.e.class, new com.tencent.mm.kernel.c.d(new com.tencent.mm.plugin.appbrand.dynamic.a.c()));
    com.tencent.mm.kernel.h.a(com.tencent.mm.plugin.appbrand.k.d.class, new com.tencent.mm.kernel.c.d(new com.tencent.mm.plugin.appbrand.launching.a.f()));
    if (parame.eB(""))
    {
      com.tencent.mm.plugin.ab.c.pAE.a(new q());
      com.tencent.mm.kernel.h.a(a.class, new com.tencent.mm.kernel.c.d(new a()));
      com.tencent.mm.kernel.h.a(com.tencent.mm.modelappbrand.g.class, new com.tencent.mm.kernel.c.d(new com.tencent.mm.plugin.appbrand.share.a.a()));
      com.tencent.mm.kernel.h.a(com.tencent.mm.plugin.appbrand.ui.banner.d.class, new com.tencent.mm.kernel.c.d(new com.tencent.mm.plugin.appbrand.ui.banner.a()));
      com.tencent.mm.kernel.h.a(com.tencent.mm.plugin.appbrand.k.a.class, new com.tencent.mm.kernel.c.d(new e()));
      com.tencent.mm.kernel.h.a(com.tencent.mm.plugin.appbrand.k.b.class, new com.tencent.mm.kernel.c.d(new n()));
      com.tencent.mm.kernel.h.a(com.tencent.mm.plugin.appbrand.k.e.class, new com.tencent.mm.kernel.c.d(new c()));
      com.tencent.mm.kernel.h.a(com.tencent.mm.plugin.appbrand.a.a.class, new com.tencent.mm.kernel.c.d(new b()));
      com.tencent.mm.kernel.h.a(com.tencent.mm.plugin.appbrand.widget.a.a.class, new com.tencent.mm.kernel.c.d(new g()));
      com.tencent.mm.kernel.h.a(com.tencent.mm.plugin.appbrand.k.f.class, new com.tencent.mm.kernel.c.d(new o()));
      com.tencent.mm.pluginsdk.b.b.a(new com.tencent.mm.plugin.appbrand.b(), new String[] { "//callsearchshowoutwxaapp", "//getsearchshowoutwxaapp", "//appbrandtest", "//wxafts", "//wxatest", "//localwxalibrary" });
      com.tencent.mm.pluginsdk.b.b.a(new com.tencent.mm.plugin.appbrand.dynamic.c.a(), new String[] { "//widget" });
      com.tencent.mm.kernel.h.xA().a(new com.tencent.mm.kernel.api.h()
      {
        public final void as(boolean paramAnonymousBoolean)
        {
          GMTrace.i(17397570338816L, 129622);
          ((com.tencent.mm.modelappbrand.e)com.tencent.mm.kernel.h.h(com.tencent.mm.modelappbrand.e.class)).shutdown();
          ((com.tencent.mm.modelappbrand.e)com.tencent.mm.kernel.h.h(com.tencent.mm.modelappbrand.e.class)).CH().exit();
          GMTrace.o(17397570338816L, 129622);
        }
        
        public final void pg()
        {
          GMTrace.i(17397436121088L, 129621);
          ((com.tencent.mm.modelappbrand.e)com.tencent.mm.kernel.h.h(com.tencent.mm.modelappbrand.e.class)).initialize();
          GMTrace.o(17397436121088L, 129621);
        }
      });
      if (DebuggerShell.Uy()) {
        com.tencent.mm.kernel.h.a(DebuggerShell.class, new DebuggerShell());
      }
      com.tencent.mm.plugin.appbrand.appcache.g.a(new com.tencent.mm.plugin.appbrand.appcache.f());
      GMTrace.o(15569256448000L, 116000);
      return;
    }
    MMToClientEvent.a(new a.1());
    if (com.tencent.mm.sdk.platformtools.ab.bNg())
    {
      com.tencent.mm.kernel.h.xA().a(new com.tencent.mm.kernel.api.h()
      {
        public final void as(boolean paramAnonymousBoolean)
        {
          GMTrace.i(19683835117568L, 146656);
          GMTrace.o(19683835117568L, 146656);
        }
        
        public final void pg()
        {
          GMTrace.i(19683700899840L, 146655);
          com.tencent.mm.kernel.h.xA().b(this);
          d.RU();
          GMTrace.o(19683700899840L, 146655);
        }
      });
      com.tencent.mm.plugin.appbrand.dynamic.widget.b.initialize();
      ai.a(new ai.c()
      {
        public final void a(String paramAnonymousString, Throwable paramAnonymousThrowable)
        {
          GMTrace.i(19680345456640L, 146630);
          if (bg.mY(paramAnonymousString).contains(".plugin.appbrand"))
          {
            com.tencent.mm.plugin.report.service.g.paX.a(365L, 3L, 1L, false);
            KVCommCrossProcessReceiver.bag();
          }
          GMTrace.o(19680345456640L, 146630);
        }
      });
      GMTrace.o(15569256448000L, 116000);
      return;
    }
    if (isSupportProcess(parame.gPI))
    {
      com.tencent.mm.plugin.appbrand.dynamic.jsengine.b.initialize();
      com.tencent.mm.plugin.appbrand.dynamic.jsengine.b.a(new b.a()
      {
        public final void RV()
        {
          GMTrace.i(19682627158016L, 146647);
          com.tencent.mm.plugin.appbrand.dynamic.g.e.bI(com.tencent.mm.sdk.platformtools.ab.getContext());
          GMTrace.o(19682627158016L, 146647);
        }
      });
      com.tencent.mm.plugin.appbrand.dynamic.e.g.initialize();
    }
    GMTrace.o(15569256448000L, 116000);
  }
  
  final f getCore()
  {
    GMTrace.i(15568719577088L, 115996);
    f localf = (f)l.o(f.class);
    GMTrace.o(15568719577088L, 115996);
    return localf;
  }
  
  public final List<com.tencent.mm.x.ab> getDataTransferList()
  {
    GMTrace.i(17397972992000L, 129625);
    LinkedList localLinkedList = new LinkedList();
    localLinkedList.add(new f.1(new com.tencent.mm.plugin.appbrand.config.f()));
    localLinkedList.add(new com.tencent.mm.plugin.appbrand.config.e().Um());
    GMTrace.o(17397972992000L, 129625);
    return localLinkedList;
  }
  
  public final void installed()
  {
    GMTrace.i(15568853794816L, 115997);
    alias(com.tencent.mm.plugin.appbrand.a.b.class);
    GMTrace.o(15568853794816L, 115997);
  }
  
  public final String name()
  {
    GMTrace.i(15569390665728L, 116001);
    GMTrace.o(15569390665728L, 116001);
    return "plugin-appbrand";
  }
  
  private static final class a
    extends l
  {
    a()
    {
      super();
      GMTrace.i(16370267848704L, 121968);
      GMTrace.o(16370267848704L, 121968);
    }
    
    public final void onAccountInitialized(e.f paramf)
    {
      GMTrace.i(18964830748672L, 141299);
      super.onAccountInitialized(paramf);
      com.tencent.mm.plugin.appbrand.dynamic.widget.b.initialize();
      GMTrace.o(18964830748672L, 141299);
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/app/PluginAppBrand.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */