package com.tencent.mm.plugin.qmessage.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.au.n;
import com.tencent.mm.g.a.ag;
import com.tencent.mm.g.a.ag.a;
import com.tencent.mm.plugin.messenger.foundation.a.a.d;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import com.tencent.mm.x.ap;
import com.tencent.mm.x.m;

final class a
  extends com.tencent.mm.sdk.b.c<ag>
{
  a()
  {
    GMTrace.i(8936887418880L, 66585);
    this.uLu = ag.class.getName().hashCode();
    GMTrace.o(8936887418880L, 66585);
  }
  
  private static boolean a(ag paramag)
  {
    GMTrace.i(8937021636608L, 66586);
    if (!(paramag instanceof ag))
    {
      w.f("MicroMsg.QMsg.EventListener", "not bind qq event");
      GMTrace.o(8937021636608L, 66586);
      return false;
    }
    if (paramag.fuh.fuj == 0) {}
    try
    {
      int i = m.zQ() | 0x20;
      ap.AS();
      com.tencent.mm.x.c.xi().set(34, Integer.valueOf(i));
      ap.AS();
      com.tencent.mm.x.c.yK().b(new n("", "", "", "", "", "", "", "", i, "", ""));
      g.aWI();
      w.d("MicroMsg.QMsg.EventListener", "doClearQQOffLineMessageHelper succ ");
      GMTrace.o(8937021636608L, 66586);
      return false;
    }
    catch (Exception paramag)
    {
      for (;;)
      {
        w.printErrStackTrace("MicroMsg.QMsg.EventListener", paramag, "", new Object[0]);
      }
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/qmessage/a/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */