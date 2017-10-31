package com.tencent.mm.plugin.order.ui.a;

import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.ui.base.preference.Preference;

public final class e
  extends Preference
{
  public View.OnClickListener mOnClickListener;
  private View mView;
  public String otz;
  
  public e(Context paramContext)
  {
    super(paramContext);
    GMTrace.i(6644851277824L, 49508);
    this.mView = null;
    this.mOnClickListener = null;
    setLayoutResource(R.i.cZI);
    GMTrace.o(6644851277824L, 49508);
  }
  
  public final View getView(View paramView, ViewGroup paramViewGroup)
  {
    GMTrace.i(6644985495552L, 49509);
    if (this.mView == null) {
      this.mView = onCreateView(paramViewGroup);
    }
    onBindView(this.mView);
    paramView = this.mView;
    GMTrace.o(6644985495552L, 49509);
    return paramView;
  }
  
  protected final void onBindView(View paramView)
  {
    GMTrace.i(6645119713280L, 49510);
    super.onBindView(paramView);
    paramView = (TextView)paramView.findViewById(R.h.bZM);
    paramView.setText(this.otz);
    paramView.setOnClickListener(this.mOnClickListener);
    GMTrace.o(6645119713280L, 49510);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/order/ui/a/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */