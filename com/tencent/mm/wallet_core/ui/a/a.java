package com.tencent.mm.wallet_core.ui.a;

import com.tencent.gmtrace.GMTrace;
import java.util.WeakHashMap;

public final class a
{
  public WeakHashMap<Object, Boolean> xil;
  
  public a()
  {
    GMTrace.i(19126831546368L, 142506);
    this.xil = new WeakHashMap();
    GMTrace.o(19126831546368L, 142506);
  }
  
  public static a cjx()
  {
    try
    {
      GMTrace.i(19126965764096L, 142507);
      a locala = a.xim;
      GMTrace.o(19126965764096L, 142507);
      return locala;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  private static final class a
  {
    static a xim;
    
    static
    {
      GMTrace.i(19126697328640L, 142505);
      xim = new a();
      GMTrace.o(19126697328640L, 142505);
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/wallet_core/ui/a/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */