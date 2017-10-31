package com.tencent.mm.plugin.appbrand.appcache;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.pluginsdk.j.a.d.l;
import java.util.HashSet;
import java.util.Set;

public final class g
{
  private static final Set<b> iAS;
  
  static
  {
    GMTrace.i(19992938545152L, 148959);
    iAS = new HashSet();
    GMTrace.o(19992938545152L, 148959);
  }
  
  static a a(p paramp)
  {
    GMTrace.i(19992804327424L, 148958);
    for (;;)
    {
      int i;
      synchronized (iAS)
      {
        Object[] arrayOfObject = iAS.toArray();
        int j = arrayOfObject.length;
        i = 0;
        if (i >= j) {
          break;
        }
        ??? = ((b)arrayOfObject[i]).a(paramp);
        if (??? != null)
        {
          GMTrace.o(19992804327424L, 148958);
          return (a)???;
        }
      }
      i += 1;
    }
    GMTrace.o(19992804327424L, 148958);
    return null;
  }
  
  public static void a(b paramb)
  {
    GMTrace.i(19992670109696L, 148957);
    synchronized (iAS)
    {
      iAS.add(paramb);
      GMTrace.o(19992670109696L, 148957);
      return;
    }
  }
  
  public static abstract interface a
  {
    public abstract void Sp();
    
    public abstract void Sq();
    
    public abstract void Sr();
    
    public abstract void Ss();
    
    public abstract void St();
    
    public abstract void a(l paraml);
    
    public abstract void bT(boolean paramBoolean);
    
    public abstract void hL(int paramInt);
  }
  
  public static abstract interface b
  {
    public abstract g.a a(p paramp);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/appcache/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */