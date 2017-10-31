package com.tencent.mm.plugin.sns;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ac.b.b;
import com.tencent.mm.ac.e;
import com.tencent.mm.ac.k;
import com.tencent.mm.g.a.hl;
import com.tencent.mm.g.a.hl.a;
import com.tencent.mm.g.a.ni;
import com.tencent.mm.kernel.h;
import com.tencent.mm.plugin.sns.model.ae;
import com.tencent.mm.plugin.sns.model.ai;
import com.tencent.mm.plugin.sns.model.p;
import com.tencent.mm.plugin.sns.storage.m;
import com.tencent.mm.protocal.c.bdk;
import com.tencent.mm.protocal.c.bdl;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.b.c;
import com.tencent.mm.sdk.platformtools.aj;
import com.tencent.mm.sdk.platformtools.aj.a;
import com.tencent.mm.sdk.platformtools.w;
import java.util.LinkedList;

public final class d
  extends c<hl>
  implements e
{
  private int pFS;
  private bdk pFT;
  private m pFU;
  private aj pFV;
  
  public d()
  {
    GMTrace.i(8862665015296L, 66032);
    this.uLu = hl.class.getName().hashCode();
    GMTrace.o(8862665015296L, 66032);
  }
  
  private boolean a(hl paramhl)
  {
    GMTrace.i(8862799233024L, 66033);
    if (!(paramhl instanceof hl))
    {
      w.f("MicroMsg.GetSnsObjectDetailListener", "mismatched event");
      GMTrace.o(8862799233024L, 66033);
      return false;
    }
    this.pFS = paramhl.fDN.fzG;
    this.pFU = ae.bhp().uI(this.pFS);
    this.pFT = ai.m(this.pFU);
    if ((this.pFT != null) && (((this.pFT.ujv == 3) && (this.pFT.uvt != null) && (this.pFT.uvt.size() > 0)) || ((this.pFT.ujv == 5) && (this.pFT.uij != null) && (this.pFT.uij.size() > 0))))
    {
      paramhl.fDO.fDP = this.pFT;
      GMTrace.o(8862799233024L, 66033);
      return true;
    }
    paramhl = new p(this.pFU.field_snsId);
    ((bdl)paramhl.gMC.hlU.hmc).uvz = 1;
    h.xA();
    h.xy().gQO.a(210, this);
    h.xA();
    h.xy().gQO.a(paramhl, 0);
    this.pFV = new aj(new aj.a()
    {
      public final boolean pO()
      {
        GMTrace.i(8311164370944L, 61923);
        ni localni = new ni();
        localni.fLv.fDP = null;
        a.uLm.m(localni);
        GMTrace.o(8311164370944L, 61923);
        return false;
      }
    }, false);
    this.pFV.w(10000L, 10000L);
    GMTrace.o(8862799233024L, 66033);
    return true;
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(8862933450752L, 66034);
    w.i("MicroMsg.GetSnsObjectDetailListener", "dz:[onSceneEnd]errType:%d errCode:%d errMsg:%s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
    this.pFV.MM();
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      paramString = ae.bhp().dP(this.pFU.field_snsId);
      paramk = new ni();
      paramk.fLv.fDP = ai.m(paramString);
      a.uLm.m(paramk);
      GMTrace.o(8862933450752L, 66034);
      return;
    }
    paramString = new ni();
    paramString.fLv.fDP = null;
    a.uLm.m(paramString);
    GMTrace.o(8862933450752L, 66034);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/sns/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */