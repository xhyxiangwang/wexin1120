package com.tencent.mm.plugin.g.a.b.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.g.a.b.h;

public class e
  extends a
{
  static final String TAG;
  public static final String kdp;
  public static final String kdq;
  public static final String kdr;
  public static final String kds;
  public byte kdA;
  public byte[] kdB;
  public byte kdt;
  public byte kdu;
  public byte kdv;
  public byte kdw;
  public byte[] kdx;
  public int kdy;
  public byte kdz;
  
  static
  {
    GMTrace.i(4822308749312L, 35929);
    TAG = e.class.getName();
    kdp = h.kch;
    kdq = h.kci;
    kdr = h.kcj;
    kds = h.kck;
    GMTrace.o(4822308749312L, 35929);
  }
  
  public e()
  {
    GMTrace.i(4822040313856L, 35927);
    this.kcx = null;
    this.kcy = 8;
    this.kbQ = 16L;
    this.kdt = 0;
    this.kdu = 0;
    this.kdv = 0;
    this.kdw = 0;
    this.kdx = new byte[] { 0, 0 };
    this.kdy = -1;
    this.kdz = 0;
    this.kdA = 0;
    this.kdB = null;
    GMTrace.o(4822040313856L, 35927);
  }
  
  public final byte[] agK()
  {
    GMTrace.i(4822174531584L, 35928);
    byte[] arrayOfByte;
    if (this.kcx.equalsIgnoreCase(kdp))
    {
      arrayOfByte = new byte[3];
      System.arraycopy(Byte.valueOf(this.kdt), 0, arrayOfByte, 0, 1);
      System.arraycopy(Byte.valueOf(this.kdu), 0, arrayOfByte, 1, 1);
      System.arraycopy(Byte.valueOf(this.kdv), 0, arrayOfByte, 2, 1);
      GMTrace.o(4822174531584L, 35928);
      return arrayOfByte;
    }
    if (this.kcx.equalsIgnoreCase(kdq))
    {
      arrayOfByte = new byte[1];
      System.arraycopy(Byte.valueOf(this.kdw), 0, arrayOfByte, 0, 1);
      GMTrace.o(4822174531584L, 35928);
      return arrayOfByte;
    }
    if (this.kcx.equalsIgnoreCase(kds))
    {
      arrayOfByte = new byte[this.kdy];
      byte b1 = (byte)(this.kdy & 0xFF);
      byte b2 = (byte)(this.kdy >> 8 & 0xFF);
      System.arraycopy(Byte.valueOf(b1), 0, arrayOfByte, 0, 1);
      System.arraycopy(Byte.valueOf(b2), 0, arrayOfByte, 1, 1);
      System.arraycopy(Byte.valueOf(this.kdz), 0, arrayOfByte, 2, 1);
      if (this.kdy > 3) {
        System.arraycopy(this.kdB, 0, arrayOfByte, 3, this.kdy - 3);
      }
      GMTrace.o(4822174531584L, 35928);
      return arrayOfByte;
    }
    GMTrace.o(4822174531584L, 35928);
    return null;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/g/a/b/a/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */