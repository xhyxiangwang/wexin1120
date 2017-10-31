package com.tencent.mm.modelstat;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ac.b.a;
import com.tencent.mm.ac.b.b;
import com.tencent.mm.ac.b.c;
import com.tencent.mm.ac.k;
import com.tencent.mm.network.j;
import com.tencent.mm.network.p;
import com.tencent.mm.protocal.c.az;
import com.tencent.mm.protocal.c.ba;
import com.tencent.mm.protocal.c.bf;
import com.tencent.mm.sdk.platformtools.w;
import java.util.LinkedList;

public final class h
  extends k
  implements j
{
  private final com.tencent.mm.ac.b gMC;
  private com.tencent.mm.ac.e gPR;
  
  public h(int paramInt1, String paramString, int paramInt2)
  {
    GMTrace.i(1377476542464L, 10263);
    Object localObject = new b.a();
    ((b.a)localObject).hlX = new az();
    ((b.a)localObject).hlY = new ba();
    ((b.a)localObject).uri = "/cgi-bin/mmoc-bin/ad/addatareport";
    ((b.a)localObject).hlW = 1295;
    ((b.a)localObject).hlZ = 0;
    ((b.a)localObject).hma = 0;
    this.gMC = ((b.a)localObject).DA();
    localObject = (az)this.gMC.hlU.hmc;
    bf localbf = new bf();
    localbf.tuP = paramInt1;
    localbf.tuQ = new com.tencent.mm.bl.b(paramString.getBytes());
    localbf.tuR = paramInt2;
    ((az)localObject).tuC.add(localbf);
    w.i("MicroMsg.NetSceneAdDataReport", "init logId:%d, logStr:%s", new Object[] { Integer.valueOf(paramInt1), paramString });
    GMTrace.o(1377476542464L, 10263);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ac.e parame1)
  {
    GMTrace.i(1377879195648L, 10266);
    this.gPR = parame1;
    int i = a(parame, this.gMC, this);
    GMTrace.o(1377879195648L, 10266);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, p paramp, byte[] paramArrayOfByte)
  {
    GMTrace.i(1377610760192L, 10264);
    paramp = (ba)this.gMC.hlV.hmc;
    w.i("MicroMsg.NetSceneAdDataReport", "onGYNetEnd, errType = %d, errCode = %d, ret=%d, msg=%s", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), Integer.valueOf(paramp.ret), paramp.fvk });
    this.gPR.a(paramInt2, paramInt3, paramString, this);
    GMTrace.o(1377610760192L, 10264);
  }
  
  public final int getType()
  {
    GMTrace.i(1377744977920L, 10265);
    GMTrace.o(1377744977920L, 10265);
    return 1295;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/modelstat/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */