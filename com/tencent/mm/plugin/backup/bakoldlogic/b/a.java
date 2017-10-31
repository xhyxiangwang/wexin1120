package com.tencent.mm.plugin.backup.bakoldlogic.b;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.a.k;
import com.tencent.mm.plugin.backup.bakoldlogic.bakoldmovemodel.g;
import com.tencent.mm.plugin.backup.h.v;
import com.tencent.mm.sdk.platformtools.bg;

public final class a
  extends com.tencent.mm.plugin.backup.f.b
{
  final int jLd;
  public v jQU;
  public com.tencent.mm.plugin.backup.h.w jQV;
  private boolean jRa;
  final String jUv;
  final String jUw;
  final byte[] key;
  
  public a(String paramString1, String paramString2, byte[] paramArrayOfByte, String paramString3, int paramInt1, int paramInt2)
  {
    GMTrace.i(14807973494784L, 110328);
    this.jQU = new v();
    this.jQV = new com.tencent.mm.plugin.backup.h.w();
    this.jRa = false;
    com.tencent.mm.sdk.platformtools.w.i("MicroMsg.BakOldAuthScene", "summerbak init id:%s,  hello:%s, ok:%s, stack[%s]", new Object[] { paramString3, paramString1, paramString2, bg.bOd() });
    this.jQU.jWD = new com.tencent.mm.bl.b(k.b(paramString1.getBytes(), paramArrayOfByte));
    this.jQU.jXN = 0;
    this.jQU.ID = paramString3;
    this.jQU.jXO = paramInt1;
    this.jUv = paramString2;
    this.jUw = paramString3;
    this.key = paramArrayOfByte;
    this.jLd = paramInt2;
    GMTrace.o(14807973494784L, 110328);
  }
  
  private void ky(int paramInt)
  {
    GMTrace.i(14808644583424L, 110333);
    if (this.jLd == -22) {
      com.tencent.mm.plugin.backup.bakoldlogic.bakoldmovemodel.a.aft().afw().kx(paramInt);
    }
    GMTrace.o(14808644583424L, 110333);
  }
  
  public final com.tencent.mm.bl.a aeP()
  {
    GMTrace.i(14808241930240L, 110330);
    com.tencent.mm.plugin.backup.h.w localw = this.jQV;
    GMTrace.o(14808241930240L, 110330);
    return localw;
  }
  
  public final com.tencent.mm.bl.a aeQ()
  {
    GMTrace.i(14808376147968L, 110331);
    v localv = this.jQU;
    GMTrace.o(14808376147968L, 110331);
    return localv;
  }
  
  public final void aeR()
  {
    GMTrace.i(14808510365696L, 110332);
    if (this.jQV.jXo == 0)
    {
      if (this.jUw.equals(this.jQV.ID))
      {
        String str = new String(k.a(this.jQV.jWD.toK, this.key));
        if (str.length() != this.jUv.length()) {}
        for (boolean bool = false;; bool = str.equals(this.jUv))
        {
          this.jRa = bool;
          com.tencent.mm.sdk.platformtools.w.i("MicroMsg.BakOldAuthScene", "check ok result:%b", new Object[] { Boolean.valueOf(this.jRa) });
          if (!this.jRa) {
            break;
          }
          g(0, 0, "auth ok");
          this.jQU.jWD = new com.tencent.mm.bl.b(k.b(this.jUv.getBytes(), this.key));
          this.jQU.jXN = 1;
          this.jQU.ID = this.jUw;
          dg(true);
          GMTrace.o(14808510365696L, 110332);
          return;
        }
        com.tencent.mm.sdk.platformtools.w.e("MicroMsg.BakOldAuthScene", "check ok failed");
        ky(30050002);
        g(4, 1, "not ok packet");
        GMTrace.o(14808510365696L, 110332);
        return;
      }
      com.tencent.mm.sdk.platformtools.w.e("MicroMsg.BakOldAuthScene", "not the same id");
      ky(30050028);
      g(4, -1, "not the same id");
      GMTrace.o(14808510365696L, 110332);
      return;
    }
    com.tencent.mm.sdk.platformtools.w.e("MicroMsg.BakOldAuthScene", "errType %d", new Object[] { Integer.valueOf(this.jQV.jXo) });
    ky(30050002);
    g(4, this.jQV.jXo, "not not success");
    GMTrace.o(14808510365696L, 110332);
  }
  
  public final int getType()
  {
    GMTrace.i(14808107712512L, 110329);
    GMTrace.o(14808107712512L, 110329);
    return 1;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/backup/bakoldlogic/b/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */