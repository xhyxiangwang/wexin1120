package com.tencent.mm.plugin.sns.model;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.sns.ui.bf;
import com.tencent.mm.protocal.c.bhc;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class as
  implements e
{
  public List<WeakReference<e>> qfc;
  
  public as()
  {
    GMTrace.i(8116280229888L, 60471);
    this.qfc = new LinkedList();
    GMTrace.o(8116280229888L, 60471);
  }
  
  public final void a(int paramInt, String paramString1, long paramLong, String paramString2, bhc parambhc, boolean paramBoolean)
  {
    GMTrace.i(8116682883072L, 60474);
    Iterator localIterator = this.qfc.iterator();
    while (localIterator.hasNext())
    {
      WeakReference localWeakReference = (WeakReference)localIterator.next();
      if ((localWeakReference != null) && (localWeakReference.get() != null)) {
        ((e)localWeakReference.get()).a(paramInt, paramString1, paramLong, paramString2, parambhc, paramBoolean);
      }
    }
    GMTrace.o(8116682883072L, 60474);
  }
  
  public final void a(int paramInt, String paramString1, long paramLong, String paramString2, bhc parambhc, boolean paramBoolean, bf parambf)
  {
    GMTrace.i(8116548665344L, 60473);
    Iterator localIterator = this.qfc.iterator();
    while (localIterator.hasNext())
    {
      WeakReference localWeakReference = (WeakReference)localIterator.next();
      if ((localWeakReference != null) && (localWeakReference.get() != null)) {
        ((e)localWeakReference.get()).a(paramInt, paramString1, paramLong, paramString2, parambhc, paramBoolean, parambf);
      }
    }
    GMTrace.o(8116548665344L, 60473);
  }
  
  public final void a(e parame)
  {
    GMTrace.i(8116414447616L, 60472);
    Iterator localIterator = this.qfc.iterator();
    while (localIterator.hasNext())
    {
      WeakReference localWeakReference = (WeakReference)localIterator.next();
      if ((localWeakReference != null) && (localWeakReference.get() != null) && (((e)localWeakReference.get()).equals(parame)))
      {
        GMTrace.o(8116414447616L, 60472);
        return;
      }
    }
    this.qfc.add(new WeakReference(parame));
    GMTrace.o(8116414447616L, 60472);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/sns/model/as.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */