package com.tencent.mm.plugin.appbrand.jsapi;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.i;
import com.tencent.mm.plugin.appbrand.k;
import com.tencent.mm.plugin.appbrand.page.AppBrandPageView;
import com.tencent.mm.plugin.appbrand.page.s;
import com.tencent.mm.plugin.appbrand.report.AppBrandIDKeyBatchReport;
import com.tencent.mm.plugin.appbrand.report.AppBrandStatObject;
import com.tencent.mm.protocal.c.bsq;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bg;
import org.json.JSONObject;

final class bk
  extends a
{
  public static final int CTRL_INDEX = 108;
  public static final String NAME = "reportRealtimeAction";
  
  bk()
  {
    GMTrace.i(10401337049088L, 77496);
    GMTrace.o(10401337049088L, 77496);
  }
  
  private static void a(String paramString, AppBrandPageView paramAppBrandPageView, JSONObject paramJSONObject)
  {
    GMTrace.i(16157666967552L, 120384);
    String str2 = paramJSONObject.optString("actionData");
    String str1 = "";
    paramJSONObject = str1;
    if (paramAppBrandPageView != null)
    {
      paramAppBrandPageView = paramAppBrandPageView.jlc.jlV;
      paramJSONObject = str1;
      if (!bg.mZ(paramAppBrandPageView))
      {
        paramJSONObject = str1;
        if (paramAppBrandPageView.contains(".html")) {
          paramJSONObject = paramAppBrandPageView.substring(0, paramAppBrandPageView.lastIndexOf(".html") + 5);
        }
      }
    }
    paramAppBrandPageView = new bsq();
    paramAppBrandPageView.jXP = 2;
    paramAppBrandPageView.mDD = paramString;
    paramAppBrandPageView.uHt = paramJSONObject;
    paramAppBrandPageView.pat = 0;
    paramAppBrandPageView.pau = 0;
    paramAppBrandPageView.uHu = str2;
    paramAppBrandPageView.uHw = com.tencent.mm.plugin.appbrand.report.a.bP(ab.getContext());
    paramAppBrandPageView.uHv = i.nM(paramString).irM;
    paramString = com.tencent.mm.plugin.appbrand.a.ny(paramString);
    if (paramString != null)
    {
      paramAppBrandPageView.sjB = paramString.scene;
      paramAppBrandPageView.uHy = paramString.fty;
      paramAppBrandPageView.fNV = paramString.fNV;
      paramAppBrandPageView.fNW = paramString.fNW;
    }
    AppBrandIDKeyBatchReport.a(paramAppBrandPageView);
    GMTrace.o(16157666967552L, 120384);
  }
  
  public final void a(k paramk, JSONObject paramJSONObject, int paramInt)
  {
    GMTrace.i(10401471266816L, 77497);
    a(paramk.iqL, b(paramk), paramJSONObject);
    paramk.v(paramInt, d("ok", null));
    GMTrace.o(10401471266816L, 77497);
  }
  
  public final void a(AppBrandPageView paramAppBrandPageView, JSONObject paramJSONObject, int paramInt)
  {
    GMTrace.i(10401605484544L, 77498);
    a(paramAppBrandPageView.iqL, paramAppBrandPageView, paramJSONObject);
    paramAppBrandPageView.v(paramInt, d("ok", null));
    GMTrace.o(10401605484544L, 77498);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/bk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */