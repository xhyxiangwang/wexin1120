package com.tencent.mm.plugin.appbrand.widget;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.p.d;

public final class b
{
  public static int bX(Context paramContext)
  {
    GMTrace.i(10137867649024L, 75533);
    DisplayMetrics localDisplayMetrics = paramContext.getResources().getDisplayMetrics();
    if (localDisplayMetrics.widthPixels > localDisplayMetrics.heightPixels) {}
    for (int i = paramContext.getResources().getDimensionPixelSize(p.d.aRn);; i = paramContext.getResources().getDimensionPixelSize(p.d.aRo))
    {
      GMTrace.o(10137867649024L, 75533);
      return i;
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/widget/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */