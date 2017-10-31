package com.tencent.mm.plugin.appbrand.c;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.config.q;
import com.tencent.mm.protocal.c.bsn;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.vending.j.a;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

 enum h
{
  static
  {
    GMTrace.i(10016400605184L, 74628);
    iEW = new h[0];
    GMTrace.o(10016400605184L, 74628);
  }
  
  static void r(LinkedList<bsn> paramLinkedList)
  {
    GMTrace.i(10016266387456L, 74627);
    HashSet localHashSet = new HashSet();
    LinkedList localLinkedList = new LinkedList();
    paramLinkedList = paramLinkedList.iterator();
    while (paramLinkedList.hasNext())
    {
      bsn localbsn = (bsn)paramLinkedList.next();
      if (!bg.mZ(localbsn.username))
      {
        localHashSet.add(localbsn.username);
        localLinkedList.add(a.u(localbsn.username, Integer.valueOf(localbsn.tCf)));
      }
    }
    paramLinkedList = new ArrayList(localHashSet.size());
    paramLinkedList.addAll(localHashSet);
    q.S(paramLinkedList);
    GMTrace.o(10016266387456L, 74627);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/c/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */