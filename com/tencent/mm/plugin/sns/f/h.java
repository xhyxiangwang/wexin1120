package com.tencent.mm.plugin.sns.f;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public final class h
{
  public boolean fxs;
  public String nkl;
  public int qhG;
  public List<a> qhH;
  public String qhT;
  public int[] qhU;
  public String qhe;
  public String qhf;
  
  public h()
  {
    GMTrace.i(8777705193472L, 65399);
    this.qhf = "";
    this.qhe = "";
    this.nkl = "";
    this.qhT = "";
    this.qhG = 0;
    this.qhH = new ArrayList();
    this.fxs = true;
    GMTrace.o(8777705193472L, 65399);
  }
  
  public final boolean bii()
  {
    GMTrace.i(8777839411200L, 65400);
    if ((this.fxs) && (this.qhH != null) && (this.qhH.size() > 0))
    {
      GMTrace.o(8777839411200L, 65400);
      return true;
    }
    GMTrace.o(8777839411200L, 65400);
    return false;
  }
  
  public final boolean e(String paramString1, String paramString2, Map<String, String> paramMap)
  {
    GMTrace.i(8777973628928L, 65401);
    this.qhf = paramString1;
    this.qhe = paramString2;
    if (paramMap == null)
    {
      GMTrace.o(8777973628928L, 65401);
      return false;
    }
    try
    {
      this.qhH.clear();
      this.nkl = bg.ap((String)paramMap.get("language"), "");
      this.qhT = bg.ap((String)paramMap.get("first_step_order"), "");
      paramString2 = this.qhT.split("\\|");
      this.qhU = new int[paramString2.length];
      if (this.qhU.length != 0) {
        break label485;
      }
      this.fxs = false;
    }
    catch (Exception paramString1)
    {
      for (;;)
      {
        int j;
        int k;
        w.printErrStackTrace("MicroMsg.SnsAdAbTestInfo", paramString1, "feed xml error ", new Object[0]);
        continue;
        int i = 0;
        continue;
        i += 1;
      }
    }
    if (i < paramString2.length)
    {
      this.qhU[i] = bg.RF(paramString2[i]);
      if ((this.qhU[i] <= 0) || (this.qhU[i] > 3)) {
        this.fxs = false;
      }
    }
    else
    {
      j = bg.RF((String)paramMap.get("wording_count"));
      k = bg.RF((String)paramMap.get("expertype"));
      i = 0;
      while (i < j)
      {
        paramString2 = new a();
        paramString2.qgx = bg.RF((String)paramMap.get(String.format("wording_%d_id", new Object[] { Integer.valueOf(i + 1) })));
        paramString2.qgy = bg.ap((String)paramMap.get(String.format("wording_%d_zh_CN", new Object[] { Integer.valueOf(i + 1) })), "");
        paramString2.qgz = bg.ap((String)paramMap.get(String.format("wording_%d_zh_TW", new Object[] { Integer.valueOf(i + 1) })), "");
        paramString2.qgA = bg.ap((String)paramMap.get(String.format("wording_%d_en", new Object[] { Integer.valueOf(i + 1) })), "");
        paramString2.qgB = bg.RF((String)paramMap.get(String.format("wording_%d_action_type", new Object[] { Integer.valueOf(i + 1) })));
        this.qhH.add(paramString2);
        i += 1;
      }
      w.i("MicroMsg.SnsAdAbTestInfo", "expertType " + k + " " + paramString1 + " " + this.qhT);
      GMTrace.o(8777973628928L, 65401);
      return false;
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/sns/f/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */