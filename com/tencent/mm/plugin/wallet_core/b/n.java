package com.tencent.mm.plugin.wallet_core.b;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.wallet_core.model.Orders;
import com.tencent.mm.plugin.wallet_core.model.Orders.Commodity;
import com.tencent.mm.plugin.wallet_core.model.Orders.DiscountInfo;
import com.tencent.mm.plugin.wallet_core.model.Orders.b;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.wallet_core.f.a.h;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class n
  extends h
{
  public Orders rKR;
  
  public n(String paramString)
  {
    GMTrace.i(7034619559936L, 52412);
    HashMap localHashMap = new HashMap();
    localHashMap.put("trans_id", paramString);
    x(localHashMap);
    GMTrace.o(7034619559936L, 52412);
  }
  
  public n(String paramString, int paramInt)
  {
    GMTrace.i(7034753777664L, 52413);
    HashMap localHashMap = new HashMap();
    localHashMap.put("trans_id", paramString);
    localHashMap.put("pay_type", String.valueOf(paramInt));
    x(localHashMap);
    GMTrace.o(7034753777664L, 52413);
  }
  
  public final void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
    GMTrace.i(7035022213120L, 52415);
    if (paramJSONObject != null) {
      try
      {
        this.rKR = new Orders();
        paramString = new Orders.Commodity();
        paramString.oqU = paramJSONObject.getString("buy_uin");
        paramString.oqV = paramJSONObject.getString("buy_name");
        paramString.oqW = paramJSONObject.optString("sale_uin");
        paramString.oqX = paramJSONObject.optString("sale_name");
        paramString.fKK = paramJSONObject.getString("trans_id");
        paramString.desc = paramJSONObject.optString("goods_name");
        paramString.kKX = (paramJSONObject.optDouble("pay_num") / 100.0D);
        paramString.orb = paramJSONObject.getString("trade_state");
        paramString.orc = paramJSONObject.getString("trade_state_name");
        paramString.org = paramJSONObject.getString("buy_bank_name");
        paramString.orn = paramJSONObject.optString("discount", "");
        paramString.ore = paramJSONObject.optInt("modify_timestamp");
        paramString.ori = paramJSONObject.optString("fee_type");
        paramString.orj = paramJSONObject.optString("appusername");
        paramString.oqL = paramJSONObject.optString("app_telephone");
        paramString.rPx = (paramJSONObject.optDouble("original_total_fee", -1.0D) / 100.0D);
        paramString.ori = paramJSONObject.optString("fee_type", "");
        paramInt = 1;
        Object localObject1 = paramJSONObject.optJSONObject("subscribe_biz_info");
        Object localObject2;
        if (localObject1 != null)
        {
          localObject2 = new Orders.b();
          ((Orders.b)localObject2).type = Orders.rPv;
          ((Orders.b)localObject2).name = ((JSONObject)localObject1).optString("nickname");
          ((Orders.b)localObject2).orj = ((JSONObject)localObject1).optString("username");
          paramString.rPy = ((Orders.b)localObject2).orj;
          ((Orders.b)localObject2).ovK = ((JSONObject)localObject1).optString("logo_round_url");
          ((Orders.b)localObject2).url = ((JSONObject)localObject1).optString("subscribe_biz_url");
          i = ((JSONObject)localObject1).optInt("recommend_level");
          paramString.rPa = i;
          paramInt = i;
          if (!bg.mZ(((Orders.b)localObject2).name))
          {
            paramString.rPE.add(localObject2);
            paramInt = i;
          }
        }
        localObject1 = paramJSONObject.getJSONArray("activity_info");
        int j = ((JSONArray)localObject1).length();
        int i = 0;
        Object localObject3;
        while (i < j)
        {
          localObject2 = ((JSONArray)localObject1).getJSONObject(i);
          localObject3 = new Orders.b();
          ((Orders.b)localObject3).type = Orders.rPw;
          ((Orders.b)localObject3).ovK = ((JSONObject)localObject2).optString("icon");
          ((Orders.b)localObject3).name = ((JSONObject)localObject2).optString("wording");
          ((Orders.b)localObject3).url = ((JSONObject)localObject2).optString("url");
          ((Orders.b)localObject3).rPL = ((JSONObject)localObject2).optString("btn_text");
          ((Orders.b)localObject3).rPM = ((JSONObject)localObject2).optInt("type");
          ((Orders.b)localObject3).title = ((JSONObject)localObject2).optString("title");
          ((Orders.b)localObject3).rPN = ((JSONObject)localObject2).optLong("activity_id");
          ((Orders.b)localObject3).rPO = ((JSONObject)localObject2).optInt("activity_type", 0);
          ((Orders.b)localObject3).rPP = ((JSONObject)localObject2).optInt("award_id");
          ((Orders.b)localObject3).rPQ = ((JSONObject)localObject2).optInt("send_record_id");
          ((Orders.b)localObject3).rPR = ((JSONObject)localObject2).optInt("user_record_id");
          ((Orders.b)localObject3).rPT = ((JSONObject)localObject2).optString("activity_tinyapp_username");
          ((Orders.b)localObject3).rPU = ((JSONObject)localObject2).optString("activity_tinyapp_path");
          ((Orders.b)localObject3).rPV = ((JSONObject)localObject2).optLong("activity_mch_id");
          paramString.rPE.add(localObject3);
          i += 1;
        }
        localObject1 = paramJSONObject.optJSONArray("discount_array");
        if ((localObject1 != null) && (((JSONArray)localObject1).length() > 0))
        {
          j = ((JSONArray)localObject1).length();
          paramString.rPA = new ArrayList();
          i = 0;
          while (i < j)
          {
            localObject2 = ((JSONArray)localObject1).optJSONObject(i);
            localObject3 = new Orders.DiscountInfo();
            ((Orders.DiscountInfo)localObject3).rPK = ((JSONObject)localObject2).optDouble("payment_amount");
            ((Orders.DiscountInfo)localObject3).rFJ = ((JSONObject)localObject2).optString("favor_desc");
            paramString.rPA.add(localObject3);
            i += 1;
          }
        }
        paramString.rPB = paramJSONObject.optString("rateinfo");
        paramString.rPC = paramJSONObject.optString("original_feeinfo");
        this.rKR.rPj = new ArrayList();
        this.rKR.rPj.add(paramString);
        this.rKR.rPc = paramJSONObject.optString("trade_state_name");
        this.rKR.rPa = paramInt;
        GMTrace.o(7035022213120L, 52415);
        return;
      }
      catch (JSONException paramString)
      {
        w.printErrStackTrace("MicroMsg.NetSceneTenpayQueryOrderInfo", paramString, "", new Object[0]);
        GMTrace.o(7035022213120L, 52415);
        return;
      }
      catch (Exception paramString)
      {
        w.printErrStackTrace("MicroMsg.NetSceneTenpayQueryOrderInfo", paramString, "", new Object[0]);
      }
    }
    GMTrace.o(7035022213120L, 52415);
  }
  
  public final int anK()
  {
    GMTrace.i(7034887995392L, 52414);
    GMTrace.o(7034887995392L, 52414);
    return 3;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/wallet_core/b/n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */