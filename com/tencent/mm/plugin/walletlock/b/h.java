package com.tencent.mm.plugin.walletlock.b;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.sdk.platformtools.w;

public final class h
{
  public static void dA(int paramInt1, int paramInt2)
  {
    GMTrace.i(20249562841088L, 150871);
    switch (paramInt2)
    {
    default: 
      paramInt1 = -1;
    }
    for (;;)
    {
      if (paramInt1 != -1)
      {
        w.i("MicroMsg.WalletLockReportManager", "alvinluo wallet lock idkey report id: %d, key: %d, value: %d", new Object[] { Integer.valueOf(713), Integer.valueOf(paramInt1), Long.valueOf(1L) });
        g.paX.a(713L, paramInt1, 1L, false);
      }
      GMTrace.o(20249562841088L, 150871);
      return;
      if (paramInt1 == 3)
      {
        paramInt1 = 4;
        continue;
        paramInt1 = 5;
        continue;
        paramInt1 = 6;
      }
      else
      {
        paramInt1 = -1;
      }
    }
  }
  
  public static void ji(boolean paramBoolean)
  {
    GMTrace.i(20249697058816L, 150872);
    w.i("MicroMsg.WalletLockReportManager", "alvinluo idkey fingerprint open result: %b", new Object[] { Boolean.valueOf(paramBoolean) });
    g localg = g.paX;
    if (paramBoolean) {}
    for (long l = 0L;; l = 1L)
    {
      localg.a(713L, l, 1L, false);
      GMTrace.o(20249697058816L, 150872);
      return;
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/walletlock/b/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */