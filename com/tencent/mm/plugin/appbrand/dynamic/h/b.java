package com.tencent.mm.plugin.appbrand.dynamic.h;

import com.tencent.gmtrace.GMTrace;

public final class b
{
  private static a iMT;
  private static a iMU;
  
  static
  {
    GMTrace.i(19985288134656L, 148902);
    iMT = new a();
    iMU = new a();
    GMTrace.o(19985288134656L, 148902);
  }
  
  public static void Vf()
  {
    GMTrace.i(19984885481472L, 148899);
    a(5, 6, 7, 8, iMU);
    a(0, 1, 1, 3, iMT);
    iMU.reset();
    iMT.reset();
    GMTrace.o(19984885481472L, 148899);
  }
  
  private static void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, a parama)
  {
    GMTrace.i(19985153916928L, 148901);
    int i = parama.count;
    long l1 = parama.iMV;
    long l2 = parama.iMW;
    long l3 = parama.iMX;
    if ((l1 <= 0L) || (l2 <= 0L) || (i <= 0) || (l3 <= 0L))
    {
      GMTrace.o(19985153916928L, 148901);
      return;
    }
    com.tencent.mm.plugin.report.service.g.paX.a(690L, paramInt1, l1, false);
    com.tencent.mm.plugin.report.service.g.paX.a(690L, paramInt2, l2, false);
    com.tencent.mm.plugin.report.service.g.paX.a(690L, paramInt3, i, false);
    com.tencent.mm.plugin.report.service.g.paX.a(690L, paramInt4, l3, false);
    GMTrace.o(19985153916928L, 148901);
  }
  
  private static void a(a parama, long paramLong, int paramInt)
  {
    GMTrace.i(19985019699200L, 148900);
    try
    {
      parama.iMV += paramLong / 1000L;
      parama.iMW += paramInt;
      parama.iMX += paramLong / paramInt;
      parama.count += 1;
      GMTrace.o(19985019699200L, 148900);
      return;
    }
    finally {}
  }
  
  public static void f(long paramLong, int paramInt)
  {
    GMTrace.i(19984751263744L, 148898);
    if ((paramLong <= 0L) || (paramInt <= 0))
    {
      GMTrace.o(19984751263744L, 148898);
      return;
    }
    switch (com.tencent.mm.plugin.appbrand.dynamic.e.g.UW())
    {
    default: 
      a(iMT, paramLong, paramInt);
      GMTrace.o(19984751263744L, 148898);
      return;
    }
    a(iMU, paramLong, paramInt);
    GMTrace.o(19984751263744L, 148898);
  }
  
  private static final class a
  {
    volatile int count;
    volatile long iMV;
    volatile long iMW;
    volatile long iMX;
    
    public a()
    {
      GMTrace.i(19985825005568L, 148906);
      GMTrace.o(19985825005568L, 148906);
    }
    
    final void reset()
    {
      try
      {
        GMTrace.i(19985959223296L, 148907);
        this.iMV = 0L;
        this.iMW = 0L;
        this.count = 0;
        GMTrace.o(19985959223296L, 148907);
        return;
      }
      finally
      {
        localObject = finally;
        throw ((Throwable)localObject);
      }
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/dynamic/h/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */