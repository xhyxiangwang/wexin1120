package com.tencent.mm.plugin.appbrand.config;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.b.h;
import com.tencent.mm.sdk.e.c.a;
import java.lang.reflect.Field;
import java.util.Map;

public final class b
  extends h
{
  public static final c.a iBQ;
  
  static
  {
    GMTrace.i(10578638667776L, 78817);
    c.a locala = new c.a();
    locala.hRR = new Field[2];
    locala.columns = new String[3];
    StringBuilder localStringBuilder = new StringBuilder();
    locala.columns[0] = "key";
    locala.uQH.put("key", "TEXT PRIMARY KEY ");
    localStringBuilder.append(" key TEXT PRIMARY KEY ");
    localStringBuilder.append(", ");
    locala.uQG = "key";
    locala.columns[1] = "value";
    locala.uQH.put("value", "TEXT");
    localStringBuilder.append(" value TEXT");
    locala.columns[2] = "rowid";
    locala.uQI = localStringBuilder.toString();
    iBQ = locala;
    GMTrace.o(10578638667776L, 78817);
  }
  
  public b()
  {
    GMTrace.i(10578370232320L, 78815);
    GMTrace.o(10578370232320L, 78815);
  }
  
  protected final c.a uC()
  {
    GMTrace.i(10578504450048L, 78816);
    c.a locala = iBQ;
    GMTrace.o(10578504450048L, 78816);
    return locala;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/config/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */