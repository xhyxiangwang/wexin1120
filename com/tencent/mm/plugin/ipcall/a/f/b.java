package com.tencent.mm.plugin.ipcall.a.f;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ac.n;
import com.tencent.mm.plugin.ipcall.a.d.g;
import com.tencent.mm.x.ap;

public final class b
{
  private static b naf;
  private g nag;
  
  public b()
  {
    GMTrace.i(11598693400576L, 86417);
    GMTrace.o(11598693400576L, 86417);
  }
  
  public static b aHQ()
  {
    GMTrace.i(11598827618304L, 86418);
    if (naf == null) {
      naf = new b();
    }
    b localb = naf;
    GMTrace.o(11598827618304L, 86418);
    return localb;
  }
  
  public final void ft(boolean paramBoolean)
  {
    GMTrace.i(11598961836032L, 86419);
    ap.wT().c(this.nag);
    this.nag = null;
    if (paramBoolean) {}
    for (this.nag = new g(1);; this.nag = new g(0))
    {
      ap.wT().a(this.nag, 0);
      GMTrace.o(11598961836032L, 86419);
      return;
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/ipcall/a/f/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */