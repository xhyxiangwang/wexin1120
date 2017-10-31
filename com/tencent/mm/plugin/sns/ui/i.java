package com.tencent.mm.plugin.sns.ui;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import com.tencent.gmtrace.GMTrace;

public final class i
  extends LinearLayout
{
  private Context context;
  private int keK;
  public int qxI;
  private LinearLayout qxJ;
  
  public i(Context paramContext)
  {
    super(paramContext);
    GMTrace.i(8613556912128L, 64176);
    this.keK = 0;
    this.qxI = 6;
    this.context = paramContext;
    setOrientation(1);
    GMTrace.o(8613556912128L, 64176);
  }
  
  public final void addView(View paramView)
  {
    GMTrace.i(8613691129856L, 64177);
    if (this.keK % this.qxI == 0)
    {
      this.qxJ = new LinearLayout(this.context);
      this.qxJ.setOrientation(0);
      this.qxJ.addView(paramView);
      super.addView(this.qxJ);
    }
    for (;;)
    {
      this.keK += 1;
      GMTrace.o(8613691129856L, 64177);
      return;
      this.qxJ.addView(paramView);
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/sns/ui/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */