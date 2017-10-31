package com.tencent.mm.plugin.appbrand.media;

import android.media.MediaRecorder;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.e.b.b;
import com.tencent.mm.e.b.b.b;
import com.tencent.mm.sdk.platformtools.aj;
import com.tencent.mm.sdk.platformtools.aj.a;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;

public final class a
{
  private static b jgU;
  private static String jgV;
  private static a jgW;
  private static aj jgX;
  
  static
  {
    GMTrace.i(10215445495808L, 76111);
    jgU = null;
    jgV = null;
    jgW = null;
    jgX = null;
    GMTrace.o(10215445495808L, 76111);
  }
  
  private static void MM()
  {
    GMTrace.i(10214908624896L, 76107);
    if (jgX != null) {
      jgX.MM();
    }
    jgX = null;
    GMTrace.o(10214908624896L, 76107);
  }
  
  private static b Ym()
  {
    GMTrace.i(10215042842624L, 76108);
    if (jgU == null) {
      jgU = new b(com.tencent.mm.compatible.b.b.a.gFj);
    }
    b localb = jgU;
    GMTrace.o(10215042842624L, 76108);
    return localb;
  }
  
  public static boolean a(String paramString, a parama, int paramInt)
  {
    GMTrace.i(18244886855680L, 135935);
    iQ(1);
    if (bg.mZ(paramString))
    {
      w.e("MicroMsg.AppBrand.AudioRecorder", "startRecord, path is null or nil");
      GMTrace.o(18244886855680L, 135935);
      return false;
    }
    if (Ym() == null)
    {
      GMTrace.o(18244886855680L, 135935);
      return false;
    }
    b localb = Ym();
    if (localb.fqi == com.tencent.mm.compatible.b.b.a.gFi) {
      if (localb.fqg != null) {
        localb.fqg.reset();
      }
    }
    for (;;)
    {
      Ym().qu();
      Ym().qv();
      Ym().qt();
      Ym().setOutputFile(paramString);
      Ym().a(new com.tencent.mm.e.b.b.a()
      {
        public final void onError()
        {
          GMTrace.i(18245289508864L, 135938);
          w.e("MicroMsg.AppBrand.AudioRecorder", "onError");
          a.iQ(-1);
          GMTrace.o(18245289508864L, 135938);
        }
      });
      try
      {
        Ym().prepare();
        Ym().start();
        jgW = parama;
        jgV = paramString;
        long l = paramInt;
        MM();
        paramString = new aj(new aj.a()
        {
          public final boolean pO()
          {
            GMTrace.i(10215713931264L, 76113);
            a.iQ(1);
            GMTrace.o(10215713931264L, 76113);
            return false;
          }
        }, false);
        jgX = paramString;
        paramString.w(l, l);
        GMTrace.o(18244886855680L, 135935);
        return true;
      }
      catch (Exception paramString)
      {
        w.e("MicroMsg.AppBrand.AudioRecorder", "record prepare, exp = %s", new Object[] { bg.f(paramString) });
        GMTrace.o(18244886855680L, 135935);
      }
      if (localb.fqj != b.b.fqs)
      {
        localb.release();
        localb.qw();
      }
    }
    return false;
  }
  
  public static void iQ(int paramInt)
  {
    GMTrace.i(18245021073408L, 135936);
    if (bg.mZ(jgV))
    {
      GMTrace.o(18245021073408L, 135936);
      return;
    }
    Ym().a(null);
    Ym().qx();
    Ym().release();
    MM();
    jgV = null;
    if (jgW != null) {
      jgW.iy(paramInt);
    }
    jgW = null;
    GMTrace.o(18245021073408L, 135936);
  }
  
  public static abstract interface a
  {
    public abstract void iy(int paramInt);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/media/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */