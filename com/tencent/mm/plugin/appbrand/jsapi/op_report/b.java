package com.tencent.mm.plugin.appbrand.jsapi.op_report;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo;
import com.tencent.mm.plugin.appbrand.config.AppBrandSysConfig;
import com.tencent.mm.plugin.appbrand.ipc.AppBrandMainProcessService;
import com.tencent.mm.plugin.appbrand.jsapi.d;
import com.tencent.mm.plugin.appbrand.k;
import com.tencent.mm.plugin.appbrand.page.AppBrandPageView;
import com.tencent.mm.plugin.appbrand.page.s;
import com.tencent.mm.plugin.appbrand.report.AppBrandStatObject;
import org.json.JSONObject;

public final class b
  extends com.tencent.mm.plugin.appbrand.jsapi.a
{
  private static final int CTRL_INDEX = 245;
  private static final String NAME = "reportPageData";
  
  public b()
  {
    GMTrace.i(17383074824192L, 129514);
    GMTrace.o(17383074824192L, 129514);
  }
  
  public final void a(k paramk, JSONObject paramJSONObject, int paramInt)
  {
    GMTrace.i(17383209041920L, 129515);
    Object localObject = com.tencent.mm.plugin.appbrand.a.nx(paramk.iqL);
    AppBrandStatObject localAppBrandStatObject = com.tencent.mm.plugin.appbrand.a.ny(paramk.iqL);
    AppBrandOpReportLogic.ReportTask localReportTask = new AppBrandOpReportLogic.ReportTask();
    if (localObject != null)
    {
      localReportTask.appId = ((AppBrandSysConfig)localObject).appId;
      localReportTask.username = ((AppBrandSysConfig)localObject).ftu;
      localReportTask.iQS = ((AppBrandSysConfig)localObject).iJa.iCx;
      localReportTask.fNP = ((AppBrandSysConfig)localObject).iJa.iCy;
      localReportTask.iUz = ((AppBrandSysConfig)localObject).iJb.iCy;
    }
    if (localAppBrandStatObject != null)
    {
      localReportTask.scene = localAppBrandStatObject.scene;
      localReportTask.fNV = localAppBrandStatObject.fNV;
    }
    localObject = b(paramk);
    if (localObject != null) {
      localReportTask.ftz = ((AppBrandPageView)localObject).jlc.jlV;
    }
    localReportTask.iZJ = paramJSONObject.toString();
    AppBrandMainProcessService.a(localReportTask);
    paramk.v(paramInt, d("ok", null));
    GMTrace.o(17383209041920L, 129515);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/op_report/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */