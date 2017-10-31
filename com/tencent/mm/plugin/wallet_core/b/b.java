package com.tencent.mm.plugin.wallet_core.b;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ac.b.a;
import com.tencent.mm.ac.b.b;
import com.tencent.mm.ac.b.c;
import com.tencent.mm.ac.k;
import com.tencent.mm.g.a.np;
import com.tencent.mm.network.j;
import com.tencent.mm.network.p;
import com.tencent.mm.plugin.wallet_core.model.h;
import com.tencent.mm.protocal.c.vy;
import com.tencent.mm.protocal.c.vz;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import com.tencent.mm.storage.w.a;
import com.tencent.mm.x.ap;
import com.tencent.mm.x.c;
import java.util.LinkedList;

public final class b
  extends k
  implements j
{
  private com.tencent.mm.ac.b gMC;
  private com.tencent.mm.ac.e gMF;
  
  public b(LinkedList<String> paramLinkedList)
  {
    GMTrace.i(7023345270784L, 52328);
    w.i("MicroMsg.NetSceneGetBankcardLogo", "NetSceneGetBankcardLogo call");
    Object localObject = new b.a();
    ((b.a)localObject).hlX = new vy();
    ((b.a)localObject).hlY = new vz();
    ((b.a)localObject).uri = "/cgi-bin/mmpay-bin/bankresource";
    ((b.a)localObject).hlW = 1650;
    this.gMC = ((b.a)localObject).DA();
    this.gMC.hml = true;
    localObject = (vy)this.gMC.hlU.hmc;
    ((vy)localObject).tTK = paramLinkedList;
    ((vy)localObject).tEh = h.bww();
    com.tencent.mm.wallet_core.ui.e.Eh(42);
    GMTrace.o(7023345270784L, 52328);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ac.e parame1)
  {
    GMTrace.i(7023613706240L, 52330);
    this.gMF = parame1;
    int i = a(parame, this.gMC, this);
    GMTrace.o(7023613706240L, 52330);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, p paramp, byte[] paramArrayOfByte)
  {
    GMTrace.i(7023747923968L, 52331);
    w.i("MicroMsg.NetSceneGetBankcardLogo", "NetSceneGetBankcardLogo onGYNetEnd,errType=" + paramInt2 + "errCode=" + paramInt3);
    if ((paramInt2 == 0) && (paramInt3 == 0))
    {
      paramp = (vz)((com.tencent.mm.ac.b)paramp).hlV.hmc;
      w.i("MicroMsg.NetSceneGetBankcardLogo", "respone %s", new Object[] { paramp.tTM });
      paramArrayOfByte = paramp.tTL;
      if ((paramArrayOfByte == null) || (paramArrayOfByte.size() == 0))
      {
        w.d("MicroMsg.NetSceneGetBankcardLogo", "empty bank logo list");
        ap.AS();
        c.xi().a(w.a.uYq, bg.ap(paramp.tTM, ""));
        ap.AS();
        c.xi().a(w.a.uYr, Long.valueOf(System.currentTimeMillis() / 1000L));
      }
    }
    for (;;)
    {
      this.gMF.a(paramInt2, paramInt3, paramString, this);
      GMTrace.o(7023747923968L, 52331);
      return;
      np localnp = new np();
      localnp.fLG.fLI = paramArrayOfByte;
      a.uLm.m(localnp);
      break;
      com.tencent.mm.wallet_core.ui.e.Eh(43);
    }
  }
  
  public final int getType()
  {
    GMTrace.i(15395041837056L, 114702);
    GMTrace.o(15395041837056L, 114702);
    return 1650;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/wallet_core/b/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */