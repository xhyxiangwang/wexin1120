package com.tencent.mm.plugin.offline;

import android.content.Context;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.l;
import com.tencent.mm.g.a.sr;
import com.tencent.mm.plugin.offline.a.r;
import com.tencent.mm.plugin.offline.a.r.a;
import com.tencent.mm.plugin.offline.a.r.c;
import com.tencent.mm.plugin.offline.a.r.e;
import com.tencent.mm.plugin.offline.a.r.f;
import com.tencent.mm.plugin.wallet_core.model.Orders;
import com.tencent.mm.plugin.wallet_core.model.Orders.Commodity;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.b.c;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.wallet_core.ui.e;
import java.util.List;

public final class m
  implements r.a
{
  c nxx;
  
  public m()
  {
    GMTrace.i(6255619866624L, 46608);
    this.nxx = new c() {};
    a.uLm.b(this.nxx);
    k.aTF();
    k.aTG().a(this);
    GMTrace.o(6255619866624L, 46608);
  }
  
  private static void ah(int paramInt, String paramString)
  {
    GMTrace.i(6255754084352L, 46609);
    sr localsr = new sr();
    localsr.fRk.fRm = paramInt;
    localsr.fRk.action = 4;
    localsr.fRk.content = paramString;
    a.uLm.m(localsr);
    GMTrace.o(6255754084352L, 46609);
  }
  
  public final boolean a(r.c paramc)
  {
    GMTrace.i(6255888302080L, 46610);
    if (paramc.ook == 6)
    {
      paramc = (r.f)paramc;
      if ((paramc.oor.rPj != null) && (paramc.oor.rPj.size() > 0))
      {
        paramc = (Orders.Commodity)paramc.oor.rPj.get(0);
        ah(0, ab.getContext().getString(R.l.faP, new Object[] { e.d(paramc.kKX, paramc.ori) }));
      }
    }
    for (;;)
    {
      GMTrace.o(6255888302080L, 46610);
      return false;
      ah(9, ab.getContext().getString(R.l.eZQ));
      continue;
      if (paramc.ook == 8) {
        ah(6, ab.getContext().getString(R.l.eZQ));
      } else if (paramc.ook == 5) {
        ah(7, bg.ap(((r.e)paramc).ooo, ""));
      } else if (paramc.ook == 4) {
        ah(8, ab.getContext().getString(R.l.eZR));
      }
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/offline/m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */