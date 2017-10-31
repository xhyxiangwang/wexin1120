package com.tencent.mm.plugin.ipcall.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.a.hz;
import com.tencent.mm.g.a.hz.a;
import com.tencent.mm.protocal.c.atl;
import com.tencent.mm.protocal.c.atu;
import com.tencent.mm.sdk.b.c;
import com.tencent.mm.sdk.platformtools.w;
import java.util.Iterator;
import java.util.LinkedList;

public final class h
  extends c<hz>
{
  public a mWD;
  
  public h()
  {
    GMTrace.i(11572118290432L, 86219);
    this.uLu = hz.class.getName().hashCode();
    GMTrace.o(11572118290432L, 86219);
  }
  
  private boolean a(hz paramhz)
  {
    GMTrace.i(11572252508160L, 86220);
    if ((paramhz instanceof hz))
    {
      paramhz = paramhz.fEB.fEC;
      if ((paramhz == null) || (paramhz.length <= 0))
      {
        GMTrace.o(11572252508160L, 86220);
        return false;
      }
      if (paramhz[0] == 101)
      {
        Object localObject = new byte[paramhz.length - 1];
        System.arraycopy(paramhz, 1, localObject, 0, localObject.length);
        try
        {
          paramhz = (atl)new atl().aC((byte[])localObject);
          w.d("MicroMsg.IPCallSvrNotifyListener", "roomId: %d, roomKey: %d, DtmfPayloadType: %d", new Object[] { Integer.valueOf(paramhz.tNa), Long.valueOf(paramhz.tNb), Integer.valueOf(paramhz.mXB) });
          localObject = paramhz.upb;
          if (localObject != null)
          {
            localObject = ((LinkedList)localObject).iterator();
            while (((Iterator)localObject).hasNext())
            {
              atu localatu = (atu)((Iterator)localObject).next();
              w.d("MicroMsg.IPCallSvrNotifyListener", "userstatus: %d, userstatusKey: %d, memberId: %d", new Object[] { Integer.valueOf(localatu.unP), Integer.valueOf(localatu.upl), Integer.valueOf(localatu.upk) });
              continue;
              GMTrace.o(11572252508160L, 86220);
            }
          }
        }
        catch (Exception paramhz)
        {
          w.e("MicroMsg.IPCallSvrNotifyListener", "parse PstnNotify error: %s", new Object[] { paramhz.getMessage() });
        }
      }
    }
    for (;;)
    {
      return false;
      if (this.mWD != null) {
        this.mWD.a(paramhz);
      }
    }
  }
  
  public static abstract interface a
  {
    public abstract void a(atl paramatl);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/ipcall/a/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */