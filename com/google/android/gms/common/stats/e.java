package com.google.android.gms.common.stats;

import android.os.SystemClock;
import android.support.v4.e.i;

public final class e
{
  private final long ani;
  private final int anj;
  private final i<String, Long> ank;
  
  public e()
  {
    this.ani = 60000L;
    this.anj = 10;
    this.ank = new i(10);
  }
  
  public e(long paramLong)
  {
    this.ani = paramLong;
    this.anj = 1024;
    this.ank = new i();
  }
  
  public final Long aj(String paramString)
  {
    long l2 = SystemClock.elapsedRealtime();
    long l1 = this.ani;
    for (;;)
    {
      int i;
      try
      {
        if (this.ank.size() >= this.anj)
        {
          i = this.ank.size() - 1;
          if (i >= 0)
          {
            if (l2 - ((Long)this.ank.valueAt(i)).longValue() > l1) {
              this.ank.removeAt(i);
            }
          }
          else
          {
            l1 /= 2L;
            new StringBuilder("The max capacity ").append(this.anj).append(" is not enough. Current durationThreshold is: ").append(l1);
          }
        }
        else
        {
          paramString = (Long)this.ank.put(paramString, Long.valueOf(l2));
          return paramString;
        }
      }
      finally {}
      i -= 1;
    }
  }
  
  public final boolean ak(String paramString)
  {
    for (;;)
    {
      try
      {
        if (this.ank.remove(paramString) != null)
        {
          bool = true;
          return bool;
        }
      }
      finally {}
      boolean bool = false;
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/google/android/gms/common/stats/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */