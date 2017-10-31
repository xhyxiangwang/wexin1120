package com.tencent.mm.plugin.appbrand;

import android.support.v4.e.a;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.bg;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

public final class j
{
  private static final Map<String, j> gOl;
  private static final j irN;
  public volatile String irO;
  public final AtomicInteger irP;
  public final AtomicBoolean irQ;
  public int irR;
  
  static
  {
    GMTrace.i(17337709232128L, 129176);
    gOl = new a();
    irN = new j();
    GMTrace.o(17337709232128L, 129176);
  }
  
  private j()
  {
    GMTrace.i(17337038143488L, 129171);
    this.irP = new AtomicInteger();
    this.irQ = new AtomicBoolean(false);
    this.irR = 0;
    GMTrace.o(17337038143488L, 129171);
  }
  
  static j nN(String paramString)
  {
    GMTrace.i(17337172361216L, 129172);
    paramString = nO(paramString);
    GMTrace.o(17337172361216L, 129172);
    return paramString;
  }
  
  private static j nO(String paramString)
  {
    GMTrace.i(18191736635392L, 135539);
    if (bg.mZ(paramString))
    {
      GMTrace.o(18191736635392L, 135539);
      return null;
    }
    synchronized (gOl)
    {
      j localj2 = (j)gOl.get(paramString);
      j localj1 = localj2;
      if (localj2 == null)
      {
        localj1 = new j();
        gOl.put(paramString, localj1);
      }
      GMTrace.o(18191736635392L, 135539);
      return localj1;
    }
  }
  
  private static j nP(String paramString)
  {
    GMTrace.i(18191870853120L, 135540);
    if (bg.mZ(paramString))
    {
      GMTrace.o(18191870853120L, 135540);
      return null;
    }
    synchronized (gOl)
    {
      paramString = (j)gOl.get(paramString);
      GMTrace.o(18191870853120L, 135540);
      return paramString;
    }
  }
  
  public static j nQ(String paramString)
  {
    GMTrace.i(17337440796672L, 129174);
    paramString = nP(paramString);
    if (paramString == null)
    {
      paramString = irN;
      GMTrace.o(17337440796672L, 129174);
      return paramString;
    }
    GMTrace.o(17337440796672L, 129174);
    return paramString;
  }
  
  public static j nR(String paramString)
  {
    GMTrace.i(17337575014400L, 129175);
    paramString = nO(paramString);
    GMTrace.o(17337575014400L, 129175);
    return paramString;
  }
  
  static void remove(String paramString)
  {
    GMTrace.i(17337306578944L, 129173);
    if (bg.mZ(paramString))
    {
      GMTrace.o(17337306578944L, 129173);
      return;
    }
    synchronized (gOl)
    {
      gOl.remove(paramString);
      GMTrace.o(17337306578944L, 129173);
      return;
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */