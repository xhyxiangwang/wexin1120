package com.tencent.mm.plugin.appbrand.ui.recents;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.kernel.h;
import com.tencent.mm.modelappbrand.a.b.f;
import com.tencent.mm.plugin.appbrand.c.c.b;
import com.tencent.mm.plugin.appbrand.c.c.c;
import com.tencent.mm.plugin.appbrand.c.d.d;
import com.tencent.mm.plugin.appbrand.p.f;
import com.tencent.mm.plugin.appbrand.p.g;
import com.tencent.mm.plugin.appbrand.p.i;
import com.tencent.mm.plugin.appbrand.report.a.b.a;
import com.tencent.mm.plugin.appbrand.report.a.b.b;
import com.tencent.mm.plugin.appbrand.ui.AppBrandLauncherUI;
import com.tencent.mm.plugin.appbrand.ui.AppBrandNearbyEmptyUI;
import com.tencent.mm.plugin.appbrand.widget.AppBrandNearbyShowcaseView;
import com.tencent.mm.protocal.c.aev;
import com.tencent.mm.protocal.c.aom;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.ui.widget.ThreeDotsLoadingView;
import java.util.LinkedList;

final class c
  implements View.OnClickListener, c.c
{
  View Vc;
  public Activity fGo;
  private ThreeDotsLoadingView juM;
  private int juP;
  private final int juQ;
  private final int juR;
  private final int juS;
  private b.f juT;
  private final int juU;
  private final int juV;
  View juW;
  TextView juX;
  public AppBrandNearbyShowcaseView juY;
  public View juZ;
  private ImageView jva;
  public boolean jvb;
  
  c(Activity paramActivity, ViewGroup paramViewGroup)
  {
    GMTrace.i(16344766480384L, 121778);
    this.juP = a.jvh;
    this.juU = -1;
    this.jvb = false;
    this.fGo = paramActivity;
    this.juQ = com.tencent.mm.bq.a.fromDPToPix(paramActivity, 25);
    this.juR = com.tencent.mm.bq.a.fromDPToPix(paramActivity, 15);
    this.juS = com.tencent.mm.bq.a.fromDPToPix(paramActivity, 2);
    this.Vc = LayoutInflater.from(paramActivity).inflate(p.g.ivq, paramViewGroup, false);
    paramActivity = this.Vc.findViewById(p.f.itP);
    this.juZ = paramActivity;
    paramActivity.setOnClickListener(this);
    this.juW = this.Vc.findViewById(p.f.iuk);
    this.juX = ((TextView)this.Vc.findViewById(p.f.iul));
    this.juY = ((AppBrandNearbyShowcaseView)this.Vc.findViewById(p.f.iuh));
    this.juY.jM(4);
    this.juY.jK(this.juQ + this.juS * 2);
    this.juY.jL(this.juR);
    this.juM = ((ThreeDotsLoadingView)this.Vc.findViewById(p.f.iui));
    this.jva = ((ImageView)this.Vc.findViewById(p.f.iuj));
    this.juV = this.juX.getCurrentTextColor();
    GMTrace.o(16344766480384L, 121778);
  }
  
  private static int au(String paramString, int paramInt)
  {
    GMTrace.i(19703430905856L, 146802);
    try
    {
      int i = Color.parseColor(paramString);
      GMTrace.o(19703430905856L, 146802);
      return i;
    }
    catch (Exception paramString)
    {
      GMTrace.o(19703430905856L, 146802);
    }
    return paramInt;
  }
  
  private static void b(View paramView, Runnable paramRunnable)
  {
    GMTrace.i(16345303351296L, 121782);
    if (paramView.getVisibility() != 0)
    {
      paramView.setAlpha(0.0F);
      paramView.setVisibility(0);
    }
    paramView.animate().setDuration(200L).alpha(1.0F).withEndAction(paramRunnable).start();
    GMTrace.o(16345303351296L, 121782);
  }
  
  private void bJ(final View paramView)
  {
    GMTrace.i(16345169133568L, 121781);
    if (paramView.getVisibility() == 0) {
      paramView.animate().setDuration(200L).alpha(0.0F).withEndAction(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(16356846075904L, 121868);
          paramView.setVisibility(8);
          GMTrace.o(16356846075904L, 121868);
        }
      }).start();
    }
    GMTrace.o(16345169133568L, 121781);
  }
  
  public final void To()
  {
    GMTrace.i(16345437569024L, 121783);
    if (this.Vc != null) {
      this.Vc.post(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(16344632262656L, 121777);
          c.this.aaO();
          if (c.this.jvb)
          {
            c.this.juZ.performClick();
            c.this.jvb = false;
          }
          GMTrace.o(16344632262656L, 121777);
        }
      });
    }
    GMTrace.o(16345437569024L, 121783);
  }
  
  final void aaN()
  {
    GMTrace.i(16344900698112L, 121779);
    this.juP = a.jvi;
    bJ(this.juW);
    bJ(this.jva);
    b(this.juM, null);
    this.juM.cgs();
    GMTrace.o(16344900698112L, 121779);
  }
  
  public final void aaO()
  {
    final boolean bool = true;
    int j = 0;
    GMTrace.i(16345034915840L, 121780);
    if (this.Vc == null)
    {
      GMTrace.o(16345034915840L, 121780);
      return;
    }
    Object localObject1;
    if (com.tencent.mm.plugin.appbrand.c.c.Th())
    {
      this.Vc.setVisibility(0);
      localObject1 = ((AppBrandLauncherUI)this.fGo).jqz;
      if (localObject1 != null) {
        ((d.d)localObject1).iEF[5] = "1";
      }
    }
    for (;;)
    {
      this.juM.Zo();
      bJ(this.juM);
      localObject1 = com.tencent.mm.plugin.appbrand.c.c.Tl();
      if (localObject1 != null) {
        break;
      }
      this.juP = a.jvf;
      bJ(this.juW);
      b(this.jva, null);
      GMTrace.o(16345034915840L, 121780);
      return;
      this.Vc.setVisibility(8);
    }
    if ((((aev)localObject1).jMS <= 0) || (bg.bX(((aev)localObject1).uaz)))
    {
      this.juP = a.jvh;
      bJ(this.juW);
      GMTrace.o(16345034915840L, 121780);
      return;
    }
    this.juP = a.jvg;
    Object localObject2 = ((AppBrandLauncherUI)this.fGo).jqz;
    if (localObject2 != null) {
      ((d.d)localObject2).iEF[3] = "1";
    }
    localObject2 = c.b.hR(((aev)localObject1).uaD);
    switch (6.jve[localObject2.ordinal()])
    {
    default: 
      this.juY.jM(Math.min(((aev)localObject1).uaz.size(), 4));
      if (this.juW.getVisibility() == 0) {
        break;
      }
    }
    for (;;)
    {
      if (bool) {
        this.juY.abw();
      }
      int i = j;
      if (this.juT == null)
      {
        this.juT = new com.tencent.mm.plugin.appbrand.ui.widget.a(this.juQ, this.juS);
        i = j;
      }
      while (i < this.juY.getChildCount())
      {
        com.tencent.mm.modelappbrand.a.b.CT().a(this.juY.jN(i), ((aom)((aev)localObject1).uaz.get(i)).uky, com.tencent.mm.modelappbrand.a.a.CS(), this.juT);
        i += 1;
      }
      this.juX.setText(this.fGo.getString(p.i.ixE, new Object[] { Integer.valueOf(((aev)localObject1).jMS) }));
      break;
      this.juX.setText(((aev)localObject1).fEM);
      this.juX.setTextColor(au(((aev)localObject1).uaE, this.juV));
      break;
      bool = false;
    }
    b(this.juW, new Runnable()
    {
      public final void run()
      {
        GMTrace.i(16344363827200L, 121775);
        if ((bool) && (c.this.juY != null)) {
          c.this.juY.abx();
        }
        GMTrace.o(16344363827200L, 121775);
      }
    });
    GMTrace.o(16345034915840L, 121780);
  }
  
  public final void aaP()
  {
    GMTrace.i(16345706004480L, 121785);
    if (this.fGo == null)
    {
      GMTrace.o(16345706004480L, 121785);
      return;
    }
    d.d locald = ((AppBrandLauncherUI)this.fGo).jqz;
    if (locald != null) {
      locald.iEF[8] = "1";
    }
    GMTrace.o(16345706004480L, 121785);
  }
  
  public final void onClick(View paramView)
  {
    int i = 0;
    GMTrace.i(16345571786752L, 121784);
    if (paramView.getId() == p.f.itP)
    {
      if (this.fGo == null)
      {
        GMTrace.o(16345571786752L, 121784);
        return;
      }
      if (a.jvi == this.juP)
      {
        GMTrace.o(16345571786752L, 121784);
        return;
      }
      if (a.jvh == this.juP)
      {
        aaP();
        this.fGo.startActivityForResult(new Intent(this.fGo, AppBrandNearbyEmptyUI.class), 3);
        GMTrace.o(16345571786752L, 121784);
        return;
      }
      if ((com.tencent.mm.plugin.appbrand.c.c.Tl() != null) && (com.tencent.mm.plugin.appbrand.c.c.Tm())) {}
      for (boolean bool = true;; bool = false)
      {
        this.jvb = bool;
        if ((a.jvf == this.juP) || (this.jvb)) {
          i = 1;
        }
        paramView = new Runnable()
        {
          public final void run()
          {
            GMTrace.i(16346779746304L, 121793);
            if (c.this.fGo == null)
            {
              GMTrace.o(16346779746304L, 121793);
              return;
            }
            aev localaev = com.tencent.mm.plugin.appbrand.c.c.Tl();
            if ((localaev != null) && (!bg.mZ(localaev.uax)))
            {
              ((com.tencent.mm.plugin.appbrand.compat.a.a)h.h(com.tencent.mm.plugin.appbrand.compat.a.a.class)).I(c.this.fGo, localaev.uax);
              c.this.aaP();
              com.tencent.mm.plugin.appbrand.report.a.b localb = new com.tencent.mm.plugin.appbrand.report.a.b();
              localb.joC = b.b.joO;
              localb.joD = localaev.jMS;
              localb.joE = localaev.uav;
              localb.joG = b.a.joH;
              localb.rB();
            }
            GMTrace.o(16346779746304L, 121793);
          }
        };
        if (i == 0) {
          break;
        }
        aaN();
        com.tencent.mm.plugin.appbrand.c.c.refresh();
        GMTrace.o(16345571786752L, 121784);
        return;
      }
      paramView.run();
    }
    GMTrace.o(16345571786752L, 121784);
  }
  
  private static enum a
  {
    static
    {
      GMTrace.i(16350940495872L, 121824);
      jvf = 1;
      jvg = 2;
      jvh = 3;
      jvi = 4;
      jvj = new int[] { jvf, jvg, jvh, jvi };
      GMTrace.o(16350940495872L, 121824);
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/ui/recents/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */