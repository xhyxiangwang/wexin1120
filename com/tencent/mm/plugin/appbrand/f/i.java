package com.tencent.mm.plugin.appbrand.f;

import android.os.HandlerThread;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.app.f;
import com.tencent.mm.plugin.appbrand.c.e;
import com.tencent.mm.plugin.appbrand.c.j;
import com.tencent.mm.plugin.appbrand.config.p;
import com.tencent.mm.plugin.appbrand.o.d;
import com.tencent.mm.sdk.e.j.a;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.bg;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

 enum i
{
  private static final a iOp;
  
  static
  {
    GMTrace.i(10653129506816L, 79372);
    iOq = new i[0];
    iOp = new a();
    GMTrace.o(10653129506816L, 79372);
  }
  
  static List<e> Vo()
  {
    GMTrace.i(10652458418176L, 79367);
    LinkedList localLinkedList = new LinkedList();
    if (f.Sf() != null)
    {
      ArrayList localArrayList = f.Sf().Tw();
      if (!bg.bX(localArrayList)) {
        localLinkedList.addAll(localArrayList);
      }
    }
    GMTrace.o(10652458418176L, 79367);
    return localLinkedList;
  }
  
  static void d(j.a parama)
  {
    GMTrace.i(10652861071360L, 79370);
    if (f.Sf() != null) {
      f.Sf().c(parama);
    }
    GMTrace.o(10652861071360L, 79370);
  }
  
  static void e(j.a parama)
  {
    GMTrace.i(10652995289088L, 79371);
    if (f.Sf() != null) {
      f.Sf().j(parama);
    }
    GMTrace.o(10652995289088L, 79371);
  }
  
  static void onCreate()
  {
    GMTrace.i(10652189982720L, 79365);
    p.Up().a(iOp, d.xC().nTP.getLooper());
    GMTrace.o(10652189982720L, 79365);
  }
  
  static void onDestroy()
  {
    GMTrace.i(10652324200448L, 79366);
    p.Up().j(iOp);
    GMTrace.o(10652324200448L, 79366);
  }
  
  static e pK(String paramString)
  {
    GMTrace.i(10652592635904L, 79368);
    if (f.Sf() == null)
    {
      GMTrace.o(10652592635904L, 79368);
      return null;
    }
    paramString = f.Sf().oq(paramString);
    GMTrace.o(10652592635904L, 79368);
    return paramString;
  }
  
  static e pL(String paramString)
  {
    GMTrace.i(10652726853632L, 79369);
    if (f.Sf() == null)
    {
      GMTrace.o(10652726853632L, 79369);
      return null;
    }
    paramString = f.Sf().oq(paramString);
    GMTrace.o(10652726853632L, 79369);
    return paramString;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/f/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */