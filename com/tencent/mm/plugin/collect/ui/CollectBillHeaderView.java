package com.tencent.mm.plugin.collect.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.ui.v;
import com.tencent.mm.wallet_core.ui.WalletTextView;

public class CollectBillHeaderView
  extends LinearLayout
{
  TextView kLX;
  TextView kMT;
  WalletTextView kMU;
  private TextView kMV;
  
  public CollectBillHeaderView(Context paramContext)
  {
    super(paramContext);
    GMTrace.i(5412061446144L, 40323);
    init(paramContext);
    GMTrace.o(5412061446144L, 40323);
  }
  
  public CollectBillHeaderView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(5412195663872L, 40324);
    init(paramContext);
    GMTrace.o(5412195663872L, 40324);
  }
  
  public CollectBillHeaderView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(5412329881600L, 40325);
    init(paramContext);
    GMTrace.o(5412329881600L, 40325);
  }
  
  private void init(Context paramContext)
  {
    GMTrace.i(5412464099328L, 40326);
    paramContext = v.fa(paramContext).inflate(R.i.cQG, this);
    this.kMT = ((TextView)paramContext.findViewById(R.h.bvS));
    this.kMV = ((TextView)paramContext.findViewById(R.h.bvR));
    this.kMU = ((WalletTextView)paramContext.findViewById(R.h.bvU));
    this.kLX = ((TextView)paramContext.findViewById(R.h.bvT));
    GMTrace.o(5412464099328L, 40326);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/collect/ui/CollectBillHeaderView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */