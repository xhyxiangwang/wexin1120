package com.tencent.mm.plugin.appbrand.p;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.p.d.d;
import java.net.InetSocketAddress;

public abstract interface a
{
  public abstract InetSocketAddress abc();
  
  public abstract void b(d paramd);
  
  public static enum a
  {
    static
    {
      GMTrace.i(10167529766912L, 75754);
      jwQ = 1;
      jwR = 2;
      jwS = 3;
      jwT = 4;
      jwU = 5;
      jwV = new int[] { jwQ, jwR, jwS, jwT, jwU };
      GMTrace.o(10167529766912L, 75754);
    }
  }
  
  public static enum b
  {
    static
    {
      GMTrace.i(10162161057792L, 75714);
      jwW = 1;
      jwX = 2;
      jwY = new int[] { jwW, jwX };
      GMTrace.o(10162161057792L, 75714);
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/p/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */