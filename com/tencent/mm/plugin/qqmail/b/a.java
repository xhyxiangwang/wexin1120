package com.tencent.mm.plugin.qqmail.b;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.platformtools.c;
import com.tencent.mm.sdk.platformtools.w;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;

public final class a
  extends com.tencent.mm.bl.a
{
  String oEH;
  private boolean oEI;
  LinkedList<i> oEJ;
  private boolean oEK;
  
  public a()
  {
    GMTrace.i(5465480101888L, 40721);
    this.oEJ = new LinkedList();
    GMTrace.o(5465480101888L, 40721);
  }
  
  public static String Ed(String paramString)
  {
    GMTrace.i(5466285408256L, 40727);
    if ((paramString == null) || (paramString.length() <= 0))
    {
      w.d("MicroMsg.getAdjustFullSpell", "%s", new Object[] { "srcName is null or empty, adjust full spell = ~" });
      GMTrace.o(5466285408256L, 40727);
      return "~";
    }
    char[] arrayOfChar = paramString.toCharArray();
    int i = 0;
    while (i < arrayOfChar.length)
    {
      char c = arrayOfChar[i];
      if ((c >= '0') && (c <= '9'))
      {
        paramString = String.format("{%c%s", new Object[] { Character.valueOf(c), paramString });
        GMTrace.o(5466285408256L, 40727);
        return paramString;
      }
      if (((c >= 'a') && (c <= 'z')) || ((c >= 'A') && (c <= 'Z')))
      {
        if (i == 0)
        {
          GMTrace.o(5466285408256L, 40727);
          return paramString;
        }
        paramString = String.format("%c%s", new Object[] { Character.valueOf(c), paramString });
        GMTrace.o(5466285408256L, 40727);
        return paramString;
      }
      if ((c == '{') && (i == 0) && (arrayOfChar.length > 1) && (arrayOfChar[(i + 1)] >= '0') && (arrayOfChar[(i + 1)] <= '9'))
      {
        GMTrace.o(5466285408256L, 40727);
        return paramString;
      }
      i += 1;
    }
    w.d("MicroMsg.getAdjustFullSpell", "%s is not ok, return '~'", new Object[] { paramString });
    GMTrace.o(5466285408256L, 40727);
    return "~";
  }
  
  private static boolean a(i parami1, i parami2)
  {
    GMTrace.i(5466016972800L, 40725);
    if ((parami1 == null) || (parami2 == null))
    {
      GMTrace.o(5466016972800L, 40725);
      return false;
    }
    int i = b(parami1).compareTo(b(parami2));
    if (i == 0)
    {
      if (parami1.nke.compareTo(parami2.nke) <= 0)
      {
        GMTrace.o(5466016972800L, 40725);
        return true;
      }
      GMTrace.o(5466016972800L, 40725);
      return false;
    }
    if (i < 0)
    {
      GMTrace.o(5466016972800L, 40725);
      return true;
    }
    GMTrace.o(5466016972800L, 40725);
    return false;
  }
  
  private a aWL()
  {
    GMTrace.i(5466553843712L, 40729);
    if (!this.oEI) {
      throw new b("Not all required fields were included (false = not included in message),  syncInfo:" + this.oEI);
    }
    GMTrace.o(5466553843712L, 40729);
    return this;
  }
  
  public static String b(i parami)
  {
    GMTrace.i(5466151190528L, 40726);
    String str = parami.oFm;
    if ((str == null) || ("".equals(str))) {}
    for (str = Ed(c.mO(parami.name.trim()).toLowerCase());; str = Ed(str))
    {
      parami.oFm = str;
      GMTrace.o(5466151190528L, 40726);
      return str;
    }
  }
  
  public final a Ec(String paramString)
  {
    GMTrace.i(5465614319616L, 40722);
    this.oEH = paramString;
    this.oEI = true;
    GMTrace.o(5465614319616L, 40722);
    return this;
  }
  
  public final a a(i parami)
  {
    int j = 0;
    GMTrace.i(5465882755072L, 40724);
    if (!this.oEK) {
      this.oEK = true;
    }
    Iterator localIterator = this.oEJ.iterator();
    int i = 0;
    i locali;
    if (localIterator.hasNext())
    {
      locali = (i)localIterator.next();
      if (i < 10) {
        if (parami.oFl <= locali.oFl) {
          break label112;
        }
      }
    }
    else
    {
      label73:
      if (i < this.oEJ.size()) {
        break label119;
      }
      this.oEJ.add(parami);
    }
    for (;;)
    {
      GMTrace.o(5465882755072L, 40724);
      return this;
      if (a(parami, locali)) {
        break label73;
      }
      label112:
      i += 1;
      break;
      label119:
      this.oEJ.add(i, parami);
      if ((i < 10) && (this.oEJ.size() > 10))
      {
        parami = (i)this.oEJ.remove(10);
        localIterator = this.oEJ.iterator();
        i = j;
        while (localIterator.hasNext())
        {
          locali = (i)localIterator.next();
          if ((i >= 10) && (a(parami, locali))) {
            break;
          }
          i += 1;
        }
        if (i >= this.oEJ.size()) {
          this.oEJ.add(parami);
        } else {
          this.oEJ.add(i, parami);
        }
      }
    }
  }
  
  public final void a(b.a.a.c.a parama)
  {
    GMTrace.i(5466956496896L, 40732);
    parama.e(1, this.oEH);
    parama.d(2, 8, this.oEJ);
    GMTrace.o(5466956496896L, 40732);
  }
  
  public final a aB(byte[] paramArrayOfByte)
  {
    GMTrace.i(5467090714624L, 40733);
    paramArrayOfByte = new b.a.a.a.a(paramArrayOfByte, unknownTagHandler);
    int i = a(paramArrayOfByte);
    if (i > 0)
    {
      switch (i)
      {
      default: 
        i = 0;
      }
      for (;;)
      {
        if (i == 0) {
          paramArrayOfByte.cpJ();
        }
        i = a(paramArrayOfByte);
        break;
        Ec(paramArrayOfByte.xSv.readString());
        i = 1;
        continue;
        Object localObject1 = paramArrayOfByte.FK(2);
        i = 0;
        i locali;
        while (i < ((LinkedList)localObject1).size())
        {
          Object localObject2 = (byte[])((LinkedList)localObject1).get(i);
          locali = new i();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (boolean bool = true; bool; bool = locali.a((b.a.a.a.a)localObject2, locali, a((b.a.a.a.a)localObject2))) {}
          if (!this.oEK) {
            this.oEK = true;
          }
          this.oEJ.add(locali);
          i += 1;
        }
        localObject1 = new i[1];
        localObject1 = (i[])this.oEJ.toArray((Object[])localObject1);
        Arrays.sort((Object[])localObject1, new Comparator() {});
        if (10 <= localObject1.length) {
          Arrays.sort((Object[])localObject1, 10, localObject1.length, new Comparator() {});
        }
        this.oEJ.clear();
        int j = localObject1.length;
        i = 0;
        while (i < j)
        {
          locali = localObject1[i];
          this.oEJ.add(locali);
          i += 1;
        }
        i = 1;
      }
    }
    paramArrayOfByte = aWL();
    GMTrace.o(5467090714624L, 40733);
    return paramArrayOfByte;
  }
  
  public final int aWM()
  {
    GMTrace.i(5466688061440L, 40730);
    int i = b.a.a.b.b.a.f(1, this.oEH);
    int j = b.a.a.a.c(2, 8, this.oEJ);
    GMTrace.o(5466688061440L, 40730);
    return i + 0 + (j + 0);
  }
  
  public final a sC(int paramInt)
  {
    boolean bool = false;
    GMTrace.i(5465748537344L, 40723);
    if ((paramInt < 0) || (paramInt >= this.oEJ.size()))
    {
      GMTrace.o(5465748537344L, 40723);
      return this;
    }
    if (paramInt >= 10)
    {
      this.oEJ.remove(paramInt);
      if (this.oEJ.size() > 0) {
        bool = true;
      }
      this.oEK = bool;
      GMTrace.o(5465748537344L, 40723);
      return this;
    }
    this.oEJ.remove(paramInt);
    Iterator localIterator = this.oEJ.iterator();
    int j = -1;
    int i = Integer.MIN_VALUE;
    int k = 0;
    for (;;)
    {
      label110:
      if (localIterator.hasNext())
      {
        i locali = (i)localIterator.next();
        paramInt = k + 1;
        if (k < 10) {
          break label261;
        }
        if (i >= locali.oFl) {
          break label250;
        }
        j = locali.oFl;
        i = paramInt;
      }
      for (;;)
      {
        k = j;
        j = i;
        i = k;
        k = paramInt;
        break label110;
        if ((j == -1) || (j >= this.oEJ.size())) {
          break;
        }
        try
        {
          a((i)this.oEJ.remove(j));
        }
        catch (Exception localException)
        {
          w.printErrStackTrace("MicroMsg.AddrBook", localException, "size:%d, idx:%d", new Object[] { Integer.valueOf(this.oEJ.size()), Integer.valueOf(j) });
        }
        break;
        label250:
        k = i;
        i = j;
        j = k;
      }
      label261:
      k = paramInt;
    }
  }
  
  public final byte[] toByteArray()
  {
    GMTrace.i(5466822279168L, 40731);
    aWL();
    byte[] arrayOfByte = super.toByteArray();
    GMTrace.o(5466822279168L, 40731);
    return arrayOfByte;
  }
  
  public final String toString()
  {
    GMTrace.i(5466419625984L, 40728);
    String str = "" + getClass().getName() + "(";
    str = str + "syncInfo = " + this.oEH + "   ";
    str = str + "addrs = " + this.oEJ + "   ";
    str = str + ")";
    GMTrace.o(5466419625984L, 40728);
    return str;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/qqmail/b/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */