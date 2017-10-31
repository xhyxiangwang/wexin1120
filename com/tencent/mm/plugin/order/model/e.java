package com.tencent.mm.plugin.order.model;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.wallet_core.f.a.h;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class e
  extends h
{
  public int kKs;
  private int nwy;
  public List<i> orM;
  public List<d> orN;
  public String orO;
  
  public e(int paramInt, String paramString)
  {
    GMTrace.i(6626731884544L, 49373);
    this.orM = null;
    this.orN = null;
    HashMap localHashMap = new HashMap();
    localHashMap.put("Limit", "10");
    localHashMap.put("Offset", String.valueOf(paramInt));
    localHashMap.put("Extbuf", paramString);
    x(localHashMap);
    GMTrace.o(6626731884544L, 49373);
  }
  
  public final void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
    int i = 0;
    GMTrace.i(6627000320000L, 49375);
    w.d("MicroMsg.NetScenePatchQueryUserRoll", "errCode " + paramInt + " errMsg: " + paramString);
    this.orM = new LinkedList();
    try
    {
      this.kKs = paramJSONObject.getInt("TotalNum");
      this.nwy = paramJSONObject.getInt("RecNum");
      this.orO = paramJSONObject.optString("Extbuf");
      paramString = paramJSONObject.getJSONArray("UserRollList");
      Object localObject;
      if (paramString != null)
      {
        paramInt = 0;
        while (paramInt < paramString.length())
        {
          localObject = new i();
          JSONObject localJSONObject = paramString.getJSONObject(paramInt);
          ((i)localObject).orZ = localJSONObject.optInt("PayType");
          ((i)localObject).orR = localJSONObject.optString("Transid");
          ((i)localObject).orS = localJSONObject.optDouble("TotalFee");
          ((i)localObject).orT = localJSONObject.optString("GoodsName");
          ((i)localObject).orU = localJSONObject.optInt("CreateTime");
          ((i)localObject).orW = localJSONObject.optInt("ModifyTime");
          ((i)localObject).orX = localJSONObject.optString("FeeType");
          ((i)localObject).osc = localJSONObject.optString("AppThumbUrl");
          ((i)localObject).orV = localJSONObject.optString("TradeStateName");
          ((i)localObject).osh = localJSONObject.optString("StatusColor");
          ((i)localObject).osi = localJSONObject.optString("FeeColor");
          ((i)localObject).osj = localJSONObject.optDouble("ActualPayFee");
          ((i)localObject).osk = localJSONObject.optString("BillId");
          this.orM.add(localObject);
          paramInt += 1;
        }
      }
      this.orN = new LinkedList();
      paramString = paramJSONObject.optJSONArray("month_info");
      if (paramString != null)
      {
        paramInt = i;
        while (paramInt < paramString.length())
        {
          paramJSONObject = paramString.getJSONObject(paramInt);
          localObject = new d();
          ((d)localObject).year = paramJSONObject.optInt("year");
          ((d)localObject).month = paramJSONObject.optInt("month");
          ((d)localObject).orL = paramJSONObject.optString("feetext");
          this.orN.add(localObject);
          paramInt += 1;
        }
      }
      GMTrace.o(6627000320000L, 49375);
      return;
    }
    catch (JSONException paramString)
    {
      w.e("MicroMsg.NetScenePatchQueryUserRoll", "Parse Json exp:" + paramString.getLocalizedMessage());
      GMTrace.o(6627000320000L, 49375);
    }
  }
  
  public final int anK()
  {
    GMTrace.i(6626866102272L, 49374);
    GMTrace.o(6626866102272L, 49374);
    return 105;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/order/model/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */