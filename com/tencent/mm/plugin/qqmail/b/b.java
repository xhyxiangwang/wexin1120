package com.tencent.mm.plugin.qqmail.b;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.au.n;
import com.tencent.mm.g.a.ag;
import com.tencent.mm.g.a.ag.a;
import com.tencent.mm.plugin.messenger.foundation.a.a.d;
import com.tencent.mm.storage.t;
import com.tencent.mm.x.ap;
import com.tencent.mm.x.m;

final class b
  extends com.tencent.mm.sdk.b.c<ag>
{
  b()
  {
    GMTrace.i(5447360708608L, 40586);
    this.uLu = ag.class.getName().hashCode();
    GMTrace.o(5447360708608L, 40586);
  }
  
  private static boolean a(ag paramag)
  {
    GMTrace.i(5447494926336L, 40587);
    if (!(paramag instanceof ag))
    {
      com.tencent.mm.sdk.platformtools.w.f("MicroMsg.QQMail.EventListener", "not bind qq event");
      GMTrace.o(5447494926336L, 40587);
      return false;
    }
    if (paramag.fuh.fuj == 0) {}
    try
    {
      ap.AS();
      com.tencent.mm.x.c.xi().set(17, Integer.valueOf(2));
      int i = m.zQ() | 0x1;
      ap.AS();
      com.tencent.mm.x.c.xi().set(34, Integer.valueOf(i));
      ap.AS();
      com.tencent.mm.x.c.yK().b(new n("", "", "", "", "", "", "", "", i, "", ""));
      w.aXc();
      com.tencent.mm.sdk.platformtools.w.d("MicroMsg.QQMail.EventListener", "doClearQQMailHelper succ ");
      GMTrace.o(5447494926336L, 40587);
      return false;
    }
    catch (Exception paramag)
    {
      for (;;)
      {
        com.tencent.mm.sdk.platformtools.w.printErrStackTrace("MicroMsg.QQMail.EventListener", paramag, "", new Object[0]);
      }
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/qqmail/b/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */