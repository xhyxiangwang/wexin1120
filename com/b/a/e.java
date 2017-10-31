package com.b.a;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class e
  extends h
  implements Iterable<b>
{
  public final List<h> aaE = new ArrayList();
  public final List<String> aaL = new ArrayList();
  public transient a aaM = new a();
  
  public final e a(String paramString, h paramh)
  {
    if (paramString == null) {
      throw new NullPointerException("name is null");
    }
    if (paramh == null) {
      throw new NullPointerException("value is null");
    }
    this.aaM.d(paramString, this.aaL.size());
    this.aaL.add(paramString);
    this.aaE.add(paramh);
    return this;
  }
  
  final void a(i parami)
  {
    parami.hL();
    Iterator localIterator1 = this.aaL.iterator();
    Iterator localIterator2 = this.aaE.iterator();
    for (int i = 1; localIterator1.hasNext(); i = 0)
    {
      if (i == 0) {
        parami.hO();
      }
      parami.D((String)localIterator1.next());
      parami.hN();
      ((h)localIterator2.next()).a(parami);
    }
    parami.hM();
  }
  
  public final e b(String paramString, h paramh)
  {
    if (paramString == null) {
      throw new NullPointerException("name is null");
    }
    if (paramh == null) {
      throw new NullPointerException("value is null");
    }
    int i = indexOf(paramString);
    if (i != -1)
    {
      this.aaE.set(i, paramh);
      return this;
    }
    this.aaM.d(paramString, this.aaL.size());
    this.aaL.add(paramString);
    this.aaE.add(paramh);
    return this;
  }
  
  public final e c(String paramString, int paramInt)
  {
    b(paramString, a.bL(paramInt));
    return this;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (this == paramObject) {}
    do
    {
      return true;
      if (paramObject == null) {
        return false;
      }
      if (getClass() != paramObject.getClass()) {
        return false;
      }
      paramObject = (e)paramObject;
    } while ((this.aaL.equals(((e)paramObject).aaL)) && (this.aaE.equals(((e)paramObject).aaE)));
    return false;
  }
  
  public final int hashCode()
  {
    return (this.aaL.hashCode() + 31) * 31 + this.aaE.hashCode();
  }
  
  public final boolean hw()
  {
    return true;
  }
  
  public final e hx()
  {
    return this;
  }
  
  public final int indexOf(String paramString)
  {
    a locala = this.aaM;
    int i = locala.S(paramString);
    i = (locala.aaQ[i] & 0xFF) - 1;
    if ((i != -1) && (paramString.equals(this.aaL.get(i)))) {
      return i;
    }
    return this.aaL.lastIndexOf(paramString);
  }
  
  public final Iterator<b> iterator()
  {
    new Iterator()
    {
      public final boolean hasNext()
      {
        return this.aaN.hasNext();
      }
      
      public final void remove()
      {
        throw new UnsupportedOperationException();
      }
    };
  }
  
  public final h y(String paramString)
  {
    if (paramString == null) {
      throw new NullPointerException("name is null");
    }
    int i = indexOf(paramString);
    if (i != -1) {
      return (h)this.aaE.get(i);
    }
    return null;
  }
  
  public static final class a
  {
    final byte[] aaQ = new byte[32];
    
    final int S(Object paramObject)
    {
      return paramObject.hashCode() & this.aaQ.length - 1;
    }
    
    final void d(String paramString, int paramInt)
    {
      int i = S(paramString);
      if (paramInt < 255)
      {
        this.aaQ[i] = ((byte)(paramInt + 1));
        return;
      }
      this.aaQ[i] = 0;
    }
    
    public final void remove(int paramInt)
    {
      int i = 0;
      if (i < this.aaQ.length)
      {
        if (this.aaQ[i] == paramInt + 1) {
          this.aaQ[i] = 0;
        }
        for (;;)
        {
          i += 1;
          break;
          if (this.aaQ[i] > paramInt + 1)
          {
            byte[] arrayOfByte = this.aaQ;
            arrayOfByte[i] = ((byte)(arrayOfByte[i] - 1));
          }
        }
      }
    }
  }
  
  public static final class b
  {
    public final h aaR;
    public final String name;
    
    b(String paramString, h paramh)
    {
      this.name = paramString;
      this.aaR = paramh;
    }
    
    public final boolean equals(Object paramObject)
    {
      if (this == paramObject) {}
      do
      {
        return true;
        if (paramObject == null) {
          return false;
        }
        if (getClass() != paramObject.getClass()) {
          return false;
        }
        paramObject = (b)paramObject;
      } while ((this.name.equals(((b)paramObject).name)) && (this.aaR.equals(((b)paramObject).aaR)));
      return false;
    }
    
    public final int hashCode()
    {
      return (this.name.hashCode() + 31) * 31 + this.aaR.hashCode();
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/b/a/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */