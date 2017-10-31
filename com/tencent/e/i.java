package com.tencent.e;

import android.content.Context;
import com.tencent.e.b.d;
import com.tencent.pb.common.c.c;

public final class i
{
  private static i xLu;
  private boolean mT;
  private Context sS;
  
  private static i cnL()
  {
    if (xLu == null) {}
    try
    {
      if (xLu == null) {
        xLu = new i();
      }
      return xLu;
    }
    finally {}
  }
  
  public static void ij(Context paramContext)
  {
    i locali = cnL();
    if (!locali.mT)
    {
      locali.sS = paramContext;
      paramContext = new d("EventCenter", com.tencent.e.a.b.class.getName());
    }
    try
    {
      paramContext = f.a(paramContext);
      if (paramContext != null) {
        paramContext.start();
      }
      return;
    }
    catch (Throwable paramContext)
    {
      c.k("service", new Object[] { paramContext });
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/e/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */