package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ac.b.a;
import com.tencent.mm.ac.b.b;
import com.tencent.mm.ac.b.c;
import com.tencent.mm.ac.k;
import com.tencent.mm.network.j;
import com.tencent.mm.network.p;
import com.tencent.mm.protocal.c.zn;
import com.tencent.mm.protocal.c.zo;
import com.tencent.mm.protocal.k.e;
import com.tencent.mm.sdk.platformtools.w;

public final class b
  extends k
  implements j
{
  public String fHI;
  private com.tencent.mm.ac.b gMC;
  private com.tencent.mm.ac.e gMF;
  
  public b(String paramString1, String paramString2, String paramString3)
  {
    GMTrace.i(8218554138624L, 61233);
    Object localObject = new b.a();
    ((b.a)localObject).hlX = new zn();
    ((b.a)localObject).hlY = new zo();
    ((b.a)localObject).uri = "/cgi-bin/mmgame-bin/getgamecanvasinfo";
    ((b.a)localObject).hlW = 1337;
    this.gMC = ((b.a)localObject).DA();
    localObject = (zn)this.gMC.hlU.hmc;
    ((zn)localObject).mDD = paramString1;
    ((zn)localObject).tWe = paramString2;
    ((zn)localObject).tWf = paramString3;
    w.i("MicroMsg.NetSceneLandingPagesDynamicUpdate", "Req: shareType:" + paramString2 + " sharedAppId :" + paramString1);
    GMTrace.o(8218554138624L, 61233);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ac.e parame1)
  {
    GMTrace.i(8218822574080L, 61235);
    this.gMF = parame1;
    int i = a(parame, this.gMC, this);
    GMTrace.o(8218822574080L, 61235);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, p paramp, byte[] paramArrayOfByte)
  {
    GMTrace.i(8218956791808L, 61236);
    w.i("MicroMsg.NetSceneLandingPagesDynamicUpdate", "netId : " + paramInt1 + " errType :" + paramInt2 + " errCode: " + paramInt3 + " errMsg :" + paramString);
    paramArrayOfByte = (zo)((com.tencent.mm.ac.b)paramp).hlV.hmc;
    if (paramp.Ba().tpN != 0)
    {
      this.gMF.a(paramInt2, paramInt3, paramString, this);
      GMTrace.o(8218956791808L, 61236);
      return;
    }
    this.fHI = paramArrayOfByte.tTt;
    this.gMF.a(paramInt2, paramInt3, paramString, this);
    GMTrace.o(8218956791808L, 61236);
  }
  
  public final int getType()
  {
    GMTrace.i(8218688356352L, 61234);
    GMTrace.o(8218688356352L, 61234);
    return 1337;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/a/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */