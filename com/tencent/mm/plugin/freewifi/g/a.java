package com.tencent.mm.plugin.freewifi.g;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.b.be;
import com.tencent.mm.sdk.e.c.a;
import java.lang.reflect.Field;
import java.util.Map;

public final class a
  extends be
{
  protected static c.a gLR;
  
  static
  {
    GMTrace.i(7153804902400L, 53300);
    c.a locala = new c.a();
    locala.hRR = new Field[3];
    locala.columns = new String[4];
    StringBuilder localStringBuilder = new StringBuilder();
    locala.columns[0] = "key";
    locala.uQH.put("key", "TEXT PRIMARY KEY ");
    localStringBuilder.append(" key TEXT PRIMARY KEY ");
    localStringBuilder.append(", ");
    locala.uQG = "key";
    locala.columns[1] = "value";
    locala.uQH.put("value", "TEXT");
    localStringBuilder.append(" value TEXT");
    localStringBuilder.append(", ");
    locala.columns[2] = "modifyTime";
    locala.uQH.put("modifyTime", "LONG default '0' ");
    localStringBuilder.append(" modifyTime LONG default '0' ");
    locala.columns[3] = "rowid";
    locala.uQI = localStringBuilder.toString();
    gLR = locala;
    GMTrace.o(7153804902400L, 53300);
  }
  
  public a()
  {
    GMTrace.i(7153536466944L, 53298);
    GMTrace.o(7153536466944L, 53298);
  }
  
  protected final c.a uC()
  {
    GMTrace.i(7153670684672L, 53299);
    c.a locala = gLR;
    GMTrace.o(7153670684672L, 53299);
    return locala;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/freewifi/g/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */