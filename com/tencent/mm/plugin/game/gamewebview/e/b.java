package com.tencent.mm.plugin.game.gamewebview.e;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.WindowManager;
import android.webkit.ConsoleMessage;
import android.webkit.GeolocationPermissions.Callback;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient.CustomViewCallback;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.game.gamewebview.ui.f;
import com.tencent.mm.plugin.webview.ui.tools.a;
import com.tencent.mm.pluginsdk.ui.tools.s;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.am;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.widget.MMWebView;
import com.tencent.xweb.WebView;
import com.tencent.xweb.h;
import com.tencent.xweb.h.a;
import com.tencent.xweb.k;
import com.tencent.xweb.l;
import com.tencent.xweb.m;
import com.tencent.xweb.n;
import java.io.File;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.LinkedList;
import org.json.JSONObject;

public final class b
  extends MMWebView
{
  private boolean irZ;
  private Context mContext;
  private com.tencent.mm.plugin.game.gamewebview.ui.d muf;
  private com.tencent.mm.plugin.game.gamewebview.model.g myE;
  private n myF;
  private h myG;
  private m myH;
  public com.tencent.xweb.x5.a.a.a.a.b myI;
  private c myJ;
  private boolean myK;
  private b myL;
  private c myM;
  private a myN;
  private LinkedList<String> myO;
  private com.tencent.xweb.x5.a.a.a.a.b myP;
  
  public b(Context paramContext, com.tencent.mm.plugin.game.gamewebview.ui.d paramd)
  {
    super(paramContext);
    GMTrace.i(16967268302848L, 126416);
    this.myE = new com.tencent.mm.plugin.game.gamewebview.model.g();
    this.myL = new b();
    this.myM = new c();
    this.myN = new a();
    this.myO = new LinkedList();
    this.myP = new com.tencent.xweb.x5.a.a.a.a.b()
    {
      public final void computeScroll(View paramAnonymousView)
      {
        GMTrace.i(17983162286080L, 133985);
        b.l(b.this).myQ.cgl();
        GMTrace.o(17983162286080L, 133985);
      }
      
      public final boolean dispatchTouchEvent(MotionEvent paramAnonymousMotionEvent, View paramAnonymousView)
      {
        GMTrace.i(17982625415168L, 133981);
        boolean bool = b.l(b.this).z(paramAnonymousMotionEvent);
        GMTrace.o(17982625415168L, 133981);
        return bool;
      }
      
      public final boolean onInterceptTouchEvent(MotionEvent paramAnonymousMotionEvent, View paramAnonymousView)
      {
        GMTrace.i(17982491197440L, 133980);
        boolean bool = b.l(b.this).A(paramAnonymousMotionEvent);
        GMTrace.o(17982491197440L, 133980);
        return bool;
      }
      
      public final Object onMiscCallBack(String paramAnonymousString, Bundle paramAnonymousBundle)
      {
        boolean bool = false;
        GMTrace.i(17982222761984L, 133978);
        if (paramAnonymousBundle == null) {
          bool = true;
        }
        w.i("MicroMsg.GameWebView", "method = %s, bundler == null ? %b", new Object[] { paramAnonymousString, Boolean.valueOf(bool) });
        if (paramAnonymousString.equals("getShareUrl"))
        {
          paramAnonymousString = b.j(b.this).KZ();
          GMTrace.o(17982222761984L, 133978);
          return paramAnonymousString;
        }
        if (b.k(b.this) != null)
        {
          paramAnonymousString = b.k(b.this).onMiscCallBack(paramAnonymousString, paramAnonymousBundle);
          GMTrace.o(17982222761984L, 133978);
          return paramAnonymousString;
        }
        GMTrace.o(17982222761984L, 133978);
        return null;
      }
      
      public final void onOverScrolled(int paramAnonymousInt1, int paramAnonymousInt2, boolean paramAnonymousBoolean1, boolean paramAnonymousBoolean2, View paramAnonymousView)
      {
        GMTrace.i(17983028068352L, 133984);
        b.l(b.this).b(paramAnonymousInt1, paramAnonymousInt2, paramAnonymousBoolean1, paramAnonymousBoolean2);
        GMTrace.o(17983028068352L, 133984);
      }
      
      public final void onScrollChanged(int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3, int paramAnonymousInt4, View paramAnonymousView)
      {
        GMTrace.i(17982893850624L, 133983);
        b.l(b.this).onScrollChanged(paramAnonymousInt1, paramAnonymousInt2, paramAnonymousInt3, paramAnonymousInt4, paramAnonymousView);
        GMTrace.o(17982893850624L, 133983);
      }
      
      public final boolean onTouchEvent(MotionEvent paramAnonymousMotionEvent, View paramAnonymousView)
      {
        GMTrace.i(17982356979712L, 133979);
        boolean bool = b.l(b.this).y(paramAnonymousMotionEvent);
        GMTrace.o(17982356979712L, 133979);
        return bool;
      }
      
      public final boolean overScrollBy(int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3, int paramAnonymousInt4, int paramAnonymousInt5, int paramAnonymousInt6, int paramAnonymousInt7, int paramAnonymousInt8, boolean paramAnonymousBoolean, View paramAnonymousView)
      {
        GMTrace.i(17982759632896L, 133982);
        paramAnonymousBoolean = b.l(b.this).a(paramAnonymousInt1, paramAnonymousInt2, paramAnonymousInt3, paramAnonymousInt4, paramAnonymousInt5, paramAnonymousInt6, paramAnonymousInt7, paramAnonymousInt8, paramAnonymousBoolean);
        GMTrace.o(17982759632896L, 133982);
        return paramAnonymousBoolean;
      }
    };
    this.mContext = paramContext;
    this.muf = paramd;
    this.myJ = new c(this.muf);
    fH(this.mContext);
    this.gJV = true;
    boolean bool1;
    if (getX5WebViewExtension() != null) {
      bool1 = true;
    }
    for (;;)
    {
      this.isX5Kernel = bool1;
      w.i("MicroMsg.GameWebView", "isX5Kernel = " + this.isX5Kernel);
      if ((!this.isX5Kernel) && (!com.tencent.mm.compatible.util.d.et(19))) {}
      try
      {
        paramContext = new com.tencent.mm.compatible.loader.c(this, "mSysWebView", null).get();
        w.d("MicroMsg.GameWebView", "tryInterruptAwaitingWebCoreThread, mSysWebView = %s", new Object[] { paramContext });
        paramContext = new com.tencent.mm.compatible.loader.c(paramContext, "mProvider", null).get();
        w.d("MicroMsg.GameWebView", "tryInterruptAwaitingWebCoreThread, mWebViewClassic = %s", new Object[] { paramContext });
        paramContext = new com.tencent.mm.compatible.loader.c(paramContext, "mWebViewCore", null).get();
        w.d("MicroMsg.GameWebView", "tryInterruptAwaitingWebCoreThread, mWebViewCore = %s", new Object[] { paramContext });
        paramContext = new com.tencent.mm.compatible.loader.c(paramContext, "sWebCoreHandler", null).get();
        w.d("MicroMsg.GameWebView", "tryInterruptAwaitingWebCoreThread, sWebCoreHandler = %s", new Object[] { paramContext });
        paramContext = new com.tencent.mm.compatible.loader.c(paramContext, "mLooper", null).get();
        w.d("MicroMsg.GameWebView", "tryInterruptAwaitingWebCoreThread, mLooper = %s", new Object[] { paramContext });
        paramContext = new com.tencent.mm.compatible.loader.c(paramContext, "mThread", null).get();
        w.d("MicroMsg.GameWebView", "tryInterruptAwaitingWebCoreThread, mThread = %s", new Object[] { paramContext });
        if ((paramContext instanceof Thread))
        {
          paramContext = (Thread)paramContext;
          w.i("MicroMsg.GameWebView", "tryInterruptAwaitingWebCoreThread, webCoreThread.getState = %s", new Object[] { paramContext.getState() });
          if (paramContext.getState() == Thread.State.WAITING) {
            paramContext.interrupt();
          }
        }
        boolean bool3 = true;
        boolean bool2 = true;
        bool1 = true;
        if ((this.mContext instanceof Activity))
        {
          bool3 = ((Activity)this.mContext).getIntent().getBooleanExtra("usePlugin", true);
          bool2 = ((Activity)this.mContext).getIntent().getBooleanExtra("zoom", true);
          bool1 = ((Activity)this.mContext).getIntent().getBooleanExtra("zoom", true);
        }
        getSettings().coR();
        getSettings().setJavaScriptEnabled(bool1);
        getSettings().setPluginsEnabled(bool3);
        getSettings().setBuiltInZoomControls(bool2);
        getSettings().setMediaPlaybackRequiresUserGesture(true);
        getSettings().coT();
        getSettings().setUserAgentString(s.aY(getContext(), getSettings().getUserAgentString()));
        getSettings().setUseWideViewPort(true);
        getSettings().setLoadWithOverviewMode(true);
        getSettings().coL();
        getSettings().coK();
        getSettings().setGeolocationEnabled(true);
        getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
        getSettings().coT();
        getSettings().coP();
        getSettings().setAppCachePath(this.mContext.getDir("webviewcache", 0).getAbsolutePath());
        getSettings().coO();
        getSettings().coQ();
        getSettings().setDatabasePath(com.tencent.mm.compatible.util.e.gZO + "databases/");
        com.tencent.xweb.b.coE().coF();
        com.tencent.xweb.b.coE().c(this);
        getView().setHorizontalScrollBarEnabled(false);
        getView().setVerticalScrollBarEnabled(false);
        paramContext = (WindowManager)ab.getContext().getSystemService("window");
        try
        {
          localField = WebView.class.getDeclaredField("mWebViewCore").getType().getDeclaredField("mBrowserFrame").getType().getDeclaredField("sConfigCallback");
          localField.setAccessible(true);
          paramd = localField.get(null);
          if (paramd != null) {
            break label952;
          }
        }
        catch (Exception paramContext)
        {
          Field localField;
          for (;;) {}
          com.tencent.mm.plugin.report.service.g.paX.a(64L, 0L, 1L, false);
          GMTrace.o(16967268302848L, 126416);
        }
        super.setWebChromeClient(this.myN);
        super.setWebViewClient(this.myM);
        if (this.isX5Kernel)
        {
          super.setWebViewCallbackClient(this.myL);
          super.setWebViewClientExtension(this.myP);
        }
        w.i("MicroMsg.GameWebView", "Is the current broswer kernel X5, " + this.isX5Kernel);
        setBackgroundColor(-1);
        setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        requestFocus(130);
        paramContext = com.tencent.mm.plugin.game.gamewebview.a.d.U(this.mContext, getSettings().getUserAgentString());
        w.i("MicroMsg.GameWebView", "UserAgent = " + paramContext);
        getSettings().setUserAgentString(paramContext);
        com.tencent.mm.plugin.game.gamewebview.c.a.mwa = paramContext;
        cgj();
        if (getX5WebViewExtension() != null)
        {
          com.tencent.mm.pluginsdk.ui.tools.j.nK(7);
          com.tencent.mm.plugin.report.service.g.paX.a(64, 64, 1, 0, 1, 1, false);
          GMTrace.o(16967268302848L, 126416);
          return;
          bool1 = false;
        }
      }
      catch (Exception paramContext)
      {
        for (;;)
        {
          w.e("MicroMsg.GameWebView", "tryInterruptAwaitingWebCoreThread, exception = %s", new Object[] { paramContext });
          continue;
          label952:
          localField = localField.getType().getDeclaredField("mWindowManager");
          localField.setAccessible(true);
          localField.set(paramd, paramContext);
        }
      }
    }
  }
  
  public final void cm(String paramString1, String paramString2)
  {
    GMTrace.i(16968073609216L, 126422);
    String str = paramString2;
    if (bg.mZ(paramString2)) {
      str = "{}";
    }
    w.d("MicroMsg.GameWebView", "dispatch, event: %s, data size: %d", new Object[] { paramString1, Integer.valueOf(str.length()) });
    paramString2 = new HashMap();
    paramString2.put("nativeTime", Long.valueOf(System.currentTimeMillis()));
    paramString1 = String.format("typeof WeixinJSBridge !== 'undefined' && WeixinJSBridge.subscribeHandler(\"%s\", %s, undefined, %s)", new Object[] { paramString1, str, new JSONObject(paramString2).toString() });
    if (!this.irZ)
    {
      w.d("MicroMsg.GameWebView", "not page finish, add js to queue, %s", new Object[] { paramString1 });
      this.myO.add(paramString1);
      GMTrace.o(16968073609216L, 126422);
      return;
    }
    evaluateJavascript(paramString1, null);
    GMTrace.o(16968073609216L, 126422);
  }
  
  public final void destroy()
  {
    GMTrace.i(16967402520576L, 126417);
    if (com.tencent.xweb.c.in(ab.getContext()) != null)
    {
      w.i("MicroMsg.GameWebView", "now force sync the cookie between ram and db");
      com.tencent.xweb.c.sync();
    }
    if (Build.VERSION.SDK_INT >= 11)
    {
      removeJavascriptInterface("MicroMsg");
      removeJavascriptInterface("JsApi");
    }
    try
    {
      super.setWebChromeClient(null);
      super.setWebChromeClient(null);
      super.setOnTouchListener(null);
      super.setOnLongClickListener(null);
      setVisibility(8);
      removeAllViews();
      clearView();
      super.destroy();
      GMTrace.o(16967402520576L, 126417);
      return;
    }
    catch (Exception localException)
    {
      w.printErrStackTrace("MicroMsg.GameWebView", localException, "", new Object[0]);
      GMTrace.o(16967402520576L, 126417);
    }
  }
  
  public final void eY(boolean paramBoolean)
  {
    GMTrace.i(16967939391488L, 126421);
    try
    {
      String str1 = bg.convertStreamToString(getContext().getAssets().open("game_jsapi/jsbridge.js"));
      if (str1 == null)
      {
        w.e("MicroMsg.GameWebView", "injectJavaScript fail, jsContent is null");
        com.tencent.mm.plugin.report.service.g.paX.a(609L, 4L, 1L, false);
        GMTrace.o(16967939391488L, 126421);
        return;
      }
    }
    catch (Exception localException)
    {
      String str2;
      for (;;)
      {
        w.printErrStackTrace("MicroMsg.GameWebView", localException, "", new Object[0]);
        str2 = null;
      }
      evaluateJavascript("javascript:" + str2, new ValueCallback() {});
      w.i("MicroMsg.GameWebView", "injectJavaScript done");
      com.tencent.mm.plugin.report.service.g.paX.a(609L, 1L, 1L, false);
      if (paramBoolean) {
        cm("sys:init", "");
      }
      GMTrace.o(16967939391488L, 126421);
    }
  }
  
  public final void evaluateJavascript(String paramString, ValueCallback<String> paramValueCallback)
  {
    GMTrace.i(19284134723584L, 143678);
    super.evaluateJavascript(paramString, paramValueCallback);
    GMTrace.o(19284134723584L, 143678);
  }
  
  public final void setWebChromeClient(h paramh)
  {
    GMTrace.i(19283866288128L, 143676);
    this.myG = paramh;
    GMTrace.o(19283866288128L, 143676);
  }
  
  public final void setWebViewCallbackClient(m paramm)
  {
    GMTrace.i(19284000505856L, 143677);
    this.myH = paramm;
    GMTrace.o(19284000505856L, 143677);
  }
  
  public final void setWebViewClient(n paramn)
  {
    GMTrace.i(19283732070400L, 143675);
    this.myF = paramn;
    GMTrace.o(19283732070400L, 143675);
  }
  
  @SuppressLint({"DefaultLocale"})
  public final void v(int paramInt, String paramString)
  {
    GMTrace.i(16968207826944L, 126423);
    String str = paramString;
    if (bg.mZ(paramString)) {
      str = "{}";
    }
    w.d("MicroMsg.GameWebView", "callback, callbackId: %d, data size: %d", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(str.length()) });
    evaluateJavascript(String.format("typeof WeixinJSBridge !== 'undefined' && WeixinJSBridge.invokeCallbackHandler(%d, %s)", new Object[] { Integer.valueOf(paramInt), str }), null);
    GMTrace.o(16968207826944L, 126423);
  }
  
  private final class a
    extends h
  {
    public a()
    {
      GMTrace.i(16971294834688L, 126446);
      GMTrace.o(16971294834688L, 126446);
    }
    
    public final void a(WebView paramWebView, int paramInt)
    {
      GMTrace.i(19281181933568L, 143656);
      if (b.m(b.this) != null) {
        b.m(b.this).a(paramWebView, paramInt);
      }
      GMTrace.o(19281181933568L, 143656);
    }
    
    public final boolean a(WebView paramWebView, ValueCallback<Uri[]> paramValueCallback, h.a parama)
    {
      GMTrace.i(19281718804480L, 143660);
      if (b.m(b.this) != null)
      {
        bool = b.m(b.this).a(paramWebView, paramValueCallback, parama);
        GMTrace.o(19281718804480L, 143660);
        return bool;
      }
      boolean bool = super.a(paramWebView, paramValueCallback, parama);
      GMTrace.o(19281718804480L, 143660);
      return bool;
    }
    
    public final boolean a(WebView paramWebView, String paramString1, String paramString2, com.tencent.xweb.e parame)
    {
      GMTrace.i(19282121457664L, 143663);
      if (b.m(b.this) != null)
      {
        bool = b.m(b.this).a(paramWebView, paramString1, paramString2, parame);
        GMTrace.o(19282121457664L, 143663);
        return bool;
      }
      boolean bool = super.a(paramWebView, paramString1, paramString2, parame);
      GMTrace.o(19282121457664L, 143663);
      return bool;
    }
    
    public final boolean a(WebView paramWebView, String paramString1, String paramString2, String paramString3, com.tencent.xweb.d paramd)
    {
      GMTrace.i(19281987239936L, 143662);
      if (b.m(b.this) != null)
      {
        bool = b.m(b.this).a(paramWebView, paramString1, paramString2, paramString3, paramd);
        GMTrace.o(19281987239936L, 143662);
        return bool;
      }
      boolean bool = super.a(paramWebView, paramString1, paramString2, paramString3, paramd);
      GMTrace.o(19281987239936L, 143662);
      return bool;
    }
    
    public final boolean b(WebView paramWebView, String paramString1, String paramString2, com.tencent.xweb.e parame)
    {
      GMTrace.i(19281853022208L, 143661);
      if (b.m(b.this) != null)
      {
        bool = b.m(b.this).b(paramWebView, paramString1, paramString2, parame);
        GMTrace.o(19281853022208L, 143661);
        return bool;
      }
      boolean bool = super.b(paramWebView, paramString1, paramString2, parame);
      GMTrace.o(19281853022208L, 143661);
      return bool;
    }
    
    public final void c(WebView paramWebView, String paramString)
    {
      GMTrace.i(19281316151296L, 143657);
      w.i("MicroMsg.GameWebView", "onReceivedTitle, title = %s", new Object[] { paramString });
      if (b.m(b.this) != null) {
        b.m(b.this).c(paramWebView, paramString);
      }
      GMTrace.o(19281316151296L, 143657);
    }
    
    public final boolean onConsoleMessage(ConsoleMessage paramConsoleMessage)
    {
      GMTrace.i(19282255675392L, 143664);
      if (paramConsoleMessage != null) {}
      for (String str = paramConsoleMessage.message();; str = null)
      {
        w.i("MicroMsg.GameWebView", "onConsoleMessage : %s", new Object[] { str });
        if (b.m(b.this) == null) {
          break;
        }
        bool = b.m(b.this).onConsoleMessage(paramConsoleMessage);
        GMTrace.o(19282255675392L, 143664);
        return bool;
      }
      boolean bool = super.onConsoleMessage(paramConsoleMessage);
      GMTrace.o(19282255675392L, 143664);
      return bool;
    }
    
    public final void onGeolocationPermissionsShowPrompt(String paramString, GeolocationPermissions.Callback paramCallback)
    {
      GMTrace.i(19281584586752L, 143659);
      w.i("MicroMsg.GameWebView", "onGeolocationPermissionsShowPrompt, origin = %s", new Object[] { paramString });
      if (b.m(b.this) != null) {
        b.m(b.this).onGeolocationPermissionsShowPrompt(paramString, paramCallback);
      }
      GMTrace.o(19281584586752L, 143659);
    }
    
    public final void onHideCustomView()
    {
      GMTrace.i(16971831705600L, 126450);
      w.i("MicroMsg.GameWebView", "onHideCustomView, sdk int = " + Build.VERSION.SDK_INT);
      if (b.m(b.this) != null) {
        b.m(b.this).onHideCustomView();
      }
      GMTrace.o(16971831705600L, 126450);
    }
    
    public final void onShowCustomView(View paramView, WebChromeClient.CustomViewCallback paramCustomViewCallback)
    {
      GMTrace.i(19281450369024L, 143658);
      w.i("MicroMsg.GameWebView", "onShowCustomView, sdk int = " + Build.VERSION.SDK_INT);
      if (b.m(b.this) != null) {
        b.m(b.this).onShowCustomView(paramView, paramCustomViewCallback);
      }
      GMTrace.o(19281450369024L, 143658);
    }
  }
  
  private final class b
    extends f
  {
    public b()
    {
      GMTrace.i(16970221092864L, 126438);
      GMTrace.o(16970221092864L, 126438);
    }
    
    public final boolean A(MotionEvent paramMotionEvent)
    {
      GMTrace.i(16971026399232L, 126444);
      boolean bool = b.this.L(paramMotionEvent);
      GMTrace.o(16971026399232L, 126444);
      return bool;
    }
    
    public final void XL()
    {
      GMTrace.i(16970757963776L, 126442);
      b.this.cgl();
      GMTrace.o(16970757963776L, 126442);
    }
    
    public final boolean a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, boolean paramBoolean)
    {
      GMTrace.i(16970489528320L, 126440);
      paramBoolean = b.this.b(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6, paramInt7, paramInt8, paramBoolean);
      GMTrace.o(16970489528320L, 126440);
      return paramBoolean;
    }
    
    @TargetApi(9)
    public final void b(int paramInt1, int paramInt2, boolean paramBoolean1, boolean paramBoolean2)
    {
      GMTrace.i(16970892181504L, 126443);
      b.this.c(paramInt1, paramInt2, paramBoolean1, paramBoolean2);
      GMTrace.o(16970892181504L, 126443);
    }
    
    public final void onScrollChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4, View paramView)
    {
      GMTrace.i(16971160616960L, 126445);
      b.this.v(paramInt1, paramInt2, paramInt3, paramInt4);
      if (b.i(b.this) != null) {
        b.i(b.this).onScrollChanged(paramInt1, paramInt2, paramInt3, paramInt4, paramView);
      }
      GMTrace.o(16971160616960L, 126445);
    }
    
    public final boolean y(MotionEvent paramMotionEvent)
    {
      GMTrace.i(16970355310592L, 126439);
      boolean bool = b.this.J(paramMotionEvent);
      GMTrace.o(16970355310592L, 126439);
      return bool;
    }
    
    public final boolean z(MotionEvent paramMotionEvent)
    {
      GMTrace.i(16970623746048L, 126441);
      boolean bool = b.this.K(paramMotionEvent);
      GMTrace.o(16970623746048L, 126441);
      return bool;
    }
  }
  
  private final class c
    extends n
  {
    public c()
    {
      GMTrace.i(16972771229696L, 126457);
      GMTrace.o(16972771229696L, 126457);
    }
    
    public final k a(WebView paramWebView, com.tencent.xweb.j paramj)
    {
      GMTrace.i(19283463634944L, 143673);
      w.i("MicroMsg.GameWebView", "shouldInterceptRequest, url = %s, method = %s, isForMainFrame = %b", new Object[] { paramj.getUrl(), paramj.getMethod(), Boolean.valueOf(paramj.isForMainFrame()) });
      if ((paramj.getUrl() == null) || (bg.mZ(paramj.getUrl().toString())))
      {
        paramWebView = super.a(paramWebView, paramj);
        GMTrace.o(19283463634944L, 143673);
        return paramWebView;
      }
      b.h(b.this);
      k localk = com.tencent.mm.plugin.game.gamewebview.model.g.yO(paramj.getUrl().toString());
      if (localk != null)
      {
        GMTrace.o(19283463634944L, 143673);
        return localk;
      }
      if (b.b(b.this) != null)
      {
        paramWebView = b.b(b.this).a(paramWebView, paramj);
        GMTrace.o(19283463634944L, 143673);
        return paramWebView;
      }
      paramWebView = super.a(paramWebView, paramj);
      GMTrace.o(19283463634944L, 143673);
      return paramWebView;
    }
    
    public final k a(WebView paramWebView, com.tencent.xweb.j paramj, Bundle paramBundle)
    {
      GMTrace.i(19283597852672L, 143674);
      w.i("MicroMsg.GameWebView", "shouldInterceptRequest, url = %s, method = %s, isForMainFrame = %b", new Object[] { paramj.getUrl(), paramj.getMethod(), Boolean.valueOf(paramj.isForMainFrame()) });
      if ((paramj.getUrl() == null) || (bg.mZ(paramj.getUrl().toString())))
      {
        paramWebView = super.a(paramWebView, paramj);
        GMTrace.o(19283597852672L, 143674);
        return paramWebView;
      }
      b.h(b.this);
      k localk = com.tencent.mm.plugin.game.gamewebview.model.g.yO(paramj.getUrl().toString());
      if (localk != null)
      {
        GMTrace.o(19283597852672L, 143674);
        return localk;
      }
      if (b.b(b.this) != null)
      {
        paramWebView = b.b(b.this).a(paramWebView, paramj, paramBundle);
        GMTrace.o(19283597852672L, 143674);
        return paramWebView;
      }
      paramWebView = super.a(paramWebView, paramj, paramBundle);
      GMTrace.o(19283597852672L, 143674);
      return paramWebView;
    }
    
    public final void a(WebView paramWebView, int paramInt, String paramString1, String paramString2)
    {
      GMTrace.i(19283060981760L, 143670);
      boolean bool = am.isConnected(b.f(b.this));
      w.i("MicroMsg.GameWebView", "onReceivedError, failingUrl = %s, errorCode = %d, errorKey = %d, desc = %s, isNetworkConnected = %b", new Object[] { paramString2, Integer.valueOf(paramInt), Integer.valueOf(a.xn(paramInt)), paramString1, Boolean.valueOf(bool) });
      super.a(paramWebView, paramInt, paramString1, paramString2);
      if (b.b(b.this) != null) {
        b.b(b.this).a(paramWebView, paramInt, paramString1, paramString2);
      }
      GMTrace.o(19283060981760L, 143670);
    }
    
    @TargetApi(8)
    public final void a(WebView paramWebView, com.tencent.xweb.g paramg, SslError paramSslError)
    {
      GMTrace.i(19282926764032L, 143669);
      w.i("MicroMsg.GameWebView", "onReceivedSslError");
      if (b.b(b.this) != null) {
        b.b(b.this).a(paramWebView, paramg, paramSslError);
      }
      GMTrace.o(19282926764032L, 143669);
    }
    
    public final void a(WebView paramWebView, String paramString)
    {
      GMTrace.i(19282524110848L, 143666);
      super.a(paramWebView, paramString);
      w.i("MicroMsg.GameWebView", "onPageFinished, url = %s", new Object[] { paramString });
      b.c(b.this);
      b.this.postDelayed(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(16965523472384L, 126403);
          b.this.eY(true);
          GMTrace.o(16965523472384L, 126403);
        }
      }, 1000L);
      b.d(b.this);
      if (b.b(b.this) != null) {
        b.b(b.this).a(paramWebView, paramString);
      }
      b.this.postDelayed(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(17984638681088L, 133996);
          b.e(b.this);
          GMTrace.o(17984638681088L, 133996);
        }
      }, 2000L);
      GMTrace.o(19282524110848L, 143666);
    }
    
    public final void a(WebView paramWebView, String paramString, boolean paramBoolean)
    {
      GMTrace.i(19282792546304L, 143668);
      w.i("MicroMsg.GameWebView", "doUpdateVisitedHistory, url = %s, isReload = %b", new Object[] { paramString, Boolean.valueOf(paramBoolean) });
      super.a(paramWebView, paramString, paramBoolean);
      if (b.b(b.this) != null) {
        b.b(b.this).a(paramWebView, paramString, paramBoolean);
      }
      GMTrace.o(19282792546304L, 143668);
    }
    
    public final void b(WebView paramWebView, String paramString, Bitmap paramBitmap)
    {
      GMTrace.i(19282389893120L, 143665);
      super.b(paramWebView, paramString, paramBitmap);
      w.i("MicroMsg.GameWebView", "onPageStarted, url = %s", new Object[] { paramString });
      b.a(b.this, false);
      if (b.a(b.this).yY(paramString))
      {
        GMTrace.o(19282389893120L, 143665);
        return;
      }
      if (b.b(b.this) != null) {
        b.b(b.this).b(paramWebView, paramString, paramBitmap);
      }
      GMTrace.o(19282389893120L, 143665);
    }
    
    public final boolean b(WebView paramWebView, String paramString)
    {
      GMTrace.i(19282658328576L, 143667);
      w.i("MicroMsg.GameWebView", "shouldOverrideUrlLoading, url = %s, id = %d", new Object[] { paramString, Integer.valueOf(hashCode()) });
      b.a(b.this, false);
      if (b.a(b.this).yY(paramString))
      {
        GMTrace.o(19282658328576L, 143667);
        return true;
      }
      if (b.b(b.this) != null)
      {
        bool = b.b(b.this).b(paramWebView, paramString);
        GMTrace.o(19282658328576L, 143667);
        return bool;
      }
      boolean bool = super.b(paramWebView, paramString);
      GMTrace.o(19282658328576L, 143667);
      return bool;
    }
    
    public final k e(WebView paramWebView, String paramString)
    {
      GMTrace.i(19283329417216L, 143672);
      w.i("MicroMsg.GameWebView", "shouldInterceptRequest, url = %s", new Object[] { paramString });
      b.h(b.this);
      k localk = com.tencent.mm.plugin.game.gamewebview.model.g.yO(paramString);
      if (localk != null)
      {
        GMTrace.o(19283329417216L, 143672);
        return localk;
      }
      if (b.b(b.this) != null)
      {
        paramWebView = b.b(b.this).e(paramWebView, paramString);
        GMTrace.o(19283329417216L, 143672);
        return paramWebView;
      }
      paramWebView = super.e(paramWebView, paramString);
      GMTrace.o(19283329417216L, 143672);
      return paramWebView;
    }
    
    public final void f(WebView paramWebView, String paramString)
    {
      GMTrace.i(19283195199488L, 143671);
      w.i("MicroMsg.GameWebView", "onLoadResource opt, url = " + paramString);
      super.f(paramWebView, paramString);
      if (!b.g(b.this))
      {
        b.a(b.this, true);
        b.this.eY(false);
      }
      if (b.b(b.this) != null) {
        b.b(b.this).f(paramWebView, paramString);
      }
      GMTrace.o(19283195199488L, 143671);
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/game/gamewebview/e/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */