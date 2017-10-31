package com.tencent.smtt.sdk;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Message;
import android.view.View;
import android.webkit.ValueCallback;
import com.tencent.smtt.export.external.interfaces.ConsoleMessage;
import com.tencent.smtt.export.external.interfaces.GeolocationPermissionsCallback;
import com.tencent.smtt.export.external.interfaces.IX5WebChromeClient;
import com.tencent.smtt.export.external.interfaces.IX5WebChromeClient.CustomViewCallback;
import com.tencent.smtt.export.external.interfaces.IX5WebChromeClient.FileChooserParams;
import com.tencent.smtt.export.external.interfaces.IX5WebViewBase;
import com.tencent.smtt.export.external.interfaces.IX5WebViewBase.WebViewTransport;
import com.tencent.smtt.export.external.interfaces.JsPromptResult;
import com.tencent.smtt.export.external.interfaces.JsResult;
import com.tencent.smtt.export.external.interfaces.QuotaUpdater;
import com.tencent.smtt.export.external.proxy.X5ProxyWebChromeClient;

final class e
  extends X5ProxyWebChromeClient
{
  private WebView xuZ;
  private WebChromeClient xvT;
  
  public e(IX5WebChromeClient paramIX5WebChromeClient, WebView paramWebView, WebChromeClient paramWebChromeClient)
  {
    super(paramIX5WebChromeClient);
    this.xuZ = paramWebView;
    this.xvT = paramWebChromeClient;
  }
  
  public final Bitmap getDefaultVideoPoster()
  {
    return this.xvT.getDefaultVideoPoster();
  }
  
  public final void getVisitedHistory(ValueCallback<String[]> paramValueCallback) {}
  
  public final void onCloseWindow(IX5WebViewBase paramIX5WebViewBase)
  {
    this.xuZ.xyK = paramIX5WebViewBase;
    this.xvT.onCloseWindow(this.xuZ);
  }
  
  public final void onConsoleMessage(String paramString1, int paramInt, String paramString2) {}
  
  public final boolean onConsoleMessage(ConsoleMessage paramConsoleMessage)
  {
    return this.xvT.onConsoleMessage(paramConsoleMessage);
  }
  
  public final boolean onCreateWindow(final IX5WebViewBase paramIX5WebViewBase, boolean paramBoolean1, boolean paramBoolean2, final Message paramMessage)
  {
    paramIX5WebViewBase = this.xuZ;
    paramIX5WebViewBase.getClass();
    paramIX5WebViewBase = new WebView.WebViewTransport(paramIX5WebViewBase);
    paramMessage = Message.obtain(paramMessage.getTarget(), new Runnable()
    {
      public final void run()
      {
        WebView localWebView = paramIX5WebViewBase.getWebView();
        if (localWebView != null) {
          ((IX5WebViewBase.WebViewTransport)paramMessage.obj).setWebView(localWebView.xyK);
        }
        paramMessage.sendToTarget();
      }
    });
    paramMessage.obj = paramIX5WebViewBase;
    return this.xvT.onCreateWindow(this.xuZ, paramBoolean1, paramBoolean2, paramMessage);
  }
  
  public final void onExceededDatabaseQuota(String paramString1, String paramString2, long paramLong1, long paramLong2, long paramLong3, QuotaUpdater paramQuotaUpdater)
  {
    this.xvT.onExceededDatabaseQuota(paramString1, paramString2, paramLong1, paramLong2, paramLong3, new a(paramQuotaUpdater));
  }
  
  public final void onGeolocationPermissionsHidePrompt()
  {
    this.xvT.onGeolocationPermissionsHidePrompt();
  }
  
  public final void onGeolocationPermissionsShowPrompt(String paramString, GeolocationPermissionsCallback paramGeolocationPermissionsCallback)
  {
    this.xvT.onGeolocationPermissionsShowPrompt(paramString, paramGeolocationPermissionsCallback);
  }
  
  public final void onHideCustomView()
  {
    this.xvT.onHideCustomView();
  }
  
  public final boolean onJsAlert(IX5WebViewBase paramIX5WebViewBase, String paramString1, String paramString2, JsResult paramJsResult)
  {
    this.xuZ.xyK = paramIX5WebViewBase;
    return this.xvT.onJsAlert(this.xuZ, paramString1, paramString2, paramJsResult);
  }
  
  public final boolean onJsBeforeUnload(IX5WebViewBase paramIX5WebViewBase, String paramString1, String paramString2, JsResult paramJsResult)
  {
    this.xuZ.xyK = paramIX5WebViewBase;
    return this.xvT.onJsBeforeUnload(this.xuZ, paramString1, paramString2, paramJsResult);
  }
  
  public final boolean onJsConfirm(IX5WebViewBase paramIX5WebViewBase, String paramString1, String paramString2, JsResult paramJsResult)
  {
    this.xuZ.xyK = paramIX5WebViewBase;
    return this.xvT.onJsConfirm(this.xuZ, paramString1, paramString2, paramJsResult);
  }
  
  public final boolean onJsPrompt(IX5WebViewBase paramIX5WebViewBase, String paramString1, String paramString2, String paramString3, JsPromptResult paramJsPromptResult)
  {
    this.xuZ.xyK = paramIX5WebViewBase;
    return this.xvT.onJsPrompt(this.xuZ, paramString1, paramString2, paramString3, paramJsPromptResult);
  }
  
  public final boolean onJsTimeout()
  {
    return this.xvT.onJsTimeout();
  }
  
  public final void onProgressChanged(IX5WebViewBase paramIX5WebViewBase, int paramInt)
  {
    this.xuZ.xyK = paramIX5WebViewBase;
    this.xvT.onProgressChanged(this.xuZ, paramInt);
  }
  
  public final void onReachedMaxAppCacheSize(long paramLong1, long paramLong2, QuotaUpdater paramQuotaUpdater)
  {
    this.xvT.onReachedMaxAppCacheSize(paramLong1, paramLong2, new a(paramQuotaUpdater));
  }
  
  public final void onReceivedIcon(IX5WebViewBase paramIX5WebViewBase, Bitmap paramBitmap)
  {
    this.xuZ.xyK = paramIX5WebViewBase;
    this.xvT.onReceivedIcon(this.xuZ, paramBitmap);
  }
  
  public final void onReceivedTitle(IX5WebViewBase paramIX5WebViewBase, String paramString)
  {
    this.xuZ.xyK = paramIX5WebViewBase;
    this.xvT.onReceivedTitle(this.xuZ, paramString);
  }
  
  public final void onReceivedTouchIconUrl(IX5WebViewBase paramIX5WebViewBase, String paramString, boolean paramBoolean)
  {
    this.xuZ.xyK = paramIX5WebViewBase;
    this.xvT.onReceivedTouchIconUrl(this.xuZ, paramString, paramBoolean);
  }
  
  public final void onRequestFocus(IX5WebViewBase paramIX5WebViewBase)
  {
    this.xuZ.xyK = paramIX5WebViewBase;
    this.xvT.onRequestFocus(this.xuZ);
  }
  
  public final void onShowCustomView(View paramView, int paramInt, IX5WebChromeClient.CustomViewCallback paramCustomViewCallback)
  {
    this.xvT.onShowCustomView(paramView, paramInt, paramCustomViewCallback);
  }
  
  public final void onShowCustomView(View paramView, IX5WebChromeClient.CustomViewCallback paramCustomViewCallback)
  {
    this.xvT.onShowCustomView(paramView, paramCustomViewCallback);
  }
  
  public final boolean onShowFileChooser(IX5WebViewBase paramIX5WebViewBase, final ValueCallback<Uri[]> paramValueCallback, final IX5WebChromeClient.FileChooserParams paramFileChooserParams)
  {
    paramValueCallback = new x() {};
    paramFileChooserParams = new WebChromeClient.a()
    {
      public final Intent createIntent()
      {
        return paramFileChooserParams.createIntent();
      }
      
      public final String[] getAcceptTypes()
      {
        return paramFileChooserParams.getAcceptTypes();
      }
      
      public final String getFilenameHint()
      {
        return paramFileChooserParams.getFilenameHint();
      }
      
      public final int getMode()
      {
        return paramFileChooserParams.getMode();
      }
      
      public final CharSequence getTitle()
      {
        return paramFileChooserParams.getTitle();
      }
      
      public final boolean isCaptureEnabled()
      {
        return paramFileChooserParams.isCaptureEnabled();
      }
    };
    this.xuZ.xyK = paramIX5WebViewBase;
    return this.xvT.onShowFileChooser(this.xuZ, paramValueCallback, paramFileChooserParams);
  }
  
  public final void openFileChooser(final ValueCallback<Uri[]> paramValueCallback, String paramString1, String paramString2, boolean paramBoolean)
  {
    this.xvT.openFileChooser(new x() {}, paramString1, paramString2);
  }
  
  final class a
    implements z.a
  {
    QuotaUpdater xvW;
    
    a(QuotaUpdater paramQuotaUpdater)
    {
      this.xvW = paramQuotaUpdater;
    }
    
    public final void updateQuota(long paramLong)
    {
      this.xvW.updateQuota(paramLong);
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/smtt/sdk/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */