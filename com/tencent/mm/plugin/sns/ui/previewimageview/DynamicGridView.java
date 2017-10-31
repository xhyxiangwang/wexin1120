package com.tencent.mm.plugin.sns.ui.previewimageview;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TypeEvaluator;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Message;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Pair;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnPreDrawListener;
import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListAdapter;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.sns.i.d;
import com.tencent.mm.plugin.sns.i.f;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class DynamicGridView
  extends WrappingGridView
{
  private int eA;
  private List<Long> idList;
  boolean lvJ;
  private boolean qWA;
  private boolean qWB;
  private int qWC;
  private boolean qWD;
  private List<ObjectAnimator> qWE;
  boolean qWF;
  boolean qWG;
  boolean qWH;
  private boolean qWI;
  private AbsListView.OnScrollListener qWJ;
  f qWK;
  e qWL;
  private AdapterView.OnItemClickListener qWM;
  private AdapterView.OnItemClickListener qWN;
  private boolean qWO;
  private Stack<a> qWP;
  private a qWQ;
  private View qWR;
  d qWS;
  int qWT;
  float qWU;
  float qWV;
  private float qWW;
  private float qWX;
  private AbsListView.OnScrollListener qWY;
  private BitmapDrawable qWo;
  private Rect qWp;
  private Rect qWq;
  private Rect qWr;
  private int qWs;
  private int qWt;
  private int qWu;
  private int qWv;
  private int qWw;
  private int qWx;
  private int qWy;
  private long qWz;
  private int xq;
  
  public DynamicGridView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(15981841743872L, 119074);
    this.qWs = 0;
    this.qWt = 0;
    this.qWu = -1;
    this.qWv = -1;
    this.qWw = -1;
    this.qWx = -1;
    this.idList = new ArrayList();
    this.qWz = -1L;
    this.qWA = false;
    this.eA = -1;
    this.qWC = 0;
    this.qWD = false;
    this.xq = 0;
    this.lvJ = false;
    this.qWE = new LinkedList();
    this.qWH = true;
    this.qWI = true;
    this.qWN = new AdapterView.OnItemClickListener()
    {
      public final void onItemClick(AdapterView<?> paramAnonymousAdapterView, View paramAnonymousView, int paramAnonymousInt, long paramAnonymousLong)
      {
        GMTrace.i(15981170655232L, 119069);
        if ((!DynamicGridView.this.lvJ) && (DynamicGridView.this.isEnabled()) && (DynamicGridView.a(DynamicGridView.this) != null)) {
          DynamicGridView.a(DynamicGridView.this).onItemClick(paramAnonymousAdapterView, paramAnonymousView, paramAnonymousInt, paramAnonymousLong);
        }
        GMTrace.o(15981170655232L, 119069);
      }
    };
    this.qWS = new d((byte)0);
    this.qWT = -1;
    this.qWY = new AbsListView.OnScrollListener()
    {
      private int kDS;
      private int qXa;
      private int qXb;
      private int qXc;
      private int qXd;
      
      public final void onScroll(AbsListView paramAnonymousAbsListView, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3)
      {
        GMTrace.i(15976204599296L, 119032);
        this.qXc = paramAnonymousInt1;
        this.qXd = paramAnonymousInt2;
        int i;
        label52:
        label215:
        View localView;
        if (this.qXa == -1)
        {
          i = this.qXc;
          this.qXa = i;
          if (this.qXb != -1) {
            break label311;
          }
          i = this.qXd;
          this.qXb = i;
          if ((this.qXc != this.qXa) && (DynamicGridView.k(DynamicGridView.this)) && (DynamicGridView.h(DynamicGridView.this) != -1L))
          {
            DynamicGridView.a(DynamicGridView.this, DynamicGridView.h(DynamicGridView.this));
            DynamicGridView.p(DynamicGridView.this);
          }
          if ((this.qXc + this.qXd != this.qXa + this.qXb) && (DynamicGridView.k(DynamicGridView.this)) && (DynamicGridView.h(DynamicGridView.this) != -1L))
          {
            DynamicGridView.a(DynamicGridView.this, DynamicGridView.h(DynamicGridView.this));
            DynamicGridView.p(DynamicGridView.this);
          }
          this.qXa = this.qXc;
          this.qXb = this.qXd;
          if ((!DynamicGridView.bos()) || (!DynamicGridView.i(DynamicGridView.this))) {
            break label377;
          }
          i = 0;
          if (i >= paramAnonymousInt2) {
            break label377;
          }
          localView = DynamicGridView.this.getChildAt(i);
          if (localView != null)
          {
            if ((DynamicGridView.h(DynamicGridView.this) == -1L) || (Boolean.TRUE == localView.getTag(i.f.pJF))) {
              break label332;
            }
            if (i % 2 != 0) {
              break label320;
            }
            DynamicGridView.c(DynamicGridView.this, localView);
            label281:
            localView.setTag(i.f.pJF, Boolean.valueOf(true));
          }
        }
        for (;;)
        {
          i += 1;
          break label215;
          i = this.qXa;
          break;
          label311:
          i = this.qXb;
          break label52;
          label320:
          DynamicGridView.d(DynamicGridView.this, localView);
          break label281;
          label332:
          if ((DynamicGridView.h(DynamicGridView.this) == -1L) && (localView.getRotation() != 0.0F))
          {
            localView.setRotation(0.0F);
            localView.setTag(i.f.pJF, Boolean.valueOf(false));
          }
        }
        label377:
        if (DynamicGridView.j(DynamicGridView.this) != null) {
          DynamicGridView.j(DynamicGridView.this).onScroll(paramAnonymousAbsListView, paramAnonymousInt1, paramAnonymousInt2, paramAnonymousInt3);
        }
        GMTrace.o(15976204599296L, 119032);
      }
      
      public final void onScrollStateChanged(AbsListView paramAnonymousAbsListView, int paramAnonymousInt)
      {
        GMTrace.i(15976338817024L, 119033);
        this.kDS = paramAnonymousInt;
        DynamicGridView.c(DynamicGridView.this, paramAnonymousInt);
        if ((this.qXd > 0) && (this.kDS == 0))
        {
          if ((!DynamicGridView.k(DynamicGridView.this)) || (!DynamicGridView.l(DynamicGridView.this))) {
            break label96;
          }
          DynamicGridView.m(DynamicGridView.this);
        }
        for (;;)
        {
          if (DynamicGridView.j(DynamicGridView.this) != null) {
            DynamicGridView.j(DynamicGridView.this).onScrollStateChanged(paramAnonymousAbsListView, paramAnonymousInt);
          }
          GMTrace.o(15976338817024L, 119033);
          return;
          label96:
          if (DynamicGridView.n(DynamicGridView.this)) {
            DynamicGridView.o(DynamicGridView.this);
          }
        }
      }
    };
    init(paramContext);
    GMTrace.o(15981841743872L, 119074);
  }
  
  public DynamicGridView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(15981975961600L, 119075);
    this.qWs = 0;
    this.qWt = 0;
    this.qWu = -1;
    this.qWv = -1;
    this.qWw = -1;
    this.qWx = -1;
    this.idList = new ArrayList();
    this.qWz = -1L;
    this.qWA = false;
    this.eA = -1;
    this.qWC = 0;
    this.qWD = false;
    this.xq = 0;
    this.lvJ = false;
    this.qWE = new LinkedList();
    this.qWH = true;
    this.qWI = true;
    this.qWN = new AdapterView.OnItemClickListener()
    {
      public final void onItemClick(AdapterView<?> paramAnonymousAdapterView, View paramAnonymousView, int paramAnonymousInt, long paramAnonymousLong)
      {
        GMTrace.i(15981170655232L, 119069);
        if ((!DynamicGridView.this.lvJ) && (DynamicGridView.this.isEnabled()) && (DynamicGridView.a(DynamicGridView.this) != null)) {
          DynamicGridView.a(DynamicGridView.this).onItemClick(paramAnonymousAdapterView, paramAnonymousView, paramAnonymousInt, paramAnonymousLong);
        }
        GMTrace.o(15981170655232L, 119069);
      }
    };
    this.qWS = new d((byte)0);
    this.qWT = -1;
    this.qWY = new AbsListView.OnScrollListener()
    {
      private int kDS;
      private int qXa;
      private int qXb;
      private int qXc;
      private int qXd;
      
      public final void onScroll(AbsListView paramAnonymousAbsListView, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3)
      {
        GMTrace.i(15976204599296L, 119032);
        this.qXc = paramAnonymousInt1;
        this.qXd = paramAnonymousInt2;
        int i;
        label52:
        label215:
        View localView;
        if (this.qXa == -1)
        {
          i = this.qXc;
          this.qXa = i;
          if (this.qXb != -1) {
            break label311;
          }
          i = this.qXd;
          this.qXb = i;
          if ((this.qXc != this.qXa) && (DynamicGridView.k(DynamicGridView.this)) && (DynamicGridView.h(DynamicGridView.this) != -1L))
          {
            DynamicGridView.a(DynamicGridView.this, DynamicGridView.h(DynamicGridView.this));
            DynamicGridView.p(DynamicGridView.this);
          }
          if ((this.qXc + this.qXd != this.qXa + this.qXb) && (DynamicGridView.k(DynamicGridView.this)) && (DynamicGridView.h(DynamicGridView.this) != -1L))
          {
            DynamicGridView.a(DynamicGridView.this, DynamicGridView.h(DynamicGridView.this));
            DynamicGridView.p(DynamicGridView.this);
          }
          this.qXa = this.qXc;
          this.qXb = this.qXd;
          if ((!DynamicGridView.bos()) || (!DynamicGridView.i(DynamicGridView.this))) {
            break label377;
          }
          i = 0;
          if (i >= paramAnonymousInt2) {
            break label377;
          }
          localView = DynamicGridView.this.getChildAt(i);
          if (localView != null)
          {
            if ((DynamicGridView.h(DynamicGridView.this) == -1L) || (Boolean.TRUE == localView.getTag(i.f.pJF))) {
              break label332;
            }
            if (i % 2 != 0) {
              break label320;
            }
            DynamicGridView.c(DynamicGridView.this, localView);
            label281:
            localView.setTag(i.f.pJF, Boolean.valueOf(true));
          }
        }
        for (;;)
        {
          i += 1;
          break label215;
          i = this.qXa;
          break;
          label311:
          i = this.qXb;
          break label52;
          label320:
          DynamicGridView.d(DynamicGridView.this, localView);
          break label281;
          label332:
          if ((DynamicGridView.h(DynamicGridView.this) == -1L) && (localView.getRotation() != 0.0F))
          {
            localView.setRotation(0.0F);
            localView.setTag(i.f.pJF, Boolean.valueOf(false));
          }
        }
        label377:
        if (DynamicGridView.j(DynamicGridView.this) != null) {
          DynamicGridView.j(DynamicGridView.this).onScroll(paramAnonymousAbsListView, paramAnonymousInt1, paramAnonymousInt2, paramAnonymousInt3);
        }
        GMTrace.o(15976204599296L, 119032);
      }
      
      public final void onScrollStateChanged(AbsListView paramAnonymousAbsListView, int paramAnonymousInt)
      {
        GMTrace.i(15976338817024L, 119033);
        this.kDS = paramAnonymousInt;
        DynamicGridView.c(DynamicGridView.this, paramAnonymousInt);
        if ((this.qXd > 0) && (this.kDS == 0))
        {
          if ((!DynamicGridView.k(DynamicGridView.this)) || (!DynamicGridView.l(DynamicGridView.this))) {
            break label96;
          }
          DynamicGridView.m(DynamicGridView.this);
        }
        for (;;)
        {
          if (DynamicGridView.j(DynamicGridView.this) != null) {
            DynamicGridView.j(DynamicGridView.this).onScrollStateChanged(paramAnonymousAbsListView, paramAnonymousInt);
          }
          GMTrace.o(15976338817024L, 119033);
          return;
          label96:
          if (DynamicGridView.n(DynamicGridView.this)) {
            DynamicGridView.o(DynamicGridView.this);
          }
        }
      }
    };
    init(paramContext);
    GMTrace.o(15981975961600L, 119075);
  }
  
  @TargetApi(11)
  private void bok()
  {
    GMTrace.i(15982512832512L, 119079);
    int i = 0;
    if (i < getChildCount())
    {
      View localView = getChildAt(i);
      if ((localView != null) && (Boolean.TRUE != localView.getTag(i.f.pJF)))
      {
        if (i % 2 != 0) {
          break label71;
        }
        cI(localView);
      }
      for (;;)
      {
        localView.setTag(i.f.pJF, Boolean.valueOf(true));
        i += 1;
        break;
        label71:
        cJ(localView);
      }
    }
    GMTrace.o(15982512832512L, 119079);
  }
  
  private boolean bol()
  {
    GMTrace.i(15984257662976L, 119092);
    int i = dX(this.qWz);
    if (i != -1)
    {
      this.qWL.vn(i);
      if (this.qWR == null)
      {
        GMTrace.o(15984257662976L, 119092);
        return false;
      }
    }
    else
    {
      GMTrace.o(15984257662976L, 119092);
      return false;
    }
    i = getPositionForView(this.qWR);
    int j = getChildCount() - 1;
    new StringBuilder("switch ").append(i).append(",").append(j);
    dh(i, j);
    if (this.qWO) {
      this.qWQ.di(i, j);
    }
    this.qWv = this.qWw;
    this.qWu = this.qWx;
    Object localObject;
    if ((boo()) && (bop())) {
      localObject = new b(0, 0);
    }
    for (;;)
    {
      dW(this.qWz);
      ((h)localObject).dj(i, j);
      GMTrace.o(15984257662976L, 119092);
      return true;
      if (bop()) {
        localObject = new g(0, 0);
      } else {
        localObject = new c(0, 0);
      }
    }
  }
  
  private void bom()
  {
    boolean bool = true;
    GMTrace.i(15984526098432L, 119094);
    Rect localRect = this.qWp;
    int i = computeVerticalScrollOffset();
    int j = getHeight();
    int k = computeVerticalScrollExtent();
    int m = computeVerticalScrollRange();
    int n = localRect.top;
    int i1 = localRect.height();
    if ((n <= 0) && (i > 0)) {
      smoothScrollBy(-this.qWC, 0);
    }
    for (;;)
    {
      this.qWB = bool;
      GMTrace.o(15984526098432L, 119094);
      return;
      if ((i1 + n >= j) && (i + k < m)) {
        smoothScrollBy(this.qWC, 0);
      } else {
        bool = false;
      }
    }
  }
  
  private void bon()
  {
    GMTrace.i(15984794533888L, 119096);
    this.qWS.removeMessages(1);
    final View localView = dY(this.qWz);
    Object localObject;
    if (this.qWp != null)
    {
      localObject = new Rect(this.qWp);
      ((Rect)localObject).offset(0, this.qWp.height() >>> 1);
    }
    for (;;)
    {
      if ((this.qWL != null) && (this.qWL.l((Rect)localObject)) && (bol()))
      {
        this.qWo = null;
        boq();
        if (this.qWK != null) {
          this.qWK.boj();
        }
      }
      for (;;)
      {
        if (this.qWL != null) {
          this.qWL.boi();
        }
        GMTrace.o(15984794533888L, 119096);
        return;
        if ((localView != null) && ((this.qWA) || (this.qWD)))
        {
          this.qWA = false;
          this.qWD = false;
          this.qWB = false;
          this.eA = -1;
          this.qWp.set(localView.getLeft(), localView.getTop(), localView.getRight(), localView.getBottom());
          new StringBuilder("animating to  ").append(this.qWp);
          if (Build.VERSION.SDK_INT > 11)
          {
            localObject = new TypeEvaluator()
            {
              private static int c(int paramAnonymousInt1, int paramAnonymousInt2, float paramAnonymousFloat)
              {
                GMTrace.i(15968151535616L, 118972);
                paramAnonymousInt1 = (int)(paramAnonymousInt1 + (paramAnonymousInt2 - paramAnonymousInt1) * paramAnonymousFloat);
                GMTrace.o(15968151535616L, 118972);
                return paramAnonymousInt1;
              }
            };
            localObject = ObjectAnimator.ofObject(this.qWo, "bounds", (TypeEvaluator)localObject, new Object[] { this.qWp });
            ((ObjectAnimator)localObject).addUpdateListener(new ValueAnimator.AnimatorUpdateListener()
            {
              public final void onAnimationUpdate(ValueAnimator paramAnonymousValueAnimator)
              {
                GMTrace.i(15981439090688L, 119071);
                DynamicGridView.this.invalidate();
                GMTrace.o(15981439090688L, 119071);
              }
            });
            ((ObjectAnimator)localObject).addListener(new AnimatorListenerAdapter()
            {
              public final void onAnimationEnd(Animator paramAnonymousAnimator)
              {
                GMTrace.i(15972580720640L, 119005);
                DynamicGridView.a(DynamicGridView.this, false);
                DynamicGridView.b(DynamicGridView.this);
                if ((DynamicGridView.c(DynamicGridView.this) != null) && (DynamicGridView.d(DynamicGridView.this) != null)) {
                  DynamicGridView.d(DynamicGridView.this).boj();
                }
                DynamicGridView.a(DynamicGridView.this, localView);
                GMTrace.o(15972580720640L, 119005);
              }
              
              public final void onAnimationStart(Animator paramAnonymousAnimator)
              {
                GMTrace.i(15972446502912L, 119004);
                DynamicGridView.a(DynamicGridView.this, true);
                DynamicGridView.b(DynamicGridView.this);
                GMTrace.o(15972446502912L, 119004);
              }
            });
            ((ObjectAnimator)localObject).setDuration(200L);
            ((ObjectAnimator)localObject).start();
          }
          else
          {
            this.qWo.setBounds(this.qWp);
            invalidate();
            cL(localView);
          }
        }
        else
        {
          boq();
        }
      }
      localObject = null;
    }
  }
  
  static boolean boo()
  {
    GMTrace.i(15985062969344L, 119098);
    if (Build.VERSION.SDK_INT >= 11)
    {
      GMTrace.o(15985062969344L, 119098);
      return true;
    }
    GMTrace.o(15985062969344L, 119098);
    return false;
  }
  
  private static boolean bop()
  {
    GMTrace.i(15985197187072L, 119099);
    if (Build.VERSION.SDK_INT < 21)
    {
      GMTrace.o(15985197187072L, 119099);
      return true;
    }
    GMTrace.o(15985197187072L, 119099);
    return false;
  }
  
  private void boq()
  {
    GMTrace.i(15985331404800L, 119100);
    View localView = dY(this.qWz);
    if (localView == null)
    {
      GMTrace.o(15985331404800L, 119100);
      return;
    }
    if (this.qWA) {
      cL(localView);
    }
    this.qWA = false;
    this.qWB = false;
    this.eA = -1;
    GMTrace.o(15985331404800L, 119100);
  }
  
  private void bor()
  {
    GMTrace.i(15985465622528L, 119101);
    int j = this.qWw - this.qWv;
    int k = this.qWx - this.qWu;
    int m = this.qWq.centerY() + this.qWs + j;
    int n = this.qWq.centerX() + this.qWt + k;
    this.qWR = dY(this.qWz);
    if (this.qWR == null)
    {
      GMTrace.o(15985465622528L, 119101);
      return;
    }
    Object localObject = null;
    float f1 = 0.0F;
    float f2 = 0.0F;
    Point localPoint1 = cM(this.qWR);
    Iterator localIterator = this.idList.iterator();
    int i;
    label193:
    label247:
    label301:
    label355:
    label409:
    label458:
    label507:
    label556:
    float f3;
    if (localIterator.hasNext())
    {
      View localView = dY(((Long)localIterator.next()).longValue());
      if (localView == null) {
        break label934;
      }
      Point localPoint2 = cM(localView);
      if ((localPoint2.y < localPoint1.y) && (localPoint2.x > localPoint1.x))
      {
        i = 1;
        if ((i == 0) || (m >= localView.getBottom()) || (n <= localView.getLeft()))
        {
          if ((localPoint2.y >= localPoint1.y) || (localPoint2.x >= localPoint1.x)) {
            break label648;
          }
          i = 1;
          if ((i == 0) || (m >= localView.getBottom()) || (n >= localView.getRight()))
          {
            if ((localPoint2.y <= localPoint1.y) || (localPoint2.x <= localPoint1.x)) {
              break label654;
            }
            i = 1;
            if ((i == 0) || (m <= localView.getTop()) || (n <= localView.getLeft()))
            {
              if ((localPoint2.y <= localPoint1.y) || (localPoint2.x >= localPoint1.x)) {
                break label660;
              }
              i = 1;
              if ((i == 0) || (m <= localView.getTop()) || (n >= localView.getRight()))
              {
                if ((localPoint2.y >= localPoint1.y) || (localPoint2.x != localPoint1.x)) {
                  break label666;
                }
                i = 1;
                if ((i == 0) || (m >= localView.getBottom() - this.qWy))
                {
                  if ((localPoint2.y <= localPoint1.y) || (localPoint2.x != localPoint1.x)) {
                    break label672;
                  }
                  i = 1;
                  if ((i == 0) || (m <= localView.getTop() + this.qWy))
                  {
                    if ((localPoint2.y != localPoint1.y) || (localPoint2.x <= localPoint1.x)) {
                      break label678;
                    }
                    i = 1;
                    if ((i == 0) || (n <= localView.getLeft() + this.qWy))
                    {
                      if ((localPoint2.y != localPoint1.y) || (localPoint2.x >= localPoint1.x)) {
                        break label684;
                      }
                      i = 1;
                      if ((i == 0) || (n >= localView.getRight() - this.qWy)) {
                        break label934;
                      }
                    }
                  }
                }
              }
            }
          }
        }
        float f4 = Math.abs(f.cG(localView) - f.cG(this.qWR));
        f3 = Math.abs(f.cH(localView) - f.cH(this.qWR));
        if ((f4 < f1) || (f3 < f2)) {
          break label934;
        }
        f2 = f4;
        localObject = localView;
        f1 = f3;
      }
    }
    for (;;)
    {
      f3 = f2;
      f2 = f1;
      f1 = f3;
      break;
      i = 0;
      break label193;
      label648:
      i = 0;
      break label247;
      label654:
      i = 0;
      break label301;
      label660:
      i = 0;
      break label355;
      label666:
      i = 0;
      break label409;
      label672:
      i = 0;
      break label458;
      label678:
      i = 0;
      break label507;
      label684:
      i = 0;
      break label556;
      if (localObject != null)
      {
        i = getPositionForView(this.qWR);
        m = getPositionForView((View)localObject);
        new StringBuilder("switch ").append(i).append(",").append(m);
        localObject = (d)getAdapter();
        if ((m == -1) || (!((d)localObject).vl(i)) || (!((d)localObject).vl(m)))
        {
          dW(this.qWz);
          GMTrace.o(15985465622528L, 119101);
          return;
        }
        dh(i, m);
        if (this.qWO) {
          this.qWQ.di(i, m);
        }
        this.qWv = this.qWw;
        this.qWu = this.qWx;
        if ((!boo()) || (!bop())) {
          break label894;
        }
        localObject = new b(k, j);
      }
      for (;;)
      {
        dW(this.qWz);
        ((h)localObject).dj(i, m);
        GMTrace.o(15985465622528L, 119101);
        return;
        label894:
        if (bop()) {
          localObject = new g(k, j);
        } else {
          localObject = new c(k, j);
        }
      }
      label934:
      f3 = f1;
      f1 = f2;
      f2 = f3;
    }
  }
  
  @TargetApi(11)
  private void cI(View paramView)
  {
    GMTrace.i(15982915485696L, 119082);
    paramView = cK(paramView);
    paramView.setFloatValues(new float[] { -2.0F, 2.0F });
    paramView.start();
    this.qWE.add(paramView);
    GMTrace.o(15982915485696L, 119082);
  }
  
  @TargetApi(11)
  private void cJ(View paramView)
  {
    GMTrace.i(15983049703424L, 119083);
    paramView = cK(paramView);
    paramView.setFloatValues(new float[] { 2.0F, -2.0F });
    paramView.start();
    this.qWE.add(paramView);
    GMTrace.o(15983049703424L, 119083);
  }
  
  @TargetApi(11)
  private ObjectAnimator cK(final View paramView)
  {
    GMTrace.i(15983183921152L, 119084);
    if (!bop()) {
      paramView.setLayerType(1, null);
    }
    ObjectAnimator localObjectAnimator = new ObjectAnimator();
    localObjectAnimator.setDuration(180L);
    localObjectAnimator.setRepeatMode(2);
    localObjectAnimator.setRepeatCount(-1);
    localObjectAnimator.setPropertyName("rotation");
    localObjectAnimator.setTarget(paramView);
    localObjectAnimator.addListener(new AnimatorListenerAdapter()
    {
      public final void onAnimationEnd(Animator paramAnonymousAnimator)
      {
        GMTrace.i(15968554188800L, 118975);
        paramView.setLayerType(0, null);
        GMTrace.o(15968554188800L, 118975);
      }
    });
    GMTrace.o(15983183921152L, 119084);
    return localObjectAnimator;
  }
  
  private void cL(View paramView)
  {
    GMTrace.i(15984928751616L, 119097);
    this.idList.clear();
    this.qWz = -1L;
    paramView.setVisibility(0);
    this.qWo = null;
    if ((boo()) && (this.qWH))
    {
      if (!this.lvJ) {
        break label101;
      }
      jdMethod_if(false);
      bok();
    }
    for (;;)
    {
      int i = 0;
      while (i < getLastVisiblePosition() - getFirstVisiblePosition())
      {
        paramView = getChildAt(i);
        if (paramView != null) {
          paramView.setVisibility(0);
        }
        i += 1;
      }
      label101:
      jdMethod_if(true);
    }
    invalidate();
    GMTrace.o(15984928751616L, 119097);
  }
  
  private Point cM(View paramView)
  {
    GMTrace.i(15985599840256L, 119102);
    int i = getPositionForView(paramView);
    int j = getColumnCount();
    paramView = new Point(i % j, i / j);
    GMTrace.o(15985599840256L, 119102);
    return paramView;
  }
  
  @TargetApi(11)
  private static AnimatorSet d(View paramView, float paramFloat1, float paramFloat2)
  {
    GMTrace.i(15985868275712L, 119104);
    ObjectAnimator localObjectAnimator = ObjectAnimator.ofFloat(paramView, "translationX", new float[] { paramFloat1, 0.0F });
    paramView = ObjectAnimator.ofFloat(paramView, "translationY", new float[] { paramFloat2, 0.0F });
    AnimatorSet localAnimatorSet = new AnimatorSet();
    localAnimatorSet.playTogether(new Animator[] { localObjectAnimator, paramView });
    GMTrace.o(15985868275712L, 119104);
    return localAnimatorSet;
  }
  
  private void dW(long paramLong)
  {
    GMTrace.i(15983586574336L, 119087);
    this.idList.clear();
    int j = dX(paramLong);
    int i = getFirstVisiblePosition();
    while (i <= getLastVisiblePosition())
    {
      if ((j != i) && (((d)getAdapter()).vl(i))) {
        this.idList.add(Long.valueOf(vq(i)));
      }
      i += 1;
    }
    GMTrace.o(15983586574336L, 119087);
  }
  
  private void dh(int paramInt1, int paramInt2)
  {
    GMTrace.i(15983318138880L, 119085);
    ((d)getAdapter()).dg(paramInt1, paramInt2);
    GMTrace.o(15983318138880L, 119085);
  }
  
  private int getColumnCount()
  {
    GMTrace.i(15983452356608L, 119086);
    int i = ((d)getAdapter()).getColumnCount();
    GMTrace.o(15983452356608L, 119086);
    return i;
  }
  
  private void init(Context paramContext)
  {
    GMTrace.i(15982781267968L, 119081);
    super.setOnScrollListener(this.qWY);
    this.qWC = ((int)(paramContext.getResources().getDisplayMetrics().density * 8.0F + 0.5F));
    this.qWy = getResources().getDimensionPixelSize(i.d.pGx);
    GMTrace.o(15982781267968L, 119081);
  }
  
  private boolean vp(int paramInt)
  {
    GMTrace.i(15984391880704L, 119093);
    if (!((d)getAdapter()).vk(paramInt))
    {
      GMTrace.o(15984391880704L, 119093);
      return false;
    }
    this.qWs = 0;
    this.qWt = 0;
    View localView = getChildAt(paramInt - getFirstVisiblePosition());
    if (localView != null)
    {
      this.qWz = getAdapter().getItemId(paramInt);
      int j = localView.getWidth();
      int i = localView.getHeight();
      int k = localView.getTop();
      int m = localView.getLeft();
      Object localObject = Bitmap.createBitmap(localView.getWidth(), localView.getHeight(), Bitmap.Config.ARGB_8888);
      localView.draw(new Canvas((Bitmap)localObject));
      localObject = new BitmapDrawable(getResources(), (Bitmap)localObject);
      this.qWq = new Rect(m, k, m + j, k + i);
      k = this.qWq.left;
      m = (int)(j * 0.05F);
      int n = this.qWq.top;
      int i1 = (int)(i * 0.05F);
      int i2 = this.qWq.right;
      j = (int)(j * 0.05F);
      int i3 = this.qWq.bottom;
      this.qWp = new Rect(k - m, n - i1, j + i2, (int)(i * 0.05F) + i3);
      this.qWr = new Rect(this.qWp);
      ((BitmapDrawable)localObject).setBounds(this.qWq);
      this.qWo = ((BitmapDrawable)localObject);
      localObject = new TypeEvaluator()
      {
        private static int c(int paramAnonymousInt1, int paramAnonymousInt2, float paramAnonymousFloat)
        {
          GMTrace.i(15978486300672L, 119049);
          paramAnonymousInt1 = (int)(paramAnonymousInt1 + (paramAnonymousInt2 - paramAnonymousInt1) * paramAnonymousFloat);
          GMTrace.o(15978486300672L, 119049);
          return paramAnonymousInt1;
        }
      };
      localObject = ObjectAnimator.ofObject(this.qWo, "bounds", (TypeEvaluator)localObject, new Object[] { this.qWp });
      ((ObjectAnimator)localObject).addUpdateListener(new ValueAnimator.AnimatorUpdateListener()
      {
        public final void onAnimationUpdate(ValueAnimator paramAnonymousValueAnimator)
        {
          GMTrace.i(15973654462464L, 119013);
          DynamicGridView.this.invalidate();
          GMTrace.o(15973654462464L, 119013);
        }
      });
      ((ObjectAnimator)localObject).addListener(new AnimatorListenerAdapter()
      {
        public final void onAnimationEnd(Animator paramAnonymousAnimator)
        {
          GMTrace.i(15979828477952L, 119059);
          DynamicGridView.a(DynamicGridView.this, false);
          DynamicGridView.b(DynamicGridView.this);
          GMTrace.o(15979828477952L, 119059);
        }
        
        public final void onAnimationStart(Animator paramAnonymousAnimator)
        {
          GMTrace.i(15979694260224L, 119058);
          DynamicGridView.a(DynamicGridView.this, true);
          DynamicGridView.b(DynamicGridView.this);
          GMTrace.o(15979694260224L, 119058);
        }
      });
      ((ObjectAnimator)localObject).setDuration(10L);
      ((ObjectAnimator)localObject).start();
      if (boo()) {
        localView.setVisibility(4);
      }
      dW(this.qWz);
      if (this.qWL != null) {
        this.qWL.vm(paramInt);
      }
      GMTrace.o(15984391880704L, 119093);
      return true;
    }
    GMTrace.o(15984391880704L, 119093);
    return false;
  }
  
  private long vq(int paramInt)
  {
    GMTrace.i(15985734057984L, 119103);
    long l = getAdapter().getItemId(paramInt);
    GMTrace.o(15985734057984L, 119103);
    return l;
  }
  
  public final int dX(long paramLong)
  {
    GMTrace.i(15983720792064L, 119088);
    View localView = dY(paramLong);
    if (localView == null)
    {
      GMTrace.o(15983720792064L, 119088);
      return -1;
    }
    int i = getPositionForView(localView);
    GMTrace.o(15983720792064L, 119088);
    return i;
  }
  
  public final View dY(long paramLong)
  {
    GMTrace.i(15983855009792L, 119089);
    int j = getFirstVisiblePosition();
    ListAdapter localListAdapter = getAdapter();
    int i = 0;
    while (i < getChildCount())
    {
      View localView = getChildAt(i);
      if (localListAdapter.getItemId(j + i) == paramLong)
      {
        GMTrace.o(15983855009792L, 119089);
        return localView;
      }
      i += 1;
    }
    GMTrace.o(15983855009792L, 119089);
    return null;
  }
  
  protected void dispatchDraw(Canvas paramCanvas)
  {
    GMTrace.i(15986002493440L, 119105);
    super.dispatchDraw(paramCanvas);
    if (this.qWo != null) {
      this.qWo.draw(paramCanvas);
    }
    GMTrace.o(15986002493440L, 119105);
  }
  
  @TargetApi(11)
  final void jdMethod_if(boolean paramBoolean)
  {
    GMTrace.i(15982647050240L, 119080);
    Object localObject = this.qWE.iterator();
    while (((Iterator)localObject).hasNext()) {
      ((Animator)((Iterator)localObject).next()).cancel();
    }
    this.qWE.clear();
    int i = 0;
    while (i < getChildCount())
    {
      localObject = getChildAt(i);
      if (localObject != null)
      {
        if (paramBoolean) {
          ((View)localObject).setRotation(0.0F);
        }
        ((View)localObject).setTag(i.f.pJF, Boolean.valueOf(false));
      }
      i += 1;
    }
    GMTrace.o(15982647050240L, 119080);
  }
  
  public boolean onInterceptTouchEvent(MotionEvent paramMotionEvent)
  {
    GMTrace.i(15983989227520L, 119090);
    boolean bool = super.onInterceptTouchEvent(paramMotionEvent);
    new StringBuilder("onInterceptTouchEvent ").append(paramMotionEvent.getAction()).append(" ").append(bool);
    GMTrace.o(15983989227520L, 119090);
    return bool;
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    GMTrace.i(15984123445248L, 119091);
    int i = paramMotionEvent.findPointerIndex(this.eA);
    new StringBuilder("onTouchEvent ").append(paramMotionEvent.getAction());
    switch (paramMotionEvent.getAction() & 0xFF)
    {
    }
    for (;;)
    {
      boolean bool = super.onTouchEvent(paramMotionEvent);
      GMTrace.o(15984123445248L, 119091);
      return bool;
      this.qWU = paramMotionEvent.getX();
      this.qWV = paramMotionEvent.getY();
      this.qWT = f.a(this, paramMotionEvent.getX(), paramMotionEvent.getY());
      new StringBuilder("onTouchEvent ").append(paramMotionEvent.getAction()).append(",downPos ").append(this.qWT);
      Object localObject;
      if ((!this.qWF) && (this.qWT >= 0))
      {
        localObject = this.qWS;
        ((d)localObject).removeMessages(1);
        ((d)localObject).sendEmptyMessageDelayed(1, 300L);
      }
      this.qWw = -1;
      this.qWx = -1;
      this.qWu = ((int)paramMotionEvent.getX());
      this.qWv = ((int)paramMotionEvent.getY());
      this.eA = paramMotionEvent.getPointerId(0);
      if ((this.lvJ) && (isEnabled()))
      {
        layoutChildren();
        vp(pointToPosition(this.qWu, this.qWv));
      }
      else if (!isEnabled())
      {
        GMTrace.o(15984123445248L, 119091);
        return false;
        this.qWU = paramMotionEvent.getX();
        this.qWV = paramMotionEvent.getY();
        if ((this.qWA) && (this.eA != -1)) {
          if ((this.qWx == -1) && (this.qWw == -1))
          {
            this.qWw = ((int)paramMotionEvent.getY(i));
            this.qWx = ((int)paramMotionEvent.getX(i));
            this.qWu = this.qWx;
            this.qWv = this.qWw;
          }
          else
          {
            this.qWW = paramMotionEvent.getRawX();
            this.qWX = paramMotionEvent.getRawY();
            this.qWw = ((int)paramMotionEvent.getY(i));
            this.qWx = ((int)paramMotionEvent.getX(i));
            i = this.qWw;
            int j = this.qWv;
            int k = this.qWx;
            int m = this.qWu;
            this.qWp.offsetTo(k - m + this.qWr.left + this.qWt, i - j + this.qWr.top + this.qWs);
            if (this.qWo != null) {
              this.qWo.setBounds(this.qWp);
            }
            invalidate();
            bor();
            this.qWB = false;
            bom();
            if (this.qWL != null)
            {
              paramMotionEvent = new Rect(this.qWp);
              paramMotionEvent.offset(0, this.qWp.height() >>> 1);
              this.qWL.k(paramMotionEvent);
            }
            GMTrace.o(15984123445248L, 119091);
            return false;
            bon();
            if ((this.qWO) && (this.qWQ != null))
            {
              localObject = this.qWQ;
              Collections.reverse(((a)localObject).qXf);
              if (!((a)localObject).qXf.isEmpty())
              {
                this.qWP.push(this.qWQ);
                this.qWQ = new a();
                continue;
                boq();
                bon();
                continue;
                if (paramMotionEvent.getPointerId((paramMotionEvent.getAction() & 0xFF00) >> 8) == this.eA) {
                  bon();
                }
              }
            }
          }
        }
      }
    }
  }
  
  public void setAdapter(ListAdapter paramListAdapter)
  {
    GMTrace.i(15984660316160L, 119095);
    super.setAdapter(paramListAdapter);
    GMTrace.o(15984660316160L, 119095);
  }
  
  public void setOnItemClickListener(AdapterView.OnItemClickListener paramOnItemClickListener)
  {
    GMTrace.i(15982378614784L, 119078);
    this.qWM = paramOnItemClickListener;
    super.setOnItemClickListener(this.qWN);
    GMTrace.o(15982378614784L, 119078);
  }
  
  public void setOnScrollListener(AbsListView.OnScrollListener paramOnScrollListener)
  {
    GMTrace.i(15982110179328L, 119076);
    this.qWJ = paramOnScrollListener;
    GMTrace.o(15982110179328L, 119076);
  }
  
  public final void vo(int paramInt)
  {
    GMTrace.i(15982244397056L, 119077);
    if (!this.qWI)
    {
      GMTrace.o(15982244397056L, 119077);
      return;
    }
    requestDisallowInterceptTouchEvent(true);
    if ((boo()) && (this.qWH)) {
      bok();
    }
    if (paramInt != -1)
    {
      this.lvJ = vp(paramInt);
      if (this.lvJ) {
        this.qWA = true;
      }
    }
    GMTrace.o(15982244397056L, 119077);
  }
  
  private static final class a
  {
    List<Pair<Integer, Integer>> qXf;
    
    a()
    {
      GMTrace.i(15973788680192L, 119014);
      this.qXf = new Stack();
      GMTrace.o(15973788680192L, 119014);
    }
    
    public final void di(int paramInt1, int paramInt2)
    {
      GMTrace.i(15973922897920L, 119015);
      this.qXf.add(new Pair(Integer.valueOf(paramInt1), Integer.valueOf(paramInt2)));
      GMTrace.o(15973922897920L, 119015);
    }
  }
  
  private final class b
    implements DynamicGridView.h
  {
    public int An;
    public int Ao;
    
    static
    {
      GMTrace.i(15975936163840L, 119030);
      if (!DynamicGridView.class.desiredAssertionStatus()) {}
      for (boolean bool = true;; bool = false)
      {
        $assertionsDisabled = bool;
        GMTrace.o(15975936163840L, 119030);
        return;
      }
    }
    
    public b(int paramInt1, int paramInt2)
    {
      GMTrace.i(15975399292928L, 119026);
      this.An = paramInt1;
      this.Ao = paramInt2;
      GMTrace.o(15975399292928L, 119026);
    }
    
    public final void dj(int paramInt1, int paramInt2)
    {
      GMTrace.i(15975533510656L, 119027);
      assert (DynamicGridView.g(DynamicGridView.this) != null);
      DynamicGridView.this.getViewTreeObserver().addOnPreDrawListener(new a(DynamicGridView.g(DynamicGridView.this), paramInt1, paramInt2));
      DynamicGridView.b(DynamicGridView.this, DynamicGridView.this.dY(DynamicGridView.h(DynamicGridView.this)));
      GMTrace.o(15975533510656L, 119027);
    }
    
    private final class a
      implements ViewTreeObserver.OnPreDrawListener
    {
      private final int UD;
      private final View qXg;
      private final int qXh;
      
      a(View paramView, int paramInt1, int paramInt2)
      {
        GMTrace.i(15967748882432L, 118969);
        this.qXg = paramView;
        this.qXh = paramInt1;
        this.UD = paramInt2;
        GMTrace.o(15967748882432L, 118969);
      }
      
      public final boolean onPreDraw()
      {
        GMTrace.i(15967883100160L, 118970);
        DynamicGridView.this.getViewTreeObserver().removeOnPreDrawListener(this);
        DynamicGridView.a(DynamicGridView.this, DynamicGridView.e(DynamicGridView.this) + DynamicGridView.b.this.Ao);
        DynamicGridView.b(DynamicGridView.this, DynamicGridView.f(DynamicGridView.this) + DynamicGridView.b.this.An);
        DynamicGridView.a(DynamicGridView.this, this.qXh, this.UD);
        this.qXg.setVisibility(0);
        if (DynamicGridView.g(DynamicGridView.this) != null) {
          DynamicGridView.g(DynamicGridView.this).setVisibility(4);
        }
        GMTrace.o(15967883100160L, 118970);
        return true;
      }
    }
  }
  
  private final class c
    implements DynamicGridView.h
  {
    public int An;
    public int Ao;
    
    public c(int paramInt1, int paramInt2)
    {
      GMTrace.i(15968688406528L, 118976);
      this.An = paramInt1;
      this.Ao = paramInt2;
      GMTrace.o(15968688406528L, 118976);
    }
    
    public final void dj(int paramInt1, int paramInt2)
    {
      GMTrace.i(15968822624256L, 118977);
      DynamicGridView.this.getViewTreeObserver().addOnPreDrawListener(new a(paramInt1, paramInt2));
      GMTrace.o(15968822624256L, 118977);
    }
    
    private final class a
      implements ViewTreeObserver.OnPreDrawListener
    {
      private final int UD;
      private final int qXh;
      
      static
      {
        GMTrace.i(15979023171584L, 119053);
        if (!DynamicGridView.class.desiredAssertionStatus()) {}
        for (boolean bool = true;; bool = false)
        {
          $assertionsDisabled = bool;
          GMTrace.o(15979023171584L, 119053);
          return;
        }
      }
      
      a(int paramInt1, int paramInt2)
      {
        GMTrace.i(15978754736128L, 119051);
        this.qXh = paramInt1;
        this.UD = paramInt2;
        GMTrace.o(15978754736128L, 119051);
      }
      
      public final boolean onPreDraw()
      {
        GMTrace.i(15978888953856L, 119052);
        DynamicGridView.this.getViewTreeObserver().removeOnPreDrawListener(this);
        DynamicGridView.a(DynamicGridView.this, DynamicGridView.e(DynamicGridView.this) + DynamicGridView.c.this.Ao);
        DynamicGridView.b(DynamicGridView.this, DynamicGridView.f(DynamicGridView.this) + DynamicGridView.c.this.An);
        DynamicGridView.a(DynamicGridView.this, this.qXh, this.UD);
        new StringBuilder("id ").append(DynamicGridView.this.dX(DynamicGridView.h(DynamicGridView.this)));
        if (DynamicGridView.g(DynamicGridView.this) == null)
        {
          GMTrace.o(15978888953856L, 119052);
          return true;
        }
        if (DynamicGridView.g(DynamicGridView.this) == null)
        {
          GMTrace.o(15978888953856L, 119052);
          return true;
        }
        assert (DynamicGridView.g(DynamicGridView.this) != null);
        DynamicGridView.g(DynamicGridView.this).setVisibility(0);
        DynamicGridView.b(DynamicGridView.this, DynamicGridView.this.dY(DynamicGridView.h(DynamicGridView.this)));
        if (DynamicGridView.g(DynamicGridView.this) == null)
        {
          GMTrace.o(15978888953856L, 119052);
          return true;
        }
        assert (DynamicGridView.g(DynamicGridView.this) != null);
        DynamicGridView.g(DynamicGridView.this).setVisibility(4);
        GMTrace.o(15978888953856L, 119052);
        return true;
      }
    }
  }
  
  private final class d
    extends Handler
  {
    private d()
    {
      GMTrace.i(15980633784320L, 119065);
      GMTrace.o(15980633784320L, 119065);
    }
    
    public final void handleMessage(Message paramMessage)
    {
      GMTrace.i(15980768002048L, 119066);
      switch (paramMessage.what)
      {
      }
      for (;;)
      {
        GMTrace.o(15980768002048L, 119066);
        return;
        paramMessage = DynamicGridView.this;
        View localView = paramMessage.getChildAt(paramMessage.qWT);
        new StringBuilder("downView ").append(localView).append(",downPos ").append(paramMessage.qWT).append(",lastTouchX ").append(paramMessage.qWU).append(",lastTouchY ").append(paramMessage.qWV);
        if ((!paramMessage.qWF) && (!paramMessage.qWG) && (f.c(localView, paramMessage.qWU, paramMessage.qWV))) {
          paramMessage.vo(paramMessage.qWT);
        }
      }
    }
  }
  
  public static abstract interface e
  {
    public abstract void boi();
    
    public abstract void k(Rect paramRect);
    
    public abstract boolean l(Rect paramRect);
    
    public abstract void vm(int paramInt);
    
    public abstract void vn(int paramInt);
  }
  
  public static abstract interface f
  {
    public abstract void boj();
  }
  
  private final class g
    implements DynamicGridView.h
  {
    private int An;
    private int Ao;
    
    public g(int paramInt1, int paramInt2)
    {
      GMTrace.i(15972714938368L, 119006);
      this.An = paramInt1;
      this.Ao = paramInt2;
      GMTrace.o(15972714938368L, 119006);
    }
    
    public final void dj(int paramInt1, int paramInt2)
    {
      GMTrace.i(15972849156096L, 119007);
      DynamicGridView.a(DynamicGridView.this, DynamicGridView.e(DynamicGridView.this) + this.Ao);
      DynamicGridView.b(DynamicGridView.this, DynamicGridView.f(DynamicGridView.this) + this.An);
      GMTrace.o(15972849156096L, 119007);
    }
  }
  
  private static abstract interface h
  {
    public abstract void dj(int paramInt1, int paramInt2);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/sns/ui/previewimageview/DynamicGridView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */