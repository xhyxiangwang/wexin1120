package com.tencent.mm.plugin.wallet_core.b;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.wallet_core.model.n;
import com.tencent.mm.wallet_core.f.a.h;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class p
  extends h
{
  public String rKF;
  public String rKT;
  
  public p(n paramn, String paramString)
  {
    GMTrace.i(7028042891264L, 52363);
    HashMap localHashMap = new HashMap();
    localHashMap.put("verify_code", paramn.rQD);
    localHashMap.put("token", paramn.token);
    localHashMap.put("passwd", paramn.rQC);
    localHashMap.put("relation_key", paramString);
    x(localHashMap);
    GMTrace.o(7028042891264L, 52363);
  }
  
  public final int Bc()
  {
    GMTrace.i(7028579762176L, 52367);
    GMTrace.o(7028579762176L, 52367);
    return 1604;
  }
  
  public final void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
    GMTrace.i(7028311326720L, 52365);
    if ((paramJSONObject != null) && (paramInt == 0))
    {
      this.rKF = paramJSONObject.optString("token_type");
      this.rKT = paramJSONObject.optString("usertoken");
    }
    GMTrace.o(7028311326720L, 52365);
  }
  
  public final int anK()
  {
    GMTrace.i(7028177108992L, 52364);
    GMTrace.o(7028177108992L, 52364);
    return 124;
  }
  
  public final String getUri()
  {
    GMTrace.i(7028445544448L, 52366);
    GMTrace.o(7028445544448L, 52366);
    return "/cgi-bin/mmpay-bin/tenpay/webankverifysms";
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/wallet_core/b/p.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */