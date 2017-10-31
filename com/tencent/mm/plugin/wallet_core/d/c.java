package com.tencent.mm.plugin.wallet_core.d;

import android.app.Activity;
import android.os.Bundle;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.plugin.wallet_core.model.Orders;
import com.tencent.mm.plugin.wallet_core.model.ae;
import com.tencent.mm.plugin.wallet_core.model.m;
import com.tencent.mm.pluginsdk.wallet.PayInfo;
import com.tencent.mm.wallet_core.a;
import com.tencent.mm.wallet_core.b;

public final class c
{
  public static long rYB;
  public static int rYC;
  public static int rYD;
  public static int rYE;
  
  static
  {
    GMTrace.i(6835843104768L, 50931);
    rYB = 0L;
    rYC = 2;
    rYD = 1;
    rYE = 2;
    GMTrace.o(6835843104768L, 50931);
  }
  
  public static void a(PayInfo paramPayInfo, Orders paramOrders)
  {
    GMTrace.i(6835708887040L, 50930);
    if ((!m.bwE().bwY()) && (paramPayInfo != null) && (paramOrders != null)) {
      g.paX.i(10725, new Object[] { Integer.valueOf(1), Integer.valueOf(paramPayInfo.fIG), Integer.valueOf((int)(paramOrders.rOR * 100.0D)), paramOrders.ori });
    }
    GMTrace.o(6835708887040L, 50930);
  }
  
  public static void b(Activity paramActivity, Bundle paramBundle, int paramInt)
  {
    GMTrace.i(6835440451584L, 50928);
    paramActivity = a.aa(paramActivity);
    if ((!m.bwE().bwY()) && (paramActivity != null) && (paramActivity.ciA()))
    {
      paramActivity = (PayInfo)paramBundle.getParcelable("key_pay_info");
      paramBundle = (Orders)paramBundle.getParcelable("key_orders");
      if ((paramActivity != null) && (paramBundle != null)) {
        g.paX.i(10725, new Object[] { Integer.valueOf(paramInt), Integer.valueOf(paramActivity.fIG), Integer.valueOf((int)(paramBundle.rOR * 100.0D)), paramBundle.ori });
      }
      GMTrace.o(6835440451584L, 50928);
      return;
    }
    if ((!m.bwE().bwY()) && (paramBundle != null) && (paramBundle.getBoolean("key_is_bind_reg_process", false))) {
      g.paX.i(10932, new Object[] { Integer.valueOf(paramInt), Integer.valueOf(paramBundle.getInt("key_bind_scene", 0)) });
    }
    GMTrace.o(6835440451584L, 50928);
  }
  
  public static void byf()
  {
    GMTrace.i(6835172016128L, 50926);
    rYB = System.currentTimeMillis();
    GMTrace.o(6835172016128L, 50926);
  }
  
  public static int byg()
  {
    GMTrace.i(6835306233856L, 50927);
    int i = (int)((System.currentTimeMillis() - rYB) / 1000L);
    GMTrace.o(6835306233856L, 50927);
    return i;
  }
  
  public static void dx(int paramInt1, int paramInt2)
  {
    GMTrace.i(6835574669312L, 50929);
    g.paX.i(10932, new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt1) });
    GMTrace.o(6835574669312L, 50929);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/wallet_core/d/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */