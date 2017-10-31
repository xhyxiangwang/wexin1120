package com.tencent.mm.plugin.wallet_core.id_verify.model;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import com.tencent.mm.storage.w.a;
import com.tencent.mm.wallet_core.f.a.h;
import com.tencent.mm.x.ap;
import com.tencent.mm.x.c;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class e
  extends h
{
  public String rLU;
  public String rLV;
  public String rLW;
  public String rLX;
  public int rLY;
  public long rLZ;
  public String title;
  
  public e(int paramInt1, int paramInt2)
  {
    GMTrace.i(6843359297536L, 50987);
    this.rLU = null;
    this.title = null;
    this.rLV = null;
    this.rLW = null;
    this.rLX = null;
    this.rLY = 0;
    this.rLZ = 0L;
    this.rLY = paramInt2;
    HashMap localHashMap = new HashMap();
    localHashMap.put("scene", String.valueOf(paramInt1));
    x(localHashMap);
    GMTrace.o(6843359297536L, 50987);
  }
  
  public final int Bc()
  {
    GMTrace.i(6843896168448L, 50991);
    GMTrace.o(6843896168448L, 50991);
    return 1614;
  }
  
  public final void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
    GMTrace.i(6843627732992L, 50989);
    w.i("MicroMsg.NetSceneRealnameGetDuty", "errCode=" + paramInt + ";errMsg=" + paramString);
    if ((paramInt == 0) && (paramJSONObject != null))
    {
      this.rLU = paramJSONObject.optString("agreed_flag", "0");
      this.title = paramJSONObject.optString("title", "");
      this.rLV = paramJSONObject.optString("service_protocol_wording", "");
      this.rLW = paramJSONObject.optString("service_protocol_url", "");
      this.rLX = paramJSONObject.optString("button_wording", "");
      this.rLZ = paramJSONObject.optLong("delay_expired_time", 0L);
      if (this.rLZ > 0L)
      {
        ap.AS();
        c.xi().a(w.a.uYt, Long.valueOf(System.currentTimeMillis() + this.rLZ * 1000L));
      }
    }
    GMTrace.o(6843627732992L, 50989);
  }
  
  public final int anK()
  {
    GMTrace.i(6843493515264L, 50988);
    GMTrace.o(6843493515264L, 50988);
    return 1614;
  }
  
  public final String getUri()
  {
    GMTrace.i(6843761950720L, 50990);
    GMTrace.o(6843761950720L, 50990);
    return "/cgi-bin/mmpay-bin/tenpay/realnamegetduty";
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/wallet_core/id_verify/model/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */