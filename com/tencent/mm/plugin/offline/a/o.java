package com.tencent.mm.plugin.offline.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.offline.c.a;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import com.tencent.mm.storage.w.a;
import com.tencent.mm.wallet_core.f.a.h;
import com.tencent.mm.x.ap;
import com.tencent.mm.x.c;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class o
  extends h
{
  public o(int paramInt1, int paramInt2, int paramInt3)
  {
    this(paramInt1, paramInt2, 0, paramInt3, "");
    GMTrace.i(6194685018112L, 46154);
    GMTrace.o(6194685018112L, 46154);
  }
  
  private o(int paramInt1, int paramInt2, int paramInt3, int paramInt4, String paramString)
  {
    GMTrace.i(19264002064384L, 143528);
    HashMap localHashMap = new HashMap();
    localHashMap.put("residue_num", String.valueOf(paramInt1));
    localHashMap.put("entry_scene", String.valueOf(paramInt2));
    localHashMap.put("is_snapshot", String.valueOf(paramInt3));
    localHashMap.put("user_view_digit", String.valueOf(paramInt4));
    StringBuilder localStringBuilder = new StringBuilder();
    ap.AS();
    localHashMap.put("code_ver", c.xi().get(w.a.uTW, ""));
    localHashMap.put("card_id", a.kmv);
    localHashMap.put("user_card_id", a.oqg);
    localHashMap.put("card_code", a.oqh);
    localHashMap.put("ext_business_attach", paramString);
    x(localHashMap);
    w.i("MicroMsg.NetSceneTenpayWxOfflineShowCode", "hy: residue_num == %d, entryscene = %d,is_snapshot = %d, user_view_digit: %d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), Integer.valueOf(paramInt4) });
    w.d("MicroMsg.NetSceneTenpayWxOfflineShowCode", "card_id=%s,  user_card_id=%s,  card_code:%s ", new Object[] { a.kmv, a.oqg, a.oqh });
    GMTrace.o(19264002064384L, 143528);
  }
  
  public o(int paramInt1, int paramInt2, int paramInt3, String paramString)
  {
    this(paramInt1, paramInt2, paramInt3, 0, paramString);
    GMTrace.i(17970277384192L, 133889);
    GMTrace.o(17970277384192L, 133889);
  }
  
  public final int Bc()
  {
    GMTrace.i(6195087671296L, 46157);
    GMTrace.o(6195087671296L, 46157);
    return 572;
  }
  
  public final void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
    GMTrace.i(6194953453568L, 46156);
    GMTrace.o(6194953453568L, 46156);
  }
  
  public final int anK()
  {
    GMTrace.i(6194819235840L, 46155);
    GMTrace.o(6194819235840L, 46155);
    return 102;
  }
  
  public final String getUri()
  {
    GMTrace.i(6195221889024L, 46158);
    GMTrace.o(6195221889024L, 46158);
    return "/cgi-bin/mmpay-bin/tenpay/offlineshowcode";
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/offline/a/o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */