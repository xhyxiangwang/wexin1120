package com.tencent.mm.plugin.wallet_core.b.a;

import android.content.Context;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.l;
import com.tencent.mm.ac.b.a;
import com.tencent.mm.ac.b.c;
import com.tencent.mm.network.p;
import com.tencent.mm.protocal.c.ard;
import com.tencent.mm.protocal.c.are;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import com.tencent.mm.storage.w.a;
import com.tencent.mm.wallet_core.c.k;
import com.tencent.mm.x.ap;
import com.tencent.mm.x.c;

public final class b
  extends k
{
  private com.tencent.mm.ac.b gMC;
  private com.tencent.mm.ac.e gMF;
  public String jumpUrl;
  public int rLd;
  
  public b()
  {
    GMTrace.i(7031666769920L, 52390);
    this.rLd = 0;
    b.a locala = new b.a();
    ard localard = new ard();
    ap.AS();
    Object localObject = c.xi().get(w.a.uXE, Boolean.valueOf(false));
    if (localObject != null) {}
    for (boolean bool = ((Boolean)localObject).booleanValue();; bool = false)
    {
      if (bool) {}
      for (int i = 1;; i = 0)
      {
        localard.und = i;
        locala.hlX = localard;
        locala.hlY = new are();
        locala.uri = "/cgi-bin/mmpay-bin/payibggetjumpurl";
        locala.hlW = 1564;
        locala.hlZ = 0;
        locala.hma = 0;
        this.gMC = locala.DA();
        GMTrace.o(7031666769920L, 52390);
        return;
      }
    }
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ac.e parame1)
  {
    GMTrace.i(7032069423104L, 52393);
    this.gMF = parame1;
    int i = a(parame, this.gMC, this);
    GMTrace.o(7032069423104L, 52393);
    return i;
  }
  
  public final void e(int paramInt1, int paramInt2, String paramString, p paramp)
  {
    GMTrace.i(7031800987648L, 52391);
    w.i("MicroMsg.NetSceneIbgPayGetJumpUrl", "hy: get ibg jump url raw net errType: %d, errCode: %d, errMsg: %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
    paramp = (are)((com.tencent.mm.ac.b)paramp).hlV.hmc;
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      w.i("MicroMsg.NetSceneIbgPayGetJumpUrl", "hy: get ibg pay jump url. biz_errcode: %d, biz_errmsg: %s", new Object[] { Integer.valueOf(paramp.lpk), paramp.lpl });
      paramString = paramp.lpl;
      paramInt2 = paramp.lpk;
      this.jumpUrl = paramp.mDg;
      this.rLd = paramp.une;
    }
    for (;;)
    {
      paramp = paramString;
      if (bg.mZ(paramString)) {
        paramp = ab.getContext().getString(R.l.eUe);
      }
      this.gMF.a(paramInt1, paramInt2, paramp, this);
      GMTrace.o(7031800987648L, 52391);
      return;
      w.e("MicroMsg.NetSceneIbgPayGetJumpUrl", "hy: get ibg pay jump url failed");
      this.jumpUrl = null;
    }
  }
  
  public final int getType()
  {
    GMTrace.i(7031935205376L, 52392);
    GMTrace.o(7031935205376L, 52392);
    return 1564;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/wallet_core/b/a/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */