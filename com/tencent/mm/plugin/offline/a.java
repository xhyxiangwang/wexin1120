package com.tencent.mm.plugin.offline;

import com.tencent.gmtrace.GMTrace;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

public abstract class a<T>
{
  protected List<WeakReference<T>> omp;
  
  public a()
  {
    GMTrace.i(6188511002624L, 46108);
    this.omp = new ArrayList();
    GMTrace.o(6188511002624L, 46108);
  }
  
  public final void bl(T paramT)
  {
    GMTrace.i(6188645220352L, 46109);
    if (this.omp != null) {
      this.omp = new ArrayList();
    }
    if (paramT != null) {
      this.omp.add(new WeakReference(paramT));
    }
    GMTrace.o(6188645220352L, 46109);
  }
  
  public final void bm(T paramT)
  {
    GMTrace.i(6188779438080L, 46110);
    if ((this.omp == null) || (paramT == null))
    {
      GMTrace.o(6188779438080L, 46110);
      return;
    }
    int i = 0;
    while (i < this.omp.size())
    {
      WeakReference localWeakReference = (WeakReference)this.omp.get(i);
      if (localWeakReference != null)
      {
        Object localObject = localWeakReference.get();
        if ((localObject != null) && (localObject.equals(paramT)))
        {
          localWeakReference.clear();
          this.omp.remove(localWeakReference);
        }
      }
      i += 1;
    }
    GMTrace.o(6188779438080L, 46110);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/offline/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */