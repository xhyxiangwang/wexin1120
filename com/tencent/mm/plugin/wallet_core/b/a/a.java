package com.tencent.mm.plugin.wallet_core.b.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ac.b;
import com.tencent.mm.ac.b.a;
import com.tencent.mm.ac.b.b;
import com.tencent.mm.ac.b.c;
import com.tencent.mm.ac.k;
import com.tencent.mm.network.j;
import com.tencent.mm.network.p;
import com.tencent.mm.protocal.c.aqz;
import com.tencent.mm.protocal.c.ara;
import com.tencent.mm.sdk.platformtools.w;

public final class a
  extends k
  implements j
{
  private b gMC;
  private com.tencent.mm.ac.e gMF;
  
  public a(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, String paramString7)
  {
    GMTrace.i(19316615413760L, 143920);
    Object localObject = new b.a();
    ((b.a)localObject).hlX = new aqz();
    ((b.a)localObject).hlY = new ara();
    ((b.a)localObject).uri = "/cgi-bin/mmpay-bin/payibgcheckjsapisign";
    ((b.a)localObject).hlW = 1767;
    ((b.a)localObject).hlZ = 0;
    ((b.a)localObject).hma = 0;
    this.gMC = ((b.a)localObject).DA();
    localObject = (aqz)this.gMC.hlU.hmc;
    ((aqz)localObject).mDD = paramString1;
    ((aqz)localObject).tIp = paramString4;
    ((aqz)localObject).tIo = paramString2;
    ((aqz)localObject).tIq = paramString5;
    ((aqz)localObject).tIr = paramString6;
    ((aqz)localObject).tzN = paramString3;
    ((aqz)localObject).tHE = paramString7;
    GMTrace.o(19316615413760L, 143920);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ac.e parame1)
  {
    GMTrace.i(19317018066944L, 143923);
    this.gMF = parame1;
    int i = a(parame, this.gMC, this);
    GMTrace.o(19317018066944L, 143923);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, p paramp, byte[] paramArrayOfByte)
  {
    GMTrace.i(19316749631488L, 143921);
    w.i("MicroMsg.NetSceneIbgCheckJsapi", "check jsapi: errType: %d, errCode: %d, errMsg: %s", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    paramArrayOfByte = (ara)((b)paramp).hlV.hmc;
    paramInt1 = paramInt3;
    paramp = paramString;
    if (paramInt3 == 0)
    {
      paramInt1 = paramInt3;
      paramp = paramString;
      if (paramInt2 == 0)
      {
        paramInt1 = paramArrayOfByte.lpk;
        paramp = paramArrayOfByte.lpl;
      }
    }
    this.gMF.a(paramInt2, paramInt1, paramp, this);
    GMTrace.o(19316749631488L, 143921);
  }
  
  public final int getType()
  {
    GMTrace.i(19316883849216L, 143922);
    GMTrace.o(19316883849216L, 143922);
    return 1767;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/wallet_core/b/a/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */