package com.tencent.mm.plugin.game.model;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ac.b;
import com.tencent.mm.ac.b.a;
import com.tencent.mm.ac.b.b;
import com.tencent.mm.ac.k;
import com.tencent.mm.network.j;
import com.tencent.mm.network.p;
import com.tencent.mm.plugin.game.c.ah;
import com.tencent.mm.plugin.game.c.ai;
import com.tencent.mm.sdk.platformtools.w;

public final class av
  extends k
  implements j
{
  private com.tencent.mm.ac.e gMF;
  private final b lnP;
  
  public av(String paramString1, int paramInt1, int paramInt2, String paramString2, String paramString3)
  {
    GMTrace.i(12614184730624L, 93983);
    Object localObject = new b.a();
    ((b.a)localObject).hlX = new ah();
    ((b.a)localObject).hlY = new ai();
    ((b.a)localObject).uri = "/cgi-bin/mmgame-bin/gamereport";
    ((b.a)localObject).hlW = 1223;
    ((b.a)localObject).hlZ = 0;
    ((b.a)localObject).hma = 0;
    this.lnP = ((b.a)localObject).DA();
    localObject = (ah)this.lnP.hlU.hmc;
    ((ah)localObject).mCH = paramString1;
    ((ah)localObject).mEi = paramInt1;
    ((ah)localObject).mEj = paramInt2;
    ((ah)localObject).mEk = paramString2;
    ((ah)localObject).mEl = paramString3;
    ((ah)localObject).mEh = ((int)(System.currentTimeMillis() / 1000L));
    GMTrace.o(12614184730624L, 93983);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ac.e parame1)
  {
    GMTrace.i(12614453166080L, 93985);
    this.gMF = parame1;
    int i = a(parame, this.lnP, this);
    GMTrace.o(12614453166080L, 93985);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, p paramp, byte[] paramArrayOfByte)
  {
    GMTrace.i(12614587383808L, 93986);
    w.i("MicroMsg.NetSceneGetGameIndex", "errType = " + paramInt2 + ", errCode = " + paramInt3);
    this.gMF.a(paramInt2, paramInt3, paramString, this);
    GMTrace.o(12614587383808L, 93986);
  }
  
  public final int getType()
  {
    GMTrace.i(15645626335232L, 116569);
    GMTrace.o(15645626335232L, 116569);
    return 1223;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/game/model/av.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */