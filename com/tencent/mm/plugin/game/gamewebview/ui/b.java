package com.tencent.mm.plugin.game.gamewebview.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.Window;
import android.widget.FrameLayout;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.game.gamewebview.ipc.GameMMToClientEvent;
import com.tencent.mm.plugin.game.gamewebview.jsapi.GameJsApiInterface;
import com.tencent.mm.plugin.webview.ui.tools.f;
import com.tencent.mm.plugin.webview.ui.tools.game.c.a;
import com.tencent.mm.plugin.webview.ui.tools.game.menu.GameMenuImageButton;
import com.tencent.mm.plugin.webview.ui.tools.widget.MovingImageButton;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.widget.SwipeBackLayout;
import com.tencent.mm.ui.widget.SwipeBackLayout.a;
import com.tencent.mm.ui.widget.j.a;
import com.tencent.xweb.h;

public final class b
  extends SwipeBackLayout
  implements SwipeBackLayout.a, j.a
{
  private boolean jkg;
  boolean jkh;
  d muE;
  protected GameWebViewUI mww;
  c mwx;
  boolean mwy;
  Bundle un;
  
  public b(GameWebViewUI paramGameWebViewUI, c paramc)
  {
    super(paramGameWebViewUI);
    GMTrace.i(19308159696896L, 143857);
    this.un = new Bundle();
    this.jkh = false;
    this.mww = paramGameWebViewUI;
    this.mwx = paramc;
    setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
    init();
    this.wVG = false;
    mz(true);
    addView(aCZ());
    this.HB = aCZ();
    this.wVL = this;
    GMTrace.o(19308159696896L, 143857);
  }
  
  public final void U(float paramFloat)
  {
    GMTrace.i(18021816991744L, 134273);
    w.d("MicroMsg.GameWebPage", "onSwipe， " + hashCode());
    if (this.jkg)
    {
      if (paramFloat == 1.0F) {
        break label75;
      }
      setVisibility(0);
    }
    while (Float.compare(1.0F, paramFloat) <= 0)
    {
      com.tencent.mm.ui.tools.j.n(aCZ(), 0.0F);
      GMTrace.o(18021816991744L, 134273);
      return;
      label75:
      hide();
    }
    float f = aCZ().getWidth() / 4;
    com.tencent.mm.ui.tools.j.n(aCZ(), f * (1.0F - paramFloat) * -1.0F);
    GMTrace.o(18021816991744L, 134273);
  }
  
  public final void YL()
  {
    GMTrace.i(18021011685376L, 134267);
    w.d("MicroMsg.GameWebPage", "onPageForeground: %s", new Object[] { bg.mY(this.muE.mwd) });
    com.tencent.mm.ui.widget.j.b(this);
    this.wSc = false;
    this.mEnable = aDa();
    this.jkg = false;
    setVisibility(0);
    if (this.un.getBoolean("transparent_page", false))
    {
      localObject = this.muE;
      ((d)localObject).mwT.setBackgroundColor(0);
      ((d)localObject).mwR.sqY = true;
      ((d)localObject).mwR.iHU = false;
      ((d)localObject).mwR.jp(true);
      ((d)localObject).mwR.xv(0);
    }
    this.mww.ox(this.un.getInt("screen_orientation", -1));
    Object localObject = this.mww;
    if (isFullScreen())
    {
      ((GameWebViewUI)localObject).getWindow().setFlags(1024, 1024);
      ((GameWebViewUI)localObject).getWindow().getDecorView().setSystemUiVisibility(5894);
      localObject = this.muE;
      boolean bool = isFullScreen();
      w.d("MicroMsg.GameWebPageView", "setFullScreen, rawUrl = %s, fullscreen = %b, mHVGameAppId = %s", new Object[] { ((d)localObject).mwd, Boolean.valueOf(bool), ((d)localObject).mxB });
      ((d)localObject).jlg = bool;
      if (!bool) {
        break label366;
      }
      ((d)localObject).os(8);
      if (bg.mZ(((d)localObject).mxB)) {
        break label355;
      }
      if (((d)localObject).mwZ == null)
      {
        ((d)localObject).mwZ = new GameMenuImageButton(((d)localObject).mww);
        ((d)localObject).mwZ.a((FrameLayout)localObject, new d.30((d)localObject));
      }
      ((d)localObject).mwX.setVisibility(8);
    }
    for (;;)
    {
      localObject = this.muE;
      ((d)localObject).aDr();
      ((d)localObject).yQ("onResume");
      ((d)localObject).yR("onResume");
      ((d)localObject).mwM.mwj = System.currentTimeMillis();
      GMTrace.o(18021011685376L, 134267);
      return;
      ((GameWebViewUI)localObject).getWindow().clearFlags(1024);
      ((GameWebViewUI)localObject).getWindow().getDecorView().setSystemUiVisibility(0);
      break;
      label355:
      ((d)localObject).mwX.setVisibility(0);
      continue;
      label366:
      ((d)localObject).os(0);
      ((d)localObject).mwX.setVisibility(8);
    }
  }
  
  protected final void YN()
  {
    GMTrace.i(18021280120832L, 134269);
    w.d("MicroMsg.GameWebPage", "onPageDestroy: %s", new Object[] { this.muE.aDp() });
    d locald = this.muE;
    w.d("MicroMsg.GameWebPageView", "onPageDestroy");
    locald.kVb = true;
    if (locald.mxz != null) {
      locald.mxz.cancel();
    }
    if (locald.mxf != null) {
      locald.mxf.onDestroy();
    }
    com.tencent.mm.plugin.game.gamewebview.d.a locala = locald.mwM;
    long l = System.currentTimeMillis() - locala.mwi;
    w.d("MicroMsg.GameWebViewReportManager", "totalTime = %d, visitTime = %d, loadSuccess = %d", new Object[] { Long.valueOf(l), Long.valueOf(locala.mwk), Integer.valueOf(locala.mwg) });
    locala.a(locala.muE.aDp(), 4, l, locala.mwg, 0);
    locala.a(locala.muE.aDp(), 1, locala.mwk, locala.mwg, 0);
    locald.yQ("onDestroy");
    locald.mxC.sxf.onDestroy();
    w.d("MicroMsg.GameWebPageView", "destroy");
    GameMMToClientEvent.oo(locald.hashCode());
    com.tencent.mm.plugin.game.gamewebview.model.a.b(locald);
    locald.mwR.release();
    if (locald.mxc != null)
    {
      locald.mxc.detach();
      locald.mxc = null;
    }
    locald.mwS.iLD.getLooper().quit();
    locald.mwT.setWebChromeClient(null);
    locald.mwT.setWebChromeClient(null);
    locald.mwT.setOnTouchListener(null);
    locald.mwT.setOnLongClickListener(null);
    try
    {
      locald.mwT.destroy();
      locald.mwT = null;
      System.gc();
      GMTrace.o(18021280120832L, 134269);
      return;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        w.e("MicroMsg.GameWebPageView", "destroy, webview destroy, excepiton: " + localException.getMessage());
      }
    }
  }
  
  public final boolean YV()
  {
    GMTrace.i(18022085427200L, 134275);
    GMTrace.o(18022085427200L, 134275);
    return false;
  }
  
  public final void YW()
  {
    GMTrace.i(18022219644928L, 134276);
    this.mwx.eU(true);
    GMTrace.o(18022219644928L, 134276);
  }
  
  public final void YX()
  {
    GMTrace.i(18022353862656L, 134277);
    this.jkh = true;
    GMTrace.o(18022353862656L, 134277);
  }
  
  public final d aCZ()
  {
    GMTrace.i(18020609032192L, 134264);
    if (this.muE == null) {
      this.muE = new d(this);
    }
    d locald = this.muE;
    GMTrace.o(18020609032192L, 134264);
    return locald;
  }
  
  public final boolean aDa()
  {
    GMTrace.i(18021548556288L, 134271);
    if ((!this.un.getBoolean("disable_swipe_back", false)) && (!this.un.getBoolean("transparent_page", false)) && (!this.mwy))
    {
      if (this.mwx.mwC.size() > 1) {}
      for (int i = 1; i != 0; i = 0)
      {
        GMTrace.o(18021548556288L, 134271);
        return true;
      }
    }
    GMTrace.o(18021548556288L, 134271);
    return false;
  }
  
  public final void aDb()
  {
    GMTrace.i(18022890733568L, 134281);
    this.mwy = false;
    this.mEnable = aDa();
    GMTrace.o(18022890733568L, 134281);
  }
  
  public final boolean aDc()
  {
    GMTrace.i(18023024951296L, 134282);
    boolean bool = this.un.getBoolean("is_from_keep_top", false);
    GMTrace.o(18023024951296L, 134282);
    return bool;
  }
  
  public final void aDd()
  {
    GMTrace.i(18023159169024L, 134283);
    this.mwx.eU(true);
    GMTrace.o(18023159169024L, 134283);
  }
  
  public final void d(boolean paramBoolean, int paramInt)
  {
    long l = 120L;
    GMTrace.i(18021951209472L, 134274);
    w.d("MicroMsg.GameWebPage", "onSettle(%d), %b, %d ", new Object[] { Integer.valueOf(hashCode()), Boolean.valueOf(paramBoolean), Integer.valueOf(paramInt) });
    if (paramBoolean)
    {
      locald = aCZ();
      if (paramInt > 0) {}
      for (;;)
      {
        com.tencent.mm.ui.tools.j.a(locald, l, 0.0F, null);
        GMTrace.o(18021951209472L, 134274);
        return;
        l = 240L;
      }
    }
    d locald = aCZ();
    if (paramInt > 0) {}
    for (;;)
    {
      com.tencent.mm.ui.tools.j.a(locald, l, aCZ().getWidth() * -1 / 4, null);
      GMTrace.o(18021951209472L, 134274);
      return;
      l = 240L;
    }
  }
  
  public final void eT(boolean paramBoolean)
  {
    GMTrace.i(18021145903104L, 134268);
    w.d("MicroMsg.GameWebPage", "onPageBackground: %s", new Object[] { bg.mY(this.muE.mwd) });
    if (paramBoolean) {
      com.tencent.mm.ui.widget.j.a(this);
    }
    this.jkg = true;
    d locald = this.muE;
    com.tencent.mm.plugin.game.gamewebview.d.a locala = locald.mwM;
    locala.mwk += System.currentTimeMillis() - locala.mwj;
    locald.mxC.sxf.onPause();
    locald.yQ("onPause");
    locald.yR("onPause");
    locald.jmk.onHideCustomView();
    GMTrace.o(18021145903104L, 134268);
  }
  
  public final void hide()
  {
    GMTrace.i(18021682774016L, 134272);
    if (this.jkg)
    {
      w.d("MicroMsg.GameWebPage", "hide, %d", new Object[] { Integer.valueOf(hashCode()) });
      setVisibility(4);
    }
    GMTrace.o(18021682774016L, 134272);
  }
  
  public final boolean isFullScreen()
  {
    GMTrace.i(18023293386752L, 134284);
    boolean bool = this.un.getBoolean("show_full_screen", false);
    GMTrace.o(18023293386752L, 134284);
    return bool;
  }
  
  public final void onCancel()
  {
    GMTrace.i(18022488080384L, 134278);
    this.jkh = false;
    GMTrace.o(18022488080384L, 134278);
  }
  
  public final void or(int paramInt)
  {
    GMTrace.i(18955569725440L, 141230);
    this.un.putInt("screen_orientation", paramInt);
    this.mww.ox(paramInt);
    GMTrace.o(18955569725440L, 141230);
  }
  
  public final void v(final Runnable paramRunnable)
  {
    GMTrace.i(18021414338560L, 134270);
    ObjectAnimator localObjectAnimator = ObjectAnimator.ofFloat(this, "translationX", new float[] { com.tencent.mm.plugin.game.d.c.getScreenWidth(this.mww), 0.0F });
    localObjectAnimator.setDuration(250L);
    localObjectAnimator.addListener(new AnimatorListenerAdapter()
    {
      public final void onAnimationEnd(Animator paramAnonymousAnimator)
      {
        GMTrace.i(18023561822208L, 134286);
        if (paramRunnable != null) {
          paramRunnable.run();
        }
        GMTrace.o(18023561822208L, 134286);
      }
    });
    localObjectAnimator.start();
    GMTrace.o(18021414338560L, 134270);
  }
  
  public static abstract interface a
  {
    public abstract void aDe();
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/game/gamewebview/ui/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */