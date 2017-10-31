package com.tencent.mm.plugin.wear.model.f;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.wear.model.a;
import com.tencent.mm.plugin.wear.model.e.r;
import com.tencent.mm.protocal.c.bqq;
import java.io.IOException;

public final class k
  extends c
{
  private int code;
  private String fvk;
  
  public k(int paramInt, String paramString)
  {
    GMTrace.i(9191230013440L, 68480);
    this.code = paramInt;
    this.fvk = paramString;
    GMTrace.o(9191230013440L, 68480);
  }
  
  public final String getName()
  {
    GMTrace.i(9191498448896L, 68482);
    GMTrace.o(9191498448896L, 68482);
    return "WearPushPayResponseTask";
  }
  
  protected final void send()
  {
    GMTrace.i(9191364231168L, 68481);
    bqq localbqq = new bqq();
    switch (this.code)
    {
    }
    for (;;)
    {
      localbqq.uEM = this.fvk;
      try
      {
        a.bzo();
        r.a(20016, localbqq.toByteArray(), true);
        GMTrace.o(9191364231168L, 68481);
        return;
      }
      catch (IOException localIOException)
      {
        GMTrace.o(9191364231168L, 68481);
      }
      localbqq.uxA = 0;
      continue;
      localbqq.uxA = 196610;
      continue;
      localbqq.uxA = 196613;
      continue;
      localbqq.uxA = 196614;
      continue;
      localbqq.uxA = 196615;
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/wear/model/f/k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */