package com.tencent.mm.plugin.appbrand.report.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.compatible.util.p;
import com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo;
import com.tencent.mm.plugin.appbrand.config.AppBrandSysConfig;
import com.tencent.mm.plugin.appbrand.f;
import com.tencent.mm.plugin.appbrand.page.AppBrandPageView;
import com.tencent.mm.plugin.appbrand.page.o;
import com.tencent.mm.plugin.appbrand.page.s;
import com.tencent.mm.plugin.appbrand.report.AppBrandStatObject;
import com.tencent.mm.plugin.appbrand.report.e;
import com.tencent.mm.plugin.report.service.KVCommCrossProcessReceiver;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.util.LinkedList;

public final class a
{
  private static final a jom;
  public String appId;
  public int fNP;
  public int fNV;
  public String fNW;
  public int ftx;
  public String fty;
  public String ftz;
  public String fwy;
  public f irS;
  public int joc;
  private final boolean jol;
  public final LinkedList<String> jon;
  public boolean joo;
  public String jop;
  public long joq;
  public long jor;
  public String jos;
  public int jot;
  public String jou;
  public long jov;
  public int jow;
  public int jox;
  public String joy;
  private boolean joz;
  public int scene;
  
  static
  {
    GMTrace.i(16283563196416L, 121322);
    jom = new a(true);
    GMTrace.o(16283563196416L, 121322);
  }
  
  private a(boolean paramBoolean)
  {
    GMTrace.i(16283160543232L, 121319);
    this.jon = new LinkedList();
    this.joo = false;
    this.joz = true;
    this.jol = paramBoolean;
    GMTrace.o(16283160543232L, 121319);
  }
  
  public static a ZH()
  {
    GMTrace.i(16283294760960L, 121320);
    a locala = jom;
    GMTrace.o(16283294760960L, 121320);
    return locala;
  }
  
  public static a a(f paramf, String paramString, LinkedList<String> paramLinkedList)
  {
    GMTrace.i(17302812622848L, 128916);
    a locala = new a(false);
    locala.fwy = paramString;
    paramString = com.tencent.mm.plugin.appbrand.a.ny(paramf.iqL);
    locala.scene = paramString.scene;
    locala.fty = paramString.fty;
    locala.appId = paramf.iqL;
    locala.irS = paramf;
    locala.ftx = (paramf.iqO.iJa.iCx + 1);
    locala.fNP = paramf.iqO.iJa.iCy;
    locala.joc = paramString.joc;
    locala.fNV = paramString.fNV;
    locala.fNW = paramString.fNW;
    if (paramLinkedList != null) {
      locala.jon.addAll(paramLinkedList);
    }
    GMTrace.o(17302812622848L, 128916);
    return locala;
  }
  
  public final void e(AppBrandPageView paramAppBrandPageView)
  {
    GMTrace.i(16163035676672L, 120424);
    AppBrandSysConfig localAppBrandSysConfig = com.tencent.mm.plugin.appbrand.a.nx(this.appId);
    if (localAppBrandSysConfig != null)
    {
      this.fNP = localAppBrandSysConfig.iJa.iCy;
      this.jow = localAppBrandSysConfig.iJb.iCy;
    }
    this.jov = paramAppBrandPageView.jlm.jlv;
    this.joq = Math.max(0L, paramAppBrandPageView.jlm.jlw);
    this.jor = Math.max(0L, paramAppBrandPageView.jlm.jlu.joe);
    this.ftz = paramAppBrandPageView.jlc.jlV;
    this.joy = paramAppBrandPageView.jlc.jlW;
    this.jop = com.tencent.mm.plugin.appbrand.report.a.bP(ab.getContext());
    if (this.joz) {}
    for (int i = 1;; i = 0)
    {
      this.jox = i;
      this.joz = false;
      GMTrace.o(16163035676672L, 120424);
      return;
    }
  }
  
  public final void rB()
  {
    GMTrace.i(16163304112128L, 120426);
    if (this.jol)
    {
      GMTrace.o(16163304112128L, 120426);
      return;
    }
    w.i("MicroMsg.AppBrand.Report.kv_13536", "report " + toString());
    Runnable local1 = new Runnable()
    {
      public final void run()
      {
        GMTrace.i(16255511691264L, 121113);
        for (;;)
        {
          try
          {
            str = (String)this.joA[(this.joA.length - 1)];
            if (!bg.mZ(str))
            {
              i = str.indexOf('?');
              if (i >= 0) {
                continue;
              }
              str = "";
              this.joA[(this.joA.length - 1)] = str;
            }
          }
          catch (Exception localException)
          {
            String str;
            int i;
            this.joA[(this.joA.length - 1)] = "";
            continue;
          }
          g.paX.i(13536, com.tencent.mm.plugin.appbrand.report.d.g(this.joA));
          KVCommCrossProcessReceiver.bag();
          GMTrace.o(16255511691264L, 121113);
          return;
          str = p.encode(str.substring(i + 1, str.length()));
        }
      }
    };
    if (this.joo)
    {
      local1.run();
      try
      {
        KVCommCrossProcessReceiver.bag();
        GMTrace.o(16163304112128L, 120426);
        return;
      }
      catch (Exception localException)
      {
        w.printErrStackTrace("MicroMsg.AppBrand.Report.kv_13536", localException, "sendKV", new Object[0]);
        GMTrace.o(16163304112128L, 120426);
        return;
      }
    }
    com.tencent.mm.plugin.appbrand.o.d.xC().C(localException);
    GMTrace.o(16163304112128L, 120426);
  }
  
  public final String toString()
  {
    GMTrace.i(16163169894400L, 120425);
    String str = "kv_13536{scene=" + this.scene + ", sceneNote='" + this.fty + '\'' + ", sessionId='" + this.fwy + '\'' + ", appId='" + this.appId + '\'' + ", appVersion=" + this.fNP + ", appState=" + this.ftx + ", usedState=" + this.joc + ", pagePath='" + this.ftz + '\'' + ", networkType='" + this.jop + '\'' + ", costTime=" + this.joq + ", stayTime=" + this.jor + ", referPagePath='" + this.jos + '\'' + ", targetAction=" + this.jot + ", targetPagePath='" + this.jou + '\'' + ", clickTimestamp=" + this.jov + ", publicLibVersion=" + this.jow + ", preScene=" + this.fNV + ", preSceneNote='" + this.fNW + '\'' + ", isEntrance=" + this.jox + '}';
    GMTrace.o(16163169894400L, 120425);
    return str;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/report/a/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */