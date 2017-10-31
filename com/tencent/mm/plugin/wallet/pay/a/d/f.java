package com.tencent.mm.plugin.wallet.pay.a.d;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.wallet_core.d.b;
import com.tencent.mm.plugin.wallet_core.model.Orders;
import com.tencent.mm.plugin.wallet_core.model.Orders.Commodity;
import com.tencent.mm.plugin.wallet_core.model.n;
import com.tencent.mm.pluginsdk.wallet.PayInfo;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.wallet_core.f.a.i;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

public class f
  extends i
{
  private int oWV;
  public Orders rGT;
  
  public f(n paramn, Orders paramOrders)
  {
    GMTrace.i(7781406998528L, 57976);
    this.rGT = null;
    this.oWV = -1;
    this.rGT = paramOrders;
    if (paramn.oRb != null)
    {
      this.oWV = paramn.oRb.fIG;
      i = paramn.oRb.fIC;
    }
    List localList = paramOrders.rPj;
    if (localList.size() > 0) {
      localObject = ((Orders.Commodity)localList.get(0)).fKK;
    }
    a(paramOrders.fAF, (String)localObject, this.oWV, i, paramn.oql, paramn.oqm);
    paramOrders = new HashMap();
    localObject = new HashMap();
    if (!bg.mZ(paramn.rQC)) {}
    for (boolean bool = true;; bool = false)
    {
      w.i("MicroMsg.NetSceneTenpayVertifyReg", "hy: has pwd: %b", new Object[] { Boolean.valueOf(bool) });
      a(paramn.oRb, paramOrders, (Map)localObject, bool);
      paramOrders.put("flag", paramn.flag);
      paramOrders.put("passwd", paramn.rQC);
      paramOrders.put("verify_code", paramn.rQD);
      paramOrders.put("token", paramn.token);
      paramOrders.put("favorcomposedid", paramn.rMG);
      paramOrders.put("default_favorcomposedid", paramn.rMF);
      x(paramOrders);
      aq((Map)localObject);
      GMTrace.o(7781406998528L, 57976);
      return;
    }
  }
  
  public int Bc()
  {
    GMTrace.i(7781943869440L, 57980);
    if (this.oWV == 11)
    {
      GMTrace.o(7781943869440L, 57980);
      return 1684;
    }
    if (this.oWV == 21)
    {
      GMTrace.o(7781943869440L, 57980);
      return 1608;
    }
    GMTrace.o(7781943869440L, 57980);
    return 474;
  }
  
  public final void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
    GMTrace.i(7781675433984L, 57978);
    super.a(paramInt, paramString, paramJSONObject);
    if (paramInt != 0)
    {
      GMTrace.o(7781675433984L, 57978);
      return;
    }
    paramString = paramJSONObject.optString("bind_serial");
    w.d("MicroMsg.NetSceneTenpayVertifyReg", "Pay Success! saving bind_serial:" + paramString);
    if ("1".equals(paramJSONObject.optString("pay_flag")))
    {
      this.rHU = true;
      this.rGT = Orders.a(paramJSONObject, this.rGT);
    }
    for (;;)
    {
      w.i("MicroMsg.NetSceneTenpayVertifyReg", "mPayScene:" + this.oWV);
      if (this.oWV != 39) {
        break;
      }
      w.i("MicroMsg.NetSceneTenpayVertifyReg", "it's the sns scene, parse the sns pay data");
      b.T(paramJSONObject);
      GMTrace.o(7781675433984L, 57978);
      return;
      this.rHU = false;
    }
    w.i("MicroMsg.NetSceneTenpayVertifyReg", "it's not the sns scene");
    GMTrace.o(7781675433984L, 57978);
  }
  
  public final int anK()
  {
    GMTrace.i(7781541216256L, 57977);
    GMTrace.o(7781541216256L, 57977);
    return 16;
  }
  
  public final boolean bvs()
  {
    GMTrace.i(7782078087168L, 57981);
    if ((this.oWV == 11) || (this.oWV == 21))
    {
      GMTrace.o(7782078087168L, 57981);
      return true;
    }
    GMTrace.o(7782078087168L, 57981);
    return false;
  }
  
  public String getUri()
  {
    GMTrace.i(7781809651712L, 57979);
    if (this.oWV == 11)
    {
      GMTrace.o(7781809651712L, 57979);
      return "/cgi-bin/mmpay-bin/tenpay/saveverifyreg";
    }
    if (this.oWV == 21)
    {
      GMTrace.o(7781809651712L, 57979);
      return "/cgi-bin/mmpay-bin/tenpay/fetchverifyreg";
    }
    GMTrace.o(7781809651712L, 57979);
    return "/cgi-bin/mmpay-bin/tenpay/verifyreg";
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/wallet/pay/a/d/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */