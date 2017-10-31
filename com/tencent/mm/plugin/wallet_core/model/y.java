package com.tencent.mm.plugin.wallet_core.model;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ac.d.a;
import com.tencent.mm.platformtools.n;
import com.tencent.mm.protocal.c.bu;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.bh;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.wallet_core.ui.e;
import com.tencent.mm.wallet_core.ui.e.a;
import com.tencent.mm.wallet_core.ui.e.c;
import com.tencent.mm.x.bp.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

public final class y
{
  public static ArrayList<i> lHv;
  private static y rQS;
  bp.a kJS;
  
  static
  {
    GMTrace.i(6871813455872L, 51199);
    rQS = null;
    lHv = null;
    GMTrace.o(6871813455872L, 51199);
  }
  
  private y()
  {
    GMTrace.i(6870873931776L, 51192);
    this.kJS = new bp.a()
    {
      public final void a(d.a paramAnonymousa)
      {
        GMTrace.i(6901878226944L, 51423);
        paramAnonymousa = n.a(paramAnonymousa.hme.tvq);
        w.i("MicroMsg.WalletPushNotifyManager", "PayMsg:" + paramAnonymousa);
        paramAnonymousa = bh.p(paramAnonymousa, "sysmsg");
        int j = bg.getInt((String)paramAnonymousa.get(".sysmsg.paymsg.PayMsgType"), -1);
        Object localObject = y.this;
        int i;
        if (paramAnonymousa == null)
        {
          w.w("MicroMsg.WalletPushNotifyManager", "hy: log is null. handle failed");
          i = 1;
        }
        for (;;)
        {
          if (i == 0) {
            y.e(j, paramAnonymousa);
          }
          GMTrace.o(6901878226944L, 51423);
          return;
          if (j < 0)
          {
            w.w("MicroMsg.WalletPushNotifyManager", "hy: paymsgtype error. maybe not found in xml");
            i = 1;
          }
          else if (j == 12)
          {
            i = bg.getInt((String)paramAnonymousa.get(".sysmsg.paymsg.avail_balance"), -1);
            long l = bg.getLong((String)paramAnonymousa.get(".sysmsg.paymsg.balance_version"), -1L);
            localObject = new y.3((y)localObject, bg.getLong((String)paramAnonymousa.get(".sysmsg.paymsg.time_out"), 7200L), l, i, j, paramAnonymousa);
            e.a(new String[] { "wallet_balance_version", "wallet_balance_last_update_time", "wallet_balance" }, (e.a)localObject);
            i = 1;
          }
          else
          {
            i = 0;
          }
        }
      }
    };
    GMTrace.o(6870873931776L, 51192);
  }
  
  public static boolean a(i parami)
  {
    GMTrace.i(6871142367232L, 51194);
    if (parami == null)
    {
      w.e("MicroMsg.WalletPushNotifyManager", "hy: the callback for registering is null. register failed");
      GMTrace.o(6871142367232L, 51194);
      return false;
    }
    if (lHv == null) {
      lHv = new ArrayList();
    }
    lHv.add(parami);
    GMTrace.o(6871142367232L, 51194);
    return true;
  }
  
  public static boolean b(i parami)
  {
    GMTrace.i(6871276584960L, 51195);
    if (lHv == null)
    {
      w.e("MicroMsg.WalletPushNotifyManager", "hy: callback pool is null. release failed");
      GMTrace.o(6871276584960L, 51195);
      return false;
    }
    lHv.remove(parami);
    GMTrace.o(6871276584960L, 51195);
    return true;
  }
  
  public static y bwO()
  {
    GMTrace.i(6871008149504L, 51193);
    if (rQS == null) {
      rQS = new y();
    }
    y localy = rQS;
    GMTrace.o(6871008149504L, 51193);
    return localy;
  }
  
  public static void e(int paramInt, final Map<String, String> paramMap)
  {
    GMTrace.i(16034052440064L, 119463);
    af.u(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(6885906317312L, 51304);
        if (y.lHv != null)
        {
          Iterator localIterator = y.lHv.iterator();
          while (localIterator.hasNext())
          {
            i locali = (i)localIterator.next();
            if (locali != null) {
              locali.qb(this.rQU);
            }
          }
        }
        GMTrace.o(6885906317312L, 51304);
      }
    });
    GMTrace.o(16034052440064L, 119463);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/wallet_core/model/y.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */