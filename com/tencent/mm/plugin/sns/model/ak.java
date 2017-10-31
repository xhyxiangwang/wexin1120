package com.tencent.mm.plugin.sns.model;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.w;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public final class ak<K, O>
{
  private int maxSize;
  Map<K, ak<K, O>.b<O>> qeq;
  private a qer;
  
  public ak(int paramInt, a parama)
  {
    GMTrace.i(8075343822848L, 60166);
    this.qeq = null;
    this.qer = null;
    this.maxSize = paramInt;
    this.qeq = new HashMap();
    this.qer = parama;
    GMTrace.o(8075343822848L, 60166);
  }
  
  public final void bhL()
  {
    GMTrace.i(8075478040576L, 60167);
    int i;
    if (this.qeq.size() > this.maxSize)
    {
      Object localObject1 = new ArrayList(this.qeq.entrySet());
      Collections.sort((List)localObject1, new Comparator() {});
      i = this.qeq.size() - this.maxSize;
      if (i <= 0)
      {
        GMTrace.o(8075478040576L, 60167);
        return;
      }
      localObject1 = ((ArrayList)localObject1).iterator();
      if (((Iterator)localObject1).hasNext())
      {
        Map.Entry localEntry = (Map.Entry)((Iterator)localObject1).next();
        Object localObject2 = localEntry.getKey();
        if (!this.qer.bo(localObject2)) {
          break label173;
        }
        w.d("MicroMsg.SnsLRUMap", " remove targetKey: " + localEntry.getKey());
        i -= 1;
      }
    }
    label173:
    for (;;)
    {
      if (i <= 0)
      {
        GMTrace.o(8075478040576L, 60167);
        return;
      }
      break;
    }
  }
  
  public static abstract interface a
  {
    public abstract boolean bo(Object paramObject);
  }
  
  public final class b<OO>
  {
    public OO obj;
    public Long qet;
    
    public b()
    {
      GMTrace.i(8142452686848L, 60666);
      Object localObject;
      this.obj = localObject;
      bhM();
      GMTrace.o(8142452686848L, 60666);
    }
    
    public final void bhM()
    {
      GMTrace.i(8142586904576L, 60667);
      this.qet = Long.valueOf(System.currentTimeMillis());
      GMTrace.o(8142586904576L, 60667);
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/sns/model/ak.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */