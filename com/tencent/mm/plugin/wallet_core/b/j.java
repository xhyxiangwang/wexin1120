package com.tencent.mm.plugin.wallet_core.b;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.wallet_core.f.a.h;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class j
  extends h
{
  public String rKG;
  public int rKH;
  public String rKI;
  public String rKJ;
  
  public j(String paramString1, String paramString2)
  {
    GMTrace.i(7029385068544L, 52373);
    HashMap localHashMap = new HashMap();
    localHashMap.put("passwd", paramString1);
    localHashMap.put("token", paramString2);
    x(localHashMap);
    aq(new HashMap());
    GMTrace.o(7029385068544L, 52373);
  }
  
  public j(String paramString1, String paramString2, byte paramByte)
  {
    GMTrace.i(7029519286272L, 52374);
    HashMap localHashMap = new HashMap();
    localHashMap.put("passwd", paramString1);
    localHashMap.put("token", paramString2);
    localHashMap.put("resend", "1");
    x(localHashMap);
    aq(new HashMap());
    GMTrace.o(7029519286272L, 52374);
  }
  
  public final int Bc()
  {
    GMTrace.i(7030056157184L, 52378);
    GMTrace.o(7030056157184L, 52378);
    return 1515;
  }
  
  public final void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
    GMTrace.i(7029787721728L, 52376);
    w.d("Micromsg.NetSceneTenpayCheckPwdByToken", "errCode " + paramInt + " errMsg: " + paramString);
    this.rKG = paramJSONObject.optString("usertoken");
    this.rKH = paramJSONObject.optInt("is_free_sms");
    this.rKI = paramJSONObject.optString("mobile_no");
    this.rKJ = paramJSONObject.optString("relation_key");
    GMTrace.o(7029787721728L, 52376);
  }
  
  public final int anK()
  {
    GMTrace.i(7029653504000L, 52375);
    GMTrace.o(7029653504000L, 52375);
    return 100;
  }
  
  public final boolean bwf()
  {
    GMTrace.i(7029921939456L, 52377);
    if (this.rKH == 0)
    {
      GMTrace.o(7029921939456L, 52377);
      return true;
    }
    GMTrace.o(7029921939456L, 52377);
    return false;
  }
  
  public final String getUri()
  {
    GMTrace.i(7030190374912L, 52379);
    GMTrace.o(7030190374912L, 52379);
    return "/cgi-bin/mmpay-bin/tenpay/getusertoken";
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/wallet_core/b/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */