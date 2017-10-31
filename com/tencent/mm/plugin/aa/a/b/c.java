package com.tencent.mm.plugin.aa.a.b;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.b.b;
import com.tencent.mm.sdk.e.c.a;
import java.lang.reflect.Field;
import java.util.Map;

public final class c
  extends b
{
  public static c.a gLR;
  
  static
  {
    GMTrace.i(5586678710272L, 41624);
    c.a locala = new c.a();
    locala.hRR = new Field[4];
    locala.columns = new String[5];
    StringBuilder localStringBuilder = new StringBuilder();
    locala.columns[0] = "billNo";
    locala.uQH.put("billNo", "TEXT PRIMARY KEY ");
    localStringBuilder.append(" billNo TEXT PRIMARY KEY ");
    localStringBuilder.append(", ");
    locala.uQG = "billNo";
    locala.columns[1] = "insertmsg";
    locala.uQH.put("insertmsg", "INTEGER");
    localStringBuilder.append(" insertmsg INTEGER");
    localStringBuilder.append(", ");
    locala.columns[2] = "localMsgId";
    locala.uQH.put("localMsgId", "LONG");
    localStringBuilder.append(" localMsgId LONG");
    localStringBuilder.append(", ");
    locala.columns[3] = "status";
    locala.uQH.put("status", "INTEGER default '-1' ");
    localStringBuilder.append(" status INTEGER default '-1' ");
    locala.columns[4] = "rowid";
    locala.uQI = localStringBuilder.toString();
    gLR = locala;
    GMTrace.o(5586678710272L, 41624);
  }
  
  public c()
  {
    GMTrace.i(5586410274816L, 41622);
    GMTrace.o(5586410274816L, 41622);
  }
  
  protected final c.a uC()
  {
    GMTrace.i(5586544492544L, 41623);
    c.a locala = gLR;
    GMTrace.o(5586544492544L, 41623);
    return locala;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/aa/a/b/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */