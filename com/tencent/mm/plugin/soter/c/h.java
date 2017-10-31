package com.tencent.mm.plugin.soter.c;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.compatible.d.p;
import com.tencent.mm.compatible.d.r;
import com.tencent.mm.k.e;
import com.tencent.mm.kernel.c;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.x.m;

public final class h
{
  private static String TAG;
  
  static
  {
    GMTrace.i(7099044069376L, 52892);
    TAG = "MicroMsg.SoterUtil";
    GMTrace.o(7099044069376L, 52892);
  }
  
  public static void boG()
  {
    GMTrace.i(7098909851648L, 52891);
    if (bg.getInt(((com.tencent.mm.plugin.zero.b.a)com.tencent.mm.kernel.h.xv().h(com.tencent.mm.plugin.zero.b.a.class)).uz().getValue("SoterEntry"), 0) == 1) {}
    for (boolean bool = true;; bool = false)
    {
      com.tencent.mm.sdk.platformtools.w.i(TAG, "alvinluo dynamic config support soter: %b", new Object[] { Boolean.valueOf(bool) });
      if (bool)
      {
        com.tencent.mm.sdk.platformtools.w.d(TAG, "alvinluo set all soter support flag to true");
        p.gJh.fOs = true;
        p.gJf.gJn = 1;
        p.gJf.gJo = 1;
        com.tencent.mm.sdk.platformtools.w.d(TAG, "alvinluo deviceInfo soter support: %b, force status: %d, allow external: %d", new Object[] { Boolean.valueOf(p.gJh.fOs), Integer.valueOf(p.gJf.gJn), Integer.valueOf(p.gJf.gJo) });
      }
      GMTrace.o(7098909851648L, 52891);
      return;
    }
  }
  
  public static String boH()
  {
    GMTrace.i(18501645369344L, 137848);
    String str = m.zI();
    GMTrace.o(18501645369344L, 137848);
    return str;
  }
  
  public static String boI()
  {
    GMTrace.i(18501779587072L, 137849);
    String str = "WechatAuthKeyPay&" + m.zI();
    GMTrace.o(18501779587072L, 137849);
    return str;
  }
  
  public static boolean boJ()
  {
    GMTrace.i(18998653616128L, 141551);
    boolean bool = ig(true);
    GMTrace.o(18998653616128L, 141551);
    return bool;
  }
  
  public static boolean ig(boolean paramBoolean)
  {
    GMTrace.i(19010464776192L, 141639);
    if ((paramBoolean) && (!p.gJh.fOs))
    {
      com.tencent.mm.sdk.platformtools.w.i(TAG, "hy: dynamic config is not support soter");
      GMTrace.o(19010464776192L, 141639);
      return false;
    }
    paramBoolean = com.tencent.d.b.a.cms();
    GMTrace.o(19010464776192L, 141639);
    return paramBoolean;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/soter/c/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */