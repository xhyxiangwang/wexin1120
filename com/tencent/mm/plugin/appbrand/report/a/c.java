package com.tencent.mm.plugin.appbrand.report.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo;
import com.tencent.mm.plugin.appbrand.config.AppBrandSysConfig;
import com.tencent.mm.plugin.appbrand.f;
import com.tencent.mm.plugin.appbrand.page.AppBrandPageView;
import com.tencent.mm.plugin.appbrand.page.s;
import com.tencent.mm.plugin.appbrand.report.AppBrandIDKeyBatchReport;
import com.tencent.mm.plugin.appbrand.report.AppBrandStatObject;
import com.tencent.mm.protocal.c.bsq;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;

public final class c
{
  private static final c joQ;
  public String appId;
  public int fNV;
  public String fNW;
  public int ftx;
  public String fty;
  public String ftz;
  public String fwy;
  public int joc;
  private final boolean jol;
  public String jos;
  public int jox;
  private boolean joz;
  public int scene;
  
  static
  {
    GMTrace.i(16283026325504L, 121318);
    joQ = new c(true);
    GMTrace.o(16283026325504L, 121318);
  }
  
  private c(boolean paramBoolean)
  {
    GMTrace.i(16282489454592L, 121314);
    this.joz = true;
    this.jol = paramBoolean;
    GMTrace.o(16282489454592L, 121314);
  }
  
  public static c ZI()
  {
    GMTrace.i(16282623672320L, 121315);
    c localc = joQ;
    GMTrace.o(16282623672320L, 121315);
    return localc;
  }
  
  public static c a(f paramf, String paramString1, String paramString2)
  {
    GMTrace.i(18355213828096L, 136757);
    c localc = new c(false);
    localc.fwy = paramString1;
    localc.appId = paramf.iqL;
    paramString1 = com.tencent.mm.plugin.appbrand.a.ny(paramf.iqL);
    localc.scene = paramString1.scene;
    localc.fty = paramString1.fty;
    localc.fNV = paramString1.fNV;
    localc.fNW = paramString1.fNW;
    localc.joc = paramString1.joc;
    localc.ftx = (paramf.iqO.iJa.iCx + 1);
    localc.jos = paramString2;
    GMTrace.o(18355213828096L, 136757);
    return localc;
  }
  
  public final void f(AppBrandPageView paramAppBrandPageView)
  {
    GMTrace.i(16282892107776L, 121317);
    if (paramAppBrandPageView == null)
    {
      GMTrace.o(16282892107776L, 121317);
      return;
    }
    this.jos = paramAppBrandPageView.jlc.jlV;
    GMTrace.o(16282892107776L, 121317);
  }
  
  public final void rB()
  {
    int i = 1;
    GMTrace.i(16162498805760L, 120420);
    if (this.jol)
    {
      GMTrace.o(16162498805760L, 120420);
      return;
    }
    bsq localbsq = new bsq();
    localbsq.jXP = 1;
    localbsq.mDD = this.appId;
    localbsq.uHt = this.ftz;
    localbsq.pat = 0;
    localbsq.lpw = ((int)bg.Po());
    localbsq.pau = 1;
    localbsq.uHu = "";
    localbsq.uHi = this.ftx;
    localbsq.uHv = this.fwy;
    localbsq.uHw = com.tencent.mm.plugin.appbrand.report.a.bP(ab.getContext());
    localbsq.sjB = this.scene;
    localbsq.uHx = this.joc;
    localbsq.uHy = this.fty;
    localbsq.jos = this.jos;
    localbsq.fNV = this.fNV;
    localbsq.fNW = this.fNW;
    if (this.joz) {}
    for (;;)
    {
      this.jox = i;
      localbsq.jox = i;
      AppBrandIDKeyBatchReport.a(localbsq);
      this.joz = false;
      w.i("MicroMsg.AppBrand.Report.kv_14004", "report " + toString());
      GMTrace.o(16162498805760L, 120420);
      return;
      i = 0;
    }
  }
  
  public final String toString()
  {
    GMTrace.i(16162633023488L, 120421);
    String str = "kv_14004{appId='" + this.appId + '\'' + ", sessionId='" + this.fwy + '\'' + ", scene=" + this.scene + ", sceneNote='" + this.fty + '\'' + ", preScene=" + this.fNV + ", preSceneNote='" + this.fNW + '\'' + ", pagePath='" + this.ftz + '\'' + ", usedState=" + this.joc + ", appState=" + this.ftx + ", referPagePath='" + this.jos + '\'' + ", isEntrance=" + this.jox + '}';
    GMTrace.o(16162633023488L, 120421);
    return str;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/report/a/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */