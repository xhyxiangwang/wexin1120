package com.tencent.mm.plugin.offline.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.storage.t;
import com.tencent.mm.storage.w.a;
import com.tencent.mm.wallet_core.f.a.h;
import com.tencent.mm.x.ap;
import com.tencent.mm.x.c;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class d
  extends h
{
  public String ont;
  public int onu;
  public String onv;
  
  public d()
  {
    GMTrace.i(15374909177856L, 114552);
    HashMap localHashMap = new HashMap();
    ap.AS();
    Object localObject = c.xi().get(w.a.vcn, null);
    if (localObject != null) {
      localHashMap.put("ack_key", (String)localObject);
    }
    localHashMap.put("timestamp", System.currentTimeMillis());
    x(localHashMap);
    GMTrace.o(15374909177856L, 114552);
  }
  
  public final void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
    GMTrace.i(15375311831040L, 114555);
    if (paramInt == 0)
    {
      g.paX.a(135L, 56L, 1L, true);
      this.ont = paramJSONObject.optString("appmsg");
      this.onu = (paramJSONObject.optInt("poll_time") * 1000);
      this.onv = paramJSONObject.optString("ack_key");
      if (this.onu > 0)
      {
        ap.AS();
        c.xi().a(w.a.vcm, Integer.valueOf(this.onu));
      }
      ap.AS();
      c.xi().a(w.a.vcn, this.onv);
      GMTrace.o(15375311831040L, 114555);
      return;
    }
    g.paX.a(135L, 57L, 1L, true);
    GMTrace.o(15375311831040L, 114555);
  }
  
  public final boolean aTK()
  {
    GMTrace.i(15375446048768L, 114556);
    GMTrace.o(15375446048768L, 114556);
    return false;
  }
  
  public final int anK()
  {
    GMTrace.i(15375043395584L, 114553);
    GMTrace.o(15375043395584L, 114553);
    return 1981;
  }
  
  public final String getUri()
  {
    GMTrace.i(15375177613312L, 114554);
    GMTrace.o(15375177613312L, 114554);
    return "/cgi-bin/mmpay-bin/tenpay/offlinegetmsg";
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/offline/a/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */