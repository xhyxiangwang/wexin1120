package com.tencent.mm.plugin.walletlock.gesture.ui;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Looper;
import android.os.SystemClock;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ViewFlipper;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.a.o;
import com.tencent.mm.ac.b.a;
import com.tencent.mm.ac.b.b;
import com.tencent.mm.ac.b.c;
import com.tencent.mm.ac.k;
import com.tencent.mm.ac.n;
import com.tencent.mm.ac.u;
import com.tencent.mm.ac.u.a;
import com.tencent.mm.plugin.walletlock.a.a;
import com.tencent.mm.plugin.walletlock.a.b;
import com.tencent.mm.plugin.walletlock.a.d;
import com.tencent.mm.plugin.walletlock.a.e;
import com.tencent.mm.plugin.walletlock.a.g;
import com.tencent.mm.plugin.walletlock.gesture.a.e;
import com.tencent.mm.plugin.walletlock.gesture.a.f;
import com.tencent.mm.plugin.walletlock.gesture.ui.widget.PatternLockView;
import com.tencent.mm.plugin.walletlock.gesture.ui.widget.PatternLockView.a;
import com.tencent.mm.plugin.walletlock.gesture.ui.widget.PatternLockView.b;
import com.tencent.mm.protocal.c.apr;
import com.tencent.mm.protocal.c.aps;
import com.tencent.mm.protocal.c.aqq;
import com.tencent.mm.protocal.c.aqr;
import com.tencent.mm.protocal.c.awi;
import com.tencent.mm.protocal.c.awj;
import com.tencent.mm.protocal.c.axs;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.i.a;
import java.util.List;

@com.tencent.mm.ui.base.a(19)
public class GestureGuardLogicUI
  extends MMActivity
  implements View.OnClickListener, PatternLockView.a
{
  private String hyx;
  private ae mHandler;
  private int mStatus;
  private int mtO;
  private List<f> sfA;
  private List<f> sfB;
  private boolean sfC;
  private int sfD;
  private k sfE;
  private k sfF;
  private String sfG;
  private ViewFlipper sfH;
  private Dialog sfI;
  private boolean sfJ;
  private boolean sfK;
  private String sfL;
  private int sfw;
  private int sfx;
  private a[] sfy;
  private Animation sfz;
  
  public GestureGuardLogicUI()
  {
    GMTrace.i(20228624875520L, 150715);
    this.sfw = 0;
    this.sfx = 0;
    this.mtO = 0;
    this.sfy = null;
    this.sfz = null;
    this.sfA = null;
    this.sfB = null;
    this.sfC = false;
    this.sfD = 0;
    this.sfE = null;
    this.sfF = null;
    this.hyx = null;
    this.sfG = null;
    this.sfH = null;
    this.mHandler = new ae(Looper.getMainLooper());
    this.sfI = null;
    this.sfJ = true;
    this.sfK = false;
    GMTrace.o(20228624875520L, 150715);
  }
  
  private void N(int paramInt, boolean paramBoolean)
  {
    GMTrace.i(20231175012352L, 150734);
    int i = paramInt - this.mtO;
    if (i == 0)
    {
      GMTrace.o(20231175012352L, 150734);
      return;
    }
    this.mtO = paramInt;
    if (paramBoolean) {
      if (i > 0)
      {
        this.sfH.setInAnimation(this, a.a.aMp);
        this.sfH.setOutAnimation(this, a.a.aMo);
      }
    }
    for (;;)
    {
      paramInt = i;
      if (i <= 0) {
        break label143;
      }
      paramInt = 0;
      while (paramInt < i)
      {
        this.sfH.showNext();
        paramInt += 1;
      }
      this.sfH.setInAnimation(this, a.a.aMn);
      this.sfH.setOutAnimation(this, a.a.aMq);
      continue;
      this.sfH.setInAnimation(null);
      this.sfH.setOutAnimation(null);
    }
    GMTrace.o(20231175012352L, 150734);
    return;
    label143:
    while (paramInt < 0)
    {
      this.sfH.showPrevious();
      paramInt += 1;
    }
    GMTrace.o(20231175012352L, 150734);
  }
  
  private void a(String paramString, final a parama)
  {
    GMTrace.i(20231309230080L, 150735);
    TextView localTextView = this.sfy[this.mtO].sfS;
    localTextView.getText().toString();
    localTextView.setText(paramString);
    localTextView.setTextColor(this.sfx);
    localTextView.startAnimation(this.sfz);
    this.sfz.setAnimationListener(new Animation.AnimationListener()
    {
      public final void onAnimationEnd(Animation paramAnonymousAnimation)
      {
        GMTrace.i(20220034940928L, 150651);
        GestureGuardLogicUI.q(GestureGuardLogicUI.this).setAnimationListener(null);
        if (parama != null) {
          parama.onDone();
        }
        GMTrace.o(20220034940928L, 150651);
      }
      
      public final void onAnimationRepeat(Animation paramAnonymousAnimation)
      {
        GMTrace.i(20219900723200L, 150650);
        GMTrace.o(20219900723200L, 150650);
      }
      
      public final void onAnimationStart(Animation paramAnonymousAnimation)
      {
        GMTrace.i(20219766505472L, 150649);
        GMTrace.o(20219766505472L, 150649);
      }
    });
    GMTrace.o(20231309230080L, 150735);
  }
  
  private void a(String paramString, List<f> paramList, final u.a parama)
  {
    GMTrace.i(20230369705984L, 150728);
    b(new DialogInterface.OnCancelListener()
    {
      public final void onCancel(DialogInterface paramAnonymousDialogInterface)
      {
        GMTrace.i(20221108682752L, 150659);
        GestureGuardLogicUI.l(GestureGuardLogicUI.this)[GestureGuardLogicUI.m(GestureGuardLogicUI.this)].sfU.bzc();
        if ((GestureGuardLogicUI.n(GestureGuardLogicUI.this) != null) && (!GestureGuardLogicUI.n(GestureGuardLogicUI.this).hmr)) {
          com.tencent.mm.kernel.h.wT().c(GestureGuardLogicUI.n(GestureGuardLogicUI.this));
        }
        GMTrace.o(20221108682752L, 150659);
      }
    });
    if (paramString == null)
    {
      bva();
      parama.a(3, -6, getString(a.g.sdZ), null, null);
      GMTrace.o(20230369705984L, 150728);
      return;
    }
    Object localObject = new b.a();
    ((b.a)localObject).hlX = new awi();
    ((b.a)localObject).hlY = new awj();
    ((b.a)localObject).hlW = 688;
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/registernewpatternlock";
    localObject = ((b.a)localObject).DA();
    awi localawi = (awi)((com.tencent.mm.ac.b)localObject).hlU.hmc;
    localawi.uqX = new axs().bd(paramString.getBytes());
    localawi.uqY = new axs().bd(e.bK(paramList));
    u.a((com.tencent.mm.ac.b)localObject, new u.a()
    {
      public final int a(int paramAnonymousInt1, int paramAnonymousInt2, String paramAnonymousString, com.tencent.mm.ac.b paramAnonymousb, k paramAnonymousk)
      {
        GMTrace.i(20222585077760L, 150670);
        w.i("MicroMsg.GestureGuardLogicUI", String.format("Scene doSwitchOn, errType:%d, errCode:%d, errMsg:%s", new Object[] { Integer.valueOf(paramAnonymousInt1), Integer.valueOf(paramAnonymousInt2), paramAnonymousString }));
        GestureGuardLogicUI.o(GestureGuardLogicUI.this);
        if ((paramAnonymousInt1 == 0) && (paramAnonymousInt2 == 0))
        {
          com.tencent.mm.plugin.walletlock.gesture.a.d.a(((awj)paramAnonymousb.hlV.hmc).umc);
          GestureGuardLogicUI.byZ();
          ((com.tencent.mm.plugin.walletlock.a.b)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.walletlock.a.b.class)).wK(1);
        }
        com.tencent.mm.plugin.walletlock.b.i.sgS.bzk();
        if (parama != null)
        {
          paramAnonymousInt1 = parama.a(paramAnonymousInt1, paramAnonymousInt2, paramAnonymousString, paramAnonymousb, paramAnonymousk);
          GMTrace.o(20222585077760L, 150670);
          return paramAnonymousInt1;
        }
        GMTrace.o(20222585077760L, 150670);
        return 0;
      }
    }, false);
    GMTrace.o(20230369705984L, 150728);
  }
  
  private void b(DialogInterface.OnCancelListener paramOnCancelListener)
  {
    GMTrace.i(20231443447808L, 150736);
    if (this.sfI == null)
    {
      this.sfI = com.tencent.mm.ui.base.h.a(this, getString(a.g.sec), false, paramOnCancelListener);
      GMTrace.o(20231443447808L, 150736);
      return;
    }
    this.sfI.show();
    GMTrace.o(20231443447808L, 150736);
  }
  
  private void bva()
  {
    GMTrace.i(20231577665536L, 150737);
    if ((this.sfI != null) && (this.sfI.isShowing())) {
      this.sfI.dismiss();
    }
    GMTrace.o(20231577665536L, 150737);
  }
  
  private boolean byV()
  {
    GMTrace.i(20229967052800L, 150725);
    if ((this.mStatus != 20) && (this.mStatus != 0) && (this.mStatus != 2) && (this.mStatus != 1))
    {
      String str;
      if (this.sfJ)
      {
        str = getIntent().getStringExtra("next_action");
        if ((!"next_action.modify_pattern".equals(str)) && ("next_action.switch_on_pattern".equals(str)))
        {
          str = getString(a.g.sdV);
          new i.a(this).lm(false).UG(str).Bj(a.g.sdS).a(new DialogInterface.OnClickListener()
          {
            public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
            {
              GMTrace.i(20237349027840L, 150780);
              paramAnonymousDialogInterface.dismiss();
              GestureGuardLogicUI.r(GestureGuardLogicUI.this);
              GestureGuardLogicUI.a(GestureGuardLogicUI.this, 0, 4, "user cancel when setting gesture");
              GMTrace.o(20237349027840L, 150780);
            }
          }).Bk(a.g.sdQ).b(new DialogInterface.OnClickListener()
          {
            public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
            {
              GMTrace.i(20223524601856L, 150677);
              paramAnonymousDialogInterface.dismiss();
              GMTrace.o(20223524601856L, 150677);
            }
          }).ZT().show();
        }
      }
      for (;;)
      {
        GMTrace.o(20229967052800L, 150725);
        return true;
        str = getString(a.g.sdU);
        break;
        new i.a(this).lm(true).Bh(a.g.sdW).Bj(a.g.sdR).a(new DialogInterface.OnClickListener()
        {
          public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
          {
            GMTrace.i(20236812156928L, 150776);
            paramAnonymousDialogInterface.dismiss();
            GMTrace.o(20236812156928L, 150776);
          }
        }).ZT().show();
      }
    }
    byY();
    GMTrace.o(20229967052800L, 150725);
    return false;
  }
  
  private void byW()
  {
    GMTrace.i(20230101270528L, 150726);
    final Object localObject1 = this.sfy[this.mtO];
    switch (this.mStatus)
    {
    }
    for (;;)
    {
      GMTrace.o(20230101270528L, 150726);
      return;
      rV(getString(a.g.sej));
      this.sfC = true;
      ((a)localObject1).sfU.sgk = false;
      ((a)localObject1).sfU.sgw = null;
      long l = Math.ceil((600L - com.tencent.mm.plugin.walletlock.gesture.a.d.byN().sfv / 1000L) / 60.0D);
      ((a)localObject1).sfS.setText(String.format(getString(a.g.sed), new Object[] { Long.valueOf(l) }));
      ((a)localObject1).sfS.setTextColor(getResources().getColor(a.b.sdA));
      GMTrace.o(20230101270528L, 150726);
      return;
      final Object localObject2 = getIntent().getStringExtra("next_action");
      if ((!"next_action.modify_pattern".equals(localObject2)) && ("next_action.switch_on_pattern".equals(localObject2))) {
        rV(getString(a.g.sel));
      }
      for (;;)
      {
        this.sfC = false;
        ((a)localObject1).sfU.sgk = true;
        ((a)localObject1).sfU.sgw = this;
        ((a)localObject1).sfS.setText(getString(a.g.seg));
        ((a)localObject1).sfS.setTextColor(getResources().getColor(a.b.sdz));
        if (((a)localObject1).sfV.getVisibility() == 8) {
          break;
        }
        ((a)localObject1).sfV.setVisibility(8);
        GMTrace.o(20230101270528L, 150726);
        return;
        rV(getString(a.g.sek));
      }
      ((a)localObject1).sfS.setText(getResources().getString(a.g.see));
      ((a)localObject1).sfS.setTextColor(this.sfw);
      ((a)localObject1).sfU.bzc();
      ((a)localObject1).sfU.sgk = true;
      if (((a)localObject1).sfV.getVisibility() != 8)
      {
        ((a)localObject1).sfV.setVisibility(8);
        GMTrace.o(20230101270528L, 150726);
        return;
        localObject1 = getIntent().getStringExtra("next_action");
        final Object localObject3;
        Object localObject4;
        if ("next_action.modify_pattern".equals(localObject1))
        {
          if (this.sfK)
          {
            this.sfK = false;
            a(this.hyx, this.sfA, new u.a()
            {
              public final int a(int paramAnonymousInt1, int paramAnonymousInt2, String paramAnonymousString, com.tencent.mm.ac.b paramAnonymousb, k paramAnonymousk)
              {
                GMTrace.i(20221913989120L, 150665);
                if (paramAnonymousInt2 == 0)
                {
                  Toast.makeText(GestureGuardLogicUI.this, GestureGuardLogicUI.this.getString(a.g.seo), 0).show();
                  com.tencent.mm.plugin.report.service.g.paX.i(11474, new Object[0]);
                }
                for (;;)
                {
                  GestureGuardLogicUI.b(GestureGuardLogicUI.this);
                  GestureGuardLogicUI.d(GestureGuardLogicUI.this);
                  GestureGuardLogicUI.this.finish();
                  GMTrace.o(20221913989120L, 150665);
                  return 0;
                  Toast.makeText(GestureGuardLogicUI.this, GestureGuardLogicUI.this.getString(a.g.sdX), 0).show();
                }
              }
            });
            GMTrace.o(20230101270528L, 150726);
            return;
          }
          localObject1 = this.sfB;
          localObject2 = this.sfA;
          localObject3 = new u.a()
          {
            public final int a(int paramAnonymousInt1, int paramAnonymousInt2, String paramAnonymousString, com.tencent.mm.ac.b paramAnonymousb, k paramAnonymousk)
            {
              GMTrace.i(20221645553664L, 150663);
              if (paramAnonymousInt2 == 0) {
                Toast.makeText(GestureGuardLogicUI.this, GestureGuardLogicUI.this.getString(a.g.seo), 0).show();
              }
              for (;;)
              {
                GestureGuardLogicUI.a(GestureGuardLogicUI.this, null);
                GestureGuardLogicUI.d(GestureGuardLogicUI.this);
                GestureGuardLogicUI.this.finish();
                GMTrace.o(20221645553664L, 150663);
                return 0;
                Toast.makeText(GestureGuardLogicUI.this, GestureGuardLogicUI.this.getString(a.g.sdX), 0).show();
              }
            }
          };
          localObject4 = new b.a();
          b(new DialogInterface.OnCancelListener()
          {
            public final void onCancel(DialogInterface paramAnonymousDialogInterface)
            {
              GMTrace.i(20220840247296L, 150657);
              GestureGuardLogicUI.l(GestureGuardLogicUI.this)[GestureGuardLogicUI.m(GestureGuardLogicUI.this)].sfU.bzc();
              if ((GestureGuardLogicUI.p(GestureGuardLogicUI.this) != null) && (!GestureGuardLogicUI.p(GestureGuardLogicUI.this).hmr)) {
                com.tencent.mm.kernel.h.wT().c(GestureGuardLogicUI.p(GestureGuardLogicUI.this));
              }
              GMTrace.o(20220840247296L, 150657);
            }
          });
          ((b.a)localObject4).hlX = new apr();
          ((b.a)localObject4).hlY = new aps();
          ((b.a)localObject4).hlW = 689;
          ((b.a)localObject4).uri = "/cgi-bin/micromsg-bin/oppatternlock";
          localObject4 = ((b.a)localObject4).DA();
          apr localapr = (apr)((com.tencent.mm.ac.b)localObject4).hlU.hmc;
          localapr.nN = 1;
          localapr.uma = new axs().bd(e.bK((List)localObject1));
          localapr.umb = new axs().bd(e.bK((List)localObject2));
          u.a((com.tencent.mm.ac.b)localObject4, new u.a()
          {
            public final int a(int paramAnonymousInt1, int paramAnonymousInt2, String paramAnonymousString, com.tencent.mm.ac.b paramAnonymousb, k paramAnonymousk)
            {
              GMTrace.i(20235738415104L, 150768);
              w.i("MicroMsg.GestureGuardLogicUI", String.format("Scene doModify, errType:%d, errCode:%d, errMsg:%s", new Object[] { Integer.valueOf(paramAnonymousInt1), Integer.valueOf(paramAnonymousInt2), paramAnonymousString }));
              GestureGuardLogicUI.o(GestureGuardLogicUI.this);
              if ((paramAnonymousInt1 == 0) && (paramAnonymousInt2 == 0))
              {
                com.tencent.mm.plugin.walletlock.gesture.a.d.a(((aps)paramAnonymousb.hlV.hmc).umc);
                GestureGuardLogicUI.byZ();
              }
              com.tencent.mm.plugin.walletlock.b.i.sgS.bzk();
              if (localObject3 != null)
              {
                paramAnonymousInt1 = localObject3.a(paramAnonymousInt1, paramAnonymousInt2, paramAnonymousString, paramAnonymousb, paramAnonymousk);
                GMTrace.o(20235738415104L, 150768);
                return paramAnonymousInt1;
              }
              GMTrace.o(20235738415104L, 150768);
              return 0;
            }
          }, false);
          GMTrace.o(20230101270528L, 150726);
          return;
        }
        if ("next_action.switch_on_pattern".equals(localObject1))
        {
          a(this.hyx, this.sfA, new u.a()
          {
            public final int a(int paramAnonymousInt1, int paramAnonymousInt2, String paramAnonymousString, com.tencent.mm.ac.b paramAnonymousb, k paramAnonymousk)
            {
              GMTrace.i(20221377118208L, 150661);
              GestureGuardLogicUI.b(GestureGuardLogicUI.this);
              GestureGuardLogicUI.d(GestureGuardLogicUI.this);
              if (paramAnonymousInt2 == 0)
              {
                Toast.makeText(GestureGuardLogicUI.this, GestureGuardLogicUI.this.getString(a.g.sen), 0).show();
                GestureGuardLogicUI.a(GestureGuardLogicUI.this, -1, 0, "open gesture ok");
              }
              for (;;)
              {
                GMTrace.o(20221377118208L, 150661);
                return 0;
                Toast.makeText(GestureGuardLogicUI.this, GestureGuardLogicUI.this.getString(a.g.sdX), 0).show();
                GestureGuardLogicUI.a(GestureGuardLogicUI.this, -1, -1, "open gesture failed");
              }
            }
          });
          GMTrace.o(20230101270528L, 150726);
          return;
        }
        if ("next_action.goto_protected_page".equals(localObject1))
        {
          a(this.hyx, this.sfA, new u.a()
          {
            public final int a(int paramAnonymousInt1, int paramAnonymousInt2, String paramAnonymousString, com.tencent.mm.ac.b paramAnonymousb, k paramAnonymousk)
            {
              GMTrace.i(20237080592384L, 150778);
              if (paramAnonymousInt2 == 0)
              {
                com.tencent.mm.plugin.walletlock.gesture.a.d.ee(SystemClock.elapsedRealtime());
                Toast.makeText(GestureGuardLogicUI.this, GestureGuardLogicUI.this.getString(a.g.seo), 0).show();
                GestureGuardLogicUI.e(GestureGuardLogicUI.this);
              }
              for (;;)
              {
                GestureGuardLogicUI.b(GestureGuardLogicUI.this);
                GestureGuardLogicUI.d(GestureGuardLogicUI.this);
                GMTrace.o(20237080592384L, 150778);
                return 0;
                Toast.makeText(GestureGuardLogicUI.this, GestureGuardLogicUI.this.getString(a.g.sdX), 0).show();
              }
            }
          });
          GMTrace.o(20230101270528L, 150726);
          return;
          ((a)localObject1).sfU.sgk = false;
          ((a)localObject1).sfU.a(PatternLockView.b.sgz);
          a(getResources().getString(a.g.sef), new a()
          {
            public final void onDone()
            {
              GMTrace.i(20220303376384L, 150653);
              GestureGuardLogicUI.f(GestureGuardLogicUI.this).postDelayed(new Runnable()
              {
                public final void run()
                {
                  GMTrace.i(20222316642304L, 150668);
                  GestureGuardLogicUI.f(GestureGuardLogicUI.this).removeCallbacks(this);
                  GestureGuardLogicUI.25.this.sfQ.sfU.bzc();
                  GestureGuardLogicUI.a(GestureGuardLogicUI.this, 16);
                  GestureGuardLogicUI.g(GestureGuardLogicUI.this);
                  GestureGuardLogicUI.h(GestureGuardLogicUI.this);
                  GMTrace.o(20222316642304L, 150668);
                }
              }, 500L);
              GMTrace.o(20220303376384L, 150653);
            }
          });
          GMTrace.o(20230101270528L, 150726);
          return;
          rV(getString(a.g.sej));
          this.sfC = false;
          ((a)localObject1).sfU.sgk = true;
          ((a)localObject1).sfU.sgw = this;
          if ("next_action.goto_protected_page".equals(getIntent().getStringExtra("next_action"))) {
            if (!bg.mZ(this.sfL)) {
              ((a)localObject1).sfS.setText(this.sfL);
            }
          }
          for (;;)
          {
            ((a)localObject1).sfS.setTextColor(this.sfw);
            if (((a)localObject1).sfV.getVisibility() == 0) {
              break;
            }
            ((a)localObject1).sfV.setVisibility(0);
            GMTrace.o(20230101270528L, 150726);
            return;
            ((a)localObject1).sfS.setText(getString(a.g.sei));
            continue;
            ((a)localObject1).sfS.setText(getString(a.g.seh));
          }
          localObject2 = getIntent().getStringExtra("next_action");
          if ("next_action.modify_pattern".equals(localObject2))
          {
            ((a)localObject1).sfU.bzc();
            N(1, true);
            this.mStatus = 16;
            break;
          }
          if ("next_action.switch_off_pattern".equals(localObject2))
          {
            localObject1 = this.sfB;
            localObject2 = new u.a()
            {
              public final int a(int paramAnonymousInt1, int paramAnonymousInt2, String paramAnonymousString, com.tencent.mm.ac.b paramAnonymousb, k paramAnonymousk)
              {
                GMTrace.i(20238154334208L, 150786);
                if (paramAnonymousInt2 == 0) {
                  Toast.makeText(GestureGuardLogicUI.this, GestureGuardLogicUI.this.getString(a.g.sem), 0).show();
                }
                for (;;)
                {
                  GestureGuardLogicUI.a(GestureGuardLogicUI.this, null);
                  GestureGuardLogicUI.this.finish();
                  GMTrace.o(20238154334208L, 150786);
                  return 0;
                  Toast.makeText(GestureGuardLogicUI.this, GestureGuardLogicUI.this.getString(a.g.sdX), 0).show();
                }
              }
            };
            b(new DialogInterface.OnCancelListener()
            {
              public final void onCancel(DialogInterface paramAnonymousDialogInterface)
              {
                GMTrace.i(20234933108736L, 150762);
                GestureGuardLogicUI.l(GestureGuardLogicUI.this)[GestureGuardLogicUI.m(GestureGuardLogicUI.this)].sfU.bzc();
                if ((GestureGuardLogicUI.p(GestureGuardLogicUI.this) != null) && (!GestureGuardLogicUI.p(GestureGuardLogicUI.this).hmr)) {
                  com.tencent.mm.kernel.h.wT().c(GestureGuardLogicUI.p(GestureGuardLogicUI.this));
                }
                GMTrace.o(20234933108736L, 150762);
              }
            });
            localObject3 = new b.a();
            ((b.a)localObject3).hlX = new apr();
            ((b.a)localObject3).hlY = new aps();
            ((b.a)localObject3).hlW = 689;
            ((b.a)localObject3).uri = "/cgi-bin/micromsg-bin/oppatternlock";
            localObject3 = ((b.a)localObject3).DA();
            localObject4 = (apr)((com.tencent.mm.ac.b)localObject3).hlU.hmc;
            ((apr)localObject4).nN = 3;
            ((apr)localObject4).uma = new axs().bd(e.bK((List)localObject1));
            u.a((com.tencent.mm.ac.b)localObject3, new u.a()
            {
              public final int a(int paramAnonymousInt1, int paramAnonymousInt2, String paramAnonymousString, com.tencent.mm.ac.b paramAnonymousb, k paramAnonymousk)
              {
                GMTrace.i(20236275286016L, 150772);
                w.i("MicroMsg.GestureGuardLogicUI", String.format("Scene doSwitchOff, errType:%d, errCode:%d, errMsg:%s", new Object[] { Integer.valueOf(paramAnonymousInt1), Integer.valueOf(paramAnonymousInt2), paramAnonymousString }));
                GestureGuardLogicUI.o(GestureGuardLogicUI.this);
                if ((paramAnonymousInt1 == 0) && (paramAnonymousInt2 == 0))
                {
                  com.tencent.mm.plugin.walletlock.gesture.a.d.a(((aps)paramAnonymousb.hlV.hmc).umc);
                  com.tencent.mm.plugin.walletlock.b.g localg = com.tencent.mm.plugin.walletlock.b.g.sgO;
                  com.tencent.mm.plugin.walletlock.b.g.je(false);
                  GestureGuardLogicUI.i(GestureGuardLogicUI.this);
                  GestureGuardLogicUI.byZ();
                }
                if (localObject2 != null)
                {
                  paramAnonymousInt1 = localObject2.a(paramAnonymousInt1, paramAnonymousInt2, paramAnonymousString, paramAnonymousb, paramAnonymousk);
                  GMTrace.o(20236275286016L, 150772);
                  return paramAnonymousInt1;
                }
                GMTrace.o(20236275286016L, 150772);
                return 0;
              }
            }, false);
            GMTrace.o(20230101270528L, 150726);
            return;
          }
          if ("next_action.goto_protected_page".equals(localObject2))
          {
            com.tencent.mm.plugin.walletlock.gesture.a.d.ee(SystemClock.elapsedRealtime());
            byX();
            GMTrace.o(20230101270528L, 150726);
            return;
            l = SystemClock.elapsedRealtime();
            com.tencent.mm.plugin.walletlock.gesture.a.d.u(l, 0L);
            com.tencent.mm.plugin.walletlock.gesture.a.d.wM(this.sfD);
            com.tencent.mm.plugin.walletlock.gesture.a.d.byC();
            if (this.sfD == 5)
            {
              this.sfC = true;
              com.tencent.mm.plugin.walletlock.gesture.a.d.t(l, 0L);
              ((a)localObject1).sfU.bzc();
              ((a)localObject1).sfU.sgk = false;
              this.mStatus = 20;
              byW();
              localObject1 = new i.a(this);
              ((i.a)localObject1).lm(false).UG(String.format(getString(a.g.sdT), new Object[] { Long.valueOf(10L) }));
              ((i.a)localObject1).Bj(a.g.sdP).a(new DialogInterface.OnClickListener()
              {
                public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
                {
                  GMTrace.i(20223256166400L, 150675);
                  paramAnonymousDialogInterface.dismiss();
                  GestureGuardLogicUI.this.onClick(GestureGuardLogicUI.l(GestureGuardLogicUI.this)[GestureGuardLogicUI.m(GestureGuardLogicUI.this)].sfV);
                  GMTrace.o(20223256166400L, 150675);
                }
              });
              ((i.a)localObject1).Bk(a.g.sdO).b(new DialogInterface.OnClickListener()
              {
                public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
                {
                  GMTrace.i(20236006850560L, 150770);
                  paramAnonymousDialogInterface.dismiss();
                  GestureGuardLogicUI.r(GestureGuardLogicUI.this);
                  GestureGuardLogicUI.this.finish();
                  GMTrace.o(20236006850560L, 150770);
                }
              });
              ((i.a)localObject1).ZT().show();
              GMTrace.o(20230101270528L, 150726);
              return;
            }
            ((a)localObject1).sfU.sgk = false;
            ((a)localObject1).sfU.a(PatternLockView.b.sgz);
            a(String.format(getResources().getString(a.g.sea), new Object[] { Integer.valueOf(5 - this.sfD) }), new a()
            {
              public final void onDone()
              {
                GMTrace.i(20237617463296L, 150782);
                GestureGuardLogicUI.a(GestureGuardLogicUI.this, 0);
                localObject1.sfU.bzc();
                localObject1.sfU.sgk = true;
                GMTrace.o(20237617463296L, 150782);
              }
            });
          }
        }
      }
    }
  }
  
  private void byX()
  {
    GMTrace.i(20230503923712L, 150729);
    Intent localIntent = (Intent)getIntent().getParcelableExtra("page_intent");
    if (localIntent != null)
    {
      com.tencent.mm.plugin.walletlock.b.i.sgS.jj(true);
      com.tencent.mm.plugin.walletlock.b.i.sgS.jk(true);
      localIntent.addFlags(131072);
      startActivity(localIntent);
    }
    for (;;)
    {
      finish();
      GMTrace.o(20230503923712L, 150729);
      return;
      w.i("MicroMsg.GestureGuardLogicUI", "Protected page's intent not found, finish myself only.");
    }
  }
  
  private void byY()
  {
    GMTrace.i(20230638141440L, 150730);
    String str = getIntent().getStringExtra("next_action");
    if ((this.mStatus == 20) || ("next_action.goto_protected_page".equals(str))) {
      com.tencent.mm.plugin.walletlock.b.i.sgS.bzl();
    }
    GMTrace.o(20230638141440L, 150730);
  }
  
  private void t(int paramInt1, int paramInt2, String paramString)
  {
    GMTrace.i(20229832835072L, 150724);
    w.i("MicroMsg.GestureGuardLogicUI", "alvinluo gesture finishWithResult");
    Intent localIntent = new Intent();
    localIntent.putExtra("key_err_code", paramInt2);
    localIntent.putExtra("key_err_msg", paramString);
    setResult(paramInt1, localIntent);
    finish();
    GMTrace.o(20229832835072L, 150724);
  }
  
  protected final void MH()
  {
    GMTrace.i(20229161746432L, 150719);
    aKl();
    Ap(a.g.fbT);
    this.sfz = AnimationUtils.loadAnimation(this, a.a.sdx);
    this.sfw = getResources().getColor(a.b.sdz);
    this.sfx = getResources().getColor(a.b.sdA);
    Intent localIntent = getIntent();
    String str = localIntent.getStringExtra("action");
    localIntent.getStringExtra("next_action");
    if ("action.switch_on_pattern".equals(str))
    {
      this.mStatus = 16;
      N(1, false);
    }
    while (!"action.verify_pattern".equals(str))
    {
      a(new MenuItem.OnMenuItemClickListener()
      {
        public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
        {
          GMTrace.i(20235469979648L, 150766);
          if (GestureGuardLogicUI.a(GestureGuardLogicUI.this))
          {
            GMTrace.o(20235469979648L, 150766);
            return true;
          }
          GestureGuardLogicUI.a(GestureGuardLogicUI.this, 0, 4, "user cancel when setting gesture");
          GMTrace.o(20235469979648L, 150766);
          return true;
        }
      });
      w.i("MicroMsg.GestureGuardLogicUI", String.format("GuestureGuardLogicUI, initView done, before doRestBehavior. mStatus=%d", new Object[] { Integer.valueOf(this.mStatus) }));
      byW();
      GMTrace.o(20229161746432L, 150719);
      return;
    }
    if (com.tencent.mm.plugin.walletlock.gesture.a.b.byM()) {
      this.sfC = true;
    }
    for (this.mStatus = 20;; this.mStatus = 0)
    {
      N(0, false);
      break;
      this.sfC = false;
    }
  }
  
  protected final int Qb()
  {
    GMTrace.i(20231711883264L, 150738);
    GMTrace.o(20231711883264L, 150738);
    return 1;
  }
  
  public final void a(PatternLockView paramPatternLockView)
  {
    GMTrace.i(20231040794624L, 150733);
    paramPatternLockView.a(PatternLockView.b.sgy);
    GMTrace.o(20231040794624L, 150733);
  }
  
  public final void a(final PatternLockView paramPatternLockView, final List<f> paramList)
  {
    GMTrace.i(20230235488256L, 150727);
    if (this.mStatus == 16)
    {
      if (paramList.size() < 4)
      {
        paramPatternLockView.sgk = false;
        paramPatternLockView.a(PatternLockView.b.sgz);
        a(String.format(getString(a.g.seb), new Object[] { Integer.valueOf(4) }), new a()
        {
          public final void onDone()
          {
            GMTrace.i(20236543721472L, 150774);
            paramPatternLockView.bzc();
            paramPatternLockView.sgk = true;
            GMTrace.o(20236543721472L, 150774);
          }
        });
        GMTrace.o(20230235488256L, 150727);
        return;
      }
      this.sfA = paramList;
      paramPatternLockView.bzc();
      this.mStatus = 17;
      N(2, true);
    }
    for (;;)
    {
      byW();
      do
      {
        GMTrace.o(20230235488256L, 150727);
        return;
        if (this.mStatus == 0)
        {
          paramPatternLockView = new u.a()
          {
            public final int a(int paramAnonymousInt1, int paramAnonymousInt2, String paramAnonymousString, com.tencent.mm.ac.b paramAnonymousb, k paramAnonymousk)
            {
              GMTrace.i(20219498070016L, 150647);
              if (paramAnonymousInt2 == 0)
              {
                GestureGuardLogicUI.i(GestureGuardLogicUI.this);
                GestureGuardLogicUI.j(GestureGuardLogicUI.this);
                com.tencent.mm.plugin.walletlock.gesture.a.d.byU();
                com.tencent.mm.plugin.walletlock.gesture.a.d.byO();
                com.tencent.mm.plugin.walletlock.gesture.a.d.byQ();
                GestureGuardLogicUI.a(GestureGuardLogicUI.this, paramList);
                GestureGuardLogicUI.a(GestureGuardLogicUI.this, 1);
                GestureGuardLogicUI.h(GestureGuardLogicUI.this);
              }
              for (;;)
              {
                GMTrace.o(20219498070016L, 150647);
                return 0;
                if (paramAnonymousInt2 == -3)
                {
                  GestureGuardLogicUI.k(GestureGuardLogicUI.this);
                  GestureGuardLogicUI.a(GestureGuardLogicUI.this, 2);
                  GestureGuardLogicUI.h(GestureGuardLogicUI.this);
                }
                else
                {
                  Toast.makeText(GestureGuardLogicUI.this, GestureGuardLogicUI.this.getString(a.g.sdY), 0).show();
                }
              }
            }
          };
          Object localObject1 = com.tencent.mm.plugin.walletlock.gesture.a.d.byS();
          Object localObject2 = com.tencent.mm.plugin.walletlock.gesture.a.d.byR();
          com.tencent.mm.plugin.report.service.g.paX.i(11453, new Object[0]);
          b(new DialogInterface.OnCancelListener()
          {
            public final void onCancel(DialogInterface paramAnonymousDialogInterface)
            {
              GMTrace.i(20222987730944L, 150673);
              GestureGuardLogicUI.l(GestureGuardLogicUI.this)[GestureGuardLogicUI.m(GestureGuardLogicUI.this)].sfU.bzc();
              if ((GestureGuardLogicUI.p(GestureGuardLogicUI.this) != null) && (!GestureGuardLogicUI.p(GestureGuardLogicUI.this).hmr)) {
                com.tencent.mm.kernel.h.wT().c(GestureGuardLogicUI.p(GestureGuardLogicUI.this));
              }
              GMTrace.o(20222987730944L, 150673);
            }
          });
          boolean bool2 = e.b((aqr)localObject1);
          boolean bool3 = e.b((aqq)localObject2);
          if (bool3) {
            if (bool2) {
              if (((aqq)localObject2).version < ((aqr)localObject1).umN) {
                bool1 = true;
              }
            }
          }
          for (;;)
          {
            w.i("MicroMsg.GestureGuardLogicUI", String.format("isInfoValid:%b, isBuffValid:%b, verify by server:%b", new Object[] { Boolean.valueOf(bool2), Boolean.valueOf(bool3), Boolean.valueOf(bool1) }));
            if (!bool1) {
              break;
            }
            localObject1 = new b.a();
            ((b.a)localObject1).hlX = new apr();
            ((b.a)localObject1).hlY = new aps();
            ((b.a)localObject1).hlW = 689;
            ((b.a)localObject1).uri = "/cgi-bin/micromsg-bin/oppatternlock";
            localObject1 = ((b.a)localObject1).DA();
            localObject2 = (apr)((com.tencent.mm.ac.b)localObject1).hlU.hmc;
            ((apr)localObject2).nN = 2;
            ((apr)localObject2).uma = new axs().bd(e.bK(paramList));
            u.a((com.tencent.mm.ac.b)localObject1, new u.a()
            {
              public final int a(int paramAnonymousInt1, int paramAnonymousInt2, String paramAnonymousString, com.tencent.mm.ac.b paramAnonymousb, k paramAnonymousk)
              {
                GMTrace.i(20238422769664L, 150788);
                w.i("MicroMsg.GestureGuardLogicUI", String.format("Scene verifyPattern, errType:%d, errCode:%d, errMsg:%s", new Object[] { Integer.valueOf(paramAnonymousInt1), Integer.valueOf(paramAnonymousInt2), paramAnonymousString }));
                GestureGuardLogicUI.o(GestureGuardLogicUI.this);
                if ((paramAnonymousInt1 == 0) && (paramAnonymousInt2 == 0)) {
                  com.tencent.mm.plugin.walletlock.gesture.a.d.a(((aps)paramAnonymousb.hlV.hmc).umc);
                }
                if (paramPatternLockView != null)
                {
                  paramAnonymousInt1 = paramPatternLockView.a(paramAnonymousInt1, paramAnonymousInt2, paramAnonymousString, paramAnonymousb, paramAnonymousk);
                  GMTrace.o(20238422769664L, 150788);
                  return paramAnonymousInt1;
                }
                GMTrace.o(20238422769664L, 150788);
                return 0;
              }
            }, false);
            GMTrace.o(20230235488256L, 150727);
            return;
            bool1 = false;
            continue;
            bool1 = false;
            continue;
            bool1 = true;
          }
          bva();
          localObject1 = com.tencent.mm.plugin.walletlock.gesture.a.d.byR();
          if (localObject1 == null) {}
          for (boolean bool1 = true; bool1; bool1 = new String(((aqq)localObject1).umK.ush.toK).equals(com.tencent.mm.a.g.n(((StringBuilder)localObject2).toString().getBytes())))
          {
            paramPatternLockView.a(3, 0, null, null, null);
            GMTrace.o(20230235488256L, 150727);
            return;
            localObject2 = new StringBuilder();
            com.tencent.mm.kernel.h.xx();
            ((StringBuilder)localObject2).append(new o(com.tencent.mm.kernel.a.wy()).longValue());
            ((StringBuilder)localObject2).append('_');
            ((StringBuilder)localObject2).append(new String(e.bK(paramList)));
          }
          paramPatternLockView.a(3, -3, null, null, null);
          GMTrace.o(20230235488256L, 150727);
          return;
        }
      } while (this.mStatus != 17);
      if (this.sfA.equals(paramList))
      {
        paramPatternLockView.bzc();
        this.sfC = false;
        this.sfD = 0;
        com.tencent.mm.plugin.walletlock.gesture.a.d.byU();
        com.tencent.mm.plugin.walletlock.gesture.a.d.byO();
        com.tencent.mm.plugin.walletlock.gesture.a.d.byQ();
        com.tencent.mm.plugin.walletlock.gesture.a.d.byC();
        this.mStatus = 18;
      }
      else
      {
        this.mStatus = 19;
      }
    }
  }
  
  public boolean dispatchTouchEvent(MotionEvent paramMotionEvent)
  {
    GMTrace.i(20230772359168L, 150731);
    a locala = this.sfy[this.mtO];
    if ((paramMotionEvent.getAction() == 2) || (paramMotionEvent.getAction() == 7))
    {
      int i = locala.sfT.getLeft();
      int j = locala.sfT.getTop();
      paramMotionEvent.offsetLocation(-i, -j - getWindow().findViewById(16908290).getTop());
      bool = locala.sfT.dispatchTouchEvent(paramMotionEvent);
      GMTrace.o(20230772359168L, 150731);
      return bool;
    }
    boolean bool = super.dispatchTouchEvent(paramMotionEvent);
    GMTrace.o(20230772359168L, 150731);
    return bool;
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(20229295964160L, 150720);
    int i = a.e.sdM;
    GMTrace.o(20229295964160L, 150720);
    return i;
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    GMTrace.i(20229430181888L, 150721);
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    if (paramInt2 == -1)
    {
      if (paramIntent == null)
      {
        w.e("MicroMsg.GestureGuardLogicUI", "hy: Intent data is null.");
        GMTrace.o(20229430181888L, 150721);
        return;
      }
      paramInt1 = paramIntent.getIntExtra("key_err_code", 0);
      if (paramInt1 == 0)
      {
        this.hyx = paramIntent.getStringExtra("key_token");
        this.sfG = paramIntent.getStringExtra("key_type");
        paramIntent = getIntent().getStringExtra("next_action");
        if (("next_action.goto_protected_page".equals(paramIntent)) || ("next_action.modify_pattern".equals(paramIntent)))
        {
          if ("next_action.modify_pattern".equals(paramIntent)) {
            this.sfK = true;
          }
          this.sfJ = false;
          a(null);
          kU(false);
          this.mStatus = 16;
          N(1, false);
        }
        for (;;)
        {
          byW();
          GMTrace.o(20229430181888L, 150721);
          return;
          if ("next_action.switch_off_pattern".equals(paramIntent))
          {
            paramIntent = this.hyx;
            final u.a local12 = new u.a()
            {
              public final int a(int paramAnonymousInt1, int paramAnonymousInt2, String paramAnonymousString, com.tencent.mm.ac.b paramAnonymousb, k paramAnonymousk)
              {
                GMTrace.i(20220571811840L, 150655);
                if (paramAnonymousInt2 == 0)
                {
                  com.tencent.mm.plugin.walletlock.gesture.a.d.byU();
                  com.tencent.mm.plugin.walletlock.gesture.a.d.byO();
                  com.tencent.mm.plugin.walletlock.gesture.a.d.byQ();
                  Toast.makeText(GestureGuardLogicUI.this, GestureGuardLogicUI.this.getString(a.g.sem), 0).show();
                }
                for (;;)
                {
                  GestureGuardLogicUI.b(GestureGuardLogicUI.this);
                  GestureGuardLogicUI.c(GestureGuardLogicUI.this);
                  GestureGuardLogicUI.this.finish();
                  GMTrace.o(20220571811840L, 150655);
                  return 0;
                  Toast.makeText(GestureGuardLogicUI.this, GestureGuardLogicUI.this.getString(a.g.sdX), 0).show();
                }
              }
            };
            b(new DialogInterface.OnCancelListener()
            {
              public final void onCancel(DialogInterface paramAnonymousDialogInterface)
              {
                GMTrace.i(20237885898752L, 150784);
                GestureGuardLogicUI.l(GestureGuardLogicUI.this)[GestureGuardLogicUI.m(GestureGuardLogicUI.this)].sfU.bzc();
                if ((GestureGuardLogicUI.n(GestureGuardLogicUI.this) != null) && (!GestureGuardLogicUI.n(GestureGuardLogicUI.this).hmr)) {
                  com.tencent.mm.kernel.h.wT().c(GestureGuardLogicUI.n(GestureGuardLogicUI.this));
                }
                GMTrace.o(20237885898752L, 150784);
              }
            });
            if (paramIntent == null)
            {
              bva();
              local12.a(3, -6, getString(a.g.sdZ), null, null);
            }
            else
            {
              Object localObject = new b.a();
              ((b.a)localObject).hlX = new awi();
              ((b.a)localObject).hlY = new awj();
              ((b.a)localObject).hlW = 688;
              ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/registernewpatternlock";
              localObject = ((b.a)localObject).DA();
              awi localawi = (awi)((com.tencent.mm.ac.b)localObject).hlU.hmc;
              localawi.uqX = new axs().bd(paramIntent.getBytes());
              localawi.nN = 3;
              u.a((com.tencent.mm.ac.b)localObject, new u.a()
              {
                public final int a(int paramAnonymousInt1, int paramAnonymousInt2, String paramAnonymousString, com.tencent.mm.ac.b paramAnonymousb, k paramAnonymousk)
                {
                  GMTrace.i(20235201544192L, 150764);
                  w.i("MicroMsg.GestureGuardLogicUI", String.format("Scene doSwitchOn, errType:%d, errCode:%d, errMsg:%s", new Object[] { Integer.valueOf(paramAnonymousInt1), Integer.valueOf(paramAnonymousInt2), paramAnonymousString }));
                  GestureGuardLogicUI.o(GestureGuardLogicUI.this);
                  if ((paramAnonymousInt1 == 0) && (paramAnonymousInt2 == 0))
                  {
                    com.tencent.mm.plugin.walletlock.gesture.a.d.a(((awj)paramAnonymousb.hlV.hmc).umc);
                    com.tencent.mm.plugin.walletlock.b.g localg = com.tencent.mm.plugin.walletlock.b.g.sgO;
                    com.tencent.mm.plugin.walletlock.b.g.je(false);
                    GestureGuardLogicUI.byZ();
                  }
                  com.tencent.mm.plugin.walletlock.b.i.sgS.bzk();
                  if (local12 != null)
                  {
                    paramAnonymousInt1 = local12.a(paramAnonymousInt1, paramAnonymousInt2, paramAnonymousString, paramAnonymousb, paramAnonymousk);
                    GMTrace.o(20235201544192L, 150764);
                    return paramAnonymousInt1;
                  }
                  GMTrace.o(20235201544192L, 150764);
                  return 0;
                }
              }, false);
            }
          }
          else
          {
            this.mStatus = 1;
          }
        }
      }
      if (paramInt1 == -1) {
        Toast.makeText(this, getString(a.g.sdX), 0).show();
      }
    }
    GMTrace.o(20229430181888L, 150721);
  }
  
  public void onClick(View paramView)
  {
    GMTrace.i(20229564399616L, 150722);
    if (paramView.getId() == a.d.sdK)
    {
      paramView = new Intent();
      paramView.putExtra("action", "action.verify_paypwd");
      paramView.putExtra("key_wallet_lock_type", 1);
      com.tencent.mm.bi.d.b(this, "wallet", ".pwd.ui.WalletLockCheckPwdUI", paramView, 1001);
    }
    GMTrace.o(20229564399616L, 150722);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    int i = 0;
    GMTrace.i(20228759093248L, 150716);
    super.onCreate(paramBundle);
    paramBundle = getIntent();
    if ((!ab.getPackageName().equals(paramBundle.getPackage())) || (bg.mZ(paramBundle.getStringExtra("action"))) || (bg.mZ(paramBundle.getStringExtra("next_action"))))
    {
      w.w("MicroMsg.GestureGuardLogicUI", "Intent started this activity has no valid action desc.");
      finish();
      GMTrace.o(20228759093248L, 150716);
      return;
    }
    this.sfH = new ViewFlipper(this);
    this.sfy = new a[] { new a(this), new a(this), new a(this) };
    paramBundle = this.sfy;
    int j = paramBundle.length;
    while (i < j)
    {
      Object localObject = paramBundle[i];
      this.sfH.addView(((a)localObject).mView);
      ((a)localObject).sfU.sgw = this;
      ((a)localObject).sfV.setOnClickListener(this);
      i += 1;
    }
    setContentView(this.sfH);
    this.hyx = getIntent().getStringExtra("token");
    this.sfG = getIntent().getStringExtra("type");
    this.sfL = getIntent().getStringExtra("verify_title");
    MH();
    GMTrace.o(20228759093248L, 150716);
  }
  
  protected void onDestroy()
  {
    GMTrace.i(20229027528704L, 150718);
    super.onDestroy();
    if (this.sfE != null)
    {
      com.tencent.mm.kernel.h.wT().c(this.sfE);
      this.sfE = null;
    }
    if (this.sfF != null)
    {
      com.tencent.mm.kernel.h.wT().c(this.sfF);
      this.sfF = null;
    }
    if ((this.sfI != null) && (this.sfI.isShowing())) {
      this.sfI.dismiss();
    }
    if (this.sfH != null)
    {
      this.sfH.removeAllViews();
      this.sfH = null;
    }
    int i = 0;
    while (i < this.sfy.length)
    {
      a locala = this.sfy[i];
      locala.sfU.setOnClickListener(null);
      locala.sfV.setOnClickListener(null);
      locala.mView = null;
      locala.sfS = null;
      locala.sfT = null;
      locala.sfU = null;
      locala.sfV = null;
      this.sfy[i] = null;
      i += 1;
    }
    this.sfy = null;
    GMTrace.o(20229027528704L, 150718);
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    GMTrace.i(20229698617344L, 150723);
    if (paramInt == 4)
    {
      if (byV())
      {
        GMTrace.o(20229698617344L, 150723);
        return false;
      }
      t(0, 4, "user cancel when setting gesture");
      GMTrace.o(20229698617344L, 150723);
      return false;
    }
    boolean bool = super.onKeyDown(paramInt, paramKeyEvent);
    GMTrace.o(20229698617344L, 150723);
    return bool;
  }
  
  protected void onResume()
  {
    GMTrace.i(20228893310976L, 150717);
    super.onResume();
    if (this.mStatus == 0)
    {
      com.tencent.mm.plugin.walletlock.gesture.a.g localg = com.tencent.mm.plugin.walletlock.gesture.a.d.byP();
      if (localg.sfu == -1L) {
        break label104;
      }
      e.a(localg);
      if (localg.sfv / 1000L >= 600L) {
        break label101;
      }
      com.tencent.mm.plugin.walletlock.gesture.a.d.u(localg.sfu, localg.sfv);
    }
    label101:
    label104:
    for (int i = 1;; i = 0)
    {
      if (i != 0)
      {
        this.sfD = com.tencent.mm.plugin.walletlock.gesture.a.d.byT();
        if (this.sfD != -1) {}
      }
      else
      {
        this.sfD = 0;
      }
      GMTrace.o(20228893310976L, 150717);
      return;
      com.tencent.mm.plugin.walletlock.gesture.a.d.byQ();
    }
  }
  
  public void onWindowFocusChanged(boolean paramBoolean)
  {
    GMTrace.i(20230906576896L, 150732);
    Object localObject = this.sfy[this.mtO];
    if (((a)localObject).sfU != null)
    {
      localObject = ((a)localObject).sfU;
      if ((!paramBoolean) || (this.sfC)) {
        break label59;
      }
    }
    label59:
    for (paramBoolean = true;; paramBoolean = false)
    {
      ((PatternLockView)localObject).sgk = paramBoolean;
      GMTrace.o(20230906576896L, 150732);
      return;
    }
  }
  
  private static abstract interface a
  {
    public abstract void onDone();
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/walletlock/gesture/ui/GestureGuardLogicUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */