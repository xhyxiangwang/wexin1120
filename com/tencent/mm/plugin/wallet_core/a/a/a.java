package com.tencent.mm.plugin.wallet_core.a.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.a.o;
import com.tencent.mm.plugin.wallet_core.model.Authen;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.v;
import com.tencent.mm.storage.t;
import com.tencent.mm.wallet_core.c.n;
import com.tencent.mm.wallet_core.f.a.h;
import com.tencent.mm.x.ap;
import com.tencent.mm.x.c;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class a
  extends h
{
  private Map<String, String> rGQ;
  private Map<String, String> rGR;
  public String rHb;
  public String token;
  
  public a(Authen paramAuthen)
  {
    GMTrace.i(6829937524736L, 50887);
    this.rHb = null;
    this.token = null;
    this.rGQ = new HashMap();
    this.rGR = new HashMap();
    a(paramAuthen.oRb, this.rGQ, this.rGR);
    this.rGQ.put("flag", paramAuthen.fJg);
    this.rGQ.put("bank_type", paramAuthen.oql);
    if (!bg.mZ(paramAuthen.rMu)) {
      this.rGQ.put("passwd", paramAuthen.rMu);
    }
    if (!bg.mZ(paramAuthen.token)) {
      this.rGQ.put("token", paramAuthen.token);
    }
    if (!bg.mZ(paramAuthen.rEu))
    {
      ap.AS();
      o localo = new o(bg.a((Integer)c.xi().get(9, null), 0));
      this.rGQ.put("import_code", paramAuthen.rEu);
      this.rGQ.put("qqid", localo.toString());
      if (paramAuthen.rMx > 0) {
        this.rGQ.put("cre_type", paramAuthen.rMx);
      }
      this.rGQ.put("bind_serailno", paramAuthen.oqm);
    }
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
      this.rGQ.put("language", v.bMQ());
    }
    if (!bg.mZ(paramAuthen.rMv)) {
      this.rGQ.put("true_name", paramAuthen.rMv);
    }
    if (!bg.mZ(paramAuthen.rMw)) {
      this.rGQ.put("identify_card", paramAuthen.rMw);
    }
    if (paramAuthen.rMx > 0) {
      this.rGQ.put("cre_type", paramAuthen.rMx);
    }
    if (!bg.mZ(paramAuthen.rKI)) {
      this.rGQ.put("mobile_no", paramAuthen.rKI);
    }
    this.rGQ.put("bank_card_id", paramAuthen.rMy);
    if (!bg.mZ(paramAuthen.rMz)) {
      this.rGQ.put("cvv2", paramAuthen.rMz);
    }
    if (!bg.mZ(paramAuthen.rMA)) {
      this.rGQ.put("valid_thru", paramAuthen.rMA);
    }
    if (n.ciK())
    {
      this.rGR.put("uuid_for_bindcard", n.ciM());
      this.rGR.put("bindcard_scene", n.ciL());
    }
    x(this.rGQ);
    aq(this.rGR);
    GMTrace.o(6829937524736L, 50887);
  }
  
  public final int Bc()
  {
    GMTrace.i(6830742831104L, 50893);
    GMTrace.o(6830742831104L, 50893);
    return 471;
  }
  
  public final void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
    GMTrace.i(6830340177920L, 50890);
    if (paramJSONObject != null)
    {
      this.rHb = paramJSONObject.optString("req_key");
      this.token = paramJSONObject.optString("token");
    }
    GMTrace.o(6830340177920L, 50890);
  }
  
  public final boolean aTK()
  {
    GMTrace.i(6830071742464L, 50888);
    super.aTK();
    this.rGQ.put("is_repeat_send", "1");
    x(this.rGQ);
    GMTrace.o(6830071742464L, 50888);
    return true;
  }
  
  public final String aUD()
  {
    GMTrace.i(6830474395648L, 50891);
    String str = this.token;
    GMTrace.o(6830474395648L, 50891);
    return str;
  }
  
  public final int anK()
  {
    GMTrace.i(6830205960192L, 50889);
    GMTrace.o(6830205960192L, 50889);
    return 12;
  }
  
  public final String getUri()
  {
    GMTrace.i(6830608613376L, 50892);
    GMTrace.o(6830608613376L, 50892);
    return "/cgi-bin/mmpay-bin/tenpay/bindauthen";
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/wallet_core/a/a/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */