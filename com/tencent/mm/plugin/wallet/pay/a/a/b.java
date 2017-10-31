package com.tencent.mm.plugin.wallet.pay.a.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.wallet_core.model.Authen;
import com.tencent.mm.plugin.wallet_core.model.Orders;
import com.tencent.mm.plugin.wallet_core.model.Orders.Commodity;
import com.tencent.mm.pluginsdk.l.a;
import com.tencent.mm.pluginsdk.l.d;
import com.tencent.mm.pluginsdk.wallet.PayInfo;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.wallet_core.c.n;
import com.tencent.mm.wallet_core.f.a.i;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

public class b
  extends i
{
  private Map<String, String> rGQ;
  private Map<String, String> rGR;
  public boolean rGS;
  public Orders rGT;
  public Authen rGU;
  public String rGV;
  public String rGW;
  private String rGX;
  public String token;
  
  public b(Authen paramAuthen, Orders paramOrders)
  {
    this(paramAuthen, paramOrders, false);
    GMTrace.i(7784762441728L, 58001);
    GMTrace.o(7784762441728L, 58001);
  }
  
  public b(Authen paramAuthen, Orders paramOrders, boolean paramBoolean)
  {
    this(paramAuthen, paramOrders, paramBoolean, (byte)0);
    GMTrace.i(7784896659456L, 58002);
    GMTrace.o(7784896659456L, 58002);
  }
  
  private b(Authen paramAuthen, Orders paramOrders, boolean paramBoolean, byte paramByte)
  {
    GMTrace.i(7785030877184L, 58003);
    this.rGS = false;
    this.rGT = null;
    this.token = null;
    this.rGV = null;
    this.rGW = null;
    this.rGX = null;
    this.rGU = paramAuthen;
    this.rGT = paramOrders;
    if (paramAuthen == null) {
      throw new IllegalArgumentException("authen == null");
    }
    List localList = paramOrders.rPj;
    String str = null;
    if (localList.size() > 0) {
      str = ((Orders.Commodity)localList.get(0)).fKK;
    }
    a(paramOrders.fAF, str, paramAuthen.oRb.fIG, paramAuthen.oRb.fIC, paramAuthen.oql, paramAuthen.oqm);
    if (paramAuthen.oRb == null) {
      throw new IllegalArgumentException("authen.payInfo == null");
    }
    w.i("MicroMsg.NetSceneTenpayAuthen", "pay channel :" + paramAuthen.oRb.fIC);
    this.rGQ = new HashMap();
    this.rGR = new HashMap();
    boolean bool;
    if ((!paramBoolean) && (!bg.mZ(this.rGU.rMu)))
    {
      bool = true;
      w.i("MicroMsg.NetSceneTenpayAuthen", "hy: has pwd: %b", new Object[] { Boolean.valueOf(bool) });
      a(paramAuthen.oRb, this.rGQ, this.rGR, bool);
      if (!paramBoolean) {
        break label609;
      }
      this.rGQ.put("brief_reg", "1");
      label274:
      this.rPs = paramOrders.rPs;
      this.rGQ.put("default_favorcomposedid", paramAuthen.rMF);
      this.rGQ.put("favorcomposedid", paramAuthen.rMG);
      this.rGQ.put("arrive_type", paramAuthen.rMC);
      this.rGQ.put("sms_flag", paramAuthen.rMH);
      this.rGQ.put("ban_sms_bind_serial", paramAuthen.rMI);
      this.rGQ.put("ban_sms_bank_type", paramAuthen.rMJ);
      this.rGQ.put("busi_sms_flag", paramAuthen.rMK);
      this.rGQ.put("buttontype", paramAuthen.oRb.toe);
      w.i("MicroMsg.NetSceneTenpayAuthen", "buttontype %s not_support_retry %s", new Object[] { Integer.valueOf(paramAuthen.oRb.toe), Integer.valueOf(this.rPs) });
      switch (paramAuthen.fJg)
      {
      }
    }
    for (;;)
    {
      x(this.rGQ);
      paramAuthen = l.a.sRt.ayL();
      if (paramAuthen != null) {
        this.rGR.putAll(paramAuthen);
      }
      if (n.ciK())
      {
        this.rGR.put("uuid_for_bindcard", n.ciM());
        this.rGR.put("bindcard_scene", n.ciL());
      }
      aq(this.rGR);
      GMTrace.o(7785030877184L, 58003);
      return;
      bool = false;
      break;
      label609:
      this.rGQ.put("passwd", paramAuthen.rMu);
      break label274;
      this.rGQ.put("flag", "1");
      this.rGQ.put("bank_type", paramAuthen.oql);
      this.rGQ.put("true_name", paramAuthen.rMv);
      this.rGQ.put("identify_card", paramAuthen.rMw);
      if (paramAuthen.rMx > 0) {
        this.rGQ.put("cre_type", paramAuthen.rMx);
      }
      this.rGQ.put("mobile_no", paramAuthen.rKI);
      this.rGQ.put("bank_card_id", paramAuthen.rMy);
      if (!bg.mZ(paramAuthen.rMz)) {
        this.rGQ.put("cvv2", paramAuthen.rMz);
      }
      if (!bg.mZ(paramAuthen.rMA))
      {
        this.rGQ.put("valid_thru", paramAuthen.rMA);
        continue;
        this.rGQ.put("flag", "2");
        this.rGQ.put("bank_type", paramAuthen.oql);
        this.rGQ.put("h_bind_serial", paramAuthen.oqm);
        this.rGQ.put("card_tail", paramAuthen.rMB);
        if (!bg.mZ(paramAuthen.rMv)) {
          this.rGQ.put("true_name", paramAuthen.rMv);
        }
        if (!bg.mZ(paramAuthen.rMw)) {
          this.rGQ.put("identify_card", paramAuthen.rMw);
        }
        this.rGQ.put("cre_type", paramAuthen.rMx);
        this.rGQ.put("mobile_no", paramAuthen.rKI);
        this.rGQ.put("bank_card_id", paramAuthen.rMy);
        if (!bg.mZ(paramAuthen.rMz)) {
          this.rGQ.put("cvv2", paramAuthen.rMz);
        }
        if (!bg.mZ(paramAuthen.rMA))
        {
          this.rGQ.put("valid_thru", paramAuthen.rMA);
          continue;
          if (paramAuthen.rMt == 1)
          {
            this.rGQ.put("reset_flag", "1");
            if (!bg.mZ(paramAuthen.rKI)) {
              this.rGQ.put("mobile_no", paramAuthen.rKI);
            }
            if (!bg.mZ(paramAuthen.rMz)) {
              this.rGQ.put("cvv2", paramAuthen.rMz);
            }
            if (!bg.mZ(paramAuthen.rMA)) {
              this.rGQ.put("valid_thru", paramAuthen.rMA);
            }
          }
          this.rGQ.put("flag", "3");
          this.rGQ.put("bank_type", paramAuthen.oql);
          this.rGQ.put("bind_serial", paramAuthen.oqm);
          continue;
          this.rGQ.put("flag", "4");
          this.rGQ.put("bank_type", paramAuthen.oql);
          this.rGQ.put("first_name", paramAuthen.rMD);
          this.rGQ.put("last_name", paramAuthen.rME);
          this.rGQ.put("country", paramAuthen.country);
          this.rGQ.put("area", paramAuthen.gbW);
          this.rGQ.put("city", paramAuthen.gbX);
          this.rGQ.put("address", paramAuthen.hwK);
          this.rGQ.put("phone_number", paramAuthen.mVx);
          this.rGQ.put("zip_code", paramAuthen.imw);
          this.rGQ.put("email", paramAuthen.gbP);
          this.rGQ.put("bank_card_id", paramAuthen.rMy);
          if (!bg.mZ(paramAuthen.rMz)) {
            this.rGQ.put("cvv2", paramAuthen.rMz);
          }
          if (!bg.mZ(paramAuthen.rMA))
          {
            this.rGQ.put("valid_thru", paramAuthen.rMA);
            continue;
            this.rGQ.put("flag", "5");
            this.rGQ.put("bank_type", paramAuthen.oql);
            this.rGQ.put("first_name", paramAuthen.rMD);
            this.rGQ.put("last_name", paramAuthen.rME);
            this.rGQ.put("country", paramAuthen.country);
            this.rGQ.put("area", paramAuthen.gbW);
            this.rGQ.put("city", paramAuthen.gbX);
            this.rGQ.put("address", paramAuthen.hwK);
            this.rGQ.put("phone_number", paramAuthen.mVx);
            this.rGQ.put("zip_code", paramAuthen.imw);
            this.rGQ.put("email", paramAuthen.gbP);
            this.rGQ.put("bank_card_id", paramAuthen.rMy);
            if (!bg.mZ(paramAuthen.rMz)) {
              this.rGQ.put("cvv2", paramAuthen.rMz);
            }
            if (!bg.mZ(paramAuthen.rMA)) {
              this.rGQ.put("valid_thru", paramAuthen.rMA);
            }
            this.rGQ.put("h_bind_serial", paramAuthen.oqm);
            this.rGQ.put("card_tail", paramAuthen.rMB);
            continue;
            if (paramAuthen.rMt == 1)
            {
              this.rGQ.put("reset_flag", "1");
              if (!bg.mZ(paramAuthen.rMz)) {
                this.rGQ.put("cvv2", paramAuthen.rMz);
              }
              if (!bg.mZ(paramAuthen.rMA)) {
                this.rGQ.put("valid_thru", paramAuthen.rMA);
              }
            }
            this.rGQ.put("phone_number", paramAuthen.rKI);
            this.rGQ.put("flag", "6");
            this.rGQ.put("bank_type", paramAuthen.oql);
            this.rGQ.put("bind_serial", paramAuthen.oqm);
          }
        }
      }
    }
  }
  
  public int Bc()
  {
    GMTrace.i(7785836183552L, 58009);
    if (this.rGU.oRb.fIG == 11)
    {
      GMTrace.o(7785836183552L, 58009);
      return 1610;
    }
    if (this.rGU.oRb.fIG == 21)
    {
      GMTrace.o(7785836183552L, 58009);
      return 1605;
    }
    GMTrace.o(7785836183552L, 58009);
    return 461;
  }
  
  public void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
    GMTrace.i(7785433530368L, 58006);
    super.a(paramInt, paramString, paramJSONObject);
    w.i("MicroMsg.NetSceneTenpayAuthen", " errCode: " + paramInt + " errMsg :" + paramString);
    w.d("MicroMsg.NetSceneTenpayAuthen", "banlance_mobile: %s", new Object[] { this.rGV });
    this.rGS = "1".equals(paramJSONObject.optString("is_free_sms"));
    this.token = paramJSONObject.optString("token");
    this.rGV = paramJSONObject.optString("balance_mobile");
    this.rGW = paramJSONObject.optString("balance_help_url");
    this.rGX = paramJSONObject.optString("modify_mobile_url");
    paramString = paramJSONObject.optString("bind_serial");
    if (!bg.mZ(paramString)) {
      w.i("MicroMsg.NetSceneTenpayAuthen", "Pay Success! saving bind_serial:" + paramString);
    }
    if ("1".equals(paramJSONObject.optString("pay_flag")))
    {
      this.rHU = true;
      this.rGT = Orders.a(paramJSONObject, this.rGT);
    }
    for (;;)
    {
      w.i("MicroMsg.NetSceneTenpayAuthen", "pay_scene:" + this.rGU.oRb.fIG);
      if ((paramInt != 0) || (this.rGU.oRb.fIG != 39)) {
        break;
      }
      w.i("MicroMsg.NetSceneTenpayAuthen", "it's the sns scene, parse the sns pay data");
      com.tencent.mm.plugin.wallet_core.d.b.T(paramJSONObject);
      GMTrace.o(7785433530368L, 58006);
      return;
      this.rHU = false;
    }
    w.i("MicroMsg.NetSceneTenpayAuthen", "it's not the sns scene or occurs error,  errCode:" + paramInt);
    GMTrace.o(7785433530368L, 58006);
  }
  
  public final boolean aTK()
  {
    GMTrace.i(7785165094912L, 58004);
    super.aTK();
    this.rGQ.put("is_repeat_send", "1");
    x(this.rGQ);
    GMTrace.o(7785165094912L, 58004);
    return true;
  }
  
  public final String aUD()
  {
    GMTrace.i(7785567748096L, 58007);
    String str = this.token;
    GMTrace.o(7785567748096L, 58007);
    return str;
  }
  
  public int anK()
  {
    GMTrace.i(7785299312640L, 58005);
    GMTrace.o(7785299312640L, 58005);
    return 0;
  }
  
  public final boolean bvr()
  {
    GMTrace.i(7785970401280L, 58010);
    if (this.rGU.oRb.tnX == 1)
    {
      GMTrace.o(7785970401280L, 58010);
      return true;
    }
    GMTrace.o(7785970401280L, 58010);
    return false;
  }
  
  public final boolean bvs()
  {
    GMTrace.i(7786104619008L, 58011);
    if ((this.rGU.oRb.fIG == 11) || (this.rGU.oRb.fIG == 21))
    {
      GMTrace.o(7786104619008L, 58011);
      return true;
    }
    GMTrace.o(7786104619008L, 58011);
    return false;
  }
  
  public String getUri()
  {
    GMTrace.i(7785701965824L, 58008);
    if (this.rGU.oRb.fIG == 11)
    {
      GMTrace.o(7785701965824L, 58008);
      return "/cgi-bin/mmpay-bin/tenpay/saveauthen";
    }
    if (this.rGU.oRb.fIG == 21)
    {
      GMTrace.o(7785701965824L, 58008);
      return "/cgi-bin/mmpay-bin/tenpay/fetchauthen";
    }
    GMTrace.o(7785701965824L, 58008);
    return "/cgi-bin/mmpay-bin/tenpay/authen";
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/wallet/pay/a/a/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */