package com.tencent.mm.plugin.appbrand.p.e;

import com.tencent.gmtrace.GMTrace;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

public class g
  implements c
{
  private byte[] content;
  private TreeMap<String, String> jym;
  
  public g()
  {
    GMTrace.i(10190346780672L, 75924);
    this.jym = new TreeMap(String.CASE_INSENSITIVE_ORDER);
    GMTrace.o(10190346780672L, 75924);
  }
  
  public final Iterator<String> abr()
  {
    GMTrace.i(10190480998400L, 75925);
    Iterator localIterator = Collections.unmodifiableSet(this.jym.keySet()).iterator();
    GMTrace.o(10190480998400L, 75925);
    return localIterator;
  }
  
  public final byte[] abs()
  {
    GMTrace.i(10190749433856L, 75927);
    byte[] arrayOfByte = this.content;
    GMTrace.o(10190749433856L, 75927);
    return arrayOfByte;
  }
  
  public final void put(String paramString1, String paramString2)
  {
    GMTrace.i(10191017869312L, 75929);
    this.jym.put(paramString1, paramString2);
    GMTrace.o(10191017869312L, 75929);
  }
  
  public final String sk(String paramString)
  {
    GMTrace.i(10190615216128L, 75926);
    paramString = (String)this.jym.get(paramString);
    if (paramString == null)
    {
      GMTrace.o(10190615216128L, 75926);
      return "";
    }
    GMTrace.o(10190615216128L, 75926);
    return paramString;
  }
  
  public final boolean sl(String paramString)
  {
    GMTrace.i(10191152087040L, 75930);
    boolean bool = this.jym.containsKey(paramString);
    GMTrace.o(10191152087040L, 75930);
    return bool;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/p/e/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */