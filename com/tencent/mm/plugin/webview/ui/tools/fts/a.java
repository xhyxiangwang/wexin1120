package com.tencent.mm.plugin.webview.ui.tools.fts;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnPreDrawListener;
import android.widget.RelativeLayout.LayoutParams;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.f;
import com.tencent.mm.sdk.platformtools.w;
import java.lang.reflect.Array;

public final class a
{
  public static int obK;
  public static int swm;
  private View khA;
  public boolean nUA;
  public View swn;
  public View swo;
  public View swp;
  public View swq;
  public View swr;
  public View sws;
  public float[][] swt;
  int swu;
  public int swv;
  public int sww;
  public a swx;
  
  public a(Context paramContext, final View paramView1, final View paramView2, View paramView3, View paramView4, View paramView5, final View paramView6, View paramView7)
  {
    GMTrace.i(16893314334720L, 125865);
    this.swu = b.swD;
    swm = com.tencent.mm.bq.a.fromDPToPix(paramContext, 48) / 2;
    obK = (int)paramContext.getResources().getDimension(R.f.aUY);
    this.swt = ((float[][])Array.newInstance(Float.TYPE, new int[] { 3, 2 }));
    this.swo = paramView1;
    this.swn = paramView2;
    this.swp = paramView3;
    this.sws = paramView7;
    this.swq = paramView4;
    this.swr = paramView5;
    this.khA = paramView6;
    this.swo.post(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(16222762565632L, 120869);
        a.this.swt[0][0] = paramView1.getY();
        a.this.swt[0][1] = 0;
        a.this.swt[1][0] = paramView1.getX();
        a.this.swt[1][1] = 0;
        a.this.swt[2][0] = paramView1.getMeasuredWidth();
        a.this.swt[2][1] = (paramView1.getMeasuredWidth() + a.swm * 2);
        GMTrace.o(16222762565632L, 120869);
      }
    });
    paramView2.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener()
    {
      public final boolean onPreDraw()
      {
        GMTrace.i(16898817261568L, 125906);
        paramView2.getViewTreeObserver().removeOnPreDrawListener(this);
        RelativeLayout.LayoutParams localLayoutParams = (RelativeLayout.LayoutParams)paramView2.getLayoutParams();
        a.this.sww = (localLayoutParams.leftMargin - a.obK);
        GMTrace.o(16898817261568L, 125906);
        return true;
      }
    });
    paramView6.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener()
    {
      public final boolean onPreDraw()
      {
        GMTrace.i(16891837939712L, 125854);
        paramView6.getViewTreeObserver().removeOnPreDrawListener(this);
        a.this.swv = ((int)paramView6.getX());
        GMTrace.o(16891837939712L, 125854);
        return true;
      }
    });
    GMTrace.o(16893314334720L, 125865);
  }
  
  public final void xH(int paramInt)
  {
    GMTrace.i(16207595962368L, 120756);
    if (paramInt == this.swu)
    {
      GMTrace.o(16207595962368L, 120756);
      return;
    }
    switch (2.swA[(paramInt - 1)])
    {
    }
    for (;;)
    {
      this.swu = paramInt;
      GMTrace.o(16207595962368L, 120756);
      return;
      ObjectAnimator localObjectAnimator1 = ObjectAnimator.ofFloat(this.swo, "y", new float[] { this.swt[0][1], this.swt[0][0] });
      ObjectAnimator localObjectAnimator2 = ObjectAnimator.ofFloat(this.swo, "x", new float[] { this.swt[1][1], this.swt[1][0] });
      ObjectAnimator localObjectAnimator3 = ObjectAnimator.ofFloat(this.swn, "alpha", new float[] { 0.0F, 1.0F });
      ObjectAnimator localObjectAnimator4 = ObjectAnimator.ofFloat(this.swq, "alpha", new float[] { 0.0F, 1.0F });
      Object localObject1 = ValueAnimator.ofInt(new int[] { this.sww, this.swv });
      ((ValueAnimator)localObject1).addUpdateListener(new ValueAnimator.AnimatorUpdateListener()
      {
        public final void onAnimationUpdate(ValueAnimator paramAnonymousValueAnimator)
        {
          GMTrace.i(16223031001088L, 120871);
          int i = ((Integer)paramAnonymousValueAnimator.getAnimatedValue()).intValue();
          a.this.swo.setPadding(i, 0, 0, 0);
          GMTrace.o(16223031001088L, 120871);
        }
      });
      ValueAnimator localValueAnimator = ValueAnimator.ofInt(new int[] { swm, 0 });
      localValueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener()
      {
        public final void onAnimationUpdate(ValueAnimator paramAnonymousValueAnimator)
        {
          GMTrace.i(16906333454336L, 125962);
          int i = ((Integer)paramAnonymousValueAnimator.getAnimatedValue()).intValue();
          w.i("MicroMsg.FTS.SosAnimatorController", "widthSearchBarAnimator value : %d", new Object[] { Integer.valueOf(i) });
          paramAnonymousValueAnimator = (RelativeLayout.LayoutParams)a.this.swo.getLayoutParams();
          paramAnonymousValueAnimator.leftMargin = (a.swm - i);
          paramAnonymousValueAnimator.rightMargin = (a.swm - i);
          paramAnonymousValueAnimator.width = (i * 2 + (int)a.this.swt[2][0]);
          a.this.swo.requestLayout();
          GMTrace.o(16906333454336L, 125962);
        }
      });
      Object localObject2 = new AnimatorSet();
      ((AnimatorSet)localObject2).playTogether(new Animator[] { localObjectAnimator2, localObjectAnimator1, localValueAnimator, localObjectAnimator3, localObjectAnimator4, localObject1 });
      ((AnimatorSet)localObject2).setDuration(300L);
      ((AnimatorSet)localObject2).addListener(new Animator.AnimatorListener()
      {
        public final void onAnimationCancel(Animator paramAnonymousAnimator)
        {
          GMTrace.i(16891435286528L, 125851);
          a.this.nUA = false;
          GMTrace.o(16891435286528L, 125851);
        }
        
        public final void onAnimationEnd(Animator paramAnonymousAnimator)
        {
          GMTrace.i(16891301068800L, 125850);
          a.this.nUA = false;
          if (a.this.swx != null) {
            a.this.swx.onAnimationEnd();
          }
          a.this.swp.setVisibility(0);
          a.this.swo.setPadding(0, 0, 0, 0);
          a.this.swr.setAlpha(1.0F);
          GMTrace.o(16891301068800L, 125850);
        }
        
        public final void onAnimationRepeat(Animator paramAnonymousAnimator)
        {
          GMTrace.i(16891569504256L, 125852);
          GMTrace.o(16891569504256L, 125852);
        }
        
        public final void onAnimationStart(Animator paramAnonymousAnimator)
        {
          GMTrace.i(16891166851072L, 125849);
          a.this.nUA = true;
          if (a.this.swx != null) {
            a.this.swx.onAnimationStart();
          }
          a.this.swq.setVisibility(0);
          a.this.swn.setVisibility(0);
          a.this.sws.setVisibility(8);
          a.this.swr.setVisibility(8);
          GMTrace.o(16891166851072L, 125849);
        }
      });
      ((AnimatorSet)localObject2).start();
      continue;
      localObjectAnimator1 = ObjectAnimator.ofFloat(this.swo, "y", new float[] { this.swt[0][0], this.swt[0][1] });
      localObjectAnimator2 = ObjectAnimator.ofFloat(this.swo, "x", new float[] { this.swt[1][0], this.swt[1][1] });
      localObjectAnimator3 = ObjectAnimator.ofFloat(this.swn, "alpha", new float[] { 1.0F, 0.0F });
      localObjectAnimator4 = ObjectAnimator.ofFloat(this.swq, "alpha", new float[] { 1.0F, 0.0F });
      localObject1 = ObjectAnimator.ofFloat(this.swr, "alpha", new float[] { 0.0F, 1.0F });
      localValueAnimator = ValueAnimator.ofInt(new int[] { this.swv, this.sww });
      localValueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener()
      {
        public final void onAnimationUpdate(ValueAnimator paramAnonymousValueAnimator)
        {
          GMTrace.i(16889824673792L, 125839);
          int i = ((Integer)paramAnonymousValueAnimator.getAnimatedValue()).intValue();
          a.this.swo.setPadding(i, 0, 0, 0);
          GMTrace.o(16889824673792L, 125839);
        }
      });
      localObject2 = ValueAnimator.ofInt(new int[] { 0, swm });
      ((ValueAnimator)localObject2).addUpdateListener(new ValueAnimator.AnimatorUpdateListener()
      {
        public final void onAnimationUpdate(ValueAnimator paramAnonymousValueAnimator)
        {
          GMTrace.i(16913446993920L, 126015);
          int i = ((Integer)paramAnonymousValueAnimator.getAnimatedValue()).intValue();
          paramAnonymousValueAnimator = (RelativeLayout.LayoutParams)a.this.swo.getLayoutParams();
          paramAnonymousValueAnimator.leftMargin = (a.swm - i);
          paramAnonymousValueAnimator.rightMargin = (a.swm - i);
          paramAnonymousValueAnimator.width = (i * 2 + (int)a.this.swt[2][0]);
          a.this.swo.setLayoutParams(paramAnonymousValueAnimator);
          GMTrace.o(16913446993920L, 126015);
        }
      });
      AnimatorSet localAnimatorSet = new AnimatorSet();
      localAnimatorSet.playTogether(new Animator[] { localObjectAnimator2, localObjectAnimator1, localObject2, localObjectAnimator3, localObjectAnimator4, localObject1, localValueAnimator });
      localAnimatorSet.setDuration(300L);
      localAnimatorSet.addListener(new Animator.AnimatorListener()
      {
        public final void onAnimationCancel(Animator paramAnonymousAnimator)
        {
          GMTrace.i(16909957332992L, 125989);
          a.this.nUA = false;
          GMTrace.o(16909957332992L, 125989);
        }
        
        public final void onAnimationEnd(Animator paramAnonymousAnimator)
        {
          GMTrace.i(16909823115264L, 125988);
          a.this.nUA = false;
          if (a.this.swx != null) {
            a.this.swx.onAnimationEnd();
          }
          a.this.sws.setVisibility(0);
          a.this.swq.setAlpha(1.0F);
          a.this.swq.setVisibility(8);
          GMTrace.o(16909823115264L, 125988);
        }
        
        public final void onAnimationRepeat(Animator paramAnonymousAnimator)
        {
          GMTrace.i(16910091550720L, 125990);
          GMTrace.o(16910091550720L, 125990);
        }
        
        public final void onAnimationStart(Animator paramAnonymousAnimator)
        {
          GMTrace.i(16909688897536L, 125987);
          a.this.nUA = true;
          if (a.this.swx != null) {
            a.this.swx.onAnimationStart();
          }
          a.this.swp.setVisibility(8);
          a.this.swr.setVisibility(0);
          GMTrace.o(16909688897536L, 125987);
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
  
  public static enum b
  {
    static
    {
      GMTrace.i(16206522220544L, 120748);
      swD = 1;
      swE = 2;
      swF = new int[] { swD, swE };
      GMTrace.o(16206522220544L, 120748);
    }
    
    public static int[] bCP()
    {
      GMTrace.i(16206388002816L, 120747);
      int[] arrayOfInt = (int[])swF.clone();
      GMTrace.o(16206388002816L, 120747);
      return arrayOfInt;
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/webview/ui/tools/fts/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */