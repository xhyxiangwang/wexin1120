package com.tencent.mm.plugin.order.model;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import com.tencent.mm.x.ap;
import com.tencent.mm.x.c;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public final class b
{
  public HashSet<String> oqR;
  
  public b()
  {
    GMTrace.i(6627402973184L, 49378);
    this.oqR = new HashSet();
    axG();
    GMTrace.o(6627402973184L, 49378);
  }
  
  private void axG()
  {
    GMTrace.i(6627537190912L, 49379);
    this.oqR.clear();
    ap.AS();
    Iterator localIterator = bg.f(((String)c.xi().get(204803, "")).split(";")).iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      if ((!bg.mZ(str)) && (!this.oqR.contains(str))) {
        this.oqR.add(str);
      }
    }
    ap.AS();
    c.xi().set(204817, Integer.valueOf(this.oqR.size()));
    w.d("MicroMsg.WalletOrdersManager", "notifyTrans.size() : " + this.oqR.size());
    GMTrace.o(6627537190912L, 49379);
  }
  
  public final void GE()
  {
    GMTrace.i(6627671408640L, 49380);
    StringBuffer localStringBuffer = new StringBuffer();
    Iterator localIterator = this.oqR.iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      if (!bg.mZ(str)) {
        localStringBuffer.append(str + ";");
      }
    }
    ap.AS();
    c.xi().set(204803, localStringBuffer.toString());
    GMTrace.o(6627671408640L, 49380);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/order/model/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */