package com.tencent.mm.plugin.backup.f;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.a.k;
import com.tencent.mm.plugin.backup.a.c;
import com.tencent.mm.plugin.backup.h.v;
import com.tencent.mm.sdk.platformtools.bg;

public final class a
  extends b
{
  private v jQU;
  public com.tencent.mm.plugin.backup.h.w jQV;
  final int jQW;
  final String jQX;
  final byte[] jQY;
  final String jQZ;
  private boolean jRa;
  
  public a(String paramString1, String paramString2, byte[] paramArrayOfByte, String paramString3, int paramInt1, int paramInt2)
  {
    GMTrace.i(9502883577856L, 70802);
    this.jQU = new v();
    this.jQV = new com.tencent.mm.plugin.backup.h.w();
    this.jRa = false;
    com.tencent.mm.sdk.platformtools.w.i("MicroMsg.BackupAuthScene", "summerbak BackupAuthScene init, backupType[%d], stack:%s", new Object[] { Integer.valueOf(paramInt2), bg.bOd() });
    this.jQU.jWD = new com.tencent.mm.bl.b(k.b(paramString1.getBytes(), paramArrayOfByte));
    this.jQU.jXN = 0;
    this.jQU.ID = paramString3;
    this.jQU.jXO = paramInt1;
    this.jQX = paramString2;
    this.jQZ = paramString3;
    this.jQY = paramArrayOfByte;
    this.jQW = paramInt2;
    GMTrace.o(9502883577856L, 70802);
  }
  
  public final com.tencent.mm.bl.a aeP()
  {
    GMTrace.i(9503152013312L, 70804);
    com.tencent.mm.plugin.backup.h.w localw = this.jQV;
    GMTrace.o(9503152013312L, 70804);
    return localw;
  }
  
  public final com.tencent.mm.bl.a aeQ()
  {
    GMTrace.i(9503286231040L, 70805);
    v localv = this.jQU;
    GMTrace.o(9503286231040L, 70805);
    return localv;
  }
  
  public final void aeR()
  {
    GMTrace.i(9503420448768L, 70806);
    if (this.jQV.jXo != 0)
    {
      com.tencent.mm.sdk.platformtools.w.e("MicroMsg.BackupAuthScene", "onSceneEnd errType[%d]", new Object[] { Integer.valueOf(this.jQV.jXo) });
      g(4, this.jQV.jXo, "onSceneEnd status failed");
      GMTrace.o(9503420448768L, 70806);
      return;
    }
    if (!this.jQZ.equals(this.jQV.ID))
    {
      com.tencent.mm.sdk.platformtools.w.e("MicroMsg.BackupAuthScene", "onSceneEnd not the same id");
      g(4, -1, "onSceneEnd not the same id");
      GMTrace.o(9503420448768L, 70806);
      return;
    }
    String str = new String(k.a(this.jQV.jWD.toK, this.jQY));
    if (str.length() != this.jQX.length()) {}
    for (boolean bool = false;; bool = str.equals(this.jQX))
    {
      this.jRa = bool;
      com.tencent.mm.sdk.platformtools.w.i("MicroMsg.BackupAuthScene", "onSceneEnd check ok result[%b]", new Object[] { Boolean.valueOf(this.jRa) });
      if (this.jRa) {
        break;
      }
      com.tencent.mm.sdk.platformtools.w.e("MicroMsg.BackupAuthScene", "onSceneEnd check ok failed");
      g(4, -3, "onSceneEnd check ok failed");
      GMTrace.o(9503420448768L, 70806);
      return;
    }
    g(0, 0, "onSceneEnd auth success");
    this.jQU.jWD = new com.tencent.mm.bl.b(k.b(this.jQX.getBytes(), this.jQY));
    this.jQU.jXN = 1;
    this.jQU.ID = this.jQZ;
    dg(true);
    GMTrace.o(9503420448768L, 70806);
  }
  
  public final boolean aeS()
  {
    GMTrace.i(9503554666496L, 70807);
    if ((this.jQV.jXQ & c.jKQ) == 0)
    {
      GMTrace.o(9503554666496L, 70807);
      return false;
    }
    GMTrace.o(9503554666496L, 70807);
    return true;
  }
  
  public final void df(boolean paramBoolean)
  {
    GMTrace.i(18462453792768L, 137556);
    if (paramBoolean)
    {
      localv = this.jQU;
      localv.jXQ |= c.jKQ;
    }
    v localv = this.jQU;
    localv.jXQ |= c.jKR;
    localv = this.jQU;
    localv.jXQ |= c.jKS;
    GMTrace.o(18462453792768L, 137556);
  }
  
  public final int getType()
  {
    GMTrace.i(9503017795584L, 70803);
    GMTrace.o(9503017795584L, 70803);
    return 1;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/backup/f/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */