package com.tencent.mm.plugin.sns.model;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.sns.storage.k;
import com.tencent.mm.plugin.sns.storage.l;
import com.tencent.mm.protocal.c.bhd;
import com.tencent.mm.protocal.c.sn;
import com.tencent.mm.protocal.c.tx;
import com.tencent.mm.sdk.platformtools.w;
import java.util.Iterator;
import java.util.LinkedList;

public final class c
{
  public static int a(long paramLong1, long paramLong2, String paramString)
  {
    GMTrace.i(8076686000128L, 60176);
    paramString = ae.bhs().HC(paramString);
    Object localObject = paramString.tRU;
    w.i("MicroMsg.FaultLogic", "getLastReqTimeByMinId fault.count %s", new Object[] { Integer.valueOf(paramString.tRU.size()) });
    if (((LinkedList)localObject).isEmpty())
    {
      GMTrace.o(8076686000128L, 60176);
      return 0;
    }
    paramString = (sn)((LinkedList)localObject).getFirst();
    if ((paramLong1 == 0L) || (q(paramString.tOl, paramLong1) > 0L))
    {
      w.e("MicroMsg.FaultLogic", "has a fault  minId:" + paramLong2 + " fault.min:" + paramString.tOl);
      GMTrace.o(8076686000128L, 60176);
      return 0;
    }
    if ((paramLong2 != 0L) && (q(paramString.tOk, paramLong2) < 0L))
    {
      w.e("MicroMsg.FaultLogic", ":" + paramLong2 + " fault.max:" + paramString.tOk);
      GMTrace.o(8076686000128L, 60176);
      return 0;
    }
    paramString = paramString.tOm;
    if (paramString.isEmpty())
    {
      GMTrace.o(8076686000128L, 60176);
      return 0;
    }
    paramString = paramString.iterator();
    int i = Integer.MAX_VALUE;
    while (paramString.hasNext())
    {
      localObject = (bhd)paramString.next();
      if ((paramLong2 == 0L) || (q(paramLong2, ((bhd)localObject).uyD) >= 0L))
      {
        int j = i;
        if (((bhd)localObject).uyE < i) {
          j = ((bhd)localObject).uyE;
        }
        i = j;
        if (q(paramLong1, ((bhd)localObject).uyD) >= 0L)
        {
          if (j == Integer.MAX_VALUE)
          {
            GMTrace.o(8076686000128L, 60176);
            return 0;
          }
          GMTrace.o(8076686000128L, 60176);
          return j;
        }
      }
    }
    w.i("MicroMsg.FaultLogic", "should not to hear  minId:" + paramLong1);
    GMTrace.o(8076686000128L, 60176);
    return 0;
  }
  
  private static sn a(sn paramsn1, sn paramsn2)
  {
    GMTrace.i(8076283346944L, 60173);
    sn localsn = new sn();
    if (q(paramsn1.tOk, paramsn2.tOk) > 0L)
    {
      localsn.tOk = paramsn1.tOk;
      if (q(paramsn1.tOl, paramsn2.tOl) >= 0L) {
        break label135;
      }
      localsn.tOl = paramsn1.tOl;
      label67:
      paramsn1 = paramsn1.tOm;
      paramsn2 = paramsn2.tOm.iterator();
    }
    bhd localbhd1;
    label135:
    long l1;
    int i;
    label161:
    label186:
    int j;
    label195:
    label250:
    label257:
    label265:
    bhd localbhd2;
    bhd localbhd3;
    for (;;)
    {
      if (paramsn2.hasNext())
      {
        localbhd1 = (bhd)paramsn2.next();
        if (paramsn1.isEmpty())
        {
          w.e("MicroMsg.FaultLogic", "fault's segments should not empty!!");
          paramsn1.addFirst(localbhd1);
          continue;
          localsn.tOk = paramsn2.tOk;
          break;
          localsn.tOl = paramsn2.tOl;
          break label67;
        }
        l1 = localbhd1.uyD;
        i = paramsn1.size() - 1;
        if (i >= 0) {
          if (q(l1, ((bhd)paramsn1.get(i)).uyC) <= 0L)
          {
            l1 = localbhd1.uyC;
            j = 0;
            if (j >= paramsn1.size()) {
              break label257;
            }
            if (q(l1, ((bhd)paramsn1.get(j)).uyD) < 0L) {
              break label250;
            }
          }
        }
        for (;;)
        {
          if (i != -1) {
            break label265;
          }
          paramsn1.addFirst(localbhd1);
          break;
          i -= 1;
          break label161;
          i = -1;
          break label186;
          j += 1;
          break label195;
          j = paramsn1.size();
        }
        if (j == paramsn1.size())
        {
          paramsn1.addLast(localbhd1);
        }
        else
        {
          localbhd2 = (bhd)paramsn1.get(j);
          if (q(localbhd1.uyC, localbhd2.uyC) >= 0L) {
            break label650;
          }
          localbhd3 = new bhd();
          localbhd3.uyC = localbhd2.uyC;
          l1 = localbhd1.uyC;
          if (l1 == Long.MAX_VALUE)
          {
            l1 = Long.MIN_VALUE;
            localbhd3.uyD = l1;
            localbhd3.uyE = localbhd2.uyE;
            paramsn1.add(j, localbhd3);
            i += 1;
            j += 1;
          }
        }
      }
    }
    label549:
    label647:
    label650:
    for (;;)
    {
      localbhd2 = (bhd)paramsn1.get(i);
      int k = i;
      if (q(localbhd1.uyD, localbhd2.uyD) > 0L)
      {
        localbhd3 = new bhd();
        localbhd3.uyD = localbhd2.uyD;
        localbhd3.uyC = ds(localbhd1.uyD);
        localbhd3.uyE = localbhd2.uyE;
        paramsn1.add(i + 1, localbhd3);
        k = i;
      }
      for (;;)
      {
        if (k >= j)
        {
          paramsn1.remove(k);
          k -= 1;
          continue;
          l1 += 1L;
          break;
        }
      }
      paramsn1.add(j, localbhd1);
      if (paramsn1.size() <= 100) {
        break;
      }
      long l2 = ((bhd)paramsn1.getLast()).uyD;
      l1 = ((bhd)paramsn1.getLast()).uyC;
      i = ((bhd)paramsn1.getLast()).uyE;
      if (paramsn1.size() >= 100)
      {
        localbhd1 = (bhd)paramsn1.removeLast();
        l1 = localbhd1.uyC;
        if (localbhd1.uyE >= i) {
          break label647;
        }
        i = localbhd1.uyE;
      }
      for (;;)
      {
        break label549;
        localbhd1 = new bhd();
        localbhd1.uyC = l1;
        localbhd1.uyD = l2;
        localbhd1.uyE = i;
        paramsn1.addLast(localbhd1);
        break;
        localsn.tOm = paramsn1;
        GMTrace.o(8076283346944L, 60173);
        return localsn;
      }
    }
  }
  
  public static void c(String paramString, long paramLong1, long paramLong2, int paramInt)
  {
    GMTrace.i(8076149129216L, 60172);
    if (paramLong2 == 0L)
    {
      GMTrace.o(8076149129216L, 60172);
      return;
    }
    Object localObject1 = ae.bhs().HC(paramString);
    if (localObject1 == null) {
      localObject1 = new tx();
    }
    for (;;)
    {
      if ((paramLong1 == 0L) && (((tx)localObject1).tRU.isEmpty()))
      {
        GMTrace.o(8076149129216L, 60172);
        return;
      }
      long l = paramLong1;
      if (paramLong1 == 0L) {
        l = ((sn)((tx)localObject1).tRU.getFirst()).tOk;
      }
      Object localObject2 = new sn();
      ((sn)localObject2).tOk = l;
      ((sn)localObject2).tOl = paramLong2;
      Object localObject3 = new bhd();
      ((bhd)localObject3).uyC = l;
      ((bhd)localObject3).uyD = paramLong2;
      ((bhd)localObject3).uyE = paramInt;
      ((sn)localObject2).tOm.add(localObject3);
      for (;;)
      {
        if (!((tx)localObject1).tRU.isEmpty())
        {
          localObject3 = (sn)((tx)localObject1).tRU.getFirst();
          if (q(((sn)localObject2).tOl, ((sn)localObject3).tOk) > 0L) {
            w.e("MicroMsg.FaultLogic", "has a fault: newerMin:" + ((sn)localObject2).tOl + " fault.Max" + ((sn)localObject3).tOk);
          }
        }
        else
        {
          ((tx)localObject1).tRU.addFirst(localObject2);
          while (((tx)localObject1).tRU.size() > 100) {
            ((tx)localObject1).tRU.removeLast();
          }
        }
        ((tx)localObject1).tRU.removeFirst();
        localObject2 = a((sn)localObject3, (sn)localObject2);
      }
      if (((tx)localObject1).tRU.size() > 0) {
        w.d("MicroMsg.FaultLogic", "min " + ((sn)((tx)localObject1).tRU.get(0)).tOl + " max " + ((sn)((tx)localObject1).tRU.get(0)).tOk);
      }
      localObject2 = ae.bhs().HE(paramString);
      try
      {
        ((k)localObject2).field_userName = paramString;
        ((k)localObject2).field_faultS = ((tx)localObject1).toByteArray();
        ae.bhs().c((k)localObject2);
        if (((tx)localObject1).tRU.size() > 1)
        {
          w.d("MicroMsg.FaultLogic", "fault size : " + ((tx)localObject1).tRU.size());
          paramString = ((tx)localObject1).tRU.iterator();
          while (paramString.hasNext())
          {
            localObject1 = (sn)paramString.next();
            w.d("MicroMsg.FaultLogic", "min - max " + ((sn)localObject1).tOl + " " + ((sn)localObject1).tOk);
          }
        }
        GMTrace.o(8076149129216L, 60172);
        return;
      }
      catch (Exception paramString)
      {
        for (;;) {}
      }
    }
  }
  
  public static long ds(long paramLong)
  {
    GMTrace.i(8076551782400L, 60175);
    if (paramLong == Long.MIN_VALUE)
    {
      GMTrace.o(8076551782400L, 60175);
      return Long.MAX_VALUE;
    }
    GMTrace.o(8076551782400L, 60175);
    return paramLong - 1L;
  }
  
  private static long q(long paramLong1, long paramLong2)
  {
    GMTrace.i(8076417564672L, 60174);
    if (((paramLong1 > 0L) && (paramLong2 > 0L)) || ((paramLong1 < 0L) && (paramLong2 < 0L)))
    {
      GMTrace.o(8076417564672L, 60174);
      return paramLong1 - paramLong2;
    }
    if (paramLong1 < 0L)
    {
      GMTrace.o(8076417564672L, 60174);
      return 1L;
    }
    GMTrace.o(8076417564672L, 60174);
    return -1L;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/sns/model/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */