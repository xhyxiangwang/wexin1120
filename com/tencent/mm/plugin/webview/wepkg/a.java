package com.tencent.mm.plugin.webview.wepkg;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.webview.wepkg.ipc.WepkgMainProcessService;
import com.tencent.mm.plugin.webview.wepkg.model.BaseWepkgProcessTask;
import com.tencent.mm.plugin.webview.wepkg.model.WepkgCrossProcessTask;
import com.tencent.mm.plugin.webview.wepkg.model.WepkgPreloadFile;
import com.tencent.mm.plugin.webview.wepkg.model.WepkgVersion;
import com.tencent.mm.plugin.webview.wepkg.model.WepkgVersionManager;
import com.tencent.mm.plugin.webview.wepkg.model.f;
import com.tencent.mm.plugin.webview.wepkg.model.g;
import com.tencent.mm.plugin.webview.wepkg.utils.b.a;
import com.tencent.mm.plugin.webview.wepkg.utils.d;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.aj;
import com.tencent.mm.sdk.platformtools.aj.a;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.widget.MMWebView;
import com.tencent.xweb.WebView;
import com.tencent.xweb.j;
import com.tencent.xweb.k;
import com.tencent.xweb.n;
import java.io.File;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public final class a
{
  private static final Map<String, Boolean> sDB;
  public aj fnS;
  MMActivity jFp;
  public MMWebView jeA;
  public String mwd;
  public long sDA;
  public a sDC;
  private int sDD;
  public c sDE;
  public b sDF;
  a sDG;
  public boolean sDx;
  public f sDy;
  public WepkgVersion sDz;
  
  static
  {
    GMTrace.i(16887677190144L, 125823);
    sDB = Collections.synchronizedMap(new HashMap());
    GMTrace.o(16887677190144L, 125823);
  }
  
  public a(MMActivity paramMMActivity, MMWebView paramMMWebView)
  {
    GMTrace.i(16887408754688L, 125821);
    this.sDx = false;
    this.sDA = 0L;
    this.sDD = 0;
    this.fnS = new aj(new aj.a()
    {
      public final boolean pO()
      {
        GMTrace.i(18064900882432L, 134594);
        Object localObject = a.this;
        if (((a)localObject).sDC == null)
        {
          localObject = ((a)localObject).sDG;
          if (((a.a)localObject).aDC()) {
            break label70;
          }
          w.i("MicroMsg.Wepkg.WePkgPlugin", "white screen");
          af.u(new Runnable()
          {
            public final void run()
            {
              int i = 0;
              GMTrace.i(18064632446976L, 134592);
              try
              {
                w.i("MicroMsg.Wepkg.WePkgPlugin", "load url from net");
                a.this.sDx = false;
                a.this.jeA.loadUrl(a.this.mwd);
                Object localObject = a.this.jFp.getSharedPreferences("we_pkg_sp", 4);
                if (localObject != null) {
                  i = ((SharedPreferences)localObject).getInt("white_screen_times", 0);
                }
                if (i > 1)
                {
                  if (a.this.sDz != null) {
                    com.tencent.mm.plugin.webview.wepkg.utils.a.b("whiteScreen", a.this.mwd, a.this.sDz.sFu, a.this.sDz.version, -1L, 0L, null);
                  }
                  localObject = d.Mp(a.this.mwd);
                  com.tencent.mm.plugin.webview.wepkg.utils.b.sGc.sGe.remove(localObject);
                  g.Me((String)localObject);
                  localObject = a.this.jFp.getSharedPreferences("we_pkg_sp", 4);
                  if (localObject != null)
                  {
                    w.i("MicroMsg.Wepkg.WePkgPlugin", "disableWePkg");
                    ((SharedPreferences)localObject).edit().putBoolean("disable_we_pkg", true).commit();
                  }
                  GMTrace.o(18064632446976L, 134592);
                  return;
                }
                a.this.xT(i + 1);
                GMTrace.o(18064632446976L, 134592);
                return;
              }
              catch (Exception localException)
              {
                GMTrace.o(18064632446976L, 134592);
              }
            }
          });
        }
        for (;;)
        {
          GMTrace.o(18064900882432L, 134594);
          return false;
          localObject = ((a)localObject).sDC;
          break;
          label70:
          a.this.xT(0);
        }
      }
    }, false);
    this.sDE = new c();
    this.sDF = new b();
    this.sDG = new a()
    {
      public final boolean aDC()
      {
        GMTrace.i(18065169317888L, 134596);
        GMTrace.o(18065169317888L, 134596);
        return true;
      }
    };
    this.jFp = paramMMActivity;
    this.jeA = paramMMWebView;
    GMTrace.o(16887408754688L, 125821);
  }
  
  public a(MMActivity paramMMActivity, MMWebView paramMMWebView, int paramInt)
  {
    this(paramMMActivity, paramMMWebView);
    GMTrace.i(18065571971072L, 134599);
    this.sDD = paramInt;
    GMTrace.o(18065571971072L, 134599);
  }
  
  public final boolean bDT()
  {
    GMTrace.i(18065974624256L, 134602);
    if ((this.sDz == null) || (!this.sDz.sFK))
    {
      GMTrace.o(18065974624256L, 134602);
      return true;
    }
    GMTrace.o(18065974624256L, 134602);
    return false;
  }
  
  public final void jC(final boolean paramBoolean)
  {
    GMTrace.i(17619834896384L, 131278);
    w.i("MicroMsg.Wepkg.WePkgPlugin", "useWepkg:" + paramBoolean);
    af.u(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(18065437753344L, 134598);
        if (a.this.jeA != null)
        {
          String str = String.format("javascript:(function() {window.__usewepkg__=%s;})();", new Object[] { Boolean.valueOf(paramBoolean) });
          a.this.jeA.evaluateJavascript(str, null);
          GMTrace.o(18065437753344L, 134598);
          return;
        }
        w.i("MicroMsg.Wepkg.WePkgPlugin", "injectWepkgState, webview == null");
        GMTrace.o(18065437753344L, 134598);
      }
    });
    GMTrace.o(17619834896384L, 131278);
  }
  
  public final void onCreate(String paramString)
  {
    GMTrace.i(18065706188800L, 134600);
    if (this.sDD == 0) {
      this.sDD = this.jFp.hashCode();
    }
    com.tencent.mm.plugin.webview.wepkg.utils.b.sGb.add(Integer.valueOf(this.sDD));
    this.mwd = paramString;
    if (d.Ms(this.mwd)) {
      if (WepkgMainProcessService.WV())
      {
        w.i("MicroMsg.Wepkg.WePkgPlugin", "WepkgMainProcessService is live");
        this.sDy = g.Md(this.mwd);
        if ((this.sDy != null) && (this.sDy.sFa != null))
        {
          this.sDx = true;
          this.sDz = this.sDy.sFa;
        }
        d.xC().h(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(18066108841984L, 134603);
            WepkgVersionManager.cu(d.Mp(a.this.mwd), 0);
            GMTrace.o(18066108841984L, 134603);
          }
        }, 2000L);
        w.i("MicroMsg.Wepkg.WePkgPlugin", "wepkgAvailable:%s", new Object[] { Boolean.valueOf(this.sDx) });
        if ((this.sDx) && (this.sDz != null)) {
          com.tencent.mm.plugin.webview.wepkg.utils.a.b("EnterWeb", this.mwd, this.sDz.sFu, this.sDz.version, 1L, 0L, null);
        }
      }
    }
    for (;;)
    {
      w.i("MicroMsg.Wepkg.WePkgPlugin", "pkgid:%s,  wepkgAvailable:%b", new Object[] { d.Mp(paramString), Boolean.valueOf(this.sDx) });
      GMTrace.o(18065706188800L, 134600);
      return;
      w.i("MicroMsg.Wepkg.WePkgPlugin", "WepkgMainProcessService is dead");
      d.a(this.mwd, new com.tencent.mm.plugin.webview.wepkg.model.a()
      {
        public final void a(final BaseWepkgProcessTask paramAnonymousBaseWepkgProcessTask)
        {
          GMTrace.i(16887274536960L, 125820);
          if ((paramAnonymousBaseWepkgProcessTask instanceof WepkgCrossProcessTask))
          {
            paramAnonymousBaseWepkgProcessTask = ((WepkgCrossProcessTask)paramAnonymousBaseWepkgProcessTask).sFe;
            d.xC().C(new Runnable()
            {
              public final void run()
              {
                GMTrace.i(16887945625600L, 125825);
                g.Md(paramAnonymousBaseWepkgProcessTask);
                WepkgVersionManager.cu(d.Mp(paramAnonymousBaseWepkgProcessTask), 0);
                GMTrace.o(16887945625600L, 125825);
              }
            });
          }
          GMTrace.o(16887274536960L, 125820);
        }
      });
      com.tencent.mm.plugin.webview.wepkg.utils.a.b("EnterWeb", this.mwd, d.Mp(this.mwd), null, 0L, 0L, com.tencent.mm.plugin.webview.wepkg.utils.a.xV(10));
      continue;
      com.tencent.mm.plugin.webview.wepkg.utils.a.b("EnterWeb", this.mwd, d.Mp(this.mwd), null, 2L, 0L, null);
    }
  }
  
  public final void onDestroy()
  {
    GMTrace.i(18065840406528L, 134601);
    if (com.tencent.mm.plugin.webview.wepkg.utils.b.sGb.contains(Integer.valueOf(this.sDD))) {
      com.tencent.mm.plugin.webview.wepkg.utils.b.sGb.remove(Integer.valueOf(this.sDD));
    }
    if (com.tencent.mm.plugin.webview.wepkg.utils.b.sGb.size() == 0)
    {
      com.tencent.mm.plugin.webview.wepkg.utils.b.sGc.sGe.clear();
      w.i("MicroMsg.Wepkg.WePkgPlugin", "clear wepkg info in memory");
    }
    GMTrace.o(18065840406528L, 134601);
  }
  
  public final void xT(int paramInt)
  {
    GMTrace.i(16887542972416L, 125822);
    SharedPreferences localSharedPreferences = this.jFp.getSharedPreferences("we_pkg_sp", 4);
    if (localSharedPreferences != null) {
      localSharedPreferences.edit().putInt("white_screen_times", paramInt).commit();
    }
    GMTrace.o(16887542972416L, 125822);
  }
  
  public static abstract interface a
  {
    public abstract boolean aDC();
  }
  
  public final class b
    extends com.tencent.xweb.x5.a.a.a.a.b
  {
    public b()
    {
      GMTrace.i(16888079843328L, 125826);
      GMTrace.o(16888079843328L, 125826);
    }
    
    public final Object onMiscCallBack(String paramString, Bundle paramBundle)
    {
      boolean bool = false;
      GMTrace.i(16888214061056L, 125827);
      if (paramBundle == null) {
        bool = true;
      }
      w.i("MicroMsg.Wepkg.WePkgPlugin", "method = %s, bundler == null ? %b", new Object[] { paramString, Boolean.valueOf(bool) });
      if ((bg.mZ(paramString)) || (paramBundle == null))
      {
        GMTrace.o(16888214061056L, 125827);
        return null;
      }
      if ((a.this.sDx) && (a.this.sDy != null) && (paramString.equalsIgnoreCase("shouldInterceptMediaUrl")))
      {
        paramBundle = paramBundle.getString("url");
        w.i("MicroMsg.Wepkg.WePkgPlugin", "onMiscCallBack origin mediaUrl:" + paramBundle);
        if (!bg.mZ(paramBundle))
        {
          w.i("MicroMsg.Wepkg.WePkgPlugin", "onMiscCallBack replace localPath");
          paramString = a.this.sDy;
          paramBundle = d.Mr(paramBundle);
          if ((!bg.mZ(paramBundle)) && (paramString.sFl != null) && (paramString.sFl.get(paramBundle) != null))
          {
            paramString = (WepkgPreloadFile)paramString.sFl.get(paramBundle);
            if (!bg.mZ(paramString.filePath))
            {
              paramBundle = new File(paramString.filePath);
              if ((!paramBundle.exists()) || (!paramBundle.isFile()) || (paramBundle.length() != paramString.size)) {}
            }
          }
          for (paramString = paramString.filePath; !bg.mZ(paramString); paramString = null)
          {
            w.i("MicroMsg.Wepkg.WePkgPlugin", "localFile:" + paramString);
            GMTrace.o(16888214061056L, 125827);
            return paramString;
          }
        }
      }
      GMTrace.o(16888214061056L, 125827);
      return null;
    }
  }
  
  public final class c
    extends n
  {
    public c()
    {
      GMTrace.i(16886469230592L, 125814);
      GMTrace.o(16886469230592L, 125814);
    }
    
    public final k a(WebView paramWebView, j paramj)
    {
      GMTrace.i(19383321624576L, 144417);
      if ((paramj == null) || (paramj.getUrl() == null) || (bg.mZ(paramj.getUrl().toString())))
      {
        GMTrace.o(19383321624576L, 144417);
        return null;
      }
      if (a.this.sDx)
      {
        paramWebView = null;
        if (a.this.sDy != null)
        {
          paramWebView = paramj.getUrl().toString();
          paramWebView = a.this.sDy.Mc(d.Mr(paramWebView));
        }
        if (paramWebView != null)
        {
          w.i("MicroMsg.Wepkg.WePkgPlugin", "shouldInterceptRequest, url = %s, method = %s, isForMainFrame = %b", new Object[] { paramj.getUrl(), paramj.getMethod(), Boolean.valueOf(paramj.isForMainFrame()) });
          if (a.this.sDz != null) {
            com.tencent.mm.plugin.webview.wepkg.utils.a.b("RequestHook", paramj.getUrl().toString(), a.this.sDz.sFu, a.this.sDz.version, 1L, 0L, null);
          }
          GMTrace.o(19383321624576L, 144417);
          return paramWebView;
        }
        if (a.this.sDz != null) {
          com.tencent.mm.plugin.webview.wepkg.utils.a.b("RequestHook", paramj.getUrl().toString(), a.this.sDz.sFu, a.this.sDz.version, 0L, 0L, null);
        }
      }
      GMTrace.o(19383321624576L, 144417);
      return null;
    }
    
    public final k a(WebView paramWebView, j paramj, Bundle paramBundle)
    {
      GMTrace.i(19383455842304L, 144418);
      if ((paramj == null) || (paramj.getUrl() == null) || (bg.mZ(paramj.getUrl().toString())))
      {
        GMTrace.o(19383455842304L, 144418);
        return null;
      }
      if (a.this.sDx)
      {
        paramWebView = null;
        if (a.this.sDy != null)
        {
          paramWebView = paramj.getUrl().toString();
          paramWebView = a.this.sDy.Mc(d.Mr(paramWebView));
        }
        if (paramWebView != null)
        {
          w.i("MicroMsg.Wepkg.WePkgPlugin", "shouldInterceptRequest, url = %s, method = %s, isForMainFrame = %b", new Object[] { paramj.getUrl(), paramj.getMethod(), Boolean.valueOf(paramj.isForMainFrame()) });
          if (a.this.sDz != null) {
            com.tencent.mm.plugin.webview.wepkg.utils.a.b("RequestHook", paramj.getUrl().toString(), a.this.sDz.sFu, a.this.sDz.version, 1L, 0L, null);
          }
          GMTrace.o(19383455842304L, 144418);
          return paramWebView;
        }
        if (a.this.sDz != null) {
          com.tencent.mm.plugin.webview.wepkg.utils.a.b("RequestHook", paramj.getUrl().toString(), a.this.sDz.sFu, a.this.sDz.version, 0L, 0L, null);
        }
      }
      GMTrace.o(19383455842304L, 144418);
      return null;
    }
    
    public final void a(WebView paramWebView, String paramString)
    {
      GMTrace.i(19383053189120L, 144415);
      w.d("MicroMsg.Wepkg.WePkgPlugin", "onPageFinished, url = %s", new Object[] { paramString });
      long l;
      String str;
      if (a.this.sDA != 0L)
      {
        l = System.currentTimeMillis() - a.this.sDA;
        str = d.Mp(paramString);
        if (bg.mZ(str))
        {
          com.tencent.mm.plugin.webview.wepkg.utils.a.b("PageLoadTime", paramString, "", null, 2L, l, null);
          a.this.sDA = 0L;
        }
      }
      else if ((a.this.sDx) && (a.this.sDy != null))
      {
        if (a.this.sDy.Mc(d.Mr(a.this.mwd)) == null) {
          break label255;
        }
      }
      label255:
      for (int i = 1;; i = 0)
      {
        if (i != 0)
        {
          w.i("MicroMsg.Wepkg.WePkgPlugin", "startTimer");
          a.this.fnS.w(1000L, 1000L);
        }
        a.this.jC(a.this.sDx);
        super.a(paramWebView, paramString);
        GMTrace.o(19383053189120L, 144415);
        return;
        if ((a.this.sDx) && (a.this.sDz != null))
        {
          com.tencent.mm.plugin.webview.wepkg.utils.a.b("PageLoadTime", paramString, a.this.sDz.sFu, a.this.sDz.version, 1L, l, null);
          break;
        }
        com.tencent.mm.plugin.webview.wepkg.utils.a.b("PageLoadTime", paramString, str, null, 0L, l, null);
        break;
      }
    }
    
    public final void b(WebView paramWebView, String paramString, Bitmap paramBitmap)
    {
      GMTrace.i(19382918971392L, 144414);
      w.d("MicroMsg.Wepkg.WePkgPlugin", "onPageStarted, url = %s", new Object[] { paramString });
      a.this.sDA = System.currentTimeMillis();
      a.this.jC(a.this.sDx);
      super.b(paramWebView, paramString, paramBitmap);
      GMTrace.o(19382918971392L, 144414);
    }
    
    public final k e(WebView paramWebView, String paramString)
    {
      GMTrace.i(19383187406848L, 144416);
      if (a.this.sDx)
      {
        paramWebView = null;
        if (a.this.sDy != null) {
          paramWebView = a.this.sDy.Mc(d.Mr(paramString));
        }
        if (paramWebView != null)
        {
          w.i("MicroMsg.Wepkg.WePkgPlugin", "shouldInterceptRequest, url = %s", new Object[] { paramString });
          if (a.this.sDz != null) {
            com.tencent.mm.plugin.webview.wepkg.utils.a.b("RequestHook", paramString, a.this.sDz.sFu, a.this.sDz.version, 1L, 0L, null);
          }
          GMTrace.o(19383187406848L, 144416);
          return paramWebView;
        }
        if (a.this.sDz != null) {
          com.tencent.mm.plugin.webview.wepkg.utils.a.b("RequestHook", paramString, a.this.sDz.sFu, a.this.sDz.version, 0L, 0L, null);
        }
      }
      GMTrace.o(19383187406848L, 144416);
      return null;
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/webview/wepkg/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */