package com.tencent.mm.ui.j;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnDismissListener;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.jg.JgClassChecked;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.comm.a.c;
import com.tencent.mm.plugin.comm.a.g;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.widget.MMWebView;
import com.tencent.mm.ui.widget.MMWebView.a;
import com.tencent.xweb.WebView;
import com.tencent.xweb.l;
import com.tencent.xweb.n;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLDecoder;

@SuppressLint({"SetJavaScriptEnabled"})
@JgClassChecked(author=20, fComment="checked", lastDate="20140429", reviewer=20, vComment={com.jg.EType.JSEXECUTECHECK})
public final class b
  extends Dialog
{
  static final float[] wEi;
  static final float[] wEj;
  static final FrameLayout.LayoutParams wEk;
  private MMWebView jeA;
  private String mUrl;
  private ProgressDialog wEm;
  private ImageView wEn;
  private FrameLayout wEo;
  private a wPG;
  
  static
  {
    GMTrace.i(2882191491072L, 21474);
    wEi = new float[] { 20.0F, 60.0F };
    wEj = new float[] { 40.0F, 60.0F };
    wEk = new FrameLayout.LayoutParams(-1, -1);
    GMTrace.o(2882191491072L, 21474);
  }
  
  public b(Context paramContext, String paramString, a parama)
  {
    super(paramContext, 16973840);
    GMTrace.i(2881117749248L, 21466);
    this.mUrl = paramString;
    this.wPG = parama;
    GMTrace.o(2881117749248L, 21466);
  }
  
  protected final void onCreate(Bundle paramBundle)
  {
    GMTrace.i(2881251966976L, 21467);
    super.onCreate(paramBundle);
    this.wEm = new ProgressDialog(getContext());
    this.wEm.requestWindowFeature(1);
    this.wEm.setMessage(getContext().getString(a.g.eNi));
    requestWindowFeature(1);
    this.wEo = new FrameLayout(getContext());
    this.wEn = new ImageView(getContext());
    this.wEn.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(2880312442880L, 21460);
        b.a(b.this).onCancel();
        b.this.dismiss();
        GMTrace.o(2880312442880L, 21460);
      }
    });
    paramBundle = getContext().getResources().getDrawable(a.c.kPq);
    this.wEn.setImageDrawable(paramBundle);
    this.wEn.setVisibility(4);
    int i = this.wEn.getDrawable().getIntrinsicWidth() / 2;
    paramBundle = new LinearLayout(getContext());
    this.jeA = MMWebView.a.cb(getContext());
    this.jeA.setVerticalScrollBarEnabled(false);
    this.jeA.setHorizontalScrollBarEnabled(false);
    this.jeA.setWebViewClient(new b());
    this.jeA.getSettings().setJavaScriptEnabled(true);
    this.jeA.loadUrl(this.mUrl);
    this.jeA.setLayoutParams(wEk);
    this.jeA.setVisibility(4);
    paramBundle.setPadding(i, i, i, i);
    paramBundle.addView(this.jeA);
    this.wEo.addView(paramBundle);
    this.wEo.addView(this.wEn, new ViewGroup.LayoutParams(-2, -2));
    addContentView(this.wEo, new ViewGroup.LayoutParams(-1, -1));
    GMTrace.o(2881251966976L, 21467);
  }
  
  public final boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    GMTrace.i(2881386184704L, 21468);
    if (paramInt == 4)
    {
      this.wPG.onCancel();
      dismiss();
      GMTrace.o(2881386184704L, 21468);
      return true;
    }
    boolean bool = super.onKeyDown(paramInt, paramKeyEvent);
    GMTrace.o(2881386184704L, 21468);
    return bool;
  }
  
  public static abstract interface a
  {
    public abstract void cfP();
    
    public abstract void m(Bundle paramBundle);
    
    public abstract void onCancel();
  }
  
  @JgClassChecked(author=20, fComment="checked", lastDate="20140429", reviewer=20, vComment={com.jg.EType.JSEXECUTECHECK})
  private final class b
    extends n
  {
    public boolean wEq;
    
    public b()
    {
      GMTrace.i(2883802103808L, 21486);
      this.wEq = true;
      GMTrace.o(2883802103808L, 21486);
    }
    
    private static Bundle VN(String paramString)
    {
      GMTrace.i(2884473192448L, 21491);
      Bundle localBundle = new Bundle();
      if (paramString != null)
      {
        paramString = paramString.split("&");
        int j = paramString.length;
        int i = 0;
        while (i < j)
        {
          String[] arrayOfString = paramString[i].split("=");
          localBundle.putString(URLDecoder.decode(arrayOfString[0]), URLDecoder.decode(arrayOfString[1]));
          i += 1;
        }
      }
      GMTrace.o(2884473192448L, 21491);
      return localBundle;
    }
    
    private static Bundle VO(String paramString)
    {
      GMTrace.i(2884607410176L, 21492);
      paramString = paramString.replace("wechatapp", "http");
      try
      {
        paramString = new URL(paramString);
        Bundle localBundle = VN(paramString.getQuery());
        localBundle.putAll(VN(paramString.getRef()));
        GMTrace.o(2884607410176L, 21492);
        return localBundle;
      }
      catch (MalformedURLException paramString)
      {
        paramString = new Bundle();
        GMTrace.o(2884607410176L, 21492);
      }
      return paramString;
    }
    
    public final void a(WebView paramWebView, int paramInt, String paramString1, String paramString2)
    {
      GMTrace.i(20282043531264L, 151113);
      super.a(paramWebView, paramInt, paramString1, paramString2);
      this.wEq = false;
      paramWebView = b.a(b.this);
      new com.tencent.mm.ui.g.a.b(paramString1, paramInt, paramString2);
      paramWebView.cfP();
      try
      {
        b.this.dismiss();
        b.b(b.this).dismiss();
        GMTrace.o(20282043531264L, 151113);
        return;
      }
      catch (Exception paramWebView)
      {
        w.printErrStackTrace("MicroMsg.TwitterDialog", paramWebView, "", new Object[0]);
        GMTrace.o(20282043531264L, 151113);
      }
    }
    
    public final void a(WebView paramWebView, String paramString)
    {
      GMTrace.i(20282311966720L, 151115);
      super.a(paramWebView, paramString);
      this.wEq = false;
      try
      {
        b.b(b.this).dismiss();
        b.c(b.this).setBackgroundColor(0);
        b.d(b.this).setVisibility(0);
        b.e(b.this).setVisibility(0);
        GMTrace.o(20282311966720L, 151115);
        return;
      }
      catch (Exception paramWebView)
      {
        for (;;)
        {
          w.printErrStackTrace("MicroMsg.TwitterDialog", paramWebView, "", new Object[0]);
        }
      }
    }
    
    public final void b(WebView paramWebView, String paramString, Bitmap paramBitmap)
    {
      GMTrace.i(20282177748992L, 151114);
      w.d("Twitter-WebView", "Webview loading URL: " + paramString);
      super.b(paramWebView, paramString, paramBitmap);
      try
      {
        b.b(b.this).show();
        b.b(b.this).setOnDismissListener(new DialogInterface.OnDismissListener()
        {
          public final void onDismiss(DialogInterface paramAnonymousDialogInterface)
          {
            GMTrace.i(2882728361984L, 21478);
            if ((b.b.this.wEq) && (b.this != null))
            {
              b.a(b.this).onCancel();
              b.this.dismiss();
            }
            GMTrace.o(2882728361984L, 21478);
          }
        });
        GMTrace.o(20282177748992L, 151114);
        return;
      }
      catch (Exception paramWebView)
      {
        w.printErrStackTrace("MicroMsg.TwitterDialog", paramWebView, "", new Object[0]);
        GMTrace.o(20282177748992L, 151114);
      }
    }
    
    public final boolean b(WebView paramWebView, String paramString)
    {
      GMTrace.i(20281909313536L, 151112);
      w.d("Twitter-WebView", "Redirect URL: " + paramString);
      if (paramString.startsWith("wechatapp://sign-in-twitter.wechatapp.com/"))
      {
        paramWebView = VO(paramString);
        if (paramWebView.getString("denied") == null) {
          b.a(b.this).m(paramWebView);
        }
        for (;;)
        {
          b.this.dismiss();
          GMTrace.o(20281909313536L, 151112);
          return true;
          b.a(b.this).onCancel();
        }
      }
      b.this.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(paramString)));
      GMTrace.o(20281909313536L, 151112);
      return true;
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/ui/j/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */