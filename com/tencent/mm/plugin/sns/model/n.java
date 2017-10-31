package com.tencent.mm.plugin.sns.model;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ac.b.a;
import com.tencent.mm.ac.b.b;
import com.tencent.mm.ac.b.c;
import com.tencent.mm.ac.k;
import com.tencent.mm.network.j;
import com.tencent.mm.network.p;
import com.tencent.mm.plugin.sns.storage.f;
import com.tencent.mm.plugin.sns.storage.m;
import com.tencent.mm.protocal.c.asw;
import com.tencent.mm.protocal.c.axs;
import com.tencent.mm.protocal.c.axt;
import com.tencent.mm.protocal.c.bct;
import com.tencent.mm.protocal.c.bcu;
import com.tencent.mm.protocal.c.bcz;
import com.tencent.mm.protocal.c.bda;
import com.tencent.mm.protocal.c.bdb;
import com.tencent.mm.protocal.c.bdk;
import com.tencent.mm.protocal.c.bds;
import com.tencent.mm.sdk.platformtools.w;
import java.util.LinkedList;
import java.util.Locale;

public final class n
  extends k
  implements j
{
  private com.tencent.mm.ac.b gMC;
  public com.tencent.mm.ac.e gMF;
  private String qbc;
  private bcu qbd;
  private int type;
  
  public n(bcu parambcu, String paramString)
  {
    GMTrace.i(8111448391680L, 60435);
    Object localObject = new b.a();
    ((b.a)localObject).hlX = new bda();
    ((b.a)localObject).hlY = new bdb();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/mmsnscomment";
    ((b.a)localObject).hlW = 213;
    ((b.a)localObject).hlZ = 100;
    ((b.a)localObject).hma = 1000000100;
    this.gMC = ((b.a)localObject).DA();
    localObject = (bda)this.gMC.hlU.hmc;
    ((bda)localObject).uut = parambcu;
    this.type = parambcu.uuL.jXP;
    this.qbd = parambcu;
    ((bda)localObject).tvh = paramString;
    this.qbc = paramString;
    w.d("MicroMsg.NetSceneSnsComment", parambcu.uuL.upg + " " + parambcu.uuL.tMZ);
    GMTrace.o(8111448391680L, 60435);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ac.e parame1)
  {
    GMTrace.i(8111582609408L, 60436);
    Object localObject2 = ae.bhp().dP(this.qbd.tDg);
    Object localObject1 = localObject2;
    if (localObject2 == null)
    {
      com.tencent.mm.plugin.sns.storage.e locale = ae.bhr().dI(this.qbd.tDg);
      localObject1 = localObject2;
      if (locale != null) {
        localObject1 = locale.bjN();
      }
    }
    if (localObject1 != null) {}
    try
    {
      localObject1 = (bdk)new bdk().aC(((m)localObject1).field_attrBuf);
      if ((((bdk)localObject1).uvv != null) && (((bdk)localObject1).uvv.usi))
      {
        localObject2 = (bds)new bds().aC(((bdk)localObject1).uvv.ush.toK);
        localObject1 = (bda)this.gMC.hlU.hmc;
        if (((bds)localObject2).uvK != null)
        {
          localObject2 = String.format(Locale.US, "preloadLayerId=%d&preloadExpId=%d", new Object[] { Integer.valueOf(((bds)localObject2).uvK.tKO), Integer.valueOf(((bds)localObject2).uvK.tKP) });
          w.i("MicroMsg.NetSceneSnsComment", "doScene(sight_autodownload) snsStatExt:%s", new Object[] { localObject2 });
          ((bda)localObject1).uuu = new axt().Qx((String)localObject2);
        }
      }
      this.gMF = parame1;
      int i = a(parame, this.gMC, this);
      GMTrace.o(8111582609408L, 60436);
      return i;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        w.printErrStackTrace("MicroMsg.NetSceneSnsComment", localException, "", new Object[0]);
      }
    }
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, p paramp, byte[] paramArrayOfByte)
  {
    GMTrace.i(8111851044864L, 60438);
    w.d("MicroMsg.NetSceneSnsComment", "netId : " + paramInt1 + " errType :" + paramInt2 + " errCode: " + paramInt3 + " errMsg :" + paramString);
    if ((paramInt2 != 0) || (paramInt3 != 0))
    {
      if (paramInt2 == 4) {
        ae.bho().c(this.qbd.tDg, this.type, this.qbc);
      }
      this.gMF.a(paramInt2, paramInt3, paramString, this);
      GMTrace.o(8111851044864L, 60438);
      return;
    }
    ae.bho().c(this.qbd.tDg, this.type, this.qbc);
    paramp = this.qbd.uuL;
    if ((paramp.jXP == 1) || (paramp.jXP == 2) || (paramp.jXP == 3) || (paramp.jXP == 5))
    {
      paramArrayOfByte = new bcz();
      paramArrayOfByte.orU = paramp.orU;
      paramArrayOfByte.jXP = paramp.jXP;
      paramArrayOfByte.twh = paramp.twh;
      paramArrayOfByte.twR = paramp.upg;
      paramArrayOfByte.ufQ = paramp.uuB;
      paramArrayOfByte.ovi = paramp.ovi;
      paramArrayOfByte.uuJ = paramp.uuJ;
    }
    for (;;)
    {
      try
      {
        paramArrayOfByte = ((bdb)this.gMC.hlV.hmc).uuw;
        if ((paramp.jXP != 1) && (paramp.jXP != 5)) {
          continue;
        }
        w.i("MicroMsg.NetSceneSnsComment", "snsComment:" + paramArrayOfByte.tDg + " " + com.tencent.mm.platformtools.n.b(paramArrayOfByte.uve) + " " + paramArrayOfByte.uvi.size() + " " + paramArrayOfByte.uvl.size());
        ai.d(paramArrayOfByte);
      }
      catch (Exception paramp)
      {
        w.printErrStackTrace("MicroMsg.NetSceneSnsComment", paramp, "", new Object[0]);
        continue;
      }
      ae.bho().bgQ();
      break;
      w.i("MicroMsg.NetSceneSnsComment", "snsComment:" + paramArrayOfByte.tDg + " " + paramArrayOfByte.uvi.size() + " " + paramArrayOfByte.uvl.size());
    }
  }
  
  public final int getType()
  {
    GMTrace.i(8111716827136L, 60437);
    GMTrace.o(8111716827136L, 60437);
    return 213;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/sns/model/n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */