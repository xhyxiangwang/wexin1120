package com.tencent.mm.plugin.wallet_core.d;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import com.tencent.mm.storage.w.a;
import com.tencent.mm.x.ap;
import com.tencent.mm.x.c;
import org.json.JSONObject;

public final class b
{
  public static void T(JSONObject paramJSONObject)
  {
    GMTrace.i(6833695621120L, 50915);
    if (paramJSONObject == null)
    {
      w.e("MicroMsg.WalletNetSceneUtil", "parseLuckyMoneySnsPayData() json is null");
      GMTrace.o(6833695621120L, 50915);
      return;
    }
    w.i("MicroMsg.WalletNetSceneUtil", "parseLuckyMoneySnsPayData()");
    String str2 = "";
    String str1 = "";
    int i = paramJSONObject.optInt("is_open_sns_pay", 0);
    int j = paramJSONObject.optInt("can_open_sns_pay", 0);
    int k = paramJSONObject.optInt("is_white_user", 0);
    if (j == 1)
    {
      str2 = paramJSONObject.optString("open_sns_pay_title");
      str1 = paramJSONObject.optString("open_sns_pay_wording");
      ap.AS();
      c.xi().a(w.a.uXZ, str2);
      ap.AS();
      c.xi().a(w.a.uYa, str1);
    }
    w.i("MicroMsg.WalletNetSceneUtil", "is_open_sns_pay:" + i + ", can_open_sns_pay:" + j + ", is_white_user:" + k);
    w.i("MicroMsg.WalletNetSceneUtil", "open_sns_pay_title:" + str2 + ", open_sns_pay_wording:" + str1);
    ap.AS();
    c.xi().a(w.a.uXW, Integer.valueOf(i));
    ap.AS();
    c.xi().a(w.a.uXX, Integer.valueOf(j));
    ap.AS();
    c.xi().a(w.a.uXY, Integer.valueOf(k));
    if (k == 1)
    {
      str1 = paramJSONObject.optString("set_sns_pay_title");
      paramJSONObject = paramJSONObject.optString("set_sns_pay_wording");
      ap.AS();
      c.xi().a(w.a.uYb, str1);
      ap.AS();
      c.xi().a(w.a.uYc, paramJSONObject);
    }
    for (;;)
    {
      w.i("MicroMsg.WalletNetSceneUtil", "set_sns_pay_title:" + str1 + ", set_sns_pay_wording:" + paramJSONObject);
      ap.AS();
      c.xi().kz(true);
      GMTrace.o(6833695621120L, 50915);
      return;
      paramJSONObject = "";
      str1 = "";
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/wallet_core/d/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */