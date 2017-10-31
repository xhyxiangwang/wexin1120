package com.tencent.mm.plugin.appbrand;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.annotation.TargetApi;
import android.app.ActivityManager.TaskDescription;
import android.content.Context;
import android.content.DialogInterface.OnShowListener;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.os.Build.VERSION;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewPropertyAnimator;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.modelappbrand.a.b.b;
import com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo;
import com.tencent.mm.plugin.appbrand.appcache.u;
import com.tencent.mm.plugin.appbrand.b.b.a;
import com.tencent.mm.plugin.appbrand.config.AppBrandInitConfig;
import com.tencent.mm.plugin.appbrand.config.AppBrandLaunchReferrer;
import com.tencent.mm.plugin.appbrand.config.AppBrandSysConfig;
import com.tencent.mm.plugin.appbrand.ipc.AppBrandMainProcessService;
import com.tencent.mm.plugin.appbrand.ipc.AppBrandMainProcessService.a;
import com.tencent.mm.plugin.appbrand.ipc.MMToClientEvent;
import com.tencent.mm.plugin.appbrand.ipc.MainProcessTask;
import com.tencent.mm.plugin.appbrand.jsapi.AppBrandJSInterface;
import com.tencent.mm.plugin.appbrand.launching.AppBrandTaskUsageRecorder.LaunchCheckParams;
import com.tencent.mm.plugin.appbrand.launching.AppBrandTaskUsageRecorder.UpdateTask;
import com.tencent.mm.plugin.appbrand.media.AppBrandMusicClientService;
import com.tencent.mm.plugin.appbrand.page.l;
import com.tencent.mm.plugin.appbrand.page.l.1;
import com.tencent.mm.plugin.appbrand.page.l.a;
import com.tencent.mm.plugin.appbrand.page.m;
import com.tencent.mm.plugin.appbrand.performance.AppBrandPerformanceManager;
import com.tencent.mm.plugin.appbrand.report.AppBrandIDKeyBatchReport;
import com.tencent.mm.plugin.appbrand.report.AppBrandStatObject;
import com.tencent.mm.plugin.appbrand.task.AppBrandRemoteTaskController;
import com.tencent.mm.plugin.appbrand.task.AppBrandRemoteTaskController.a;
import com.tencent.mm.plugin.appbrand.task.AppBrandRemoteTaskController.b;
import com.tencent.mm.plugin.appbrand.ui.AppBrandPrepareTask;
import com.tencent.mm.plugin.appbrand.ui.AppBrandPrepareTask.a;
import com.tencent.mm.plugin.appbrand.ui.banner.AppBrandStickyBannerLogic.a;
import com.tencent.mm.sdk.platformtools.MultiProcessSharedPreferences;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.au;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.ui.MMActivity;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONObject;

public final class f
{
  public boolean gTa;
  public MMActivity iqJ;
  public g iqK;
  public String iqL;
  f iqM;
  public AppBrandInitConfig iqN;
  public AppBrandSysConfig iqO;
  public com.tencent.mm.plugin.appbrand.config.a iqP;
  public k iqQ;
  public l iqR;
  FrameLayout iqS;
  public com.tencent.mm.plugin.appbrand.ui.i iqT;
  com.tencent.mm.plugin.appbrand.ui.e iqU;
  public com.tencent.mm.plugin.appbrand.widget.c.b iqV;
  public AppBrandStatObject iqW;
  public AppBrandRemoteTaskController iqX;
  private com.tencent.mm.plugin.appbrand.page.f iqY;
  private com.tencent.mm.plugin.appbrand.page.e iqZ;
  private com.tencent.mm.plugin.appbrand.o.c ira;
  public h irb;
  public com.tencent.mm.plugin.appbrand.b.b irc;
  private boolean ird;
  boolean ire;
  boolean irf;
  public boolean irg;
  public boolean irh;
  private int iri;
  public boolean irj;
  public boolean irk;
  public boolean irl;
  public com.tencent.mm.plugin.appbrand.report.a.e irm;
  private AppBrandRemoteTaskController.b irn;
  private AppBrandMainProcessService.a iro;
  Runnable irp;
  public boolean mFinished;
  Handler mHandler;
  
  public f(MMActivity paramMMActivity, g paramg)
  {
    GMTrace.i(15528722694144L, 115698);
    this.irn = new AppBrandRemoteTaskController.b()
    {
      public final void finish()
      {
        GMTrace.i(18837189689344L, 140348);
        f.this.finish();
        GMTrace.o(18837189689344L, 140348);
      }
    };
    this.iro = new AppBrandMainProcessService.a()
    {
      private boolean irr;
      
      public final void RJ()
      {
        GMTrace.i(18868328202240L, 140580);
        this.irr = true;
        long l1 = f.this.iqX.jpB;
        SharedPreferences localSharedPreferences = MultiProcessSharedPreferences.getSharedPreferences(ab.getContext(), "pref_appbrand_process", 4);
        SharedPreferences.Editor localEditor = localSharedPreferences.edit();
        long l2 = localSharedPreferences.getLong("on_wxa_process_connected_time", 0L);
        if (l2 == l1)
        {
          localEditor.remove("on_wxa_process_connected_time");
          localEditor.commit();
          com.tencent.mm.plugin.report.d.oZR.a(365L, 1L, 1L, false);
          com.tencent.mm.sdk.platformtools.w.v("MicroMsg.AppBrandReporter", "delete timestamp(%s) and report(%d)", new Object[] { Long.valueOf(l1), Integer.valueOf(365) });
          GMTrace.o(18868328202240L, 140580);
          return;
        }
        com.tencent.mm.sdk.platformtools.w.v("MicroMsg.AppBrandReporter", "do not need to report(%d), timestamp(cur : %s, sp : %s)", new Object[] { Long.valueOf(l1), Integer.valueOf(365), Long.valueOf(l1), Long.valueOf(l2) });
        GMTrace.o(18868328202240L, 140580);
      }
      
      public final void onServiceConnected()
      {
        GMTrace.i(18868193984512L, 140579);
        if (this.irr)
        {
          f localf = f.this;
          com.tencent.mm.sdk.platformtools.w.i("MicroMsg.AppBrandRuntime", "onReconnected: %s", new Object[] { localf.iqL });
          localf.iqX.as(localf.iqL, localf.iqN.iCo);
          MMToClientEvent.pO(localf.iqL);
          d.nG(localf.iqL);
          if (!localf.gTa)
          {
            com.tencent.mm.sdk.platformtools.w.e("MicroMsg.AppBrandRuntime", "Main Process Restarted, start prepare again");
            localf.RD();
          }
        }
        this.irr = false;
        GMTrace.o(18868193984512L, 140579);
      }
    };
    this.irp = new Runnable()
    {
      public final void run()
      {
        GMTrace.i(17400657346560L, 129645);
        com.tencent.mm.plugin.report.service.g.paX.a(369L, 11L, 1L, false);
        GMTrace.o(17400657346560L, 129645);
      }
    };
    this.iqJ = paramMMActivity;
    this.iqK = paramg;
    this.mHandler = new Handler();
    this.iqS = new FrameLayout(paramMMActivity);
    this.iqS.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
    this.iqX = new AppBrandRemoteTaskController();
    AppBrandRemoteTaskController localAppBrandRemoteTaskController = this.iqX;
    paramg = paramg.irz;
    AppBrandRemoteTaskController.b localb = this.irn;
    localAppBrandRemoteTaskController.jpy = paramMMActivity.getClass().getName();
    localAppBrandRemoteTaskController.irz = paramg;
    localAppBrandRemoteTaskController.irn = localb;
    this.iqY = new com.tencent.mm.plugin.appbrand.page.f();
    this.iqZ = new com.tencent.mm.plugin.appbrand.page.e();
    this.ira = new com.tencent.mm.plugin.appbrand.o.c();
    this.irb = new h();
    GMTrace.o(15528722694144L, 115698);
  }
  
  private void a(Animator paramAnimator, final Runnable paramRunnable)
  {
    GMTrace.i(15530199089152L, 115709);
    paramAnimator.addListener(new AnimatorListenerAdapter()
    {
      public final void onAnimationEnd(Animator paramAnonymousAnimator)
      {
        GMTrace.i(18191602417664L, 135538);
        if (paramRunnable != null) {
          paramRunnable.run();
        }
        GMTrace.o(18191602417664L, 135538);
      }
    });
    paramAnimator.start();
    GMTrace.o(15530199089152L, 115709);
  }
  
  public final void D(boolean paramBoolean)
  {
    boolean bool2 = true;
    GMTrace.i(17325629636608L, 129086);
    if (this.iqK.irx.size() == 1)
    {
      g localg = this.iqK;
      boolean bool1 = bool2;
      if (!RC()) {
        if (!paramBoolean) {
          break label60;
        }
      }
      label60:
      for (bool1 = bool2;; bool1 = false)
      {
        localg.D(bool1);
        GMTrace.o(17325629636608L, 129086);
        return;
      }
    }
    finish();
    GMTrace.o(17325629636608L, 129086);
  }
  
  public final int RA()
  {
    GMTrace.i(15529259565056L, 115702);
    if (this.iqW == null)
    {
      GMTrace.o(15529259565056L, 115702);
      return 0;
    }
    int i = this.iqW.scene;
    GMTrace.o(15529259565056L, 115702);
    return i;
  }
  
  public final String RB()
  {
    GMTrace.i(18191333982208L, 135536);
    if (this.iqN == null)
    {
      GMTrace.o(18191333982208L, 135536);
      return "";
    }
    if (bg.mZ(this.iqN.iIy))
    {
      if (this.iqP == null)
      {
        GMTrace.o(18191333982208L, 135536);
        return "";
      }
      str = this.iqP.Uf();
      GMTrace.o(18191333982208L, 135536);
      return str;
    }
    String str = this.iqN.iIy;
    GMTrace.o(18191333982208L, 135536);
    return str;
  }
  
  public final boolean RC()
  {
    GMTrace.i(17324958547968L, 129081);
    if ((this.iqN == null) || (this.iqN.iIw))
    {
      GMTrace.o(17324958547968L, 129081);
      return true;
    }
    GMTrace.o(17324958547968L, 129081);
    return false;
  }
  
  final void RD()
  {
    GMTrace.i(15529393782784L, 115703);
    this.irm = new com.tencent.mm.plugin.appbrand.report.a.e(this);
    this.irm.joR = bg.Pp();
    final long l = System.currentTimeMillis();
    AppBrandPrepareTask localAppBrandPrepareTask = new AppBrandPrepareTask(this.iqJ, this);
    localAppBrandPrepareTask.jrf = new AppBrandPrepareTask.a()
    {
      public final void b(final AppBrandSysConfig paramAnonymousAppBrandSysConfig)
      {
        GMTrace.i(18880542015488L, 140671);
        if (f.this.iqJ.isFinishing())
        {
          GMTrace.o(18880542015488L, 140671);
          return;
        }
        if (paramAnonymousAppBrandSysConfig == null)
        {
          f.this.finish();
          GMTrace.o(18880542015488L, 140671);
          return;
        }
        f.this.irb.k(1, System.currentTimeMillis() - l);
        com.tencent.mm.plugin.appbrand.performance.a.a(f.this.iqL, "ResourcePrepare", l, System.currentTimeMillis());
        f.this.iqJ.runOnUiThread(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(17759689768960L, 132320);
            f.this.iqO = paramAnonymousAppBrandSysConfig;
            f.this.irj = true;
            f.this.RE();
            GMTrace.o(17759689768960L, 132320);
          }
        });
        GMTrace.o(18880542015488L, 140671);
      }
      
      public final void onDownloadStarted()
      {
        GMTrace.i(18880676233216L, 140672);
        f.this.irl = true;
        if (f.this.irm != null) {
          f.this.irm.joS = true;
        }
        GMTrace.o(18880676233216L, 140672);
      }
    };
    com.tencent.mm.plugin.appbrand.o.d.aQ(localAppBrandPrepareTask);
    AppBrandMainProcessService.a(localAppBrandPrepareTask);
    GMTrace.o(15529393782784L, 115703);
  }
  
  public final void RE()
  {
    GMTrace.i(15529528000512L, 115704);
    com.tencent.mm.sdk.platformtools.w.i("MicroMsg.AppBrandRuntime", "mFinished: %b, ResourceReady: %b, WebViewReady: %b", new Object[] { Boolean.valueOf(this.mFinished), Boolean.valueOf(this.irj), Boolean.valueOf(this.irk) });
    if ((this.mFinished) || (!this.irj) || (!this.irk))
    {
      GMTrace.o(15529528000512L, 115704);
      return;
    }
    this.iqJ.runOnUiThread(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(18847792889856L, 140427);
        f localf = f.this;
        localf.iqP = com.tencent.mm.plugin.appbrand.config.a.oO(u.a(localf, "app-config.json"));
        localf.a(localf.iqW, localf.iqN.iIy);
        localf.iqQ = new k(localf.iqJ, localf);
        localf.iqR = new l(localf.iqJ, localf);
        localf.iqR.jks = new f.9(localf);
        localf.iqS.addView(localf.iqR, 0);
        Object localObject1 = localf.iqS;
        Object localObject2 = new com.tencent.mm.plugin.appbrand.widget.c.b(localf.iqJ);
        localf.iqV = ((com.tencent.mm.plugin.appbrand.widget.c.b)localObject2);
        ((FrameLayout)localObject1).addView((View)localObject2);
        Object localObject3 = localf.iqR;
        localObject2 = localf.iqN.iIy;
        localObject1 = localObject2;
        if (bg.mZ((String)localObject2)) {
          localObject1 = ((l)localObject3).irS.iqP.Uf();
        }
        ((l)localObject3).runOnUiThread(new l.1((l)localObject3, (String)localObject1));
        localObject2 = localf.iqQ;
        localObject1 = new JSONObject();
        localObject3 = ((k)localObject2).irS.iqO;
        com.tencent.mm.plugin.appbrand.config.a locala = ((k)localObject2).irS.iqP;
        if ((localObject3 == null) || (locala == null)) {}
        for (;;)
        {
          localObject3 = new StringBuilder().append(com.tencent.mm.plugin.appbrand.o.a.sc("wxa_library/android.js")).append(u.a(((k)localObject2).irS, "WAService.js"));
          localObject1 = "";
          if (AppBrandPerformanceManager.rH(((k)localObject2).iqL)) {
            localObject1 = u.a(((k)localObject2).irS, "WAPerf.js");
          }
          localObject1 = (String)localObject1;
          com.tencent.mm.plugin.report.service.g.paX.a(370L, 5L, 1L, false);
          com.tencent.mm.plugin.appbrand.o.h.a(((k)localObject2).irU, (String)localObject1, new k.1((k)localObject2));
          localObject1 = u.a(((k)localObject2).irS, "app-service.js");
          com.tencent.mm.plugin.report.service.g.paX.a(370L, 9L, 1L, false);
          com.tencent.mm.plugin.appbrand.o.h.a(((k)localObject2).irU, (String)localObject1, new k.2((k)localObject2));
          ((k)localObject2).RP();
          localf.a(localf.iqO);
          com.tencent.mm.plugin.report.service.g.paX.a(369L, 2L, 1L, false);
          f.this.gTa = true;
          localObject1 = f.this;
          ((f)localObject1).mHandler.removeCallbacks(((f)localObject1).irp);
          GMTrace.o(18847792889856L, 140427);
          return;
          JSONObject localJSONObject = locala.iHD;
          Object localObject4 = localJSONObject.keys();
          while (((Iterator)localObject4).hasNext())
          {
            String str = (String)((Iterator)localObject4).next();
            Object localObject5 = localJSONObject.opt(str);
            try
            {
              ((JSONObject)localObject1).putOpt(str, localObject5);
            }
            catch (Exception localException1)
            {
              com.tencent.mm.sdk.platformtools.w.e("MicroMsg.AppBrandService", localException1.getMessage());
            }
          }
          k.a((JSONObject)localObject1, "debug", Boolean.valueOf(((k)localObject2).irS.iqO.iIH));
          k.a((JSONObject)localObject1, "downloadDomain", ((AppBrandSysConfig)localObject3).iIW);
          k.a((JSONObject)localObject1, "platform", "android");
          k.a((JSONObject)localObject1, "clientVersion", Integer.valueOf(com.tencent.mm.protocal.d.toX));
          localJSONObject = new JSONObject();
          k.a(localJSONObject, "scene", Integer.valueOf(((k)localObject2).irS.RA()));
          localObject4 = ((k)localObject2).irS.RB();
          k.a(localJSONObject, "path", com.tencent.mm.plugin.appbrand.n.h.sa((String)localObject4));
          k.a(localJSONObject, "query", new JSONObject(com.tencent.mm.plugin.appbrand.n.h.sb((String)localObject4)));
          k.a(localJSONObject, "topBarStatus", Boolean.valueOf(((k)localObject2).irS.iqN.iIz));
          k.a(localJSONObject, "referrerInfo", ((k)localObject2).irS.iqN.iIA.Ul());
          k.a(localJSONObject, "shareInfo", ((k)localObject2).irS.iqN.Uk());
          localObject4 = new JSONObject();
          try
          {
            k.a((JSONObject)localObject4, "template", new JSONArray(((AppBrandSysConfig)localObject3).iIG));
            k.a((JSONObject)localObject4, "maxRequestConcurrent", Integer.valueOf(((AppBrandSysConfig)localObject3).iIM));
            k.a((JSONObject)localObject4, "maxUploadConcurrent", Integer.valueOf(((AppBrandSysConfig)localObject3).iIN));
            k.a((JSONObject)localObject4, "maxDownloadConcurrent", Integer.valueOf(((AppBrandSysConfig)localObject3).iIO));
            k.a((JSONObject)localObject1, "appLaunchInfo", localJSONObject);
            k.a((JSONObject)localObject1, "wxAppInfo", localObject4);
            k.a((JSONObject)localObject1, "isPluginMiniProgram", Boolean.valueOf(((k)localObject2).irS.RC()));
            k.a((JSONObject)localObject1, "nativeBufferEnabled", Boolean.valueOf(((k)localObject2).Rv()));
            localObject3 = locala.iHE;
            ((k)localObject2).irU.evaluateJavascript(String.format("var __wxConfig = %s;\nvar __wxIndexPage = \"%s\"", new Object[] { ((JSONObject)localObject1).toString(), localObject3 }), null);
          }
          catch (Exception localException2)
          {
            for (;;) {}
          }
        }
      }
    });
    GMTrace.o(15529528000512L, 115704);
  }
  
  public final void RF()
  {
    GMTrace.i(16160082886656L, 120402);
    this.iri += 1;
    GMTrace.o(16160082886656L, 120402);
  }
  
  public final void RG()
  {
    GMTrace.i(16160217104384L, 120403);
    if (this.iri == 0)
    {
      GMTrace.o(16160217104384L, 120403);
      return;
    }
    this.iri -= 1;
    GMTrace.o(16160217104384L, 120403);
  }
  
  public final boolean RH()
  {
    GMTrace.i(19693364576256L, 146727);
    if ((this.ird) && (this.iri == 0))
    {
      cleanup();
      GMTrace.o(19693364576256L, 146727);
      return true;
    }
    GMTrace.o(19693364576256L, 146727);
    return false;
  }
  
  final void RI()
  {
    GMTrace.i(17665200488448L, 131616);
    ObjectAnimator localObjectAnimator = ObjectAnimator.ofFloat(this.iqS, "translationX", new float[] { this.iqK.iqS.getWidth(), 0.0F });
    localObjectAnimator.setDuration(250L);
    a(localObjectAnimator, null);
    GMTrace.o(17665200488448L, 131616);
  }
  
  final void Rx()
  {
    GMTrace.i(15528856911872L, 115699);
    i.b(this).RO();
    com.tencent.mm.plugin.appbrand.task.a.a(new com.tencent.mm.plugin.appbrand.task.a.a()
    {
      public final void onReady()
      {
        GMTrace.i(18830478802944L, 140298);
        f.this.irk = true;
        f.this.irb.k(2, System.currentTimeMillis() - this.hAj);
        com.tencent.mm.plugin.appbrand.performance.a.a(f.this.iqL, "X5Prepare", this.hAj, System.currentTimeMillis());
        f.this.RE();
        GMTrace.o(18830478802944L, 140298);
      }
    });
    RD();
    if (this.iqT != null) {
      Rz();
    }
    String str1 = this.iqN.iconUrl;
    String str2 = this.iqN.fxq;
    Object localObject = this.iqJ;
    if (RC())
    {
      localObject = new com.tencent.mm.plugin.appbrand.ui.c((Context)localObject, this);
      ((com.tencent.mm.plugin.appbrand.ui.i)localObject).bh(str1, str2);
      if (RA() != 1023) {
        break label349;
      }
    }
    label349:
    for (int i = 1;; i = 0)
    {
      if (i != 0) {
        ((com.tencent.mm.plugin.appbrand.ui.i)localObject).aah();
      }
      this.iqS.addView(((com.tencent.mm.plugin.appbrand.ui.i)localObject).getView(), -1, -1);
      this.iqT = ((com.tencent.mm.plugin.appbrand.ui.i)localObject);
      com.tencent.mm.sdk.platformtools.w.i("MicroMsg.AppBrandRuntime", "appOnCreate: %s, %s", new Object[] { this.iqN.fxq, this.iqN.appId });
      AppBrandMainProcessService.a(this.iro);
      localObject = this.iqX;
      str1 = this.iqL;
      ((AppBrandRemoteTaskController)localObject).jpz = AppBrandRemoteTaskController.a.jpN;
      ((AppBrandRemoteTaskController)localObject).iqL = str1;
      AppBrandMainProcessService.a((MainProcessTask)localObject);
      this.iqX.as(this.iqL, this.iqN.iCo);
      this.irc.iCL.hN(3);
      MMToClientEvent.pO(this.iqL);
      d.nI(this.iqL);
      d.nC(this.iqL);
      d.a(this.iqL, d.a.iqu);
      com.tencent.mm.plugin.appbrand.jsapi.i.pT(this.iqL);
      AppBrandStickyBannerLogic.a.cB(this.iqN.iIz);
      localObject = this.ira;
      ((com.tencent.mm.plugin.appbrand.o.c)localObject).appId = this.iqL;
      com.tencent.mm.sdk.platformtools.w.i("MicroMsg.AppBrandUserCaptureScreenMonitor", "init");
      au.a(((com.tencent.mm.plugin.appbrand.o.c)localObject).jwg);
      RE();
      this.mHandler.postDelayed(this.irp, 10000L);
      GMTrace.o(15528856911872L, 115699);
      return;
      localObject = new com.tencent.mm.plugin.appbrand.ui.d((Context)localObject, this);
      break;
    }
  }
  
  public final f Ry()
  {
    GMTrace.i(17324824330240L, 129080);
    Object localObject = this.iqK;
    int i = ((g)localObject).irx.indexOf(this);
    int j = ((g)localObject).irx.size();
    if ((i == -1) || (i >= j - 1))
    {
      GMTrace.o(17324824330240L, 129080);
      return null;
    }
    localObject = (f)((g)localObject).irx.get(i + 1);
    GMTrace.o(17324824330240L, 129080);
    return (f)localObject;
  }
  
  public final void Rz()
  {
    GMTrace.i(18191199764480L, 135535);
    if (this.iqT == null)
    {
      com.tencent.mm.sdk.platformtools.w.e("MicroMsg.AppBrandRuntime", "hideSplash, splash view null");
      GMTrace.o(18191199764480L, 135535);
      return;
    }
    this.iqT.a(this.iqR.YZ().YR());
    this.iqT.aag();
    this.iqT = null;
    GMTrace.o(18191199764480L, 135535);
  }
  
  final void a(AppBrandInitConfig paramAppBrandInitConfig, AppBrandStatObject paramAppBrandStatObject)
  {
    GMTrace.i(17324421677056L, 129077);
    if ((paramAppBrandInitConfig == null) || (paramAppBrandStatObject == null))
    {
      com.tencent.mm.sdk.platformtools.w.i("MicroMsg.AppBrandRuntime", "null current config, ignored");
      GMTrace.o(17324421677056L, 129077);
      return;
    }
    this.iqN = paramAppBrandInitConfig;
    this.iqW = paramAppBrandStatObject;
    this.iqL = paramAppBrandInitConfig.appId;
    this.irc = new com.tencent.mm.plugin.appbrand.b.b(this);
    paramAppBrandStatObject = this.irc;
    com.tencent.mm.ipcinvoker.f.ei("com.tencent.mm");
    ab.getContext().registerComponentCallbacks(paramAppBrandStatObject.iCN);
    paramAppBrandStatObject.iCL.start();
    this.irc.a(new b.a()
    {
      public final void a(com.tencent.mm.plugin.appbrand.b.a paramAnonymousa)
      {
        GMTrace.i(18831149891584L, 140303);
        f localf = f.this;
        HashMap localHashMap = new HashMap();
        switch (com.tencent.mm.plugin.appbrand.page.g.1.iCP[paramAnonymousa.ordinal()])
        {
        default: 
          GMTrace.o(18831149891584L, 140303);
          return;
        case 1: 
          paramAnonymousa = "background";
        }
        for (;;)
        {
          localHashMap.put("status", paramAnonymousa);
          new com.tencent.mm.plugin.appbrand.page.g().r(localHashMap).a(localf.iqQ).VI();
          GMTrace.o(18831149891584L, 140303);
          return;
          paramAnonymousa = "active";
          continue;
          paramAnonymousa = "suspend";
        }
      }
    });
    com.tencent.mm.sdk.platformtools.w.i("MicroMsg.AppBrandRuntime", "init %s, scene %d", new Object[] { this.iqL, Integer.valueOf(RA()) });
    this.gTa = false;
    this.ird = false;
    this.mFinished = false;
    this.ire = false;
    this.irf = false;
    this.irj = false;
    this.irk = false;
    this.irl = false;
    this.irg = false;
    this.irh = false;
    this.iri = 0;
    com.tencent.mm.pluginsdk.model.w.r("weapp_id", this.iqN.appId);
    com.tencent.mm.pluginsdk.model.w.r("weapp_name", this.iqN.fxq);
    com.tencent.mm.pluginsdk.model.w.r("use_private_classloader", Boolean.valueOf(false));
    a.a(this.iqL, this);
    j.nN(this.iqL);
    this.irb.k(0, System.currentTimeMillis() - paramAppBrandInitConfig.startTime);
    com.tencent.mm.plugin.report.service.g.paX.a(369L, 1L, 1L, false);
    com.tencent.mm.plugin.appbrand.performance.a.a(this.iqL, "ActivityCreate", this.iqN.startTime, System.currentTimeMillis());
    GMTrace.o(17324421677056L, 129077);
  }
  
  @TargetApi(21)
  final void a(final AppBrandSysConfig paramAppBrandSysConfig)
  {
    GMTrace.i(17664932052992L, 131614);
    if (Build.VERSION.SDK_INT < 21)
    {
      GMTrace.o(17664932052992L, 131614);
      return;
    }
    if (RC())
    {
      GMTrace.o(17664932052992L, 131614);
      return;
    }
    final int i = com.tencent.mm.plugin.appbrand.ui.g.au(this.iqP.iHz.iHP, -16777216);
    this.iqJ.setTaskDescription(new ActivityManager.TaskDescription(paramAppBrandSysConfig.fxq, null, i));
    com.tencent.mm.modelappbrand.a.b.CT().a(new b.b()
    {
      public final void j(Bitmap paramAnonymousBitmap)
      {
        GMTrace.i(17303349493760L, 128920);
        f.this.iqJ.setTaskDescription(new ActivityManager.TaskDescription(paramAppBrandSysConfig.fxq, paramAnonymousBitmap, i));
        GMTrace.o(17303349493760L, 128920);
      }
    }, paramAppBrandSysConfig.iIF, null);
    GMTrace.o(17664932052992L, 131614);
  }
  
  final void a(AppBrandStatObject paramAppBrandStatObject, String paramString)
  {
    GMTrace.i(17324690112512L, 129079);
    AppBrandIDKeyBatchReport.Zx().jnP = 1;
    AppBrandMainProcessService.a(AppBrandIDKeyBatchReport.Zx());
    if (paramAppBrandStatObject == null)
    {
      com.tencent.mm.sdk.platformtools.w.e("MicroMsg.AppBrandRuntime", "statObject is null!");
      GMTrace.o(17324690112512L, 129079);
      return;
    }
    if (paramString != null) {
      paramAppBrandStatObject.job = paramString;
    }
    a.a(this.iqN.appId, paramAppBrandStatObject);
    i.b(this).RO();
    if (this.iqR != null) {
      this.iqR.jkq.RO();
    }
    this.iqW = paramAppBrandStatObject;
    com.tencent.mm.sdk.platformtools.w.i("MicroMsg.AppBrandRuntime", "updateStat %s, scene %d", new Object[] { this.iqL, Integer.valueOf(RA()) });
    GMTrace.o(17324690112512L, 129079);
  }
  
  public final void a(com.tencent.mm.plugin.appbrand.widget.c.a parama)
  {
    GMTrace.i(18191065546752L, 135534);
    if (this.mFinished)
    {
      GMTrace.o(18191065546752L, 135534);
      return;
    }
    com.tencent.mm.plugin.appbrand.widget.c.b localb;
    Object localObject;
    if (this.iqV != null)
    {
      localb = this.iqV;
      localObject = localb.jAw;
      if ((((com.tencent.mm.plugin.appbrand.widget.c.c)localObject).jAF == null) || (!((com.tencent.mm.plugin.appbrand.widget.c.c)localObject).jAF.isRunning())) {
        break label234;
      }
    }
    label234:
    for (int i = 1;; i = 0)
    {
      if (i != 0)
      {
        localObject = localb.jAw;
        if (((com.tencent.mm.plugin.appbrand.widget.c.c)localObject).jAF != null) {
          ((com.tencent.mm.plugin.appbrand.widget.c.c)localObject).jAF.cancel();
        }
      }
      localObject = parama.getContentView();
      if (((View)localObject).getParent() != localb)
      {
        com.tencent.mm.plugin.appbrand.widget.c.b.bN((View)localObject);
        localb.addView((View)localObject, new FrameLayout.LayoutParams(-2, -2, 17));
        if (localb.jAA != parama)
        {
          ((View)localObject).clearAnimation();
          ((View)localObject).startAnimation(AnimationUtils.loadAnimation(localb.getContext(), p.a.isf));
        }
        localb.jAA = parama;
      }
      ((View)localObject).setOnClickListener(localb.mOnClickListener);
      localb.jAx.add(parama);
      if (parama.jAr != null) {
        parama.jAr.onShow(parama);
      }
      parama.jAv = localb;
      localb.setVisibility(0);
      localb.jAw.a(Color.argb(127, 0, 0, 0), null);
      GMTrace.o(18191065546752L, 135534);
      return;
    }
  }
  
  public final void cleanup()
  {
    GMTrace.i(17325092765696L, 129082);
    if (this.mFinished)
    {
      GMTrace.o(17325092765696L, 129082);
      return;
    }
    this.mFinished = true;
    com.tencent.mm.sdk.platformtools.w.i("MicroMsg.AppBrandRuntime", "onDestroy: %s", new Object[] { this.iqL });
    Object localObject1 = this.iqX;
    ??? = this.iqL;
    ((AppBrandRemoteTaskController)localObject1).jpz = AppBrandRemoteTaskController.a.jpH;
    ((AppBrandRemoteTaskController)localObject1).iqL = ((String)???);
    AppBrandMainProcessService.a((MainProcessTask)localObject1);
    AppBrandMainProcessService.b(this.iro);
    MMToClientEvent.pP(this.iqL);
    d.nD(this.iqL);
    d.a(this.iqL, d.a.iqy);
    com.tencent.mm.plugin.appbrand.jsapi.i.pU(this.iqL);
    AppBrandStickyBannerLogic.a.rX(this.iqL);
    a.nA(this.iqL);
    localObject1 = AppBrandMusicClientService.jhe;
    ((AppBrandMusicClientService)localObject1).jhd.clear();
    ((AppBrandMusicClientService)localObject1).jhf = "";
    this.iqJ.aKl();
    localObject1 = this.irc;
    ??? = ((com.tencent.mm.plugin.appbrand.b.b)localObject1).iCL;
    ((com.tencent.mm.plugin.appbrand.b.c)???).iCW.set(true);
    ((com.tencent.mm.plugin.appbrand.b.c)???).quit();
    ((com.tencent.mm.plugin.appbrand.b.c)???).b(com.tencent.mm.plugin.appbrand.b.a.iCJ);
    ab.getContext().unregisterComponentCallbacks(((com.tencent.mm.plugin.appbrand.b.b)localObject1).iCN);
    for (;;)
    {
      synchronized (((com.tencent.mm.plugin.appbrand.b.b)localObject1).iCM)
      {
        ((com.tencent.mm.plugin.appbrand.b.b)localObject1).iCM.clear();
        if (this.irm != null) {
          localObject1 = this.irm;
        }
        try
        {
          ??? = j.nQ(((com.tencent.mm.plugin.appbrand.report.a.e)localObject1).irL.iqL);
          ((com.tencent.mm.plugin.appbrand.report.a.e)localObject1).jop = com.tencent.mm.plugin.appbrand.report.a.bP(ab.getContext());
          ((com.tencent.mm.plugin.appbrand.report.a.e)localObject1).appId = ((com.tencent.mm.plugin.appbrand.report.a.e)localObject1).irL.iqL;
          if (((com.tencent.mm.plugin.appbrand.report.a.e)localObject1).irL.iqO != null) {
            break label600;
          }
          i = 0;
          ((com.tencent.mm.plugin.appbrand.report.a.e)localObject1).fNP = i;
          ((com.tencent.mm.plugin.appbrand.report.a.e)localObject1).ftx = (((com.tencent.mm.plugin.appbrand.report.a.e)localObject1).irL.iqN.iCo + 1);
          ((com.tencent.mm.plugin.appbrand.report.a.e)localObject1).scene = ((com.tencent.mm.plugin.appbrand.report.a.e)localObject1).irL.RA();
          ((com.tencent.mm.plugin.appbrand.report.a.e)localObject1).fwy = i.b(((com.tencent.mm.plugin.appbrand.report.a.e)localObject1).irL).irM;
          if (!((com.tencent.mm.plugin.appbrand.report.a.e)localObject1).joS) {
            break label617;
          }
          i = 1;
          ((com.tencent.mm.plugin.appbrand.report.a.e)localObject1).joT = i;
          if (!((j)???).irQ.get()) {
            break label622;
          }
          i = 1;
          ((com.tencent.mm.plugin.appbrand.report.a.e)localObject1).joU = i;
          ((com.tencent.mm.plugin.appbrand.report.a.e)localObject1).joV = (bg.Pp() - ((com.tencent.mm.plugin.appbrand.report.a.e)localObject1).joR);
          ((com.tencent.mm.plugin.appbrand.report.a.e)localObject1).joW = bg.Pp();
          com.tencent.mm.sdk.platformtools.w.i("MicroMsg.AppBrand.Report.kv_14576", "report|" + ((com.tencent.mm.plugin.appbrand.report.a.e)localObject1).toString());
          com.tencent.mm.plugin.report.d.oZR.i(14576, new Object[] { ((com.tencent.mm.plugin.appbrand.report.a.e)localObject1).jop, ((com.tencent.mm.plugin.appbrand.report.a.e)localObject1).appId, Integer.valueOf(((com.tencent.mm.plugin.appbrand.report.a.e)localObject1).fNP), Integer.valueOf(((com.tencent.mm.plugin.appbrand.report.a.e)localObject1).ftx), Integer.valueOf(((com.tencent.mm.plugin.appbrand.report.a.e)localObject1).scene), ((com.tencent.mm.plugin.appbrand.report.a.e)localObject1).fwy, Integer.valueOf(((com.tencent.mm.plugin.appbrand.report.a.e)localObject1).joT), Integer.valueOf(((com.tencent.mm.plugin.appbrand.report.a.e)localObject1).joU), Long.valueOf(((com.tencent.mm.plugin.appbrand.report.a.e)localObject1).joV), Long.valueOf(((com.tencent.mm.plugin.appbrand.report.a.e)localObject1).joW) });
        }
        catch (Exception localException)
        {
          int i;
          com.tencent.mm.sdk.platformtools.w.e("MicroMsg.AppBrand.Report.kv_14576", "report exp %s", new Object[] { localException });
          continue;
        }
        this.irm = null;
        d.nH(this.iqL);
        if (this.iqQ != null)
        {
          localObject1 = this.iqQ;
          ((k)localObject1).irU.cleanup();
          ((k)localObject1).irT.cleanup();
        }
        if (this.iqR != null)
        {
          this.iqS.removeView(this.iqR);
          this.iqR.cleanup();
        }
        a.a(this.iqL, null);
        j.remove(this.iqL);
        this.iqN.startTime = System.currentTimeMillis();
        GMTrace.o(17325092765696L, 129082);
        return;
      }
      label600:
      i = ((com.tencent.mm.plugin.appbrand.report.a.e)localObject2).irL.iqO.iJa.iCy;
      continue;
      label617:
      i = 0;
      continue;
      label622:
      i = 0;
    }
  }
  
  public final void e(JSONObject paramJSONObject)
  {
    GMTrace.i(17325361201152L, 129084);
    if (this.iqK.irx.size() == 1)
    {
      this.iqK.D(true);
      GMTrace.o(17325361201152L, 129084);
      return;
    }
    f localf = Ry();
    Object localObject;
    int i;
    if ((this.iqM != null) && (this.iqM == localf))
    {
      localObject = new AppBrandLaunchReferrer();
      ((AppBrandLaunchReferrer)localObject).appId = this.iqL;
      ((AppBrandLaunchReferrer)localObject).iIB = 3;
      if (paramJSONObject == null)
      {
        paramJSONObject = null;
        ((AppBrandLaunchReferrer)localObject).iIC = paramJSONObject;
        localf.iqN.iIA.a((AppBrandLaunchReferrer)localObject);
        paramJSONObject = new AppBrandStatObject();
        paramJSONObject.scene = 1038;
        paramJSONObject.fty = this.iqL;
        localf.a(paramJSONObject, null);
      }
    }
    else
    {
      paramJSONObject = new Runnable()
      {
        public final void run()
        {
          GMTrace.i(18880810450944L, 140673);
          f localf = f.this;
          localf.iqK.a(localf);
          GMTrace.o(18880810450944L, 140673);
        }
      };
      if ((this.iqR != null) && (this.iqR.YZ() != null) && (this.iqR.YZ().jkh)) {
        break label313;
      }
      i = 1;
      label179:
      if (i == 0) {
        break label318;
      }
      localObject = ObjectAnimator.ofFloat(this.iqS, "translationX", new float[] { 0.0F, this.iqK.iqS.getWidth() });
      ((ObjectAnimator)localObject).setDuration(250L);
      a((Animator)localObject, paramJSONObject);
      if (localf != null)
      {
        paramJSONObject = ObjectAnimator.ofFloat(localf.iqS, "translationX", new float[] { -(localf.iqK.iqS.getWidth() * 0.25F), 0.0F });
        paramJSONObject.setDuration(250L);
        localf.a(paramJSONObject, null);
      }
    }
    for (;;)
    {
      if (localf != null) {
        localf.onResume();
      }
      GMTrace.o(17325361201152L, 129084);
      return;
      paramJSONObject = paramJSONObject.toString();
      break;
      label313:
      i = 0;
      break label179;
      label318:
      paramJSONObject.run();
    }
  }
  
  public final void finish()
  {
    GMTrace.i(17325226983424L, 129083);
    this.iqJ.runOnUiThread(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(17322139975680L, 129060);
        f.this.e(null);
        GMTrace.o(17322139975680L, 129060);
      }
    });
    GMTrace.o(17325226983424L, 129083);
  }
  
  final void i(Runnable paramRunnable)
  {
    GMTrace.i(17665066270720L, 131615);
    ObjectAnimator localObjectAnimator1 = ObjectAnimator.ofFloat(this.iqS, "translationX", new float[] { 0.0F, -(this.iqK.iqS.getWidth() * 0.25F) });
    localObjectAnimator1.setDuration(250L);
    ObjectAnimator localObjectAnimator2 = ObjectAnimator.ofFloat(this.iqS, "translationX", new float[] { 0.0F });
    localObjectAnimator2.setDuration(0L);
    AnimatorSet localAnimatorSet = new AnimatorSet();
    localAnimatorSet.playSequentially(new Animator[] { localObjectAnimator1, localObjectAnimator2 });
    a(localAnimatorSet, paramRunnable);
    GMTrace.o(17665066270720L, 131615);
  }
  
  public final void onPause()
  {
    GMTrace.i(15529662218240L, 115705);
    if (!this.gTa)
    {
      GMTrace.o(15529662218240L, 115705);
      return;
    }
    com.tencent.mm.sdk.platformtools.w.i("MicroMsg.AppBrandRuntime", "onPause: %s", new Object[] { this.iqL });
    this.ird = true;
    this.irc.iCL.hN(1);
    com.tencent.mm.plugin.appbrand.page.e locale = this.iqZ;
    HashMap localHashMap = new HashMap(1);
    d.c localc = d.nJ(this.iqL);
    Object localObject = "hide";
    switch (com.tencent.mm.plugin.appbrand.page.e.1.iDm[localc.ordinal()])
    {
    }
    for (;;)
    {
      localHashMap.put("mode", localObject);
      locale.r(localHashMap).a(this.iqQ).VI();
      localObject = this.iqR;
      if (((l)localObject).jkl.size() != 0)
      {
        ((com.tencent.mm.plugin.appbrand.page.j)((l)localObject).jkl.getFirst()).YM();
        ((l)localObject).jkq.b((com.tencent.mm.plugin.appbrand.page.j)((l)localObject).jkl.peekFirst());
      }
      d.nE(this.iqL);
      d.a(this.iqL, d.a.iqw);
      com.tencent.mm.sdk.platformtools.w.i("MicroMsg.AppBrandUserCaptureScreenMonitor", "onPause");
      au.a(null);
      GMTrace.o(15529662218240L, 115705);
      return;
      localObject = "close";
      continue;
      localObject = "back";
      continue;
      localObject = "hide";
      continue;
      localObject = "hang";
      continue;
      localObject = "launchMiniProgram";
    }
  }
  
  public final void onResume()
  {
    GMTrace.i(15529796435968L, 115706);
    if (!this.gTa)
    {
      GMTrace.o(15529796435968L, 115706);
      return;
    }
    com.tencent.mm.sdk.platformtools.w.i("MicroMsg.AppBrandRuntime", "onResume: %s", new Object[] { this.iqL });
    if ((this.mFinished) || (this.ire))
    {
      cleanup();
      a(this.iqN, this.iqW);
      Rx();
      com.tencent.mm.sdk.platformtools.w.i("MicroMsg.AppBrandRuntime", "reload: %s", new Object[] { this.iqL });
      GMTrace.o(15529796435968L, 115706);
      return;
    }
    this.ird = false;
    d.nI(this.iqL);
    d.nF(this.iqL);
    d.a(this.iqL, d.a.iqv);
    Object localObject1 = this.iqX;
    Object localObject2 = this.iqL;
    int i = this.iqN.iCo;
    ((AppBrandRemoteTaskController)localObject1).jpz = AppBrandRemoteTaskController.a.jpG;
    ((AppBrandRemoteTaskController)localObject1).iqL = ((String)localObject2);
    ((AppBrandRemoteTaskController)localObject1).jpx = i;
    AppBrandMainProcessService.a((MainProcessTask)localObject1);
    localObject1 = this.iqR;
    if (((l)localObject1).jkl.size() != 0)
    {
      ((com.tencent.mm.plugin.appbrand.page.j)((l)localObject1).jkl.getFirst()).YL();
      ((l)localObject1).jkq.c((com.tencent.mm.plugin.appbrand.page.j)((l)localObject1).jkl.peekFirst());
    }
    this.irc.iCL.hN(3);
    localObject1 = this.iqY;
    boolean bool = this.irf;
    localObject2 = new HashMap();
    Object localObject3 = this.iqW;
    if (localObject3 != null) {
      ((HashMap)localObject2).put("scene", Integer.valueOf(((AppBrandStatObject)localObject3).scene));
    }
    localObject3 = this.iqN.iIA.Ul();
    if (localObject3 != null) {
      ((HashMap)localObject2).put("referrerInfo", localObject3);
    }
    localObject3 = this.iqN.Uk();
    if (localObject3 != null) {
      ((HashMap)localObject2).put("shareInfo", localObject3);
    }
    ((HashMap)localObject2).put("relaunch", Boolean.valueOf(bool));
    ((HashMap)localObject2).put("reLaunch", Boolean.valueOf(bool));
    ((com.tencent.mm.plugin.appbrand.page.f)localObject1).r((Map)localObject2).a(this.iqQ).VI();
    if (this.irf) {
      this.iqR.N(RB(), true);
    }
    localObject1 = this.iqN;
    if (!bg.mZ(((AppBrandInitConfig)localObject1).appId))
    {
      localObject2 = a.nx(((AppBrandInitConfig)localObject1).appId);
      if (localObject2 != null)
      {
        localObject3 = a.ny(((AppBrandInitConfig)localObject1).appId);
        if (localObject3 != null) {
          break label500;
        }
      }
    }
    for (;;)
    {
      localObject1 = this.ira;
      com.tencent.mm.sdk.platformtools.w.i("MicroMsg.AppBrandUserCaptureScreenMonitor", "onResume");
      au.a(((com.tencent.mm.plugin.appbrand.o.c)localObject1).jwg);
      a(this.iqO);
      this.ire = false;
      this.irf = false;
      this.irg = false;
      this.irh = false;
      GMTrace.o(15529796435968L, 115706);
      return;
      label500:
      com.tencent.mm.sdk.platformtools.w.i("MicroMsg.AppBrandTaskUsageRecorder", "updateUsage, appId %s, type %d", new Object[] { ((AppBrandInitConfig)localObject1).appId, Integer.valueOf(((AppBrandInitConfig)localObject1).iCo) });
      String str = i.nM(((AppBrandInitConfig)localObject1).appId).irM;
      AppBrandMainProcessService.a(new AppBrandTaskUsageRecorder.UpdateTask(new AppBrandTaskUsageRecorder.LaunchCheckParams((AppBrandInitConfig)localObject1, (AppBrandStatObject)localObject3, ((AppBrandSysConfig)localObject2).iJa.iCy, ((AppBrandSysConfig)localObject2).iJb.iCy, str)));
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */