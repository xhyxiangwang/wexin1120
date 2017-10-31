package com.tencent.mm.plugin.appbrand.launching;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.f.e;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

abstract class k<T>
  implements Callable<T>
{
  k()
  {
    GMTrace.i(10149544591360L, 75620);
    GMTrace.o(10149544591360L, 75620);
  }
  
  final Future<T> Yd()
  {
    GMTrace.i(17326434942976L, 129092);
    FutureTask localFutureTask = new FutureTask(this);
    e.post(localFutureTask, getTag());
    GMTrace.o(17326434942976L, 129092);
    return localFutureTask;
  }
  
  abstract String getTag();
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/launching/k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */