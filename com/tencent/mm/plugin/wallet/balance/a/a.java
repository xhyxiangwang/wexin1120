package com.tencent.mm.plugin.wallet.balance.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.wallet_core.c.n;
import com.tencent.mm.wallet_core.f.a.h;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class a
  extends h
{
  public String fCP;
  
  public a(int paramInt1, String paramString1, String paramString2, String paramString3, int paramInt2)
  {
    GMTrace.i(7702755409920L, 57390);
    this.fCP = null;
    HashMap localHashMap = new HashMap();
    localHashMap.put("flag", String.valueOf(paramInt1));
    localHashMap.put("passwd", paramString1);
    localHashMap.put("req_key", paramString3);
    localHashMap.put("verify_code", paramString2);
    localHashMap.put("pay_scene", String.valueOf(paramInt2));
    x(localHashMap);
    paramString1 = new HashMap();
    if (n.ciK())
    {
      paramString1.put("uuid_for_bindcard", n.ciM());
      paramString1.put("bindcard_scene", n.ciL());
    }
    aq(paramString1);
    GMTrace.o(7702755409920L, 57390);
  }
  
  public final int Bc()
  {
    GMTrace.i(7703158063104L, 57393);
    GMTrace.o(7703158063104L, 57393);
    return 1506;
  }
  
  public final void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
    GMTrace.i(7703023845376L, 57392);
    w.d("Micromsg.NetSceneTenpayBalanceSave", "errCode " + paramInt + " errMsg: " + paramString);
    if (paramInt != 0)
    {
      GMTrace.o(7703023845376L, 57392);
      return;
    }
    this.fCP = paramJSONObject.optString("req_key");
    GMTrace.o(7703023845376L, 57392);
  }
  
  public final int anK()
  {
    GMTrace.i(7702889627648L, 57391);
    GMTrace.o(7702889627648L, 57391);
    return 76;
  }
  
  public final String getUri()
  {
    GMTrace.i(7703292280832L, 57394);
    GMTrace.o(7703292280832L, 57394);
    return "/cgi-bin/mmpay-bin/tenpay/verifybind";
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/wallet/balance/a/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */