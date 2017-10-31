package com.tencent.mm.plugin.appbrand.appcache;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ac.b;
import com.tencent.mm.ac.b.c;
import com.tencent.mm.ac.u.a;
import com.tencent.mm.kernel.a;
import com.tencent.mm.plugin.appbrand.app.f;
import com.tencent.mm.protocal.c.atv;
import com.tencent.mm.protocal.c.bsg;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import com.tencent.mm.storage.w.a;

public enum k
{
  static
  {
    GMTrace.i(10614609018880L, 79085);
    iAY = new k[0];
    GMTrace.o(10614609018880L, 79085);
  }
  
  private static void a(int paramInt1, int paramInt2, String paramString, bsg parambsg, a parama)
  {
    GMTrace.i(19688398520320L, 146690);
    if ((com.tencent.mm.kernel.h.xx().wM()) && (parama == a.iBa))
    {
      long l = bg.Po();
      com.tencent.mm.kernel.h.xz().xi().a(w.a.uYJ, Long.valueOf(86400L + l));
    }
    if ((paramInt1 != 0) || (paramInt2 != 0))
    {
      w.e("MicroMsg.WxaCommLibVersionChecker", "onResp, errType = %d, errCode = %d, errMsg = %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
      GMTrace.o(19688398520320L, 146690);
      return;
    }
    if (parambsg == null)
    {
      w.e("MicroMsg.WxaCommLibVersionChecker", "onResp, null response");
      GMTrace.o(19688398520320L, 146690);
      return;
    }
    if (f.Sh() != null)
    {
      paramString = f.Sh();
      if ((parambsg.version < 0) || (bg.mZ(parambsg.url)) || (bg.mZ(parambsg.fwU))) {
        w.e("MicroMsg.AppBrandWxaPkgStorage", "flushLibPkgVersionInfo, invalid resp: version( %d ), url( %s ), md5( %s )", new Object[] { Integer.valueOf(parambsg.version), parambsg.url, parambsg.fwU });
      }
      for (boolean bool = false;; bool = paramString.a("@LibraryAppId", 0, parambsg.version, parambsg.fwU, parambsg.url))
      {
        w.i("MicroMsg.WxaCommLibVersionChecker", "onResp, updateRet = %b, version = %d, forceUpdate = %d, md5 = %s, url = %s", new Object[] { Boolean.valueOf(bool), Integer.valueOf(parambsg.version), Integer.valueOf(parambsg.upn), parambsg.fwU, parambsg.url });
        if (bool)
        {
          com.tencent.mm.sdk.f.e.post(new Runnable()
          {
            public final void run()
            {
              GMTrace.i(16342216343552L, 121759);
              new j().bU(true);
              GMTrace.o(16342216343552L, 121759);
            }
          }, "WxaCommLibUpdate");
          paramString = new h();
          paramString.field_key = "@LibraryAppId";
          paramString.field_version = parambsg.version;
          if (!f.Sn().b(paramString, new String[] { "key", "version" }))
          {
            paramString.field_updateTime = bg.Po();
            paramString.field_scene = (parama.ordinal() + 1);
            f.Sn().b(paramString);
          }
        }
        GMTrace.o(19688398520320L, 146690);
        return;
        if (parambsg.upn > 0)
        {
          paramInt1 = paramString.iCj.delete("AppBrandWxaPkgManifestRecord", String.format("%s=? and %s=? and %s>?", new Object[] { "appId", "debugType", "version" }), new String[] { "@LibraryAppId", "0", String.valueOf(parambsg.version) });
          w.i("MicroMsg.AppBrandWxaPkgStorage", "flushLibPkgVersionInfo, delete manifest.version > %d, ret = %d", new Object[] { Integer.valueOf(parambsg.version), Integer.valueOf(paramInt1) });
        }
      }
    }
    w.e("MicroMsg.WxaCommLibVersionChecker", "onResp, null storage");
    GMTrace.o(19688398520320L, 146690);
  }
  
  public static void a(atv paramatv)
  {
    GMTrace.i(15544291950592L, 115814);
    if (paramatv != null)
    {
      bsg localbsg = new bsg();
      localbsg.url = paramatv.url;
      localbsg.fwU = paramatv.fwU;
      localbsg.version = paramatv.version;
      localbsg.upn = paramatv.upn;
      a(0, 0, null, localbsg, a.iBc);
    }
    GMTrace.o(15544291950592L, 115814);
  }
  
  public static void a(bsg parambsg)
  {
    GMTrace.i(19688532738048L, 146691);
    a(0, 0, null, parambsg, a.iBb);
    GMTrace.o(19688532738048L, 146691);
  }
  
  public static void bV(boolean paramBoolean)
  {
    GMTrace.i(19688264302592L, 146689);
    com.tencent.mm.sdk.f.e.post(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(10597429149696L, 78957);
        if (this.iAZ)
        {
          w.i("MicroMsg.WxaCommLibVersionChecker", "cgiCheckUpdate, force true");
          com.tencent.mm.kernel.h.xz().xi().a(w.a.uYJ, Long.valueOf(bg.Po() - 1L));
        }
        k.Sv();
        GMTrace.o(10597429149696L, 78957);
      }
    }, "WxaCommLibVersionChecker");
    GMTrace.o(19688264302592L, 146689);
  }
  
  public static enum a
  {
    static
    {
      GMTrace.i(19690277568512L, 146704);
      iBa = new a("CGI", 0);
      iBb = new a("NewXml", 1);
      iBc = new a("Launch", 2);
      iBd = new a[] { iBa, iBb, iBc };
      GMTrace.o(19690277568512L, 146704);
    }
    
    private a()
    {
      GMTrace.i(19690143350784L, 146703);
      GMTrace.o(19690143350784L, 146703);
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/appcache/k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */