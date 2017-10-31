package com.tencent.mm.plugin.ipcall.a.f;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ac.n;
import com.tencent.mm.plugin.ipcall.a.a.b;
import com.tencent.mm.plugin.ipcall.a.a.c;
import com.tencent.mm.plugin.ipcall.a.d.o;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.x.ap;

public final class i
  extends b
{
  private o nal;
  private int nam;
  
  public i()
  {
    GMTrace.i(11593593126912L, 86379);
    this.nal = null;
    this.nam = 0;
    GMTrace.o(11593593126912L, 86379);
  }
  
  public final int Fb()
  {
    GMTrace.i(11593995780096L, 86382);
    GMTrace.o(11593995780096L, 86382);
    return 2;
  }
  
  public final void aHA()
  {
    GMTrace.i(11594666868736L, 86387);
    w.d("MicroMsg.IPCallSyncService", "onLoopSuccess");
    GMTrace.o(11594666868736L, 86387);
  }
  
  public final void aHB()
  {
    GMTrace.i(11594801086464L, 86388);
    w.d("MicroMsg.IPCallSyncService", "onLoopFailed");
    GMTrace.o(11594801086464L, 86388);
  }
  
  public final int[] aHx()
  {
    GMTrace.i(11593727344640L, 86380);
    GMTrace.o(11593727344640L, 86380);
    return new int[] { 819 };
  }
  
  public final void aHy()
  {
    GMTrace.i(11594129997824L, 86383);
    GMTrace.o(11594129997824L, 86383);
  }
  
  public final int aHz()
  {
    GMTrace.i(11594532651008L, 86386);
    int i = this.nam;
    GMTrace.o(11594532651008L, 86386);
    return i;
  }
  
  public final void b(c paramc)
  {
    boolean bool = true;
    GMTrace.i(11594398433280L, 86385);
    if (paramc == null) {}
    for (;;)
    {
      w.d("MicroMsg.IPCallSyncService", "serviceImpl, info==null: %b", new Object[] { Boolean.valueOf(bool) });
      if (this.mWy != null)
      {
        this.nam = this.mWy.mXq;
        this.nal = new o(this.mWy.mXg, this.mWy.mXh, this.mWy.aHC(), this.mWy.mXi, false);
        ap.wT().a(this.nal, 0);
      }
      GMTrace.o(11594398433280L, 86385);
      return;
      bool = false;
    }
  }
  
  public final void onDestroy()
  {
    GMTrace.i(11594264215552L, 86384);
    GMTrace.o(11594264215552L, 86384);
  }
  
  public final void onStop()
  {
    GMTrace.i(11593861562368L, 86381);
    if (this.nal != null) {
      ap.wT().c(this.nal);
    }
    GMTrace.o(11593861562368L, 86381);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/ipcall/a/f/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */