package com.tencent.mm.plugin.appbrand.launching;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.b.cb;
import com.tencent.mm.sdk.e.c.a;
import java.lang.reflect.Field;
import java.util.Map;

public final class h
  extends cb
{
  static final c.a iAU;
  
  static
  {
    GMTrace.i(15444299743232L, 115069);
    c.a locala = new c.a();
    locala.hRR = new Field[6];
    locala.columns = new String[7];
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
    locala.columns[2] = "launchAction";
    locala.uQH.put("launchAction", "BLOB");
    localStringBuilder.append(" launchAction BLOB");
    localStringBuilder.append(", ");
    locala.columns[3] = "jsapiInfo";
    locala.uQH.put("jsapiInfo", "BLOB");
    localStringBuilder.append(" jsapiInfo BLOB");
    localStringBuilder.append(", ");
    locala.columns[4] = "hostInfo";
    locala.uQH.put("hostInfo", "BLOB");
    localStringBuilder.append(" hostInfo BLOB");
    localStringBuilder.append(", ");
    locala.columns[5] = "actionsheetInfo";
    locala.uQH.put("actionsheetInfo", "BLOB");
    localStringBuilder.append(" actionsheetInfo BLOB");
    locala.columns[6] = "rowid";
    locala.uQI = localStringBuilder.toString();
    iAU = locala;
    GMTrace.o(15444299743232L, 115069);
  }
  
  public h()
  {
    GMTrace.i(15444031307776L, 115067);
    GMTrace.o(15444031307776L, 115067);
  }
  
  protected final c.a uC()
  {
    GMTrace.i(15444165525504L, 115068);
    c.a locala = iAU;
    GMTrace.o(15444165525504L, 115068);
    return locala;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/launching/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */