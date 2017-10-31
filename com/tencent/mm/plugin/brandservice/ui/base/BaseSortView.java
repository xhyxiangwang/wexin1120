package com.tencent.mm.plugin.brandservice.ui.base;

import android.content.Context;
import android.database.DataSetObserver;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView.OnItemLongClickListener;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.LinearLayout;
import android.widget.ListView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.base.VerticalScrollBar;
import com.tencent.mm.ui.base.VerticalScrollBar.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class BaseSortView
  extends LinearLayout
  implements VerticalScrollBar.a
{
  private AdapterView.OnItemSelectedListener Fz;
  public AdapterView.OnItemClickListener WK;
  private VerticalScrollBar klr;
  private ListView kls;
  private View klt;
  e klu;
  public AdapterView.OnItemLongClickListener klv;
  private List<f> klw;
  public boolean klx;
  public boolean kly;
  a klz;
  public int mMode;
  
  public BaseSortView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(10897674207232L, 81194);
    this.klw = new ArrayList();
    this.klu = new e(ahQ());
    inflate();
    this.klr = ahO();
    this.kls = getListView();
    this.klt = ahP();
    this.klx = true;
    du(true);
    this.kls.setAdapter(this.klu);
    if (this.klr != null) {
      this.klr.vMV = this;
    }
    this.klu.registerDataSetObserver(new DataSetObserver()
    {
      public final void onChanged()
      {
        GMTrace.i(10896466247680L, 81185);
        if (BaseSortView.a(BaseSortView.this) != null) {
          BaseSortView.a(BaseSortView.this).Y(BaseSortView.b(BaseSortView.this).klw);
        }
        GMTrace.o(10896466247680L, 81185);
      }
    });
    this.kls.setOnItemClickListener(new AdapterView.OnItemClickListener()
    {
      public final void onItemClick(AdapterView<?> paramAnonymousAdapterView, View paramAnonymousView, int paramAnonymousInt, long paramAnonymousLong)
      {
        GMTrace.i(10897003118592L, 81189);
        if (BaseSortView.c(BaseSortView.this) != null) {
          BaseSortView.c(BaseSortView.this).onItemClick(paramAnonymousAdapterView, paramAnonymousView, paramAnonymousInt, paramAnonymousLong);
        }
        GMTrace.o(10897003118592L, 81189);
      }
    });
    this.kls.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener()
    {
      public final boolean onItemLongClick(AdapterView<?> paramAnonymousAdapterView, View paramAnonymousView, int paramAnonymousInt, long paramAnonymousLong)
      {
        GMTrace.i(10904921964544L, 81248);
        if (BaseSortView.d(BaseSortView.this) != null)
        {
          boolean bool = BaseSortView.d(BaseSortView.this).onItemLongClick(paramAnonymousAdapterView, paramAnonymousView, paramAnonymousInt, paramAnonymousLong);
          GMTrace.o(10904921964544L, 81248);
          return bool;
        }
        GMTrace.o(10904921964544L, 81248);
        return false;
      }
    });
    this.kls.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener()
    {
      public final void onItemSelected(AdapterView<?> paramAnonymousAdapterView, View paramAnonymousView, int paramAnonymousInt, long paramAnonymousLong)
      {
        GMTrace.i(10895929376768L, 81181);
        if (BaseSortView.e(BaseSortView.this) != null) {
          BaseSortView.e(BaseSortView.this).onItemSelected(paramAnonymousAdapterView, paramAnonymousView, paramAnonymousInt, paramAnonymousLong);
        }
        GMTrace.o(10895929376768L, 81181);
      }
      
      public final void onNothingSelected(AdapterView<?> paramAnonymousAdapterView)
      {
        GMTrace.i(10896063594496L, 81182);
        if (BaseSortView.e(BaseSortView.this) != null) {
          BaseSortView.e(BaseSortView.this).onNothingSelected(paramAnonymousAdapterView);
        }
        GMTrace.o(10896063594496L, 81182);
      }
    });
    GMTrace.o(10897674207232L, 81194);
  }
  
  protected static void i(View paramView, boolean paramBoolean)
  {
    GMTrace.i(10899284819968L, 81206);
    if (paramView != null) {
      if (!paramBoolean) {
        break label32;
      }
    }
    label32:
    for (int i = 0;; i = 8)
    {
      paramView.setVisibility(i);
      GMTrace.o(10899284819968L, 81206);
      return;
    }
  }
  
  public final void X(List<f> paramList)
  {
    GMTrace.i(10898747949056L, 81202);
    if ((this.mMode == 0) && (this.klw != paramList))
    {
      this.klw.clear();
      if (paramList != null) {
        this.klw.addAll(paramList);
      }
    }
    this.klu.X(paramList);
    GMTrace.o(10898747949056L, 81202);
  }
  
  public abstract boolean a(String paramString, f paramf);
  
  public abstract VerticalScrollBar ahO();
  
  public abstract View ahP();
  
  public abstract e.a ahQ();
  
  public final void ahU()
  {
    GMTrace.i(10899150602240L, 81205);
    this.mMode = 1;
    tm("");
    GMTrace.o(10899150602240L, 81205);
  }
  
  public final void ahV()
  {
    GMTrace.i(10899553255424L, 81208);
    this.klx = false;
    af.u(this.klu.klV);
    GMTrace.o(10899553255424L, 81208);
  }
  
  public final void du(boolean paramBoolean)
  {
    GMTrace.i(10899419037696L, 81207);
    this.kly = paramBoolean;
    VerticalScrollBar localVerticalScrollBar;
    if (this.klr != null)
    {
      localVerticalScrollBar = this.klr;
      if (!paramBoolean) {
        break label45;
      }
    }
    label45:
    for (int i = 0;; i = 8)
    {
      localVerticalScrollBar.setVisibility(i);
      GMTrace.o(10899419037696L, 81207);
      return;
    }
  }
  
  public abstract ListView getListView();
  
  public abstract View inflate();
  
  public void refresh()
  {
    GMTrace.i(10897808424960L, 81195);
    af.u(this.klu.klV);
    GMTrace.o(10897808424960L, 81195);
  }
  
  public final void tm(String paramString)
  {
    boolean bool2 = true;
    GMTrace.i(10898882166784L, 81203);
    if (this.mMode != 1)
    {
      w.w("MicroMsg.BaseSortView", "Can't doFilter successfully out of the search mode.");
      GMTrace.o(10898882166784L, 81203);
      return;
    }
    ArrayList localArrayList = new ArrayList();
    if (!bg.mZ(paramString))
    {
      localArrayList.clear();
      Iterator localIterator = this.klw.iterator();
      while (localIterator.hasNext())
      {
        f localf = (f)localIterator.next();
        if (a(paramString, localf)) {
          localArrayList.add(localf);
        }
      }
    }
    for (int i = 1;; i = 0)
    {
      paramString = this.kls;
      if ((i != 0) && (localArrayList.size() > 0))
      {
        bool1 = true;
        i(paramString, bool1);
        paramString = this.klt;
        if ((i == 0) || (localArrayList.size() > 0)) {
          break label189;
        }
      }
      label189:
      for (boolean bool1 = bool2;; bool1 = false)
      {
        i(paramString, bool1);
        X(localArrayList);
        GMTrace.o(10898882166784L, 81203);
        return;
        bool1 = false;
        break;
      }
    }
  }
  
  public final void tn(String paramString)
  {
    GMTrace.i(10899016384512L, 81204);
    int i = this.klu.to(paramString);
    if (i >= 0) {
      this.kls.setSelection(i);
    }
    GMTrace.o(10899016384512L, 81204);
  }
  
  public static abstract interface a
  {
    public abstract void Y(List<f> paramList);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/brandservice/ui/base/BaseSortView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */