package com.tencent.mm.plugin.aa.a.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ac.b;
import com.tencent.mm.ac.b.a;
import com.tencent.mm.ac.b.b;
import com.tencent.mm.ac.b.c;
import com.tencent.mm.ac.k;
import com.tencent.mm.network.p;
import com.tencent.mm.protocal.c.u;
import com.tencent.mm.protocal.c.v;
import com.tencent.mm.sdk.platformtools.w;

public final class j
  extends k
  implements com.tencent.mm.network.j
{
  private com.tencent.mm.ac.e gMF;
  private b hMN;
  private u ihw;
  public v ihx;
  
  public j(String paramString1, int paramInt1, String paramString2, String paramString3, int paramInt2)
  {
    GMTrace.i(15032251318272L, 111999);
    b.a locala = new b.a();
    locala.hlX = new u();
    locala.hlY = new v();
    locala.hlW = 1695;
    locala.uri = "/cgi-bin/mmpay-bin/newaaquerydetail";
    locala.hlZ = 0;
    locala.hma = 0;
    this.hMN = locala.DA();
    this.ihw = ((u)this.hMN.hlU.hmc);
    this.ihw.trs = paramString1;
    this.ihw.scene = paramInt1;
    this.ihw.trt = paramString2;
    if (paramInt1 == 5)
    {
      w.i("MicroMsg.NetSceneAAQueryDetail", "set sign and ver");
      this.ihw.sign = paramString3;
      this.ihw.ver = paramInt2;
    }
    w.i("MicroMsg.NetSceneAAQueryDetail", "NetSceneAAQueryDetail, billNo: %s, scene: %s, groupId: %s", new Object[] { paramString1, Integer.valueOf(paramInt1), paramString2 });
    GMTrace.o(15032251318272L, 111999);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ac.e parame1)
  {
    GMTrace.i(5599563612160L, 41720);
    w.i("MicroMsg.NetSceneAAQueryDetail", "doScene");
    this.gMF = parame1;
    int i = a(parame, this.hMN, this);
    GMTrace.o(5599563612160L, 41720);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, p paramp, byte[] paramArrayOfByte)
  {
    GMTrace.i(5599295176704L, 41718);
    w.i("MicroMsg.NetSceneAAQueryDetail", "onGYNetEnd, errType: %s, errCode: %s", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    this.ihx = ((v)((b)paramp).hlV.hmc);
    w.i("MicroMsg.NetSceneAAQueryDetail", "retcode: %s, retmsg: %s", new Object[] { Integer.valueOf(this.ihx.kKx), this.ihx.kKy });
    if (this.gMF != null) {
      this.gMF.a(paramInt2, paramInt3, paramString, this);
    }
    GMTrace.o(5599295176704L, 41718);
  }
  
  public final int getType()
  {
    GMTrace.i(5599429394432L, 41719);
    GMTrace.o(5599429394432L, 41719);
    return 1695;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/aa/a/a/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */