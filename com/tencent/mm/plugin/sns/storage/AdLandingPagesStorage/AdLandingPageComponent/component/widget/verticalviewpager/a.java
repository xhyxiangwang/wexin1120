package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager;

import android.os.SystemClock;
import android.support.v4.view.u;
import android.support.v4.view.y;
import android.support.v4.view.z;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.View.OnTouchListener;
import com.tencent.gmtrace.GMTrace;
import java.util.ArrayList;

public final class a
  implements View.OnTouchListener
{
  private float jIU;
  private DummyViewPager qsZ;
  private float qta;
  
  public a(DummyViewPager paramDummyViewPager)
  {
    GMTrace.i(17111955013632L, 127494);
    this.qta = Float.MIN_VALUE;
    this.jIU = Float.MIN_VALUE;
    this.qsZ = paramDummyViewPager;
    GMTrace.o(17111955013632L, 127494);
  }
  
  private boolean a(View paramView, MotionEvent paramMotionEvent, float paramFloat)
  {
    GMTrace.i(17112223449088L, 127496);
    float f1;
    float f2;
    int i;
    if (this.qsZ.yo)
    {
      f1 = (int)(this.qsZ.getScrollX() - paramFloat) - this.qsZ.bjr();
      f2 = this.qsZ.getScrollX() - this.qsZ.bjr();
      if (Math.abs(f1 + f2) < Math.abs(f1 - f2))
      {
        i = 1;
        if (i == 0) {
          break label468;
        }
      }
    }
    label468:
    for (float f3 = this.qsZ.getScrollX() - this.qsZ.bjr();; f3 = paramFloat)
    {
      DummyViewPager localDummyViewPager = this.qsZ;
      if (!localDummyViewPager.yo)
      {
        throw new IllegalStateException("No fake drag in progress. Call beginFakeDrag first.");
        i = 0;
        break;
      }
      localDummyViewPager.yi += f3;
      float f4 = localDummyViewPager.getScrollX() - f3;
      i = localDummyViewPager.bP();
      f1 = i;
      float f6 = localDummyViewPager.xY;
      f2 = i;
      float f5 = localDummyViewPager.xZ;
      Object localObject = (AdLandingViewPager.b)localDummyViewPager.dw.get(0);
      AdLandingViewPager.b localb = (AdLandingViewPager.b)localDummyViewPager.dw.get(localDummyViewPager.dw.size() - 1);
      if (((AdLandingViewPager.b)localObject).position != 0) {}
      for (f1 = ((AdLandingViewPager.b)localObject).yI * i;; f1 *= f6)
      {
        if (localb.position != localDummyViewPager.xM.getCount() - 1) {}
        for (f2 = localb.yI * i;; f2 *= f5)
        {
          if (f4 < f1) {}
          for (;;)
          {
            localDummyViewPager.yi += f1 - (int)f1;
            localDummyViewPager.scrollTo((int)f1, localDummyViewPager.getScrollY());
            localDummyViewPager.ab((int)f1);
            long l = SystemClock.uptimeMillis();
            localObject = MotionEvent.obtain(localDummyViewPager.qsQ, l, 2, localDummyViewPager.yi, 0.0F, 0);
            localDummyViewPager.ez.addMovement((MotionEvent)localObject);
            ((MotionEvent)localObject).recycle();
            new StringBuilder("fake drag, diff ").append(paramFloat).append(",step ").append(f3).append(",scrollX ").append(this.qsZ.getScrollX());
            c(paramView, paramMotionEvent);
            GMTrace.o(17112223449088L, 127496);
            return true;
            if (f4 > f2)
            {
              f1 = f2;
              continue;
              GMTrace.o(17112223449088L, 127496);
              return false;
            }
            else
            {
              f1 = f4;
            }
          }
        }
      }
    }
  }
  
  private static void c(View paramView, MotionEvent paramMotionEvent)
  {
    GMTrace.i(17112357666816L, 127497);
    paramMotionEvent = MotionEvent.obtain(paramMotionEvent);
    paramMotionEvent.setAction(0);
    paramView.dispatchTouchEvent(paramMotionEvent);
    GMTrace.o(17112357666816L, 127497);
  }
  
  public final boolean onTouch(View paramView, MotionEvent paramMotionEvent)
  {
    GMTrace.i(17112089231360L, 127495);
    new StringBuilder("onTouchEvent , action ").append(paramMotionEvent.getAction()).append(", e.rawY ").append(paramMotionEvent.getRawY()).append(",lastMotionY ").append(this.qta).append(",downY ").append(this.jIU);
    label272:
    int i;
    switch (paramMotionEvent.getAction())
    {
    default: 
    case 0: 
    case 2: 
      for (;;)
      {
        boolean bool = paramView.onTouchEvent(paramMotionEvent);
        GMTrace.o(17112089231360L, 127495);
        return bool;
        this.jIU = paramMotionEvent.getRawY();
        continue;
        if ((this.jIU != Float.MIN_VALUE) || (this.qta != Float.MIN_VALUE)) {
          break;
        }
        this.jIU = paramMotionEvent.getRawY();
      }
      float f2 = paramMotionEvent.getRawY();
      if (this.qta == Float.MIN_VALUE) {}
      for (float f1 = this.jIU;; f1 = this.qta)
      {
        this.qta = paramMotionEvent.getRawY();
        f1 = (f2 - f1) / 2.0F;
        new StringBuilder("scrollX ").append(this.qsZ.getScrollX()).append(",basescrollX ").append(this.qsZ.bjr());
        if (this.qsZ.getScrollX() == this.qsZ.bjr()) {
          break label272;
        }
        if (!a(paramView, paramMotionEvent, f1)) {
          break;
        }
        GMTrace.o(17112089231360L, 127495);
        return false;
      }
      if (-f1 > 0.0F) {}
      for (i = 1;; i = -1)
      {
        if (!z.h(paramView, i)) {
          break label326;
        }
        new StringBuilder("scroll vertically  ").append(f1).append(", move.lastMotionY ").append(paramMotionEvent.getY());
        break;
      }
      label326:
      this.qsZ.bjq();
      a(paramView, paramMotionEvent, f1);
      c(paramView, paramMotionEvent);
      GMTrace.o(17112089231360L, 127495);
      return false;
    }
    if (this.qsZ.yo) {
      try
      {
        DummyViewPager localDummyViewPager = this.qsZ;
        if (!localDummyViewPager.yo) {
          throw new IllegalStateException("No fake drag in progress. Call beginFakeDrag first.");
        }
      }
      catch (Exception localException) {}
    }
    for (;;)
    {
      this.jIU = Float.MIN_VALUE;
      this.qta = Float.MIN_VALUE;
      break;
      Object localObject = localException.ez;
      ((VelocityTracker)localObject).computeCurrentVelocity(1000, localException.yl);
      i = (int)y.a((VelocityTracker)localObject, localException.eA);
      localException.yd = true;
      int j = localException.bP();
      int k = localException.getScrollX();
      localObject = localException.bjp();
      localException.a(localException.a(((AdLandingViewPager.b)localObject).position, (k / j - ((AdLandingViewPager.b)localObject).yI) / ((AdLandingViewPager.b)localObject).yH, i, (int)(localException.yi - localException.wX)), true, true, i);
      localException.cz();
      localException.yo = false;
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/widget/verticalviewpager/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */