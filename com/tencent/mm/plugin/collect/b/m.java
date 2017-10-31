package com.tencent.mm.plugin.collect.b;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ac.b.a;
import com.tencent.mm.ac.b.b;
import com.tencent.mm.ac.b.c;
import com.tencent.mm.ac.k;
import com.tencent.mm.network.j;
import com.tencent.mm.network.p;
import com.tencent.mm.protocal.c.ke;
import com.tencent.mm.protocal.c.kf;
import com.tencent.mm.sdk.platformtools.w;

public final class m
  extends k
  implements j
{
  private final String TAG;
  private com.tencent.mm.ac.b gMC;
  private com.tencent.mm.ac.e gMF;
  public kf kKN;
  
  public m(int paramInt, com.tencent.mm.bl.b paramb, String paramString)
  {
    GMTrace.i(18063021834240L, 134580);
    this.TAG = "MicroMsg.NetSceneMDRcvVoice";
    Object localObject = new b.a();
    ((b.a)localObject).hlX = new ke();
    ((b.a)localObject).hlY = new kf();
    ((b.a)localObject).hlW = 1317;
    ((b.a)localObject).uri = "/cgi-bin/mmpay-bin/getmdrcvvoice";
    ((b.a)localObject).hlZ = 0;
    ((b.a)localObject).hma = 0;
    this.gMC = ((b.a)localObject).DA();
    localObject = (ke)this.gMC.hlU.hmc;
    ((ke)localObject).bhM = paramInt;
    ((ke)localObject).tGi = 1;
    ((ke)localObject).kKZ = paramString;
    ((ke)localObject).tGg = null;
    ((ke)localObject).tGh = paramb;
    w.i("MicroMsg.NetSceneMDRcvVoice", "amount: %d, outtradeno: %s", new Object[] { Integer.valueOf(paramInt), paramString });
    GMTrace.o(18063021834240L, 134580);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ac.e parame1)
  {
    GMTrace.i(18063290269696L, 134582);
    this.gMF = parame1;
    int i = a(parame, this.gMC, this);
    GMTrace.o(18063290269696L, 134582);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, p paramp, byte[] paramArrayOfByte)
  {
    GMTrace.i(18063424487424L, 134583);
    w.i("MicroMsg.NetSceneMDRcvVoice", "errType: %d, errCode: %d, errMsg: %s", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    this.kKN = ((kf)((com.tencent.mm.ac.b)paramp).hlV.hmc);
    w.i("MicroMsg.NetSceneMDRcvVoice", "ret_code: %d, ret_msg: %s，voice_type: %d", new Object[] { Integer.valueOf(this.kKN.kKx), this.kKN.kKy, Integer.valueOf(this.kKN.tGi) });
    if (this.gMF != null) {
      this.gMF.a(paramInt2, paramInt3, paramString, this);
    }
    GMTrace.o(18063424487424L, 134583);
  }
  
  public final int getType()
  {
    GMTrace.i(18063156051968L, 134581);
    GMTrace.o(18063156051968L, 134581);
    return 1317;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/collect/b/m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */