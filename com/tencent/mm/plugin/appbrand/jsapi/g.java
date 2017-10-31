package com.tencent.mm.plugin.appbrand.jsapi;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.report.a;
import java.util.HashMap;

final class g
{
  final HashMap<Integer, a> iPB;
  
  g()
  {
    GMTrace.i(17390993670144L, 129573);
    this.iPB = new HashMap();
    GMTrace.o(17390993670144L, 129573);
  }
  
  public final void w(int paramInt, String paramString)
  {
    GMTrace.i(17391127887872L, 129574);
    a locala = (a)this.iPB.remove(Integer.valueOf(paramInt));
    if (locala == null)
    {
      GMTrace.o(17391127887872L, 129574);
      return;
    }
    int i = com.tencent.mm.plugin.appbrand.permission.c.a(locala.iPC, locala.iPD);
    long l1 = System.currentTimeMillis();
    long l2 = locala.startTime;
    a.a(locala.iPC.getAppId(), locala.path, locala.iPD.getName(), locala.data, i, l1 - l2, paramString);
    this.iPB.remove(Integer.valueOf(paramInt));
    GMTrace.o(17391127887872L, 129574);
  }
  
  private static final class a
  {
    String data;
    c iPC;
    b iPD;
    String path;
    long startTime;
    
    a(c paramc, b paramb, String paramString1, long paramLong, String paramString2)
    {
      GMTrace.i(18838800302080L, 140360);
      this.iPC = paramc;
      this.iPD = paramb;
      this.data = paramString1;
      this.startTime = paramLong;
      this.path = paramString2;
      GMTrace.o(18838800302080L, 140360);
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */