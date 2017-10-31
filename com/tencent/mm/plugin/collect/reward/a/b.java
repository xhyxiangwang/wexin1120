package com.tencent.mm.plugin.collect.reward.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ac.b.a;
import com.tencent.mm.ac.b.b;
import com.tencent.mm.ac.b.c;
import com.tencent.mm.kernel.h;
import com.tencent.mm.network.p;
import com.tencent.mm.protocal.c.jz;
import com.tencent.mm.protocal.c.ka;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import com.tencent.mm.storage.w.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class b
  extends a
{
  private final String TAG;
  private com.tencent.mm.ac.b gMC;
  private com.tencent.mm.ac.e gMF;
  public ka kLe;
  public boolean kLf;
  
  public b(boolean paramBoolean)
  {
    GMTrace.i(19348290797568L, 144156);
    this.TAG = "MicroMsg.NetSceneQrRewardGetCode";
    b.a locala = new b.a();
    locala.hlX = new jz();
    locala.hlY = new ka();
    locala.hlW = 1323;
    locala.uri = "/cgi-bin/mmpay-bin/getrewardqrcode";
    locala.hlZ = 0;
    locala.hma = 0;
    this.gMC = locala.DA();
    ((jz)this.gMC.hlU.hmc).tGk = paramBoolean;
    this.kLf = paramBoolean;
    GMTrace.o(19348290797568L, 144156);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ac.e parame1)
  {
    GMTrace.i(19348559233024L, 144158);
    this.gMF = parame1;
    int i = a(parame, this.gMC, this);
    GMTrace.o(19348559233024L, 144158);
    return i;
  }
  
  protected final boolean anL()
  {
    GMTrace.i(19348693450752L, 144159);
    GMTrace.o(19348693450752L, 144159);
    return false;
  }
  
  public final void b(int paramInt1, int paramInt2, String paramString, p paramp)
  {
    GMTrace.i(19348827668480L, 144160);
    w.i("MicroMsg.NetSceneQrRewardGetCode", "errType: %s, errCode: %s, errMsg: %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
    this.kLe = ((ka)((com.tencent.mm.ac.b)paramp).hlV.hmc);
    w.i("MicroMsg.NetSceneQrRewardGetCode", "retcode: %s, retmsg: %s", new Object[] { Integer.valueOf(this.kLe.kKx), this.kLe.kKy });
    if ((!this.kLb) && (this.kLe.kKx != 0)) {
      this.kLc = true;
    }
    if ((!this.kLb) && (!this.kLc))
    {
      h.xz().xi().a(w.a.vdE, Integer.valueOf(this.kLe.tGs));
      h.xz().xi().a(w.a.vdF, Integer.valueOf(this.kLe.tGo));
      h.xz().xi().a(w.a.vdH, this.kLe.desc);
      h.xz().xi().a(w.a.vdG, this.kLe.klL);
      h.xz().xi().a(w.a.vdJ, Integer.valueOf(this.kLe.tGr));
      h.xz().xi().a(w.a.vdL, this.kLe.kpd);
      h.xz().xi().a(w.a.vdM, this.kLe.tGq);
      h.xz().xi().a(w.a.vdN, this.kLe.tGm);
      paramp = new ArrayList();
      Iterator localIterator = this.kLe.tGp.iterator();
      while (localIterator.hasNext()) {
        paramp.add(String.valueOf(((Integer)localIterator.next()).intValue()));
      }
      h.xz().xi().a(w.a.vdK, bg.c(paramp, ","));
    }
    if (this.gMF != null) {
      this.gMF.a(paramInt1, paramInt2, paramString, this);
    }
    GMTrace.o(19348827668480L, 144160);
  }
  
  public final int getType()
  {
    GMTrace.i(19348425015296L, 144157);
    GMTrace.o(19348425015296L, 144157);
    return 1323;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/collect/reward/a/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */