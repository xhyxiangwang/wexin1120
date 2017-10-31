package com.tencent.mm.plugin.appbrand.ui;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.app.d;
import android.view.View;
import android.view.ViewGroup.MarginLayoutParams;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.compat.q.a;
import com.tencent.mm.ui.MMActivity;

final class h
{
  static void a(MMActivity paramMMActivity)
  {
    GMTrace.i(20045283459072L, 149349);
    if ((paramMMActivity == null) || (paramMMActivity.cO().cP() == null))
    {
      GMTrace.o(20045283459072L, 149349);
      return;
    }
    paramMMActivity.bUu();
    paramMMActivity = paramMMActivity.cO().cP().getCustomView().findViewById(q.a.bgt);
    if ((paramMMActivity != null) && (paramMMActivity.getLayoutParams() != null) && ((paramMMActivity.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)))
    {
      ((ViewGroup.MarginLayoutParams)paramMMActivity.getLayoutParams()).rightMargin = 0;
      paramMMActivity.requestLayout();
    }
    GMTrace.o(20045283459072L, 149349);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/ui/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */