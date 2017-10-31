package com.tencent.mm.plugin.appbrand.page;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.os.Looper;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.config.a;
import com.tencent.mm.plugin.appbrand.config.a.d;
import com.tencent.mm.plugin.appbrand.f;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.util.Iterator;
import java.util.LinkedList;

public final class l
  extends FrameLayout
{
  private String iqL;
  public f irS;
  public LinkedList<j> jkl;
  private LinkedList<j> jkm;
  private AppBrandPageView jkn;
  boolean jko;
  private long jkp;
  public m jkq;
  private boolean jkr;
  public a jks;
  
  public l(Context paramContext, f paramf)
  {
    super(paramContext);
    GMTrace.i(15455708250112L, 115154);
    this.jkl = new LinkedList();
    this.jkm = new LinkedList();
    this.jko = false;
    this.jkp = 0L;
    this.jkr = false;
    this.irS = paramf;
    this.iqL = paramf.iqL;
    this.jkq = new m(this.irS);
    GMTrace.o(15455708250112L, 115154);
  }
  
  private void a(Animator paramAnimator, final Runnable paramRunnable)
  {
    GMTrace.i(10227122438144L, 76198);
    paramAnimator.addListener(new AnimatorListenerAdapter()
    {
      public final void onAnimationEnd(Animator paramAnonymousAnimator)
      {
        GMTrace.i(20351970967552L, 151634);
        if (paramRunnable != null) {
          paramRunnable.run();
        }
        GMTrace.o(20351970967552L, 151634);
      }
    });
    paramAnimator.start();
    GMTrace.o(10227122438144L, 76198);
  }
  
  private void a(j paramj)
  {
    GMTrace.i(10226451349504L, 76193);
    paramj.setVisibility(8);
    paramj.YN();
    removeView(paramj);
    paramj.cleanup();
    GMTrace.o(10226451349504L, 76193);
  }
  
  private void a(j paramj1, j paramj2)
  {
    GMTrace.i(10225914478592L, 76189);
    Iterator localIterator = this.jkl.iterator();
    int i = 0;
    while (localIterator.hasNext())
    {
      j localj = (j)localIterator.next();
      if (localj == paramj1)
      {
        i = 1;
      }
      else
      {
        if (localj == paramj2) {
          break;
        }
        if (i != 0)
        {
          a(localj);
          localIterator.remove();
        }
      }
    }
    GMTrace.o(10225914478592L, 76189);
  }
  
  private void a(final j paramj1, final j paramj2, x paramx)
  {
    GMTrace.i(10226048696320L, 76190);
    this.jkl.remove(paramj2);
    if (!paramj2.jkh)
    {
      Runnable local5 = new Runnable()
      {
        public final void run()
        {
          GMTrace.i(10235980808192L, 76264);
          l.b(l.this, paramj2);
          GMTrace.o(10235980808192L, 76264);
        }
      };
      ObjectAnimator localObjectAnimator = ObjectAnimator.ofFloat(paramj2, "translationX", new float[] { 0.0F, paramj2.getWidth() });
      localObjectAnimator.setDuration(250L);
      a(localObjectAnimator, local5);
    }
    for (;;)
    {
      w.i("MicroMsg.AppBrandPageContainer", "switchPageClear, in: %s out: %s", new Object[] { paramj1.YP(), paramj2.YP() });
      paramj1.a(paramx);
      paramj1.YL();
      if (paramj2.jkh) {
        break;
      }
      paramj2 = new Runnable()
      {
        public final void run()
        {
          GMTrace.i(10268864151552L, 76509);
          paramj1.YU();
          GMTrace.o(10268864151552L, 76509);
        }
      };
      paramj1 = ObjectAnimator.ofFloat(paramj1, "translationX", new float[] { -(paramj1.getWidth() * 0.25F), 0.0F });
      paramj1.setDuration(250L);
      a(paramj1, paramj2);
      GMTrace.o(10226048696320L, 76190);
      return;
      a(paramj2);
    }
    paramj1.YU();
    GMTrace.o(10226048696320L, 76190);
  }
  
  private void a(final j paramj, boolean paramBoolean)
  {
    for (;;)
    {
      try
      {
        GMTrace.i(17293685817344L, 128848);
        if (paramj == null)
        {
          GMTrace.o(17293685817344L, 128848);
          return;
        }
        this.jkl.remove(paramj);
        this.jkl.push(paramj);
        this.jkm.remove(paramj);
        paramj.bringToFront();
        requestLayout();
        invalidate();
        paramj.YL();
        Runnable local8 = new Runnable()
        {
          public final void run()
          {
            GMTrace.i(16180483981312L, 120554);
            l.this.Zb();
            paramj.YU();
            GMTrace.o(16180483981312L, 120554);
          }
        };
        if (paramBoolean)
        {
          paramj = ObjectAnimator.ofFloat(paramj, "translationX", new float[] { paramj.getWidth(), 0.0F });
          paramj.setDuration(250L);
          a(paramj, local8);
          GMTrace.o(17293685817344L, 128848);
          continue;
        }
        local8.run();
      }
      finally {}
      GMTrace.o(17293685817344L, 128848);
    }
  }
  
  private void b(final String paramString, final x paramx)
  {
    GMTrace.i(10225511825408L, 76186);
    w.d("MicroMsg.AppBrandPageContainer", "navigateToNext: %s, Staging Count: %d", new Object[] { paramString, Integer.valueOf(this.jkm.size()) });
    boolean bool;
    final Object localObject;
    label67:
    final boolean[] arrayOfBoolean;
    final Runnable local2;
    if (paramx == x.jmF)
    {
      bool = true;
      if (!bool) {
        break label276;
      }
      localObject = new d(getContext(), this);
      this.jkm.push(localObject);
      addView((View)localObject, 0);
      arrayOfBoolean = new boolean[1];
      arrayOfBoolean[0] = false;
      local2 = new Runnable()
      {
        public final void run()
        {
          GMTrace.i(20352239403008L, 151636);
          arrayOfBoolean[0] = true;
          if (l.this.getPageCount() == 0)
          {
            GMTrace.o(20352239403008L, 151636);
            return;
          }
          if (l.a(l.this).isEmpty()) {}
          for (j localj = null;; localj = (j)l.a(l.this).getFirst())
          {
            if ((paramx == x.jmF) || (paramx == x.jmD) || (paramx == x.jmE)) {
              l.a(l.this, localj);
            }
            boolean bool1 = l.b(paramx);
            boolean bool2 = l.c(paramx);
            l.a(l.this, localj, bool1, bool2);
            l.a(l.this, localObject, bool1);
            if (localj != null) {
              l.b(l.this).b(localj.YO(), paramString);
            }
            l.b(l.this).d(localObject.YO());
            GMTrace.o(20352239403008L, 151636);
            return;
          }
        }
      };
      if (this.jkl.size() != 0) {
        break label293;
      }
      postDelayed(local2, 5000L);
    }
    for (;;)
    {
      final long l = System.currentTimeMillis();
      ((j)localObject).YO().a(new AppBrandPageView.e()
      {
        public final void onReady()
        {
          int j = 2;
          GMTrace.i(20352507838464L, 151638);
          localObject.YO().b(this);
          if (arrayOfBoolean[0] == 0)
          {
            l.this.removeCallbacks(local2);
            l.this.post(local2);
          }
          l.c(l.this);
          long l = System.currentTimeMillis() - l;
          m localm = l.b(l.this);
          x localx = this.jkw;
          int i;
          switch (m.4.jkR[localx.ordinal()])
          {
          default: 
            i = 2;
            localm.g(l, i);
            g.paX.a(390L, 0L, 1L, false);
            i = j;
            switch ((int)l / 250)
            {
            default: 
              i = 7;
            }
            break;
          }
          for (;;)
          {
            g.paX.a(390L, i, 1L, false);
            w.i("MicroMsg.AppBrandPageContainer", "onReady received, time: %d", new Object[] { Long.valueOf(l) });
            GMTrace.o(20352507838464L, 151638);
            return;
            i = 1;
            break;
            i = 3;
            break;
            i = 1;
            continue;
            i = 3;
            continue;
            i = 4;
            continue;
            i = 5;
            continue;
            i = 6;
          }
        }
      });
      ((j)localObject).loadUrl(paramString);
      ((j)localObject).a(paramx);
      GMTrace.o(10225511825408L, 76186);
      return;
      if ((paramx == x.jmD) || (paramx == x.jmE))
      {
        bool = this.irS.iqP.iHB.oP(paramString);
        break;
      }
      int j = this.jkl.size();
      if (paramx == x.jmC) {}
      for (int i = 1;; i = 0)
      {
        if ((!this.irS.iqP.iHB.oP(paramString)) || (j + 1 - i != 1)) {
          break label270;
        }
        bool = true;
        break;
      }
      label270:
      bool = false;
      break;
      label276:
      localObject = new r(getContext(), this);
      break label67;
      label293:
      postDelayed(local2, 500L);
    }
  }
  
  private void rs(final String paramString)
  {
    GMTrace.i(10225646043136L, 76187);
    final AppBrandPageView[] arrayOfAppBrandPageView = new AppBrandPageView[1];
    final Object localObject = new j[1];
    AppBrandPageView.b local4 = new AppBrandPageView.b()
    {
      public final void VS()
      {
        GMTrace.i(20351031443456L, 151627);
        arrayOfAppBrandPageView[0].b(this);
        if (!bg.mZ(arrayOfAppBrandPageView[0].jlc.jlV)) {
          l.b(l.this).b(arrayOfAppBrandPageView[0], paramString);
        }
        l.b(l.this).d(localObject[0].YO());
        GMTrace.o(20351031443456L, 151627);
      }
    };
    j localj = rt(paramString);
    localObject[0] = localj;
    if (localj != null)
    {
      localObject = localj.YO();
      arrayOfAppBrandPageView[0] = localObject;
      ((AppBrandPageView)localObject).a(local4);
      localj.loadUrl(paramString);
      localj.a(x.jmF);
      localj.YU();
      GMTrace.o(10225646043136L, 76187);
      return;
    }
    localj = ru(paramString);
    localObject[0] = localj;
    if (localj != null)
    {
      localObject = localj.YO();
      arrayOfAppBrandPageView[0] = localObject;
      ((AppBrandPageView)localObject).a(local4);
      localj.loadUrl(paramString);
      paramString = (j)this.jkl.getFirst();
      a(paramString, localj);
      a(localj, paramString, x.jmF);
    }
    GMTrace.o(10225646043136L, 76187);
  }
  
  private j rt(String paramString)
  {
    GMTrace.i(10226182914048L, 76191);
    if (this.jkl.size() == 0)
    {
      GMTrace.o(10226182914048L, 76191);
      return null;
    }
    if (((this.jkl.getFirst() instanceof d)) && (((j)this.jkl.getFirst()).rn(paramString)))
    {
      paramString = (j)this.jkl.getFirst();
      GMTrace.o(10226182914048L, 76191);
      return paramString;
    }
    GMTrace.o(10226182914048L, 76191);
    return null;
  }
  
  private j ru(String paramString)
  {
    GMTrace.i(10226317131776L, 76192);
    if (this.jkl.size() < 2)
    {
      GMTrace.o(10226317131776L, 76192);
      return null;
    }
    int i = 1;
    while (i < this.jkl.size())
    {
      if (((this.jkl.get(i) instanceof d)) && (((j)this.jkl.get(i)).rn(paramString)))
      {
        paramString = (j)this.jkl.get(i);
        GMTrace.o(10226317131776L, 76192);
        return paramString;
      }
      i += 1;
    }
    GMTrace.o(10226317131776L, 76192);
    return null;
  }
  
  public final void N(final String paramString, final boolean paramBoolean)
  {
    GMTrace.i(17293551599616L, 128847);
    runOnUiThread(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(10224572301312L, 76179);
        l locall = l.this;
        String str = paramString;
        if (paramBoolean) {}
        for (x localx = x.jmE;; localx = x.jmD)
        {
          l.a(locall, str, localx);
          GMTrace.o(10224572301312L, 76179);
          return;
        }
      }
    });
    GMTrace.o(17293551599616L, 128847);
  }
  
  public final void YY()
  {
    GMTrace.i(10225243389952L, 76184);
    runOnUiThread(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(10236517679104L, 76268);
        l.this.ja(1);
        GMTrace.o(10236517679104L, 76268);
      }
    });
    GMTrace.o(10225243389952L, 76184);
  }
  
  /* Error */
  public final j YZ()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: ldc2_w 589
    //   5: ldc_w 591
    //   8: invokestatic 78	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   11: aload_0
    //   12: getfield 87	com/tencent/mm/plugin/appbrand/page/l:jkm	Ljava/util/LinkedList;
    //   15: invokevirtual 594	java/util/LinkedList:isEmpty	()Z
    //   18: ifne +27 -> 45
    //   21: aload_0
    //   22: getfield 87	com/tencent/mm/plugin/appbrand/page/l:jkm	Ljava/util/LinkedList;
    //   25: invokevirtual 293	java/util/LinkedList:getFirst	()Ljava/lang/Object;
    //   28: checkcast 143	com/tencent/mm/plugin/appbrand/page/j
    //   31: astore_1
    //   32: ldc2_w 589
    //   35: ldc_w 591
    //   38: invokestatic 110	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   41: aload_0
    //   42: monitorexit
    //   43: aload_1
    //   44: areturn
    //   45: aload_0
    //   46: getfield 85	com/tencent/mm/plugin/appbrand/page/l:jkl	Ljava/util/LinkedList;
    //   49: invokevirtual 293	java/util/LinkedList:getFirst	()Ljava/lang/Object;
    //   52: checkcast 143	com/tencent/mm/plugin/appbrand/page/j
    //   55: astore_1
    //   56: ldc2_w 589
    //   59: ldc_w 591
    //   62: invokestatic 110	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   65: goto -24 -> 41
    //   68: astore_1
    //   69: aload_0
    //   70: monitorexit
    //   71: aload_1
    //   72: athrow
    //   73: astore_1
    //   74: ldc -41
    //   76: aload_1
    //   77: invokevirtual 597	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   80: invokestatic 599	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   83: aconst_null
    //   84: astore_1
    //   85: goto -29 -> 56
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	88	0	this	l
    //   31	25	1	localj	j
    //   68	4	1	localObject1	Object
    //   73	4	1	localException	Exception
    //   84	1	1	localObject2	Object
    // Exception table:
    //   from	to	target	type
    //   2	41	68	finally
    //   45	56	68	finally
    //   56	65	68	finally
    //   74	83	68	finally
    //   45	56	73	java/lang/Exception
  }
  
  public final AppBrandPageView Za()
  {
    GMTrace.i(10226854002688L, 76196);
    if (this.jkn == null)
    {
      localAppBrandPageView = new AppBrandPageView(getContext(), this.irS);
      GMTrace.o(10226854002688L, 76196);
      return localAppBrandPageView;
    }
    AppBrandPageView localAppBrandPageView = this.jkn;
    this.jkn = null;
    localAppBrandPageView.jjV.setVisibility(0);
    removeView(localAppBrandPageView.jjV);
    GMTrace.o(10226854002688L, 76196);
    return localAppBrandPageView;
  }
  
  public final void Zb()
  {
    GMTrace.i(10226988220416L, 76197);
    postDelayed(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(20350763008000L, 151625);
        if (l.d(l.this) != null)
        {
          GMTrace.o(20350763008000L, 151625);
          return;
        }
        long l = System.currentTimeMillis();
        AppBrandPageView localAppBrandPageView = new AppBrandPageView(l.this.getContext(), l.e(l.this));
        localAppBrandPageView.jjV.setVisibility(4);
        l.this.addView(localAppBrandPageView.jjV, 0);
        l.a(l.this, localAppBrandPageView);
        w.i("MicroMsg.AppBrandPageContainer", "preloadNextPageView: %d", new Object[] { Long.valueOf(System.currentTimeMillis() - l) });
        GMTrace.o(20350763008000L, 151625);
      }
    }, 200L);
    GMTrace.o(10226988220416L, 76197);
  }
  
  public final void c(final String paramString1, final String paramString2, final int[] paramArrayOfInt)
  {
    GMTrace.i(17293820035072L, 128849);
    runOnUiThread(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(16280744624128L, 121301);
        l.a(l.this, paramString1, paramString2, paramArrayOfInt);
        GMTrace.o(16280744624128L, 121301);
      }
    });
    GMTrace.o(17293820035072L, 128849);
  }
  
  public final void cleanup()
  {
    GMTrace.i(10226719784960L, 76195);
    Object localObject = this.jkq;
    j localj = YZ();
    if ((localj == null) || (((m)localObject).jkg)) {}
    for (;;)
    {
      localObject = this.jkl.iterator();
      while (((Iterator)localObject).hasNext())
      {
        localj = (j)((Iterator)localObject).next();
        localj.YN();
        localj.cleanup();
      }
      ((m)localObject).b(localj);
    }
    localObject = this.jkm.iterator();
    while (((Iterator)localObject).hasNext())
    {
      localj = (j)((Iterator)localObject).next();
      localj.YN();
      localj.cleanup();
    }
    if (this.jkn != null) {
      this.jkn.cleanup();
    }
    this.jkl.clear();
    this.jkm.clear();
    GMTrace.o(10226719784960L, 76195);
  }
  
  public final int getPageCount()
  {
    GMTrace.i(17293417381888L, 128846);
    int i = this.jkl.size();
    int j = this.jkm.size();
    GMTrace.o(17293417381888L, 128846);
    return i + j;
  }
  
  public final void ja(final int paramInt)
  {
    GMTrace.i(10225377607680L, 76185);
    runOnUiThread(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(10217592979456L, 76127);
        l.a(l.this, paramInt);
        GMTrace.o(10217592979456L, 76127);
      }
    });
    GMTrace.o(10225377607680L, 76185);
  }
  
  public final boolean onInterceptTouchEvent(MotionEvent paramMotionEvent)
  {
    GMTrace.i(10224840736768L, 76181);
    boolean bool = super.onInterceptTouchEvent(paramMotionEvent);
    GMTrace.o(10224840736768L, 76181);
    return bool;
  }
  
  public final void rq(final String paramString)
  {
    GMTrace.i(15455842467840L, 115155);
    runOnUiThread(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(10240141557760L, 76295);
        l.a(l.this, paramString, x.jmC);
        GMTrace.o(10240141557760L, 76295);
      }
    });
    GMTrace.o(15455842467840L, 115155);
  }
  
  public final void rr(final String paramString)
  {
    GMTrace.i(10225109172224L, 76183);
    runOnUiThread(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(10231014752256L, 76227);
        l.a(l.this, paramString, x.jmF);
        GMTrace.o(10231014752256L, 76227);
      }
    });
    GMTrace.o(10225109172224L, 76183);
  }
  
  public final void runOnUiThread(Runnable paramRunnable)
  {
    GMTrace.i(10224974954496L, 76182);
    if (Looper.getMainLooper().getThread() == Thread.currentThread())
    {
      paramRunnable.run();
      GMTrace.o(10224974954496L, 76182);
      return;
    }
    post(paramRunnable);
    GMTrace.o(10224974954496L, 76182);
  }
  
  public static abstract interface a
  {
    public abstract void RK();
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/page/l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */