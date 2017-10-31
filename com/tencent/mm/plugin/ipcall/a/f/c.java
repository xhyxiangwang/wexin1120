package com.tencent.mm.plugin.ipcall.a.f;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ac.n;
import com.tencent.mm.plugin.ipcall.a.a.b;
import com.tencent.mm.plugin.ipcall.a.d.h;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.x.ap;

public final class c
  extends b
{
  private h nah;
  
  public c()
  {
    GMTrace.i(11595740610560L, 86395);
    GMTrace.o(11595740610560L, 86395);
  }
  
  public final int Fb()
  {
    GMTrace.i(11596143263744L, 86398);
    GMTrace.o(11596143263744L, 86398);
    return 5;
  }
  
  public final void aHA()
  {
    GMTrace.i(11596814352384L, 86403);
    w.d("MicroMsg.IPCallHeartBeatService", "heartbeat, onLoopSuccess");
    GMTrace.o(11596814352384L, 86403);
  }
  
  public final void aHB()
  {
    GMTrace.i(11596948570112L, 86404);
    w.d("MicroMsg.IPCallHeartBeatService", "heartbeat, onLoopFailed");
    GMTrace.o(11596948570112L, 86404);
  }
  
  public final int[] aHx()
  {
    GMTrace.i(11595874828288L, 86396);
    GMTrace.o(11595874828288L, 86396);
    return new int[] { 824 };
  }
  
  public final void aHy()
  {
    GMTrace.i(11596277481472L, 86399);
    GMTrace.o(11596277481472L, 86399);
  }
  
  public final int aHz()
  {
    GMTrace.i(11596680134656L, 86402);
    GMTrace.o(11596680134656L, 86402);
    return 50000;
  }
  
  public final void b(com.tencent.mm.plugin.ipcall.a.a.c paramc)
  {
    GMTrace.i(11596545916928L, 86401);
    if (this.mWy != null)
    {
      this.nah = new h(this.mWy.mXg, this.mWy.mXh, this.mWy.mXi);
      ap.wT().a(this.nah, 0);
    }
    GMTrace.o(11596545916928L, 86401);
  }
  
  public final void onDestroy()
  {
    GMTrace.i(11596411699200L, 86400);
    GMTrace.o(11596411699200L, 86400);
  }
  
  public final void onStop()
  {
    GMTrace.i(11596009046016L, 86397);
    if (this.nah != null) {
      ap.wT().c(this.nah);
    }
    GMTrace.o(11596009046016L, 86397);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/ipcall/a/f/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */