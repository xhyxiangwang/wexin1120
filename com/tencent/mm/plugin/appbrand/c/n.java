package com.tencent.mm.plugin.appbrand.c;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.o.d;
import com.tencent.mm.plugin.appbrand.task.b;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.bg;

public enum n
{
  static
  {
    GMTrace.i(10020964007936L, 74662);
    iFk = new n[0];
    GMTrace.o(10020964007936L, 74662);
  }
  
  public static void i(String paramString1, final String paramString2, final int paramInt)
  {
    GMTrace.i(10020695572480L, 74660);
    if (bg.mZ(paramString2))
    {
      GMTrace.o(10020695572480L, 74660);
      return;
    }
    b.at(paramString2, paramInt);
    d.xC().C(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(10022440402944L, 74673);
        n.j(this.hkC, paramString2, paramInt);
        GMTrace.o(10022440402944L, 74673);
      }
    });
    GMTrace.o(10020695572480L, 74660);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/c/n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */