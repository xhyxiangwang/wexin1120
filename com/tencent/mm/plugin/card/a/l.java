package com.tencent.mm.plugin.card.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ac.e;
import com.tencent.mm.ac.k;
import com.tencent.mm.ac.n;
import com.tencent.mm.plugin.card.model.u;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.x.ap;

public final class l
  implements e
{
  public float gBS;
  public float gBT;
  private long iEK;
  
  public l()
  {
    GMTrace.i(5129398910976L, 38217);
    this.gBS = -85.0F;
    this.gBT = -1000.0F;
    this.iEK = 0L;
    GMTrace.o(5129398910976L, 38217);
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(5129801564160L, 38220);
    w.i("MicroMsg.CardReportLBSManager", "rplbs onGYNetEnd, errType = %d, errCode = %d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    ap.wT().b(1253, this);
    GMTrace.o(5129801564160L, 38220);
  }
  
  public final void m(String paramString1, String paramString2, int paramInt)
  {
    GMTrace.i(5129667346432L, 38219);
    if (System.currentTimeMillis() / 1000L - this.iEK > 1800L)
    {
      this.gBS = -85.0F;
      this.gBT = -1000.0F;
      w.i("MicroMsg.CardReportLBSManager", "checkDataValid time is out");
    }
    if (this.gBS == -85.0F) {
      w.i("MicroMsg.CardReportLBSManager", "checkDataValid lbsLatitude ==  LocationGeo.INVALID_LAT");
    }
    if (this.gBT == -1000.0F) {
      w.i("MicroMsg.CardReportLBSManager", "checkDataValid lbsLongitude ==  LocationGeo.INVALID_LNG");
    }
    ap.wT().a(1253, this);
    paramString1 = new u(this.gBS, this.gBT, paramString1, paramString2, paramInt);
    ap.wT().a(paramString1, 0);
    GMTrace.o(5129667346432L, 38219);
  }
  
  public final void s(float paramFloat1, float paramFloat2)
  {
    GMTrace.i(5129533128704L, 38218);
    this.gBS = paramFloat1;
    this.gBT = paramFloat2;
    this.iEK = (System.currentTimeMillis() / 1000L);
    GMTrace.o(5129533128704L, 38218);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/card/a/l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */