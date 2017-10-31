package com.tencent.mm.plugin.game.model;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ac.b;
import com.tencent.mm.ac.b.a;
import com.tencent.mm.ac.b.b;
import com.tencent.mm.ac.k;
import com.tencent.mm.network.j;
import com.tencent.mm.network.p;
import com.tencent.mm.plugin.game.c.ap;
import com.tencent.mm.plugin.game.c.aq;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.v;
import com.tencent.mm.sdk.platformtools.w;
import java.util.LinkedList;

public final class as
  extends k
  implements j
{
  private com.tencent.mm.ac.e gMF;
  public final b lnP;
  
  public as(int paramInt1, LinkedList<String> paramLinkedList, int paramInt2, boolean paramBoolean)
  {
    GMTrace.i(12615392690176L, 93992);
    Object localObject = new b.a();
    ((b.a)localObject).hlX = new ap();
    ((b.a)localObject).hlY = new aq();
    ((b.a)localObject).uri = "/cgi-bin/mmgame-bin/newgetlibgamelist";
    ((b.a)localObject).hlW = 1218;
    ((b.a)localObject).hlZ = 0;
    ((b.a)localObject).hma = 0;
    this.lnP = ((b.a)localObject).DA();
    localObject = (ap)this.lnP.hlU.hmc;
    ((ap)localObject).mFa = paramInt1;
    ((ap)localObject).mFb = 15;
    ((ap)localObject).mEm = v.bMQ();
    ((ap)localObject).huS = bg.bOa();
    ((ap)localObject).mFc = paramInt2;
    ((ap)localObject).mEI = paramLinkedList;
    ((ap)localObject).mFd = paramBoolean;
    GMTrace.o(12615392690176L, 93992);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ac.e parame1)
  {
    GMTrace.i(12615526907904L, 93993);
    this.gMF = parame1;
    int i = a(parame, this.lnP, this);
    GMTrace.o(12615526907904L, 93993);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, p paramp, byte[] paramArrayOfByte)
  {
    GMTrace.i(12615661125632L, 93994);
    w.i("MicroMsg.NetSceneGetLibGameList", "errType = " + paramInt2 + ", errCode = " + paramInt3);
    this.gMF.a(paramInt2, paramInt3, paramString, this);
    GMTrace.o(12615661125632L, 93994);
  }
  
  public final int getType()
  {
    GMTrace.i(15645760552960L, 116570);
    GMTrace.o(15645760552960L, 116570);
    return 1218;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/game/model/as.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */