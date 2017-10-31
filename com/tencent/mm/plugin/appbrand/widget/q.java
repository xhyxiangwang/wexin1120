package com.tencent.mm.plugin.appbrand.widget;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.b.ec;
import com.tencent.mm.sdk.e.c.a;
import java.lang.reflect.Field;
import java.util.Map;

public final class q
  extends ec
{
  public static c.a iBQ;
  
  static
  {
    GMTrace.i(19990119972864L, 148938);
    c.a locala = new c.a();
    locala.hRR = new Field[3];
    locala.columns = new String[4];
    StringBuilder localStringBuilder = new StringBuilder();
    locala.columns[0] = "appIdHash";
    locala.uQH.put("appIdHash", "INTEGER PRIMARY KEY ");
    localStringBuilder.append(" appIdHash INTEGER PRIMARY KEY ");
    localStringBuilder.append(", ");
    locala.uQG = "appIdHash";
    locala.columns[1] = "appId";
    locala.uQH.put("appId", "TEXT");
    localStringBuilder.append(" appId TEXT");
    localStringBuilder.append(", ");
    locala.columns[2] = "openDebug";
    locala.uQH.put("openDebug", "INTEGER");
    localStringBuilder.append(" openDebug INTEGER");
    locala.columns[3] = "rowid";
    locala.uQI = localStringBuilder.toString();
    iBQ = locala;
    GMTrace.o(19990119972864L, 148938);
  }
  
  public q()
  {
    GMTrace.i(19989851537408L, 148936);
    GMTrace.o(19989851537408L, 148936);
  }
  
  protected final c.a uC()
  {
    GMTrace.i(19989985755136L, 148937);
    c.a locala = iBQ;
    GMTrace.o(19989985755136L, 148937);
    return locala;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/widget/q.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */