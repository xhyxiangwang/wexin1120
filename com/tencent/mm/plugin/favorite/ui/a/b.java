package com.tencent.mm.plugin.favorite.ui.a;

import android.content.Context;
import android.content.res.Resources;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView.LayoutParams;
import android.widget.AdapterView;
import android.widget.CheckBox;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.e;
import com.tencent.mm.R.l;
import com.tencent.mm.g.a.jg;
import com.tencent.mm.plugin.favorite.b.x;
import com.tencent.mm.plugin.favorite.ui.c.a.b;
import com.tencent.mm.plugin.favorite.ui.c.a.c;
import com.tencent.mm.plugin.favorite.ui.c.d;
import com.tencent.mm.plugin.favorite.ui.c.f;
import com.tencent.mm.plugin.favorite.ui.c.i;
import com.tencent.mm.plugin.favorite.ui.c.l;
import com.tencent.mm.plugin.favorite.ui.c.m;
import com.tencent.mm.plugin.favorite.ui.c.n;
import com.tencent.mm.plugin.favorite.ui.c.o;
import com.tencent.mm.plugin.favorite.ui.c.p;
import com.tencent.mm.plugin.favorite.ui.c.q;
import com.tencent.mm.plugin.favorite.ui.c.r;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.w;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public final class b
  extends a
{
  private com.tencent.mm.sdk.b.c iSb;
  private List<String> lTA;
  private SparseArray<com.tencent.mm.plugin.favorite.ui.c.a> lTB;
  private boolean lTC;
  public a.c lTD;
  public boolean lTE;
  public boolean lTF;
  private boolean lTr;
  public List<com.tencent.mm.plugin.favorite.b.j> lTs;
  private List<com.tencent.mm.plugin.favorite.b.j> lTt;
  private List<com.tencent.mm.plugin.favorite.b.j> lTu;
  public List<Long> lTv;
  public boolean lTw;
  private Map<Long, com.tencent.mm.plugin.favorite.b.j> lTx;
  private List<Integer> lTy;
  private List<String> lTz;
  
  public b(com.tencent.mm.plugin.favorite.c.g paramg, boolean paramBoolean)
  {
    GMTrace.i(6328902746112L, 47154);
    this.lTr = false;
    this.lTs = new ArrayList();
    this.lTt = new ArrayList();
    this.lTu = new LinkedList();
    this.lTv = new ArrayList();
    this.lTw = false;
    this.lTx = new TreeMap();
    this.lTy = new ArrayList();
    this.lTz = new LinkedList();
    this.lTA = new LinkedList();
    this.lTB = new SparseArray();
    this.lTC = false;
    this.lTE = false;
    this.lTF = false;
    this.iSb = new com.tencent.mm.sdk.b.c() {};
    this.type = -1;
    this.lTB.put(1, new m(paramg));
    this.lTB.put(2, new d(paramg));
    this.lTB.put(3, new q(paramg));
    this.lTB.put(4, new p(paramg));
    this.lTB.put(5, new o(paramg));
    this.lTB.put(6, new f(paramg));
    this.lTB.put(7, new com.tencent.mm.plugin.favorite.ui.c.h(paramg));
    this.lTB.put(8, new com.tencent.mm.plugin.favorite.ui.c.c(paramg));
    this.lTB.put(10, new i(paramg));
    this.lTB.put(12, new l(paramg));
    this.lTB.put(15, new l(paramg));
    this.lTB.put(11, new com.tencent.mm.plugin.favorite.ui.c.g(paramg));
    this.lTB.put(14, new com.tencent.mm.plugin.favorite.ui.c.j(paramg));
    this.lTB.put(16, new com.tencent.mm.plugin.favorite.ui.c.k(paramg));
    this.lTB.put(17, new com.tencent.mm.plugin.favorite.ui.c.b(paramg));
    this.lTB.put(18, new r(paramg));
    this.lTB.put(-2, new n(paramg));
    if (paramBoolean != this.lTE)
    {
      this.lTE = paramBoolean;
      if (paramBoolean) {
        this.lTx.clear();
      }
    }
    if (!this.lTE) {
      axS();
    }
    axT();
    notifyDataSetChanged();
    com.tencent.mm.sdk.b.a.uLm.c(this.iSb);
    com.tencent.mm.sdk.b.a.uLm.b(this.iSb);
    GMTrace.o(6328902746112L, 47154);
  }
  
  private boolean axU()
  {
    GMTrace.i(6329305399296L, 47157);
    if ((!this.lTz.isEmpty()) || (!this.lTA.isEmpty()) || (!this.lTy.isEmpty()))
    {
      GMTrace.o(6329305399296L, 47157);
      return true;
    }
    GMTrace.o(6329305399296L, 47157);
    return false;
  }
  
  public final void a(boolean paramBoolean, com.tencent.mm.plugin.favorite.b.j paramj)
  {
    GMTrace.i(6329439617024L, 47158);
    if (paramBoolean == this.lTw)
    {
      GMTrace.o(6329439617024L, 47158);
      return;
    }
    this.lTw = paramBoolean;
    if (paramBoolean)
    {
      this.lTx.clear();
      if (paramj != null)
      {
        paramj = com.tencent.mm.plugin.favorite.h.awD().cc(paramj.field_localId);
        if (paramj != null) {
          this.lTx.put(Long.valueOf(paramj.field_localId), paramj);
        }
      }
    }
    notifyDataSetChanged();
    GMTrace.o(6329439617024L, 47158);
  }
  
  public final void axS()
  {
    GMTrace.i(6329171181568L, 47156);
    if (axU())
    {
      w.v("MicroMsg.FavoriteAdapter", "searching, do not load more data");
      GMTrace.o(6329171181568L, 47156);
      return;
    }
    if (x.axd())
    {
      w.w("MicroMsg.FavoriteAdapter", "want to load more data, but now doing batchget");
      GMTrace.o(6329171181568L, 47156);
      return;
    }
    if (!this.lTE) {
      try
      {
        this.lastUpdateTime = x.q(this.lastUpdateTime, this.type);
        GMTrace.o(6329171181568L, 47156);
        return;
      }
      catch (Exception localException)
      {
        w.printErrStackTrace("MicroMsg.FavoriteAdapter", localException, "", new Object[0]);
        GMTrace.o(6329171181568L, 47156);
        return;
      }
    }
    this.lTt = x.f(this.lTs, this.lTv);
    this.lTr = true;
    GMTrace.o(6329171181568L, 47156);
  }
  
  public final void axT()
  {
    GMTrace.i(6330110705664L, 47163);
    w.v("MicroMsg.FavoriteAdapter", "reset data list beg");
    this.lTr = false;
    List localList = this.lTt;
    if (localList != null)
    {
      w.d("MicroMsg.FavoriteAdapter", "before do recycle, need recycle list size[%d]", new Object[] { Integer.valueOf(localList.size()) });
      w.d("MicroMsg.FavoriteAdapter", "after do recycle, current can reused list size[%d]", new Object[] { Integer.valueOf(this.lTu.size()) });
      localList.clear();
    }
    if (!axU())
    {
      w.i("MicroMsg.FavoriteAdapter", "on reset data list, last update time is %d, type is %d", new Object[] { Long.valueOf(this.lastUpdateTime), Integer.valueOf(this.type) });
      if (!this.lTE)
      {
        this.lTt = x.b(this.lastUpdateTime, this.type, this.lTo, this.lTp);
        if ((this.lTt != null) && (this.lastUpdateTime == 0L) && (this.lTt.size() > 0)) {
          this.lastUpdateTime = ((com.tencent.mm.plugin.favorite.b.j)this.lTt.get(this.lTt.size() - 1)).field_updateTime;
        }
      }
      for (;;)
      {
        if (this.lTt == null)
        {
          w.w("MicroMsg.FavoriteAdapter", "reset data list fail, get null list, new empty one");
          this.lTt = new ArrayList();
        }
        if ((!this.lTE) && (!axU()) && (this.lTt.size() < 20) && (!com.tencent.mm.plugin.favorite.h.awD().n(this.lastUpdateTime, this.type)))
        {
          w.v("MicroMsg.FavoriteAdapter", "least than page count, loadMoreData");
          axS();
        }
        this.lTr = true;
        w.v("MicroMsg.FavoriteAdapter", "reset data list end");
        GMTrace.o(6330110705664L, 47163);
        return;
        this.lTv = x.axo();
        this.lTt = x.f(null, this.lTv);
      }
    }
    w.i("MicroMsg.FavoriteAdapter", "on reset data list, do search, searchStr:%s, tagStr:%s, searchTypes:%s", new Object[] { this.lTz, this.lTA, this.lTy });
    this.lTt = x.a(this.lTz, this.lTA, this.lTy, this.lTu, this.lTo, this.lTp);
    if (this.lTt == null) {}
    for (int i = 0;; i = this.lTt.size())
    {
      com.tencent.mm.plugin.report.service.g.paX.i(10649, new Object[] { Integer.valueOf(i) });
      break;
    }
  }
  
  public final int axV()
  {
    GMTrace.i(6329708052480L, 47160);
    int i = this.lTx.size();
    GMTrace.o(6329708052480L, 47160);
    return i;
  }
  
  public final long axW()
  {
    GMTrace.i(6329842270208L, 47161);
    Iterator localIterator = this.lTx.values().iterator();
    long l = 0L;
    if (localIterator.hasNext())
    {
      com.tencent.mm.plugin.favorite.b.j localj = (com.tencent.mm.plugin.favorite.b.j)localIterator.next();
      if (localj == null) {
        break label73;
      }
      l = localj.field_datatotalsize + l;
    }
    label73:
    for (;;)
    {
      break;
      GMTrace.o(6329842270208L, 47161);
      return l;
    }
  }
  
  public final void b(List<Integer> paramList, List<String> paramList1, List<String> paramList2)
  {
    GMTrace.i(6329976487936L, 47162);
    this.lTy.clear();
    if (paramList != null) {
      this.lTy.addAll(paramList);
    }
    this.lTz.clear();
    if (paramList1 != null) {
      this.lTz.addAll(paramList1);
    }
    this.lTA.clear();
    if (paramList2 != null) {
      this.lTA.addAll(paramList2);
    }
    this.lTC = true;
    axT();
    this.lTC = false;
    GMTrace.o(6329976487936L, 47162);
  }
  
  public final int cs(long paramLong)
  {
    GMTrace.i(6331318665216L, 47172);
    Object localObject = com.tencent.mm.plugin.favorite.h.awD().cc(paramLong);
    if (localObject == null)
    {
      GMTrace.o(6331318665216L, 47172);
      return -1;
    }
    if (this.lTx.size() >= 30)
    {
      w.w("MicroMsg.FavoriteAdapter", "call select item, match max select count %d", new Object[] { Integer.valueOf(30) });
      com.tencent.mm.ui.base.h.bl(ab.getContext(), ab.getContext().getResources().getString(R.l.dXi, new Object[] { Integer.valueOf(30) }));
      GMTrace.o(6331318665216L, 47172);
      return -1;
    }
    this.lTx.put(Long.valueOf(paramLong), localObject);
    int i;
    if (((com.tencent.mm.plugin.favorite.b.j)localObject).field_updateTime < this.lastUpdateTime)
    {
      this.lastUpdateTime = ((com.tencent.mm.plugin.favorite.b.j)localObject).field_updateTime;
      axT();
      localObject = this.lTt.iterator();
      i = 0;
      while (((Iterator)localObject).hasNext())
      {
        if (((com.tencent.mm.plugin.favorite.b.j)((Iterator)localObject).next()).field_localId == paramLong)
        {
          notifyDataSetChanged();
          GMTrace.o(6331318665216L, 47172);
          return i;
        }
        i += 1;
      }
      notifyDataSetChanged();
    }
    for (;;)
    {
      GMTrace.o(6331318665216L, 47172);
      return -1;
      localObject = this.lTs.iterator();
      i = 0;
      while (((Iterator)localObject).hasNext())
      {
        if (((com.tencent.mm.plugin.favorite.b.j)((Iterator)localObject).next()).field_localId == paramLong)
        {
          notifyDataSetChanged();
          GMTrace.o(6331318665216L, 47172);
          return i;
        }
        i += 1;
      }
    }
  }
  
  public final List<com.tencent.mm.plugin.favorite.b.j> ey(boolean paramBoolean)
  {
    GMTrace.i(6329573834752L, 47159);
    LinkedList localLinkedList = new LinkedList();
    Iterator localIterator = this.lTx.values().iterator();
    while (localIterator.hasNext())
    {
      com.tencent.mm.plugin.favorite.b.j localj = (com.tencent.mm.plugin.favorite.b.j)localIterator.next();
      if (localj != null) {
        localLinkedList.add(localj);
      }
    }
    if (paramBoolean) {
      this.lTx.clear();
    }
    GMTrace.o(6329573834752L, 47159);
    return localLinkedList;
  }
  
  public final void finish()
  {
    GMTrace.i(6329036963840L, 47155);
    com.tencent.mm.sdk.b.a.uLm.c(this.iSb);
    GMTrace.o(6329036963840L, 47155);
  }
  
  public final int getCount()
  {
    GMTrace.i(6331184447488L, 47171);
    int i = this.lTs.size();
    GMTrace.o(6331184447488L, 47171);
    return i + 1;
  }
  
  public final long getItemId(int paramInt)
  {
    GMTrace.i(6331050229760L, 47170);
    long l = paramInt;
    GMTrace.o(6331050229760L, 47170);
    return l;
  }
  
  public final int getItemViewType(int paramInt)
  {
    GMTrace.i(6330513358848L, 47166);
    if (paramInt == 0)
    {
      GMTrace.o(6330513358848L, 47166);
      return 0;
    }
    com.tencent.mm.plugin.favorite.b.j localj = nu(paramInt - 1);
    switch (localj.field_type)
    {
    case 9: 
    case 13: 
    default: 
      w.w("MicroMsg.FavoriteAdapter", "get item view type unknown, %d", new Object[] { Integer.valueOf(localj.field_type) });
      GMTrace.o(6330513358848L, 47166);
      return -2;
    }
    paramInt = localj.field_type;
    GMTrace.o(6330513358848L, 47166);
    return paramInt;
  }
  
  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    GMTrace.i(6330781794304L, 47168);
    if (paramInt == 0)
    {
      paramView = new View(paramViewGroup.getContext());
      paramView.setLayoutParams(new AbsListView.LayoutParams(0, 0));
      paramView.setBackgroundResource(R.e.aOm);
      paramView.setPadding(0, 0, 0, 0);
      paramView.setEnabled(false);
      GMTrace.o(6330781794304L, 47168);
      return paramView;
    }
    com.tencent.mm.plugin.favorite.b.j localj = nu(paramInt - 1);
    com.tencent.mm.plugin.favorite.ui.c.a locala = (com.tencent.mm.plugin.favorite.ui.c.a)this.lTB.get(localj.field_type);
    if (locala == null)
    {
      w.w("MicroMsg.FavoriteAdapter", "unknown type %d, use unknown item creator", new Object[] { Integer.valueOf(localj.field_type) });
      locala = (com.tencent.mm.plugin.favorite.ui.c.a)this.lTB.get(-2);
      axR();
      paramView = locala.a(paramView, paramViewGroup, localj);
      GMTrace.o(6330781794304L, 47168);
      return paramView;
    }
    locala.lXh.kkg = axU();
    locala.lXh.lastUpdateTime = this.lastUpdateTime;
    locala.lXh.lTw = this.lTw;
    locala.lXh.lTx = this.lTx;
    locala.lXh.lXj = this.lTD;
    locala.lXh.lTE = this.lTE;
    paramView = locala.a(paramView, paramViewGroup, localj);
    GMTrace.o(6330781794304L, 47168);
    return paramView;
  }
  
  public final int getViewTypeCount()
  {
    GMTrace.i(6330647576576L, 47167);
    int i = this.lTB.size();
    GMTrace.o(6330647576576L, 47167);
    return i + 3;
  }
  
  public final boolean isEmpty()
  {
    GMTrace.i(6330244923392L, 47164);
    boolean bool = this.lTs.isEmpty();
    GMTrace.o(6330244923392L, 47164);
    return bool;
  }
  
  public final void notifyDataSetChanged()
  {
    GMTrace.i(6330379141120L, 47165);
    w.v("MicroMsg.FavoriteAdapter", "on notify data set changed requset, can exchange tempList[%B]", new Object[] { Boolean.valueOf(this.lTr) });
    if (this.lTr)
    {
      if ((this.lTE) && (this.lTt != null) && (this.lTs != null) && (this.lTt.size() == this.lTs.size())) {
        this.lTF = true;
      }
      List localList = this.lTs;
      this.lTs = this.lTt;
      this.lTt = localList;
      this.lTr = false;
    }
    w.v("MicroMsg.FavoriteAdapter", "on notify data set changed end");
    super.notifyDataSetChanged();
    GMTrace.o(6330379141120L, 47165);
  }
  
  public final com.tencent.mm.plugin.favorite.b.j nu(int paramInt)
  {
    GMTrace.i(6330916012032L, 47169);
    if ((paramInt < 0) || (paramInt >= this.lTs.size()))
    {
      w.e("MicroMsg.FavoriteAdapter", "get item, but position error");
      localj = new com.tencent.mm.plugin.favorite.b.j();
      GMTrace.o(6330916012032L, 47169);
      return localj;
    }
    com.tencent.mm.plugin.favorite.b.j localj = (com.tencent.mm.plugin.favorite.b.j)this.lTs.get(paramInt);
    GMTrace.o(6330916012032L, 47169);
    return localj;
  }
  
  public final void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    GMTrace.i(6331452882944L, 47173);
    paramAdapterView = (a.b)paramView.getTag();
    if (paramAdapterView == null)
    {
      w.w("MicroMsg.FavoriteAdapter", "on item click, holder is null");
      GMTrace.o(6331452882944L, 47173);
      return;
    }
    if (paramAdapterView.lPM == null)
    {
      w.w("MicroMsg.FavoriteAdapter", "on item click, info is null");
      GMTrace.o(6331452882944L, 47173);
      return;
    }
    if ((this.lTw) || (this.lTE))
    {
      if ((!paramAdapterView.iiO.isChecked()) && (this.lTx.size() >= 30))
      {
        w.w("MicroMsg.FavoriteAdapter", "call select item, match max select count %d", new Object[] { Integer.valueOf(30) });
        com.tencent.mm.ui.base.h.bl(ab.getContext(), ab.getContext().getResources().getString(R.l.dXi, new Object[] { Integer.valueOf(30) }));
        GMTrace.o(6331452882944L, 47173);
        return;
      }
      paramView = paramAdapterView.iiO;
      if (!paramAdapterView.iiO.isChecked()) {}
      for (boolean bool = true;; bool = false)
      {
        paramView.setChecked(bool);
        GMTrace.o(6331452882944L, 47173);
        return;
      }
    }
    com.tencent.mm.plugin.favorite.ui.c.a locala = (com.tencent.mm.plugin.favorite.ui.c.a)this.lTB.get(paramAdapterView.lPM.field_type);
    if (locala != null)
    {
      locala.ci(paramView);
      w.d("MicroMsg.FavoriteAdapter", "item click type %s", new Object[] { Integer.valueOf(paramAdapterView.lPM.field_type) });
    }
    GMTrace.o(6331452882944L, 47173);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/favorite/ui/a/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */