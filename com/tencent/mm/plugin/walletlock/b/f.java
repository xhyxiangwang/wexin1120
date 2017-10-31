package com.tencent.mm.plugin.walletlock.b;

import android.os.SystemClock;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.a.rf;
import com.tencent.mm.g.a.sd;
import com.tencent.mm.g.a.sd.a;
import com.tencent.mm.plugin.walletlock.gesture.a.a;
import com.tencent.mm.plugin.walletlock.gesture.a.b;
import com.tencent.mm.plugin.walletlock.gesture.a.d;
import com.tencent.mm.plugin.walletlock.gesture.a.e;
import com.tencent.mm.plugin.walletlock.gesture.ui.GestureGuardLogicUI;
import com.tencent.mm.sdk.platformtools.w;
import java.lang.ref.WeakReference;

public final class f
{
  public com.tencent.mm.sdk.b.c sgJ;
  public com.tencent.mm.sdk.b.c sgK;
  private com.tencent.mm.sdk.b.c sgL;
  public com.tencent.mm.sdk.b.c sgM;
  
  public f()
  {
    GMTrace.i(20247549575168L, 150856);
    this.sgJ = new c();
    this.sgK = new com.tencent.mm.sdk.b.c() {};
    this.sgL = new com.tencent.mm.sdk.b.c()
    {
      private static boolean a(sd paramAnonymoussd)
      {
        GMTrace.i(20251978760192L, 150889);
        w.v("MicroMsg.WalletLockInitTask", "alvinluo gestureprotectListener request: %d, verfiyMaskOnCreate: %b, verfiyMaskOnResume: %b", new Object[] { Integer.valueOf(paramAnonymoussd.fQE.fQG), Boolean.valueOf(i.sgS.bzi()), Boolean.valueOf(i.sgS.bzj()) });
        switch (paramAnonymoussd.fQE.fQG)
        {
        }
        for (;;)
        {
          paramAnonymoussd.fQE.activity = null;
          GMTrace.o(20251978760192L, 150889);
          return false;
          long l1;
          long l2;
          if (!(paramAnonymoussd.fQE.activity instanceof GestureGuardLogicUI))
          {
            if (!i.sgS.bzi())
            {
              l1 = d.byD();
              l2 = (SystemClock.elapsedRealtime() - l1) / 1000L;
              if ((l1 == -1L) || (l2 >= a.sfp) || ((b.byM()) && (b.byL())))
              {
                w.d("MicroMsg.WalletLockInitTask", "REQUEST_PROTECT_ME_ONCREATE indicates needs verify.");
                paramAnonymoussd.fQF.data = Integer.valueOf(17);
              }
              else
              {
                w.d("MicroMsg.WalletLockInitTask", "REQUEST_PROTECT_ME_ONCREATE indicates need not verify.");
                paramAnonymoussd.fQF.data = Integer.valueOf(16);
                i.sgS.a(new WeakReference(paramAnonymoussd.fQE.activity));
              }
            }
            else
            {
              w.d("MicroMsg.WalletLockInitTask", "REQUEST_PROTECT_ME_ONCREATE indicates need not verify.");
              paramAnonymoussd.fQF.data = Integer.valueOf(16);
              i.sgS.a(new WeakReference(paramAnonymoussd.fQE.activity));
              i.sgS.jj(false);
            }
          }
          else
          {
            w.d("MicroMsg.WalletLockInitTask", "REQUEST_PROTECT_ME_ONCREATE indicates need not verify.");
            paramAnonymoussd.fQF.data = Integer.valueOf(16);
            continue;
            if (!(paramAnonymoussd.fQE.activity instanceof GestureGuardLogicUI))
            {
              if (i.sgS.bzi())
              {
                w.d("MicroMsg.WalletLockInitTask", "REQUEST_PROTECT_ME_ONRESUME indicates need not verify.");
                i.sgS.jj(false);
                i.sgS.jk(false);
                paramAnonymoussd.fQF.data = Integer.valueOf(16);
              }
              else if (i.sgS.bzj())
              {
                w.d("MicroMsg.WalletLockInitTask", "REQUEST_PROTECT_ME_ONRESUME indicates reenter.");
                i.sgS.jj(false);
                i.sgS.jk(false);
                paramAnonymoussd.fQF.data = Integer.valueOf(18);
              }
              else
              {
                l1 = d.byD();
                l2 = (SystemClock.elapsedRealtime() - l1) / 1000L;
                if (((l1 == -1L) || (l2 >= a.sfp) || (b.byM())) && (b.byL())) {
                  w.d("MicroMsg.WalletLockInitTask", "REQUEST_PROTECT_ME_ONRESUME indicates needs verify.");
                }
                for (paramAnonymoussd.fQF.data = Integer.valueOf(17);; paramAnonymoussd.fQF.data = Integer.valueOf(16))
                {
                  i.sgS.a(new WeakReference(paramAnonymoussd.fQE.activity));
                  break;
                  w.d("MicroMsg.WalletLockInitTask", "REQUEST_PROTECT_ME_ONRESUME indicates need not verify.");
                }
              }
            }
            else
            {
              w.d("MicroMsg.WalletLockInitTask", "REQUEST_PROTECT_ME_ONRESUME indicates need not verify.");
              paramAnonymoussd.fQF.data = Integer.valueOf(16);
              continue;
              i.sgS.bzk();
              continue;
              paramAnonymoussd.fQF.data = Boolean.valueOf(e.byL());
              continue;
              paramAnonymoussd.fQF.data = Boolean.valueOf(b.byM());
            }
          }
        }
      }
    };
    this.sgM = new com.tencent.mm.sdk.b.c() {};
    GMTrace.o(20247549575168L, 150856);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/walletlock/b/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */