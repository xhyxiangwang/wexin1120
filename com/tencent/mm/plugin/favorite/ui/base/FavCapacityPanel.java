package com.tencent.mm.plugin.favorite.ui.base;

import android.content.Context;
import android.content.Intent;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.bi.d;
import com.tencent.mm.plugin.favorite.b.x;

public class FavCapacityPanel
  extends LinearLayout
{
  private LinearLayout lTO;
  public long lTP;
  public TextView lTQ;
  public int lTR;
  public long lTS;
  private View.OnClickListener lTT;
  
  public FavCapacityPanel(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(6456141152256L, 48102);
    this.lTR = 0;
    this.lTT = new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(6457080676352L, 48109);
        paramAnonymousView = new Intent();
        if (FavCapacityPanel.this.lTR == 0) {
          paramAnonymousView.putExtra("key_enter_fav_cleanui_from", 1);
        }
        for (;;)
        {
          d.b(FavCapacityPanel.this.getContext(), "favorite", ".ui.FavCleanUI", paramAnonymousView);
          GMTrace.o(6457080676352L, 48109);
          return;
          paramAnonymousView.putExtra("key_enter_fav_cleanui_from", 2);
        }
      }
    };
    this.lTO = this;
    paramContext = View.inflate(getContext(), R.i.cUp, null);
    paramContext.measure(-2, -2);
    paramAttributeSet = paramContext.findViewById(R.h.bGA);
    View localView = paramContext.findViewById(R.h.bGB);
    this.lTQ = ((TextView)paramContext.findViewById(R.h.bGz));
    LinearLayout.LayoutParams localLayoutParams = (LinearLayout.LayoutParams)paramAttributeSet.getLayoutParams();
    localLayoutParams.width = paramContext.getMeasuredWidth();
    paramAttributeSet.setLayoutParams(localLayoutParams);
    localView.setOnClickListener(this.lTT);
    paramAttributeSet = new LinearLayout.LayoutParams(0, -2);
    paramAttributeSet.weight = 1.0F;
    this.lTO.addView(paramContext, paramAttributeSet);
    this.lTP = (x.axg() / 1048576L);
    this.lTS = (x.axh() / 1048576L);
    paramContext = this.lTQ;
    paramAttributeSet = this.lTQ.getContext();
    int i = R.l.dVR;
    if (this.lTS - this.lTP > 0L) {}
    for (long l = this.lTS - this.lTP;; l = 0L)
    {
      paramContext.setText(paramAttributeSet.getString(i, new Object[] { Long.valueOf(l), Long.valueOf(this.lTP) }));
      GMTrace.o(6456141152256L, 48102);
      return;
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/favorite/ui/base/FavCapacityPanel.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */