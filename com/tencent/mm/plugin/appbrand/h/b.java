package com.tencent.mm.plugin.appbrand.h;

import com.tencent.gmtrace.GMTrace;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicInteger;

public final class b
{
  private static AtomicInteger jiI;
  private HashMap<String, a> iVd;
  
  static
  {
    GMTrace.i(17692715122688L, 131821);
    jiI = new AtomicInteger(1);
    GMTrace.o(17692715122688L, 131821);
  }
  
  public b()
  {
    GMTrace.i(10680912576512L, 79579);
    this.iVd = new HashMap();
    GMTrace.o(10680912576512L, 79579);
  }
  
  public static int Yx()
  {
    GMTrace.i(17692178251776L, 131817);
    int i = jiI.incrementAndGet();
    GMTrace.o(17692178251776L, 131817);
    return i;
  }
  
  public static b Yy()
  {
    GMTrace.i(17692312469504L, 131818);
    b localb = a.jiJ;
    GMTrace.o(17692312469504L, 131818);
    return localb;
  }
  
  public final boolean a(String paramString, a parama)
  {
    GMTrace.i(17692580904960L, 131820);
    if (!this.iVd.containsKey(paramString))
    {
      this.iVd.put(paramString, parama);
      GMTrace.o(17692580904960L, 131820);
      return true;
    }
    GMTrace.o(17692580904960L, 131820);
    return false;
  }
  
  public final a qX(String paramString)
  {
    GMTrace.i(17692446687232L, 131819);
    if (this.iVd.containsKey(paramString))
    {
      paramString = (a)this.iVd.get(paramString);
      GMTrace.o(17692446687232L, 131819);
      return paramString;
    }
    GMTrace.o(17692446687232L, 131819);
    return null;
  }
  
  private static final class a
  {
    public static b jiJ;
    
    static
    {
      GMTrace.i(17692849340416L, 131822);
      jiJ = new b();
      GMTrace.o(17692849340416L, 131822);
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/h/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */