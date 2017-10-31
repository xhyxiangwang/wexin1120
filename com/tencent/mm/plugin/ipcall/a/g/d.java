package com.tencent.mm.plugin.ipcall.a.g;

import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.bt.g;
import com.tencent.mm.plugin.ipcall.b.a;
import com.tencent.mm.sdk.e.e;
import com.tencent.mm.sdk.e.i;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.util.ArrayList;
import java.util.Iterator;

public final class d
  extends i<c>
{
  public static final String[] gMz;
  public static final String[] nar;
  public e gMB;
  
  static
  {
    GMTrace.i(11576279040000L, 86250);
    gMz = new String[] { i.a(c.gLR, "IPCallAddressItem") };
    nar = new String[] { "*", "rowid" };
    GMTrace.o(11576279040000L, 86250);
  }
  
  public d(e parame)
  {
    super(parame, c.gLR, "IPCallAddressItem", null);
    GMTrace.i(11575071080448L, 86241);
    this.gMB = parame;
    GMTrace.o(11575071080448L, 86241);
  }
  
  private Cursor zI(String paramString)
  {
    GMTrace.i(11575876386816L, 86247);
    paramString = this.gMB.query("IPCallAddressItem", nar, "systemAddressBookUsername LIKE ? or sortKey LIKE ?", new String[] { "%" + paramString + "%", "%" + paramString + "%" }, null, null, "upper(sortKey) asc");
    GMTrace.o(11575876386816L, 86247);
    return paramString;
  }
  
  public final ArrayList<c> aHU()
  {
    GMTrace.i(11575607951360L, 86245);
    Cursor localCursor = this.gMB.a("IPCallAddressItem", nar, null, null, null, null, null, 2);
    if (localCursor != null) {}
    try
    {
      if (localCursor.moveToFirst())
      {
        ArrayList localArrayList = new ArrayList();
        boolean bool;
        do
        {
          c localc = new c();
          localc.b(localCursor);
          localArrayList.add(localc);
          bool = localCursor.moveToNext();
        } while (bool);
        if (localCursor != null) {
          localCursor.close();
        }
        GMTrace.o(11575607951360L, 86245);
        return localArrayList;
      }
      if (localCursor != null) {
        localCursor.close();
      }
      GMTrace.o(11575607951360L, 86245);
      return null;
    }
    catch (Exception localException)
    {
      w.e("MicroMsg.IPCallAddressStorage", "getAllAddress, error: %s", new Object[] { localException.getMessage() });
      if (localCursor != null) {
        localCursor.close();
      }
      GMTrace.o(11575607951360L, 86245);
      return null;
    }
    finally
    {
      if (localCursor != null) {
        localCursor.close();
      }
    }
  }
  
  public final long cA(long paramLong)
  {
    GMTrace.i(11576010604544L, 86248);
    if ((this.gMB instanceof g))
    {
      paramLong = ((g)this.gMB).cA(paramLong);
      GMTrace.o(11576010604544L, 86248);
      return paramLong;
    }
    GMTrace.o(11576010604544L, 86248);
    return -1L;
  }
  
  public final void cB(long paramLong)
  {
    GMTrace.i(11576144822272L, 86249);
    if (((this.gMB instanceof g)) && (paramLong != -1L)) {
      ((g)this.gMB).aJ(paramLong);
    }
    GMTrace.o(11576144822272L, 86249);
  }
  
  public final c cz(long paramLong)
  {
    GMTrace.i(11575473733632L, 86244);
    localCursor = this.gMB.a("IPCallAddressItem", nar, "rowid=?", new String[] { String.valueOf(paramLong) }, null, null, null, 2);
    try
    {
      if (localCursor.moveToFirst())
      {
        c localc = new c();
        localc.b(localCursor);
        if (localCursor != null) {
          localCursor.close();
        }
        GMTrace.o(11575473733632L, 86244);
        return localc;
      }
    }
    catch (Exception localException)
    {
      for (;;)
      {
        w.d("MicroMsg.IPCallAddressStorage", "getByLocalId error: %s", new Object[] { localException.getMessage() });
        if (localCursor != null) {
          localCursor.close();
        }
      }
    }
    finally
    {
      if (localCursor == null) {
        break label151;
      }
      localCursor.close();
    }
    GMTrace.o(11575473733632L, 86244);
    return null;
  }
  
  public final c zF(String paramString)
  {
    GMTrace.i(11575205298176L, 86242);
    if (bg.mZ(paramString))
    {
      GMTrace.o(11575205298176L, 86242);
      return null;
    }
    paramString = this.gMB.a("IPCallAddressItem", nar, "contactId=?", new String[] { paramString }, null, null, null, 2);
    try
    {
      if (paramString.moveToFirst())
      {
        c localc = new c();
        localc.b(paramString);
        if (paramString != null) {
          paramString.close();
        }
        GMTrace.o(11575205298176L, 86242);
        return localc;
      }
    }
    catch (Exception localException)
    {
      for (;;)
      {
        w.e("MicroMsg.IPCallAddressStorage", "getByContactId error: %s", new Object[] { localException.getMessage() });
        if (paramString != null) {
          paramString.close();
        }
      }
    }
    finally
    {
      if (paramString == null) {
        break label159;
      }
      paramString.close();
    }
    GMTrace.o(11575205298176L, 86242);
    return null;
  }
  
  public final c zG(String paramString)
  {
    GMTrace.i(11575339515904L, 86243);
    if (bg.mZ(paramString))
    {
      GMTrace.o(11575339515904L, 86243);
      return null;
    }
    paramString = this.gMB.a("IPCallAddressItem", nar, "systemAddressBookUsername=?", new String[] { paramString }, null, null, null, 2);
    try
    {
      if (paramString.moveToFirst())
      {
        c localc = new c();
        localc.b(paramString);
        if (paramString != null) {
          paramString.close();
        }
        GMTrace.o(11575339515904L, 86243);
        return localc;
      }
    }
    catch (Exception localException)
    {
      for (;;)
      {
        w.d("MicroMsg.IPCallAddressStorage", "getByContactName error: %s", new Object[] { localException.getMessage() });
        if (paramString != null) {
          paramString.close();
        }
      }
    }
    finally
    {
      if (paramString == null) {
        break label159;
      }
      paramString.close();
    }
    GMTrace.o(11575339515904L, 86243);
    return null;
  }
  
  public final Cursor zH(String paramString)
  {
    GMTrace.i(11575742169088L, 86246);
    System.currentTimeMillis();
    int i = 0;
    if (i < paramString.length()) {
      if (!Character.isDigit(paramString.charAt(i)))
      {
        i = 0;
        label35:
        if (i != 0) {
          break label71;
        }
      }
    }
    for (paramString = zI(paramString);; paramString = this.gMB.query("IPCallAddressItem", nar, "contactId IN " + paramString, null, null, null, "upper(sortKey) asc"))
    {
      System.currentTimeMillis();
      GMTrace.o(11575742169088L, 86246);
      return paramString;
      i += 1;
      break;
      i = 1;
      break label35;
      label71:
      Object localObject1 = a.Am(paramString);
      paramString = zI(paramString);
      try
      {
        if (paramString.moveToFirst()) {
          while (!paramString.isAfterLast())
          {
            ((ArrayList)localObject1).add(paramString.getString(paramString.getColumnIndex("contactId")));
            paramString.moveToNext();
          }
        }
        String str2;
        str1 = paramString;
      }
      catch (Exception localException)
      {
        w.e("MicroMsg.IPCallAddressStorage", "getContactIdList error: %s", new Object[] { localException.getMessage() });
        if (paramString != null) {
          paramString.close();
        }
        for (;;)
        {
          localObject1 = ((ArrayList)localObject1).iterator();
          for (paramString = ""; ((Iterator)localObject1).hasNext(); paramString = paramString + str2 + ",") {
            str2 = (String)((Iterator)localObject1).next();
          }
          if (paramString != null) {
            paramString.close();
          }
        }
      }
      finally
      {
        if (paramString != null) {
          paramString.close();
        }
      }
      String str1;
      if (paramString.lastIndexOf(",") >= 0) {
        str1 = paramString.substring(0, paramString.lastIndexOf(","));
      }
      paramString = "(" + str1 + ")";
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/ipcall/a/g/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */