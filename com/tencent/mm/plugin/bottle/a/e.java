package com.tencent.mm.plugin.bottle.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.a.g;
import com.tencent.mm.ac.b.a;
import com.tencent.mm.ac.b.b;
import com.tencent.mm.ac.b.c;
import com.tencent.mm.ac.k;
import com.tencent.mm.ac.k.b;
import com.tencent.mm.g.b.ce;
import com.tencent.mm.modelvoice.q;
import com.tencent.mm.modelvoice.u;
import com.tencent.mm.network.j;
import com.tencent.mm.network.p;
import com.tencent.mm.protocal.c.apy;
import com.tencent.mm.protocal.c.apz;
import com.tencent.mm.protocal.c.axs;
import com.tencent.mm.protocal.c.nl;
import com.tencent.mm.protocal.c.nm;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.au;
import com.tencent.mm.x.ap;

public final class e
  extends k
  implements j
{
  private String fnP;
  private com.tencent.mm.ac.b gMC;
  private com.tencent.mm.ac.e gMF;
  private String keR;
  private int keS;
  private com.tencent.mm.modelvoice.a keT;
  private int msgType;
  
  public e(String paramString, int paramInt)
  {
    GMTrace.i(7600078848000L, 56625);
    this.keR = "";
    this.msgType = 0;
    this.keS = 0;
    this.keT = null;
    this.fnP = "";
    b.a locala = new b.a();
    locala.hlX = new apy();
    locala.hlY = new apz();
    locala.uri = "/cgi-bin/micromsg-bin/openbottle";
    locala.hlW = 156;
    locala.hlZ = 55;
    locala.hma = 1000000055;
    this.gMC = locala.DA();
    this.keR = paramString;
    this.msgType = paramInt;
    GMTrace.o(7600078848000L, 56625);
  }
  
  private int agT()
  {
    GMTrace.i(7600615718912L, 56629);
    apy localapy = (apy)this.gMC.hlU.hmc;
    apz localapz = (apz)this.gMC.hlV.hmc;
    a locala = new a();
    locala.msgType = localapy.mDF;
    locala.keK = 0;
    locala.keM = 2;
    locala.keL = c.th(localapy.umm);
    locala.keO = bg.Pp();
    locala.keJ = g.n(localapy.umm.getBytes());
    if (this.msgType == 3)
    {
      locala.content = this.fnP;
      locala.keN = localapz.tLt;
    }
    for (;;)
    {
      i.agX().a(locala);
      GMTrace.o(7600615718912L, 56629);
      return 0;
      locala.content = new String(localapz.umq.tKb.ush.toK);
    }
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ac.e parame1)
  {
    GMTrace.i(7600213065728L, 56626);
    this.gMF = parame1;
    parame1 = (apy)this.gMC.hlU.hmc;
    parame1.mDF = this.msgType;
    parame1.umm = this.keR;
    if (parame1.umn == null) {
      parame1.umn = new nm();
    }
    if (parame1.umo == null) {
      parame1.umo = new nm();
    }
    if (this.msgType == 1)
    {
      parame1.umn.twV = 0;
      parame1.umn.tKa = 0;
    }
    while (this.msgType == 3)
    {
      int i = a(parame, this.gMC, this);
      GMTrace.o(7600213065728L, 56626);
      return i;
    }
    w.e("MicroMsg.NetSceneOpenBottle", "doScene Error Msg type" + this.msgType);
    GMTrace.o(7600213065728L, 56626);
    return -1;
  }
  
  protected final int a(p paramp)
  {
    GMTrace.i(7600347283456L, 56627);
    paramp = (apy)((com.tencent.mm.ac.b)paramp).hlU.hmc;
    if (paramp.mDF == 1)
    {
      i = k.b.hmE;
      GMTrace.o(7600347283456L, 56627);
      return i;
    }
    if (paramp.mDF != 3)
    {
      i = k.b.hmF;
      GMTrace.o(7600347283456L, 56627);
      return i;
    }
    if (paramp.umn == null)
    {
      w.d("MicroMsg.NetSceneOpenBottle", "ERR: securityVerificationChecked errtype: rImpl.getBigContentInfo() == null");
      i = k.b.hmF;
      GMTrace.o(7600347283456L, 56627);
      return i;
    }
    if ((paramp.umn.tKa == 0) && (paramp.umn.twV == 0))
    {
      i = k.b.hmE;
      GMTrace.o(7600347283456L, 56627);
      return i;
    }
    if (paramp.umn.tKa <= paramp.umn.twV)
    {
      i = k.b.hmF;
      GMTrace.o(7600347283456L, 56627);
      return i;
    }
    int i = k.b.hmE;
    GMTrace.o(7600347283456L, 56627);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, p paramp, byte[] paramArrayOfByte)
  {
    GMTrace.i(7600749936640L, 56630);
    w.d("MicroMsg.NetSceneOpenBottle", "onGYNetEnd errtype:" + paramInt2 + " errCode:" + paramInt3);
    if ((paramInt2 != 0) || (paramInt3 != 0))
    {
      w.d("MicroMsg.NetSceneOpenBottle", "ERR: onGYNetEnd errtype:" + paramInt2 + " errCode:" + paramInt3);
      this.gMF.a(paramInt2, paramInt3, paramString, this);
      GMTrace.o(7600749936640L, 56630);
      return;
    }
    paramp = (apy)this.gMC.hlU.hmc;
    paramArrayOfByte = (apz)this.gMC.hlV.hmc;
    if (this.msgType == 1)
    {
      agT();
      localau = new au();
      localau.cW(paramp.umm);
      localau.setContent(com.tencent.mm.platformtools.n.b(paramArrayOfByte.umq.tKb));
      localau.D(bg.Pp());
      localau.dC(0);
      localau.dB(3);
      localau.setType(c.kW(paramp.mDF));
      ap.AS();
      com.tencent.mm.x.c.yN().K(localau);
      w.d("MicroMsg.NetSceneOpenBottle", "onGYNetEnd :" + localau.field_content);
      this.gMF.a(paramInt2, paramInt3, paramString, this);
      GMTrace.o(7600749936640L, 56630);
      return;
    }
    if (bg.mZ(this.fnP))
    {
      this.fnP = u.mH(this.keR);
      this.keT = new com.tencent.mm.modelvoice.a(q.getFullPath(this.fnP));
      this.keS = 0;
    }
    if (paramArrayOfByte.umq.tKa < paramArrayOfByte.umq.twV + paramArrayOfByte.umq.tKb.usf)
    {
      w.e("MicroMsg.NetSceneOpenBottle", "onGYNetEnd tot:" + paramArrayOfByte.umq.tKa + " start:" + paramArrayOfByte.umq.twV + " len:" + paramArrayOfByte.umq.tKb.usf);
      this.gMF.a(3, -1, paramString, this);
      GMTrace.o(7600749936640L, 56630);
      return;
    }
    if (paramArrayOfByte.umq.twV != this.keS)
    {
      w.e("MicroMsg.NetSceneOpenBottle", "onGYNetEnd start:" + paramArrayOfByte.umq.twV + " off:" + this.keS);
      this.gMF.a(3, -1, paramString, this);
      GMTrace.o(7600749936640L, 56630);
      return;
    }
    paramInt1 = this.keT.write(paramArrayOfByte.umq.tKb.ush.toK, paramArrayOfByte.umq.tKb.usf, paramArrayOfByte.umq.twV);
    if (paramInt1 != paramArrayOfByte.umq.tKb.usf + paramArrayOfByte.umq.twV)
    {
      w.e("MicroMsg.NetSceneOpenBottle", "onGYNetEnd start:" + paramArrayOfByte.umq.twV + " len:" + paramArrayOfByte.umq.tKb.usf + " writeRet:" + paramInt1);
      this.gMF.a(3, -1, paramString, this);
      GMTrace.o(7600749936640L, 56630);
      return;
    }
    this.keS = paramInt1;
    if (paramArrayOfByte.umq.tKa > this.keS)
    {
      if (a(this.hmo, this.gMF) == -1)
      {
        this.gMF.a(3, -1, "doScene failed", this);
        GMTrace.o(7600749936640L, 56630);
        return;
      }
      GMTrace.o(7600749936640L, 56630);
      return;
    }
    agT();
    au localau = new au();
    localau.cW(paramp.umm);
    localau.setContent(com.tencent.mm.modelvoice.n.b("bottle", paramArrayOfByte.tLt, false));
    localau.cX(this.fnP);
    localau.D(bg.Pp());
    localau.dC(0);
    localau.dB(3);
    localau.setType(c.kW(paramp.mDF));
    ap.AS();
    com.tencent.mm.x.c.yN().K(localau);
    w.d("MicroMsg.NetSceneOpenBottle", "voice :" + paramArrayOfByte.tLt + " file:" + this.fnP);
    this.gMF.a(paramInt2, paramInt3, paramString, this);
    GMTrace.o(7600749936640L, 56630);
  }
  
  public final int getType()
  {
    GMTrace.i(7600884154368L, 56631);
    GMTrace.o(7600884154368L, 56631);
    return 156;
  }
  
  protected final int vG()
  {
    GMTrace.i(7600481501184L, 56628);
    GMTrace.o(7600481501184L, 56628);
    return 10;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/bottle/a/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */