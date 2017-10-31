package com.tencent.mm.plugin.ipcall.a.b;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.SensorController;
import com.tencent.mm.sdk.platformtools.SensorController.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.aj;
import com.tencent.mm.sdk.platformtools.aj.a;
import com.tencent.mm.sdk.platformtools.ax;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;

public final class d
  implements SensorController.a
{
  public SensorController kha;
  public ax khe;
  public long khf;
  private boolean khk;
  public a mYm;
  
  public d()
  {
    GMTrace.i(11606478028800L, 86475);
    this.khf = -1L;
    this.khk = false;
    this.mYm = null;
    this.kha = new SensorController(ab.getContext());
    this.khe = new ax(ab.getContext());
    GMTrace.o(11606478028800L, 86475);
  }
  
  public final void dp(final boolean paramBoolean)
  {
    boolean bool = true;
    GMTrace.i(11606612246528L, 86476);
    w.i("MicroMsg.IPCallSensorManager", "onSensorEvent, isON:" + paramBoolean + "  hasSkip:" + this.khk + " tick:" + bg.aG(this.khf) + "  lt:" + this.khf);
    if (this.khk)
    {
      if (!paramBoolean) {}
      for (paramBoolean = bool;; paramBoolean = false)
      {
        this.khk = paramBoolean;
        GMTrace.o(11606612246528L, 86476);
        return;
      }
    }
    if ((!paramBoolean) && (this.khf != -1L) && (bg.aG(this.khf) > 400L))
    {
      this.khk = true;
      GMTrace.o(11606612246528L, 86476);
      return;
    }
    this.khk = false;
    w.i("MicroMsg.IPCallSensorManager", "onSensorEvent, isNeedOffScreen: %b", new Object[] { Boolean.valueOf(paramBoolean) });
    new aj(new aj.a()
    {
      public final boolean pO()
      {
        GMTrace.i(11605806940160L, 86470);
        if (!paramBoolean)
        {
          w.i("MicroMsg.IPCallSensorManager", "off screen");
          if (d.this.mYm != null) {
            d.this.mYm.fp(true);
          }
        }
        for (;;)
        {
          GMTrace.o(11605806940160L, 86470);
          return false;
          w.i("MicroMsg.IPCallSensorManager", "light screen");
          if (d.this.mYm != null) {
            d.this.mYm.fp(false);
          }
        }
      }
    }, false).w(50L, 50L);
    GMTrace.o(11606612246528L, 86476);
  }
  
  public static abstract interface a
  {
    public abstract void fp(boolean paramBoolean);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/ipcall/a/b/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */