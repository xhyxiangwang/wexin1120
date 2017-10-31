package com.tencent.mm.plugin.appbrand.jsapi.f;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.appstorage.AppBrandLocalMediaObject;
import com.tencent.mm.plugin.appbrand.config.AppBrandGlobalSystemConfig;
import com.tencent.mm.plugin.appbrand.config.AppBrandSysConfig;
import com.tencent.mm.plugin.appbrand.f;
import com.tencent.mm.plugin.appbrand.h.a.a;
import com.tencent.mm.plugin.appbrand.h.b;
import com.tencent.mm.plugin.appbrand.h.i;
import com.tencent.mm.plugin.appbrand.jsapi.d;
import com.tencent.mm.plugin.appbrand.jsapi.e;
import com.tencent.mm.plugin.appbrand.page.AppBrandPageView;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.xweb.l;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public class c
  extends com.tencent.mm.plugin.appbrand.jsapi.k
{
  public static final int CTRL_INDEX = 269;
  public static final String NAME = "createDownloadTask";
  
  public c()
  {
    GMTrace.i(17685601583104L, 131768);
    GMTrace.o(17685601583104L, 131768);
  }
  
  public static boolean a(com.tencent.mm.plugin.appbrand.k paramk, String paramString)
  {
    GMTrace.i(17685870018560L, 131770);
    paramk = b.Yy().qX(paramk.iqL);
    if (paramk == null)
    {
      w.i("MicroMsg.JsApiCreateDownloadTask", "download is null");
      GMTrace.o(17685870018560L, 131770);
      return true;
    }
    if (paramk.qW(paramString) == null)
    {
      w.i("MicroMsg.JsApiCreateDownloadTask", "downloadWorker is null %s", new Object[] { paramString });
      GMTrace.o(17685870018560L, 131770);
      return true;
    }
    GMTrace.o(17685870018560L, 131770);
    return false;
  }
  
  public static AppBrandLocalMediaObject y(String paramString1, String paramString2, String paramString3)
  {
    GMTrace.i(18839605608448L, 140366);
    paramString1 = com.tencent.mm.plugin.appbrand.appstorage.c.b(paramString1, paramString2, com.tencent.mm.pluginsdk.ui.tools.s.Od(paramString3), false);
    GMTrace.o(18839605608448L, 140366);
    return paramString1;
  }
  
  public final String a(final com.tencent.mm.plugin.appbrand.k paramk, JSONObject paramJSONObject)
  {
    GMTrace.i(17685735800832L, 131769);
    w.d("MicroMsg.JsApiCreateDownloadTask", "JsApiCreateDownloadTask");
    final String str = paramk.iqL;
    b.Yy();
    final int j = b.Yx();
    a.a local1 = new a.a()
    {
      public final void b(int paramAnonymousInt, long paramAnonymousLong1, long paramAnonymousLong2)
      {
        GMTrace.i(17684796276736L, 131762);
        Object localObject = new HashMap();
        ((Map)localObject).put("downloadTaskId", j);
        ((Map)localObject).put("state", "progressUpdate");
        ((Map)localObject).put("progress", Integer.valueOf(paramAnonymousInt));
        ((Map)localObject).put("totalBytesWritten", Long.valueOf(paramAnonymousLong1));
        ((Map)localObject).put("totalBytesExpectedToWrite", Long.valueOf(paramAnonymousLong2));
        localObject = new JSONObject((Map)localObject).toString();
        e locale = new c.a().a(paramk);
        locale.mData = ((String)localObject);
        locale.VI();
        GMTrace.o(17684796276736L, 131762);
      }
      
      public final void b(int paramAnonymousInt1, String paramAnonymousString1, String paramAnonymousString2, int paramAnonymousInt2)
      {
        GMTrace.i(17684662059008L, 131761);
        w.i("MicroMsg.JsApiCreateDownloadTask", "onDownloadResultWithCode errMsg = %d, mimeType = %s, filePath = %s, statusCode = %s", new Object[] { Integer.valueOf(paramAnonymousInt1), paramAnonymousString1, paramAnonymousString2, Integer.valueOf(paramAnonymousInt2) });
        if (com.tencent.mm.plugin.appbrand.h.a.FAILED != paramAnonymousInt1)
        {
          paramAnonymousString1 = c.y(str, paramAnonymousString2, paramAnonymousString1);
          if (paramAnonymousString1 != null) {}
        }
        else
        {
          if (c.a(paramk, j))
          {
            GMTrace.o(17684662059008L, 131761);
            return;
          }
          paramAnonymousString1 = new HashMap();
          paramAnonymousString1.put("downloadTaskId", j);
          paramAnonymousString1.put("state", "fail");
          paramAnonymousString1.put("errMsg", "download fail");
          paramAnonymousString1 = new JSONObject(paramAnonymousString1).toString();
          paramAnonymousString2 = new c.a().a(paramk);
          paramAnonymousString2.mData = paramAnonymousString1;
          paramAnonymousString2.VI();
          GMTrace.o(17684662059008L, 131761);
          return;
        }
        paramAnonymousString1 = paramAnonymousString1.fAx;
        w.i("MicroMsg.JsApiCreateDownloadTask", "onDownloadResultWithCode attached tempFilePath " + paramAnonymousString1);
        paramAnonymousString2 = new HashMap();
        paramAnonymousString2.put("downloadTaskId", j);
        paramAnonymousString2.put("tempFilePath", paramAnonymousString1);
        paramAnonymousString2.put("statusCode", Integer.valueOf(paramAnonymousInt2));
        paramAnonymousString2.put("state", "success");
        paramAnonymousString1 = new JSONObject(paramAnonymousString2).toString();
        paramAnonymousString2 = new c.a().a(paramk);
        paramAnonymousString2.mData = paramAnonymousString1;
        paramAnonymousString2.VI();
        GMTrace.o(17684662059008L, 131761);
      }
      
      public final void qp(String paramAnonymousString)
      {
        GMTrace.i(17684930494464L, 131763);
        if (c.a(paramk, j))
        {
          GMTrace.o(17684930494464L, 131763);
          return;
        }
        Object localObject = new HashMap();
        ((Map)localObject).put("downloadTaskId", j);
        ((Map)localObject).put("state", "fail");
        ((Map)localObject).put("errMsg", paramAnonymousString);
        paramAnonymousString = new JSONObject((Map)localObject).toString();
        localObject = new c.a().a(paramk);
        ((e)localObject).mData = paramAnonymousString;
        ((e)localObject).VI();
        GMTrace.o(17684930494464L, 131763);
      }
    };
    AppBrandSysConfig localAppBrandSysConfig = com.tencent.mm.plugin.appbrand.a.nx(paramk.iqL);
    Object localObject1 = paramk.irS.iqP;
    Map localMap = i.a(paramJSONObject, localAppBrandSysConfig);
    Object localObject2 = paramJSONObject.optString("url");
    if (bg.mZ((String)localObject2))
    {
      w.i("MicroMsg.JsApiCreateDownloadTask", "url is null");
      paramk = d("fail:url is null or nil", null);
      GMTrace.o(17685735800832L, 131769);
      return paramk;
    }
    if ((i.c(localAppBrandSysConfig)) && (!i.a(localAppBrandSysConfig.iIW, (String)localObject2)))
    {
      w.i("MicroMsg.JsApiCreateDownloadTask", "not in domain url %s", new Object[] { localObject2 });
      paramk = d("fail:url not in domain list", null);
      GMTrace.o(17685735800832L, 131769);
      return paramk;
    }
    if (localAppBrandSysConfig.iIO <= 0) {
      w.i("MicroMsg.JsApiCreateDownloadTask", "maxDownloadConcurrent <= 0 ");
    }
    int i = i.a(localAppBrandSysConfig, (com.tencent.mm.plugin.appbrand.config.a)localObject1, 3);
    if (i > 0) {}
    for (;;)
    {
      localObject2 = b.Yy().qX(paramk.iqL);
      localObject1 = localObject2;
      if (localObject2 == null)
      {
        AppBrandPageView localAppBrandPageView = b(paramk);
        localObject2 = null;
        localObject1 = localObject2;
        if (localAppBrandPageView != null)
        {
          localObject1 = localObject2;
          if (localAppBrandPageView.jlc != null) {
            localObject1 = localAppBrandPageView.jlc.getSettings().getUserAgentString();
          }
        }
        localObject1 = new com.tencent.mm.plugin.appbrand.h.a(paramk.iqL, (String)localObject1);
        b.Yy().a(paramk.iqL, (com.tencent.mm.plugin.appbrand.h.a)localObject1);
      }
      int k;
      if (localObject1 != null)
      {
        boolean bool = i.c(localAppBrandSysConfig);
        w.i("MicroMsg.JsApiCreateDownloadTask", "before do download, checkDomains = %b", new Object[] { Boolean.valueOf(bool) });
        k = com.tencent.mm.plugin.appbrand.a.nx(str).iJc.iId;
        if (!bool) {
          break label403;
        }
      }
      label403:
      for (paramk = localAppBrandSysConfig.iIW;; paramk = null)
      {
        ((com.tencent.mm.plugin.appbrand.h.a)localObject1).a(paramJSONObject, i, localMap, paramk, k, local1, String.valueOf(j), "createDownloadTask");
        paramk = new HashMap();
        paramk.put("downloadTaskId", String.valueOf(j));
        paramk = d("ok", paramk);
        GMTrace.o(17685735800832L, 131769);
        return paramk;
      }
      i = 60000;
    }
  }
  
  public static final class a
    extends e
  {
    public static final int CTRL_INDEX = 271;
    public static final String NAME = "onDownloadTaskStateChange";
    
    public a()
    {
      GMTrace.i(17685198929920L, 131765);
      GMTrace.o(17685198929920L, 131765);
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/f/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */