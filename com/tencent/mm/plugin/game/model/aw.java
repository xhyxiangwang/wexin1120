package com.tencent.mm.plugin.game.model;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ac.b;
import com.tencent.mm.ac.b.a;
import com.tencent.mm.ac.b.b;
import com.tencent.mm.ac.k;
import com.tencent.mm.network.j;
import com.tencent.mm.network.p;
import com.tencent.mm.protocal.c.ays;
import com.tencent.mm.protocal.c.ayt;
import com.tencent.mm.sdk.platformtools.w;

public final class aw
  extends k
  implements j
{
  private com.tencent.mm.ac.e gMF;
  final b lnP;
  
  public aw(int paramInt1, int paramInt2)
  {
    GMTrace.i(12618882351104L, 94018);
    w.i("MicroMsg.NetSceneSearchGameList", "offset: %d, limit: %d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    Object localObject = new b.a();
    ((b.a)localObject).hlX = new ays();
    ((b.a)localObject).hlY = new ayt();
    ((b.a)localObject).uri = "/cgi-bin/mmgame-bin/searchgamelist";
    ((b.a)localObject).hlW = 1215;
    ((b.a)localObject).hlZ = 0;
    ((b.a)localObject).hma = 0;
    this.lnP = ((b.a)localObject).DA();
    localObject = (ays)this.lnP.hlU.hmc;
    ((ays)localObject).mFa = paramInt1;
    ((ays)localObject).mFb = paramInt2;
    GMTrace.o(12618882351104L, 94018);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ac.e parame1)
  {
    GMTrace.i(12619016568832L, 94019);
    this.gMF = parame1;
    int i = a(parame, this.lnP, this);
    GMTrace.o(12619016568832L, 94019);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, p paramp, byte[] paramArrayOfByte)
  {
    GMTrace.i(12619150786560L, 94020);
    w.i("MicroMsg.NetSceneSearchGameList", "errType = " + paramInt2 + ", errCode = " + paramInt3);
    this.gMF.a(paramInt2, paramInt3, paramString, this);
    GMTrace.o(12619150786560L, 94020);
  }
  
  public final int getType()
  {
    GMTrace.i(15645894770688L, 116571);
    GMTrace.o(15645894770688L, 116571);
    return 1215;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/game/model/aw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */