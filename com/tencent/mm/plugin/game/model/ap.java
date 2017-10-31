package com.tencent.mm.plugin.game.model;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ac.b;
import com.tencent.mm.ac.b.a;
import com.tencent.mm.ac.b.b;
import com.tencent.mm.ac.k;
import com.tencent.mm.network.j;
import com.tencent.mm.network.p;
import com.tencent.mm.plugin.game.c.al;
import com.tencent.mm.plugin.game.c.am;
import com.tencent.mm.sdk.platformtools.w;

public final class ap
  extends k
  implements j
{
  private com.tencent.mm.ac.e gMF;
  public final b lnP;
  
  public ap(String paramString1, String paramString2, boolean paramBoolean)
  {
    GMTrace.i(12625727455232L, 94069);
    Object localObject = new b.a();
    ((b.a)localObject).hlX = new al();
    ((b.a)localObject).hlY = new am();
    ((b.a)localObject).uri = "/cgi-bin/mmgame-bin/newgetgamedetail";
    ((b.a)localObject).hlW = 1217;
    ((b.a)localObject).hlZ = 0;
    ((b.a)localObject).hma = 0;
    this.lnP = ((b.a)localObject).DA();
    localObject = (al)this.lnP.hlU.hmc;
    ((al)localObject).mEm = paramString1;
    ((al)localObject).mCH = paramString2;
    ((al)localObject).mEv = paramBoolean;
    ((al)localObject).mEx = true;
    GMTrace.o(12625727455232L, 94069);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ac.e parame1)
  {
    GMTrace.i(12625861672960L, 94070);
    this.gMF = parame1;
    int i = a(parame, this.lnP, this);
    GMTrace.o(12625861672960L, 94070);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, p paramp, byte[] paramArrayOfByte)
  {
    GMTrace.i(12625995890688L, 94071);
    w.i("MicroMsg.NetSceneGetGameDetailNew", "errType = " + paramInt2 + ", errCode = " + paramInt3);
    this.gMF.a(paramInt2, paramInt3, paramString, this);
    GMTrace.o(12625995890688L, 94071);
  }
  
  public final int getType()
  {
    GMTrace.i(15646297423872L, 116574);
    GMTrace.o(15646297423872L, 116574);
    return 1217;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/game/model/ap.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */