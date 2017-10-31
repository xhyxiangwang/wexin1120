package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.sns.model.AdLandingPagesProxy;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.p;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.u;
import com.tencent.mm.plugin.webview.ui.tools.widget.a.a;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.widget.MMWebView;
import com.tencent.xweb.WebView;
import com.tencent.xweb.j;
import com.tencent.xweb.k;
import com.tencent.xweb.l;
import com.tencent.xweb.n;

public final class h
  extends a
{
  public h(Context paramContext, p paramp, ViewGroup paramViewGroup)
  {
    super(paramContext, paramp, paramViewGroup);
    GMTrace.i(15277467107328L, 113826);
    GMTrace.o(15277467107328L, 113826);
  }
  
  protected final void biR()
  {
    GMTrace.i(15277601325056L, 113827);
    WebView localWebView;
    if ((u)biJ() != null)
    {
      localWebView = (WebView)getView();
      localObject = (u)biJ();
      if ((TextUtils.isEmpty(((u)localObject).url)) || (TextUtils.isEmpty(((u)localObject).qhb))) {
        break label126;
      }
    }
    label126:
    for (Object localObject = ab.k(((u)localObject).url, new String[] { "uxinfo=" + ((u)localObject).qhb, "uin=" + AdLandingPagesProxy.getInstance().getUin() });; localObject = ((u)localObject).url)
    {
      localWebView.loadUrl((String)localObject);
      GMTrace.o(15277601325056L, 113827);
      return;
    }
  }
  
  protected final View biS()
  {
    GMTrace.i(15277735542784L, 113828);
    MMWebView localMMWebView = a.a.sBN.cb(this.context);
    localMMWebView.getSettings().coO();
    localMMWebView.getSettings().coS();
    localMMWebView.getSettings().coR();
    localMMWebView.setWebViewClient(new n()
    {
      public final void a(WebView paramAnonymousWebView, int paramAnonymousInt, String paramAnonymousString1, String paramAnonymousString2)
      {
        GMTrace.i(20065952989184L, 149503);
        super.a(paramAnonymousWebView, paramAnonymousInt, paramAnonymousString1, paramAnonymousString2);
        w.i("AdLandingNewH5Comp", "recv err " + paramAnonymousInt + ", " + paramAnonymousString1 + ", " + paramAnonymousString2);
        GMTrace.o(20065952989184L, 149503);
      }
      
      public final void a(WebView paramAnonymousWebView, j paramAnonymousj, k paramAnonymousk)
      {
        GMTrace.i(20066087206912L, 149504);
        super.a(paramAnonymousWebView, paramAnonymousj, paramAnonymousk);
        w.i("AdLandingNewH5Comp", "onReceivedHttpError");
        GMTrace.o(20066087206912L, 149504);
      }
      
      public final void a(WebView paramAnonymousWebView, String paramAnonymousString)
      {
        GMTrace.i(20065818771456L, 149502);
        super.a(paramAnonymousWebView, paramAnonymousString);
        w.i("AdLandingNewH5Comp", "page finish " + paramAnonymousString);
        GMTrace.o(20065818771456L, 149502);
      }
      
      public final void b(WebView paramAnonymousWebView, String paramAnonymousString, Bitmap paramAnonymousBitmap)
      {
        GMTrace.i(20065684553728L, 149501);
        super.b(paramAnonymousWebView, paramAnonymousString, paramAnonymousBitmap);
        w.i("AdLandingNewH5Comp", "page start " + paramAnonymousString);
        GMTrace.o(20065684553728L, 149501);
      }
      
      public final void f(WebView paramAnonymousWebView, String paramAnonymousString)
      {
        GMTrace.i(20065550336000L, 149500);
        super.f(paramAnonymousWebView, paramAnonymousString);
        w.i("AdLandingNewH5Comp", "loadRes " + paramAnonymousString);
        GMTrace.o(20065550336000L, 149500);
      }
    });
    GMTrace.o(15277735542784L, 113828);
    return localMMWebView;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */