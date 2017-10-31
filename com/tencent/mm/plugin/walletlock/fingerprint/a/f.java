package com.tencent.mm.plugin.walletlock.fingerprint.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ac.b;
import com.tencent.mm.ac.b.a;
import com.tencent.mm.ac.b.b;
import com.tencent.mm.ac.k;
import com.tencent.mm.network.j;
import com.tencent.mm.network.p;
import com.tencent.mm.protocal.c.aqe;
import com.tencent.mm.protocal.c.aqf;
import com.tencent.mm.sdk.platformtools.w;

public final class f
  extends k
  implements j
{
  private b gMC;
  private com.tencent.mm.ac.e gMF;
  
  public f(String paramString1, String paramString2, String paramString3)
  {
    GMTrace.i(20264192573440L, 150980);
    Object localObject = new b.a();
    ((b.a)localObject).hlX = new aqe();
    ((b.a)localObject).hlY = new aqf();
    ((b.a)localObject).uri = "/cgi-bin/mmpay-bin/opensotertouchlock";
    ((b.a)localObject).hlW = 1967;
    ((b.a)localObject).hlZ = 0;
    ((b.a)localObject).hma = 0;
    this.gMC = ((b.a)localObject).DA();
    localObject = (aqe)this.gMC.hlU.hmc;
    w.d("MicroMsg.NetSceneOpenSoterFingerprintLock", "alvinluo json: %s, signature: %s, token: %s", new Object[] { paramString1, paramString2, paramString3 });
    ((aqe)localObject).umx = paramString1;
    ((aqe)localObject).signature = paramString2;
    ((aqe)localObject).rKT = paramString3;
    GMTrace.o(20264192573440L, 150980);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ac.e parame1)
  {
    GMTrace.i(20264326791168L, 150981);
    this.gMF = parame1;
    int i = a(parame, this.gMC, this);
    GMTrace.o(20264326791168L, 150981);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, p paramp, byte[] paramArrayOfByte)
  {
    GMTrace.i(20264461008896L, 150982);
    w.i("MicroMsg.NetSceneOpenSoterFingerprintLock", "alvinluo open soter fingerprint lock errType: %d, errCode: %d, errMsg: %s", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    if (this.gMF != null) {
      this.gMF.a(paramInt2, paramInt3, paramString, this);
    }
    GMTrace.o(20264461008896L, 150982);
  }
  
  public final int getType()
  {
    GMTrace.i(20264058355712L, 150979);
    GMTrace.o(20264058355712L, 150979);
    return 1967;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/walletlock/fingerprint/a/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */