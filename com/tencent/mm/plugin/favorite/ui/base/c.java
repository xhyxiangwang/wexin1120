package com.tencent.mm.plugin.favorite.ui.base;

import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.plugin.favorite.b.j;
import com.tencent.mm.plugin.favorite.b.k;
import com.tencent.mm.plugin.favorite.b.x;
import com.tencent.mm.plugin.favorite.h;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.sdk.platformtools.w;
import java.util.Iterator;
import java.util.List;

public final class c
  extends LinearLayout
{
  private View lUe;
  public View lUf;
  public View lUg;
  public a lUh;
  private boolean lUi;
  private boolean lUj;
  private int lUk;
  
  public c(Context paramContext)
  {
    super(paramContext);
    GMTrace.i(6454530539520L, 48090);
    this.lUi = false;
    this.lUj = false;
    setOrientation(1);
    paramContext = new LinearLayout.LayoutParams(-1, -2);
    this.lUe = View.inflate(getContext(), R.i.cUk, null);
    View localView = View.inflate(getContext(), R.i.cTX, null);
    localView.findViewById(R.h.chA).setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(6445269516288L, 48021);
        if ((c.a(c.this) == 1) || (c.a(c.this) == 3))
        {
          w.i("MicroMsg.FavHeaderView", "click clear fav item");
          if (c.b(c.this) != null) {
            c.b(c.this).axM();
          }
        }
        GMTrace.o(6445269516288L, 48021);
      }
    });
    this.lUf = localView;
    localView = View.inflate(getContext(), R.i.cUj, null);
    localView.findViewById(R.h.bHD).setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(6446074822656L, 48027);
        w.i("MicroMsg.FavHeaderView", "click retry item");
        paramAnonymousView = h.awD().awR();
        if ((paramAnonymousView == null) || (paramAnonymousView.isEmpty()))
        {
          GMTrace.o(6446074822656L, 48027);
          return;
        }
        paramAnonymousView = paramAnonymousView.iterator();
        while (paramAnonymousView.hasNext())
        {
          j localj = (j)paramAnonymousView.next();
          if (!localj.awM()) {
            w.w("MicroMsg.FavHeaderView", "item id is %d, status is not upload fail", new Object[] { Integer.valueOf(localj.field_id) });
          } else {
            x.l(localj);
          }
        }
        c.c(c.this).setVisibility(8);
        c.d(c.this).setVisibility(8);
        GMTrace.o(6446074822656L, 48027);
      }
    });
    this.lUg = localView;
    addView(this.lUe, new LinearLayout.LayoutParams(paramContext));
    addView(this.lUf, new LinearLayout.LayoutParams(paramContext));
    addView(this.lUg, new LinearLayout.LayoutParams(paramContext));
    GMTrace.o(6454530539520L, 48090);
  }
  
  private void nv(int paramInt)
  {
    GMTrace.i(6454798974976L, 48092);
    this.lUk = paramInt;
    w.i("MicroMsg.FavHeaderView", "showStatusBar status:" + paramInt);
    if (paramInt == 0)
    {
      this.lUg.setVisibility(8);
      this.lUf.setVisibility(8);
      GMTrace.o(6454798974976L, 48092);
      return;
    }
    if (paramInt == 1)
    {
      if (!this.lUi) {
        g.paX.i(14109, new Object[] { Integer.valueOf(1) });
      }
      this.lUi = true;
      this.lUg.setVisibility(8);
      this.lUf.setVisibility(0);
      this.lUf.findViewById(R.h.chB).setVisibility(0);
      this.lUf.findViewById(R.h.chC).setVisibility(8);
      GMTrace.o(6454798974976L, 48092);
      return;
    }
    if (paramInt == 2)
    {
      this.lUg.setVisibility(0);
      this.lUf.setVisibility(8);
      GMTrace.o(6454798974976L, 48092);
      return;
    }
    if (paramInt == 3)
    {
      if (!this.lUj) {
        g.paX.i(14109, new Object[] { Integer.valueOf(0) });
      }
      this.lUj = true;
      this.lUg.setVisibility(8);
      this.lUf.setVisibility(0);
      this.lUf.findViewById(R.h.chB).setVisibility(8);
      this.lUf.findViewById(R.h.chC).setVisibility(0);
    }
    GMTrace.o(6454798974976L, 48092);
  }
  
  public final void axY()
  {
    GMTrace.i(6454933192704L, 48093);
    List localList = h.awD().awR();
    long l;
    int i;
    if (localList != null)
    {
      Iterator localIterator = localList.iterator();
      l = 0L;
      for (i = 0; localIterator.hasNext(); i = 1)
      {
        j localj = (j)localIterator.next();
        h.awD();
        l = k.e(localj) + l;
      }
      w.i("MicroMsg.FavHeaderView", "triggerStatusBar uploadFailedItemList size:%d,totalSize:%d", new Object[] { Integer.valueOf(localList.size()), Long.valueOf(l) });
    }
    for (;;)
    {
      if (i != 0)
      {
        if (l > x.axg())
        {
          nv(1);
          GMTrace.o(6454933192704L, 48093);
          return;
        }
        nv(2);
        GMTrace.o(6454933192704L, 48093);
        return;
      }
      if (x.axk())
      {
        nv(3);
        GMTrace.o(6454933192704L, 48093);
        return;
      }
      nv(0);
      GMTrace.o(6454933192704L, 48093);
      return;
      l = 0L;
      i = 0;
    }
  }
  
  public final void ez(boolean paramBoolean)
  {
    GMTrace.i(6454664757248L, 48091);
    View localView = this.lUe;
    if (paramBoolean) {}
    for (int i = 0;; i = 8)
    {
      localView.setVisibility(i);
      GMTrace.o(6454664757248L, 48091);
      return;
    }
  }
  
  public static abstract interface a
  {
    public abstract void axM();
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/favorite/ui/base/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */