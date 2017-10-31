package com.tencent.mm.plugin.ipcall.a.f;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.ipcall.a.a.a;
import com.tencent.mm.plugin.ipcall.a.a.c;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.x.ap;

public final class h
  extends a
{
  public int naj;
  public boolean nak;
  
  public h()
  {
    GMTrace.i(11599096053760L, 86420);
    this.naj = 1;
    this.nak = false;
    GMTrace.o(11599096053760L, 86420);
  }
  
  public final int Fb()
  {
    GMTrace.i(11599364489216L, 86422);
    GMTrace.o(11599364489216L, 86422);
    return 4;
  }
  
  public final int[] aHx()
  {
    GMTrace.i(11599230271488L, 86421);
    GMTrace.o(11599230271488L, 86421);
    return new int[] { 723 };
  }
  
  public final void aHy()
  {
    GMTrace.i(11599498706944L, 86423);
    GMTrace.o(11599498706944L, 86423);
  }
  
  public final void b(c paramc)
  {
    GMTrace.i(11599767142400L, 86425);
    if (paramc != null)
    {
      w.d("MicroMsg.IPCallShutDownService", "call shutdown scene, roomId: %d, inviteId: %d", new Object[] { Integer.valueOf(paramc.mXg), Integer.valueOf(paramc.mXj) });
      paramc = new com.tencent.mm.plugin.ipcall.a.d.n(paramc.mXg, paramc.mXh, paramc.mXi, this.naj);
      ap.wT().a(paramc, 0);
    }
    GMTrace.o(11599767142400L, 86425);
  }
  
  public final void onDestroy()
  {
    GMTrace.i(11599632924672L, 86424);
    GMTrace.o(11599632924672L, 86424);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/ipcall/a/f/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */