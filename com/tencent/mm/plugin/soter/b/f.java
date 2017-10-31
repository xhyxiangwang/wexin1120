package com.tencent.mm.plugin.soter.b;

import com.tencent.d.b.e.b;
import com.tencent.d.b.e.e.b;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ac.k;
import com.tencent.mm.ac.k.b;
import com.tencent.mm.ac.n;
import com.tencent.mm.kernel.h;
import com.tencent.mm.network.j;
import com.tencent.mm.network.p;
import com.tencent.mm.sdk.platformtools.w;

public final class f
  extends k
  implements com.tencent.d.b.e.e, j
{
  private com.tencent.mm.ac.e gMF;
  private p hne;
  private b<e.b> lZe;
  
  public f()
  {
    GMTrace.i(18497484619776L, 137817);
    this.lZe = null;
    GMTrace.o(18497484619776L, 137817);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ac.e parame1)
  {
    GMTrace.i(18498021490688L, 137821);
    this.gMF = parame1;
    int i = a(parame, this.hne, this);
    GMTrace.o(18498021490688L, 137821);
    return i;
  }
  
  protected final int a(p paramp)
  {
    GMTrace.i(18497753055232L, 137819);
    int i = k.b.hmE;
    GMTrace.o(18497753055232L, 137819);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, p paramp, byte[] paramArrayOfByte)
  {
    GMTrace.i(18498155708416L, 137822);
    w.i("MicroMsg.NetSceneUploadSoterASKRsa", "alvinluo errType: %d, errCode: %d, errMsg: %s", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    if (this.gMF != null) {
      this.gMF.a(paramInt2, paramInt3, paramString, this);
    }
    if ((paramInt2 == 0) && (paramInt3 == 0))
    {
      w.i("MicroMsg.NetSceneUploadSoterASKRsa", "netscene upload soter ask rsa successfully");
      if (this.lZe != null)
      {
        this.lZe.cd(new e.b(true));
        GMTrace.o(18498155708416L, 137822);
      }
    }
    else
    {
      w.e("MicroMsg.NetSceneUploadSoterASKRsa", "netscene upload soter ask rsa failed");
      if (this.lZe != null) {
        this.lZe.cd(new e.b(false));
      }
    }
    GMTrace.o(18498155708416L, 137822);
  }
  
  public final void a(b<e.b> paramb)
  {
    GMTrace.i(18498424143872L, 137824);
    this.lZe = paramb;
    GMTrace.o(18498424143872L, 137824);
  }
  
  public final void execute()
  {
    GMTrace.i(18498289926144L, 137823);
    w.v("MicroMsg.NetSceneUploadSoterASKRsa", "alvinluo NetSceneUploadSoterASKRsa doScene");
    h.wT().a(this, 0);
    GMTrace.o(18498289926144L, 137823);
  }
  
  public final int getType()
  {
    GMTrace.i(18497887272960L, 137820);
    GMTrace.o(18497887272960L, 137820);
    return 627;
  }
  
  protected final int vG()
  {
    GMTrace.i(18497618837504L, 137818);
    GMTrace.o(18497618837504L, 137818);
    return 3;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/soter/b/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */