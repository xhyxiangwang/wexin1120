package com.tencent.mm.plugin.sns.a.b;

import android.database.Cursor;
import android.os.SystemClock;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ac.k;
import com.tencent.mm.ac.n;
import com.tencent.mm.bt.g;
import com.tencent.mm.kernel.h;
import com.tencent.mm.plugin.sns.storage.p;
import com.tencent.mm.protocal.c.ajl;
import com.tencent.mm.protocal.c.bdi;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.am;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import com.tencent.mm.storage.w.a;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public final class i
  implements com.tencent.mm.ac.e
{
  public static int pWS;
  public static int pWT;
  public static int pWU;
  public static int pWV;
  public static int pWW;
  public static int pWX;
  int pWR;
  public long pWY;
  public bdi pWZ;
  public boolean pXa;
  long pXb;
  int pXc;
  private Random random;
  
  static
  {
    GMTrace.i(8172920111104L, 60893);
    pWS = 20480;
    pWT = 30720;
    pWU = 51200;
    pWV = 60;
    pWW = 1800;
    pWX = 43200;
    GMTrace.o(8172920111104L, 60893);
  }
  
  public i()
  {
    GMTrace.i(8171175280640L, 60880);
    this.pWR = 0;
    this.pWY = 0L;
    this.random = new Random(System.currentTimeMillis());
    this.pWZ = new bdi();
    this.pXa = false;
    this.pXb = 0L;
    this.pXc = 0;
    GMTrace.o(8171175280640L, 60880);
  }
  
  private void bfV()
  {
    GMTrace.i(8171577933824L, 60883);
    com.tencent.mm.plugin.sns.model.ae.bhc().post(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(8168088272896L, 60857);
        if ((System.currentTimeMillis() - i.this.pWY >= 60000L) || (i.this.pWZ.tuT.size() > 1000))
        {
          if ((i.this.pWZ != null) && (i.this.pWZ.tuT.size() > 0)) {
            i.this.bfX();
          }
          i.this.pWY = 0L;
        }
        GMTrace.o(8168088272896L, 60857);
      }
    });
    GMTrace.o(8171577933824L, 60883);
  }
  
  private void bfW()
  {
    GMTrace.i(8171712151552L, 60884);
    com.tencent.mm.plugin.sns.model.ae.bhc().post(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(8161511604224L, 60808);
        i locali = i.this;
        if ((bg.aG(locali.pXb) < 100L) && (locali.pXc > 0)) {}
        LinkedList localLinkedList;
        Object localObject2;
        int k;
        for (int j = locali.pXc;; j = locali.pXc)
        {
          localLinkedList = new LinkedList();
          localObject2 = com.tencent.mm.plugin.sns.model.ae.bhi().cZ(j, locali.pWR);
          if (((bdi)localObject2).tuT.size() != 0) {
            break;
          }
          str = "read from memery";
          i = 0;
          for (;;)
          {
            k = i;
            localObject1 = str;
            if (locali.pWZ.tuT.size() <= 0) {
              break;
            }
            localObject2 = (ajl)locali.pWZ.tuT.remove();
            k = i;
            localObject1 = str;
            if (((ajl)localObject2).uey.toK.length + i >= j) {
              break;
            }
            i += ((ajl)localObject2).uey.toK.length;
            localLinkedList.add(localObject2);
          }
          locali.pXc = i.pWS;
          if (am.isWifi(ab.getContext())) {
            locali.pXc = i.pWU;
          }
          if ((am.is3G(ab.getContext())) || (am.is4G(ab.getContext()))) {
            locali.pXc = i.pWT;
          }
          if (am.is2G(ab.getContext())) {
            locali.pXc = i.pWS;
          }
          locali.pXb = SystemClock.elapsedRealtime();
        }
        String str = "read from db";
        for (int i = 0;; i = ((ajl)localObject1).uey.toK.length + i)
        {
          k = i;
          localObject1 = str;
          if (((bdi)localObject2).tuT.size() <= 0) {
            break;
          }
          localObject1 = (ajl)((bdi)localObject2).tuT.remove();
          localLinkedList.add(localObject1);
        }
        if (localLinkedList.size() == 0)
        {
          w.i("MicroMsg.SnsLogMgr", "nothing for report");
          GMTrace.o(8161511604224L, 60808);
          return;
        }
        w.i("MicroMsg.SnsLogMgr", "size " + k + " " + localLinkedList.size() + " " + j + " logItemList.LogList.size  " + locali.pWZ.tuT.size() + " label:  " + (String)localObject1);
        Object localObject1 = new e(localLinkedList);
        h.xA();
        h.xy().gQO.a((k)localObject1, 0);
        GMTrace.o(8161511604224L, 60808);
      }
    });
    GMTrace.o(8171712151552L, 60884);
  }
  
  public static String l(Object... paramVarArgs)
  {
    GMTrace.i(8171846369280L, 60885);
    if ((paramVarArgs == null) || (paramVarArgs.length <= 0)) {
      w.w("MicroMsg.SnsLogMgr", "vals is null, use '' as value");
    }
    StringBuilder localStringBuilder;
    for (paramVarArgs = "";; paramVarArgs = localStringBuilder.toString())
    {
      GMTrace.o(8171846369280L, 60885);
      return paramVarArgs;
      localStringBuilder = new StringBuilder();
      int j = paramVarArgs.length - 1;
      int i = 0;
      while (i < j)
      {
        localStringBuilder.append(String.valueOf(paramVarArgs[i])).append(',');
        i += 1;
      }
      localStringBuilder.append(String.valueOf(paramVarArgs[j]));
    }
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(8171980587008L, 60886);
    if ((paramk.getType() == 1802) && ((paramk instanceof e)))
    {
      paramString = (e)paramk;
      if ((paramInt1 == 0) && (paramInt2 == 0))
      {
        h.xA();
        h.xz().xi().a(w.a.uWe, Integer.valueOf((int)(System.currentTimeMillis() / 1000L)));
        bfW();
        GMTrace.o(8171980587008L, 60886);
        return;
      }
      Object localObject = paramString.pWo;
      paramString = com.tencent.mm.plugin.sns.model.ae.bhi();
      paramk = new bdi();
      localObject = ((List)localObject).iterator();
      while (((Iterator)localObject).hasNext())
      {
        ajl localajl = (ajl)((Iterator)localObject).next();
        paramk.tuT.add(localajl);
      }
      paramString.a(paramk);
    }
    GMTrace.o(8171980587008L, 60886);
  }
  
  public final void bfU()
  {
    GMTrace.i(8171443716096L, 60882);
    if (!com.tencent.mm.plugin.sns.model.ae.qcK)
    {
      GMTrace.o(8171443716096L, 60882);
      return;
    }
    h.xA();
    int k = ((Integer)h.xz().xi().get(w.a.uWe, Integer.valueOf(0))).intValue();
    h.xA();
    int j = ((Integer)h.xz().xi().get(w.a.uWd, Integer.valueOf(-1))).intValue();
    if (j <= pWX)
    {
      i = j;
      if (j >= 0) {}
    }
    else
    {
      i = pWW;
      j = pWV;
      i = this.random.nextInt(i - j + 1) + pWV;
    }
    if (System.currentTimeMillis() / 1000L - k > i) {}
    for (int i = 1; i == 0; i = 0)
    {
      bfV();
      w.d("MicroMsg.SnsLogMgr", "pass report ");
      GMTrace.o(8171443716096L, 60882);
      return;
    }
    Object localObject = com.tencent.mm.plugin.sns.model.ae.bhi();
    w.i("MicroMsg.SnsKvReportStg", " getLast " + "select rowid from SnsReportKv order by rowid desc  limit 1");
    localObject = ((p)localObject).hhi.a("select rowid from SnsReportKv order by rowid desc  limit 1", null, 2);
    if (((Cursor)localObject).moveToFirst()) {}
    for (i = ((Cursor)localObject).getInt(0);; i = 0)
    {
      ((Cursor)localObject).close();
      this.pWR = i;
      bfW();
      bfV();
      GMTrace.o(8171443716096L, 60882);
      return;
    }
  }
  
  public final void bfX()
  {
    GMTrace.i(16042373939200L, 119525);
    if (this.pWZ.tuT.size() > 0)
    {
      w.i("MicroMsg.SnsLogMgr", "trigerSave " + this.pWZ.tuT.size());
      com.tencent.mm.plugin.sns.model.ae.bhi().a(this.pWZ);
      this.pWZ.tuT.clear();
    }
    GMTrace.o(16042373939200L, 119525);
  }
  
  public final void i(final int paramInt, final Object... paramVarArgs)
  {
    GMTrace.i(8171309498368L, 60881);
    com.tencent.mm.plugin.sns.model.ae.bhc().post(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(8159498338304L, 60793);
        ajl localajl = new ajl();
        localajl.uex = paramInt;
        localajl.ueF = ((int)(System.currentTimeMillis() / 1000L));
        localajl.jWQ = 1;
        String str = i.l(paramVarArgs);
        localajl.uey = new com.tencent.mm.bl.b(str.getBytes());
        i.this.pWZ.tuT.add(localajl);
        w.i("MicroMsg.SnsLogMgr", "snsadlog " + paramInt + " " + str);
        if (i.this.pWY == 0L) {
          i.this.pWY = System.currentTimeMillis();
        }
        GMTrace.o(8159498338304L, 60793);
      }
    });
    if (this.pXa)
    {
      GMTrace.o(8171309498368L, 60881);
      return;
    }
    this.pXa = true;
    com.tencent.mm.plugin.sns.model.ae.bhc().postDelayed(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(8164867047424L, 60833);
        i.this.pXa = false;
        i.this.bfU();
        GMTrace.o(8164867047424L, 60833);
      }
    }, 2000L);
    GMTrace.o(8171309498368L, 60881);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/sns/a/b/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */