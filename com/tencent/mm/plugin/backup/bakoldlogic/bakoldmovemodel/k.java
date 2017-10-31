package com.tencent.mm.plugin.backup.bakoldlogic.bakoldmovemodel;

import android.os.Looper;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.a.qm;
import com.tencent.mm.plugin.backup.b.f;
import com.tencent.mm.plugin.backup.e.a.b;
import com.tencent.mm.plugin.backup.g.a.a;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.plugin.zero.b.b;
import com.tencent.mm.protocal.c.eh;
import com.tencent.mm.protocal.c.ei;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import com.tencent.mm.storage.w.a;
import com.tencent.mm.x.ap;
import com.tencent.mm.x.bo;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class k
{
  public static int jLd;
  private boolean hng;
  final int jMA;
  private long jMB;
  public b jMD;
  private com.tencent.mm.sdk.b.c<qm> jME;
  private boolean jMx;
  private long jTJ;
  public d jTz;
  public final List<String> jUm;
  public int jUn;
  public int jUo;
  public int jUp;
  public int jUq;
  private Object lock;
  
  public k(List<String> paramList, int paramInt)
  {
    GMTrace.i(14749454565376L, 109892);
    this.jMx = false;
    this.lock = new Object();
    this.jUn = 0;
    this.jUo = 0;
    this.jUp = 0;
    this.jUq = 0;
    this.jMB = 0L;
    this.jMD = ((b)com.tencent.mm.kernel.h.h(b.class));
    this.jTJ = 0L;
    w.i("MicroMsg.RecoverMerger", "new RecoverMerger, msgDataIdList size:%d, totalSession:%d", new Object[] { Integer.valueOf(paramList.size()), Integer.valueOf(paramInt) });
    this.jUm = paramList;
    this.jMA = paramInt;
    GMTrace.o(14749454565376L, 109892);
  }
  
  public final int a(String paramString, HashMap<String, Integer> paramHashMap, com.tencent.mm.plugin.backup.bakoldlogic.bakoldmodel.c paramc, HashSet<String> paramHashSet)
  {
    GMTrace.i(14749991436288L, 109896);
    l = System.currentTimeMillis();
    localObject1 = com.tencent.mm.a.e.d(paramString, 0, -1);
    try
    {
      localei = (ei)new ei().aC((byte[])localObject1);
      paramString = localei.jWR.iterator();
    }
    catch (Exception paramHashMap)
    {
      ei localei;
      for (;;)
      {
        synchronized (this.lock)
        {
          if (this.hng)
          {
            g.paX.i(11790, new Object[] { Integer.valueOf(0), Integer.valueOf(0) });
            w.i("MicroMsg.RecoverMerger", "backupImp canceled");
            GMTrace.o(14749991436288L, 109896);
            return -1;
            paramHashMap = paramHashMap;
            if (localObject1 == null)
            {
              i = 0;
              w.printErrStackTrace("MicroMsg.RecoverMerger", paramHashMap, "read mmPath errr %s, %s, len:%d", new Object[] { paramString, paramHashMap, Integer.valueOf(i) });
              GMTrace.o(14749991436288L, 109896);
              return 0;
            }
            i = localObject1.length;
            continue;
          }
          if (bg.aF(this.jMB) > 1800000L)
          {
            this.jMD.bFO().S(3600000L);
            this.jMB = bg.Pp();
          }
        }
        try
        {
          a.b.a((eh)localObject1, paramHashMap, paramHashSet, new HashMap());
          this.jUq += 1;
          bI(this.jUq, this.jUn);
          f.kn(((eh)localObject1).jXP);
          paramc.afs();
          continue;
          paramString = finally;
          throw paramString;
        }
        catch (Exception localException)
        {
          for (;;)
          {
            w.printErrStackTrace("MicroMsg.RecoverMerger", localException, "readFromSdcard err", new Object[0]);
          }
        }
      }
      f.adX();
      w.d("MicroMsg.RecoverMerger", "read item time " + (System.currentTimeMillis() - l));
      int i = localei.jWR.size();
      GMTrace.o(14749991436288L, 109896);
      return i;
    }
    if (paramString.hasNext()) {
      localObject1 = (eh)paramString.next();
    }
  }
  
  public final void adV()
  {
    GMTrace.i(14750259871744L, 109898);
    synchronized (this.lock)
    {
      this.lock.notifyAll();
      this.jTz = null;
      this.jMx = false;
      this.jUn = 0;
      this.jUo = 0;
      this.jUp = 0;
      GMTrace.o(14750259871744L, 109898);
      return;
    }
  }
  
  public final void adW()
  {
    GMTrace.i(14750394089472L, 109899);
    if (this.jME != null)
    {
      com.tencent.mm.sdk.b.a.uLm.c(this.jME);
      this.jME = null;
    }
    GMTrace.o(14750394089472L, 109899);
  }
  
  /* Error */
  public final void afG()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: ldc2_w 280
    //   5: ldc_w 282
    //   8: invokestatic 53	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   11: aload_0
    //   12: getfield 55	com/tencent/mm/plugin/backup/bakoldlogic/bakoldmovemodel/k:jMx	Z
    //   15: ifeq +23 -> 38
    //   18: ldc 81
    //   20: ldc_w 284
    //   23: invokestatic 287	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   26: ldc2_w 280
    //   29: ldc_w 282
    //   32: invokestatic 107	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   35: aload_0
    //   36: monitorexit
    //   37: return
    //   38: aload_0
    //   39: iconst_1
    //   40: putfield 55	com/tencent/mm/plugin/backup/bakoldlogic/bakoldmovemodel/k:jMx	Z
    //   43: ldc 81
    //   45: ldc_w 289
    //   48: invokestatic 174	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   51: bipush -22
    //   53: putstatic 291	com/tencent/mm/plugin/backup/bakoldlogic/bakoldmovemodel/k:jLd	I
    //   56: aload_0
    //   57: getfield 268	com/tencent/mm/plugin/backup/bakoldlogic/bakoldmovemodel/k:jME	Lcom/tencent/mm/sdk/b/c;
    //   60: ifnonnull +26 -> 86
    //   63: aload_0
    //   64: new 6	com/tencent/mm/plugin/backup/bakoldlogic/bakoldmovemodel/k$1
    //   67: dup
    //   68: aload_0
    //   69: invokespecial 294	com/tencent/mm/plugin/backup/bakoldlogic/bakoldmovemodel/k$1:<init>	(Lcom/tencent/mm/plugin/backup/bakoldlogic/bakoldmovemodel/k;)V
    //   72: putfield 268	com/tencent/mm/plugin/backup/bakoldlogic/bakoldmovemodel/k:jME	Lcom/tencent/mm/sdk/b/c;
    //   75: getstatic 274	com/tencent/mm/sdk/b/a:uLm	Lcom/tencent/mm/sdk/b/a;
    //   78: aload_0
    //   79: getfield 268	com/tencent/mm/plugin/backup/bakoldlogic/bakoldmovemodel/k:jME	Lcom/tencent/mm/sdk/b/c;
    //   82: invokevirtual 297	com/tencent/mm/sdk/b/a:b	(Lcom/tencent/mm/sdk/b/c;)Z
    //   85: pop
    //   86: aload_0
    //   87: getfield 77	com/tencent/mm/plugin/backup/bakoldlogic/bakoldmovemodel/k:jMD	Lcom/tencent/mm/plugin/zero/b/b;
    //   90: invokeinterface 192 1 0
    //   95: ldc2_w 193
    //   98: invokevirtual 200	com/tencent/mm/x/bo:S	(J)Z
    //   101: pop
    //   102: ldc2_w 280
    //   105: ldc_w 282
    //   108: invokestatic 107	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   111: goto -76 -> 35
    //   114: astore_1
    //   115: aload_0
    //   116: monitorexit
    //   117: aload_1
    //   118: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	119	0	this	k
    //   114	4	1	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   2	35	114	finally
    //   38	86	114	finally
    //   86	111	114	finally
  }
  
  public final void bI(final int paramInt1, final int paramInt2)
  {
    GMTrace.i(14749857218560L, 109895);
    if ((this.jTJ != 0L) && (bg.aG(this.jTJ) < 100L))
    {
      GMTrace.o(14749857218560L, 109895);
      return;
    }
    this.jTJ = bg.Pq();
    if ((!this.hng) && (this.jTz != null)) {
      af.u(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(14747709734912L, 109879);
          if (k.this.jTz != null)
          {
            k.this.jTz.bH(paramInt1, paramInt2);
            GMTrace.o(14747709734912L, 109879);
            return;
          }
          w.e("MicroMsg.RecoverMerger", "operatorCallback is null.");
          GMTrace.o(14747709734912L, 109879);
        }
      });
    }
    GMTrace.o(14749857218560L, 109895);
  }
  
  public final void cancel()
  {
    GMTrace.i(14750125654016L, 109897);
    synchronized (this.lock)
    {
      w.i("MicroMsg.RecoverMerger", "cancel");
      this.hng = true;
      this.jMD.bFO().BO();
      adW();
      w.i("MicroMsg.RecoverMerger", "recover cancel and restart sync");
      adV();
      GMTrace.o(14750125654016L, 109897);
      return;
    }
  }
  
  public final int getItemCount()
  {
    GMTrace.i(14749723000832L, 109894);
    Iterator localIterator = this.jUm.iterator();
    int i = 0;
    while (localIterator.hasNext())
    {
      Object localObject = (String)localIterator.next();
      try
      {
        localObject = com.tencent.mm.a.e.d(com.tencent.mm.plugin.backup.a.h.adP() + "backupItem/" + com.tencent.mm.plugin.backup.bakoldlogic.a.d.sN((String)localObject) + (String)localObject, 0, -1);
        int j = ((ei)new ei().aC((byte[])localObject)).jWR.size();
        i = j + i;
      }
      catch (Exception localException)
      {
        w.printErrStackTrace("MicroMsg.RecoverMerger", localException, "getItemCount: ", new Object[0]);
      }
    }
    GMTrace.o(14749723000832L, 109894);
    return i;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/backup/bakoldlogic/bakoldmovemodel/k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */