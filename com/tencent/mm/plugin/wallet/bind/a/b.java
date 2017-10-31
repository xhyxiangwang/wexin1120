package com.tencent.mm.plugin.wallet.bind.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.wallet_core.model.ae;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.wallet_core.c.k;

public final class b
  extends k
{
  private com.tencent.mm.ac.b gMC;
  private com.tencent.mm.ac.e gMF;
  private String rEq;
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ac.e parame1)
  {
    GMTrace.i(7676448735232L, 57194);
    this.gMF = parame1;
    int i = a(parame, this.gMC, this);
    GMTrace.o(7676448735232L, 57194);
    return i;
  }
  
  public final void e(int paramInt1, int paramInt2, String paramString, com.tencent.mm.network.p paramp)
  {
    GMTrace.i(7676180299776L, 57192);
    w.d("MicroMsg.NetSceneSetMainBankCard", "errType:" + paramInt1 + ",errCode:" + paramInt2 + ",errMsg" + paramString);
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      com.tencent.mm.plugin.wallet.a.p.bvm();
      com.tencent.mm.plugin.wallet.a.p.bvn();
      ae.Js(this.rEq);
    }
    this.gMF.a(paramInt1, paramInt2, paramString, this);
    GMTrace.o(7676180299776L, 57192);
  }
  
  public final int getType()
  {
    GMTrace.i(7676314517504L, 57193);
    GMTrace.o(7676314517504L, 57193);
    return 621;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/wallet/bind/a/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */