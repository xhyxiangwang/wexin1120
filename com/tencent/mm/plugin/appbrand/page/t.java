package com.tencent.mm.plugin.appbrand.page;

import android.annotation.SuppressLint;
import android.graphics.PointF;
import android.os.Looper;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.AbsoluteLayout;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.widget.b.b;
import com.tencent.mm.plugin.appbrand.widget.b.f.a;
import com.tencent.mm.plugin.appbrand.widget.input.aa;
import com.tencent.mm.plugin.appbrand.widget.input.aa.a;
import com.tencent.mm.plugin.appbrand.widget.input.e;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.bb;
import com.tencent.mm.x.q.b;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class t
{
  s jlc;
  w jmc;
  List<a> jmm;
  int jmn;
  int jmo;
  float[] jmp;
  View jmq;
  public ae mHandler;
  
  @SuppressLint({"ClickableViewAccessibility"})
  public t(s params)
  {
    GMTrace.i(16280207753216L, 121297);
    this.jmn = -1;
    this.jmo = -1;
    this.jlc = params;
    this.mHandler = new ae(Looper.getMainLooper());
    this.jmm = new LinkedList();
    this.jmq = new View(params.getContext());
    params.setOnTouchListener(new View.OnTouchListener()
    {
      public final boolean onTouch(View paramAnonymousView, MotionEvent paramAnonymousMotionEvent)
      {
        GMTrace.i(15456379338752L, 115159);
        if (paramAnonymousMotionEvent.getAction() != 0) {
          com.tencent.mm.plugin.appbrand.jsapi.k.c.a((ViewGroup)paramAnonymousView, paramAnonymousMotionEvent);
        }
        aa localaa = this.jmr;
        com.tencent.mm.plugin.appbrand.widget.b.f localf;
        Object localObject;
        label116:
        boolean bool1;
        label127:
        View localView;
        int j;
        int i;
        if (paramAnonymousMotionEvent != null)
        {
          paramAnonymousView = (e)localaa.jDR.ca(localaa.jlc);
          if (paramAnonymousView != null)
          {
            localf = paramAnonymousView.jAZ;
            if (localf.jAm.onFilterTouchEventForSecurity(paramAnonymousMotionEvent)) {
              if (paramAnonymousMotionEvent.getActionMasked() == 0)
              {
                localObject = new com.tencent.mm.plugin.appbrand.widget.b.c(localf.jAm);
                if (paramAnonymousMotionEvent.getActionMasked() != 0) {
                  break label383;
                }
                paramAnonymousView = new f.a(paramAnonymousMotionEvent.getDownTime(), paramAnonymousMotionEvent.getEventTime());
                localf.jAo = paramAnonymousView;
                paramAnonymousView = null;
                bool1 = false;
                if (!((Iterator)localObject).hasNext()) {
                  break label430;
                }
                localView = (View)((Iterator)localObject).next();
                j = paramAnonymousMotionEvent.getActionIndex();
                if (!localf.jAm.isMotionEventSplittingEnabled()) {
                  break label388;
                }
                i = 1 << paramAnonymousMotionEvent.getPointerId(j);
                label176:
                float f1 = paramAnonymousMotionEvent.getX(j);
                float f2 = paramAnonymousMotionEvent.getY(j);
                if (paramAnonymousMotionEvent.getActionMasked() != 0) {
                  break label409;
                }
                if ((localView.getVisibility() != 0) && (localView.getAnimation() == null)) {
                  break label394;
                }
                j = 1;
                label217:
                if (j == 0) {
                  break label398;
                }
                Boolean localBoolean = (Boolean)com.tencent.mm.plugin.appbrand.n.f.a("isTransformedTouchPointInView", localf.jAm, new Class[] { Float.TYPE, Float.TYPE, View.class, PointF.class }, new Object[] { Float.valueOf(f1), Float.valueOf(f2), localView, null }, Boolean.valueOf(false));
                if ((localBoolean == null) || (!localBoolean.booleanValue())) {
                  break label400;
                }
                j = 1;
                label311:
                if ((j == 0) || ((paramAnonymousView != null) && (!com.tencent.mm.plugin.appbrand.widget.b.a.bM(localView)))) {
                  break label404;
                }
                if (!com.tencent.mm.plugin.appbrand.widget.b.a.a(localf.jAm, paramAnonymousMotionEvent, localView, i)) {
                  break label745;
                }
                if (paramAnonymousView != null) {
                  break label406;
                }
                paramAnonymousView = localView;
                label351:
                localf.jAn.addLast(localView);
                bool1 |= true;
              }
            }
          }
        }
        label383:
        label388:
        label394:
        label398:
        label400:
        label404:
        label406:
        label409:
        label430:
        label543:
        label577:
        label662:
        label735:
        label745:
        for (;;)
        {
          break label127;
          localObject = localf.jAn.iterator();
          break;
          paramAnonymousView = null;
          break label116;
          i = -1;
          break label176;
          j = 0;
          break label217;
          break label127;
          j = 0;
          break label311;
          break label127;
          break label351;
          bool1 |= com.tencent.mm.plugin.appbrand.widget.b.a.a(localf.jAm, paramAnonymousMotionEvent, localView, i);
          break label127;
          boolean bool2 = bool1;
          switch (paramAnonymousMotionEvent.getActionMasked())
          {
          default: 
            bool2 = bool1;
          case 2: 
            b.a("MicroMsg.AppBrand.InputTouchDuplicateDispatcher", "[textscroll] handled | " + bool2, paramAnonymousMotionEvent);
            if (2 == paramAnonymousMotionEvent.getActionMasked())
            {
              if ((bool2) && (!localaa.jDO))
              {
                paramAnonymousView = (q)localaa.jDS.ca(localaa.jlc);
                if (paramAnonymousView != null)
                {
                  if (paramAnonymousView.jlA) {
                    break;
                  }
                  bool1 = true;
                  localaa.jDP = bool1;
                  paramAnonymousView.cv(false);
                  paramAnonymousView.requestDisallowInterceptTouchEvent(true);
                  localaa.jDO = true;
                }
              }
              if (!bool2) {
                break label662;
              }
              localaa.jDQ = true;
            }
            else
            {
              bool1 = bool2;
              switch (paramAnonymousMotionEvent.getActionMasked())
              {
              default: 
                bool1 = bool2;
              }
            }
            break;
          }
          for (;;)
          {
            if (!bool1) {
              break label735;
            }
            GMTrace.o(15456379338752L, 115159);
            return true;
            localf.jAn.clear();
            bool2 = bool1;
            break;
            bool2 = false;
            break;
            bool1 = false;
            break label543;
            if (!localaa.jDQ) {
              break label577;
            }
            localaa.jDQ = false;
            break label577;
            if (localaa.jDO)
            {
              paramAnonymousView = (q)localaa.jDS.ca(localaa.jlc);
              if (paramAnonymousView != null) {
                paramAnonymousView.cv(localaa.jDP);
              }
              localaa.jDO = false;
            }
            bool1 = false;
            continue;
            bool1 = false;
          }
          GMTrace.o(15456379338752L, 115159);
          return false;
        }
      }
    });
    GMTrace.o(16280207753216L, 121297);
  }
  
  private void a(View paramView, int paramInt1, int paramInt2, int paramInt3)
  {
    GMTrace.i(19893483208704L, 148218);
    paramView = new a(paramView, paramInt1, paramInt2, paramInt3);
    this.jmm.add(paramView);
    GMTrace.o(19893483208704L, 148218);
  }
  
  private void a(a parama)
  {
    GMTrace.i(15461211176960L, 115195);
    this.jmm.removeAll(b(parama));
    GMTrace.o(15461211176960L, 115195);
  }
  
  private List<a> b(a parama)
  {
    GMTrace.i(15461345394688L, 115196);
    LinkedList localLinkedList = new LinkedList();
    Iterator localIterator = this.jmm.iterator();
    while (localIterator.hasNext())
    {
      a locala = (a)localIterator.next();
      if (locala.jmy == parama.id) {
        localLinkedList.addAll(b(locala));
      }
    }
    localLinkedList.add(parama);
    GMTrace.o(15461345394688L, 115196);
    return localLinkedList;
  }
  
  private int bt(int paramInt1, int paramInt2)
  {
    GMTrace.i(19893348990976L, 148217);
    Iterator localIterator = this.jmm.iterator();
    int i = 0;
    if (localIterator.hasNext())
    {
      a locala = (a)localIterator.next();
      if ((paramInt1 != locala.jmy) || (paramInt2 < locala.z)) {
        break label78;
      }
      i += 1;
    }
    label78:
    for (;;)
    {
      break;
      GMTrace.o(19893348990976L, 148217);
      return i;
    }
  }
  
  public final boolean a(int paramInt1, float[] paramArrayOfFloat, int paramInt2)
  {
    GMTrace.i(20370627231744L, 151773);
    if (jn(paramInt1))
    {
      GMTrace.o(20370627231744L, 151773);
      return true;
    }
    a locala = jj(paramInt1);
    if (locala == null)
    {
      GMTrace.o(20370627231744L, 151773);
      return false;
    }
    View localView = (View)locala.jmx.get();
    ViewGroup localViewGroup = jg(locala.jmy);
    if (localViewGroup == null)
    {
      GMTrace.o(20370627231744L, 151773);
      return false;
    }
    if (paramInt2 >= 0) {
      if (paramInt2 != 0) {
        break label125;
      }
    }
    label125:
    for (int i = 0;; i = 8)
    {
      localView.setVisibility(i);
      if ((paramArrayOfFloat != null) && (paramArrayOfFloat.length >= 5)) {
        break;
      }
      GMTrace.o(20370627231744L, 151773);
      return true;
    }
    float f1 = paramArrayOfFloat[0];
    float f2 = paramArrayOfFloat[1];
    float f3 = paramArrayOfFloat[2];
    float f4 = paramArrayOfFloat[3];
    i = (int)paramArrayOfFloat[4];
    this.jmm.remove(locala);
    if (locala.z != i)
    {
      localViewGroup.removeView(localView);
      if (a(localView, paramInt1, locala.jmy, paramArrayOfFloat, paramInt2))
      {
        GMTrace.o(20370627231744L, 151773);
        return true;
      }
      a(locala);
      GMTrace.o(20370627231744L, 151773);
      return false;
    }
    paramArrayOfFloat = localView.getLayoutParams();
    paramArrayOfFloat.width = ((int)f3);
    paramArrayOfFloat.height = ((int)f4);
    localView.setX(f1);
    localView.setY(f2);
    localView.requestLayout();
    a(localView, paramInt1, locala.jmy, i);
    paramInt1 = localViewGroup.indexOfChild(this.jmq);
    if ((localViewGroup.indexOfChild(localView) == -1) && (paramInt1 != -1))
    {
      localViewGroup.addView(localView, paramInt1);
      localViewGroup.removeView(this.jmq);
    }
    GMTrace.o(20370627231744L, 151773);
    return true;
  }
  
  public final boolean a(View paramView, int paramInt1, int paramInt2, float[] paramArrayOfFloat, int paramInt3)
  {
    GMTrace.i(20370493014016L, 151772);
    if ((paramView == null) || (paramArrayOfFloat == null) || (paramArrayOfFloat.length < 5))
    {
      GMTrace.o(20370493014016L, 151772);
      return false;
    }
    ViewGroup localViewGroup = jg(paramInt2);
    if (localViewGroup == null)
    {
      GMTrace.o(20370493014016L, 151772);
      return false;
    }
    if (jl(paramInt1) != null)
    {
      GMTrace.o(20370493014016L, 151772);
      return false;
    }
    float f1 = paramArrayOfFloat[0];
    float f2 = paramArrayOfFloat[1];
    float f3 = paramArrayOfFloat[2];
    float f4 = paramArrayOfFloat[3];
    int k = (int)paramArrayOfFloat[4];
    paramArrayOfFloat = new ViewGroup.LayoutParams((int)f3, (int)f4);
    int j = bt(paramInt2, k);
    int i = j;
    if (j < 0) {
      i = 0;
    }
    if (i > localViewGroup.getChildCount()) {
      i = localViewGroup.getChildCount();
    }
    for (;;)
    {
      if (paramInt3 >= 0) {
        if (paramInt3 != 0) {
          break label218;
        }
      }
      label218:
      for (paramInt3 = 0;; paramInt3 = 8)
      {
        paramView.setVisibility(paramInt3);
        localViewGroup.addView(paramView, i, paramArrayOfFloat);
        paramView.setX(f1);
        paramView.setY(f2);
        a(paramView, paramInt1, paramInt2, k);
        GMTrace.o(20370493014016L, 151772);
        return true;
      }
    }
  }
  
  final ViewGroup jg(int paramInt)
  {
    GMTrace.i(15460808523776L, 115192);
    if (paramInt == 0)
    {
      localObject = this.jlc.getTopView();
      if ((localObject instanceof AbsoluteLayout))
      {
        GMTrace.o(15460808523776L, 115192);
        return (ViewGroup)localObject;
      }
      GMTrace.o(15460808523776L, 115192);
      return null;
    }
    Object localObject = jj(paramInt);
    if (localObject == null)
    {
      GMTrace.o(15460808523776L, 115192);
      return null;
    }
    localObject = (View)((a)localObject).jmx.get();
    if ((localObject instanceof com.tencent.mm.plugin.appbrand.jsapi.c.a))
    {
      localObject = (ViewGroup)localObject;
      GMTrace.o(15460808523776L, 115192);
      return (ViewGroup)localObject;
    }
    GMTrace.o(15460808523776L, 115192);
    return null;
  }
  
  public final boolean jh(final int paramInt)
  {
    GMTrace.i(15460942741504L, 115193);
    bb local3 = new bb(Boolean.valueOf(false), paramInt) {};
    if (Thread.currentThread() == Looper.getMainLooper().getThread())
    {
      bool = ((Boolean)local3.b(null)).booleanValue();
      GMTrace.o(15460942741504L, 115193);
      return bool;
    }
    boolean bool = ((Boolean)local3.b(this.mHandler)).booleanValue();
    GMTrace.o(15460942741504L, 115193);
    return bool;
  }
  
  public final boolean ji(int paramInt)
  {
    GMTrace.i(19893214773248L, 148216);
    a locala = jj(paramInt);
    if (locala == null)
    {
      GMTrace.o(19893214773248L, 148216);
      return false;
    }
    jo(paramInt);
    a(locala);
    ViewGroup localViewGroup = jg(locala.jmy);
    if (localViewGroup != null)
    {
      this.jmm.remove(locala);
      localViewGroup.removeView((View)locala.jmx.get());
      GMTrace.o(19893214773248L, 148216);
      return true;
    }
    GMTrace.o(19893214773248L, 148216);
    return false;
  }
  
  public final a jj(int paramInt)
  {
    GMTrace.i(15461479612416L, 115197);
    Iterator localIterator = this.jmm.iterator();
    while (localIterator.hasNext())
    {
      a locala = (a)localIterator.next();
      if (locala.id == paramInt)
      {
        GMTrace.o(15461479612416L, 115197);
        return locala;
      }
    }
    GMTrace.o(15461479612416L, 115197);
    return null;
  }
  
  public final boolean jk(int paramInt)
  {
    GMTrace.i(15461613830144L, 115198);
    if (jj(paramInt) != null)
    {
      GMTrace.o(15461613830144L, 115198);
      return true;
    }
    GMTrace.o(15461613830144L, 115198);
    return false;
  }
  
  public final View jl(int paramInt)
  {
    GMTrace.i(15461748047872L, 115199);
    Object localObject = jj(paramInt);
    if (localObject == null)
    {
      GMTrace.o(15461748047872L, 115199);
      return null;
    }
    localObject = (View)((a)localObject).jmx.get();
    GMTrace.o(15461748047872L, 115199);
    return (View)localObject;
  }
  
  public final q.b jm(int paramInt)
  {
    GMTrace.i(15461882265600L, 115200);
    q.b localb = com.tencent.mm.x.q.Aw().gh(hashCode() + "#" + paramInt);
    GMTrace.o(15461882265600L, 115200);
    return localb;
  }
  
  public final boolean jn(int paramInt)
  {
    GMTrace.i(17297309696000L, 128875);
    if ((this.jmo == paramInt) || (this.jmn == paramInt))
    {
      GMTrace.o(17297309696000L, 128875);
      return true;
    }
    GMTrace.o(17297309696000L, 128875);
    return false;
  }
  
  public final boolean jo(int paramInt)
  {
    GMTrace.i(17297443913728L, 128876);
    if (paramInt != this.jmn)
    {
      GMTrace.o(17297443913728L, 128876);
      return false;
    }
    if (jj(paramInt) == null)
    {
      GMTrace.o(17297443913728L, 128876);
      return false;
    }
    this.jlc.Zq();
    GMTrace.o(17297443913728L, 128876);
    return true;
  }
  
  public final q.b t(int paramInt, boolean paramBoolean)
  {
    GMTrace.i(15462016483328L, 115201);
    q.b localb = com.tencent.mm.x.q.Aw().n(hashCode() + "#" + paramInt, paramBoolean);
    GMTrace.o(15462016483328L, 115201);
    return localb;
  }
  
  private static final class a
  {
    int id;
    WeakReference<View> jmx;
    public int jmy;
    int z;
    
    public a(View paramView, int paramInt1, int paramInt2, int paramInt3)
    {
      GMTrace.i(19900462530560L, 148270);
      this.jmx = new WeakReference(paramView);
      this.id = paramInt1;
      this.jmy = paramInt2;
      this.z = paramInt3;
      GMTrace.o(19900462530560L, 148270);
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/page/t.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */