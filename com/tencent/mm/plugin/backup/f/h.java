package com.tencent.mm.plugin.backup.f;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.bl.a;
import com.tencent.mm.plugin.backup.e.a.c;
import com.tencent.mm.plugin.backup.h.af;
import com.tencent.mm.plugin.backup.h.ag;
import com.tencent.mm.sdk.platformtools.w;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;

public final class h
  extends b
{
  private ag jRA;
  private a jRB;
  private af jRz;
  
  public h(String paramString, HashMap<Long, a.c> paramHashMap, a parama)
  {
    GMTrace.i(9510265552896L, 70857);
    this.jRz = new af();
    this.jRA = new ag();
    this.jRB = parama;
    this.jRz.jWO = paramString;
    w.i("MicroMsg.BackupSvrIdScene", "init sessionName:%s", new Object[] { paramString });
    this.jRz.jYk = new LinkedList();
    this.jRz.jYl = new LinkedList();
    this.jRz.jYm = new LinkedList();
    paramString = paramHashMap.keySet().iterator();
    while (paramString.hasNext())
    {
      parama = (a.c)paramHashMap.get((Long)paramString.next());
      this.jRz.jYk.add(Long.valueOf(parama.jPu));
      this.jRz.jYl.add(parama.jPv);
      this.jRz.jYm.add(parama.fwU);
    }
    GMTrace.o(9510265552896L, 70857);
  }
  
  public final a aeP()
  {
    GMTrace.i(9510533988352L, 70859);
    ag localag = this.jRA;
    GMTrace.o(9510533988352L, 70859);
    return localag;
  }
  
  public final a aeQ()
  {
    GMTrace.i(9510668206080L, 70860);
    af localaf = this.jRz;
    GMTrace.o(9510668206080L, 70860);
    return localaf;
  }
  
  public final void aeR()
  {
    GMTrace.i(9510802423808L, 70861);
    w.i("MicroMsg.BackupSvrIdScene", "onSceneEnd");
    g(0, 0, "success");
    this.jRB.x(this.jRA.jYk);
    GMTrace.o(9510802423808L, 70861);
  }
  
  public final int getType()
  {
    GMTrace.i(9510399770624L, 70858);
    GMTrace.o(9510399770624L, 70858);
    return 13;
  }
  
  public static abstract interface a
  {
    public abstract void x(LinkedList<Long> paramLinkedList);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/backup/f/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */