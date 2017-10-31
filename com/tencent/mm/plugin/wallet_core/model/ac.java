package com.tencent.mm.plugin.wallet_core.model;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import com.tencent.mm.x.ap;
import com.tencent.mm.x.c;

public final class ac
{
  public int rRn;
  
  public ac()
  {
    GMTrace.i(6909662855168L, 51481);
    this.rRn = 0;
    ap.AS();
    this.rRn = ((Integer)c.xi().get(196660, Integer.valueOf(0))).intValue();
    w.i("MicroMsg.WalletSwitchConfig", "WalletSwitchConfig2 " + this.rRn);
    GMTrace.o(6909662855168L, 51481);
  }
  
  public ac(int paramInt)
  {
    GMTrace.i(6909528637440L, 51480);
    this.rRn = 0;
    ap.AS();
    c.xi().set(196660, Integer.valueOf(paramInt));
    this.rRn = paramInt;
    w.i("MicroMsg.WalletSwitchConfig", "WalletSwitchConfig1 " + paramInt);
    GMTrace.o(6909528637440L, 51480);
  }
  
  public final boolean bwR()
  {
    GMTrace.i(6909797072896L, 51482);
    if ((this.rRn & 0x2) > 0) {}
    for (boolean bool = true;; bool = false)
    {
      w.i("MicroMsg.WalletSwitchConfig", "isMicroPayOn, ret = %s switchBit %s", new Object[] { Boolean.valueOf(bool), Integer.valueOf(this.rRn) });
      GMTrace.o(6909797072896L, 51482);
      return bool;
    }
  }
  
  public final boolean bwS()
  {
    GMTrace.i(6909931290624L, 51483);
    if ((this.rRn & 0x80) > 0) {}
    for (boolean bool = true;; bool = false)
    {
      w.i("MicroMsg.WalletSwitchConfig", "isSupportScanBankCard, ret = %s switchBit %s", new Object[] { Boolean.valueOf(bool), Integer.valueOf(this.rRn) });
      GMTrace.o(6909931290624L, 51483);
      return bool;
    }
  }
  
  public final boolean bwT()
  {
    GMTrace.i(6910065508352L, 51484);
    if ((this.rRn & 0x100) > 0) {}
    for (boolean bool = true;; bool = false)
    {
      w.i("MicroMsg.WalletSwitchConfig", "isSupportTouchPay, ret = %s switchBit %s", new Object[] { Boolean.valueOf(bool), Integer.valueOf(this.rRn) });
      GMTrace.o(6910065508352L, 51484);
      return bool;
    }
  }
  
  public final boolean bwU()
  {
    GMTrace.i(6910199726080L, 51485);
    if ((this.rRn & 0x800) > 0) {}
    for (boolean bool = true;; bool = false)
    {
      w.i("MicroMsg.WalletSwitchConfig", "isSupporSwitchWalletCurrency, ret = %s switchBit %s", new Object[] { Boolean.valueOf(bool), Integer.valueOf(this.rRn) });
      GMTrace.o(6910199726080L, 51485);
      return bool;
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/wallet_core/model/ac.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */