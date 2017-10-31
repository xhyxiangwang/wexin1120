package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component;

import android.annotation.TargetApi;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ac.e;
import com.tencent.mm.ac.k;
import com.tencent.mm.bu.a;
import com.tencent.mm.plugin.sns.i.f;
import com.tencent.mm.plugin.sns.i.g;
import com.tencent.mm.plugin.sns.model.AdLandingPagesProxy;
import com.tencent.mm.plugin.sns.model.AdLandingPagesProxy.a;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.a.a;
import com.tencent.mm.plugin.sns.ui.widget.SnsTextProgressBar;
import com.tencent.mm.pluginsdk.model.app.g;
import com.tencent.mm.pluginsdk.model.app.g.c;
import com.tencent.mm.protocal.c.ks;
import com.tencent.mm.protocal.c.ku;
import com.tencent.mm.sdk.d.c;
import com.tencent.mm.sdk.d.d.c;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.base.h;
import java.io.IOException;
import java.io.Serializable;
import java.util.List;

public final class m
  extends j
  implements e, Serializable
{
  public Button qpQ;
  public SnsTextProgressBar qpR;
  public a qpS;
  public b qpT;
  private View.OnClickListener qpU;
  AdLandingPagesProxy.a qpV;
  
  public m(Context paramContext, com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.b paramb, ViewGroup paramViewGroup)
  {
    super(paramContext, paramb, paramViewGroup);
    GMTrace.i(8287542050816L, 61747);
    this.qpU = new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(8255598231552L, 61509);
        m.this.qpS.zG(0);
        m.this.biY();
        GMTrace.o(8255598231552L, 61509);
      }
    };
    this.qpV = new AdLandingPagesProxy.a()
    {
      public final void al(Object paramAnonymousObject)
      {
        GMTrace.i(15276259147776L, 113817);
        GMTrace.o(15276259147776L, 113817);
      }
      
      public final void f(int paramAnonymousInt1, int paramAnonymousInt2, Object paramAnonymousObject)
      {
        GMTrace.i(17836328091648L, 132891);
        if ((paramAnonymousInt1 != 0) || (paramAnonymousInt2 != 0))
        {
          m.this.qpS.zG(5);
          GMTrace.o(17836328091648L, 132891);
          return;
        }
        ku localku = new ku();
        try
        {
          localku.aC((byte[])paramAnonymousObject);
          if (!TextUtils.isEmpty(localku.tHd))
          {
            w.d("MicroMsg.AdLandingPageDownloadApkBtnComp", "opening url " + localku.tHd);
            paramAnonymousObject = new Intent();
            ((Intent)paramAnonymousObject).putExtra("rawUrl", localku.tHd);
            ((Intent)paramAnonymousObject).putExtra("showShare", true);
            com.tencent.mm.bi.d.b(m.this.context, "webview", ".ui.tools.WebViewUI", (Intent)paramAnonymousObject);
            m.this.qpS.zG(10);
            GMTrace.o(17836328091648L, 132891);
            return;
          }
        }
        catch (IOException paramAnonymousObject)
        {
          for (;;)
          {
            w.e("MicroMsg.AdLandingPageDownloadApkBtnComp", bg.f((Throwable)paramAnonymousObject));
          }
          if (localku.tHc != null)
          {
            m.this.bjb().qmF = localku.tHc.tGT;
            m.this.bjb().fwU = localku.tHc.tGR;
            m.this.bjb().downloadUrl = localku.tHc.tGS;
            m.this.bjb().fileSize = localku.tHc.tGW;
            m.this.qpS.zG(6);
            GMTrace.o(17836328091648L, 132891);
            return;
          }
          w.i("MicroMsg.AdLandingPageDownloadApkBtnComp", "resp null");
          m.this.qpS.zG(5);
          GMTrace.o(17836328091648L, 132891);
        }
      }
    };
    this.qpS = new a("apkStateMachine");
    GMTrace.o(8287542050816L, 61747);
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(8288347357184L, 61753);
    GMTrace.o(8288347357184L, 61753);
  }
  
  protected final int aWs()
  {
    GMTrace.i(8287944704000L, 61750);
    int i = i.g.pOk;
    GMTrace.o(8287944704000L, 61750);
    return i;
  }
  
  @TargetApi(17)
  public final View biL()
  {
    GMTrace.i(8287810486272L, 61749);
    this.qpv = 0;
    View localView = this.iiK;
    this.qpQ = ((Button)localView.findViewById(i.f.bCx));
    this.qpQ.setOnClickListener(this.qpU);
    this.qpR = ((SnsTextProgressBar)localView.findViewById(i.f.pJG));
    this.qpR.setProgress(0);
    this.qpR.setVisibility(8);
    this.qpR.setOnClickListener(this.qpU);
    this.qpS.start();
    GMTrace.o(8287810486272L, 61749);
    return localView;
  }
  
  protected final void biR()
  {
    GMTrace.i(8287676268544L, 61748);
    this.qpQ.setText(((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.b)this.qpH).title);
    this.qpS.zG(11);
    GMTrace.o(8287676268544L, 61748);
  }
  
  public final void biu()
  {
    GMTrace.i(8288213139456L, 61752);
    super.biu();
    if (this.qpT != null)
    {
      this.context.unregisterReceiver(this.qpT);
      this.qpT = null;
    }
    GMTrace.o(8288213139456L, 61752);
  }
  
  public final void biv()
  {
    GMTrace.i(8288078921728L, 61751);
    super.biv();
    this.qpS.zG(2);
    GMTrace.o(8288078921728L, 61751);
  }
  
  public final com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.b bjb()
  {
    GMTrace.i(16043984551936L, 119537);
    com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.b localb = (com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.b)this.qpH;
    GMTrace.o(16043984551936L, 119537);
    return localb;
  }
  
  public final boolean bjc()
  {
    GMTrace.i(8288481574912L, 61754);
    if ((this.context == null) || (TextUtils.isEmpty(((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.b)this.qpH).fKY)) || (TextUtils.isEmpty(((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.b)this.qpH).tK)))
    {
      GMTrace.o(8288481574912L, 61754);
      return false;
    }
    final Intent localIntent;
    Object localObject;
    if (!TextUtils.isEmpty(((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.b)this.qpH).qmJ))
    {
      localIntent = new Intent("android.intent.action.VIEW", Uri.parse(((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.b)this.qpH).qmJ));
      localIntent.addFlags(268435456);
      localObject = bg.y(this.context, localIntent);
      if ((localObject != null) && (!((List)localObject).isEmpty()))
      {
        if ((!TextUtils.isEmpty(localIntent.getPackage())) || (((List)localObject).size() != 1)) {
          break label243;
        }
        localObject = g.b((ResolveInfo)((List)localObject).get(0));
        if (!bg.mY(com.tencent.mm.sdk.platformtools.ab.getPackageName()).equals(localObject)) {
          a.post(new Runnable()
          {
            public final void run()
            {
              GMTrace.i(18579625869312L, 138429);
              g.a(m.this.context, localIntent, g.m(m.this.context, m.this.bjb().fKY), new g.c()
              {
                public final void eR(boolean paramAnonymous2Boolean)
                {
                  GMTrace.i(18580699611136L, 138437);
                  if (!paramAnonymous2Boolean) {
                    ab.df(m.this.context);
                  }
                  GMTrace.o(18580699611136L, 138437);
                }
              });
              GMTrace.o(18579625869312L, 138429);
            }
          });
        }
      }
    }
    for (;;)
    {
      AdLandingPagesProxy.getInstance().reportDownloadInfo(9, ((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.b)this.qpH).fKY, ((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.b)this.qpH).tK, ((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.b)this.qpH).fwU, ((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.b)this.qpH).downloadUrl);
      GMTrace.o(8288481574912L, 61754);
      return true;
      label243:
      localObject = localIntent.getPackage();
      break;
      a.post(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(18578283692032L, 138419);
          Intent localIntent = m.this.context.getPackageManager().getLaunchIntentForPackage(m.this.bjb().tK);
          g.a(m.this.context, localIntent, g.m(m.this.context, m.this.bjb().fKY), new g.c()
          {
            public final void eR(boolean paramAnonymous2Boolean)
            {
              GMTrace.i(18580968046592L, 138439);
              if (!paramAnonymous2Boolean) {
                ab.df(m.this.context);
              }
              GMTrace.o(18580968046592L, 138439);
            }
          });
          GMTrace.o(18578283692032L, 138419);
        }
      });
    }
  }
  
  public final void bjd()
  {
    GMTrace.i(16641924530176L, 123992);
    w.d("MicroMsg.AdLandingPageDownloadApkBtnComp", "writing deferred deep link");
    AdLandingPagesProxy.getInstance().writeDeferredDeepLink(((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.b)this.qpH).tK, ((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.b)this.qpH).qmJ);
    GMTrace.o(16641924530176L, 123992);
  }
  
  final class a
    extends com.tencent.mm.sdk.d.d
    implements Serializable
  {
    c qpZ;
    c qqa;
    c qqb;
    c qqc;
    c qqd;
    c qqe;
    c qqf;
    c qqg;
    c qqh;
    
    protected a(String paramString)
    {
      super(Looper.getMainLooper());
      GMTrace.i(8230633734144L, 61323);
      this.qpZ = new c();
      this.qqa = new g();
      this.qqb = new e();
      this.qqc = new h();
      this.qqd = new i();
      this.qqe = new f();
      this.qqf = new b();
      this.qqg = new a();
      this.qqh = new d();
      b(this.qqa);
      b(this.qpZ);
      b(this.qqb);
      b(this.qqc);
      b(this.qqd);
      b(this.qqe);
      b(this.qqf);
      b(this.qqg);
      b(this.qqh);
      c(this.qqh);
      AdLandingPagesProxy.getInstance().addReportInfo(m.this.bjb().fKY, m.this.bjb().qlp, m.this.bjb().qlo);
      GMTrace.o(8230633734144L, 61323);
    }
    
    public final void Hq(String paramString)
    {
      GMTrace.i(16042776592384L, 119528);
      h.bl(m.this.context, paramString);
      GMTrace.o(16042776592384L, 119528);
    }
    
    final class a
      extends com.tencent.mm.sdk.d.b
    {
      a()
      {
        GMTrace.i(8273986060288L, 61646);
        GMTrace.o(8273986060288L, 61646);
      }
      
      public final void enter()
      {
        GMTrace.i(8274120278016L, 61647);
        super.enter();
        m.this.qpR.setVisibility(8);
        m.this.qpQ.setEnabled(false);
        Button localButton = m.this.qpQ;
        if (!TextUtils.isEmpty(m.this.bjb().qmI)) {}
        for (String str = m.this.bjb().qmI;; str = "暂不支持安卓手机")
        {
          localButton.setText(str);
          m.this.qpQ.setVisibility(0);
          GMTrace.o(8274120278016L, 61647);
          return;
        }
      }
    }
    
    final class b
      extends com.tencent.mm.sdk.d.b
    {
      b()
      {
        GMTrace.i(8255732449280L, 61510);
        GMTrace.o(8255732449280L, 61510);
      }
      
      public final void enter()
      {
        GMTrace.i(8256000884736L, 61512);
        super.enter();
        AdLandingPagesProxy.getInstance().doAdChannelScene(m.this.bjb().tK, m.this.bjb().channelId, m.this.qpV);
        AdLandingPagesProxy.getInstance().stopTask(m.this.bjb().fKY);
        m.this.qpQ.setVisibility(8);
        m.this.qpR.setVisibility(0);
        m.this.qpR.setProgress(0);
        w.i("LogStateTransitionState", "appid %s, channelId %s", new Object[] { m.this.bjb().tK, m.this.bjb().channelId });
        GMTrace.o(8256000884736L, 61512);
      }
      
      public final boolean f(Message paramMessage)
      {
        GMTrace.i(8255866667008L, 61511);
        w.i("LogStateTransitionState", "recv msg.what " + paramMessage.what);
        switch (paramMessage.what)
        {
        default: 
          GMTrace.o(8255866667008L, 61511);
          return false;
        case 6: 
          m.a.this.b(m.a.this.qpZ);
          GMTrace.o(8255866667008L, 61511);
          return true;
        case 5: 
          m.a.this.Hq("下载失败");
          m.a.this.b(m.a.this.qqe);
          GMTrace.o(8255866667008L, 61511);
          return true;
        case 10: 
          m.a.this.b(m.a.this.qqa);
          GMTrace.o(8255866667008L, 61511);
          return true;
        }
        m.a.this.b(m.a.this.qqb);
        GMTrace.o(8255866667008L, 61511);
        return true;
      }
    }
    
    final class c
      extends com.tencent.mm.sdk.d.b
    {
      a.a qqj;
      
      c()
      {
        GMTrace.i(8237344620544L, 61373);
        GMTrace.o(8237344620544L, 61373);
      }
      
      public final void enter()
      {
        GMTrace.i(8237478838272L, 61374);
        super.enter();
        m.this.qpQ.setVisibility(8);
        m.this.qpR.setVisibility(0);
        if ((AdLandingPagesProxy.getInstance().isPaused(m.this.bjb().fKY)) || (AdLandingPagesProxy.getInstance().isDownloading(m.this.bjb().fKY)))
        {
          if (this.qqj == null) {
            this.qqj = new a();
          }
          m.this.qpR.setProgress(AdLandingPagesProxy.getInstance().getTaskProgress(m.this.bjb().fKY));
          if (!AdLandingPagesProxy.getInstance().resumeTask(m.this.bjb().fKY, this.qqj, m.this.bjb().qlp, m.this.bjb().qlo))
          {
            AdLandingPagesProxy.getInstance().stopTask(m.this.bjb().fKY);
            m.a.this.b(m.a.this.qpZ);
            GMTrace.o(8237478838272L, 61374);
          }
        }
        else
        {
          if (TextUtils.isEmpty(m.this.bjb().downloadUrl))
          {
            m.a.this.b(m.a.this.qqf);
            GMTrace.o(8237478838272L, 61374);
            return;
          }
          if (AdLandingPagesProxy.getInstance().isApkExist(m.this.bjb().fKY))
          {
            m.this.qpR.setProgress(100);
            m.a.this.b(m.a.this.qqc);
            GMTrace.o(8237478838272L, 61374);
            return;
          }
          AdLandingPagesProxy.getInstance().stopTask(m.this.bjb().fKY);
          this.qqj = new a();
          AdLandingPagesProxy.getInstance().startDownload(m.this.bjb().fKY, m.this.bjb().tK, m.this.bjb().fwU, m.this.bjb().downloadUrl, m.this.bjb().qmF, m.this.bjb().qmG, this.qqj, m.this.bjb().qlp, m.this.bjb().qlo);
        }
        GMTrace.o(8237478838272L, 61374);
      }
      
      public final boolean f(Message paramMessage)
      {
        GMTrace.i(8237613056000L, 61375);
        w.i("LogStateTransitionState", "recv msg.what " + paramMessage.what);
        switch (paramMessage.what)
        {
        case 2: 
        case 4: 
        case 5: 
        case 6: 
        default: 
          GMTrace.o(8237613056000L, 61375);
          return false;
        case 0: 
          if ((AdLandingPagesProxy.getInstance().pauseTask(m.this.bjb().fKY)) && (AdLandingPagesProxy.getInstance().isPaused(m.this.bjb().fKY))) {
            m.a.this.b(m.a.this.qqb);
          }
          GMTrace.o(8237613056000L, 61375);
          return true;
        case 1: 
          int i = paramMessage.arg1;
          if (i >= 0) {
            m.this.qpR.setProgress(i);
          }
          GMTrace.o(8237613056000L, 61375);
          return true;
        case 3: 
          m.a.this.b(m.a.this.qqd);
          GMTrace.o(8237613056000L, 61375);
          return true;
        case 7: 
          m.a.this.b(m.a.this.qqb);
          GMTrace.o(8237613056000L, 61375);
          return true;
        case 8: 
          m.a.this.Hq("下载失败");
          m.a.this.b(m.a.this.qqe);
          GMTrace.o(8237613056000L, 61375);
          return true;
        }
        if (m.this.bjb().qmG) {
          AdLandingPagesProxy.getInstance().reportDownloadInfo(4, m.this.bjb().fKY, m.this.bjb().tK, m.this.bjb().fwU, m.this.bjb().downloadUrl);
        }
        m.this.bjd();
        m.a.this.b(m.a.this.qqc);
        GMTrace.o(8237613056000L, 61375);
        return true;
      }
      
      private final class a
        implements a.a
      {
        public a()
        {
          GMTrace.i(8222714888192L, 61264);
          GMTrace.o(8222714888192L, 61264);
        }
        
        public final void bgm()
        {
          GMTrace.i(8222983323648L, 61266);
          w.i("LogStateTransitionState", "paused");
          m.this.qpS.zG(7);
          GMTrace.o(8222983323648L, 61266);
        }
        
        public final void bgn()
        {
          GMTrace.i(15249281384448L, 113616);
          GMTrace.o(15249281384448L, 113616);
        }
        
        public final void bgo()
        {
          GMTrace.i(8223117541376L, 61267);
          m.this.qpS.zG(9);
          GMTrace.o(8223117541376L, 61267);
        }
        
        public final void bgp()
        {
          GMTrace.i(8223251759104L, 61268);
          m.this.qpS.zG(8);
          GMTrace.o(8223251759104L, 61268);
        }
        
        public final void bgq()
        {
          GMTrace.i(15249415602176L, 113617);
          GMTrace.o(15249415602176L, 113617);
        }
        
        public final void start()
        {
          GMTrace.i(15249147166720L, 113615);
          GMTrace.o(15249147166720L, 113615);
        }
        
        public final void tU(int paramInt)
        {
          GMTrace.i(8222849105920L, 61265);
          m.a locala = m.this.qpS;
          d.c localc = locala.uPX;
          if (localc != null) {
            localc.sendMessage(Message.obtain(locala.uPX, 1, paramInt, 0));
          }
          GMTrace.o(8222849105920L, 61265);
        }
      }
    }
    
    final class d
      extends com.tencent.mm.sdk.d.b
    {
      d()
      {
        GMTrace.i(8263919730688L, 61571);
        GMTrace.o(8263919730688L, 61571);
      }
      
      public final void enter()
      {
        GMTrace.i(8264053948416L, 61572);
        super.enter();
        com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.b localb = m.this.bjb();
        if ((localb.qmH == 0) || (localb.qmH == 2)) {}
        for (int i = 1; i != 0; i = 0)
        {
          m.a.this.b(m.a.this.qqa);
          GMTrace.o(8264053948416L, 61572);
          return;
        }
        m.a.this.b(m.a.this.qqg);
        GMTrace.o(8264053948416L, 61572);
      }
    }
    
    final class e
      extends com.tencent.mm.sdk.d.b
    {
      e()
      {
        GMTrace.i(8253853401088L, 61496);
        GMTrace.o(8253853401088L, 61496);
      }
      
      public final void enter()
      {
        GMTrace.i(8253987618816L, 61497);
        super.enter();
        m.this.qpR.setVisibility(8);
        m.this.qpQ.setVisibility(0);
        m.this.qpQ.setText("继续下载");
        GMTrace.o(8253987618816L, 61497);
      }
      
      public final boolean f(Message paramMessage)
      {
        GMTrace.i(8254121836544L, 61498);
        w.i("LogStateTransitionState", "recv msg.what " + paramMessage.what);
        switch (paramMessage.what)
        {
        default: 
          GMTrace.o(8254121836544L, 61498);
          return false;
        case 0: 
          m.a.this.b(m.a.this.qpZ);
          GMTrace.o(8254121836544L, 61498);
          return true;
        case 3: 
          m.a.this.b(m.a.this.qqd);
          GMTrace.o(8254121836544L, 61498);
          return true;
        }
        m.a.this.Hq("下载失败");
        m.a.this.b(m.a.this.qqe);
        GMTrace.o(8254121836544L, 61498);
        return true;
      }
    }
    
    final class f
      extends com.tencent.mm.sdk.d.b
    {
      f()
      {
        GMTrace.i(8232647000064L, 61338);
        GMTrace.o(8232647000064L, 61338);
      }
      
      public final void enter()
      {
        GMTrace.i(8232781217792L, 61339);
        super.enter();
        m.this.qpR.setVisibility(8);
        m.this.qpQ.setVisibility(0);
        m.this.qpQ.setText("重新下载");
        GMTrace.o(8232781217792L, 61339);
      }
      
      public final boolean f(Message paramMessage)
      {
        GMTrace.i(8232915435520L, 61340);
        w.i("LogStateTransitionState", "recv msg.what " + paramMessage.what);
        switch (paramMessage.what)
        {
        default: 
          GMTrace.o(8232915435520L, 61340);
          return false;
        }
        m.a.this.b(m.a.this.qqf);
        GMTrace.o(8232915435520L, 61340);
        return true;
      }
    }
    
    final class g
      extends com.tencent.mm.sdk.d.b
    {
      g()
      {
        GMTrace.i(8275730890752L, 61659);
        GMTrace.o(8275730890752L, 61659);
      }
      
      public final void enter()
      {
        GMTrace.i(8275865108480L, 61660);
        super.enter();
        if (m.this.qpT == null)
        {
          m.this.qpT = new m.b(m.this, (byte)0);
          IntentFilter localIntentFilter = new IntentFilter();
          localIntentFilter.addAction("android.intent.action.PACKAGE_ADDED");
          localIntentFilter.addAction("android.intent.action.PACKAGE_REMOVED");
          localIntentFilter.addDataScheme("package");
          m.this.context.registerReceiver(m.this.qpT, localIntentFilter);
        }
        if (AdLandingPagesProxy.getInstance().isPkgInstalled(m.this.bjb().tK))
        {
          m.a.this.b(m.a.this.qqd);
          GMTrace.o(8275865108480L, 61660);
          return;
        }
        if (AdLandingPagesProxy.getInstance().isApkExist(m.this.bjb().fKY))
        {
          m.a.this.b(m.a.this.qqc);
          GMTrace.o(8275865108480L, 61660);
          return;
        }
        if (AdLandingPagesProxy.getInstance().isDownloading(m.this.bjb().fKY))
        {
          m.a.this.b(m.a.this.qpZ);
          GMTrace.o(8275865108480L, 61660);
          return;
        }
        if (AdLandingPagesProxy.getInstance().isPaused(m.this.bjb().fKY))
        {
          m.a.this.b(m.a.this.qqb);
          GMTrace.o(8275865108480L, 61660);
          return;
        }
        m.this.qpR.setVisibility(8);
        m.this.qpQ.setVisibility(0);
        m.this.qpQ.setText(m.this.bjb().title);
        GMTrace.o(8275865108480L, 61660);
      }
      
      public final boolean f(Message paramMessage)
      {
        GMTrace.i(8275999326208L, 61661);
        w.i("LogStateTransitionState", "recv msg.what " + paramMessage.what);
        switch (paramMessage.what)
        {
        default: 
          GMTrace.o(8275999326208L, 61661);
          return false;
        case 0: 
          m.a.this.b(m.a.this.qqf);
          GMTrace.o(8275999326208L, 61661);
          return true;
        case 3: 
          m.a.this.b(m.a.this.qqd);
          GMTrace.o(8275999326208L, 61661);
          return true;
        }
        m.a.this.b(m.a.this.qqa);
        GMTrace.o(8275999326208L, 61661);
        return true;
      }
    }
    
    final class h
      extends com.tencent.mm.sdk.d.b
    {
      private boolean qql;
      
      h()
      {
        GMTrace.i(8284589260800L, 61725);
        GMTrace.o(8284589260800L, 61725);
      }
      
      public final void enter()
      {
        GMTrace.i(8284723478528L, 61726);
        super.enter();
        if (!AdLandingPagesProxy.getInstance().isApkExist(m.this.bjb().fKY))
        {
          m.a.this.b(m.a.this.qqa);
          GMTrace.o(8284723478528L, 61726);
          return;
        }
        m.this.qpR.setVisibility(8);
        m.this.qpQ.setVisibility(0);
        m.this.qpQ.setText("安装应用");
        this.qql = true;
        GMTrace.o(8284723478528L, 61726);
      }
      
      public final boolean f(Message paramMessage)
      {
        GMTrace.i(8284857696256L, 61727);
        w.i("LogStateTransitionState", "recv msg.what " + paramMessage.what);
        switch (paramMessage.what)
        {
        case 1: 
        default: 
          GMTrace.o(8284857696256L, 61727);
          return false;
        case 0: 
          if (AdLandingPagesProxy.getInstance().installApp(m.this.context, m.this.bjb().fKY))
          {
            this.qql = true;
            GMTrace.o(8284857696256L, 61727);
            return true;
          }
          m.a.this.Hq("安装失败");
          m.a.this.b(m.a.this.qqe);
          GMTrace.o(8284857696256L, 61727);
          return true;
        case 2: 
          if (!AdLandingPagesProxy.getInstance().isApkExist(m.this.bjb().fKY)) {
            m.a.this.b(m.a.this.qqa);
          }
          GMTrace.o(8284857696256L, 61727);
          return true;
        }
        if (this.qql)
        {
          this.qql = false;
          AdLandingPagesProxy.getInstance().reportDownloadInfo(5, m.this.bjb().fKY, m.this.bjb().tK, m.this.bjb().fwU, m.this.bjb().downloadUrl);
        }
        m.a.this.b(m.a.this.qqd);
        GMTrace.o(8284857696256L, 61727);
        return true;
      }
    }
    
    final class i
      extends com.tencent.mm.sdk.d.b
    {
      i()
      {
        GMTrace.i(8221506928640L, 61255);
        GMTrace.o(8221506928640L, 61255);
      }
      
      public final void enter()
      {
        GMTrace.i(8221641146368L, 61256);
        super.enter();
        if (AdLandingPagesProxy.getInstance().isPkgInstalled(m.this.bjb().tK))
        {
          m.this.qpR.setVisibility(8);
          m.this.qpQ.setVisibility(0);
          m.this.qpQ.setText("打开应用");
          GMTrace.o(8221641146368L, 61256);
          return;
        }
        m.a.this.b(m.a.this.qqc);
        GMTrace.o(8221641146368L, 61256);
      }
      
      public final boolean f(Message paramMessage)
      {
        GMTrace.i(8221775364096L, 61257);
        w.i("LogStateTransitionState", "recv msg.what " + paramMessage.what);
        switch (paramMessage.what)
        {
        default: 
          GMTrace.o(8221775364096L, 61257);
          return false;
        case 0: 
          if (m.this.bjc())
          {
            GMTrace.o(8221775364096L, 61257);
            return true;
          }
          m.a.this.Hq("打开失败");
          m.a.this.b(m.a.this.qqd);
          GMTrace.o(8221775364096L, 61257);
          return true;
        }
        m.a.this.b(m.a.this.qqa);
        AdLandingPagesProxy.getInstance().deleteDeferredDeepLink(m.this.bjb().tK);
        GMTrace.o(8221775364096L, 61257);
        return true;
      }
    }
  }
  
  private final class b
    extends BroadcastReceiver
    implements Serializable
  {
    private b()
    {
      GMTrace.i(8234794483712L, 61354);
      GMTrace.o(8234794483712L, 61354);
    }
    
    public final void onReceive(Context paramContext, Intent paramIntent)
    {
      GMTrace.i(8234928701440L, 61355);
      if (paramIntent != null)
      {
        paramContext = paramIntent.getAction();
        if ("android.intent.action.PACKAGE_ADDED".equals(paramContext))
        {
          paramContext = paramIntent.getData().getSchemeSpecificPart();
          if ((!TextUtils.isEmpty(paramContext)) && (paramContext.equals(m.this.bjb().tK))) {
            m.this.qpS.zG(3);
          }
          GMTrace.o(8234928701440L, 61355);
          return;
        }
        if ("android.intent.action.PACKAGE_REMOVED".equals(paramContext))
        {
          paramContext = paramIntent.getData().getSchemeSpecificPart();
          if ((!TextUtils.isEmpty(paramContext)) && (paramContext.equals(m.this.bjb().tK))) {
            m.this.qpS.zG(4);
          }
        }
      }
      GMTrace.o(8234928701440L, 61355);
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */