package com.tencent.mm.ui.base;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;
import android.widget.ListView;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.u.a.g;
import com.tencent.mm.u.a.h;

public class MMLoadMoreListView
  extends ListView
{
  public View lcl;
  public a vHo;
  private boolean vHp;
  public TextView vHq;
  public boolean vHr;
  
  public MMLoadMoreListView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(3303366721536L, 24612);
    this.lcl = null;
    this.vHo = null;
    this.vHp = false;
    this.vHr = false;
    init();
    GMTrace.o(3303366721536L, 24612);
  }
  
  public MMLoadMoreListView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(3303500939264L, 24613);
    this.lcl = null;
    this.vHo = null;
    this.vHp = false;
    this.vHr = false;
    init();
    GMTrace.o(3303500939264L, 24613);
  }
  
  private void init()
  {
    GMTrace.i(3303769374720L, 24615);
    if (this.lcl == null)
    {
      bXc();
      addFooterView(this.lcl);
      this.lcl.setVisibility(8);
    }
    GMTrace.o(3303769374720L, 24615);
  }
  
  public final void bXc()
  {
    GMTrace.i(3303635156992L, 24614);
    this.lcl = View.inflate(getContext(), a.h.dan, null);
    this.vHq = ((TextView)this.lcl.findViewById(a.g.bJx));
    this.lcl.setVisibility(8);
    GMTrace.o(3303635156992L, 24614);
  }
  
  public final void bXd()
  {
    GMTrace.i(3303903592448L, 24616);
    this.vHp = true;
    setOnScrollListener(new AbsListView.OnScrollListener()
    {
      public final void onScroll(AbsListView paramAnonymousAbsListView, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3)
      {
        GMTrace.i(3162035453952L, 23559);
        if ((paramAnonymousInt1 == 0) && (MMLoadMoreListView.this.getChildAt(0) != null) && (MMLoadMoreListView.this.getChildAt(0).getTop() == MMLoadMoreListView.this.getPaddingTop())) {
          MMLoadMoreListView.a(MMLoadMoreListView.this, true);
        }
        for (;;)
        {
          w.d("MMLoadMoreListView", "newpoi scroll2Top %s", new Object[] { MMLoadMoreListView.b(MMLoadMoreListView.this) });
          GMTrace.o(3162035453952L, 23559);
          return;
          MMLoadMoreListView.a(MMLoadMoreListView.this, false);
        }
      }
      
      public final void onScrollStateChanged(AbsListView paramAnonymousAbsListView, int paramAnonymousInt)
      {
        GMTrace.i(3161901236224L, 23558);
        if ((paramAnonymousAbsListView.getLastVisiblePosition() == paramAnonymousAbsListView.getCount() - 1) && (MMLoadMoreListView.a(MMLoadMoreListView.this) != null)) {
          MMLoadMoreListView.a(MMLoadMoreListView.this).and();
        }
        GMTrace.o(3161901236224L, 23558);
      }
    });
    GMTrace.o(3303903592448L, 24616);
  }
  
  public final void bXe()
  {
    GMTrace.i(3304037810176L, 24617);
    if (this.lcl != null)
    {
      this.vHq.setVisibility(8);
      this.lcl.setVisibility(8);
    }
    GMTrace.o(3304037810176L, 24617);
  }
  
  public final void bXf()
  {
    GMTrace.i(3304172027904L, 24618);
    this.vHq.setVisibility(0);
    this.lcl.setVisibility(0);
    GMTrace.o(3304172027904L, 24618);
  }
  
  public static abstract interface a
  {
    public abstract void and();
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/ui/base/MMLoadMoreListView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */