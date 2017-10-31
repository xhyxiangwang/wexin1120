package com.tencent.mm.plugin.wallet_core.id_verify.model;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.wallet_core.f.a.h;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

public final class g
  extends h
{
  public int rKO;
  public int rKP;
  public Profession[] rMf;
  
  public g()
  {
    GMTrace.i(6845640998912L, 51004);
    this.rMf = null;
    HashMap localHashMap = new HashMap();
    if (!bg.mZ(null)) {
      localHashMap.put("scene", null);
    }
    x(localHashMap);
    GMTrace.o(6845640998912L, 51004);
  }
  
  public final int Bc()
  {
    GMTrace.i(6845909434368L, 51006);
    GMTrace.o(6845909434368L, 51006);
    return 1976;
  }
  
  public final void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
    int i = 0;
    GMTrace.i(6846177869824L, 51008);
    w.i("MicroMsg.NetSceneTenpayGetUserExInfo", "errCode: %s, errMsg: %s", new Object[] { Integer.valueOf(paramInt), paramString });
    w.d("MicroMsg.NetSceneTenpayGetUserExInfo", "json: %s", new Object[] { paramJSONObject.toString() });
    this.rKO = paramJSONObject.optInt("need_area");
    this.rKP = paramJSONObject.optInt("need_profession");
    paramString = paramJSONObject.optJSONArray("array");
    if (paramString != null)
    {
      this.rMf = new Profession[paramString.length()];
      paramInt = i;
      if (paramInt < paramString.length())
      {
        paramJSONObject = paramString.optJSONObject(paramInt);
        if (paramJSONObject != null)
        {
          String str = paramJSONObject.optString("profession_name");
          i = paramJSONObject.optInt("profession_type");
          if (bg.mZ(str)) {
            break label164;
          }
          paramJSONObject = new Profession(str, i);
          this.rMf[paramInt] = paramJSONObject;
        }
        for (;;)
        {
          paramInt += 1;
          break;
          label164:
          w.i("MicroMsg.NetSceneTenpayGetUserExInfo", "empty profession_name!");
        }
      }
    }
    GMTrace.o(6846177869824L, 51008);
  }
  
  public final int anK()
  {
    GMTrace.i(6845775216640L, 51005);
    GMTrace.o(6845775216640L, 51005);
    return 1976;
  }
  
  public final String getUri()
  {
    GMTrace.i(6846043652096L, 51007);
    GMTrace.o(6846043652096L, 51007);
    return "/cgi-bin/mmpay-bin/tenpay/getuserexinfo";
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/wallet_core/id_verify/model/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */