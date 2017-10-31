package com.tencent.mm.plugin.search.ui;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.BaseAdapter;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.fts.d.a.a;
import com.tencent.mm.plugin.fts.d.a.a.a;
import com.tencent.mm.plugin.fts.d.a.a.b;
import com.tencent.mm.sdk.platformtools.w;

public abstract class b
  extends BaseAdapter
  implements AbsListView.OnScrollListener, AdapterView.OnItemClickListener
{
  private int count;
  String fIW;
  private AbsListView.OnScrollListener kIQ;
  private c plZ;
  private SparseArray<a> pma;
  long pmb;
  a pmc;
  
  public b(c paramc)
  {
    GMTrace.i(11874779267072L, 88474);
    w.i("MicroMsg.FTS.FTSBaseAdapter", "Create FTSBaseAdapter");
    this.plZ = paramc;
    this.pma = new SparseArray();
    GMTrace.o(11874779267072L, 88474);
  }
  
  private a tq(int paramInt)
  {
    GMTrace.i(16487976796160L, 122845);
    if (this.pma.indexOfKey(paramInt) >= 0)
    {
      localObject1 = (a)this.pma.get(paramInt);
      GMTrace.o(16487976796160L, 122845);
      return (a)localObject1;
    }
    Object localObject2 = null;
    Object localObject1 = localObject2;
    if (paramInt >= 0)
    {
      localObject1 = localObject2;
      if (paramInt < getCount()) {
        localObject1 = nR(paramInt);
      }
    }
    if (localObject1 == null) {
      w.e("MicroMsg.FTS.FTSBaseAdapter", "getItem Occur error ! position = %d | count=%d", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(getCount()) });
    }
    for (;;)
    {
      GMTrace.o(16487976796160L, 122845);
      return (a)localObject1;
      this.pma.put(paramInt, localObject1);
    }
  }
  
  protected final void C(int paramInt, boolean paramBoolean)
  {
    GMTrace.i(11876926750720L, 88490);
    if (this.pmc != null) {
      this.pmc.D(paramInt, paramBoolean);
    }
    GMTrace.o(11876926750720L, 88490);
  }
  
  public final void Fp(String paramString)
  {
    GMTrace.i(11875987226624L, 88483);
    stopSearch();
    this.pmb = System.currentTimeMillis();
    this.fIW = paramString;
    w.i("MicroMsg.FTS.FTSBaseAdapter", "start search query=%s", new Object[] { paramString });
    bbR();
    GMTrace.o(11875987226624L, 88483);
  }
  
  protected abstract boolean a(a parama);
  
  protected abstract void bbR();
  
  protected final int bbW()
  {
    int i = 0;
    GMTrace.i(11877329403904L, 88493);
    int k;
    for (int j = 0; i < getCount(); j = k)
    {
      a locala = tq(i);
      k = j;
      if (locala != null)
      {
        k = j;
        if (locala.mnG) {
          k = j + 1;
        }
      }
      i += 1;
    }
    GMTrace.o(11877329403904L, 88493);
    return j;
  }
  
  protected void clearCache()
  {
    GMTrace.i(11876524097536L, 88487);
    this.pma.clear();
    GMTrace.o(11876524097536L, 88487);
  }
  
  public void finish()
  {
    GMTrace.i(11876389879808L, 88486);
    stopSearch();
    GMTrace.o(11876389879808L, 88486);
  }
  
  public final Context getContext()
  {
    GMTrace.i(11874645049344L, 88473);
    Context localContext = this.plZ.getContext();
    GMTrace.o(11874645049344L, 88473);
    return localContext;
  }
  
  public int getCount()
  {
    GMTrace.i(11875047702528L, 88476);
    int i = this.count;
    GMTrace.o(11875047702528L, 88476);
    return i;
  }
  
  public long getItemId(int paramInt)
  {
    GMTrace.i(11875718791168L, 88481);
    GMTrace.o(11875718791168L, 88481);
    return 0L;
  }
  
  public int getItemViewType(int paramInt)
  {
    GMTrace.i(11875181920256L, 88477);
    if (tq(paramInt) != null)
    {
      paramInt = tq(paramInt).kxh;
      GMTrace.o(11875181920256L, 88477);
      return paramInt;
    }
    w.e("MicroMsg.FTS.FTSBaseAdapter", "getItemViewType: get data item fail, return unknown Type, count=%d | position = %s", new Object[] { Integer.valueOf(getCount()), Integer.valueOf(paramInt) });
    GMTrace.o(11875181920256L, 88477);
    return -1;
  }
  
  public View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    GMTrace.i(11875853008896L, 88482);
    a locala = tq(paramInt);
    View localView = paramView;
    if (paramView == null) {
      localView = locala.Vk().a(getContext(), paramViewGroup);
    }
    paramView = (a.a)localView.getTag();
    if (!locala.mnw)
    {
      locala.a(getContext(), paramView, new Object[0]);
      locala.mnw = true;
    }
    locala.Vk().a(getContext(), paramView, locala);
    GMTrace.o(11875853008896L, 88482);
    return localView;
  }
  
  public int getViewTypeCount()
  {
    GMTrace.i(11875316137984L, 88478);
    GMTrace.o(11875316137984L, 88478);
    return 19;
  }
  
  protected abstract a nR(int paramInt);
  
  public void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    GMTrace.i(11877060968448L, 88491);
    this.plZ.aKl();
    if (paramInt >= getCount())
    {
      GMTrace.o(11877060968448L, 88491);
      return;
    }
    paramAdapterView = tq(paramInt);
    paramAdapterView.Vk().a(getContext(), paramAdapterView);
    a(paramAdapterView);
    this.plZ.b(paramAdapterView);
    GMTrace.o(11877060968448L, 88491);
  }
  
  public void onScroll(AbsListView paramAbsListView, int paramInt1, int paramInt2, int paramInt3)
  {
    GMTrace.i(11876792532992L, 88489);
    if (this.kIQ != null) {
      this.kIQ.onScroll(paramAbsListView, paramInt1, paramInt2, paramInt3);
    }
    GMTrace.o(11876792532992L, 88489);
  }
  
  public void onScrollStateChanged(AbsListView paramAbsListView, int paramInt)
  {
    GMTrace.i(11876658315264L, 88488);
    if (this.kIQ != null) {
      this.kIQ.onScrollStateChanged(paramAbsListView, paramInt);
    }
    GMTrace.o(11876658315264L, 88488);
  }
  
  public void stopSearch()
  {
    GMTrace.i(11876255662080L, 88485);
    this.count = 0;
    this.fIW = "";
    clearCache();
    notifyDataSetChanged();
    GMTrace.o(11876255662080L, 88485);
  }
  
  protected final void tp(int paramInt)
  {
    GMTrace.i(11874913484800L, 88475);
    w.i("MicroMsg.FTS.FTSBaseAdapter", "setCount %d", new Object[] { Integer.valueOf(paramInt) });
    this.count = paramInt;
    GMTrace.o(11874913484800L, 88475);
  }
  
  public static abstract interface a
  {
    public abstract void D(int paramInt, boolean paramBoolean);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/search/ui/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */