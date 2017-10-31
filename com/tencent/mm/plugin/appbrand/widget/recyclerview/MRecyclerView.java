package com.tencent.mm.plugin.appbrand.widget.recyclerview;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.a;
import android.support.v7.widget.RecyclerView.c;
import android.support.v7.widget.RecyclerView.t;
import android.util.AttributeSet;
import android.view.View;
import com.tencent.gmtrace.GMTrace;
import java.util.List;

public class MRecyclerView
  extends RecyclerView
{
  private View jJA;
  protected a jJz;
  
  public MRecyclerView(Context paramContext)
  {
    super(paramContext);
    GMTrace.i(10032909385728L, 74751);
    init();
    GMTrace.o(10032909385728L, 74751);
  }
  
  public MRecyclerView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(10033043603456L, 74752);
    init();
    GMTrace.o(10033043603456L, 74752);
  }
  
  public MRecyclerView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(10033177821184L, 74753);
    init();
    GMTrace.o(10033177821184L, 74753);
  }
  
  private void init()
  {
    GMTrace.i(10033312038912L, 74754);
    this.jJz = new a();
    this.jJz.fQ();
    super.a(this.jJz);
    this.jJz.a(new RecyclerView.c()
    {
      public final void onChanged()
      {
        GMTrace.i(10038143877120L, 74790);
        View localView;
        if (MRecyclerView.a(MRecyclerView.this) != null)
        {
          localView = MRecyclerView.a(MRecyclerView.this);
          if (!MRecyclerView.this.adu()) {
            break label52;
          }
        }
        label52:
        for (int i = 0;; i = 8)
        {
          localView.setVisibility(i);
          GMTrace.o(10038143877120L, 74790);
          return;
        }
      }
    });
    GMTrace.o(10033312038912L, 74754);
  }
  
  public final int A(RecyclerView.t paramt)
  {
    GMTrace.i(10033446256640L, 74755);
    if (this.jJz == null)
    {
      GMTrace.o(10033446256640L, 74755);
      return -1;
    }
    a locala = this.jJz;
    if (paramt == null)
    {
      GMTrace.o(10033446256640L, 74755);
      return -1;
    }
    if (paramt.gf() == -1)
    {
      GMTrace.o(10033446256640L, 74755);
      return -1;
    }
    int j = paramt.gf();
    if (locala.jJm.isEmpty()) {}
    for (int i = 0;; i = 1)
    {
      GMTrace.o(10033446256640L, 74755);
      return j - i;
    }
  }
  
  public final void a(RecyclerView.a parama)
  {
    GMTrace.i(10033580474368L, 74756);
    a locala = this.jJz;
    if (locala.Tb != null)
    {
      if (!locala.Tb.equals(parama)) {
        locala.Tb.b(locala.jJq);
      }
    }
    else
    {
      locala.Tb = parama;
      if (locala.Tb != null) {
        locala.Tb.a(locala.jJq);
      }
    }
    GMTrace.o(10033580474368L, 74756);
  }
  
  public final void aX(int paramInt)
  {
    GMTrace.i(10033714692096L, 74757);
    super.aX(paramInt);
    GMTrace.o(10033714692096L, 74757);
  }
  
  public void addFooterView(View paramView)
  {
    GMTrace.i(10033983127552L, 74759);
    this.jJz.jJn.add(paramView);
    GMTrace.o(10033983127552L, 74759);
  }
  
  public final void addHeaderView(View paramView)
  {
    GMTrace.i(10033848909824L, 74758);
    this.jJz.jJm.add(paramView);
    GMTrace.o(10033848909824L, 74758);
  }
  
  protected boolean adu()
  {
    GMTrace.i(10034385780736L, 74762);
    if (this.jJz.getItemCount() == 0)
    {
      GMTrace.o(10034385780736L, 74762);
      return true;
    }
    GMTrace.o(10034385780736L, 74762);
    return false;
  }
  
  public final void b(int paramInt, View paramView)
  {
    GMTrace.i(10034117345280L, 74760);
    this.jJz.jJn.add(paramInt, paramView);
    GMTrace.o(10034117345280L, 74760);
  }
  
  public final void cd(View paramView)
  {
    GMTrace.i(10034251563008L, 74761);
    this.jJz.jJn.remove(paramView);
    GMTrace.o(10034251563008L, 74761);
  }
  
  public final RecyclerView.a fn()
  {
    GMTrace.i(15056142073856L, 112177);
    a locala = this.jJz;
    GMTrace.o(15056142073856L, 112177);
    return locala;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/widget/recyclerview/MRecyclerView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */