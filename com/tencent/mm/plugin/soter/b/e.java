package com.tencent.mm.plugin.soter.b;

import com.tencent.d.b.e.e.b;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ac.k;
import com.tencent.mm.ac.n;
import com.tencent.mm.kernel.h;
import com.tencent.mm.network.j;
import com.tencent.mm.network.p;
import com.tencent.mm.sdk.platformtools.w;

public final class e
  extends k
  implements com.tencent.d.b.e.e, j
{
  private com.tencent.mm.ac.b gMC;
  private com.tencent.mm.ac.e gMF;
  private com.tencent.d.b.e.b<e.b> lZe;
  
  public e()
  {
    GMTrace.i(18495739789312L, 137804);
    this.lZe = null;
    GMTrace.o(18495739789312L, 137804);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ac.e parame1)
  {
    GMTrace.i(18496008224768L, 137806);
    this.gMF = parame1;
    int i = a(parame, this.gMC, this);
    GMTrace.o(18496008224768L, 137806);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, p paramp, byte[] paramArrayOfByte)
  {
    GMTrace.i(18496142442496L, 137807);
    w.i("MicroMsg.NetSceneUploadSoterASK", "MicroMsg.NetSceneUploadSoterASK errType: %d, errCode: %d, errMsg: %s", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    if (this.gMF != null) {
      this.gMF.a(paramInt2, paramInt3, paramString, this);
    }
    if ((paramInt2 == 0) && (paramInt3 == 0))
    {
      w.i("MicroMsg.NetSceneUploadSoterASK", "netscene upload soter ask successfully");
      if (this.lZe != null)
      {
        this.lZe.cd(new e.b(true));
        GMTrace.o(18496142442496L, 137807);
      }
    }
    else
    {
      w.e("MicroMsg.NetSceneUploadSoterASK", "netscene upload soter ask failed");
      if (this.lZe != null) {
        this.lZe.cd(new e.b(false));
      }
    }
    GMTrace.o(18496142442496L, 137807);
  }
  
  public final void a(com.tencent.d.b.e.b<e.b> paramb)
  {
    GMTrace.i(18496276660224L, 137808);
    this.lZe = paramb;
    GMTrace.o(18496276660224L, 137808);
  }
  
  public final void execute()
  {
    GMTrace.i(18496410877952L, 137809);
    w.v("MicroMsg.NetSceneUploadSoterASK", "alvinluo NetSceneUploadSoterASK execute doScene");
    h.wT().a(this, 0);
    GMTrace.o(18496410877952L, 137809);
  }
  
  public final int getType()
  {
    GMTrace.i(18495874007040L, 137805);
    GMTrace.o(18495874007040L, 137805);
    return 619;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/soter/b/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */