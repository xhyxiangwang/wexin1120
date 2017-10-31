package com.tencent.mm.plugin.card.sharecard.model;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ac.b;
import com.tencent.mm.ac.b.a;
import com.tencent.mm.ac.b.b;
import com.tencent.mm.ac.b.c;
import com.tencent.mm.ac.k;
import com.tencent.mm.network.j;
import com.tencent.mm.network.p;
import com.tencent.mm.protocal.c.bbp;
import com.tencent.mm.protocal.c.bbq;
import com.tencent.mm.protocal.c.bbr;
import com.tencent.mm.protocal.c.bbz;
import com.tencent.mm.protocal.c.bfe;
import com.tencent.mm.sdk.platformtools.w;
import java.util.LinkedList;

public final class g
  extends k
  implements j
{
  private final b gMC;
  private com.tencent.mm.ac.e gMF;
  public String kpq;
  public int kpr;
  public String kps;
  
  public g(int paramInt1, LinkedList<bbr> paramLinkedList, String paramString1, String paramString2, bbz parambbz, int paramInt2, bfe parambfe)
  {
    GMTrace.i(5070477328384L, 37778);
    Object localObject = new b.a();
    ((b.a)localObject).hlX = new bbp();
    ((b.a)localObject).hlY = new bbq();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/sharecarditem";
    ((b.a)localObject).hlW = 902;
    ((b.a)localObject).hlZ = 0;
    ((b.a)localObject).hma = 0;
    this.gMC = ((b.a)localObject).DA();
    localObject = (bbp)this.gMC.hlU.hmc;
    ((bbp)localObject).utT = paramInt1;
    ((bbp)localObject).hdL = paramLinkedList;
    ((bbp)localObject).utU = paramString1;
    ((bbp)localObject).tUq = paramString2;
    w.i("MicroMsg.NetSceneShareCardItem", "list length is " + paramLinkedList.size());
    ((bbp)localObject).utV = parambbz;
    ((bbp)localObject).fMx = paramInt2;
    ((bbp)localObject).ttd = parambfe;
    GMTrace.o(5070477328384L, 37778);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ac.e parame1)
  {
    GMTrace.i(5070879981568L, 37781);
    this.gMF = parame1;
    int i = a(parame, this.gMC, this);
    GMTrace.o(5070879981568L, 37781);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, p paramp, byte[] paramArrayOfByte)
  {
    GMTrace.i(5070611546112L, 37779);
    w.i("MicroMsg.NetSceneShareCardItem", "onGYNetEnd, cmdType = %d, errType = %d, errCode = %d", new Object[] { Integer.valueOf(902), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    if ((paramInt2 == 0) && (paramInt3 == 0))
    {
      w.i("MicroMsg.NetSceneShareCardItem", "do ShareCardItem netscene success!");
      paramp = (bbq)this.gMC.hlV.hmc;
      if (paramp != null)
      {
        this.kpq = paramp.kpq;
        this.kpr = paramp.kpr;
        this.kps = paramp.kps;
      }
    }
    for (;;)
    {
      this.gMF.a(paramInt2, paramInt3, paramString, this);
      GMTrace.o(5070611546112L, 37779);
      return;
      paramp = (bbq)this.gMC.hlV.hmc;
      if (paramp != null)
      {
        this.kpq = paramp.kpq;
        this.kpr = paramp.kpr;
        this.kps = paramp.kps;
      }
    }
  }
  
  public final int getType()
  {
    GMTrace.i(15361353187328L, 114451);
    GMTrace.o(15361353187328L, 114451);
    return 902;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/card/sharecard/model/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */