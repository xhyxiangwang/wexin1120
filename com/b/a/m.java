package com.b.a;

import java.io.Writer;

final class m
  extends Writer
{
  private final char[] aaT;
  private int aaV = 0;
  private final Writer abi;
  
  m(Writer paramWriter)
  {
    this.abi = paramWriter;
    this.aaT = new char[''];
  }
  
  public final void close() {}
  
  public final void flush()
  {
    this.abi.write(this.aaT, 0, this.aaV);
    this.aaV = 0;
  }
  
  public final void write(int paramInt)
  {
    if (this.aaV > this.aaT.length - 1) {
      flush();
    }
    char[] arrayOfChar = this.aaT;
    int i = this.aaV;
    this.aaV = (i + 1);
    arrayOfChar[i] = ((char)paramInt);
  }
  
  public final void write(String paramString, int paramInt1, int paramInt2)
  {
    if (this.aaV > this.aaT.length - paramInt2)
    {
      flush();
      if (paramInt2 > this.aaT.length)
      {
        this.abi.write(paramString, paramInt1, paramInt2);
        return;
      }
    }
    paramString.getChars(paramInt1, paramInt1 + paramInt2, this.aaT, this.aaV);
    this.aaV += paramInt2;
  }
  
  public final void write(char[] paramArrayOfChar, int paramInt1, int paramInt2)
  {
    if (this.aaV > this.aaT.length - paramInt2)
    {
      flush();
      if (paramInt2 > this.aaT.length)
      {
        this.abi.write(paramArrayOfChar, paramInt1, paramInt2);
        return;
      }
    }
    System.arraycopy(paramArrayOfChar, paramInt1, this.aaT, this.aaV, paramInt2);
    this.aaV += paramInt2;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/b/a/m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */