package com.tencent.mm.plugin.collect.b;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ac.b;
import com.tencent.mm.ac.b.a;
import com.tencent.mm.ac.b.b;
import com.tencent.mm.ac.k;
import com.tencent.mm.network.j;
import com.tencent.mm.network.p;
import com.tencent.mm.protocal.c.bba;
import com.tencent.mm.protocal.c.bbb;
import com.tencent.mm.sdk.platformtools.w;

public final class n
  extends k
  implements j
{
  private com.tencent.mm.ac.e gMF;
  private b hMN;
  private bba kKO;
  
  public n(String paramString)
  {
    GMTrace.i(5398773891072L, 40224);
    b.a locala = new b.a();
    locala.hlX = new bba();
    locala.hlY = new bbb();
    locala.hlW = 304;
    locala.uri = "/cgi-bin/micromsg-bin/setpushsound";
    locala.hlZ = 0;
    locala.hma = 0;
    this.hMN = locala.DA();
    this.kKO = ((bba)this.hMN.hlU.hmc);
    this.kKO.jXP = 3;
    this.kKO.utw = paramString;
    w.i("MicroMsg.NetSceneSetPushSound", "type: %d, sound: %s", new Object[] { Integer.valueOf(3), paramString });
    GMTrace.o(5398773891072L, 40224);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ac.e parame1)
  {
    GMTrace.i(5399042326528L, 40226);
    this.gMF = parame1;
    int i = a(parame, this.hMN, this);
    GMTrace.o(5399042326528L, 40226);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, p paramp, byte[] paramArrayOfByte)
  {
    GMTrace.i(5399176544256L, 40227);
    w.i("MicroMsg.NetSceneSetPushSound", "errType: %d, errCode: %d, errMsg: %s", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    if (this.gMF != null) {
      this.gMF.a(paramInt2, paramInt3, paramString, this);
    }
    GMTrace.o(5399176544256L, 40227);
  }
  
  public final int getType()
  {
    GMTrace.i(5398908108800L, 40225);
    GMTrace.o(5398908108800L, 40225);
    return 304;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/collect/b/n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */