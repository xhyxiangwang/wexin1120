package com.tencent.mm.plugin.wallet.balance.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.wallet_core.model.z;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.wallet_core.f.a.h;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class b
  extends h
{
  public String fCP;
  public String fQq;
  public String fQr;
  public String fQs;
  public String fQt;
  public String fQu;
  public int fvy;
  public double oVZ;
  public double oWk;
  public com.tencent.mm.plugin.wallet_core.model.b rBA;
  public com.tencent.mm.plugin.wallet_core.model.b rBB;
  public double rBC;
  public boolean rBy;
  public String rBz;
  
  public b(double paramDouble, String paramString1, String paramString2, int paramInt)
  {
    GMTrace.i(7703426498560L, 57395);
    this.fCP = null;
    this.rBy = false;
    this.rBz = "";
    this.oVZ = 0.0D;
    this.oWk = 0.0D;
    this.fvy = 0;
    HashMap localHashMap = new HashMap();
    this.rBC = Math.round(100.0D * paramDouble);
    localHashMap.put("total_fee", this.rBC);
    localHashMap.put("fee_type", paramString1);
    localHashMap.put("bank_type", paramString2);
    localHashMap.put("operation", String.valueOf(paramInt));
    x(localHashMap);
    GMTrace.o(7703426498560L, 57395);
  }
  
  public final int Bc()
  {
    GMTrace.i(7703829151744L, 57398);
    GMTrace.o(7703829151744L, 57398);
    return 1503;
  }
  
  public final void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
    GMTrace.i(7703694934016L, 57397);
    w.d("Micromsg.NetSceneTenpayBalanceFetch", "errCode " + paramInt + " errMsg: " + paramString);
    if (paramInt != 0)
    {
      GMTrace.o(7703694934016L, 57397);
      return;
    }
    this.fCP = paramJSONObject.optString("req_key");
    this.rBy = "1".equals(paramJSONObject.optString("should_alert"));
    this.rBz = paramJSONObject.optString("alert_msg");
    this.oVZ = (paramJSONObject.optDouble("charge_fee", 0.0D) / 100.0D);
    this.oWk = (paramJSONObject.optDouble("total_fee", 0.0D) / 100.0D);
    paramString = paramJSONObject.optJSONObject("first_fetch_info");
    if (paramString != null)
    {
      w.i("Micromsg.NetSceneTenpayBalanceFetch", "getBalanceFetchInfo(), first_fetch_info is valid");
      this.rBA = z.a(paramString, false);
      paramString = paramJSONObject.optJSONObject("need_charge_fee_info");
      if (paramString == null) {
        break label332;
      }
      w.i("Micromsg.NetSceneTenpayBalanceFetch", "getBalanceFetchInfo(), need_charge_fee_info is valid");
      this.rBB = z.a(paramString, false);
    }
    for (;;)
    {
      this.fvy = paramJSONObject.optInt("operation", 0);
      w.i("Micromsg.NetSceneTenpayBalanceFetch", "charge_fee:" + this.oVZ + " total_fee:" + this.oWk + " operation:" + this.fvy);
      if (paramJSONObject.has("real_name_info"))
      {
        paramString = paramJSONObject.optJSONObject("real_name_info");
        w.i("Micromsg.NetSceneTenpayBalanceFetch", "get real_name_info %s", new Object[] { paramString.toString() });
        this.fQq = paramString.optString("guide_flag");
        this.fQr = paramString.optString("guide_wording");
        this.fQs = paramString.optString("left_button_wording");
        this.fQt = paramString.optString("right_button_wording");
        this.fQu = paramString.optString("upload_credit_url");
      }
      GMTrace.o(7703694934016L, 57397);
      return;
      w.e("Micromsg.NetSceneTenpayBalanceFetch", "getBalanceFetchInfo(), first_fetch_info is null");
      break;
      label332:
      w.e("Micromsg.NetSceneTenpayBalanceFetch", "getBalanceFetchInfo(), need_charge_fee_info is null");
    }
  }
  
  public final int anK()
  {
    GMTrace.i(7703560716288L, 57396);
    GMTrace.o(7703560716288L, 57396);
    return 75;
  }
  
  public final String getUri()
  {
    GMTrace.i(7703963369472L, 57399);
    GMTrace.o(7703963369472L, 57399);
    return "/cgi-bin/mmpay-bin/tenpay/genprefetch";
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/wallet/balance/a/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */