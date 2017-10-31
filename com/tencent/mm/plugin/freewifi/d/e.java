package com.tencent.mm.plugin.freewifi.d;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ac.b;
import com.tencent.mm.ac.b.a;
import com.tencent.mm.ac.b.b;
import com.tencent.mm.ac.b.c;
import com.tencent.mm.plugin.freewifi.m;
import com.tencent.mm.plugin.freewifi.model.j;
import com.tencent.mm.protocal.c.tr;
import com.tencent.mm.protocal.c.ts;
import com.tencent.mm.protocal.c.tt;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.w;
import java.util.LinkedList;

public final class e
  extends c
{
  public e(LinkedList<tr> paramLinkedList)
  {
    GMTrace.i(7251381190656L, 54027);
    aAl();
    if ((paramLinkedList != null) && (paramLinkedList.size() > 0)) {
      ((ts)this.gMC.hlU.hmc).tRO = paramLinkedList;
    }
    GMTrace.o(7251381190656L, 54027);
  }
  
  protected final void aAl()
  {
    GMTrace.i(7251112755200L, 54025);
    b.a locala = new b.a();
    locala.hlX = new ts();
    locala.hlY = new tt();
    locala.uri = "/cgi-bin/mmo2o-bin/freewifireport";
    locala.hlW = 1781;
    locala.hlZ = 0;
    locala.hma = 0;
    this.gMC = locala.DA();
    GMTrace.o(7251112755200L, 54025);
  }
  
  public final LinkedList<tr> aAu()
  {
    GMTrace.i(7251649626112L, 54029);
    Object localObject = (tt)this.gMC.hlV.hmc;
    if (localObject == null)
    {
      GMTrace.o(7251649626112L, 54029);
      return null;
    }
    localObject = ((tt)localObject).tRO;
    GMTrace.o(7251649626112L, 54029);
    return (LinkedList<tr>)localObject;
  }
  
  protected final void b(int paramInt1, int paramInt2, int paramInt3, String paramString)
  {
    GMTrace.i(7251515408384L, 54028);
    w.i("MicroMsg.FreeWifi.NetSceneFreeWifiReport", "doBeforeCallback. netId=%d, errType=%d, errCode=%d, errMsg=%s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    if (m.cc(paramInt2, paramInt3)) {
      j.aAi().azR().post(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(7252454932480L, 54035);
          Object localObject = (tt)e.this.gMC.hlV.hmc;
          if (localObject == null)
          {
            GMTrace.o(7252454932480L, 54035);
            return;
          }
          localObject = ((tt)localObject).tRO;
          GMTrace.o(7252454932480L, 54035);
        }
      });
    }
    GMTrace.o(7251515408384L, 54028);
  }
  
  public final int getType()
  {
    GMTrace.i(15395578707968L, 114706);
    GMTrace.o(15395578707968L, 114706);
    return 1781;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/freewifi/d/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */