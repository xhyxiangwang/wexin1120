package org.a.d;

import java.io.Serializable;
import org.a.g.d;

public final class i
  implements Serializable
{
  public final String token;
  public final String uih;
  private final String xVz;
  
  public i(String paramString1, String paramString2)
  {
    this(paramString1, paramString2, null);
  }
  
  public i(String paramString1, String paramString2, String paramString3)
  {
    d.e(paramString1, "Token can't be null");
    d.e(paramString2, "Secret can't be null");
    this.token = paramString1;
    this.uih = paramString2;
    this.xVz = paramString3;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (this == paramObject) {}
    do
    {
      return true;
      if ((paramObject == null) || (getClass() != paramObject.getClass())) {
        return false;
      }
      paramObject = (i)paramObject;
    } while ((this.token.equals(((i)paramObject).token)) && (this.uih.equals(((i)paramObject).uih)));
    return false;
  }
  
  public final int hashCode()
  {
    return this.token.hashCode() * 31 + this.uih.hashCode();
  }
  
  public final String toString()
  {
    return String.format("Token[%s , %s]", new Object[] { this.token, this.uih });
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/org/a/d/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */