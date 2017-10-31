package com.tencent.mm.plugin.walletlock.gesture.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.kernel.h;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import com.tencent.mm.storage.w.a;

public final class b
{
  public static boolean byL()
  {
    GMTrace.i(20244462567424L, 150833);
    boolean bool = ((Boolean)h.xz().xi().get(w.a.vdt, Boolean.valueOf(false))).booleanValue();
    GMTrace.o(20244462567424L, 150833);
    return bool;
  }
  
  public static boolean byM()
  {
    GMTrace.i(20244596785152L, 150834);
    g localg = d.byN();
    w.v("MicroMsg.GestureUtil", "alvinluo timeInfo: %d, %d", new Object[] { Long.valueOf(localg.sfu), Long.valueOf(localg.sfv) });
    if (localg.sfu != -1L)
    {
      e.a(localg);
      if (localg.sfv / 1000L < 600L)
      {
        d.t(localg.sfu, localg.sfv);
        GMTrace.o(20244596785152L, 150834);
        return true;
      }
      d.byO();
    }
    GMTrace.o(20244596785152L, 150834);
    return false;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/walletlock/gesture/a/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */