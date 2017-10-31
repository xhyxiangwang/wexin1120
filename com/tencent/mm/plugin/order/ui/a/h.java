package com.tencent.mm.plugin.order.ui.a;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout.LayoutParams;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.b;
import com.tencent.mm.ui.base.preference.Preference;

public final class h
  extends Preference
{
  boolean jIy;
  private View mView;
  boolean otN;
  boolean otO;
  
  public h(Context paramContext)
  {
    super(paramContext);
    GMTrace.i(6645790801920L, 49515);
    this.mView = null;
    this.otN = false;
    this.otO = false;
    this.jIy = true;
    setLayoutResource(R.i.cZM);
    GMTrace.o(6645790801920L, 49515);
  }
  
  public final View getView(View paramView, ViewGroup paramViewGroup)
  {
    GMTrace.i(6645925019648L, 49516);
    if (this.mView == null) {
      this.mView = onCreateView(paramViewGroup);
    }
    onBindView(this.mView);
    paramView = this.mView;
    GMTrace.o(6645925019648L, 49516);
    return paramView;
  }
  
  protected final void onBindView(View paramView)
  {
    GMTrace.i(6646059237376L, 49517);
    super.onBindView(paramView);
    paramView = paramView.findViewById(R.h.bZT);
    LinearLayout.LayoutParams localLayoutParams = (LinearLayout.LayoutParams)paramView.getLayoutParams();
    int i = BackwardSupportUtil.b.a(this.mContext, 10.0F);
    if (this.otN) {}
    for (int j = i;; j = 0)
    {
      if (this.otO) {}
      for (;;)
      {
        localLayoutParams.setMargins(0, j, 0, i);
        paramView.setLayoutParams(localLayoutParams);
        if (!this.jIy)
        {
          paramView.setVisibility(4);
          GMTrace.o(6646059237376L, 49517);
          return;
        }
        paramView.setVisibility(0);
        GMTrace.o(6646059237376L, 49517);
        return;
        i = 0;
      }
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/order/ui/a/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */