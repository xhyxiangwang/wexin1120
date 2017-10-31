package com.tencent.mm.plugin.ipcall.a.f;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ac.n;
import com.tencent.mm.plugin.ipcall.a.a.a;
import com.tencent.mm.plugin.ipcall.a.a.c;
import com.tencent.mm.plugin.ipcall.a.d.l;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.x.ap;

public final class g
  extends a
{
  public g()
  {
    GMTrace.i(11597082787840L, 86405);
    GMTrace.o(11597082787840L, 86405);
  }
  
  public final int Fb()
  {
    GMTrace.i(11597351223296L, 86407);
    GMTrace.o(11597351223296L, 86407);
    return 7;
  }
  
  public final int[] aHx()
  {
    GMTrace.i(11597217005568L, 86406);
    GMTrace.o(11597217005568L, 86406);
    return new int[] { 227 };
  }
  
  public final void aHy()
  {
    GMTrace.i(11597485441024L, 86408);
    GMTrace.o(11597485441024L, 86408);
  }
  
  public final void b(c paramc)
  {
    GMTrace.i(11597753876480L, 86410);
    if (paramc != null)
    {
      l locall = new l(paramc.mXg, paramc.mXi, paramc.mXL);
      ap.wT().a(locall, 0);
      w.i("MicroMsg.IPCallReportService", "start report, roomid: %d, callseq: %d, isAccept: %b", new Object[] { Integer.valueOf(paramc.mXg), Long.valueOf(paramc.mXi), Boolean.valueOf(paramc.mXL) });
    }
    GMTrace.o(11597753876480L, 86410);
  }
  
  public final void onDestroy()
  {
    GMTrace.i(11597619658752L, 86409);
    GMTrace.o(11597619658752L, 86409);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/ipcall/a/f/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */