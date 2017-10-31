package com.b.a;

import java.io.Writer;

public final class k
  extends l
{
  private final char[] abj;
  
  k(char[] paramArrayOfChar)
  {
    this.abj = paramArrayOfChar;
  }
  
  protected final i a(Writer paramWriter)
  {
    return new a(paramWriter, this.abj);
  }
  
  private static final class a
    extends i
  {
    private final char[] abj;
    private int abk;
    
    public a(Writer paramWriter, char[] paramArrayOfChar)
    {
      super();
      this.abj = paramArrayOfChar;
    }
    
    private boolean hP()
    {
      int i = 0;
      if (this.abj == null) {
        return false;
      }
      this.abi.write(10);
      while (i < this.abk)
      {
        this.abi.write(this.abj);
        i += 1;
      }
      return true;
    }
    
    protected final void hI()
    {
      this.abk += 1;
      this.abi.write(91);
      hP();
    }
    
    protected final void hJ()
    {
      this.abk -= 1;
      hP();
      this.abi.write(93);
    }
    
    protected final void hK()
    {
      this.abi.write(44);
      if (!hP()) {
        this.abi.write(32);
      }
    }
    
    protected final void hL()
    {
      this.abk += 1;
      this.abi.write(123);
      hP();
    }
    
    protected final void hM()
    {
      this.abk -= 1;
      hP();
      this.abi.write(125);
    }
    
    protected final void hN()
    {
      this.abi.write(58);
      this.abi.write(32);
    }
    
    protected final void hO()
    {
      this.abi.write(44);
      if (!hP()) {
        this.abi.write(32);
      }
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/b/a/k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */