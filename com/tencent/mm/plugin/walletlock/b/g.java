package com.tencent.mm.plugin.walletlock.b;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.walletlock.gesture.a.b;
import com.tencent.mm.plugin.walletlock.gesture.a.d;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import com.tencent.mm.storage.w.a;

public enum g
{
  int mType;
  public String sgP;
  public com.tencent.d.a.c.h sgQ;
  
  static
  {
    GMTrace.i(20254260461568L, 150906);
    sgO = new g("instance");
    sgR = new g[] { sgO };
    GMTrace.o(20254260461568L, 150906);
  }
  
  private g()
  {
    GMTrace.i(20252515631104L, 150893);
    this.mType = -1;
    GMTrace.o(20252515631104L, 150893);
  }
  
  public static boolean byA()
  {
    GMTrace.i(20253186719744L, 150898);
    boolean bool = com.tencent.mm.plugin.walletlock.fingerprint.a.a.byA();
    w.i("MicroMsg.WalletLockManager", "isUserSetFingerprintLock: %b", new Object[] { Boolean.valueOf(bool) });
    GMTrace.o(20253186719744L, 150898);
    return bool;
  }
  
  public static void byC()
  {
    GMTrace.i(20253857808384L, 150903);
    d.byC();
    com.tencent.mm.plugin.walletlock.fingerprint.a.a.byC();
    GMTrace.o(20253857808384L, 150903);
  }
  
  public static boolean byL()
  {
    GMTrace.i(20252918284288L, 150896);
    boolean bool = b.byL();
    GMTrace.o(20252918284288L, 150896);
    return bool;
  }
  
  public static boolean bzg()
  {
    GMTrace.i(20253992026112L, 150904);
    if (((com.tencent.mm.plugin.zero.b.a)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.zero.b.a.class)).uz().getInt("TouchLockFunction", 0) == 1) {}
    for (int i = 1; (com.tencent.mm.plugin.soter.c.h.boJ()) && (i == 0); i = 0)
    {
      GMTrace.o(20253992026112L, 150904);
      return true;
    }
    GMTrace.o(20253992026112L, 150904);
    return false;
  }
  
  public static boolean bzh()
  {
    GMTrace.i(20254126243840L, 150905);
    if (((com.tencent.mm.plugin.zero.b.a)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.zero.b.a.class)).uz().getInt("TouchLockFunction", 0) != 1)
    {
      GMTrace.o(20254126243840L, 150905);
      return true;
    }
    GMTrace.o(20254126243840L, 150905);
    return false;
  }
  
  public static void je(boolean paramBoolean)
  {
    GMTrace.i(20253052502016L, 150897);
    w.i("MicroMsg.GestureGuardManager", "alvinluo setUserSetGesturePwd: %b", new Object[] { Boolean.valueOf(paramBoolean) });
    com.tencent.mm.kernel.h.xz().xi().a(w.a.vdt, Boolean.valueOf(paramBoolean));
    com.tencent.mm.kernel.h.xz().xi().kz(true);
    GMTrace.o(20253052502016L, 150897);
  }
  
  public static void jf(boolean paramBoolean)
  {
    GMTrace.i(20253320937472L, 150899);
    com.tencent.mm.plugin.walletlock.fingerprint.a.a.jc(true);
    GMTrace.o(20253320937472L, 150899);
  }
  
  public static void jh(boolean paramBoolean)
  {
    GMTrace.i(20253589372928L, 150901);
    com.tencent.mm.plugin.walletlock.fingerprint.a.a.jc(false);
    if (paramBoolean) {
      com.tencent.mm.plugin.walletlock.fingerprint.a.a.byz();
    }
    GMTrace.o(20253589372928L, 150901);
  }
  
  public final boolean byx()
  {
    GMTrace.i(20253723590656L, 150902);
    boolean bool;
    if (this.mType == 1)
    {
      bool = b.byM();
      GMTrace.o(20253723590656L, 150902);
      return bool;
    }
    if (this.mType == 2)
    {
      w.i("MicroMsg.WalletLockManager", "alvinluo isUserBlockedInFingerprint: %b", new Object[] { Boolean.valueOf(com.tencent.mm.plugin.walletlock.fingerprint.a.a.byB()) });
      bool = com.tencent.mm.plugin.walletlock.fingerprint.a.a.byB();
      GMTrace.o(20253723590656L, 150902);
      return bool;
    }
    GMTrace.o(20253723590656L, 150902);
    return false;
  }
  
  public final int bzf()
  {
    GMTrace.i(20252784066560L, 150895);
    if (this.mType == -1) {
      this.mType = ((Integer)com.tencent.mm.kernel.h.xz().xi().get(w.a.vdq, Integer.valueOf(0))).intValue();
    }
    int i = this.mType;
    GMTrace.o(20252784066560L, 150895);
    return i;
  }
  
  public final void jg(boolean paramBoolean)
  {
    GMTrace.i(20253455155200L, 150900);
    w.i("MicroMsg.WalletLockManager", "alvinluo closeAllWalletLock");
    jh(paramBoolean);
    je(false);
    GMTrace.o(20253455155200L, 150900);
  }
  
  public final void wP(int paramInt)
  {
    GMTrace.i(20252649848832L, 150894);
    w.i("MicroMsg.WalletLockManager", "alvinluo old wallet lock type: %d, new type: %d", new Object[] { Integer.valueOf(this.mType), Integer.valueOf(paramInt) });
    this.mType = paramInt;
    com.tencent.mm.kernel.h.xz().xi().a(w.a.vdq, Integer.valueOf(paramInt));
    com.tencent.mm.kernel.h.xz().xi().kz(true);
    GMTrace.o(20252649848832L, 150894);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/walletlock/b/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */