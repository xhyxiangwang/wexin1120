package com.tencent.mm.plugin.bottle.ui;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.media.ToneGenerator;
import android.os.Message;
import android.os.Vibrator;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.g;
import com.tencent.mm.R.h;
import com.tencent.mm.R.j;
import com.tencent.mm.R.l;
import com.tencent.mm.k.b;
import com.tencent.mm.plugin.bottle.a.h.d;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.b;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.aj;
import com.tencent.mm.sdk.platformtools.aj.a;
import com.tencent.mm.sdk.platformtools.aq;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.base.t;
import com.tencent.mm.ui.widget.MMEditText;
import com.tencent.mm.x.ap;

public class ThrowBottleUI
  extends FrameLayout
  implements View.OnClickListener, com.tencent.mm.plugin.bottle.a.h.a
{
  private static final int[] kik;
  private static final int[] kil;
  ae handler;
  BottleBeachUI kgS;
  ImageView khp;
  ThrowBottleFooter kiA;
  boolean kiB;
  boolean kiC;
  LinearLayout.LayoutParams kiD;
  private int kiE;
  int kiF;
  private ThrowBottleAnimUI.a kiG;
  final aj kiH;
  final aj kiI;
  boolean kiJ;
  @SuppressLint({"HandlerLeak"})
  private final ae kiK;
  final com.tencent.mm.ac.h.a kiL;
  boolean kig;
  h.d kim;
  ToneGenerator kin;
  private long kio;
  Toast kip;
  Vibrator kiq;
  ThrowBottleAnimUI kir;
  AnimationDrawable kis;
  ImageView kit;
  TextView kiu;
  ImageView kiv;
  MMEditText kiw;
  View kix;
  Button kiy;
  ImageButton kiz;
  
  static
  {
    GMTrace.i(7639941513216L, 56922);
    kik = new int[] { 0, 9, 18, 27, 37, 46, 55, 64, 74, 85, 93, 100 };
    kil = new int[] { R.g.aVG, R.g.aVJ, R.g.aVK, R.g.aVL, R.g.aVM, R.g.aVN, R.g.aVO, R.g.aVP, R.g.aVQ, R.g.aVH, R.g.aVI };
    GMTrace.o(7639941513216L, 56922);
  }
  
  public ThrowBottleUI(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(7634572804096L, 56882);
    this.kio = -1L;
    this.handler = new ae();
    this.kiB = false;
    this.kig = true;
    this.kiD = null;
    this.kiE = 0;
    this.kiF = 0;
    this.kiG = new ThrowBottleAnimUI.a()
    {
      public final void aho()
      {
        GMTrace.i(7648397230080L, 56985);
        ThrowBottleUI.q(ThrowBottleUI.this).setVisibility(8);
        ThrowBottleUI.h(ThrowBottleUI.this).la(0);
        GMTrace.o(7648397230080L, 56985);
      }
    };
    this.kiH = new aj(new aj.a()
    {
      public final boolean pO()
      {
        int i = 0;
        GMTrace.i(7648665665536L, 56987);
        if (ThrowBottleUI.r(ThrowBottleUI.this) == null)
        {
          w.w("MM.Bottle.ThrowBottleUI", "bottle recder is null");
          GMTrace.o(7648665665536L, 56987);
          return false;
        }
        int j = ThrowBottleUI.r(ThrowBottleUI.this).getMaxAmplitude();
        for (;;)
        {
          if (i < ThrowBottleUI.ahy().length)
          {
            if ((j >= ThrowBottleUI.ahz()[i]) && (j < ThrowBottleUI.ahz()[(i + 1)])) {
              ThrowBottleUI.s(ThrowBottleUI.this).setBackgroundDrawable(com.tencent.mm.bq.a.b(ThrowBottleUI.h(ThrowBottleUI.this), ThrowBottleUI.ahy()[i]));
            }
          }
          else
          {
            GMTrace.o(7648665665536L, 56987);
            return true;
          }
          i += 1;
        }
      }
    }, true);
    this.kiI = new aj(new aj.a()
    {
      int count;
      
      public final boolean pO()
      {
        GMTrace.i(7648128794624L, 56983);
        if (ThrowBottleUI.t(ThrowBottleUI.this) == -1L) {
          ThrowBottleUI.a(ThrowBottleUI.this, bg.Pq());
        }
        if (this.count % 3 == 2) {
          ThrowBottleUI.u(ThrowBottleUI.this).setWidth(ThrowBottleUI.u(ThrowBottleUI.this).getWidth() + 1);
        }
        this.count += 1;
        this.count %= 3;
        long l = bg.aG(ThrowBottleUI.t(ThrowBottleUI.this));
        int i;
        if ((l >= 50000L) && (l <= 60000L))
        {
          if (ThrowBottleUI.v(ThrowBottleUI.this) != null) {
            break label251;
          }
          i = (int)((60000L - l) / 1000L);
          ThrowBottleUI.a(ThrowBottleUI.this, Toast.makeText(ThrowBottleUI.h(ThrowBottleUI.this), ThrowBottleUI.h(ThrowBottleUI.this).getResources().getQuantityString(R.j.djY, i, new Object[] { Integer.valueOf(i) }), 0));
        }
        for (;;)
        {
          ThrowBottleUI.v(ThrowBottleUI.this).show();
          if (l < 60000L) {
            break;
          }
          w.v("MM.Bottle.ThrowBottleUI", "bottle record stop on countdown");
          ThrowBottleUI.w(ThrowBottleUI.this);
          ThrowBottleUI.this.ahx();
          ThrowBottleUI.x(ThrowBottleUI.this);
          aq.C(ThrowBottleUI.h(ThrowBottleUI.this), R.l.eMP);
          GMTrace.o(7648128794624L, 56983);
          return false;
          label251:
          i = (int)((60000L - l) / 1000L);
          ThrowBottleUI.v(ThrowBottleUI.this).setText(ThrowBottleUI.h(ThrowBottleUI.this).getResources().getQuantityString(R.j.djY, i, new Object[] { Integer.valueOf(i) }));
        }
        GMTrace.o(7648128794624L, 56983);
        return true;
      }
    }, true);
    this.kiJ = false;
    this.kiK = new ae()
    {
      public final void handleMessage(Message paramAnonymousMessage)
      {
        GMTrace.i(7648934100992L, 56989);
        super.handleMessage(paramAnonymousMessage);
        ThrowBottleUI.f(ThrowBottleUI.this).setBackgroundDrawable(com.tencent.mm.bq.a.b(ThrowBottleUI.h(ThrowBottleUI.this), R.g.bcA));
        ThrowBottleUI.f(ThrowBottleUI.this).setEnabled(true);
        GMTrace.o(7648934100992L, 56989);
      }
    };
    this.kiL = new com.tencent.mm.ac.h.a()
    {
      public final void onError()
      {
        GMTrace.i(7624774909952L, 56809);
        ThrowBottleUI.r(ThrowBottleUI.this).reset();
        ThrowBottleUI.z(ThrowBottleUI.this).MM();
        ThrowBottleUI.A(ThrowBottleUI.this).MM();
        ad.Ra("keep_app_silent");
        ThrowBottleUI.x(ThrowBottleUI.this);
        w.v("MM.Bottle.ThrowBottleUI", "bottle record stop on error");
        Toast.makeText(ThrowBottleUI.h(ThrowBottleUI.this), ThrowBottleUI.h(ThrowBottleUI.this).getString(R.l.dJB), 0).show();
        GMTrace.o(7624774909952L, 56809);
      }
    };
    this.kgS = ((BottleBeachUI)paramContext);
    GMTrace.o(7634572804096L, 56882);
  }
  
  private void ahv()
  {
    int j = 8;
    GMTrace.i(7634975457280L, 56885);
    this.kiu.setVisibility(8);
    Object localObject = this.kiv;
    boolean bool;
    if (this.kig)
    {
      i = 8;
      ((ImageView)localObject).setVisibility(i);
      localObject = (View)this.kiw.getParent();
      i = j;
      if (this.kig) {
        i = 0;
      }
      ((View)localObject).setVisibility(i);
      if (this.kig) {
        this.kiw.requestFocus();
      }
      if (this.kig) {
        break label198;
      }
      bool = true;
      label95:
      this.kig = bool;
      ImageButton localImageButton = this.kiz;
      if (!this.kig) {
        break label203;
      }
      localObject = com.tencent.mm.bq.a.b(this.kgS, R.g.aXS);
      label125:
      localImageButton.setImageDrawable((Drawable)localObject);
      if (!this.kig) {
        break label218;
      }
      dr(false);
      label144:
      this.kiy = ((Button)this.kgS.findViewById(R.h.bnp));
      localObject = this.kiy;
      if (!this.kig) {
        break label226;
      }
    }
    label198:
    label203:
    label218:
    label226:
    for (int i = R.l.dEb;; i = R.l.dDY)
    {
      ((Button)localObject).setText(i);
      GMTrace.o(7634975457280L, 56885);
      return;
      i = 0;
      break;
      bool = false;
      break label95;
      localObject = com.tencent.mm.bq.a.b(this.kgS, R.g.aXT);
      break label125;
      dr(true);
      break label144;
    }
  }
  
  private void ahw()
  {
    GMTrace.i(7635109675008L, 56886);
    int i;
    int j;
    if (this.kig)
    {
      i = this.kiu.getLeft();
      j = this.kiu.getTop();
    }
    for (int k = this.kiu.getWidth();; k = 0)
    {
      this.kir = ((ThrowBottleAnimUI)this.kgS.findViewById(R.h.bnl));
      this.kir.kif = this.kiG;
      ThrowBottleAnimUI localThrowBottleAnimUI = this.kir;
      localThrowBottleAnimUI.kig = this.kig;
      localThrowBottleAnimUI.Qu = i;
      localThrowBottleAnimUI.Qv = j;
      localThrowBottleAnimUI.kie = k;
      localThrowBottleAnimUI.setVisibility(0);
      af.i(new ThrowBottleAnimUI.1(localThrowBottleAnimUI), 100L);
      GMTrace.o(7635109675008L, 56886);
      return;
      i = this.kiw.getLeft();
      j = this.kiw.getTop();
    }
  }
  
  private void dr(boolean paramBoolean)
  {
    GMTrace.i(7635243892736L, 56887);
    if (paramBoolean)
    {
      ((InputMethodManager)this.kgS.getSystemService("input_method")).showSoftInput(this.kiw, 0);
      GMTrace.o(7635243892736L, 56887);
      return;
    }
    ((InputMethodManager)this.kgS.getSystemService("input_method")).hideSoftInputFromWindow(this.kiw.getWindowToken(), 2);
    GMTrace.o(7635243892736L, 56887);
  }
  
  public final boolean ahx()
  {
    GMTrace.i(7635378110464L, 56888);
    w.d("MM.Bottle.ThrowBottleUI", "bottle record stop");
    boolean bool;
    if (this.kiJ)
    {
      this.kgS.getWindow().getDecorView().setKeepScreenOn(false);
      if (this.kis != null) {
        this.kis.stop();
      }
      if (this.kim == null) {
        break label197;
      }
      bool = this.kim.qx();
      ad.Ra("keep_app_silent");
      this.kiH.MM();
      this.kiI.MM();
      this.kio = -1L;
    }
    for (;;)
    {
      if (!bool)
      {
        this.kiy.setEnabled(false);
        this.kiy.setBackgroundDrawable(com.tencent.mm.bq.a.b(this.kgS, R.g.bcz));
        this.kit.setVisibility(8);
        this.kiu.setVisibility(8);
        this.kiK.sendEmptyMessageDelayed(0, 500L);
        ap.AS();
        if (com.tencent.mm.x.c.isSDCardAvailable()) {
          this.kgS.kZ(R.l.dDX);
        }
      }
      for (;;)
      {
        this.kiJ = false;
        GMTrace.o(7635378110464L, 56888);
        return false;
        ahw();
      }
      label197:
      bool = false;
    }
  }
  
  public final void bJ(int paramInt1, int paramInt2)
  {
    GMTrace.i(7635512328192L, 56889);
    if (paramInt2 == 63534)
    {
      this.kgS.la(0);
      this.kgS.kZ(R.l.dDF);
    }
    GMTrace.o(7635512328192L, 56889);
  }
  
  public void onClick(View paramView)
  {
    GMTrace.i(7634841239552L, 56884);
    if (R.h.bmD == paramView.getId())
    {
      if ((!this.kig) && (this.kiw.getText().toString().trim().length() > 0))
      {
        com.tencent.mm.ui.base.h.a(this.kgS, getResources().getString(R.l.dDV), null, getResources().getString(R.l.dDW), new com.tencent.mm.ui.base.h.c()
        {
          public final void hC(int paramAnonymousInt)
          {
            GMTrace.i(7644504915968L, 56956);
            if (paramAnonymousInt == 0)
            {
              ThrowBottleUI.m(ThrowBottleUI.this).setText("");
              ThrowBottleUI.p(ThrowBottleUI.this);
            }
            GMTrace.o(7644504915968L, 56956);
          }
        }, null);
        GMTrace.o(7634841239552L, 56884);
        return;
      }
      ahv();
      GMTrace.o(7634841239552L, 56884);
      return;
    }
    this.kgS.la(0);
    GMTrace.o(7634841239552L, 56884);
  }
  
  public void setVisibility(int paramInt)
  {
    GMTrace.i(7634707021824L, 56883);
    this.khp.setVisibility(8);
    int i;
    if (paramInt == 0)
    {
      this.kig = true;
      this.kit.setVisibility(8);
      this.kiu.setVisibility(8);
      this.kiu.setWidth(BackwardSupportUtil.b.a(this.kgS, 120.0F));
      this.kiv.setVisibility(0);
      ((View)this.kiw.getParent()).setVisibility(8);
      this.kiw.setText("");
      this.kiA.setVisibility(0);
      com.tencent.mm.ui.tools.a.c.d(this.kiw).Dr(b.ua()).a(null);
      this.kiz.setImageDrawable(com.tencent.mm.bq.a.b(this.kgS, R.g.aXS));
      this.kiy.setBackgroundDrawable(com.tencent.mm.bq.a.b(this.kgS, R.g.bcA));
      Button localButton = this.kiy;
      if (this.kig)
      {
        i = R.l.dEb;
        localButton.setText(i);
        ((LinearLayout)this.kgS.findViewById(R.h.bnr)).setVisibility(0);
        this.kgS.getWindow().clearFlags(1024);
      }
    }
    for (;;)
    {
      super.setVisibility(paramInt);
      GMTrace.o(7634707021824L, 56883);
      return;
      i = R.l.dDY;
      break;
      this.kgS.getWindow().setFlags(1024, 1024);
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/bottle/ui/ThrowBottleUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */