package com.tencent.smtt.sdk;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Message;
import android.view.KeyEvent;
import android.view.View;
import com.tencent.smtt.export.external.interfaces.ClientCertRequest;
import com.tencent.smtt.export.external.interfaces.HttpAuthHandler;
import com.tencent.smtt.export.external.interfaces.IX5WebViewBase;
import com.tencent.smtt.export.external.interfaces.IX5WebViewClient;
import com.tencent.smtt.export.external.interfaces.SslError;
import com.tencent.smtt.export.external.interfaces.SslErrorHandler;
import com.tencent.smtt.export.external.interfaces.WebResourceError;
import com.tencent.smtt.export.external.interfaces.WebResourceRequest;
import com.tencent.smtt.export.external.interfaces.WebResourceResponse;
import com.tencent.smtt.export.external.proxy.X5ProxyWebViewClient;
import com.tencent.smtt.utils.TbsLog;
import com.tencent.smtt.utils.m;

final class f
  extends X5ProxyWebViewClient
{
  private static String xvY = null;
  public WebView xuZ;
  private WebViewClient xvX;
  
  public f(IX5WebViewClient paramIX5WebViewClient, WebView paramWebView, WebViewClient paramWebViewClient)
  {
    super(paramIX5WebViewClient);
    this.xuZ = paramWebView;
    this.xvX = paramWebViewClient;
    this.xvX.xzg = this;
  }
  
  public final void countPVContentCacheCallBack(String paramString)
  {
    paramString = this.xuZ;
    paramString.xyN += 1;
  }
  
  public final void doUpdateVisitedHistory(IX5WebViewBase paramIX5WebViewBase, String paramString, boolean paramBoolean)
  {
    this.xuZ.xyK = paramIX5WebViewBase;
    this.xvX.doUpdateVisitedHistory(this.xuZ, paramString, paramBoolean);
  }
  
  public final void onDetectedBlankScreen(IX5WebViewBase paramIX5WebViewBase, String paramString, int paramInt)
  {
    this.xuZ.xyK = paramIX5WebViewBase;
    this.xvX.onDetectedBlankScreen(paramString, paramInt);
  }
  
  public final void onFormResubmission(IX5WebViewBase paramIX5WebViewBase, Message paramMessage1, Message paramMessage2)
  {
    this.xuZ.xyK = paramIX5WebViewBase;
    this.xvX.onFormResubmission(this.xuZ, paramMessage1, paramMessage2);
  }
  
  public final void onLoadResource(IX5WebViewBase paramIX5WebViewBase, String paramString)
  {
    this.xuZ.xyK = paramIX5WebViewBase;
    this.xvX.onLoadResource(this.xuZ, paramString);
  }
  
  public final void onPageFinished(IX5WebViewBase paramIX5WebViewBase, int paramInt1, int paramInt2, String paramString)
  {
    if (xvY == null)
    {
      localObject = com.tencent.smtt.utils.r.cmg();
      if (localObject != null)
      {
        ((com.tencent.smtt.utils.r)localObject).mM(false);
        xvY = Boolean.toString(false);
      }
    }
    this.xuZ.xyK = paramIX5WebViewBase;
    Object localObject = this.xuZ;
    ((WebView)localObject).xyN += 1;
    this.xvX.onPageFinished(this.xuZ, paramString);
    if ("com.qzone".equals(paramIX5WebViewBase.getView().getContext().getApplicationInfo().packageName)) {
      WebView.hc(paramIX5WebViewBase.getView().getContext());
    }
    TbsLog.app_extra("SmttWebViewClient", paramIX5WebViewBase.getView().getContext());
    try
    {
      super.onPageFinished(paramIX5WebViewBase, paramInt1, paramInt2, paramString);
      WebView.clD();
      if ((!t.xyh) && (this.xuZ.getContext() != null) && (t.gS(this.xuZ.getContext())))
      {
        t.xyh = true;
        new Thread(new Runnable()
        {
          public final void run()
          {
            f.this.xuZ.getContext();
            if (l.gk(f.this.xuZ.getContext())) {
              l.gl(f.this.xuZ.getContext());
            }
          }
        }).start();
      }
      if ((this.xuZ.getContext() != null) && (!r.gP(this.xuZ.getContext()).xxB))
      {
        r.gP(this.xuZ.getContext()).xxB = true;
        r.gP(this.xuZ.getContext()).cll();
      }
      return;
    }
    catch (Exception paramIX5WebViewBase)
    {
      for (;;) {}
    }
  }
  
  public final void onPageFinished(IX5WebViewBase paramIX5WebViewBase, String paramString)
  {
    onPageFinished(paramIX5WebViewBase, 0, 0, paramString);
  }
  
  public final void onPageStarted(IX5WebViewBase paramIX5WebViewBase, int paramInt1, int paramInt2, String paramString, Bitmap paramBitmap)
  {
    this.xuZ.xyK = paramIX5WebViewBase;
    this.xvX.onPageStarted(this.xuZ, paramString, paramBitmap);
  }
  
  public final void onPageStarted(IX5WebViewBase paramIX5WebViewBase, String paramString, Bitmap paramBitmap)
  {
    onPageStarted(paramIX5WebViewBase, 0, 0, paramString, paramBitmap);
  }
  
  public final void onReceivedClientCertRequest(IX5WebViewBase paramIX5WebViewBase, ClientCertRequest paramClientCertRequest)
  {
    this.xuZ.xyK = paramIX5WebViewBase;
    this.xvX.onReceivedClientCertRequest(this.xuZ, paramClientCertRequest);
  }
  
  public final void onReceivedError(IX5WebViewBase paramIX5WebViewBase, int paramInt, String paramString1, String paramString2)
  {
    int i = paramInt;
    if (paramInt < -15)
    {
      if (paramInt == -17) {
        i = -1;
      }
    }
    else
    {
      this.xuZ.xyK = paramIX5WebViewBase;
      this.xvX.onReceivedError(this.xuZ, i, paramString1, paramString2);
    }
  }
  
  public final void onReceivedError(IX5WebViewBase paramIX5WebViewBase, WebResourceRequest paramWebResourceRequest, WebResourceError paramWebResourceError)
  {
    this.xuZ.xyK = paramIX5WebViewBase;
    this.xvX.onReceivedError(this.xuZ, paramWebResourceRequest, paramWebResourceError);
  }
  
  public final void onReceivedHttpAuthRequest(IX5WebViewBase paramIX5WebViewBase, HttpAuthHandler paramHttpAuthHandler, String paramString1, String paramString2)
  {
    this.xuZ.xyK = paramIX5WebViewBase;
    this.xvX.onReceivedHttpAuthRequest(this.xuZ, paramHttpAuthHandler, paramString1, paramString2);
  }
  
  public final void onReceivedHttpError(IX5WebViewBase paramIX5WebViewBase, WebResourceRequest paramWebResourceRequest, WebResourceResponse paramWebResourceResponse)
  {
    this.xuZ.xyK = paramIX5WebViewBase;
    this.xvX.onReceivedHttpError(this.xuZ, paramWebResourceRequest, paramWebResourceResponse);
  }
  
  public final void onReceivedLoginRequest(IX5WebViewBase paramIX5WebViewBase, String paramString1, String paramString2, String paramString3)
  {
    this.xuZ.xyK = paramIX5WebViewBase;
    this.xvX.onReceivedLoginRequest(this.xuZ, paramString1, paramString2, paramString3);
  }
  
  public final void onReceivedSslError(IX5WebViewBase paramIX5WebViewBase, SslErrorHandler paramSslErrorHandler, SslError paramSslError)
  {
    this.xuZ.xyK = paramIX5WebViewBase;
    this.xvX.onReceivedSslError(this.xuZ, paramSslErrorHandler, paramSslError);
  }
  
  public final void onScaleChanged(IX5WebViewBase paramIX5WebViewBase, float paramFloat1, float paramFloat2)
  {
    this.xuZ.xyK = paramIX5WebViewBase;
    this.xvX.onScaleChanged(this.xuZ, paramFloat1, paramFloat2);
  }
  
  public final void onTooManyRedirects(IX5WebViewBase paramIX5WebViewBase, Message paramMessage1, Message paramMessage2)
  {
    this.xuZ.xyK = paramIX5WebViewBase;
    this.xvX.onTooManyRedirects(this.xuZ, paramMessage1, paramMessage2);
  }
  
  public final void onUnhandledKeyEvent(IX5WebViewBase paramIX5WebViewBase, KeyEvent paramKeyEvent)
  {
    this.xuZ.xyK = paramIX5WebViewBase;
    this.xvX.onUnhandledKeyEvent(this.xuZ, paramKeyEvent);
  }
  
  public final WebResourceResponse shouldInterceptRequest(IX5WebViewBase paramIX5WebViewBase, WebResourceRequest paramWebResourceRequest)
  {
    this.xuZ.xyK = paramIX5WebViewBase;
    return this.xvX.shouldInterceptRequest(this.xuZ, paramWebResourceRequest);
  }
  
  public final WebResourceResponse shouldInterceptRequest(IX5WebViewBase paramIX5WebViewBase, WebResourceRequest paramWebResourceRequest, Bundle paramBundle)
  {
    this.xuZ.xyK = paramIX5WebViewBase;
    return this.xvX.shouldInterceptRequest(this.xuZ, paramWebResourceRequest, paramBundle);
  }
  
  public final WebResourceResponse shouldInterceptRequest(IX5WebViewBase paramIX5WebViewBase, String paramString)
  {
    this.xuZ.xyK = paramIX5WebViewBase;
    return this.xvX.shouldInterceptRequest(this.xuZ, paramString);
  }
  
  public final boolean shouldOverrideKeyEvent(IX5WebViewBase paramIX5WebViewBase, KeyEvent paramKeyEvent)
  {
    this.xuZ.xyK = paramIX5WebViewBase;
    return this.xvX.shouldOverrideKeyEvent(this.xuZ, paramKeyEvent);
  }
  
  public final boolean shouldOverrideUrlLoading(IX5WebViewBase paramIX5WebViewBase, String paramString)
  {
    if ((paramString == null) || (this.xuZ.showDebugView(paramString))) {}
    boolean bool;
    for (;;)
    {
      return true;
      this.xuZ.xyK = paramIX5WebViewBase;
      if (!m.cma().bG(this.xuZ.getContext().getApplicationContext(), paramString))
      {
        bool = this.xvX.shouldOverrideUrlLoading(this.xuZ, paramString);
        if (!bool)
        {
          if (paramString.startsWith("wtai://wp/mc;"))
          {
            paramIX5WebViewBase = new Intent("android.intent.action.VIEW", Uri.parse("tel:" + paramString.substring(13)));
            this.xuZ.getContext().startActivity(paramIX5WebViewBase);
            return true;
          }
          if (paramString.startsWith("tel:"))
          {
            paramIX5WebViewBase = new Intent("android.intent.action.DIAL", Uri.parse(paramString));
            paramIX5WebViewBase.addFlags(268435456);
            try
            {
              if (this.xuZ.getContext() != null)
              {
                this.xuZ.getContext().startActivity(paramIX5WebViewBase);
                return true;
              }
            }
            catch (Exception paramIX5WebViewBase)
            {
              return true;
            }
          }
        }
      }
    }
    return bool;
  }
  
  public final void v(String paramString, Bitmap paramBitmap)
  {
    super.onPageStarted(this.xuZ.xyK, 0, 0, paramString, paramBitmap);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/smtt/sdk/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */