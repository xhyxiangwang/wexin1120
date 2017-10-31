package com.google.a.a;

public final class a
{
  private int aCO;
  private int aCP;
  private int aCQ;
  private int aCR;
  private int aCS = Integer.MAX_VALUE;
  private int aCT;
  private int aCU = 64;
  private int aCV = 67108864;
  private final byte[] buffer;
  private int bufferSize;
  
  a(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    this.buffer = paramArrayOfByte;
    this.aCO = 0;
    this.bufferSize = (paramInt2 + 0);
    this.aCQ = 0;
  }
  
  private byte[] cG(int paramInt)
  {
    if (paramInt < 0) {
      throw d.ns();
    }
    if (this.aCQ + paramInt > this.aCS)
    {
      cH(this.aCS - this.aCQ);
      throw d.nr();
    }
    if (paramInt <= this.bufferSize - this.aCQ)
    {
      byte[] arrayOfByte = new byte[paramInt];
      System.arraycopy(this.buffer, this.aCQ, arrayOfByte, 0, paramInt);
      this.aCQ += paramInt;
      return arrayOfByte;
    }
    throw d.nr();
  }
  
  private void cH(int paramInt)
  {
    if (paramInt < 0) {
      throw d.ns();
    }
    if (this.aCQ + paramInt > this.aCS)
    {
      cH(this.aCS - this.aCQ);
      throw d.nr();
    }
    if (paramInt <= this.bufferSize - this.aCQ)
    {
      this.aCQ += paramInt;
      return;
    }
    throw d.nr();
  }
  
  private void no()
  {
    this.bufferSize += this.aCP;
    int i = this.bufferSize;
    if (i > this.aCS)
    {
      this.aCP = (i - this.aCS);
      this.bufferSize -= this.aCP;
      return;
    }
    this.aCP = 0;
  }
  
  private byte nq()
  {
    if (this.aCQ == this.bufferSize) {
      throw d.nr();
    }
    byte[] arrayOfByte = this.buffer;
    int i = this.aCQ;
    this.aCQ = (i + 1);
    return arrayOfByte[i];
  }
  
  public final void a(e parame)
  {
    int i = nm();
    if (this.aCT >= this.aCU) {
      throw d.nx();
    }
    i = cD(i);
    this.aCT += 1;
    parame.a(this);
    cB(0);
    this.aCT -= 1;
    cE(i);
  }
  
  public final void cB(int paramInt)
  {
    if (this.aCR != paramInt) {
      throw d.nv();
    }
  }
  
  public final boolean cC(int paramInt)
  {
    switch (g.cN(paramInt))
    {
    default: 
      throw d.nw();
    case 0: 
      nm();
      return true;
    case 1: 
      nq();
      nq();
      nq();
      nq();
      nq();
      nq();
      nq();
      nq();
      return true;
    case 2: 
      cH(nm());
      return true;
    case 3: 
      int i;
      do
      {
        i = nl();
      } while ((i != 0) && (cC(i)));
      cB(g.at(g.cO(paramInt), 4));
      return true;
    case 4: 
      return false;
    }
    nq();
    nq();
    nq();
    nq();
    return true;
  }
  
  public final int cD(int paramInt)
  {
    if (paramInt < 0) {
      throw d.ns();
    }
    paramInt = this.aCQ + paramInt;
    int i = this.aCS;
    if (paramInt > i) {
      throw d.nr();
    }
    this.aCS = paramInt;
    no();
    return i;
  }
  
  public final void cE(int paramInt)
  {
    this.aCS = paramInt;
    no();
  }
  
  public final void cF(int paramInt)
  {
    if (paramInt > this.aCQ - this.aCO) {
      throw new IllegalArgumentException("Position " + paramInt + " is beyond current " + (this.aCQ - this.aCO));
    }
    if (paramInt < 0) {
      throw new IllegalArgumentException("Bad position " + paramInt);
    }
    this.aCQ = (this.aCO + paramInt);
  }
  
  public final int getPosition()
  {
    return this.aCQ - this.aCO;
  }
  
  public final int nl()
  {
    if (this.aCQ == this.bufferSize) {}
    for (int i = 1; i != 0; i = 0)
    {
      this.aCR = 0;
      return 0;
    }
    this.aCR = nm();
    if (this.aCR == 0) {
      throw d.nu();
    }
    return this.aCR;
  }
  
  public final int nm()
  {
    int i = nq();
    if (i >= 0) {}
    int k;
    do
    {
      return i;
      i &= 0x7F;
      j = nq();
      if (j >= 0) {
        return i | j << 7;
      }
      i |= (j & 0x7F) << 7;
      j = nq();
      if (j >= 0) {
        return i | j << 14;
      }
      i |= (j & 0x7F) << 14;
      k = nq();
      if (k >= 0) {
        return i | k << 21;
      }
      j = nq();
      k = i | (k & 0x7F) << 21 | j << 28;
      i = k;
    } while (j >= 0);
    int j = 0;
    for (;;)
    {
      if (j >= 5) {
        break label133;
      }
      i = k;
      if (nq() >= 0) {
        break;
      }
      j += 1;
    }
    label133:
    throw d.nt();
  }
  
  public final long nn()
  {
    int i = 0;
    long l = 0L;
    while (i < 64)
    {
      int j = nq();
      l |= (j & 0x7F) << i;
      if ((j & 0x80) == 0) {
        return l;
      }
      i += 7;
    }
    throw d.nt();
  }
  
  public final int np()
  {
    if (this.aCS == Integer.MAX_VALUE) {
      return -1;
    }
    int i = this.aCQ;
    return this.aCS - i;
  }
  
  public final byte[] readBytes()
  {
    int i = nm();
    if ((i <= this.bufferSize - this.aCQ) && (i > 0))
    {
      byte[] arrayOfByte = new byte[i];
      System.arraycopy(this.buffer, this.aCQ, arrayOfByte, 0, i);
      this.aCQ = (i + this.aCQ);
      return arrayOfByte;
    }
    return cG(i);
  }
  
  public final String readString()
  {
    int i = nm();
    if ((i <= this.bufferSize - this.aCQ) && (i > 0))
    {
      String str = new String(this.buffer, this.aCQ, i, "UTF-8");
      this.aCQ = (i + this.aCQ);
      return str;
    }
    return new String(cG(i), "UTF-8");
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/google/a/a/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */