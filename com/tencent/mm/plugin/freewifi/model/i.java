package com.tencent.mm.plugin.freewifi.model;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ac.b;
import com.tencent.mm.ac.b.a;
import com.tencent.mm.ac.b.b;
import com.tencent.mm.ac.k;
import com.tencent.mm.network.j;
import com.tencent.mm.network.p;
import com.tencent.mm.protocal.c.bn;
import com.tencent.mm.protocal.c.bo;
import com.tencent.mm.sdk.platformtools.w;

public final class i
  extends k
  implements j
{
  private String fKY;
  private final b gMC;
  private com.tencent.mm.ac.e gMF;
  
  private i()
  {
    GMTrace.i(7135417073664L, 53163);
    b.a locala = new b.a();
    locala.hlX = new bn();
    locala.hlY = new bo();
    locala.uri = "/cgi-bin/mmo2o-bin/addcontact";
    locala.hlW = 1703;
    locala.hlZ = 0;
    locala.hma = 0;
    this.gMC = locala.DA();
    GMTrace.o(7135417073664L, 53163);
  }
  
  public i(String paramString1, String paramString2, int paramInt, String paramString3)
  {
    this();
    GMTrace.i(7135551291392L, 53164);
    this.fKY = paramString1;
    bn localbn = (bn)this.gMC.hlU.hmc;
    localbn.mGI = paramString1;
    localbn.mDo = paramString2;
    localbn.tsr = paramInt;
    localbn.tss = paramString3;
    w.i("MicroMsg.FreeWifi.NetSceneAddContact", "appid = %s", new Object[] { paramString1 });
    GMTrace.o(7135551291392L, 53164);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ac.e parame1)
  {
    GMTrace.i(7135953944576L, 53167);
    this.gMF = parame1;
    int i = a(parame, this.gMC, this);
    GMTrace.o(7135953944576L, 53167);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, p paramp, byte[] paramArrayOfByte)
  {
    GMTrace.i(7135685509120L, 53165);
    w.i("MicroMsg.FreeWifi.NetSceneAddContact", "onGYNetEnd : errType : %d, errCode : %d, errMsg : %s, appid = %s", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString, this.fKY });
    if (this.gMF != null) {
      this.gMF.a(paramInt2, paramInt3, paramString, this);
    }
    GMTrace.o(7135685509120L, 53165);
  }
  
  public final int getType()
  {
    GMTrace.i(7135819726848L, 53166);
    GMTrace.o(7135819726848L, 53166);
    return 1703;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/freewifi/model/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */