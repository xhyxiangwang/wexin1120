package com.tencent.mm.plugin.appbrand.collector;

import com.tencent.gmtrace.GMTrace;
import java.util.HashSet;
import java.util.Set;

public final class c
{
  private static b iGA;
  private static boolean iGB;
  private static final Set<String> iGC;
  
  static
  {
    GMTrace.i(20006762971136L, 149062);
    iGA = new h();
    iGC = new HashSet();
    GMTrace.o(20006762971136L, 149062);
  }
  
  public static boolean TK()
  {
    GMTrace.i(20004883922944L, 149048);
    boolean bool = iGB;
    GMTrace.o(20004883922944L, 149048);
    return bool;
  }
  
  public static void a(CollectSession paramCollectSession)
  {
    GMTrace.i(20005689229312L, 149054);
    if (paramCollectSession == null)
    {
      GMTrace.o(20005689229312L, 149054);
      return;
    }
    if (!oF(paramCollectSession.groupId))
    {
      GMTrace.o(20005689229312L, 149054);
      return;
    }
    iGA.a(paramCollectSession);
    GMTrace.o(20005689229312L, 149054);
  }
  
  public static CollectSession aL(String paramString1, String paramString2)
  {
    GMTrace.i(20005823447040L, 149055);
    if (!oG(paramString1))
    {
      GMTrace.o(20005823447040L, 149055);
      return null;
    }
    paramString1 = iGA.aL(paramString1, paramString2);
    GMTrace.o(20005823447040L, 149055);
    return paramString1;
  }
  
  public static void aM(String paramString1, String paramString2)
  {
    GMTrace.i(20005555011584L, 149053);
    if (!oG(paramString1))
    {
      GMTrace.o(20005555011584L, 149053);
      return;
    }
    iGA.aM(paramString1, paramString2);
    GMTrace.o(20005555011584L, 149053);
  }
  
  public static int aN(String paramString1, String paramString2)
  {
    GMTrace.i(20006494535680L, 149060);
    if (!oF(paramString1))
    {
      GMTrace.o(20006494535680L, 149060);
      return 0;
    }
    int i = iGA.aN(paramString1, paramString2);
    GMTrace.o(20006494535680L, 149060);
    return i;
  }
  
  public static void bY(boolean paramBoolean)
  {
    GMTrace.i(20004749705216L, 149047);
    iGB = paramBoolean;
    GMTrace.o(20004749705216L, 149047);
  }
  
  public static void c(String paramString1, String paramString2, String paramString3, boolean paramBoolean)
  {
    GMTrace.i(20005420793856L, 149052);
    if (!oF(paramString1))
    {
      GMTrace.o(20005420793856L, 149052);
      return;
    }
    iGA.c(paramString1, paramString2, paramString3, paramBoolean);
    GMTrace.o(20005420793856L, 149052);
  }
  
  public static void clear()
  {
    GMTrace.i(20005286576128L, 149051);
    if (!iGB)
    {
      GMTrace.o(20005286576128L, 149051);
      return;
    }
    iGA.clear();
    GMTrace.o(20005286576128L, 149051);
  }
  
  public static void f(String paramString1, String paramString2, boolean paramBoolean)
  {
    GMTrace.i(20005957664768L, 149056);
    if (!oG(paramString1))
    {
      GMTrace.o(20005957664768L, 149056);
      return;
    }
    iGA.f(paramString1, paramString2, paramBoolean);
    GMTrace.o(20005957664768L, 149056);
  }
  
  public static CollectSession oA(String paramString)
  {
    GMTrace.i(20006226100224L, 149058);
    if (!iGB)
    {
      GMTrace.o(20006226100224L, 149058);
      return null;
    }
    paramString = iGA.oA(paramString);
    GMTrace.o(20006226100224L, 149058);
    return paramString;
  }
  
  public static StringBuilder oB(String paramString)
  {
    GMTrace.i(20006628753408L, 149061);
    if (!oF(paramString))
    {
      paramString = new StringBuilder();
      GMTrace.o(20006628753408L, 149061);
      return paramString;
    }
    paramString = iGA.oB(paramString);
    GMTrace.o(20006628753408L, 149061);
    return paramString;
  }
  
  public static void oC(String paramString)
  {
    GMTrace.i(20004347052032L, 149044);
    if (paramString.length() == 0)
    {
      GMTrace.o(20004347052032L, 149044);
      return;
    }
    iGC.add(paramString);
    GMTrace.o(20004347052032L, 149044);
  }
  
  public static void oD(String paramString)
  {
    GMTrace.i(20004481269760L, 149045);
    if (paramString.length() == 0)
    {
      GMTrace.o(20004481269760L, 149045);
      return;
    }
    iGC.remove(paramString);
    GMTrace.o(20004481269760L, 149045);
  }
  
  public static boolean oE(String paramString)
  {
    GMTrace.i(20004615487488L, 149046);
    if (paramString.length() == 0)
    {
      GMTrace.o(20004615487488L, 149046);
      return false;
    }
    boolean bool = iGC.contains(paramString);
    GMTrace.o(20004615487488L, 149046);
    return bool;
  }
  
  private static boolean oF(String paramString)
  {
    GMTrace.i(20005018140672L, 149049);
    if ((iGB) && (iGC.contains(paramString)))
    {
      GMTrace.o(20005018140672L, 149049);
      return true;
    }
    GMTrace.o(20005018140672L, 149049);
    return false;
  }
  
  private static boolean oG(String paramString)
  {
    GMTrace.i(20005152358400L, 149050);
    if (!iGB)
    {
      GMTrace.o(20005152358400L, 149050);
      return false;
    }
    paramString = iGA.oz(paramString);
    if (paramString == null)
    {
      GMTrace.o(20005152358400L, 149050);
      return false;
    }
    if (!iGC.contains(paramString.groupId))
    {
      GMTrace.o(20005152358400L, 149050);
      return false;
    }
    GMTrace.o(20005152358400L, 149050);
    return true;
  }
  
  public static CollectSession oz(String paramString)
  {
    GMTrace.i(20006091882496L, 149057);
    if (!oG(paramString))
    {
      GMTrace.o(20006091882496L, 149057);
      return null;
    }
    paramString = iGA.oz(paramString);
    GMTrace.o(20006091882496L, 149057);
    return paramString;
  }
  
  public static void print(String paramString)
  {
    GMTrace.i(20006360317952L, 149059);
    if (!oG(paramString))
    {
      GMTrace.o(20006360317952L, 149059);
      return;
    }
    iGA.print(paramString);
    GMTrace.o(20006360317952L, 149059);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/collector/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */