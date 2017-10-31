package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget;

import android.os.Handler;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.k;
import com.tencent.gmtrace.GMTrace;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public final class b
{
  private RecyclerView nRT;
  public Map<Integer, a> qpd;
  private LinearLayoutManager qpe;
  public b qsK;
  private com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.a.b qsL;
  
  public b(RecyclerView paramRecyclerView, com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.a.b paramb)
  {
    GMTrace.i(17099472764928L, 127401);
    this.qpd = new HashMap();
    this.nRT = paramRecyclerView;
    this.qsL = paramb;
    if ((paramRecyclerView.Tc == null) || (!(paramRecyclerView.Tc instanceof LinearLayoutManager))) {
      throw new IllegalArgumentException("set LinearLayoutManger to RecyclerView first");
    }
    if ((paramRecyclerView.fn() == null) || (!(paramRecyclerView.fn() instanceof b))) {
      throw new IllegalArgumentException("set Adapter which implemented ExposureListener to RecyclerView first");
    }
    this.qsK = ((b)paramRecyclerView.fn());
    this.qpe = ((LinearLayoutManager)paramRecyclerView.Tc);
    this.nRT.a(new c(paramRecyclerView, (LinearLayoutManager)paramRecyclerView.Tc));
    GMTrace.o(17099472764928L, 127401);
  }
  
  public final void biM()
  {
    GMTrace.i(17099606982656L, 127402);
    biN();
    int i = this.qpe.fa();
    int j = this.qpe.fb();
    Iterator localIterator = this.qpd.entrySet().iterator();
    while (localIterator.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)localIterator.next();
      if ((((Integer)localEntry.getKey()).intValue() < i) || (((Integer)localEntry.getKey()).intValue() > j))
      {
        if (((a)localEntry.getValue()).qmD)
        {
          this.qsK.ux(((Integer)localEntry.getKey()).intValue());
          ((a)localEntry.getValue()).biO();
        }
      }
      else if ((((a)localEntry.getValue()).qmD) && (!this.qsK.uy(((Integer)localEntry.getKey()).intValue())))
      {
        this.qsK.ux(((Integer)localEntry.getKey()).intValue());
        ((a)localEntry.getValue()).biO();
      }
    }
    GMTrace.o(17099606982656L, 127402);
  }
  
  public final void biN()
  {
    GMTrace.i(17099741200384L, 127403);
    if (this.qpe != null)
    {
      int i = this.qpe.fa();
      int j = this.qpe.fb();
      if ((i == j) && (i == -1))
      {
        GMTrace.o(17099741200384L, 127403);
        return;
      }
      cW(i, j);
    }
    GMTrace.o(17099741200384L, 127403);
  }
  
  public final void bjo()
  {
    GMTrace.i(17100009635840L, 127405);
    int i;
    int j;
    if (this.qpe != null)
    {
      i = this.qpe.fa();
      j = this.qpe.fb();
      if ((i != j) || (i != -1)) {
        break label113;
      }
      GMTrace.o(17100009635840L, 127405);
    }
    label113:
    for (;;)
    {
      if (i <= j)
      {
        a locala = (a)this.qpd.get(Integer.valueOf(i));
        if ((locala != null) && (locala.qmD))
        {
          this.qsK.ux(i);
          locala.biO();
        }
        i += 1;
      }
      else
      {
        GMTrace.o(17100009635840L, 127405);
        return;
      }
    }
  }
  
  final void cW(int paramInt1, int paramInt2)
  {
    GMTrace.i(17099875418112L, 127404);
    while (paramInt1 <= paramInt2)
    {
      a locala2 = (a)this.qpd.get(Integer.valueOf(paramInt1));
      a locala1 = locala2;
      if (locala2 == null)
      {
        locala1 = new a();
        this.qpd.put(Integer.valueOf(paramInt1), locala1);
      }
      if ((!locala1.qmD) && (this.qsK.uy(paramInt1)))
      {
        this.qsK.a(paramInt1, this);
        if (!locala1.qmD) {
          locala1.qmD = true;
        }
      }
      paramInt1 += 1;
    }
    GMTrace.o(17099875418112L, 127404);
  }
  
  private final class a
  {
    public boolean qmD;
    
    public a()
    {
      GMTrace.i(17100143853568L, 127406);
      GMTrace.o(17100143853568L, 127406);
    }
    
    final void biO()
    {
      GMTrace.i(17100278071296L, 127407);
      if (this.qmD) {
        this.qmD = false;
      }
      GMTrace.o(17100278071296L, 127407);
    }
  }
  
  public static abstract interface b
  {
    public abstract void a(int paramInt, b paramb);
    
    public abstract void onDestroy();
    
    public abstract void ux(int paramInt);
    
    public abstract boolean uy(int paramInt);
  }
  
  private final class c
    extends RecyclerView.k
  {
    public RecyclerView nRT;
    private LinearLayoutManager qpk;
    public int qpl;
    private int qpm;
    private int qpn;
    private long qpo;
    public Runnable qpp;
    
    public c(RecyclerView paramRecyclerView, LinearLayoutManager paramLinearLayoutManager)
    {
      GMTrace.i(17098667458560L, 127395);
      this.qpl = Integer.MAX_VALUE;
      this.qpm = -1;
      this.qpn = -1;
      this.qpo = 0L;
      this.qpp = new Runnable()
      {
        public final void run()
        {
          GMTrace.i(17123766173696L, 127582);
          if (b.c.this.qpl == 1)
          {
            b.this.biM();
            b.c.this.nRT.postDelayed(b.c.this.qpp, 100L);
          }
          GMTrace.o(17123766173696L, 127582);
        }
      };
      this.nRT = paramRecyclerView;
      this.qpk = paramLinearLayoutManager;
      GMTrace.o(17098667458560L, 127395);
    }
    
    private void biP()
    {
      GMTrace.i(17098801676288L, 127396);
      this.nRT.getHandler().removeCallbacks(this.qpp);
      GMTrace.o(17098801676288L, 127396);
    }
    
    private void cX(int paramInt1, int paramInt2)
    {
      GMTrace.i(17099204329472L, 127399);
      b localb = b.this;
      if (paramInt1 <= paramInt2)
      {
        localb.cW(paramInt1, paramInt2);
        while (paramInt1 <= paramInt2)
        {
          b.a locala = (b.a)localb.qpd.get(Integer.valueOf(paramInt1));
          if ((locala != null) && (locala.qmD))
          {
            localb.qsK.ux(paramInt1);
            locala.biO();
          }
          paramInt1 += 1;
        }
      }
      GMTrace.o(17099204329472L, 127399);
    }
    
    public final void c(RecyclerView paramRecyclerView, int paramInt1, int paramInt2)
    {
      GMTrace.i(17099070111744L, 127398);
      super.c(paramRecyclerView, paramInt1, paramInt2);
      GMTrace.o(17099070111744L, 127398);
    }
    
    public final void e(RecyclerView paramRecyclerView, int paramInt)
    {
      GMTrace.i(17098935894016L, 127397);
      super.e(paramRecyclerView, paramInt);
      if (paramInt != this.qpl)
      {
        if (paramInt != 1) {
          biP();
        }
        switch (paramInt)
        {
        }
      }
      for (;;)
      {
        this.qpl = paramInt;
        GMTrace.o(17098935894016L, 127397);
        return;
        b.this.biM();
        if (this.qpl == 2)
        {
          int i = this.qpk.fa();
          int j = this.qpk.fb();
          if (j < this.qpm)
          {
            cX(j, this.qpm);
          }
          else if (i > this.qpn)
          {
            cX(this.qpn, i);
            continue;
            biP();
            this.nRT.postDelayed(this.qpp, 100L);
            continue;
            this.qpm = this.qpk.fa();
            this.qpn = this.qpk.fb();
            this.qpo = System.currentTimeMillis();
          }
        }
      }
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/widget/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */