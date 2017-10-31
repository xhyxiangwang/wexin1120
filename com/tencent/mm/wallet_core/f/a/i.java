package com.tencent.mm.wallet_core.f.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.wallet_core.id_verify.util.RealnameGuideHelper;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.wallet_core.c.c;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public abstract class i
  extends k
{
  private static int xgN;
  public RealnameGuideHelper onA;
  private String onB;
  private String onC;
  private String onD;
  private String onE;
  private String onF;
  protected int oqT;
  public int rPs;
  protected Map<String, String> xgL;
  public int xgM;
  private boolean xgO;
  public int xgP;
  public int xgQ;
  public String xgR;
  public JSONObject xgS;
  private int xgT;
  private boolean xgU;
  
  static
  {
    GMTrace.i(1524042301440L, 11355);
    xgN = 0;
    GMTrace.o(1524042301440L, 11355);
  }
  
  public i()
  {
    GMTrace.i(1522968559616L, 11347);
    this.xgL = new HashMap();
    this.xgM = 0;
    this.xgO = false;
    this.xgP = 0;
    this.xgQ = 0;
    this.xgR = null;
    this.xgS = null;
    this.xgT = 0;
    this.xgU = false;
    this.rPs = 0;
    GMTrace.o(1522968559616L, 11347);
  }
  
  public void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
    int j = 0;
    GMTrace.i(1523371212800L, 11350);
    if (!this.xgO)
    {
      this.xgQ = paramInt;
      this.xgR = paramString;
      this.xgS = paramJSONObject;
      this.xgO = true;
      if (paramJSONObject != null) {
        this.xgM = paramJSONObject.optInt("query_order_flag", 0);
      }
    }
    int i = j;
    if (paramJSONObject != null)
    {
      i = j;
      if (paramJSONObject.has("real_name_info"))
      {
        JSONObject localJSONObject = paramJSONObject.optJSONObject("real_name_info");
        this.onB = localJSONObject.optString("guide_flag");
        this.onC = localJSONObject.optString("guide_wording");
        this.onD = localJSONObject.optString("left_button_wording");
        this.onE = localJSONObject.optString("right_button_wording");
        this.onF = localJSONObject.optString("upload_credit_url");
        this.xgT = localJSONObject.optInt("send_pwd_msg");
        i = 1;
      }
    }
    if ((i != 0) && (("1".equals(this.onB)) || ("2".equals(this.onB)) || (1 == this.xgT)))
    {
      this.onA = new RealnameGuideHelper();
      this.onA.a(this.onB, this.xgT, this.onC, this.onD, this.onE, this.onF, this.oqT);
    }
    this.xgU = true;
    super.a(paramInt, paramString, paramJSONObject);
    GMTrace.o(1523371212800L, 11350);
  }
  
  public final void a(c paramc, JSONObject paramJSONObject)
  {
    GMTrace.i(1523639648256L, 11352);
    w.i("MicroMsg.NetSceneTenpayDelayQueryBase", "always callback: %s,%s", new Object[] { Integer.valueOf(paramc.errCode), paramc.ftU });
    if ((!this.xgU) && (!this.xgO))
    {
      this.xgP = paramc.errType;
      this.xgQ = paramc.errCode;
      this.xgR = paramc.ftU;
      if (paramJSONObject != null)
      {
        this.xgM = paramJSONObject.optInt("query_order_flag", 0);
        this.xgS = paramJSONObject;
      }
      this.xgO = true;
    }
    GMTrace.o(1523639648256L, 11352);
  }
  
  public final void a(String paramString1, String paramString2, int paramInt1, int paramInt2, String paramString3, String paramString4)
  {
    GMTrace.i(1523102777344L, 11348);
    xgN += 1;
    this.xgL.put("req_key", paramString1);
    this.xgL.put("transaction_id", paramString2);
    this.xgL.put("pay_scene", String.valueOf(paramInt1));
    this.xgL.put("bank_type", paramString3);
    this.xgL.put("channel", String.valueOf(paramInt2));
    this.xgL.put("bind_serial", paramString4);
    GMTrace.o(1523102777344L, 11348);
  }
  
  public final boolean bie()
  {
    GMTrace.i(1523908083712L, 11354);
    GMTrace.o(1523908083712L, 11354);
    return false;
  }
  
  public boolean bvs()
  {
    GMTrace.i(1523773865984L, 11353);
    GMTrace.o(1523773865984L, 11353);
    return false;
  }
  
  public final Map<String, String> cjc()
  {
    GMTrace.i(1523236995072L, 11349);
    Map localMap = this.xgL;
    GMTrace.o(1523236995072L, 11349);
    return localMap;
  }
  
  public final boolean cjd()
  {
    GMTrace.i(1523505430528L, 11351);
    if (this.xgM == 1)
    {
      GMTrace.o(1523505430528L, 11351);
      return true;
    }
    GMTrace.o(1523505430528L, 11351);
    return false;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/wallet_core/f/a/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */