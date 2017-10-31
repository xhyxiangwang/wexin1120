package com.tencent.mm.plugin.offline.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.b.ci;
import com.tencent.mm.sdk.e.c.a;
import java.lang.reflect.Field;
import java.util.Map;

public final class q
  extends ci
{
  public static c.a gLR;
  
  static
  {
    GMTrace.i(15374103871488L, 114546);
    c.a locala = new c.a();
    locala.hRR = new Field[4];
    locala.columns = new String[5];
    StringBuilder localStringBuilder = new StringBuilder();
    locala.columns[0] = "reqkey";
    locala.uQH.put("reqkey", "TEXT PRIMARY KEY ");
    localStringBuilder.append(" reqkey TEXT PRIMARY KEY ");
    localStringBuilder.append(", ");
    locala.uQG = "reqkey";
    locala.columns[1] = "ack_key";
    locala.uQH.put("ack_key", "TEXT");
    localStringBuilder.append(" ack_key TEXT");
    localStringBuilder.append(", ");
    locala.columns[2] = "status";
    locala.uQH.put("status", "INTEGER");
    localStringBuilder.append(" status INTEGER");
    localStringBuilder.append(", ");
    locala.columns[3] = "receive_time";
    locala.uQH.put("receive_time", "LONG");
    localStringBuilder.append(" receive_time LONG");
    locala.columns[4] = "rowid";
    locala.uQI = localStringBuilder.toString();
    gLR = locala;
    GMTrace.o(15374103871488L, 114546);
  }
  
  public q()
  {
    GMTrace.i(15373835436032L, 114544);
    GMTrace.o(15373835436032L, 114544);
  }
  
  protected final c.a uC()
  {
    GMTrace.i(15373969653760L, 114545);
    c.a locala = gLR;
    GMTrace.o(15373969653760L, 114545);
    return locala;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/offline/a/q.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */