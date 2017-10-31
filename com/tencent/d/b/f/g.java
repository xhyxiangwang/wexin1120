package com.tencent.d.b.f;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;

public class g
{
  private static volatile g xCJ = null;
  private Handler xCK = null;
  private Handler xCL = null;
  
  private g()
  {
    HandlerThread localHandlerThread = new HandlerThread("SoterGenKeyHandlerThreadName");
    localHandlerThread.start();
    this.xCK = new Handler(localHandlerThread.getLooper());
    this.xCL = new Handler(Looper.getMainLooper());
  }
  
  public static g cmG()
  {
    if (xCJ == null) {
      try
      {
        if (xCJ == null) {
          xCJ = new g();
        }
        g localg = xCJ;
        return localg;
      }
      finally {}
    }
    return xCJ;
  }
  
  public final void k(Runnable paramRunnable, long paramLong)
  {
    this.xCK.postDelayed(paramRunnable, paramLong);
  }
  
  public final void u(Runnable paramRunnable)
  {
    this.xCL.post(paramRunnable);
  }
  
  public final void x(Runnable paramRunnable)
  {
    this.xCK.post(paramRunnable);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/d/b/f/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */