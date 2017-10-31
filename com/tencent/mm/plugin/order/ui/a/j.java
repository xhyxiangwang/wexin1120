package com.tencent.mm.plugin.order.ui.a;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.e;
import com.tencent.mm.R.f;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.bq.a;
import com.tencent.mm.plugin.order.model.MallOrderDetailObject.HelpCenter;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.ui.base.preference.Preference;
import java.util.LinkedList;
import java.util.List;

public final class j
  extends Preference
{
  View.OnClickListener mOnClickListener;
  private View mView;
  List<MallOrderDetailObject.HelpCenter> oqI;
  String otR;
  View.OnClickListener otS;
  
  public j(Context paramContext)
  {
    super(paramContext);
    GMTrace.i(6644448624640L, 49505);
    this.mView = null;
    this.mOnClickListener = null;
    this.otS = null;
    this.oqI = new LinkedList();
    setLayoutResource(R.i.cZQ);
    GMTrace.o(6644448624640L, 49505);
  }
  
  public final View getView(View paramView, ViewGroup paramViewGroup)
  {
    GMTrace.i(6644582842368L, 49506);
    if (this.mView == null) {
      this.mView = onCreateView(paramViewGroup);
    }
    onBindView(this.mView);
    paramView = this.mView;
    GMTrace.o(6644582842368L, 49506);
    return paramView;
  }
  
  protected final void onBindView(View paramView)
  {
    GMTrace.i(6644717060096L, 49507);
    super.onBindView(paramView);
    paramView = (LinearLayout)paramView.findViewById(R.h.bZX);
    paramView.removeAllViews();
    if (this.oqI == null)
    {
      GMTrace.o(6644717060096L, 49507);
      return;
    }
    int i;
    if ((!bg.mZ(this.otR)) && (this.otS != null))
    {
      i = this.oqI.size();
      if (i != 0) {
        break label473;
      }
      i = -1;
    }
    label473:
    for (;;)
    {
      int j = 0;
      int k = 0;
      Object localObject;
      for (;;)
      {
        if (j < this.oqI.size())
        {
          localObject = (MallOrderDetailObject.HelpCenter)this.oqI.get(j);
          TextView localTextView = new TextView(this.mContext);
          localTextView.setTextColor(this.mContext.getResources().getColor(R.e.black));
          localTextView.setTextSize(0, a.U(this.mContext, R.f.aSh));
          localTextView.setIncludeFontPadding(false);
          localTextView.setText(((MallOrderDetailObject.HelpCenter)localObject).name);
          localTextView.setTag(localObject);
          localTextView.setGravity(17);
          localTextView.setOnClickListener(this.mOnClickListener);
          if (k == i) {
            localTextView.setTextColor(this.mContext.getResources().getColor(R.e.aOx));
          }
          paramView.addView(localTextView, new LinearLayout.LayoutParams(0, -2, 1.0F));
          if (k < i)
          {
            localObject = new View(this.mContext);
            ((View)localObject).setBackgroundColor(this.mContext.getResources().getColor(R.e.aQl));
            paramView.addView((View)localObject, new LinearLayout.LayoutParams(a.U(this.mContext, R.f.aRu), -1));
          }
          k += 1;
          j += 1;
          continue;
          i = this.oqI.size() - 1;
          break;
        }
      }
      if ((!bg.mZ(this.otR)) && (this.otS != null))
      {
        localObject = new TextView(this.mContext);
        ((TextView)localObject).setTextColor(this.mContext.getResources().getColor(R.e.black));
        ((TextView)localObject).setTextSize(0, a.U(this.mContext, R.f.aSh));
        ((TextView)localObject).setIncludeFontPadding(false);
        ((TextView)localObject).setText(this.otR);
        ((TextView)localObject).setGravity(17);
        ((TextView)localObject).setOnClickListener(this.otS);
        if (k == i) {
          ((TextView)localObject).setTextColor(this.mContext.getResources().getColor(R.e.aOx));
        }
        paramView.addView((View)localObject, new LinearLayout.LayoutParams(0, -2, 1.0F));
      }
      GMTrace.o(6644717060096L, 49507);
      return;
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/order/ui/a/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */