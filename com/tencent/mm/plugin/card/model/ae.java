package com.tencent.mm.plugin.card.model;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ac.b;
import com.tencent.mm.ac.b.a;
import com.tencent.mm.ac.b.b;
import com.tencent.mm.ac.b.c;
import com.tencent.mm.ac.k;
import com.tencent.mm.network.j;
import com.tencent.mm.network.p;
import com.tencent.mm.protocal.c.aue;
import com.tencent.mm.protocal.c.yr;
import com.tencent.mm.protocal.c.ys;
import com.tencent.mm.sdk.platformtools.w;
import java.util.LinkedList;

public final class ae
  extends k
  implements j
{
  private final b gMC;
  private com.tencent.mm.ac.e gMF;
  public aue kpH;
  
  public ae(LinkedList<String> paramLinkedList, int paramInt)
  {
    GMTrace.i(18909533044736L, 140887);
    Object localObject = new b.a();
    ((b.a)localObject).hlX = new yr();
    ((b.a)localObject).hlY = new ys();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/getdynamiccardcode";
    ((b.a)localObject).hlW = 1382;
    ((b.a)localObject).hlZ = 0;
    ((b.a)localObject).hma = 0;
    this.gMC = ((b.a)localObject).DA();
    localObject = (yr)this.gMC.hlU.hmc;
    ((yr)localObject).tVt = paramLinkedList;
    ((yr)localObject).scene = paramInt;
    GMTrace.o(18909533044736L, 140887);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ac.e parame1)
  {
    GMTrace.i(18909935697920L, 140890);
    this.gMF = parame1;
    int i = a(parame, this.gMC, this);
    GMTrace.o(18909935697920L, 140890);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, p paramp, byte[] paramArrayOfByte)
  {
    GMTrace.i(18909667262464L, 140888);
    w.i("MicroMsg.NetSceneGetDynamicCardCode", "onGYNetEnd, errType = %d, errCode = %d", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    if ((paramInt2 == 0) && (paramInt3 == 0)) {
      this.kpH = ((ys)this.gMC.hlV.hmc).tVu;
    }
    this.gMF.a(paramInt2, paramInt3, paramString, this);
    GMTrace.o(18909667262464L, 140888);
  }
  
  public final int getType()
  {
    GMTrace.i(18909801480192L, 140889);
    GMTrace.o(18909801480192L, 140889);
    return 1382;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/card/model/ae.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */