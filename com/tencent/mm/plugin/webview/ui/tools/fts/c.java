package com.tencent.mm.plugin.webview.ui.tools.fts;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
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
import com.tencent.mm.bq.a;
import com.tencent.mm.sdk.platformtools.w;
import java.lang.reflect.Array;

public final class c
{
  public static int obK;
  public static int swm;
  private View khA;
  public boolean nUA;
  public a swJ;
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
  
  public c(Context paramContext, final View paramView1, final View paramView2, View paramView3, View paramView4, View paramView5, final View paramView6, View paramView7)
  {
    GMTrace.i(16898011955200L, 125900);
    this.swu = a.b.swD;
    swm = a.fromDPToPix(paramContext, 48) / 2;
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
        GMTrace.i(16897743519744L, 125898);
        c.this.swt[0][0] = paramView1.getY();
        c.this.swt[0][1] = 0;
        c.this.swt[1][0] = paramView1.getX();
        c.this.swt[1][1] = 0;
        c.this.swt[2][0] = paramView1.getMeasuredWidth();
        c.this.swt[2][1] = (paramView1.getMeasuredWidth() + c.swm * 2);
        GMTrace.o(16897743519744L, 125898);
      }
    });
    paramView2.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener()
    {
      public final boolean onPreDraw()
      {
        GMTrace.i(16907272978432L, 125969);
        paramView2.getViewTreeObserver().removeOnPreDrawListener(this);
        RelativeLayout.LayoutParams localLayoutParams = (RelativeLayout.LayoutParams)paramView2.getLayoutParams();
        c.this.sww = (localLayoutParams.leftMargin - c.obK);
        GMTrace.o(16907272978432L, 125969);
        return true;
      }
    });
    paramView6.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener()
    {
      public final boolean onPreDraw()
      {
        GMTrace.i(16909420462080L, 125985);
        paramView6.getViewTreeObserver().removeOnPreDrawListener(this);
        c.this.swv = 0;
        GMTrace.o(16909420462080L, 125985);
        return true;
      }
    });
    GMTrace.o(16898011955200L, 125900);
  }
  
  public static abstract interface a
  {
    public abstract void onAnimationEnd();
    
    public abstract void onAnimationStart();
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/webview/ui/tools/fts/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */