package com.google.android.gms.common.data;

import java.util.Iterator;

public abstract class a<T>
  implements b<T>
{
  public final DataHolder ajg;
  
  protected a(DataHolder paramDataHolder)
  {
    this.ajg = paramDataHolder;
    if (this.ajg != null) {
      this.ajg.ajs = this;
    }
  }
  
  public int getCount()
  {
    if (this.ajg == null) {
      return 0;
    }
    return this.ajg.ajr;
  }
  
  public Iterator<T> iterator()
  {
    return new e(this);
  }
  
  public final void release()
  {
    if (this.ajg != null) {
      this.ajg.close();
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/google/android/gms/common/data/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */