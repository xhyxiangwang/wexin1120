package com.tencent.mm.plugin.offline.a;

import android.text.TextUtils;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.wallet_core.model.Bankcard;
import com.tencent.mm.wallet_core.f.a.h;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class i
  extends h
{
  public String fFP;
  public String onG;
  private String onH;
  private boolean onI;
  
  public i(Bankcard paramBankcard, String paramString1, String paramString2, int paramInt, String paramString3)
  {
    GMTrace.i(6198443114496L, 46182);
    this.onG = "0";
    this.onH = "0";
    this.fFP = "";
    this.onI = false;
    HashMap localHashMap = new HashMap();
    localHashMap.put("passwd", paramString1);
    localHashMap.put("oper", paramString2);
    if (paramString2.equals("changeto"))
    {
      if (!TextUtils.isEmpty(paramString3)) {
        break label175;
      }
      localHashMap.put("verify_code", "");
    }
    for (;;)
    {
      localHashMap.put("chg_fee", String.valueOf(paramInt));
      localHashMap.put("bind_serialno", paramBankcard.field_bindSerial);
      localHashMap.put("bank_type", paramBankcard.field_bankcardType);
      localHashMap.put("card_tail", paramBankcard.field_bankcardTail);
      this.fFP = paramBankcard.field_mobile;
      x(localHashMap);
      GMTrace.o(6198443114496L, 46182);
      return;
      label175:
      localHashMap.put("verify_code", paramString3);
    }
  }
  
  public final void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
    GMTrace.i(6198711549952L, 46184);
    if (paramJSONObject != null)
    {
      this.onG = paramJSONObject.optString("verify_flag");
      this.onH = paramJSONObject.optString("limit_fee");
    }
    GMTrace.o(6198711549952L, 46184);
  }
  
  public final int anK()
  {
    GMTrace.i(6198577332224L, 46183);
    GMTrace.o(6198577332224L, 46183);
    return 50;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/offline/a/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */