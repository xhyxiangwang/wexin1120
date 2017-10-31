package com.tencent.mm.plugin.backup.f;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ac.e;
import com.tencent.mm.bl.a;
import com.tencent.mm.plugin.backup.h.aa;
import com.tencent.mm.plugin.backup.h.z;
import com.tencent.mm.sdk.platformtools.w;
import java.util.LinkedList;

public final class d
  extends b
{
  private e hnC;
  private z jRt;
  public aa jRu;
  
  public d(String paramString1, long paramLong1, long paramLong2, String paramString2, String paramString3, LinkedList<String> paramLinkedList, e parame)
  {
    GMTrace.i(9500065005568L, 70781);
    this.jRt = new z();
    this.jRu = new aa();
    w.i("MicroMsg.BackupDataTagScene", "init DataTag, BakChatName:%s, startTime:%d, endTime:%d, mediaIdList size:%d", new Object[] { paramString1, Long.valueOf(paramLong1), Long.valueOf(paramLong2), Integer.valueOf(paramLinkedList.size()) });
    this.jRt.jWO = paramString1;
    this.jRt.jXZ = paramLong1;
    this.jRt.jYa = paramLong2;
    this.jRt.jYb = paramString2;
    this.jRt.jYc = paramString3;
    this.jRt.jXG = paramLinkedList;
    this.hnC = parame;
    GMTrace.o(9500065005568L, 70781);
  }
  
  public final a aeP()
  {
    GMTrace.i(9500467658752L, 70784);
    aa localaa = this.jRu;
    GMTrace.o(9500467658752L, 70784);
    return localaa;
  }
  
  public final a aeQ()
  {
    GMTrace.i(9500601876480L, 70785);
    z localz = this.jRt;
    GMTrace.o(9500601876480L, 70785);
    return localz;
  }
  
  public final void aeR()
  {
    GMTrace.i(9500736094208L, 70786);
    w.i("MicroMsg.BackupDataTagScene", "onSceneEnd");
    g(0, 0, "success");
    this.hnC.a(0, 0, "", this);
    GMTrace.o(9500736094208L, 70786);
  }
  
  public final boolean aeV()
  {
    GMTrace.i(9500199223296L, 70782);
    boolean bool = super.aeW();
    if (!bool) {
      this.hnC.a(1, -2, "doScene failed", this);
    }
    GMTrace.o(9500199223296L, 70782);
    return bool;
  }
  
  public final int getType()
  {
    GMTrace.i(9500333441024L, 70783);
    GMTrace.o(9500333441024L, 70783);
    return 15;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/backup/f/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */