package com.tencent.mm.plugin.game.gamewebview.ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.game.gamewebview.ipc.CommonLogicTask;
import com.tencent.mm.plugin.game.gamewebview.ipc.GWMainProcessTask;
import com.tencent.mm.plugin.game.gamewebview.ipc.GameWebViewMainProcessService;
import com.tencent.mm.plugin.webview.ui.tools.game.menu.b.b;
import com.tencent.mm.plugin.webview.ui.tools.game.menu.b.c;
import com.tencent.mm.plugin.webview.ui.tools.game.menu.c;
import com.tencent.mm.plugin.webview.ui.tools.widget.WebViewSearchContentInputFooter;
import com.tencent.mm.protocal.c.afq;
import com.tencent.mm.protocal.c.amu;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.base.m;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class g
  extends i
{
  public Map<Integer, amu> myc;
  
  public g(b paramb)
  {
    super(paramb);
    GMTrace.i(17998731542528L, 134101);
    this.myc = new HashMap();
    GMTrace.o(17998731542528L, 134101);
  }
  
  public final void aDE()
  {
    GMTrace.i(17998865760256L, 134102);
    if (bg.mZ(getBundle().getString("game_hv_menu_appid")))
    {
      super.aDE();
      GMTrace.o(17998865760256L, 134102);
      return;
    }
    final com.tencent.mm.plugin.webview.ui.tools.game.menu.d locald = new com.tencent.mm.plugin.webview.ui.tools.game.menu.d(this.mww);
    locald.a(new b.c()
    {
      public final void g(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(17995241881600L, 134075);
        paramAnonymousMenuItem = (amu)g.this.myc.get(Integer.valueOf(paramAnonymousMenuItem.getItemId()));
        if (paramAnonymousMenuItem == null)
        {
          GMTrace.o(17995241881600L, 134075);
          return;
        }
        switch (g.5.myf[com.tencent.mm.plugin.webview.ui.tools.game.menu.c.a.xK(paramAnonymousMenuItem.tSa).ordinal()])
        {
        }
        for (;;)
        {
          GMTrace.o(17995241881600L, 134075);
          return;
          Object localObject = new Intent();
          ((Intent)localObject).putExtra("rawUrl", paramAnonymousMenuItem.tSb);
          if (com.tencent.xweb.x5.sdk.d.getTbsVersion(g.this.mww) >= 43114)
          {
            com.tencent.mm.bi.d.b(g.this.mww, "game", ".gamewebview.ui.GameWebViewUI", (Intent)localObject);
            GMTrace.o(17995241881600L, 134075);
            return;
          }
          com.tencent.mm.bi.d.b(g.this.mww, "webview", ".ui.tools.game.GameWebViewUI", (Intent)localObject);
          GMTrace.o(17995241881600L, 134075);
          return;
          g.this.aDH();
          GMTrace.o(17995241881600L, 134075);
          return;
          g.this.aDI();
          GMTrace.o(17995241881600L, 134075);
          return;
          g.this.aDP();
          GMTrace.o(17995241881600L, 134075);
          return;
          g.this.aDL();
          GMTrace.o(17995241881600L, 134075);
          return;
          g.this.aDM();
          GMTrace.o(17995241881600L, 134075);
          return;
          g.this.refresh();
          GMTrace.o(17995241881600L, 134075);
          return;
          g.this.aDO();
          GMTrace.o(17995241881600L, 134075);
          return;
          g.this.aDS();
          GMTrace.o(17995241881600L, 134075);
          return;
          localObject = new Bundle();
          ((Bundle)localObject).putInt("mm_to_client_notify_type", 1);
          ((Bundle)localObject).putString("js_event_name", "onCustomGameMenuClicked");
          ((Bundle)localObject).putInt("itemId", paramAnonymousMenuItem.uiM);
          com.tencent.mm.plugin.game.gamewebview.ipc.a.x((Bundle)localObject);
        }
      }
    });
    locald.sxO = new b.b()
    {
      public final void a(m paramAnonymousm)
      {
        GMTrace.i(17994033922048L, 134066);
        com.tencent.mm.plugin.report.service.g.paX.a(480L, 0L, 1L, false);
        m localm = g.this.aDF();
        if (localm != null) {
          paramAnonymousm.vHt.addAll(localm.vHt);
        }
        GMTrace.o(17994033922048L, 134066);
      }
    };
    if (this.mxV.isFullScreen()) {
      locald.sxT = true;
    }
    for (locald.sxU = true; this.mxV.muE.mwV.isShown(); locald.sxU = false)
    {
      this.mxV.muE.eW(false);
      af.i(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(17997792018432L, 134094);
          if (g.this.mww.isFinishing())
          {
            w.i("MicroMsg.GameWebViewMenuHelp", "tryShow sheet failed, the activity has been destroyed.");
            GMTrace.o(17997792018432L, 134094);
            return;
          }
          locald.bCV();
          GMTrace.o(17997792018432L, 134094);
        }
      }, 100L);
      GMTrace.o(17998865760256L, 134102);
      return;
      locald.sxT = false;
    }
    this.mww.aKl();
    af.i(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(17995510317056L, 134077);
        if (g.this.mww.isFinishing())
        {
          w.i("MicroMsg.GameWebViewMenuHelp", "tryShow sheet failed, the activity has been destroyed.");
          GMTrace.o(17995510317056L, 134077);
          return;
        }
        locald.bCV();
        GMTrace.o(17995510317056L, 134077);
      }
    }, 100L);
    GMTrace.o(17998865760256L, 134102);
  }
  
  public final m aDF()
  {
    GMTrace.i(17998999977984L, 134103);
    label216:
    for (;;)
    {
      try
      {
        Object localObject1 = com.tencent.mm.plugin.webview.ui.tools.game.menu.a.sxu;
        Object localObject2 = new CommonLogicTask();
        ((CommonLogicTask)localObject2).type = 9;
        ((CommonLogicTask)localObject2).lRQ.putString("game_hv_menu_appid", getBundle().getString("game_hv_menu_appid"));
        GameWebViewMainProcessService.b((GWMainProcessTask)localObject2);
        localObject2 = ((CommonLogicTask)localObject2).lRQ.getString("game_hv_menu_pbcache");
        if (bg.mZ((String)localObject2)) {
          break label216;
        }
        localObject2 = ((String)localObject2).getBytes("ISO-8859-1");
        Object localObject3 = new afq();
        ((afq)localObject3).aC((byte[])localObject2);
        if (bg.bX(((afq)localObject3).uaY)) {
          break label216;
        }
        localObject1 = ((afq)localObject3).uaY;
        w.i("MicroMsg.GameWebViewMenuHelp", "use net menu data");
        this.myc.clear();
        localObject2 = ((List)localObject1).iterator();
        if (((Iterator)localObject2).hasNext())
        {
          localObject3 = (amu)((Iterator)localObject2).next();
          this.myc.put(Integer.valueOf(((amu)localObject3).uiM), localObject3);
          continue;
        }
        localm = c.bCU().f(localException, Od());
      }
      catch (Exception localException)
      {
        w.e("MicroMsg.GameWebViewMenuHelp", "get cache hv game menu fail! exception:%s", new Object[] { localException.getMessage() });
        GMTrace.o(17998999977984L, 134103);
        return null;
      }
      m localm;
      GMTrace.o(17998999977984L, 134103);
      return localm;
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/game/gamewebview/ui/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */