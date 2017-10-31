package com.tencent.mm.plugin.webview.ui.tools.fts;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.content.Context;
import android.view.View;
import android.widget.RelativeLayout.LayoutParams;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.bq.a;
import com.tencent.mm.sdk.platformtools.w;
import java.lang.reflect.Array;

public final class b
{
  public static int swm;
  public boolean nUA;
  public View swG;
  public a swH;
  public View swn;
  public View swo;
  public View swq;
  public View swr;
  public View sws;
  public float[][] swt;
  int swu;
  
  public b(Context paramContext, final View paramView1, View paramView2, View paramView3, View paramView4, View paramView5, View paramView6)
  {
    GMTrace.i(16908346720256L, 125977);
    this.swu = a.b.swD;
    swm = a.fromDPToPix(paramContext, 48) / 2;
    this.swt = ((float[][])Array.newInstance(Float.TYPE, new int[] { 3, 2 }));
    this.swr = paramView4;
    this.swo = paramView1;
    this.swn = paramView2;
    this.sws = paramView5;
    this.swq = paramView3;
    this.swG = paramView6;
    this.swo.post(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(16889287802880L, 125835);
        b.this.swt[0][0] = paramView1.getY();
        b.this.swt[0][1] = 0;
        b.this.swt[1][0] = paramView1.getX();
        b.this.swt[1][1] = 0;
        b.this.swt[2][0] = paramView1.getMeasuredWidth();
        b.this.swt[2][1] = (paramView1.getMeasuredWidth() + b.swm * 2);
        GMTrace.o(16889287802880L, 125835);
      }
    });
    GMTrace.o(16908346720256L, 125977);
  }
  
  public final void xH(int paramInt)
  {
    GMTrace.i(16908480937984L, 125978);
    if (paramInt == this.swu)
    {
      GMTrace.o(16908480937984L, 125978);
      return;
    }
    switch (6.swA[(paramInt - 1)])
    {
    }
    for (;;)
    {
      this.swu = paramInt;
      GMTrace.o(16908480937984L, 125978);
      return;
      ObjectAnimator localObjectAnimator1 = ObjectAnimator.ofFloat(this.swo, "y", new float[] { this.swt[0][1], this.swt[0][0] });
      ObjectAnimator localObjectAnimator2 = ObjectAnimator.ofFloat(this.swo, "x", new float[] { this.swt[1][1], this.swt[1][0] });
      ObjectAnimator localObjectAnimator3 = ObjectAnimator.ofFloat(this.swG, "alpha", new float[] { 0.0F, 1.0F });
      ObjectAnimator localObjectAnimator4 = ObjectAnimator.ofFloat(this.swn, "alpha", new float[] { 0.0F, 1.0F });
      ValueAnimator localValueAnimator = ValueAnimator.ofInt(new int[] { swm, 0 });
      localValueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener()
      {
        public final void onAnimationUpdate(ValueAnimator paramAnonymousValueAnimator)
        {
          GMTrace.i(16890093109248L, 125841);
          int i = ((Integer)paramAnonymousValueAnimator.getAnimatedValue()).intValue();
          w.i("MicroMsg.FTS.SosAnimatorController", "widthSearchBarAnimator value : %d", new Object[] { Integer.valueOf(i) });
          paramAnonymousValueAnimator = (RelativeLayout.LayoutParams)b.this.swo.getLayoutParams();
          paramAnonymousValueAnimator.leftMargin = (b.swm - i);
          paramAnonymousValueAnimator.rightMargin = (b.swm - i);
          paramAnonymousValueAnimator.width = (i * 2 + (int)b.this.swt[2][0]);
          b.this.swo.requestLayout();
          GMTrace.o(16890093109248L, 125841);
        }
      });
      AnimatorSet localAnimatorSet = new AnimatorSet();
      localAnimatorSet.playTogether(new Animator[] { localObjectAnimator2, localObjectAnimator1, localValueAnimator, localObjectAnimator3, localObjectAnimator4 });
      localAnimatorSet.setDuration(300L);
      localAnimatorSet.addListener(new Animator.AnimatorListener()
      {
        public final void onAnimationCancel(Animator paramAnonymousAnimator)
        {
          GMTrace.i(16911433728000L, 126000);
          b.this.nUA = false;
          GMTrace.o(16911433728000L, 126000);
        }
        
        public final void onAnimationEnd(Animator paramAnonymousAnimator)
        {
          GMTrace.i(16911299510272L, 125999);
          b.this.nUA = false;
          if (b.this.swH != null) {
            b.this.swH.onAnimationEnd();
          }
          GMTrace.o(16911299510272L, 125999);
        }
        
        public final void onAnimationRepeat(Animator paramAnonymousAnimator)
        {
          GMTrace.i(16911567945728L, 126001);
          GMTrace.o(16911567945728L, 126001);
        }
        
        public final void onAnimationStart(Animator paramAnonymousAnimator)
        {
          GMTrace.i(16911165292544L, 125998);
          b.this.nUA = true;
          if (b.this.swH != null) {
            b.this.swH.onAnimationStart();
          }
          b.this.swq.setVisibility(0);
          b.this.swn.setVisibility(0);
          b.this.sws.setVisibility(8);
          b.this.swG.setVisibility(0);
          b.this.swr.setVisibility(8);
          GMTrace.o(16911165292544L, 125998);
        }
      });
      localAnimatorSet.start();
      continue;
      localObjectAnimator1 = ObjectAnimator.ofFloat(this.swo, "y", new float[] { this.swt[0][0], this.swt[0][1] });
      localObjectAnimator2 = ObjectAnimator.ofFloat(this.swo, "x", new float[] { this.swt[1][0], this.swt[1][1] });
      localObjectAnimator3 = ObjectAnimator.ofFloat(this.swG, "alpha", new float[] { 1.0F, 0.0F });
      localObjectAnimator4 = ObjectAnimator.ofFloat(this.swn, "alpha", new float[] { 1.0F, 0.0F });
      localValueAnimator = ValueAnimator.ofInt(new int[] { 0, swm });
      localValueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener()
      {
        public final void onAnimationUpdate(ValueAnimator paramAnonymousValueAnimator)
        {
          GMTrace.i(16907004542976L, 125967);
          int i = ((Integer)paramAnonymousValueAnimator.getAnimatedValue()).intValue();
          paramAnonymousValueAnimator = (RelativeLayout.LayoutParams)b.this.swo.getLayoutParams();
          paramAnonymousValueAnimator.leftMargin = (b.swm - i);
          paramAnonymousValueAnimator.rightMargin = (b.swm - i);
          paramAnonymousValueAnimator.width = (i * 2 + (int)b.this.swt[2][0]);
          b.this.swo.setLayoutParams(paramAnonymousValueAnimator);
          GMTrace.o(16907004542976L, 125967);
        }
      });
      localAnimatorSet = new AnimatorSet();
      localAnimatorSet.playTogether(new Animator[] { localObjectAnimator2, localObjectAnimator1, localValueAnimator, localObjectAnimator3, localObjectAnimator4 });
      localAnimatorSet.setDuration(300L);
      localAnimatorSet.addListener(new Animator.AnimatorListener()
      {
        public final void onAnimationCancel(Animator paramAnonymousAnimator)
        {
          GMTrace.i(16890629980160L, 125845);
          b.this.nUA = false;
          GMTrace.o(16890629980160L, 125845);
        }
        
        public final void onAnimationEnd(Animator paramAnonymousAnimator)
        {
          GMTrace.i(16890495762432L, 125844);
          b.this.nUA = false;
          if (b.this.swH != null) {
            b.this.swH.onAnimationEnd();
          }
          b.this.sws.setVisibility(0);
          b.this.swG.setAlpha(1.0F);
          b.this.swG.setVisibility(8);
          b.this.swn.setAlpha(1.0F);
          b.this.swn.setVisibility(8);
          GMTrace.o(16890495762432L, 125844);
        }
        
        public final void onAnimationRepeat(Animator paramAnonymousAnimator)
        {
          GMTrace.i(16890764197888L, 125846);
          GMTrace.o(16890764197888L, 125846);
        }
        
        public final void onAnimationStart(Animator paramAnonymousAnimator)
        {
          GMTrace.i(16890361544704L, 125843);
          b.this.nUA = true;
          if (b.this.swH != null) {
            b.this.swH.onAnimationStart();
          }
          GMTrace.o(16890361544704L, 125843);
        }
      });
      localAnimatorSet.start();
    }
  }
  
  public static abstract interface a
  {
    public abstract void onAnimationEnd();
    
    public abstract void onAnimationStart();
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/webview/ui/tools/fts/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */