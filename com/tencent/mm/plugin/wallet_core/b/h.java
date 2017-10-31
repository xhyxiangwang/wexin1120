package com.tencent.mm.plugin.wallet_core.b;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.pluginsdk.wallet.PayInfo;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class h
  extends com.tencent.mm.wallet_core.f.a.h
{
  public h(com.tencent.mm.plugin.wallet_core.model.n paramn)
  {
    this(paramn, -1);
    GMTrace.i(7030324592640L, 52380);
    GMTrace.o(7030324592640L, 52380);
  }
  
  public h(com.tencent.mm.plugin.wallet_core.model.n paramn, int paramInt)
  {
    GMTrace.i(7030458810368L, 52381);
    HashMap localHashMap1 = new HashMap();
    HashMap localHashMap2 = new HashMap();
    a(paramn.oRb, localHashMap1, localHashMap2);
    localHashMap1.put("flag", paramn.flag);
    if ("2".equals(paramn.flag)) {
      localHashMap1.put("passwd", paramn.rQC);
    }
    localHashMap1.put("verify_code", paramn.rQD);
    localHashMap1.put("token", paramn.token);
    if ((paramn.oRb != null) && (!bg.mZ(paramn.oRb.fAF))) {
      localHashMap1.put("req_key", paramn.oRb.fAF);
    }
    if (paramInt >= 0)
    {
      localHashMap1.put("realname_scene", String.valueOf(paramInt));
      w.i("MicroMsg.NetSenceTenPayBase", "realname_scene=%d", new Object[] { Integer.valueOf(paramInt) });
    }
    if (com.tencent.mm.wallet_core.c.n.ciK())
    {
      localHashMap2.put("uuid_for_bindcard", com.tencent.mm.wallet_core.c.n.ciM());
      localHashMap2.put("bindcard_scene", com.tencent.mm.wallet_core.c.n.ciL());
    }
    x(localHashMap1);
    aq(localHashMap2);
    GMTrace.o(7030458810368L, 52381);
  }
  
  public final int Bc()
  {
    GMTrace.i(7030995681280L, 52385);
    GMTrace.o(7030995681280L, 52385);
    return 472;
  }
  
  public final void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
    GMTrace.i(7030727245824L, 52383);
    w.i("test", "test");
    GMTrace.o(7030727245824L, 52383);
  }
  
  public final int anK()
  {
    GMTrace.i(7030593028096L, 52382);
    GMTrace.o(7030593028096L, 52382);
    return 13;
  }
  
  public final String getUri()
  {
    GMTrace.i(7030861463552L, 52384);
    GMTrace.o(7030861463552L, 52384);
    return "/cgi-bin/mmpay-bin/tenpay/bindverify";
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/wallet_core/b/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */