package com.tencent.mm.plugin.walletlock.fingerprint.a;

import android.content.SharedPreferences;
import android.os.Bundle;
import com.tencent.d.b.a;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ac.k;
import com.tencent.mm.ac.n;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;

public final class c
  implements com.tencent.mm.ac.e, d
{
  private String lZf;
  public boolean oFe;
  public d.a seU;
  private d.a seV;
  private boolean seW;
  
  public c()
  {
    GMTrace.i(20264595226624L, 150983);
    this.seU = null;
    this.seV = null;
    this.lZf = null;
    this.seW = false;
    this.oFe = false;
    GMTrace.o(20264595226624L, 150983);
  }
  
  public static void dS(String paramString1, String paramString2)
  {
    GMTrace.i(20264997879808L, 150986);
    paramString1 = new e(paramString1, paramString2);
    com.tencent.mm.kernel.h.wT().a(paramString1, 0);
    GMTrace.o(20264997879808L, 150986);
  }
  
  private void jd(boolean paramBoolean)
  {
    GMTrace.i(20264863662080L, 150985);
    w.i("MicroMsg.FingerprintLockOpenDelegate", "alvinluo prepareAuthKey isNeedChangeAuthKey: %b", new Object[] { Boolean.valueOf(paramBoolean) });
    com.tencent.d.b.a.b local1 = new com.tencent.d.b.a.b() {};
    if (this.seW) {}
    for (Object localObject = null;; localObject = new g(this.lZf))
    {
      a.a(local1, paramBoolean, 3, (com.tencent.d.b.e.e)localObject, new com.tencent.mm.plugin.soter.b.e());
      GMTrace.o(20264863662080L, 150985);
      return;
    }
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(20265400532992L, 150989);
    w.i("MicroMsg.FingerprintLockOpenDelegate", "alvinluo fingerprint wallet lock open delegate errType: %d, errCode: %d, errMsg: %s, cgi type: %d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString, Integer.valueOf(paramk.getType()) });
    if (this.oFe)
    {
      GMTrace.o(20265400532992L, 150989);
      return;
    }
    if ((paramk instanceof e))
    {
      if ((paramInt1 == 0) && (paramInt2 == 0))
      {
        paramString = (e)paramk;
        paramk = paramString.lZc;
        com.tencent.mm.plugin.walletlock.b.g.sgO.sgP = paramk;
        jd(paramString.seZ);
        GMTrace.o(20265400532992L, 150989);
        return;
      }
      if (this.seU != null)
      {
        this.seU.R(7, "get challenge failed");
        GMTrace.o(20265400532992L, 150989);
      }
    }
    else if ((paramk instanceof f))
    {
      if ((paramInt1 == 0) && (paramInt2 == 0))
      {
        com.tencent.mm.plugin.walletlock.b.h.ji(true);
        if (this.seV != null)
        {
          this.seV.R(0, "open touch lock ok");
          GMTrace.o(20265400532992L, 150989);
        }
      }
      else
      {
        com.tencent.mm.plugin.walletlock.b.h.ji(false);
        if (this.seV != null) {
          this.seV.R(6, "open touch lock failed");
        }
      }
    }
    GMTrace.o(20265400532992L, 150989);
  }
  
  public final void a(final d.a parama, Bundle paramBundle)
  {
    GMTrace.i(20264729444352L, 150984);
    this.lZf = paramBundle.getString("key_pay_passwd");
    this.seW = paramBundle.getBoolean("key_fp_lock_offline_mode");
    w.i("MicroMsg.FingerprintLockOpenDelegate", "alvinluo prepare pwd: %s, isOfflineMode: %b", new Object[] { this.lZf, Boolean.valueOf(this.seW) });
    this.seU = parama;
    this.oFe = false;
    com.tencent.mm.plugin.walletlock.b.g.sgO.sgP = null;
    com.tencent.mm.plugin.walletlock.b.g.sgO.sgQ = null;
    com.tencent.mm.kernel.h.wT().a(1967, this);
    com.tencent.mm.kernel.h.wT().a(1548, this);
    if (this.seW)
    {
      long l = System.currentTimeMillis();
      com.tencent.mm.plugin.walletlock.b.g.sgO.sgP = String.valueOf(l);
      jd(false);
      GMTrace.o(20264729444352L, 150984);
      return;
    }
    parama = ab.bNb();
    if (parama == null)
    {
      if (this.seU != null) {
        this.seU.R(2, "system error");
      }
      GMTrace.o(20264729444352L, 150984);
      return;
    }
    paramBundle = parama.getString("cpu_id", null);
    String str = parama.getString("uid", null);
    w.i("MicroMsg.FingerprintLockOpenDelegate", "alvinluo cpuId: %s, uid: %s", new Object[] { paramBundle, str });
    if ((bg.mZ(paramBundle)) || (bg.mZ(str)))
    {
      com.tencent.mm.plugin.soter.d.b.a(true, true, new com.tencent.mm.plugin.soter.c.e()
      {
        public final void vv(int paramAnonymousInt)
        {
          GMTrace.i(20265668968448L, 150991);
          if (c.this.oFe)
          {
            GMTrace.o(20265668968448L, 150991);
            return;
          }
          if (paramAnonymousInt == 0)
          {
            c.dS(parama.getString("cpu_id", null), parama.getString("uid", null));
            GMTrace.o(20265668968448L, 150991);
            return;
          }
          if (c.this.seU != null) {
            c.this.seU.R(2, "init soter failed");
          }
          GMTrace.o(20265668968448L, 150991);
        }
      });
      GMTrace.o(20264729444352L, 150984);
      return;
    }
    dS(paramBundle, str);
    GMTrace.o(20264729444352L, 150984);
  }
  
  public final void a(d.a parama, String paramString1, String paramString2, String paramString3)
  {
    GMTrace.i(20265132097536L, 150987);
    w.i("MicroMsg.FingerprintLockOpenDelegate", "alvinluo do open fingerprint lock");
    this.seV = parama;
    com.tencent.mm.kernel.h.wT().a(new f(paramString2, paramString3, paramString1), 0);
    GMTrace.o(20265132097536L, 150987);
  }
  
  public final void release()
  {
    GMTrace.i(20265266315264L, 150988);
    w.d("MicroMsg.FingerprintLockOpenDelegate", "alvinluo release open delegate");
    this.seU = null;
    this.seV = null;
    this.oFe = true;
    com.tencent.mm.kernel.h.wT().b(1967, this);
    com.tencent.mm.kernel.h.wT().b(1548, this);
    GMTrace.o(20265266315264L, 150988);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/walletlock/fingerprint/a/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */