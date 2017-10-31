package com.tencent.mm.plugin.offline.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.offline.c.a;
import com.tencent.mm.plugin.offline.k;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import com.tencent.mm.storage.w.a;
import com.tencent.mm.wallet_core.f.a.h;
import com.tencent.mm.x.ap;
import com.tencent.mm.x.c;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class b
  extends h
{
  public String TAG;
  
  public b(boolean paramBoolean)
  {
    GMTrace.i(19263867846656L, 143527);
    this.TAG = "MicroMsg.NetSceneOfflineAckMsg";
    HashMap localHashMap = new HashMap();
    localHashMap.put("ack_key", a.aUN());
    localHashMap.put("req_key", a.aUO());
    localHashMap.put("paymsg_type", a.aUP());
    localHashMap.put("transactionid", a.aUQ());
    localHashMap.put("network", a.cB(ab.getContext()));
    if (k.onk)
    {
      str = "1";
      localHashMap.put("processed", str);
      if (!a.aUR()) {
        break label219;
      }
      str = "1";
      label143:
      localHashMap.put("is_pos_enabled", str);
      if (!paramBoolean) {
        break label225;
      }
    }
    label219:
    label225:
    for (String str = "pull";; str = "push")
    {
      localHashMap.put("channel", str);
      localHashMap.put("timestamp", System.currentTimeMillis() / 1000L);
      x(localHashMap);
      GMTrace.o(19263867846656L, 143527);
      return;
      str = "0";
      break;
      str = "0";
      break label143;
    }
  }
  
  public final void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
    GMTrace.i(16592666624000L, 123625);
    if (paramInt == 0)
    {
      w.v(this.TAG, "response ok");
      g.paX.a(135L, 68L, 1L, true);
      paramInt = paramJSONObject.optInt("poll_time") * 1000;
      if (paramInt > 0)
      {
        ap.AS();
        c.xi().a(w.a.vcm, Integer.valueOf(paramInt));
      }
      GMTrace.o(16592666624000L, 123625);
      return;
    }
    w.v(this.TAG, "response fail");
    g.paX.a(135L, 69L, 1L, true);
    GMTrace.o(16592666624000L, 123625);
  }
  
  public final int anK()
  {
    GMTrace.i(16592800841728L, 123626);
    GMTrace.o(16592800841728L, 123626);
    return 1230;
  }
  
  public final String getUri()
  {
    GMTrace.i(16592935059456L, 123627);
    GMTrace.o(16592935059456L, 123627);
    return "/cgi-bin/mmpay-bin/tenpay/offlineackmsg";
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/offline/a/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */