package com.tencent.mm.wallet_core.c;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;

public final class m
{
  private static long kqZ;
  private static String rNP;
  private static String xgh;
  
  static
  {
    GMTrace.i(1442706358272L, 10749);
    rNP = "";
    kqZ = 0L;
    xgh = "";
    GMTrace.o(1442706358272L, 10749);
  }
  
  public static boolean ciI()
  {
    GMTrace.i(1442437922816L, 10747);
    long l = bg.aE(kqZ);
    w.d("MicroMsg.TimeStampHelper", "pass time " + l);
    if (l > 300L)
    {
      GMTrace.o(1442437922816L, 10747);
      return true;
    }
    GMTrace.o(1442437922816L, 10747);
    return false;
  }
  
  public static String ciJ()
  {
    GMTrace.i(1442572140544L, 10748);
    if (bg.mZ(rNP)) {
      w.i("MicroMsg.TimeStampHelper", "getTimeStamp is null from %s isOverdue %s update_time: %s", new Object[] { xgh, Boolean.valueOf(ciI()), Long.valueOf(kqZ) });
    }
    String str = rNP;
    GMTrace.o(1442572140544L, 10748);
    return str;
  }
  
  public static void setTimeStamp(String paramString)
  {
    GMTrace.i(1442303705088L, 10746);
    rNP = paramString;
    kqZ = System.currentTimeMillis() / 1000L;
    xgh = bg.bOd().toString();
    GMTrace.o(1442303705088L, 10746);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/wallet_core/c/m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */