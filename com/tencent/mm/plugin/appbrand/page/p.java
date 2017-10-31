package com.tencent.mm.plugin.appbrand.page;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup.LayoutParams;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.xweb.WebView;

public class p
  extends FrameLayout
{
  View HB;
  private int hR;
  public boolean jlA;
  boolean jlB;
  private boolean jlC;
  private boolean jlD;
  private boolean jlE;
  private int jlF;
  private int jlG;
  private int jlH;
  private ObjectAnimator jlI;
  View jlx;
  FrameLayout jly;
  FrameLayout jlz;
  
  public p(Context paramContext)
  {
    super(paramContext);
    GMTrace.i(10246047137792L, 76339);
    this.jlA = true;
    this.jlB = false;
    this.jlC = false;
    this.jlD = false;
    this.jlE = false;
    this.jlI = null;
    setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
    this.hR = ViewConfiguration.get(paramContext).getScaledTouchSlop();
    GMTrace.o(10246047137792L, 76339);
  }
  
  private boolean Zl()
  {
    GMTrace.i(10247120879616L, 76347);
    if ((this.HB instanceof WebView))
    {
      if (((WebView)this.HB).getWebScrollY() == 0)
      {
        GMTrace.o(10247120879616L, 76347);
        return true;
      }
      GMTrace.o(10247120879616L, 76347);
      return false;
    }
    if (this.HB.getScrollY() == 0)
    {
      GMTrace.o(10247120879616L, 76347);
      return true;
    }
    GMTrace.o(10247120879616L, 76347);
    return false;
  }
  
  private void jf(int paramInt)
  {
    GMTrace.i(10247389315072L, 76349);
    int i = (int)this.jlz.getTranslationY();
    if (i == paramInt)
    {
      GMTrace.o(10247389315072L, 76349);
      return;
    }
    w.i("MicroMsg.AppBrandPullDownView", "fastScrollTo from = %s, to = %s", new Object[] { Integer.valueOf(i), Integer.valueOf(paramInt) });
    if (this.jlI != null) {
      this.jlI.cancel();
    }
    long l = (Math.abs(i - paramInt) / Zm() * 250.0F);
    ObjectAnimator localObjectAnimator = ObjectAnimator.ofFloat(this.jlz, "translationY", new float[] { i, paramInt });
    localObjectAnimator.setDuration(Math.min(l, 250L));
    localObjectAnimator.setInterpolator(new DecelerateInterpolator());
    localObjectAnimator.start();
    localObjectAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener()
    {
      public final void onAnimationUpdate(ValueAnimator paramAnonymousValueAnimator)
      {
        GMTrace.i(10217861414912L, 76129);
        float f = ((Float)paramAnonymousValueAnimator.getAnimatedValue()).floatValue();
        p.this.jd((int)f);
        GMTrace.o(10217861414912L, 76129);
      }
    });
    this.jlI = localObjectAnimator;
    GMTrace.o(10247389315072L, 76349);
  }
  
  protected final void Zh()
  {
    GMTrace.i(17658892255232L, 131569);
    jf(Zm());
    if (!this.jlC) {
      Zj();
    }
    this.jlD = true;
    this.jlC = true;
    this.jlE = true;
    GMTrace.o(17658892255232L, 131569);
  }
  
  protected final void Zi()
  {
    GMTrace.i(10246584008704L, 76343);
    jf(0);
    if (this.jlC) {
      Zk();
    }
    this.jlD = false;
    this.jlC = false;
    this.jlE = false;
    GMTrace.o(10246584008704L, 76343);
  }
  
  protected void Zj()
  {
    GMTrace.i(10246718226432L, 76344);
    GMTrace.o(10246718226432L, 76344);
  }
  
  protected void Zk()
  {
    GMTrace.i(10246852444160L, 76345);
    GMTrace.o(10246852444160L, 76345);
  }
  
  protected int Zm()
  {
    GMTrace.i(10247255097344L, 76348);
    int i = this.jlx.getHeight();
    GMTrace.o(10247255097344L, 76348);
    return i;
  }
  
  public final void cv(boolean paramBoolean)
  {
    GMTrace.i(19901267836928L, 148276);
    if (!paramBoolean) {}
    for (paramBoolean = true;; paramBoolean = false)
    {
      this.jlA = paramBoolean;
      GMTrace.o(19901267836928L, 148276);
      return;
    }
  }
  
  protected void jd(int paramInt)
  {
    GMTrace.i(10246986661888L, 76346);
    GMTrace.o(10246986661888L, 76346);
  }
  
  public final void je(int paramInt)
  {
    GMTrace.i(19901402054656L, 148277);
    this.jly.setBackgroundColor(paramInt);
    GMTrace.o(19901402054656L, 148277);
  }
  
  public final boolean onInterceptTouchEvent(MotionEvent paramMotionEvent)
  {
    GMTrace.i(10246315573248L, 76341);
    if (this.jlA)
    {
      boolean bool = this.jlE;
      GMTrace.o(10246315573248L, 76341);
      return bool;
    }
    int i = paramMotionEvent.getAction();
    if ((i == 3) || (i == 1))
    {
      GMTrace.o(10246315573248L, 76341);
      return false;
    }
    if (this.jlD)
    {
      GMTrace.o(10246315573248L, 76341);
      return true;
    }
    switch (i)
    {
    }
    int k;
    int j;
    do
    {
      do
      {
        for (;;)
        {
          GMTrace.o(10246315573248L, 76341);
          return false;
          if (Zl())
          {
            this.jlF = ((int)paramMotionEvent.getX());
            this.jlG = ((int)paramMotionEvent.getY());
            this.jlH = ((int)paramMotionEvent.getY());
          }
        }
      } while (!Zl());
      i = (int)paramMotionEvent.getX();
      k = (int)paramMotionEvent.getY();
      j = this.jlF;
      k -= this.jlG;
    } while ((Math.abs(k) <= this.hR) || (Math.abs(k) <= Math.abs(i - j)) || (k <= 0));
    this.jlD = true;
    GMTrace.o(10246315573248L, 76341);
    return true;
  }
  
  public final boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    GMTrace.i(10246449790976L, 76342);
    if (this.jlA)
    {
      if (this.jlE) {
        Zi();
      }
      boolean bool = this.jlE;
      GMTrace.o(10246449790976L, 76342);
      return bool;
    }
    switch (paramMotionEvent.getAction())
    {
    default: 
      GMTrace.o(10246449790976L, 76342);
      return false;
    case 0: 
      this.jlH = ((int)paramMotionEvent.getY());
      GMTrace.o(10246449790976L, 76342);
      return true;
    case 2: 
      int k = (int)paramMotionEvent.getY() - this.jlH;
      int i = k >> 1;
      int j = getHeight();
      if (i > j) {
        i = j;
      }
      for (;;)
      {
        j = i;
        if (this.jlC) {
          j = i + Zm();
        }
        i = Math.max(j, 0);
        w.d("MicroMsg.AppBrandPullDownView", "real diff: %d, calc diff: %d", new Object[] { Integer.valueOf(k), Integer.valueOf(i) });
        j = Math.min(getHeight(), i);
        this.jlz.setTranslationY(j);
        jd(i);
        GMTrace.o(10246449790976L, 76342);
        return true;
      }
    }
    if ((this.jlz.getTranslationY() > this.jlx.getHeight()) && (this.jlB)) {
      Zh();
    }
    for (;;)
    {
      GMTrace.o(10246449790976L, 76342);
      return true;
      Zi();
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/page/p.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */