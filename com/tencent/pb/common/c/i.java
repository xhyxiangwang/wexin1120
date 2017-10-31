package com.tencent.pb.common.c;

import android.os.Handler;
import android.os.Looper;

public final class i
{
  public static Handler ix = new Handler(Looper.getMainLooper());
  
  public static void ab(Runnable paramRunnable)
  {
    if (Looper.getMainLooper().getThread() == Thread.currentThread()) {}
    for (int i = 1; i != 0; i = 0)
    {
      paramRunnable.run();
      return;
    }
    ix.post(paramRunnable);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/pb/common/c/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */