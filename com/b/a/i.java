package com.b.a;

import java.io.Writer;

class i
{
  private static final char[] aba = { 92, 34 };
  private static final char[] abb = { 92, 92 };
  private static final char[] abc = { 92, 110 };
  private static final char[] abd = { 92, 114 };
  private static final char[] abe = { 92, 116 };
  private static final char[] abf = { 92, 117, 50, 48, 50, 56 };
  private static final char[] abg = { 92, 117, 50, 48, 50, 57 };
  private static final char[] abh = { 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102 };
  protected final Writer abi;
  
  i(Writer paramWriter)
  {
    this.abi = paramWriter;
  }
  
  private void E(String paramString)
  {
    int m = paramString.length();
    int i = 0;
    int j = 0;
    if (i < m)
    {
      int k = paramString.charAt(i);
      char[] arrayOfChar;
      if (k > 92) {
        if ((k < 8232) || (k > 8233)) {
          arrayOfChar = null;
        }
      }
      for (;;)
      {
        k = j;
        if (arrayOfChar != null)
        {
          this.abi.write(paramString, j, i - j);
          this.abi.write(arrayOfChar);
          k = i + 1;
        }
        i += 1;
        j = k;
        break;
        if (k == 8232)
        {
          arrayOfChar = abf;
        }
        else
        {
          arrayOfChar = abg;
          continue;
          if (k == 92)
          {
            arrayOfChar = abb;
          }
          else if (k > 34)
          {
            arrayOfChar = null;
          }
          else if (k == 34)
          {
            arrayOfChar = aba;
          }
          else if (k > 31)
          {
            arrayOfChar = null;
          }
          else if (k == 10)
          {
            arrayOfChar = abc;
          }
          else if (k == 13)
          {
            arrayOfChar = abd;
          }
          else if (k == 9)
          {
            arrayOfChar = abe;
          }
          else
          {
            arrayOfChar = new char[6];
            arrayOfChar[0] = '\\';
            arrayOfChar[1] = 'u';
            arrayOfChar[2] = '0';
            arrayOfChar[3] = '0';
            arrayOfChar[4] = abh[(k >> 4 & 0xF)];
            arrayOfChar[5] = abh[(k & 0xF)];
          }
        }
      }
    }
    this.abi.write(paramString, j, m - j);
  }
  
  protected final void B(String paramString)
  {
    this.abi.write(paramString);
  }
  
  protected final void C(String paramString)
  {
    this.abi.write(paramString);
  }
  
  protected final void D(String paramString)
  {
    this.abi.write(34);
    E(paramString);
    this.abi.write(34);
  }
  
  protected void hI()
  {
    this.abi.write(91);
  }
  
  protected void hJ()
  {
    this.abi.write(93);
  }
  
  protected void hK()
  {
    this.abi.write(44);
  }
  
  protected void hL()
  {
    this.abi.write(123);
  }
  
  protected void hM()
  {
    this.abi.write(125);
  }
  
  protected void hN()
  {
    this.abi.write(58);
  }
  
  protected void hO()
  {
    this.abi.write(44);
  }
  
  protected final void writeString(String paramString)
  {
    this.abi.write(34);
    E(paramString);
    this.abi.write(34);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/b/a/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */