package com.tencent.mm.plugin.sns.lucky.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ac.d.a;
import com.tencent.mm.kernel.h;
import com.tencent.mm.platformtools.n;
import com.tencent.mm.protocal.c.bu;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.bh;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import com.tencent.mm.storage.w.a;
import com.tencent.mm.x.bp.a;
import java.util.Map;

public final class d
  implements bp.a
{
  public d()
  {
    GMTrace.i(8798777376768L, 65556);
    GMTrace.o(8798777376768L, 65556);
  }
  
  public final void a(d.a parama)
  {
    GMTrace.i(8798911594496L, 65557);
    w.i("MicroMsg.NewYearSNSAmountLevelCtrl2016NotifyLsn", "receivemsg NewYearSNSAmountLevelCtrl2016NotifyLsn");
    b.nK(67);
    if ((parama == null) || (parama.hme == null))
    {
      w.e("MicroMsg.NewYearSNSAmountLevelCtrl2016NotifyLsn", "onPreAddMessage cmdAM is null");
      GMTrace.o(8798911594496L, 65557);
      return;
    }
    e locale = new e();
    parama = n.a(parama.hme.tvq);
    locale.jPS = new StringBuffer();
    Map localMap = bh.p(parama, "sysmsg");
    locale.level = 0;
    if (localMap == null)
    {
      w.i("MicroMsg.NewYearSnsAmountLevel", "errr for paser %s", new Object[] { parama });
      b.nK(68);
    }
    for (;;)
    {
      w.i("MicroMsg.NewYearSnsAmountLevel", "dump NewYearSnsAmountLevel " + locale.jPS.toString());
      h.xA();
      h.xz().xi().a(w.a.uXT, parama);
      h.xA();
      h.xz().xi().kz(true);
      GMTrace.o(8798911594496L, 65557);
      return;
      locale.level = bg.RF((String)localMap.get(".sysmsg.NewYearSNSAmountLevelCtrl2016.Level"));
      w.i("MicroMsg.NewYearSnsAmountLevel", "get level %d", new Object[] { Integer.valueOf(locale.level) });
      if (locale.level == 0) {
        b.nK(69);
      } else if (locale.level == 1) {
        b.nK(70);
      } else if (locale.level == 2) {
        b.nK(71);
      } else if (locale.level == 3) {
        b.nK(72);
      } else if (locale.level == 4) {
        b.nK(73);
      }
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/sns/lucky/a/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */