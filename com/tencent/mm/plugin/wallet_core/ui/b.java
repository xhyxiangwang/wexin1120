package com.tencent.mm.plugin.wallet_core.ui;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.wallet_core.model.Orders;
import com.tencent.mm.plugin.wallet_core.model.Orders.Commodity;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public enum b
{
  private Map<String, WeakReference<a>> rSq;
  
  static
  {
    GMTrace.i(6979053420544L, 51998);
    rSp = new b("INSTANCE");
    rSr = new b[] { rSp };
    GMTrace.o(6979053420544L, 51998);
  }
  
  private b()
  {
    GMTrace.i(6978784985088L, 51996);
    this.rSq = new HashMap();
    GMTrace.o(6978784985088L, 51996);
  }
  
  public final a a(Orders paramOrders)
  {
    GMTrace.i(6978919202816L, 51997);
    if ((paramOrders != null) && (paramOrders.rPj != null))
    {
      localObject1 = new StringBuilder();
      int i = 0;
      while (i < paramOrders.rPj.size())
      {
        ((StringBuilder)localObject1).append(((Orders.Commodity)paramOrders.rPj.get(i)).fKK);
        i += 1;
      }
      ((StringBuilder)localObject1).append("@");
      ((StringBuilder)localObject1).append(paramOrders.rOQ);
    }
    for (Object localObject1 = ((StringBuilder)localObject1).toString(); bg.mZ((String)localObject1); localObject1 = null)
    {
      w.w("MicroMsg.FavorLogicHelperPool", "get key null");
      GMTrace.o(6978919202816L, 51997);
      return null;
    }
    Object localObject2;
    if (this.rSq.containsKey(localObject1))
    {
      w.i("MicroMsg.FavorLogicHelperPool", "hit cache, key:" + (String)localObject1);
      localObject2 = (WeakReference)this.rSq.get(localObject1);
      if (localObject2 == null) {
        break label263;
      }
      localObject2 = (a)((WeakReference)localObject2).get();
      if (localObject2 != null)
      {
        GMTrace.o(6978919202816L, 51997);
        return (a)localObject2;
      }
      w.i("MicroMsg.FavorLogicHelperPool", "helper null");
    }
    while ((paramOrders != null) && (paramOrders.rPk != null))
    {
      paramOrders = new a(paramOrders.rPk);
      localObject2 = new WeakReference(paramOrders);
      this.rSq.put(localObject1, localObject2);
      GMTrace.o(6978919202816L, 51997);
      return paramOrders;
      label263:
      w.i("MicroMsg.FavorLogicHelperPool", "weakHelper null");
    }
    GMTrace.o(6978919202816L, 51997);
    return null;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/wallet_core/ui/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */