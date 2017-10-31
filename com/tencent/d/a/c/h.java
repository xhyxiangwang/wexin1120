package com.tencent.d.a.c;

import org.json.JSONException;
import org.json.JSONObject;

public final class h
{
  public String signature = "";
  private long xBK = -1L;
  private String xBN = null;
  public String xBO = null;
  private String xBP = "";
  private String xBQ = "";
  private String xBR = "";
  private String xBS = "";
  private String xBT = "";
  public int xBU = 20;
  public String xBV = "";
  
  public static h XD(String paramString)
  {
    try
    {
      JSONObject localJSONObject = new JSONObject(paramString);
      h localh = new h();
      localh.xBV = paramString;
      localh.xBN = localJSONObject.optString("raw");
      localh.xBO = localJSONObject.optString("fid");
      localh.xBK = localJSONObject.optLong("counter");
      localh.xBP = localJSONObject.optString("tee_n");
      localh.xBQ = localJSONObject.optString("tee_v");
      localh.xBR = localJSONObject.optString("fp_n");
      localh.xBS = localJSONObject.optString("fp_v");
      localh.xBT = localJSONObject.optString("cpu_id");
      localh.xBU = localJSONObject.optInt("rsa_pss_saltlen", 20);
      return localh;
    }
    catch (JSONException paramString)
    {
      c.e("Soter.SoterSignatureResult", "soter: convert from json failed." + paramString.toString(), new Object[0]);
    }
    return null;
  }
  
  public final String toString()
  {
    return "SoterSignatureResult{rawValue='" + this.xBN + '\'' + ", fid='" + this.xBO + '\'' + ", counter=" + this.xBK + ", TEEName='" + this.xBP + '\'' + ", TEEVersion='" + this.xBQ + '\'' + ", FpName='" + this.xBR + '\'' + ", FpVersion='" + this.xBS + '\'' + ", cpuId='" + this.xBT + '\'' + ", saltLen=" + this.xBU + ", jsonValue='" + this.xBV + '\'' + ", signature='" + this.signature + '\'' + '}';
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/d/a/c/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */