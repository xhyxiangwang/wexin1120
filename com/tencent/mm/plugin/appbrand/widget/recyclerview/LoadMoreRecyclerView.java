package com.tencent.mm.plugin.appbrand.widget.recyclerview;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.a;
import android.support.v7.widget.RecyclerView.c;
import android.support.v7.widget.RecyclerView.h;
import android.support.v7.widget.RecyclerView.k;
import android.util.AttributeSet;
import android.view.View;
import com.tencent.gmtrace.GMTrace;

public class LoadMoreRecyclerView
  extends MRecyclerView
{
  public View jJt;
  public a jJu;
  public boolean jJv;
  
  public LoadMoreRecyclerView(Context paramContext)
  {
    super(paramContext);
    GMTrace.i(10034788433920L, 74765);
    init();
    GMTrace.o(10034788433920L, 74765);
  }
  
  public LoadMoreRecyclerView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(10034922651648L, 74766);
    init();
    GMTrace.o(10034922651648L, 74766);
  }
  
  public LoadMoreRecyclerView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(10035056869376L, 74767);
    init();
    GMTrace.o(10035056869376L, 74767);
  }
  
  private void init()
  {
    GMTrace.i(10035325304832L, 74769);
    final LinearLayoutManager localLinearLayoutManager = aaI();
    super.a(localLinearLayoutManager);
    a(new RecyclerView.k()
    {
      int jJw;
      
      public final void c(RecyclerView paramAnonymousRecyclerView, int paramAnonymousInt1, int paramAnonymousInt2)
      {
        GMTrace.i(10039754489856L, 74802);
        super.c(paramAnonymousRecyclerView, paramAnonymousInt1, paramAnonymousInt2);
        this.jJw = localLinearLayoutManager.fb();
        GMTrace.o(10039754489856L, 74802);
      }
      
      public final void e(RecyclerView paramAnonymousRecyclerView, int paramAnonymousInt)
      {
        GMTrace.i(10039620272128L, 74801);
        super.e(paramAnonymousRecyclerView, paramAnonymousInt);
        if ((paramAnonymousInt == 0) && (LoadMoreRecyclerView.this.jJv) && (this.jJw == LoadMoreRecyclerView.this.jJz.getItemCount() - 1) && (LoadMoreRecyclerView.a(LoadMoreRecyclerView.this) != null))
        {
          paramAnonymousRecyclerView = LoadMoreRecyclerView.a(LoadMoreRecyclerView.this);
          RecyclerView.a locala = LoadMoreRecyclerView.this.jJz.Tb;
          paramAnonymousRecyclerView.aaJ();
        }
        GMTrace.o(10039620272128L, 74801);
      }
    });
    this.jJz.a(new RecyclerView.c()
    {
      public final void U(int paramAnonymousInt1, int paramAnonymousInt2)
      {
        GMTrace.i(10036130611200L, 74775);
        super.U(paramAnonymousInt1, paramAnonymousInt2);
        if ((LoadMoreRecyclerView.this.jJv) && (localLinearLayoutManager.fb() == LoadMoreRecyclerView.this.jJz.getItemCount() - 1) && (LoadMoreRecyclerView.a(LoadMoreRecyclerView.this) != null))
        {
          LoadMoreRecyclerView.a locala = LoadMoreRecyclerView.a(LoadMoreRecyclerView.this);
          RecyclerView.a locala1 = LoadMoreRecyclerView.this.jJz.Tb;
          locala.aaJ();
        }
        GMTrace.o(10036130611200L, 74775);
      }
    });
    GMTrace.o(10035325304832L, 74769);
  }
  
  public final void a(RecyclerView.h paramh)
  {
    GMTrace.i(10035593740288L, 74771);
    GMTrace.o(10035593740288L, 74771);
  }
  
  public LinearLayoutManager aaI()
  {
    GMTrace.i(10035191087104L, 74768);
    getContext();
    LinearLayoutManager localLinearLayoutManager = new LinearLayoutManager();
    GMTrace.o(10035191087104L, 74768);
    return localLinearLayoutManager;
  }
  
  public final void addFooterView(View paramView)
  {
    GMTrace.i(10035459522560L, 74770);
    int i = this.jJz.adt() - 1;
    if ((this.jJt == null) || (i < 0))
    {
      super.addFooterView(paramView);
      GMTrace.o(10035459522560L, 74770);
      return;
    }
    super.b(i, paramView);
    GMTrace.o(10035459522560L, 74770);
  }
  
  protected final boolean adu()
  {
    GMTrace.i(10035727958016L, 74772);
    if (this.jJt != null)
    {
      if ((this.jJz.getItemCount() == 1) && (this.jJz.adt() == 1))
      {
        GMTrace.o(10035727958016L, 74772);
        return true;
      }
      GMTrace.o(10035727958016L, 74772);
      return false;
    }
    boolean bool = super.adu();
    GMTrace.o(10035727958016L, 74772);
    return bool;
  }
  
  public static abstract interface a
  {
    public abstract void aaJ();
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/widget/recyclerview/LoadMoreRecyclerView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */