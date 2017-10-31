package com.tencent.mm.plugin.ipcall.a.f;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ac.n;
import com.tencent.mm.plugin.ipcall.a.a.a;
import com.tencent.mm.plugin.ipcall.a.a.c;
import com.tencent.mm.plugin.ipcall.a.d.i;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.x.ap;

public final class d
  extends a
{
  public d()
  {
    GMTrace.i(11591714078720L, 86365);
    GMTrace.o(11591714078720L, 86365);
  }
  
  public final int Fb()
  {
    GMTrace.i(11591982514176L, 86367);
    GMTrace.o(11591982514176L, 86367);
    return 1;
  }
  
  public final int[] aHx()
  {
    GMTrace.i(11591848296448L, 86366);
    GMTrace.o(11591848296448L, 86366);
    return new int[] { 991 };
  }
  
  public final void aHy()
  {
    GMTrace.i(11592116731904L, 86368);
    GMTrace.o(11592116731904L, 86368);
  }
  
  public final void b(c paramc)
  {
    GMTrace.i(11592385167360L, 86370);
    if (paramc != null)
    {
      if (paramc.mXj == 0) {
        paramc.mXj = ((int)System.currentTimeMillis());
      }
      i locali = new i(paramc.fMl, paramc.mXI, paramc.mXj, paramc.mXk, paramc.mXl);
      ap.wT().a(locali, 0);
      w.d("MicroMsg.IPCallInviteService", "start invite, toUsername: %s, toPhoneNumber: %s, inviteid: %d", new Object[] { paramc.fMl, paramc.mXI, Integer.valueOf(paramc.mXj) });
    }
    GMTrace.o(11592385167360L, 86370);
  }
  
  public final void onDestroy()
  {
    GMTrace.i(11592250949632L, 86369);
    GMTrace.o(11592250949632L, 86369);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/ipcall/a/f/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */