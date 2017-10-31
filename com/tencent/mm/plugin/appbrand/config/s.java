package com.tencent.mm.plugin.appbrand.config;

import android.util.Pair;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.bg;
import java.util.Iterator;
import java.util.List;

public final class s
{
  public String appId;
  public String fvS;
  public String hpg;
  public List<WxaAttributes.WxaEntryInfo> iJD;
  public List<Pair<String, String>> iJQ;
  public int iJW;
  public String iKa;
  private String iKb;
  public String signature;
  public String username;
  
  public s()
  {
    GMTrace.i(15536238886912L, 115754);
    this.iKb = null;
    GMTrace.o(15536238886912L, 115754);
  }
  
  public final String Uw()
  {
    GMTrace.i(15536373104640L, 115755);
    if ((bg.mZ(this.iKb)) && (!bg.bX(this.iJQ)))
    {
      Object localObject2 = new StringBuilder();
      Iterator localIterator = this.iJQ.iterator();
      label118:
      while (localIterator.hasNext())
      {
        localObject1 = (Pair)localIterator.next();
        if (bg.mZ((String)((Pair)localObject1).second)) {}
        for (localObject1 = (String)((Pair)localObject1).first;; localObject1 = (String)((Pair)localObject1).second)
        {
          if (bg.mZ((String)localObject1)) {
            break label118;
          }
          ((StringBuilder)localObject2).append("、");
          ((StringBuilder)localObject2).append((String)localObject1);
          break;
        }
      }
      localObject2 = ((StringBuilder)localObject2).toString();
      localObject1 = localObject2;
      if (!bg.mZ((String)localObject2)) {
        localObject1 = ((String)localObject2).replaceFirst("、", "");
      }
      this.iKb = ((String)localObject1);
    }
    Object localObject1 = bg.mY(this.iKb);
    GMTrace.o(15536373104640L, 115755);
    return (String)localObject1;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/config/s.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */