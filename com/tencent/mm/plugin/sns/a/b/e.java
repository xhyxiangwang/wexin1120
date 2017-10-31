package com.tencent.mm.plugin.sns.a.b;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ac.b;
import com.tencent.mm.ac.b.a;
import com.tencent.mm.ac.b.b;
import com.tencent.mm.ac.b.c;
import com.tencent.mm.ac.k;
import com.tencent.mm.kernel.h;
import com.tencent.mm.network.j;
import com.tencent.mm.network.p;
import com.tencent.mm.protocal.c.ajk;
import com.tencent.mm.protocal.c.ajl;
import com.tencent.mm.protocal.c.bg;
import com.tencent.mm.protocal.c.bh;
import com.tencent.mm.protocal.d;
import com.tencent.mm.sdk.platformtools.v;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import com.tencent.mm.storage.w.a;
import java.util.LinkedList;
import java.util.List;

public final class e
  extends k
  implements j
{
  private b gMC;
  public com.tencent.mm.ac.e gMF;
  public List<ajl> pWo;
  
  public e(List<ajl> paramList)
  {
    GMTrace.i(8165001265152L, 60834);
    Object localObject = new b.a();
    this.pWo = paramList;
    ((b.a)localObject).hlX = new bg();
    ((b.a)localObject).hlY = new bh();
    ((b.a)localObject).uri = "/cgi-bin/mmux-bin/adlog";
    ((b.a)localObject).hlW = 1802;
    ((b.a)localObject).hlZ = 0;
    ((b.a)localObject).hma = 0;
    this.gMC = ((b.a)localObject).DA();
    localObject = (bg)this.gMC.hlU.hmc;
    ajk localajk = new ajk();
    localajk.tBR = d.toR;
    localajk.tBS = d.toQ;
    localajk.tBT = d.toT;
    localajk.tBU = d.toU;
    localajk.tBV = v.bMQ();
    localajk.ueE = ((int)(System.currentTimeMillis() / 1000L));
    ((bg)localObject).tuS = localajk;
    while (i < paramList.size())
    {
      ((bg)localObject).tuT.add(paramList.get(i));
      i += 1;
    }
    w.i("MicroMsg.NetSceneAdLog", "report count: " + ((bg)localObject).tuT.size());
    GMTrace.o(8165001265152L, 60834);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ac.e parame1)
  {
    GMTrace.i(8165135482880L, 60835);
    this.gMF = parame1;
    int i = a(parame, this.gMC, this);
    GMTrace.o(8165135482880L, 60835);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, p paramp, byte[] paramArrayOfByte)
  {
    GMTrace.i(8165403918336L, 60837);
    w.d("MicroMsg.NetSceneAdLog", "netId : " + paramInt1 + " errType :" + paramInt2 + " errCode: " + paramInt3 + " errMsg :" + paramString);
    if ((paramInt2 == 0) && (paramInt3 == 0))
    {
      paramInt1 = ((bh)((b)paramp).hlV.hmc).tuU;
      h.xA();
      h.xz().xi().a(w.a.uWd, Integer.valueOf(paramInt1));
    }
    this.gMF.a(paramInt2, paramInt3, paramString, this);
    GMTrace.o(8165403918336L, 60837);
  }
  
  public final int getType()
  {
    GMTrace.i(8165269700608L, 60836);
    GMTrace.o(8165269700608L, 60836);
    return 1802;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/sns/a/b/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */