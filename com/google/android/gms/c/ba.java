package com.google.android.gms.c;

final class ba
  implements Cloneable
{
  static final bb axj = new bb();
  boolean axk = false;
  int[] axl;
  bb[] axm;
  int he;
  
  public ba()
  {
    this(10);
  }
  
  private ba(int paramInt)
  {
    paramInt = P(paramInt);
    this.axl = new int[paramInt];
    this.axm = new bb[paramInt];
    this.he = 0;
  }
  
  static int P(int paramInt)
  {
    int j = paramInt * 4;
    paramInt = 4;
    for (;;)
    {
      int i = j;
      if (paramInt < 32)
      {
        if (j <= (1 << paramInt) - 12) {
          i = (1 << paramInt) - 12;
        }
      }
      else {
        return i / 4;
      }
      paramInt += 1;
    }
  }
  
  public final bb cu(int paramInt)
  {
    if (this.axk) {
      gc();
    }
    return this.axm[paramInt];
  }
  
  final int cv(int paramInt)
  {
    int j = this.he;
    int i = 0;
    j -= 1;
    while (i <= j)
    {
      int k = i + j >>> 1;
      int m = this.axl[k];
      if (m < paramInt)
      {
        i = k + 1;
      }
      else
      {
        j = k;
        if (m <= paramInt) {
          return j;
        }
        j = k - 1;
      }
    }
    j = i ^ 0xFFFFFFFF;
    return j;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (paramObject == this) {}
    label71:
    label93:
    label131:
    label138:
    label141:
    for (;;)
    {
      return true;
      if (!(paramObject instanceof ba)) {
        return false;
      }
      paramObject = (ba)paramObject;
      if (size() != ((ba)paramObject).size()) {
        return false;
      }
      Object localObject = this.axl;
      int[] arrayOfInt = ((ba)paramObject).axl;
      int j = this.he;
      int i = 0;
      if (i < j) {
        if (localObject[i] != arrayOfInt[i])
        {
          i = 0;
          if (i != 0)
          {
            localObject = this.axm;
            paramObject = ((ba)paramObject).axm;
            j = this.he;
            i = 0;
            if (i >= j) {
              break label138;
            }
            if (localObject[i].equals(paramObject[i])) {
              break label131;
            }
          }
        }
      }
      for (i = 0;; i = 1)
      {
        if (i != 0) {
          break label141;
        }
        return false;
        i += 1;
        break;
        i = 1;
        break label71;
        i += 1;
        break label93;
      }
    }
  }
  
  final void gc()
  {
    int m = this.he;
    int[] arrayOfInt = this.axl;
    bb[] arrayOfbb = this.axm;
    int i = 0;
    int k;
    for (int j = 0; i < m; j = k)
    {
      bb localbb = arrayOfbb[i];
      k = j;
      if (localbb != axj)
      {
        if (i != j)
        {
          arrayOfInt[j] = arrayOfInt[i];
          arrayOfbb[j] = localbb;
          arrayOfbb[i] = null;
        }
        k = j + 1;
      }
      i += 1;
    }
    this.axk = false;
    this.he = j;
  }
  
  public final int hashCode()
  {
    if (this.axk) {
      gc();
    }
    int j = 17;
    int i = 0;
    while (i < this.he)
    {
      j = (j * 31 + this.axl[i]) * 31 + this.axm[i].hashCode();
      i += 1;
    }
    return j;
  }
  
  public final boolean isEmpty()
  {
    return size() == 0;
  }
  
  public final ba lY()
  {
    int i = 0;
    int j = size();
    ba localba = new ba(j);
    System.arraycopy(this.axl, 0, localba.axl, 0, j);
    while (i < j)
    {
      if (this.axm[i] != null) {
        localba.axm[i] = this.axm[i].lZ();
      }
      i += 1;
    }
    localba.he = j;
    return localba;
  }
  
  public final int size()
  {
    if (this.axk) {
      gc();
    }
    return this.he;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/google/android/gms/c/ba.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */