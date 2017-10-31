package com.tencent.mm.plugin.appbrand.page;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Bundle;
import android.os.Looper;
import android.util.Base64;
import android.util.Pair;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnLongClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.Window;
import android.webkit.DownloadListener;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient.CustomViewCallback;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.compatible.util.d;
import com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo;
import com.tencent.mm.plugin.appbrand.appstorage.AppBrandLocalMediaObject;
import com.tencent.mm.plugin.appbrand.config.AppBrandSysConfig;
import com.tencent.mm.plugin.appbrand.f;
import com.tencent.mm.plugin.appbrand.h.i;
import com.tencent.mm.plugin.appbrand.o.h.a;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.widget.MMWebView;
import com.tencent.xweb.WebView;
import com.tencent.xweb.k;
import com.tencent.xweb.m;
import com.tencent.xweb.n;
import java.io.FileInputStream;
import java.nio.ByteBuffer;
import java.util.LinkedList;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

public final class s
  extends MMWebView
  implements com.tencent.mm.plugin.appbrand.c
{
  String iqL;
  f irS;
  boolean irZ;
  private n isa;
  private m jeE;
  private com.tencent.xweb.x5.a.a.a.a.b jeF;
  public String jlV;
  public String jlW;
  public v jlX;
  u jlY;
  private com.tencent.mm.plugin.appbrand.h.l jlZ;
  public View jma;
  private WebChromeClient.CustomViewCallback jmb;
  w jmc;
  private LinkedList<Pair<String, ValueCallback<String>>> jmd;
  private long jme;
  long jmf;
  boolean jmg;
  long jmh;
  private String jmi;
  private String jmj;
  private com.tencent.xweb.h jmk;
  
  public s(Context paramContext, f paramf)
  {
    super(paramContext);
    GMTrace.i(17656476336128L, 131551);
    this.irZ = false;
    this.jmg = true;
    this.jmi = null;
    this.jmj = null;
    this.isa = new n()
    {
      private k rC(String paramAnonymousString)
      {
        GMTrace.i(19894691168256L, 148227);
        Object localObject;
        if (paramAnonymousString.startsWith(s.i(s.this)))
        {
          localObject = com.tencent.mm.plugin.appbrand.appcache.u.c(s.b(s.this), paramAnonymousString.replaceFirst(s.i(s.this), ""));
          if (localObject != null) {
            break label180;
          }
        }
        label180:
        for (boolean bool = true;; bool = false)
        {
          com.tencent.mm.sdk.platformtools.w.i("MicroMsg.AppBrandWebView", "tryInterceptWebViewRequest, reqURL = %s, WebResourceResponse == null ? %b", new Object[] { paramAnonymousString, Boolean.valueOf(bool) });
          GMTrace.o(19894691168256L, 148227);
          return (k)localObject;
          if (paramAnonymousString.startsWith("wxfile://"))
          {
            localObject = com.tencent.mm.plugin.appbrand.appstorage.c.aI(s.a(s.this), paramAnonymousString);
            if (localObject != null) {
              try
              {
                localObject = new k(((AppBrandLocalMediaObject)localObject).mimeType, "utf-8", new FileInputStream(((AppBrandLocalMediaObject)localObject).hhT));
              }
              catch (Exception localException)
              {
                com.tencent.mm.sdk.platformtools.w.e("MicroMsg.AppBrandWebView", "tryInterceptWebViewRequest with localId(%s), exp = %s", new Object[] { paramAnonymousString, bg.f(localException) });
              }
            }
            localk = null;
            break;
          }
          k localk = com.tencent.mm.plugin.appbrand.appcache.u.c(s.b(s.this), paramAnonymousString);
          break;
        }
      }
      
      public final k a(WebView paramAnonymousWebView, com.tencent.xweb.j paramAnonymousj)
      {
        GMTrace.i(19894959603712L, 148229);
        if ((paramAnonymousj == null) || (paramAnonymousj.getUrl() == null) || (bg.mZ(paramAnonymousj.getUrl().toString())))
        {
          GMTrace.o(19894959603712L, 148229);
          return null;
        }
        paramAnonymousWebView = rC(paramAnonymousj.getUrl().toString());
        GMTrace.o(19894959603712L, 148229);
        return paramAnonymousWebView;
      }
      
      public final k a(WebView paramAnonymousWebView, com.tencent.xweb.j paramAnonymousj, Bundle paramAnonymousBundle)
      {
        GMTrace.i(19895093821440L, 148230);
        if ((paramAnonymousj == null) || (paramAnonymousj.getUrl() == null) || (bg.mZ(paramAnonymousj.getUrl().toString())))
        {
          GMTrace.o(19895093821440L, 148230);
          return null;
        }
        paramAnonymousWebView = rC(paramAnonymousj.getUrl().toString());
        GMTrace.o(19895093821440L, 148230);
        return paramAnonymousWebView;
      }
      
      public final void a(WebView paramAnonymousWebView, int paramAnonymousInt, String paramAnonymousString1, String paramAnonymousString2)
      {
        GMTrace.i(19895228039168L, 148231);
        com.tencent.mm.sdk.platformtools.w.e("MicroMsg.AppBrandWebView", "onReceivedError, errCode = %d, description = %s, failingUrl = %s", new Object[] { Integer.valueOf(paramAnonymousInt), paramAnonymousString1, paramAnonymousString2 });
        GMTrace.o(19895228039168L, 148231);
      }
      
      public final void a(WebView paramAnonymousWebView, com.tencent.xweb.g paramAnonymousg, SslError paramAnonymousSslError)
      {
        GMTrace.i(19894556950528L, 148226);
        com.tencent.mm.sdk.platformtools.w.e("MicroMsg.AppBrandWebView", "SSL Error, Page URL: %s, Code %d", new Object[] { s.this.jlV, Integer.valueOf(paramAnonymousSslError.getPrimaryError()) });
        s.a(s.this, paramAnonymousg, paramAnonymousSslError);
        GMTrace.o(19894556950528L, 148226);
      }
      
      public final void a(WebView paramAnonymousWebView, com.tencent.xweb.j paramAnonymousj, k paramAnonymousk)
      {
        GMTrace.i(19895362256896L, 148232);
        paramAnonymousWebView = paramAnonymousj.getUrl();
        if (paramAnonymousWebView == null) {}
        for (paramAnonymousWebView = "null";; paramAnonymousWebView = paramAnonymousWebView.toString())
        {
          com.tencent.mm.sdk.platformtools.w.e("MicroMsg.AppBrandWebView", "onReceivedHttpError, WebResourceRequest url = %s, ErrWebResourceResponse mimeType = %s, status = %d", new Object[] { paramAnonymousWebView, paramAnonymousk.mMimeType, Integer.valueOf(paramAnonymousk.mStatusCode) });
          GMTrace.o(19895362256896L, 148232);
          return;
        }
      }
      
      public final void a(WebView paramAnonymousWebView, String paramAnonymousString)
      {
        GMTrace.i(19894288515072L, 148224);
        com.tencent.mm.sdk.platformtools.w.i("MicroMsg.AppBrandWebView", "onPageFinished, url = %s", new Object[] { paramAnonymousString });
        if (s.c(s.this))
        {
          GMTrace.o(19894288515072L, 148224);
          return;
        }
        s.a(s.this, true);
        s.d(s.this);
        s.e(s.this);
        s.b(s.this).irb.k(3, System.currentTimeMillis() - s.f(s.this));
        com.tencent.mm.plugin.appbrand.performance.a.a(s.a(s.this), "Native", "WebViewInit+PageFrameLoad", s.f(s.this), System.currentTimeMillis(), "");
        if (s.g(s.this) != null)
        {
          com.tencent.mm.sdk.platformtools.w.i("MicroMsg.AppBrandWebView", "Inject page on frame load finished");
          s.a(s.this, s.g(s.this));
        }
        s.h(s.this);
        GMTrace.o(19894288515072L, 148224);
      }
      
      public final void b(WebView paramAnonymousWebView, String paramAnonymousString, Bitmap paramAnonymousBitmap)
      {
        GMTrace.i(19894154297344L, 148223);
        com.tencent.mm.sdk.platformtools.w.i("MicroMsg.AppBrandWebView", "onPageStarted, url = %s", new Object[] { paramAnonymousString });
        s.a(s.this, false);
        GMTrace.o(19894154297344L, 148223);
      }
      
      public final boolean b(WebView paramAnonymousWebView, String paramAnonymousString)
      {
        GMTrace.i(19894422732800L, 148225);
        com.tencent.mm.sdk.platformtools.w.i("MicroMsg.AppBrandWebView", "shouldOverrideUrlLoading, url = %s", new Object[] { paramAnonymousString });
        GMTrace.o(19894422732800L, 148225);
        return true;
      }
      
      public final k e(WebView paramAnonymousWebView, String paramAnonymousString)
      {
        GMTrace.i(19894825385984L, 148228);
        if (bg.mZ(paramAnonymousString))
        {
          GMTrace.o(19894825385984L, 148228);
          return null;
        }
        paramAnonymousWebView = rC(paramAnonymousString);
        GMTrace.o(19894825385984L, 148228);
        return paramAnonymousWebView;
      }
    };
    this.jmk = new com.tencent.xweb.h()
    {
      public final void onHideCustomView()
      {
        GMTrace.i(17302275751936L, 128912);
        try
        {
          s.this.Zq();
          GMTrace.o(17302275751936L, 128912);
          return;
        }
        catch (Exception localException)
        {
          com.tencent.mm.sdk.platformtools.w.e("MicroMsg.AppBrandWebView", "onHideCustomView error " + localException.getMessage());
          GMTrace.o(17302275751936L, 128912);
        }
      }
      
      public final void onShowCustomView(View paramAnonymousView, WebChromeClient.CustomViewCallback paramAnonymousCustomViewCallback)
      {
        GMTrace.i(19899254571008L, 148261);
        try
        {
          s.this.g(paramAnonymousView, true);
          s.a(s.this, paramAnonymousCustomViewCallback);
          GMTrace.o(19899254571008L, 148261);
          return;
        }
        catch (Exception paramAnonymousView)
        {
          com.tencent.mm.sdk.platformtools.w.e("MicroMsg.AppBrandWebView", "onShowCustomView error " + paramAnonymousView.getMessage());
          GMTrace.o(19899254571008L, 148261);
        }
      }
    };
    this.jeE = new m()
    {
      public final boolean A(MotionEvent paramAnonymousMotionEvent)
      {
        GMTrace.i(17291806769152L, 128834);
        boolean bool = s.this.L(paramAnonymousMotionEvent);
        GMTrace.o(17291806769152L, 128834);
        return bool;
      }
      
      public final void XL()
      {
        GMTrace.i(17291269898240L, 128830);
        s.this.cgl();
        GMTrace.o(17291269898240L, 128830);
      }
      
      public final boolean a(int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3, int paramAnonymousInt4, int paramAnonymousInt5, int paramAnonymousInt6, int paramAnonymousInt7, int paramAnonymousInt8, boolean paramAnonymousBoolean)
      {
        GMTrace.i(17291135680512L, 128829);
        paramAnonymousBoolean = s.this.b(paramAnonymousInt1, paramAnonymousInt2, paramAnonymousInt3, paramAnonymousInt4, paramAnonymousInt5, paramAnonymousInt6, paramAnonymousInt7, paramAnonymousInt8, paramAnonymousBoolean);
        GMTrace.o(17291135680512L, 128829);
        return paramAnonymousBoolean;
      }
      
      @TargetApi(9)
      public final void b(int paramAnonymousInt1, int paramAnonymousInt2, boolean paramAnonymousBoolean1, boolean paramAnonymousBoolean2)
      {
        GMTrace.i(17291404115968L, 128831);
        s.this.c(paramAnonymousInt1, paramAnonymousInt2, paramAnonymousBoolean1, paramAnonymousBoolean2);
        GMTrace.o(17291404115968L, 128831);
      }
      
      public final void onScrollChanged(int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3, int paramAnonymousInt4, View paramAnonymousView)
      {
        GMTrace.i(17291538333696L, 128832);
        if (s.j(s.this) != null) {
          s.j(s.this).onScrollChanged(paramAnonymousInt1, paramAnonymousInt2, paramAnonymousInt3, paramAnonymousInt4, paramAnonymousView);
        }
        s.this.v(paramAnonymousInt1, paramAnonymousInt2, paramAnonymousInt3, paramAnonymousInt4);
        GMTrace.o(17291538333696L, 128832);
      }
      
      public final boolean y(MotionEvent paramAnonymousMotionEvent)
      {
        GMTrace.i(17291001462784L, 128828);
        boolean bool = s.this.J(paramAnonymousMotionEvent);
        GMTrace.o(17291001462784L, 128828);
        return bool;
      }
      
      public final boolean z(MotionEvent paramAnonymousMotionEvent)
      {
        GMTrace.i(17291672551424L, 128833);
        boolean bool = s.this.K(paramAnonymousMotionEvent);
        GMTrace.o(17291672551424L, 128833);
        return bool;
      }
    };
    this.jeF = new com.tencent.xweb.x5.a.a.a.a.b()
    {
      public final void computeScroll(View paramAnonymousView)
      {
        GMTrace.i(17292746293248L, 128841);
        s.k(s.this).XL();
        GMTrace.o(17292746293248L, 128841);
      }
      
      public final boolean dispatchTouchEvent(MotionEvent paramAnonymousMotionEvent, View paramAnonymousView)
      {
        GMTrace.i(17292343640064L, 128838);
        boolean bool = s.k(s.this).z(paramAnonymousMotionEvent);
        GMTrace.o(17292343640064L, 128838);
        return bool;
      }
      
      public final void hasDiscardCurrentPage(boolean paramAnonymousBoolean)
      {
        GMTrace.i(19899523006464L, 148263);
        s.b(s.this, paramAnonymousBoolean);
        s locals = s.this;
        if (!paramAnonymousBoolean) {}
        for (paramAnonymousBoolean = true;; paramAnonymousBoolean = false)
        {
          s.a(locals, paramAnonymousBoolean);
          GMTrace.o(19899523006464L, 148263);
          return;
        }
      }
      
      public final boolean onInterceptTouchEvent(MotionEvent paramAnonymousMotionEvent, View paramAnonymousView)
      {
        GMTrace.i(17292209422336L, 128837);
        boolean bool = s.k(s.this).A(paramAnonymousMotionEvent);
        GMTrace.o(17292209422336L, 128837);
        return bool;
      }
      
      public final Object onMiscCallBack(String paramAnonymousString, Bundle paramAnonymousBundle)
      {
        GMTrace.i(17293148946432L, 128844);
        if ((!bg.mZ(paramAnonymousString)) && (paramAnonymousBundle != null))
        {
          com.tencent.mm.sdk.platformtools.w.i("MicroMsg.AppBrandWebView", "method = %s", new Object[] { paramAnonymousString });
          if (paramAnonymousString.equalsIgnoreCase("shouldInterceptMediaUrl"))
          {
            paramAnonymousString = paramAnonymousBundle.getString("url");
            if (!bg.mZ(paramAnonymousString))
            {
              paramAnonymousBundle = com.tencent.mm.plugin.appbrand.appstorage.c.aI(s.a(s.this), paramAnonymousString);
              if (paramAnonymousBundle == null)
              {
                com.tencent.mm.sdk.platformtools.w.e("MicroMsg.AppBrandWebView", "get meidiaobj failed, appid : %s, localid :%s", new Object[] { s.a(s.this), paramAnonymousString });
                GMTrace.o(17293148946432L, 128844);
                return null;
              }
              paramAnonymousBundle = paramAnonymousBundle.hhT;
              com.tencent.mm.sdk.platformtools.w.i("MicroMsg.AppBrandWebView", "filePath" + paramAnonymousBundle + "tempFilePath" + paramAnonymousString);
              GMTrace.o(17293148946432L, 128844);
              return paramAnonymousBundle;
            }
          }
        }
        GMTrace.o(17293148946432L, 128844);
        return null;
      }
      
      public final void onOverScrolled(int paramAnonymousInt1, int paramAnonymousInt2, boolean paramAnonymousBoolean1, boolean paramAnonymousBoolean2, View paramAnonymousView)
      {
        GMTrace.i(17292612075520L, 128840);
        s.k(s.this).b(paramAnonymousInt1, paramAnonymousInt2, paramAnonymousBoolean1, paramAnonymousBoolean2);
        GMTrace.o(17292612075520L, 128840);
      }
      
      public final void onScrollChanged(int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3, int paramAnonymousInt4, View paramAnonymousView)
      {
        GMTrace.i(10267387756544L, 76498);
        s.k(s.this).onScrollChanged(paramAnonymousInt1, paramAnonymousInt2, paramAnonymousInt3, paramAnonymousInt4, paramAnonymousView);
        GMTrace.o(10267387756544L, 76498);
      }
      
      public final boolean onShowLongClickPopupMenu()
      {
        GMTrace.i(17292880510976L, 128842);
        if (WebView.getTbsCoreVersion(s.this.getContext()) >= 43011)
        {
          GMTrace.o(17292880510976L, 128842);
          return false;
        }
        GMTrace.o(17292880510976L, 128842);
        return true;
      }
      
      public final boolean onTouchEvent(MotionEvent paramAnonymousMotionEvent, View paramAnonymousView)
      {
        GMTrace.i(17292075204608L, 128836);
        boolean bool = s.k(s.this).y(paramAnonymousMotionEvent);
        GMTrace.o(17292075204608L, 128836);
        return bool;
      }
      
      public final boolean overScrollBy(int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3, int paramAnonymousInt4, int paramAnonymousInt5, int paramAnonymousInt6, int paramAnonymousInt7, int paramAnonymousInt8, boolean paramAnonymousBoolean, View paramAnonymousView)
      {
        GMTrace.i(17292477857792L, 128839);
        paramAnonymousBoolean = s.k(s.this).a(paramAnonymousInt1, paramAnonymousInt2, paramAnonymousInt3, paramAnonymousInt4, paramAnonymousInt5, paramAnonymousInt6, paramAnonymousInt7, paramAnonymousInt8, paramAnonymousBoolean);
        GMTrace.o(17292477857792L, 128839);
        return paramAnonymousBoolean;
      }
      
      public final boolean shouldDiscardCurrentPage()
      {
        GMTrace.i(19899388788736L, 148262);
        boolean bool2 = s.l(s.this).Zf();
        if ((bool2) && (!s.m(s.this))) {}
        for (boolean bool1 = true;; bool1 = false)
        {
          com.tencent.mm.sdk.platformtools.w.i("MicroMsg.AppBrandWebView", "shouldTrimCurrentPage: %b", new Object[] { Boolean.valueOf(bool1) });
          if ((!bool2) || (s.m(s.this))) {
            break;
          }
          GMTrace.o(19899388788736L, 148262);
          return true;
        }
        GMTrace.o(19899388788736L, 148262);
        return false;
      }
    };
    this.gJV = true;
    boolean bool;
    if (getX5WebViewExtension() != null) {
      bool = true;
    }
    for (;;)
    {
      this.isX5Kernel = bool;
      this.irS = paramf;
      this.iqL = paramf.iqL;
      this.jmd = new LinkedList();
      this.jme = System.currentTimeMillis();
      fH(getContext());
      getSettings().coR();
      getSettings().setJavaScriptEnabled(true);
      getSettings().setMediaPlaybackRequiresUserGesture(false);
      getSettings().coT();
      getSettings().setUserAgentString(com.tencent.mm.pluginsdk.ui.tools.s.aY(getContext(), getSettings().getUserAgentString()));
      getView().setHorizontalScrollBarEnabled(false);
      getView().setVerticalScrollBarEnabled(false);
      setWebViewClient(this.isa);
      setWebChromeClient(this.jmk);
      setWebViewCallbackClient(this.jeE);
      if (this.isX5Kernel) {
        setWebViewClientExtension(this.jeF);
      }
      try
      {
        a.a.ce(getX5WebViewExtension()).l("setEnableAutoPageDiscarding", new Object[] { Boolean.valueOf(false) });
        a.a.ce(getX5WebViewExtension()).l("setEnableAutoPageRestoration", new Object[] { Boolean.valueOf(false) });
        com.tencent.mm.sdk.platformtools.w.i("MicroMsg.AppBrandWebView", "Is the current broswer kernel X5, " + this.isX5Kernel);
        setBackgroundColor(-1);
        setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        setOnLongClickListener(new View.OnLongClickListener()
        {
          public final boolean onLongClick(View paramAnonymousView)
          {
            GMTrace.i(10234370195456L, 76252);
            if (WebView.getTbsCoreVersion(s.this.getContext()) >= 43011)
            {
              GMTrace.o(10234370195456L, 76252);
              return false;
            }
            GMTrace.o(10234370195456L, 76252);
            return true;
          }
        });
        setDownloadListener(new DownloadListener()
        {
          public final void onDownloadStart(String paramAnonymousString1, String paramAnonymousString2, String paramAnonymousString3, String paramAnonymousString4, long paramAnonymousLong)
          {
            GMTrace.i(10232893800448L, 76241);
            com.tencent.mm.sdk.platformtools.w.i("MicroMsg.AppBrandWebView", "onDownloadStart called, url = %s, mimeType = %s, userAgent = %s", new Object[] { paramAnonymousString1, paramAnonymousString4, paramAnonymousString2 });
            GMTrace.o(10232893800448L, 76241);
          }
        });
        com.tencent.mm.plugin.appbrand.j.nR(this.iqL).irQ.set(true);
        com.tencent.mm.plugin.appbrand.report.a.cw(this.isX5Kernel);
        this.jlZ = i.rf(this.iqL);
        GMTrace.o(17656476336128L, 131551);
        return;
        bool = false;
      }
      catch (Exception paramContext)
      {
        for (;;)
        {
          com.tencent.mm.sdk.platformtools.w.e("MicroMsg.AppBrandWebView", "DisableAutoPageDiscarding error " + paramContext);
        }
      }
    }
  }
  
  private String Zp()
  {
    GMTrace.i(10262421700608L, 76461);
    if (this.jmi == null) {
      this.jmi = ("https://servicewechat.com/" + this.iqL + "/" + this.irS.iqO.iJa.iCy + "/");
    }
    String str = this.jmi;
    GMTrace.o(10262421700608L, 76461);
    return str;
  }
  
  private static void a(JSONObject paramJSONObject, String paramString, Object paramObject)
  {
    GMTrace.i(18357361311744L, 136773);
    try
    {
      paramJSONObject.put(paramString, paramObject);
      GMTrace.o(18357361311744L, 136773);
      return;
    }
    catch (Exception paramJSONObject)
    {
      com.tencent.mm.sdk.platformtools.w.e("MicroMsg.AppBrandWebView", paramJSONObject.getMessage());
      GMTrace.o(18357361311744L, 136773);
    }
  }
  
  public final int Ru()
  {
    GMTrace.i(19895899127808L, 148236);
    GMTrace.o(19895899127808L, 148236);
    return 0;
  }
  
  public final boolean Rv()
  {
    GMTrace.i(19896301780992L, 148239);
    GMTrace.o(19896301780992L, 148239);
    return false;
  }
  
  public final void Zq()
  {
    GMTrace.i(16279268229120L, 121290);
    if (this.jma == null)
    {
      GMTrace.o(16279268229120L, 121290);
      return;
    }
    if (this.jmb != null) {
      this.jmb.onCustomViewHidden();
    }
    MMActivity localMMActivity = (MMActivity)getContext();
    ViewGroup localViewGroup = (ViewGroup)localMMActivity.getWindow().getDecorView();
    localViewGroup.setSystemUiVisibility(0);
    localViewGroup.removeView(this.jma);
    localMMActivity.getWindow().clearFlags(1024);
    if (localMMActivity.getRequestedOrientation() == 0) {
      localMMActivity.setRequestedOrientation(1);
    }
    this.jma = null;
    this.jmb = null;
    if (this.jmc != null) {
      this.jmc.Xw();
    }
    GMTrace.o(16279268229120L, 121290);
  }
  
  public final void a(int paramInt, ByteBuffer paramByteBuffer)
  {
    GMTrace.i(19896167563264L, 148238);
    GMTrace.o(19896167563264L, 148238);
  }
  
  public final void cleanup()
  {
    GMTrace.i(10262153265152L, 76459);
    GMTrace.o(10262153265152L, 76459);
  }
  
  public final void destroy()
  {
    GMTrace.i(10262287482880L, 76460);
    super.destroy();
    GMTrace.o(10262287482880L, 76460);
  }
  
  public final void evaluateJavascript(final String paramString, final ValueCallback<String> paramValueCallback)
  {
    GMTrace.i(19895630692352L, 148234);
    if (!this.irZ)
    {
      this.jmd.add(new Pair(paramString, paramValueCallback));
      GMTrace.o(19895630692352L, 148234);
      return;
    }
    paramString = new Runnable()
    {
      public final void run()
      {
        GMTrace.i(17299322961920L, 128890);
        s.a(s.this, paramString, paramValueCallback);
        GMTrace.o(17299322961920L, 128890);
      }
    };
    if (Looper.getMainLooper().getThread() == Thread.currentThread())
    {
      paramString.run();
      GMTrace.o(19895630692352L, 148234);
      return;
    }
    post(paramString);
    GMTrace.o(19895630692352L, 148234);
  }
  
  final void g(View paramView, boolean paramBoolean)
  {
    GMTrace.i(17295833300992L, 128864);
    Zq();
    this.jma = paramView;
    MMActivity localMMActivity = (MMActivity)getContext();
    ViewGroup.LayoutParams localLayoutParams = new ViewGroup.LayoutParams(-1, -1);
    ViewGroup localViewGroup = (ViewGroup)localMMActivity.getWindow().getDecorView();
    localViewGroup.addView(paramView, localLayoutParams);
    paramView.setX(0.0F);
    paramView.setY(0.0F);
    if (d.eu(19)) {
      localViewGroup.setSystemUiVisibility(2);
    }
    for (;;)
    {
      localMMActivity.getWindow().addFlags(1024);
      if (paramBoolean) {
        localMMActivity.setRequestedOrientation(0);
      }
      GMTrace.o(17295833300992L, 128864);
      return;
      localViewGroup.setSystemUiVisibility(4098);
    }
  }
  
  public final ByteBuffer hI(int paramInt)
  {
    GMTrace.i(19896033345536L, 148237);
    GMTrace.o(19896033345536L, 148237);
    return null;
  }
  
  public final void init()
  {
    GMTrace.i(19895496474624L, 148233);
    if (this.jmj == null) {
      this.jmj = (Zp() + "page-frame.html");
    }
    loadUrl(this.jmj);
    GMTrace.o(19895496474624L, 148233);
  }
  
  public final void pause()
  {
    GMTrace.i(18868999290880L, 140585);
    GMTrace.o(18868999290880L, 140585);
  }
  
  public final void rA(String paramString)
  {
    GMTrace.i(10262019047424L, 76458);
    if ((bg.mZ(paramString)) || (!com.tencent.mm.sdk.a.b.bMv()))
    {
      GMTrace.o(10262019047424L, 76458);
      return;
    }
    evaluateJavascript("document.title=\"" + paramString + "\"", null);
    GMTrace.o(10262019047424L, 76458);
  }
  
  final void rB(String paramString)
  {
    GMTrace.i(10262555918336L, 76462);
    this.jmf = System.currentTimeMillis();
    String str1 = com.tencent.mm.plugin.appbrand.appcache.u.a(this.irS, paramString);
    if (bg.mZ(str1))
    {
      com.tencent.mm.sdk.platformtools.w.e("MicroMsg.AppBrandWebView", "Cache content empty, abort inject");
      GMTrace.o(10262555918336L, 76462);
      return;
    }
    int i = str1.indexOf("<style>");
    int j = str1.indexOf("</style>");
    String str2;
    label128:
    String str3;
    if ((i == -1) || (j == -i))
    {
      paramString = "";
      str2 = Base64.encodeToString(paramString.getBytes(), 2);
      i = str1.indexOf("<page>");
      j = str1.indexOf("</page>");
      if ((i != -1) && (j != -i)) {
        break label224;
      }
      paramString = "";
      str3 = Base64.encodeToString(paramString.getBytes(), 2);
      i = str1.indexOf("<script>");
      j = str1.indexOf("</script>");
      if ((i != -1) && (j != -i)) {
        break label238;
      }
    }
    label224:
    label238:
    for (paramString = "";; paramString = str1.substring(i + 8, j))
    {
      evaluateJavascript(String.format("var style = document.createElement('style');style.innerHTML = atob(\"%s\");document.head.appendChild(style);var page = document.createElement('page');page.innerHTML = atob(\"%s\");document.body.appendChild(page);%s", new Object[] { str2, str3, paramString }), null);
      GMTrace.o(10262555918336L, 76462);
      return;
      paramString = str1.substring(i + 7, j);
      break;
      paramString = str1.substring(i + 6, j);
      break label128;
    }
  }
  
  public final void resume()
  {
    GMTrace.i(18869133508608L, 140586);
    GMTrace.o(18869133508608L, 140586);
  }
  
  public final boolean wv()
  {
    GMTrace.i(19895764910080L, 148235);
    GMTrace.o(19895764910080L, 148235);
    return true;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/page/s.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */