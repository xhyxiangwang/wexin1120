package com.tencent.mm.plugin.appbrand.performance;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.io.RandomAccessFile;

public final class c
{
  private final int jmW;
  private volatile RandomAccessFile jmX;
  private volatile RandomAccessFile jmY;
  private long jmZ;
  private long jna;
  private long jnb;
  
  public c(int paramInt)
  {
    GMTrace.i(15449802670080L, 115110);
    this.jmW = paramInt;
    GMTrace.o(15449802670080L, 115110);
  }
  
  public final double Zt()
  {
    GMTrace.i(15449936887808L, 115111);
    for (;;)
    {
      try
      {
        if (this.jmY == null) {
          this.jmY = new RandomAccessFile("/proc/" + this.jmW + "/stat", "r");
        }
        this.jmY.seek(0L);
        Object localObject1 = this.jmY.readLine();
        boolean bool = bg.mZ((String)localObject1);
        if (bool)
        {
          GMTrace.o(15449936887808L, 115111);
          return 0.0D;
        }
        localObject1 = ((String)localObject1).split(" ");
        int i = localObject1.length;
        if (i < 17)
        {
          GMTrace.o(15449936887808L, 115111);
          return 0.0D;
        }
        if (this.jmX == null) {
          this.jmX = new RandomAccessFile("/proc/stat", "r");
        }
        this.jmX.seek(0L);
        localObject2 = this.jmX.readLine();
        if (bg.mZ((String)localObject2))
        {
          l1 = 0L;
          l2 = Long.parseLong(localObject1[13]);
          l3 = Long.parseLong(localObject1[14]);
          if (this.jmZ == 0L) {
            continue;
          }
          double d2 = (l2 - this.jna) * 100L / (l1 - this.jmZ);
          d1 = (l3 - this.jnb) * 100L / (l1 - this.jmZ);
          d2 = Math.max(0.0D, d2);
          d1 = Math.max(0.0D, d1);
          d1 = d2 + d1;
        }
      }
      catch (Exception localException1)
      {
        Object localObject2;
        long l1;
        long l2;
        long l3;
        long l4;
        long l5;
        long l6;
        long l7;
        long l8;
        double d1 = 0.0D;
        w.e(" MicroMsg.CpuSampler", "read pid stat file error: " + localException1);
        continue;
        d1 = 0.0D;
        continue;
      }
      try
      {
        this.jmZ = l1;
        this.jna = l2;
        this.jnb = l3;
        GMTrace.o(15449936887808L, 115111);
        return d1;
      }
      catch (Exception localException2)
      {
        continue;
      }
      localObject2 = ((String)localObject2).split(" ");
      if (localObject2.length < 9)
      {
        l1 = 0L;
      }
      else
      {
        l1 = Long.parseLong(localObject2[2]);
        l2 = Long.parseLong(localObject2[3]);
        l3 = Long.parseLong(localObject2[4]);
        l4 = Long.parseLong(localObject2[5]);
        l5 = Long.parseLong(localObject2[6]);
        l6 = Long.parseLong(localObject2[7]);
        l7 = Long.parseLong(localObject2[8]);
        l8 = Long.parseLong(localObject2[9]);
        l1 = l8 + (l1 + l2 + l3 + l4 + l5 + l6 + l7);
      }
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/performance/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */