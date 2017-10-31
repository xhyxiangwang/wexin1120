package com.google.android.gms.c;

import java.util.Map;

public class q<K, V>
{
  static Object[] vC;
  static int vD;
  static Object[] vE;
  static int vF;
  int he = 0;
  int[] vG = n.vl;
  Object[] vH = n.vn;
  
  static void b(int[] paramArrayOfInt, Object[] paramArrayOfObject, int paramInt)
  {
    if (paramArrayOfInt.length == 8) {
      try
      {
        if (vF < 10)
        {
          paramArrayOfObject[0] = vE;
          paramArrayOfObject[1] = paramArrayOfInt;
          paramInt = (paramInt << 1) - 1;
          break label117;
          vE = paramArrayOfObject;
          vF += 1;
        }
        return;
      }
      finally {}
    }
    if (paramArrayOfInt.length == 4) {}
    for (;;)
    {
      try
      {
        if (vD < 10)
        {
          paramArrayOfObject[0] = vC;
          paramArrayOfObject[1] = paramArrayOfInt;
          paramInt = (paramInt << 1) - 1;
          break label134;
          vC = paramArrayOfObject;
          vD += 1;
        }
        return;
      }
      finally {}
      label117:
      while (paramInt >= 2)
      {
        paramArrayOfObject[paramInt] = null;
        paramInt -= 1;
      }
      break;
      return;
      label134:
      while (paramInt >= 2)
      {
        paramArrayOfObject[paramInt] = null;
        paramInt -= 1;
      }
    }
  }
  
  private K keyAt(int paramInt)
  {
    return (K)this.vH[(paramInt << 1)];
  }
  
  private V valueAt(int paramInt)
  {
    return (V)this.vH[((paramInt << 1) + 1)];
  }
  
  final int bG()
  {
    int m = this.he;
    int i;
    if (m == 0) {
      i = -1;
    }
    int j;
    do
    {
      do
      {
        return i;
        j = n.a(this.vG, m, 0);
        i = j;
      } while (j < 0);
      i = j;
    } while (this.vH[(j << 1)] == null);
    int k = j + 1;
    while ((k < m) && (this.vG[k] == 0))
    {
      if (this.vH[(k << 1)] == null) {
        return k;
      }
      k += 1;
    }
    j -= 1;
    for (;;)
    {
      if ((j < 0) || (this.vG[j] != 0)) {
        break label121;
      }
      i = j;
      if (this.vH[(j << 1)] == null) {
        break;
      }
      j -= 1;
    }
    label121:
    return k ^ 0xFFFFFFFF;
  }
  
  final void cc(int paramInt)
  {
    if (paramInt == 8) {}
    for (;;)
    {
      try
      {
        if (vE != null)
        {
          Object[] arrayOfObject1 = vE;
          this.vH = arrayOfObject1;
          vE = (Object[])arrayOfObject1[0];
          this.vG = ((int[])arrayOfObject1[1]);
          arrayOfObject1[1] = null;
          arrayOfObject1[0] = null;
          vF -= 1;
          return;
        }
        this.vG = new int[paramInt];
        this.vH = new Object[paramInt << 1];
        return;
      }
      finally {}
      if (paramInt == 4) {
        try
        {
          if (vC != null)
          {
            Object[] arrayOfObject2 = vC;
            this.vH = arrayOfObject2;
            vC = (Object[])arrayOfObject2[0];
            this.vG = ((int[])arrayOfObject2[1]);
            arrayOfObject2[1] = null;
            arrayOfObject2[0] = null;
            vD -= 1;
            return;
          }
        }
        finally {}
      }
    }
  }
  
  public void clear()
  {
    if (this.he != 0)
    {
      b(this.vG, this.vH, this.he);
      this.vG = n.vl;
      this.vH = n.vn;
      this.he = 0;
    }
  }
  
  public boolean containsKey(Object paramObject)
  {
    if (paramObject == null) {
      if (bG() < 0) {}
    }
    while (indexOf(paramObject, paramObject.hashCode()) >= 0)
    {
      return true;
      return false;
    }
    return false;
  }
  
  public boolean containsValue(Object paramObject)
  {
    return indexOfValue(paramObject) >= 0;
  }
  
  public boolean equals(Object paramObject)
  {
    if (this == paramObject) {}
    for (;;)
    {
      return true;
      if ((paramObject instanceof Map))
      {
        paramObject = (Map)paramObject;
        if (size() != ((Map)paramObject).size()) {
          return false;
        }
        int i = 0;
        try
        {
          while (i < this.he)
          {
            Object localObject1 = keyAt(i);
            Object localObject2 = valueAt(i);
            Object localObject3 = ((Map)paramObject).get(localObject1);
            if (localObject2 == null)
            {
              if (localObject3 != null) {
                break label121;
              }
              if (!((Map)paramObject).containsKey(localObject1)) {
                break label121;
              }
            }
            else
            {
              boolean bool = localObject2.equals(localObject3);
              if (!bool) {
                return false;
              }
            }
            i += 1;
          }
          return false;
        }
        catch (NullPointerException paramObject)
        {
          return false;
        }
        catch (ClassCastException paramObject)
        {
          return false;
        }
      }
    }
    label121:
    return false;
  }
  
  public V get(Object paramObject)
  {
    if (paramObject == null) {}
    for (int i = bG(); i >= 0; i = indexOf(paramObject, paramObject.hashCode())) {
      return (V)this.vH[((i << 1) + 1)];
    }
    return null;
  }
  
  public int hashCode()
  {
    int[] arrayOfInt = this.vG;
    Object[] arrayOfObject = this.vH;
    int n = this.he;
    int i = 1;
    int j = 0;
    int k = 0;
    if (j < n)
    {
      Object localObject = arrayOfObject[i];
      int i1 = arrayOfInt[j];
      if (localObject == null) {}
      for (int m = 0;; m = localObject.hashCode())
      {
        k += (m ^ i1);
        j += 1;
        i += 2;
        break;
      }
    }
    return k;
  }
  
  final int indexOf(Object paramObject, int paramInt)
  {
    int m = this.he;
    int i;
    if (m == 0) {
      i = -1;
    }
    int j;
    do
    {
      do
      {
        return i;
        j = n.a(this.vG, m, paramInt);
        i = j;
      } while (j < 0);
      i = j;
    } while (paramObject.equals(this.vH[(j << 1)]));
    int k = j + 1;
    while ((k < m) && (this.vG[k] == paramInt))
    {
      if (paramObject.equals(this.vH[(k << 1)])) {
        return k;
      }
      k += 1;
    }
    j -= 1;
    for (;;)
    {
      if ((j < 0) || (this.vG[j] != paramInt)) {
        break label156;
      }
      i = j;
      if (paramObject.equals(this.vH[(j << 1)])) {
        break;
      }
      j -= 1;
    }
    label156:
    return k ^ 0xFFFFFFFF;
  }
  
  final int indexOfValue(Object paramObject)
  {
    int i = 1;
    int j = 1;
    int k = this.he * 2;
    Object[] arrayOfObject = this.vH;
    if (paramObject == null)
    {
      i = j;
      while (i < k)
      {
        if (arrayOfObject[i] == null) {
          return i >> 1;
        }
        i += 2;
      }
    }
    do
    {
      i += 2;
      if (i >= k) {
        break;
      }
    } while (!paramObject.equals(arrayOfObject[i]));
    return i >> 1;
    return -1;
  }
  
  public boolean isEmpty()
  {
    return this.he <= 0;
  }
  
  public V put(K paramK, V paramV)
  {
    int k = 8;
    int i;
    int j;
    if (paramK == null)
    {
      i = bG();
      j = 0;
    }
    while (i >= 0)
    {
      i = (i << 1) + 1;
      paramK = this.vH[i];
      this.vH[i] = paramV;
      return paramK;
      j = paramK.hashCode();
      i = indexOf(paramK, j);
    }
    int m = i ^ 0xFFFFFFFF;
    if (this.he >= this.vG.length)
    {
      if (this.he < 8) {
        break label267;
      }
      i = this.he + (this.he >> 1);
    }
    for (;;)
    {
      int[] arrayOfInt = this.vG;
      Object[] arrayOfObject = this.vH;
      cc(i);
      if (this.vG.length > 0)
      {
        System.arraycopy(arrayOfInt, 0, this.vG, 0, arrayOfInt.length);
        System.arraycopy(arrayOfObject, 0, this.vH, 0, arrayOfObject.length);
      }
      b(arrayOfInt, arrayOfObject, this.he);
      if (m < this.he)
      {
        System.arraycopy(this.vG, m, this.vG, m + 1, this.he - m);
        System.arraycopy(this.vH, m << 1, this.vH, m + 1 << 1, this.he - m << 1);
      }
      this.vG[m] = j;
      this.vH[(m << 1)] = paramK;
      this.vH[((m << 1) + 1)] = paramV;
      this.he += 1;
      return null;
      label267:
      i = k;
      if (this.he < 4) {
        i = 4;
      }
    }
  }
  
  public V remove(Object paramObject)
  {
    if (paramObject == null) {}
    for (int i = bG(); i >= 0; i = indexOf(paramObject, paramObject.hashCode())) {
      return (V)removeAt(i);
    }
    return null;
  }
  
  public final V removeAt(int paramInt)
  {
    int i = 8;
    Object localObject = this.vH[((paramInt << 1) + 1)];
    if (this.he <= 1)
    {
      b(this.vG, this.vH, this.he);
      this.vG = n.vl;
      this.vH = n.vn;
      this.he = 0;
    }
    int[] arrayOfInt;
    Object[] arrayOfObject;
    do
    {
      return (V)localObject;
      if ((this.vG.length <= 8) || (this.he >= this.vG.length / 3)) {
        break;
      }
      if (this.he > 8) {
        i = this.he + (this.he >> 1);
      }
      arrayOfInt = this.vG;
      arrayOfObject = this.vH;
      cc(i);
      this.he -= 1;
      if (paramInt > 0)
      {
        System.arraycopy(arrayOfInt, 0, this.vG, 0, paramInt);
        System.arraycopy(arrayOfObject, 0, this.vH, 0, paramInt << 1);
      }
    } while (paramInt >= this.he);
    System.arraycopy(arrayOfInt, paramInt + 1, this.vG, paramInt, this.he - paramInt);
    System.arraycopy(arrayOfObject, paramInt + 1 << 1, this.vH, paramInt << 1, this.he - paramInt << 1);
    return (V)localObject;
    this.he -= 1;
    if (paramInt < this.he)
    {
      System.arraycopy(this.vG, paramInt + 1, this.vG, paramInt, this.he - paramInt);
      System.arraycopy(this.vH, paramInt + 1 << 1, this.vH, paramInt << 1, this.he - paramInt << 1);
    }
    this.vH[(this.he << 1)] = null;
    this.vH[((this.he << 1) + 1)] = null;
    return (V)localObject;
  }
  
  public int size()
  {
    return this.he;
  }
  
  public String toString()
  {
    if (isEmpty()) {
      return "{}";
    }
    StringBuilder localStringBuilder = new StringBuilder(this.he * 28);
    localStringBuilder.append('{');
    int i = 0;
    if (i < this.he)
    {
      if (i > 0) {
        localStringBuilder.append(", ");
      }
      Object localObject = keyAt(i);
      if (localObject != this)
      {
        localStringBuilder.append(localObject);
        label70:
        localStringBuilder.append('=');
        localObject = valueAt(i);
        if (localObject == this) {
          break label111;
        }
        localStringBuilder.append(localObject);
      }
      for (;;)
      {
        i += 1;
        break;
        localStringBuilder.append("(this Map)");
        break label70;
        label111:
        localStringBuilder.append("(this Map)");
      }
    }
    localStringBuilder.append('}');
    return localStringBuilder.toString();
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/google/android/gms/c/q.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */