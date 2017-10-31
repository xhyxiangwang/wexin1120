package com.tencent.mm.plugin.appbrand.appstorage;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.b.i;
import com.tencent.mm.sdk.e.c.a;
import java.lang.reflect.Field;
import java.util.Map;

public final class a
  extends i
{
  protected static c.a gLR;
  
  static
  {
    GMTrace.i(10634473242624L, 79233);
    c.a locala = new c.a();
    locala.hRR = new Field[4];
    locala.columns = new String[5];
    StringBuilder localStringBuilder = new StringBuilder();
    locala.columns[0] = "key";
    locala.uQH.put("key", "TEXT PRIMARY KEY ");
    localStringBuilder.append(" key TEXT PRIMARY KEY ");
    localStringBuilder.append(", ");
    locala.uQG = "key";
    locala.columns[1] = "data";
    locala.uQH.put("data", "TEXT");
    localStringBuilder.append(" data TEXT");
    localStringBuilder.append(", ");
    locala.columns[2] = "dataType";
    locala.uQH.put("dataType", "TEXT");
    localStringBuilder.append(" dataType TEXT");
    localStringBuilder.append(", ");
    locala.columns[3] = "size";
    locala.uQH.put("size", "INTEGER");
    localStringBuilder.append(" size INTEGER");
    locala.columns[4] = "rowid";
    locala.uQI = localStringBuilder.toString();
    gLR = locala;
    GMTrace.o(10634473242624L, 79233);
  }
  
  public a()
  {
    GMTrace.i(10634204807168L, 79231);
    GMTrace.o(10634204807168L, 79231);
  }
  
  protected final c.a uC()
  {
    GMTrace.i(10634339024896L, 79232);
    c.a locala = gLR;
    GMTrace.o(10634339024896L, 79232);
    return locala;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/appstorage/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */