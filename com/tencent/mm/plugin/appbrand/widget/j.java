package com.tencent.mm.plugin.appbrand.widget;

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.os.Build.VERSION;
import android.view.Window;
import android.widget.FrameLayout;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.ui.g;

public class j
  extends FrameLayout
  implements p.a
{
  static final boolean jzO;
  private int jsW;
  private final Paint jzP;
  private boolean jzQ;
  private int jzR;
  private final Activity mActivity;
  
  static
  {
    GMTrace.i(18246765903872L, 135949);
    jzO = p.jzU;
    GMTrace.o(18246765903872L, 135949);
  }
  
  public j(Context paramContext)
  {
    super(paramContext);
    GMTrace.i(18246363250688L, 135946);
    if (jzO)
    {
      this.mActivity = g.bR(paramContext);
      p.j(this.mActivity).a(this);
      this.jzP = new Paint(1);
      this.jzP.setStyle(Paint.Style.FILL);
      setWillNotDraw(false);
      GMTrace.o(18246363250688L, 135946);
      return;
    }
    this.mActivity = null;
    this.jzP = null;
    GMTrace.o(18246363250688L, 135946);
  }
  
  public final void jx(int paramInt)
  {
    GMTrace.i(18246229032960L, 135945);
    this.jsW = Math.max(0, paramInt);
    setPadding(0, this.jsW, 0, 0);
    postInvalidate();
    GMTrace.o(18246229032960L, 135945);
  }
  
  protected void onDraw(Canvas paramCanvas)
  {
    GMTrace.i(18246631686144L, 135948);
    if ((this.jsW <= 0) || (!jzO)) {}
    for (;;)
    {
      super.onDraw(paramCanvas);
      GMTrace.o(18246631686144L, 135948);
      return;
      this.jzP.setColor(this.jzR);
      paramCanvas.drawRect(0.0F, 0.0F, getWidth(), this.jsW, this.jzP);
    }
  }
  
  public final void setStatusBarColor(int paramInt)
  {
    GMTrace.i(19861673607168L, 147981);
    if (!jzO)
    {
      GMTrace.o(19861673607168L, 147981);
      return;
    }
    u(paramInt, g.c(this.mActivity.getWindow()));
    GMTrace.o(19861673607168L, 147981);
  }
  
  public final void u(int paramInt, boolean paramBoolean)
  {
    GMTrace.i(18246497468416L, 135947);
    this.jzR = paramInt;
    this.jzQ = paramBoolean;
    if (!jzO)
    {
      GMTrace.o(18246497468416L, 135947);
      return;
    }
    Window localWindow = this.mActivity.getWindow();
    g.a(localWindow);
    if ((Build.VERSION.SDK_INT >= 23) && (g.a(localWindow, paramBoolean))) {}
    for (;;)
    {
      this.jzR = paramInt;
      do
      {
        postInvalidate();
        GMTrace.o(18246497468416L, 135947);
        return;
      } while (Build.VERSION.SDK_INT < 21);
      if (paramBoolean) {
        paramInt = g.jy(paramInt);
      }
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/widget/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */