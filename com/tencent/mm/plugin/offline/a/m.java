package com.tencent.mm.plugin.offline.a;

import android.text.TextUtils;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.compatible.d.p;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import com.tencent.mm.storage.w.a;
import com.tencent.mm.x.ap;
import com.tencent.mm.x.c;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class m
  extends h
{
  public String onL;
  public String onM;
  public String onN;
  public String onP;
  public int onQ;
  public String onR;
  public String onS;
  public String onT;
  private String onV;
  private int onW;
  public String onX;
  public int onY;
  public String token;
  
  public m(String paramString, int paramInt)
  {
    this(paramString, paramInt, paramInt);
    GMTrace.i(6200053727232L, 46194);
    GMTrace.o(6200053727232L, 46194);
  }
  
  public m(String paramString, int paramInt1, int paramInt2)
  {
    GMTrace.i(14311770554368L, 106631);
    this.token = "";
    this.onL = "";
    this.onM = "";
    this.onN = "";
    this.onP = "";
    this.onQ = 0;
    this.onR = "";
    this.onS = "";
    this.onT = "";
    this.onY = 0;
    w.v("MicroMsg.NetSceneTenpayWxOfflineGetToken", "scene %s stack %s ", new Object[] { Integer.valueOf(paramInt1), bg.bOd().toString() });
    String str2 = com.tencent.mm.plugin.offline.c.a.aUD();
    com.tencent.mm.plugin.offline.k.aTF();
    String str1 = com.tencent.mm.plugin.offline.k.rR(196628);
    Object localObject = str1;
    if (TextUtils.isEmpty(str1)) {
      localObject = p.tf();
    }
    if (TextUtils.isEmpty(str2))
    {
      paramString = (String)localObject + "&" + paramString + "&" + ((int)(Math.random() * 1000000.0D) + 1000000);
      localObject = new HashMap();
      ((Map)localObject).put("token_src", paramString);
      com.tencent.mm.plugin.offline.k.aTF();
      str1 = com.tencent.mm.plugin.offline.k.rR(196617);
      switch (paramInt2)
      {
      default: 
        paramInt2 = 12;
        label275:
        g.paX.a(135L, paramInt2, 1L, true);
        com.tencent.mm.wallet_core.c.a.ciD();
        if (com.tencent.mm.wallet_core.c.a.isCertExist(str1))
        {
          com.tencent.mm.wallet_core.c.a.ciD();
          paramString = com.tencent.mm.wallet_core.c.a.genUserSig(str1, paramString);
          w.i("MicroMsg.NetSceneTenpayWxOfflineGetToken", "CertUtil.getInstance().isCertExist(cn) true");
          if (!TextUtils.isEmpty(paramString)) {
            break label743;
          }
          w.e("MicroMsg.NetSceneTenpayWxOfflineGetToken", " NetSceneTenpayWxOfflineGetToken sign is empty!");
          g.paX.a(135L, 4L, 1L, true);
          label346:
          ((Map)localObject).put("sign", paramString);
          ((Map)localObject).put("cert_no", str1);
          ((Map)localObject).put("type", k.onO);
          ((Map)localObject).put("version_number", k.onO);
          if (com.tencent.mm.plugin.offline.c.a.aUC() != 2) {
            break label754;
          }
          ((Map)localObject).put("last_token", com.tencent.mm.plugin.offline.c.a.aUE());
          label415:
          ((Map)localObject).put("scene", String.valueOf(paramInt1));
          w.i("MicroMsg.NetSceneTenpayWxOfflineGetToken", "inOfflineUI: %B", new Object[] { Boolean.valueOf(com.tencent.mm.plugin.offline.k.onk) });
          if (!com.tencent.mm.plugin.offline.k.onk) {
            break label770;
          }
          ((Map)localObject).put("fetch_tag", "1");
        }
        break;
      }
    }
    for (;;)
    {
      x((Map)localObject);
      GMTrace.o(14311770554368L, 106631);
      return;
      paramString = (String)localObject + "&" + paramString + "&" + ((int)(Math.random() * 1000000.0D) + 1000000) + "&" + str2;
      break;
      paramInt2 = 12;
      break label275;
      paramInt2 = 13;
      break label275;
      paramInt2 = 14;
      break label275;
      paramInt2 = 15;
      break label275;
      paramInt2 = 16;
      break label275;
      paramInt2 = 17;
      break label275;
      paramInt2 = 18;
      break label275;
      paramInt2 = 19;
      break label275;
      paramInt2 = 20;
      break label275;
      paramInt2 = 24;
      break label275;
      paramInt2 = 72;
      break label275;
      paramString = new StringBuilder("NetSceneTenpayWxOfflineGetToken CertUtil.getInstance().getLastError():");
      com.tencent.mm.wallet_core.c.a.ciD();
      w.e("MicroMsg.NetSceneTenpayWxOfflineGetToken", com.tencent.mm.wallet_core.c.a.getLastError());
      g.paX.a(135L, 6L, 1L, true);
      ap.AS();
      paramString = (String)c.xi().get(w.a.uTV, "");
      if ((paramString != null) && (paramString.equals(p.te()))) {
        w.i("MicroMsg.NetSceneTenpayWxOfflineGetToken", " NetSceneTenpayWxOfflineGetToken iemi is same between create and getToken");
      }
      for (;;)
      {
        w.e("MicroMsg.NetSceneTenpayWxOfflineGetToken", " NetSceneTenpayWxOfflineGetToken CertUtil.getInstance().isCertExist return false! cn: " + str1);
        paramString = "";
        break;
        w.i("MicroMsg.NetSceneTenpayWxOfflineGetToken", " NetSceneTenpayWxOfflineGetToken iemi is diff between create and getToken");
        g.paX.a(135L, 5L, 1L, true);
      }
      label743:
      w.i("MicroMsg.NetSceneTenpayWxOfflineGetToken", "sign is valid");
      break label346;
      label754:
      ((Map)localObject).put("last_token", com.tencent.mm.plugin.offline.c.a.aUD());
      break label415;
      label770:
      ((Map)localObject).put("fetch_tag", "0");
    }
  }
  
  public final int Bc()
  {
    GMTrace.i(6200590598144L, 46198);
    GMTrace.o(6200590598144L, 46198);
    return 571;
  }
  
  public final void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
    GMTrace.i(6200322162688L, 46196);
    w.d("MicroMsg.NetSceneTenpayWxOfflineGetToken", "errCode: %d, errMsg: %s", new Object[] { Integer.valueOf(paramInt), paramString });
    if (paramInt == 0)
    {
      this.token = paramJSONObject.optString("token");
      this.onL = paramJSONObject.optString("valid_end");
      this.onM = paramJSONObject.optString("encrypt_str");
      this.onN = paramJSONObject.optString("deviceid");
      this.onP = paramJSONObject.optString("token_v2");
      this.onQ = paramJSONObject.optInt("algorithm_type");
      this.onR = paramJSONObject.optString("card_list");
      this.onS = paramJSONObject.optString("key_list");
      this.onT = paramJSONObject.optString("token_pin");
      this.onV = paramJSONObject.optString("auth_codes");
      this.onW = paramJSONObject.optInt("update_interval");
      this.onX = paramJSONObject.optString("code_ver");
      this.onY = paramJSONObject.optInt("reget_token_num", 0);
      if (this.onY <= 0) {
        break label223;
      }
    }
    label223:
    for (com.tencent.mm.plugin.offline.k.onl = this.onY;; com.tencent.mm.plugin.offline.k.onl = 10)
    {
      w.d("MicroMsg.NetSceneTenpayWxOfflineGetToken", "json: %s", new Object[] { paramJSONObject.toString() });
      GMTrace.o(6200322162688L, 46196);
      return;
    }
  }
  
  public final void aTM()
  {
    GMTrace.i(6200456380416L, 46197);
    w.i("MicroMsg.NetSceneTenpayWxOfflineGetToken", "do save token");
    com.tencent.mm.plugin.offline.k.aTF();
    com.tencent.mm.plugin.offline.k.ag(196626, this.onL);
    com.tencent.mm.plugin.offline.k.aTF();
    com.tencent.mm.plugin.offline.k.ag(196627, this.onM);
    com.tencent.mm.plugin.offline.k.aTF();
    com.tencent.mm.plugin.offline.k.ag(196628, this.onN);
    com.tencent.mm.plugin.offline.k.aTF();
    com.tencent.mm.plugin.offline.k.ag(196632, System.currentTimeMillis() / 1000L);
    com.tencent.mm.plugin.offline.c.a.i(this.token, this.onP, this.onR, this.onS);
    com.tencent.mm.plugin.offline.c.a.rX(this.onQ);
    com.tencent.mm.plugin.offline.k.aTF();
    com.tencent.mm.plugin.offline.k.ag(196647, this.onT);
    com.tencent.mm.plugin.offline.k.aTF();
    Object localObject = com.tencent.mm.plugin.offline.k.rR(196617);
    com.tencent.mm.wallet_core.c.a.ciD();
    com.tencent.mm.wallet_core.c.a.clearToken((String)localObject);
    com.tencent.mm.wallet_core.c.a.ciD();
    if (!com.tencent.mm.wallet_core.c.a.setTokens((String)localObject, this.onV))
    {
      w.e("MicroMsg.NetSceneTenpayWxOfflineGetToken", "CertUtil.getInstance().setTokens failed!");
      localObject = new StringBuilder("WalletOfflineEntranceUI CertUtil.getInstance().getLastError():");
      com.tencent.mm.wallet_core.c.a.ciD();
      w.e("MicroMsg.NetSceneTenpayWxOfflineGetToken", com.tencent.mm.wallet_core.c.a.getLastError());
    }
    for (;;)
    {
      com.tencent.mm.plugin.offline.k.aTF();
      com.tencent.mm.plugin.offline.k.ag(196649, this.onW);
      ap.AS();
      c.xi().a(w.a.uTW, this.onX);
      GMTrace.o(6200456380416L, 46197);
      return;
      w.i("MicroMsg.NetSceneTenpayWxOfflineGetToken", "CertUtil.getInstance().setTokens success!");
    }
  }
  
  public final int anK()
  {
    GMTrace.i(6200187944960L, 46195);
    GMTrace.o(6200187944960L, 46195);
    return 52;
  }
  
  public final String getUri()
  {
    GMTrace.i(6200724815872L, 46199);
    GMTrace.o(6200724815872L, 46199);
    return "/cgi-bin/mmpay-bin/tenpay/offlinegettoken";
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/offline/a/m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */