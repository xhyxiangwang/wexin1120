package com.tencent.mm.wallet_core.c;

import com.tencent.gmtrace.GMTrace;
import org.json.JSONObject;

public final class p
{
  public String uyo;
  public String xgm;
  public String xgn;
  public String xgo;
  public int xgp;
  
  public p()
  {
    GMTrace.i(1442035269632L, 10744);
    this.xgm = "";
    this.xgn = "";
    this.xgo = "";
    this.uyo = "";
    this.xgp = 0;
    GMTrace.o(1442035269632L, 10744);
  }
  
  public p(JSONObject paramJSONObject)
  {
    GMTrace.i(1442169487360L, 10745);
    this.xgm = "";
    this.xgn = "";
    this.xgo = "";
    this.uyo = "";
    this.xgp = 0;
    this.xgm = paramJSONObject.optString("device_id");
    this.xgn = paramJSONObject.optString("device_name");
    this.xgo = paramJSONObject.optString("device_os");
    this.xgp = paramJSONObject.optInt("Is_cur_device");
    this.uyo = paramJSONObject.optString("crt_no");
    GMTrace.o(1442169487360L, 10745);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/wallet_core/c/p.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */