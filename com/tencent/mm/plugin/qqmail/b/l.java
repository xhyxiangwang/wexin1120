package com.tencent.mm.plugin.qqmail.b;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ac.b;
import com.tencent.mm.ac.b.a;
import com.tencent.mm.ac.b.b;
import com.tencent.mm.ac.k;
import com.tencent.mm.network.j;
import com.tencent.mm.network.p;
import com.tencent.mm.protocal.c.lh;
import com.tencent.mm.protocal.c.li;
import com.tencent.mm.protocal.c.np;
import com.tencent.mm.sdk.platformtools.w;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public final class l
  extends k
  implements j
{
  b gMC;
  private com.tencent.mm.ac.e gMF;
  private ArrayList<Long> oFD;
  
  public l(ArrayList<Long> paramArrayList)
  {
    GMTrace.i(5475143778304L, 40793);
    this.oFD = paramArrayList;
    paramArrayList = new b.a();
    paramArrayList.hlX = new lh();
    paramArrayList.hlY = new li();
    paramArrayList.uri = "/cgi-bin/micromsg-bin/checkconversationfile";
    paramArrayList.hlW = 483;
    paramArrayList.hlZ = 0;
    paramArrayList.hma = 0;
    this.gMC = paramArrayList.DA();
    GMTrace.o(5475143778304L, 40793);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ac.e parame1)
  {
    GMTrace.i(5475546431488L, 40796);
    this.gMF = parame1;
    parame1 = (lh)this.gMC.hlU.hmc;
    parame1.jWQ = this.oFD.size();
    LinkedList localLinkedList = new LinkedList();
    Iterator localIterator = this.oFD.iterator();
    while (localIterator.hasNext())
    {
      long l = ((Long)localIterator.next()).longValue();
      np localnp = new np();
      localnp.tvv = l;
      localLinkedList.add(localnp);
      w.i("MicroMsg.NetSceneCheckConversationFile", "MsgId: %d", new Object[] { Long.valueOf(l) });
    }
    parame1.tHG = localLinkedList;
    w.i("MicroMsg.NetSceneCheckConversationFile", "Count = %d, MsgInfoList.size = %d", new Object[] { Integer.valueOf(parame1.jWQ), Integer.valueOf(parame1.tHG.size()) });
    int i = a(parame, this.gMC, this);
    GMTrace.o(5475546431488L, 40796);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, p paramp, byte[] paramArrayOfByte)
  {
    GMTrace.i(5475277996032L, 40794);
    w.i("MicroMsg.NetSceneCheckConversationFile", "onGYNetEnd, netId: %d, errType: %d, errCode: %d, errMsg: %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    if (((paramInt2 != 0) || (paramInt3 != 0)) && (this.gMF != null))
    {
      this.gMF.a(paramInt2, paramInt3, paramString, this);
      GMTrace.o(5475277996032L, 40794);
      return;
    }
    if (this.gMF != null) {
      this.gMF.a(paramInt2, paramInt3, paramString, this);
    }
    GMTrace.o(5475277996032L, 40794);
  }
  
  public final int getType()
  {
    GMTrace.i(5475412213760L, 40795);
    GMTrace.o(5475412213760L, 40795);
    return 483;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/qqmail/b/l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */