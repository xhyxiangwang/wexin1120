package com.tencent.mm.plugin.qqmail.b;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.a.g;
import com.tencent.mm.ac.b;
import com.tencent.mm.ac.b.a;
import com.tencent.mm.ac.b.b;
import com.tencent.mm.ac.b.c;
import com.tencent.mm.ac.f;
import com.tencent.mm.ac.k;
import com.tencent.mm.ac.k.a;
import com.tencent.mm.ac.k.b;
import com.tencent.mm.network.j;
import com.tencent.mm.network.p;
import com.tencent.mm.platformtools.n;
import com.tencent.mm.protocal.c.ne;
import com.tencent.mm.protocal.c.nf;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.util.Random;

public final class m
  extends k
  implements j
{
  private String clientId;
  private String fFB;
  private b gMC;
  private com.tencent.mm.ac.e gMF;
  private f hAy;
  private int hld;
  private int hle;
  private String oFE;
  private String oFF;
  private int oFG;
  
  public m(String paramString1, String paramString2, String[] paramArrayOfString, int paramInt, f paramf)
  {
    GMTrace.i(5460379828224L, 40683);
    this.oFE = null;
    this.hld = 0;
    this.clientId = null;
    this.hle = 0;
    this.oFG = 0;
    this.oFE = paramString1;
    this.oFG = paramInt;
    this.hAy = paramf;
    if (!bg.mZ(paramString1))
    {
      this.clientId = (g.n(paramString1.getBytes()) + "_" + System.nanoTime() + "_" + new Random().nextInt());
      this.hld = paramString1.getBytes().length;
      this.hle = 0;
    }
    if (!bg.mZ(paramString2)) {
      this.fFB = paramString2;
    }
    if (paramArrayOfString != null)
    {
      this.oFF = "";
      int i = paramArrayOfString.length;
      paramInt = 0;
      while (paramInt < i)
      {
        paramString1 = paramArrayOfString[paramInt];
        this.oFF = (this.oFF + paramString1 + ",");
        paramInt += 1;
      }
      this.oFF = this.oFF.substring(0, this.oFF.length() - 1);
    }
    w.i("MicroMsg.NetSceneComposeSend", "NetSceneComposeSend, clientId: %s, totalLen: %d", new Object[] { this.clientId, Integer.valueOf(this.hld) });
    GMTrace.o(5460379828224L, 40683);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ac.e parame1)
  {
    GMTrace.i(5461185134592L, 40689);
    this.gMF = parame1;
    if (bg.mZ(this.oFE))
    {
      w.e("MicroMsg.NetSceneComposeSend", "doScene, sendContent is null");
      GMTrace.o(5461185134592L, 40689);
      return -1;
    }
    int k = Math.min(this.hld - this.hle, 32768);
    w.i("MicroMsg.NetSceneComposeSend", "doScene, dataLen: %d", new Object[] { Integer.valueOf(k) });
    parame1 = new byte[k];
    Object localObject = this.oFE.getBytes();
    int i = this.hle;
    int j = 0;
    while (i < this.hle + k)
    {
      parame1[j] = localObject[i];
      j += 1;
      i += 1;
    }
    if (bg.bp(parame1))
    {
      w.e("MicroMsg.NetSceneComposeSend", "doScene, sendData is null");
      GMTrace.o(5461185134592L, 40689);
      return -1;
    }
    localObject = new b.a();
    ((b.a)localObject).hlX = new ne();
    ((b.a)localObject).hlY = new nf();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/composesend";
    ((b.a)localObject).hlW = 485;
    ((b.a)localObject).hlZ = 0;
    ((b.a)localObject).hma = 0;
    this.gMC = ((b.a)localObject).DA();
    localObject = (ne)this.gMC.hlU.hmc;
    ((ne)localObject).tvh = this.clientId;
    ((ne)localObject).twU = this.hld;
    ((ne)localObject).twV = this.hle;
    ((ne)localObject).twW = k;
    ((ne)localObject).tJA = this.fFB;
    ((ne)localObject).tJB = this.oFF;
    ((ne)localObject).tJC = ((int)(this.hld + this.oFG * 1.3333334F));
    w.i("MicroMsg.NetSceneComposeSend", "doScene, realSize: %d", new Object[] { Integer.valueOf(((ne)localObject).tJC) });
    ((ne)localObject).tJz = n.H(parame1);
    i = a(parame, this.gMC, this);
    w.i("MicroMsg.NetSceneComposeSend", "doScene, ret: %d", new Object[] { Integer.valueOf(i) });
    GMTrace.o(5461185134592L, 40689);
    return i;
  }
  
  protected final int a(p paramp)
  {
    GMTrace.i(5460648263680L, 40685);
    if (bg.mZ(this.oFE))
    {
      w.e("MicroMsg.NetSceneComposeSend", "securityVerificationChecked failed, content is null");
      i = k.b.hmF;
      GMTrace.o(5460648263680L, 40685);
      return i;
    }
    int i = k.b.hmE;
    GMTrace.o(5460648263680L, 40685);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, p paramp, byte[] paramArrayOfByte)
  {
    GMTrace.i(5460916699136L, 40687);
    w.i("MicroMsg.NetSceneComposeSend", "onGYNetEnd, netId: %d, errType: %d, errCode: %d, errMsg: %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    if ((paramInt2 != 0) || (paramInt3 != 0))
    {
      if (this.gMF != null) {
        this.gMF.a(paramInt2, paramInt3, paramString, this);
      }
      GMTrace.o(5460916699136L, 40687);
      return;
    }
    this.hle = ((nf)((b)paramp).hlV.hmc).twV;
    if (this.gMF != null) {
      this.gMF.a(paramInt2, paramInt3, paramString, this);
    }
    if (this.hAy != null) {
      this.hAy.a(this.hle, this.hld, this);
    }
    if (this.hle < this.hld)
    {
      w.i("MicroMsg.NetSceneComposeSend", "onGYNetEnd, startPos: %d, totalLen: %d, continue to upload", new Object[] { Integer.valueOf(this.hle), Integer.valueOf(this.hld) });
      if (a(this.hmo, this.gMF) < 0)
      {
        w.e("MicroMsg.NetSceneComposeSend", "continue to upload fail");
        GMTrace.o(5460916699136L, 40687);
      }
    }
    else
    {
      w.i("MicroMsg.NetSceneComposeSend", "finished upload");
    }
    GMTrace.o(5460916699136L, 40687);
  }
  
  protected final void a(k.a parama)
  {
    GMTrace.i(5460782481408L, 40686);
    GMTrace.o(5460782481408L, 40686);
  }
  
  public final int getType()
  {
    GMTrace.i(5461050916864L, 40688);
    GMTrace.o(5461050916864L, 40688);
    return 485;
  }
  
  protected final int vG()
  {
    GMTrace.i(5460514045952L, 40684);
    GMTrace.o(5460514045952L, 40684);
    return 100;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/qqmail/b/m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */