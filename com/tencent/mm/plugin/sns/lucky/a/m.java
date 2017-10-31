package com.tencent.mm.plugin.sns.lucky.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.a.g;
import com.tencent.mm.plugin.sns.model.ae;
import com.tencent.mm.plugin.sns.model.ai;
import com.tencent.mm.protocal.c.agb;
import com.tencent.mm.protocal.c.amo;
import com.tencent.mm.protocal.c.bdg;
import com.tencent.mm.protocal.c.bdk;
import com.tencent.mm.protocal.c.bdz;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class m
{
  private static final ThreadLocal<HashMap<String, Long>> pZw;
  
  static
  {
    GMTrace.i(8797166764032L, 65544);
    pZw = new ThreadLocal();
    GMTrace.o(8797166764032L, 65544);
  }
  
  public static boolean Gn(String paramString)
  {
    GMTrace.i(8796361457664L, 65538);
    paramString = ae.bhp().HA(paramString);
    boolean bool = a(paramString, ai.n(paramString));
    GMTrace.o(8796361457664L, 65538);
    return bool;
  }
  
  public static boolean a(com.tencent.mm.plugin.sns.storage.m paramm, bdk parambdk)
  {
    GMTrace.i(8796629893120L, 65540);
    amo localamo = paramm.bjY();
    if (paramm.field_type != 21)
    {
      GMTrace.o(8796629893120L, 65540);
      return true;
    }
    if (localamo.fQZ == 1)
    {
      GMTrace.o(8796629893120L, 65540);
      return true;
    }
    if (com.tencent.mm.x.m.zF().equals(paramm.field_userName))
    {
      GMTrace.o(8796629893120L, 65540);
      return true;
    }
    if (parambdk.uvw != null)
    {
      parambdk = parambdk.uvw.uvZ;
      if ((parambdk == null) || (parambdk.size() == 0))
      {
        GMTrace.o(8796629893120L, 65540);
        return false;
      }
      paramm = com.tencent.mm.x.m.zF();
      parambdk = parambdk.iterator();
      while (parambdk.hasNext()) {
        if (paramm.equals(((bdg)parambdk.next()).twR))
        {
          GMTrace.o(8796629893120L, 65540);
          return true;
        }
      }
    }
    GMTrace.o(8796629893120L, 65540);
    return false;
  }
  
  public static long b(com.tencent.mm.plugin.sns.storage.m paramm, bdk parambdk)
  {
    long l = 0L;
    GMTrace.i(8797032546304L, 65543);
    if (paramm == null)
    {
      GMTrace.o(8797032546304L, 65543);
      return 0L;
    }
    Object localObject1 = parambdk;
    if (parambdk == null) {
      localObject1 = ai.n(paramm);
    }
    if (localObject1 == null)
    {
      GMTrace.o(8797032546304L, 65543);
      return 0L;
    }
    parambdk = ((bdk)localObject1).uvw;
    if (parambdk == null)
    {
      GMTrace.o(8797032546304L, 65543);
      return 0L;
    }
    Object localObject2 = parambdk.uvZ;
    if (localObject2 == null)
    {
      GMTrace.o(8797032546304L, 65543);
      return 0L;
    }
    parambdk = paramm.quP;
    if (bg.mZ(parambdk)) {}
    for (paramm = g.n(paramm.field_content) + g.n(paramm.field_attrBuf);; paramm = parambdk)
    {
      localObject1 = (HashMap)pZw.get();
      if ((localObject1 != null) && (((HashMap)localObject1).containsKey(paramm)))
      {
        l = ((Long)((HashMap)localObject1).get(paramm)).longValue();
        GMTrace.o(8797032546304L, 65543);
        return l;
      }
      parambdk = ((List)localObject2).iterator();
      for (;;)
      {
        if (parambdk.hasNext())
        {
          bdg localbdg = (bdg)parambdk.next();
          localObject2 = new agb();
          try
          {
            ((agb)localObject2).aC(com.tencent.mm.platformtools.n.a(localbdg.uuI));
            l += ((agb)localObject2).fRn;
          }
          catch (Exception localException)
          {
            for (;;)
            {
              w.e("MicrMsg.SnsLuckyUtil", localException.getMessage() + "hbBuffer is error");
            }
          }
        }
      }
      parambdk = (bdk)localObject1;
      if (localObject1 == null) {
        parambdk = new HashMap();
      }
      parambdk.put(paramm, Long.valueOf(l));
      pZw.set(parambdk);
      GMTrace.o(8797032546304L, 65543);
      return l;
    }
  }
  
  public static boolean h(com.tencent.mm.plugin.sns.storage.m paramm)
  {
    GMTrace.i(8796495675392L, 65539);
    boolean bool = a(paramm, ai.n(paramm));
    GMTrace.o(8796495675392L, 65539);
    return bool;
  }
  
  public static int i(com.tencent.mm.plugin.sns.storage.m paramm)
  {
    GMTrace.i(8796764110848L, 65541);
    if (paramm == null)
    {
      GMTrace.o(8796764110848L, 65541);
      return 0;
    }
    paramm = ai.n(paramm);
    if (paramm == null)
    {
      GMTrace.o(8796764110848L, 65541);
      return 0;
    }
    paramm = paramm.uvw;
    if ((paramm == null) || (paramm.uvZ.size() == 0))
    {
      GMTrace.o(8796764110848L, 65541);
      return 0;
    }
    int i = paramm.uvZ.size();
    GMTrace.o(8796764110848L, 65541);
    return i;
  }
  
  public static long j(com.tencent.mm.plugin.sns.storage.m paramm)
  {
    GMTrace.i(8796898328576L, 65542);
    long l = b(paramm, null);
    GMTrace.o(8796898328576L, 65542);
    return l;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/sns/lucky/a/m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */