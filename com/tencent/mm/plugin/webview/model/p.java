package com.tencent.mm.plugin.webview.model;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ac.b;
import com.tencent.mm.ac.b.a;
import com.tencent.mm.ac.b.b;
import com.tencent.mm.ac.b.c;
import com.tencent.mm.ac.k;
import com.tencent.mm.network.j;
import com.tencent.mm.protocal.c.ahf;
import com.tencent.mm.protocal.c.aix;
import com.tencent.mm.protocal.c.aiy;
import com.tencent.mm.protocal.c.ajk;
import com.tencent.mm.protocal.c.ajl;
import com.tencent.mm.protocal.d;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.v;
import com.tencent.mm.sdk.platformtools.w;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class p
  extends k
  implements j
{
  private final b gMC;
  private com.tencent.mm.ac.e gMF;
  
  public p(List<ajl> paramList)
  {
    GMTrace.i(12000675495936L, 89412);
    Object localObject = new b.a();
    ((b.a)localObject).hlX = new aix();
    ((b.a)localObject).hlY = new aiy();
    ((b.a)localObject).uri = "/cgi-bin/mmux-bin/jslog";
    ((b.a)localObject).hlW = 1803;
    this.gMC = ((b.a)localObject).DA();
    localObject = (aix)this.gMC.hlU.hmc;
    ajk localajk = new ajk();
    localajk.tBR = d.toR;
    localajk.tBS = d.toQ;
    localajk.tBT = d.toT;
    localajk.tBU = d.toU;
    localajk.tBV = v.bMQ();
    localajk.ueE = ((int)(System.currentTimeMillis() / 1000L));
    ((aix)localObject).tuS = localajk;
    ((aix)localObject).tuT.addAll(paramList);
    GMTrace.o(12000675495936L, 89412);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ac.e parame1)
  {
    GMTrace.i(12001078149120L, 89415);
    this.gMF = parame1;
    w.d("MicroMsg.NetSceneJsLog", "doScene");
    int i = a(parame, this.gMC, this);
    GMTrace.o(12001078149120L, 89415);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, com.tencent.mm.network.p paramp, byte[] paramArrayOfByte)
  {
    GMTrace.i(12000809713664L, 89413);
    w.i("MicroMsg.NetSceneJsLog", "onGYNetEnd, netId : " + paramInt1 + " errType :" + paramInt2 + " errCode: " + paramInt3 + " errMsg :" + paramString);
    if ((paramInt2 == 0) && (paramInt3 == 0))
    {
      paramp = (aiy)((b)paramp).hlV.hmc;
      w.i("MicroMsg.NetSceneJsLog", "received InvalidLogList: ");
      paramArrayOfByte = new StringBuilder("{ ");
      if (!bg.bX(paramp.ueq)) {
        break label172;
      }
      paramArrayOfByte.append("{  }");
    }
    for (;;)
    {
      paramArrayOfByte.append(" }");
      w.i("MicroMsg.NetSceneJsLog", paramArrayOfByte.toString());
      paramArrayOfByte = e.a.skQ;
      e.bN(paramp.ueq);
      this.gMF.a(paramInt2, paramInt3, paramString, this);
      GMTrace.o(12000809713664L, 89413);
      return;
      label172:
      Iterator localIterator = paramp.ueq.iterator();
      while (localIterator.hasNext())
      {
        ahf localahf = (ahf)localIterator.next();
        paramArrayOfByte.append(String.format(" { logId(%d), interval(%d) },", new Object[] { Integer.valueOf(localahf.ucA), Integer.valueOf(localahf.ucB) }));
      }
    }
  }
  
  public final int getType()
  {
    GMTrace.i(12000943931392L, 89414);
    GMTrace.o(12000943931392L, 89414);
    return 1803;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/webview/model/p.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */