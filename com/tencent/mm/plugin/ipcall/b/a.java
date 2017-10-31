package com.tencent.mm.plugin.ipcall.b;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.provider.ContactsContract.CommonDataKinds.Phone;
import android.telephony.PhoneNumberUtils;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.l;
import com.tencent.mm.a.g;
import com.tencent.mm.g.a.at;
import com.tencent.mm.g.a.at.a;
import com.tencent.mm.pluginsdk.l.a;
import com.tencent.mm.pluginsdk.l.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.an;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.RegionCodeDecoder;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

public final class a
{
  public static int nhU;
  public static String nhV;
  public static String nhW;
  public static String nhX;
  private static an nhY;
  private static HashMap<String, b> nhZ;
  private static HashMap<String, String> nia;
  private static HashMap<String, String> nib;
  private static HashMap<String, String> nic;
  private static HashMap<String, String> nid;
  
  static
  {
    GMTrace.i(11741232627712L, 87479);
    nhU = 3;
    nhV = "+";
    nhW = "00";
    nhX = null;
    nhY = new an();
    nhZ = new HashMap();
    nia = new HashMap();
    nib = new HashMap();
    nic = new HashMap();
    nid = new HashMap();
    GMTrace.o(11741232627712L, 87479);
  }
  
  public static String Ab(String paramString)
  {
    GMTrace.i(11738548273152L, 87459);
    if (com.tencent.mm.sdk.platformtools.bg.mZ(paramString))
    {
      GMTrace.o(11738548273152L, 87459);
      return null;
    }
    paramString = g.n(c.Ao(paramString).getBytes());
    paramString = l.a.sRu.jA(paramString);
    GMTrace.o(11738548273152L, 87459);
    return paramString;
  }
  
  public static String Ac(String paramString)
  {
    GMTrace.i(11738682490880L, 87460);
    if (!com.tencent.mm.sdk.platformtools.bg.mZ(paramString))
    {
      paramString = l.a.sRu.jB(paramString);
      GMTrace.o(11738682490880L, 87460);
      return paramString;
    }
    GMTrace.o(11738682490880L, 87460);
    return null;
  }
  
  public static String Ad(String paramString)
  {
    GMTrace.i(11739219361792L, 87464);
    if (nhZ.size() == 0) {
      aIy();
    }
    if (com.tencent.mm.sdk.platformtools.bg.mZ(paramString))
    {
      GMTrace.o(11739219361792L, 87464);
      return null;
    }
    paramString = (b)nhZ.get(paramString);
    if (paramString != null)
    {
      paramString = paramString.nig;
      GMTrace.o(11739219361792L, 87464);
      return paramString;
    }
    GMTrace.o(11739219361792L, 87464);
    return null;
  }
  
  public static String Ae(String paramString)
  {
    GMTrace.i(11739353579520L, 87465);
    if (nia.size() == 0) {
      aIy();
    }
    if (com.tencent.mm.sdk.platformtools.bg.mZ(paramString))
    {
      GMTrace.o(11739353579520L, 87465);
      return null;
    }
    paramString = (String)nia.get(paramString);
    GMTrace.o(11739353579520L, 87465);
    return paramString;
  }
  
  public static String Af(String paramString)
  {
    GMTrace.i(11739487797248L, 87466);
    if (nic.size() == 0) {
      aIy();
    }
    if (com.tencent.mm.sdk.platformtools.bg.mZ(paramString))
    {
      GMTrace.o(11739487797248L, 87466);
      return null;
    }
    paramString = (String)nic.get(paramString);
    GMTrace.o(11739487797248L, 87466);
    return paramString;
  }
  
  public static String Ag(String paramString)
  {
    GMTrace.i(11739890450432L, 87469);
    if (nia.size() == 0) {
      aIy();
    }
    if (Ai(paramString))
    {
      paramString = c.Ao(Aj(paramString));
      Object localObject = new ArrayList(nia.keySet());
      Collections.sort((List)localObject, Collections.reverseOrder(new a()));
      localObject = ((List)localObject).iterator();
      while (((Iterator)localObject).hasNext())
      {
        String str = (String)((Iterator)localObject).next();
        if (paramString.startsWith(str))
        {
          GMTrace.o(11739890450432L, 87469);
          return str;
        }
      }
    }
    GMTrace.o(11739890450432L, 87469);
    return null;
  }
  
  public static boolean Ah(String paramString)
  {
    GMTrace.i(11740024668160L, 87470);
    if (nia.size() == 0) {
      aIy();
    }
    if (nia.containsKey(paramString))
    {
      GMTrace.o(11740024668160L, 87470);
      return true;
    }
    GMTrace.o(11740024668160L, 87470);
    return false;
  }
  
  public static boolean Ai(String paramString)
  {
    GMTrace.i(11740158885888L, 87471);
    if ((!com.tencent.mm.sdk.platformtools.bg.mZ(paramString)) && ((paramString.startsWith(nhV)) || (paramString.startsWith(nhW))))
    {
      GMTrace.o(11740158885888L, 87471);
      return true;
    }
    GMTrace.o(11740158885888L, 87471);
    return false;
  }
  
  public static String Aj(String paramString)
  {
    GMTrace.i(11740293103616L, 87472);
    if (!com.tencent.mm.sdk.platformtools.bg.mZ(paramString))
    {
      if (paramString.startsWith(nhV))
      {
        paramString = paramString.substring(nhV.length());
        GMTrace.o(11740293103616L, 87472);
        return paramString;
      }
      if (paramString.startsWith(nhW))
      {
        paramString = paramString.substring(nhW.length());
        GMTrace.o(11740293103616L, 87472);
        return paramString;
      }
    }
    GMTrace.o(11740293103616L, 87472);
    return paramString;
  }
  
  public static String Ak(String paramString)
  {
    GMTrace.i(11740427321344L, 87473);
    Object localObject = c.Ao(paramString);
    String str = c.Ao((String)localObject);
    paramString = null;
    if (Ai(str)) {
      paramString = Ag(str);
    }
    if (!com.tencent.mm.sdk.platformtools.bg.mZ(paramString))
    {
      localObject = Aj(str).substring(paramString.length());
      str = an.formatNumber(paramString, (String)localObject);
      if (!com.tencent.mm.sdk.platformtools.bg.mZ(str)) {
        break label190;
      }
    }
    for (;;)
    {
      if (!((String)localObject).startsWith("+")) {
        paramString = "+" + paramString + " " + (String)localObject;
      }
      for (;;)
      {
        localObject = paramString;
        if (paramString.length() > 25) {
          localObject = paramString.substring(0, 25) + "...";
        }
        GMTrace.o(11740427321344L, 87473);
        return (String)localObject;
        paramString = "+" + paramString + " " + ((String)localObject).replace("+", "");
        continue;
        paramString = an.Rg((String)localObject);
      }
      label190:
      localObject = str;
    }
  }
  
  public static String Al(String paramString)
  {
    GMTrace.i(11740829974528L, 87476);
    if (nia.size() == 0) {
      aIy();
    }
    Object localObject = paramString;
    if (Ai(paramString))
    {
      paramString = c.Ao(Aj(paramString));
      localObject = new ArrayList(nia.keySet());
      Collections.sort((List)localObject, Collections.reverseOrder(new a()));
      Iterator localIterator = ((List)localObject).iterator();
      do
      {
        localObject = paramString;
        if (!localIterator.hasNext()) {
          break;
        }
        localObject = (String)localIterator.next();
      } while (!paramString.startsWith((String)localObject));
      paramString = paramString.substring(((String)localObject).length());
      GMTrace.o(11740829974528L, 87476);
      return paramString;
    }
    GMTrace.o(11740829974528L, 87476);
    return (String)localObject;
  }
  
  /* Error */
  public static ArrayList<String> Am(String paramString)
  {
    // Byte code:
    //   0: ldc2_w 263
    //   3: ldc_w 265
    //   6: invokestatic 34	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   9: new 156	java/util/ArrayList
    //   12: dup
    //   13: invokespecial 266	java/util/ArrayList:<init>	()V
    //   16: astore_1
    //   17: invokestatic 272	com/tencent/mm/sdk/platformtools/ab:getContext	()Landroid/content/Context;
    //   20: ldc_w 274
    //   23: invokestatic 280	com/tencent/mm/pluginsdk/h/a:aR	(Landroid/content/Context;Ljava/lang/String;)Z
    //   26: ifne +23 -> 49
    //   29: ldc_w 282
    //   32: ldc_w 284
    //   35: invokestatic 290	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   38: ldc2_w 263
    //   41: ldc_w 265
    //   44: invokestatic 69	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   47: aload_1
    //   48: areturn
    //   49: invokestatic 272	com/tencent/mm/sdk/platformtools/ab:getContext	()Landroid/content/Context;
    //   52: invokevirtual 296	android/content/Context:getContentResolver	()Landroid/content/ContentResolver;
    //   55: getstatic 302	android/provider/ContactsContract$CommonDataKinds$Phone:CONTENT_URI	Landroid/net/Uri;
    //   58: aconst_null
    //   59: ldc_w 304
    //   62: iconst_1
    //   63: anewarray 88	java/lang/String
    //   66: dup
    //   67: iconst_0
    //   68: new 226	java/lang/StringBuilder
    //   71: dup
    //   72: ldc_w 306
    //   75: invokespecial 229	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   78: aload_0
    //   79: invokevirtual 233	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   82: ldc_w 306
    //   85: invokevirtual 233	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   88: invokevirtual 239	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   91: aastore
    //   92: aconst_null
    //   93: invokevirtual 312	android/content/ContentResolver:query	(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   96: astore_0
    //   97: aload_0
    //   98: invokeinterface 317 1 0
    //   103: ifeq +84 -> 187
    //   106: aload_0
    //   107: invokeinterface 320 1 0
    //   112: ifne +75 -> 187
    //   115: aload_1
    //   116: aload_0
    //   117: aload_0
    //   118: ldc_w 322
    //   121: invokeinterface 326 2 0
    //   126: invokeinterface 329 2 0
    //   131: invokevirtual 332	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   134: pop
    //   135: aload_0
    //   136: invokeinterface 335 1 0
    //   141: pop
    //   142: goto -36 -> 106
    //   145: astore_2
    //   146: ldc_w 282
    //   149: ldc_w 337
    //   152: iconst_1
    //   153: anewarray 4	java/lang/Object
    //   156: dup
    //   157: iconst_0
    //   158: aload_2
    //   159: invokevirtual 340	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   162: aastore
    //   163: invokestatic 343	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   166: aload_0
    //   167: ifnull +9 -> 176
    //   170: aload_0
    //   171: invokeinterface 346 1 0
    //   176: ldc2_w 263
    //   179: ldc_w 265
    //   182: invokestatic 69	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   185: aload_1
    //   186: areturn
    //   187: aload_0
    //   188: ifnull -12 -> 176
    //   191: aload_0
    //   192: invokeinterface 346 1 0
    //   197: goto -21 -> 176
    //   200: astore_1
    //   201: aload_0
    //   202: ifnull +9 -> 211
    //   205: aload_0
    //   206: invokeinterface 346 1 0
    //   211: aload_1
    //   212: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	213	0	paramString	String
    //   16	170	1	localArrayList	ArrayList
    //   200	12	1	localObject	Object
    //   145	14	2	localException	Exception
    // Exception table:
    //   from	to	target	type
    //   97	106	145	java/lang/Exception
    //   106	142	145	java/lang/Exception
    //   97	106	200	finally
    //   106	142	200	finally
    //   146	166	200	finally
  }
  
  public static boolean Ho()
  {
    GMTrace.i(11740964192256L, 87477);
    at localat = new at();
    com.tencent.mm.sdk.b.a.uLm.m(localat);
    w.d("MicroMsg.IPCallAddressUtil", "canSyncAddrBook: %b", new Object[] { Boolean.valueOf(localat.fva.ftR) });
    boolean bool = localat.fva.ftR;
    GMTrace.o(11740964192256L, 87477);
    return bool;
  }
  
  public static String aIA()
  {
    GMTrace.i(11740561539072L, 87474);
    if (nib.size() == 0) {
      aIy();
    }
    String str = com.tencent.mm.sdk.platformtools.bg.bOa();
    if (!com.tencent.mm.sdk.platformtools.bg.mZ(str))
    {
      w.i("MicroMsg.IPCallAddressUtil", "simCountryCode: %s", new Object[] { str });
      str = str.toUpperCase();
      str = (String)nid.get(str);
      if (!com.tencent.mm.sdk.platformtools.bg.mZ(str)) {
        w.i("MicroMsg.IPCallAddressUtil", "final sim countryCode: %s", new Object[] { str });
      }
    }
    while (!com.tencent.mm.sdk.platformtools.bg.mZ(str))
    {
      GMTrace.o(11740561539072L, 87474);
      return str;
      str = "";
    }
    str = com.tencent.mm.x.bg.BF().countryCode;
    w.i("MicroMsg.IPCallAddressUtil", "personalInfoCountryCode: %s", new Object[] { str });
    if (!com.tencent.mm.sdk.platformtools.bg.mZ(str))
    {
      str = (String)nid.get(str);
      if (!com.tencent.mm.sdk.platformtools.bg.mZ(str))
      {
        w.i("MicroMsg.IPCallAddressUtil", "final sim countryCode: %s", new Object[] { str });
        GMTrace.o(11740561539072L, 87474);
        return str;
      }
    }
    str = ab.getContext().getString(R.l.dPj);
    w.i("MicroMsg.IPCallAddressUtil", "fallbackCountryCode: %s", new Object[] { str });
    str = str.replace("+", "");
    GMTrace.o(11740561539072L, 87474);
    return str;
  }
  
  public static void aIB()
  {
    GMTrace.i(11740695756800L, 87475);
    aIy();
    GMTrace.o(11740695756800L, 87475);
  }
  
  private static void aIy()
  {
    GMTrace.i(11738950926336L, 87462);
    nia.clear();
    nib.clear();
    nic.clear();
    nid.clear();
    nhZ.clear();
    Object localObject4 = null;
    label108:
    String str2;
    for (Object localObject1 = null;; str2 = "")
    {
      try
      {
        localObject5 = ab.getContext().getAssets().open("ipcall_country_code.txt");
        localObject1 = localObject5;
        localObject4 = localObject5;
        localObject6 = new byte[((InputStream)localObject5).available()];
        localObject1 = localObject5;
        localObject4 = localObject5;
        ((InputStream)localObject5).read((byte[])localObject6);
        localObject1 = localObject5;
        localObject4 = localObject5;
        localObject6 = new String((byte[])localObject6);
        localObject1 = localObject6;
        if (localObject5 == null) {}
      }
      catch (IOException localIOException4)
      {
        for (;;)
        {
          Object localObject5;
          int i;
          Object localObject2;
          localObject4 = localObject2;
          w.e("MicroMsg.IPCallAddressUtil", "exception:%s", new Object[] { com.tencent.mm.sdk.platformtools.bg.f(localIOException4) });
          if (localObject2 == null) {
            break;
          }
          try
          {
            ((InputStream)localObject2).close();
            localObject2 = "";
          }
          catch (IOException localIOException2)
          {
            w.e("MicroMsg.IPCallAddressUtil", "exception:%s", new Object[] { com.tencent.mm.sdk.platformtools.bg.f(localIOException2) });
            String str1 = "";
          }
        }
      }
      finally
      {
        for (;;)
        {
          String[] arrayOfString;
          if (localObject4 != null) {}
          try
          {
            ((InputStream)localObject4).close();
            throw ((Throwable)localObject3);
          }
          catch (IOException localIOException3)
          {
            for (;;)
            {
              w.e("MicroMsg.IPCallAddressUtil", "exception:%s", new Object[] { com.tencent.mm.sdk.platformtools.bg.f(localIOException3) });
            }
          }
          Object localObject6 = new b();
          ((b)localObject6).nie = arrayOfString[0];
          ((b)localObject6).nif = arrayOfString[1];
          RegionCodeDecoder.bRs();
          String str3 = RegionCodeDecoder.getLocName(arrayOfString[0]);
          str2 = str3;
          if (com.tencent.mm.sdk.platformtools.bg.mZ(str3)) {
            str2 = new Locale("", arrayOfString[0]).getDisplayCountry(ab.getResources().getConfiguration().locale);
          }
          ((b)localObject6).nig = str2;
          nic.put(((b)localObject6).nif, ((b)localObject6).nie);
          nid.put(((b)localObject6).nie, ((b)localObject6).nif);
          nia.put(((b)localObject6).nif, ((b)localObject6).nig);
          nib.put(((b)localObject6).nig, ((b)localObject6).nif);
          nhZ.put(((b)localObject6).nie, localObject6);
        }
        label464:
        GMTrace.o(11738950926336L, 87462);
        return;
      }
      try
      {
        ((InputStream)localObject5).close();
        localObject1 = localObject6;
      }
      catch (IOException localIOException1)
      {
        w.e("MicroMsg.IPCallAddressUtil", "exception:%s", new Object[] { com.tencent.mm.sdk.platformtools.bg.f(localIOException1) });
        localObject2 = localObject6;
        break label108;
      }
      localObject5 = ((String)localObject1).trim().split("\n");
      i = 0;
      for (;;)
      {
        if (i >= localObject5.length) {
          break label464;
        }
        arrayOfString = localObject5[i].trim().split(" ");
        if (arrayOfString.length >= 2) {
          break;
        }
        w.e("MicroMsg.IPCallAddressUtil", "this country item has problem %s", new Object[] { localObject5[i] });
        i += 1;
      }
    }
  }
  
  public static HashMap<String, b> aIz()
  {
    GMTrace.i(11739085144064L, 87463);
    if (nhZ.size() == 0) {
      aIy();
    }
    HashMap localHashMap = nhZ;
    GMTrace.o(11739085144064L, 87463);
    return localHashMap;
  }
  
  public static String ah(Context paramContext, String paramString)
  {
    localObject1 = null;
    Object localObject2 = null;
    GMTrace.i(11737742966784L, 87453);
    if (!com.tencent.mm.pluginsdk.h.a.aR(paramContext, "android.permission.READ_CONTACTS"))
    {
      w.e("MicroMsg.IPCallAddressUtil", "no contact permission");
      GMTrace.o(11737742966784L, 87453);
      return null;
    }
    localCursor = paramContext.getContentResolver().query(ContactsContract.CommonDataKinds.Phone.CONTENT_URI, new String[] { "contact_id", "data1" }, null, null, null);
    paramContext = (Context)localObject2;
    if (localCursor != null) {
      paramContext = (Context)localObject2;
    }
    for (;;)
    {
      try
      {
        if (localCursor.moveToFirst())
        {
          paramContext = (Context)localObject2;
          if (!localCursor.isAfterLast())
          {
            if (!PhoneNumberUtils.compare(com.tencent.mm.pluginsdk.a.EA(paramString), localCursor.getString(1))) {
              continue;
            }
            paramContext = localCursor.getString(0);
          }
        }
        paramString = paramContext;
        if (localCursor != null)
        {
          localCursor.close();
          paramString = paramContext;
        }
      }
      catch (Exception paramContext)
      {
        w.d("MicroMsg.IPCallAddressUtil", "getNicknameByPhonenumber, error: %s", new Object[] { paramContext.getMessage() });
        paramString = (String)localObject1;
        if (localCursor == null) {
          continue;
        }
        localCursor.close();
        paramString = (String)localObject1;
        continue;
      }
      finally
      {
        if (localCursor == null) {
          continue;
        }
        localCursor.close();
      }
      GMTrace.o(11737742966784L, 87453);
      return paramString;
      localCursor.moveToNext();
    }
  }
  
  public static String ai(Context paramContext, String paramString)
  {
    GMTrace.i(11737877184512L, 87454);
    paramString = ah(paramContext, paramString);
    if (!com.tencent.mm.sdk.platformtools.bg.mZ(paramString))
    {
      paramContext = com.tencent.mm.pluginsdk.a.g(paramString, paramContext);
      GMTrace.o(11737877184512L, 87454);
      return paramContext;
    }
    GMTrace.o(11737877184512L, 87454);
    return null;
  }
  
  public static String aj(Context paramContext, String paramString)
  {
    GMTrace.i(11738011402240L, 87455);
    if (!com.tencent.mm.sdk.platformtools.bg.mZ(paramString))
    {
      paramContext = com.tencent.mm.pluginsdk.a.g(paramString, paramContext);
      GMTrace.o(11738011402240L, 87455);
      return paramContext;
    }
    GMTrace.o(11738011402240L, 87455);
    return null;
  }
  
  public static Bitmap ak(Context paramContext, String paramString)
  {
    GMTrace.i(11738145619968L, 87456);
    paramContext = f(paramContext, paramString, false);
    GMTrace.o(11738145619968L, 87456);
    return paramContext;
  }
  
  public static Bitmap al(Context paramContext, String paramString)
  {
    GMTrace.i(11738414055424L, 87458);
    String str = ah(paramContext, paramString);
    Bitmap localBitmap = null;
    if (!com.tencent.mm.sdk.platformtools.bg.mZ(str)) {
      localBitmap = f(paramContext, str, true);
    }
    paramContext = localBitmap;
    if (localBitmap == null)
    {
      paramContext = localBitmap;
      if (Ho())
      {
        paramString = Ab(paramString);
        w.d("MicroMsg.IPCallAddressUtil", "getAvatarByPhoneNumber, username: %s", new Object[] { paramString });
        paramContext = localBitmap;
        if (!com.tencent.mm.sdk.platformtools.bg.mZ(paramString)) {
          paramContext = com.tencent.mm.ab.b.c(paramString, 320, 320, 4);
        }
      }
    }
    GMTrace.o(11738414055424L, 87458);
    return paramContext;
  }
  
  public static int cC(String paramString1, String paramString2)
  {
    GMTrace.i(11739622014976L, 87467);
    if ((com.tencent.mm.sdk.platformtools.bg.mZ(paramString1)) || (com.tencent.mm.sdk.platformtools.bg.mZ(paramString2)))
    {
      GMTrace.o(11739622014976L, 87467);
      return -1;
    }
    int j = cD(paramString1, paramString2);
    int i = j;
    if (j == -1)
    {
      i = j;
      if (paramString2.startsWith("+"))
      {
        String str2 = Ag(paramString2);
        String str1 = paramString2;
        if (!com.tencent.mm.sdk.platformtools.bg.mZ(str2)) {
          str1 = paramString2.substring(("+" + str2).length());
        }
        i = cD(paramString1, str1);
      }
    }
    GMTrace.o(11739622014976L, 87467);
    return i;
  }
  
  /* Error */
  private static int cD(String paramString1, String paramString2)
  {
    // Byte code:
    //   0: ldc2_w 592
    //   3: ldc_w 594
    //   6: invokestatic 34	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   9: invokestatic 272	com/tencent/mm/sdk/platformtools/ab:getContext	()Landroid/content/Context;
    //   12: ldc_w 274
    //   15: invokestatic 280	com/tencent/mm/pluginsdk/h/a:aR	(Landroid/content/Context;Ljava/lang/String;)Z
    //   18: ifne +23 -> 41
    //   21: ldc_w 282
    //   24: ldc_w 284
    //   27: invokestatic 290	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   30: ldc2_w 592
    //   33: ldc_w 594
    //   36: invokestatic 69	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   39: iconst_m1
    //   40: ireturn
    //   41: invokestatic 272	com/tencent/mm/sdk/platformtools/ab:getContext	()Landroid/content/Context;
    //   44: invokevirtual 296	android/content/Context:getContentResolver	()Landroid/content/ContentResolver;
    //   47: getstatic 302	android/provider/ContactsContract$CommonDataKinds$Phone:CONTENT_URI	Landroid/net/Uri;
    //   50: aconst_null
    //   51: ldc_w 596
    //   54: iconst_1
    //   55: anewarray 88	java/lang/String
    //   58: dup
    //   59: iconst_0
    //   60: aload_0
    //   61: aastore
    //   62: aconst_null
    //   63: invokevirtual 312	android/content/ContentResolver:query	(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   66: astore_0
    //   67: aload_1
    //   68: invokestatic 86	com/tencent/mm/plugin/ipcall/b/c:Ao	(Ljava/lang/String;)Ljava/lang/String;
    //   71: astore_1
    //   72: aload_0
    //   73: invokeinterface 317 1 0
    //   78: ifeq +120 -> 198
    //   81: aload_0
    //   82: invokeinterface 320 1 0
    //   87: ifne +111 -> 198
    //   90: aload_0
    //   91: aload_0
    //   92: ldc_w 598
    //   95: invokeinterface 326 2 0
    //   100: invokeinterface 602 2 0
    //   105: istore_2
    //   106: aload_0
    //   107: aload_0
    //   108: ldc_w 532
    //   111: invokeinterface 326 2 0
    //   116: invokeinterface 329 2 0
    //   121: invokestatic 86	com/tencent/mm/plugin/ipcall/b/c:Ao	(Ljava/lang/String;)Ljava/lang/String;
    //   124: aload_1
    //   125: invokevirtual 605	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   128: istore_3
    //   129: iload_3
    //   130: ifeq +20 -> 150
    //   133: aload_0
    //   134: invokeinterface 346 1 0
    //   139: ldc2_w 592
    //   142: ldc_w 594
    //   145: invokestatic 69	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   148: iload_2
    //   149: ireturn
    //   150: aload_0
    //   151: invokeinterface 335 1 0
    //   156: pop
    //   157: goto -76 -> 81
    //   160: astore_1
    //   161: ldc_w 282
    //   164: ldc_w 607
    //   167: iconst_1
    //   168: anewarray 4	java/lang/Object
    //   171: dup
    //   172: iconst_0
    //   173: aload_1
    //   174: invokevirtual 340	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   177: aastore
    //   178: invokestatic 343	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   181: aload_0
    //   182: invokeinterface 346 1 0
    //   187: ldc2_w 592
    //   190: ldc_w 594
    //   193: invokestatic 69	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   196: iconst_m1
    //   197: ireturn
    //   198: aload_0
    //   199: invokeinterface 346 1 0
    //   204: goto -17 -> 187
    //   207: astore_1
    //   208: aload_0
    //   209: invokeinterface 346 1 0
    //   214: aload_1
    //   215: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	216	0	paramString1	String
    //   0	216	1	paramString2	String
    //   105	44	2	i	int
    //   128	2	3	bool	boolean
    // Exception table:
    //   from	to	target	type
    //   72	81	160	java/lang/Exception
    //   81	129	160	java/lang/Exception
    //   150	157	160	java/lang/Exception
    //   72	81	207	finally
    //   81	129	207	finally
    //   150	157	207	finally
    //   161	181	207	finally
  }
  
  public static Bitmap f(Context paramContext, String paramString, boolean paramBoolean)
  {
    GMTrace.i(11738279837696L, 87457);
    if (!com.tencent.mm.sdk.platformtools.bg.mZ(paramString))
    {
      paramContext = com.tencent.mm.pluginsdk.a.a(paramString, paramContext, paramBoolean);
      GMTrace.o(11738279837696L, 87457);
      return paramContext;
    }
    GMTrace.o(11738279837696L, 87457);
    return null;
  }
  
  public static String ps(int paramInt)
  {
    GMTrace.i(11738816708608L, 87461);
    Object localObject = ab.getContext();
    switch (paramInt)
    {
    case 3: 
    case 6: 
    case 7: 
    case 8: 
    case 9: 
    default: 
      localObject = ((Context)localObject).getString(R.l.euf);
      GMTrace.o(11738816708608L, 87461);
      return (String)localObject;
    case 1: 
      localObject = ((Context)localObject).getString(R.l.euc);
      GMTrace.o(11738816708608L, 87461);
      return (String)localObject;
    case 2: 
      localObject = ((Context)localObject).getString(R.l.eue);
      GMTrace.o(11738816708608L, 87461);
      return (String)localObject;
    case 10: 
      localObject = ((Context)localObject).getString(R.l.eua);
      GMTrace.o(11738816708608L, 87461);
      return (String)localObject;
    case 4: 
      localObject = ((Context)localObject).getString(R.l.eub);
      GMTrace.o(11738816708608L, 87461);
      return (String)localObject;
    }
    localObject = ((Context)localObject).getString(R.l.eud);
    GMTrace.o(11738816708608L, 87461);
    return (String)localObject;
  }
  
  private static final class a
    implements Comparator<String>
  {
    public a()
    {
      GMTrace.i(11741366845440L, 87480);
      GMTrace.o(11741366845440L, 87480);
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/ipcall/b/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */