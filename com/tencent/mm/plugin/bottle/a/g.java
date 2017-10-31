package com.tencent.mm.plugin.bottle.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ac.b.a;
import com.tencent.mm.ac.b.b;
import com.tencent.mm.ac.b.c;
import com.tencent.mm.ac.k;
import com.tencent.mm.ac.k.a;
import com.tencent.mm.ac.k.b;
import com.tencent.mm.modelvoice.o;
import com.tencent.mm.modelvoice.q;
import com.tencent.mm.network.j;
import com.tencent.mm.network.p;
import com.tencent.mm.platformtools.n;
import com.tencent.mm.protocal.c.axs;
import com.tencent.mm.protocal.c.axt;
import com.tencent.mm.protocal.c.bha;
import com.tencent.mm.protocal.c.bhb;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.util.LinkedList;

public final class g
  extends k
  implements j
{
  private com.tencent.mm.ac.b gMC;
  private com.tencent.mm.ac.e gMF;
  int keS;
  private com.tencent.mm.modelvoice.b keV;
  int msgType;
  
  public g(String paramString)
  {
    GMTrace.i(7598736670720L, 56615);
    this.msgType = -1;
    this.keS = 0;
    Object localObject = new b.a();
    ((b.a)localObject).hlX = new bha();
    ((b.a)localObject).hlY = new bhb();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/throwbottle";
    ((b.a)localObject).hlW = 154;
    ((b.a)localObject).hlZ = 53;
    ((b.a)localObject).hma = 1000000053;
    this.gMC = ((b.a)localObject).DA();
    if (!bg.mZ(paramString))
    {
      this.msgType = 1;
      localObject = (bha)this.gMC.hlU.hmc;
      ((bha)localObject).unO = 0;
      ((bha)localObject).mDF = this.msgType;
      ((bha)localObject).twV = 0;
      ((bha)localObject).twU = paramString.getBytes().length;
      ((bha)localObject).tLt = 0;
      ((bha)localObject).tKb = n.H(paramString.getBytes());
      ((bha)localObject).uhf = com.tencent.mm.a.g.n((paramString + bg.Pp()).getBytes());
    }
    GMTrace.o(7598736670720L, 56615);
  }
  
  public g(String paramString, int paramInt)
  {
    GMTrace.i(7598870888448L, 56616);
    this.msgType = -1;
    this.keS = 0;
    Object localObject = new b.a();
    ((b.a)localObject).hlX = new bha();
    ((b.a)localObject).hlY = new bhb();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/throwbottle";
    ((b.a)localObject).hlW = 154;
    ((b.a)localObject).hlZ = 53;
    ((b.a)localObject).hma = 1000000053;
    this.gMC = ((b.a)localObject).DA();
    if ((!bg.mZ(paramString)) && (paramInt > 0))
    {
      this.msgType = 3;
      localObject = (bha)this.gMC.hlU.hmc;
      ((bha)localObject).tLt = paramInt;
      ((bha)localObject).uhf = paramString;
      ((bha)localObject).unO = 0;
      ((bha)localObject).mDF = this.msgType;
    }
    GMTrace.o(7598870888448L, 56616);
  }
  
  private int kX(int paramInt)
  {
    GMTrace.i(7599810412544L, 56623);
    a locala = new a();
    locala.msgType = paramInt;
    Object localObject = (bha)this.gMC.hlU.hmc;
    bhb localbhb = (bhb)this.gMC.hlV.hmc;
    locala.keK = localbhb.uyq.size();
    locala.keM = 1;
    if (paramInt == 3)
    {
      locala.content = ((bha)localObject).uhf;
      locala.keN = ((bha)localObject).tLt;
    }
    for (;;)
    {
      localObject = "";
      paramInt = 0;
      while (paramInt < localbhb.uyq.size())
      {
        localObject = (String)localObject + localbhb.uyq.get(paramInt);
        paramInt += 1;
      }
      locala.content = new String(n.a(((bha)localObject).tKb));
    }
    locala.keJ = com.tencent.mm.a.g.n(((String)localObject).getBytes());
    locala.keO = bg.Pp();
    paramInt = 0;
    while (paramInt < localbhb.uyq.size())
    {
      localObject = c.th(n.a((axt)localbhb.uyq.get(paramInt)));
      if (!bg.mZ((String)localObject))
      {
        locala.keL = ((String)localObject);
        i.agX().a(locala);
      }
      paramInt += 1;
    }
    GMTrace.o(7599810412544L, 56623);
    return 0;
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ac.e parame1)
  {
    GMTrace.i(7599005106176L, 56617);
    this.gMF = parame1;
    if (this.msgType == 1) {
      this.msgType = (0 - this.msgType);
    }
    for (;;)
    {
      int i = a(parame, this.gMC, this);
      GMTrace.o(7599005106176L, 56617);
      return i;
      if (this.msgType != 3) {
        break;
      }
      parame1 = (bha)this.gMC.hlU.hmc;
      parame1.mDF = 3;
      parame1.unO = 0;
      if (this.keV == null)
      {
        this.keV = q.mx(parame1.uhf);
        this.keS = 0;
        parame1.twU = o.lZ(parame1.uhf);
      }
      com.tencent.mm.modelvoice.g localg = this.keV.bc(this.keS, 6000);
      w.d("MicroMsg.NetSceneThrowBottle", "doScene READ file[" + parame1.uhf + "] read ret:" + localg.ret + " readlen:" + localg.frx + " newOff:" + localg.hUZ + " netOff:" + this.keS + " line:" + com.tencent.mm.compatible.util.g.tF());
      if ((localg.ret < 0) || (localg.frx == 0))
      {
        w.e("MicroMsg.NetSceneThrowBottle", "Err doScene READ file[" + parame1.uhf + "] read ret:" + localg.ret + " readlen:" + localg.frx + " newOff:" + localg.hUZ + " netOff:" + this.keS);
        q.my(parame1.uhf);
        GMTrace.o(7599005106176L, 56617);
        return -1;
      }
      byte[] arrayOfByte = new byte[localg.frx];
      System.arraycopy(localg.buf, 0, arrayOfByte, 0, localg.frx);
      parame1.tKb = n.H(arrayOfByte);
      parame1.twV = this.keS;
    }
    w.e("MicroMsg.NetSceneThrowBottle", "doScene Error Msg type: " + this.msgType);
    GMTrace.o(7599005106176L, 56617);
    return -1;
  }
  
  protected final int a(p paramp)
  {
    GMTrace.i(7599139323904L, 56618);
    paramp = (bha)((com.tencent.mm.ac.b)paramp).hlU.hmc;
    if (paramp.mDF == 1)
    {
      i = k.b.hmE;
      GMTrace.o(7599139323904L, 56618);
      return i;
    }
    if (paramp.mDF != 3)
    {
      i = k.b.hmF;
      GMTrace.o(7599139323904L, 56618);
      return i;
    }
    if ((paramp.twU == 0) || (paramp.twU <= paramp.twV) || (bg.mZ(paramp.uhf)) || (bg.bp(n.a(paramp.tKb))))
    {
      i = k.b.hmF;
      GMTrace.o(7599139323904L, 56618);
      return i;
    }
    int i = k.b.hmE;
    GMTrace.o(7599139323904L, 56618);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, p paramp, byte[] paramArrayOfByte)
  {
    GMTrace.i(7599541977088L, 56621);
    w.d("MicroMsg.NetSceneThrowBottle", "onGYNetEnd errtype:" + paramInt2 + " errCode:" + paramInt3);
    paramp = (bha)this.gMC.hlU.hmc;
    paramArrayOfByte = (bhb)this.gMC.hlV.hmc;
    if (paramInt2 == 4) {
      switch (paramInt3)
      {
      default: 
        c.kV(paramArrayOfByte.tUj);
        c.kU(paramArrayOfByte.tUi);
      }
    }
    if ((paramInt2 != 0) || (paramInt3 != 0))
    {
      w.d("MicroMsg.NetSceneThrowBottle", "ERR: onGYNetEnd errtype:" + paramInt2 + " errCode:" + paramInt3);
      q.my(paramp.uhf);
      this.gMF.a(paramInt2, paramInt3, paramString, this);
      GMTrace.o(7599541977088L, 56621);
      return;
    }
    w.d("MicroMsg.NetSceneThrowBottle", "getStartPos " + paramArrayOfByte.twV);
    w.d("MicroMsg.NetSceneThrowBottle", "getTotalLen " + paramArrayOfByte.twU);
    w.d("MicroMsg.NetSceneThrowBottle", "getThrowCount " + paramArrayOfByte.tUi);
    w.d("MicroMsg.NetSceneThrowBottle", "getPickCount " + paramArrayOfByte.tUj);
    w.d("MicroMsg.NetSceneThrowBottle", "getDistance " + paramArrayOfByte.unQ);
    w.d("MicroMsg.NetSceneThrowBottle", "getBottleList " + paramArrayOfByte.uyq.size());
    paramInt1 = 0;
    while (paramInt1 < paramArrayOfByte.uyq.size())
    {
      w.d("MicroMsg.NetSceneThrowBottle", "bott id:" + paramArrayOfByte.uyq.get(paramInt1));
      paramInt1 += 1;
    }
    if (paramp.mDF == 1)
    {
      this.gMF.a(paramInt2, paramInt3, paramString, this);
      kX(1);
      GMTrace.o(7599541977088L, 56621);
      return;
    }
    this.keS += paramp.tKb.usf;
    if (this.keS >= paramp.twU)
    {
      c.kV(paramArrayOfByte.tUj);
      c.kU(paramArrayOfByte.tUi);
      kX(3);
      q.my(paramp.uhf);
      this.gMF.a(paramInt2, paramInt3, paramString, this);
      GMTrace.o(7599541977088L, 56621);
      return;
    }
    if (a(this.hmo, this.gMF) == -1)
    {
      this.gMF.a(3, -1, "doScene failed", this);
      GMTrace.o(7599541977088L, 56621);
      return;
    }
    GMTrace.o(7599541977088L, 56621);
  }
  
  protected final void a(k.a parama)
  {
    GMTrace.i(7599407759360L, 56620);
    w.e("MicroMsg.NetSceneThrowBottle", "setSecurityCheckError:" + parama + " type:" + this.msgType);
    GMTrace.o(7599407759360L, 56620);
  }
  
  public final int agV()
  {
    GMTrace.i(7599676194816L, 56622);
    int i = ((bhb)this.gMC.hlV.hmc).unQ;
    GMTrace.o(7599676194816L, 56622);
    return i;
  }
  
  public final int getType()
  {
    GMTrace.i(7599944630272L, 56624);
    GMTrace.o(7599944630272L, 56624);
    return 154;
  }
  
  protected final int vG()
  {
    GMTrace.i(7599273541632L, 56619);
    GMTrace.o(7599273541632L, 56619);
    return 10;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/bottle/a/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */