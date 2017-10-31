package com.tencent.mm.plugin.walletlock.fingerprint.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ac.b;
import com.tencent.mm.ac.b.a;
import com.tencent.mm.ac.b.b;
import com.tencent.mm.ac.b.c;
import com.tencent.mm.ac.k;
import com.tencent.mm.network.j;
import com.tencent.mm.network.p;
import com.tencent.mm.protocal.c.bhk;
import com.tencent.mm.protocal.c.bhl;
import com.tencent.mm.sdk.platformtools.w;

public final class e
  extends k
  implements j
{
  private b gMC;
  private com.tencent.mm.ac.e gMF;
  String lZc;
  boolean seZ;
  
  public e(String paramString1, String paramString2)
  {
    GMTrace.i(20265803186176L, 150992);
    this.seZ = false;
    Object localObject = new b.a();
    ((b.a)localObject).hlX = new bhk();
    ((b.a)localObject).hlY = new bhl();
    ((b.a)localObject).uri = "/cgi-bin/mmpay-bin/touchlockgetchallenge";
    ((b.a)localObject).hlW = 1548;
    ((b.a)localObject).hlZ = 0;
    ((b.a)localObject).hma = 0;
    this.gMC = ((b.a)localObject).DA();
    localObject = (bhk)this.gMC.hlU.hmc;
    ((bhk)localObject).scene = 1548;
    ((bhk)localObject).qXN = paramString1;
    ((bhk)localObject).qXO = paramString2;
    GMTrace.o(20265803186176L, 150992);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ac.e parame1)
  {
    GMTrace.i(20266071621632L, 150994);
    this.gMF = parame1;
    int i = a(parame, this.gMC, this);
    GMTrace.o(20266071621632L, 150994);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, p paramp, byte[] paramArrayOfByte)
  {
    GMTrace.i(20266205839360L, 150995);
    w.i("MicroMsg.NetSceneGetTouchWalletLockChallenge", "alvinluo get touch wallet lock challenge errType: %d, errCode: %d, errMsg: %s", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    paramp = (bhl)((b)paramp).hlV.hmc;
    this.lZc = paramp.lZc;
    w.d("MicroMsg.NetSceneGetTouchWalletLockChallenge", "alvinluo get touch lock challenge: %s", new Object[] { this.lZc });
    if (paramp.uwF == 1) {}
    for (this.seZ = true;; this.seZ = false)
    {
      if (this.gMF != null) {
        this.gMF.a(paramInt2, paramInt3, paramString, this);
      }
      GMTrace.o(20266205839360L, 150995);
      return;
    }
  }
  
  public final int getType()
  {
    GMTrace.i(20265937403904L, 150993);
    GMTrace.o(20265937403904L, 150993);
    return 1548;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/walletlock/fingerprint/a/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */