package com.tencent.mm.plugin.wallet_core.a.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.wallet_core.f.a.h;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class b
  extends h
{
  public b(com.tencent.mm.plugin.wallet_core.model.n paramn)
  {
    this(paramn, -1);
    GMTrace.i(6829132218368L, 50881);
    GMTrace.o(6829132218368L, 50881);
  }
  
  public b(com.tencent.mm.plugin.wallet_core.model.n paramn, int paramInt)
  {
    GMTrace.i(6829266436096L, 50882);
    HashMap localHashMap1 = new HashMap();
    HashMap localHashMap2 = new HashMap();
    localHashMap1.put("flag", paramn.flag);
    localHashMap1.put("passwd", paramn.rQC);
    localHashMap1.put("verify_code", paramn.rQD);
    localHashMap1.put("token", paramn.token);
    if (paramn.rQE) {}
    for (String str = "1";; str = "0")
    {
      localHashMap1.put("bind_flag", str);
      if (paramInt > 0)
      {
        localHashMap1.put("realname_scene", String.valueOf(paramInt));
        w.i("MicroMsg.NetSenceTenPayBase", "realname_scene=%d", new Object[] { Integer.valueOf(paramInt) });
      }
      if (com.tencent.mm.wallet_core.c.n.ciK())
      {
        localHashMap2.put("uuid_for_bindcard", com.tencent.mm.wallet_core.c.n.ciM());
        localHashMap2.put("bindcard_scene", com.tencent.mm.wallet_core.c.n.ciL());
      }
      a(paramn.oRb, localHashMap1, localHashMap2);
      x(localHashMap1);
      aq(localHashMap2);
      GMTrace.o(6829266436096L, 50882);
      return;
    }
  }
  
  public final int Bc()
  {
    GMTrace.i(6829803307008L, 50886);
    GMTrace.o(6829803307008L, 50886);
    return 475;
  }
  
  public final void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
    GMTrace.i(6829534871552L, 50884);
    GMTrace.o(6829534871552L, 50884);
  }
  
  public final int anK()
  {
    GMTrace.i(6829400653824L, 50883);
    GMTrace.o(6829400653824L, 50883);
    return 17;
  }
  
  public final String getUri()
  {
    GMTrace.i(6829669089280L, 50885);
    GMTrace.o(6829669089280L, 50885);
    return "/cgi-bin/mmpay-bin/tenpay/bindverifyreg";
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/wallet_core/a/a/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */