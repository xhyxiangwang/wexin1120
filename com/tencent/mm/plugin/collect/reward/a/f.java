package com.tencent.mm.plugin.collect.reward.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ac.b;
import com.tencent.mm.ac.b.a;
import com.tencent.mm.ac.b.b;
import com.tencent.mm.ac.b.c;
import com.tencent.mm.kernel.h;
import com.tencent.mm.network.p;
import com.tencent.mm.protocal.c.kq;
import com.tencent.mm.protocal.c.kr;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import com.tencent.mm.storage.w.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class f
  extends a
{
  private final String TAG;
  private b gMC;
  private com.tencent.mm.ac.e gMF;
  public kr kLj;
  
  public f(LinkedList<Integer> paramLinkedList, String paramString, boolean paramBoolean1, boolean paramBoolean2)
  {
    GMTrace.i(19351780458496L, 144182);
    this.TAG = "MicroMsg.NetSceneQrRewardSetCode";
    Object localObject = new b.a();
    ((b.a)localObject).hlX = new kq();
    ((b.a)localObject).hlY = new kr();
    ((b.a)localObject).hlW = 1562;
    ((b.a)localObject).uri = "/cgi-bin/mmpay-bin/setrewardqrcode";
    ((b.a)localObject).hlZ = 0;
    ((b.a)localObject).hma = 0;
    this.gMC = ((b.a)localObject).DA();
    localObject = (kq)this.gMC.hlU.hmc;
    ((kq)localObject).tGp = paramLinkedList;
    ((kq)localObject).desc = paramString;
    ((kq)localObject).tGO = paramBoolean1;
    ((kq)localObject).tGP = paramBoolean2;
    w.i("MicroMsg.NetSceneQrRewardSetCode", "desc: %s, flag: %s, default: %s", new Object[] { paramString, Boolean.valueOf(paramBoolean1), Boolean.valueOf(paramBoolean2) });
    GMTrace.o(19351780458496L, 144182);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ac.e parame1)
  {
    GMTrace.i(19352048893952L, 144184);
    this.gMF = parame1;
    int i = a(parame, this.gMC, this);
    GMTrace.o(19352048893952L, 144184);
    return i;
  }
  
  public final void b(int paramInt1, int paramInt2, String paramString, p paramp)
  {
    GMTrace.i(19352183111680L, 144185);
    w.i("MicroMsg.NetSceneQrRewardSetCode", "errType: %s, errCode: %s, errMsg: %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
    this.kLj = ((kr)((b)paramp).hlV.hmc);
    w.i("MicroMsg.NetSceneQrRewardSetCode", "retcode: %s, retmsg: %s", new Object[] { Integer.valueOf(this.kLj.kKx), this.kLj.kKy });
    if ((!this.kLb) && (this.kLj.kKx != 0)) {
      this.kLc = true;
    }
    if ((!this.kLb) && (!this.kLc))
    {
      h.xz().xi().a(w.a.vdE, Integer.valueOf(this.kLj.tGs));
      h.xz().xi().a(w.a.vdF, Integer.valueOf(this.kLj.tGo));
      h.xz().xi().a(w.a.vdH, this.kLj.desc);
      h.xz().xi().a(w.a.vdN, this.kLj.tGm);
      paramp = new ArrayList();
      Iterator localIterator = this.kLj.tGp.iterator();
      while (localIterator.hasNext()) {
        paramp.add(String.valueOf(((Integer)localIterator.next()).intValue()));
      }
      h.xz().xi().a(w.a.vdK, bg.c(paramp, ","));
    }
    if (this.gMF != null) {
      this.gMF.a(paramInt1, paramInt2, paramString, this);
    }
    GMTrace.o(19352183111680L, 144185);
  }
  
  public final int getType()
  {
    GMTrace.i(19351914676224L, 144183);
    GMTrace.o(19351914676224L, 144183);
    return 1562;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/collect/reward/a/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */