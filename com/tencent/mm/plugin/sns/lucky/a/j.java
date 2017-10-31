package com.tencent.mm.plugin.sns.lucky.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ac.d.a;
import com.tencent.mm.kernel.e;
import com.tencent.mm.platformtools.n;
import com.tencent.mm.protocal.c.bu;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.bh;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import com.tencent.mm.storage.w.a;
import com.tencent.mm.x.bp.a;
import java.util.LinkedList;
import java.util.Map;

public final class j
  implements bp.a
{
  public static String TAG;
  
  static
  {
    GMTrace.i(8800119554048L, 65566);
    TAG = "MicroMsg.NewYearSnsTips2016NotifyLsn";
    GMTrace.o(8800119554048L, 65566);
  }
  
  public j()
  {
    GMTrace.i(8799851118592L, 65564);
    GMTrace.o(8799851118592L, 65564);
  }
  
  public final void a(d.a parama)
  {
    GMTrace.i(8799985336320L, 65565);
    w.i(TAG, "receivemsg NewYearSnsTips2016NotifyLsn");
    b.nK(74);
    if ((parama == null) || (parama.hme == null))
    {
      w.e(TAG, "onPreAddMessage cmdAM is null");
      GMTrace.o(8799985336320L, 65565);
      return;
    }
    i locali = new i();
    String str1 = n.a(parama.hme.tvq);
    locali.jPS = new StringBuffer();
    Map localMap = bh.p(str1, "sysmsg");
    locali.pZv.clear();
    if (localMap == null)
    {
      w.i("MicroMsg.NewYearSnsTips", "errr for paser %s", new Object[] { str1 });
      b.nK(75);
    }
    for (;;)
    {
      w.i("MicroMsg.NewYearSnsTips", "dump NewYearSnsTips " + locali.jPS.toString());
      com.tencent.mm.kernel.h.xA();
      com.tencent.mm.kernel.h.xz().xi().a(w.a.uXI, str1);
      com.tencent.mm.kernel.h.xA();
      com.tencent.mm.kernel.h.xz().xi().kz(true);
      GMTrace.o(8799985336320L, 65565);
      return;
      int i = 0;
      label203:
      long l1;
      label272:
      long l2;
      label343:
      String str2;
      if (i == 0)
      {
        parama = "";
        l1 = bg.RG((String)localMap.get(String.format(".sysmsg.NewYearSNSTips2016.Tips%s.%s", new Object[] { parama, "BeginTime" })));
        locali.jPS.append("BeginTime:" + l1 + ";");
        if (i != 0) {
          break label549;
        }
        parama = "";
        l2 = bg.RG((String)localMap.get(String.format(".sysmsg.NewYearSNSTips2016.Tips%s.%s", new Object[] { parama, "EndTime" })));
        locali.jPS.append("EndTime:" + l2 + ";");
        if (i != 0) {
          break label557;
        }
        parama = "";
        str2 = bg.ap((String)localMap.get(String.format(".sysmsg.NewYearSNSTips2016.Tips%s.%s", new Object[] { parama, "ActionID" })), "");
        locali.jPS.append("ActionID:" + str2 + ";");
        if (bg.mZ(str2)) {
          break label573;
        }
        if (i != 0) {
          break label565;
        }
      }
      label549:
      label557:
      label565:
      for (parama = "";; parama = String.valueOf(i))
      {
        parama = bg.ap((String)localMap.get(String.format(".sysmsg.NewYearSNSTips2016.Tips%s.%s", new Object[] { parama, "TipsMessage" })), "");
        locali.jPS.append("TipsMessage:" + parama + ";\n");
        h localh = new h();
        localh.pZs = str2;
        localh.pYI = l1;
        localh.jYa = l2;
        localh.pZt = parama;
        locali.pZv.add(localh);
        i += 1;
        break;
        parama = String.valueOf(i);
        break label203;
        parama = String.valueOf(i);
        break label272;
        parama = String.valueOf(i);
        break label343;
      }
      label573:
      if (locali.pZv.size() == 0) {
        b.nK(76);
      }
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/sns/lucky/a/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */