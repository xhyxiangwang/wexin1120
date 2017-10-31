package com.b.a;

import java.io.IOException;
import java.io.Serializable;
import java.io.StringWriter;

public abstract class h
  implements Serializable
{
  @Deprecated
  public static final h aaB = a.aaB;
  @Deprecated
  public static final h aaC = a.aaC;
  @Deprecated
  public static final h aaD = a.aaD;
  
  private String a(l paraml)
  {
    StringWriter localStringWriter = new StringWriter();
    if (paraml == null) {
      try
      {
        throw new NullPointerException("config is null");
      }
      catch (IOException paraml)
      {
        throw new RuntimeException(paraml);
      }
    }
    m localm = new m(localStringWriter);
    a(paraml.a(localm));
    localm.flush();
    return localStringWriter.toString();
  }
  
  abstract void a(i parami);
  
  public boolean equals(Object paramObject)
  {
    return super.equals(paramObject);
  }
  
  public boolean hG()
  {
    return false;
  }
  
  public String hH()
  {
    throw new UnsupportedOperationException("Not a string: " + toString());
  }
  
  public int hashCode()
  {
    return super.hashCode();
  }
  
  public b hp()
  {
    throw new UnsupportedOperationException("Not an array: " + toString());
  }
  
  public boolean hq()
  {
    return false;
  }
  
  public boolean hr()
  {
    throw new UnsupportedOperationException("Not a boolean: " + toString());
  }
  
  public boolean hs()
  {
    return false;
  }
  
  public int ht()
  {
    throw new UnsupportedOperationException("Not a number: " + toString());
  }
  
  public long hu()
  {
    throw new UnsupportedOperationException("Not a number: " + toString());
  }
  
  public double hv()
  {
    throw new UnsupportedOperationException("Not a number: " + toString());
  }
  
  public boolean hw()
  {
    return false;
  }
  
  public e hx()
  {
    throw new UnsupportedOperationException("Not an object: " + toString());
  }
  
  public boolean isArray()
  {
    return false;
  }
  
  public String toString()
  {
    return a(l.abl);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/b/a/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */