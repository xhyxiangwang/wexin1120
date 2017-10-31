package com.tencent.mm.plugin.appbrand.p.d;

import com.tencent.gmtrace.GMTrace;
import java.nio.ByteBuffer;

public abstract interface d
{
  public abstract ByteBuffer abl();
  
  public abstract boolean abm();
  
  public abstract boolean abn();
  
  public abstract a abo();
  
  public abstract void e(d paramd);
  
  public static enum a
  {
    static
    {
      GMTrace.i(10167395549184L, 75753);
      jxY = new a("CONTINUOUS", 0);
      jxZ = new a("TEXT", 1);
      jya = new a("BINARY", 2);
      jyb = new a("PING", 3);
      jyc = new a("PONG", 4);
      jyd = new a("CLOSING", 5);
      jye = new a[] { jxY, jxZ, jya, jyb, jyc, jyd };
      GMTrace.o(10167395549184L, 75753);
    }
    
    private a()
    {
      GMTrace.i(10167261331456L, 75752);
      GMTrace.o(10167261331456L, 75752);
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/p/d/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */