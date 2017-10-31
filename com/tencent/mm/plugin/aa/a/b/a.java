package com.tencent.mm.plugin.aa.a.b;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.e.c.a;
import java.lang.reflect.Field;
import java.util.Map;

public final class a
  extends com.tencent.mm.g.b.a
{
  public static c.a gLR;
  
  static
  {
    GMTrace.i(5587886669824L, 41633);
    c.a locala = new c.a();
    locala.hRR = new Field[4];
    locala.columns = new String[5];
    StringBuilder localStringBuilder = new StringBuilder();
    locala.columns[0] = "payMsgId";
    locala.uQH.put("payMsgId", "TEXT PRIMARY KEY ");
    localStringBuilder.append(" payMsgId TEXT PRIMARY KEY ");
    localStringBuilder.append(", ");
    locala.uQG = "payMsgId";
    locala.columns[1] = "insertmsg";
    locala.uQH.put("insertmsg", "INTEGER");
    localStringBuilder.append(" insertmsg INTEGER");
    localStringBuilder.append(", ");
    locala.columns[2] = "chatroom";
    locala.uQH.put("chatroom", "TEXT");
    localStringBuilder.append(" chatroom TEXT");
    localStringBuilder.append(", ");
    locala.columns[3] = "msgId";
    locala.uQH.put("msgId", "LONG");
    localStringBuilder.append(" msgId LONG");
    locala.columns[4] = "rowid";
    locala.uQI = localStringBuilder.toString();
    gLR = locala;
    GMTrace.o(5587886669824L, 41633);
  }
  
  public a()
  {
    GMTrace.i(5587618234368L, 41631);
    GMTrace.o(5587618234368L, 41631);
  }
  
  protected final c.a uC()
  {
    GMTrace.i(5587752452096L, 41632);
    c.a locala = gLR;
    GMTrace.o(5587752452096L, 41632);
    return locala;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/aa/a/b/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */