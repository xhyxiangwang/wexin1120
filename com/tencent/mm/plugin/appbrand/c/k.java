package com.tencent.mm.plugin.appbrand.c;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ac.b.a;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.h;
import com.tencent.mm.plugin.appbrand.app.f;
import com.tencent.mm.plugin.appbrand.config.c;
import com.tencent.mm.protocal.c.acd;
import com.tencent.mm.protocal.c.ace;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.storage.t;
import com.tencent.mm.storage.w.a;
import java.util.concurrent.TimeUnit;

public final class k
  extends com.tencent.mm.ac.a<ace>
{
  private static final long iFc;
  
  static
  {
    GMTrace.i(19886906540032L, 148169);
    iFc = TimeUnit.MINUTES.toSeconds(5L);
    GMTrace.o(19886906540032L, 148169);
  }
  
  private k(int paramInt)
  {
    GMTrace.i(19886369669120L, 148165);
    b.a locala = new b.a();
    acd localacd = new acd();
    localacd.fFs = (paramInt - 1 + 1);
    locala.hlX = localacd;
    locala.hlY = new ace();
    locala.uri = "/cgi-bin/mmbiz-bin/wxabusiness/getsearchshowoutwxaapp";
    locala.hlW = 1314;
    this.gMC = locala.DA();
    GMTrace.o(19886369669120L, 148165);
  }
  
  static ace Tz()
  {
    GMTrace.i(19886638104576L, 148167);
    ace localace = (ace)f.Sm().f("GetSearchShowOutWxaApp_resp", ace.class);
    GMTrace.o(19886638104576L, 148167);
    return localace;
  }
  
  public static void hT(int paramInt)
  {
    GMTrace.i(19886503886848L, 148166);
    if (!h.xx().gQD)
    {
      GMTrace.o(19886503886848L, 148166);
      return;
    }
    switch (1.iFd[(paramInt - 1)])
    {
    }
    for (;;)
    {
      new k(paramInt).Dy();
      GMTrace.o(19886503886848L, 148166);
      return;
      if (bg.getLong(f.Se().get("GetSearchShowOutWxaApp_lastCheck", "$$invalid"), 0L) + bg.getLong(f.Se().get("GetSearchShowOutWxaApp_interval", "$$invalid"), iFc) > bg.Po())
      {
        GMTrace.o(19886503886848L, 148166);
        return;
      }
      f.Se().aP("GetSearchShowOutWxaApp_lastCheck", String.valueOf(bg.Po()));
      continue;
      if (((Long)h.xz().xi().get(w.a.uZi, Long.valueOf(0L))).longValue() + TimeUnit.DAYS.toSeconds(1L) > bg.Po())
      {
        GMTrace.o(19886503886848L, 148166);
        return;
      }
      h.xz().xi().a(w.a.uZi, Long.valueOf(bg.Po()));
    }
  }
  
  public static enum a
  {
    static
    {
      GMTrace.i(19888114499584L, 148178);
      iFe = 1;
      iFf = 2;
      iFg = new int[] { iFe, iFf };
      GMTrace.o(19888114499584L, 148178);
    }
    
    public static int[] TA()
    {
      GMTrace.i(19887980281856L, 148177);
      int[] arrayOfInt = (int[])iFg.clone();
      GMTrace.o(19887980281856L, 148177);
      return arrayOfInt;
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/c/k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */