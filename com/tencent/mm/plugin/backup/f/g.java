package com.tencent.mm.plugin.backup.f;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.bl.a;
import com.tencent.mm.plugin.backup.h.n;
import com.tencent.mm.plugin.backup.h.o;
import com.tencent.mm.sdk.platformtools.w;

public final class g
  extends b
{
  public n jRx;
  public o jRy;
  
  public g(String paramString)
  {
    GMTrace.i(9501541400576L, 70792);
    this.jRx = new n();
    this.jRy = new o();
    w.i("MicroMsg.BackupStartScene", "BackupStartScene, id[%s]", new Object[] { paramString });
    this.jRx.ID = paramString;
    GMTrace.o(9501541400576L, 70792);
  }
  
  public final a aeQ()
  {
    GMTrace.i(9501944053760L, 70795);
    n localn = this.jRx;
    GMTrace.o(9501944053760L, 70795);
    return localn;
  }
  
  public final void aeR()
  {
    GMTrace.i(9502078271488L, 70796);
    w.i("MicroMsg.BackupStartScene", "onSceneEnd.");
    if (this.jRy.jXo != 0)
    {
      g(4, this.jRy.jXo, "BackupStartScene onSceneEnd failed");
      GMTrace.o(9502078271488L, 70796);
      return;
    }
    g(0, this.jRy.jXo, "BackupStartScene onSceneEnd success");
    GMTrace.o(9502078271488L, 70796);
  }
  
  public final int getType()
  {
    GMTrace.i(9501675618304L, 70793);
    GMTrace.o(9501675618304L, 70793);
    return 3;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/backup/f/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */