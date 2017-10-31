package com.tencent.mm.plugin.ipcall.a.g;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.b.bu;
import com.tencent.mm.sdk.e.c.a;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Map;

public final class c
  extends bu
{
  public static c.a gLR;
  public ArrayList<String> naq;
  
  static
  {
    GMTrace.i(11576950128640L, 86255);
    c.a locala = new c.a();
    locala.hRR = new Field[4];
    locala.columns = new String[5];
    StringBuilder localStringBuilder = new StringBuilder();
    locala.columns[0] = "wechatUsername";
    locala.uQH.put("wechatUsername", "TEXT");
    localStringBuilder.append(" wechatUsername TEXT");
    localStringBuilder.append(", ");
    locala.columns[1] = "systemAddressBookUsername";
    locala.uQH.put("systemAddressBookUsername", "TEXT");
    localStringBuilder.append(" systemAddressBookUsername TEXT");
    localStringBuilder.append(", ");
    locala.columns[2] = "contactId";
    locala.uQH.put("contactId", "TEXT");
    localStringBuilder.append(" contactId TEXT");
    localStringBuilder.append(", ");
    locala.columns[3] = "sortKey";
    locala.uQH.put("sortKey", "TEXT");
    localStringBuilder.append(" sortKey TEXT");
    locala.columns[4] = "rowid";
    locala.uQI = localStringBuilder.toString();
    gLR = locala;
    GMTrace.o(11576950128640L, 86255);
  }
  
  public c()
  {
    GMTrace.i(11576547475456L, 86252);
    GMTrace.o(11576547475456L, 86252);
  }
  
  public static boolean cy(String paramString1, String paramString2)
  {
    GMTrace.i(11576815910912L, 86254);
    if ((paramString1 == null) && (paramString2 != null))
    {
      GMTrace.o(11576815910912L, 86254);
      return false;
    }
    if ((paramString1 != null) && (!paramString1.equals(paramString2)))
    {
      GMTrace.o(11576815910912L, 86254);
      return false;
    }
    GMTrace.o(11576815910912L, 86254);
    return true;
  }
  
  protected final c.a uC()
  {
    GMTrace.i(11576681693184L, 86253);
    c.a locala = gLR;
    GMTrace.o(11576681693184L, 86253);
    return locala;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/ipcall/a/g/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */