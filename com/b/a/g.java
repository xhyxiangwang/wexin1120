package com.b.a;

final class g
  extends h
{
  private final String aaK;
  
  g(String paramString)
  {
    if (paramString == null) {
      throw new NullPointerException("string is null");
    }
    this.aaK = paramString;
  }
  
  final void a(i parami)
  {
    parami.writeString(this.aaK);
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
    paramObject = (g)paramObject;
    return this.aaK.equals(((g)paramObject).aaK);
  }
  
  public final boolean hG()
  {
    return true;
  }
  
  public final String hH()
  {
    return this.aaK;
  }
  
  public final int hashCode()
  {
    return this.aaK.hashCode();
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/b/a/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */