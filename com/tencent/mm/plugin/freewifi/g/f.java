package com.tencent.mm.plugin.freewifi.g;

import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.freewifi.m;
import com.tencent.mm.protocal.c.tr;
import com.tencent.mm.sdk.e.i;
import com.tencent.mm.sdk.platformtools.w;
import java.util.LinkedHashMap;
import java.util.LinkedList;

public final class f
  extends i<e>
{
  public static final String[] gMz;
  public static LinkedHashMap<String, Class> mfI;
  
  static
  {
    GMTrace.i(7154878644224L, 53308);
    gMz = new String[] { i.a(e.gLR, "FreeWifiLog"), "CREATE INDEX IF NOT EXISTS idx_FreeWifiLog_key  on FreeWifiLog  (  id )" };
    mfI = new LinkedHashMap() {};
    GMTrace.o(7154878644224L, 53308);
  }
  
  public f(com.tencent.mm.sdk.e.e parame)
  {
    super(parame, e.gLR, "FreeWifiLog", null);
    GMTrace.i(7154475991040L, 53305);
    GMTrace.o(7154475991040L, 53305);
  }
  
  public final boolean a(String paramString1, int paramInt, String paramString2, long paramLong)
  {
    GMTrace.i(7154744426496L, 53307);
    w.i("MicroMsg.FreeWifi.FreeWifiLogStorage", "save. id=%s, protocolNumber=%d, logContent=%s, createTime=%d", new Object[] { paramString1, Integer.valueOf(paramInt), paramString2, Long.valueOf(paramLong) });
    if (m.xJ(paramString1))
    {
      GMTrace.o(7154744426496L, 53307);
      return false;
    }
    Cursor localCursor = rawQuery("select * from FreeWifiLog where id = '" + paramString1 + "'", new String[0]);
    try
    {
      e locale = new e();
      locale.field_id = paramString1;
      locale.field_protocolNumber = paramInt;
      locale.field_logContent = paramString2;
      locale.field_createTime = paramLong;
      if (localCursor.getCount() == 0)
      {
        bool = b(locale);
        w.i("MicroMsg.FreeWifi.FreeWifiLogStorage", "insert ret" + bool);
        localCursor.close();
        GMTrace.o(7154744426496L, 53307);
        return bool;
      }
      boolean bool = c(locale, new String[0]);
      w.i("MicroMsg.FreeWifi.FreeWifiLogStorage", "update ret" + bool);
      localCursor.close();
      GMTrace.o(7154744426496L, 53307);
      return bool;
    }
    catch (Exception paramString1)
    {
      w.e("MicroMsg.FreeWifi.FreeWifiLogStorage", m.e(paramString1));
      localCursor.close();
      GMTrace.o(7154744426496L, 53307);
      return false;
    }
    finally
    {
      localCursor.close();
    }
  }
  
  public final LinkedList<tr> aAH()
  {
    GMTrace.i(7154610208768L, 53306);
    Cursor localCursor = rawQuery("select id, protocolNumber, logContent, createTime from FreeWifiLog", new String[0]);
    LinkedList localLinkedList = new LinkedList();
    while ((localCursor != null) && (localCursor.moveToNext()))
    {
      tr localtr = new tr();
      localtr.id = localCursor.getString(0);
      localtr.meC = localCursor.getInt(1);
      localtr.tRM = localCursor.getString(2);
      localtr.tRN = localCursor.getLong(3);
      localLinkedList.add(localtr);
    }
    if (localCursor != null) {
      localCursor.close();
    }
    GMTrace.o(7154610208768L, 53306);
    return localLinkedList;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/freewifi/g/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */