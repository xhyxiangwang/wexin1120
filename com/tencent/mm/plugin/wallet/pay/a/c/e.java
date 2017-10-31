package com.tencent.mm.plugin.wallet.pay.a.c;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.wallet_core.d.b;
import com.tencent.mm.plugin.wallet_core.model.Orders;
import com.tencent.mm.plugin.wallet_core.model.Orders.Commodity;
import com.tencent.mm.pluginsdk.wallet.PayInfo;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.wallet_core.f.a.i;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

public class e
  extends i
{
  private int oWV;
  public Orders rGT;
  protected com.tencent.mm.plugin.wallet_core.model.n rHd;
  
  public e(com.tencent.mm.plugin.wallet_core.model.n paramn, Orders paramOrders)
  {
    GMTrace.i(7778856861696L, 57957);
    this.rGT = null;
    this.oWV = -1;
    this.rGT = paramOrders;
    this.rHd = paramn;
    List localList = paramOrders.rPj;
    if (localList.size() > 0) {
      localObject = ((Orders.Commodity)localList.get(0)).fKK;
    }
    if (paramn.oRb == null)
    {
      w.e("MicroMsg.NetSceneTenpayPayVertify", "empty payInfo");
      GMTrace.o(7778856861696L, 57957);
      return;
    }
    this.oWV = paramn.oRb.fIG;
    int i = paramn.oRb.fIC;
    a(paramOrders.fAF, (String)localObject, paramn.oRb.fIG, i, paramn.oql, paramn.oqm);
    paramOrders = new HashMap();
    localObject = new HashMap();
    paramOrders.put("flag", paramn.flag);
    paramOrders.put("passwd", paramn.rQC);
    if (!bg.mZ(paramn.rQC)) {}
    for (boolean bool = true;; bool = false)
    {
      w.i("MicroMsg.NetSceneTenpayPayVertify", "hy: has pwd: %b", new Object[] { Boolean.valueOf(bool) });
      a(paramn.oRb, paramOrders, (Map)localObject, bool);
      paramOrders.put("verify_code", paramn.rQD);
      paramOrders.put("token", paramn.token);
      paramOrders.put("bank_type", paramn.oql);
      paramOrders.put("bind_serial", paramn.oqm);
      paramOrders.put("arrive_type", paramn.rMC);
      paramOrders.put("default_favorcomposedid", paramn.rMF);
      paramOrders.put("favorcomposedid", paramn.rMG);
      if (com.tencent.mm.wallet_core.c.n.ciK())
      {
        ((Map)localObject).put("uuid_for_bindcard", com.tencent.mm.wallet_core.c.n.ciM());
        ((Map)localObject).put("bindcard_scene", com.tencent.mm.wallet_core.c.n.ciL());
      }
      x(paramOrders);
      aq((Map)localObject);
      GMTrace.o(7778856861696L, 57957);
      return;
    }
  }
  
  public int Bc()
  {
    GMTrace.i(7779393732608L, 57961);
    if (this.oWV == 11)
    {
      GMTrace.o(7779393732608L, 57961);
      return 1607;
    }
    if (this.oWV == 21)
    {
      GMTrace.o(7779393732608L, 57961);
      return 1606;
    }
    GMTrace.o(7779393732608L, 57961);
    return 462;
  }
  
  public void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
    GMTrace.i(7779125297152L, 57959);
    super.a(paramInt, paramString, paramJSONObject);
    if (paramInt != 0)
    {
      GMTrace.o(7779125297152L, 57959);
      return;
    }
    paramString = paramJSONObject.optString("bind_serial");
    w.d("MicroMsg.NetSceneTenpayPayVertify", "Pay Success! saving bind_serial:" + paramString);
    if ("1".equals(paramJSONObject.optString("pay_flag")))
    {
      this.rHU = true;
      this.rGT = Orders.a(paramJSONObject, this.rGT);
    }
    for (;;)
    {
      w.i("MicroMsg.NetSceneTenpayPayVertify", "mPayScene:" + this.oWV);
      if (this.oWV != 39) {
        break;
      }
      w.i("MicroMsg.NetSceneTenpayPayVertify", "it's the sns scene, parse the sns pay data");
      b.T(paramJSONObject);
      GMTrace.o(7779125297152L, 57959);
      return;
      this.rHU = false;
    }
    w.i("MicroMsg.NetSceneTenpayPayVertify", "it's not the sns scene");
    GMTrace.o(7779125297152L, 57959);
  }
  
  public int anK()
  {
    GMTrace.i(7778991079424L, 57958);
    GMTrace.o(7778991079424L, 57958);
    return 1;
  }
  
  public final boolean bvs()
  {
    GMTrace.i(7779527950336L, 57962);
    if ((this.oWV == 11) || (this.oWV == 21))
    {
      GMTrace.o(7779527950336L, 57962);
      return true;
    }
    GMTrace.o(7779527950336L, 57962);
    return false;
  }
  
  public String getUri()
  {
    GMTrace.i(7779259514880L, 57960);
    if (this.oWV == 11)
    {
      GMTrace.o(7779259514880L, 57960);
      return "/cgi-bin/mmpay-bin/tenpay/saveverify";
    }
    if (this.oWV == 21)
    {
      GMTrace.o(7779259514880L, 57960);
      return "/cgi-bin/mmpay-bin/tenpay/fetchverify";
    }
    GMTrace.o(7779259514880L, 57960);
    return "/cgi-bin/mmpay-bin/tenpay/verify";
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/wallet/pay/a/c/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */