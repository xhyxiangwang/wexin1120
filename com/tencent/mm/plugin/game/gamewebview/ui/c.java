package com.tencent.mm.plugin.game.gamewebview.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.view.KeyEvent;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.plugin.webview.wepkg.a;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;

public final class c
  extends FrameLayout
{
  private b mwA;
  private b mwB;
  com.tencent.mm.plugin.game.widget.b<b> mwC;
  private Intent mwD;
  private long mwE;
  private GameWebViewUI mww;
  
  public c(final GameWebViewUI paramGameWebViewUI)
  {
    super(paramGameWebViewUI);
    GMTrace.i(19306817519616L, 143847);
    this.mww = paramGameWebViewUI;
    this.mwC = new com.tencent.mm.plugin.game.widget.b(new com.tencent.mm.plugin.game.widget.b.a()
    {
      public final void aDg()
      {
        GMTrace.i(17985980858368L, 134006);
        paramGameWebViewUI.ow(c.a(c.this).size());
        GMTrace.o(17985980858368L, 134006);
      }
      
      public final void aDh()
      {
        GMTrace.i(17986115076096L, 134007);
        paramGameWebViewUI.ow(c.a(c.this).size());
        GMTrace.o(17986115076096L, 134007);
      }
    });
    GMTrace.o(19306817519616L, 143847);
  }
  
  private void a(Animator paramAnimator, final Runnable paramRunnable)
  {
    GMTrace.i(18018595766272L, 134249);
    paramAnimator.addListener(new AnimatorListenerAdapter()
    {
      public final void onAnimationEnd(Animator paramAnonymousAnimator)
      {
        GMTrace.i(19300509286400L, 143800);
        if (paramRunnable != null) {
          paramRunnable.run();
        }
        GMTrace.o(19300509286400L, 143800);
      }
    });
    paramAnimator.start();
    GMTrace.o(18018595766272L, 134249);
  }
  
  private boolean aDc()
  {
    GMTrace.i(18018729984000L, 134250);
    boolean bool = this.mwD.getBooleanExtra("is_from_keep_top", false);
    GMTrace.o(18018729984000L, 134250);
    return bool;
  }
  
  final void a(b paramb)
  {
    GMTrace.i(18018461548544L, 134248);
    if (paramb == null)
    {
      GMTrace.o(18018461548544L, 134248);
      return;
    }
    paramb.eT(false);
    paramb.setVisibility(8);
    removeView(paramb);
    if (paramb != this.mwA)
    {
      paramb.YN();
      GMTrace.o(18018461548544L, 134248);
      return;
    }
    paramb = ObjectAnimator.ofFloat(paramb, "translationX", new float[] { 0.0F });
    paramb.setDuration(0L);
    a(paramb, null);
    GMTrace.o(18018461548544L, 134248);
  }
  
  public final void aDf()
  {
    GMTrace.i(18019132637184L, 134253);
    w.d("MicroMsg.GameWebPageContainer", "cancelPageTop");
    if ((this.mwA != null) && (!this.mwC.contains(this.mwA))) {
      this.mwA.YN();
    }
    for (;;)
    {
      this.mwA = null;
      GMTrace.o(18019132637184L, 134253);
      return;
      if (this.mwA != null) {
        this.mwA.aDb();
      }
    }
  }
  
  public final void b(b paramb)
  {
    GMTrace.i(18018998419456L, 134252);
    w.d("MicroMsg.GameWebPageContainer", "keepPageTop");
    if (this.mwA == paramb)
    {
      GMTrace.o(18018998419456L, 134252);
      return;
    }
    if ((this.mwA != null) && (!this.mwC.contains(this.mwA))) {
      this.mwA.YN();
    }
    for (;;)
    {
      this.mwA = paramb;
      GMTrace.o(18018998419456L, 134252);
      return;
      if (this.mwA != null) {
        this.mwA.aDb();
      }
    }
  }
  
  public final void c(final Intent paramIntent, boolean paramBoolean)
  {
    GMTrace.i(18018193113088L, 134246);
    this.mwD = paramIntent;
    final Object localObject1 = paramIntent.getStringExtra("rawUrl");
    if (bg.mZ((String)localObject1))
    {
      GMTrace.o(18018193113088L, 134246);
      return;
    }
    final Object localObject2 = (b)this.mwC.peek();
    if ((localObject2 != null) && (bg.mY(((b)localObject2).muE.mwd).equals(localObject1)))
    {
      paramBoolean = aDc();
      ((b)localObject2).un.putBoolean("is_from_keep_top", paramBoolean);
      GMTrace.o(18018193113088L, 134246);
      return;
    }
    if ((aDc()) && (this.mwA != null))
    {
      while (!this.mwC.isEmpty()) {
        a((b)this.mwC.pop());
      }
      if (this.mwA.getParent() == null) {
        addView(this.mwA);
      }
      this.mwA.YL();
      this.mwC.push(this.mwA);
      GMTrace.o(18018193113088L, 134246);
      return;
    }
    int i;
    if ((!paramBoolean) && (paramIntent.getBooleanExtra("needAnimation", true)))
    {
      i = 1;
      w.d("MicroMsg.GameWebPageContainer", "createPage start : " + System.currentTimeMillis());
      this.mwE = System.currentTimeMillis();
      if (this.mwB == null) {
        break label696;
      }
      paramIntent = this.mwB;
      this.mwB = null;
      label255:
      localObject2 = this.mwD.getExtras();
      paramIntent.un = ((Bundle)localObject2);
      d locald = paramIntent.aCZ();
      locald.un = ((Bundle)localObject2);
      locald.mwS.mug = locald.aDj();
      locald.gDm = locald.un.getString("geta8key_username");
      locald.mxx = locald.un.getString("KPublisherId");
      locald.scene = locald.un.getInt("geta8key_scene", 0);
      locald.mxw = com.tencent.mm.plugin.game.gamewebview.a.d.aa(locald.scene, locald.gDm);
      locald.mxq = locald.un.getBoolean("neverGetA8Key", false);
      locald.mxB = locald.un.getString("game_hv_menu_appid");
      w.d("MicroMsg.GameWebPageContainer", "LoadUrl begin : %d", new Object[] { Long.valueOf(System.currentTimeMillis() - this.mwE) });
      w.d("MicroMsg.GameWebPage", "loadUrl, url = %s, pageViewId = %d, this = %d", new Object[] { localObject1, Integer.valueOf(paramIntent.muE.hashCode()), Integer.valueOf(paramIntent.hashCode()) });
      localObject2 = paramIntent.muE;
      if (!bg.mZ((String)localObject1)) {
        break label760;
      }
      w.e("MicroMsg.GameWebPageView", "rawUrl is null");
    }
    for (;;)
    {
      w.d("MicroMsg.GameWebPageContainer", "LoadUrl end : %d", new Object[] { Long.valueOf(System.currentTimeMillis() - this.mwE) });
      localObject2 = (b)this.mwC.peek();
      this.mwC.push(paramIntent);
      if (i == 0) {
        break label896;
      }
      w.d("MicroMsg.GameWebPageContainer", "addView start : %d", new Object[] { Long.valueOf(System.currentTimeMillis() - this.mwE) });
      if (paramIntent.getParent() == null) {
        addView(paramIntent, 0);
      }
      w.d("MicroMsg.GameWebPageContainer", "addView end : %d", new Object[] { Long.valueOf(System.currentTimeMillis() - this.mwE) });
      localObject1 = new boolean[1];
      localObject1[0] = 0;
      localObject2 = new Runnable()
      {
        public final void run()
        {
          GMTrace.i(18015642976256L, 134227);
          w.i("MicroMsg.GameWebPageContainer", "loadUrl costTime = %d", new Object[] { Long.valueOf(System.currentTimeMillis() - c.b(c.this)) });
          if (localObject1[0] != 0)
          {
            GMTrace.o(18015642976256L, 134227);
            return;
          }
          localObject1[0] = true;
          paramIntent.v(new Runnable()
          {
            public final void run()
            {
              boolean bool1 = false;
              GMTrace.i(17998328889344L, 134098);
              synchronized (c.this)
              {
                if (c.2.this.mwH != null)
                {
                  c localc2 = c.this;
                  b localb = c.2.this.mwH;
                  boolean bool2 = c.c(c.this).getBooleanExtra("finish_recent_page", false);
                  if (!c.c(c.this).getBooleanExtra("transparent_page", false)) {
                    bool1 = true;
                  }
                  c.a(localc2, localb, bool2, bool1);
                }
                c.a(c.this, c.2.this.mwG);
                GMTrace.o(17998328889344L, 134098);
                return;
              }
            }
          });
          GMTrace.o(18015642976256L, 134227);
        }
      };
      paramIntent.muE.mxu = new b.a()
      {
        public final void aDe()
        {
          GMTrace.i(17985443987456L, 134002);
          w.d("MicroMsg.GameWebPageContainer", "onLoadFinish, costTime = %d", new Object[] { Long.valueOf(System.currentTimeMillis() - c.b(c.this)) });
          if (localObject1[0] == 0)
          {
            w.d("MicroMsg.GameWebPageContainer", "removeCallback, %d", new Object[] { Integer.valueOf(localObject2.hashCode()) });
            c.this.removeCallbacks(localObject2);
            c.this.post(localObject2);
          }
          GMTrace.o(17985443987456L, 134002);
        }
      };
      w.d("MicroMsg.GameWebPageContainer", "post : %d", new Object[] { Long.valueOf(System.currentTimeMillis() - this.mwE) });
      postDelayed((Runnable)localObject2, 200L);
      GMTrace.o(18018193113088L, 134246);
      return;
      i = 0;
      break;
      label696:
      w.d("MicroMsg.GameWebPageContainer", "createPage begin: " + System.currentTimeMillis());
      paramIntent = new b(this.mww, this);
      w.d("MicroMsg.GameWebPageContainer", "createPage end: " + System.currentTimeMillis());
      break label255;
      label760:
      w.d("MicroMsg.GameWebPageView", "loadUrl, rawUrl = %s, this = %d", new Object[] { localObject1, Integer.valueOf(localObject2.hashCode()) });
      g.paX.a(611L, 1L, 1L, false);
      ((d)localObject2).mwd = ((String)localObject1);
      ((d)localObject2).mxf = new a(((d)localObject2).mww, ((d)localObject2).mwT, ((d)localObject2).mwT.hashCode());
      ((d)localObject2).mxf.sDC = new d.22((d)localObject2);
      ((d)localObject2).mxf.onCreate(((d)localObject2).mwd);
      if (((d)localObject2).mxf.sDx) {
        ((d)localObject2).mwY.setVisibility(0);
      }
      ((d)localObject2).aDi();
    }
    label896:
    addView(paramIntent);
    paramIntent.YL();
    GMTrace.o(18018193113088L, 134246);
  }
  
  public final void cleanup()
  {
    GMTrace.i(18018058895360L, 134245);
    while (!this.mwC.isEmpty()) {
      ((b)this.mwC.pop()).YN();
    }
    if (this.mwB != null) {
      this.mwB.YN();
    }
    GMTrace.o(18018058895360L, 134245);
  }
  
  public final void eU(final boolean paramBoolean)
  {
    GMTrace.i(18018327330816L, 134247);
    if (this.mwC.size() <= 1)
    {
      this.mww.finish();
      GMTrace.o(18018327330816L, 134247);
      return;
    }
    Runnable local4 = new Runnable()
    {
      public final void run()
      {
        GMTrace.i(17986383511552L, 134009);
        b localb1 = (b)c.a(c.this).pop();
        b localb2 = (b)c.a(c.this).peek();
        c.a(c.this, localb2, localb1, paramBoolean);
        GMTrace.o(17986383511552L, 134009);
      }
    };
    if (Looper.getMainLooper().getThread() == Thread.currentThread())
    {
      local4.run();
      GMTrace.o(18018327330816L, 134247);
      return;
    }
    post(local4);
    GMTrace.o(18018327330816L, 134247);
  }
  
  public final boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    GMTrace.i(18018864201728L, 134251);
    b localb = (b)this.mwC.peek();
    if (localb != null)
    {
      if (localb.muE.onKeyDown(paramInt, paramKeyEvent))
      {
        GMTrace.o(18018864201728L, 134251);
        return true;
      }
      if ((paramInt == 4) && (localb.muE.aDt()))
      {
        GMTrace.o(18018864201728L, 134251);
        return true;
      }
    }
    GMTrace.o(18018864201728L, 134251);
    return false;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/game/gamewebview/ui/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */