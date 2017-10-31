package com.tencent.mm.plugin.appbrand.widget.recyclerview;

import android.support.v7.widget.RecyclerView.a;
import android.support.v7.widget.RecyclerView.b;
import android.support.v7.widget.RecyclerView.c;
import android.support.v7.widget.RecyclerView.t;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.widget.o.a;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

final class a
  extends RecyclerView.a<RecyclerView.t>
{
  private static ViewGroup.LayoutParams jJj;
  RecyclerView.a Tb;
  private ViewGroup jJk;
  private ViewGroup jJl;
  public List<View> jJm;
  List<View> jJn;
  public b jJo;
  public c jJp;
  RecyclerView.c jJq;
  
  static
  {
    GMTrace.i(10037875441664L, 74788);
    jJj = new ViewGroup.LayoutParams(-1, -2);
    GMTrace.o(10037875441664L, 74788);
  }
  
  a()
  {
    GMTrace.i(10036667482112L, 74779);
    this.jJm = new LinkedList();
    this.jJn = new LinkedList();
    this.jJq = new RecyclerView.c()
    {
      public final void S(int paramAnonymousInt1, int paramAnonymousInt2)
      {
        GMTrace.i(10038814965760L, 74795);
        if (a.this.jJm.isEmpty()) {}
        for (int i = 0;; i = 1)
        {
          a.this.O(i + paramAnonymousInt1, paramAnonymousInt2);
          GMTrace.o(10038814965760L, 74795);
          return;
        }
      }
      
      public final void T(int paramAnonymousInt1, int paramAnonymousInt2)
      {
        GMTrace.i(10039083401216L, 74797);
        if (a.this.jJm.isEmpty()) {}
        for (int i = 0;; i = 1)
        {
          a.this.Q(i + paramAnonymousInt1, paramAnonymousInt2);
          GMTrace.o(10039083401216L, 74797);
          return;
        }
      }
      
      public final void U(int paramAnonymousInt1, int paramAnonymousInt2)
      {
        GMTrace.i(10039217618944L, 74798);
        if (a.this.jJm.isEmpty()) {}
        for (int i = 0;; i = 1)
        {
          a.this.R(i + paramAnonymousInt1, paramAnonymousInt2);
          GMTrace.o(10039217618944L, 74798);
          return;
        }
      }
      
      public final void V(int paramAnonymousInt1, int paramAnonymousInt2)
      {
        int j = 0;
        GMTrace.i(10039351836672L, 74799);
        a locala = a.this;
        int i;
        if (a.this.jJm.isEmpty())
        {
          i = 0;
          if (!a.this.jJm.isEmpty()) {
            break label75;
          }
        }
        for (;;)
        {
          locala.P(i + paramAnonymousInt1, j + paramAnonymousInt2);
          GMTrace.o(10039351836672L, 74799);
          return;
          i = 1;
          break;
          label75:
          j = 1;
        }
      }
      
      public final void c(int paramAnonymousInt1, int paramAnonymousInt2, Object paramAnonymousObject)
      {
        GMTrace.i(10038949183488L, 74796);
        if (a.this.jJm.isEmpty()) {}
        for (int i = 0;; i = 1)
        {
          a.this.b(i + paramAnonymousInt1, paramAnonymousInt2, paramAnonymousObject);
          GMTrace.o(10038949183488L, 74796);
          return;
        }
      }
      
      public final void onChanged()
      {
        GMTrace.i(10038680748032L, 74794);
        a.this.TY.notifyChanged();
        GMTrace.o(10038680748032L, 74794);
      }
    };
    GMTrace.o(10036667482112L, 74779);
  }
  
  public final RecyclerView.t a(ViewGroup paramViewGroup, int paramInt)
  {
    GMTrace.i(10037204353024L, 74783);
    Iterator localIterator;
    if (paramInt == 2147483646)
    {
      if (this.jJk != null) {
        this.jJk.removeAllViews();
      }
      paramViewGroup = (ViewGroup)LayoutInflater.from(paramViewGroup.getContext()).inflate(o.a.jzT, paramViewGroup, false);
      this.jJk = paramViewGroup;
      localIterator = this.jJn.iterator();
      while (localIterator.hasNext()) {
        paramViewGroup.addView((View)localIterator.next(), jJj);
      }
      paramViewGroup = new a(paramViewGroup);
      GMTrace.o(10037204353024L, 74783);
      return paramViewGroup;
    }
    if (paramInt == Integer.MAX_VALUE)
    {
      if (this.jJl != null) {
        this.jJl.removeAllViews();
      }
      paramViewGroup = (ViewGroup)LayoutInflater.from(paramViewGroup.getContext()).inflate(o.a.jzT, paramViewGroup, false);
      this.jJl = paramViewGroup;
      localIterator = this.jJm.iterator();
      while (localIterator.hasNext()) {
        paramViewGroup.addView((View)localIterator.next(), jJj);
      }
      paramViewGroup = new a(paramViewGroup);
      GMTrace.o(10037204353024L, 74783);
      return paramViewGroup;
    }
    paramViewGroup = this.Tb.a(paramViewGroup, paramInt);
    GMTrace.o(10037204353024L, 74783);
    return paramViewGroup;
  }
  
  public final void a(final RecyclerView.t paramt, final int paramInt)
  {
    GMTrace.i(10037070135296L, 74782);
    if ((!this.jJm.isEmpty()) && (paramInt == 0))
    {
      GMTrace.o(10037070135296L, 74782);
      return;
    }
    if ((!this.jJn.isEmpty()) && (paramInt == getItemCount() - 1))
    {
      GMTrace.o(10037070135296L, 74782);
      return;
    }
    if (this.jJm.isEmpty()) {}
    for (int i = 0;; i = 1)
    {
      paramInt -= i;
      this.Tb.a(paramt, paramInt);
      if (this.jJo != null) {
        paramt.Vc.setOnClickListener(new View.OnClickListener()
        {
          public final void onClick(View paramAnonymousView)
          {
            GMTrace.i(10038412312576L, 74792);
            if (a.this.jJo != null)
            {
              paramAnonymousView = a.this.jJo;
              paramAnonymousView = paramt.Vc;
              long l = paramt.Ve;
            }
            GMTrace.o(10038412312576L, 74792);
          }
        });
      }
      if (this.jJp != null) {
        paramt.Vc.setOnLongClickListener(new View.OnLongClickListener()
        {
          public final boolean onLongClick(View paramAnonymousView)
          {
            GMTrace.i(10036533264384L, 74778);
            if (a.this.jJp != null)
            {
              paramAnonymousView = a.this.jJp;
              View localView = paramt.Vc;
              long l = paramt.Ve;
              boolean bool = paramAnonymousView.adv();
              GMTrace.o(10036533264384L, 74778);
              return bool;
            }
            GMTrace.o(10036533264384L, 74778);
            return false;
          }
        });
      }
      GMTrace.o(10037070135296L, 74782);
      return;
    }
  }
  
  public final void a(RecyclerView.t paramt, int paramInt, List<Object> paramList)
  {
    GMTrace.i(16341679472640L, 121755);
    if ((!this.jJm.isEmpty()) && (paramInt == 0))
    {
      GMTrace.o(16341679472640L, 121755);
      return;
    }
    if ((!this.jJn.isEmpty()) && (paramInt == getItemCount() - 1))
    {
      GMTrace.o(16341679472640L, 121755);
      return;
    }
    if (this.jJm.isEmpty()) {}
    for (int i = 0;; i = 1)
    {
      this.Tb.a(paramt, paramInt - i, paramList);
      GMTrace.o(16341679472640L, 121755);
      return;
    }
  }
  
  public final int adt()
  {
    GMTrace.i(10037338570752L, 74784);
    int i = this.jJn.size();
    GMTrace.o(10037338570752L, 74784);
    return i;
  }
  
  public final int getItemCount()
  {
    GMTrace.i(10036935917568L, 74781);
    int j = this.Tb.getItemCount();
    int i = j;
    if (!this.jJm.isEmpty()) {
      i = j + 1;
    }
    j = i;
    if (!this.jJn.isEmpty()) {
      j = i + 1;
    }
    GMTrace.o(10036935917568L, 74781);
    return j;
  }
  
  public final long getItemId(int paramInt)
  {
    GMTrace.i(17785056919552L, 132509);
    long l;
    if (getItemViewType(paramInt) == Integer.MAX_VALUE)
    {
      l = "MRecyclerHeaderView".hashCode();
      GMTrace.o(17785056919552L, 132509);
      return l;
    }
    if (getItemViewType(paramInt) == 2147483646)
    {
      l = "MRecyclerFooterView".hashCode();
      GMTrace.o(17785056919552L, 132509);
      return l;
    }
    if (!this.Tb.TZ)
    {
      l = paramInt;
      GMTrace.o(17785056919552L, 132509);
      return l;
    }
    RecyclerView.a locala = this.Tb;
    if (this.jJm.isEmpty()) {}
    for (int i = 0;; i = 1)
    {
      l = locala.getItemId(paramInt - i);
      GMTrace.o(17785056919552L, 132509);
      return l;
    }
  }
  
  public final int getItemViewType(int paramInt)
  {
    GMTrace.i(10036801699840L, 74780);
    if ((!this.jJm.isEmpty()) && (paramInt == 0))
    {
      GMTrace.o(10036801699840L, 74780);
      return Integer.MAX_VALUE;
    }
    if ((!this.jJn.isEmpty()) && (paramInt == getItemCount() - 1))
    {
      GMTrace.o(10036801699840L, 74780);
      return 2147483646;
    }
    RecyclerView.a locala = this.Tb;
    if (this.jJm.isEmpty()) {}
    for (int i = 0;; i = 1)
    {
      paramInt = locala.getItemViewType(paramInt - i);
      GMTrace.o(10036801699840L, 74780);
      return paramInt;
    }
  }
  
  private static final class a
    extends RecyclerView.t
  {
    a(View paramView)
    {
      super();
      GMTrace.i(10039888707584L, 74803);
      GMTrace.o(10039888707584L, 74803);
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/widget/recyclerview/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */