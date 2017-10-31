package com.tencent.mm.plugin.aa.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ac.e;
import com.tencent.mm.ac.k;
import com.tencent.mm.plugin.aa.a.a.j;
import com.tencent.mm.plugin.aa.a.b.d;
import com.tencent.mm.protocal.c.v;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;

public final class b
  implements e
{
  com.tencent.mm.vending.g.b igB;
  
  public b()
  {
    GMTrace.i(5601040007168L, 41731);
    GMTrace.o(5601040007168L, 41731);
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(5601174224896L, 41732);
    w.i("MicroMsg.AAGetPaylistDetailLogic", "onSceneEnd, errType: %s, errCode: %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      paramString = ((j)paramk).ihx;
      w.i("MicroMsg.AAGetPaylistDetailLogic", "AAQueryDetailRes, onSceneEnd, retCode: %s", new Object[] { Integer.valueOf(paramString.kKx) });
      if (paramString.kKx == 0)
      {
        com.tencent.mm.vending.g.g.a(this.igB, new Object[] { paramString });
        com.tencent.mm.plugin.report.service.g.paX.a(407L, 6L, 1L, false);
        paramk = com.tencent.mm.plugin.aa.b.Pz().ni(paramString.trs);
        if (paramk != null)
        {
          paramk.field_status = paramString.state;
          com.tencent.mm.plugin.aa.b.Pz().b(paramk);
        }
        GMTrace.o(5601174224896L, 41732);
        return;
      }
      if ((paramString.kKx > 0) && (!bg.mZ(paramString.kKy))) {
        this.igB.bR(paramString.kKy);
      }
      for (;;)
      {
        com.tencent.mm.plugin.report.service.g.paX.a(407L, 8L, 1L, false);
        GMTrace.o(5601174224896L, 41732);
        return;
        this.igB.bR(Boolean.valueOf(false));
      }
    }
    if (this.igB != null) {
      this.igB.bR(Boolean.valueOf(false));
    }
    com.tencent.mm.plugin.report.service.g.paX.a(407L, 7L, 1L, false);
    GMTrace.o(5601174224896L, 41732);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/aa/a/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */