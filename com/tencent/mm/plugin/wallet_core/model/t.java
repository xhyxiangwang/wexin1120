package com.tencent.mm.plugin.wallet_core.model;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ac.e;
import com.tencent.mm.ac.k;
import com.tencent.mm.ac.n;
import com.tencent.mm.g.a.sc;
import com.tencent.mm.g.a.sc.b;
import com.tencent.mm.plugin.wallet_core.b.b.a;
import com.tencent.mm.sdk.b.c;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.x.ap;
import java.util.ArrayList;

public final class t
  extends c<sc>
  implements e
{
  private boolean lYu;
  private sc rQM;
  
  public t()
  {
    GMTrace.i(6904159928320L, 51440);
    this.lYu = false;
    this.uLu = sc.class.getName().hashCode();
    GMTrace.o(6904159928320L, 51440);
  }
  
  private void a(int paramInt, String paramString, k paramk)
  {
    boolean bool2 = true;
    GMTrace.i(6904562581504L, 51443);
    ae localae;
    if (this.rQM != null)
    {
      this.rQM.fQh.errCode = paramInt;
      this.rQM.fQh.ftU = paramString;
      this.rQM.fQh.fQi = m.bwE().bwY();
      paramString = this.rQM.fQh;
      localae = m.bwE();
      if (((localae.rRr == null) || (!localae.rRr.bwR())) && ((localae.rEV == null) || (localae.rEV.size() <= 0))) {
        break label698;
      }
      paramInt = 1;
      if (paramInt == 0) {
        break label703;
      }
      bool1 = false;
      label116:
      paramString.fQj = bool1;
      paramString = this.rQM.fQh;
      localae = m.bwE();
      ArrayList localArrayList1 = new ArrayList();
      ArrayList localArrayList2 = new ArrayList();
      localae.d(localArrayList1, localArrayList2);
      if (!ae.bG(localArrayList2)) {
        break label734;
      }
    }
    label698:
    label703:
    label734:
    for (boolean bool1 = bool2;; bool1 = false)
    {
      paramString.fQk = bool1;
      this.rQM.fQh.fQl = m.bwE().bxc().bwR();
      this.rQM.fQh.fQm = m.bwE().bxb();
      this.rQM.fQh.fQn = m.bwE().aoj();
      this.rQM.fQh.fQo = m.bwE().bwZ();
      this.rQM.fQh.fQp = m.bwE().bxc().bwU();
      this.rQM.fQh.fQq = "";
      if ((paramk != null) && ((paramk instanceof com.tencent.mm.plugin.wallet_core.b.m)))
      {
        this.rQM.fQh.fQq = ((com.tencent.mm.plugin.wallet_core.b.m)paramk).fQq;
        this.rQM.fQh.fQr = ((com.tencent.mm.plugin.wallet_core.b.m)paramk).fQr;
        this.rQM.fQh.fQs = ((com.tencent.mm.plugin.wallet_core.b.m)paramk).fQs;
        this.rQM.fQh.fQt = ((com.tencent.mm.plugin.wallet_core.b.m)paramk).fQt;
        this.rQM.fQh.fQu = ((com.tencent.mm.plugin.wallet_core.b.m)paramk).fQu;
        this.rQM.fQh.scene = ((com.tencent.mm.plugin.wallet_core.b.m)paramk).scene;
        this.rQM.fQh.fQv = ((com.tencent.mm.plugin.wallet_core.b.m)paramk).fQv;
        this.rQM.fQh.fQw = ((com.tencent.mm.plugin.wallet_core.b.m)paramk).fQw;
        this.rQM.fQh.fQx = ((com.tencent.mm.plugin.wallet_core.b.m)paramk).fQx;
        this.rQM.fQh.fQy = ((com.tencent.mm.plugin.wallet_core.b.m)paramk).fQy;
        this.rQM.fQh.fQz = ((com.tencent.mm.plugin.wallet_core.b.m)paramk).fQz;
        this.rQM.fQh.fQA = ((com.tencent.mm.plugin.wallet_core.b.m)paramk).fQA;
        this.rQM.fQh.fQB = ((com.tencent.mm.plugin.wallet_core.b.m)paramk).fQB;
        this.rQM.fQh.title = ((com.tencent.mm.plugin.wallet_core.b.m)paramk).title;
        this.rQM.fQh.fQC = ((com.tencent.mm.plugin.wallet_core.b.m)paramk).fQC;
        this.rQM.fQh.fQD = ((com.tencent.mm.plugin.wallet_core.b.m)paramk).fQD;
      }
      w.d("MicroMsg.WalletGetUserInfoEventListener", "mUserInfo needBind : " + this.rQM.fQh.fQj + " hasNewTips : " + this.rQM.fQh.fQk + " swipeOn : " + this.rQM.fQh.fQl);
      if (this.rQM.fwM != null) {
        this.rQM.fwM.run();
      }
      if (this.rQM.fQh.fQb != null) {
        this.rQM.fQh.fQb.run();
      }
      if (this.lYu) {
        this.rQM = null;
      }
      GMTrace.o(6904562581504L, 51443);
      return;
      paramInt = 0;
      break;
      if ((localae.rEU != null) && (localae.rEU.size() > 0))
      {
        bool1 = false;
        break label116;
      }
      bool1 = true;
      break label116;
    }
  }
  
  private boolean a(sc paramsc)
  {
    GMTrace.i(6904294146048L, 51441);
    if (!(paramsc instanceof sc))
    {
      w.f("MicroMsg.WalletGetUserInfoEventListener", "mismatched event");
      GMTrace.o(6904294146048L, 51441);
      return false;
    }
    this.lYu = false;
    this.rQM = paramsc;
    ap.wT().a(385, this);
    ap.wT().a(1518, this);
    if (m.bwE().bwX())
    {
      w.i("MicroMsg.WalletGetUserInfoEventListener", "data is invalid. doScene");
      if (com.tencent.mm.x.m.zS()) {
        ap.wT().a(new a(), 0);
      }
    }
    for (;;)
    {
      GMTrace.o(6904294146048L, 51441);
      return true;
      ap.wT().a(new com.tencent.mm.plugin.wallet_core.b.m(null, 1), 0);
      continue;
      paramsc = m.bwE();
      long l = bg.aE(paramsc.rRw);
      w.i("MicroMsg.WalletUserInfoManger", "dead time : %d, nowSec: %d, pass time " + l, new Object[] { Long.valueOf(paramsc.rRw), Long.valueOf(System.currentTimeMillis() / 1000L) });
      int i;
      if (l > 0L) {
        i = 1;
      }
      for (;;)
      {
        if (i != 0)
        {
          w.i("MicroMsg.WalletGetUserInfoEventListener", "data is checkTimeOut, do NetSceneTenpayQueryBoundBankcard");
          if (com.tencent.mm.x.m.zS())
          {
            ap.wT().a(new a(), 0);
            break;
            i = 0;
            continue;
          }
          ap.wT().a(new com.tencent.mm.plugin.wallet_core.b.m(null, 1), 0);
          break;
        }
      }
      this.lYu = true;
      w.i("MicroMsg.WalletGetUserInfoEventListener", "data is ok. doCallback");
      a(0, "", null);
    }
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(6904428363776L, 51442);
    if (((paramk instanceof com.tencent.mm.plugin.wallet_core.b.m)) || ((paramk instanceof a)))
    {
      ap.wT().b(385, this);
      ap.wT().b(1518, this);
      this.lYu = true;
      a(paramInt2, paramString, paramk);
    }
    GMTrace.o(6904428363776L, 51442);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/wallet_core/model/t.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */