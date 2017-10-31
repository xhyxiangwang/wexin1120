package com.tencent.mm.plugin.appbrand.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewParent;
import android.view.ViewPropertyAnimator;
import android.view.animation.DecelerateInterpolator;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.modelappbrand.a.e;
import com.tencent.mm.plugin.appbrand.config.a.c;
import com.tencent.mm.plugin.appbrand.d.c;
import com.tencent.mm.plugin.appbrand.f;
import com.tencent.mm.plugin.appbrand.p.f;
import com.tencent.mm.plugin.appbrand.p.g;
import com.tencent.mm.plugin.appbrand.widget.j;
import com.tencent.mm.ui.widget.ThreeDotsLoadingView;

@SuppressLint({"ViewConstructor"})
public final class d
  extends j
  implements i
{
  private f irS;
  private ThreeDotsLoadingView jps;
  private ImageView jsH;
  private TextView jsI;
  private int jsJ;
  private int jsK;
  private ViewGroup jsL;
  private View jsM;
  private LinearLayout jsN;
  private com.tencent.mm.plugin.appbrand.widget.a jsO;
  private View jsP;
  
  public d(Context paramContext, f paramf)
  {
    super(paramContext);
    GMTrace.i(15512213913600L, 115575);
    this.irS = paramf;
    setClickable(true);
    setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
    LayoutInflater.from(getContext()).inflate(p.g.ivw, this);
    this.jsH = ((ImageView)findViewById(p.f.ith));
    this.jsH.setImageDrawable(com.tencent.mm.modelappbrand.a.a.CS());
    this.jsI = ((TextView)findViewById(p.f.itk));
    this.jps = ((ThreeDotsLoadingView)findViewById(p.f.itm));
    this.jsL = ((ViewGroup)findViewById(p.f.itl));
    this.jsM = findViewById(p.f.iti);
    this.jsN = ((LinearLayout)findViewById(p.f.itj));
    this.jsO = new com.tencent.mm.plugin.appbrand.widget.a(getContext());
    this.jsN.addView(this.jsO);
    this.jsP = this.jsO.findViewById(p.f.isM);
    int i = com.tencent.mm.plugin.appbrand.widget.b.bX(getContext());
    this.jsI.getLayoutParams().height = i;
    u(-1, true);
    this.jsO.setBackgroundColor(0);
    this.jsO.sq("black");
    this.jsO.cI(false);
    this.jsO.jyH = new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(10510590279680L, 78310);
        com.tencent.mm.plugin.appbrand.d.a(d.k(d.this).iqL, d.c.iqA);
        d.k(d.this).finish();
        GMTrace.o(10510590279680L, 78310);
      }
    };
    this.jps.cgs();
    GMTrace.o(15512213913600L, 115575);
  }
  
  public final void a(a.c paramc)
  {
    GMTrace.i(17306704936960L, 128945);
    this.jsK = g.au(paramc.iHP, -1);
    if ("white".equals(paramc.iHO))
    {
      this.jsJ = -1;
      GMTrace.o(17306704936960L, 128945);
      return;
    }
    this.jsJ = -16777216;
    GMTrace.o(17306704936960L, 128945);
  }
  
  public final void aag()
  {
    GMTrace.i(17306436501504L, 128943);
    post(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(10507234836480L, 78285);
        final Object localObject = d.this.getParent();
        if (!(localObject instanceof ViewGroup))
        {
          GMTrace.o(10507234836480L, 78285);
          return;
        }
        d.this.setStatusBarColor(d.a(d.this));
        ViewPropertyAnimator localViewPropertyAnimator = d.this.animate();
        localViewPropertyAnimator.setStartDelay(((float)localViewPropertyAnimator.getDuration() * 0.8F));
        localViewPropertyAnimator.setDuration(((float)localViewPropertyAnimator.getDuration() * 0.2F));
        localViewPropertyAnimator.setListener(new AnimatorListenerAdapter()
        {
          public final void onAnimationEnd(Animator paramAnonymous2Animator)
          {
            GMTrace.i(10496900071424L, 78208);
            d.this.setVisibility(8);
            ((ViewGroup)localObject).removeView(d.this);
            GMTrace.o(10496900071424L, 78208);
          }
        });
        localViewPropertyAnimator.alpha(0.0F).start();
        d.b(d.this).animate().scaleX(0.0F).scaleY(0.0F).translationY(-(d.b(d.this).getHeight() / 2)).setInterpolator(new DecelerateInterpolator()).start();
        d.c(d.this).animate().translationX(d.d(d.this)).translationY(-d.c(d.this).getTop()).setInterpolator(new DecelerateInterpolator()).start();
        d.e(d.this).animate().alpha(0.0F).translationY(-d.e(d.this).getTop()).setInterpolator(new DecelerateInterpolator()).start();
        d.h(d.this).animate().scaleY((d.f(d.this) - d.g(d.this).getHeight()) / d.h(d.this).getHeight()).translationY(-((d.f(d.this) - d.g(d.this).getHeight() - d.h(d.this).getHeight()) / 2)).setInterpolator(new DecelerateInterpolator()).start();
        localObject = ValueAnimator.ofObject(new ArgbEvaluator(), new Object[] { Integer.valueOf(-1), Integer.valueOf(d.a(d.this)) });
        ((ValueAnimator)localObject).addUpdateListener(new ValueAnimator.AnimatorUpdateListener()
        {
          public final void onAnimationUpdate(ValueAnimator paramAnonymous2ValueAnimator)
          {
            GMTrace.i(10519448649728L, 78376);
            d.i(d.this).setBackgroundColor(((Integer)paramAnonymous2ValueAnimator.getAnimatedValue()).intValue());
            GMTrace.o(10519448649728L, 78376);
          }
        });
        ((ValueAnimator)localObject).setInterpolator(new DecelerateInterpolator());
        ((ValueAnimator)localObject).start();
        localObject = ValueAnimator.ofObject(new ArgbEvaluator(), new Object[] { Integer.valueOf(-16777216), Integer.valueOf(d.j(d.this)) });
        ((ValueAnimator)localObject).addUpdateListener(new ValueAnimator.AnimatorUpdateListener()
        {
          public final void onAnimationUpdate(ValueAnimator paramAnonymous2ValueAnimator)
          {
            GMTrace.i(10498108030976L, 78217);
            d.c(d.this).setTextColor(((Integer)paramAnonymous2ValueAnimator.getAnimatedValue()).intValue());
            GMTrace.o(10498108030976L, 78217);
          }
        });
        ((ValueAnimator)localObject).setInterpolator(new DecelerateInterpolator());
        ((ValueAnimator)localObject).start();
        GMTrace.o(10507234836480L, 78285);
      }
    });
    GMTrace.o(17306436501504L, 128943);
  }
  
  public final void aah()
  {
    GMTrace.i(17306570719232L, 128944);
    this.jsO.cJ(true);
    GMTrace.o(17306570719232L, 128944);
  }
  
  public final void bh(String paramString1, String paramString2)
  {
    GMTrace.i(17306302283776L, 128942);
    com.tencent.mm.modelappbrand.a.b.CT().a(this.jsH, paramString1, null, e.hkj);
    this.jsI.setText(paramString2);
    GMTrace.o(17306302283776L, 128942);
  }
  
  public final View getView()
  {
    GMTrace.i(17306839154688L, 128946);
    GMTrace.o(17306839154688L, 128946);
    return this;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/ui/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */