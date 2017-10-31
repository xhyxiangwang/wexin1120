package com.tencent.mm.plugin.ipcall.a.d;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ac.b;
import com.tencent.mm.ac.b.a;
import com.tencent.mm.ac.b.b;
import com.tencent.mm.ac.b.c;
import com.tencent.mm.ac.k;
import com.tencent.mm.network.j;
import com.tencent.mm.network.p;
import com.tencent.mm.protocal.c.aei;
import com.tencent.mm.protocal.c.aej;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import com.tencent.mm.storage.w.a;
import com.tencent.mm.x.ap;
import com.tencent.mm.x.c;
import java.io.IOException;

public final class g
  extends k
  implements j
{
  private b gMC;
  private com.tencent.mm.ac.e gMF;
  private aei mZk;
  public aej mZl;
  
  public g(int paramInt)
  {
    GMTrace.i(11585674280960L, 86320);
    this.gMC = null;
    this.mZk = null;
    this.mZl = null;
    Object localObject = new b.a();
    ((b.a)localObject).hlX = new aei();
    ((b.a)localObject).hlY = new aej();
    ((b.a)localObject).hlW = 257;
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/getwechatoutcoupons";
    ((b.a)localObject).hlZ = 0;
    ((b.a)localObject).hma = 0;
    this.gMC = ((b.a)localObject).DA();
    this.mZk = ((aei)this.gMC.hlU.hmc);
    this.mZk.ttY = paramInt;
    localObject = this.mZk;
    ap.AS();
    ((aei)localObject).tZV = ((Integer)c.xi().get(w.a.uWD, Integer.valueOf(0))).intValue();
    localObject = this.mZk;
    ap.AS();
    ((aei)localObject).tZW = ((Integer)c.xi().get(w.a.uWr, Integer.valueOf(0))).intValue();
    w.i("MicroMsg.NetSceneIPCallGetWeChatOutCoupons", "NetSceneIPCallGetWeChatOutCoupons Scene:%d, RechargeWordingVersion:%d,AccountActivityWordingVersion:%d", new Object[] { Integer.valueOf(this.mZk.ttY), Integer.valueOf(this.mZk.tZV), Integer.valueOf(this.mZk.tZW) });
    GMTrace.o(11585674280960L, 86320);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ac.e parame1)
  {
    GMTrace.i(11585942716416L, 86322);
    this.gMF = parame1;
    int i = a(parame, this.gMC, this);
    GMTrace.o(11585942716416L, 86322);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, p paramp, byte[] paramArrayOfByte)
  {
    GMTrace.i(11586076934144L, 86323);
    w.i("MicroMsg.NetSceneIPCallGetWeChatOutCoupons", "onGYNetEnd, errType: %d, errCode: %d", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    this.mZl = ((aej)((b)paramp).hlV.hmc);
    if (((paramInt2 == 0) || (paramInt3 == 0)) && (paramInt2 == 0) && (paramInt3 == 0))
    {
      paramp = this.mZl;
      if (paramp != null) {
        w.i("MicroMsg.IPCallUtil", "[royle]begin save response,Balance:%s,PVWording:%s,Coupons:%s,Wording:%s,Title:%s,Desc:%s,ImgPath:%s,UrlPath:%s,SmsDesc:%s,PackageMsg:%s", new Object[] { paramp.uaa, paramp.uab, paramp.tZX, paramp.nat, paramp.fuw, paramp.mCK, paramp.tZY, paramp.tZZ, paramp.uac, paramp.uai });
      }
    }
    try
    {
      ap.AS();
      c.xi().a(w.a.uXx, bg.br(paramp.toByteArray()));
      if (this.gMF != null) {
        this.gMF.a(paramInt2, paramInt3, paramString, this);
      }
      GMTrace.o(11586076934144L, 86323);
      return;
    }
    catch (IOException paramp)
    {
      for (;;)
      {
        w.i("MicroMsg.IPCallUtil", "[royle]save exception:%s", new Object[] { paramp.getMessage() });
      }
    }
  }
  
  public final int getType()
  {
    GMTrace.i(11585808498688L, 86321);
    GMTrace.o(11585808498688L, 86321);
    return 257;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/ipcall/a/d/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */