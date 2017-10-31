package com.tencent.tinker.a.a;

import com.tencent.tinker.a.a.b.a;

public final class m
{
  private int type = -1;
  public int xEA;
  private int xEB;
  protected final a xEz;
  
  public m(a parama, int paramInt)
  {
    this.xEz = parama;
    this.type = paramInt;
  }
  
  public m(k paramk, int paramInt)
  {
    this(new k.1(paramk), paramInt);
  }
  
  private void EF(int paramInt)
  {
    if (cna() != paramInt) {
      throw new IllegalStateException(String.format("Expected %x but was %x", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(cna()) }));
    }
  }
  
  public final int cna()
  {
    if (this.type == -1)
    {
      int i = this.xEz.readByte() & 0xFF;
      this.type = (i & 0x1F);
      this.xEB = ((i & 0xE0) >> 5);
    }
    return this.type;
  }
  
  public final int cnb()
  {
    EF(28);
    this.type = -1;
    return o.b(this.xEz);
  }
  
  public final int cnc()
  {
    EF(29);
    this.type = -1;
    this.xEA = o.b(this.xEz);
    return o.b(this.xEz);
  }
  
  public final int cnd()
  {
    return o.b(this.xEz);
  }
  
  public final int cne()
  {
    EF(23);
    this.type = -1;
    return l.a(this.xEz, this.xEB, false);
  }
  
  public final int cnf()
  {
    EF(24);
    this.type = -1;
    return l.a(this.xEz, this.xEB, false);
  }
  
  public final int cng()
  {
    EF(25);
    this.type = -1;
    return l.a(this.xEz, this.xEB, false);
  }
  
  public final int cnh()
  {
    EF(27);
    this.type = -1;
    return l.a(this.xEz, this.xEB, false);
  }
  
  public final int cni()
  {
    EF(26);
    this.type = -1;
    return l.a(this.xEz, this.xEB, false);
  }
  
  public final void cnj()
  {
    EF(30);
    this.type = -1;
  }
  
  public final boolean readBoolean()
  {
    EF(31);
    this.type = -1;
    return this.xEB != 0;
  }
  
  public final byte readByte()
  {
    EF(0);
    this.type = -1;
    return (byte)l.a(this.xEz, this.xEB);
  }
  
  public final char readChar()
  {
    EF(3);
    this.type = -1;
    return (char)l.a(this.xEz, this.xEB, false);
  }
  
  public final double readDouble()
  {
    EF(17);
    this.type = -1;
    a locala = this.xEz;
    int i = this.xEB;
    long l = 0L;
    while (i >= 0)
    {
      l = l >>> 8 | (locala.readByte() & 0xFF) << 56;
      i -= 1;
    }
    return Double.longBitsToDouble(l);
  }
  
  public final float readFloat()
  {
    EF(16);
    this.type = -1;
    return Float.intBitsToFloat(l.a(this.xEz, this.xEB, true));
  }
  
  public final int readInt()
  {
    EF(4);
    this.type = -1;
    return l.a(this.xEz, this.xEB);
  }
  
  public final long readLong()
  {
    EF(6);
    this.type = -1;
    a locala = this.xEz;
    int j = this.xEB;
    long l = 0L;
    int i = j;
    while (i >= 0)
    {
      l = l >>> 8 | (locala.readByte() & 0xFF) << 56;
      i -= 1;
    }
    return l >> (7 - j) * 8;
  }
  
  public final short readShort()
  {
    EF(2);
    this.type = -1;
    return (short)l.a(this.xEz, this.xEB);
  }
  
  public final void skipValue()
  {
    int j = 0;
    int i = 0;
    switch (cna())
    {
    case 1: 
    case 5: 
    case 7: 
    case 8: 
    case 9: 
    case 10: 
    case 11: 
    case 12: 
    case 13: 
    case 14: 
    case 15: 
    case 18: 
    case 19: 
    case 20: 
    case 21: 
    case 22: 
    default: 
      throw new j("Unexpected type: " + Integer.toHexString(this.type));
    case 0: 
      readByte();
      return;
    case 2: 
      readShort();
      return;
    case 3: 
      readChar();
      return;
    case 4: 
      readInt();
      return;
    case 6: 
      readLong();
      return;
    case 16: 
      readFloat();
      return;
    case 17: 
      readDouble();
      return;
    case 23: 
      cne();
      return;
    case 24: 
      cnf();
      return;
    case 25: 
      cng();
      return;
    case 27: 
      cnh();
      return;
    case 26: 
      cni();
      return;
    case 28: 
      j = cnb();
      while (i < j)
      {
        skipValue();
        i += 1;
      }
    case 29: 
      int k = cnc();
      i = j;
      while (i < k)
      {
        o.b(this.xEz);
        skipValue();
        i += 1;
      }
    case 30: 
      cnj();
      return;
    }
    readBoolean();
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/tinker/a/a/m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */