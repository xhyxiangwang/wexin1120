package com.tencent.mm.plugin.order.ui.a;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils.TruncateAt;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.e;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.ui.base.preference.f;

public final class g
  extends Preference
{
  static int otE;
  static float otF;
  public f jqf;
  private View mView;
  String otG;
  public String[] otH;
  TextUtils.TruncateAt otI;
  boolean otJ;
  
  static
  {
    GMTrace.i(6644045971456L, 49502);
    otF = 16.0F;
    GMTrace.o(6644045971456L, 49502);
  }
  
  public g(Context paramContext)
  {
    super(paramContext);
    GMTrace.i(6643106447360L, 49495);
    this.mView = null;
    this.otJ = false;
    setLayoutResource(R.i.cZK);
    otE = paramContext.getResources().getColor(R.e.aPq);
    GMTrace.o(6643106447360L, 49495);
  }
  
  public final void a(String[] paramArrayOfString, TextUtils.TruncateAt paramTruncateAt)
  {
    GMTrace.i(6643509100544L, 49498);
    this.otH = paramArrayOfString;
    this.otI = paramTruncateAt;
    this.otJ = true;
    GMTrace.o(6643509100544L, 49498);
  }
  
  public final View getView(View paramView, ViewGroup paramViewGroup)
  {
    GMTrace.i(6643240665088L, 49496);
    if (this.mView == null) {
      this.mView = onCreateView(paramViewGroup);
    }
    onBindView(this.mView);
    paramView = this.mView;
    GMTrace.o(6643240665088L, 49496);
    return paramView;
  }
  
  protected final void onBindView(final View paramView)
  {
    GMTrace.i(6643374882816L, 49497);
    super.onBindView(paramView);
    TextView localTextView1 = (TextView)paramView.findViewById(R.h.bZS);
    final TextView localTextView2 = (TextView)paramView.findViewById(R.h.bZR);
    paramView = (LinearLayout)paramView.findViewById(R.h.bZQ);
    localTextView1.setText(getTitle());
    if ((this.otH == null) || (this.otH.length <= 1)) {
      localTextView2.setTextColor(otE);
    }
    for (;;)
    {
      localTextView2.setText(this.otG);
      GMTrace.o(6643374882816L, 49497);
      return;
      localTextView2.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(6642972229632L, 49494);
          localTextView2.setVisibility(8);
          int i = 0;
          if (i < g.this.otH.length)
          {
            paramAnonymousView = g.this;
            String str = g.this.otH[i];
            TextView localTextView = new TextView(paramAnonymousView.mContext);
            localTextView.setText(str);
            localTextView.setTextSize(g.otF);
            localTextView.setTextColor(g.otE);
            if (paramAnonymousView.otJ)
            {
              localTextView.setSingleLine(true);
              localTextView.setEllipsize(paramAnonymousView.otI);
            }
            for (;;)
            {
              paramView.addView(localTextView, new LinearLayout.LayoutParams(-2, -2));
              i += 1;
              break;
              localTextView.setSingleLine(false);
            }
          }
          localTextView2.setOnClickListener(null);
          if (g.this.jqf != null) {
            g.this.jqf.notifyDataSetChanged();
          }
          GMTrace.o(6642972229632L, 49494);
        }
      });
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/order/ui/a/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */