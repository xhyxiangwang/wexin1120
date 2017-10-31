package com.tencent.mm.plugin.appbrand.appcache;

import android.content.Context;
import android.widget.Toast;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ac.d.a;
import com.tencent.mm.platformtools.n;
import com.tencent.mm.plugin.appbrand.app.f;
import com.tencent.mm.plugin.appbrand.c.j;
import com.tencent.mm.plugin.appbrand.config.k.c;
import com.tencent.mm.plugin.appbrand.config.p;
import com.tencent.mm.plugin.appbrand.config.q;
import com.tencent.mm.plugin.appbrand.debugger.a;
import com.tencent.mm.plugin.appbrand.p.i;
import com.tencent.mm.protocal.c.bls;
import com.tencent.mm.protocal.c.bsg;
import com.tencent.mm.protocal.c.bu;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.bh;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.x.bp.a;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public final class t
  implements bp.a
{
  public static final Map<String, c> iBS;
  
  static
  {
    GMTrace.i(10601187246080L, 78985);
    HashMap localHashMap = new HashMap();
    localHashMap.put("AppBrandNotify", new b());
    localHashMap.put("AppPublicLibraryNotify", new d());
    localHashMap.put("mmbizwxaconfig", new a());
    localHashMap.put("ForceOpenAppNotify", new com.tencent.mm.plugin.appbrand.debugger.b());
    localHashMap.put("AppBrandForceKill", new a());
    iBS = Collections.unmodifiableMap(localHashMap);
    GMTrace.o(10601187246080L, 78985);
  }
  
  public t()
  {
    GMTrace.i(10600784592896L, 78982);
    GMTrace.o(10600784592896L, 78982);
  }
  
  public static void ob(String paramString)
  {
    GMTrace.i(16057808977920L, 119640);
    if (f.Sh() == null)
    {
      w.e("MicroMsg.AppBrand.WxaPkgPushingXmlHandler", "parseAndDownload, but storage not ready");
      GMTrace.o(16057808977920L, 119640);
      return;
    }
    paramString = bh.p(paramString, "sysmsg");
    if ((paramString == null) || (paramString.size() <= 0))
    {
      w.e("MicroMsg.AppBrand.WxaPkgPushingXmlHandler", "parseImpl, parse failed");
      GMTrace.o(16057808977920L, 119640);
      return;
    }
    Object localObject = (String)paramString.get(".sysmsg.$type");
    w.i("MicroMsg.AppBrand.WxaPkgPushingXmlHandler", "parseImpl, type = %s", new Object[] { localObject });
    if (bg.mZ((String)localObject))
    {
      GMTrace.o(16057808977920L, 119640);
      return;
    }
    localObject = (c)iBS.get(localObject);
    if (localObject != null) {
      ((c)localObject).q(paramString);
    }
    GMTrace.o(16057808977920L, 119640);
  }
  
  public final void a(final d.a parama)
  {
    GMTrace.i(10600918810624L, 78983);
    parama = n.a(parama.hme.tvq);
    if (bg.mZ(parama))
    {
      w.w("MicroMsg.AppBrand.WxaPkgPushingXmlHandler", "msg content is null");
      GMTrace.o(10600918810624L, 78983);
      return;
    }
    com.tencent.mm.plugin.appbrand.o.d.xC().C(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(10612327317504L, 79068);
        t.ob(parama);
        GMTrace.o(10612327317504L, 79068);
      }
    });
    GMTrace.o(10600918810624L, 78983);
  }
  
  private static final class a
    implements t.c
  {
    public a()
    {
      GMTrace.i(10618501332992L, 79114);
      GMTrace.o(10618501332992L, 79114);
    }
    
    public final void q(Map<String, String> paramMap)
    {
      GMTrace.i(10618635550720L, 79115);
      if (paramMap.get(".sysmsg.mmbizwxaconfig") == null)
      {
        GMTrace.o(10618635550720L, 79115);
        return;
      }
      int i = bg.getInt((String)paramMap.get(".sysmsg.mmbizwxaconfig.command"), -1);
      final int j = bg.getInt((String)paramMap.get(".sysmsg.mmbizwxaconfig.type"), 0);
      final String str = (String)paramMap.get(".sysmsg.mmbizwxaconfig.appid");
      int k = bg.getInt((String)paramMap.get(".sysmsg.mmbizwxaconfig.configversion"), 0);
      w.i("MicroMsg.AppBrand.WxaPkgPushingXmlHandler", "handle common config, command = %d, type = %d, appid = %s, configversion = %d", new Object[] { Integer.valueOf(i), Integer.valueOf(j), str, Integer.valueOf(k) });
      paramMap = new LinkedList();
      bls localbls = new bls();
      localbls.version = k;
      localbls.type = j;
      paramMap.add(localbls);
      com.tencent.mm.plugin.appbrand.config.k.a(str, paramMap, false);
      com.tencent.mm.plugin.appbrand.config.k.a(str, j, i, new k.c()
      {
        public final void oc(String paramAnonymousString)
        {
          GMTrace.i(10597697585152L, 78959);
          w.i("MicroMsg.AppBrand.WxaPkgPushingXmlHandler", "CommonConfigManager.getConfig config:%s", new Object[] { paramAnonymousString });
          com.tencent.mm.plugin.appbrand.ipc.d.f(str, j, paramAnonymousString);
          GMTrace.o(10597697585152L, 78959);
        }
      }, true);
      GMTrace.o(10618635550720L, 79115);
    }
  }
  
  private static final class b
    implements t.c
  {
    public b()
    {
      GMTrace.i(10605079560192L, 79014);
      GMTrace.o(10605079560192L, 79014);
    }
    
    private boolean c(final String paramString, Map<String, String> paramMap)
    {
      GMTrace.i(10605347995648L, 79016);
      w.d("MicroMsg.AppBrand.WxaPkgPushingXmlHandler", "optDebugInfo, prefix = %s", new Object[] { paramString });
      if (paramMap.get(paramString) == null)
      {
        GMTrace.o(10605347995648L, 79016);
        return false;
      }
      final String str1 = (String)paramMap.get(paramString + ".AppID");
      String str2 = (String)paramMap.get(paramString + ".UserName");
      final int i = bg.getInt((String)paramMap.get(paramString + ".Type"), 1);
      String str3 = (String)paramMap.get(paramString + ".URL");
      long l1 = bg.getLong((String)paramMap.get(paramString + ".StartTime"), bg.Po());
      long l2 = bg.getLong((String)paramMap.get(paramString + ".EndTime"), 7200L + l1);
      paramString = (String)paramMap.get(paramString + ".MD5");
      boolean bool = f.Sh().a(str1, i, str3, paramString, l1, l2);
      w.i("MicroMsg.AppBrand.WxaPkgPushingXmlHandler", "handle debug notify, appId = %s, username = %s, debugType = %d, url = %s, start = %d, end = %d, md5 = %s, updated = %b", new Object[] { str1, str2, Integer.valueOf(i), str3, Long.valueOf(l1), Long.valueOf(l2), paramString, Boolean.valueOf(bool) });
      if (bool)
      {
        paramString = p.pc(str1);
        if ((i != 0) && (999 != i)) {
          af.u(new Runnable()
          {
            public final void run()
            {
              GMTrace.i(10611790446592L, 79064);
              com.tencent.mm.plugin.appbrand.task.b.at(str1, i);
              Toast.makeText(ab.getContext(), ab.getContext().getString(p.i.iyn, new Object[] { bg.ap(paramString, str1) }), 1).show();
              GMTrace.o(10611790446592L, 79064);
            }
          });
        }
      }
      if (999 != i) {
        q.pj(str2);
      }
      f.Sf().a(str2, i, false, false, 0, 0, null);
      GMTrace.o(10605347995648L, 79016);
      return true;
    }
    
    public final void q(Map<String, String> paramMap)
    {
      GMTrace.i(10605213777920L, 79015);
      c(".sysmsg.AppBrandNotify.DebugInfoList.DebugInfo", paramMap);
      int i = 0;
      int j;
      do
      {
        j = i + 1;
        i = j;
      } while (c(".sysmsg.AppBrandNotify.DebugInfoList.DebugInfo" + j, paramMap));
      GMTrace.o(10605213777920L, 79015);
    }
  }
  
  public static abstract interface c
  {
    public abstract void q(Map<String, String> paramMap);
  }
  
  private static final class d
    implements t.c
  {
    public d()
    {
      GMTrace.i(10600113504256L, 78977);
      GMTrace.o(10600113504256L, 78977);
    }
    
    public final void q(Map<String, String> paramMap)
    {
      GMTrace.i(10600247721984L, 78978);
      if (paramMap.get(".sysmsg.AppPublicLibraryNotify") == null)
      {
        GMTrace.o(10600247721984L, 78978);
        return;
      }
      int i = bg.getInt((String)paramMap.get(".sysmsg.AppPublicLibraryNotify.Version"), 0);
      String str1 = (String)paramMap.get(".sysmsg.AppPublicLibraryNotify.MD5");
      String str2 = (String)paramMap.get(".sysmsg.AppPublicLibraryNotify.URL");
      int j = bg.getInt((String)paramMap.get(".sysmsg.AppPublicLibraryNotify.ForceUpdate"), 0);
      if ((bg.mZ(str2)) || (bg.mZ(str1)) || (i <= 0))
      {
        w.i("MicroMsg.AppBrand.WxaPkgPushingXmlHandler", "handle library notify, invalid params: url = %s, md5 = %s, version = %d", new Object[] { str2, str1, Integer.valueOf(i) });
        GMTrace.o(10600247721984L, 78978);
        return;
      }
      w.i("MicroMsg.AppBrand.WxaPkgPushingXmlHandler", "handle library notify, version = %d, md5 = %s, url = %s, forceUpdate = %d", new Object[] { Integer.valueOf(i), str1, str2, Integer.valueOf(j) });
      paramMap = new bsg();
      paramMap.version = i;
      paramMap.fwU = str1;
      paramMap.url = str2;
      paramMap.upn = j;
      k.a(paramMap);
      GMTrace.o(10600247721984L, 78978);
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/appcache/t.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */