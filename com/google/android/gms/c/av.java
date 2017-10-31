package com.google.android.gms.c;

import java.util.Arrays;

public final class av
  extends ay<av>
{
  public a[] awD = a.lK();
  
  public av()
  {
    this.axg = null;
    this.axr = -1;
  }
  
  public final void a(ax paramax)
  {
    if ((this.awD != null) && (this.awD.length > 0))
    {
      int i = 0;
      while (i < this.awD.length)
      {
        a locala = this.awD[i];
        if (locala != null) {
          paramax.a(1, locala);
        }
        i += 1;
      }
    }
    super.a(paramax);
  }
  
  public final boolean equals(Object paramObject)
  {
    boolean bool2 = false;
    boolean bool1;
    if (paramObject == this) {
      bool1 = true;
    }
    do
    {
      do
      {
        return bool1;
        bool1 = bool2;
      } while (!(paramObject instanceof av));
      paramObject = (av)paramObject;
      bool1 = bool2;
    } while (!bc.equals(this.awD, ((av)paramObject).awD));
    return a((ay)paramObject);
  }
  
  public final int hashCode()
  {
    return (bc.hashCode(this.awD) + 527) * 31 + lV();
  }
  
  protected final int ll()
  {
    int i = super.ll();
    int k = i;
    if (this.awD != null)
    {
      k = i;
      if (this.awD.length > 0)
      {
        int j = 0;
        for (;;)
        {
          k = i;
          if (j >= this.awD.length) {
            break;
          }
          a locala = this.awD[j];
          k = i;
          if (locala != null) {
            k = i + ax.b(1, locala);
          }
          j += 1;
          i = k;
        }
      }
    }
    return k;
  }
  
  public static final class a
    extends ay<a>
  {
    private static volatile a[] awE;
    public a awF = null;
    public String name = "";
    
    public a()
    {
      this.axg = null;
      this.axr = -1;
    }
    
    public static a[] lK()
    {
      if (awE == null) {}
      synchronized (bc.axq)
      {
        if (awE == null) {
          awE = new a[0];
        }
        return awE;
      }
    }
    
    public final void a(ax paramax)
    {
      paramax.c(1, this.name);
      if (this.awF != null) {
        paramax.a(2, this.awF);
      }
      super.a(paramax);
    }
    
    public final boolean equals(Object paramObject)
    {
      boolean bool2 = false;
      boolean bool1;
      if (paramObject == this) {
        bool1 = true;
      }
      do
      {
        do
        {
          do
          {
            return bool1;
            bool1 = bool2;
          } while (!(paramObject instanceof a));
          paramObject = (a)paramObject;
          if (this.name != null) {
            break;
          }
          bool1 = bool2;
        } while (((a)paramObject).name != null);
        if (this.awF != null) {
          break label79;
        }
        bool1 = bool2;
      } while (((a)paramObject).awF != null);
      label79:
      while (this.awF.equals(((a)paramObject).awF))
      {
        return a((ay)paramObject);
        if (this.name.equals(((a)paramObject).name)) {
          break;
        }
        return false;
      }
      return false;
    }
    
    public final int hashCode()
    {
      int j = 0;
      int i;
      if (this.name == null)
      {
        i = 0;
        if (this.awF != null) {
          break label48;
        }
      }
      for (;;)
      {
        return ((i + 527) * 31 + j) * 31 + lV();
        i = this.name.hashCode();
        break;
        label48:
        j = this.awF.hashCode();
      }
    }
    
    protected final int ll()
    {
      int j = super.ll() + ax.d(1, this.name);
      int i = j;
      if (this.awF != null) {
        i = j + ax.b(2, this.awF);
      }
      return i;
    }
    
    public static final class a
      extends ay<a>
    {
      private static volatile a[] awG;
      public a awH = null;
      public int type = 1;
      
      public a()
      {
        this.axg = null;
        this.axr = -1;
      }
      
      public static a[] lL()
      {
        if (awG == null) {}
        synchronized (bc.axq)
        {
          if (awG == null) {
            awG = new a[0];
          }
          return awG;
        }
      }
      
      public final void a(ax paramax)
      {
        paramax.aj(1, this.type);
        if (this.awH != null) {
          paramax.a(2, this.awH);
        }
        super.a(paramax);
      }
      
      public final boolean equals(Object paramObject)
      {
        boolean bool2 = false;
        boolean bool1;
        if (paramObject == this) {
          bool1 = true;
        }
        do
        {
          do
          {
            do
            {
              return bool1;
              bool1 = bool2;
            } while (!(paramObject instanceof a));
            paramObject = (a)paramObject;
            bool1 = bool2;
          } while (this.type != ((a)paramObject).type);
          if (this.awH != null) {
            break;
          }
          bool1 = bool2;
        } while (((a)paramObject).awH != null);
        while (this.awH.equals(((a)paramObject).awH)) {
          return a((ay)paramObject);
        }
        return false;
      }
      
      public final int hashCode()
      {
        int j = this.type;
        if (this.awH == null) {}
        for (int i = 0;; i = this.awH.hashCode()) {
          return (i + (j + 527) * 31) * 31 + lV();
        }
      }
      
      protected final int ll()
      {
        int j = super.ll() + ax.ak(1, this.type);
        int i = j;
        if (this.awH != null) {
          i = j + ax.b(2, this.awH);
        }
        return i;
      }
      
      public static final class a
        extends ay<a>
      {
        public byte[] awI = bh.axA;
        public String awJ = "";
        public double awK = 0.0D;
        public float awL = 0.0F;
        public long awM = 0L;
        public int awN = 0;
        public int awO = 0;
        public boolean awP = false;
        public av.a[] awQ = av.a.lK();
        public av.a.a[] awR = av.a.a.lL();
        public String[] awS = bh.axy;
        public long[] awT = bh.axu;
        public float[] awU = bh.axv;
        public long awV = 0L;
        
        public a()
        {
          this.axg = null;
          this.axr = -1;
        }
        
        public final void a(ax paramax)
        {
          int j = 0;
          Object localObject;
          if (!Arrays.equals(this.awI, bh.axA))
          {
            localObject = this.awI;
            paramax.al(1, 2);
            paramax.cr(localObject.length);
            paramax.g((byte[])localObject);
          }
          if (!this.awJ.equals("")) {
            paramax.c(2, this.awJ);
          }
          if (Double.doubleToLongBits(this.awK) != Double.doubleToLongBits(0.0D))
          {
            double d = this.awK;
            paramax.al(3, 1);
            long l = Double.doubleToLongBits(d);
            paramax.cp((int)l & 0xFF);
            paramax.cp((int)(l >> 8) & 0xFF);
            paramax.cp((int)(l >> 16) & 0xFF);
            paramax.cp((int)(l >> 24) & 0xFF);
            paramax.cp((int)(l >> 32) & 0xFF);
            paramax.cp((int)(l >> 40) & 0xFF);
            paramax.cp((int)(l >> 48) & 0xFF);
            paramax.cp((int)(l >> 56) & 0xFF);
          }
          if (Float.floatToIntBits(this.awL) != Float.floatToIntBits(0.0F)) {
            paramax.c(4, this.awL);
          }
          if (this.awM != 0L) {
            paramax.d(5, this.awM);
          }
          if (this.awN != 0) {
            paramax.aj(6, this.awN);
          }
          int i;
          if (this.awO != 0)
          {
            i = this.awO;
            paramax.al(7, 0);
            paramax.cr(ax.ct(i));
          }
          if (this.awP) {
            paramax.i(8, this.awP);
          }
          if ((this.awQ != null) && (this.awQ.length > 0))
          {
            i = 0;
            while (i < this.awQ.length)
            {
              localObject = this.awQ[i];
              if (localObject != null) {
                paramax.a(9, (be)localObject);
              }
              i += 1;
            }
          }
          if ((this.awR != null) && (this.awR.length > 0))
          {
            i = 0;
            while (i < this.awR.length)
            {
              localObject = this.awR[i];
              if (localObject != null) {
                paramax.a(10, (be)localObject);
              }
              i += 1;
            }
          }
          if ((this.awS != null) && (this.awS.length > 0))
          {
            i = 0;
            while (i < this.awS.length)
            {
              localObject = this.awS[i];
              if (localObject != null) {
                paramax.c(11, (String)localObject);
              }
              i += 1;
            }
          }
          if ((this.awT != null) && (this.awT.length > 0))
          {
            i = 0;
            while (i < this.awT.length)
            {
              paramax.d(12, this.awT[i]);
              i += 1;
            }
          }
          if (this.awV != 0L) {
            paramax.d(13, this.awV);
          }
          if ((this.awU != null) && (this.awU.length > 0))
          {
            i = j;
            while (i < this.awU.length)
            {
              paramax.c(14, this.awU[i]);
              i += 1;
            }
          }
          super.a(paramax);
        }
        
        public final boolean equals(Object paramObject)
        {
          boolean bool2 = false;
          boolean bool1;
          if (paramObject == this) {
            bool1 = true;
          }
          do
          {
            do
            {
              do
              {
                return bool1;
                bool1 = bool2;
              } while (!(paramObject instanceof a));
              paramObject = (a)paramObject;
              bool1 = bool2;
            } while (!Arrays.equals(this.awI, ((a)paramObject).awI));
            if (this.awJ != null) {
              break;
            }
            bool1 = bool2;
          } while (((a)paramObject).awJ != null);
          while (this.awJ.equals(((a)paramObject).awJ))
          {
            bool1 = bool2;
            if (Double.doubleToLongBits(this.awK) != Double.doubleToLongBits(((a)paramObject).awK)) {
              break;
            }
            bool1 = bool2;
            if (Float.floatToIntBits(this.awL) != Float.floatToIntBits(((a)paramObject).awL)) {
              break;
            }
            bool1 = bool2;
            if (this.awM != ((a)paramObject).awM) {
              break;
            }
            bool1 = bool2;
            if (this.awN != ((a)paramObject).awN) {
              break;
            }
            bool1 = bool2;
            if (this.awO != ((a)paramObject).awO) {
              break;
            }
            bool1 = bool2;
            if (this.awP != ((a)paramObject).awP) {
              break;
            }
            bool1 = bool2;
            if (!bc.equals(this.awQ, ((a)paramObject).awQ)) {
              break;
            }
            bool1 = bool2;
            if (!bc.equals(this.awR, ((a)paramObject).awR)) {
              break;
            }
            bool1 = bool2;
            if (!bc.equals(this.awS, ((a)paramObject).awS)) {
              break;
            }
            bool1 = bool2;
            if (!bc.equals(this.awT, ((a)paramObject).awT)) {
              break;
            }
            bool1 = bool2;
            if (!bc.equals(this.awU, ((a)paramObject).awU)) {
              break;
            }
            bool1 = bool2;
            if (this.awV != ((a)paramObject).awV) {
              break;
            }
            return a((ay)paramObject);
          }
          return false;
        }
        
        public final int hashCode()
        {
          int k = Arrays.hashCode(this.awI);
          int i;
          int m;
          int n;
          int i1;
          int i2;
          int i3;
          if (this.awJ == null)
          {
            i = 0;
            long l = Double.doubleToLongBits(this.awK);
            m = (int)(l ^ l >>> 32);
            n = Float.floatToIntBits(this.awL);
            i1 = (int)(this.awM ^ this.awM >>> 32);
            i2 = this.awN;
            i3 = this.awO;
            if (!this.awP) {
              break label221;
            }
          }
          label221:
          for (int j = 1231;; j = 1237)
          {
            return (((((((j + ((((((i + (k + 527) * 31) * 31 + m) * 31 + n) * 31 + i1) * 31 + i2) * 31 + i3) * 31) * 31 + bc.hashCode(this.awQ)) * 31 + bc.hashCode(this.awR)) * 31 + bc.hashCode(this.awS)) * 31 + bc.hashCode(this.awT)) * 31 + bc.hashCode(this.awU)) * 31 + (int)(this.awV ^ this.awV >>> 32)) * 31 + lV();
            i = this.awJ.hashCode();
            break;
          }
        }
        
        protected final int ll()
        {
          int i2 = 0;
          int j = super.ll();
          int i = j;
          Object localObject;
          if (!Arrays.equals(this.awI, bh.axA))
          {
            localObject = this.awI;
            i = ax.cq(1);
            k = ax.cs(localObject.length);
            i = j + (localObject.length + k + i);
          }
          j = i;
          if (!this.awJ.equals("")) {
            j = i + ax.d(2, this.awJ);
          }
          i = j;
          if (Double.doubleToLongBits(this.awK) != Double.doubleToLongBits(0.0D)) {
            i = j + (ax.cq(3) + 8);
          }
          j = i;
          if (Float.floatToIntBits(this.awL) != Float.floatToIntBits(0.0F)) {
            j = i + (ax.cq(4) + 4);
          }
          int k = j;
          if (this.awM != 0L) {
            k = j + ax.e(5, this.awM);
          }
          i = k;
          if (this.awN != 0) {
            i = k + ax.ak(6, this.awN);
          }
          j = i;
          if (this.awO != 0)
          {
            j = this.awO;
            k = ax.cq(7);
            j = i + (ax.cs(ax.ct(j)) + k);
          }
          i = j;
          if (this.awP) {
            i = j + (ax.cq(8) + 1);
          }
          j = i;
          if (this.awQ != null)
          {
            j = i;
            if (this.awQ.length > 0)
            {
              j = 0;
              while (j < this.awQ.length)
              {
                localObject = this.awQ[j];
                k = i;
                if (localObject != null) {
                  k = i + ax.b(9, (be)localObject);
                }
                j += 1;
                i = k;
              }
              j = i;
            }
          }
          i = j;
          if (this.awR != null)
          {
            i = j;
            if (this.awR.length > 0)
            {
              i = j;
              j = 0;
              while (j < this.awR.length)
              {
                localObject = this.awR[j];
                k = i;
                if (localObject != null) {
                  k = i + ax.b(10, (be)localObject);
                }
                j += 1;
                i = k;
              }
            }
          }
          j = i;
          if (this.awS != null)
          {
            j = i;
            if (this.awS.length > 0)
            {
              j = 0;
              k = 0;
              int n;
              for (int m = 0; j < this.awS.length; m = n)
              {
                localObject = this.awS[j];
                int i1 = k;
                n = m;
                if (localObject != null)
                {
                  n = m + 1;
                  i1 = k + ax.au((String)localObject);
                }
                j += 1;
                k = i1;
              }
              j = i + k + m * 1;
            }
          }
          i = j;
          if (this.awT != null)
          {
            i = j;
            if (this.awT.length > 0)
            {
              k = 0;
              i = i2;
              while (i < this.awT.length)
              {
                k += ax.n(this.awT[i]);
                i += 1;
              }
              i = j + k + this.awT.length * 1;
            }
          }
          j = i;
          if (this.awV != 0L) {
            j = i + ax.e(13, this.awV);
          }
          i = j;
          if (this.awU != null)
          {
            i = j;
            if (this.awU.length > 0) {
              i = j + this.awU.length * 4 + this.awU.length * 1;
            }
          }
          return i;
        }
      }
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/google/android/gms/c/av.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */