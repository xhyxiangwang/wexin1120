package com.tencent.mm.wallet_core.c;

import com.tencent.gmtrace.GMTrace;
import java.util.UUID;

public final class n
{
  private static boolean xgi;
  private static int xgj;
  private static String xgk;
  
  static
  {
    GMTrace.i(16671049777152L, 124209);
    xgi = false;
    xgj = -1;
    xgk = "";
    GMTrace.o(16671049777152L, 124209);
  }
  
  public static void Ec(int paramInt)
  {
    GMTrace.i(16670781341696L, 124207);
    if (!xgi)
    {
      xgi = true;
      xgj = paramInt;
      xgk = UUID.randomUUID().toString();
    }
    GMTrace.o(16670781341696L, 124207);
  }
  
  public static boolean ciK()
  {
    GMTrace.i(16670378688512L, 124204);
    boolean bool = xgi;
    GMTrace.o(16670378688512L, 124204);
    return bool;
  }
  
  public static int ciL()
  {
    GMTrace.i(16670512906240L, 124205);
    int i = xgj;
    GMTrace.o(16670512906240L, 124205);
    return i;
  }
  
  public static String ciM()
  {
    GMTrace.i(16670647123968L, 124206);
    String str = xgk;
    GMTrace.o(16670647123968L, 124206);
    return str;
  }
  
  public static void ciN()
  {
    GMTrace.i(16670915559424L, 124208);
    xgi = false;
    xgj = -1;
    xgk = "";
    GMTrace.o(16670915559424L, 124208);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/wallet_core/c/n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */