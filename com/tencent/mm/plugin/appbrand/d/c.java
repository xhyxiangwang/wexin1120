package com.tencent.mm.plugin.appbrand.d;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.util.HashMap;

public final class c
{
  public HashMap<String, a> iGv;
  
  public c()
  {
    GMTrace.i(14287208710144L, 106448);
    this.iGv = new HashMap();
    GMTrace.o(14287208710144L, 106448);
  }
  
  public final void a(a parama)
  {
    GMTrace.i(14287342927872L, 106449);
    if ((parama == null) || (bg.mZ(parama.fAx)))
    {
      w.e("MicroMsg.AppbrandMediaCdnItemManager", "item is null or local id is null, ignore this add");
      GMTrace.o(14287342927872L, 106449);
      return;
    }
    w.i("MicroMsg.AppbrandMediaCdnItemManager", "add cdn item, local id : %s, file path : %s", new Object[] { parama.fAx, parama.iGk });
    this.iGv.put(parama.fAx, parama);
    GMTrace.o(14287342927872L, 106449);
  }
  
  public final a ow(String paramString)
  {
    GMTrace.i(14287477145600L, 106450);
    if (bg.mZ(paramString))
    {
      w.e("MicroMsg.AppbrandMediaCdnItemManager", "get by local id error, local id is null or nil");
      GMTrace.o(14287477145600L, 106450);
      return null;
    }
    paramString = (a)this.iGv.get(paramString);
    GMTrace.o(14287477145600L, 106450);
    return paramString;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/d/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */