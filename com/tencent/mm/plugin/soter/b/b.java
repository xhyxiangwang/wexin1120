package com.tencent.mm.plugin.soter.b;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ac.i;
import com.tencent.mm.protocal.k.d;
import com.tencent.mm.protocal.k.e;

final class b
  extends i
{
  c.a qXC;
  c.b qXD;
  
  b()
  {
    GMTrace.i(18496679313408L, 137811);
    this.qXC = new c.a();
    this.qXD = new c.b();
    GMTrace.o(18496679313408L, 137811);
  }
  
  protected final k.d AZ()
  {
    GMTrace.i(18497216184320L, 137815);
    c.a locala = this.qXC;
    GMTrace.o(18497216184320L, 137815);
    return locala;
  }
  
  public final k.e Ba()
  {
    GMTrace.i(18497081966592L, 137814);
    c.b localb = this.qXD;
    GMTrace.o(18497081966592L, 137814);
    return localb;
  }
  
  public final int Dz()
  {
    GMTrace.i(18497350402048L, 137816);
    GMTrace.o(18497350402048L, 137816);
    return 1;
  }
  
  public final int getType()
  {
    GMTrace.i(18496813531136L, 137812);
    GMTrace.o(18496813531136L, 137812);
    return 627;
  }
  
  public final String getUri()
  {
    GMTrace.i(18496947748864L, 137813);
    GMTrace.o(18496947748864L, 137813);
    return "/cgi-bin/micromsg-bin/updatesoteraskrsa";
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/soter/b/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */