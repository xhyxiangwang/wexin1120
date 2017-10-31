package com.tencent.mm.plugin.backup.g;

import android.os.Looper;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.a.e;
import com.tencent.mm.bt.g;
import com.tencent.mm.compatible.d.p;
import com.tencent.mm.g.a.aa;
import com.tencent.mm.g.a.om;
import com.tencent.mm.pointers.PLong;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.af.a;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.j;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.x.ap;
import java.io.File;
import java.util.HashMap;
import junit.framework.Assert;

public final class a
  extends com.tencent.mm.plugin.backup.a.a
{
  public static String TAG;
  private static a jRO;
  public static int jRR;
  private c jRP;
  private b jRQ;
  
  static
  {
    GMTrace.i(14860586844160L, 110720);
    TAG = "MicroMsg.BackupTempDbModel";
    jRR = 0;
    GMTrace.o(14860586844160L, 110720);
  }
  
  public a()
  {
    GMTrace.i(14857902489600L, 110700);
    GMTrace.o(14857902489600L, 110700);
  }
  
  private static void AR()
  {
    GMTrace.i(14859513102336L, 110712);
    aa localaa = new aa();
    com.tencent.mm.sdk.b.a.uLm.m(localaa);
    GMTrace.o(14859513102336L, 110712);
  }
  
  public static a afe()
  {
    GMTrace.i(14858036707328L, 110701);
    if (jRO == null)
    {
      locala = new a();
      jRO = locala;
      a(locala);
    }
    a locala = jRO;
    GMTrace.o(14858036707328L, 110701);
    return locala;
  }
  
  public static void afi()
  {
    GMTrace.i(16050427002880L, 119585);
    long l = bg.Pp();
    ap.AS();
    com.tencent.mm.x.c.yF();
    Object localObject = new StringBuilder();
    ap.AS();
    localObject = com.tencent.mm.x.c.xf() + ".tem";
    ap.AS();
    j.r((String)localObject, com.tencent.mm.x.c.xf(), false);
    localObject = new StringBuilder();
    ap.AS();
    localObject = com.tencent.mm.x.c.xg() + ".tem";
    ap.AS();
    j.r((String)localObject, com.tencent.mm.x.c.xg(), false);
    com.tencent.mm.kernel.h.xx().release();
    com.tencent.mm.kernel.h.xx().initialize();
    afj();
    AR();
    w.i(TAG, "recoverFromTempDBImp finish :%d", new Object[] { Long.valueOf(bg.aF(l)) });
    GMTrace.o(16050427002880L, 119585);
  }
  
  public static void afj()
  {
    GMTrace.i(14859378884608L, 110711);
    StringBuilder localStringBuilder = new StringBuilder();
    ap.AS();
    com.tencent.mm.loader.stub.b.deleteFile(com.tencent.mm.x.c.xf() + ".tem");
    localStringBuilder = new StringBuilder();
    ap.AS();
    com.tencent.mm.loader.stub.b.deleteFile(com.tencent.mm.x.c.xf() + ".ini.tem");
    localStringBuilder = new StringBuilder();
    ap.AS();
    com.tencent.mm.loader.stub.b.deleteFile(com.tencent.mm.x.c.xg() + ".tem");
    localStringBuilder = new StringBuilder();
    ap.AS();
    com.tencent.mm.loader.stub.b.deleteFile(com.tencent.mm.x.c.xg() + ".ini.tem");
    GMTrace.o(14859378884608L, 110711);
  }
  
  public static boolean afk()
  {
    GMTrace.i(16050561220608L, 119586);
    com.tencent.mm.kernel.h.xx().wH();
    GMTrace.o(16050561220608L, 119586);
    return true;
  }
  
  public final void a(a parama, boolean paramBoolean, final int paramInt)
  {
    GMTrace.i(14858707795968L, 110706);
    final long l = bg.Pp();
    w.i(TAG, "initTempDB needSyncPauser:%b %s", new Object[] { Boolean.valueOf(paramBoolean), bg.bOd() });
    af.i(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(14857768271872L, 110699);
        a.afk();
        w.i(a.TAG, "initTempDB, initTempDBCount:%d  timediff:%d ", new Object[] { Integer.valueOf(a.jRR), Long.valueOf(bg.aF(l)) });
        a.jRR += 1;
        ap.xC().a(new af.a()
        {
          public final boolean Dj()
          {
            GMTrace.i(14857097183232L, 110694);
            a.afj();
            PLong localPLong1 = new PLong();
            PLong localPLong2 = new PLong();
            PLong localPLong3 = new PLong();
            a.this.a(localPLong1, localPLong2, localPLong3, a.1.this.jRS, a.1.this.jRT);
            GMTrace.o(14857097183232L, 110694);
            return true;
          }
          
          public final boolean Dk()
          {
            GMTrace.i(14856962965504L, 110693);
            w.i(a.TAG, "initTempDB onPostExecute");
            a.1.this.jRS.run();
            a.jRR -= 1;
            GMTrace.o(14856962965504L, 110693);
            return false;
          }
          
          public final String toString()
          {
            GMTrace.i(14857231400960L, 110695);
            String str = super.toString() + "|initTempDB";
            GMTrace.o(14857231400960L, 110695);
            return str;
          }
        });
        GMTrace.o(14857768271872L, 110699);
      }
    }, 1000L);
    GMTrace.o(14858707795968L, 110706);
  }
  
  public final void a(final Runnable paramRunnable, final int paramInt)
  {
    GMTrace.i(14859244666880L, 110710);
    if ((paramInt < 0) || (jRR == 0))
    {
      if (paramInt < 0) {
        w.e(TAG, "closeTempDB no left tryCount!!");
      }
      w.i(TAG, "closeDB before");
      aff().yF();
      w.i(TAG, "closeDB after");
      if (paramRunnable != null)
      {
        paramRunnable.run();
        GMTrace.o(14859244666880L, 110710);
      }
    }
    else
    {
      new ae(Looper.getMainLooper()).postDelayed(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(14856426094592L, 110689);
          a.this.a(paramRunnable, paramInt - 1);
          GMTrace.o(14856426094592L, 110689);
        }
      }, 500L);
    }
    GMTrace.o(14859244666880L, 110710);
  }
  
  public final boolean a(PLong paramPLong1, PLong paramPLong2, PLong paramPLong3, a parama, int paramInt)
  {
    GMTrace.i(14858842013696L, 110707);
    ap.AS();
    com.tencent.mm.x.c.yF();
    w.d(TAG, "initTempDBimp after close db");
    ap.AS();
    int i = e.aY(com.tencent.mm.x.c.xf());
    ap.AS();
    paramPLong3.value = (i + e.aY(com.tencent.mm.x.c.xg()));
    long l = paramPLong3.value;
    ap.AS();
    if (!com.tencent.mm.plugin.backup.a.h.a(l, paramPLong1, paramPLong2, com.tencent.mm.x.c.zp()))
    {
      w.e(TAG, "data free error, len %d", new Object[] { Long.valueOf(paramPLong3.value) });
      parama.jSc = false;
      parama.jSd = paramPLong1.value;
      parama.jSe = paramPLong2.value;
      parama.dbSize = paramPLong3.value;
      GMTrace.o(14858842013696L, 110707);
      return false;
    }
    ap.AS();
    Object localObject1 = com.tencent.mm.x.c.xf();
    Object localObject2 = new StringBuilder();
    ap.AS();
    j.r((String)localObject1, com.tencent.mm.x.c.xf() + ".tem", false);
    ap.AS();
    localObject1 = com.tencent.mm.x.c.xg();
    localObject2 = new StringBuilder();
    ap.AS();
    j.r((String)localObject1, com.tencent.mm.x.c.xg() + ".tem", false);
    w.i(TAG, "initTempDBimp before resetAccUin");
    com.tencent.mm.kernel.h.xx().release();
    com.tencent.mm.kernel.h.xx().initialize();
    w.i(TAG, "initTempDBimp before closeDB");
    w.i(TAG, "initTempDBimp before TemAccStg setAccInfo");
    localObject1 = aff();
    ap.AS();
    localObject2 = com.tencent.mm.x.c.zp();
    ap.AS();
    Object localObject3 = com.tencent.mm.x.c.zo();
    ap.AS();
    ((c)localObject1).k((String)localObject2, (String)localObject3, com.tencent.mm.x.c.wy());
    w.i(TAG, "initTempDBimp before TemAccStg initDB");
    localObject1 = aff();
    localObject2 = new StringBuilder();
    ap.AS();
    localObject2 = com.tencent.mm.x.c.xf() + ".tem";
    ap.AS();
    i = com.tencent.mm.x.c.wy();
    localObject3 = new StringBuilder();
    ap.AS();
    localObject3 = com.tencent.mm.x.c.xg() + ".tem";
    w.i("MicroMsg.TempStorage", "initDB isTempDB:%s  cache:%s uin:%s db:%s %s", new Object[] { ((c)localObject1).jSx, localObject2, Integer.valueOf(i), localObject3, bg.bOd() });
    String str;
    if (paramInt > 0)
    {
      if ((((c)localObject1).jSx != null) && (!((c)localObject1).jSx.booleanValue()))
      {
        w.e("MicroMsg.TempStorage", "initDB isTempDB is false!!!");
        ((c)localObject1).yF();
      }
      str = "initDB here  isTempDb should null :" + ((c)localObject1).jSx;
      if (((c)localObject1).jSx != null) {
        break label595;
      }
    }
    label595:
    for (boolean bool = true;; bool = false)
    {
      Assert.assertTrue(str, bool);
      ((c)localObject1).jSx = Boolean.valueOf(true);
      ((c)localObject1).gRs = new g(new c.1((c)localObject1));
      if (((c)localObject1).gRs.a((String)localObject2, (String)localObject3, "", i, p.te(), new HashMap(), false)) {
        break;
      }
      throw new com.tencent.mm.x.b((byte)0);
    }
    ((c)localObject1).afl();
    w.i(TAG, "initTempDBimp after TemAccStg initDB");
    AR();
    parama.jSc = true;
    parama.jSd = paramPLong1.value;
    parama.jSe = paramPLong2.value;
    parama.dbSize = paramPLong3.value;
    com.tencent.mm.plugin.backup.a.h.sJ(com.tencent.mm.plugin.backup.a.h.adP());
    GMTrace.o(14858842013696L, 110707);
    return true;
  }
  
  public final void adA()
  {
    GMTrace.i(14858170925056L, 110702);
    jRO = null;
    GMTrace.o(14858170925056L, 110702);
  }
  
  public final c aff()
  {
    GMTrace.i(14858305142784L, 110703);
    if (this.jRP == null) {
      this.jRP = new c();
    }
    c localc = this.jRP;
    GMTrace.o(14858305142784L, 110703);
    return localc;
  }
  
  public final b afg()
  {
    GMTrace.i(14858439360512L, 110704);
    if (this.jRQ == null) {
      this.jRQ = new b();
    }
    b localb = this.jRQ;
    GMTrace.o(14858439360512L, 110704);
    return localb;
  }
  
  public final void afh()
  {
    GMTrace.i(14858573578240L, 110705);
    w.i(TAG, "backupInitTempDb");
    c localc = aff();
    ap.AS();
    Object localObject = com.tencent.mm.x.c.zp();
    ap.AS();
    String str = com.tencent.mm.x.c.zo();
    ap.AS();
    localc.k((String)localObject, str, com.tencent.mm.x.c.wy());
    localc = aff();
    ap.AS();
    localObject = com.tencent.mm.x.c.yI();
    w.i("MicroMsg.TempStorage", "setDataDB isTempDb:%s db:%s %s", new Object[] { localc.jSx, localObject, bg.bOd() });
    localc.jSx = Boolean.valueOf(false);
    localc.gRs = ((g)localObject);
    localc.afl();
    GMTrace.o(14858573578240L, 110705);
  }
  
  public final void n(final Runnable paramRunnable)
  {
    GMTrace.i(14858976231424L, 110708);
    a(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(14857499836416L, 110697);
        w.i(a.TAG, "recoverFromTempDB closeTempDB ok");
        w.bMS();
        ap.xC().a(new af.a()
        {
          public final boolean Dj()
          {
            GMTrace.i(14855755005952L, 110684);
            w.i(a.TAG, "doInBackground start");
            w.bMS();
            a.afi();
            e.f(new File(com.tencent.mm.plugin.backup.a.h.adP()));
            b localb = a.this.afg();
            localb.handler.post(new b.2(localb));
            w.i(a.TAG, "doInBackground end");
            w.bMS();
            GMTrace.o(14855755005952L, 110684);
            return true;
          }
          
          public final boolean Dk()
          {
            GMTrace.i(14855620788224L, 110683);
            a.2.this.jRW.run();
            com.tencent.mm.sdk.b.a.uLm.m(new om());
            GMTrace.o(14855620788224L, 110683);
            return false;
          }
          
          public final String toString()
          {
            GMTrace.i(14855889223680L, 110685);
            String str = super.toString() + "|recoverFromTempDB";
            GMTrace.o(14855889223680L, 110685);
            return str;
          }
        });
        GMTrace.o(14857499836416L, 110697);
      }
    }, 10);
    GMTrace.o(14858976231424L, 110708);
  }
  
  public final void o(final Runnable paramRunnable)
  {
    GMTrace.i(14859110449152L, 110709);
    w.i(TAG, "backupCloseTempDb");
    a(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(14856694530048L, 110691);
        w.i(a.TAG, "backupFromTempDB closeTempDB ok");
        w.bMS();
        ap.xC().a(new af.a()
        {
          public final boolean Dj()
          {
            GMTrace.i(14854681264128L, 110676);
            w.i(a.TAG, "doInBackground.");
            a.afj();
            GMTrace.o(14854681264128L, 110676);
            return true;
          }
          
          public final boolean Dk()
          {
            GMTrace.i(14854547046400L, 110675);
            a.3.this.jRY.run();
            GMTrace.o(14854547046400L, 110675);
            return false;
          }
          
          public final String toString()
          {
            GMTrace.i(14854815481856L, 110677);
            String str = super.toString() + "|backupcloseTempDB";
            GMTrace.o(14854815481856L, 110677);
            return str;
          }
        });
        GMTrace.o(14856694530048L, 110691);
      }
    }, 10);
    GMTrace.o(14859110449152L, 110709);
  }
  
  public static class a
    implements Runnable
  {
    public long dbSize;
    public boolean jSc;
    public long jSd;
    public long jSe;
    
    public a()
    {
      GMTrace.i(14854949699584L, 110678);
      this.jSc = true;
      this.dbSize = 0L;
      this.jSd = 0L;
      this.jSe = 0L;
      GMTrace.o(14854949699584L, 110678);
    }
    
    public void run()
    {
      GMTrace.i(14855083917312L, 110679);
      GMTrace.o(14855083917312L, 110679);
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/backup/g/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */