package com.tencent.mm.plugin.sns.model;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ac.b;
import com.tencent.mm.ac.b.a;
import com.tencent.mm.ac.b.b;
import com.tencent.mm.ac.b.c;
import com.tencent.mm.ac.k;
import com.tencent.mm.modelstat.o;
import com.tencent.mm.network.p;
import com.tencent.mm.platformtools.n;
import com.tencent.mm.plugin.sns.storage.f;
import com.tencent.mm.protocal.c.bcm;
import com.tencent.mm.protocal.c.bcn;
import com.tencent.mm.protocal.c.bcp;
import com.tencent.mm.protocal.c.bct;
import com.tencent.mm.protocal.c.bcu;
import com.tencent.mm.protocal.c.bcz;
import com.tencent.mm.protocal.c.bdk;
import com.tencent.mm.protocal.c.bdy;
import com.tencent.mm.protocal.c.bfj;
import com.tencent.mm.protocal.c.bhc;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.util.LinkedList;

public final class j
  extends k
  implements com.tencent.mm.network.j
{
  private b gMC;
  public com.tencent.mm.ac.e gMF;
  private String qbc;
  private bcu qbd;
  private int type;
  
  public j(bcu parambcu, String paramString1, String paramString2)
  {
    GMTrace.i(8078430830592L, 60189);
    Object localObject = new b.a();
    ((b.a)localObject).hlX = new bcm();
    ((b.a)localObject).hlY = new bcn();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/mmsnsadcomment";
    ((b.a)localObject).hlW = 682;
    ((b.a)localObject).hlZ = 0;
    ((b.a)localObject).hma = 0;
    this.gMC = ((b.a)localObject).DA();
    localObject = (bcm)this.gMC.hlU.hmc;
    ((bcm)localObject).uut = parambcu;
    this.type = parambcu.uuL.jXP;
    this.qbd = parambcu;
    ((bcm)localObject).tvh = paramString1;
    this.qbc = paramString1;
    long l = parambcu.tDg;
    paramString1 = ae.bhr().dI(l);
    if (paramString1 != null)
    {
      paramString1 = paramString1.bjL();
      if (paramString1 != null)
      {
        paramString1 = o.lt(paramString1.qBT);
        if (paramString1 != null)
        {
          ((bcm)localObject).uuu = n.mV(o.a(paramString1));
          ((bcm)localObject).twh = paramString1.cyK;
        }
        ((bcm)localObject).uus = n.mV(bg.ap(paramString2, ""));
        w.i("MicroMsg.NetSceneSnsAdComment", parambcu.uuL.upg + " " + parambcu.uuL.tMZ + " type " + parambcu.uuL.jXP + " aduxinfo " + paramString2 + ", SnsStat=" + ((bcm)localObject).uuu + ", source=" + ((bcm)localObject).twh);
        GMTrace.o(8078430830592L, 60189);
        return;
      }
      w.v("SnsAdExtUtil", "parseStatSnsAdInfo snsInfo null, snsId %d", new Object[] { Long.valueOf(l) });
    }
    for (;;)
    {
      paramString1 = null;
      break;
      w.v("SnsAdExtUtil", "parseStatSnsAdInfo snsInfo null, snsId %d", new Object[] { Long.valueOf(l) });
    }
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ac.e parame1)
  {
    GMTrace.i(8078565048320L, 60190);
    this.gMF = parame1;
    int i = a(parame, this.gMC, this);
    GMTrace.o(8078565048320L, 60190);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, p paramp, byte[] paramArrayOfByte)
  {
    GMTrace.i(8078833483776L, 60192);
    w.d("MicroMsg.NetSceneSnsAdComment", "netId : " + paramInt1 + " errType :" + paramInt2 + " errCode: " + paramInt3 + " errMsg :" + paramString);
    if ((paramInt2 != 0) || (paramInt3 != 0))
    {
      if (paramInt2 == 4) {
        ae.bho().c(this.qbd.tDg, this.type, this.qbc);
      }
      this.gMF.a(paramInt2, paramInt3, paramString, this);
      GMTrace.o(8078833483776L, 60192);
      return;
    }
    ae.bho().c(this.qbd.tDg, this.type, this.qbc);
    paramp = this.qbd.uuL;
    if ((paramp.jXP == 1) || (paramp.jXP == 2) || (paramp.jXP == 3) || (paramp.jXP == 5) || (paramp.jXP == 7) || (paramp.jXP == 8))
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
        paramp = (bcm)this.gMC.hlU.hmc;
        paramArrayOfByte = (bcn)this.gMC.hlV.hmc;
        if ((paramp.twh != 1) && (paramp.twh != 2)) {
          continue;
        }
        paramArrayOfByte = paramArrayOfByte.uqI;
        paramp = paramArrayOfByte.uuw;
        a.a(paramArrayOfByte);
        w.d("MicroMsg.NetSceneSnsAdComment", "snsComment:" + paramp.toString() + " " + paramp.uvi.size() + " " + paramp.uvl.size());
      }
      catch (Exception paramp)
      {
        w.printErrStackTrace("MicroMsg.NetSceneSnsAdComment", paramp, "", new Object[0]);
        continue;
      }
      ae.bho().bgQ();
      break;
      paramArrayOfByte = paramArrayOfByte.tvF;
      paramp = paramArrayOfByte.uuw;
      a.b(paramArrayOfByte);
    }
  }
  
  public final int getType()
  {
    GMTrace.i(8078699266048L, 60191);
    GMTrace.o(8078699266048L, 60191);
    return 682;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/sns/model/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */