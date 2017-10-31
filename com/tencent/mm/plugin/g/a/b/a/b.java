package com.tencent.mm.plugin.g.a.b.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.g.a.b.h;
import com.tencent.mm.sdk.platformtools.w;

public class b
  extends a
{
  public static final String TAG;
  public static String kcA;
  public static String kcB;
  public static String kcz;
  private final int kcC;
  private final int kcD;
  private final int kcE;
  private final int kcF;
  private final int kcG;
  b kcH;
  a kcI;
  int kcJ;
  
  static
  {
    GMTrace.i(4821906096128L, 35926);
    TAG = b.class.getName();
    kcz = h.kct;
    kcA = h.kcu;
    kcB = h.kcv;
    GMTrace.o(4821906096128L, 35926);
  }
  
  public b()
  {
    GMTrace.i(4821369225216L, 35922);
    this.kcC = 1;
    this.kcD = 2;
    this.kcE = 4;
    this.kcF = 8;
    this.kcG = 16;
    this.kcx = null;
    this.kcy = 2;
    this.kbQ = 8L;
    this.kcH = null;
    GMTrace.o(4821369225216L, 35922);
  }
  
  static double s(byte[] paramArrayOfByte, int paramInt)
  {
    GMTrace.i(4821503442944L, 35923);
    int i = paramArrayOfByte[(paramInt + 1)] << 8 & 0xFF00;
    int j = (i >> 12) - 16;
    int k = i & 0xF00;
    paramInt = (paramArrayOfByte[paramInt] & 0xFF) + (0xFF00 & k);
    double d1 = paramInt;
    double d2 = Math.pow(10.0D, j);
    w.d(TAG, "hbyte=" + i + " hvalue=" + k + " value=" + paramInt + " exp=" + j);
    GMTrace.o(4821503442944L, 35923);
    return d1 * d2;
  }
  
  public final byte[] agK()
  {
    GMTrace.i(4821637660672L, 35924);
    GMTrace.o(4821637660672L, 35924);
    return null;
  }
  
  private final class a
  {
    public boolean kcK;
    public double kcL;
    public int kcM;
    public int kcN;
    public int kcO;
    public b.c kcP;
    
    public a()
    {
      GMTrace.i(4822577184768L, 35931);
      this.kcK = false;
      this.kcL = 0.0D;
      this.kcM = 0;
      this.kcN = 0;
      this.kcO = 0;
      this.kcP = new b.c();
      GMTrace.o(4822577184768L, 35931);
    }
  }
  
  private final class b
  {
    public boolean kcK;
    public int kcM;
    public int kcN;
    public int kcO;
    public b.c kcP;
    public double kcR;
    public double kcS;
    public double kcT;
    
    public b()
    {
      GMTrace.i(4822442967040L, 35930);
      this.kcK = false;
      this.kcR = 0.0D;
      this.kcS = 0.0D;
      this.kcT = 0.0D;
      this.kcM = 0;
      this.kcN = 0;
      this.kcO = 0;
      this.kcP = new b.c();
      GMTrace.o(4822442967040L, 35930);
    }
  }
  
  public static final class c
  {
    public int kcU;
    public int kcV;
    public int kcW;
    public int kcX;
    public int kcY;
    public int kcZ;
    
    public c()
    {
      GMTrace.i(4823650926592L, 35939);
      this.kcU = 0;
      this.kcV = 0;
      this.kcW = 0;
      this.kcX = 0;
      this.kcY = 0;
      this.kcZ = 0;
      GMTrace.o(4823650926592L, 35939);
    }
    
    public final boolean t(byte[] paramArrayOfByte, int paramInt)
    {
      GMTrace.i(4823785144320L, 35940);
      String str = b.TAG;
      if (paramArrayOfByte == null) {}
      for (int i = 0;; i = paramArrayOfByte.length)
      {
        w.d(str, "data size = %d, offset = %d, lenght = %d", new Object[] { Integer.valueOf(i), Integer.valueOf(paramInt), Integer.valueOf(7) });
        if ((paramArrayOfByte != null) && (paramInt >= 0) && (paramArrayOfByte.length >= paramInt + 7)) {
          break;
        }
        w.e(b.TAG, "data input error");
        GMTrace.o(4823785144320L, 35940);
        return false;
      }
      this.kcU = ((paramArrayOfByte[paramInt] & 0xFF) + ((paramArrayOfByte[(paramInt + 1)] & 0xFF) << 8));
      this.kcV = (paramArrayOfByte[(paramInt + 2)] & 0xFF);
      this.kcW = (paramArrayOfByte[(paramInt + 3)] & 0xFF);
      this.kcX = (paramArrayOfByte[(paramInt + 4)] & 0xFF);
      this.kcY = (paramArrayOfByte[(paramInt + 5)] & 0xFF);
      this.kcZ = (paramArrayOfByte[(paramInt + 6)] & 0xFF);
      w.d(b.TAG, "year = %d, month = %d, day = %d, hours = %d, minutes = %d, seconds = %d", new Object[] { Integer.valueOf(this.kcU), Integer.valueOf(this.kcV), Integer.valueOf(this.kcW), Integer.valueOf(this.kcX), Integer.valueOf(this.kcY), Integer.valueOf(this.kcZ) });
      GMTrace.o(4823785144320L, 35940);
      return true;
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/g/a/b/a/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */