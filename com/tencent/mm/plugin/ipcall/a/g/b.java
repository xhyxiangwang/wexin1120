package com.tencent.mm.plugin.ipcall.a.g;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.provider.ContactsContract.Data;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public final class b
{
  public static final String kHe;
  private static HashMap<String, c> nap;
  
  static
  {
    GMTrace.i(11574534209536L, 86237);
    kHe = new String(Character.toChars(91));
    nap = new HashMap();
    GMTrace.o(11574534209536L, 86237);
  }
  
  public b()
  {
    GMTrace.i(11573728903168L, 86231);
    GMTrace.o(11573728903168L, 86231);
  }
  
  private static c a(Cursor paramCursor, int paramInt1, int paramInt2, int paramInt3)
  {
    Object localObject2 = null;
    GMTrace.i(11574399991808L, 86236);
    if (!com.tencent.mm.pluginsdk.h.a.aR(ab.getContext(), "android.permission.READ_CONTACTS"))
    {
      w.e("MicroMsg.IPCallAddressBookInfoExtracter", "no contact permission");
      GMTrace.o(11574399991808L, 86236);
      return null;
    }
    c localc = new c();
    localc.naq = new ArrayList();
    Object localObject1 = paramCursor.getString(paramInt1);
    Object localObject3 = paramCursor.getString(paramInt2);
    paramCursor = paramCursor.getString(paramInt3);
    localc.field_contactId = ((String)localObject1);
    localc.field_systemAddressBookUsername = ((String)localObject3);
    if ((!bg.mZ(paramCursor)) && (!localc.naq.contains(paramCursor))) {
      localc.naq.add(paramCursor);
    }
    if ((bg.mZ(localc.field_systemAddressBookUsername)) && (localc.naq.size() > 0)) {
      localc.field_systemAddressBookUsername = ((String)localc.naq.get(0));
    }
    localObject3 = localc.naq.iterator();
    paramCursor = null;
    if (((Iterator)localObject3).hasNext())
    {
      localObject1 = com.tencent.mm.plugin.ipcall.b.a.Ab((String)((Iterator)localObject3).next());
      if (!bg.mZ((String)localObject1))
      {
        paramCursor = (Cursor)localObject1;
        if (((String)localObject1).endsWith("@stranger")) {}
      }
    }
    for (;;)
    {
      if (!bg.mZ((String)localObject1)) {
        localc.field_wechatUsername = ((String)localObject1);
      }
      if (!bg.mZ(localc.field_systemAddressBookUsername)) {}
      for (;;)
      {
        try
        {
          paramCursor = com.tencent.mm.platformtools.c.mO(localc.field_systemAddressBookUsername);
          if (!bg.mZ(paramCursor)) {
            if (!Character.isLetter(paramCursor.charAt(0)))
            {
              localc.field_sortKey = (kHe + paramCursor.toUpperCase());
              GMTrace.o(11574399991808L, 86236);
              return localc;
            }
          }
        }
        catch (Exception paramCursor)
        {
          w.d("MicroMsg.IPCallAddressBookInfoExtracter", "getFullSpell error: %s, class: %s", new Object[] { paramCursor.getMessage(), paramCursor.getClass().getSimpleName() });
          paramCursor = (Cursor)localObject2;
          continue;
          localc.field_sortKey = paramCursor.toUpperCase();
          continue;
          localc.field_sortKey = "";
          continue;
        }
        localc.field_sortKey = "";
      }
      localObject1 = paramCursor;
    }
  }
  
  public static ArrayList<c> aHR()
  {
    GMTrace.i(11573863120896L, 86232);
    long l1 = System.currentTimeMillis();
    ArrayList localArrayList = new ArrayList();
    if (!com.tencent.mm.pluginsdk.h.a.aR(ab.getContext(), "android.permission.READ_CONTACTS"))
    {
      w.e("MicroMsg.IPCallAddressBookInfoExtracter", "no contact permission");
      GMTrace.o(11573863120896L, 86232);
      return localArrayList;
    }
    Cursor localCursor = ab.getContext().getContentResolver().query(ContactsContract.Data.CONTENT_URI, new String[] { "contact_id", "display_name", "data1" }, "mimetype='vnd.android.cursor.item/phone_v2'", null, null);
    HashMap localHashMap = new HashMap();
    w.d("MicroMsg.IPCallAddressBookInfoExtracter", "query FromSystemPhoneBook, time: " + (System.currentTimeMillis() - l1));
    if (localCursor == null)
    {
      GMTrace.o(11573863120896L, 86232);
      return localArrayList;
    }
    for (;;)
    {
      try
      {
        w.d("MicroMsg.IPCallAddressBookInfoExtracter", "getAllAddressItemFromSystemPhoneBook, count: %d", new Object[] { Integer.valueOf(localCursor.getCount()) });
        if (!localCursor.moveToFirst()) {
          break label477;
        }
        int i = localCursor.getColumnIndex("contact_id");
        int j = localCursor.getColumnIndex("display_name");
        int k = localCursor.getColumnIndex("data1");
        if (localCursor.isAfterLast()) {
          break label477;
        }
        c localc1 = a(localCursor, i, j, k);
        if ((localc1 != null) && (localc1.naq != null) && (localc1.naq.size() > 0) && (!bg.mZ(localc1.field_contactId)))
        {
          if (!localHashMap.containsKey(localc1.field_contactId)) {
            continue;
          }
          c localc2 = (c)localHashMap.get(localc1.field_contactId);
          if ((localc1.naq.size() > 0) && (!localc2.naq.contains(localc1.naq.get(0)))) {
            localc2.naq.add(localc1.naq.get(0));
          }
        }
      }
      catch (Exception localException)
      {
        w.e("MicroMsg.IPCallAddressBookInfoExtracter", "getAllAddressItemFromSystemPhoneBook error: %s, class: %s", new Object[] { localException.getMessage(), localException.getClass().getSimpleName() });
        localCursor.close();
        localArrayList.addAll(localHashMap.values());
        nap = localHashMap;
        l2 = System.currentTimeMillis();
        w.d("MicroMsg.IPCallAddressBookInfoExtracter", "getAllAddressItemFromSystemPhoneBook, result size: %d, used %dms", new Object[] { Integer.valueOf(localArrayList.size()), Long.valueOf(l2 - l1) });
        GMTrace.o(11573863120896L, 86232);
        return localArrayList;
        localHashMap.put(localException.field_contactId, localException);
        continue;
      }
      finally
      {
        localCursor.close();
      }
      localCursor.moveToNext();
    }
    for (;;)
    {
      long l2;
      label477:
      localCursor.close();
    }
  }
  
  public static HashMap<String, c> aHS()
  {
    GMTrace.i(11573997338624L, 86233);
    HashMap localHashMap = nap;
    GMTrace.o(11573997338624L, 86233);
    return localHashMap;
  }
  
  public static HashMap<String, c> aHT()
  {
    GMTrace.i(11574131556352L, 86234);
    aHR();
    HashMap localHashMap = nap;
    GMTrace.o(11574131556352L, 86234);
    return localHashMap;
  }
  
  /* Error */
  public static ArrayList<String> zE(String paramString)
  {
    // Byte code:
    //   0: ldc2_w 322
    //   3: ldc_w 324
    //   6: invokestatic 20	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   9: new 84	java/util/ArrayList
    //   12: dup
    //   13: invokespecial 85	java/util/ArrayList:<init>	()V
    //   16: astore_1
    //   17: invokestatic 61	com/tencent/mm/sdk/platformtools/ab:getContext	()Landroid/content/Context;
    //   20: ldc 63
    //   22: invokestatic 69	com/tencent/mm/pluginsdk/h/a:aR	(Landroid/content/Context;Ljava/lang/String;)Z
    //   25: ifne +21 -> 46
    //   28: ldc 71
    //   30: ldc 73
    //   32: invokestatic 79	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   35: ldc2_w 322
    //   38: ldc_w 324
    //   41: invokestatic 43	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   44: aload_1
    //   45: areturn
    //   46: invokestatic 61	com/tencent/mm/sdk/platformtools/ab:getContext	()Landroid/content/Context;
    //   49: invokevirtual 217	android/content/Context:getContentResolver	()Landroid/content/ContentResolver;
    //   52: getstatic 327	android/provider/ContactsContract$CommonDataKinds$Phone:CONTENT_URI	Landroid/net/Uri;
    //   55: aconst_null
    //   56: ldc_w 329
    //   59: iconst_1
    //   60: anewarray 22	java/lang/String
    //   63: dup
    //   64: iconst_0
    //   65: aload_0
    //   66: aastore
    //   67: aconst_null
    //   68: invokevirtual 237	android/content/ContentResolver:query	(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   71: astore_0
    //   72: aload_0
    //   73: ifnonnull +14 -> 87
    //   76: ldc2_w 322
    //   79: ldc_w 324
    //   82: invokestatic 43	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   85: aload_1
    //   86: areturn
    //   87: aload_0
    //   88: invokeinterface 261 1 0
    //   93: ifeq +88 -> 181
    //   96: aload_0
    //   97: invokeinterface 268 1 0
    //   102: ifne +79 -> 181
    //   105: aload_1
    //   106: aload_0
    //   107: aload_0
    //   108: ldc -27
    //   110: invokeinterface 265 2 0
    //   115: invokeinterface 95 2 0
    //   120: invokevirtual 114	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   123: pop
    //   124: aload_0
    //   125: invokeinterface 279 1 0
    //   130: pop
    //   131: goto -35 -> 96
    //   134: astore_2
    //   135: ldc 71
    //   137: ldc_w 331
    //   140: iconst_2
    //   141: anewarray 4	java/lang/Object
    //   144: dup
    //   145: iconst_0
    //   146: aload_2
    //   147: invokevirtual 185	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   150: aastore
    //   151: dup
    //   152: iconst_1
    //   153: aload_2
    //   154: invokevirtual 189	java/lang/Object:getClass	()Ljava/lang/Class;
    //   157: invokevirtual 194	java/lang/Class:getSimpleName	()Ljava/lang/String;
    //   160: aastore
    //   161: invokestatic 283	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   164: aload_0
    //   165: invokeinterface 286 1 0
    //   170: ldc2_w 322
    //   173: ldc_w 324
    //   176: invokestatic 43	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   179: aload_1
    //   180: areturn
    //   181: aload_0
    //   182: invokeinterface 286 1 0
    //   187: goto -17 -> 170
    //   190: astore_1
    //   191: aload_0
    //   192: invokeinterface 286 1 0
    //   197: aload_1
    //   198: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	199	0	paramString	String
    //   16	164	1	localArrayList	ArrayList
    //   190	8	1	localObject	Object
    //   134	20	2	localException	Exception
    // Exception table:
    //   from	to	target	type
    //   87	96	134	java/lang/Exception
    //   96	131	134	java/lang/Exception
    //   87	96	190	finally
    //   96	131	190	finally
    //   135	164	190	finally
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/ipcall/a/g/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */