package com.tencent.mm.plugin.appbrand.c;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.h;
import com.tencent.mm.plugin.appbrand.o.d;
import com.tencent.mm.sdk.e.j;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.storage.t;
import com.tencent.mm.storage.w.a;

public final class b
  extends j
{
  private static volatile b iDY;
  
  static
  {
    GMTrace.i(10028614418432L, 74719);
    iDY = null;
    GMTrace.o(10028614418432L, 74719);
  }
  
  private b()
  {
    GMTrace.i(10027809112064L, 74713);
    GMTrace.o(10027809112064L, 74713);
  }
  
  public static b Te()
  {
    GMTrace.i(10027943329792L, 74714);
    if (iDY == null) {}
    try
    {
      if (iDY == null) {
        iDY = new b();
      }
      b localb = iDY;
      GMTrace.o(10027943329792L, 74714);
      return localb;
    }
    finally {}
  }
  
  public static boolean Tf()
  {
    GMTrace.i(10028480200704L, 74718);
    if (!h.xx().wM())
    {
      GMTrace.o(10028480200704L, 74718);
      return false;
    }
    boolean bool = ((Boolean)h.xz().xi().get(w.a.uYR, Boolean.valueOf(false))).booleanValue();
    GMTrace.o(10028480200704L, 74718);
    return bool;
  }
  
  public static void release()
  {
    GMTrace.i(10028077547520L, 74715);
    iDY = null;
    GMTrace.o(10028077547520L, 74715);
  }
  
  public final void a(int paramInt1, final int paramInt2, final long paramLong, boolean paramBoolean)
  {
    GMTrace.i(16052708704256L, 119602);
    if (!h.xx().wM())
    {
      GMTrace.o(16052708704256L, 119602);
      return;
    }
    if ((1 == paramInt1) || (3 == paramInt1)) {}
    for (int i = 1; i == 0; i = 0)
    {
      GMTrace.o(16052708704256L, 119602);
      return;
    }
    long l = ((Long)h.xz().xi().get(w.a.uYS, Long.valueOf(-1L))).longValue();
    if ((paramBoolean) || (l <= 0L)) {}
    for (i = Integer.MAX_VALUE;; i = (int)l)
    {
      new l(paramInt1, paramInt2, i, paramInt2) {}.Dy();
      GMTrace.o(16052708704256L, 119602);
      return;
    }
  }
  
  public final void b(final long paramLong, final boolean paramBoolean)
  {
    GMTrace.i(10028211765248L, 74716);
    d.xC().C(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(10015863734272L, 74624);
        b localb = b.this;
        if ((paramBoolean & true)) {}
        for (int i = 2;; i = 0)
        {
          localb.a(3, i | 0x1, paramLong, paramBoolean);
          GMTrace.o(10015863734272L, 74624);
          return;
        }
      }
    });
    GMTrace.o(10028211765248L, 74716);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/c/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */