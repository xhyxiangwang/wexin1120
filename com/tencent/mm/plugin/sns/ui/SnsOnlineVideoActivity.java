package com.tencent.mm.plugin.sns.ui;

import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.view.GestureDetector;
import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;
import android.view.View.OnTouchListener;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnPreDrawListener;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.a.df;
import com.tencent.mm.g.a.df.b;
import com.tencent.mm.g.a.gi;
import com.tencent.mm.g.a.pa;
import com.tencent.mm.g.a.pb;
import com.tencent.mm.g.a.pu;
import com.tencent.mm.g.a.pu.a;
import com.tencent.mm.g.a.rb;
import com.tencent.mm.modelsfs.FileOp;
import com.tencent.mm.plugin.messenger.a.c;
import com.tencent.mm.plugin.sns.i.d;
import com.tencent.mm.plugin.sns.i.f;
import com.tencent.mm.plugin.sns.i.g;
import com.tencent.mm.plugin.sns.i.j;
import com.tencent.mm.plugin.sns.model.am;
import com.tencent.mm.plugin.sns.storage.n;
import com.tencent.mm.pluginsdk.h;
import com.tencent.mm.pluginsdk.ui.tools.f;
import com.tencent.mm.protocal.c.amn;
import com.tencent.mm.protocal.c.aq;
import com.tencent.mm.protocal.c.as;
import com.tencent.mm.protocal.c.bhc;
import com.tencent.mm.protocal.c.nn;
import com.tencent.mm.sdk.b.b;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.b;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.ad;
import com.tencent.mm.ui.base.o.c;
import com.tencent.mm.ui.base.o.d;
import com.tencent.mm.ui.p;
import com.tencent.mm.ui.tools.g.b;
import com.tencent.mm.ui.widget.e.a;
import com.tencent.mm.x.o;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

@com.tencent.mm.ui.base.a(3)
public class SnsOnlineVideoActivity
  extends MMActivity
{
  private VelocityTracker ez;
  private String fAx;
  private String fBx;
  private amn fNf;
  private String hCR;
  private GestureDetector jds;
  private int kvA;
  private Bundle kvu;
  private boolean kvv;
  private com.tencent.mm.ui.tools.g kvw;
  private int kvx;
  private int kvy;
  private int kvz;
  private boolean kwx;
  private RelativeLayout lWD;
  private ImageView lWE;
  private boolean lWk;
  o.d nHl;
  private boolean nJL;
  private com.tencent.mm.ui.widget.e qAV;
  private boolean qDi;
  private Button qGN;
  private float qGW;
  private int qGX;
  private int qGY;
  private com.tencent.mm.plugin.sns.storage.m qGc;
  private OnlineVideoView qMd;
  private boolean qMe;
  private boolean qMf;
  private float qMg;
  private float qMh;
  private boolean qMi;
  private boolean qMj;
  private boolean qMk;
  o.c qMl;
  private int scene;
  
  public SnsOnlineVideoActivity()
  {
    GMTrace.i(8689255710720L, 64740);
    this.lWk = true;
    this.scene = 0;
    this.qMe = false;
    this.kvv = false;
    this.kvx = 0;
    this.kvy = 0;
    this.kvz = 0;
    this.kvA = 0;
    this.qMg = 0.0F;
    this.qMh = 0.0F;
    this.qMi = false;
    this.qMj = false;
    this.qMk = false;
    this.qGW = 1.0F;
    this.qGX = 0;
    this.qGY = 0;
    this.qMl = new o.c()
    {
      public final void a(com.tencent.mm.ui.base.m paramAnonymousm)
      {
        int i = 1;
        GMTrace.i(16633603031040L, 123930);
        if (bg.RF(com.tencent.mm.k.g.uz().getValue("SIGHTCannotTransmitForFav")) == 0)
        {
          boolean bool1 = FileOp.aZ(SnsOnlineVideoActivity.n(SnsOnlineVideoActivity.this));
          boolean bool2 = FileOp.aZ(SnsOnlineVideoActivity.o(SnsOnlineVideoActivity.this));
          w.i("MicroMsg.SnsOnlineVideoActivity", "config can forward sight, thumb existed %B, video existed %B", new Object[] { Boolean.valueOf(bool1), Boolean.valueOf(bool2) });
          paramAnonymousm.add(0, 3, 0, SnsOnlineVideoActivity.this.getString(i.j.pRD));
          if ((!bool1) || (!bool2)) {}
        }
        for (;;)
        {
          if (com.tencent.mm.bi.d.KT("favorite")) {
            paramAnonymousm.add(0, 2, 0, SnsOnlineVideoActivity.this.getString(i.j.euj));
          }
          paramAnonymousm.add(0, 5, 0, SnsOnlineVideoActivity.this.getString(i.j.eCW));
          if (i != 0)
          {
            df localdf = new df();
            localdf.fxU.fxL = SnsOnlineVideoActivity.p(SnsOnlineVideoActivity.this);
            com.tencent.mm.sdk.b.a.uLm.m(localdf);
            if (localdf.fxV.fxs) {
              paramAnonymousm.add(0, 4, 0, SnsOnlineVideoActivity.this.getString(i.j.pQV));
            }
          }
          GMTrace.o(16633603031040L, 123930);
          return;
          i = 0;
        }
      }
    };
    this.nHl = new o.d()
    {
      public final void c(MenuItem paramAnonymousMenuItem, int paramAnonymousInt)
      {
        boolean bool = false;
        GMTrace.i(16632395071488L, 123921);
        switch (paramAnonymousMenuItem.getItemId())
        {
        }
        for (;;)
        {
          GMTrace.o(16632395071488L, 123921);
          return;
          paramAnonymousMenuItem = new pu();
          paramAnonymousMenuItem.fNB.fAI = 2;
          paramAnonymousMenuItem.fNB.fNC = 17;
          Object localObject = paramAnonymousMenuItem.fNB;
          if (SnsOnlineVideoActivity.q(SnsOnlineVideoActivity.this) == 0) {
            bool = true;
          }
          ((pu.a)localObject).fND = bool;
          paramAnonymousMenuItem.fNB.fAx = SnsOnlineVideoActivity.p(SnsOnlineVideoActivity.this);
          com.tencent.mm.sdk.b.a.uLm.m(paramAnonymousMenuItem);
          GMTrace.o(16632395071488L, 123921);
          return;
          localObject = new Intent();
          com.tencent.mm.plugin.sns.storage.m localm = com.tencent.mm.plugin.sns.model.ae.bhp().HA(SnsOnlineVideoActivity.p(SnsOnlineVideoActivity.this));
          if (localm != null) {
            w.i("MicroMsg.SnsOnlineVideoActivity", "expose id " + localm.bjM());
          }
          if (localm == null)
          {
            paramAnonymousMenuItem = Integer.valueOf(0);
            ((Intent)localObject).putExtra("k_expose_msg_id", paramAnonymousMenuItem);
            if (localm != null) {
              break label296;
            }
          }
          label296:
          for (paramAnonymousMenuItem = "";; paramAnonymousMenuItem = localm.field_userName)
          {
            ((Intent)localObject).putExtra("k_username", paramAnonymousMenuItem);
            ((Intent)localObject).putExtra("showShare", false);
            ((Intent)localObject).putExtra("rawUrl", String.format("https://weixin110.qq.com/security/readtemplate?t=weixin_report/w_type&scene=%d#wechat_redirect", new Object[] { Integer.valueOf(33) }));
            com.tencent.mm.bi.d.b(SnsOnlineVideoActivity.this, "webview", ".ui.tools.WebViewUI", (Intent)localObject);
            GMTrace.o(16632395071488L, 123921);
            return;
            paramAnonymousMenuItem = localm.bjM();
            break;
          }
          SnsOnlineVideoActivity.r(SnsOnlineVideoActivity.this);
          paramAnonymousMenuItem = new pu();
          paramAnonymousMenuItem.fNB.fAI = 1;
          paramAnonymousMenuItem.fNB.fNE = 4097;
          paramAnonymousMenuItem.fNB.fAx = SnsOnlineVideoActivity.p(SnsOnlineVideoActivity.this);
          com.tencent.mm.sdk.b.a.uLm.m(paramAnonymousMenuItem);
          GMTrace.o(16632395071488L, 123921);
          return;
          paramAnonymousMenuItem = com.tencent.mm.plugin.sns.model.ae.bhp().HA(SnsOnlineVideoActivity.p(SnsOnlineVideoActivity.this));
          if (paramAnonymousMenuItem == null)
          {
            GMTrace.o(16632395071488L, 123921);
            return;
          }
          localObject = new Intent();
          if ((paramAnonymousMenuItem.bjL().uyu.tKc == 15) && ((amn)paramAnonymousMenuItem.bjL().uyu.tKd.get(0) == null))
          {
            w.w("MicroMsg.SnsOnlineVideoActivity", "send sight fail, mediaObj is null");
            GMTrace.o(16632395071488L, 123921);
            return;
          }
          ((Intent)localObject).putExtra("exdevice_open_scene_type", 2);
          ((Intent)localObject).putExtra("sns_local_id", SnsOnlineVideoActivity.p(SnsOnlineVideoActivity.this));
          ((Intent)localObject).putExtra("sns_send_data_ui_activity", true);
          com.tencent.mm.bi.d.a(SnsOnlineVideoActivity.this, ".ui.chatting.ChattingSendDataToDeviceUI", (Intent)localObject);
          GMTrace.o(16632395071488L, 123921);
          return;
          paramAnonymousMenuItem = new pu();
          paramAnonymousMenuItem.fNB.fAI = 3;
          paramAnonymousMenuItem.fNB.fAx = SnsOnlineVideoActivity.p(SnsOnlineVideoActivity.this);
          com.tencent.mm.sdk.b.a.uLm.m(paramAnonymousMenuItem);
        }
      }
    };
    GMTrace.o(8689255710720L, 64740);
  }
  
  private void ald()
  {
    GMTrace.i(8689658363904L, 64743);
    if (this.qDi)
    {
      w.i("MicroMsg.SnsOnlineVideoActivity", "it is preview mode, don't register menu.");
      GMTrace.o(8689658363904L, 64743);
      return;
    }
    this.qMd.setOnLongClickListener(new View.OnLongClickListener()
    {
      public final boolean onLongClick(View paramAnonymousView)
      {
        GMTrace.i(16632529289216L, 123922);
        SnsOnlineVideoActivity.a(SnsOnlineVideoActivity.this, new com.tencent.mm.ui.widget.e(SnsOnlineVideoActivity.this.vov.voR, com.tencent.mm.ui.widget.e.wSP, false));
        SnsOnlineVideoActivity.l(SnsOnlineVideoActivity.this).qQS = SnsOnlineVideoActivity.this.qMl;
        SnsOnlineVideoActivity.l(SnsOnlineVideoActivity.this).qQT = SnsOnlineVideoActivity.this.nHl;
        SnsOnlineVideoActivity.l(SnsOnlineVideoActivity.this).wTa = new e.a()
        {
          public final void onDismiss()
          {
            GMTrace.i(16633334595584L, 123928);
            SnsOnlineVideoActivity.a(SnsOnlineVideoActivity.this, null);
            GMTrace.o(16633334595584L, 123928);
          }
        };
        SnsOnlineVideoActivity.l(SnsOnlineVideoActivity.this).bCV();
        GMTrace.o(16632529289216L, 123922);
        return true;
      }
    });
    GMTrace.o(8689658363904L, 64743);
  }
  
  private void bnq()
  {
    GMTrace.i(17628961701888L, 131346);
    boolean bool = ad.fd(this);
    int i = ad.fc(this);
    if ((this.nJL) && (bool) && (this.qGN != null) && (this.qGN.getVisibility() == 0))
    {
      ViewGroup.MarginLayoutParams localMarginLayoutParams = (ViewGroup.MarginLayoutParams)this.qGN.getLayoutParams();
      localMarginLayoutParams.bottomMargin = (i + localMarginLayoutParams.bottomMargin);
      this.qGN.setLayoutParams(localMarginLayoutParams);
    }
    GMTrace.o(17628961701888L, 131346);
  }
  
  public final void alb()
  {
    GMTrace.i(8690329452544L, 64748);
    if ((this.qGN != null) && (this.qGN.getVisibility() == 0)) {
      this.qGN.setVisibility(8);
    }
    int k = this.lWD.getWidth();
    int j = this.lWD.getHeight();
    int i = j;
    if (this.kvz != 0)
    {
      i = j;
      if (this.kvA != 0) {
        i = (int)(k / this.kvz * this.kvA);
      }
    }
    this.kvw.ex(k, i);
    this.kvw.p(this.kvy, this.kvx, this.kvz, this.kvA);
    if (this.qGW != 1.0D)
    {
      this.kvw.wKp = (1.0F / this.qGW);
      if ((this.qGX != 0) || (this.qGY != 0))
      {
        j = (int)(this.lWD.getWidth() / 2 * (1.0F - this.qGW));
        k = this.qGX;
        i = (int)(this.lWD.getHeight() / 2 + this.qGY - i / 2 * this.qGW);
        this.kvw.ey(j + k, i);
      }
    }
    this.kvw.a(this.qMd, this.lWE, new g.b()
    {
      public final void onAnimationEnd()
      {
        GMTrace.i(16633200377856L, 123927);
        new com.tencent.mm.sdk.platformtools.ae().post(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(16631589765120L, 123915);
            SnsOnlineVideoActivity.this.finish();
            SnsOnlineVideoActivity.this.overridePendingTransition(0, 0);
            GMTrace.o(16631589765120L, 123915);
          }
        });
        GMTrace.o(16633200377856L, 123927);
      }
      
      public final void onAnimationStart()
      {
        GMTrace.i(16633066160128L, 123926);
        GMTrace.o(16633066160128L, 123926);
      }
    }, null);
    GMTrace.o(8690329452544L, 64748);
  }
  
  public boolean dispatchKeyEvent(KeyEvent paramKeyEvent)
  {
    GMTrace.i(8690463670272L, 64749);
    if ((paramKeyEvent.getKeyCode() == 4) && (paramKeyEvent.getAction() == 0))
    {
      w.d("MicroMsg.SnsOnlineVideoActivity", "dispatchKeyEvent");
      alb();
      GMTrace.o(8690463670272L, 64749);
      return true;
    }
    boolean bool = super.dispatchKeyEvent(paramKeyEvent);
    GMTrace.o(8690463670272L, 64749);
    return bool;
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(8689524146176L, 64742);
    int i = i.g.pPN;
    GMTrace.o(8689524146176L, 64742);
    return i;
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    GMTrace.i(8690597888000L, 64750);
    w.i("MicroMsg.SnsOnlineVideoActivity", "on activity result reqCode %d resultCode %d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    if ((4097 == paramInt1) && (-1 == paramInt2))
    {
      Object localObject1 = paramIntent.getStringExtra("Select_Conv_User");
      String str1 = paramIntent.getStringExtra("custom_send_text");
      Iterator localIterator = bg.f(((String)localObject1).split(",")).iterator();
      if (localIterator.hasNext())
      {
        String str2 = (String)localIterator.next();
        if (this.scene == 0)
        {
          localObject1 = com.tencent.mm.plugin.sns.model.ae.bhp().HA(this.fAx);
          if (localObject1 != null)
          {
            if (!o.dW(str2)) {
              break label353;
            }
            localObject2 = new pa();
            ((pa)localObject2).fMY.fMT = com.tencent.mm.plugin.sns.data.i.g((com.tencent.mm.plugin.sns.storage.m)localObject1);
            ((pa)localObject2).fMY.fxL = ((com.tencent.mm.plugin.sns.storage.m)localObject1).bkg();
            com.tencent.mm.sdk.b.a.uLm.m((b)localObject2);
          }
        }
        label181:
        Object localObject2 = this.qGc.bjL();
        int i = com.tencent.mm.plugin.sns.data.i.Gl(this.hCR);
        amn localamn;
        if (bg.mZ(this.fBx))
        {
          localamn = this.fNf;
          if (localamn == null) {
            localObject1 = "";
          }
        }
        for (;;)
        {
          this.fBx = ((String)localObject1);
          w.i("MicroMsg.SnsOnlineVideoActivity", "send sight to %s, videopath %s, thumbpath %s url: %s time: %d, duration: %s", new Object[] { str2, this.hCR, this.fBx, this.fNf.uhH, Integer.valueOf(this.fNf.qTd), Integer.valueOf(i) });
          com.tencent.mm.plugin.messenger.a.d.aNb().a(this, str2, this.hCR, this.fBx, 43, i, ((bhc)localObject2).qBT);
          if (str1 != null) {
            com.tencent.mm.plugin.messenger.a.d.aNb().cM(str1, str2);
          }
          com.tencent.mm.ui.snackbar.a.e(this, getString(i.j.egk));
          break;
          label353:
          localObject2 = new pb();
          ((pb)localObject2).fMZ.fMT = com.tencent.mm.plugin.sns.data.i.g((com.tencent.mm.plugin.sns.storage.m)localObject1);
          ((pb)localObject2).fMZ.fxL = ((com.tencent.mm.plugin.sns.storage.m)localObject1).bkg();
          com.tencent.mm.sdk.b.a.uLm.m((b)localObject2);
          break label181;
          String str3 = am.dt(com.tencent.mm.plugin.sns.model.ae.getAccSnsPath(), localamn.nas);
          localObject1 = str3 + com.tencent.mm.plugin.sns.data.i.e(localamn);
          boolean bool = FileOp.aZ((String)localObject1);
          w.d("MicroMsg.SnsVideoLogic", "get sns video thumb path %s [%b]", new Object[] { localObject1, Boolean.valueOf(bool) });
          if (!bool)
          {
            localObject1 = str3 + com.tencent.mm.plugin.sns.data.i.n(localamn);
            w.i("MicroMsg.SnsVideoLogic", "get sns video thumb path %s", new Object[] { localObject1 });
            continue;
            localObject1 = this.fBx;
          }
        }
      }
    }
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    GMTrace.o(8690597888000L, 64750);
  }
  
  public void onConfigurationChanged(Configuration paramConfiguration)
  {
    GMTrace.i(17628827484160L, 131345);
    super.onConfigurationChanged(paramConfiguration);
    if (paramConfiguration.orientation == 1)
    {
      w.d("MicroMsg.SnsOnlineVideoActivity", "vertical orientation");
      bnq();
      GMTrace.o(17628827484160L, 131345);
      return;
    }
    if (paramConfiguration.orientation == 2)
    {
      w.d("MicroMsg.SnsOnlineVideoActivity", "horizontal orientation");
      if ((this.qGN != null) && (this.qGN.getVisibility() == 0))
      {
        paramConfiguration = (ViewGroup.MarginLayoutParams)this.qGN.getLayoutParams();
        if (paramConfiguration.bottomMargin != getResources().getDimensionPixelSize(i.d.pGy))
        {
          paramConfiguration.bottomMargin = getResources().getDimensionPixelSize(i.d.pGy);
          this.qGN.setLayoutParams(paramConfiguration);
        }
      }
      GMTrace.o(17628827484160L, 131345);
      return;
    }
    GMTrace.o(17628827484160L, 131345);
  }
  
  public void onCreate(final Bundle paramBundle)
  {
    GMTrace.i(8689389928448L, 64741);
    if (getIntent().getExtras() != null) {
      getIntent().getExtras().setClassLoader(getClass().getClassLoader());
    }
    super.onCreate(paramBundle);
    this.vov.bUK();
    try
    {
      if (com.tencent.mm.compatible.util.d.et(19))
      {
        getWindow().setFlags(201327616, 201327616);
        this.nJL = true;
        getWindow().addFlags(128);
        this.kvu = paramBundle;
        this.fBx = getIntent().getStringExtra("intent_thumbpath");
        this.fAx = getIntent().getStringExtra("intent_localid");
        this.scene = getIntent().getIntExtra("intent_from_scene", -1);
        this.qDi = getIntent().getBooleanExtra("intent_ispreview", false);
        this.kwx = getIntent().getBooleanExtra("intent_ismute", false);
        paramBundle = getIntent().getStringExtra("intent_videopath");
        w.i("MicroMsg.SnsOnlineVideoActivity", "init data get intent info finish. thumbPath %s localId %s scene %d isPreView %b isMute %b videoPath %s", new Object[] { this.fBx, this.fAx, Integer.valueOf(this.scene), Boolean.valueOf(this.qDi), Boolean.valueOf(this.kwx), paramBundle });
        if (this.qDi) {
          break label646;
        }
      }
    }
    catch (Exception localException)
    {
      for (;;)
      {
        try
        {
          this.qGc = com.tencent.mm.plugin.sns.model.ae.bhp().HA(this.fAx);
          this.fNf = ((amn)this.qGc.bjL().uyu.tKd.get(0));
          this.hCR = (am.dt(com.tencent.mm.plugin.sns.model.ae.getAccSnsPath(), this.fNf.nas) + com.tencent.mm.plugin.sns.data.i.j(this.fNf));
          w.i("MicroMsg.SnsOnlineVideoActivity", "init data finish, sns info local id %s ", new Object[] { this.qGc.bkg() });
          this.lWD = ((RelativeLayout)findViewById(i.f.cEL));
          this.qMd = ((OnlineVideoView)findViewById(i.f.cEM));
          if (this.qDi) {
            break label654;
          }
          this.qMd.a(this.fNf, this.qGc.bkg(), this.qGc.field_createTime);
          paramBundle = this.qMd;
          paramBundle.kwx = this.kwx;
          paramBundle.kwz.ck(paramBundle.kwx);
          this.lWE = ((ImageView)findViewById(i.f.bKT));
          this.lWE.setLayerType(2, null);
          this.lWD.setOnTouchListener(new View.OnTouchListener()
          {
            public final boolean onTouch(View paramAnonymousView, MotionEvent paramAnonymousMotionEvent)
            {
              GMTrace.i(8354785132544L, 62248);
              SnsOnlineVideoActivity.this.alb();
              GMTrace.o(8354785132544L, 62248);
              return true;
            }
          });
          this.jds = new GestureDetector(this.vov.voR, new GestureDetector.SimpleOnGestureListener()
          {
            public final void onLongPress(MotionEvent paramAnonymousMotionEvent)
            {
              GMTrace.i(8604832759808L, 64111);
              SnsOnlineVideoActivity.a(SnsOnlineVideoActivity.this, true);
              super.onLongPress(paramAnonymousMotionEvent);
              GMTrace.o(8604832759808L, 64111);
            }
            
            public final boolean onScroll(MotionEvent paramAnonymousMotionEvent1, MotionEvent paramAnonymousMotionEvent2, float paramAnonymousFloat1, float paramAnonymousFloat2)
            {
              GMTrace.i(8604698542080L, 64110);
              paramAnonymousFloat1 = paramAnonymousMotionEvent2.getRawX() - paramAnonymousMotionEvent1.getRawX();
              paramAnonymousFloat2 = paramAnonymousMotionEvent2.getRawY() - paramAnonymousMotionEvent1.getRawY();
              if ((Math.abs(paramAnonymousFloat1) <= SnsOnlineVideoActivity.a(SnsOnlineVideoActivity.this).getWidth()) && (Math.abs(paramAnonymousFloat2) <= SnsOnlineVideoActivity.a(SnsOnlineVideoActivity.this).getHeight()) && (SnsOnlineVideoActivity.b(SnsOnlineVideoActivity.this)))
              {
                SnsOnlineVideoActivity.c(SnsOnlineVideoActivity.this).setTranslationX(paramAnonymousFloat1);
                SnsOnlineVideoActivity.c(SnsOnlineVideoActivity.this).setTranslationY(paramAnonymousFloat2);
              }
              GMTrace.o(8604698542080L, 64110);
              return true;
            }
            
            public final boolean onSingleTapUp(MotionEvent paramAnonymousMotionEvent)
            {
              GMTrace.i(8604966977536L, 64112);
              SnsOnlineVideoActivity.this.alb();
              boolean bool = super.onSingleTapUp(paramAnonymousMotionEvent);
              GMTrace.o(8604966977536L, 64112);
              return bool;
            }
          });
          this.qMd.setOnTouchListener(new View.OnTouchListener()
          {
            public final boolean onTouch(View paramAnonymousView, MotionEvent paramAnonymousMotionEvent)
            {
              GMTrace.i(8503364157440L, 63355);
              SnsOnlineVideoActivity.d(SnsOnlineVideoActivity.this).onTouchEvent(paramAnonymousMotionEvent);
              if (SnsOnlineVideoActivity.e(SnsOnlineVideoActivity.this) == null) {
                SnsOnlineVideoActivity.a(SnsOnlineVideoActivity.this, VelocityTracker.obtain());
              }
              if (SnsOnlineVideoActivity.e(SnsOnlineVideoActivity.this) != null) {
                SnsOnlineVideoActivity.e(SnsOnlineVideoActivity.this).addMovement(paramAnonymousMotionEvent);
              }
              switch (paramAnonymousMotionEvent.getAction() & 0xFF)
              {
              default: 
              case 0: 
              case 1: 
                for (;;)
                {
                  GMTrace.o(8503364157440L, 63355);
                  return false;
                  SnsOnlineVideoActivity.a(SnsOnlineVideoActivity.this, paramAnonymousMotionEvent.getX());
                  SnsOnlineVideoActivity.b(SnsOnlineVideoActivity.this, paramAnonymousMotionEvent.getY());
                  if (SnsOnlineVideoActivity.f(SnsOnlineVideoActivity.this))
                  {
                    SnsOnlineVideoActivity.g(SnsOnlineVideoActivity.this);
                    SnsOnlineVideoActivity.b(SnsOnlineVideoActivity.this, false);
                    continue;
                    if (SnsOnlineVideoActivity.f(SnsOnlineVideoActivity.this))
                    {
                      SnsOnlineVideoActivity.c(SnsOnlineVideoActivity.this).setPivotX(SnsOnlineVideoActivity.a(SnsOnlineVideoActivity.this).getWidth() / 2);
                      SnsOnlineVideoActivity.c(SnsOnlineVideoActivity.this).setPivotY(SnsOnlineVideoActivity.a(SnsOnlineVideoActivity.this).getHeight() / 2);
                      SnsOnlineVideoActivity.c(SnsOnlineVideoActivity.this).setScaleX(1.0F);
                      SnsOnlineVideoActivity.c(SnsOnlineVideoActivity.this).setScaleY(1.0F);
                      SnsOnlineVideoActivity.c(SnsOnlineVideoActivity.this).setTranslationX(0.0F);
                      SnsOnlineVideoActivity.c(SnsOnlineVideoActivity.this).setTranslationY(0.0F);
                      SnsOnlineVideoActivity.h(SnsOnlineVideoActivity.this).setAlpha(1.0F);
                      SnsOnlineVideoActivity.c(SnsOnlineVideoActivity.this, 1.0F);
                      SnsOnlineVideoActivity.c(SnsOnlineVideoActivity.this, false);
                      SnsOnlineVideoActivity.a(SnsOnlineVideoActivity.this, false);
                      GMTrace.o(8503364157440L, 63355);
                      return true;
                    }
                    if ((SnsOnlineVideoActivity.b(SnsOnlineVideoActivity.this)) && (!SnsOnlineVideoActivity.i(SnsOnlineVideoActivity.this)))
                    {
                      SnsOnlineVideoActivity.this.alb();
                      SnsOnlineVideoActivity.a(SnsOnlineVideoActivity.this, false);
                      GMTrace.o(8503364157440L, 63355);
                      return true;
                    }
                    SnsOnlineVideoActivity.a(SnsOnlineVideoActivity.this, false);
                  }
                }
              }
              paramAnonymousView = SnsOnlineVideoActivity.e(SnsOnlineVideoActivity.this);
              paramAnonymousView.computeCurrentVelocity(1000);
              int i = (int)paramAnonymousView.getXVelocity();
              int j = (int)paramAnonymousView.getYVelocity();
              float f1 = SnsOnlineVideoActivity.c(SnsOnlineVideoActivity.this).getTranslationX();
              float f3 = SnsOnlineVideoActivity.c(SnsOnlineVideoActivity.this).getTranslationY();
              SnsOnlineVideoActivity.a(SnsOnlineVideoActivity.this, (int)f1);
              SnsOnlineVideoActivity.b(SnsOnlineVideoActivity.this, (int)f3);
              w.d("MicroMsg.SnsOnlineVideoActivity", "dancy scaled:%s, tx:%s, ty:%s, vx:%s, vy:%s", new Object[] { Boolean.valueOf(SnsOnlineVideoActivity.b(SnsOnlineVideoActivity.this)), Float.valueOf(f1), Float.valueOf(f3), Integer.valueOf(i), Integer.valueOf(j) });
              if (((Math.abs(f1) <= 250.0F) && (Math.abs(j) > Math.abs(i)) && (j > 0) && (!SnsOnlineVideoActivity.i(SnsOnlineVideoActivity.this))) || (SnsOnlineVideoActivity.b(SnsOnlineVideoActivity.this)))
              {
                float f2 = 1.0F - f3 / SnsOnlineVideoActivity.a(SnsOnlineVideoActivity.this).getHeight();
                f1 = f2;
                if (f2 > 1.0F) {
                  f1 = 1.0F;
                }
                if (((j > 0) && (f1 < SnsOnlineVideoActivity.j(SnsOnlineVideoActivity.this))) || ((j < 0) && (f1 >= 0.5D)))
                {
                  w.d("MicroMsg.SnsOnlineVideoActivity", "dancy scale:%s", new Object[] { Float.valueOf(f1) });
                  SnsOnlineVideoActivity.c(SnsOnlineVideoActivity.this, f1);
                  SnsOnlineVideoActivity.c(SnsOnlineVideoActivity.this).setPivotX(SnsOnlineVideoActivity.a(SnsOnlineVideoActivity.this).getWidth() / 2);
                  SnsOnlineVideoActivity.c(SnsOnlineVideoActivity.this).setPivotY(SnsOnlineVideoActivity.a(SnsOnlineVideoActivity.this).getHeight() / 2);
                  SnsOnlineVideoActivity.c(SnsOnlineVideoActivity.this).setScaleX(f1);
                  SnsOnlineVideoActivity.c(SnsOnlineVideoActivity.this).setScaleY(f1);
                  SnsOnlineVideoActivity.c(SnsOnlineVideoActivity.this).setTranslationY(f3);
                  SnsOnlineVideoActivity.h(SnsOnlineVideoActivity.this).setAlpha(f1);
                }
                SnsOnlineVideoActivity.c(SnsOnlineVideoActivity.this, true);
                label729:
                if (f3 <= 200.0F) {
                  break label826;
                }
                SnsOnlineVideoActivity.b(SnsOnlineVideoActivity.this, false);
              }
              for (;;)
              {
                if (f3 > 50.0F) {
                  SnsOnlineVideoActivity.c(SnsOnlineVideoActivity.this).setOnLongClickListener(null);
                }
                if (SnsOnlineVideoActivity.e(SnsOnlineVideoActivity.this) != null)
                {
                  SnsOnlineVideoActivity.e(SnsOnlineVideoActivity.this).recycle();
                  SnsOnlineVideoActivity.a(SnsOnlineVideoActivity.this, null);
                }
                if (!SnsOnlineVideoActivity.b(SnsOnlineVideoActivity.this)) {
                  break;
                }
                GMTrace.o(8503364157440L, 63355);
                return true;
                SnsOnlineVideoActivity.c(SnsOnlineVideoActivity.this, false);
                break label729;
                label826:
                if (f3 > 10.0F) {
                  SnsOnlineVideoActivity.b(SnsOnlineVideoActivity.this, true);
                }
              }
            }
          });
          this.kvw = new com.tencent.mm.ui.tools.g(this.vov.voR);
          paramBundle = this.qGc;
          if (paramBundle != null) {
            break label731;
          }
          w.i("MicroMsg.SnsOnlineVideoActivity", "snsInfo is null, return");
          ald();
          paramBundle = new rb();
          paramBundle.fPb.type = 1;
          com.tencent.mm.sdk.b.a.uLm.m(paramBundle);
          GMTrace.o(8689389928448L, 64741);
          return;
          getWindow().setFlags(1024, 1024);
          this.nJL = false;
          continue;
          localException = localException;
          w.printErrStackTrace("MicroMsg.SnsOnlineVideoActivity", localException, "", new Object[0]);
        }
        catch (Exception paramBundle)
        {
          w.e("MicroMsg.SnsOnlineVideoActivity", "init data exception " + paramBundle.toString());
          continue;
        }
        label646:
        this.hCR = paramBundle;
        continue;
        label654:
        paramBundle = this.qMd;
        final Object localObject1 = this.hCR;
        Object localObject2 = this.fBx;
        paramBundle.qDj = ((String)localObject1);
        paramBundle.qDi = true;
        paramBundle.lUH.setImageBitmap(BackwardSupportUtil.b.c((String)localObject2, 1.0F));
        w.i("MicroMsg.OnlineVideoView", "%d set preview video %s isPreview %b ", new Object[] { Integer.valueOf(paramBundle.hashCode()), localObject1, Boolean.valueOf(paramBundle.qDi) });
        continue;
        label731:
        this.qGN = ((Button)findViewById(i.f.pJR));
        localObject1 = paramBundle.bjL();
        if (localObject1 != null) {}
        for (paramBundle = ((bhc)localObject1).qfM;; paramBundle = null)
        {
          localObject2 = new ay();
          ag.a(this, (ay)localObject2, ((bhc)localObject1).qfM);
          if (!((ay)localObject2).qQO) {
            break label838;
          }
          this.qGN.setVisibility(0);
          this.qGN.setText(((ay)localObject2).qQP);
          this.qGN.setOnClickListener(new View.OnClickListener()
          {
            public final void onClick(View paramAnonymousView)
            {
              GMTrace.i(16632931942400L, 123925);
              if (paramBundle.tuc == null)
              {
                GMTrace.o(16632931942400L, 123925);
                return;
              }
              SnsOnlineVideoActivity.k(SnsOnlineVideoActivity.this);
              paramAnonymousView = com.tencent.mm.plugin.sns.c.a.ifN.bC(paramBundle.tuc.mDD);
              int i = 0;
              if (localObject1.uyu.tKc == 1) {
                i = 2;
              }
              while (com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.e.a(localObject1, SnsOnlineVideoActivity.this))
              {
                com.tencent.mm.plugin.sns.c.a.ifN.a(SnsOnlineVideoActivity.this, paramBundle.tuc.mDD, paramAnonymousView, localObject1.jWW, i, 19, 9, paramBundle.tuc.ttV, localObject1.nas);
                GMTrace.o(16632931942400L, 123925);
                return;
                if (localObject1.uyu.tKc == 3) {
                  i = 5;
                } else if (localObject1.uyu.tKc == 15) {
                  i = 38;
                }
              }
              switch (paramBundle.jXP)
              {
              }
              for (;;)
              {
                GMTrace.o(16632931942400L, 123925);
                return;
                Object localObject = new Intent();
                ((Intent)localObject).putExtra("rawUrl", paramBundle.mDo);
                com.tencent.mm.plugin.sns.c.a.ifM.j((Intent)localObject, SnsOnlineVideoActivity.this);
                com.tencent.mm.plugin.sns.c.a.ifN.a(SnsOnlineVideoActivity.this, paramBundle.tuc.mDD, paramAnonymousView, localObject1.jWW, i, 19, 1, paramBundle.tuc.ttV, localObject1.nas);
                GMTrace.o(16632931942400L, 123925);
                return;
                if (paramBundle.ttY == 1)
                {
                  localObject = new gi();
                  ((gi)localObject).fCx.actionCode = 2;
                  ((gi)localObject).fCx.scene = 3;
                  ((gi)localObject).fCx.appId = paramBundle.tuc.mDD;
                  ((gi)localObject).fCx.context = SnsOnlineVideoActivity.this;
                  com.tencent.mm.sdk.b.a.uLm.m((b)localObject);
                  com.tencent.mm.plugin.sns.c.a.ifN.a(SnsOnlineVideoActivity.this, paramBundle.tuc.mDD, paramAnonymousView, localObject1.jWW, i, 19, 6, paramBundle.tuc.ttV, localObject1.nas);
                  GMTrace.o(16632931942400L, 123925);
                  return;
                  int j = ag.a(SnsOnlineVideoActivity.this, paramBundle);
                  if (j == 1)
                  {
                    localObject = new gi();
                    ((gi)localObject).fCx.context = SnsOnlineVideoActivity.this;
                    ((gi)localObject).fCx.actionCode = 2;
                    ((gi)localObject).fCx.appId = paramBundle.tuc.mDD;
                    ((gi)localObject).fCx.messageAction = paramBundle.tuc.ttX;
                    ((gi)localObject).fCx.messageExt = paramBundle.tuc.ttW;
                    ((gi)localObject).fCx.scene = 3;
                    com.tencent.mm.sdk.b.a.uLm.m((b)localObject);
                    com.tencent.mm.plugin.sns.c.a.ifN.a(SnsOnlineVideoActivity.this, paramBundle.tuc.mDD, paramAnonymousView, localObject1.jWW, i, 19, 6, paramBundle.tuc.ttV, localObject1.nas);
                    GMTrace.o(16632931942400L, 123925);
                    return;
                  }
                  if (j == 2)
                  {
                    localObject = new gi();
                    ((gi)localObject).fCx.context = SnsOnlineVideoActivity.this;
                    ((gi)localObject).fCx.actionCode = 1;
                    ((gi)localObject).fCx.appId = paramBundle.tuc.mDD;
                    ((gi)localObject).fCx.messageAction = paramBundle.tuc.ttX;
                    ((gi)localObject).fCx.messageExt = paramBundle.tuc.ttW;
                    ((gi)localObject).fCx.scene = 3;
                    com.tencent.mm.sdk.b.a.uLm.m((b)localObject);
                    com.tencent.mm.plugin.sns.c.a.ifN.a(SnsOnlineVideoActivity.this, paramBundle.tuc.mDD, paramAnonymousView, localObject1.jWW, i, 19, 3, paramBundle.tuc.ttV, localObject1.nas);
                  }
                }
              }
            }
          });
          if (getRequestedOrientation() == 0) {
            break;
          }
          bnq();
          break;
        }
        label838:
        this.qGN.setVisibility(8);
      }
    }
  }
  
  protected void onDestroy()
  {
    GMTrace.i(8690195234816L, 64747);
    this.qMd.onDestroy();
    try
    {
      getWindow().clearFlags(128);
      super.onDestroy();
      GMTrace.o(8690195234816L, 64747);
      return;
    }
    catch (Exception localException)
    {
      for (;;) {}
    }
  }
  
  protected void onPause()
  {
    GMTrace.i(8690061017088L, 64746);
    if (Build.VERSION.SDK_INT >= 21) {
      getWindow().setFlags(2048, 2048);
    }
    this.qMd.onPause();
    if (!this.qMe)
    {
      w.d("MicroMsg.SnsOnlineVideoActivity", "close Popup");
      if (!this.qMf) {
        break label95;
      }
      new com.tencent.mm.sdk.platformtools.ae().postDelayed(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(16632663506944L, 123923);
          SnsOnlineVideoActivity.this.finish();
          GMTrace.o(16632663506944L, 123923);
        }
      }, 500L);
    }
    for (;;)
    {
      super.onPause();
      GMTrace.o(8690061017088L, 64746);
      return;
      label95:
      new com.tencent.mm.sdk.platformtools.ae().post(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(16635213643776L, 123942);
          SnsOnlineVideoActivity.this.finish();
          GMTrace.o(16635213643776L, 123942);
        }
      });
    }
  }
  
  protected void onResume()
  {
    GMTrace.i(8689926799360L, 64745);
    if (Build.VERSION.SDK_INT >= 21) {
      getWindow().clearFlags(2048);
    }
    if (!this.lWk) {
      this.qMd.onResume();
    }
    this.lWk = false;
    if (this.qMe) {
      this.qMe = false;
    }
    super.onResume();
    GMTrace.o(8689926799360L, 64745);
  }
  
  public void onStart()
  {
    GMTrace.i(8689792581632L, 64744);
    Bundle localBundle = this.kvu;
    if (!this.kvv)
    {
      this.kvv = true;
      if (Build.VERSION.SDK_INT >= 12)
      {
        this.kvx = getIntent().getIntExtra("img_gallery_top", 0);
        this.kvy = getIntent().getIntExtra("img_gallery_left", 0);
        this.kvz = getIntent().getIntExtra("img_gallery_width", 0);
        this.kvA = getIntent().getIntExtra("img_gallery_height", 0);
        this.kvw.p(this.kvy, this.kvx, this.kvz, this.kvA);
        if (localBundle == null) {
          this.qMd.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener()
          {
            public final boolean onPreDraw()
            {
              GMTrace.i(16632126636032L, 123919);
              SnsOnlineVideoActivity.c(SnsOnlineVideoActivity.this).getViewTreeObserver().removeOnPreDrawListener(this);
              SnsOnlineVideoActivity.m(SnsOnlineVideoActivity.this).a(SnsOnlineVideoActivity.c(SnsOnlineVideoActivity.this), SnsOnlineVideoActivity.h(SnsOnlineVideoActivity.this), new g.b()
              {
                public final void onAnimationEnd()
                {
                  GMTrace.i(16635616296960L, 123945);
                  if (SnsOnlineVideoActivity.c(SnsOnlineVideoActivity.this) != null) {
                    SnsOnlineVideoActivity.c(SnsOnlineVideoActivity.this).onResume();
                  }
                  GMTrace.o(16635616296960L, 123945);
                }
                
                public final void onAnimationStart()
                {
                  GMTrace.i(16635482079232L, 123944);
                  GMTrace.o(16635482079232L, 123944);
                }
              });
              GMTrace.o(16632126636032L, 123919);
              return true;
            }
          });
        }
      }
    }
    super.onStart();
    GMTrace.o(8689792581632L, 64744);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/sns/ui/SnsOnlineVideoActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */