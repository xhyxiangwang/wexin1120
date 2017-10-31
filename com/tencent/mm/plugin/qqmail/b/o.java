package com.tencent.mm.plugin.qqmail.b;

import com.tencent.gmtrace.GMTrace;
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
import com.tencent.mm.protocal.c.bjq;
import com.tencent.mm.protocal.c.bjr;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.util.Random;

public final class o
  extends k
  implements j
{
  private String fJw;
  public String filePath;
  private b gMC;
  private com.tencent.mm.ac.e gMF;
  private f hAy;
  private int hld;
  private int hle;
  
  public o(String paramString1, String paramString2, f paramf)
  {
    GMTrace.i(5463869489152L, 40709);
    this.filePath = null;
    this.hle = 0;
    this.hld = 0;
    this.filePath = paramString1;
    this.fJw = (paramString2 + "_" + System.nanoTime() + "_" + Math.abs(new Random().nextInt() / 2));
    this.hAy = paramf;
    w.i("MicroMsg.NetSceneUploadFie", "msgId: %s, filePath: %s", new Object[] { this.fJw, this.filePath });
    GMTrace.o(5463869489152L, 40709);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ac.e parame1)
  {
    GMTrace.i(5464674795520L, 40715);
    this.gMF = parame1;
    if (bg.mZ(this.filePath))
    {
      w.e("MicroMsg.NetSceneUploadFie", "doScene, filePath is null");
      GMTrace.o(5464674795520L, 40715);
      return -1;
    }
    if (!com.tencent.mm.a.e.aZ(this.filePath))
    {
      w.e("MicroMsg.NetSceneUploadFie", "doScene, file: %s not exist", new Object[] { this.filePath });
      GMTrace.o(5464674795520L, 40715);
      return -1;
    }
    if (this.hld == 0)
    {
      this.hld = com.tencent.mm.a.e.aY(this.filePath);
      w.i("MicroMsg.NetSceneUploadFie", "doScene, totalLen: %d", new Object[] { Integer.valueOf(this.hld) });
    }
    int i = Math.min(this.hld - this.hle, 32768);
    w.i("MicroMsg.NetSceneUploadFie", "doScene, startPos: %d, dataLen: %d", new Object[] { Integer.valueOf(this.hle), Integer.valueOf(i) });
    parame1 = com.tencent.mm.a.e.c(this.filePath, this.hle, i);
    if (parame1 == null)
    {
      w.e("MicroMsg.NetSceneUploadFie", "doScene, read file buf is null");
      GMTrace.o(5464674795520L, 40715);
      return -1;
    }
    w.i("MicroMsg.NetSceneUploadFie", "doScene, buf.length: %d", new Object[] { Integer.valueOf(parame1.length) });
    Object localObject = new b.a();
    ((b.a)localObject).hlX = new bjq();
    ((b.a)localObject).hlY = new bjr();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/uploadfile";
    ((b.a)localObject).hlW = 484;
    ((b.a)localObject).hlZ = 0;
    ((b.a)localObject).hma = 0;
    this.gMC = ((b.a)localObject).DA();
    localObject = (bjq)this.gMC.hlU.hmc;
    ((bjq)localObject).tvh = this.fJw;
    ((bjq)localObject).twU = this.hld;
    ((bjq)localObject).twV = this.hle;
    ((bjq)localObject).twW = i;
    ((bjq)localObject).tJz = n.H(parame1);
    i = a(parame, this.gMC, this);
    w.i("MicroMsg.NetSceneUploadFie", "doScene, ret: %d", new Object[] { Integer.valueOf(i) });
    GMTrace.o(5464674795520L, 40715);
    return i;
  }
  
  protected final int a(p paramp)
  {
    GMTrace.i(5464272142336L, 40712);
    if ((bg.mZ(this.filePath)) || (!com.tencent.mm.a.e.aZ(this.filePath)))
    {
      w.e("MicroMsg.NetSceneUploadFie", "securityVerificationChecked failed, file not exist");
      i = k.b.hmF;
      GMTrace.o(5464272142336L, 40712);
      return i;
    }
    int i = k.b.hmE;
    GMTrace.o(5464272142336L, 40712);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, p paramp, byte[] paramArrayOfByte)
  {
    GMTrace.i(5464003706880L, 40710);
    w.i("MicroMsg.NetSceneUploadFie", "onGYNetEnd, netId: %d, errType: %d, errCode: %d, errMsg: %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    if ((paramInt2 != 0) || (paramInt3 != 0))
    {
      if (this.gMF != null) {
        this.gMF.a(paramInt2, paramInt3, paramString, this);
      }
      GMTrace.o(5464003706880L, 40710);
      return;
    }
    paramp = (bjr)((b)paramp).hlV.hmc;
    paramArrayOfByte = paramp.tvh;
    w.i("MicroMsg.NetSceneUploadFie", "onGYNetEnd, clientId: %s, totalLen: %d, attachId: %s", new Object[] { paramp.tvh, Integer.valueOf(paramp.twU), paramp.tKf });
    if (!paramArrayOfByte.equals(this.fJw))
    {
      GMTrace.o(5464003706880L, 40710);
      return;
    }
    this.hle = paramp.twV;
    if (this.hle < this.hld)
    {
      w.i("MicroMsg.NetSceneUploadFie", "onGYNetEnd, startPos: %d, totalLen: %d, continue to upload", new Object[] { Integer.valueOf(this.hle), Integer.valueOf(this.hld) });
      if (a(this.hmo, this.gMF) < 0)
      {
        w.e("MicroMsg.NetSceneUploadFie", "continue to upload fail");
        if (this.gMF != null) {
          this.gMF.a(paramInt2, paramInt3, paramString, this);
        }
        if (this.hAy != null) {
          this.hAy.a(this.hle, this.hld, this);
        }
        GMTrace.o(5464003706880L, 40710);
        return;
      }
    }
    paramp = paramp.tKf;
    w.i("MicroMsg.NetSceneUploadFie", "onGYNetEnd, finish upload, startPos: %d, totalLen: %d, attachId: %s", new Object[] { Integer.valueOf(this.hle), Integer.valueOf(this.hld), paramp });
    if (this.gMF != null) {
      this.gMF.a(paramInt2, paramInt3, paramString, this);
    }
    if (this.hAy != null) {
      this.hAy.a(this.hle, this.hld, this);
    }
    GMTrace.o(5464003706880L, 40710);
  }
  
  protected final void a(k.a parama)
  {
    GMTrace.i(5464406360064L, 40713);
    GMTrace.o(5464406360064L, 40713);
  }
  
  public final bjr aWU()
  {
    GMTrace.i(5464809013248L, 40716);
    if (this.gMC != null)
    {
      bjr localbjr = (bjr)this.gMC.hlV.hmc;
      GMTrace.o(5464809013248L, 40716);
      return localbjr;
    }
    GMTrace.o(5464809013248L, 40716);
    return null;
  }
  
  public final int getType()
  {
    GMTrace.i(5464540577792L, 40714);
    GMTrace.o(5464540577792L, 40714);
    return 484;
  }
  
  protected final int vG()
  {
    GMTrace.i(5464137924608L, 40711);
    GMTrace.o(5464137924608L, 40711);
    return 640;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/qqmail/b/o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */