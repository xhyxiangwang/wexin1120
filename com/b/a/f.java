package com.b.a;

import java.io.Reader;
import java.io.StringReader;

final class f
{
  private final Reader aaS;
  private final char[] aaT;
  private int aaU;
  private int aaV;
  private int aaW;
  private int aaX;
  private StringBuilder aaY;
  private int aaZ;
  private int index;
  private int line;
  
  private f(Reader paramReader, int paramInt)
  {
    this.aaS = paramReader;
    this.aaT = new char[paramInt];
    this.line = 1;
    this.aaZ = -1;
  }
  
  f(String paramString)
  {
    this(new StringReader(paramString), Math.max(10, Math.min(1024, paramString.length())));
  }
  
  private void a(char paramChar)
  {
    if (!b(paramChar)) {
      throw z("'" + paramChar + "'");
    }
  }
  
  private boolean b(char paramChar)
  {
    if (this.aaX != paramChar) {
      return false;
    }
    hC();
    return true;
  }
  
  private boolean hA()
  {
    if ((this.aaX >= 48) && (this.aaX <= 57)) {}
    for (int i = 1; i == 0; i = 0) {
      return false;
    }
    hC();
    return true;
  }
  
  private void hD()
  {
    if (this.aaY == null) {
      this.aaY = new StringBuilder();
    }
    this.aaZ = (this.index - 1);
  }
  
  private String hE()
  {
    int i;
    String str;
    if (this.aaX == -1)
    {
      i = this.index;
      if (this.aaY.length() <= 0) {
        break label78;
      }
      this.aaY.append(this.aaT, this.aaZ, i - this.aaZ);
      str = this.aaY.toString();
      this.aaY.setLength(0);
    }
    for (;;)
    {
      this.aaZ = -1;
      return str;
      i = this.index - 1;
      break;
      label78:
      str = new String(this.aaT, this.aaZ, i - this.aaZ);
    }
  }
  
  private String hz()
  {
    hC();
    hD();
    while (this.aaX != 34)
    {
      if (this.aaX == 92)
      {
        if (this.aaX == -1) {}
        for (int i = this.index;; i = this.index - 1)
        {
          this.aaY.append(this.aaT, this.aaZ, i - this.aaZ);
          this.aaZ = -1;
          hC();
          switch (this.aaX)
          {
          default: 
            throw z("valid escape sequence");
          }
        }
        this.aaY.append((char)this.aaX);
        for (;;)
        {
          hC();
          hD();
          break;
          this.aaY.append('\b');
          continue;
          this.aaY.append('\f');
          continue;
          this.aaY.append('\n');
          continue;
          this.aaY.append('\r');
          continue;
          this.aaY.append('\t');
          continue;
          localObject = new char[4];
          i = 0;
          while (i < 4)
          {
            hC();
            if (((this.aaX >= 48) && (this.aaX <= 57)) || ((this.aaX >= 97) && (this.aaX <= 102)) || ((this.aaX >= 65) && (this.aaX <= 70))) {}
            for (int j = 1; j == 0; j = 0) {
              throw z("hexadecimal digit");
            }
            localObject[i] = ((char)this.aaX);
            i += 1;
          }
          this.aaY.append((char)Integer.parseInt(new String((char[])localObject), 16));
        }
      }
      if (this.aaX < 32) {
        throw z("valid string character");
      }
      hC();
    }
    Object localObject = hE();
    hC();
    return (String)localObject;
  }
  
  private j z(String paramString)
  {
    if (hF()) {
      return A("Unexpected end of input");
    }
    return A("Expected " + paramString);
  }
  
  final j A(String paramString)
  {
    int j = this.aaU + this.index;
    int k = this.aaW;
    if (hF()) {}
    for (int i = j;; i = j - 1) {
      return new j(paramString, i, this.line, j - k - 1);
    }
  }
  
  final void hB()
  {
    if ((this.aaX == 32) || (this.aaX == 9) || (this.aaX == 10) || (this.aaX == 13)) {}
    for (int i = 1;; i = 0)
    {
      if (i == 0) {
        return;
      }
      hC();
      break;
    }
  }
  
  final void hC()
  {
    if (this.index == this.aaV)
    {
      if (this.aaZ != -1)
      {
        this.aaY.append(this.aaT, this.aaZ, this.aaV - this.aaZ);
        this.aaZ = 0;
      }
      this.aaU += this.aaV;
      this.aaV = this.aaS.read(this.aaT, 0, this.aaT.length);
      this.index = 0;
      if (this.aaV == -1)
      {
        this.aaX = -1;
        return;
      }
    }
    if (this.aaX == 10)
    {
      this.line += 1;
      this.aaW = (this.aaU + this.index);
    }
    char[] arrayOfChar = this.aaT;
    int i = this.index;
    this.index = (i + 1);
    this.aaX = arrayOfChar[i];
  }
  
  final boolean hF()
  {
    return this.aaX == -1;
  }
  
  final h hy()
  {
    Object localObject1;
    switch (this.aaX)
    {
    default: 
      throw z("value");
    case 110: 
      hC();
      a('u');
      a('l');
      a('l');
      localObject1 = a.aaB;
    case 116: 
    case 102: 
    case 34: 
    case 91: 
    case 123: 
      do
      {
        Object localObject2;
        do
        {
          do
          {
            do
            {
              return (h)localObject1;
              hC();
              a('r');
              a('u');
              a('e');
              return a.aaC;
              hC();
              a('a');
              a('l');
              a('s');
              a('e');
              return a.aaD;
              return new g(hz());
              hC();
              localObject2 = new b();
              hB();
              localObject1 = localObject2;
            } while (b(']'));
            do
            {
              hB();
              ((b)localObject2).a(hy());
              hB();
            } while (b(','));
            localObject1 = localObject2;
          } while (b(']'));
          throw z("',' or ']'");
          hC();
          localObject2 = new e();
          hB();
          localObject1 = localObject2;
        } while (b('}'));
        do
        {
          hB();
          if (this.aaX != 34) {
            throw z("name");
          }
          localObject1 = hz();
          hB();
          if (!b(':')) {
            throw z("':'");
          }
          hB();
          ((e)localObject2).a((String)localObject1, hy());
          hB();
        } while (b(','));
        localObject1 = localObject2;
      } while (b('}'));
      throw z("',' or '}'");
    }
    hD();
    b('-');
    int i = this.aaX;
    if (!hA()) {
      throw z("digit");
    }
    while ((i != 48) && (hA())) {}
    if (b('.'))
    {
      if (!hA()) {
        throw z("digit");
      }
      while (hA()) {}
    }
    if ((b('e')) || (b('E')))
    {
      if (!b('+')) {
        b('-');
      }
      if (!hA()) {
        throw z("digit");
      }
      while (hA()) {}
    }
    return new d(hE());
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/b/a/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */