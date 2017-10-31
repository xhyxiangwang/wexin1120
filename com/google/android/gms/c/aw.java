package com.google.android.gms.c;

public final class aw
{
  int awW;
  int awX;
  private int awY;
  int awZ;
  private int axa;
  private int axb = Integer.MAX_VALUE;
  private int axc;
  private int axd = 64;
  private int axe = 67108864;
  final byte[] buffer;
  
  aw(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    this.buffer = paramArrayOfByte;
    this.awW = 0;
    this.awX = (paramInt2 + 0);
    this.awZ = 0;
  }
  
  private void cn(int paramInt)
  {
    if (paramInt < 0) {
      throw bd.mb();
    }
    if (this.awZ + paramInt > this.axb)
    {
      cn(this.axb - this.awZ);
      throw bd.ma();
    }
    if (paramInt <= this.awX - this.awZ)
    {
      this.awZ += paramInt;
      return;
    }
    throw bd.ma();
  }
  
  private void lS()
  {
    this.awX += this.awY;
    int i = this.awX;
    if (i > this.axb)
    {
      this.awY = (i - this.axb);
      this.awX -= this.awY;
      return;
    }
    this.awY = 0;
  }
  
  private byte lU()
  {
    if (this.awZ == this.awX) {
      throw bd.ma();
    }
    byte[] arrayOfByte = this.buffer;
    int i = this.awZ;
    this.awZ = (i + 1);
    return arrayOfByte[i];
  }
  
  public final void a(be parambe)
  {
    int i = lP();
    if (this.axc >= this.axd) {
      throw bd.mg();
    }
    i = cj(i);
    this.axc += 1;
    parambe.a(this);
    ch(0);
    this.axc -= 1;
    ck(i);
  }
  
  public final void ch(int paramInt)
  {
    if (this.axa != paramInt) {
      throw bd.me();
    }
  }
  
  public final boolean ci(int paramInt)
  {
    switch (bh.cw(paramInt))
    {
    default: 
      throw bd.mf();
    case 0: 
      lP();
      return true;
    case 1: 
      lR();
      return true;
    case 2: 
      cn(lP());
      return true;
    case 3: 
      int i;
      do
      {
        i = lM();
      } while ((i != 0) && (ci(i)));
      ch(bh.am(bh.cx(paramInt), 4));
      return true;
    case 4: 
      return false;
    }
    lQ();
    return true;
  }
  
  public final int cj(int paramInt)
  {
    if (paramInt < 0) {
      throw bd.mb();
    }
    paramInt = this.awZ + paramInt;
    int i = this.axb;
    if (paramInt > i) {
      throw bd.ma();
    }
    this.axb = paramInt;
    lS();
    return i;
  }
  
  public final void ck(int paramInt)
  {
    this.axb = paramInt;
    lS();
  }
  
  public final void cl(int paramInt)
  {
    if (paramInt > this.awZ - this.awW) {
      throw new IllegalArgumentException("Position " + paramInt + " is beyond current " + (this.awZ - this.awW));
    }
    if (paramInt < 0) {
      throw new IllegalArgumentException("Bad position " + paramInt);
    }
    this.awZ = (this.awW + paramInt);
  }
  
  public final byte[] cm(int paramInt)
  {
    if (paramInt < 0) {
      throw bd.mb();
    }
    if (this.awZ + paramInt > this.axb)
    {
      cn(this.axb - this.awZ);
      throw bd.ma();
    }
    if (paramInt <= this.awX - this.awZ)
    {
      byte[] arrayOfByte = new byte[paramInt];
      System.arraycopy(this.buffer, this.awZ, arrayOfByte, 0, paramInt);
      this.awZ += paramInt;
      return arrayOfByte;
    }
    throw bd.ma();
  }
  
  public final int getPosition()
  {
    return this.awZ - this.awW;
  }
  
  public final int lM()
  {
    if (this.awZ == this.awX) {}
    for (int i = 1; i != 0; i = 0)
    {
      this.axa = 0;
      return 0;
    }
    this.axa = lP();
    if (this.axa == 0) {
      throw bd.md();
    }
    return this.axa;
  }
  
  public final long lN()
  {
    int i = 0;
    long l = 0L;
    while (i < 64)
    {
      int j = lU();
      l |= (j & 0x7F) << i;
      if ((j & 0x80) == 0) {
        return l;
      }
      i += 7;
    }
    throw bd.mc();
  }
  
  public final boolean lO()
  {
    return lP() != 0;
  }
  
  public final int lP()
  {
    int i = lU();
    if (i >= 0) {}
    int k;
    do
    {
      return i;
      i &= 0x7F;
      j = lU();
      if (j >= 0) {
        return i | j << 7;
      }
      i |= (j & 0x7F) << 7;
      j = lU();
      if (j >= 0) {
        return i | j << 14;
      }
      i |= (j & 0x7F) << 14;
      k = lU();
      if (k >= 0) {
        return i | k << 21;
      }
      j = lU();
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
      if (lU() >= 0) {
        break;
      }
      j += 1;
    }
    label133:
    throw bd.mc();
  }
  
  public final int lQ()
  {
    return lU() & 0xFF | (lU() & 0xFF) << 8 | (lU() & 0xFF) << 16 | (lU() & 0xFF) << 24;
  }
  
  public final long lR()
  {
    int i = lU();
    int j = lU();
    int k = lU();
    int m = lU();
    int n = lU();
    int i1 = lU();
    int i2 = lU();
    int i3 = lU();
    long l = i;
    return (j & 0xFF) << 8 | l & 0xFF | (k & 0xFF) << 16 | (m & 0xFF) << 24 | (n & 0xFF) << 32 | (i1 & 0xFF) << 40 | (i2 & 0xFF) << 48 | (i3 & 0xFF) << 56;
  }
  
  public final int lT()
  {
    if (this.axb == Integer.MAX_VALUE) {
      return -1;
    }
    int i = this.awZ;
    return this.axb - i;
  }
  
  public final String readString()
  {
    int i = lP();
    if ((i <= this.awX - this.awZ) && (i > 0))
    {
      String str = new String(this.buffer, this.awZ, i, "UTF-8");
      this.awZ = (i + this.awZ);
      return str;
    }
    return new String(cm(i), "UTF-8");
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/google/android/gms/c/aw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */