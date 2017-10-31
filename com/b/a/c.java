package com.b.a;

final class c
  extends h
{
  private final boolean aaH;
  private final boolean aaI;
  private final boolean aaJ;
  private final String value;
  
  c(String paramString)
  {
    this.value = paramString;
    this.aaH = "null".equals(paramString);
    this.aaI = "true".equals(paramString);
    this.aaJ = "false".equals(paramString);
  }
  
  final void a(i parami)
  {
    parami.B(this.value);
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
    paramObject = (c)paramObject;
    return this.value.equals(((c)paramObject).value);
  }
  
  public final int hashCode()
  {
    return this.value.hashCode();
  }
  
  public final boolean hq()
  {
    return (this.aaI) || (this.aaJ);
  }
  
  public final boolean hr()
  {
    if (this.aaH) {
      return super.hr();
    }
    return this.aaI;
  }
  
  public final String toString()
  {
    return this.value;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/b/a/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */