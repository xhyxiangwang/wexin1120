package com.tencent.mm.plugin.freewifi.e;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.freewifi.m;
import com.tencent.mm.sdk.platformtools.w;

public final class d
{
  private String fvF;
  private String fxT;
  private int mey;
  
  public d()
  {
    GMTrace.i(7243730780160L, 53970);
    GMTrace.o(7243730780160L, 53970);
  }
  
  public final boolean j(int paramInt, String paramString1, String paramString2)
  {
    boolean bool = true;
    label184:
    for (;;)
    {
      try
      {
        GMTrace.i(7243864997888L, 53971);
        w.i("MicroMsg.FreeWifi.Protocol31Locker", "threeOneStartUpType=%d, apKey=%s, ticket=%s", new Object[] { Integer.valueOf(paramInt), paramString1, paramString2 });
        if ((paramInt != 1) && (paramInt != 2))
        {
          if (paramInt == 3)
          {
            break label184;
            if (i == 0)
            {
              GMTrace.o(7243864997888L, 53971);
              return bool;
            }
          }
          else
          {
            i = 0;
            continue;
          }
          if ((m.xJ(paramString1)) || (m.xJ(paramString2)))
          {
            GMTrace.o(7243864997888L, 53971);
            bool = false;
            continue;
          }
          if ((paramString1.equals(this.fvF)) && (paramString2.equals(this.fxT)) && (this.mey != paramInt))
          {
            GMTrace.o(7243864997888L, 53971);
            bool = false;
            continue;
          }
          this.mey = paramInt;
          this.fvF = paramString1;
          this.fxT = paramString2;
          GMTrace.o(7243864997888L, 53971);
          continue;
        }
        int i = 1;
      }
      finally {}
    }
  }
  
  private static final class a
  {
    public static d mez;
    
    static
    {
      GMTrace.i(7242254385152L, 53959);
      mez = new d();
      GMTrace.o(7242254385152L, 53959);
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/freewifi/e/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */