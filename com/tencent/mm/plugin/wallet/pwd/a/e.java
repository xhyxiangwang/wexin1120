package com.tencent.mm.plugin.wallet.pwd.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.wallet_core.model.n;
import com.tencent.mm.wallet_core.f.a.h;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class e
  extends h
{
  public e(n paramn)
  {
    GMTrace.i(7740604809216L, 57672);
    HashMap localHashMap1 = new HashMap();
    HashMap localHashMap2 = new HashMap();
    localHashMap1.put("flag", paramn.flag);
    localHashMap1.put("passwd", paramn.rQC);
    localHashMap1.put("rpasswd", paramn.rQC);
    localHashMap1.put("verify_code", paramn.rQD);
    localHashMap1.put("token", paramn.token);
    a(paramn.oRb, localHashMap1, localHashMap2);
    x(localHashMap1);
    aq(localHashMap2);
    GMTrace.o(7740604809216L, 57672);
  }
  
  public final int Bc()
  {
    GMTrace.i(7741007462400L, 57675);
    GMTrace.o(7741007462400L, 57675);
    return 478;
  }
  
  public final void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
    GMTrace.i(7740873244672L, 57674);
    GMTrace.o(7740873244672L, 57674);
  }
  
  public final int anK()
  {
    GMTrace.i(7740739026944L, 57673);
    GMTrace.o(7740739026944L, 57673);
    return 20;
  }
  
  public final String getUri()
  {
    GMTrace.i(7741141680128L, 57676);
    GMTrace.o(7741141680128L, 57676);
    return "/cgi-bin/mmpay-bin/tenpay/resetpwd";
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/wallet/pwd/a/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */