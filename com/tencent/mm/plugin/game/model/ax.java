package com.tencent.mm.plugin.game.model;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ac.b;
import com.tencent.mm.ac.b.a;
import com.tencent.mm.ac.b.b;
import com.tencent.mm.ac.k;
import com.tencent.mm.network.j;
import com.tencent.mm.network.p;
import com.tencent.mm.plugin.game.c.cf;
import com.tencent.mm.plugin.game.c.cg;
import com.tencent.mm.sdk.platformtools.w;

public final class ax
  extends k
  implements j
{
  private com.tencent.mm.ac.e gMF;
  public final b lnP;
  
  public ax(String paramString1, String paramString2, String paramString3, boolean paramBoolean)
  {
    GMTrace.i(12633243648000L, 94125);
    Object localObject = new b.a();
    ((b.a)localObject).hlX = new cf();
    ((b.a)localObject).hlY = new cg();
    ((b.a)localObject).uri = "/cgi-bin/mmgame-bin/newsubscribenewgame";
    ((b.a)localObject).hlW = 1219;
    ((b.a)localObject).hlZ = 0;
    ((b.a)localObject).hma = 0;
    this.lnP = ((b.a)localObject).DA();
    localObject = (cf)this.lnP.hlU.hmc;
    ((cf)localObject).mCH = paramString1;
    ((cf)localObject).mEm = paramString2;
    ((cf)localObject).mCG = paramString3;
    ((cf)localObject).mCV = paramBoolean;
    GMTrace.o(12633243648000L, 94125);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ac.e parame1)
  {
    GMTrace.i(12633377865728L, 94126);
    this.gMF = parame1;
    int i = a(parame, this.lnP, this);
    GMTrace.o(12633377865728L, 94126);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, p paramp, byte[] paramArrayOfByte)
  {
    GMTrace.i(12633512083456L, 94127);
    w.i("MicroMsg.NetSceneGameSubscription", "errType = " + paramInt2 + ", errCode = " + paramInt3);
    this.gMF.a(paramInt2, paramInt3, paramString, this);
    GMTrace.o(12633512083456L, 94127);
  }
  
  public final int getType()
  {
    GMTrace.i(15646565859328L, 116576);
    GMTrace.o(15646565859328L, 116576);
    return 1219;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/game/model/ax.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */