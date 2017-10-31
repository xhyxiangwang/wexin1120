package com.tencent.mm.plugin.game.model;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ac.b;
import com.tencent.mm.ac.b.a;
import com.tencent.mm.ac.b.b;
import com.tencent.mm.ac.k;
import com.tencent.mm.network.j;
import com.tencent.mm.network.p;
import com.tencent.mm.plugin.game.c.af;
import com.tencent.mm.plugin.game.c.ag;
import com.tencent.mm.sdk.platformtools.w;

public final class al
  extends k
  implements j
{
  private com.tencent.mm.ac.e gMF;
  public final b lnP;
  
  public al(String paramString)
  {
    this(paramString, 0, 0);
    GMTrace.i(12594991595520L, 93840);
    GMTrace.o(12594991595520L, 93840);
  }
  
  public al(String paramString, int paramInt1, int paramInt2)
  {
    GMTrace.i(12595125813248L, 93841);
    Object localObject = new b.a();
    ((b.a)localObject).hlX = new af();
    ((b.a)localObject).hlY = new ag();
    ((b.a)localObject).uri = "/cgi-bin/mmgame-bin/gamemsgblock";
    ((b.a)localObject).hlW = 1221;
    ((b.a)localObject).hlZ = 0;
    ((b.a)localObject).hma = 0;
    this.lnP = ((b.a)localObject).DA();
    localObject = (af)this.lnP.hlU.hmc;
    ((af)localObject).mCH = paramString;
    ((af)localObject).mEf = paramInt1;
    ((af)localObject).mEg = paramInt2;
    GMTrace.o(12595125813248L, 93841);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ac.e parame1)
  {
    GMTrace.i(12595260030976L, 93842);
    this.gMF = parame1;
    int i = a(parame, this.lnP, this);
    GMTrace.o(12595260030976L, 93842);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, p paramp, byte[] paramArrayOfByte)
  {
    GMTrace.i(12595394248704L, 93843);
    w.i("MicroMsg.NetSceneGameMsgBlock", "errType = " + paramInt2 + ", errCode = " + paramInt3);
    this.gMF.a(paramInt2, paramInt3, paramString, this);
    GMTrace.o(12595394248704L, 93843);
  }
  
  public final int getType()
  {
    GMTrace.i(15645357899776L, 116567);
    GMTrace.o(15645357899776L, 116567);
    return 1221;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/game/model/al.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */