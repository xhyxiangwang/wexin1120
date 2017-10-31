package com.tencent.mm.plugin.wallet.pwd.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.wallet_core.model.Authen;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.wallet_core.f.a.h;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class f
  extends h
{
  private Map<String, String> rGQ;
  public String token;
  
  public f(Authen paramAuthen, boolean paramBoolean)
  {
    GMTrace.i(7741275897856L, 57677);
    this.token = null;
    this.rGQ = new HashMap();
    this.rGQ.put("flag", paramAuthen.fJg);
    if (!bg.mZ(paramAuthen.rMD))
    {
      this.rGQ.put("first_name", paramAuthen.rMD);
      this.rGQ.put("last_name", paramAuthen.rME);
      this.rGQ.put("country", paramAuthen.country);
      this.rGQ.put("area", paramAuthen.gbW);
      this.rGQ.put("city", paramAuthen.gbX);
      this.rGQ.put("address", paramAuthen.hwK);
      this.rGQ.put("phone_number", paramAuthen.mVx);
      this.rGQ.put("zip_code", paramAuthen.imw);
      this.rGQ.put("email", paramAuthen.gbP);
    }
    this.rGQ.put("bank_type", paramAuthen.oql);
    if (paramAuthen.rMx > 0) {
      this.rGQ.put("cre_type", paramAuthen.rMx);
    }
    if (!bg.mZ(paramAuthen.rMv)) {
      this.rGQ.put("true_name", paramAuthen.rMv);
    }
    if (!bg.mZ(paramAuthen.rMw)) {
      this.rGQ.put("identify_card", paramAuthen.rMw);
    }
    this.rGQ.put("mobile_no", paramAuthen.rKI);
    this.rGQ.put("bank_card_id", paramAuthen.rMy);
    if (!bg.mZ(paramAuthen.rMz)) {
      this.rGQ.put("cvv2", paramAuthen.rMz);
    }
    if (!bg.mZ(paramAuthen.rMA)) {
      this.rGQ.put("valid_thru", paramAuthen.rMA);
    }
    Map localMap = this.rGQ;
    if (paramBoolean) {}
    for (paramAuthen = "1";; paramAuthen = "0")
    {
      localMap.put("new_card_reset_pwd", paramAuthen);
      x(this.rGQ);
      GMTrace.o(7741275897856L, 57677);
      return;
    }
  }
  
  public final int Bc()
  {
    GMTrace.i(7742081204224L, 57683);
    GMTrace.o(7742081204224L, 57683);
    return 469;
  }
  
  public final void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
    GMTrace.i(7741678551040L, 57680);
    if (paramJSONObject != null) {
      this.token = paramJSONObject.optString("token");
    }
    GMTrace.o(7741678551040L, 57680);
  }
  
  public final boolean aTK()
  {
    GMTrace.i(7741410115584L, 57678);
    super.aTK();
    this.rGQ.put("is_repeat_send", "1");
    x(this.rGQ);
    GMTrace.o(7741410115584L, 57678);
    return true;
  }
  
  public final String aUD()
  {
    GMTrace.i(7741812768768L, 57681);
    String str = this.token;
    GMTrace.o(7741812768768L, 57681);
    return str;
  }
  
  public final int anK()
  {
    GMTrace.i(7741544333312L, 57679);
    GMTrace.o(7741544333312L, 57679);
    return 10;
  }
  
  public final String getUri()
  {
    GMTrace.i(7741946986496L, 57682);
    GMTrace.o(7741946986496L, 57682);
    return "/cgi-bin/mmpay-bin/tenpay/resetpwdauthen";
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/wallet/pwd/a/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */