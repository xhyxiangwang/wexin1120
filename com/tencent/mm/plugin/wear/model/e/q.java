package com.tencent.mm.plugin.wear.model.e;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.w;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public final class q
{
  public HashMap<Integer, a> siz;
  
  public q()
  {
    GMTrace.i(9204249133056L, 68577);
    this.siz = new HashMap();
    GMTrace.o(9204249133056L, 68577);
  }
  
  public final void a(a parama)
  {
    GMTrace.i(9204383350784L, 68578);
    Iterator localIterator = parama.bzC().iterator();
    while (localIterator.hasNext())
    {
      int i = ((Integer)localIterator.next()).intValue();
      w.d("MicroMsg.Wear.WearHttpServerLogic", "add funId %d %s", new Object[] { Integer.valueOf(i), parama });
      this.siz.put(Integer.valueOf(i), parama);
    }
    GMTrace.o(9204383350784L, 68578);
  }
  
  public final a wU(int paramInt)
  {
    GMTrace.i(9204517568512L, 68579);
    a locala = (a)this.siz.get(Integer.valueOf(paramInt));
    GMTrace.o(9204517568512L, 68579);
    return locala;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/wear/model/e/q.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */