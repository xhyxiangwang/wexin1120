package com.tencent.mm.plugin.wear.model.f;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.a.st;
import com.tencent.mm.sdk.platformtools.w;

public abstract class c
  extends d
{
  public c()
  {
    GMTrace.i(9190827360256L, 68477);
    GMTrace.o(9190827360256L, 68477);
  }
  
  protected final void execute()
  {
    GMTrace.i(9190961577984L, 68478);
    if (com.tencent.mm.plugin.wear.model.a.bzo().shh.bzt())
    {
      st localst = new st();
      localst.fRw.fvy = 11;
      com.tencent.mm.sdk.b.a.uLm.m(localst);
      send();
      GMTrace.o(9190961577984L, 68478);
      return;
    }
    w.i("MicroMsg.WearBaseSendTask", "can not send message to wear");
    GMTrace.o(9190961577984L, 68478);
  }
  
  public abstract void send();
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/wear/model/f/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */