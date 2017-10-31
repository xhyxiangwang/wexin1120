package com.b.a;

final class d
  extends h
{
  private final String aaK;
  
  d(String paramString)
  {
    if (paramString == null) {
      throw new NullPointerException("string is null");
    }
    this.aaK = paramString;
  }
  
  final void a(i parami)
  {
    parami.C(this.aaK);
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
    paramObject = (d)paramObject;
    return this.aaK.equals(((d)paramObject).aaK);
  }
  
  public final int hashCode()
  {
    return this.aaK.hashCode();
  }
  
  public final boolean hs()
  {
    return true;
  }
  
  public final int ht()
  {
    return Integer.parseInt(this.aaK, 10);
  }
  
  public final long hu()
  {
    return Long.parseLong(this.aaK, 10);
  }
  
  public final double hv()
  {
    return Double.parseDouble(this.aaK);
  }
  
  public final String toString()
  {
    return this.aaK;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/b/a/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */