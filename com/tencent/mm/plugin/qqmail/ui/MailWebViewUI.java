package com.tencent.mm.plugin.qqmail.ui;

import android.content.Intent;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.webkit.ConsoleMessage;
import android.webkit.WebSettings.LayoutAlgorithm;
import android.widget.FrameLayout;
import android.widget.Toast;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.e;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.bq.a;
import com.tencent.mm.plugin.qqmail.b.p.a;
import com.tencent.mm.pluginsdk.ui.tools.s;
import com.tencent.mm.remoteservice.d;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.p;
import com.tencent.mm.ui.widget.MMWebView;
import com.tencent.mm.ui.widget.MMWebView.a;
import com.tencent.xweb.WebView;
import com.tencent.xweb.h;
import com.tencent.xweb.l;
import com.tencent.xweb.n;
import java.util.Map;

public class MailWebViewUI
  extends MMActivity
{
  private String fkj;
  private ae handler;
  private d lFI;
  private long oGJ;
  private MMWebView oKv;
  private View oKw;
  private p.a oKx;
  
  public MailWebViewUI()
  {
    GMTrace.i(5555137544192L, 41389);
    this.oKx = new p.a()
    {
      public final void onError(int paramAnonymousInt, final String paramAnonymousString)
      {
        GMTrace.i(5560908906496L, 41432);
        MailWebViewUI.a(MailWebViewUI.this).post(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(5505476984832L, 41019);
            Toast.makeText(MailWebViewUI.this, paramAnonymousString, 0).show();
            GMTrace.o(5505476984832L, 41019);
          }
        });
        GMTrace.o(5560908906496L, 41432);
      }
      
      public final void onSuccess(final String paramAnonymousString, Map paramAnonymousMap)
      {
        GMTrace.i(5560774688768L, 41431);
        MailWebViewUI.a(MailWebViewUI.this).post(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(5503866372096L, 41007);
            MailWebViewUI.a(MailWebViewUI.this, paramAnonymousString);
            GMTrace.o(5503866372096L, 41007);
          }
        });
        GMTrace.o(5560774688768L, 41431);
      }
    };
    this.lFI = new d(this);
    GMTrace.o(5555137544192L, 41389);
  }
  
  protected final void MH()
  {
    GMTrace.i(5556077068288L, 41396);
    this.oKw = findViewById(R.h.cKI);
    if (this.oKw != null) {
      this.oKw.setVisibility(8);
    }
    boolean bool = getIntent().getBooleanExtra("singleColumn", false);
    this.oKv = MMWebView.a.cb(this.vov.voR);
    this.oKv.setBackgroundDrawable(a.b(this, R.e.aPC));
    ((FrameLayout)findViewById(R.h.byT)).addView(this.oKv);
    this.oKv.getSettings().setJavaScriptEnabled(true);
    if (Boolean.valueOf(bool).booleanValue())
    {
      MMWebView localMMWebView = this.oKv;
      if (Build.VERSION.SDK_INT >= 8) {
        localMMWebView.getSettings().setLayoutAlgorithm(WebSettings.LayoutAlgorithm.SINGLE_COLUMN);
      }
    }
    this.oKv.getSettings().coM();
    this.oKv.getSettings().setSupportZoom(true);
    this.oKv.getSettings().setBuiltInZoomControls(true);
    this.oKv.setWebViewClient(new n()
    {
      public final void a(WebView paramAnonymousWebView, String paramAnonymousString)
      {
        GMTrace.i(19548812083200L, 145650);
        super.a(paramAnonymousWebView, paramAnonymousString);
        s.a(paramAnonymousWebView, "weixin://private/getcontentwidth/", "document.getElementsByTagName('html')[0].scrollWidth;");
        GMTrace.o(19548812083200L, 145650);
      }
      
      public final void aXP()
      {
        GMTrace.i(19548543647744L, 145648);
        MailWebViewUI.c(MailWebViewUI.this).getSettings().setLayoutAlgorithm(WebSettings.LayoutAlgorithm.NORMAL);
        GMTrace.o(19548543647744L, 145648);
      }
      
      public final boolean b(WebView paramAnonymousWebView, String paramAnonymousString)
      {
        GMTrace.i(19548677865472L, 145649);
        if (paramAnonymousString.startsWith("weixin://private/getcontentwidth/"))
        {
          w.d("MicroMsg.QQMail.WebViewUI", "shouldOverride, url is getContentWidth scheme, url = " + paramAnonymousString);
          MailWebViewUI.b(MailWebViewUI.this, paramAnonymousString);
          GMTrace.o(19548677865472L, 145649);
          return true;
        }
        paramAnonymousWebView.loadUrl(paramAnonymousString);
        GMTrace.o(19548677865472L, 145649);
        return true;
      }
    });
    this.oKv.setWebChromeClient(new h()
    {
      public final boolean onConsoleMessage(ConsoleMessage paramAnonymousConsoleMessage)
      {
        GMTrace.i(19547201470464L, 145638);
        if (paramAnonymousConsoleMessage != null) {}
        for (String str = paramAnonymousConsoleMessage.message();; str = null)
        {
          str = s.OW(str);
          if (!str.startsWith("weixin://private/getcontentwidth/")) {
            break;
          }
          w.d("MicroMsg.QQMail.WebViewUI", "onConsoleMessage, url is getContentWidth scheme, url = " + str);
          MailWebViewUI.b(MailWebViewUI.this, str);
          GMTrace.o(19547201470464L, 145638);
          return true;
        }
        boolean bool = super.onConsoleMessage(paramAnonymousConsoleMessage);
        GMTrace.o(19547201470464L, 145638);
        return bool;
      }
    });
    this.oKv.cgj();
    a(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(5562519519232L, 41444);
        MailWebViewUI.this.finish();
        GMTrace.o(5562519519232L, 41444);
        return true;
      }
    });
    GMTrace.o(5556077068288L, 41396);
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(5555540197376L, 41392);
    int i = R.i.ddr;
    GMTrace.o(5555540197376L, 41392);
    return i;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(5555674415104L, 41393);
    super.onCreate(paramBundle);
    this.handler = new ae();
    MH();
    paramBundle = getIntent().getStringExtra("title");
    if (paramBundle != null) {
      rV(paramBundle);
    }
    this.lFI.E(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(5566277615616L, 41472);
        MailWebViewUI.b(MailWebViewUI.this);
        GMTrace.o(5566277615616L, 41472);
      }
    });
    GMTrace.o(5555674415104L, 41393);
  }
  
  protected void onDestroy()
  {
    GMTrace.i(5555942850560L, 41395);
    this.oKv.setVisibility(8);
    this.oKv.destroy();
    this.oKv = null;
    this.lFI.release();
    super.onDestroy();
    GMTrace.o(5555942850560L, 41395);
  }
  
  protected void onPause()
  {
    GMTrace.i(5555405979648L, 41391);
    super.onPause();
    WebView.disablePlatformNotifications();
    GMTrace.o(5555405979648L, 41391);
  }
  
  protected void onResume()
  {
    GMTrace.i(5555271761920L, 41390);
    super.onResume();
    WebView.enablePlatformNotifications();
    GMTrace.o(5555271761920L, 41390);
  }
  
  protected void onStop()
  {
    GMTrace.i(5555808632832L, 41394);
    this.oKv.stopLoading();
    super.onStop();
    GMTrace.o(5555808632832L, 41394);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/qqmail/ui/MailWebViewUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */