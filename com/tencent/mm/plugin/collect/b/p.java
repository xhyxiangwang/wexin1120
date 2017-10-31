package com.tencent.mm.plugin.collect.b;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.w;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class p
  extends com.tencent.mm.wallet_core.f.a.h
{
  private int aCW;
  public boolean hie;
  public boolean kKP;
  public int kKQ;
  public int kKR;
  public int kKS;
  public int kKT;
  public String kKU;
  public List<h> kKV;
  public long kKr;
  
  public p(int paramInt1, long paramLong, int paramInt2, int paramInt3)
  {
    GMTrace.i(5397834366976L, 40217);
    this.hie = false;
    this.kKP = false;
    this.kKV = new ArrayList();
    this.aCW = paramInt2;
    this.kKR = 0;
    HashMap localHashMap = new HashMap();
    localHashMap.put("type", String.valueOf(paramInt1));
    localHashMap.put("from_timestamp", String.valueOf(paramLong));
    localHashMap.put("direction_flag", "0");
    localHashMap.put("num", String.valueOf(paramInt2));
    localHashMap.put("choose_flag", String.valueOf(paramInt3));
    x(localHashMap);
    GMTrace.o(5397834366976L, 40217);
  }
  
  public p(int paramInt1, long paramLong, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
  {
    GMTrace.i(5397968584704L, 40218);
    this.hie = false;
    this.kKP = false;
    this.kKV = new ArrayList();
    this.kKP = true;
    this.aCW = paramInt3;
    this.kKR = paramInt2;
    HashMap localHashMap = new HashMap();
    localHashMap.put("type", String.valueOf(paramInt1));
    localHashMap.put("from_timestamp", String.valueOf(paramLong));
    localHashMap.put("direction_flag", String.valueOf(paramInt2));
    localHashMap.put("num", String.valueOf(paramInt3));
    localHashMap.put("choose_flag", String.valueOf(paramInt4));
    localHashMap.put("try_num", String.valueOf(paramInt5));
    x(localHashMap);
    GMTrace.o(5397968584704L, 40218);
  }
  
  public final int Bc()
  {
    GMTrace.i(5398371237888L, 40221);
    GMTrace.o(5398371237888L, 40221);
    return 1993;
  }
  
  public final void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
    GMTrace.i(5398505455616L, 40222);
    w.d("MicroMsg.NetSceneTenpayF2fHistoryRecordList", "json: %s", new Object[] { paramJSONObject.toString() });
    this.kKQ = paramJSONObject.optInt("choose_flag", 0);
    this.kKr = paramJSONObject.optLong("from_timestamp", -1L);
    this.kKS = paramJSONObject.optInt("finish_flag", 0);
    this.kKT = paramJSONObject.optInt("try_num", 0);
    this.kKU = paramJSONObject.optString("retmsg", "");
    paramString = paramJSONObject.optJSONArray("records");
    if ((paramString == null) || (paramString.length() <= 0))
    {
      w.i("MicroMsg.NetSceneTenpayF2fHistoryRecordList", "empty records");
      if (this.kKS == 1)
      {
        w.i("MicroMsg.NetSceneTenpayF2fHistoryRecordList", "finish query");
        this.hie = true;
      }
      GMTrace.o(5398505455616L, 40222);
      return;
    }
    paramInt = 0;
    while (paramInt < paramString.length()) {
      try
      {
        paramJSONObject = paramString.getJSONObject(paramInt);
        h localh = new h();
        localh.type = paramJSONObject.optInt("type", 0);
        localh.kKr = paramJSONObject.optLong("from_timestamp", 0L);
        localh.kKs = paramJSONObject.optInt("total_num", 0);
        localh.kKt = paramJSONObject.optInt("total_amt", 0);
        this.kKV.add(localh);
        paramInt += 1;
      }
      catch (JSONException paramJSONObject)
      {
        for (;;)
        {
          w.printErrStackTrace("MicroMsg.NetSceneTenpayF2fHistoryRecordList", paramJSONObject, "", new Object[0]);
        }
      }
    }
  }
  
  public final int anK()
  {
    GMTrace.i(5398102802432L, 40219);
    GMTrace.o(5398102802432L, 40219);
    return 0;
  }
  
  public final String getUri()
  {
    GMTrace.i(5398237020160L, 40220);
    GMTrace.o(5398237020160L, 40220);
    return "/cgi-bin/mmpay-bin/f2frcvrcdhissta";
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/collect/b/p.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */