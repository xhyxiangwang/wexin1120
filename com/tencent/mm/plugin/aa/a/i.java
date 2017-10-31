package com.tencent.mm.plugin.aa.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ac.k;
import com.tencent.mm.ac.n;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.vending.g.b;
import com.tencent.mm.x.ap;

public final class i
  implements com.tencent.mm.ac.e
{
  long fxK;
  b hlQ;
  
  public i()
  {
    GMTrace.i(5585470750720L, 41615);
    this.fxK = -1L;
    GMTrace.o(5585470750720L, 41615);
  }
  
  public final void PK()
  {
    GMTrace.i(5585739186176L, 41617);
    ap.wT().b(1530, this);
    GMTrace.o(5585739186176L, 41617);
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(5585873403904L, 41618);
    w.i("MicroMsg.CloseAALogic", "onSceneEnd, errType: %s, errCode: %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      paramString = ((com.tencent.mm.plugin.aa.a.a.e)paramk).ihn;
      w.i("MicroMsg.CloseAALogic", "closeAA, response.retcode: %s", new Object[] { Integer.valueOf(paramString.kKx) });
      w.d("MicroMsg.CloseAALogic", "closeAA, response.msgxml: %s", new Object[] { paramString.tru });
      if (paramString.kKx == 0)
      {
        com.tencent.mm.vending.g.g.a(this.hlQ, new Object[] { Boolean.valueOf(true) });
        if ((!bg.mZ(paramString.tru)) && (this.fxK > 0L) && (((com.tencent.mm.plugin.aa.a.a.e)paramk).scene == a.igx)) {
          h.h(this.fxK, paramString.tru);
        }
        com.tencent.mm.plugin.report.service.g.paX.a(407L, 21L, 1L, false);
        GMTrace.o(5585873403904L, 41618);
        return;
      }
      if ((paramString.kKx > 0) && (!bg.mZ(paramString.kKy)))
      {
        this.hlQ.bR(paramString.kKy);
        com.tencent.mm.plugin.report.service.g.paX.a(407L, 11L, 1L, false);
        GMTrace.o(5585873403904L, 41618);
        return;
      }
      this.hlQ.bR(Boolean.valueOf(false));
      com.tencent.mm.plugin.report.service.g.paX.a(407L, 23L, 1L, false);
      GMTrace.o(5585873403904L, 41618);
      return;
    }
    this.hlQ.bR(Boolean.valueOf(false));
    com.tencent.mm.plugin.report.service.g.paX.a(407L, 22L, 1L, false);
    GMTrace.o(5585873403904L, 41618);
  }
  
  public final void init()
  {
    GMTrace.i(5585604968448L, 41616);
    ap.wT().a(1530, this);
    GMTrace.o(5585604968448L, 41616);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/aa/a/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */