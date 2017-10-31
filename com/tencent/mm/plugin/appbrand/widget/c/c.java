package com.tencent.mm.plugin.appbrand.widget.c;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import com.tencent.gmtrace.GMTrace;

public final class c
{
  private int jAE;
  public ValueAnimator jAF;
  public View view;
  
  public c(View paramView)
  {
    GMTrace.i(18296292245504L, 136318);
    this.view = paramView;
    GMTrace.o(18296292245504L, 136318);
  }
  
  public final void a(int paramInt, final Runnable paramRunnable)
  {
    GMTrace.i(18296426463232L, 136319);
    if (this.view == null)
    {
      GMTrace.o(18296426463232L, 136319);
      return;
    }
    this.jAE = paramInt;
    if (((this.view.getBackground() instanceof ColorDrawable)) && (((ColorDrawable)this.view.getBackground()).getColor() == paramInt))
    {
      if (paramRunnable != null) {
        paramRunnable.run();
      }
      if (this.jAF != null) {
        this.jAF.cancel();
      }
      GMTrace.o(18296426463232L, 136319);
      return;
    }
    paramRunnable = new AnimatorListenerAdapter()
    {
      public final void onAnimationCancel(Animator paramAnonymousAnimator)
      {
        GMTrace.i(18296023810048L, 136316);
        c.this.jAF = null;
        GMTrace.o(18296023810048L, 136316);
      }
      
      public final void onAnimationEnd(Animator paramAnonymousAnimator)
      {
        GMTrace.i(18296158027776L, 136317);
        if (paramRunnable != null) {
          paramRunnable.run();
        }
        c.this.jAF = null;
        GMTrace.o(18296158027776L, 136317);
      }
    };
    if ((this.jAF != null) && (this.jAF.isStarted()) && (this.jAF.isRunning()) && (this.jAE == paramInt))
    {
      this.jAF.addListener(paramRunnable);
      GMTrace.o(18296426463232L, 136319);
      return;
    }
    if (this.jAF != null) {
      this.jAF.cancel();
    }
    if ((this.view.getBackground() instanceof ColorDrawable)) {}
    for (paramInt = ((ColorDrawable)this.view.getBackground()).getColor();; paramInt = 0)
    {
      this.jAF = ValueAnimator.ofObject(new ArgbEvaluator(), new Object[] { Integer.valueOf(paramInt), Integer.valueOf(this.jAE) });
      this.jAF.addListener(paramRunnable);
      this.jAF.addUpdateListener(new ValueAnimator.AnimatorUpdateListener()
      {
        public final void onAnimationUpdate(ValueAnimator paramAnonymousValueAnimator)
        {
          GMTrace.i(18293607890944L, 136298);
          if (c.this.view != null) {
            c.this.view.setBackgroundColor(((Integer)paramAnonymousValueAnimator.getAnimatedValue()).intValue());
          }
          GMTrace.o(18293607890944L, 136298);
        }
      });
      this.jAF.start();
      GMTrace.o(18296426463232L, 136319);
      return;
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/widget/c/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */