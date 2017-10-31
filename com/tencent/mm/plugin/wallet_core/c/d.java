package com.tencent.mm.plugin.wallet_core.c;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.wallet_core.model.p;
import com.tencent.mm.sdk.e.e;
import com.tencent.mm.sdk.e.i;

public final class d
  extends i<p>
{
  public static final String[] gMz;
  public e gMB;
  
  static
  {
    GMTrace.i(6912481427456L, 51502);
    gMz = new String[] { i.a(p.gLR, "WalletBulletin") };
    GMTrace.o(6912481427456L, 51502);
  }
  
  public d(e parame)
  {
    super(parame, p.gLR, "WalletBulletin", null);
    GMTrace.i(6912347209728L, 51501);
    this.gMB = parame;
    GMTrace.o(6912347209728L, 51501);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/wallet_core/c/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */