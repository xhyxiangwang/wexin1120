package com.tencent.mm.plugin.wallet_core.b;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ac.b;
import com.tencent.mm.ac.b.a;
import com.tencent.mm.ac.b.b;
import com.tencent.mm.ac.b.c;
import com.tencent.mm.ac.k;
import com.tencent.mm.network.j;
import com.tencent.mm.network.p;
import com.tencent.mm.protocal.c.vw;
import com.tencent.mm.protocal.c.vx;
import com.tencent.mm.sdk.platformtools.w;

public final class d
  extends k
  implements j
{
  private b gMC;
  private com.tencent.mm.ac.e gMF;
  public vx rKB;
  
  public d(String paramString)
  {
    GMTrace.i(7026029625344L, 52348);
    Object localObject = new b.a();
    ((b.a)localObject).hlX = new vw();
    ((b.a)localObject).hlY = new vx();
    ((b.a)localObject).uri = "/cgi-bin/mmpay-bin/tenpay/getbanpaymobileinfo";
    ((b.a)localObject).hlW = 1667;
    this.gMC = ((b.a)localObject).DA();
    localObject = (vw)this.gMC.hlU.hmc;
    w.d("MicroMsg.NetSceneGetBanpayMobileInfo", "req_key: %s", new Object[] { paramString });
    ((vw)localObject).fCP = paramString;
    GMTrace.o(7026029625344L, 52348);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ac.e parame1)
  {
    GMTrace.i(7026298060800L, 52350);
    this.gMF = parame1;
    int i = a(parame, this.gMC, this);
    GMTrace.o(7026298060800L, 52350);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, p paramp, byte[] paramArrayOfByte)
  {
    GMTrace.i(7026432278528L, 52351);
    w.i("MicroMsg.NetSceneGetBanpayMobileInfo", "NetSceneGetBanpayMobileInfo, netId: %s, errType: %s, errCode: %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    this.rKB = ((vx)this.gMC.hlV.hmc);
    if (this.gMF != null) {
      this.gMF.a(paramInt2, paramInt3, paramString, this);
    }
    GMTrace.o(7026432278528L, 52351);
  }
  
  public final int getType()
  {
    GMTrace.i(15395176054784L, 114703);
    GMTrace.o(15395176054784L, 114703);
    return 1667;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/wallet_core/b/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */