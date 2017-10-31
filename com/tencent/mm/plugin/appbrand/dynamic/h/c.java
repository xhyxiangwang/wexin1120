package com.tencent.mm.plugin.appbrand.dynamic.h;

import android.text.TextUtils;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.report.service.g;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public final class c
  implements a
{
  private String appId;
  private String iKu;
  private String iMY;
  private Map<String, Integer> iMZ;
  
  public c(String paramString1, String paramString2)
  {
    GMTrace.i(19985422352384L, 148903);
    this.iMZ = new HashMap();
    this.appId = paramString1;
    this.iKu = paramString2;
    this.iMY = (this.iKu + "-" + this.appId);
    GMTrace.o(19985422352384L, 148903);
  }
  
  public final void pH(String paramString)
  {
    GMTrace.i(19985556570112L, 148904);
    if (TextUtils.isEmpty(paramString))
    {
      GMTrace.o(19985556570112L, 148904);
      return;
    }
    Integer localInteger2 = (Integer)this.iMZ.get(paramString);
    Integer localInteger1 = localInteger2;
    if (localInteger2 == null) {
      localInteger1 = Integer.valueOf(0);
    }
    this.iMZ.put(paramString, Integer.valueOf(localInteger1.intValue() + 1));
    GMTrace.o(19985556570112L, 148904);
  }
  
  public final void rB()
  {
    GMTrace.i(19985690787840L, 148905);
    Iterator localIterator = this.iMZ.entrySet().iterator();
    while (localIterator.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)localIterator.next();
      g.paX.i(14705, new Object[] { localEntry.getKey(), localEntry.getValue(), this.iMY, this.iKu, this.appId });
    }
    this.iMZ.clear();
    GMTrace.o(19985690787840L, 148905);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/dynamic/h/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */