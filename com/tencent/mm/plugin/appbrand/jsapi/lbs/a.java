package com.tencent.mm.plugin.appbrand.jsapi.lbs;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.kernel.h;
import com.tencent.mm.plugin.appbrand.compat.a.e;
import com.tencent.mm.plugin.appbrand.compat.a.e.a;
import com.tencent.mm.plugin.appbrand.compat.a.e.b;
import com.tencent.mm.sdk.platformtools.bg;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

final class a
{
  public static final Map<String, a> iWC;
  private static final e.a iWD;
  
  static
  {
    GMTrace.i(19711215534080L, 146860);
    iWC = new HashMap();
    iWD = new a()
    {
      public final void a(double paramAnonymousDouble1, double paramAnonymousDouble2, e.b paramAnonymousb, double paramAnonymousDouble3, double paramAnonymousDouble4, double paramAnonymousDouble5)
      {
        GMTrace.i(19710276009984L, 146853);
        synchronized (a.iWC)
        {
          a.a[] arrayOfa = (a.a[])a.iWC.values().toArray(new a.a[0]);
          int j = arrayOfa.length;
          int i = 0;
          if (i < j)
          {
            arrayOfa[i].a(paramAnonymousDouble1, paramAnonymousDouble2, paramAnonymousb, paramAnonymousDouble3, paramAnonymousDouble4, paramAnonymousDouble5);
            i += 1;
          }
        }
        GMTrace.o(19710276009984L, 146853);
      }
    };
    GMTrace.o(19711215534080L, 146860);
  }
  
  static void a(String paramString, a parama)
  {
    GMTrace.i(19710947098624L, 146858);
    if (bg.mZ(paramString))
    {
      GMTrace.o(19710947098624L, 146858);
      return;
    }
    synchronized (iWC)
    {
      iWC.put(paramString, parama);
      if (iWC.size() == 1) {
        ((e)h.h(e.class)).a(iWD);
      }
      GMTrace.o(19710947098624L, 146858);
      return;
    }
  }
  
  static void pU(String paramString)
  {
    GMTrace.i(19711081316352L, 146859);
    if (bg.mZ(paramString))
    {
      GMTrace.o(19711081316352L, 146859);
      return;
    }
    synchronized (iWC)
    {
      iWC.remove(paramString);
      if (iWC.size() == 0) {
        ((e)h.h(e.class)).b(iWD);
      }
      GMTrace.o(19711081316352L, 146859);
      return;
    }
  }
  
  static abstract interface a
    extends e.a
  {}
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/lbs/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */