package com.tencent.tinker.a.a;

import com.tencent.tinker.a.a.a.a;
import java.nio.ByteBuffer;
import java.util.Arrays;

public final class t
{
  public int fileSize;
  public final a xEI = new a(0, true);
  public final a xEJ = new a(1, true);
  public final a xEK = new a(2, true);
  public final a xEL = new a(3, true);
  public final a xEM = new a(4, true);
  public final a xEN = new a(5, true);
  public final a xEO = new a(6, true);
  public final a xEP = new a(4096, true);
  public final a xEQ = new a(4097, true);
  public final a xER = new a(4098, true);
  public final a xES = new a(4099, true);
  public final a xET = new a(8192, false);
  public final a xEU = new a(8193, true);
  public final a xEV = new a(8194, false);
  public final a xEW = new a(8195, false);
  public final a xEX = new a(8196, false);
  public final a xEY = new a(8197, false);
  public final a xEZ = new a(8198, true);
  public byte[] xEw = new byte[20];
  public final a[] xFa = { this.xEI, this.xEJ, this.xEK, this.xEL, this.xEM, this.xEN, this.xEO, this.xEP, this.xEQ, this.xER, this.xES, this.xET, this.xEU, this.xEV, this.xEW, this.xEX, this.xEY, this.xEZ };
  public int xFb;
  public int xFc;
  public int xFd;
  public int xFe;
  public int xFf;
  
  final void a(i.e parame)
  {
    int k = parame.xEu.getInt();
    int i = 0;
    a locala;
    for (Object localObject = null; i < k; localObject = locala)
    {
      int m = parame.xEu.getShort();
      parame.xEu.getShort();
      a[] arrayOfa = this.xFa;
      int n = arrayOfa.length;
      int j = 0;
      while (j < n)
      {
        locala = arrayOfa[j];
        if (locala.xFg == m)
        {
          j = parame.xEu.getInt();
          n = parame.xEu.getInt();
          if (((locala.size == 0) || (locala.size == j)) && ((locala.dpq == -1) || (locala.dpq == n))) {
            break label185;
          }
          throw new j("Unexpected map value for 0x" + Integer.toHexString(m));
        }
        j += 1;
      }
      throw new IllegalArgumentException("No such map item: " + m);
      label185:
      locala.size = j;
      locala.dpq = n;
      if ((localObject != null) && (((a)localObject).dpq > locala.dpq)) {
        throw new j("Map is unsorted at " + localObject + ", " + locala);
      }
      i += 1;
    }
    this.xEI.dpq = 0;
    Arrays.sort(this.xFa);
    i = 1;
    while (i < this.xFa.length)
    {
      if (this.xFa[i].dpq == -1) {
        this.xFa[i].dpq = this.xFa[(i - 1)].dpq;
      }
      i += 1;
    }
  }
  
  public final void b(i.e parame)
  {
    a[] arrayOfa = this.xFa;
    int m = arrayOfa.length;
    int i = 0;
    int k;
    for (int j = 0; i < m; j = k)
    {
      k = j;
      if (arrayOfa[i].exists()) {
        k = j + 1;
      }
      i += 1;
    }
    parame.writeInt(j);
    arrayOfa = this.xFa;
    j = arrayOfa.length;
    i = 0;
    while (i < j)
    {
      a locala = arrayOfa[i];
      if (locala.exists())
      {
        parame.writeShort(locala.xFg);
        parame.writeShort((short)0);
        parame.writeInt(locala.size);
        parame.writeInt(locala.dpq);
      }
      i += 1;
    }
  }
  
  public final void cnk()
  {
    int j = this.fileSize;
    int i = this.xFa.length;
    i -= 1;
    while (i >= 0)
    {
      a locala = this.xFa[i];
      int k = j;
      if (locala.dpq != -1)
      {
        if (locala.dpq > j) {
          throw new j("Map is unsorted at " + locala);
        }
        locala.xFi = (j - locala.dpq);
        k = locala.dpq;
      }
      i -= 1;
      j = k;
    }
    this.xFf = (this.xEI.xFi + this.xEJ.xFi + this.xEK.xFi + this.xEL.xFi + this.xEM.xFi + this.xEN.xFi + this.xEO.xFi);
    this.xFe = (this.fileSize - this.xFf);
  }
  
  public static final class a
    implements Comparable<a>
  {
    public int dpq = -1;
    public int size = 0;
    public final short xFg;
    public boolean xFh;
    public int xFi = 0;
    
    public a(int paramInt, boolean paramBoolean)
    {
      this.xFg = ((short)paramInt);
      this.xFh = paramBoolean;
      if (paramInt == 0)
      {
        this.dpq = 0;
        this.size = 1;
        this.xFi = 112;
      }
      while (paramInt != 4096) {
        return;
      }
      this.size = 1;
    }
    
    private static int EG(int paramInt)
    {
      switch (paramInt)
      {
      default: 
        throw new IllegalArgumentException("unknown section type: " + paramInt);
      case 0: 
        return 0;
      case 1: 
        return 1;
      case 2: 
        return 2;
      case 3: 
        return 3;
      case 4: 
        return 4;
      case 5: 
        return 5;
      case 6: 
        return 6;
      case 8194: 
        return 7;
      case 4097: 
        return 8;
      case 8196: 
        return 9;
      case 4099: 
        return 10;
      case 4098: 
        return 11;
      case 8198: 
        return 12;
      case 8195: 
        return 13;
      case 8193: 
        return 14;
      case 8192: 
        return 15;
      case 8197: 
        return 16;
      }
      return 17;
    }
    
    public final boolean exists()
    {
      return this.size > 0;
    }
    
    public final String toString()
    {
      return String.format("Section[type=%#x,off=%#x,size=%#x]", new Object[] { Short.valueOf(this.xFg), Integer.valueOf(this.dpq), Integer.valueOf(this.size) });
    }
    
    public static abstract class a<T>
      implements Comparable<T>
    {
      public int dpq;
      
      public a(int paramInt)
      {
        this.dpq = paramInt;
      }
      
      public boolean equals(Object paramObject)
      {
        return compareTo(paramObject) == 0;
      }
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/tinker/a/a/t.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */