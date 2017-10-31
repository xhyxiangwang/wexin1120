package com.tencent.mm.plugin.collect.b;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ac.b.a;
import com.tencent.mm.ac.b.b;
import com.tencent.mm.ac.b.c;
import com.tencent.mm.ac.k;
import com.tencent.mm.network.j;
import com.tencent.mm.network.p;
import com.tencent.mm.protocal.c.jx;
import com.tencent.mm.protocal.c.jy;
import com.tencent.mm.sdk.platformtools.w;

public final class i
  extends k
  implements j
{
  private com.tencent.mm.ac.e gMF;
  private com.tencent.mm.ac.b hMN;
  public jy kKu;
  
  public i(int paramInt, com.tencent.mm.bl.b paramb, String paramString)
  {
    GMTrace.i(17427098238976L, 129842);
    Object localObject = new b.a();
    ((b.a)localObject).hlX = new jx();
    ((b.a)localObject).hlY = new jy();
    ((b.a)localObject).hlW = 1384;
    ((b.a)localObject).uri = "/cgi-bin/mmpay-bin/getf2frcvvoice";
    ((b.a)localObject).hlZ = 0;
    ((b.a)localObject).hma = 0;
    this.hMN = ((b.a)localObject).DA();
    localObject = (jx)this.hMN.hlU.hmc;
    ((jx)localObject).bhM = paramInt;
    ((jx)localObject).tGi = 1;
    ((jx)localObject).kKZ = paramString;
    ((jx)localObject).tGg = null;
    ((jx)localObject).tGh = paramb;
    w.i("MicroMsg.NetSceneF2FRcvVoice", "amount: %d, outtradeno: %s", new Object[] { Integer.valueOf(paramInt), paramString });
    GMTrace.o(17427098238976L, 129842);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ac.e parame1)
  {
    GMTrace.i(17427366674432L, 129844);
    this.gMF = parame1;
    int i = a(parame, this.hMN, this);
    GMTrace.o(17427366674432L, 129844);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, p paramp, byte[] paramArrayOfByte)
  {
    GMTrace.i(17427500892160L, 129845);
    w.i("MicroMsg.NetSceneF2FRcvVoice", "errType: %d, errCode: %d, errMsg: %s", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    this.kKu = ((jy)((com.tencent.mm.ac.b)paramp).hlV.hmc);
    w.i("MicroMsg.NetSceneF2FRcvVoice", "ret_code: %d, ret_msg: %s，voice_type: %d", new Object[] { Integer.valueOf(this.kKu.kKx), this.kKu.kKy, Integer.valueOf(this.kKu.tGi) });
    if (this.gMF != null) {
      this.gMF.a(paramInt2, paramInt3, paramString, this);
    }
    GMTrace.o(17427500892160L, 129845);
  }
  
  public final int getType()
  {
    GMTrace.i(17427232456704L, 129843);
    GMTrace.o(17427232456704L, 129843);
    return 1384;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/collect/b/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */