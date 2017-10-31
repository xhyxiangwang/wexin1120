package com.tencent.mm.plugin.game.model;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ac.b;
import com.tencent.mm.ac.b.a;
import com.tencent.mm.ac.b.b;
import com.tencent.mm.ac.k;
import com.tencent.mm.network.j;
import com.tencent.mm.network.p;
import com.tencent.mm.protocal.c.ue;
import com.tencent.mm.protocal.c.uf;
import com.tencent.mm.sdk.platformtools.w;
import java.util.LinkedList;

public final class am
  extends k
  implements j
{
  private com.tencent.mm.ac.e gMF;
  public final b lnP;
  
  public am(String paramString, LinkedList<String> paramLinkedList1, LinkedList<String> paramLinkedList2, int paramInt)
  {
    GMTrace.i(18029198966784L, 134328);
    Object localObject = new b.a();
    ((b.a)localObject).hlX = new ue();
    ((b.a)localObject).hlY = new uf();
    ((b.a)localObject).uri = "/cgi-bin/mmgame-bin/gamecentersearch";
    ((b.a)localObject).hlW = 1328;
    ((b.a)localObject).hlZ = 0;
    ((b.a)localObject).hma = 0;
    this.lnP = ((b.a)localObject).DA();
    localObject = (ue)this.lnP.hlU.hmc;
    ((ue)localObject).mEm = paramString;
    ((ue)localObject).tSk = paramLinkedList1;
    ((ue)localObject).tSd = paramLinkedList2;
    ((ue)localObject).tSl = paramInt;
    GMTrace.o(18029198966784L, 134328);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ac.e parame1)
  {
    GMTrace.i(12619687657472L, 94024);
    this.gMF = parame1;
    int i = a(parame, this.lnP, this);
    GMTrace.o(12619687657472L, 94024);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, p paramp, byte[] paramArrayOfByte)
  {
    GMTrace.i(12619821875200L, 94025);
    w.i("MicroMsg.NetSceneGameCenterSearch", "errType = " + paramInt2 + ", errCode = " + paramInt3);
    this.gMF.a(paramInt2, paramInt3, paramString, this);
    GMTrace.o(12619821875200L, 94025);
  }
  
  public final int getType()
  {
    GMTrace.i(15646028988416L, 116572);
    GMTrace.o(15646028988416L, 116572);
    return 1328;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/game/model/am.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */