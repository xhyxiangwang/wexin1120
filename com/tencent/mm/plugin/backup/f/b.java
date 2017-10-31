package com.tencent.mm.plugin.backup.f;

import android.os.Looper;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ac.k;
import com.tencent.mm.bl.a;
import com.tencent.mm.plugin.backup.e.c;
import com.tencent.mm.pointers.PByteArray;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.w;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;
import java.util.Set;

public abstract class b
  extends k
{
  private static final ae handler;
  public static final Map<Integer, Set<com.tencent.mm.ac.e>> hmO;
  static int jLd;
  public static c jRb;
  static a jRc;
  private static final Map<Integer, b> jRd;
  private static int jRe;
  private static i jRf;
  private static j jRg;
  private static b jRh;
  
  static
  {
    GMTrace.i(9509326028800L, 70850);
    jLd = -1;
    hmO = new HashMap();
    jRd = new HashMap();
    handler = new ae(Looper.getMainLooper());
    jRe = new Random(System.currentTimeMillis()).nextInt(1147483648);
    jRf = null;
    jRg = null;
    jRh = null;
    GMTrace.o(9509326028800L, 70850);
  }
  
  public b()
  {
    GMTrace.i(9505165279232L, 70819);
    GMTrace.o(9505165279232L, 70819);
  }
  
  public static void a(int paramInt, com.tencent.mm.ac.e parame)
  {
    GMTrace.i(9508118069248L, 70841);
    synchronized (hmO)
    {
      if (!hmO.containsKey(Integer.valueOf(paramInt))) {
        hmO.put(Integer.valueOf(paramInt), new HashSet());
      }
      if (!((Set)hmO.get(Integer.valueOf(paramInt))).contains(parame)) {
        ((Set)hmO.get(Integer.valueOf(paramInt))).add(parame);
      }
      GMTrace.o(9508118069248L, 70841);
      return;
    }
  }
  
  public static void a(a parama)
  {
    GMTrace.i(9505433714688L, 70821);
    jRc = parama;
    GMTrace.o(9505433714688L, 70821);
  }
  
  public static void a(b paramb)
  {
    GMTrace.i(9508520722432L, 70844);
    jRh = paramb;
    GMTrace.o(9508520722432L, 70844);
  }
  
  public static void a(c paramc)
  {
    GMTrace.i(9505299496960L, 70820);
    jRb = paramc;
    GMTrace.o(9505299496960L, 70820);
  }
  
  public static void a(i.a parama)
  {
    GMTrace.i(9505702150144L, 70823);
    jRf = new i(parama);
    GMTrace.o(9505702150144L, 70823);
  }
  
  public static void a(j.a parama)
  {
    GMTrace.i(9505970585600L, 70825);
    jRg = new j(parama);
    GMTrace.o(9505970585600L, 70825);
  }
  
  public static int adJ()
  {
    GMTrace.i(14811328937984L, 110353);
    int i = jLd;
    GMTrace.o(14811328937984L, 110353);
    return i;
  }
  
  public static i aeT()
  {
    GMTrace.i(9505567932416L, 70822);
    i locali = jRf;
    GMTrace.o(9505567932416L, 70822);
    return locali;
  }
  
  public static j aeU()
  {
    GMTrace.i(9505836367872L, 70824);
    j localj = jRg;
    GMTrace.o(9505836367872L, 70824);
    return localj;
  }
  
  public static void aeq()
  {
    GMTrace.i(9508654940160L, 70845);
    if (jRh != null) {
      jRh.aeq();
    }
    GMTrace.o(9508654940160L, 70845);
  }
  
  public static void b(int paramInt, com.tencent.mm.ac.e parame)
  {
    GMTrace.i(9508252286976L, 70842);
    try
    {
      synchronized (hmO)
      {
        if (hmO.get(Integer.valueOf(paramInt)) != null) {
          ((Set)hmO.get(Integer.valueOf(paramInt))).remove(parame);
        }
        GMTrace.o(9508252286976L, 70842);
        return;
      }
    }
    catch (Exception parame)
    {
      for (;;) {}
    }
  }
  
  public static void b(boolean paramBoolean, int paramInt1, int paramInt2, byte[] paramArrayOfByte)
  {
    GMTrace.i(9507849633792L, 70839);
    int i;
    if (paramArrayOfByte == null)
    {
      i = 0;
      w.i("MicroMsg.BackupBaseScene", "BackupBaseScene callback isLocal: %b,  seq:%d   type:%d,  bufLen:%d", new Object[] { Boolean.valueOf(paramBoolean), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(i) });
      if (!paramBoolean) {}
    }
    else
    {
      for (;;)
      {
        try
        {
          ??? = new StringBuilder("callback error buf content : ");
          if (paramArrayOfByte != null) {
            continue;
          }
          str = "null";
          w.w("MicroMsg.BackupBaseScene", str);
        }
        catch (Exception localException1)
        {
          String str;
          continue;
        }
        b(paramBoolean, paramInt2, paramArrayOfByte, paramInt1);
        GMTrace.o(9507849633792L, 70839);
        return;
        i = paramArrayOfByte.length;
        break;
        str = new String(paramArrayOfByte);
      }
    }
    if (jRf != null)
    {
      jRf.afb();
      w.d("MicroMsg.BackupBaseScene", "updateHeartBeatTimeStamp type:%d, current time stamp:%d", new Object[] { Integer.valueOf(paramInt2), Long.valueOf(System.currentTimeMillis()) });
    }
    synchronized (jRd)
    {
      ??? = (b)jRd.remove(Integer.valueOf(paramInt1));
      if (??? == null) {
        break label291;
      }
      if (paramArrayOfByte == null) {
        try
        {
          throw new Exception("buf is null");
        }
        catch (Exception paramArrayOfByte)
        {
          ((b)???).g(3, -1, "buf to resq fail");
          w.printErrStackTrace("MicroMsg.BackupBaseScene", paramArrayOfByte, "%s ", new Object[] { paramArrayOfByte.toString() });
          GMTrace.o(9507849633792L, 70839);
          return;
        }
      }
    }
    ((b)???).aeP().aC(paramArrayOfByte);
    ((b)???).aeR();
    GMTrace.o(9507849633792L, 70839);
    return;
    label291:
    w.i("MicroMsg.BackupBaseScene", "notify scene null type:%d", new Object[] { Integer.valueOf(paramInt2) });
    if ((??? == null) && (paramInt2 == 16))
    {
      for (;;)
      {
        b localb;
        synchronized (jRd)
        {
          Iterator localIterator = new HashSet(jRd.keySet()).iterator();
          if (!localIterator.hasNext()) {
            break;
          }
          Integer localInteger2 = (Integer)localIterator.next();
          localb = (b)jRd.get(localInteger2);
          if (localb == null)
          {
            ??? = "null";
            w.d("MicroMsg.BackupBaseScene", "notify sceneMap seq:%d scene:%s type:%s", new Object[] { localInteger2, localb, ??? });
            if ((localb == null) || (localb.getType() != 15)) {
              continue;
            }
            jRd.remove(localInteger2);
            try
            {
              localb.aeP().aC(paramArrayOfByte);
              localb.aeR();
            }
            catch (Exception localException2)
            {
              localb.g(3, -1, "buf to resp fail");
              w.printErrStackTrace("MicroMsg.BackupBaseScene", localException2, " type:%d %s ", new Object[] { Integer.valueOf(localb.getType()), localException2.toString() });
            }
          }
        }
        Integer localInteger1 = Integer.valueOf(localb.getType());
      }
      GMTrace.o(9507849633792L, 70839);
      return;
    }
    w.i("MicroMsg.BackupBaseScene", "notify globalSeq:%d, type:%d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    b(paramBoolean, paramInt2, paramArrayOfByte, paramInt1);
    GMTrace.o(9507849633792L, 70839);
  }
  
  private static void b(boolean paramBoolean, final int paramInt1, final byte[] paramArrayOfByte, final int paramInt2)
  {
    GMTrace.i(9507983851520L, 70840);
    handler.post(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(9512547254272L, 70874);
        if (b.jRb != null)
        {
          b.jRb.a(this.jLw, paramInt1, paramArrayOfByte, paramInt2);
          GMTrace.o(9512547254272L, 70874);
          return;
        }
        w.i("MicroMsg.BackupBaseScene", "onNotify is null");
        GMTrace.o(9512547254272L, 70874);
      }
    });
    GMTrace.o(9507983851520L, 70840);
  }
  
  public static void clear()
  {
    GMTrace.i(9506910109696L, 70832);
    w.i("MicroMsg.BackupBaseScene", "BackupBaseScene clear.");
    synchronized (jRd)
    {
      jRd.clear();
    }
    synchronized (hmO)
    {
      hmO.clear();
      GMTrace.o(9506910109696L, 70832);
      return;
      localObject1 = finally;
      throw ((Throwable)localObject1);
    }
  }
  
  public static boolean d(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    GMTrace.i(9507715416064L, 70838);
    PByteArray localPByteArray = new PByteArray();
    c.a(paramArrayOfByte, paramInt2, (short)paramInt1, localPByteArray, jLd);
    if (jRc != null) {
      jRc.i(paramInt2, localPByteArray.value);
    }
    w.i("MicroMsg.BackupBaseScene", "BackupBaseScene sendResp globalSeq:%d, type:%d, len:%d", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt1), Integer.valueOf(localPByteArray.value.length) });
    GMTrace.o(9507715416064L, 70838);
    return true;
  }
  
  public static void km(int paramInt)
  {
    GMTrace.i(14811194720256L, 110352);
    jLd = paramInt;
    GMTrace.o(14811194720256L, 110352);
  }
  
  public static void kv(int paramInt)
  {
    GMTrace.i(9508789157888L, 70846);
    if (jRg != null)
    {
      j localj = jRg;
      localj.jRJ = (paramInt + localj.jRJ);
    }
    GMTrace.o(9508789157888L, 70846);
  }
  
  public static boolean r(byte[] paramArrayOfByte, int paramInt)
  {
    GMTrace.i(9507581198336L, 70837);
    PByteArray localPByteArray = new PByteArray();
    synchronized (jRd)
    {
      c.a(paramArrayOfByte, jRe, (short)paramInt, localPByteArray, jLd);
      if (jRc != null) {
        jRc.i(jRe, localPByteArray.value);
      }
      w.i("MicroMsg.BackupBaseScene", "BackupBaseScene sendBuf globalSeq:%d, type:%d, len:%d", new Object[] { Integer.valueOf(jRe), Integer.valueOf(paramInt), Integer.valueOf(localPByteArray.value.length) });
      jRe += 1;
      GMTrace.o(9507581198336L, 70837);
      return true;
    }
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ac.e parame1)
  {
    GMTrace.i(9508923375616L, 70847);
    GMTrace.o(9508923375616L, 70847);
    return 0;
  }
  
  public abstract a aeP();
  
  public abstract a aeQ();
  
  public abstract void aeR();
  
  public boolean aeV()
  {
    GMTrace.i(9507044327424L, 70833);
    boolean bool = dg(false);
    GMTrace.o(9507044327424L, 70833);
    return bool;
  }
  
  public final boolean aeW()
  {
    GMTrace.i(9507312762880L, 70835);
    PByteArray localPByteArray = new PByteArray();
    try
    {
      byte[] arrayOfByte = aeQ().toByteArray();
      synchronized (jRd)
      {
        c.a(arrayOfByte, jRe, (short)getType(), localPByteArray, jLd);
        if (jRc != null) {
          jRc.j(jRe, localPByteArray.value);
        }
        w.i("MicroMsg.BackupBaseScene", "BackupBaseScene doscene globalSeq:%d, type:%d, len:%d", new Object[] { Integer.valueOf(jRe), Integer.valueOf(getType()), Integer.valueOf(localPByteArray.value.length) });
        jRd.put(Integer.valueOf(jRe), this);
        jRe += 1;
        GMTrace.o(9507312762880L, 70835);
        return true;
      }
      return false;
    }
    catch (Exception localException)
    {
      w.printErrStackTrace("MicroMsg.BackupBaseScene", localException, "req to buf fail: " + localException.toString(), new Object[0]);
      GMTrace.o(9507312762880L, 70835);
    }
  }
  
  public final int aeX()
  {
    GMTrace.i(9507446980608L, 70836);
    synchronized (jRd)
    {
      int i = jRe;
      jRd.put(Integer.valueOf(i), this);
      jRe += 1;
      GMTrace.o(9507446980608L, 70836);
      return i;
    }
  }
  
  public final boolean dg(boolean paramBoolean)
  {
    GMTrace.i(9507178545152L, 70834);
    PByteArray localPByteArray = new PByteArray();
    try
    {
      byte[] arrayOfByte = aeQ().toByteArray();
      synchronized (jRd)
      {
        c.a(arrayOfByte, jRe, (short)getType(), localPByteArray, jLd);
        if (jRc != null) {
          jRc.i(jRe, localPByteArray.value);
        }
        w.i("MicroMsg.BackupBaseScene", "BackupBaseScene doscene globalSeq:%d, isDirect:%b, type:%d, len:%d", new Object[] { Integer.valueOf(jRe), Boolean.valueOf(paramBoolean), Integer.valueOf(getType()), Integer.valueOf(localPByteArray.value.length) });
        if (!paramBoolean) {
          jRd.put(Integer.valueOf(jRe), this);
        }
        jRe += 1;
        GMTrace.o(9507178545152L, 70834);
        return true;
      }
      return false;
    }
    catch (Exception localException)
    {
      w.printErrStackTrace("MicroMsg.BackupBaseScene", localException, "req to buf fail: " + localException.toString(), new Object[0]);
      GMTrace.o(9507178545152L, 70834);
    }
  }
  
  public final void g(final int paramInt1, final int paramInt2, final String paramString)
  {
    GMTrace.i(9508386504704L, 70843);
    handler.post(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(9502749360128L, 70801);
        synchronized (b.hmO)
        {
          Set localSet = (Set)b.hmO.get(Integer.valueOf(b.this.getType()));
          if ((localSet != null) && (localSet.size() > 0))
          {
            ??? = new HashSet();
            ((Set)???).addAll(localSet);
            ??? = ((Set)???).iterator();
            while (((Iterator)???).hasNext())
            {
              com.tencent.mm.ac.e locale = (com.tencent.mm.ac.e)((Iterator)???).next();
              if ((locale != null) && (localSet.contains(locale))) {
                locale.a(paramInt1, paramInt2, paramString, b.this);
              }
            }
          }
        }
        GMTrace.o(9502749360128L, 70801);
      }
    });
    GMTrace.o(9508386504704L, 70843);
  }
  
  public abstract int getType();
  
  public static abstract interface a
  {
    public abstract void i(int paramInt, byte[] paramArrayOfByte);
    
    public abstract int j(int paramInt, byte[] paramArrayOfByte);
  }
  
  public static abstract interface b
  {
    public abstract void aeq();
  }
  
  public static abstract interface c
  {
    public abstract void a(boolean paramBoolean, int paramInt1, byte[] paramArrayOfByte, int paramInt2);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/backup/f/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */