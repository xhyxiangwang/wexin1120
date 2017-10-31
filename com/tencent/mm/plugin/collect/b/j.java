package com.tencent.mm.plugin.collect.b;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ac.b;
import com.tencent.mm.ac.b.a;
import com.tencent.mm.ac.b.c;
import com.tencent.mm.ac.k;
import com.tencent.mm.network.p;
import com.tencent.mm.protocal.c.jt;
import com.tencent.mm.protocal.c.ju;
import com.tencent.mm.sdk.platformtools.w;

public final class j
  extends k
  implements com.tencent.mm.network.j
{
  private com.tencent.mm.ac.e gMF;
  private b hMN;
  public ju kKv;
  
  public j()
  {
    GMTrace.i(17427903545344L, 129848);
    b.a locala = new b.a();
    locala.hlX = new jt();
    locala.hlY = new ju();
    locala.hlW = 1256;
    locala.uri = "/cgi-bin/mmpay-bin/f2fannounce";
    locala.hlZ = 0;
    locala.hma = 0;
    this.hMN = locala.DA();
    w.d("MicroMsg.NetSceneF2fAnnouce", "do cgi");
    GMTrace.o(17427903545344L, 129848);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ac.e parame1)
  {
    GMTrace.i(17428171980800L, 129850);
    this.gMF = parame1;
    int i = a(parame, this.hMN, this);
    GMTrace.o(17428171980800L, 129850);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, p paramp, byte[] paramArrayOfByte)
  {
    GMTrace.i(17428306198528L, 129851);
    w.i("MicroMsg.NetSceneF2fAnnouce", "errType: %d, errCode: %d, errMsg: %s", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    this.kKv = ((ju)((b)paramp).hlV.hmc);
    if (this.gMF != null) {
      this.gMF.a(paramInt2, paramInt3, paramString, this);
    }
    GMTrace.o(17428306198528L, 129851);
  }
  
  public final int getType()
  {
    GMTrace.i(17428037763072L, 129849);
    GMTrace.o(17428037763072L, 129849);
    return 1256;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/collect/b/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */