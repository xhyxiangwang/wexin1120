package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.Resources.NotFoundException;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.os.SystemClock;
import android.support.v4.os.c;
import android.support.v4.view.ViewPager.e;
import android.support.v4.view.ViewPager.f;
import android.support.v4.view.a;
import android.support.v4.view.a.f;
import android.support.v4.view.ae;
import android.support.v4.view.g;
import android.support.v4.view.o;
import android.support.v4.view.u;
import android.support.v4.view.y;
import android.support.v4.view.z;
import android.support.v4.widget.i;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.SoundEffectConstants;
import android.view.VelocityTracker;
import android.view.View;
import android.view.View.BaseSavedState;
import android.view.View.MeasureSpec;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.Interpolator;
import android.widget.Scroller;
import com.tencent.gmtrace.GMTrace;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import junit.framework.Assert;

public class AdLandingViewPager
  extends ViewGroup
{
  private static final e qsS;
  private static final int[] xH;
  private static final Comparator<b> xJ;
  private static final Interpolator xK;
  private final Rect dF;
  final ArrayList<b> dw;
  int eA;
  VelocityTracker ez;
  private boolean hP;
  private int hR;
  private boolean oy;
  private final b qsO;
  private d qsP;
  long qsQ;
  Method qsR;
  float wX;
  private float wY;
  private int xI;
  public u xM;
  public int xN;
  private int xO;
  private Parcelable xP;
  private ClassLoader xQ;
  private Scroller xR;
  private int xU;
  private Drawable xV;
  private int xW;
  private int xX;
  float xY;
  float xZ;
  private int xq;
  int yA;
  private ArrayList<View> yB;
  private final Runnable yD;
  private int ya;
  private int yb;
  private boolean yc;
  boolean yd;
  public int ye;
  private boolean yf;
  private int yg;
  private int yh;
  float yi;
  private float yj;
  private int yk;
  int yl;
  private int ym;
  private int yn;
  boolean yo;
  private i yp;
  private i yq;
  private boolean yr;
  private boolean ys;
  private boolean yt;
  private int yu;
  ViewPager.e yw;
  private ViewPager.e yx;
  ViewPager.f yz;
  
  static
  {
    GMTrace.i(17121350254592L, 127564);
    xH = new int[] { 16842931 };
    xJ = new Comparator() {};
    xK = new Interpolator()
    {
      public final float getInterpolation(float paramAnonymousFloat)
      {
        GMTrace.i(17111820795904L, 127493);
        paramAnonymousFloat -= 1.0F;
        GMTrace.o(17111820795904L, 127493);
        return paramAnonymousFloat * (paramAnonymousFloat * paramAnonymousFloat * paramAnonymousFloat * paramAnonymousFloat) + 1.0F;
      }
    };
    qsS = new e();
    GMTrace.o(17121350254592L, 127564);
  }
  
  public AdLandingViewPager(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(17112760320000L, 127500);
    this.dw = new ArrayList();
    this.qsO = new b();
    this.dF = new Rect();
    this.xO = -1;
    this.xP = null;
    this.xQ = null;
    this.xY = -3.4028235E38F;
    this.xZ = Float.MAX_VALUE;
    this.ye = 1;
    this.eA = -1;
    this.yr = true;
    this.ys = false;
    this.yD = new Runnable()
    {
      public final void run()
      {
        GMTrace.i(17122155560960L, 127570);
        AdLandingViewPager.a(AdLandingViewPager.this);
        AdLandingViewPager.this.populate();
        GMTrace.o(17122155560960L, 127570);
      }
    };
    this.xq = 0;
    setWillNotDraw(false);
    setDescendantFocusability(262144);
    setFocusable(true);
    paramContext = getContext();
    this.xR = new Scroller(paramContext, xK);
    paramAttributeSet = ViewConfiguration.get(paramContext);
    float f = paramContext.getResources().getDisplayMetrics().density;
    this.hR = ae.a(paramAttributeSet);
    this.yk = ((int)(400.0F * f));
    this.yl = paramAttributeSet.getScaledMaximumFlingVelocity();
    this.yp = new i(paramContext);
    this.yq = new i(paramContext);
    this.ym = ((int)(25.0F * f));
    this.yn = ((int)(2.0F * f));
    this.yg = ((int)(16.0F * f));
    z.a(this, new c());
    if (z.G(this) == 0) {
      z.i(this, 1);
    }
    GMTrace.o(17112760320000L, 127500);
  }
  
  private void X(int paramInt)
  {
    GMTrace.i(17113028755456L, 127502);
    if (this.xq == paramInt)
    {
      GMTrace.o(17113028755456L, 127502);
      return;
    }
    this.xq = paramInt;
    if (this.yz != null)
    {
      int i;
      int j;
      if (paramInt != 0)
      {
        i = 1;
        int m = getChildCount();
        j = 0;
        label53:
        if (j >= m) {
          break label95;
        }
        if (i == 0) {
          break label89;
        }
      }
      label89:
      for (int k = 2;; k = 0)
      {
        z.a(getChildAt(j), k, null);
        j += 1;
        break label53;
        i = 0;
        break;
      }
    }
    label95:
    if (this.yw != null) {
      this.yw.W(paramInt);
    }
    GMTrace.o(17113028755456L, 127502);
  }
  
  private void Z(int paramInt)
  {
    GMTrace.i(17114907803648L, 127516);
    int i;
    Object localObject2;
    if (this.xN != paramInt) {
      if (this.xN < paramInt)
      {
        i = 66;
        localObject2 = uz(this.xN);
        this.xN = paramInt;
      }
    }
    for (int j = i;; j = 2)
    {
      if (this.xM == null)
      {
        bR();
        GMTrace.o(17114907803648L, 127516);
        return;
        i = 17;
        break;
      }
      if (this.yd)
      {
        bR();
        GMTrace.o(17114907803648L, 127516);
        return;
      }
      if (getWindowToken() == null)
      {
        GMTrace.o(17114907803648L, 127516);
        return;
      }
      paramInt = this.ye;
      int i3 = Math.max(0, this.xN - paramInt);
      int i1 = this.xM.getCount();
      int i2 = Math.min(i1 - 1, paramInt + this.xN);
      Object localObject1;
      if (i1 != this.xI) {
        try
        {
          String str = getResources().getResourceName(getId());
          throw new IllegalStateException("The application's PagerAdapter changed the adapter's contents without calling PagerAdapter#notifyDataSetChanged! Expected adapter item count: " + this.xI + ", found: " + i1 + " Pager id: " + str + " Pager class: " + getClass() + " Problematic adapter: " + this.xM.getClass());
        }
        catch (Resources.NotFoundException localNotFoundException)
        {
          for (;;)
          {
            localObject1 = Integer.toHexString(getId());
          }
        }
      }
      paramInt = 0;
      if (paramInt < this.dw.size())
      {
        localObject1 = (b)this.dw.get(paramInt);
        if (((b)localObject1).position >= this.xN) {
          if (((b)localObject1).position != this.xN) {
            break label1301;
          }
        }
      }
      for (;;)
      {
        if ((localObject1 == null) && (i1 > 0)) {}
        for (Object localObject3 = cY(this.xN, paramInt);; localObject3 = localObject1)
        {
          label370:
          int i4;
          float f2;
          label383:
          float f3;
          int k;
          label405:
          float f1;
          if (localObject3 != null)
          {
            int n = paramInt - 1;
            int m;
            Object localObject4;
            if (n >= 0)
            {
              localObject1 = (b)this.dw.get(n);
              i4 = bP();
              if (i4 > 0) {
                break label567;
              }
              f2 = 0.0F;
              i = this.xN;
              f3 = 0.0F;
              m = i - 1;
              k = paramInt;
              localObject4 = localObject1;
              if (m < 0) {
                break label717;
              }
              if ((f3 < f2) || (m >= i3)) {
                break label597;
              }
              if (localObject4 == null) {
                break label717;
              }
              localObject1 = localObject4;
              paramInt = n;
              f1 = f3;
              i = k;
              if (m == ((b)localObject4).position)
              {
                localObject1 = localObject4;
                paramInt = n;
                f1 = f3;
                i = k;
                if (!((b)localObject4).yG)
                {
                  this.dw.remove(n);
                  this.xM.a(this, m, ((b)localObject4).yF);
                  paramInt = n - 1;
                  i = k - 1;
                  if (paramInt < 0) {
                    break label588;
                  }
                  localObject1 = (b)this.dw.get(paramInt);
                  f1 = f3;
                }
              }
            }
            for (;;)
            {
              m -= 1;
              localObject4 = localObject1;
              n = paramInt;
              f3 = f1;
              k = i;
              break label405;
              paramInt += 1;
              break;
              localObject1 = null;
              break label370;
              label567:
              f2 = 2.0F - ((b)localObject3).yH + getPaddingLeft() / i4;
              break label383;
              label588:
              localObject1 = null;
              f1 = f3;
              continue;
              label597:
              if ((localObject4 != null) && (m == ((b)localObject4).position))
              {
                f1 = f3 + ((b)localObject4).yH;
                paramInt = n - 1;
                if (paramInt >= 0)
                {
                  localObject1 = (b)this.dw.get(paramInt);
                  i = k;
                }
                else
                {
                  localObject1 = null;
                  i = k;
                }
              }
              else
              {
                f1 = f3 + cY(m, n + 1).yH;
                i = k + 1;
                if (n >= 0)
                {
                  localObject1 = (b)this.dw.get(n);
                  paramInt = n;
                }
                else
                {
                  localObject1 = null;
                  paramInt = n;
                }
              }
            }
            label717:
            f1 = ((b)localObject3).yH;
            paramInt = k + 1;
            if (f1 < 2.0F) {
              if (paramInt < this.dw.size())
              {
                localObject1 = (b)this.dw.get(paramInt);
                if (i4 > 0) {
                  break label883;
                }
                f2 = 0.0F;
                label765:
                i = this.xN;
                i += 1;
                label777:
                if (i >= i1) {
                  break label1026;
                }
                if ((f1 < f2) || (i <= i2)) {
                  break label904;
                }
                if (localObject1 == null) {
                  break label1026;
                }
                if ((i != ((b)localObject1).position) || (((b)localObject1).yG)) {
                  break label1291;
                }
                this.dw.remove(paramInt);
                this.xM.a(this, i, ((b)localObject1).yF);
                if (paramInt >= this.dw.size()) {
                  break label898;
                }
                localObject1 = (b)this.dw.get(paramInt);
              }
            }
          }
          label883:
          label898:
          label904:
          label1026:
          label1291:
          for (;;)
          {
            i += 1;
            break label777;
            localObject1 = null;
            break;
            f2 = getPaddingRight() / i4 + 2.0F;
            break label765;
            localObject1 = null;
            continue;
            if ((localObject1 != null) && (i == ((b)localObject1).position))
            {
              f3 = ((b)localObject1).yH;
              paramInt += 1;
              if (paramInt < this.dw.size()) {}
              for (localObject1 = (b)this.dw.get(paramInt);; localObject1 = null)
              {
                f1 += f3;
                break;
              }
            }
            localObject1 = cY(i, paramInt);
            paramInt += 1;
            f3 = ((b)localObject1).yH;
            if (paramInt < this.dw.size()) {}
            for (localObject1 = (b)this.dw.get(paramInt);; localObject1 = null)
            {
              f1 += f3;
              break;
            }
            a((b)localObject3, k, (b)localObject2);
            localObject2 = this.xM;
            if (localObject3 != null) {}
            for (localObject1 = ((b)localObject3).yF;; localObject1 = null)
            {
              ((u)localObject2).d(localObject1);
              this.xM.ba();
              i = getChildCount();
              paramInt = 0;
              while (paramInt < i)
              {
                localObject2 = getChildAt(paramInt);
                localObject1 = (LayoutParams)((View)localObject2).getLayoutParams();
                ((LayoutParams)localObject1).yL = paramInt;
                if ((!((LayoutParams)localObject1).yJ) && (((LayoutParams)localObject1).yH == 0.0F))
                {
                  localObject2 = ct((View)localObject2);
                  if (localObject2 != null)
                  {
                    ((LayoutParams)localObject1).yH = ((b)localObject2).yH;
                    ((LayoutParams)localObject1).position = ((b)localObject2).position;
                  }
                }
                paramInt += 1;
              }
            }
            bR();
            if (hasFocus())
            {
              localObject1 = findFocus();
              if (localObject1 != null) {}
              for (localObject1 = cu((View)localObject1); (localObject1 == null) || (((b)localObject1).position != this.xN); localObject1 = null)
              {
                paramInt = 0;
                while (paramInt < getChildCount())
                {
                  localObject1 = getChildAt(paramInt);
                  localObject2 = ct((View)localObject1);
                  if ((localObject2 != null) && (((b)localObject2).position == this.xN) && (((View)localObject1).requestFocus(j))) {
                    break;
                  }
                  paramInt += 1;
                }
              }
            }
            GMTrace.o(17114907803648L, 127516);
            return;
          }
        }
        label1301:
        localObject1 = null;
      }
      localObject2 = null;
    }
  }
  
  private Rect a(Rect paramRect, View paramView)
  {
    GMTrace.i(17119336988672L, 127549);
    if (paramRect == null) {
      paramRect = new Rect();
    }
    for (;;)
    {
      if (paramView == null)
      {
        paramRect.set(0, 0, 0, 0);
        GMTrace.o(17119336988672L, 127549);
        return paramRect;
      }
      paramRect.left = paramView.getLeft();
      paramRect.right = paramView.getRight();
      paramRect.top = paramView.getTop();
      paramRect.bottom = paramView.getBottom();
      for (paramView = paramView.getParent(); ((paramView instanceof ViewGroup)) && (paramView != this); paramView = paramView.getParent())
      {
        paramView = (ViewGroup)paramView;
        paramRect.left += paramView.getLeft();
        paramRect.right += paramView.getRight();
        paramRect.top += paramView.getTop();
        paramRect.bottom += paramView.getBottom();
      }
      GMTrace.o(17119336988672L, 127549);
      return paramRect;
    }
  }
  
  private void a(int paramInt1, float paramFloat, int paramInt2)
  {
    GMTrace.i(17117055287296L, 127532);
    int i;
    int j;
    int i2;
    int n;
    View localView;
    int k;
    int m;
    label140:
    int i4;
    if (this.yu > 0)
    {
      int i1 = getScrollX();
      i = getPaddingLeft();
      j = getPaddingRight();
      i2 = getWidth();
      int i3 = getChildCount();
      n = 0;
      if (n < i3)
      {
        localView = getChildAt(n);
        LayoutParams localLayoutParams = (LayoutParams)localView.getLayoutParams();
        if (!localLayoutParams.yJ) {
          break label431;
        }
        switch (localLayoutParams.gravity & 0x7)
        {
        case 2: 
        case 4: 
        default: 
          k = i;
          m = j;
          j = i;
          i = m;
          i4 = k + i1 - localView.getLeft();
          k = i;
          m = j;
          if (i4 != 0)
          {
            localView.offsetLeftAndRight(i4);
            m = j;
            k = i;
          }
          break;
        }
      }
    }
    for (;;)
    {
      n += 1;
      i = m;
      j = k;
      break;
      k = localView.getWidth();
      m = k + i;
      k = i;
      i = j;
      j = m;
      break label140;
      k = Math.max((i2 - localView.getMeasuredWidth()) / 2, i);
      m = i;
      i = j;
      j = m;
      break label140;
      k = i2 - j - localView.getMeasuredWidth();
      i4 = localView.getMeasuredWidth();
      m = i;
      i = j + i4;
      j = m;
      break label140;
      if (this.yw != null) {
        this.yw.a(paramInt1, paramFloat, paramInt2);
      }
      if (this.yx != null) {
        this.yx.a(paramInt1, paramFloat, paramInt2);
      }
      if (this.yz != null)
      {
        paramInt2 = getScrollX();
        i = getChildCount();
        paramInt1 = 0;
        while (paramInt1 < i)
        {
          localView = getChildAt(paramInt1);
          if (!((LayoutParams)localView.getLayoutParams()).yJ)
          {
            paramFloat = (localView.getLeft() - paramInt2) / bP();
            this.yz.h(localView, paramFloat);
          }
          paramInt1 += 1;
        }
      }
      this.yt = true;
      GMTrace.o(17117055287296L, 127532);
      return;
      label431:
      k = j;
      m = i;
    }
  }
  
  private void a(int paramInt1, boolean paramBoolean1, int paramInt2, boolean paramBoolean2)
  {
    GMTrace.i(17113968279552L, 127509);
    b localb = uz(paramInt1);
    int i = 0;
    if (localb != null) {
      i = (int)(bP() * Math.max(this.xY, Math.min(localb.yI, this.xZ)));
    }
    if (paramBoolean1)
    {
      if (getChildCount() == 0) {
        setScrollingCacheEnabled(false);
      }
      int j;
      int k;
      int m;
      for (;;)
      {
        if ((paramBoolean2) && (this.yw != null)) {
          this.yw.V(paramInt1);
        }
        if ((!paramBoolean2) || (this.yx == null)) {
          break label405;
        }
        this.yx.V(paramInt1);
        GMTrace.o(17113968279552L, 127509);
        return;
        j = getScrollX();
        k = getScrollY();
        i -= j;
        m = 0 - k;
        if ((i != 0) || (m != 0)) {
          break;
        }
        r(false);
        populate();
        X(0);
      }
      setScrollingCacheEnabled(true);
      X(2);
      int n = bP();
      int i1 = n / 2;
      float f3 = Math.min(1.0F, 1.0F * Math.abs(i) / n);
      float f1 = i1;
      float f2 = i1;
      f3 = (float)Math.sin((float)((f3 - 0.5F) * 0.4712389167638204D));
      paramInt2 = Math.abs(paramInt2);
      if (paramInt2 > 0) {}
      for (paramInt2 = Math.round(1000.0F * Math.abs((f2 * f3 + f1) / paramInt2)) * 4;; paramInt2 = (int)((Math.abs(i) / (f1 * 1.0F + this.xU) + 3.0F) * 100.0F))
      {
        paramInt2 = Math.min(paramInt2, 600);
        this.xR.startScroll(j, k, i, m, paramInt2);
        z.F(this);
        break;
        f1 = n;
      }
    }
    if ((paramBoolean2) && (this.yw != null)) {
      this.yw.V(paramInt1);
    }
    if ((paramBoolean2) && (this.yx != null)) {
      this.yx.V(paramInt1);
    }
    r(false);
    scrollTo(i, 0);
    ab(i);
    label405:
    GMTrace.o(17113968279552L, 127509);
  }
  
  private void a(int paramInt, boolean paramBoolean1, boolean paramBoolean2)
  {
    GMTrace.i(17113699844096L, 127507);
    a(paramInt, paramBoolean1, paramBoolean2, 0);
    GMTrace.o(17113699844096L, 127507);
  }
  
  private void a(b paramb1, int paramInt, b paramb2)
  {
    GMTrace.i(17115176239104L, 127518);
    int k = this.xM.getCount();
    int i = bP();
    if (i > 0) {}
    float f1;
    float f3;
    int j;
    for (float f2 = this.xU / i;; f2 = 0.0F)
    {
      if (paramb2 == null) {
        break label382;
      }
      i = paramb2.position;
      if (i >= paramb1.position) {
        break;
      }
      f1 = paramb2.yI;
      f3 = paramb2.yH;
      j = 0;
      f1 = f1 + f3 + f2;
      i += 1;
      if ((i > paramb1.position) || (j >= this.dw.size())) {
        break label382;
      }
      for (paramb2 = (b)this.dw.get(j); (i > paramb2.position) && (j < this.dw.size() - 1); paramb2 = (b)this.dw.get(j)) {
        j += 1;
      }
    }
    for (;;)
    {
      if (i < paramb2.position)
      {
        i += 1;
        f1 = 1.0F + f2 + f1;
      }
      else
      {
        paramb2.yI = f1;
        f1 += paramb2.yH + f2;
        i += 1;
        break;
        if (i > paramb1.position)
        {
          j = this.dw.size();
          f1 = paramb2.yI;
          j -= 1;
          i -= 1;
          if ((i >= paramb1.position) && (j >= 0)) {
            for (paramb2 = (b)this.dw.get(j); (i < paramb2.position) && (j > 0); paramb2 = (b)this.dw.get(j)) {
              j -= 1;
            }
          }
        }
        for (;;)
        {
          if (i > paramb2.position)
          {
            i -= 1;
            f1 -= 1.0F + f2;
          }
          else
          {
            f1 -= paramb2.yH + f2;
            paramb2.yI = f1;
            i -= 1;
            break;
            label382:
            int m = this.dw.size();
            f3 = paramb1.yI;
            i = paramb1.position - 1;
            if (paramb1.position == 0)
            {
              f1 = paramb1.yI;
              this.xY = f1;
              if (paramb1.position != k - 1) {
                break label515;
              }
              f1 = paramb1.yI + paramb1.yH - 1.0F;
              label448:
              this.xZ = f1;
              j = paramInt - 1;
              f1 = f3;
            }
            for (;;)
            {
              if (j < 0) {
                break label568;
              }
              paramb2 = (b)this.dw.get(j);
              for (;;)
              {
                if (i > paramb2.position)
                {
                  i -= 1;
                  f1 -= 1.0F + f2;
                  continue;
                  f1 = -3.4028235E38F;
                  break;
                  label515:
                  f1 = Float.MAX_VALUE;
                  break label448;
                }
              }
              f1 -= paramb2.yH + f2;
              paramb2.yI = f1;
              if (paramb2.position == 0) {
                this.xY = f1;
              }
              i -= 1;
              j -= 1;
            }
            label568:
            f1 = paramb1.yI + paramb1.yH + f2;
            j = paramb1.position + 1;
            i = paramInt + 1;
            paramInt = j;
            while (i < m)
            {
              paramb1 = (b)this.dw.get(i);
              while (paramInt < paramb1.position)
              {
                paramInt += 1;
                f1 += 1.0F + f2;
              }
              if (paramb1.position == k - 1) {
                this.xZ = (paramb1.yH + f1 - 1.0F);
              }
              paramb1.yI = f1;
              f1 += paramb1.yH + f2;
              paramInt += 1;
              i += 1;
            }
            this.ys = false;
            GMTrace.o(17115176239104L, 127518);
            return;
          }
        }
      }
    }
  }
  
  private boolean a(View paramView, boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3)
  {
    GMTrace.i(17118934335488L, 127546);
    if ((paramView instanceof ViewGroup))
    {
      ViewGroup localViewGroup = (ViewGroup)paramView;
      int j = paramView.getScrollX();
      int k = paramView.getScrollY();
      int i = localViewGroup.getChildCount() - 1;
      while (i >= 0)
      {
        View localView = localViewGroup.getChildAt(i);
        if ((paramInt2 + j >= localView.getLeft()) && (paramInt2 + j < localView.getRight()) && (paramInt3 + k >= localView.getTop()) && (paramInt3 + k < localView.getBottom()) && (a(localView, true, paramInt1, paramInt2 + j - localView.getLeft(), paramInt3 + k - localView.getTop())))
        {
          GMTrace.o(17118934335488L, 127546);
          return true;
        }
        i -= 1;
      }
    }
    if ((paramBoolean) && (z.g(paramView, -paramInt1)))
    {
      GMTrace.o(17118934335488L, 127546);
      return true;
    }
    GMTrace.o(17118934335488L, 127546);
    return false;
  }
  
  private boolean arrowScroll(int paramInt)
  {
    GMTrace.i(17119202770944L, 127548);
    View localView = findFocus();
    Object localObject;
    int j;
    boolean bool;
    if (localView == this)
    {
      localObject = null;
      localView = FocusFinder.getInstance().findNextFocus(this, (View)localObject, paramInt);
      if ((localView == null) || (localView == localObject)) {
        break label326;
      }
      if (paramInt != 17) {
        break label272;
      }
      i = a(this.dF, localView).left;
      j = a(this.dF, (View)localObject).left;
      if ((localObject != null) && (i >= j))
      {
        bool = bV();
        label98:
        if (bool) {
          playSoundEffect(SoundEffectConstants.getContantForFocusDirection(paramInt));
        }
        GMTrace.o(17119202770944L, 127548);
        return bool;
      }
    }
    else
    {
      if (localView == null) {
        break label372;
      }
      localObject = localView.getParent();
      if (!(localObject instanceof ViewGroup)) {
        break label379;
      }
      if (localObject != this) {}
    }
    label272:
    label326:
    label366:
    label372:
    label379:
    for (int i = 1;; i = 0)
    {
      if (i == 0)
      {
        StringBuilder localStringBuilder = new StringBuilder();
        localStringBuilder.append(localView.getClass().getSimpleName());
        localObject = localView.getParent();
        for (;;)
        {
          if ((localObject instanceof ViewGroup))
          {
            localStringBuilder.append(" => ").append(localObject.getClass().getSimpleName());
            localObject = ((ViewParent)localObject).getParent();
            continue;
            localObject = ((ViewParent)localObject).getParent();
            break;
          }
        }
        new StringBuilder("arrowScroll tried to find focus based on non-child current focused view ").append(localStringBuilder.toString());
        localObject = null;
        break;
        bool = localView.requestFocus();
        break label98;
        if (paramInt == 66)
        {
          i = a(this.dF, localView).left;
          j = a(this.dF, (View)localObject).left;
          if ((localObject == null) || (i > j))
          {
            bool = localView.requestFocus();
            break label98;
            if ((paramInt == 17) || (paramInt == 1))
            {
              bool = bV();
              break label98;
            }
            if ((paramInt != 66) && (paramInt != 2)) {
              break label366;
            }
          }
          bool = bW();
          break label98;
        }
        bool = false;
        break label98;
      }
      localObject = localView;
      break;
    }
  }
  
  private void bR()
  {
    GMTrace.i(17115042021376L, 127517);
    if (this.yA != 0)
    {
      if (this.yB == null) {
        this.yB = new ArrayList();
      }
      for (;;)
      {
        int j = getChildCount();
        int i = 0;
        while (i < j)
        {
          View localView = getChildAt(i);
          this.yB.add(localView);
          i += 1;
        }
        this.yB.clear();
      }
      Collections.sort(this.yB, qsS);
    }
    GMTrace.o(17115042021376L, 127517);
  }
  
  private boolean bV()
  {
    GMTrace.i(17119471206400L, 127550);
    if (this.xN > 0)
    {
      c(this.xN - 1, true);
      GMTrace.o(17119471206400L, 127550);
      return true;
    }
    GMTrace.o(17119471206400L, 127550);
    return false;
  }
  
  private boolean bW()
  {
    GMTrace.i(17119605424128L, 127551);
    if ((this.xM != null) && (this.xN < this.xM.getCount() - 1))
    {
      c(this.xN + 1, true);
      GMTrace.o(17119605424128L, 127551);
      return true;
    }
    GMTrace.o(17119605424128L, 127551);
    return false;
  }
  
  private b cY(int paramInt1, int paramInt2)
  {
    GMTrace.i(17114505150464L, 127513);
    b localb = new b();
    localb.position = paramInt1;
    localb.yF = this.xM.b(this, paramInt1);
    localb.yH = 1.0F;
    if ((paramInt2 < 0) || (paramInt2 >= this.dw.size())) {
      this.dw.add(localb);
    }
    for (;;)
    {
      GMTrace.o(17114505150464L, 127513);
      return localb;
      this.dw.add(paramInt2, localb);
    }
  }
  
  private b ct(View paramView)
  {
    GMTrace.i(17115847327744L, 127523);
    int i = 0;
    while (i < this.dw.size())
    {
      b localb = (b)this.dw.get(i);
      if (this.xM.a(paramView, localb.yF))
      {
        GMTrace.o(17115847327744L, 127523);
        return localb;
      }
      i += 1;
    }
    GMTrace.o(17115847327744L, 127523);
    return null;
  }
  
  private b cu(View paramView)
  {
    GMTrace.i(17115981545472L, 127524);
    for (;;)
    {
      ViewParent localViewParent = paramView.getParent();
      if (localViewParent == this) {
        break;
      }
      if ((localViewParent == null) || (!(localViewParent instanceof View)))
      {
        GMTrace.o(17115981545472L, 127524);
        return null;
      }
      paramView = (View)localViewParent;
    }
    paramView = ct(paramView);
    GMTrace.o(17115981545472L, 127524);
    return paramView;
  }
  
  private void h(MotionEvent paramMotionEvent)
  {
    GMTrace.i(17118397464576L, 127542);
    int i = o.e(paramMotionEvent);
    if (o.c(paramMotionEvent, i) == this.eA) {
      if (i != 0) {
        break label74;
      }
    }
    label74:
    for (i = 1;; i = 0)
    {
      this.yi = o.d(paramMotionEvent, i);
      this.eA = o.c(paramMotionEvent, i);
      if (this.ez != null) {
        this.ez.clear();
      }
      GMTrace.o(17118397464576L, 127542);
      return;
    }
  }
  
  private boolean o(float paramFloat)
  {
    int j = 1;
    boolean bool2 = false;
    boolean bool1 = false;
    GMTrace.i(17117592158208L, 127536);
    float f1 = this.yi;
    this.yi = paramFloat;
    float f2 = getScrollX() + (f1 - paramFloat);
    int k = bP();
    paramFloat = k * this.xY;
    f1 = k;
    float f3 = this.xZ;
    b localb1 = (b)this.dw.get(0);
    b localb2 = (b)this.dw.get(this.dw.size() - 1);
    if (localb1.position != 0) {
      paramFloat = localb1.yI * k;
    }
    for (int i = 0;; i = 1)
    {
      if (localb2.position != this.xM.getCount() - 1)
      {
        f1 = localb2.yI * k;
        j = 0;
      }
      for (;;)
      {
        if (f2 < paramFloat)
        {
          f1 = paramFloat;
          if (i != 0)
          {
            bool1 = this.yp.u(Math.abs(paramFloat - f2) / k);
            f1 = paramFloat;
          }
        }
        for (;;)
        {
          this.yi += f1 - (int)f1;
          scrollTo((int)f1, getScrollY());
          ab((int)f1);
          GMTrace.o(17117592158208L, 127536);
          return bool1;
          if (f2 > f1)
          {
            bool1 = bool2;
            if (j != 0) {
              bool1 = this.yq.u(Math.abs(f2 - f1) / k);
            }
          }
          else
          {
            f1 = f2;
          }
        }
        f1 *= f3;
      }
    }
  }
  
  private void r(boolean paramBoolean)
  {
    GMTrace.i(17117189505024L, 127533);
    if (this.xq == 2) {}
    int j;
    for (int i = 1;; i = 0)
    {
      if (i != 0)
      {
        setScrollingCacheEnabled(false);
        this.xR.abortAnimation();
        j = getScrollX();
        k = getScrollY();
        int m = this.xR.getCurrX();
        int n = this.xR.getCurrY();
        if ((j != m) || (k != n)) {
          scrollTo(m, n);
        }
      }
      this.yd = false;
      int k = 0;
      j = i;
      i = k;
      while (i < this.dw.size())
      {
        b localb = (b)this.dw.get(i);
        if (localb.yG)
        {
          localb.yG = false;
          j = 1;
        }
        i += 1;
      }
    }
    if (j != 0)
    {
      if (paramBoolean)
      {
        z.a(this, this.yD);
        GMTrace.o(17117189505024L, 127533);
        return;
      }
      this.yD.run();
    }
    GMTrace.o(17117189505024L, 127533);
  }
  
  private void setScrollingCacheEnabled(boolean paramBoolean)
  {
    GMTrace.i(17118665900032L, 127544);
    if (this.yc != paramBoolean) {
      this.yc = paramBoolean;
    }
    GMTrace.o(17118665900032L, 127544);
  }
  
  private b uz(int paramInt)
  {
    GMTrace.i(17116115763200L, 127525);
    int i = 0;
    while (i < this.dw.size())
    {
      b localb = (b)this.dw.get(i);
      if (localb.position == paramInt)
      {
        GMTrace.o(17116115763200L, 127525);
        return localb;
      }
      i += 1;
    }
    GMTrace.o(17116115763200L, 127525);
    return null;
  }
  
  public final void Y(int paramInt)
  {
    GMTrace.i(17113431408640L, 127505);
    this.yd = false;
    if (!this.yr) {}
    for (boolean bool = true;; bool = false)
    {
      a(paramInt, bool, false);
      GMTrace.o(17113431408640L, 127505);
      return;
    }
  }
  
  final int a(int paramInt1, float paramFloat, int paramInt2, int paramInt3)
  {
    GMTrace.i(17117860593664L, 127538);
    if ((Math.abs(paramInt3) > this.ym) && (Math.abs(paramInt2) > this.yk))
    {
      if (paramInt2 > 0) {}
      for (;;)
      {
        paramInt2 = paramInt1;
        if (this.dw.size() > 0) {
          paramInt2 = Math.max(((b)this.dw.get(0)).position, Math.min(paramInt1, ((b)this.dw.get(this.dw.size() - 1)).position));
        }
        GMTrace.o(17117860593664L, 127538);
        return paramInt2;
        paramInt1 += 1;
      }
    }
    if (paramInt1 >= this.xN) {}
    for (float f = 0.85F;; f = 0.15F)
    {
      paramInt1 = (int)(f + (paramInt1 + paramFloat));
      break;
    }
  }
  
  final void a(int paramInt1, boolean paramBoolean1, boolean paramBoolean2, int paramInt2)
  {
    boolean bool = false;
    GMTrace.i(17113834061824L, 127508);
    if ((this.xM == null) || (this.xM.getCount() <= 0))
    {
      setScrollingCacheEnabled(false);
      GMTrace.o(17113834061824L, 127508);
      return;
    }
    if ((!paramBoolean2) && (this.xN == paramInt1) && (this.dw.size() != 0))
    {
      setScrollingCacheEnabled(false);
      GMTrace.o(17113834061824L, 127508);
      return;
    }
    int i;
    if (paramInt1 < 0) {
      i = 0;
    }
    for (;;)
    {
      paramInt1 = this.ye;
      if ((i <= this.xN + paramInt1) && (i >= this.xN - paramInt1)) {
        break;
      }
      paramInt1 = 0;
      while (paramInt1 < this.dw.size())
      {
        ((b)this.dw.get(paramInt1)).yG = true;
        paramInt1 += 1;
      }
      i = paramInt1;
      if (paramInt1 >= this.xM.getCount()) {
        i = this.xM.getCount() - 1;
      }
    }
    paramBoolean2 = bool;
    if (this.xN != i) {
      paramBoolean2 = true;
    }
    if (this.yr)
    {
      this.xN = i;
      if ((paramBoolean2) && (this.yw != null)) {
        this.yw.V(i);
      }
      if ((paramBoolean2) && (this.yx != null)) {
        this.yx.V(i);
      }
      requestLayout();
      GMTrace.o(17113834061824L, 127508);
      return;
    }
    Z(i);
    a(i, paramBoolean1, paramInt2, paramBoolean2);
    GMTrace.o(17113834061824L, 127508);
  }
  
  public final void a(u paramu)
  {
    GMTrace.i(17113162973184L, 127503);
    if (this.xM != null)
    {
      this.xM.unregisterDataSetObserver(this.qsP);
      int i = 0;
      while (i < this.dw.size())
      {
        b localb = (b)this.dw.get(i);
        this.xM.a(this, localb.position, localb.yF);
        i += 1;
      }
      this.xM.ba();
      this.dw.clear();
      int j;
      for (i = 0; i < getChildCount(); i = j + 1)
      {
        j = i;
        if (!((LayoutParams)getChildAt(i).getLayoutParams()).yJ)
        {
          removeViewAt(i);
          j = i - 1;
        }
      }
      this.xN = 0;
      scrollTo(0, 0);
    }
    this.xM = paramu;
    this.xI = 0;
    if (this.xM != null)
    {
      if (this.qsP == null) {
        this.qsP = new d((byte)0);
      }
      this.xM.registerDataSetObserver(this.qsP);
      this.yd = false;
      boolean bool = this.yr;
      this.yr = true;
      this.xI = this.xM.getCount();
      if (this.xO >= 0)
      {
        this.xM.a(this.xP, this.xQ);
        a(this.xO, false, true);
        this.xO = -1;
        this.xP = null;
        this.xQ = null;
        GMTrace.o(17113162973184L, 127503);
        return;
      }
      if (!bool)
      {
        populate();
        GMTrace.o(17113162973184L, 127503);
        return;
      }
      requestLayout();
    }
    GMTrace.o(17113162973184L, 127503);
  }
  
  final boolean ab(int paramInt)
  {
    GMTrace.i(17116921069568L, 127531);
    if (this.dw.size() == 0)
    {
      this.yt = false;
      a(0, 0.0F, 0);
      if (!this.yt) {
        throw new IllegalStateException("onPageScrolled did not call superclass implementation");
      }
      GMTrace.o(17116921069568L, 127531);
      return false;
    }
    b localb = bjp();
    int j = bP();
    int k = this.xU;
    float f = this.xU / j;
    int i = localb.position;
    f = (paramInt / j - localb.yI) / (localb.yH + f);
    paramInt = (int)((k + j) * f);
    this.yt = false;
    a(i, f, paramInt);
    if (!this.yt) {
      throw new IllegalStateException("onPageScrolled did not call superclass implementation");
    }
    GMTrace.o(17116921069568L, 127531);
    return true;
  }
  
  public void addFocusables(ArrayList<View> paramArrayList, int paramInt1, int paramInt2)
  {
    GMTrace.i(17119739641856L, 127552);
    Assert.assertNotNull(paramArrayList);
    int j = paramArrayList.size();
    int k = getDescendantFocusability();
    if (k != 393216)
    {
      int i = 0;
      while (i < getChildCount())
      {
        View localView = getChildAt(i);
        if (localView.getVisibility() == 0)
        {
          b localb = ct(localView);
          if ((localb != null) && (localb.position == this.xN)) {
            localView.addFocusables(paramArrayList, paramInt1, paramInt2);
          }
        }
        i += 1;
      }
    }
    if ((k != 262144) || (j == paramArrayList.size()))
    {
      if (!isFocusable())
      {
        GMTrace.o(17119739641856L, 127552);
        return;
      }
      if (((paramInt2 & 0x1) == 1) && (isInTouchMode()) && (!isFocusableInTouchMode()))
      {
        GMTrace.o(17119739641856L, 127552);
        return;
      }
      if (paramArrayList != null) {
        paramArrayList.add(this);
      }
    }
    GMTrace.o(17119739641856L, 127552);
  }
  
  public void addTouchables(ArrayList<View> paramArrayList)
  {
    GMTrace.i(17119873859584L, 127553);
    int i = 0;
    while (i < getChildCount())
    {
      View localView = getChildAt(i);
      if (localView.getVisibility() == 0)
      {
        b localb = ct(localView);
        if ((localb != null) && (localb.position == this.xN)) {
          localView.addTouchables(paramArrayList);
        }
      }
      i += 1;
    }
    GMTrace.o(17119873859584L, 127553);
  }
  
  public void addView(View paramView, int paramInt, ViewGroup.LayoutParams paramLayoutParams)
  {
    GMTrace.i(17115578892288L, 127521);
    if (!checkLayoutParams(paramLayoutParams)) {
      paramLayoutParams = generateLayoutParams(paramLayoutParams);
    }
    for (;;)
    {
      Assert.assertNotNull(paramLayoutParams);
      LayoutParams localLayoutParams = (LayoutParams)paramLayoutParams;
      localLayoutParams.yJ |= paramView instanceof a;
      if (this.oy)
      {
        if ((localLayoutParams != null) && (localLayoutParams.yJ)) {
          throw new IllegalStateException("Cannot add pager decor view during layout");
        }
        localLayoutParams.yK = true;
        addViewInLayout(paramView, paramInt, paramLayoutParams);
        GMTrace.o(17115578892288L, 127521);
        return;
      }
      super.addView(paramView, paramInt, paramLayoutParams);
      GMTrace.o(17115578892288L, 127521);
      return;
    }
  }
  
  final int bP()
  {
    GMTrace.i(17113297190912L, 127504);
    int i = getMeasuredWidth();
    int j = getPaddingLeft();
    int k = getPaddingRight();
    GMTrace.o(17113297190912L, 127504);
    return i - j - k;
  }
  
  final void bQ()
  {
    GMTrace.i(17114639368192L, 127514);
    int i2 = this.xM.getCount();
    this.xI = i2;
    int i;
    int j;
    int k;
    int n;
    int m;
    label76:
    Object localObject;
    if ((this.dw.size() < this.ye * 2 + 1) && (this.dw.size() < i2))
    {
      i = 1;
      j = this.xN;
      k = 0;
      n = 0;
      m = i;
      i = j;
      j = k;
      k = n;
      if (k >= this.dw.size()) {
        break label279;
      }
      localObject = (b)this.dw.get(k);
      n = this.xM.j(((b)localObject).yF);
      if (n == -1) {
        break label372;
      }
      if (n != -2) {
        break label227;
      }
      this.dw.remove(k);
      m = k - 1;
      k = j;
      if (j == 0) {
        k = 1;
      }
      this.xM.a(this, ((b)localObject).position, ((b)localObject).yF);
      if (this.xN != ((b)localObject).position) {
        break label393;
      }
      j = Math.max(0, Math.min(this.xN, i2 - 1));
      i = k;
      k = 1;
    }
    for (;;)
    {
      n = k;
      int i1 = j;
      k = m + 1;
      j = i;
      i = i1;
      m = n;
      break label76;
      i = 0;
      break;
      label227:
      if (((b)localObject).position != n)
      {
        if (((b)localObject).position == this.xN) {
          i = n;
        }
        ((b)localObject).position = n;
        n = i;
        i1 = 1;
        m = k;
        i = j;
        j = n;
        k = i1;
        continue;
        label279:
        if (j != 0) {
          this.xM.ba();
        }
        Collections.sort(this.dw, xJ);
        if (m != 0)
        {
          k = getChildCount();
          j = 0;
          while (j < k)
          {
            localObject = (LayoutParams)getChildAt(j).getLayoutParams();
            if (!((LayoutParams)localObject).yJ) {
              ((LayoutParams)localObject).yH = 0.0F;
            }
            j += 1;
          }
          a(i, false, true);
          requestLayout();
        }
        GMTrace.o(17114639368192L, 127514);
      }
      else
      {
        label372:
        n = i;
        i1 = m;
        m = k;
        i = j;
        j = n;
        k = i1;
        continue;
        label393:
        j = i;
        n = 1;
        i = k;
        k = n;
      }
    }
  }
  
  final b bjp()
  {
    GMTrace.i(17117726375936L, 127537);
    int i = bP();
    float f1;
    float f2;
    label45:
    int k;
    float f3;
    float f4;
    int j;
    Object localObject;
    label62:
    b localb;
    if (i > 0)
    {
      f1 = getScrollX() / i;
      if (i <= 0) {
        break label209;
      }
      f2 = this.xU / i;
      k = -1;
      f3 = 0.0F;
      f4 = 0.0F;
      j = 1;
      localObject = null;
      i = 0;
      if (i >= this.dw.size()) {
        break label256;
      }
      localb = (b)this.dw.get(i);
      if ((j != 0) || (localb.position == k + 1)) {
        break label268;
      }
      localb = this.qsO;
      localb.yI = (f4 + f3 + f2);
      localb.position = (k + 1);
      localb.yH = 1.0F;
      i -= 1;
    }
    label209:
    label226:
    label256:
    label268:
    for (;;)
    {
      f3 = localb.yI;
      f4 = localb.yH;
      if ((j != 0) || (f1 >= f3))
      {
        if ((f1 >= f4 + f3 + f2) && (i != this.dw.size() - 1)) {
          break label226;
        }
        GMTrace.o(17117726375936L, 127537);
        return localb;
        f1 = 0.0F;
        break;
        f2 = 0.0F;
        break label45;
      }
      GMTrace.o(17117726375936L, 127537);
      return (b)localObject;
      k = localb.position;
      f4 = localb.yH;
      j = 0;
      i += 1;
      localObject = localb;
      break label62;
      GMTrace.o(17117726375936L, 127537);
      return (b)localObject;
    }
  }
  
  public final boolean bjq()
  {
    GMTrace.i(17118263246848L, 127541);
    if (this.hP)
    {
      GMTrace.o(17118263246848L, 127541);
      return false;
    }
    this.yo = true;
    X(1);
    this.yi = 0.0F;
    this.wX = 0.0F;
    if (this.ez == null) {
      this.ez = VelocityTracker.obtain();
    }
    for (;;)
    {
      long l = SystemClock.uptimeMillis();
      MotionEvent localMotionEvent = MotionEvent.obtain(l, l, 0, 0.0F, 0.0F, 0);
      this.ez.addMovement(localMotionEvent);
      localMotionEvent.recycle();
      this.qsQ = l;
      GMTrace.o(17118263246848L, 127541);
      return true;
      this.ez.clear();
    }
  }
  
  public final void c(int paramInt, boolean paramBoolean)
  {
    GMTrace.i(17113565626368L, 127506);
    this.yd = false;
    a(paramInt, paramBoolean, false);
    GMTrace.o(17113565626368L, 127506);
  }
  
  public boolean canScrollHorizontally(int paramInt)
  {
    GMTrace.i(17118800117760L, 127545);
    if (this.xM == null)
    {
      GMTrace.o(17118800117760L, 127545);
      return false;
    }
    int i = bP();
    int j = getScrollX();
    if (paramInt < 0)
    {
      if (j > (int)(i * this.xY))
      {
        GMTrace.o(17118800117760L, 127545);
        return true;
      }
      GMTrace.o(17118800117760L, 127545);
      return false;
    }
    if (paramInt > 0)
    {
      if (j < (int)(i * this.xZ))
      {
        GMTrace.o(17118800117760L, 127545);
        return true;
      }
      GMTrace.o(17118800117760L, 127545);
      return false;
    }
    GMTrace.o(17118800117760L, 127545);
    return false;
  }
  
  protected boolean checkLayoutParams(ViewGroup.LayoutParams paramLayoutParams)
  {
    GMTrace.i(17120544948224L, 127558);
    if (((paramLayoutParams instanceof LayoutParams)) && (super.checkLayoutParams(paramLayoutParams)))
    {
      GMTrace.o(17120544948224L, 127558);
      return true;
    }
    GMTrace.o(17120544948224L, 127558);
    return false;
  }
  
  public void computeScroll()
  {
    GMTrace.i(17116786851840L, 127530);
    if ((!this.xR.isFinished()) && (this.xR.computeScrollOffset()))
    {
      int i = getScrollX();
      int j = getScrollY();
      int k = this.xR.getCurrX();
      int m = this.xR.getCurrY();
      if ((i != k) || (j != m))
      {
        scrollTo(k, m);
        if (!ab(k))
        {
          this.xR.abortAnimation();
          scrollTo(0, m);
        }
      }
      z.F(this);
      GMTrace.o(17116786851840L, 127530);
      return;
    }
    r(true);
    GMTrace.o(17116786851840L, 127530);
  }
  
  final void cz()
  {
    GMTrace.i(17118531682304L, 127543);
    this.hP = false;
    this.yf = false;
    if (this.ez != null)
    {
      this.ez.recycle();
      this.ez = null;
    }
    GMTrace.o(17118531682304L, 127543);
  }
  
  public boolean dispatchKeyEvent(KeyEvent paramKeyEvent)
  {
    GMTrace.i(17119068553216L, 127547);
    boolean bool;
    if (!super.dispatchKeyEvent(paramKeyEvent))
    {
      if (paramKeyEvent.getAction() == 0) {}
      switch (paramKeyEvent.getKeyCode())
      {
      default: 
        bool = false;
      }
    }
    for (;;)
    {
      if (!bool) {
        break label142;
      }
      GMTrace.o(17119068553216L, 127547);
      return true;
      bool = arrowScroll(17);
      continue;
      bool = arrowScroll(66);
      continue;
      if (Build.VERSION.SDK_INT < 11) {
        break;
      }
      if (g.a(paramKeyEvent))
      {
        bool = arrowScroll(2);
      }
      else
      {
        if (!g.a(paramKeyEvent, 1)) {
          break;
        }
        bool = arrowScroll(1);
      }
    }
    label142:
    GMTrace.o(17119068553216L, 127547);
    return false;
  }
  
  public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent paramAccessibilityEvent)
  {
    GMTrace.i(17120142295040L, 127555);
    if (paramAccessibilityEvent.getEventType() == 4096)
    {
      boolean bool = super.dispatchPopulateAccessibilityEvent(paramAccessibilityEvent);
      GMTrace.o(17120142295040L, 127555);
      return bool;
    }
    int j = getChildCount();
    int i = 0;
    while (i < j)
    {
      View localView = getChildAt(i);
      if (localView.getVisibility() == 0)
      {
        b localb = ct(localView);
        if ((localb != null) && (localb.position == this.xN) && (localView.dispatchPopulateAccessibilityEvent(paramAccessibilityEvent)))
        {
          GMTrace.o(17120142295040L, 127555);
          return true;
        }
      }
      i += 1;
    }
    GMTrace.o(17120142295040L, 127555);
    return false;
  }
  
  public void draw(Canvas paramCanvas)
  {
    GMTrace.i(17117994811392L, 127539);
    super.draw(paramCanvas);
    int k = 0;
    int i = 0;
    int m = z.C(this);
    boolean bool;
    if ((m == 0) || ((m == 1) && (this.xM != null) && (this.xM.getCount() > 1)))
    {
      int j;
      if (!this.yp.isFinished())
      {
        k = paramCanvas.save();
        i = getHeight() - getPaddingTop() - getPaddingBottom();
        m = getWidth();
        paramCanvas.rotate(270.0F);
        paramCanvas.translate(-i + getPaddingTop(), this.xY * m);
        this.yp.setSize(i, m);
        j = this.yp.draw(paramCanvas) | false;
        paramCanvas.restoreToCount(k);
      }
      k = j;
      if (!this.yq.isFinished())
      {
        m = paramCanvas.save();
        k = getWidth();
        int n = getHeight();
        int i1 = getPaddingTop();
        int i2 = getPaddingBottom();
        paramCanvas.rotate(90.0F);
        paramCanvas.translate(-getPaddingTop(), -(this.xZ + 1.0F) * k);
        this.yq.setSize(n - i1 - i2, k);
        bool = j | this.yq.draw(paramCanvas);
        paramCanvas.restoreToCount(m);
      }
    }
    for (;;)
    {
      if (bool) {
        z.F(this);
      }
      GMTrace.o(17117994811392L, 127539);
      return;
      this.yp.finish();
      this.yq.finish();
    }
  }
  
  protected void drawableStateChanged()
  {
    GMTrace.i(17114370932736L, 127512);
    super.drawableStateChanged();
    Drawable localDrawable = this.xV;
    if ((localDrawable != null) && (localDrawable.isStateful())) {
      localDrawable.setState(getDrawableState());
    }
    GMTrace.o(17114370932736L, 127512);
  }
  
  protected ViewGroup.LayoutParams generateDefaultLayoutParams()
  {
    GMTrace.i(17120276512768L, 127556);
    LayoutParams localLayoutParams = new LayoutParams();
    GMTrace.o(17120276512768L, 127556);
    return localLayoutParams;
  }
  
  public ViewGroup.LayoutParams generateLayoutParams(AttributeSet paramAttributeSet)
  {
    GMTrace.i(17120679165952L, 127559);
    paramAttributeSet = new LayoutParams(getContext(), paramAttributeSet);
    GMTrace.o(17120679165952L, 127559);
    return paramAttributeSet;
  }
  
  protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams paramLayoutParams)
  {
    GMTrace.i(17120410730496L, 127557);
    paramLayoutParams = generateDefaultLayoutParams();
    GMTrace.o(17120410730496L, 127557);
    return paramLayoutParams;
  }
  
  protected int getChildDrawingOrder(int paramInt1, int paramInt2)
  {
    GMTrace.i(17114102497280L, 127510);
    int i = paramInt2;
    if (this.yA == 2) {
      i = paramInt1 - 1 - paramInt2;
    }
    paramInt1 = ((LayoutParams)((View)this.yB.get(i)).getLayoutParams()).yL;
    GMTrace.o(17114102497280L, 127510);
    return paramInt1;
  }
  
  protected void onAttachedToWindow()
  {
    GMTrace.i(17116249980928L, 127526);
    super.onAttachedToWindow();
    this.yr = true;
    GMTrace.o(17116249980928L, 127526);
  }
  
  protected void onDetachedFromWindow()
  {
    GMTrace.i(17112894537728L, 127501);
    removeCallbacks(this.yD);
    super.onDetachedFromWindow();
    GMTrace.o(17112894537728L, 127501);
  }
  
  protected void onDraw(Canvas paramCanvas)
  {
    GMTrace.i(17118129029120L, 127540);
    super.onDraw(paramCanvas);
    if ((this.xU > 0) && (this.xV != null) && (this.dw.size() > 0) && (this.xM != null))
    {
      int k = getScrollX();
      int m = getWidth();
      float f3 = this.xU / m;
      Object localObject = (b)this.dw.get(0);
      float f1 = ((b)localObject).yI;
      int n = this.dw.size();
      int i = ((b)localObject).position;
      int i1 = ((b)this.dw.get(n - 1)).position;
      int j = 0;
      if (i < i1)
      {
        while ((i > ((b)localObject).position) && (j < n))
        {
          localObject = this.dw;
          j += 1;
          localObject = (b)((ArrayList)localObject).get(j);
        }
        float f2;
        if (i == ((b)localObject).position) {
          f2 = (((b)localObject).yI + ((b)localObject).yH) * m;
        }
        for (f1 = ((b)localObject).yI + ((b)localObject).yH + f3;; f1 += 1.0F + f3)
        {
          if (this.xU + f2 > k)
          {
            this.xV.setBounds((int)f2, this.xW, (int)(this.xU + f2 + 0.5F), this.xX);
            this.xV.draw(paramCanvas);
          }
          if (f2 > k + m) {
            break label306;
          }
          i += 1;
          break;
          f2 = (1.0F + f1) * m;
        }
      }
    }
    label306:
    GMTrace.o(17118129029120L, 127540);
  }
  
  public boolean onInterceptTouchEvent(MotionEvent paramMotionEvent)
  {
    GMTrace.i(17117323722752L, 127534);
    int i = paramMotionEvent.getAction() & 0xFF;
    if ((i == 3) || (i == 1))
    {
      this.hP = false;
      this.yf = false;
      this.eA = -1;
      if (this.ez != null)
      {
        this.ez.recycle();
        this.ez = null;
      }
      GMTrace.o(17117323722752L, 127534);
      return false;
    }
    if (i != 0)
    {
      if (this.hP)
      {
        GMTrace.o(17117323722752L, 127534);
        return true;
      }
      if (this.yf)
      {
        GMTrace.o(17117323722752L, 127534);
        return false;
      }
    }
    switch (i)
    {
    }
    for (;;)
    {
      if (this.ez == null) {
        this.ez = VelocityTracker.obtain();
      }
      this.ez.addMovement(paramMotionEvent);
      boolean bool = this.hP;
      GMTrace.o(17117323722752L, 127534);
      return bool;
      i = this.eA;
      if (i != -1)
      {
        i = o.b(paramMotionEvent, i);
        float f2 = o.d(paramMotionEvent, i);
        float f1 = f2 - this.yi;
        float f4 = Math.abs(f1);
        float f3 = o.e(paramMotionEvent, i);
        float f5 = Math.abs(f3 - this.wY);
        if (f1 != 0.0F)
        {
          float f6 = this.yi;
          if (((f6 < this.yh) && (f1 > 0.0F)) || ((f6 > getWidth() - this.yh) && (f1 < 0.0F))) {}
          for (i = 1; (i == 0) && (a(this, false, (int)f1, (int)f2, (int)f3)); i = 0)
          {
            this.yi = f2;
            this.yj = f3;
            this.yf = true;
            GMTrace.o(17117323722752L, 127534);
            return false;
          }
        }
        if ((f4 > this.hR) && (0.5F * f4 > f5))
        {
          this.hP = true;
          X(1);
          if (f1 > 0.0F)
          {
            f1 = this.wX + this.hR;
            label410:
            this.yi = f1;
            this.yj = f3;
            setScrollingCacheEnabled(true);
          }
        }
        while ((this.hP) && (o(f2)))
        {
          z.F(this);
          break;
          f1 = this.wX - this.hR;
          break label410;
          if (f5 > this.hR) {
            this.yf = true;
          }
        }
        f1 = paramMotionEvent.getX();
        this.wX = f1;
        this.yi = f1;
        f1 = paramMotionEvent.getY();
        this.wY = f1;
        this.yj = f1;
        this.eA = o.c(paramMotionEvent, 0);
        this.yf = false;
        this.xR.computeScrollOffset();
        if ((this.xq == 2) && (Math.abs(this.xR.getFinalX() - this.xR.getCurrX()) > this.yn))
        {
          this.xR.abortAnimation();
          this.yd = false;
          populate();
          this.hP = true;
          X(1);
        }
        else
        {
          r(false);
          this.hP = false;
          continue;
          h(paramMotionEvent);
        }
      }
    }
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    GMTrace.i(17116652634112L, 127529);
    int i1 = getChildCount();
    int i3 = paramInt3 - paramInt1;
    int i2 = paramInt4 - paramInt2;
    paramInt2 = getPaddingLeft();
    paramInt1 = getPaddingTop();
    int i = getPaddingRight();
    paramInt3 = getPaddingBottom();
    int i4 = getScrollX();
    int j = 0;
    int m = 0;
    View localView;
    LayoutParams localLayoutParams;
    int i5;
    int k;
    label162:
    int n;
    if (m < i1)
    {
      localView = getChildAt(m);
      if (localView.getVisibility() == 8) {
        break label688;
      }
      localLayoutParams = (LayoutParams)localView.getLayoutParams();
      if (!localLayoutParams.yJ) {
        break label688;
      }
      paramInt4 = localLayoutParams.gravity;
      i5 = localLayoutParams.gravity;
      switch (paramInt4 & 0x7)
      {
      case 2: 
      case 4: 
      default: 
        paramInt4 = paramInt2;
        k = paramInt2;
        switch (i5 & 0x70)
        {
        default: 
          n = paramInt1;
          paramInt2 = paramInt1;
          paramInt1 = paramInt3;
          paramInt3 = n;
          label212:
          paramInt4 += i4;
          localView.layout(paramInt4, paramInt3, localView.getMeasuredWidth() + paramInt4, localView.getMeasuredHeight() + paramInt3);
          j += 1;
          paramInt4 = i;
          paramInt3 = k;
          i = paramInt1;
          paramInt1 = j;
        }
        break;
      }
    }
    for (;;)
    {
      m += 1;
      k = paramInt3;
      j = paramInt1;
      paramInt1 = paramInt2;
      paramInt3 = i;
      i = paramInt4;
      paramInt2 = k;
      break;
      k = localView.getMeasuredWidth();
      paramInt4 = paramInt2;
      k += paramInt2;
      break label162;
      paramInt4 = Math.max((i3 - localView.getMeasuredWidth()) / 2, paramInt2);
      k = paramInt2;
      break label162;
      k = localView.getMeasuredWidth();
      paramInt4 = i + localView.getMeasuredWidth();
      n = i3 - i - k;
      i = paramInt4;
      k = paramInt2;
      paramInt4 = n;
      break label162;
      n = localView.getMeasuredHeight();
      paramInt2 = paramInt3;
      n += paramInt1;
      paramInt3 = paramInt1;
      paramInt1 = paramInt2;
      paramInt2 = n;
      break label212;
      n = Math.max((i2 - localView.getMeasuredHeight()) / 2, paramInt1);
      paramInt2 = paramInt1;
      paramInt1 = paramInt3;
      paramInt3 = n;
      break label212;
      n = i2 - paramInt3 - localView.getMeasuredHeight();
      i5 = localView.getMeasuredHeight();
      paramInt2 = paramInt1;
      paramInt1 = paramInt3 + i5;
      paramInt3 = n;
      break label212;
      i = i3 - paramInt2 - i;
      paramInt4 = 0;
      while (paramInt4 < i1)
      {
        localView = getChildAt(paramInt4);
        if (localView.getVisibility() != 8)
        {
          localLayoutParams = (LayoutParams)localView.getLayoutParams();
          if (!localLayoutParams.yJ)
          {
            b localb = ct(localView);
            if (localb != null)
            {
              float f = i;
              k = (int)(localb.yI * f) + paramInt2;
              if (localLayoutParams.yK)
              {
                localLayoutParams.yK = false;
                f = i;
                localView.measure(View.MeasureSpec.makeMeasureSpec((int)(localLayoutParams.yH * f), 1073741824), View.MeasureSpec.makeMeasureSpec(i2 - paramInt1 - paramInt3, 1073741824));
              }
              localView.layout(k, paramInt1, localView.getMeasuredWidth() + k, localView.getMeasuredHeight() + paramInt1);
            }
          }
        }
        paramInt4 += 1;
      }
      this.xW = paramInt1;
      this.xX = (i2 - paramInt3);
      this.yu = j;
      if (this.yr) {
        a(this.xN, false, 0, false);
      }
      this.yr = false;
      GMTrace.o(17116652634112L, 127529);
      return;
      label688:
      paramInt4 = j;
      j = paramInt1;
      k = paramInt2;
      paramInt1 = paramInt4;
      paramInt4 = i;
      i = paramInt3;
      paramInt2 = j;
      paramInt3 = k;
    }
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    GMTrace.i(17116384198656L, 127527);
    setMeasuredDimension(getDefaultSize(0, paramInt1), getDefaultSize(0, paramInt2));
    paramInt1 = getMeasuredWidth();
    this.yh = Math.min(paramInt1 / 10, this.yg);
    paramInt1 = paramInt1 - getPaddingLeft() - getPaddingRight();
    paramInt2 = getMeasuredHeight() - getPaddingTop() - getPaddingBottom();
    int i4 = getChildCount();
    int k = 0;
    View localView;
    int i;
    int j;
    LayoutParams localLayoutParams;
    int m;
    int i1;
    label192:
    int n;
    if (k < i4)
    {
      localView = getChildAt(k);
      i = paramInt1;
      j = paramInt2;
      if (localView.getVisibility() != 8)
      {
        localLayoutParams = (LayoutParams)localView.getLayoutParams();
        i = paramInt1;
        j = paramInt2;
        if (localLayoutParams != null)
        {
          i = paramInt1;
          j = paramInt2;
          if (localLayoutParams.yJ)
          {
            i = localLayoutParams.gravity & 0x7;
            m = localLayoutParams.gravity & 0x70;
            i1 = Integer.MIN_VALUE;
            j = Integer.MIN_VALUE;
            if ((m != 48) && (m != 80)) {
              break label342;
            }
            m = 1;
            if ((i != 3) && (i != 5)) {
              break label348;
            }
            n = 1;
            label207:
            if (m == 0) {
              break label354;
            }
            i = 1073741824;
            label217:
            if (localLayoutParams.width == -2) {
              break label551;
            }
            i1 = 1073741824;
            if (localLayoutParams.width == -1) {
              break label545;
            }
            i = localLayoutParams.width;
          }
        }
      }
    }
    for (;;)
    {
      int i3;
      if (localLayoutParams.height != -2)
      {
        i2 = 1073741824;
        j = i2;
        if (localLayoutParams.height != -1)
        {
          i3 = localLayoutParams.height;
          j = i2;
        }
      }
      for (int i2 = i3;; i2 = paramInt2)
      {
        localView.measure(View.MeasureSpec.makeMeasureSpec(i, i1), View.MeasureSpec.makeMeasureSpec(i2, j));
        if (m != 0)
        {
          j = paramInt2 - localView.getMeasuredHeight();
          i = paramInt1;
        }
        for (;;)
        {
          k += 1;
          paramInt1 = i;
          paramInt2 = j;
          break;
          label342:
          m = 0;
          break label192;
          label348:
          n = 0;
          break label207;
          label354:
          i = i1;
          if (n == 0) {
            break label217;
          }
          j = 1073741824;
          i = i1;
          break label217;
          i = paramInt1;
          j = paramInt2;
          if (n != 0)
          {
            i = paramInt1 - localView.getMeasuredWidth();
            j = paramInt2;
          }
        }
        this.ya = View.MeasureSpec.makeMeasureSpec(paramInt1, 1073741824);
        this.yb = View.MeasureSpec.makeMeasureSpec(paramInt2, 1073741824);
        this.oy = true;
        populate();
        this.oy = false;
        i = getChildCount();
        paramInt2 = 0;
        while (paramInt2 < i)
        {
          localView = getChildAt(paramInt2);
          if (localView.getVisibility() != 8)
          {
            localLayoutParams = (LayoutParams)localView.getLayoutParams();
            if (((localLayoutParams == null) || (!localLayoutParams.yJ)) && (localLayoutParams != null))
            {
              float f = paramInt1;
              localView.measure(View.MeasureSpec.makeMeasureSpec((int)(localLayoutParams.yH * f), 1073741824), this.yb);
            }
          }
          paramInt2 += 1;
        }
        GMTrace.o(17116384198656L, 127527);
        return;
      }
      label545:
      i = paramInt1;
      continue;
      label551:
      i1 = i;
      i = paramInt1;
    }
  }
  
  protected boolean onRequestFocusInDescendants(int paramInt, Rect paramRect)
  {
    int j = -1;
    GMTrace.i(17120008077312L, 127554);
    int k = getChildCount();
    int i;
    if ((paramInt & 0x2) != 0)
    {
      j = 1;
      i = 0;
    }
    while (i != k)
    {
      View localView = getChildAt(i);
      if (localView.getVisibility() == 0)
      {
        b localb = ct(localView);
        if ((localb != null) && (localb.position == this.xN) && (localView.requestFocus(paramInt, paramRect)))
        {
          GMTrace.o(17120008077312L, 127554);
          return true;
          i = k - 1;
          k = -1;
          continue;
        }
      }
      i += j;
    }
    GMTrace.o(17120008077312L, 127554);
    return false;
  }
  
  public void onRestoreInstanceState(Parcelable paramParcelable)
  {
    GMTrace.i(17115444674560L, 127520);
    if (!(paramParcelable instanceof SavedState))
    {
      super.onRestoreInstanceState(paramParcelable);
      GMTrace.o(17115444674560L, 127520);
      return;
    }
    paramParcelable = (SavedState)paramParcelable;
    super.onRestoreInstanceState(paramParcelable.getSuperState());
    if (this.xM != null)
    {
      this.xM.a(paramParcelable.yM, paramParcelable.yN);
      a(paramParcelable.position, false, true);
      GMTrace.o(17115444674560L, 127520);
      return;
    }
    this.xO = paramParcelable.position;
    this.xP = paramParcelable.yM;
    this.xQ = paramParcelable.yN;
    GMTrace.o(17115444674560L, 127520);
  }
  
  public Parcelable onSaveInstanceState()
  {
    GMTrace.i(17115310456832L, 127519);
    SavedState localSavedState = new SavedState(super.onSaveInstanceState());
    localSavedState.position = this.xN;
    if (this.xM != null) {
      localSavedState.yM = this.xM.bb();
    }
    GMTrace.o(17115310456832L, 127519);
    return localSavedState;
  }
  
  protected void onSizeChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    GMTrace.i(17116518416384L, 127528);
    super.onSizeChanged(paramInt1, paramInt2, paramInt3, paramInt4);
    b localb;
    if (paramInt1 != paramInt3)
    {
      paramInt2 = this.xU;
      paramInt4 = this.xU;
      if ((paramInt3 > 0) && (!this.dw.isEmpty()))
      {
        int i = getPaddingLeft();
        int j = getPaddingRight();
        int k = getPaddingLeft();
        int m = getPaddingRight();
        f = getScrollX() / (paramInt4 + (paramInt3 - k - m));
        paramInt2 = (int)((paramInt2 + (paramInt1 - i - j)) * f);
        scrollTo(paramInt2, getScrollY());
        if (!this.xR.isFinished())
        {
          paramInt3 = this.xR.getDuration();
          paramInt4 = this.xR.timePassed();
          localb = uz(this.xN);
          this.xR.startScroll(paramInt2, 0, (int)(localb.yI * paramInt1), 0, paramInt3 - paramInt4);
        }
        GMTrace.o(17116518416384L, 127528);
        return;
      }
      localb = uz(this.xN);
      if (localb == null) {
        break label263;
      }
    }
    label263:
    for (float f = Math.min(localb.yI, this.xZ);; f = 0.0F)
    {
      paramInt1 = (int)(f * (paramInt1 - getPaddingLeft() - getPaddingRight()));
      if (paramInt1 != getScrollX())
      {
        r(false);
        scrollTo(paramInt1, getScrollY());
      }
      GMTrace.o(17116518416384L, 127528);
      return;
    }
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    int m = 0;
    GMTrace.i(17117457940480L, 127535);
    if (this.yo)
    {
      GMTrace.o(17117457940480L, 127535);
      return true;
    }
    if ((paramMotionEvent.getAction() == 0) && (paramMotionEvent.getEdgeFlags() != 0))
    {
      GMTrace.o(17117457940480L, 127535);
      return false;
    }
    if ((this.xM == null) || (this.xM.getCount() == 0))
    {
      GMTrace.o(17117457940480L, 127535);
      return false;
    }
    if (this.ez == null) {
      this.ez = VelocityTracker.obtain();
    }
    this.ez.addMovement(paramMotionEvent);
    int i = m;
    switch (paramMotionEvent.getAction() & 0xFF)
    {
    default: 
      i = m;
    }
    for (;;)
    {
      if (i != 0) {
        z.F(this);
      }
      GMTrace.o(17117457940480L, 127535);
      return true;
      this.xR.abortAnimation();
      this.yd = false;
      populate();
      this.hP = true;
      X(1);
      float f1 = paramMotionEvent.getX();
      this.wX = f1;
      this.yi = f1;
      f1 = paramMotionEvent.getY();
      this.wY = f1;
      this.yj = f1;
      this.eA = o.c(paramMotionEvent, 0);
      i = m;
      continue;
      float f2;
      if (!this.hP)
      {
        i = o.b(paramMotionEvent, this.eA);
        f1 = o.d(paramMotionEvent, i);
        float f3 = Math.abs(f1 - this.yi);
        f2 = o.e(paramMotionEvent, i);
        float f4 = Math.abs(f2 - this.yj);
        if ((f3 > this.hR) && (f3 > f4))
        {
          this.hP = true;
          if (f1 - this.wX <= 0.0F) {
            break label409;
          }
        }
      }
      label409:
      for (f1 = this.wX + this.hR;; f1 = this.wX - this.hR)
      {
        this.yi = f1;
        this.yj = f2;
        X(1);
        setScrollingCacheEnabled(true);
        i = m;
        if (!this.hP) {
          break;
        }
        bool1 = o(o.d(paramMotionEvent, o.b(paramMotionEvent, this.eA))) | false;
        break;
      }
      boolean bool1 = m;
      if (this.hP)
      {
        Object localObject = this.ez;
        ((VelocityTracker)localObject).computeCurrentVelocity(1000, this.yl);
        int n = (int)y.a((VelocityTracker)localObject, this.eA);
        this.yd = true;
        int j = bP();
        m = getScrollX();
        localObject = bjp();
        int i1 = ((b)localObject).position;
        f1 = (m / j - ((b)localObject).yI) / ((b)localObject).yH;
        m = o.b(paramMotionEvent, this.eA);
        j = m;
        if (m < 0) {
          j = 0;
        }
        a(a(i1, f1, n, (int)(o.d(paramMotionEvent, j) - this.wX)), true, true, n);
        this.eA = -1;
        cz();
        boolean bool3 = this.yp.cr();
        boolean bool2 = this.yq.cr() | bool3;
        continue;
        bool2 = m;
        if (this.hP)
        {
          a(this.xN, true, 0, false);
          this.eA = -1;
          cz();
          bool3 = this.yp.cr();
          bool2 = this.yq.cr() | bool3;
          continue;
          int k = o.e(paramMotionEvent);
          this.yi = o.d(paramMotionEvent, k);
          this.eA = o.c(paramMotionEvent, k);
          k = m;
          continue;
          h(paramMotionEvent);
          this.yi = o.d(paramMotionEvent, o.b(paramMotionEvent, this.eA));
          k = m;
        }
      }
    }
  }
  
  public final void populate()
  {
    GMTrace.i(17114773585920L, 127515);
    Z(this.xN);
    GMTrace.o(17114773585920L, 127515);
  }
  
  public void removeView(View paramView)
  {
    GMTrace.i(17115713110016L, 127522);
    if (this.oy)
    {
      removeViewInLayout(paramView);
      GMTrace.o(17115713110016L, 127522);
      return;
    }
    super.removeView(paramView);
    GMTrace.o(17115713110016L, 127522);
  }
  
  protected boolean verifyDrawable(Drawable paramDrawable)
  {
    GMTrace.i(17114236715008L, 127511);
    if ((super.verifyDrawable(paramDrawable)) || (paramDrawable == this.xV))
    {
      GMTrace.o(17114236715008L, 127511);
      return true;
    }
    GMTrace.o(17114236715008L, 127511);
    return false;
  }
  
  public static class LayoutParams
    extends ViewGroup.LayoutParams
  {
    public int gravity;
    int position;
    float yH;
    public boolean yJ;
    boolean yK;
    int yL;
    
    public LayoutParams()
    {
      super(-1);
      GMTrace.i(17112491884544L, 127498);
      this.yH = 0.0F;
      GMTrace.o(17112491884544L, 127498);
    }
    
    public LayoutParams(Context paramContext, AttributeSet paramAttributeSet)
    {
      super(paramAttributeSet);
      GMTrace.i(17112626102272L, 127499);
      this.yH = 0.0F;
      paramContext = paramContext.obtainStyledAttributes(paramAttributeSet, AdLandingViewPager.bX());
      this.gravity = paramContext.getInteger(0, 48);
      paramContext.recycle();
      GMTrace.o(17112626102272L, 127499);
    }
  }
  
  public static class SavedState
    extends View.BaseSavedState
  {
    public static final Parcelable.Creator<SavedState> CREATOR;
    int position;
    Parcelable yM;
    ClassLoader yN;
    
    static
    {
      GMTrace.i(17100949159936L, 127412);
      CREATOR = android.support.v4.os.b.a(new c() {});
      GMTrace.o(17100949159936L, 127412);
    }
    
    SavedState(Parcel paramParcel, ClassLoader paramClassLoader)
    {
      super();
      GMTrace.i(17100814942208L, 127411);
      ClassLoader localClassLoader = paramClassLoader;
      if (paramClassLoader == null) {
        localClassLoader = getClass().getClassLoader();
      }
      this.position = paramParcel.readInt();
      this.yM = paramParcel.readParcelable(localClassLoader);
      this.yN = localClassLoader;
      GMTrace.o(17100814942208L, 127411);
    }
    
    public SavedState(Parcelable paramParcelable)
    {
      super();
      GMTrace.i(17100412289024L, 127408);
      GMTrace.o(17100412289024L, 127408);
    }
    
    public String toString()
    {
      GMTrace.i(17100680724480L, 127410);
      String str = "FragmentPager.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " position=" + this.position + "}";
      GMTrace.o(17100680724480L, 127410);
      return str;
    }
    
    public void writeToParcel(Parcel paramParcel, int paramInt)
    {
      GMTrace.i(17100546506752L, 127409);
      super.writeToParcel(paramParcel, paramInt);
      paramParcel.writeInt(this.position);
      paramParcel.writeParcelable(this.yM, paramInt);
      GMTrace.o(17100546506752L, 127409);
    }
  }
  
  static abstract interface a {}
  
  static final class b
  {
    int position;
    Object yF;
    boolean yG;
    float yH;
    float yI;
    
    b()
    {
      GMTrace.i(17123497738240L, 127580);
      GMTrace.o(17123497738240L, 127580);
    }
  }
  
  final class c
    extends a
  {
    c()
    {
      GMTrace.i(17111015489536L, 127487);
      GMTrace.o(17111015489536L, 127487);
    }
    
    private boolean bY()
    {
      GMTrace.i(17111552360448L, 127491);
      if ((AdLandingViewPager.b(AdLandingViewPager.this) != null) && (AdLandingViewPager.b(AdLandingViewPager.this).getCount() > 1))
      {
        GMTrace.o(17111552360448L, 127491);
        return true;
      }
      GMTrace.o(17111552360448L, 127491);
      return false;
    }
    
    public final void a(View paramView, android.support.v4.view.a.b paramb)
    {
      GMTrace.i(17111283924992L, 127489);
      super.a(paramView, paramb);
      paramb.setClassName(AdLandingViewPager.class.getName());
      paramb.setScrollable(bY());
      if (AdLandingViewPager.this.canScrollHorizontally(1)) {
        paramb.addAction(4096);
      }
      if (AdLandingViewPager.this.canScrollHorizontally(-1)) {
        paramb.addAction(8192);
      }
      GMTrace.o(17111283924992L, 127489);
    }
    
    public final void onInitializeAccessibilityEvent(View paramView, AccessibilityEvent paramAccessibilityEvent)
    {
      GMTrace.i(17111149707264L, 127488);
      super.onInitializeAccessibilityEvent(paramView, paramAccessibilityEvent);
      paramAccessibilityEvent.setClassName(AdLandingViewPager.class.getName());
      paramView = f.ch();
      paramView.setScrollable(bY());
      if ((paramAccessibilityEvent.getEventType() == 4096) && (AdLandingViewPager.b(AdLandingViewPager.this) != null))
      {
        paramView.setItemCount(AdLandingViewPager.b(AdLandingViewPager.this).getCount());
        paramView.setFromIndex(AdLandingViewPager.c(AdLandingViewPager.this));
        paramView.setToIndex(AdLandingViewPager.c(AdLandingViewPager.this));
      }
      GMTrace.o(17111149707264L, 127488);
    }
    
    public final boolean performAccessibilityAction(View paramView, int paramInt, Bundle paramBundle)
    {
      GMTrace.i(17111418142720L, 127490);
      if (super.performAccessibilityAction(paramView, paramInt, paramBundle))
      {
        GMTrace.o(17111418142720L, 127490);
        return true;
      }
      switch (paramInt)
      {
      default: 
        GMTrace.o(17111418142720L, 127490);
        return false;
      case 4096: 
        if (AdLandingViewPager.this.canScrollHorizontally(1))
        {
          AdLandingViewPager.this.Y(AdLandingViewPager.c(AdLandingViewPager.this) + 1);
          GMTrace.o(17111418142720L, 127490);
          return true;
        }
        GMTrace.o(17111418142720L, 127490);
        return false;
      }
      if (AdLandingViewPager.this.canScrollHorizontally(-1))
      {
        AdLandingViewPager.this.Y(AdLandingViewPager.c(AdLandingViewPager.this) - 1);
        GMTrace.o(17111418142720L, 127490);
        return true;
      }
      GMTrace.o(17111418142720L, 127490);
      return false;
    }
  }
  
  private final class d
    extends DataSetObserver
  {
    private d()
    {
      GMTrace.i(17122289778688L, 127571);
      GMTrace.o(17122289778688L, 127571);
    }
    
    public final void onChanged()
    {
      GMTrace.i(17122423996416L, 127572);
      AdLandingViewPager.this.bQ();
      GMTrace.o(17122423996416L, 127572);
    }
    
    public final void onInvalidated()
    {
      GMTrace.i(17122558214144L, 127573);
      AdLandingViewPager.this.bQ();
      GMTrace.o(17122558214144L, 127573);
    }
  }
  
  static final class e
    implements Comparator<View>
  {
    e()
    {
      GMTrace.i(17123229302784L, 127578);
      GMTrace.o(17123229302784L, 127578);
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/widget/verticalviewpager/AdLandingViewPager.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */