package com.tencent.mm.plugin.appbrand.jsapi.l;

import android.annotation.TargetApi;
import android.content.Context;
import android.net.Uri;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.kernel.h;
import com.tencent.mm.plugin.appbrand.f;
import com.tencent.mm.plugin.appbrand.p.e;
import com.tencent.mm.plugin.appbrand.p.i;
import com.tencent.mm.plugin.appbrand.page.AppBrandPageView;
import com.tencent.mm.plugin.appbrand.page.AppBrandPageView.c;
import com.tencent.mm.plugin.webview.ui.tools.widget.a.a;
import com.tencent.mm.pluginsdk.ui.tools.s;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.ui.base.MMFalseProgressBar;
import com.tencent.mm.ui.widget.MMWebView;
import com.tencent.xweb.l;
import com.tencent.xweb.m;
import java.io.File;
import org.json.JSONObject;

public final class a
  extends FrameLayout
  implements c.c
{
  private String iqL;
  public MMWebView jeA;
  private MMFalseProgressBar jeB;
  private AppBrandPageView jeC;
  private final c.b jeD;
  private m jeE;
  private com.tencent.xweb.x5.a.a.a.a.b jeF;
  private b jez;
  
  public a(Context paramContext, f paramf, AppBrandPageView paramAppBrandPageView)
  {
    super(paramContext);
    GMTrace.i(19751078199296L, 147157);
    this.jeE = new m()
    {
      public final boolean A(MotionEvent paramAnonymousMotionEvent)
      {
        GMTrace.i(19754970513408L, 147186);
        boolean bool = a.b(a.this).L(paramAnonymousMotionEvent);
        GMTrace.o(19754970513408L, 147186);
        return bool;
      }
      
      public final void XL()
      {
        GMTrace.i(19754433642496L, 147182);
        a.b(a.this).cgl();
        GMTrace.o(19754433642496L, 147182);
      }
      
      public final boolean a(int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3, int paramAnonymousInt4, int paramAnonymousInt5, int paramAnonymousInt6, int paramAnonymousInt7, int paramAnonymousInt8, boolean paramAnonymousBoolean)
      {
        GMTrace.i(19754299424768L, 147181);
        paramAnonymousBoolean = a.b(a.this).b(paramAnonymousInt1, paramAnonymousInt2, paramAnonymousInt3, paramAnonymousInt4, paramAnonymousInt5, paramAnonymousInt6, paramAnonymousInt7, paramAnonymousInt8, paramAnonymousBoolean);
        GMTrace.o(19754299424768L, 147181);
        return paramAnonymousBoolean;
      }
      
      @TargetApi(9)
      public final void b(int paramAnonymousInt1, int paramAnonymousInt2, boolean paramAnonymousBoolean1, boolean paramAnonymousBoolean2)
      {
        GMTrace.i(19754567860224L, 147183);
        a.b(a.this).c(paramAnonymousInt1, paramAnonymousInt2, paramAnonymousBoolean1, paramAnonymousBoolean2);
        GMTrace.o(19754567860224L, 147183);
      }
      
      public final void onScrollChanged(int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3, int paramAnonymousInt4, View paramAnonymousView)
      {
        GMTrace.i(19754702077952L, 147184);
        a.b(a.this).v(paramAnonymousInt1, paramAnonymousInt2, paramAnonymousInt3, paramAnonymousInt4);
        GMTrace.o(19754702077952L, 147184);
      }
      
      public final boolean y(MotionEvent paramAnonymousMotionEvent)
      {
        GMTrace.i(19754165207040L, 147180);
        boolean bool = a.b(a.this).J(paramAnonymousMotionEvent);
        GMTrace.o(19754165207040L, 147180);
        return bool;
      }
      
      public final boolean z(MotionEvent paramAnonymousMotionEvent)
      {
        GMTrace.i(19754836295680L, 147185);
        boolean bool = a.b(a.this).K(paramAnonymousMotionEvent);
        GMTrace.o(19754836295680L, 147185);
        return bool;
      }
    };
    this.jeF = new com.tencent.xweb.x5.a.a.a.a.b()
    {
      public final void computeScroll(View paramAnonymousView)
      {
        GMTrace.i(19756446908416L, 147197);
        a.c(a.this).XL();
        GMTrace.o(19756446908416L, 147197);
      }
      
      public final boolean dispatchTouchEvent(MotionEvent paramAnonymousMotionEvent, View paramAnonymousView)
      {
        GMTrace.i(19755910037504L, 147193);
        boolean bool = a.c(a.this).z(paramAnonymousMotionEvent);
        GMTrace.o(19755910037504L, 147193);
        return bool;
      }
      
      public final boolean onInterceptTouchEvent(MotionEvent paramAnonymousMotionEvent, View paramAnonymousView)
      {
        GMTrace.i(19755775819776L, 147192);
        boolean bool = a.c(a.this).A(paramAnonymousMotionEvent);
        GMTrace.o(19755775819776L, 147192);
        return bool;
      }
      
      public final void onOverScrolled(int paramAnonymousInt1, int paramAnonymousInt2, boolean paramAnonymousBoolean1, boolean paramAnonymousBoolean2, View paramAnonymousView)
      {
        GMTrace.i(19756312690688L, 147196);
        a.c(a.this).b(paramAnonymousInt1, paramAnonymousInt2, paramAnonymousBoolean1, paramAnonymousBoolean2);
        GMTrace.o(19756312690688L, 147196);
      }
      
      public final void onScrollChanged(int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3, int paramAnonymousInt4, View paramAnonymousView)
      {
        GMTrace.i(19756178472960L, 147195);
        a.c(a.this).onScrollChanged(paramAnonymousInt1, paramAnonymousInt2, paramAnonymousInt3, paramAnonymousInt4, paramAnonymousView);
        GMTrace.o(19756178472960L, 147195);
      }
      
      public final boolean onTouchEvent(MotionEvent paramAnonymousMotionEvent, View paramAnonymousView)
      {
        GMTrace.i(19755641602048L, 147191);
        boolean bool = a.c(a.this).y(paramAnonymousMotionEvent);
        GMTrace.o(19755641602048L, 147191);
        return bool;
      }
      
      public final boolean overScrollBy(int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3, int paramAnonymousInt4, int paramAnonymousInt5, int paramAnonymousInt6, int paramAnonymousInt7, int paramAnonymousInt8, boolean paramAnonymousBoolean, View paramAnonymousView)
      {
        GMTrace.i(19756044255232L, 147194);
        paramAnonymousBoolean = a.c(a.this).a(paramAnonymousInt1, paramAnonymousInt2, paramAnonymousInt3, paramAnonymousInt4, paramAnonymousInt5, paramAnonymousInt6, paramAnonymousInt7, paramAnonymousInt8, paramAnonymousBoolean);
        GMTrace.o(19756044255232L, 147194);
        return paramAnonymousBoolean;
      }
    };
    this.iqL = paramf.iqL;
    this.jez = new b();
    this.jez.a(paramf.iqQ);
    this.jeC = paramAppBrandPageView;
    this.jeA = a.a.sBN.cb(paramContext);
    this.jeA.getSettings().coR();
    this.jeA.getSettings().setJavaScriptEnabled(true);
    this.jeA.getSettings().setMediaPlaybackRequiresUserGesture(false);
    this.jeA.getSettings().coT();
    this.jeA.getSettings().setUserAgentString(s.aY(getContext(), this.jeA.getSettings().getUserAgentString()));
    this.jeA.getView().setHorizontalScrollBarEnabled(false);
    this.jeA.getView().setVerticalScrollBarEnabled(false);
    this.jeA.getSettings().setBuiltInZoomControls(true);
    this.jeA.getSettings().setUseWideViewPort(true);
    this.jeA.getSettings().setLoadWithOverviewMode(true);
    this.jeA.getSettings().coL();
    this.jeA.getSettings().coK();
    this.jeA.getSettings().setGeolocationEnabled(true);
    this.jeA.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
    this.jeA.getSettings().coP();
    this.jeA.getSettings().setAppCachePath(getContext().getDir("webviewcache", 0).getAbsolutePath());
    this.jeA.getSettings().coO();
    this.jeA.getSettings().coQ();
    this.jeA.getSettings().setDatabasePath(com.tencent.mm.loader.stub.a.gZO + "databases/");
    this.jeA.wUU = paramAppBrandPageView.jld;
    this.jeA.cgk();
    this.jeA.setWebViewCallbackClient(this.jeE);
    if (this.jeA.isX5Kernel) {
      this.jeA.setWebViewClientExtension(this.jeF);
    }
    addView(this.jeA, new ViewGroup.LayoutParams(-1, -1));
    this.jeB = new MMFalseProgressBar(paramContext);
    this.jeB.setProgressDrawable(com.tencent.mm.bq.a.b(paramContext, p.e.isG));
    addView(this.jeB, new ViewGroup.LayoutParams(-1, com.tencent.mm.bq.a.fromDPToPix(paramContext, 3)));
    this.jeD = ((c.a)h.h(c.a.class)).a(this);
    this.jeC.a(new AppBrandPageView.c()
    {
      public final void onDestroy()
      {
        GMTrace.i(19753494118400L, 147175);
        a.a(a.this).cleanup();
        GMTrace.o(19753494118400L, 147175);
      }
    });
    GMTrace.o(19751078199296L, 147157);
  }
  
  private void XK()
  {
    GMTrace.i(19752151941120L, 147165);
    this.jeA.evaluateJavascript("window.__wxjs_environment = \"miniprogram\";", null);
    GMTrace.o(19752151941120L, 147165);
  }
  
  private void qB(String paramString)
  {
    GMTrace.i(19752286158848L, 147166);
    if (!bg.mZ(paramString))
    {
      paramString = Uri.parse(paramString).getHost();
      if (!bg.mZ(paramString))
      {
        paramString = getContext().getString(p.i.fbt, new Object[] { paramString });
        this.jeC.rx(paramString);
        GMTrace.o(19752286158848L, 147166);
        return;
      }
    }
    this.jeC.rx("");
    GMTrace.o(19752286158848L, 147166);
  }
  
  public final MMWebView XJ()
  {
    GMTrace.i(19751346634752L, 147159);
    MMWebView localMMWebView = this.jeA;
    GMTrace.o(19751346634752L, 147159);
    return localMMWebView;
  }
  
  public final String getAppId()
  {
    GMTrace.i(19751212417024L, 147158);
    String str = this.iqL;
    GMTrace.o(19751212417024L, 147158);
    return str;
  }
  
  public final void n(JSONObject paramJSONObject)
  {
    GMTrace.i(19751615070208L, 147161);
    this.jez.mData = paramJSONObject.toString();
    this.jez.VI();
    GMTrace.o(19751615070208L, 147161);
  }
  
  public final void qA(String paramString)
  {
    GMTrace.i(19752017723392L, 147164);
    XK();
    this.jeB.finish();
    qB(paramString);
    GMTrace.o(19752017723392L, 147164);
  }
  
  public final void qy(String paramString)
  {
    GMTrace.i(19751749287936L, 147162);
    this.jeC.rw(paramString);
    GMTrace.o(19751749287936L, 147162);
  }
  
  public final void qz(String paramString)
  {
    GMTrace.i(19751883505664L, 147163);
    XK();
    this.jeB.start();
    qB(paramString);
    GMTrace.o(19751883505664L, 147163);
  }
  
  public final void runOnUiThread(Runnable paramRunnable)
  {
    GMTrace.i(19751480852480L, 147160);
    post(paramRunnable);
    GMTrace.o(19751480852480L, 147160);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/l/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */