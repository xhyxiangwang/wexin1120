package com.tencent.d.a.c;

import org.json.JSONException;
import org.json.JSONObject;

public final class g
{
  public String qXN = "";
  public String signature = "";
  public int uid = -1;
  private long xBK = -1L;
  private String xBL = "";
  public String xBM = "";
  
  public g(String paramString1, String paramString2)
  {
    this.xBM = paramString1;
    try
    {
      paramString1 = new JSONObject(paramString1);
      this.xBK = paramString1.optLong("counter");
      this.uid = paramString1.optInt("uid");
      this.qXN = paramString1.optString("cpu_id");
      this.xBL = paramString1.optString("pub_key");
      this.signature = paramString2;
      return;
    }
    catch (JSONException paramString1)
    {
      for (;;)
      {
        c.e("Soter.SoterPubKeyModel", "soter: pub key model failed", new Object[0]);
      }
    }
  }
  
  public final String toString()
  {
    return "SoterPubKeyModel{counter=" + this.xBK + ", uid=" + this.uid + ", cpu_id='" + this.qXN + '\'' + ", pub_key_in_x509='" + this.xBL + '\'' + ", rawJson='" + this.xBM + '\'' + ", signature='" + this.signature + '\'' + '}';
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/d/a/c/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */