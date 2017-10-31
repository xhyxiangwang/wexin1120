package com.tencent.mm.plugin.wallet_core.c;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.wallet_core.model.x;
import com.tencent.mm.sdk.e.e;
import com.tencent.mm.sdk.e.i;

public final class h
  extends i<x>
{
  public static final String[] gMz;
  public e gMB;
  
  static
  {
    GMTrace.i(6916642177024L, 51533);
    gMz = new String[] { i.a(x.gLR, "WalletPrefInfo") };
    GMTrace.o(6916642177024L, 51533);
  }
  
  public h(e parame)
  {
    super(parame, x.gLR, "WalletPrefInfo", null);
    GMTrace.i(6916507959296L, 51532);
    this.gMB = parame;
    GMTrace.o(6916507959296L, 51532);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/wallet_core/c/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */