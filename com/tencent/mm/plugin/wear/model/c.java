package com.tencent.mm.plugin.wear.model;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.wear.model.e.i;
import com.tencent.mm.pluginsdk.l.x.a;
import com.tencent.mm.protocal.c.bqb;
import com.tencent.mm.sdk.platformtools.bg;

public final class c
  implements l.x.a
{
  public c()
  {
    GMTrace.i(9176734498816L, 68372);
    GMTrace.o(9176734498816L, 68372);
  }
  
  public final String bzq()
  {
    GMTrace.i(9176868716544L, 68373);
    Object localObject = a.bzo().shh.shy.sim;
    if (localObject != null)
    {
      localObject = ((bqb)localObject).uFH + "\n" + ((bqb)localObject).uFI + "\n" + ((bqb)localObject).uFJ;
      GMTrace.o(9176868716544L, 68373);
      return (String)localObject;
    }
    GMTrace.o(9176868716544L, 68373);
    return "Not Connect";
  }
  
  public final void bzr()
  {
    GMTrace.i(9177002934272L, 68374);
    a.bzo().shn.a(new com.tencent.mm.plugin.wear.model.f.a());
    GMTrace.o(9177002934272L, 68374);
  }
  
  public final boolean bzs()
  {
    GMTrace.i(9177137152000L, 68375);
    Object localObject = a.bzo().shh.shy.sim;
    if ((bg.mZ(null)) && (bg.mZ(null)))
    {
      if (localObject != null)
      {
        GMTrace.o(9177137152000L, 68375);
        return true;
      }
      GMTrace.o(9177137152000L, 68375);
      return false;
    }
    if (bg.mZ(null))
    {
      if (localObject != null) {
        throw new NullPointerException();
      }
      GMTrace.o(9177137152000L, 68375);
      return false;
    }
    if (bg.mZ(null))
    {
      if (localObject != null)
      {
        localObject = ((bqb)localObject).uFE;
        throw new NullPointerException();
      }
      GMTrace.o(9177137152000L, 68375);
      return false;
    }
    if (localObject != null) {
      throw new NullPointerException();
    }
    GMTrace.o(9177137152000L, 68375);
    return false;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/wear/model/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */