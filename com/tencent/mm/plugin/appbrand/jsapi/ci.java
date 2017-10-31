package com.tencent.mm.plugin.appbrand.jsapi;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.o.d;
import com.tencent.mm.plugin.appbrand.o.g;
import com.tencent.mm.plugin.appbrand.o.g.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.widget.MMWebView;
import com.tencent.xweb.WebView.c;
import java.util.LinkedList;
import java.util.List;

public final class ci
{
  public static long iRv;
  private static long iRw;
  private g iPX;
  public final List<e> iRx;
  public Runnable iRy;
  
  static
  {
    GMTrace.i(10348321046528L, 77101);
    iRv = 200L;
    iRw = 20L;
    GMTrace.o(10348321046528L, 77101);
  }
  
  public ci()
  {
    GMTrace.i(10347649957888L, 77096);
    this.iRx = new LinkedList();
    if (VQ()) {}
    for (int i = 20;; i = 200)
    {
      iRv = i;
      this.iRy = new Runnable()
      {
        public final void run()
        {
          GMTrace.i(10407242629120L, 77540);
          synchronized (ci.this.iRx)
          {
            if (ci.this.iRx.isEmpty())
            {
              GMTrace.o(10407242629120L, 77540);
              return;
            }
            e locale = (e)ci.this.iRx.remove(0);
            locale.VI();
            w.v("MicroMsg.SensorJsEventPublisher", "publish next event(event : %s), list size is : %d.", new Object[] { locale.getName(), Integer.valueOf(ci.this.iRx.size()) });
          }
          synchronized (ci.this.iRx)
          {
            boolean bool = ci.this.iRx.isEmpty();
            if (!bool) {
              d.xC().h(this, ci.iRv);
            }
            GMTrace.o(10407242629120L, 77540);
            return;
            localObject1 = finally;
            throw ((Throwable)localObject1);
          }
        }
      };
      this.iPX = new g(iRv, new g.a()
      {
        public final boolean f(Object... arg1)
        {
          GMTrace.i(10453010874368L, 77881);
          synchronized (ci.this.iRx)
          {
            if (ci.this.iRx.isEmpty())
            {
              GMTrace.o(10453010874368L, 77881);
              return false;
            }
            ci.this.iRy.run();
            GMTrace.o(10453010874368L, 77881);
            return true;
          }
        }
      });
      GMTrace.o(10347649957888L, 77096);
      return;
    }
  }
  
  public static ci VP()
  {
    GMTrace.i(10347381522432L, 77094);
    ci localci = a.iRA;
    GMTrace.o(10347381522432L, 77094);
    return localci;
  }
  
  private static boolean VQ()
  {
    GMTrace.i(19711752404992L, 146864);
    if (MMWebView.getCurWebType() == WebView.c.xPj)
    {
      if (MMWebView.getTbsCoreVersion(ab.getContext()) >= 36867)
      {
        GMTrace.o(19711752404992L, 146864);
        return true;
      }
      GMTrace.o(19711752404992L, 146864);
      return false;
    }
    if (MMWebView.getCurWebType() == WebView.c.xPi)
    {
      GMTrace.o(19711752404992L, 146864);
      return true;
    }
    GMTrace.o(19711752404992L, 146864);
    return false;
  }
  
  public static int VR()
  {
    GMTrace.i(10347515740160L, 77095);
    if (VQ())
    {
      GMTrace.o(10347515740160L, 77095);
      return 5;
    }
    GMTrace.o(10347515740160L, 77095);
    return 20;
  }
  
  public final boolean a(e parame, c arg2)
  {
    GMTrace.i(18837592342528L, 140351);
    if (parame == null)
    {
      GMTrace.o(18837592342528L, 140351);
      return false;
    }
    if (!parame.b(???))
    {
      GMTrace.o(18837592342528L, 140351);
      return false;
    }
    for (;;)
    {
      synchronized (this.iRx)
      {
        boolean bool = this.iRx.isEmpty();
        if (!this.iRx.isEmpty())
        {
          if (((e)this.iRx.get(0)).equals(parame))
          {
            this.iRx.add(0, parame);
            this.iRx.remove(1);
            if ((bool) && (!this.iPX.h(new Object[0])))
            {
              w.v("MicroMsg.SensorJsEventPublisher", "post delay publish event(event : %s).", new Object[] { parame.getName() });
              d.xC().h(this.iRy, iRv);
            }
            GMTrace.o(18837592342528L, 140351);
            return true;
          }
          this.iRx.remove(parame);
          this.iRx.add(parame);
        }
      }
      this.iRx.add(parame);
    }
  }
  
  private static final class a
  {
    static ci iRA;
    
    static
    {
      GMTrace.i(19711349751808L, 146861);
      iRA = new ci();
      GMTrace.o(19711349751808L, 146861);
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/ci.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */