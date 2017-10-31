package com.b.a;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class b
  extends h
  implements Iterable<h>
{
  public final List<h> aaE = new ArrayList();
  
  public final b a(h paramh)
  {
    if (paramh == null) {
      throw new NullPointerException("value is null");
    }
    this.aaE.add(paramh);
    return this;
  }
  
  final void a(i parami)
  {
    parami.hI();
    Iterator localIterator = iterator();
    for (int i = 1; localIterator.hasNext(); i = 0)
    {
      if (i == 0) {
        parami.hK();
      }
      ((h)localIterator.next()).a(parami);
    }
    parami.hJ();
  }
  
  public final b ac(boolean paramBoolean)
  {
    this.aaE.add(a.ab(paramBoolean));
    return this;
  }
  
  public final b bM(int paramInt)
  {
    this.aaE.add(a.bL(paramInt));
    return this;
  }
  
  public final h bN(int paramInt)
  {
    return (h)this.aaE.get(paramInt);
  }
  
  public final b e(double paramDouble)
  {
    this.aaE.add(a.d(paramDouble));
    return this;
  }
  
  public final boolean equals(Object paramObject)
  {
    boolean bool2 = false;
    boolean bool1;
    if (this == paramObject) {
      bool1 = true;
    }
    do
    {
      do
      {
        return bool1;
        bool1 = bool2;
      } while (paramObject == null);
      bool1 = bool2;
    } while (getClass() != paramObject.getClass());
    paramObject = (b)paramObject;
    return this.aaE.equals(((b)paramObject).aaE);
  }
  
  public final b h(long paramLong)
  {
    this.aaE.add(a.g(paramLong));
    return this;
  }
  
  public final int hashCode()
  {
    return this.aaE.hashCode();
  }
  
  public final b hp()
  {
    return this;
  }
  
  public final boolean isArray()
  {
    return true;
  }
  
  public final Iterator<h> iterator()
  {
    new Iterator()
    {
      public final boolean hasNext()
      {
        return this.aaF.hasNext();
      }
      
      public final void remove()
      {
        throw new UnsupportedOperationException();
      }
    };
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/b/a/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */