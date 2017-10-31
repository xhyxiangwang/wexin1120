package com.tencent.mm.plugin.offline.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.wallet_core.c.c;
import com.tencent.mm.wallet_core.f.a.h;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class f
  extends h
{
  private boolean fMW;
  
  public f(String paramString1, String paramString2)
  {
    GMTrace.i(6197503590400L, 46175);
    this.fMW = true;
    HashMap localHashMap = new HashMap();
    localHashMap.put("code_ver", paramString1);
    localHashMap.put("cn", paramString2);
    w.i("MicroMsg.NetSceneOfflineVerifyToken", "reqtoken ver %s cn: %s", new Object[] { paramString1, paramString2 });
    x(localHashMap);
    GMTrace.o(6197503590400L, 46175);
  }
  
  public final int Bc()
  {
    GMTrace.i(6197906243584L, 46178);
    GMTrace.o(6197906243584L, 46178);
    return 1686;
  }
  
  public final void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
    GMTrace.i(6198040461312L, 46179);
    w.i("MicroMsg.NetSceneOfflineVerifyToken", "respone %d errMsg: %s", new Object[] { Integer.valueOf(paramInt), paramString });
    if (paramInt == 0)
    {
      w.i("MicroMsg.NetSceneOfflineVerifyToken", "NetSceneOfflineVerifyToken succ");
      g.paX.a(135L, 22L, 1L, true);
      GMTrace.o(6198040461312L, 46179);
      return;
    }
    w.i("MicroMsg.NetSceneOfflineVerifyToken", "NetSceneOfflineVerifyToken fail.errCode = %d ;errMsg = ", new Object[] { Integer.valueOf(paramInt), paramString });
    g.paX.a(135L, 23L, 1L, true);
    GMTrace.o(6198040461312L, 46179);
  }
  
  public final void a(c paramc, JSONObject paramJSONObject)
  {
    GMTrace.i(6198174679040L, 46180);
    if ((paramc.xfU == 0) && (paramc.errType != 0)) {}
    for (this.fMW = false;; this.fMW = true)
    {
      w.i("MicroMsg.NetSceneOfflineVerifyToken", "onGYNetEnd2 isBlock %s", new Object[] { Boolean.valueOf(this.fMW) });
      GMTrace.o(6198174679040L, 46180);
      return;
    }
  }
  
  public final boolean aTL()
  {
    GMTrace.i(6198308896768L, 46181);
    boolean bool = this.fMW;
    GMTrace.o(6198308896768L, 46181);
    return bool;
  }
  
  public final int anK()
  {
    GMTrace.i(6197637808128L, 46176);
    GMTrace.o(6197637808128L, 46176);
    return 1686;
  }
  
  public final String getUri()
  {
    GMTrace.i(6197772025856L, 46177);
    GMTrace.o(6197772025856L, 46177);
    return "/cgi-bin/mmpay-bin/tenpay/offlineverifytoken";
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/offline/a/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */