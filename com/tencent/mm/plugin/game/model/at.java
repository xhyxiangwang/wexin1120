package com.tencent.mm.plugin.game.model;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ac.b;
import com.tencent.mm.ac.b.a;
import com.tencent.mm.ac.b.b;
import com.tencent.mm.ac.k;
import com.tencent.mm.network.j;
import com.tencent.mm.network.p;
import com.tencent.mm.plugin.game.c.ar;
import com.tencent.mm.plugin.game.c.as;
import com.tencent.mm.sdk.platformtools.v;
import com.tencent.mm.sdk.platformtools.w;

public final class at
  extends k
  implements j
{
  private com.tencent.mm.ac.e gMF;
  public final b lnP;
  
  public at(int paramInt1, int paramInt2, int paramInt3)
  {
    GMTrace.i(12626666979328L, 94076);
    w.i("MicroMsg.NetSceneGetMoreGameList", "offset: %d, limit: %d, type: %d, cat: %d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(15), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    Object localObject = new b.a();
    ((b.a)localObject).hlX = new ar();
    ((b.a)localObject).hlY = new as();
    ((b.a)localObject).uri = "/cgi-bin/mmgame-bin/newgetmoregamelist";
    ((b.a)localObject).hlW = 1220;
    ((b.a)localObject).hlZ = 0;
    ((b.a)localObject).hma = 0;
    this.lnP = ((b.a)localObject).DA();
    localObject = (ar)this.lnP.hlU.hmc;
    ((ar)localObject).mFa = paramInt1;
    ((ar)localObject).mFb = 15;
    ((ar)localObject).mEm = v.bMQ();
    ((ar)localObject).mFi = paramInt2;
    ((ar)localObject).mFj = paramInt3;
    GMTrace.o(12626666979328L, 94076);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ac.e parame1)
  {
    GMTrace.i(12626801197056L, 94077);
    this.gMF = parame1;
    int i = a(parame, this.lnP, this);
    GMTrace.o(12626801197056L, 94077);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, p paramp, byte[] paramArrayOfByte)
  {
    GMTrace.i(12626935414784L, 94078);
    w.i("MicroMsg.NetSceneGetMoreGameList", "errType = " + paramInt2 + ", errCode = " + paramInt3);
    this.gMF.a(paramInt2, paramInt3, paramString, this);
    GMTrace.o(12626935414784L, 94078);
  }
  
  public final int getType()
  {
    GMTrace.i(15646431641600L, 116575);
    GMTrace.o(15646431641600L, 116575);
    return 1220;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/game/model/at.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */