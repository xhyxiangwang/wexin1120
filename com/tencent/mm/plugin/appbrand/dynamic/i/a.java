package com.tencent.mm.plugin.appbrand.dynamic.i;

import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.util.Pair;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ac.b.a;
import com.tencent.mm.ipcinvoker.g;
import com.tencent.mm.ipcinvoker.i;
import com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo;
import com.tencent.mm.plugin.appbrand.appcache.c.a;
import com.tencent.mm.plugin.appbrand.appcache.j;
import com.tencent.mm.plugin.appbrand.appcache.m;
import com.tencent.mm.plugin.appbrand.appcache.v;
import com.tencent.mm.plugin.appbrand.appcache.w.a;
import com.tencent.mm.plugin.appbrand.appcache.w.a.a;
import com.tencent.mm.plugin.appbrand.appcache.w.a.b;
import com.tencent.mm.plugin.appbrand.config.AppBrandGlobalSystemConfig;
import com.tencent.mm.plugin.appbrand.dynamic.debugger.DebuggerInfo;
import com.tencent.mm.plugin.appbrand.dynamic.launching.WidgetRuntimeConfig;
import com.tencent.mm.plugin.appbrand.dynamic.launching.WidgetSysConfig;
import com.tencent.mm.plugin.appbrand.dynamic.launching.d.a;
import com.tencent.mm.plugin.appbrand.widget.n;
import com.tencent.mm.protocal.c.aeq;
import com.tencent.mm.protocal.c.aer;
import com.tencent.mm.protocal.c.bru;
import com.tencent.mm.protocal.c.brv;
import com.tencent.mm.protocal.c.brw;
import com.tencent.mm.protocal.c.btj;
import com.tencent.mm.protocal.c.lq;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.w;
import java.io.IOException;
import java.util.LinkedList;

public final class a
{
  public static d a(String paramString, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    GMTrace.i(18339778789376L, 136642);
    Bundle localBundle = new Bundle();
    localBundle.putString("appId", paramString);
    localBundle.putInt("pkgType", paramInt1);
    localBundle.putInt("pkgVersion", paramInt2);
    localBundle.putInt("widgetType", paramInt3);
    localBundle.putInt("scene", paramInt4);
    localBundle = (Bundle)com.tencent.mm.ipcinvoker.e.a("com.tencent.mm", localBundle, c.class);
    if (localBundle == null)
    {
      GMTrace.o(18339778789376L, 136642);
      return null;
    }
    d locald = new d();
    locald.appId = paramString;
    locald.iNc = ((DebuggerInfo)localBundle.getParcelable("debuggerInfo"));
    paramString = localBundle.getByteArray("jsApiInfo");
    if (paramString != null) {
      locald.iNg = new lq();
    }
    try
    {
      locald.iNg.aC(paramString);
      paramString = localBundle.getByteArray("launchAction");
      if (paramString != null) {
        locald.iNf = new brv();
      }
    }
    catch (IOException paramString)
    {
      try
      {
        locald.iNf.aC(paramString);
        paramString = localBundle.getByteArray("versionInfo");
        if (paramString != null) {
          locald.iNh = new brw();
        }
      }
      catch (IOException paramString)
      {
        try
        {
          for (;;)
          {
            locald.iNh.aC(paramString);
            locald.iNd = ((WidgetSysConfig)localBundle.getParcelable("sysConfig"));
            locald.iNe = ((WidgetRuntimeConfig)localBundle.getParcelable("runtimeConfig"));
            if (locald.iNe == null) {
              locald.iNe = new WidgetRuntimeConfig();
            }
            GMTrace.o(18339778789376L, 136642);
            return locald;
            paramString = paramString;
            w.v("MicroMsg.DynamicPkgUpdater", "parseFrom bytes failed : %s", new Object[] { paramString });
          }
          paramString = paramString;
          w.v("MicroMsg.DynamicPkgUpdater", "parseFrom bytes failed : %s", new Object[] { paramString });
        }
        catch (IOException paramString)
        {
          for (;;)
          {
            w.v("MicroMsg.DynamicPkgUpdater", "parseFrom bytes failed : %s", new Object[] { paramString });
          }
        }
      }
    }
  }
  
  public static WxaPkgWrappingInfo d(String paramString1, String paramString2, int paramInt1, int paramInt2)
  {
    GMTrace.i(17844381155328L, 132951);
    Bundle localBundle = new Bundle();
    localBundle.putString("appId", paramString1);
    localBundle.putInt("pkgType", paramInt1);
    localBundle.putInt("pkgVersion", paramInt2);
    localBundle.putString("searchId", paramString2);
    paramString2 = com.tencent.mm.plugin.appbrand.dynamic.b.e.pp(w(paramString1, paramInt1, paramInt2));
    if (paramString2 != null)
    {
      GMTrace.o(17844381155328L, 132951);
      return paramString2;
    }
    paramString2 = (WxaPkgWrappingInfo)com.tencent.mm.ipcinvoker.e.a("com.tencent.mm", localBundle, a.class);
    if (paramString2 != null) {
      com.tencent.mm.plugin.appbrand.dynamic.b.e.a(w(paramString1, paramInt1, paramInt2), paramString2);
    }
    GMTrace.o(17844381155328L, 132951);
    return paramString2;
  }
  
  private static String w(String paramString, int paramInt1, int paramInt2)
  {
    GMTrace.i(17725061595136L, 132062);
    paramString = paramString + "#" + paramInt1 + "#" + paramInt2;
    GMTrace.o(17725061595136L, 132062);
    return paramString;
  }
  
  private static class a
    implements i<Bundle, WxaPkgWrappingInfo>
  {
    private a()
    {
      GMTrace.i(17722914111488L, 132046);
      GMTrace.o(17722914111488L, 132046);
    }
    
    private static WxaPkgWrappingInfo r(Bundle paramBundle)
    {
      GMTrace.i(18341255184384L, 136653);
      String str = paramBundle.getString("appId");
      int j = paramBundle.getInt("pkgType");
      int i = paramBundle.getInt("pkgVersion");
      paramBundle.getInt("scene");
      Object localObject1 = paramBundle.getString("searchId");
      switch (j)
      {
      default: 
        paramBundle = "";
      }
      try
      {
        localObject2 = ((com.tencent.mm.plugin.appbrand.a.a)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.appbrand.a.a.class)).RT().a(str, j, new String[] { "downloadURL", "version" });
        if (localObject2 != null)
        {
          paramBundle = ((com.tencent.mm.plugin.appbrand.appcache.r)localObject2).field_downloadURL;
          i = ((com.tencent.mm.plugin.appbrand.appcache.r)localObject2).field_version;
        }
        paramBundle = new com.tencent.mm.plugin.appbrand.dynamic.launching.c(str, (String)localObject1, j, i, com.tencent.mm.plugin.appbrand.dynamic.launching.c.iMs, paramBundle).UY();
        GMTrace.o(18341255184384L, 136653);
        return paramBundle;
      }
      catch (Exception paramBundle)
      {
        for (;;)
        {
          Object localObject2;
          int k;
          bru localbru;
          label493:
          label908:
          w.e("MicroMsg.DynamicPkgUpdater", "CheckWidgetPkg error : %s", new Object[] { paramBundle });
        }
      }
      if (new com.tencent.mm.plugin.appbrand.dynamic.launching.d(str, "", "", (byte)0).Va() == d.a.iMz - 1)
      {
        paramBundle = ((com.tencent.mm.plugin.appbrand.a.a)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.appbrand.a.a.class)).RT().a(str, j, new String[] { "downloadURL" });
        if (paramBundle == null)
        {
          w.e("MicroMsg.DynamicPkgUpdater", "WxaPkgManifestRecord(%s, %d) is null.", new Object[] { str, Integer.valueOf(j) });
          GMTrace.o(18341255184384L, 136653);
          return null;
        }
        try
        {
          paramBundle = new com.tencent.mm.plugin.appbrand.dynamic.launching.c(str, (String)localObject1, j, i, com.tencent.mm.plugin.appbrand.dynamic.launching.c.iMs, paramBundle.field_downloadURL).UY();
          GMTrace.o(18341255184384L, 136653);
          return paramBundle;
        }
        catch (Exception paramBundle)
        {
          w.e("MicroMsg.DynamicPkgUpdater", "getWxaPkgInfo(%s, %d) error : %s", new Object[] { str, Integer.valueOf(j), paramBundle });
          GMTrace.o(18341255184384L, 136653);
          return null;
        }
        paramBundle = (WxaPkgWrappingInfo)com.tencent.mm.plugin.appbrand.appcache.q.p(str, j, i).second;
        GMTrace.o(18341255184384L, 136653);
        return paramBundle;
        paramBundle = ((com.tencent.mm.plugin.appbrand.a.a)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.appbrand.a.a.class)).RT().a(str, j, new String[] { "downloadURL" });
        com.tencent.mm.kernel.h.xx();
        k = com.tencent.mm.kernel.a.wy();
        localObject1 = new b.a();
        localObject2 = new aeq();
        ((aeq)localObject2).fKY = str;
        ((aeq)localObject2).uan = k;
        localbru = new bru();
        switch (j)
        {
        default: 
          localbru.tCf = 0;
          localbru.uGS = 0;
          if (paramBundle != null)
          {
            localbru.fwU = paramBundle.field_versionMd5;
            ((aeq)localObject2).uao = new LinkedList();
            ((aeq)localObject2).uao.add(localbru);
            ((b.a)localObject1).hlX = ((com.tencent.mm.bl.a)localObject2);
            ((b.a)localObject1).hlY = new aer();
            ((b.a)localObject1).uri = "/cgi-bin/mmbiz-bin/wxaapp/getwidgetinfo";
            ((b.a)localObject1).hlW = 1186;
            paramBundle = com.tencent.mm.plugin.appbrand.g.c.b(((b.a)localObject1).DA());
            if ((paramBundle.errType != 0) || (paramBundle.errCode != 0)) {
              break label908;
            }
            paramBundle = (aer)paramBundle.fPm;
            if ((paramBundle != null) && (paramBundle.uao != null) && (paramBundle.uao.size() > 0))
            {
              paramBundle = (bru)paramBundle.uao.getFirst();
              w.i("MicroMsg.DynamicPkgUpdater", "getWidgetInfo debugType %d, md5 %s, url %s", new Object[] { Integer.valueOf(j), paramBundle.fwU, paramBundle.url });
              if ((paramBundle.url != null) && (paramBundle.url.length() > 0)) {
                switch (j)
                {
                }
              }
            }
          }
          break;
        }
        for (;;)
        {
          paramBundle = (WxaPkgWrappingInfo)com.tencent.mm.plugin.appbrand.appcache.q.p(str, j, i).second;
          GMTrace.o(18341255184384L, 136653);
          return paramBundle;
          localbru.tCf = 1;
          localbru.uGS = 1;
          break;
          localbru.tCf = 2;
          localbru.uGS = 1;
          break;
          localbru.fwU = "";
          break label493;
          ((com.tencent.mm.plugin.appbrand.a.a)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.appbrand.a.a.class)).RT().a(str, 10000, paramBundle.url, paramBundle.fwU, 0L, 0L);
          continue;
          ((com.tencent.mm.plugin.appbrand.a.a)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.appbrand.a.a.class)).RT().a(str, 10001, paramBundle.url, paramBundle.fwU, 0L, 0L);
          continue;
          ((com.tencent.mm.plugin.appbrand.a.a)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.appbrand.a.a.class)).RT().a(str, 10100, paramBundle.url, paramBundle.fwU, 0L, 0L);
          continue;
          ((com.tencent.mm.plugin.appbrand.a.a)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.appbrand.a.a.class)).RT().a(str, 10101, paramBundle.url, paramBundle.fwU, 0L, 0L);
          continue;
          w.i("MicroMsg.DynamicPkgUpdater", "cgi fail errType %d, errCode %d,errMsg %s, appid %s , pkgType %d", new Object[] { Integer.valueOf(paramBundle.errType), Integer.valueOf(paramBundle.errCode), paramBundle.ftU, str, Integer.valueOf(j) });
        }
        paramBundle = "";
        try
        {
          localObject2 = ((com.tencent.mm.plugin.appbrand.a.a)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.appbrand.a.a.class)).RT().a(str, j, new String[] { "downloadURL", "version" });
          if (localObject2 != null)
          {
            paramBundle = ((com.tencent.mm.plugin.appbrand.appcache.r)localObject2).field_downloadURL;
            i = ((com.tencent.mm.plugin.appbrand.appcache.r)localObject2).field_version;
          }
          paramBundle = new com.tencent.mm.plugin.appbrand.dynamic.launching.c(str, (String)localObject1, j, i, com.tencent.mm.plugin.appbrand.dynamic.launching.c.iMt, paramBundle).UY();
          GMTrace.o(18341255184384L, 136653);
          return paramBundle;
        }
        catch (Exception paramBundle)
        {
          w.e("MicroMsg.DynamicPkgUpdater", "CheckWidgetPkg error : %s", new Object[] { paramBundle });
        }
      }
      GMTrace.o(18341255184384L, 136653);
      return null;
    }
  }
  
  private static class b
    implements g<Bundle, Bundle>
  {
    private b()
    {
      GMTrace.i(17785996443648L, 132516);
      GMTrace.o(17785996443648L, 132516);
    }
  }
  
  private static class c
    implements i<Bundle, Bundle>
  {
    private c()
    {
      GMTrace.i(17843978502144L, 132948);
      GMTrace.o(17843978502144L, 132948);
    }
    
    private static Bundle l(Bundle paramBundle)
    {
      boolean bool2 = true;
      GMTrace.i(17844112719872L, 132949);
      Object localObject1 = paramBundle.getString("appId");
      int i = paramBundle.getInt("pkgType");
      int j = paramBundle.getInt("pkgVersion");
      int k = paramBundle.getInt("scene");
      int m = paramBundle.getInt("widgetType");
      paramBundle = new Bundle();
      try
      {
        localObject3 = new com.tencent.mm.plugin.appbrand.dynamic.launching.b((String)localObject1, i, j, k, m).UX();
        if (localObject3 == null)
        {
          GMTrace.o(17844112719872L, 132949);
          return paramBundle;
        }
        if (((n)localObject3).field_jsApiInfo != null) {
          paramBundle.putByteArray("jsApiInfo", ((n)localObject3).field_jsApiInfo.toByteArray());
        }
        if (((n)localObject3).field_launchAction != null) {
          paramBundle.putByteArray("launchAction", ((n)localObject3).field_launchAction.toByteArray());
        }
        if (((n)localObject3).field_versionInfo != null) {
          paramBundle.putByteArray("versionInfo", ((n)localObject3).field_versionInfo.toByteArray());
        }
        localObject2 = new WidgetRuntimeConfig();
        ((WidgetRuntimeConfig)localObject2).appId = ((String)localObject1);
        ((WidgetRuntimeConfig)localObject2).iMr = m;
        localObject3 = ((n)localObject3).field_widgetSetting;
        if (localObject3 != null)
        {
          ((WidgetRuntimeConfig)localObject2).iMG = ((btj)localObject3).uHX;
          ((WidgetRuntimeConfig)localObject2).iMI = ((btj)localObject3).uHZ;
          ((WidgetRuntimeConfig)localObject2).iMH = ((btj)localObject3).uHY;
        }
        paramBundle.putParcelable("runtimeConfig", (Parcelable)localObject2);
      }
      catch (Exception localException)
      {
        for (;;)
        {
          Object localObject3;
          Object localObject2;
          w.w("MicroMsg.DynamicPkgUpdater", "check widget launch info error : %s", new Object[] { localException });
          continue;
          boolean bool1 = false;
          continue;
          bool1 = false;
          continue;
          bool1 = false;
        }
      }
      localObject2 = ((com.tencent.mm.plugin.appbrand.widget.a.a)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.appbrand.widget.a.a.class)).Sd().st((String)localObject1);
      localObject1 = com.tencent.mm.plugin.appbrand.dynamic.debugger.b.pq((String)localObject1);
      localObject3 = new DebuggerInfo();
      if ((localObject2 != null) && (((com.tencent.mm.plugin.appbrand.widget.q)localObject2).field_openDebug))
      {
        bool1 = true;
        ((DebuggerInfo)localObject3).iLf = bool1;
        if ((!c.a.fx(i)) && ((localObject1 == null) || (!((DebuggerInfo)localObject1).iLe))) {
          break label439;
        }
        bool1 = true;
        ((DebuggerInfo)localObject3).iLe = bool1;
        if ((localObject1 == null) || (!((DebuggerInfo)localObject1).iLg)) {
          break label445;
        }
        bool1 = bool2;
        ((DebuggerInfo)localObject3).iLg = bool1;
        paramBundle.putParcelable("debuggerInfo", (Parcelable)localObject3);
        localObject1 = AppBrandGlobalSystemConfig.Uj();
        localObject2 = new WidgetSysConfig();
        ((WidgetSysConfig)localObject2).iIj = ((AppBrandGlobalSystemConfig)localObject1).iIj;
        ((WidgetSysConfig)localObject2).iIk = ((AppBrandGlobalSystemConfig)localObject1).iIk;
        ((WidgetSysConfig)localObject2).iIl = ((AppBrandGlobalSystemConfig)localObject1).iIl;
        paramBundle.putParcelable("sysConfig", (Parcelable)localObject2);
        GMTrace.o(17844112719872L, 132949);
        return paramBundle;
      }
    }
  }
  
  private static class d
    implements i<Bundle, WxaPkgWrappingInfo>
  {
    private d()
    {
      GMTrace.i(17721840369664L, 132038);
      GMTrace.o(17721840369664L, 132038);
    }
    
    private static WxaPkgWrappingInfo Vg()
    {
      GMTrace.i(17721974587392L, 132039);
      for (;;)
      {
        try
        {
          new com.tencent.mm.plugin.appbrand.dynamic.launching.a();
          ab.bNb();
          localObject1 = new j().bU(false);
          if (localObject1 == null) {
            continue;
          }
          ((WxaPkgWrappingInfo)localObject1).iCy = 0;
        }
        catch (Exception localException)
        {
          Object localObject1;
          WxaPkgWrappingInfo localWxaPkgWrappingInfo;
          w.e("MicroMsg.DynamicPkgUpdater", "getLibPkgInfo error : %s", new Object[] { Log.getStackTraceString(localException) });
          Object localObject2 = null;
          continue;
        }
        GMTrace.o(17721974587392L, 132039);
        return (WxaPkgWrappingInfo)localObject1;
        localWxaPkgWrappingInfo = new j().bU(true);
        localObject1 = localWxaPkgWrappingInfo;
        if (localWxaPkgWrappingInfo == null)
        {
          localWxaPkgWrappingInfo = com.tencent.mm.plugin.appbrand.appcache.a.nY("@LibraryAppId");
          localObject1 = localWxaPkgWrappingInfo;
          if (localWxaPkgWrappingInfo == null) {
            localObject1 = m.Sw();
          }
        }
      }
    }
  }
  
  private static class e
    implements g<Bundle, Bundle>
  {
    private e()
    {
      GMTrace.i(17723853635584L, 132053);
      GMTrace.o(17723853635584L, 132053);
    }
  }
  
  public static abstract interface f
  {
    public abstract void H(String paramString, boolean paramBoolean);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/dynamic/i/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */