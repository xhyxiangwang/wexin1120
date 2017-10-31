package com.tencent.mm.plugin.wallet_core.c;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.res.AssetManager;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.g;
import com.tencent.mm.a.g;
import com.tencent.mm.av.k;
import com.tencent.mm.av.t;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.x.ap;
import com.tencent.mm.x.c;
import com.tencent.mm.x.m;
import java.io.InputStream;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import org.apache.http.util.EncodingUtils;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class b
{
  private static final String kpg;
  private static Map<String, String> rSi;
  
  static
  {
    GMTrace.i(6916105306112L, 51529);
    kpg = com.tencent.mm.compatible.util.e.gZT + "wallet";
    rSi = null;
    GMTrace.o(6916105306112L, 51529);
  }
  
  public static String DS(String paramString)
  {
    GMTrace.i(6915971088384L, 51528);
    if (bg.mZ(paramString))
    {
      w.w("MicroMsg.WalletBankLogoStorage", "getStoragePath: but url is null");
      GMTrace.o(6915971088384L, 51528);
      return null;
    }
    paramString = String.format("%s/%s", new Object[] { kpg, g.n(paramString.getBytes()) });
    GMTrace.o(6915971088384L, 51528);
    return paramString;
  }
  
  private static boolean Jy(String paramString)
  {
    GMTrace.i(6915165782016L, 51522);
    try
    {
      rSi = new HashMap();
      w.d("MicroMsg.WalletBankLogoStorage", "bank logo:" + paramString);
      SharedPreferences.Editor localEditor = ab.getContext().getSharedPreferences("bank_logo", 0).edit();
      JSONArray localJSONArray = new JSONObject(paramString).getJSONArray("bank_urls_list");
      int j = localJSONArray.length();
      int i = 0;
      if (i < j)
      {
        Object localObject = localJSONArray.getJSONObject(i);
        if (m.zS()) {}
        for (paramString = ((JSONObject)localObject).optString("bank_desc");; paramString = ((JSONObject)localObject).optString("bank_type"))
        {
          localObject = ((JSONObject)localObject).toString();
          if ((bg.mZ(paramString)) || (bg.mZ((String)localObject))) {
            break label166;
          }
          localEditor.putString(paramString, (String)localObject);
          rSi.put(paramString, localObject);
          i += 1;
          break;
        }
      }
      label166:
      localEditor.commit();
      w.d("MicroMsg.WalletBankLogoStorage", "update BankLogo config file. success!");
      GMTrace.o(6915165782016L, 51522);
      return true;
    }
    catch (Exception paramString)
    {
      w.e("MicroMsg.WalletBankLogoStorage", "parse band logo error. %s", new Object[] { paramString.getMessage() });
      w.printErrStackTrace("MicroMsg.WalletBankLogoStorage", paramString, "", new Object[0]);
      GMTrace.o(6915165782016L, 51522);
    }
    return false;
  }
  
  private static com.tencent.mm.plugin.wallet_core.model.e aE(Context paramContext, String paramString)
  {
    boolean bool2 = true;
    GMTrace.i(6915568435200L, 51525);
    String str;
    int i;
    if (rSi == null)
    {
      str = ab.getContext().getSharedPreferences("bank_logo", 0).getString(paramString, "");
      if (!bg.mZ(str)) {
        break label287;
      }
      ap.AS();
      if (c.isSDCardAvailable())
      {
        t.Kg().gw(11);
        k localk = new k(11);
        ap.wT().a(localk, 0);
      }
      Jy(aF(paramContext, "config/bank_logo.xml"));
      if (rSi == null) {
        break label282;
      }
      str = (String)rSi.get(paramString);
      i = 1;
    }
    for (;;)
    {
      if (!bg.mZ(str)) {
        paramContext = new com.tencent.mm.plugin.wallet_core.model.e();
      }
      for (;;)
      {
        try
        {
          paramString = new JSONObject(str);
          long l = paramString.optLong("timestamp", 0L);
          paramContext.oiq = paramString.getString("logo2x_url");
          paramContext.rNk = paramString.getString("bg2x_url");
          paramContext.rNl = paramString.getString("wl2x_url");
          boolean bool1 = bool2;
          if (i == 0)
          {
            if (System.currentTimeMillis() / 1000L - l > 7200L) {
              bool1 = bool2;
            }
          }
          else
          {
            paramContext.rNp = bool1;
            paramContext.timestamp = l;
            GMTrace.o(6915568435200L, 51525);
            return paramContext;
            str = (String)rSi.get(paramString);
            break;
          }
          bool1 = false;
          continue;
          paramContext = null;
        }
        catch (JSONException paramContext)
        {
          w.printErrStackTrace("MicroMsg.WalletBankLogoStorage", paramContext, "", new Object[0]);
          GMTrace.o(6915568435200L, 51525);
          return null;
        }
      }
      label282:
      i = 1;
      continue;
      label287:
      i = 0;
    }
  }
  
  private static String aF(Context paramContext, String paramString)
  {
    GMTrace.i(6915702652928L, 51526);
    String str = "";
    Object localObject2 = null;
    Object localObject1 = null;
    for (;;)
    {
      try
      {
        paramContext = paramContext.getAssets().open(paramString);
        localObject1 = paramContext;
        localObject2 = paramContext;
        paramString = new byte[paramContext.available()];
        localObject1 = paramContext;
        localObject2 = paramContext;
        paramContext.read(paramString);
        localObject1 = paramContext;
        localObject2 = paramContext;
        paramString = EncodingUtils.getString(paramString, "UTF-8");
        localObject1 = paramString;
        paramString = (String)localObject1;
      }
      catch (Exception paramContext)
      {
        localObject2 = localObject1;
        w.printErrStackTrace("MicroMsg.WalletBankLogoStorage", paramContext, "getFromAssets", new Object[0]);
        paramString = str;
        if (localObject1 == null) {
          continue;
        }
        try
        {
          ((InputStream)localObject1).close();
          paramString = str;
        }
        catch (Exception paramContext)
        {
          w.printErrStackTrace("MicroMsg.WalletBankLogoStorage", paramContext, "close", new Object[0]);
          paramString = str;
        }
        continue;
      }
      finally
      {
        if (localObject2 == null) {
          break label165;
        }
      }
      try
      {
        paramContext.close();
        paramString = (String)localObject1;
      }
      catch (Exception paramContext)
      {
        w.printErrStackTrace("MicroMsg.WalletBankLogoStorage", paramContext, "close", new Object[0]);
        paramString = (String)localObject1;
      }
    }
    GMTrace.o(6915702652928L, 51526);
    return paramString;
    try
    {
      ((InputStream)localObject2).close();
      label165:
      throw paramContext;
    }
    catch (Exception paramString)
    {
      for (;;)
      {
        w.printErrStackTrace("MicroMsg.WalletBankLogoStorage", paramString, "close", new Object[0]);
      }
    }
  }
  
  public static boolean an(LinkedList<String> paramLinkedList)
  {
    GMTrace.i(6915299999744L, 51523);
    long l = System.currentTimeMillis() / 1000L;
    try
    {
      rSi = new HashMap();
      SharedPreferences.Editor localEditor = ab.getContext().getSharedPreferences("bank_logo", 0).edit();
      int j = paramLinkedList.size();
      int i = 0;
      if (i < j)
      {
        Object localObject = new JSONObject((String)paramLinkedList.get(i));
        if (m.zS()) {}
        for (String str = ((JSONObject)localObject).optString("bank_desc");; str = ((JSONObject)localObject).optString("bank_type"))
        {
          ((JSONObject)localObject).put("timestamp", l);
          localObject = ((JSONObject)localObject).toString();
          if ((bg.mZ(str)) || (bg.mZ((String)localObject))) {
            break label163;
          }
          localEditor.putString(str, (String)localObject);
          rSi.put(str, localObject);
          i += 1;
          break;
        }
      }
      label163:
      localEditor.commit();
      w.d("MicroMsg.WalletBankLogoStorage", "update BankLogo config file. success!");
      GMTrace.o(6915299999744L, 51523);
      return true;
    }
    catch (Exception paramLinkedList)
    {
      w.e("MicroMsg.WalletBankLogoStorage", "parse band logo error. %s", new Object[] { paramLinkedList.getMessage() });
      w.printErrStackTrace("MicroMsg.WalletBankLogoStorage", paramLinkedList, "", new Object[0]);
      GMTrace.o(6915299999744L, 51523);
    }
    return false;
  }
  
  public static String bxu()
  {
    GMTrace.i(6915836870656L, 51527);
    String str = kpg;
    GMTrace.o(6915836870656L, 51527);
    return str;
  }
  
  public static com.tencent.mm.plugin.wallet_core.model.e h(Context paramContext, String paramString, boolean paramBoolean)
  {
    GMTrace.i(6915434217472L, 51524);
    if (!paramBoolean)
    {
      paramContext = aE(paramContext, paramString);
      GMTrace.o(6915434217472L, 51524);
      return paramContext;
    }
    Object localObject = null;
    if ("CITIC_CREDIT".equals(paramString))
    {
      com.tencent.mm.plugin.wallet_core.model.e locale = new com.tencent.mm.plugin.wallet_core.model.e();
      locale.rNn = R.g.bfk;
      locale.rNo = R.g.bfl;
      paramContext = aE(paramContext, paramString);
      localObject = locale;
      if (paramContext != null)
      {
        locale.oiq = paramContext.oiq;
        localObject = locale;
      }
    }
    GMTrace.o(6915434217472L, 51524);
    return (com.tencent.mm.plugin.wallet_core.model.e)localObject;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/wallet_core/c/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */