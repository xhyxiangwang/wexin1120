package com.tencent.mm.plugin.appbrand.jsapi;

import android.os.Build.VERSION;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.a;
import com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo;
import com.tencent.mm.plugin.appbrand.config.AppBrandSysConfig;
import com.tencent.mm.plugin.appbrand.page.AppBrandPageView;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bg;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

final class ad
  extends k
{
  private static final int CTRL_INDEX = 97;
  private static final String NAME = "getPublicLibVersion";
  
  ad()
  {
    GMTrace.i(10432072908800L, 77725);
    GMTrace.o(10432072908800L, 77725);
  }
  
  private String pV(String paramString)
  {
    boolean bool2 = true;
    GMTrace.i(10432475561984L, 77728);
    paramString = a.nx(paramString);
    if (paramString == null)
    {
      paramString = d("fail", null);
      GMTrace.o(10432475561984L, 77728);
      return paramString;
    }
    HashMap localHashMap = new HashMap();
    if (paramString.iJa.iCx != 0)
    {
      bool1 = true;
      localHashMap.put("appDebug", Boolean.valueOf(bool1));
      localHashMap.put("appMd5", bg.mY(paramString.iJa.iCB));
      localHashMap.put("appVersion", Integer.valueOf(paramString.iJa.iCy));
      if (paramString.iJb.iCx == 0) {
        break label265;
      }
    }
    label265:
    for (boolean bool1 = bool2;; bool1 = false)
    {
      localHashMap.put("libDebug", Boolean.valueOf(bool1));
      localHashMap.put("libMd5", bg.mY(paramString.iJb.iCB));
      localHashMap.put("libVersion", Integer.valueOf(paramString.iJb.iCy));
      localHashMap.put("clientVersion", Integer.valueOf(com.tencent.mm.protocal.d.toX));
      localHashMap.put("system", "android");
      localHashMap.put("systemVersion", Integer.valueOf(Build.VERSION.SDK_INT));
      localHashMap.put("x5Version", Integer.valueOf(com.tencent.xweb.x5.sdk.d.getTbsVersion(ab.getContext())));
      paramString = d("ok", localHashMap);
      GMTrace.o(10432475561984L, 77728);
      return paramString;
      bool1 = false;
      break;
    }
  }
  
  public final String a(com.tencent.mm.plugin.appbrand.k paramk, JSONObject paramJSONObject)
  {
    GMTrace.i(10432207126528L, 77726);
    paramk = pV(paramk.iqL);
    GMTrace.o(10432207126528L, 77726);
    return paramk;
  }
  
  public final String a(AppBrandPageView paramAppBrandPageView)
  {
    GMTrace.i(10432341344256L, 77727);
    paramAppBrandPageView = pV(paramAppBrandPageView.iqL);
    GMTrace.o(10432341344256L, 77727);
    return paramAppBrandPageView;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/ad.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */