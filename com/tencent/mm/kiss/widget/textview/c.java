package com.tencent.mm.kiss.widget.textview;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.kiss.widget.textview.a.a;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

public final class c
{
  public static c gTt;
  public ConcurrentHashMap<Integer, b> gTu;
  
  static
  {
    GMTrace.i(430838906880L, 3210);
    gTt = new c();
    GMTrace.o(430838906880L, 3210);
  }
  
  public c()
  {
    GMTrace.i(430167818240L, 3205);
    this.gTu = new ConcurrentHashMap();
    GMTrace.o(430167818240L, 3205);
  }
  
  public static int a(a parama)
  {
    GMTrace.i(430704689152L, 3209);
    int i = parama.hashCode();
    GMTrace.o(430704689152L, 3209);
    return i;
  }
  
  public final f a(a parama, CharSequence paramCharSequence)
  {
    GMTrace.i(430436253696L, 3207);
    if (parama != null)
    {
      parama = (b)this.gTu.get(Integer.valueOf(parama.hashCode()));
      if (parama != null)
      {
        parama = parama.n(paramCharSequence);
        GMTrace.o(430436253696L, 3207);
        return parama;
      }
    }
    GMTrace.o(430436253696L, 3207);
    return null;
  }
  
  public final void a(a parama, f paramf)
  {
    GMTrace.i(430302035968L, 3206);
    if (parama == null)
    {
      GMTrace.o(430302035968L, 3206);
      return;
    }
    b localb = (b)this.gTu.get(Integer.valueOf(parama.hashCode()));
    if (localb != null)
    {
      localb.a(paramf);
      this.gTu.put(Integer.valueOf(parama.hashCode()), localb);
      GMTrace.o(430302035968L, 3206);
      return;
    }
    localb = new b();
    localb.a(paramf);
    this.gTu.put(Integer.valueOf(parama.hashCode()), localb);
    GMTrace.o(430302035968L, 3206);
  }
  
  public final void xO()
  {
    GMTrace.i(430570471424L, 3208);
    Iterator localIterator = this.gTu.values().iterator();
    while (localIterator.hasNext()) {
      ((b)localIterator.next()).gTs.clear();
    }
    this.gTu.clear();
    GMTrace.o(430570471424L, 3208);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/kiss/widget/textview/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */