package com.tencent.mm.plugin.appbrand.o;

import com.tencent.gmtrace.GMTrace;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public final class j
{
  private static final Comparator<e> jwA;
  
  static
  {
    GMTrace.i(10003247267840L, 74530);
    jwA = new Comparator() {};
    GMTrace.o(10003247267840L, 74530);
  }
  
  public static b a(a parama, boolean paramBoolean)
  {
    GMTrace.i(16369865195520L, 121965);
    int i = parama.aab();
    int j = parama.aac();
    ArrayList localArrayList1 = new ArrayList();
    ArrayList localArrayList2 = new ArrayList();
    localArrayList2.add(new d(i, j));
    i = i + j + Math.abs(i - j);
    int[] arrayOfInt1 = new int[i * 2];
    int[] arrayOfInt2 = new int[i * 2];
    ArrayList localArrayList3 = new ArrayList();
    while (!localArrayList2.isEmpty())
    {
      d locald2 = (d)localArrayList2.remove(localArrayList2.size() - 1);
      e locale = a(parama, locald2.jwL, locald2.jwM, locald2.jwN, locald2.jwO, arrayOfInt1, arrayOfInt2, i);
      if (locale != null)
      {
        if (locale.size > 0) {
          localArrayList1.add(locale);
        }
        locale.x += locald2.jwL;
        locale.y += locald2.jwN;
        d locald1;
        if (localArrayList3.isEmpty())
        {
          locald1 = new d();
          label223:
          locald1.jwL = locald2.jwL;
          locald1.jwN = locald2.jwN;
          if (!locale.jwP) {
            break label368;
          }
          locald1.jwM = locale.x;
          locald1.jwO = locale.y;
          label271:
          localArrayList2.add(locald1);
          if (!locale.jwP) {
            break label463;
          }
          if (!locale.jwK) {
            break label426;
          }
          locald2.jwL = (locale.x + locale.size + 1);
          locald2.jwN = (locale.y + locale.size);
        }
        for (;;)
        {
          localArrayList2.add(locald2);
          break;
          locald1 = (d)localArrayList3.remove(localArrayList3.size() - 1);
          break label223;
          label368:
          if (locale.jwK)
          {
            locald1.jwM = (locale.x - 1);
            locald1.jwO = locale.y;
            break label271;
          }
          locald1.jwM = locale.x;
          locald1.jwO = (locale.y - 1);
          break label271;
          label426:
          locald2.jwL = (locale.x + locale.size);
          locald2.jwN = (locale.y + locale.size + 1);
          continue;
          label463:
          locald2.jwL = (locale.x + locale.size);
          locald2.jwN = (locale.y + locale.size);
        }
      }
      localArrayList3.add(locald2);
    }
    Collections.sort(localArrayList1, jwA);
    parama = new b(parama, localArrayList1, arrayOfInt1, arrayOfInt2, paramBoolean);
    GMTrace.o(16369865195520L, 121965);
    return parama;
  }
  
  private static e a(a parama, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int[] paramArrayOfInt1, int[] paramArrayOfInt2, int paramInt5)
  {
    GMTrace.i(10003113050112L, 74529);
    int m = paramInt2 - paramInt1;
    int n = paramInt4 - paramInt3;
    if ((paramInt2 - paramInt1 <= 0) || (paramInt4 - paramInt3 <= 0))
    {
      GMTrace.o(10003113050112L, 74529);
      return null;
    }
    int i1 = m - n;
    int i2 = (m + n + 1) / 2;
    Arrays.fill(paramArrayOfInt1, paramInt5 - i2 - 1, paramInt5 + i2 + 1, 0);
    Arrays.fill(paramArrayOfInt2, paramInt5 - i2 - 1 + i1, paramInt5 + i2 + 1 + i1, m);
    int i;
    if (i1 % 2 != 0)
    {
      paramInt4 = 1;
      i = 0;
    }
    for (;;)
    {
      if (i > i2) {
        break label694;
      }
      int j = -i;
      boolean bool;
      int k;
      for (;;)
      {
        if (j > i) {
          break label404;
        }
        if ((j == -i) || ((j != i) && (paramArrayOfInt1[(paramInt5 + j - 1)] < paramArrayOfInt1[(paramInt5 + j + 1)]))) {
          paramInt2 = paramArrayOfInt1[(paramInt5 + j + 1)];
        }
        for (bool = false;; bool = true)
        {
          k = paramInt2;
          paramInt2 -= j;
          while ((k < m) && (paramInt2 < n) && (parama.bz(paramInt1 + k, paramInt3 + paramInt2)))
          {
            k += 1;
            paramInt2 += 1;
          }
          paramInt4 = 0;
          break;
          paramInt2 = paramArrayOfInt1[(paramInt5 + j - 1)] + 1;
        }
        paramArrayOfInt1[(paramInt5 + j)] = k;
        if ((paramInt4 != 0) && (j >= i1 - i + 1) && (j <= i1 + i - 1) && (paramArrayOfInt1[(paramInt5 + j)] >= paramArrayOfInt2[(paramInt5 + j)]))
        {
          parama = new e();
          parama.x = paramArrayOfInt2[(paramInt5 + j)];
          parama.y = (parama.x - j);
          parama.size = (paramArrayOfInt1[(paramInt5 + j)] - paramArrayOfInt2[(paramInt5 + j)]);
          parama.jwK = bool;
          parama.jwP = false;
          GMTrace.o(10003113050112L, 74529);
          return parama;
        }
        j += 2;
      }
      label404:
      j = -i;
      while (j <= i)
      {
        int i3 = j + i1;
        if ((i3 == i + i1) || ((i3 != -i + i1) && (paramArrayOfInt2[(paramInt5 + i3 - 1)] < paramArrayOfInt2[(paramInt5 + i3 + 1)]))) {
          paramInt2 = paramArrayOfInt2[(paramInt5 + i3 - 1)];
        }
        for (bool = false;; bool = true)
        {
          k = paramInt2;
          paramInt2 -= i3;
          while ((k > 0) && (paramInt2 > 0) && (parama.bz(paramInt1 + k - 1, paramInt3 + paramInt2 - 1)))
          {
            k -= 1;
            paramInt2 -= 1;
          }
          paramInt2 = paramArrayOfInt2[(paramInt5 + i3 + 1)] - 1;
        }
        paramArrayOfInt2[(paramInt5 + i3)] = k;
        if ((paramInt4 == 0) && (j + i1 >= -i) && (j + i1 <= i) && (paramArrayOfInt1[(paramInt5 + i3)] >= paramArrayOfInt2[(paramInt5 + i3)]))
        {
          parama = new e();
          parama.x = paramArrayOfInt2[(paramInt5 + i3)];
          parama.y = (parama.x - i3);
          parama.size = (paramArrayOfInt1[(paramInt5 + i3)] - paramArrayOfInt2[(paramInt5 + i3)]);
          parama.jwK = bool;
          parama.jwP = true;
          GMTrace.o(10003113050112L, 74529);
          return parama;
        }
        j += 2;
      }
      i += 1;
    }
    label694:
    throw new IllegalStateException("DiffUtil hit an unexpected case while trying to calculate the optimal path. Please make sure your data is not changing during the diff calculation.");
  }
  
  public static abstract class a
  {
    public a()
    {
      GMTrace.i(10003515703296L, 74532);
      GMTrace.o(10003515703296L, 74532);
    }
    
    public abstract int aab();
    
    public abstract int aac();
    
    public abstract boolean bA(int paramInt1, int paramInt2);
    
    public Object bB(int paramInt1, int paramInt2)
    {
      GMTrace.i(10004186791936L, 74537);
      GMTrace.o(10004186791936L, 74537);
      return null;
    }
    
    public abstract boolean bz(int paramInt1, int paramInt2);
  }
  
  public static final class b
  {
    public final List<j.e> jwB;
    public final int[] jwC;
    private final int[] jwD;
    public final j.a jwE;
    public final int jwF;
    public final int jwG;
    private final boolean jwH;
    
    b(j.a parama, List<j.e> paramList, int[] paramArrayOfInt1, int[] paramArrayOfInt2, boolean paramBoolean)
    {
      GMTrace.i(10011434549248L, 74591);
      this.jwB = paramList;
      this.jwC = paramArrayOfInt1;
      this.jwD = paramArrayOfInt2;
      Arrays.fill(this.jwC, 0);
      Arrays.fill(this.jwD, 0);
      this.jwE = parama;
      this.jwF = parama.aab();
      this.jwG = parama.aac();
      this.jwH = paramBoolean;
      if (this.jwB.isEmpty()) {}
      for (parama = null;; parama = (j.e)this.jwB.get(0))
      {
        if ((parama == null) || (parama.x != 0) || (parama.y != 0))
        {
          parama = new j.e();
          parama.x = 0;
          parama.y = 0;
          parama.jwK = false;
          parama.size = 0;
          parama.jwP = false;
          this.jwB.add(0, parama);
        }
        abb();
        GMTrace.o(10011434549248L, 74591);
        return;
      }
    }
    
    private void abb()
    {
      GMTrace.i(10011568766976L, 74592);
      int j = this.jwF;
      int i = this.jwG;
      int k = this.jwB.size() - 1;
      while (k >= 0)
      {
        j.e locale = (j.e)this.jwB.get(k);
        int i2 = locale.x;
        int i3 = locale.size;
        int n = locale.y;
        int i1 = locale.size;
        int m;
        if (this.jwH)
        {
          for (;;)
          {
            m = i;
            if (j <= i2 + i3) {
              break;
            }
            if (this.jwC[(j - 1)] == 0) {
              c(j, i, k, false);
            }
            j -= 1;
          }
          while (m > n + i1)
          {
            if (this.jwD[(m - 1)] == 0) {
              c(j, m, k, true);
            }
            m -= 1;
          }
        }
        i = 0;
        if (i < locale.size)
        {
          m = locale.x + i;
          n = locale.y + i;
          if (this.jwE.bA(m, n)) {}
          for (j = 1;; j = 2)
          {
            this.jwC[m] = (n << 5 | j);
            this.jwD[n] = (j | m << 5);
            i += 1;
            break;
          }
        }
        j = locale.x;
        i = locale.y;
        k -= 1;
      }
      GMTrace.o(10011568766976L, 74592);
    }
    
    private static j.c b(List<j.c> paramList, int paramInt, boolean paramBoolean)
    {
      GMTrace.i(10011837202432L, 74594);
      int i = paramList.size() - 1;
      while (i >= 0)
      {
        j.c localc1 = (j.c)paramList.get(i);
        if ((localc1.jwI == paramInt) && (localc1.jwK == paramBoolean))
        {
          paramList.remove(i);
          paramInt = i;
          if (paramInt < paramList.size())
          {
            j.c localc2 = (j.c)paramList.get(paramInt);
            int j = localc2.jwJ;
            if (paramBoolean) {}
            for (i = 1;; i = -1)
            {
              localc2.jwJ = (i + j);
              paramInt += 1;
              break;
            }
          }
          GMTrace.o(10011837202432L, 74594);
          return localc1;
        }
        i -= 1;
      }
      GMTrace.o(10011837202432L, 74594);
      return null;
    }
    
    private boolean c(int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean)
    {
      GMTrace.i(10011702984704L, 74593);
      int j;
      int i;
      int k;
      if (paramBoolean)
      {
        j = paramInt2 - 1;
        i = paramInt1;
        k = paramInt2 - 1;
        paramInt2 = j;
        j = k;
      }
      while (paramInt3 >= 0)
      {
        j.e locale = (j.e)this.jwB.get(paramInt3);
        k = locale.x;
        int m = locale.size;
        int n = locale.y;
        int i1 = locale.size;
        if (paramBoolean)
        {
          paramInt2 = i - 1;
          for (;;)
          {
            if (paramInt2 < k + m) {
              break label279;
            }
            if (this.jwE.bz(paramInt2, j))
            {
              if (this.jwE.bA(paramInt2, j)) {}
              for (paramInt1 = 8;; paramInt1 = 4)
              {
                this.jwD[j] = (paramInt2 << 5 | 0x10);
                this.jwC[paramInt2] = (paramInt1 | j << 5);
                GMTrace.o(10011702984704L, 74593);
                return true;
                j = paramInt1 - 1;
                i = paramInt1 - 1;
                break;
              }
            }
            paramInt2 -= 1;
          }
        }
        paramInt2 -= 1;
        while (paramInt2 >= n + i1)
        {
          if (this.jwE.bz(j, paramInt2))
          {
            if (this.jwE.bA(j, paramInt2)) {}
            for (paramInt3 = 8;; paramInt3 = 4)
            {
              this.jwC[(paramInt1 - 1)] = (paramInt2 << 5 | 0x10);
              this.jwD[paramInt2] = (paramInt3 | paramInt1 - 1 << 5);
              GMTrace.o(10011702984704L, 74593);
              return true;
            }
          }
          paramInt2 -= 1;
        }
        label279:
        i = locale.x;
        paramInt2 = locale.y;
        paramInt3 -= 1;
      }
      GMTrace.o(10011702984704L, 74593);
      return false;
    }
    
    public final void a(List<j.c> paramList, k paramk, int paramInt1, int paramInt2, int paramInt3)
    {
      GMTrace.i(10011971420160L, 74595);
      if (!this.jwH)
      {
        paramk.bv(paramInt1, paramInt2);
        GMTrace.o(10011971420160L, 74595);
        return;
      }
      paramInt2 -= 1;
      if (paramInt2 >= 0)
      {
        int i = this.jwD[(paramInt3 + paramInt2)] & 0x1F;
        Iterator localIterator;
        switch (i)
        {
        default: 
          throw new IllegalStateException("unknown flag for pos " + (paramInt2 + paramInt3) + " " + Long.toBinaryString(i));
        case 0: 
          paramk.bv(paramInt1, 1);
          localIterator = paramList.iterator();
        case 4: 
        case 8: 
          while (localIterator.hasNext())
          {
            j.c localc = (j.c)localIterator.next();
            localc.jwJ += 1;
            continue;
            int j = this.jwD[(paramInt3 + paramInt2)] >> 5;
            paramk.bx(b(paramList, j, true).jwJ, paramInt1);
            if (i == 4) {
              paramk.d(paramInt1, 1, this.jwE.bB(j, paramInt3 + paramInt2));
            }
          }
        }
        for (;;)
        {
          paramInt2 -= 1;
          break;
          paramList.add(new j.c(paramInt3 + paramInt2, paramInt1, false));
        }
      }
      GMTrace.o(10011971420160L, 74595);
    }
    
    public final void b(List<j.c> paramList, k paramk, int paramInt1, int paramInt2, int paramInt3)
    {
      GMTrace.i(10012105637888L, 74596);
      if (!this.jwH)
      {
        paramk.bw(paramInt1, paramInt2);
        GMTrace.o(10012105637888L, 74596);
        return;
      }
      paramInt2 -= 1;
      if (paramInt2 >= 0)
      {
        int i = this.jwC[(paramInt3 + paramInt2)] & 0x1F;
        Object localObject;
        switch (i)
        {
        default: 
          throw new IllegalStateException("unknown flag for pos " + (paramInt2 + paramInt3) + " " + Long.toBinaryString(i));
        case 0: 
          paramk.bw(paramInt1 + paramInt2, 1);
          localObject = paramList.iterator();
        case 4: 
        case 8: 
          while (((Iterator)localObject).hasNext())
          {
            j.c localc = (j.c)((Iterator)localObject).next();
            localc.jwJ -= 1;
            continue;
            int j = this.jwC[(paramInt3 + paramInt2)] >> 5;
            localObject = b(paramList, j, false);
            paramk.bx(paramInt1 + paramInt2, ((j.c)localObject).jwJ - 1);
            if (i == 4) {
              paramk.d(((j.c)localObject).jwJ - 1, 1, this.jwE.bB(paramInt3 + paramInt2, j));
            }
          }
        }
        for (;;)
        {
          paramInt2 -= 1;
          break;
          paramList.add(new j.c(paramInt3 + paramInt2, paramInt1 + paramInt2, true));
        }
      }
      GMTrace.o(10012105637888L, 74596);
    }
  }
  
  private static final class c
  {
    int jwI;
    int jwJ;
    boolean jwK;
    
    public c(int paramInt1, int paramInt2, boolean paramBoolean)
    {
      GMTrace.i(10008884412416L, 74572);
      this.jwI = paramInt1;
      this.jwJ = paramInt2;
      this.jwK = paramBoolean;
      GMTrace.o(10008884412416L, 74572);
    }
  }
  
  static final class d
  {
    int jwL;
    int jwM;
    int jwN;
    int jwO;
    
    public d()
    {
      GMTrace.i(10009018630144L, 74573);
      GMTrace.o(10009018630144L, 74573);
    }
    
    public d(int paramInt1, int paramInt2)
    {
      GMTrace.i(10009152847872L, 74574);
      this.jwL = 0;
      this.jwM = paramInt1;
      this.jwN = 0;
      this.jwO = paramInt2;
      GMTrace.o(10009152847872L, 74574);
    }
  }
  
  public static final class e
  {
    boolean jwK;
    boolean jwP;
    public int size;
    public int x;
    public int y;
    
    e()
    {
      GMTrace.i(10011031896064L, 74588);
      GMTrace.o(10011031896064L, 74588);
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/o/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */