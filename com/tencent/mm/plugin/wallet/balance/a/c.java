package com.tencent.mm.plugin.wallet.balance.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.wallet_core.f.a.h;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class c
  extends h
{
  public String fCP;
  public String fQq;
  public String fQr;
  public String fQs;
  public String fQt;
  public String fQu;
  public double rBC;
  public boolean rBy;
  public String rBz;
  
  public c(double paramDouble, String paramString1, String paramString2, String paramString3)
  {
    GMTrace.i(7704097587200L, 57400);
    this.fCP = null;
    this.rBy = false;
    this.rBz = "";
    HashMap localHashMap = new HashMap();
    this.rBC = Math.round(100.0D * paramDouble);
    localHashMap.put("total_fee", this.rBC);
    localHashMap.put("fee_type", paramString1);
    localHashMap.put("bind_serial", paramString2);
    localHashMap.put("bank_type", paramString3);
    x(localHashMap);
    GMTrace.o(7704097587200L, 57400);
  }
  
  public final int Bc()
  {
    GMTrace.i(7704500240384L, 57403);
    GMTrace.o(7704500240384L, 57403);
    return 1502;
  }
  
  public final void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
    GMTrace.i(7704366022656L, 57402);
    w.d("Micromsg.NetSceneTenpayBalanceSave", "errCode " + paramInt + " errMsg: " + paramString);
    if (paramInt != 0)
    {
      GMTrace.o(7704366022656L, 57402);
      return;
    }
    this.fCP = paramJSONObject.optString("req_key");
    this.rBy = "1".equals(paramJSONObject.optString("should_alert"));
    this.rBz = paramJSONObject.optString("alert_msg");
    if (paramJSONObject.has("real_name_info"))
    {
      paramString = paramJSONObject.optJSONObject("real_name_info");
      w.i("Micromsg.NetSceneTenpayBalanceSave", "get real_name_info %s", new Object[] { paramString.toString() });
      this.fQq = paramString.optString("guide_flag");
      this.fQr = paramString.optString("guide_wording");
      this.fQs = paramString.optString("left_button_wording");
      this.fQt = paramString.optString("right_button_wording");
      this.fQu = paramString.optString("upload_credit_url");
    }
    GMTrace.o(7704366022656L, 57402);
  }
  
  public final int anK()
  {
    GMTrace.i(7704231804928L, 57401);
    GMTrace.o(7704231804928L, 57401);
    return 74;
  }
  
  public final String getUri()
  {
    GMTrace.i(7704634458112L, 57404);
    GMTrace.o(7704634458112L, 57404);
    return "/cgi-bin/mmpay-bin/tenpay/genpresave";
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/wallet/balance/a/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */