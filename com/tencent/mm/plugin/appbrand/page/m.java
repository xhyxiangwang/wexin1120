package com.tencent.mm.plugin.appbrand.page;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo;
import com.tencent.mm.plugin.appbrand.config.AppBrandLaunchReferrer;
import com.tencent.mm.plugin.appbrand.config.AppBrandSysConfig;
import com.tencent.mm.plugin.appbrand.f;
import com.tencent.mm.plugin.appbrand.i;
import com.tencent.mm.plugin.appbrand.report.a.c;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class m
{
  private final String iqL;
  private final f irS;
  public Intent jkK;
  public com.tencent.mm.plugin.appbrand.report.a.a jkL;
  c jkM;
  boolean jkg;
  
  m(f paramf)
  {
    GMTrace.i(17298249220096L, 128882);
    this.jkg = false;
    this.jkL = null;
    this.jkM = null;
    this.iqL = paramf.iqL;
    this.irS = paramf;
    RO();
    GMTrace.o(17298249220096L, 128882);
  }
  
  public final void RO()
  {
    GMTrace.i(16152029822976L, 120342);
    if (!bg.mZ(this.iqL))
    {
      localObject1 = i.b(this.irS);
      if (localObject1 != null) {}
    }
    else
    {
      w.e("MicroMsg.AppBrandPageContainerReporter", "resetSession with dummy model, stack %s", new Object[] { bg.f(new Throwable()) });
      this.jkM = c.ZI();
      this.jkL = com.tencent.mm.plugin.appbrand.report.a.a.ZH();
      GMTrace.o(16152029822976L, 120342);
      return;
    }
    String str = ((i)localObject1).irM;
    Object localObject2 = ((i)localObject1).RN();
    Object localObject1 = "";
    if ((1 == ((AppBrandLaunchReferrer)localObject2).iIB) || (3 == ((AppBrandLaunchReferrer)localObject2).iIB))
    {
      localObject1 = ((AppBrandLaunchReferrer)localObject2).appId;
      if (this.jkL == null) {
        break label190;
      }
      localObject2 = this.jkL.jon;
      ((LinkedList)localObject2).pollFirst();
    }
    for (;;)
    {
      ((LinkedList)localObject2).push(bg.mY((String)localObject1));
      this.jkL = com.tencent.mm.plugin.appbrand.report.a.a.a(this.irS, str, (LinkedList)localObject2);
      this.jkM = c.a(this.irS, str, (String)localObject1);
      GMTrace.o(16152029822976L, 120342);
      return;
      if (2 != ((AppBrandLaunchReferrer)localObject2).iIB) {
        break;
      }
      localObject1 = ((AppBrandLaunchReferrer)localObject2).url;
      break;
      label190:
      localObject2 = new LinkedList();
    }
  }
  
  final void b(final AppBrandPageView paramAppBrandPageView, final String paramString)
  {
    GMTrace.i(16152164040704L, 120343);
    this.jkM.f(paramAppBrandPageView);
    af.u(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(18358166618112L, 136779);
        com.tencent.mm.plugin.appbrand.report.a.a locala = m.this.jkL;
        AppBrandPageView localAppBrandPageView = paramAppBrandPageView;
        String str = paramString;
        locala.jos = ((String)locala.jon.pollFirst());
        locala.jot = 2;
        locala.jou = str;
        locala.jon.push(localAppBrandPageView.jlc.jlV);
        locala.e(localAppBrandPageView);
        locala.rB();
        GMTrace.o(18358166618112L, 136779);
      }
    });
    GMTrace.o(16152164040704L, 120343);
  }
  
  public final void b(final j paramj)
  {
    GMTrace.i(16152298258432L, 120344);
    this.jkg = true;
    if (paramj != null) {
      af.u(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(18359777230848L, 136791);
          com.tencent.mm.plugin.appbrand.report.a.a locala = m.this.jkL;
          j localj = paramj;
          locala.jos = ((String)locala.jon.peekFirst());
          locala.jou = null;
          Intent localIntent;
          Object localObject;
          switch (com.tencent.mm.plugin.appbrand.report.a.a.2.iDm[com.tencent.mm.plugin.appbrand.d.nJ(locala.appId).ordinal()])
          {
          default: 
            localIntent = locala.irS.iqR.jkq.jkK;
            if (localIntent != null) {
              if (localIntent.getComponent() == null)
              {
                localObject = "";
                w.e("MicroMsg.AppBrand.Report.kv_13536", "onBackground, intent %s, get null cmp name", new Object[] { localIntent });
                if (!((String)localObject).contains("WebViewUI")) {
                  break label274;
                }
                locala.jot = 10;
                locala.jou = localIntent.getStringExtra("appbrand_report_key_target_url");
                label153:
                localObject = locala.jou;
                locala.jon.pollFirst();
                locala.jon.push(bg.mY((String)localObject));
              }
            }
            break;
          }
          for (;;)
          {
            localObject = com.tencent.mm.plugin.appbrand.ui.g.bR(localj.getContext());
            if ((localObject != null) && (((Activity)localObject).isFinishing())) {
              locala.joo = true;
            }
            locala.e(localj.YO());
            locala.rB();
            GMTrace.o(18359777230848L, 136791);
            return;
            if (localj.YO().jlm.Zg()) {}
            for (int i = 4;; i = 3)
            {
              locala.jot = i;
              break;
            }
            locala.jot = 6;
            continue;
            localObject = localIntent.getComponent().getClassName();
            break;
            label274:
            locala.jot = 8;
            locala.jou = bg.ap(localIntent.getStringExtra("appbrand_report_key_target_activity"), (String)localObject);
            break label153;
            locala.jot = 7;
          }
        }
      });
    }
    GMTrace.o(16152298258432L, 120344);
  }
  
  public final void c(j paramj)
  {
    GMTrace.i(16280878841856L, 121302);
    this.jkK = null;
    c localc = this.jkM;
    localc.ftz = paramj.YO().jlc.jlV;
    localc.rB();
    GMTrace.o(16280878841856L, 121302);
  }
  
  final void d(AppBrandPageView paramAppBrandPageView)
  {
    GMTrace.i(16255109038080L, 121110);
    c localc = this.jkM;
    localc.ftz = paramAppBrandPageView.jlc.jlV;
    localc.rB();
    GMTrace.o(16255109038080L, 121110);
  }
  
  final void g(long paramLong, int paramInt)
  {
    GMTrace.i(16152432476160L, 120345);
    AppBrandSysConfig localAppBrandSysConfig = com.tencent.mm.plugin.appbrand.a.nx(this.iqL);
    if (localAppBrandSysConfig == null) {}
    for (int i = 0;; i = localAppBrandSysConfig.iJa.iCy)
    {
      com.tencent.mm.plugin.report.service.g.paX.i(13543, new Object[] { this.iqL, Integer.valueOf(i), Long.valueOf(paramLong), Integer.valueOf(paramInt) });
      GMTrace.o(16152432476160L, 120345);
      return;
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/page/m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */