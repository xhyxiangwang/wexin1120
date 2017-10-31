package com.tencent.mm.plugin.game.model;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ac.b;
import com.tencent.mm.ac.b.a;
import com.tencent.mm.ac.b.b;
import com.tencent.mm.ac.b.c;
import com.tencent.mm.ac.k;
import com.tencent.mm.network.j;
import com.tencent.mm.network.p;
import com.tencent.mm.plugin.game.c.aj;
import com.tencent.mm.plugin.game.c.ak;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.f;
import com.tencent.mm.sdk.platformtools.v;
import com.tencent.mm.sdk.platformtools.w;

public final class aq
  extends k
  implements j
{
  private com.tencent.mm.ac.e gMF;
  private final b lnP;
  
  public aq()
  {
    GMTrace.i(16559246409728L, 123376);
    Object localObject = new b.a();
    ((b.a)localObject).hlX = new aj();
    ((b.a)localObject).hlY = new ak();
    ((b.a)localObject).uri = "/cgi-bin/mmgame-bin/getgamecenterglobalsetting";
    ((b.a)localObject).hlW = 1311;
    ((b.a)localObject).hlZ = 0;
    ((b.a)localObject).hma = 0;
    this.lnP = ((b.a)localObject).DA();
    localObject = (aj)this.lnP.hlU.hmc;
    ((aj)localObject).mEm = v.bMQ();
    ((aj)localObject).huS = bg.bOa();
    ((aj)localObject).mEn = f.fjU;
    w.i("MicroMsg.NetSceneGetGameGlobalConfig", "lang=%s, country=%s, releaseChannel=%s", new Object[] { ((aj)localObject).mEm, ((aj)localObject).huS, Integer.valueOf(((aj)localObject).mEn) });
    GMTrace.o(16559246409728L, 123376);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ac.e parame1)
  {
    GMTrace.i(16559649062912L, 123379);
    this.gMF = parame1;
    int i = a(parame, this.lnP, this);
    GMTrace.o(16559649062912L, 123379);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, p paramp, byte[] paramArrayOfByte)
  {
    GMTrace.i(16559380627456L, 123377);
    w.i("MicroMsg.NetSceneGetGameGlobalConfig", "errType = " + paramInt2 + ", errCode = " + paramInt3 + ", errMsg = " + paramString);
    if ((paramInt2 != 0) || (paramInt3 != 0))
    {
      this.gMF.a(paramInt2, paramInt3, paramString, this);
      GMTrace.o(16559380627456L, 123377);
      return;
    }
    paramp = (ak)((b)paramp).hlV.hmc;
    if (paramp == null)
    {
      this.gMF.a(paramInt2, paramInt3, paramString, this);
      GMTrace.o(16559380627456L, 123377);
      return;
    }
    SubCoreGameCenter.aFi().a("pb_game_global_config", paramp);
    g.aEh().QK();
    this.gMF.a(paramInt2, paramInt3, paramString, this);
    GMTrace.o(16559380627456L, 123377);
  }
  
  public final int getType()
  {
    GMTrace.i(16559514845184L, 123378);
    GMTrace.o(16559514845184L, 123378);
    return 1311;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/game/model/aq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */