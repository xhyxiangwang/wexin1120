package org.a.d;

public final class d
  implements Comparable<d>
{
  final String amo;
  final String value;
  
  public d(String paramString1, String paramString2)
  {
    this.amo = paramString1;
    this.value = paramString2;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (paramObject == null) {}
    do
    {
      do
      {
        return false;
        if (paramObject == this) {
          return true;
        }
      } while (!(paramObject instanceof d));
      paramObject = (d)paramObject;
    } while ((!((d)paramObject).amo.equals(this.amo)) || (!((d)paramObject).value.equals(this.value)));
    return true;
  }
  
  public final int hashCode()
  {
    return this.amo.hashCode() + this.value.hashCode();
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/org/a/d/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */