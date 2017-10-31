package com.tencent.mm.plugin.appbrand.collector;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.w;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

public final class f
{
  private static final AtomicInteger iGD;
  private static final AtomicLong iGE;
  private static boolean iGF;
  
  static
  {
    GMTrace.i(20372237844480L, 151785);
    iGD = new AtomicInteger();
    iGE = new AtomicLong();
    GMTrace.o(20372237844480L, 151785);
  }
  
  public static boolean TL()
  {
    GMTrace.i(20371969409024L, 151783);
    boolean bool = iGF;
    GMTrace.o(20371969409024L, 151783);
    return bool;
  }
  
  public static String TM()
  {
    float f2 = 0.0F;
    GMTrace.i(20372103626752L, 151784);
    int i = iGD.get();
    long l1 = iGE.get();
    Object localObject = new StringBuilder();
    StringBuilder localStringBuilder = ((StringBuilder)localObject).append("fps : ");
    int j = iGD.get();
    long l2 = iGE.get();
    if ((!iGF) || (l2 <= 0L))
    {
      f1 = 0.0F;
      localStringBuilder.append(f1);
      ((StringBuilder)localObject).append("\ncount : ").append(i);
      localStringBuilder = ((StringBuilder)localObject).append("\naverage cost : ");
      if (i > 0) {
        break label145;
      }
    }
    label145:
    for (float f1 = f2;; f1 = 1.0F * (float)l1 / i)
    {
      localStringBuilder.append(f1);
      localObject = ((StringBuilder)localObject).toString();
      GMTrace.o(20372103626752L, 151784);
      return (String)localObject;
      f1 = j * 1000.0F / (float)l2;
      break;
    }
  }
  
  public static void aI(long paramLong)
  {
    GMTrace.i(20371566755840L, 151780);
    if ((!iGF) || (paramLong <= 0L))
    {
      GMTrace.o(20371566755840L, 151780);
      return;
    }
    w.v("MicroMsg.FPSCollector", "collect(cost : %s)", new Object[] { Long.valueOf(paramLong) });
    iGE.addAndGet(paramLong);
    iGD.getAndIncrement();
    GMTrace.o(20371566755840L, 151780);
  }
  
  public static void bZ(boolean paramBoolean)
  {
    GMTrace.i(20371835191296L, 151782);
    iGF = paramBoolean;
    GMTrace.o(20371835191296L, 151782);
  }
  
  public static void reset()
  {
    GMTrace.i(20371700973568L, 151781);
    iGD.set(0);
    iGE.set(0L);
    GMTrace.o(20371700973568L, 151781);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/collector/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */