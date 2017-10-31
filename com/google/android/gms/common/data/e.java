package com.google.android.gms.common.data;

import com.google.android.gms.common.internal.w;
import java.util.Iterator;
import java.util.NoSuchElementException;

public final class e<T>
  implements Iterator<T>
{
  protected final b<T> ajA;
  protected int ajB;
  
  public e(b<T> paramb)
  {
    this.ajA = ((b)w.aa(paramb));
    this.ajB = -1;
  }
  
  public final boolean hasNext()
  {
    return this.ajB < this.ajA.getCount() - 1;
  }
  
  public final T next()
  {
    if (!hasNext()) {
      throw new NoSuchElementException("Cannot advance the iterator beyond " + this.ajB);
    }
    b localb = this.ajA;
    int i = this.ajB + 1;
    this.ajB = i;
    return (T)localb.get(i);
  }
  
  public final void remove()
  {
    throw new UnsupportedOperationException("Cannot remove elements from a DataBufferIterator");
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/google/android/gms/common/data/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */