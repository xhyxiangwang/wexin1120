package com.tencent.mm.plugin.appbrand.page;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.os.Build.VERSION;
import android.os.Looper;
import android.os.SystemClock;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.Window;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo;
import com.tencent.mm.plugin.appbrand.config.AppBrandInitConfig;
import com.tencent.mm.plugin.appbrand.config.AppBrandSysConfig;
import com.tencent.mm.plugin.appbrand.d;
import com.tencent.mm.plugin.appbrand.d.c;
import com.tencent.mm.plugin.appbrand.jsapi.AppBrandJSInterface;
import com.tencent.mm.plugin.appbrand.p.c;
import com.tencent.mm.plugin.appbrand.p.f;
import com.tencent.mm.plugin.appbrand.p.g;
import com.tencent.mm.plugin.appbrand.p.i;
import com.tencent.mm.plugin.appbrand.performance.AppBrandPerformanceManager;
import com.tencent.mm.plugin.appbrand.report.AppBrandStatObject;
import com.tencent.mm.plugin.appbrand.widget.AppBrandOptionButton;
import com.tencent.mm.plugin.appbrand.widget.a.2;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.bb;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.p;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

@SuppressLint({"ViewConstructor"})
public final class AppBrandPageView
  extends com.tencent.mm.plugin.appbrand.jsapi.c
{
  public boolean UF;
  public String iqL;
  public com.tencent.mm.plugin.appbrand.f irS;
  private AppBrandJSInterface irT;
  public LinearLayout jjV;
  public FrameLayout jjY;
  public Set<e> jkT;
  public Set<b> jkU;
  public Set<d> jkV;
  public Set<c> jkW;
  public Set<a> jkX;
  public com.tencent.mm.plugin.appbrand.widget.a jkY;
  private FrameLayout jkZ;
  public final List<com.tencent.mm.plugin.appbrand.menu.k> jkj;
  public t jla;
  public com.tencent.mm.plugin.appbrand.widget.input.e jlb;
  public s jlc;
  public q jld;
  public com.tencent.mm.plugin.appbrand.widget.f jle;
  private FrameLayout.LayoutParams jlf;
  boolean jlg;
  public boolean jlh;
  public int jli;
  boolean jlj;
  public String jlk;
  private int jll;
  public final o jlm;
  public Context mContext;
  
  public AppBrandPageView(Context paramContext, com.tencent.mm.plugin.appbrand.f paramf)
  {
    GMTrace.i(17289927720960L, 128820);
    this.jkT = Collections.newSetFromMap(new ConcurrentHashMap());
    this.jkU = Collections.newSetFromMap(new ConcurrentHashMap());
    this.jkV = Collections.newSetFromMap(new ConcurrentHashMap());
    this.jkW = Collections.newSetFromMap(new ConcurrentHashMap());
    this.jkX = Collections.newSetFromMap(new ConcurrentHashMap());
    this.UF = true;
    this.jlg = false;
    this.jlh = false;
    this.jlj = false;
    this.jlk = null;
    this.jlm = new o(hashCode());
    this.mContext = paramContext;
    this.irS = paramf;
    this.iqL = paramf.iqL;
    Object localObject = this.iqL;
    paramf = new LinkedList();
    com.tencent.mm.plugin.appbrand.menu.m.a(paramf, com.tencent.mm.plugin.appbrand.menu.l.jii - 1, true);
    com.tencent.mm.plugin.appbrand.menu.m.a(paramf, com.tencent.mm.plugin.appbrand.menu.l.jip - 1, false);
    localObject = com.tencent.mm.plugin.appbrand.a.nx((String)localObject);
    int i;
    if ((!com.tencent.mm.sdk.a.b.bMv()) && ((localObject == null) || (((AppBrandSysConfig)localObject).iJa.iCx == 1)))
    {
      bool = true;
      com.tencent.mm.plugin.appbrand.menu.m.a(paramf, com.tencent.mm.plugin.appbrand.menu.l.jiq - 1, bool);
      com.tencent.mm.plugin.appbrand.menu.m.a(paramf, com.tencent.mm.plugin.appbrand.menu.l.jir - 1, false);
      com.tencent.mm.plugin.appbrand.menu.m.a(paramf, com.tencent.mm.plugin.appbrand.menu.l.jik - 1, false);
      com.tencent.mm.plugin.appbrand.menu.m.a(paramf, com.tencent.mm.plugin.appbrand.menu.l.jim - 1, false);
      com.tencent.mm.plugin.appbrand.menu.m.a(paramf, com.tencent.mm.plugin.appbrand.menu.l.jit - 1, false);
      com.tencent.mm.plugin.appbrand.menu.m.a(paramf, com.tencent.mm.plugin.appbrand.menu.l.jil - 1, false);
      i = com.tencent.mm.plugin.appbrand.menu.l.jis;
      if (com.tencent.mm.sdk.a.b.bMv()) {
        break label910;
      }
    }
    label910:
    for (boolean bool = true;; bool = false)
    {
      com.tencent.mm.plugin.appbrand.menu.m.a(paramf, i - 1, bool);
      com.tencent.mm.plugin.appbrand.menu.m.a(paramf, com.tencent.mm.plugin.appbrand.menu.l.jin - 1, true);
      com.tencent.mm.plugin.appbrand.menu.m.a(paramf, com.tencent.mm.plugin.appbrand.menu.l.jio - 1, false);
      this.jkj = paramf;
      this.jli = paramContext.getResources().getColor(p.c.aQq);
      this.jkY = new com.tencent.mm.plugin.appbrand.widget.a(this.mContext);
      paramContext = this.jkY.getLayoutParams();
      paramContext.height = com.tencent.mm.plugin.appbrand.widget.b.bX(this.mContext);
      this.jkY.setLayoutParams(paramContext);
      this.jkY.jyG = new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(10261347958784L, 76453);
          AppBrandPageView.this.irS.iqR.YY();
          GMTrace.o(10261347958784L, 76453);
        }
      };
      this.jkY.jyH = new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(10236786114560L, 76270);
          d.a(AppBrandPageView.this.iqL, d.c.iqA);
          paramAnonymousView = AppBrandPageView.this.irS;
          com.tencent.mm.plugin.appbrand.g localg = paramAnonymousView.iqK;
          int i = localg.irx.indexOf(paramAnonymousView);
          if (i < localg.irx.size()) {
            if (((com.tencent.mm.plugin.appbrand.f)localg.irx.get(i)).RC())
            {
              i = 1;
              label73:
              if (i == 0) {
                break label233;
              }
              localg = paramAnonymousView.iqK;
              if (!paramAnonymousView.RC())
              {
                i = localg.irx.indexOf(paramAnonymousView) + 1;
                if ((i != 0) && (i < localg.irx.size())) {
                  break label141;
                }
              }
            }
          }
          for (;;)
          {
            paramAnonymousView.D(false);
            GMTrace.o(10236786114560L, 76270);
            return;
            i += 1;
            break;
            i = 0;
            break label73;
            label141:
            Object localObject = new LinkedList();
            while ((i < localg.irx.size()) && (!((com.tencent.mm.plugin.appbrand.f)localg.irx.get(i)).RC()))
            {
              ((LinkedList)localObject).add(localg.irx.get(i));
              i += 1;
            }
            localObject = ((LinkedList)localObject).iterator();
            while (((Iterator)localObject).hasNext()) {
              localg.a((com.tencent.mm.plugin.appbrand.f)((Iterator)localObject).next());
            }
          }
          label233:
          paramAnonymousView.iqK.D(false);
          GMTrace.o(10236786114560L, 76270);
        }
      };
      paramContext = this.jkY;
      paramf = new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(15459332128768L, 115181);
          paramAnonymousView = AppBrandPageView.this.jlc;
          paramAnonymousView.getView().scrollTo(paramAnonymousView.getView().getScrollX(), 0);
          i.ap(AppBrandPageView.this.iqL, AppBrandPageView.this.hashCode());
          GMTrace.o(15459332128768L, 115181);
        }
      };
      paramContext.jyv.setOnClickListener(new a.2(paramContext, paramf));
      paramContext = this.jkY;
      paramf = new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          int i = 0;
          GMTrace.i(15462284918784L, 115203);
          paramAnonymousView = (AppBrandOptionButton)paramAnonymousView;
          if ((AppBrandPageView.this.mContext != null) && ((AppBrandPageView.this.mContext instanceof MMActivity))) {}
          for (boolean bool = ((MMActivity)AppBrandPageView.this.mContext).vov.auJ();; bool = false)
          {
            if (paramAnonymousView.jyZ)
            {
              paramAnonymousView = new Runnable()
              {
                public final void run()
                {
                  GMTrace.i(19009122598912L, 141629);
                  new k(AppBrandPageView.this.mContext, AppBrandPageView.this.iqL, AppBrandPageView.this, new LinkedList(AppBrandPageView.this.jkj));
                  GMTrace.o(19009122598912L, 141629);
                }
              };
              if (bool) {
                i = 100;
              }
              af.i(paramAnonymousView, i);
              GMTrace.o(15462284918784L, 115203);
              return;
            }
            com.tencent.mm.plugin.appbrand.jsapi.j.a.pS(AppBrandPageView.this.iqL);
            GMTrace.o(15462284918784L, 115203);
            return;
          }
        }
      };
      paramContext.jyB.setOnClickListener(paramf);
      paramContext = this.jkY;
      paramf = new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(19008854163456L, 141627);
          paramAnonymousView = AppBrandPageView.this.irS.iqR;
          paramAnonymousView.rq(paramAnonymousView.irS.iqP.Uf());
          com.tencent.mm.plugin.appbrand.report.a.a(AppBrandPageView.this.iqL, AppBrandPageView.this.jlc.jlV, 12, "", bg.Po(), 1, 0);
          GMTrace.o(19008854163456L, 141627);
        }
      };
      paramContext.jyA.setOnClickListener(paramf);
      this.jlc = new s(this.mContext, this.irS);
      paramContext = this.jlc;
      paramf = new AppBrandJSInterface(this);
      this.irT = paramf;
      paramContext.addJavascriptInterface(paramf, "WeixinJSCore");
      this.jlc.addJavascriptInterface(new DeviceInfoForSDK(), "__deviceInfo");
      this.jlc.jmc = new w()
      {
        public final void Xw()
        {
          GMTrace.i(19008719945728L, 141626);
          Object localObject1 = AppBrandPageView.this;
          ((AppBrandPageView)localObject1).B(((AppBrandPageView)localObject1).jli, ((AppBrandPageView)localObject1).jlk);
          localObject1 = AppBrandPageView.this.jla;
          Object localObject2 = ((t)localObject1).jj(((t)localObject1).jmo);
          float[] arrayOfFloat = ((t)localObject1).jmp;
          if ((localObject2 == null) || (((t.a)localObject2).jmx == null) || (arrayOfFloat == null))
          {
            GMTrace.o(19008719945728L, 141626);
            return;
          }
          localObject2 = (View)((t.a)localObject2).jmx.get();
          if (localObject2 != null)
          {
            if (((t)localObject1).jmo != ((t)localObject1).jmn)
            {
              Object localObject3 = ((t)localObject1).jj(((t)localObject1).jmn);
              if ((localObject3 != null) && (((t.a)localObject3).jmx != null))
              {
                localObject3 = (View)((t.a)localObject3).jmx.get();
                if (localObject3 != null) {
                  ((t)localObject1).a(((t)localObject1).jmn, arrayOfFloat, ((View)localObject3).getVisibility());
                }
              }
            }
            int i = ((t)localObject1).jmo;
            ((t)localObject1).jmn = -1;
            ((t)localObject1).jmo = -1;
            if (((t)localObject1).jmc != null)
            {
              ((t)localObject1).jmc.Xw();
              ((t)localObject1).jmc = null;
            }
            ((t)localObject1).a(i, arrayOfFloat, ((View)localObject2).getVisibility());
          }
          GMTrace.o(19008719945728L, 141626);
        }
      };
      this.jlc.jlX = new v()
      {
        public final void onScrollChanged(int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3, int paramAnonymousInt4, View paramAnonymousView)
        {
          GMTrace.i(19009927905280L, 141635);
          AppBrandPageView.this.jlb.onScrollChanged(paramAnonymousInt1, paramAnonymousInt2, paramAnonymousInt3, paramAnonymousInt4, paramAnonymousView);
          GMTrace.o(19009927905280L, 141635);
        }
      };
      this.jlc.jlY = new u()
      {
        public final boolean Zf()
        {
          GMTrace.i(19892141031424L, 148208);
          if (AppBrandPageView.this.irS.RH())
          {
            GMTrace.o(19892141031424L, 148208);
            return false;
          }
          t localt = AppBrandPageView.this.jla;
          t.4 local4 = new t.4(localt, Boolean.valueOf(false));
          if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            local4.b(null);
          }
          local4.b(localt.mHandler);
          GMTrace.o(19892141031424L, 148208);
          return true;
        }
      };
      this.jlc.init();
      this.jld = new q(this.mContext, this.jlc);
      this.jld.jlK = new q.a()
      {
        public final void Ze()
        {
          GMTrace.i(19893885861888L, 148221);
          AppBrandPageView.this.a("onPullDownRefresh", null, null);
          GMTrace.o(19893885861888L, 148221);
        }
      };
      this.jld.jlL = new q.b()
      {
        public final void jc(int paramAnonymousInt)
        {
          GMTrace.i(19892275249152L, 148209);
          AppBrandPageView.this.jlb.setTranslationY(paramAnonymousInt);
          GMTrace.o(19892275249152L, 148209);
        }
      };
      this.jjY = new FrameLayout(this.mContext);
      this.jjY.addView(this.jld);
      paramContext = this.jjY;
      paramf = new com.tencent.mm.plugin.appbrand.widget.input.e(this.mContext, this);
      this.jlb = paramf;
      paramContext.addView(paramf);
      paramContext = this.jjY;
      paramf = new com.tencent.mm.plugin.appbrand.widget.f(this.mContext);
      this.jle = paramf;
      paramContext.addView(paramf);
      this.jkZ = new FrameLayout(this.mContext);
      this.jkZ.addView(this.jjY, new ViewGroup.LayoutParams(-1, -1));
      this.jld.jlL = this.jlb;
      this.jjV = new LinearLayout(this.mContext)
      {
        protected final void onDetachedFromWindow()
        {
          GMTrace.i(19009525252096L, 141632);
          super.onDetachedFromWindow();
          Object localObject = AppBrandPageView.this.jla;
          long l = SystemClock.uptimeMillis();
          MotionEvent localMotionEvent = MotionEvent.obtain(l, l, 3, 0.0F, 0.0F, 0);
          localMotionEvent.setSource(4098);
          localObject = ((t)localObject).jmm.iterator();
          while (((Iterator)localObject).hasNext())
          {
            View localView = (View)((t.a)((Iterator)localObject).next()).jmx.get();
            if (localView != null) {
              localView.dispatchTouchEvent(localMotionEvent);
            }
          }
          localMotionEvent.recycle();
          GMTrace.o(19009525252096L, 141632);
        }
      };
      this.jjV.setId(p.f.ito);
      this.jjV.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
      this.jjV.setOrientation(1);
      this.jjV.addView(this.jkY);
      this.jjV.addView(this.jkZ, new ViewGroup.LayoutParams(-1, -1));
      this.jla = new t(this.jlc);
      this.jlf = new FrameLayout.LayoutParams(-2, -2);
      this.jll = com.tencent.mm.bq.a.fromDPToPix(this.mContext, 12);
      com.tencent.mm.plugin.appbrand.widget.input.m.i(this);
      GMTrace.o(17289927720960L, 128820);
      return;
      bool = false;
      break;
    }
  }
  
  private com.tencent.mm.plugin.appbrand.jsapi.l.a d(ViewGroup paramViewGroup)
  {
    GMTrace.i(19898046611456L, 148252);
    int i = paramViewGroup.getChildCount() - 1;
    while (i >= 0)
    {
      Object localObject = paramViewGroup.getChildAt(i);
      if ((localObject instanceof com.tencent.mm.plugin.appbrand.jsapi.l.a))
      {
        paramViewGroup = (com.tencent.mm.plugin.appbrand.jsapi.l.a)localObject;
        GMTrace.o(19898046611456L, 148252);
        return paramViewGroup;
      }
      if ((localObject instanceof ViewGroup))
      {
        localObject = d((ViewGroup)localObject);
        if (localObject != null)
        {
          GMTrace.o(19898046611456L, 148252);
          return (com.tencent.mm.plugin.appbrand.jsapi.l.a)localObject;
        }
      }
      i -= 1;
    }
    GMTrace.o(19898046611456L, 148252);
    return null;
  }
  
  private String rz(String paramString)
  {
    GMTrace.i(10243631218688L, 76321);
    paramString = this.iqL + ":" + this.jlc.jlV + ":" + paramString;
    GMTrace.o(10243631218688L, 76321);
    return paramString;
  }
  
  public final void B(int paramInt, String paramString)
  {
    GMTrace.i(17290867245056L, 128827);
    com.tencent.mm.plugin.appbrand.widget.i.d(this.jjV, paramInt, "black".equals(paramString));
    GMTrace.o(17290867245056L, 128827);
  }
  
  public final com.tencent.mm.plugin.appbrand.f RQ()
  {
    GMTrace.i(17290061938688L, 128821);
    com.tencent.mm.plugin.appbrand.f localf = this.irS;
    GMTrace.o(17290061938688L, 128821);
    return localf;
  }
  
  public final com.tencent.mm.plugin.appbrand.c RR()
  {
    GMTrace.i(17290196156416L, 128822);
    s locals = this.jlc;
    GMTrace.o(17290196156416L, 128822);
    return locals;
  }
  
  final void VS()
  {
    GMTrace.i(10242154823680L, 76310);
    s locals = this.jlc;
    locals.onPause();
    locals.Zq();
    this.jlm.jlu.ZG();
    this.jlc.rA(rz("INVISIBLE"));
    runOnUiThread(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(10235175501824L, 76258);
        Iterator localIterator = AppBrandPageView.this.jkU.iterator();
        while (localIterator.hasNext()) {
          ((AppBrandPageView.b)localIterator.next()).VS();
        }
        GMTrace.o(10235175501824L, 76258);
      }
    });
    GMTrace.o(10242154823680L, 76310);
  }
  
  final void Wq()
  {
    GMTrace.i(10242020605952L, 76309);
    this.jlc.onResume();
    Object localObject1;
    Object localObject2;
    if (com.tencent.mm.plugin.appbrand.a.ny(this.iqL).scene == 1023) {
      if (this.irS.iqR.getPageCount() == 1)
      {
        this.jkY.cJ(true);
        localObject1 = this.irS.iqN.iIy;
        localObject2 = this.irS.iqP.Uf();
        j localj = this.irS.iqR.YZ();
        if ((this.irS.RC()) || (this.irS.iqR.getPageCount() != 1) || (localj.rn((String)localObject2)) || (!localj.ro((String)localObject1))) {
          break label365;
        }
        this.jkY.cH(true);
      }
    }
    for (;;)
    {
      a.c(this);
      if (this.jlc.jmg)
      {
        com.tencent.mm.sdk.platformtools.w.i("MicroMsg.AppBrandPageView", "reload page %s", new Object[] { this.jlc.jlW });
        this.jlc.init();
        rv(this.jlc.jlW);
        localObject1 = new h();
        localObject2 = new HashMap();
        ((HashMap)localObject2).put("path", this.jlc.jlV);
        ((h)localObject1).r((Map)localObject2).aj(this.iqL, hashCode()).VI();
      }
      localObject1 = this.jlm;
      if (((o)localObject1).jlv > 0L) {
        ((o)localObject1).jlu.ZF();
      }
      this.jlc.rA(rz("VISIBLE"));
      runOnUiThread(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(10247657750528L, 76351);
          Iterator localIterator = AppBrandPageView.this.jkV.iterator();
          while (localIterator.hasNext()) {
            ((AppBrandPageView.d)localIterator.next()).Wq();
          }
          GMTrace.o(10247657750528L, 76351);
        }
      });
      GMTrace.o(10242020605952L, 76309);
      return;
      this.jkY.cJ(false);
      this.jkY.cI(true);
      break;
      if (this.irS.RC())
      {
        this.jkY.cJ(false);
        this.jkY.cI(true);
        break;
      }
      this.jkY.cJ(false);
      this.jkY.cI(false);
      break;
      label365:
      this.jkY.cH(false);
    }
  }
  
  public final String Zc()
  {
    GMTrace.i(16151224516608L, 120336);
    Object localObject = this.jkY.jyw.getText();
    if (localObject != null)
    {
      localObject = ((CharSequence)localObject).toString();
      GMTrace.o(16151224516608L, 120336);
      return (String)localObject;
    }
    GMTrace.o(16151224516608L, 120336);
    return "";
  }
  
  public final com.tencent.mm.plugin.appbrand.jsapi.l.a Zd()
  {
    GMTrace.i(19897912393728L, 148251);
    com.tencent.mm.plugin.appbrand.jsapi.l.a locala = d(this.jla.jg(0));
    GMTrace.o(19897912393728L, 148251);
    return locala;
  }
  
  public final void a(b paramb)
  {
    GMTrace.i(10242289041408L, 76311);
    this.jkU.add(paramb);
    GMTrace.o(10242289041408L, 76311);
  }
  
  public final void a(c paramc)
  {
    GMTrace.i(10242691694592L, 76314);
    this.jkW.add(paramc);
    GMTrace.o(10242691694592L, 76314);
  }
  
  public final void a(d paramd)
  {
    GMTrace.i(17290330374144L, 128823);
    this.jkV.add(paramd);
    GMTrace.o(17290330374144L, 128823);
  }
  
  public final void a(e parame)
  {
    GMTrace.i(10241617952768L, 76306);
    this.jkT.add(parame);
    GMTrace.o(10241617952768L, 76306);
  }
  
  public final void a(String paramString1, String paramString2, int[] paramArrayOfInt)
  {
    GMTrace.i(10240946864128L, 76301);
    this.irS.iqQ.h(paramString1, paramString2, hashCode());
    GMTrace.o(10240946864128L, 76301);
  }
  
  public final void b(b paramb)
  {
    GMTrace.i(10242423259136L, 76312);
    this.jkU.remove(paramb);
    GMTrace.o(10242423259136L, 76312);
  }
  
  public final void b(c paramc)
  {
    GMTrace.i(10242825912320L, 76315);
    this.jkW.remove(paramc);
    GMTrace.o(10242825912320L, 76315);
  }
  
  public final void b(d paramd)
  {
    GMTrace.i(17290464591872L, 128824);
    this.jkV.remove(paramd);
    GMTrace.o(17290464591872L, 128824);
  }
  
  public final void b(e parame)
  {
    GMTrace.i(10241752170496L, 76307);
    this.jkT.remove(parame);
    GMTrace.o(10241752170496L, 76307);
  }
  
  public final void cleanup()
  {
    GMTrace.i(10241349517312L, 76304);
    this.jlc.destroy();
    this.irT.cleanup();
    this.jkT.clear();
    this.jkW.clear();
    this.jkU.clear();
    this.jkV.clear();
    this.jkX.clear();
    GMTrace.o(10241349517312L, 76304);
  }
  
  public final void ct(final boolean paramBoolean)
  {
    GMTrace.i(10243362783232L, 76319);
    runOnUiThread(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(17298517655552L, 128884);
        AppBrandPageView.this.jkY.cK(paramBoolean);
        GMTrace.o(17298517655552L, 128884);
      }
    });
    GMTrace.o(10243362783232L, 76319);
  }
  
  public final void cu(final boolean paramBoolean)
  {
    GMTrace.i(10243497000960L, 76320);
    runOnUiThread(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(17295564865536L, 128862);
        AppBrandPageView.this.jld.cv(paramBoolean);
        AppBrandPageView.this.jld.cu(paramBoolean);
        GMTrace.o(17295564865536L, 128862);
      }
    });
    GMTrace.o(10243497000960L, 76320);
  }
  
  public final String getAppId()
  {
    GMTrace.i(10240409993216L, 76297);
    String str = this.iqL;
    GMTrace.o(10240409993216L, 76297);
    return str;
  }
  
  public final boolean isRunning()
  {
    GMTrace.i(10241215299584L, 76303);
    boolean bool = this.UF;
    GMTrace.o(10241215299584L, 76303);
    return bool;
  }
  
  public final com.tencent.mm.plugin.appbrand.menu.k jb(int paramInt)
  {
    GMTrace.i(15458124169216L, 115172);
    com.tencent.mm.plugin.appbrand.menu.k localk = com.tencent.mm.plugin.appbrand.menu.m.d(this.jkj, paramInt - 1);
    GMTrace.o(15458124169216L, 115172);
    return localk;
  }
  
  final void onDestroy()
  {
    GMTrace.i(10242557476864L, 76313);
    this.UF = false;
    Object localObject = this.jlm;
    ((o)localObject).jlu.ZG();
    localObject = ((o)localObject).jlu;
    ((com.tencent.mm.plugin.appbrand.report.e)localObject).quit();
    ((com.tencent.mm.plugin.appbrand.report.e)localObject).pl = true;
    runOnUiThread(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(10236249243648L, 76266);
        Iterator localIterator = AppBrandPageView.this.jkW.iterator();
        while (localIterator.hasNext()) {
          ((AppBrandPageView.c)localIterator.next()).onDestroy();
        }
        GMTrace.o(10236249243648L, 76266);
      }
    });
    GMTrace.o(10242557476864L, 76313);
  }
  
  public final void onReady()
  {
    GMTrace.i(10241886388224L, 76308);
    o localo = this.jlm;
    localo.jlw = (bg.Pp() - localo.jlv);
    runOnUiThread(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(10224303865856L, 76177);
        Object localObject = AppBrandPageView.this.jlc;
        ((s)localObject).irS.irb.k(4, System.currentTimeMillis() - ((s)localObject).jmf);
        AppBrandPerformanceManager.b(((s)localObject).iqL, 203, System.currentTimeMillis() - ((s)localObject).jmh);
        com.tencent.mm.plugin.appbrand.performance.a.a(((s)localObject).iqL, "Native", "PageLoad", ((s)localObject).jmh, System.currentTimeMillis(), "");
        localObject = AppBrandPageView.this.jkT.iterator();
        while (((Iterator)localObject).hasNext()) {
          ((AppBrandPageView.e)((Iterator)localObject).next()).onReady();
        }
        GMTrace.o(10224303865856L, 76177);
      }
    });
    GMTrace.o(10241886388224L, 76308);
  }
  
  public final void runOnUiThread(Runnable paramRunnable)
  {
    GMTrace.i(10241483735040L, 76305);
    if (Looper.getMainLooper().getThread() == Thread.currentThread())
    {
      paramRunnable.run();
      GMTrace.o(10241483735040L, 76305);
      return;
    }
    this.jjV.post(paramRunnable);
    GMTrace.o(10241483735040L, 76305);
  }
  
  public final void rv(String paramString)
  {
    GMTrace.i(10240544210944L, 76298);
    Object localObject1 = this.jlc;
    ((s)localObject1).jlV = com.tencent.mm.plugin.appbrand.n.h.sa(paramString);
    ((s)localObject1).jlW = paramString;
    ((s)localObject1).jmg = false;
    int i;
    if (!com.tencent.mm.plugin.appbrand.appcache.u.b(((s)localObject1).irS, ((s)localObject1).jlV))
    {
      i = 0;
      if (i == 0)
      {
        this.jkY.cG(false);
        runOnUiThread(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(17302007316480L, 128910);
            AppBrandPageView.this.jld.cv(this.jlr);
            GMTrace.o(17302007316480L, 128910);
          }
        });
        paramString = this.irS.iqR;
        if (paramString.getPageCount() < 2) {
          paramString.jko = true;
        }
        paramString = new c(this.mContext);
        localObject1 = this.irS.iqO;
        c.inflate(paramString.getContext(), p.g.ivb, paramString);
        paramString.jjR = ((ImageView)paramString.findViewById(p.f.isX));
        paramString.jjS = ((TextView)paramString.findViewById(p.f.isZ));
        paramString.jjT = ((Button)paramString.findViewById(p.f.isW));
        paramString.jjS.setText(paramString.getResources().getString(p.i.iwM, new Object[] { ((AppBrandSysConfig)localObject1).fxq }));
        Object localObject2 = new ColorMatrix();
        ((ColorMatrix)localObject2).setSaturation(0.0F);
        localObject2 = new ColorMatrixColorFilter((ColorMatrix)localObject2);
        paramString.jjR.setColorFilter((ColorFilter)localObject2);
        com.tencent.mm.modelappbrand.a.b.CT().a(paramString.jjR, ((AppBrandSysConfig)localObject1).iIF, com.tencent.mm.modelappbrand.a.a.CS(), com.tencent.mm.modelappbrand.a.e.hkj);
        paramString.jjT.setVisibility(8);
        paramString.setBackgroundColor(-1);
        com.tencent.mm.plugin.appbrand.report.a.ar(((AppBrandSysConfig)localObject1).appId, 27);
        this.jjY.addView(paramString);
        onReady();
      }
      paramString = this.jlm;
      paramString.jlv = bg.Pp();
      paramString.jlu.ZF();
      GMTrace.o(10240544210944L, 76298);
      return;
    }
    ((s)localObject1).jmh = System.currentTimeMillis();
    if (((s)localObject1).irZ)
    {
      ((s)localObject1).rB(((s)localObject1).jlV);
      com.tencent.mm.sdk.platformtools.w.i("MicroMsg.AppBrandWebView", "Frame ready, inject page");
    }
    for (;;)
    {
      i = 1;
      break;
      com.tencent.mm.sdk.platformtools.w.i("MicroMsg.AppBrandWebView", "Frame not ready, wait for it");
    }
  }
  
  public final void rw(final String paramString)
  {
    GMTrace.i(10242960130048L, 76316);
    runOnUiThread(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(10250744758272L, 76374);
        AppBrandPageView.this.jkY.so(paramString);
        GMTrace.o(10250744758272L, 76374);
      }
    });
    GMTrace.o(10242960130048L, 76316);
  }
  
  public final void rx(final String paramString)
  {
    GMTrace.i(19897778176000L, 148250);
    runOnUiThread(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(18356287569920L, 136765);
        AppBrandPageView.this.jld.cv(true);
        AppBrandPageView.this.jld.cu(false);
        q localq = AppBrandPageView.this.jld;
        String str = paramString;
        if (bg.mZ(str))
        {
          localq.jlO.setVisibility(8);
          GMTrace.o(18356287569920L, 136765);
          return;
        }
        localq.je(com.tencent.mm.bq.a.c(localq.getContext(), p.c.aQQ));
        localq.jlO.setTextColor(com.tencent.mm.bq.a.c(localq.getContext(), p.c.ism));
        localq.jlO.setVisibility(0);
        localq.jlO.setText(str);
        GMTrace.o(18356287569920L, 136765);
      }
    });
    GMTrace.o(19897778176000L, 148250);
  }
  
  public final void ry(String paramString)
  {
    GMTrace.i(17290733027328L, 128826);
    this.jlj = true;
    this.jlk = paramString;
    runOnUiThread(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(19008048857088L, 141621);
        AppBrandPageView.this.B(AppBrandPageView.this.jli, AppBrandPageView.this.jlk);
        GMTrace.o(19008048857088L, 141621);
      }
    });
    GMTrace.o(17290733027328L, 128826);
  }
  
  public final void s(int paramInt, boolean paramBoolean)
  {
    GMTrace.i(15457989951488L, 115171);
    if (paramInt == 0)
    {
      GMTrace.o(15457989951488L, 115171);
      return;
    }
    Object localObject = this.jkj;
    if ((localObject == null) || (((List)localObject).isEmpty()))
    {
      GMTrace.o(15457989951488L, 115171);
      return;
    }
    localObject = ((List)localObject).iterator();
    while (((Iterator)localObject).hasNext())
    {
      com.tencent.mm.plugin.appbrand.menu.k localk = (com.tencent.mm.plugin.appbrand.menu.k)((Iterator)localObject).next();
      if ((localk != null) && (localk.id == paramInt - 1))
      {
        localk.jih = paramBoolean;
        GMTrace.o(15457989951488L, 115171);
        return;
      }
    }
    GMTrace.o(15457989951488L, 115171);
  }
  
  public final void setFullscreen(boolean paramBoolean)
  {
    GMTrace.i(19897643958272L, 148249);
    this.jlg = paramBoolean;
    if (!(this.mContext instanceof Activity))
    {
      GMTrace.o(19897643958272L, 148249);
      return;
    }
    Window localWindow = ((Activity)this.mContext).getWindow();
    Object localObject = this.jkY.jyB;
    int i;
    if (paramBoolean)
    {
      this.jkY.cF(true);
      com.tencent.mm.plugin.appbrand.widget.a locala = this.jkY;
      if (locala.jyu.indexOfChild(locala.jyB) != -1) {
        locala.jyu.removeView(locala.jyB);
      }
      s(com.tencent.mm.plugin.appbrand.menu.l.jin, false);
      if (this.jkZ.indexOfChild((View)localObject) == -1)
      {
        this.jlf.gravity = 53;
        ((AppBrandOptionButton)localObject).setPadding(0, this.jll, 0, this.jll);
        this.jkZ.addView((View)localObject, this.jlf);
      }
      if (Build.VERSION.SDK_INT >= 21)
      {
        i = localWindow.getDecorView().getSystemUiVisibility();
        localWindow.getDecorView().setSystemUiVisibility(i | 0x400 | 0x100);
      }
      localWindow.addFlags(1024);
      GMTrace.o(19897643958272L, 148249);
      return;
    }
    this.jkY.cF(false);
    s(com.tencent.mm.plugin.appbrand.menu.l.jin, true);
    if (this.jkZ.indexOfChild((View)localObject) != -1) {
      this.jkZ.removeView((View)localObject);
    }
    ((AppBrandOptionButton)localObject).setPadding(0, 0, 0, 0);
    localObject = this.jkY;
    if (((com.tencent.mm.plugin.appbrand.widget.a)localObject).jyu.indexOfChild(((com.tencent.mm.plugin.appbrand.widget.a)localObject).jyB) == -1) {
      ((com.tencent.mm.plugin.appbrand.widget.a)localObject).jyu.addView(((com.tencent.mm.plugin.appbrand.widget.a)localObject).jyB);
    }
    if (Build.VERSION.SDK_INT >= 21)
    {
      i = localWindow.getDecorView().getSystemUiVisibility();
      localWindow.getDecorView().setSystemUiVisibility(i & 0xFBFF & 0xFEFF);
    }
    localWindow.clearFlags(1024);
    GMTrace.o(19897643958272L, 148249);
  }
  
  private class DeviceInfoForSDK
  {
    public DeviceInfoForSDK()
    {
      GMTrace.i(19900059877376L, 148267);
      GMTrace.o(19900059877376L, 148267);
    }
    
    @android.webkit.JavascriptInterface
    @org.xwalk.core.JavascriptInterface
    public float getPixelRatio()
    {
      GMTrace.i(19900194095104L, 148268);
      float f = AppBrandPageView.this.mContext.getResources().getDisplayMetrics().density;
      GMTrace.o(19900194095104L, 148268);
      return f;
    }
    
    @android.webkit.JavascriptInterface
    @org.xwalk.core.JavascriptInterface
    public float getWidth()
    {
      GMTrace.i(19900328312832L, 148269);
      float f = AppBrandPageView.this.jjV.getWidth() / getPixelRatio();
      GMTrace.o(19900328312832L, 148269);
      return f;
    }
  }
  
  public static abstract interface a
  {
    public abstract boolean XO();
  }
  
  public static abstract interface b
  {
    public abstract void VS();
  }
  
  public static abstract interface c
  {
    public abstract void onDestroy();
  }
  
  public static abstract interface d
  {
    public abstract void Wq();
  }
  
  public static abstract interface e
  {
    public abstract void onReady();
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/page/AppBrandPageView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */