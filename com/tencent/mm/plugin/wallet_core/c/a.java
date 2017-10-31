package com.tencent.mm.plugin.wallet_core.c;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.wallet_core.model.j;
import com.tencent.mm.sdk.e.e;
import com.tencent.mm.sdk.e.i;

public final class a
  extends i<j>
{
  public static final String[] gMz;
  public e gMB;
  
  static
  {
    GMTrace.i(6913689387008L, 51511);
    gMz = new String[] { i.a(j.gLR, "LoanEntryInfo") };
    GMTrace.o(6913689387008L, 51511);
  }
  
  public a(e parame)
  {
    super(parame, j.gLR, "LoanEntryInfo", null);
    GMTrace.i(6913555169280L, 51510);
    this.gMB = parame;
    GMTrace.o(6913555169280L, 51510);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/wallet_core/c/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */