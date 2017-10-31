package com.tencent.mm.plugin.card.b;

import android.text.TextUtils;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.card.sharecard.model.l;
import com.tencent.mm.plugin.card.sharecard.model.m;
import com.tencent.mm.sdk.platformtools.w;
import java.util.LinkedList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class s
{
  public static l uu(String paramString)
  {
    int m = 1;
    GMTrace.i(5054102765568L, 37656);
    if (TextUtils.isEmpty(paramString))
    {
      w.e("MicroMsg.ShareCardLayoutDataParser", "parseShareCardLayoutData jsonContent is null");
      GMTrace.o(5054102765568L, 37656);
      return null;
    }
    try
    {
      paramString = new JSONObject(paramString).optJSONObject("list");
      if (paramString == null)
      {
        w.e("MicroMsg.ShareCardLayoutDataParser", "parseShareCardLayoutData resultJson is null");
        GMTrace.o(5054102765568L, 37656);
        return null;
      }
      l locall = new l();
      locall.kqR = paramString.optString("local_city");
      locall.kqP = uv(paramString.optString("local_city_list"));
      locall.kqQ = uv(paramString.optString("other_city_list"));
      locall.kqS = paramString.optBoolean("local_end");
      locall.kqT = paramString.optBoolean("other_end");
      locall.fME = paramString.optBoolean("show_red_dot");
      locall.fMF = paramString.optBoolean("show_new");
      locall.kqV = paramString.optString("tips");
      locall.kqU = uw(paramString.optString("icons"));
      locall.kqW = paramString.optInt("newest_sharecard_time_second");
      int i;
      int j;
      label218:
      int k;
      if (locall.kqS)
      {
        i = 1;
        if (!locall.kqT) {
          break label300;
        }
        j = 1;
        if (!locall.fME) {
          break label305;
        }
        k = 1;
        label228:
        if (!locall.fMF) {
          break label310;
        }
      }
      for (;;)
      {
        w.i("MicroMsg.ShareCardLayoutDataParser", "localEnd:%d, otherEnd:%d, showRedDot:%d, showNew:%d, tips:%s", new Object[] { Integer.valueOf(i), Integer.valueOf(j), Integer.valueOf(k), Integer.valueOf(m), locall.kqV });
        GMTrace.o(5054102765568L, 37656);
        return locall;
        i = 0;
        break;
        label300:
        j = 0;
        break label218;
        label305:
        k = 0;
        break label228;
        label310:
        m = 0;
      }
      return null;
    }
    catch (JSONException paramString)
    {
      w.printErrStackTrace("MicroMsg.ShareCardLayoutDataParser", paramString, "", new Object[0]);
      GMTrace.o(5054102765568L, 37656);
    }
  }
  
  private static LinkedList<m> uv(String paramString)
  {
    GMTrace.i(5054236983296L, 37657);
    if (TextUtils.isEmpty(paramString))
    {
      w.e("MicroMsg.ShareCardLayoutDataParser", "parseShareCardLayoutItem jsonContent is null");
      GMTrace.o(5054236983296L, 37657);
      return null;
    }
    try
    {
      paramString = new JSONObject(paramString).optJSONArray("item_list");
      if ((paramString == null) || (paramString.length() == 0))
      {
        w.e("MicroMsg.ShareCardLayoutDataParser", "parseShareCardLayoutItem itemListJson is null");
        GMTrace.o(5054236983296L, 37657);
        return null;
      }
      LinkedList localLinkedList = new LinkedList();
      int i = 0;
      while (i < paramString.length())
      {
        JSONObject localJSONObject = paramString.optJSONObject(i);
        m localm = new m();
        localm.fMv = localJSONObject.optString("card_id");
        localm.knp = localJSONObject.optString("card_tp_id");
        localm.kqX = localJSONObject.optString("announcement");
        localm.kqY = localJSONObject.optInt("end_time", 0);
        localm.kqZ = localJSONObject.optInt("update_time", 0);
        localm.kra = localJSONObject.optInt("item_type", 0);
        localm.top = localJSONObject.optInt("top", 0);
        w.i("MicroMsg.ShareCardLayoutDataParser", "ljd: card_tp_id:" + localm.knp + " top:" + localm.top);
        localLinkedList.add(localm);
        i += 1;
      }
      GMTrace.o(5054236983296L, 37657);
      return localLinkedList;
    }
    catch (JSONException paramString)
    {
      w.printErrStackTrace("MicroMsg.ShareCardLayoutDataParser", paramString, "", new Object[0]);
      GMTrace.o(5054236983296L, 37657);
    }
    return null;
  }
  
  private static LinkedList<String> uw(String paramString)
  {
    GMTrace.i(5054371201024L, 37658);
    if (TextUtils.isEmpty(paramString))
    {
      w.e("MicroMsg.ShareCardLayoutDataParser", "parseShareCardIcons jsonContent is null");
      GMTrace.o(5054371201024L, 37658);
      return null;
    }
    try
    {
      paramString = new JSONArray(paramString);
      if (paramString.length() == 0)
      {
        w.e("MicroMsg.ShareCardLayoutDataParser", "parseShareCardIcons itemListJson is null");
        GMTrace.o(5054371201024L, 37658);
        return null;
      }
      LinkedList localLinkedList = new LinkedList();
      int i = 0;
      while (i < paramString.length())
      {
        localLinkedList.add(paramString.optString(i));
        i += 1;
      }
      GMTrace.o(5054371201024L, 37658);
      return localLinkedList;
    }
    catch (JSONException paramString)
    {
      w.printErrStackTrace("MicroMsg.ShareCardLayoutDataParser", paramString, "", new Object[0]);
      GMTrace.o(5054371201024L, 37658);
    }
    return null;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/card/b/s.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */