package com.tencent.mm.plugin.card.ui;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.g;
import com.tencent.mm.plugin.card.base.c;
import com.tencent.mm.plugin.card.model.CardInfo;
import java.util.ArrayList;
import java.util.List;

@SuppressLint({"UseValueOf"})
public final class g
  extends BaseAdapter
{
  private View.OnClickListener iom;
  private boolean koz;
  c kse;
  List<CardInfo> ksp;
  private boolean kxk;
  List<Boolean> kxl;
  a kxm;
  Context mContext;
  
  public g(Context paramContext)
  {
    GMTrace.i(4961358315520L, 36965);
    this.ksp = new ArrayList();
    this.kxk = false;
    this.kxl = new ArrayList();
    this.koz = true;
    this.iom = new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(4938138648576L, 36792);
        int i = ((Integer)paramAnonymousView.getTag()).intValue();
        paramAnonymousView = g.this;
        if (((Boolean)paramAnonymousView.kxl.get(i)).booleanValue()) {
          paramAnonymousView.kxl.set(i, Boolean.valueOf(false));
        }
        for (;;)
        {
          paramAnonymousView.notifyDataSetChanged();
          GMTrace.o(4938138648576L, 36792);
          return;
          paramAnonymousView.kxl.set(i, Boolean.valueOf(true));
        }
      }
    };
    this.kse = new k(paramContext, this);
    this.mContext = paramContext;
    GMTrace.o(4961358315520L, 36965);
  }
  
  public final int getCount()
  {
    GMTrace.i(4961492533248L, 36966);
    int i = this.ksp.size();
    GMTrace.o(4961492533248L, 36966);
    return i;
  }
  
  public final long getItemId(int paramInt)
  {
    GMTrace.i(4961760968704L, 36968);
    long l = paramInt;
    GMTrace.o(4961760968704L, 36968);
    return l;
  }
  
  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    GMTrace.i(4961895186432L, 36969);
    paramViewGroup = lD(paramInt);
    paramViewGroup.koz = this.koz;
    paramView = this.kse.a(paramInt, paramView, paramViewGroup);
    if ((this.kxk) && (paramViewGroup.aiw()))
    {
      this.kse.u(paramView, 0);
      if (((Boolean)this.kxl.get(paramInt)).booleanValue())
      {
        this.kse.t(paramView, R.g.aWX);
        this.kse.a(paramView, paramInt, this.iom);
      }
    }
    for (;;)
    {
      GMTrace.o(4961895186432L, 36969);
      return paramView;
      this.kse.t(paramView, R.g.aWY);
      break;
      this.kse.u(paramView, 8);
    }
  }
  
  public final CardInfo lD(int paramInt)
  {
    GMTrace.i(4961626750976L, 36967);
    CardInfo localCardInfo = (CardInfo)this.ksp.get(paramInt);
    GMTrace.o(4961626750976L, 36967);
    return localCardInfo;
  }
  
  public static abstract interface a {}
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/card/ui/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */