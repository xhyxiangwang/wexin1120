package org.a.d;

import java.io.OutputStream;

public final class a
{
  public final String scope;
  public final String xVc;
  public final String xVd;
  public final String xVe;
  public final h xVg;
  private final OutputStream xVh;
  
  public a(String paramString1, String paramString2, String paramString3, h paramh, String paramString4, OutputStream paramOutputStream)
  {
    this.xVc = paramString1;
    this.xVd = paramString2;
    this.xVe = paramString3;
    this.xVg = paramh;
    this.scope = paramString4;
    this.xVh = paramOutputStream;
  }
  
  public final void xd(String paramString)
  {
    if (this.xVh != null) {
      paramString = paramString + "\n";
    }
    try
    {
      this.xVh.write(paramString.getBytes("UTF8"));
      return;
    }
    catch (Exception paramString)
    {
      throw new RuntimeException("there were problems while writting to the debug stream", paramString);
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/org/a/d/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */