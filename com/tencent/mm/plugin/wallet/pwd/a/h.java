package com.tencent.mm.plugin.wallet.pwd.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.wallet_core.model.n;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class h
  extends com.tencent.mm.wallet_core.f.a.h
{
  public h(n paramn)
  {
    GMTrace.i(7739665285120L, 57665);
    HashMap localHashMap1 = new HashMap();
    HashMap localHashMap2 = new HashMap();
    localHashMap1.put("verify_code", paramn.rQD);
    localHashMap1.put("token", paramn.token);
    a(paramn.oRb, localHashMap1, localHashMap2);
    x(localHashMap1);
    aq(localHashMap2);
    GMTrace.o(7739665285120L, 57665);
  }
  
  public final int Bc()
  {
    GMTrace.i(7740067938304L, 57668);
    GMTrace.o(7740067938304L, 57668);
    return 470;
  }
  
  public final void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
    GMTrace.i(7739933720576L, 57667);
    GMTrace.o(7739933720576L, 57667);
  }
  
  public final int anK()
  {
    GMTrace.i(7739799502848L, 57666);
    GMTrace.o(7739799502848L, 57666);
    return 11;
  }
  
  public final String getUri()
  {
    GMTrace.i(7740202156032L, 57669);
    GMTrace.o(7740202156032L, 57669);
    return "/cgi-bin/mmpay-bin/tenpay/resetpwdverify";
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/wallet/pwd/a/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */