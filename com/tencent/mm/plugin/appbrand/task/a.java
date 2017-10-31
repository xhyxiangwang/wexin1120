package com.tencent.mm.plugin.appbrand.task;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.h.l;
import com.tencent.mm.plugin.appbrand.o.d;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.ui.widget.MMWebView;
import com.tencent.xweb.WebView;
import com.tencent.xweb.WebView.b;
import java.util.HashSet;
import java.util.Iterator;
import org.xwalk.core.Log;

public final class a
{
  private static boolean jpt;
  private static boolean jpu;
  private static HashSet<a> jpv;
  
  static
  {
    GMTrace.i(17272076763136L, 128687);
    jpt = false;
    jpu = false;
    jpv = new HashSet();
    GMTrace.o(17272076763136L, 128687);
  }
  
  public static boolean ZM()
  {
    GMTrace.i(17271942545408L, 128686);
    boolean bool = jpu;
    GMTrace.o(17271942545408L, 128686);
    return bool;
  }
  
  public static void a(a parama)
  {
    for (;;)
    {
      try
      {
        GMTrace.i(17271674109952L, 128684);
        if (jpt)
        {
          if (parama != null) {
            jpv.add(parama);
          }
          GMTrace.o(17271674109952L, 128684);
          return;
        }
        if (jpu)
        {
          if (parama != null) {
            parama.onReady();
          }
          GMTrace.o(17271674109952L, 128684);
          continue;
        }
        jpt = true;
      }
      finally {}
      if (parama != null) {
        jpv.add(parama);
      }
      Log.i("AppBrandProcessPreloader", "TRACE_ORDER:AppBrandProcessPreloader.java");
      d.xC().C(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(17273553158144L, 128698);
          Log.i("AppBrandProcessPreloader", "preInit start");
          new l().init();
          if (WebView.hasInited())
          {
            a.done();
            GMTrace.o(17273553158144L, 128698);
            return;
          }
          WebView.initWebviewCore(ab.getContext(), MMWebView.wUR, new WebView.b()
          {
            public final void oV()
            {
              GMTrace.i(17270868803584L, 128678);
              a.done();
              GMTrace.o(17270868803584L, 128678);
            }
            
            public final void oW()
            {
              GMTrace.i(19698733285376L, 146767);
              a.done();
              GMTrace.o(19698733285376L, 146767);
            }
          });
          GMTrace.o(17273553158144L, 128698);
        }
      });
      GMTrace.o(17271674109952L, 128684);
    }
  }
  
  public static void done()
  {
    try
    {
      GMTrace.i(17271808327680L, 128685);
      Log.i("AppBrandProcessPreloader", "preInit finished");
      jpu = true;
      jpt = false;
      Iterator localIterator = jpv.iterator();
      while (localIterator.hasNext())
      {
        a locala = (a)localIterator.next();
        if (locala != null) {
          locala.onReady();
        }
      }
      jpv.clear();
    }
    finally {}
    GMTrace.o(17271808327680L, 128685);
  }
  
  public static abstract interface a
  {
    public abstract void onReady();
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/task/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */