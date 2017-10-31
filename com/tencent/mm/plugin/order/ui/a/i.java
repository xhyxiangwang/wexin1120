package com.tencent.mm.plugin.order.ui.a;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.ui.base.preference.Preference;

public final class i
  extends Preference
{
  private View mView;
  private int otP;
  String otQ;
  
  public i(Context paramContext)
  {
    super(paramContext);
    GMTrace.i(6640958963712L, 49479);
    this.mView = null;
    this.otP = Integer.MAX_VALUE;
    setLayoutResource(R.i.cZN);
    GMTrace.o(6640958963712L, 49479);
  }
  
  public final void DN(String paramString)
  {
    GMTrace.i(6641361616896L, 49482);
    try
    {
      this.otP = Color.parseColor(paramString);
      GMTrace.o(6641361616896L, 49482);
      return;
    }
    catch (Exception paramString)
    {
      this.otP = -1;
      GMTrace.o(6641361616896L, 49482);
    }
  }
  
  public final View getView(View paramView, ViewGroup paramViewGroup)
  {
    GMTrace.i(6641093181440L, 49480);
    if (this.mView == null) {
      this.mView = onCreateView(paramViewGroup);
    }
    onBindView(this.mView);
    paramView = this.mView;
    GMTrace.o(6641093181440L, 49480);
    return paramView;
  }
  
  protected final void onBindView(View paramView)
  {
    GMTrace.i(6641227399168L, 49481);
    super.onBindView(paramView);
    TextView localTextView = (TextView)paramView.findViewById(R.h.bZV);
    paramView = (TextView)paramView.findViewById(R.h.bZU);
    localTextView.setText(getTitle());
    paramView.setText(this.otQ);
    if (this.otP != Integer.MAX_VALUE) {
      paramView.setTextColor(this.otP);
    }
    GMTrace.o(6641227399168L, 49481);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/order/ui/a/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */