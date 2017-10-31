package com.tencent.mm.plugin.appbrand.performance;

import android.annotation.TargetApi;
import android.view.Choreographer;
import android.view.Choreographer.FrameCallback;
import com.tencent.gmtrace.GMTrace;

@TargetApi(16)
public final class d
  implements Choreographer.FrameCallback
{
  boolean Af;
  a jmO;
  Choreographer jnc;
  long jnd;
  int jne;
  long jnf;
  
  public d()
  {
    GMTrace.i(15454231855104L, 115143);
    this.jnd = 0L;
    this.jne = 0;
    this.Af = true;
    this.jnc = Choreographer.getInstance();
    this.jnf = 200L;
    GMTrace.o(15454231855104L, 115143);
  }
  
  public final void doFrame(long paramLong)
  {
    double d1 = 60.0D;
    GMTrace.i(15454366072832L, 115144);
    if (!this.Af)
    {
      GMTrace.o(15454366072832L, 115144);
      return;
    }
    paramLong /= 1000000L;
    double d2;
    if (this.jnd > 0L)
    {
      long l = paramLong - this.jnd;
      this.jne += 1;
      if (l > this.jnf)
      {
        d2 = this.jne * 1000 / l;
        if (d2 < 60.0D) {
          break label147;
        }
      }
    }
    for (;;)
    {
      this.jnd = paramLong;
      this.jne = 0;
      if (this.jmO != null) {
        this.jmO.i(d1);
      }
      for (;;)
      {
        this.jnc.postFrameCallback(this);
        GMTrace.o(15454366072832L, 115144);
        return;
        this.jnd = paramLong;
      }
      label147:
      d1 = d2;
    }
  }
  
  public static abstract interface a
  {
    public abstract void i(double paramDouble);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/performance/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */