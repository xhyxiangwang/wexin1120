package com.tencent.mm.plugin.backup.bakoldlogic.b;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.bl.a;
import com.tencent.mm.plugin.backup.h.n;
import com.tencent.mm.plugin.backup.h.o;
import com.tencent.mm.sdk.platformtools.w;

public final class b
  extends com.tencent.mm.plugin.backup.f.b
{
  private int jLd;
  private n jRx;
  public o jRy;
  
  public b(String paramString)
  {
    GMTrace.i(14808778801152L, 110334);
    this.jRx = new n();
    this.jRy = new o();
    w.i("MicroMsg.BakOldStartScene", "init id:%s", new Object[] { paramString });
    this.jRx.ID = paramString;
    this.jLd = -22;
    GMTrace.o(14808778801152L, 110334);
  }
  
  public final a aeP()
  {
    GMTrace.i(14809047236608L, 110336);
    o localo = this.jRy;
    GMTrace.o(14809047236608L, 110336);
    return localo;
  }
  
  public final a aeQ()
  {
    GMTrace.i(14809181454336L, 110337);
    n localn = this.jRx;
    GMTrace.o(14809181454336L, 110337);
    return localn;
  }
  
  public final void aeR()
  {
    GMTrace.i(14809315672064L, 110338);
    w.i("MicroMsg.BakOldStartScene", "onSceneEnd");
    if (this.jRy.jXo == 0)
    {
      g(0, this.jRy.jXo, "BakOldStartScene ok");
      GMTrace.o(14809315672064L, 110338);
      return;
    }
    w.e("MicroMsg.BakOldStartScene", "errType %d", new Object[] { Integer.valueOf(this.jRy.jXo) });
    g(4, this.jRy.jXo, "BakOldStartScene not success");
    GMTrace.o(14809315672064L, 110338);
  }
  
  public final int getType()
  {
    GMTrace.i(14808913018880L, 110335);
    GMTrace.o(14808913018880L, 110335);
    return 3;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/backup/bakoldlogic/b/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */