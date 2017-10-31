package com.tencent.mm.plugin.offline.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mars.smc.IDKey;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.plugin.wallet_core.model.Bankcard;
import com.tencent.mm.protocal.d;
import com.tencent.mm.sdk.platformtools.aa;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import com.tencent.mm.storage.w.a;
import com.tencent.mm.wallet_core.f.a.h;
import com.tencent.mm.wallet_core.ui.e;
import com.tencent.mm.x.ap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class k
  extends h
{
  public static String onO;
  public String onJ;
  public String onK;
  public String onL;
  public String onM;
  public String onN;
  public String onP;
  public int onQ;
  public String onR;
  public String onS;
  public String onT;
  public int onU;
  public String token;
  
  static
  {
    GMTrace.i(6197369372672L, 46174);
    onO = "3";
    GMTrace.o(6197369372672L, 46174);
  }
  
  public k(Bankcard paramBankcard, String paramString, int paramInt)
  {
    GMTrace.i(6196429848576L, 46167);
    this.onJ = "";
    this.onK = "";
    this.token = "";
    this.onL = "";
    this.onM = "";
    this.onN = "";
    this.onP = "";
    this.onQ = 0;
    this.onR = "";
    this.onS = "";
    this.onT = "";
    this.onU = 20000;
    HashMap localHashMap = new HashMap();
    localHashMap.put("passwd", paramString);
    localHashMap.put("device_id", com.tencent.mm.compatible.d.p.tf());
    localHashMap.put("weixin_ver", "0x" + Integer.toHexString(d.toX));
    localHashMap.put("bind_serialno", paramBankcard.field_bindSerial);
    localHashMap.put("bank_type", paramBankcard.field_bankcardType);
    localHashMap.put("card_tail", paramBankcard.field_bankcardTail);
    localHashMap.put("open_limitfee", String.valueOf(paramInt));
    this.onU = paramInt;
    paramBankcard = e.getUsername();
    paramBankcard = aa.QW(aa.QW(paramBankcard) + aa.QW(com.tencent.mm.compatible.d.p.tf()));
    localHashMap.put("user_id", paramBankcard);
    localHashMap.put("crt_csr", com.tencent.mm.wallet_core.c.a.ciD().getCertApplyCSR(paramBankcard));
    localHashMap.put("type", onO);
    localHashMap.put("version_number", onO);
    x(localHashMap);
    GMTrace.o(6196429848576L, 46167);
  }
  
  public final int Bc()
  {
    GMTrace.i(6197100937216L, 46172);
    GMTrace.o(6197100937216L, 46172);
    return 565;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, com.tencent.mm.network.p paramp, byte[] paramArrayOfByte)
  {
    GMTrace.i(6196832501760L, 46170);
    super.a(paramInt1, paramInt2, paramInt3, paramString, paramp, paramArrayOfByte);
    if ((paramInt2 != 0) || (paramInt3 != 0))
    {
      com.tencent.mm.plugin.offline.k.aTF();
      com.tencent.mm.plugin.offline.k.ag(196630, "0");
    }
    paramString = new ArrayList();
    paramp = new IDKey();
    paramp.SetID(135);
    paramp.SetValue(1L);
    paramp.SetKey(11);
    paramArrayOfByte = new IDKey();
    paramArrayOfByte.SetID(135);
    paramArrayOfByte.SetValue(1L);
    if ((paramInt3 == 0) && (paramInt3 == 0)) {
      paramArrayOfByte.SetKey(9);
    }
    for (;;)
    {
      paramString.add(paramp);
      paramString.add(paramArrayOfByte);
      g.paX.b(paramString, true);
      GMTrace.o(6196832501760L, 46170);
      return;
      paramArrayOfByte.SetKey(10);
    }
  }
  
  public final void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
    GMTrace.i(6196698284032L, 46169);
    if (paramJSONObject != null)
    {
      this.onK = paramJSONObject.optString("crt_crt");
      this.onJ = paramJSONObject.optString("cn");
      this.token = paramJSONObject.optString("token");
      this.onL = paramJSONObject.optString("valid_end");
      this.onM = paramJSONObject.optString("encrypt_str");
      this.onN = paramJSONObject.optString("deviceid");
      if (!com.tencent.mm.wallet_core.c.a.ciD().importCert(this.onJ, this.onK)) {
        break label503;
      }
      w.i("MicroMsg.NetSceneTenpayWxOfflineCreate", "importCert crt_crt success");
      this.onP = paramJSONObject.optString("token_v2");
      this.onQ = paramJSONObject.optInt("algorithm_type");
      this.onR = paramJSONObject.optString("card_list");
      this.onS = paramJSONObject.optString("key_list");
      this.onT = paramJSONObject.optString("token_pin");
      String str = paramJSONObject.optString("notice_url");
      paramString = paramJSONObject.optString("auth_codes");
      paramInt = paramJSONObject.optInt("update_interval");
      paramJSONObject = paramJSONObject.optString("code_ver");
      com.tencent.mm.plugin.offline.k.aTF();
      com.tencent.mm.plugin.offline.k.ag(196617, this.onJ);
      com.tencent.mm.plugin.offline.k.aTF();
      com.tencent.mm.plugin.offline.k.ag(196626, this.onL);
      com.tencent.mm.plugin.offline.k.aTF();
      com.tencent.mm.plugin.offline.k.ag(196627, this.onM);
      com.tencent.mm.plugin.offline.k.aTF();
      com.tencent.mm.plugin.offline.k.ag(196628, this.onN);
      com.tencent.mm.plugin.offline.k.aTF();
      com.tencent.mm.plugin.offline.k.ag(196630, "1");
      com.tencent.mm.plugin.offline.k.aTF();
      com.tencent.mm.plugin.offline.k.ag(196632, System.currentTimeMillis() / 1000L);
      com.tencent.mm.plugin.offline.c.a.i(this.token, this.onP, this.onR, this.onS);
      com.tencent.mm.plugin.offline.c.a.rX(this.onQ);
      com.tencent.mm.plugin.offline.k.aTF();
      com.tencent.mm.plugin.offline.k.ag(196647, this.onT);
      com.tencent.mm.plugin.offline.c.a.Dw(str);
      com.tencent.mm.plugin.offline.k.aTF();
      str = com.tencent.mm.plugin.offline.k.rR(196617);
      com.tencent.mm.wallet_core.c.a.ciD();
      com.tencent.mm.wallet_core.c.a.clearToken(str);
      com.tencent.mm.wallet_core.c.a.ciD();
      boolean bool = com.tencent.mm.wallet_core.c.a.setTokens(this.onJ, paramString);
      w.i("MicroMsg.NetSceneTenpayWxOfflineCreate", "offlinecreate isOk %s cn: %s", new Object[] { Boolean.valueOf(bool), this.onJ });
      if (bool) {
        break label515;
      }
      w.e("MicroMsg.NetSceneTenpayWxOfflineCreate", "CertUtil.getInstance().setTokens failed!");
      paramString = new StringBuilder("WalletOfflineEntranceUI CertUtil.getInstance().getLastError():");
      com.tencent.mm.wallet_core.c.a.ciD();
      w.e("MicroMsg.NetSceneTenpayWxOfflineCreate", com.tencent.mm.wallet_core.c.a.getLastError());
    }
    for (;;)
    {
      com.tencent.mm.plugin.offline.k.aTF();
      com.tencent.mm.plugin.offline.k.ag(196649, String.valueOf(paramInt));
      ap.AS();
      com.tencent.mm.x.c.xi().a(w.a.uTV, com.tencent.mm.compatible.d.p.te());
      ap.AS();
      com.tencent.mm.x.c.xi().a(w.a.uTW, paramJSONObject);
      GMTrace.o(6196698284032L, 46169);
      return;
      label503:
      w.e("MicroMsg.NetSceneTenpayWxOfflineCreate", "importCert crt_crt fail");
      break;
      label515:
      w.i("MicroMsg.NetSceneTenpayWxOfflineCreate", "CertUtil.getInstance().setTokens success!");
    }
  }
  
  public final void a(com.tencent.mm.wallet_core.c.c paramc, JSONObject paramJSONObject)
  {
    GMTrace.i(6196966719488L, 46171);
    com.tencent.mm.wallet_core.c.a.ciD().ciE();
    GMTrace.o(6196966719488L, 46171);
  }
  
  public final int anK()
  {
    GMTrace.i(6196564066304L, 46168);
    GMTrace.o(6196564066304L, 46168);
    return 46;
  }
  
  public final String getUri()
  {
    GMTrace.i(6197235154944L, 46173);
    GMTrace.o(6197235154944L, 46173);
    return "/cgi-bin/mmpay-bin/tenpay/offlinecreate";
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/offline/a/k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */