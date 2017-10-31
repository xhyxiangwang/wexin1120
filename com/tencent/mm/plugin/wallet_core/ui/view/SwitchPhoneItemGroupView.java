package com.tencent.mm.plugin.wallet_core.ui.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.k;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class SwitchPhoneItemGroupView
  extends LinearLayout
{
  List<SwitchPhoneItemView> rYg;
  public a rYh;
  private View.OnClickListener rYi;
  
  public SwitchPhoneItemGroupView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(6967644913664L, 51913);
    this.rYg = new ArrayList();
    this.rYi = new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(6966302736384L, 51903);
        Iterator localIterator = SwitchPhoneItemGroupView.this.rYg.iterator();
        while (localIterator.hasNext()) {
          ((SwitchPhoneItemView)localIterator.next()).rYm.setImageResource(R.k.dqq);
        }
        ((SwitchPhoneItemView)paramAnonymousView).rYm.setImageResource(R.k.dqr);
        if (SwitchPhoneItemGroupView.a(SwitchPhoneItemGroupView.this) != null) {
          SwitchPhoneItemGroupView.a(SwitchPhoneItemGroupView.this).cN(paramAnonymousView);
        }
        GMTrace.o(6966302736384L, 51903);
      }
    };
    GMTrace.o(6967644913664L, 51913);
  }
  
  public SwitchPhoneItemGroupView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(6967779131392L, 51914);
    this.rYg = new ArrayList();
    this.rYi = new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(6966302736384L, 51903);
        Iterator localIterator = SwitchPhoneItemGroupView.this.rYg.iterator();
        while (localIterator.hasNext()) {
          ((SwitchPhoneItemView)localIterator.next()).rYm.setImageResource(R.k.dqq);
        }
        ((SwitchPhoneItemView)paramAnonymousView).rYm.setImageResource(R.k.dqr);
        if (SwitchPhoneItemGroupView.a(SwitchPhoneItemGroupView.this) != null) {
          SwitchPhoneItemGroupView.a(SwitchPhoneItemGroupView.this).cN(paramAnonymousView);
        }
        GMTrace.o(6966302736384L, 51903);
      }
    };
    GMTrace.o(6967779131392L, 51914);
  }
  
  public final void a(SwitchPhoneItemView paramSwitchPhoneItemView, int paramInt)
  {
    GMTrace.i(6967913349120L, 51915);
    addView(paramSwitchPhoneItemView, paramInt);
    this.rYg.add(paramSwitchPhoneItemView);
    paramSwitchPhoneItemView.setOnClickListener(this.rYi);
    GMTrace.o(6967913349120L, 51915);
  }
  
  public static abstract interface a
  {
    public abstract void cN(View paramView);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/wallet_core/ui/view/SwitchPhoneItemGroupView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */