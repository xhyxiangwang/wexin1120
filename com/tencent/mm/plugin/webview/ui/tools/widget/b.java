package com.tencent.mm.plugin.webview.ui.tools.widget;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.webkit.GeolocationPermissions.Callback;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.e;
import com.tencent.mm.R.l;
import com.tencent.mm.ui.base.i;
import com.tencent.xweb.WebView;
import com.tencent.xweb.d;
import com.tencent.xweb.e;

public class b
  extends com.tencent.xweb.h
{
  public Activity fGo;
  private int mxy;
  
  public b(MMWebViewWithJsApi paramMMWebViewWithJsApi)
  {
    GMTrace.i(12089259196416L, 90072);
    this.mxy = 0;
    this.fGo = ((Activity)paramMMWebViewWithJsApi.getContext());
    GMTrace.o(12089259196416L, 90072);
  }
  
  public final boolean a(WebView paramWebView, String paramString1, String paramString2, final e parame)
  {
    GMTrace.i(19458349334528L, 144976);
    this.mxy += 1;
    if (this.mxy > 2) {}
    for (i locali = com.tencent.mm.ui.base.h.a(this.fGo, paramString2, "", this.fGo.getString(R.l.fcw), this.fGo.getString(R.l.dwr), new DialogInterface.OnClickListener()new DialogInterface.OnClickListener
        {
          public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
          {
            GMTrace.i(12064026263552L, 89884);
            parame.cancel();
            if (paramAnonymousDialogInterface != null) {
              paramAnonymousDialogInterface.dismiss();
            }
            b.this.fGo.finish();
            GMTrace.o(12064026263552L, 89884);
          }
        }, new DialogInterface.OnClickListener()
        {
          public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
          {
            GMTrace.i(12087782801408L, 90061);
            parame.confirm();
            GMTrace.o(12087782801408L, 90061);
          }
        }, R.e.aOU); locali != null; locali = com.tencent.mm.ui.base.h.a(this.fGo, paramString2, "", this.fGo.getString(R.l.dwr), new DialogInterface.OnClickListener()
        {
          public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
          {
            GMTrace.i(12088856543232L, 90069);
            parame.confirm();
            GMTrace.o(12088856543232L, 90069);
          }
        }))
    {
      locali.setCanceledOnTouchOutside(false);
      locali.lk(false);
      GMTrace.o(19458349334528L, 144976);
      return true;
    }
    boolean bool = super.a(paramWebView, paramString1, paramString2, parame);
    GMTrace.o(19458349334528L, 144976);
    return bool;
  }
  
  public final boolean a(WebView paramWebView, String paramString1, String paramString2, String paramString3, d paramd)
  {
    GMTrace.i(19458617769984L, 144978);
    boolean bool = super.a(paramWebView, paramString1, paramString2, paramString3, paramd);
    GMTrace.o(19458617769984L, 144978);
    return bool;
  }
  
  public final boolean b(WebView paramWebView, String paramString1, String paramString2, final e parame)
  {
    GMTrace.i(19458483552256L, 144977);
    this.mxy += 1;
    if (this.mxy > 2) {}
    for (i locali = com.tencent.mm.ui.base.h.a(this.fGo, paramString2, "", this.fGo.getString(R.l.fcw), this.fGo.getString(R.l.dwr), new DialogInterface.OnClickListener()new DialogInterface.OnClickListener
        {
          public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
          {
            GMTrace.i(12060805038080L, 89860);
            parame.cancel();
            if (paramAnonymousDialogInterface != null) {
              paramAnonymousDialogInterface.dismiss();
            }
            b.this.fGo.finish();
            GMTrace.o(12060805038080L, 89860);
          }
        }, new DialogInterface.OnClickListener()
        {
          public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
          {
            GMTrace.i(12071676674048L, 89941);
            parame.confirm();
            GMTrace.o(12071676674048L, 89941);
          }
        }, R.e.aND); locali != null; locali = com.tencent.mm.ui.base.h.a(this.fGo, false, paramString2, "", this.fGo.getString(R.l.dwr), this.fGo.getString(R.l.duP), new DialogInterface.OnClickListener()new DialogInterface.OnClickListener
        {
          public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
          {
            GMTrace.i(12071139803136L, 89937);
            parame.confirm();
            GMTrace.o(12071139803136L, 89937);
          }
        }, new DialogInterface.OnClickListener()
        {
          public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
          {
            GMTrace.i(12093017292800L, 90100);
            parame.cancel();
            GMTrace.o(12093017292800L, 90100);
          }
        }))
    {
      locali.setCancelable(false);
      locali.setCanceledOnTouchOutside(false);
      GMTrace.o(19458483552256L, 144977);
      return true;
    }
    boolean bool = super.b(paramWebView, paramString1, paramString2, parame);
    GMTrace.o(19458483552256L, 144977);
    return bool;
  }
  
  public void c(WebView paramWebView, String paramString)
  {
    GMTrace.i(19458080899072L, 144974);
    super.c(paramWebView, paramString);
    GMTrace.o(19458080899072L, 144974);
  }
  
  public final void onGeolocationPermissionsShowPrompt(final String paramString, final GeolocationPermissions.Callback paramCallback)
  {
    GMTrace.i(19458215116800L, 144975);
    com.tencent.mm.ui.base.h.a(this.fGo, false, this.fGo.getString(R.l.fcB, new Object[] { paramString }), this.fGo.getString(R.l.fcC), this.fGo.getString(R.l.dwr), this.fGo.getString(R.l.duP), new DialogInterface.OnClickListener()new DialogInterface.OnClickListener
    {
      public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
      {
        GMTrace.i(12069663408128L, 89926);
        paramCallback.invoke(paramString, true, true);
        GMTrace.o(12069663408128L, 89926);
      }
    }, new DialogInterface.OnClickListener()
    {
      public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
      {
        GMTrace.i(12088319672320L, 90065);
        paramCallback.invoke(paramString, false, false);
        GMTrace.o(12088319672320L, 90065);
      }
    });
    GMTrace.o(19458215116800L, 144975);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/webview/ui/tools/widget/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */