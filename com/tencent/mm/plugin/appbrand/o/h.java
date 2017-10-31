package com.tencent.mm.plugin.appbrand.o;

import android.webkit.ValueCallback;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.c;
import com.tencent.mm.sdk.platformtools.bg;

public final class h
{
  public static void a(c paramc, String paramString, a parama)
  {
    GMTrace.i(15406852997120L, 114790);
    if (bg.mZ(paramString))
    {
      parama.ep("");
      GMTrace.o(15406852997120L, 114790);
      return;
    }
    paramc.evaluateJavascript(paramString + String.format(";var ___result_return = function(){return %d;};___result_return();", new Object[] { Integer.valueOf(11111) }), new ValueCallback() {});
    GMTrace.o(15406852997120L, 114790);
  }
  
  public static abstract interface a
  {
    public abstract void ep(String paramString);
    
    public abstract void wp();
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/o/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */