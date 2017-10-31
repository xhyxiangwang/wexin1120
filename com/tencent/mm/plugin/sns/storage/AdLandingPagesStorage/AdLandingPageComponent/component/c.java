package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component;

import android.content.Context;
import android.os.Handler;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.a;
import android.support.v7.widget.RecyclerView.k;
import android.support.v7.widget.RecyclerView.t;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.bq.a;
import com.tencent.mm.plugin.sns.i.f;
import com.tencent.mm.plugin.sns.i.g;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.j;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.m;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.p;
import com.tencent.mm.sdk.platformtools.aa;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class c
  extends i
{
  public int qpa;
  private RecyclerView qpb;
  private b qpc;
  Map<Integer, a> qpd;
  public LinearLayoutManager qpe;
  public Set<Integer> qpf;
  
  public c(Context paramContext, j paramj, ViewGroup paramViewGroup)
  {
    super(paramContext, paramj, paramViewGroup);
    GMTrace.i(8276133543936L, 61662);
    this.qpa = a.fromDPToPix(paramContext, 12);
    this.qpd = new HashMap();
    this.qpf = new HashSet();
    GMTrace.o(8276133543936L, 61662);
  }
  
  private void biN()
  {
    GMTrace.i(8276536197120L, 61665);
    if (this.qpe != null) {
      cW(this.qpe.fa(), this.qpe.fb());
    }
    GMTrace.o(8276536197120L, 61665);
  }
  
  protected final int aWs()
  {
    GMTrace.i(8276267761664L, 61663);
    int i = i.g.pOo;
    GMTrace.o(8276267761664L, 61663);
    return i;
  }
  
  public final j biK()
  {
    GMTrace.i(16043581898752L, 119534);
    j localj = (j)this.qpH;
    GMTrace.o(16043581898752L, 119534);
    return localj;
  }
  
  public final View biL()
  {
    GMTrace.i(8276401979392L, 61664);
    this.qpb = ((RecyclerView)this.iiK.findViewById(i.f.pKQ));
    this.qpb.setBackgroundColor(((j)this.qpH).backgroundColor);
    Object localObject = ((j)this.qpH).qna.iterator();
    int i = 0;
    int j;
    do
    {
      if (!((Iterator)localObject).hasNext()) {
        break;
      }
      p localp = (p)((Iterator)localObject).next();
      if (!(localp instanceof m)) {
        break label270;
      }
      m localm = (m)localp;
      float f = localp.qnr;
      j = (int)(localp.qnq + f + localm.height) + (this.qpa << 1);
    } while (i > j);
    label270:
    for (;;)
    {
      i = j;
      continue;
      localObject = this.qpb.getLayoutParams();
      ((ViewGroup.LayoutParams)localObject).height = i;
      this.qpb.setLayoutParams((ViewGroup.LayoutParams)localObject);
      this.qpc = new b();
      this.qpb.a(this.qpc);
      this.qpe = new LinearLayoutManager();
      this.qpe.setOrientation(0);
      this.qpb.a(this.qpe);
      this.qpb.a(new c(this.qpb, this.qpe));
      this.qpb.setNestedScrollingEnabled(false);
      this.qpb.Ti = true;
      localObject = this.iiK;
      GMTrace.o(8276401979392L, 61664);
      return (View)localObject;
    }
  }
  
  public final void biM()
  {
    GMTrace.i(16043716116480L, 119535);
    biN();
    int i = this.qpe.fa();
    int j = this.qpe.fb();
    Iterator localIterator = this.qpd.entrySet().iterator();
    while (localIterator.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)localIterator.next();
      if ((((Integer)localEntry.getKey()).intValue() < i) || (((Integer)localEntry.getKey()).intValue() > j)) {
        ((a)localEntry.getValue()).biO();
      }
    }
    GMTrace.o(16043716116480L, 119535);
  }
  
  public final void biv()
  {
    GMTrace.i(8276804632576L, 61667);
    super.biv();
    biN();
    GMTrace.o(8276804632576L, 61667);
  }
  
  public final void biw()
  {
    GMTrace.i(8276938850304L, 61668);
    super.biw();
    if (this.qpe != null)
    {
      int i = this.qpe.fa();
      int j = this.qpe.fb();
      while (i <= j)
      {
        a locala = (a)this.qpd.get(Integer.valueOf(i));
        if (locala != null) {
          locala.biO();
        }
        i += 1;
      }
    }
    GMTrace.o(8276938850304L, 61668);
  }
  
  final void cW(int paramInt1, int paramInt2)
  {
    GMTrace.i(8276670414848L, 61666);
    while (paramInt1 <= paramInt2)
    {
      a locala2 = (a)this.qpd.get(Integer.valueOf(paramInt1));
      a locala1 = locala2;
      if (locala2 == null)
      {
        locala1 = new a();
        this.qpd.put(Integer.valueOf(paramInt1), locala1);
      }
      if (!locala1.isVisible)
      {
        locala1.isVisible = true;
        locala1.qpg = System.currentTimeMillis();
        locala1.count += 1;
      }
      paramInt1 += 1;
    }
    GMTrace.o(8276670414848L, 61666);
  }
  
  public final boolean s(JSONArray paramJSONArray)
  {
    GMTrace.i(8277073068032L, 61669);
    Object localObject1 = new JSONObject();
    if (super.L((JSONObject)localObject1)) {
      paramJSONArray.put(localObject1);
    }
    try
    {
      Object localObject2 = this.qpd;
      localObject1 = this.qpf;
      this.qpf = new HashSet();
      this.qpd = new HashMap();
      localObject2 = ((Map)localObject2).entrySet().iterator();
      while (((Iterator)localObject2).hasNext())
      {
        Object localObject4 = (Map.Entry)((Iterator)localObject2).next();
        Object localObject3 = (p)((j)this.qpH).qna.get(((Integer)((Map.Entry)localObject4).getKey()).intValue());
        if ((!((p)localObject3).qnA) && ((localObject3 instanceof m)))
        {
          Object localObject5 = (m)localObject3;
          localObject3 = new JSONObject();
          ((JSONObject)localObject3).put("cid", ((p)((j)this.qpH).qna.get(((Integer)((Map.Entry)localObject4).getKey()).intValue())).qno);
          ((JSONObject)localObject3).put("exposureCount", ((a)((Map.Entry)localObject4).getValue()).count);
          ((JSONObject)localObject3).put("stayTime", ((a)((Map.Entry)localObject4).getValue()).time);
          if (((Set)localObject1).contains(((Map.Entry)localObject4).getKey()))
          {
            localObject4 = aa.QW(((m)localObject5).qne);
            localObject5 = new JSONObject();
            ((JSONObject)localObject5).put("urlMd5", localObject4);
            ((JSONObject)localObject5).put("needDownload", 1);
            ((JSONObject)localObject3).put("imgUrlInfo", localObject5);
          }
          paramJSONArray.put(localObject3);
        }
      }
      GMTrace.o(8277073068032L, 61669);
    }
    catch (JSONException paramJSONArray)
    {
      w.e("AdLandingCarouselComp", bg.f(paramJSONArray));
      GMTrace.o(8277073068032L, 61669);
      return false;
    }
    return true;
  }
  
  private final class a
  {
    int count;
    boolean isVisible;
    long qpg;
    long time;
    
    public a()
    {
      GMTrace.i(8268080480256L, 61602);
      GMTrace.o(8268080480256L, 61602);
    }
    
    final void biO()
    {
      GMTrace.i(8268214697984L, 61603);
      if (this.isVisible)
      {
        this.isVisible = false;
        if (this.qpg > 0L)
        {
          this.time += System.currentTimeMillis() - this.qpg;
          this.qpg = 0L;
        }
      }
      GMTrace.o(8268214697984L, 61603);
    }
  }
  
  private final class b
    extends RecyclerView.a<a>
  {
    public b()
    {
      GMTrace.i(8274657148928L, 61651);
      GMTrace.o(8274657148928L, 61651);
    }
    
    public final int getItemCount()
    {
      GMTrace.i(8274791366656L, 61652);
      int i = c.this.biK().qna.size();
      GMTrace.o(8274791366656L, 61652);
      return i;
    }
    
    final class a
      extends RecyclerView.t
    {
      public f qpi;
      
      public a(View paramView, f paramf)
      {
        super();
        GMTrace.i(8230902169600L, 61325);
        this.qpi = paramf;
        GMTrace.o(8230902169600L, 61325);
      }
    }
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
      GMTrace.i(8269288439808L, 61611);
      this.qpl = Integer.MAX_VALUE;
      this.qpm = -1;
      this.qpn = -1;
      this.qpo = 0L;
      this.qpp = new Runnable()
      {
        public final void run()
        {
          GMTrace.i(8221372710912L, 61254);
          if (c.c.this.qpl == 1)
          {
            c.c localc = c.c.this;
            w.d("AdLandingCarouselComp", "onDraggin first visible " + localc.qph.qpe.fa() + ", last visible " + localc.qph.qpe.fb());
            localc.qph.biM();
            c.c.this.nRT.postDelayed(c.c.this.qpp, 100L);
          }
          GMTrace.o(8221372710912L, 61254);
        }
      };
      this.nRT = paramRecyclerView;
      this.qpk = paramLinearLayoutManager;
      GMTrace.o(8269288439808L, 61611);
    }
    
    private void biP()
    {
      GMTrace.i(8269422657536L, 61612);
      this.nRT.getHandler().removeCallbacks(this.qpp);
      GMTrace.o(8269422657536L, 61612);
    }
    
    private void f(int paramInt1, int paramInt2, long paramLong)
    {
      int i = 1;
      GMTrace.i(8269825310720L, 61615);
      w.d("AdLandingCarouselComp", "flyingItems start %d, end %d, timeExposure %d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Long.valueOf(paramLong) });
      c localc = c.this;
      if (paramInt1 > paramInt2)
      {
        w.e("AdLandingCarouselComp", "wtf start > end");
        GMTrace.o(8269825310720L, 61615);
        return;
      }
      localc.cW(paramInt1, paramInt2);
      if (paramInt2 == paramInt1) {}
      for (;;)
      {
        paramLong /= i;
        while (paramInt1 <= paramInt2)
        {
          c.a locala = (c.a)localc.qpd.get(Integer.valueOf(paramInt1));
          if ((locala != null) && (locala.isVisible))
          {
            locala.isVisible = false;
            locala.qpg = 0L;
            locala.time += paramLong;
          }
          paramInt1 += 1;
        }
        i = paramInt2 - paramInt1 + 1;
      }
      GMTrace.o(8269825310720L, 61615);
    }
    
    public final void c(RecyclerView paramRecyclerView, int paramInt1, int paramInt2)
    {
      GMTrace.i(8269691092992L, 61614);
      super.c(paramRecyclerView, paramInt1, paramInt2);
      GMTrace.o(8269691092992L, 61614);
    }
    
    public final void e(RecyclerView paramRecyclerView, int paramInt)
    {
      GMTrace.i(8269556875264L, 61613);
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
        w.d("AdLandingCarouselComp", "state " + paramInt);
        GMTrace.o(8269556875264L, 61613);
        return;
        c.this.biM();
        if (this.qpl == 2)
        {
          int i = this.qpk.fa();
          int j = this.qpk.fb();
          if (j < this.qpm)
          {
            f(j, this.qpm, System.currentTimeMillis() - this.qpo);
          }
          else if (i > this.qpn)
          {
            f(this.qpn, i, System.currentTimeMillis() - this.qpo);
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


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */