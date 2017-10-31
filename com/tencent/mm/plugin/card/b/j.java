package com.tencent.mm.plugin.card.b;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.card.model.CardInfo;
import com.tencent.mm.plugin.card.model.al;
import com.tencent.mm.plugin.card.model.c;
import com.tencent.mm.protocal.c.kb;
import com.tencent.mm.protocal.c.kc;
import com.tencent.mm.protocal.c.kd;
import com.tencent.mm.protocal.c.xs;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.util.LinkedList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class j
{
  public static void a(LinkedList<kb> paramLinkedList, int paramInt)
  {
    GMTrace.i(5046318137344L, 37598);
    if (paramLinkedList == null)
    {
      GMTrace.o(5046318137344L, 37598);
      return;
    }
    int j = paramLinkedList.size();
    int i = 0;
    if (i < paramLinkedList.size())
    {
      Object localObject = (kb)paramLinkedList.get(i);
      c localc = al.ajC();
      String str1 = ((kb)localObject).fMv;
      String str2 = ((kb)localObject).kqX;
      int k = ((kb)localObject).knw;
      if (bg.mZ(str1)) {
        w.w("MicroMsg.CardInfoStorage", "cardId null");
      }
      for (;;)
      {
        i += 1;
        break;
        localObject = "update UserCardInfo set stickyIndex=" + ((j - i) * 10 + paramInt) + ", stickyAnnouncement='" + str2 + "', stickyEndTime=" + k + " where card_id='" + str1 + "'";
        localc.gMB.eL("UserCardInfo", (String)localObject);
      }
    }
    GMTrace.o(5046318137344L, 37598);
  }
  
  public static void b(LinkedList<kb> paramLinkedList, int paramInt)
  {
    GMTrace.i(19559281065984L, 145728);
    if (paramLinkedList == null)
    {
      GMTrace.o(19559281065984L, 145728);
      return;
    }
    int i = 0;
    if (i < paramLinkedList.size())
    {
      Object localObject = (kb)paramLinkedList.get(i);
      c localc = al.ajC();
      String str = ((kb)localObject).fMv;
      if (((kb)localObject).tGu != null) {}
      for (localObject = ((kb)localObject).tGu;; localObject = "")
      {
        localObject = "update UserCardInfo set stickyIndex=" + paramInt + ", label_wording='" + (String)localObject + "' where card_id='" + str + "'";
        localc.gMB.eL("UserCardInfo", (String)localObject);
        i += 1;
        break;
      }
    }
    GMTrace.o(19559281065984L, 145728);
  }
  
  public static xs uj(String paramString)
  {
    GMTrace.i(5046452355072L, 37599);
    if (bg.mZ(paramString))
    {
      w.w("MicroMsg.CardStickyHelper", "jsonRet null");
      GMTrace.o(5046452355072L, 37599);
      return null;
    }
    xs localxs = new xs();
    try
    {
      paramString = new JSONObject(paramString);
      localxs.tUu = paramString.optString("layout_buff");
      localJSONObject = paramString.getJSONObject("list");
      if (localJSONObject == null) {
        break label364;
      }
      localxs.tUx = new kd();
      localxs.tUx.tGw = y(localJSONObject.optJSONObject("expiring_list"));
      localxs.tUx.tGx = y(localJSONObject.optJSONObject("member_card_list"));
      localxs.tUx.tGy = y(localJSONObject.optJSONObject("nearby_list"));
      localxs.tUx.tGz = y(localJSONObject.optJSONObject("label_list"));
      localxs.tUx.tGA = y(localJSONObject.optJSONObject("first_list"));
      if ((localxs.tUx.tGA == null) || (localxs.tUx.tGA.tGv == null)) {
        break label292;
      }
      i = localxs.tUx.tGA.tGv.size() - 1;
    }
    catch (JSONException paramString)
    {
      for (;;)
      {
        JSONObject localJSONObject;
        int i;
        label292:
        boolean bool;
        label364:
        w.printErrStackTrace("MicroMsg.CardStickyHelper", paramString, "", new Object[0]);
        continue;
        i -= 1;
      }
    }
    if (i >= 0)
    {
      paramString = (kb)localxs.tUx.tGA.tGv.get(i);
      if (!bg.mZ(paramString.fMv))
      {
        paramString = al.ajC().tB(paramString.fMv);
        if ((paramString != null) && (!paramString.air())) {
          localxs.tUx.tGA.tGv.remove(i);
        }
      }
    }
    else
    {
      localxs.tUy = localJSONObject.optString("red_dot_wording");
      if (localJSONObject.optInt("show_red_dot", 0) == 1) {}
      for (bool = true;; bool = false)
      {
        localxs.tUz = bool;
        String str = localJSONObject.optString("title");
        paramString = str;
        if (str == null) {
          paramString = "";
        }
        al.ajH().putValue("key_card_entrance_tips", paramString);
        localxs.tUA = localJSONObject.optInt("top_scene", 100);
        GMTrace.o(5046452355072L, 37599);
        return localxs;
      }
    }
  }
  
  private static kc y(JSONObject paramJSONObject)
  {
    GMTrace.i(5046586572800L, 37600);
    if (paramJSONObject == null)
    {
      w.w("MicroMsg.CardStickyHelper", "parseLayoutItemList param obj null");
      GMTrace.o(5046586572800L, 37600);
      return null;
    }
    kc localkc = new kc();
    localkc.tGv = new LinkedList();
    for (;;)
    {
      int i;
      try
      {
        JSONArray localJSONArray = paramJSONObject.getJSONArray("item_list");
        i = 0;
        if (i < localJSONArray.length())
        {
          JSONObject localJSONObject = localJSONArray.getJSONObject(i);
          if (localJSONObject == null)
          {
            paramJSONObject = null;
            if ((paramJSONObject == null) || ((paramJSONObject.knw <= bg.Po()) && (paramJSONObject.knw != 0))) {
              break label212;
            }
            localkc.tGv.add(paramJSONObject);
            break label220;
          }
          paramJSONObject = new kb();
          paramJSONObject.kqX = localJSONObject.optString("announcement");
          paramJSONObject.fMv = localJSONObject.optString("card_id");
          paramJSONObject.knw = localJSONObject.optInt("end_time", 0);
          paramJSONObject.tGt = localJSONObject.optInt("update_time", 0);
          paramJSONObject.tGu = localJSONObject.optString("label_wording");
          continue;
        }
        w.i("MicroMsg.CardStickyHelper", "item.end_time > Util.nowSecond()");
      }
      catch (JSONException paramJSONObject)
      {
        w.printErrStackTrace("MicroMsg.CardStickyHelper", paramJSONObject, "", new Object[0]);
        GMTrace.o(5046586572800L, 37600);
        return localkc;
      }
      label212:
      label220:
      i += 1;
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/card/b/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */