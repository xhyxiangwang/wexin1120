package com.tencent.mm.plugin.wallet_core.b;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.wallet_core.model.Orders.b;
import com.tencent.mm.wallet_core.f.a.h;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class f
  extends h
{
  public String kCB;
  public Orders.b rKC;
  public String rKD;
  public String rKE;
  
  public f(Orders.b paramb, String paramString1, String paramString2, long paramLong)
  {
    GMTrace.i(16143439888384L, 120278);
    this.rKC = paramb;
    HashMap localHashMap = new HashMap();
    localHashMap.put("activity_id", paramb.rPN);
    localHashMap.put("award_id", paramb.rPP);
    localHashMap.put("send_record_id", paramb.rPQ);
    localHashMap.put("user_record_id", paramb.rPR);
    localHashMap.put("req_key", paramString1);
    localHashMap.put("transaction_id", paramString2);
    localHashMap.put("activity_mch_id", String.valueOf(paramLong));
    x(localHashMap);
    GMTrace.o(16143439888384L, 120278);
  }
  
  public final int Bc()
  {
    GMTrace.i(7035559084032L, 52419);
    GMTrace.o(7035559084032L, 52419);
    return 1589;
  }
  
  public final void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
    GMTrace.i(7035424866304L, 52418);
    if ((paramJSONObject != null) && (paramInt == 0))
    {
      this.rKD = paramJSONObject.optString("result_code");
      this.kCB = paramJSONObject.optString("result_msg");
      this.rKE = paramJSONObject.optString("alert_wording");
    }
    GMTrace.o(7035424866304L, 52418);
  }
  
  public final int anK()
  {
    GMTrace.i(7035290648576L, 52417);
    GMTrace.o(7035290648576L, 52417);
    return 1589;
  }
  
  public final String getUri()
  {
    GMTrace.i(7035693301760L, 52420);
    GMTrace.o(7035693301760L, 52420);
    return "/cgi-bin/mmpay-bin/tenpay/sendpayaward";
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/wallet_core/b/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */