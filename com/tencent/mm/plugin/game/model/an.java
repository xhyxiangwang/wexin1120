package com.tencent.mm.plugin.game.model;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ac.b;
import com.tencent.mm.ac.b.a;
import com.tencent.mm.ac.b.b;
import com.tencent.mm.ac.k;
import com.tencent.mm.network.j;
import com.tencent.mm.network.p;
import com.tencent.mm.protocal.c.ub;
import com.tencent.mm.protocal.c.uc;
import com.tencent.mm.sdk.platformtools.w;
import java.util.LinkedList;

public final class an
  extends k
  implements j
{
  public String fum;
  private com.tencent.mm.ac.e gMF;
  public final b lnP;
  
  public an(String paramString1, String paramString2, LinkedList<String> paramLinkedList)
  {
    GMTrace.i(12624922148864L, 94063);
    Object localObject = new b.a();
    ((b.a)localObject).hlX = new ub();
    ((b.a)localObject).hlY = new uc();
    ((b.a)localObject).uri = "/cgi-bin/mmgame-bin/gamecentersearchrecommend";
    ((b.a)localObject).hlW = 1329;
    ((b.a)localObject).hlZ = 0;
    ((b.a)localObject).hma = 0;
    if (paramString2 == null) {}
    for (this.fum = "";; this.fum = paramString2.trim())
    {
      this.lnP = ((b.a)localObject).DA();
      localObject = (ub)this.lnP.hlU.hmc;
      ((ub)localObject).mEm = paramString1;
      ((ub)localObject).tSc = paramString2;
      ((ub)localObject).tSd = paramLinkedList;
      GMTrace.o(12624922148864L, 94063);
      return;
    }
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ac.e parame1)
  {
    GMTrace.i(12625056366592L, 94064);
    this.gMF = parame1;
    int i = a(parame, this.lnP, this);
    GMTrace.o(12625056366592L, 94064);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, p paramp, byte[] paramArrayOfByte)
  {
    GMTrace.i(12625190584320L, 94065);
    w.i("MicroMsg.NetSceneGameSearchRecmd", "errType = " + paramInt2 + ", errCode = " + paramInt3);
    this.gMF.a(paramInt2, paramInt3, paramString, this);
    GMTrace.o(12625190584320L, 94065);
  }
  
  public final int getType()
  {
    GMTrace.i(15646163206144L, 116573);
    GMTrace.o(15646163206144L, 116573);
    return 1329;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/game/model/an.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */