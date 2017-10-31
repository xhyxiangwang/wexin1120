package org.a.a;

import java.io.OutputStream;
import org.a.b.b;
import org.a.d.h;
import org.a.g.d;

public final class a
{
  public String scope;
  public String xVc;
  public String xVd;
  public String xVe = "oob";
  public org.a.a.a.a xVf;
  public h xVg = h.xVw;
  public OutputStream xVh = null;
  
  public static org.a.a.a.a H(Class<? extends org.a.a.a.a> paramClass)
  {
    d.e(paramClass, "Api class cannot be null");
    try
    {
      paramClass = (org.a.a.a.a)paramClass.newInstance();
      return paramClass;
    }
    catch (Exception paramClass)
    {
      throw new b("Error while creating the Api object", paramClass);
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/org/a/a/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */