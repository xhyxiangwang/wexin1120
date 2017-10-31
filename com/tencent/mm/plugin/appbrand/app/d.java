package com.tencent.mm.plugin.appbrand.app;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.ipc.AppBrandMainProcessService;
import com.tencent.mm.plugin.appbrand.task.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.af;

final class d
{
  static void RU()
  {
    GMTrace.i(19680479674368L, 146631);
    if (af.isMainThread())
    {
      a.a(null);
      if (ab.bNi())
      {
        AppBrandMainProcessService.Vp();
        GMTrace.o(19680479674368L, 146631);
      }
    }
    else
    {
      af.u(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(19682224504832L, 146644);
          d.RU();
          GMTrace.o(19682224504832L, 146644);
        }
      });
    }
    GMTrace.o(19680479674368L, 146631);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/app/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */