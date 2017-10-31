package com.tencent.mm.plugin.appbrand.jsapi.f;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.appstorage.AppBrandLocalMediaObject;
import com.tencent.mm.plugin.appbrand.appstorage.c;
import com.tencent.mm.plugin.appbrand.config.AppBrandGlobalSystemConfig;
import com.tencent.mm.plugin.appbrand.config.AppBrandSysConfig;
import com.tencent.mm.plugin.appbrand.h.a.a;
import com.tencent.mm.plugin.appbrand.h.b;
import com.tencent.mm.plugin.appbrand.h.i;
import com.tencent.mm.plugin.appbrand.jsapi.d;
import com.tencent.mm.plugin.appbrand.k;
import com.tencent.mm.plugin.appbrand.page.AppBrandPageView;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.xweb.l;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public class f
  extends com.tencent.mm.plugin.appbrand.jsapi.a
{
  public static final int CTRL_INDEX = 28;
  public static final String NAME = "downloadFile";
  
  public f()
  {
    GMTrace.i(18239249711104L, 135893);
    GMTrace.o(18239249711104L, 135893);
  }
  
  public static AppBrandLocalMediaObject y(String paramString1, String paramString2, String paramString3)
  {
    GMTrace.i(18839739826176L, 140367);
    paramString1 = c.b(paramString1, paramString2, com.tencent.mm.pluginsdk.ui.tools.s.Od(paramString3), false);
    GMTrace.o(18839739826176L, 140367);
    return paramString1;
  }
  
  public final void a(final k paramk, JSONObject paramJSONObject, final int paramInt)
  {
    GMTrace.i(18239383928832L, 135894);
    final String str = paramk.iqL;
    a.a local1 = new a.a()
    {
      public final void b(int paramAnonymousInt, long paramAnonymousLong1, long paramAnonymousLong2)
      {
        GMTrace.i(18238981275648L, 135891);
        GMTrace.o(18238981275648L, 135891);
      }
      
      public final void b(int paramAnonymousInt1, String paramAnonymousString1, String paramAnonymousString2, int paramAnonymousInt2)
      {
        GMTrace.i(18238847057920L, 135890);
        w.i("MicroMsg.JsApiDownloadFile", "onDownloadResultWithCode errMsg = %d, mimeType = %s, filePath = %s, statusCode = %s", new Object[] { Integer.valueOf(paramAnonymousInt1), paramAnonymousString1, paramAnonymousString2, Integer.valueOf(paramAnonymousInt2) });
        if (com.tencent.mm.plugin.appbrand.h.a.FAILED != paramAnonymousInt1)
        {
          paramAnonymousString1 = f.y(str, paramAnonymousString2, paramAnonymousString1);
          if (paramAnonymousString1 != null) {}
        }
        else
        {
          paramAnonymousString1 = new HashMap();
          paramAnonymousString1.put("statusCode", Integer.valueOf(paramAnonymousInt2));
          paramk.v(paramInt, f.this.d("fail", paramAnonymousString1));
          GMTrace.o(18238847057920L, 135890);
          return;
        }
        paramAnonymousString1 = paramAnonymousString1.fAx;
        w.i("MicroMsg.JsApiDownloadFile", "onDownloadResultWithCode attached tempFilePath " + paramAnonymousString1);
        paramAnonymousString2 = new HashMap();
        paramAnonymousString2.put("tempFilePath", paramAnonymousString1);
        paramAnonymousString2.put("statusCode", Integer.valueOf(paramAnonymousInt2));
        paramk.v(paramInt, f.this.d("ok", paramAnonymousString2));
        GMTrace.o(18238847057920L, 135890);
      }
      
      public final void qp(String paramAnonymousString)
      {
        GMTrace.i(18239115493376L, 135892);
        paramk.v(paramInt, f.this.d("fail:" + paramAnonymousString, null));
        GMTrace.o(18239115493376L, 135892);
      }
    };
    AppBrandSysConfig localAppBrandSysConfig = com.tencent.mm.plugin.appbrand.a.nx(paramk.iqL);
    Object localObject1 = paramk.irS.iqP;
    Map localMap = i.a(paramJSONObject, localAppBrandSysConfig);
    Object localObject2 = paramJSONObject.optString("url");
    if (bg.mZ((String)localObject2))
    {
      w.i("MicroMsg.JsApiDownloadFile", "url is null");
      paramk.v(paramInt, d("fail:url is null or nil", null));
      GMTrace.o(18239383928832L, 135894);
      return;
    }
    if ((i.c(localAppBrandSysConfig)) && (!i.a(localAppBrandSysConfig.iIW, (String)localObject2)))
    {
      paramk.v(paramInt, d("fail:url not in domain list", null));
      w.i("MicroMsg.JsApiDownloadFile", "not in domain url %s", new Object[] { localObject2 });
      GMTrace.o(18239383928832L, 135894);
      return;
    }
    if (localAppBrandSysConfig.iIO <= 0) {
      w.i("MicroMsg.JsApiDownloadFile", "maxDownloadConcurrent <= 0 ");
    }
    paramInt = i.a(localAppBrandSysConfig, (com.tencent.mm.plugin.appbrand.config.a)localObject1, 3);
    if (paramInt > 0) {}
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
      int i;
      if (localObject1 != null)
      {
        boolean bool = i.c(localAppBrandSysConfig);
        w.i("MicroMsg.JsApiDownloadFile", "before do download, checkDomains = %b", new Object[] { Boolean.valueOf(bool) });
        i = com.tencent.mm.plugin.appbrand.a.nx(str).iJc.iId;
        if (!bool) {
          break label357;
        }
      }
      label357:
      for (paramk = localAppBrandSysConfig.iIW;; paramk = null)
      {
        ((com.tencent.mm.plugin.appbrand.h.a)localObject1).a(paramJSONObject, paramInt, localMap, paramk, i, local1, null, "downloadFile");
        GMTrace.o(18239383928832L, 135894);
        return;
      }
      paramInt = 60000;
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/f/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */