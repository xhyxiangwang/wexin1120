package com.tencent.mm.plugin.collect.reward.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ac.b;
import com.tencent.mm.ac.b.a;
import com.tencent.mm.ac.b.b;
import com.tencent.mm.ac.b.c;
import com.tencent.mm.network.p;
import com.tencent.mm.protocal.c.ko;
import com.tencent.mm.protocal.c.kp;
import com.tencent.mm.sdk.platformtools.w;

public final class g
  extends a
{
  private final String TAG;
  private b gMC;
  private com.tencent.mm.ac.e gMF;
  public kp kLk;
  public String klL;
  
  public g(String paramString)
  {
    GMTrace.i(19348961886208L, 144161);
    this.TAG = "MicroMsg.NetSceneQrRewardSetPhotoWord";
    b.a locala = new b.a();
    locala.hlX = new ko();
    locala.hlY = new kp();
    locala.hlW = 1649;
    locala.uri = "/cgi-bin/mmpay-bin/setrewardqrcodephotoword";
    locala.hlZ = 0;
    locala.hma = 0;
    this.gMC = locala.DA();
    ((ko)this.gMC.hlU.hmc).klL = paramString;
    this.klL = paramString;
    GMTrace.o(19348961886208L, 144161);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ac.e parame1)
  {
    GMTrace.i(19349230321664L, 144163);
    this.gMF = parame1;
    int i = a(parame, this.gMC, this);
    GMTrace.o(19349230321664L, 144163);
    return i;
  }
  
  public final void b(int paramInt1, int paramInt2, String paramString, p paramp)
  {
    GMTrace.i(19349364539392L, 144164);
    w.i("MicroMsg.NetSceneQrRewardSetPhotoWord", "errType: %s, errCode: %s, errMsg: %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
    this.kLk = ((kp)((b)paramp).hlV.hmc);
    w.i("MicroMsg.NetSceneQrRewardSetPhotoWord", "retcode: %s, retmsg: %s", new Object[] { Integer.valueOf(this.kLk.kKx), this.kLk.kKy });
    if ((!this.kLb) && (this.kLk.kKx != 0)) {
      this.kLc = true;
    }
    if (this.gMF != null) {
      this.gMF.a(paramInt1, paramInt2, paramString, this);
    }
    GMTrace.o(19349364539392L, 144164);
  }
  
  public final int getType()
  {
    GMTrace.i(19349096103936L, 144162);
    GMTrace.o(19349096103936L, 144162);
    return 1649;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/collect/reward/a/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */