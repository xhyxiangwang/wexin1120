package com.tencent.mm.plugin.appbrand.jsapi.f;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.appstorage.AppBrandLocalMediaObject;
import com.tencent.mm.plugin.appbrand.appstorage.c;
import com.tencent.mm.plugin.appbrand.config.AppBrandSysConfig;
import com.tencent.mm.plugin.appbrand.h.f.a;
import com.tencent.mm.plugin.appbrand.h.h;
import com.tencent.mm.plugin.appbrand.h.i;
import com.tencent.mm.plugin.appbrand.jsapi.d;
import com.tencent.mm.plugin.appbrand.page.AppBrandPageView;
import com.tencent.mm.plugin.appbrand.page.s;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.xweb.l;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public class e
  extends com.tencent.mm.plugin.appbrand.jsapi.k
{
  public static final int CTRL_INDEX = 272;
  public static final String NAME = "createUploadTask";
  
  public e()
  {
    GMTrace.i(17683588317184L, 131753);
    GMTrace.o(17683588317184L, 131753);
  }
  
  public static boolean b(com.tencent.mm.plugin.appbrand.k paramk, String paramString)
  {
    GMTrace.i(17683856752640L, 131755);
    paramk = h.YB().rc(paramk.iqL);
    if (paramk == null)
    {
      w.i("MicroMsg.JsApiCreateUploadTask", "upload is null");
      GMTrace.o(17683856752640L, 131755);
      return true;
    }
    if (paramk.rb(paramString) == null)
    {
      w.i("MicroMsg.JsApiCreateUploadTask", "uploadInfo is null %s", new Object[] { paramString });
      GMTrace.o(17683856752640L, 131755);
      return true;
    }
    GMTrace.o(17683856752640L, 131755);
    return false;
  }
  
  public final String a(final com.tencent.mm.plugin.appbrand.k paramk, JSONObject paramJSONObject)
  {
    GMTrace.i(17683722534912L, 131754);
    w.d("MicroMsg.JsApiCreateUploadTask", "JsApiCreateUploadTask");
    String str2 = paramk.iqL;
    if (paramJSONObject == null)
    {
      paramk = d("fail:data is null", null);
      GMTrace.o(17683722534912L, 131754);
      return paramk;
    }
    Object localObject1 = paramJSONObject.optString("filePath");
    if (bg.mZ((String)localObject1))
    {
      paramk = d("fail:filePath is null", null);
      GMTrace.o(17683722534912L, 131754);
      return paramk;
    }
    w.i("MicroMsg.JsApiCreateUploadTask", "tempFilePath " + (String)localObject1);
    Object localObject2 = c.aI(str2, (String)localObject1);
    if (localObject2 == null)
    {
      paramk = d("fail:file doesn't exist", null);
      GMTrace.o(17683722534912L, 131754);
      return paramk;
    }
    final String str1 = ((AppBrandLocalMediaObject)localObject2).hhT;
    localObject2 = ((AppBrandLocalMediaObject)localObject2).mimeType;
    w.i("MicroMsg.JsApiCreateUploadTask", "filePath(%s), tempFilePath(%s)", new Object[] { str1, localObject1 });
    h.YB();
    final int j = h.Yx();
    f.a local1 = new f.a()
    {
      public final void b(int paramAnonymousInt1, String paramAnonymousString, int paramAnonymousInt2)
      {
        GMTrace.i(17686943760384L, 131778);
        if (paramAnonymousInt1 == 0)
        {
          w.d("MicroMsg.JsApiCreateUploadTask", "success: file name %s, result %s , errMsg %d", new Object[] { str1, paramAnonymousString, Integer.valueOf(paramAnonymousInt1) });
          localObject = new HashMap();
          ((Map)localObject).put("data", paramAnonymousString);
          ((Map)localObject).put("statusCode", Integer.valueOf(paramAnonymousInt2));
          ((Map)localObject).put("uploadTaskId", j);
          ((Map)localObject).put("state", "success");
          paramAnonymousString = new JSONObject((Map)localObject).toString();
          localObject = new e.a().a(paramk);
          ((com.tencent.mm.plugin.appbrand.jsapi.e)localObject).mData = paramAnonymousString;
          ((com.tencent.mm.plugin.appbrand.jsapi.e)localObject).VI();
          GMTrace.o(17686943760384L, 131778);
          return;
        }
        if (e.b(paramk, j))
        {
          GMTrace.o(17686943760384L, 131778);
          return;
        }
        w.e("MicroMsg.JsApiCreateUploadTask", "error: file name %s, result %s , errMsg %d", new Object[] { str1, paramAnonymousString, Integer.valueOf(paramAnonymousInt1) });
        Object localObject = new HashMap();
        ((Map)localObject).put("uploadTaskId", j);
        ((Map)localObject).put("state", "fail");
        ((Map)localObject).put("errMsg", paramAnonymousString);
        paramAnonymousString = new JSONObject((Map)localObject).toString();
        localObject = new e.a().a(paramk);
        ((com.tencent.mm.plugin.appbrand.jsapi.e)localObject).mData = paramAnonymousString;
        ((com.tencent.mm.plugin.appbrand.jsapi.e)localObject).VI();
        GMTrace.o(17686943760384L, 131778);
      }
      
      public final void c(int paramAnonymousInt, long paramAnonymousLong1, long paramAnonymousLong2)
      {
        GMTrace.i(17687077978112L, 131779);
        Object localObject = new HashMap();
        ((Map)localObject).put("uploadTaskId", j);
        ((Map)localObject).put("state", "progressUpdate");
        ((Map)localObject).put("progress", Integer.valueOf(paramAnonymousInt));
        ((Map)localObject).put("totalBytesSent", Long.valueOf(paramAnonymousLong1));
        ((Map)localObject).put("totalBytesExpectedToSend", Long.valueOf(paramAnonymousLong2));
        localObject = new JSONObject((Map)localObject).toString();
        com.tencent.mm.plugin.appbrand.jsapi.e locale = new e.a().a(paramk);
        locale.mData = ((String)localObject);
        locale.VI();
        GMTrace.o(17687077978112L, 131779);
      }
      
      public final void qr(String paramAnonymousString)
      {
        GMTrace.i(17686809542656L, 131777);
        if (e.b(paramk, j))
        {
          GMTrace.o(17686809542656L, 131777);
          return;
        }
        Object localObject = new HashMap();
        ((Map)localObject).put("uploadTaskId", j);
        ((Map)localObject).put("state", "fail");
        ((Map)localObject).put("errMsg", paramAnonymousString);
        paramAnonymousString = new JSONObject((Map)localObject).toString();
        localObject = new e.a().a(paramk);
        ((com.tencent.mm.plugin.appbrand.jsapi.e)localObject).mData = paramAnonymousString;
        ((com.tencent.mm.plugin.appbrand.jsapi.e)localObject).VI();
        GMTrace.o(17686809542656L, 131777);
      }
    };
    AppBrandSysConfig localAppBrandSysConfig = com.tencent.mm.plugin.appbrand.a.nx(str2);
    localObject1 = paramk.irS.iqP;
    Map localMap = i.a(paramJSONObject, localAppBrandSysConfig);
    Object localObject3 = paramJSONObject.optString("url");
    if (bg.mZ((String)localObject3))
    {
      w.i("MicroMsg.JsApiCreateUploadTask", "url is null");
      paramk = d("fail:url is null or nil", null);
      GMTrace.o(17683722534912L, 131754);
      return paramk;
    }
    if ((i.c(localAppBrandSysConfig)) && (!i.a(localAppBrandSysConfig.iIV, (String)localObject3)))
    {
      w.i("MicroMsg.JsApiCreateUploadTask", "not in domain url %s", new Object[] { localObject3 });
      paramk = d("fail:url not in domain list", null);
      GMTrace.o(17683722534912L, 131754);
      return paramk;
    }
    if (localAppBrandSysConfig.iIN <= 0) {
      w.i("MicroMsg.JsApiCreateUploadTask", "concurrent <= 0 ");
    }
    int i = i.a(localAppBrandSysConfig, (com.tencent.mm.plugin.appbrand.config.a)localObject1, 2);
    if (i > 0) {}
    for (;;)
    {
      if (h.YB().rc(str2) == null)
      {
        localObject3 = b(paramk);
        localObject1 = null;
        paramk = (com.tencent.mm.plugin.appbrand.k)localObject1;
        if (localObject3 != null)
        {
          paramk = (com.tencent.mm.plugin.appbrand.k)localObject1;
          if (((AppBrandPageView)localObject3).jlc != null) {
            paramk = ((AppBrandPageView)localObject3).jlc.getSettings().getUserAgentString();
          }
        }
        paramk = new com.tencent.mm.plugin.appbrand.h.f(str2, paramk);
        localObject1 = h.YB();
        if (!((h)localObject1).iVd.containsKey(str2)) {
          ((h)localObject1).iVd.put(str2, paramk);
        }
        if (paramk != null)
        {
          if (i.c(localAppBrandSysConfig)) {
            break label523;
          }
          w.i("MicroMsg.JsApiCreateUploadTask", "debug type, do not verify domains");
          paramk.a(i, (String)localObject2, str1, paramJSONObject, localMap, null, local1, String.valueOf(j), "createUploadTask");
        }
      }
      for (;;)
      {
        paramk = new HashMap();
        paramk.put("uploadTaskId", String.valueOf(j));
        paramk = d("ok", paramk);
        GMTrace.o(17683722534912L, 131754);
        return paramk;
        paramk = h.YB().rc(str2);
        break;
        label523:
        paramk.a(i, (String)localObject2, str1, paramJSONObject, localMap, localAppBrandSysConfig.iIV, local1, String.valueOf(j), "createUploadTask");
      }
      i = 60000;
    }
  }
  
  public static final class a
    extends com.tencent.mm.plugin.appbrand.jsapi.e
  {
    public static final int CTRL_INDEX = 274;
    public static final String NAME = "onUploadTaskStateChange";
    
    public a()
    {
      GMTrace.i(17687212195840L, 131780);
      GMTrace.o(17687212195840L, 131780);
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/f/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */