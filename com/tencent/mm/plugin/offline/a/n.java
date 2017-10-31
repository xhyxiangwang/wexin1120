package com.tencent.mm.plugin.offline.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.compatible.d.p;
import com.tencent.mm.plugin.offline.c.a;
import com.tencent.mm.plugin.offline.k;
import com.tencent.mm.sdk.platformtools.aa;
import com.tencent.mm.storage.t;
import com.tencent.mm.storage.w.a;
import com.tencent.mm.wallet_core.f.a.h;
import com.tencent.mm.x.ap;
import com.tencent.mm.x.c;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class n
  extends h
{
  public static String onH;
  public static String onZ;
  private int kKx;
  private String kKy;
  public int onx;
  public String ony;
  public String ooa;
  public String oob;
  public String ooc;
  
  static
  {
    GMTrace.i(6196027195392L, 46164);
    onH = "";
    onZ = "";
    GMTrace.o(6196027195392L, 46164);
  }
  
  public n(String paramString, int paramInt)
  {
    GMTrace.i(6195356106752L, 46159);
    this.kKx = -1;
    this.kKy = "";
    this.onx = -1;
    this.ony = "";
    this.ooa = "";
    this.oob = "";
    this.ooc = "";
    HashMap localHashMap = new HashMap();
    localHashMap.put("device_id", p.tf());
    localHashMap.put("timestamp", paramString);
    localHashMap.put("scene", String.valueOf(paramInt));
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(p.tf());
    localStringBuilder.append("&");
    localStringBuilder.append(paramString);
    localHashMap.put("sign", aa.QW(localStringBuilder.toString()));
    paramString = new StringBuilder();
    ap.AS();
    localHashMap.put("code_ver", c.xi().get(w.a.uTW, ""));
    x(localHashMap);
    GMTrace.o(6195356106752L, 46159);
  }
  
  public final int Bc()
  {
    GMTrace.i(6195758759936L, 46162);
    GMTrace.o(6195758759936L, 46162);
    return 568;
  }
  
  public final void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
    GMTrace.i(6195624542208L, 46161);
    if (paramJSONObject != null)
    {
      onH = paramJSONObject.optString("limit_fee");
      onZ = paramJSONObject.optString("is_show_order_detail");
      paramString = paramJSONObject.optString("pay_amount");
      String str1 = paramJSONObject.optString("pay_number");
      String str2 = paramJSONObject.optString("card_logos");
      k.aTF();
      k.ag(196629, onH);
      k.aTF();
      k.ag(196641, onZ);
      k.aTF();
      k.ag(196645, paramString);
      k.aTF();
      k.ag(196646, str1);
      a.Dx(str2);
      this.kKx = paramJSONObject.optInt("retcode");
      this.kKy = paramJSONObject.optString("retmsg");
      this.onx = paramJSONObject.optInt("wx_error_type");
      this.ony = paramJSONObject.optString("wx_error_msg");
      this.ooa = paramJSONObject.optString("get_code_flag");
      this.oob = paramJSONObject.optString("micropay_pause_flag");
      this.ooc = paramJSONObject.optString("micropay_pause_word");
    }
    GMTrace.o(6195624542208L, 46161);
  }
  
  public final int anK()
  {
    GMTrace.i(6195490324480L, 46160);
    GMTrace.o(6195490324480L, 46160);
    return 49;
  }
  
  public final String getUri()
  {
    GMTrace.i(6195892977664L, 46163);
    GMTrace.o(6195892977664L, 46163);
    return "/cgi-bin/mmpay-bin/tenpay/offlinequeryuser";
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/offline/a/n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */