package com.tencent.mm.plugin.appbrand.ui.recents;

import android.os.Bundle;
import android.support.v4.a.a;
import android.support.v4.view.ai;
import android.support.v4.view.an;
import android.support.v4.view.z;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.e;
import android.support.v7.widget.RecyclerView.e.a;
import android.support.v7.widget.RecyclerView.e.c;
import android.support.v7.widget.RecyclerView.q;
import android.support.v7.widget.RecyclerView.t;
import android.support.v7.widget.aj;
import android.support.v7.widget.v;
import android.view.View;
import android.view.ViewParent;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Interpolator;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.c.e;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

final class g
  extends v
{
  public final ArrayList<a.d> jvA;
  private final ArrayList<RecyclerView.t> jvB;
  private final ArrayList<a.d> jvC;
  public final ArrayList<a.d> jvD;
  public final ArrayList<a.d> jvE;
  public boolean jvF;
  boolean jvn;
  private final RecyclerView.e.a jvo;
  public final Set<RecyclerView.e.a> jvp;
  private final Interpolator jvq;
  private final ArrayList<b> jvr;
  public final ArrayList<RecyclerView.t> jvs;
  private final ArrayList<d> jvt;
  public final ArrayList<RecyclerView.t> jvu;
  private final ArrayList<a.d> jvv;
  public final ArrayList<a.d> jvw;
  private final ArrayList<a.d> jvx;
  public final ArrayList<a.d> jvy;
  private final ArrayList<f> jvz;
  
  g()
  {
    GMTrace.i(16354698592256L, 121852);
    this.jvn = false;
    this.jvo = new RecyclerView.e.a()
    {
      public final void fT()
      {
        GMTrace.i(18197239562240L, 135580);
        Iterator localIterator = g.this.jvp.iterator();
        while (localIterator.hasNext()) {
          ((RecyclerView.e.a)localIterator.next()).fT();
        }
        g.this.jvF = false;
        GMTrace.o(18197239562240L, 135580);
      }
    };
    this.jvp = new HashSet();
    this.jvq = new AccelerateDecelerateInterpolator();
    this.jvr = new ArrayList();
    this.jvs = new ArrayList();
    this.jvt = new ArrayList();
    this.jvu = new ArrayList();
    this.jvv = new ArrayList();
    this.jvw = new ArrayList();
    this.jvx = new ArrayList();
    this.jvy = new ArrayList();
    this.jvz = new ArrayList();
    this.jvA = new ArrayList();
    this.jvB = new ArrayList();
    this.jvC = new ArrayList();
    this.jvD = new ArrayList();
    this.jvE = new ArrayList();
    this.jvF = false;
    GMTrace.o(16354698592256L, 121852);
  }
  
  private void e(RecyclerView.t paramt)
  {
    GMTrace.i(16354832809984L, 121853);
    a.v(paramt.Vc);
    d(paramt);
    GMTrace.o(16354832809984L, 121853);
  }
  
  public final RecyclerView.e.c a(RecyclerView.q paramq, RecyclerView.t paramt, int paramInt, List<Object> paramList)
  {
    GMTrace.i(16356309204992L, 121864);
    if ((paramInt & 0x2) > 0)
    {
      Iterator localIterator = paramList.iterator();
      while (localIterator.hasNext())
      {
        Object localObject = localIterator.next();
        if ((localObject instanceof Bundle))
        {
          localObject = (Boolean)((Bundle)localObject).get("star");
          if ((localObject != null) && (((Boolean)localObject).booleanValue()))
          {
            paramq = new c().b(paramt, paramInt);
            GMTrace.o(16356309204992L, 121864);
            return paramq;
          }
          if ((localObject != null) && (!((Boolean)localObject).booleanValue()))
          {
            paramq = new e().b(paramt, paramInt);
            GMTrace.o(16356309204992L, 121864);
            return paramq;
          }
        }
      }
    }
    paramq = super.a(paramq, paramt, paramInt, paramList);
    paramq.Ug = paramInt;
    GMTrace.o(16356309204992L, 121864);
    return paramq;
  }
  
  public final boolean a(RecyclerView.t paramt, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    GMTrace.i(16355369680896L, 121857);
    if (!(paramt instanceof a.d))
    {
      q(paramt);
      GMTrace.o(16355369680896L, 121857);
      return false;
    }
    boolean bool = super.a(paramt, paramInt1, paramInt2, paramInt3, paramInt4);
    GMTrace.o(16355369680896L, 121857);
    return bool;
  }
  
  public final boolean a(RecyclerView.t paramt1, RecyclerView.t paramt2, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    GMTrace.i(16355772334080L, 121860);
    k(paramt1);
    k(paramt2);
    GMTrace.o(16355772334080L, 121860);
    return false;
  }
  
  public final boolean a(RecyclerView.t paramt1, RecyclerView.t paramt2, RecyclerView.e.c paramc1, RecyclerView.e.c paramc2)
  {
    GMTrace.i(16356443422720L, 121865);
    if ((paramc1 instanceof c))
    {
      if (((c)paramc1).aaT())
      {
        ((a.d)paramt2).juG.setVisibility(0);
        ((a.d)paramt2).juG.invalidate();
        ((RecentsRecyclerView)paramt2.Vc.getParent()).bK(paramt2.Vc);
        this.jvB.add(paramt2);
        bool = super.a(paramt2, paramc1.left, paramc1.top, paramc2.left, paramc2.top);
        GMTrace.o(16356443422720L, 121865);
        return bool;
      }
      e(paramt2);
      this.jvv.add((a.d)paramt2);
      GMTrace.o(16356443422720L, 121865);
      return true;
    }
    if ((paramc1 instanceof e))
    {
      if (!((e)paramc1).aaT())
      {
        e(paramt2);
        this.jvx.add((a.d)paramt2);
        GMTrace.o(16356443422720L, 121865);
        return true;
      }
      ((a.d)paramt2).juG.setVisibility(8);
      bool = super.a(paramt2, paramc1.left, paramc1.top, paramc2.left, paramc2.top);
      GMTrace.o(16356443422720L, 121865);
      return bool;
    }
    boolean bool = super.a(paramt1, paramt2, paramc1, paramc2);
    GMTrace.o(16356443422720L, 121865);
    return bool;
  }
  
  public final boolean a(RecyclerView.t paramt, List<Object> paramList)
  {
    GMTrace.i(16356577640448L, 121866);
    super.a(paramt, paramList);
    boolean bool = paramt instanceof a.d;
    GMTrace.o(16356577640448L, 121866);
    return bool;
  }
  
  final void b(RecyclerView.e.a parama)
  {
    GMTrace.i(18198313304064L, 135588);
    if (parama != null) {
      this.jvp.add(parama);
    }
    GMTrace.o(18198313304064L, 135588);
  }
  
  final void c(RecyclerView.e.a parama)
  {
    GMTrace.i(18198447521792L, 135589);
    if (parama != null) {
      this.jvp.remove(parama);
    }
    GMTrace.o(18198447521792L, 135589);
  }
  
  public final boolean c(RecyclerView.t paramt)
  {
    GMTrace.i(18198715957248L, 135591);
    e(paramt);
    k(paramt);
    GMTrace.o(18198715957248L, 135591);
    return false;
  }
  
  public final void d(RecyclerView.t paramt)
  {
    GMTrace.i(18198850174976L, 135592);
    if (((paramt instanceof a.d)) && (this.jvC.remove(paramt)))
    {
      z.c(paramt.Vc, 0.0F);
      k(paramt);
    }
    super.d(paramt);
    GMTrace.o(18198850174976L, 135592);
  }
  
  public final boolean d(RecyclerView.t paramt, RecyclerView.e.c paramc1, RecyclerView.e.c paramc2)
  {
    GMTrace.i(16355638116352L, 121859);
    if ((paramc1 instanceof c))
    {
      e(paramt);
      this.jvr.add(new b((a.d)paramt, paramc1.left, paramc1.top));
      GMTrace.o(16355638116352L, 121859);
      return true;
    }
    if ((paramc1 instanceof e))
    {
      e(paramt);
      this.jvt.add(new d((a.d)paramt, paramc1.left, paramc1.top));
      GMTrace.o(16355638116352L, 121859);
      return true;
    }
    if (((paramc1.Ug & 0x800) > 0) && ((paramt instanceof a.d)) && (paramc2 == null)) {
      try
      {
        bool = ((a.d)paramt).aaM().iEJ;
        if (!bool)
        {
          e(paramt);
          this.jvz.add(new f((a.d)paramt, paramc1.left, paramc1.top));
          GMTrace.o(16355638116352L, 121859);
          return true;
        }
      }
      catch (Exception localException)
      {
        for (;;)
        {
          bool = false;
        }
      }
    }
    boolean bool = super.d(paramt, paramc1, paramc2);
    GMTrace.o(16355638116352L, 121859);
    return bool;
  }
  
  public final boolean e(RecyclerView.t paramt, RecyclerView.e.c paramc1, RecyclerView.e.c paramc2)
  {
    GMTrace.i(16355503898624L, 121858);
    if ((paramc1 != null) && ((paramc1.left != paramc2.left) || (paramc1.top != paramc2.top)))
    {
      bool = super.a(paramt, paramc1.left, paramc1.top, paramc2.left, paramc2.top);
      GMTrace.o(16355503898624L, 121858);
      return bool;
    }
    if ((this.jvn) && ((paramt.Vc.getParent() instanceof RecyclerView)) && ((paramt instanceof a.d)))
    {
      paramc1 = (RecyclerView)paramt.Vc.getParent();
      if (paramc1.getHeight() > 0)
      {
        if (paramc2.bottom >= paramc1.getHeight())
        {
          paramt = (a.d)paramt;
          z.c(paramt.Vc, paramt.Vc.getHeight());
          this.jvC.add(paramt);
          GMTrace.o(16355503898624L, 121858);
          return true;
        }
        if (paramc2.top <= 0)
        {
          paramt = (a.d)paramt;
          z.c(paramt.Vc, -paramt.Vc.getHeight());
          this.jvC.add(paramt);
          GMTrace.o(16355503898624L, 121858);
          return true;
        }
      }
    }
    boolean bool = c(paramt);
    GMTrace.o(16355503898624L, 121858);
    return bool;
  }
  
  public final void eJ()
  {
    GMTrace.i(16355235463168L, 121856);
    a(this.jvo);
    Object localObject1;
    final Object localObject2;
    final Object localObject3;
    Object localObject4;
    final Object localObject5;
    if (!this.jvr.isEmpty())
    {
      localObject1 = this.jvr.iterator();
      while (((Iterator)localObject1).hasNext())
      {
        localObject2 = (b)((Iterator)localObject1).next();
        this.jvs.add(((b)localObject2).jvI);
        localObject3 = ((b)localObject2).jvI;
        localObject4 = ((b)localObject2).jvI.Vc;
        ((b)localObject2).jvI.juG.setVisibility(0);
        z.c((View)localObject4, 0.0F);
        localObject5 = z.V((View)localObject4);
        double d1 = ((b)localObject2).Qv / ((b)localObject2).jvI.Vc.getHeight();
        double d2 = this.Ue;
        ((ai)localObject5).d(Math.max(this.Ue, Math.min(Math.round(d1 * d2) + this.Ue, 400L)));
        ((ai)localObject5).b(this.jvq);
        ((ai)localObject5).a(new an()
        {
          public final void p(View paramAnonymousView)
          {
            GMTrace.i(16349598318592L, 121814);
            ((RecentsRecyclerView)paramAnonymousView.getParent()).bK(paramAnonymousView);
            g.this.r(localObject3);
            GMTrace.o(16349598318592L, 121814);
          }
          
          public final void q(View paramAnonymousView)
          {
            GMTrace.i(16349732536320L, 121815);
            if (paramAnonymousView == null)
            {
              GMTrace.o(16349732536320L, 121815);
              return;
            }
            ((RecentsRecyclerView)paramAnonymousView.getParent()).bL(paramAnonymousView);
            localObject5.a(null);
            z.c(paramAnonymousView, 0.0F);
            g.this.k(localObject3);
            g.this.jvs.remove(localObject3);
            g.this.eK();
            GMTrace.o(16349732536320L, 121815);
          }
        });
        ((ai)localObject5).r(-((b)localObject2).Qv - ((View)localObject4).getHeight()).start();
      }
      this.jvr.clear();
    }
    if (!this.jvt.isEmpty())
    {
      localObject1 = this.jvt.iterator();
      while (((Iterator)localObject1).hasNext())
      {
        localObject2 = (d)((Iterator)localObject1).next();
        this.jvu.add(((d)localObject2).jvI);
        localObject3 = ((d)localObject2).jvI;
        localObject5 = ((d)localObject2).jvI.Vc;
        localObject4 = (RecentsRecyclerView)((View)localObject5).getParent();
        ((d)localObject2).jvI.juG.setVisibility(8);
        z.c((View)localObject5, 0.0F);
        localObject5 = z.V((View)localObject5);
        ((ai)localObject5).d(this.Ue);
        ((ai)localObject5).a(new an()
        {
          public final void p(View paramAnonymousView)
          {
            GMTrace.i(16369596760064L, 121963);
            ((RecentsRecyclerView)paramAnonymousView.getParent()).bK(paramAnonymousView);
            g.this.r(localObject3);
            GMTrace.o(16369596760064L, 121963);
          }
          
          public final void q(View paramAnonymousView)
          {
            GMTrace.i(16369730977792L, 121964);
            if (paramAnonymousView == null)
            {
              GMTrace.o(16369730977792L, 121964);
              return;
            }
            ((RecentsRecyclerView)paramAnonymousView.getParent()).bL(paramAnonymousView);
            localObject5.a(null);
            z.c(paramAnonymousView, 0.0F);
            g.this.k(localObject3);
            g.this.jvu.remove(localObject3);
            g.this.eK();
            GMTrace.o(16369730977792L, 121964);
          }
        });
        ((ai)localObject5).r(((RecentsRecyclerView)localObject4).getHeight() - ((d)localObject2).Qv).start();
      }
      this.jvt.clear();
    }
    if (!this.jvv.isEmpty())
    {
      localObject1 = this.jvv.iterator();
      while (((Iterator)localObject1).hasNext())
      {
        localObject2 = (a.d)((Iterator)localObject1).next();
        this.jvw.add(localObject2);
        z.e(((a.d)localObject2).juG, 0.1F);
        z.f(((a.d)localObject2).juG, 0.1F);
        z.d(((a.d)localObject2).juG, 0.0F);
        ((a.d)localObject2).juG.setVisibility(0);
        localObject3 = z.V(((a.d)localObject2).juG);
        ((ai)localObject3).d(this.Uf);
        ((ai)localObject3).a(new an()
        {
          public final void p(View paramAnonymousView)
          {
            GMTrace.i(16357382946816L, 121872);
            GMTrace.o(16357382946816L, 121872);
          }
          
          public final void q(View paramAnonymousView)
          {
            GMTrace.i(16357517164544L, 121873);
            localObject3.a(null);
            g.this.k(localObject2);
            g.this.jvw.remove(localObject2);
            g.this.eK();
            GMTrace.o(16357517164544L, 121873);
          }
        });
        ((ai)localObject3).p(1.0F).s(1.0F).t(1.0F).start();
      }
      this.jvv.clear();
    }
    if (!this.jvx.isEmpty())
    {
      localObject1 = this.jvx.iterator();
      while (((Iterator)localObject1).hasNext())
      {
        localObject2 = (a.d)((Iterator)localObject1).next();
        this.jvy.add(localObject2);
        z.e(((a.d)localObject2).juG, 1.0F);
        z.f(((a.d)localObject2).juG, 1.0F);
        z.d(((a.d)localObject2).juG, 1.0F);
        ((a.d)localObject2).juG.setVisibility(0);
        localObject3 = z.V(((a.d)localObject2).juG);
        ((ai)localObject3).d(this.Uf);
        ((ai)localObject3).a(new an()
        {
          public final void p(View paramAnonymousView)
          {
            GMTrace.i(16365436010496L, 121932);
            GMTrace.o(16365436010496L, 121932);
          }
          
          public final void q(View paramAnonymousView)
          {
            GMTrace.i(16365570228224L, 121933);
            z.e(localObject2.juG, 1.0F);
            z.f(localObject2.juG, 1.0F);
            z.d(localObject2.juG, 1.0F);
            localObject2.juG.setVisibility(8);
            g.this.k(localObject2);
            g.this.jvy.remove(localObject2);
            g.this.eK();
            GMTrace.o(16365570228224L, 121933);
          }
        });
        ((ai)localObject3).p(0.0F).s(0.1F).t(0.1F).start();
      }
      this.jvx.clear();
    }
    if (!this.jvz.isEmpty())
    {
      localObject1 = this.jvz.iterator();
      while (((Iterator)localObject1).hasNext())
      {
        localObject3 = (f)((Iterator)localObject1).next();
        this.jvA.add(((f)localObject3).jvI);
        localObject2 = ((f)localObject3).jvI.Vc;
        z.c((View)localObject2, 0.0F);
        z.d((View)localObject2, 1.0F);
        localObject3 = ((f)localObject3).jvI;
        localObject4 = z.V((View)localObject2);
        ((ai)localObject4).d(this.Ue);
        ((ai)localObject4).a(new an()
        {
          public final void p(View paramAnonymousView)
          {
            GMTrace.i(18196300038144L, 135573);
            g.this.r(localObject3);
            GMTrace.o(18196300038144L, 135573);
          }
          
          public final void q(View paramAnonymousView)
          {
            GMTrace.i(18196434255872L, 135574);
            z.c(paramAnonymousView, 0.0F);
            z.d(paramAnonymousView, 1.0F);
            g.this.k(localObject3);
            g.this.jvA.remove(localObject3);
            g.this.eK();
            GMTrace.o(18196434255872L, 135574);
          }
        });
        ((ai)localObject4).p(0.0F).r(-((View)localObject2).getHeight()).start();
      }
      this.jvz.clear();
    }
    super.eJ();
    if (!this.jvC.isEmpty())
    {
      this.jvD.addAll(this.jvC);
      localObject1 = new Runnable()
      {
        public final void run()
        {
          GMTrace.i(18195092078592L, 135564);
          Iterator localIterator = g.this.jvD.iterator();
          while (localIterator.hasNext())
          {
            a.d locald = (a.d)localIterator.next();
            g localg = g.this;
            ai localai = z.V(locald.Vc);
            localg.jvE.add(locald);
            localai.r(0.0F).d(localg.Ue).a(new g.8(localg, locald, localai)).start();
          }
          g.this.jvD.clear();
          GMTrace.o(18195092078592L, 135564);
        }
      };
      this.jvC.clear();
      if (this.jvF)
      {
        z.a(((a.d)this.jvD.get(0)).Vc, (Runnable)localObject1, this.Ud);
        GMTrace.o(16355235463168L, 121856);
        return;
      }
      ((Runnable)localObject1).run();
    }
    GMTrace.o(16355235463168L, 121856);
  }
  
  public final void eK()
  {
    GMTrace.i(16354967027712L, 121854);
    if (!isRunning()) {
      fS();
    }
    GMTrace.o(16354967027712L, 121854);
  }
  
  public final boolean isRunning()
  {
    GMTrace.i(16355101245440L, 121855);
    if ((!this.jvr.isEmpty()) || (!this.jvs.isEmpty()) || (!this.jvt.isEmpty()) || (!this.jvu.isEmpty()) || (!this.jvv.isEmpty()) || (!this.jvw.isEmpty()) || (!this.jvx.isEmpty()) || (!this.jvy.isEmpty()) || (!this.jvz.isEmpty()) || (!this.jvA.isEmpty()) || (!this.jvC.isEmpty()) || (!this.jvD.isEmpty()) || (!this.jvE.isEmpty()) || (super.isRunning()))
    {
      GMTrace.o(16355101245440L, 121855);
      return true;
    }
    GMTrace.o(16355101245440L, 121855);
    return false;
  }
  
  public final void l(RecyclerView.t paramt)
  {
    GMTrace.i(16355906551808L, 121861);
    super.l(paramt);
    ViewParent localViewParent = paramt.Vc.getParent();
    if ((localViewParent instanceof RecentsRecyclerView)) {
      ((RecentsRecyclerView)localViewParent).bL(paramt.Vc);
    }
    GMTrace.o(16355906551808L, 121861);
  }
  
  public final void r(RecyclerView.t paramt)
  {
    GMTrace.i(18198581739520L, 135590);
    super.r(paramt);
    if (!this.jvA.contains(paramt)) {
      this.jvF = true;
    }
    GMTrace.o(18198581739520L, 135590);
  }
  
  public final void s(RecyclerView.t paramt)
  {
    GMTrace.i(16356040769536L, 121862);
    super.s(paramt);
    if (this.jvB.contains(paramt)) {
      ((RecentsRecyclerView)paramt.Vc.getParent()).bK(paramt.Vc);
    }
    GMTrace.o(16356040769536L, 121862);
  }
  
  public final void t(RecyclerView.t paramt)
  {
    GMTrace.i(16356174987264L, 121863);
    super.t(paramt);
    if (this.jvB.contains(paramt))
    {
      this.jvB.remove(paramt);
      ((RecentsRecyclerView)paramt.Vc.getParent()).bL(paramt.Vc);
    }
    GMTrace.o(16356174987264L, 121863);
  }
  
  private static class a
    extends RecyclerView.e.c
  {
    public a()
    {
      GMTrace.i(16351343149056L, 121827);
      GMTrace.o(16351343149056L, 121827);
    }
    
    final boolean aaT()
    {
      GMTrace.i(16351611584512L, 121829);
      if ((this.Ug & 0x800) > 0)
      {
        GMTrace.o(16351611584512L, 121829);
        return true;
      }
      GMTrace.o(16351611584512L, 121829);
      return false;
    }
    
    public final RecyclerView.e.c b(RecyclerView.t paramt, int paramInt)
    {
      GMTrace.i(16351477366784L, 121828);
      super.b(paramt, paramInt);
      this.Ug = paramInt;
      GMTrace.o(16351477366784L, 121828);
      return this;
    }
  }
  
  private static final class b
    extends g.g
  {
    b(a.d paramd, int paramInt1, int paramInt2)
    {
      super(paramInt1, paramInt2);
      GMTrace.i(16352819544064L, 121838);
      GMTrace.o(16352819544064L, 121838);
    }
  }
  
  private static final class c
    extends g.a
  {
    public c()
    {
      GMTrace.i(16353222197248L, 121841);
      GMTrace.o(16353222197248L, 121841);
    }
  }
  
  private static final class d
    extends g.g
  {
    d(a.d paramd, int paramInt1, int paramInt2)
    {
      super(paramInt1, paramInt2);
      GMTrace.i(16357651382272L, 121874);
      GMTrace.o(16357651382272L, 121874);
    }
  }
  
  private static final class e
    extends g.a
  {
    public e()
    {
      GMTrace.i(16350537842688L, 121821);
      GMTrace.o(16350537842688L, 121821);
    }
  }
  
  private static final class f
  {
    int Qu;
    int Qv;
    a.d jvI;
    
    public f(a.d paramd, int paramInt1, int paramInt2)
    {
      GMTrace.i(16365167575040L, 121930);
      this.jvI = paramd;
      this.Qu = paramInt1;
      this.Qv = paramInt2;
      GMTrace.o(16365167575040L, 121930);
    }
  }
  
  private static class g
  {
    int Qu;
    int Qv;
    a.d jvI;
    
    g(a.d paramd, int paramInt1, int paramInt2)
    {
      GMTrace.i(16363288526848L, 121916);
      this.jvI = paramd;
      this.Qu = paramInt1;
      this.Qv = paramInt2;
      GMTrace.o(16363288526848L, 121916);
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/ui/recents/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */