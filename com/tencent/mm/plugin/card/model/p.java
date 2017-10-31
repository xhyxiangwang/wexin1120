package com.tencent.mm.plugin.card.model;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ac.b;
import com.tencent.mm.ac.b.a;
import com.tencent.mm.ac.b.b;
import com.tencent.mm.ac.b.c;
import com.tencent.mm.ac.k;
import com.tencent.mm.network.j;
import com.tencent.mm.protocal.c.aj;
import com.tencent.mm.protocal.c.ak;
import com.tencent.mm.protocal.c.jg;
import com.tencent.mm.sdk.platformtools.w;
import java.util.LinkedList;

public final class p
  extends k
  implements j
{
  private final b gMC;
  private com.tencent.mm.ac.e gMF;
  public String kpq;
  public int kpr;
  public String kps;
  
  public p(LinkedList<jg> paramLinkedList, int paramInt1, String paramString1, String paramString2, int paramInt2)
  {
    GMTrace.i(4912234627072L, 36599);
    Object localObject = new b.a();
    ((b.a)localObject).hlX = new aj();
    ((b.a)localObject).hlY = new ak();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/acceptcardlistfromapp";
    ((b.a)localObject).hlW = 687;
    ((b.a)localObject).hlZ = 0;
    ((b.a)localObject).hma = 0;
    this.gMC = ((b.a)localObject).DA();
    localObject = (aj)this.gMC.hlU.hmc;
    ((aj)localObject).tte = paramLinkedList;
    ((aj)localObject).fMx = paramInt1;
    ((aj)localObject).tta = paramString1;
    ((aj)localObject).tsZ = paramString2;
    ((aj)localObject).ttb = paramInt2;
    GMTrace.o(4912234627072L, 36599);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ac.e parame1)
  {
    GMTrace.i(4912503062528L, 36601);
    this.gMF = parame1;
    int i = a(parame, this.gMC, this);
    GMTrace.o(4912503062528L, 36601);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, com.tencent.mm.network.p paramp, byte[] paramArrayOfByte)
  {
    GMTrace.i(4912637280256L, 36602);
    w.i("MicroMsg.NetSceneGetCardListFromApp", "onGYNetEnd, errType = " + paramInt2 + " errCode = " + paramInt3);
    if ((paramInt2 == 0) && (paramInt3 == 0))
    {
      paramp = (ak)this.gMC.hlV.hmc;
      this.kpq = paramp.kpq;
      this.kpr = paramp.kpr;
      this.kps = paramp.kps;
      w.e("MicroMsg.NetSceneGetCardListFromApp", "onGYNetEnd, ret_code = " + this.kpr + " ret_msg = " + this.kps);
    }
    this.gMF.a(paramInt2, paramInt3, paramString, this);
    GMTrace.o(4912637280256L, 36602);
  }
  
  public final int getType()
  {
    GMTrace.i(4912368844800L, 36600);
    GMTrace.o(4912368844800L, 36600);
    return 687;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/card/model/p.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */