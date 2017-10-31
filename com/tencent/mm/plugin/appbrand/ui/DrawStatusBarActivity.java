package com.tencent.mm.plugin.appbrand.ui;

import android.content.res.Resources;
import android.view.View;
import android.widget.FrameLayout.LayoutParams;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.p.c;
import com.tencent.mm.plugin.appbrand.widget.j;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.MMFragmentActivity;
import com.tencent.mm.ui.widget.SwipeBackLayout;

public abstract class DrawStatusBarActivity
  extends MMActivity
{
  private j jqj;
  
  public DrawStatusBarActivity()
  {
    GMTrace.i(19704101994496L, 146807);
    this.jqj = null;
    GMTrace.o(19704101994496L, 146807);
  }
  
  protected final void ZU()
  {
    GMTrace.i(19704236212224L, 146808);
    super.ZU();
    if ((this.vqg != null) && (this.vqg.getChildCount() > 0))
    {
      View localView = this.vqg.getChildAt(0);
      this.vqg.removeView(localView);
      this.jqj = new j(this);
      this.jqj.addView(localView, new FrameLayout.LayoutParams(-1, -1));
      this.vqg.addView(this.jqj);
      this.vqg.HB = this.jqj;
    }
    GMTrace.o(19704236212224L, 146808);
  }
  
  protected int getStatusBarColor()
  {
    GMTrace.i(19704370429952L, 146809);
    int i = getResources().getColor(p.c.aQq);
    GMTrace.o(19704370429952L, 146809);
    return i;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/ui/DrawStatusBarActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */