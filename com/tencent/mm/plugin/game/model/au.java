package com.tencent.mm.plugin.game.model;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ac.b;
import com.tencent.mm.ac.b.a;
import com.tencent.mm.ac.b.b;
import com.tencent.mm.ac.b.c;
import com.tencent.mm.ac.k;
import com.tencent.mm.network.j;
import com.tencent.mm.network.p;
import com.tencent.mm.protocal.c.afp;
import com.tencent.mm.protocal.c.afq;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.v;
import com.tencent.mm.sdk.platformtools.w;

public final class au
  extends k
  implements j
{
  private String appId;
  private com.tencent.mm.ac.e gMF;
  final b lnP;
  
  public au(String paramString)
  {
    GMTrace.i(18031346450432L, 134344);
    Object localObject = new b.a();
    ((b.a)localObject).hlX = new afp();
    ((b.a)localObject).hlY = new afq();
    ((b.a)localObject).uri = "/cgi-bin/mmgame-bin/gethvgamemenu";
    ((b.a)localObject).hlW = 1369;
    ((b.a)localObject).hlZ = 0;
    ((b.a)localObject).hma = 0;
    this.appId = paramString;
    this.lnP = ((b.a)localObject).DA();
    localObject = (afp)this.lnP.hlU.hmc;
    ((afp)localObject).mEm = v.bMQ();
    ((afp)localObject).huS = bg.bOa();
    ((afp)localObject).mDD = paramString;
    w.i("MicroMsg.NetSceneHVGameGetMenu", "lang=%s, country=%s, appid=%s", new Object[] { ((afp)localObject).mEm, ((afp)localObject).huS, ((afp)localObject).mDD });
    GMTrace.o(18031346450432L, 134344);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ac.e parame1)
  {
    GMTrace.i(18031749103616L, 134347);
    this.gMF = parame1;
    int i = a(parame, this.lnP, this);
    GMTrace.o(18031749103616L, 134347);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, p paramp, byte[] paramArrayOfByte)
  {
    GMTrace.i(18031480668160L, 134345);
    w.i("MicroMsg.NetSceneHVGameGetMenu", "errType = " + paramInt2 + ", errCode = " + paramInt3 + ", errMsg = " + paramString);
    if ((paramInt2 != 0) || (paramInt3 != 0))
    {
      this.gMF.a(paramInt2, paramInt3, paramString, this);
      GMTrace.o(18031480668160L, 134345);
      return;
    }
    if ((afq)((b)paramp).hlV.hmc == null)
    {
      this.gMF.a(paramInt2, paramInt3, paramString, this);
      GMTrace.o(18031480668160L, 134345);
      return;
    }
    this.gMF.a(paramInt2, paramInt3, paramString, this);
    GMTrace.o(18031480668160L, 134345);
  }
  
  public final int getType()
  {
    GMTrace.i(18031614885888L, 134346);
    GMTrace.o(18031614885888L, 134346);
    return 1369;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/game/model/au.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */