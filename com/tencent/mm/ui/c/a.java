package com.tencent.mm.ui.c;

import android.content.Context;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.u.a.a;
import com.tencent.mm.ui.c.a.c;

public final class a
{
  public static Animation ff(Context paramContext)
  {
    GMTrace.i(2899639795712L, 21604);
    if (paramContext == null)
    {
      w.e("MicroMsg.MMAnimationEffectLoader", "hy: context is null.");
      GMTrace.o(2899639795712L, 21604);
      return null;
    }
    paramContext = AnimationUtils.loadAnimation(paramContext, a.a.gUE);
    if (-1L > 0L) {
      paramContext.setDuration(-1L);
    }
    paramContext.setInterpolator(new c());
    GMTrace.o(2899639795712L, 21604);
    return paramContext;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/ui/c/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */