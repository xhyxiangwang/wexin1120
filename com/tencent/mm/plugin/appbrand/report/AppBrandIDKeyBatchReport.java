package com.tencent.mm.plugin.appbrand.report;

import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.util.DisplayMetrics;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ac.b.a;
import com.tencent.mm.ac.b.b;
import com.tencent.mm.ac.b.c;
import com.tencent.mm.ac.k;
import com.tencent.mm.ac.u;
import com.tencent.mm.ac.u.a;
import com.tencent.mm.plugin.appbrand.ipc.AppBrandMainProcessService;
import com.tencent.mm.plugin.appbrand.ipc.MainProcessTask;
import com.tencent.mm.protocal.c.awr;
import com.tencent.mm.protocal.c.bsk;
import com.tencent.mm.protocal.c.bsl;
import com.tencent.mm.protocal.c.bsq;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.aj;
import com.tencent.mm.sdk.platformtools.aj.a;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock;
import java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock;

public final class AppBrandIDKeyBatchReport
{
  private static volatile IDKeyBatchReportTask jnN;
  
  public static IDKeyBatchReportTask Zx()
  {
    GMTrace.i(10628836098048L, 79191);
    if (jnN == null) {
      jnN = new IDKeyBatchReportTask();
    }
    IDKeyBatchReportTask localIDKeyBatchReportTask = jnN;
    GMTrace.o(10628836098048L, 79191);
    return localIDKeyBatchReportTask;
  }
  
  public static String Zy()
  {
    GMTrace.i(16166122684416L, 120447);
    String str2 = com.tencent.mm.kernel.h.xz().cachePath;
    String str1 = str2;
    if (!str2.endsWith("/")) {
      str1 = str2 + "/";
    }
    str1 = str1 + "appbrand/report/";
    com.tencent.mm.sdk.platformtools.h.Mt(str1);
    GMTrace.o(16166122684416L, 120447);
    return str1;
  }
  
  public static String Zz()
  {
    GMTrace.i(16166256902144L, 120448);
    String str = Zy() + "WxaAppRecord";
    GMTrace.o(16166256902144L, 120448);
    return str;
  }
  
  public static void a(bsq parambsq)
  {
    GMTrace.i(16166391119872L, 120449);
    if (ab.bNe())
    {
      b.c(parambsq);
      GMTrace.o(16166391119872L, 120449);
      return;
    }
    a.b(parambsq);
    GMTrace.o(16166391119872L, 120449);
  }
  
  private static final class IDKeyBatchReportTask
    extends MainProcessTask
  {
    public static final Parcelable.Creator<IDKeyBatchReportTask> CREATOR;
    public int jnP;
    int jnQ;
    bsq jnR;
    
    static
    {
      GMTrace.i(10624541130752L, 79159);
      CREATOR = new Parcelable.Creator() {};
      GMTrace.o(10624541130752L, 79159);
    }
    
    IDKeyBatchReportTask()
    {
      GMTrace.i(10622393647104L, 79143);
      GMTrace.o(10622393647104L, 79143);
    }
    
    IDKeyBatchReportTask(Parcel paramParcel)
    {
      GMTrace.i(10622527864832L, 79144);
      f(paramParcel);
      GMTrace.o(10622527864832L, 79144);
    }
    
    public final void RS()
    {
      GMTrace.i(10622662082560L, 79145);
      if (1 == this.jnP)
      {
        AppBrandIDKeyBatchReport.b.jp(0);
        AppBrandIDKeyBatchReport.b.ZA();
        GMTrace.o(10622662082560L, 79145);
        return;
      }
      if (2 == this.jnP)
      {
        AppBrandIDKeyBatchReport.b.ZB();
        GMTrace.o(10622662082560L, 79145);
        return;
      }
      if (3 == this.jnP) {
        AppBrandIDKeyBatchReport.b.c(this.jnR);
      }
      GMTrace.o(10622662082560L, 79145);
    }
    
    public final void f(Parcel paramParcel)
    {
      GMTrace.i(10622796300288L, 79146);
      this.jnP = paramParcel.readInt();
      this.jnQ = paramParcel.readInt();
      if (3 == this.jnP) {
        try
        {
          this.jnR = new bsq();
          this.jnR.aC(paramParcel.createByteArray());
          GMTrace.o(10622796300288L, 79146);
          return;
        }
        catch (Exception paramParcel)
        {
          w.e("MicroMsg.AppBrandIDKeyBatchReport", "parse WxaAppRecord from parcel, e = %s", new Object[] { paramParcel });
          this.jnR = null;
        }
      }
      GMTrace.o(10622796300288L, 79146);
    }
    
    public final void writeToParcel(Parcel paramParcel, int paramInt)
    {
      GMTrace.i(10622930518016L, 79147);
      paramParcel.writeInt(this.jnP);
      paramParcel.writeInt(this.jnQ);
      if (3 == this.jnP) {
        try
        {
          paramParcel.writeByteArray(this.jnR.toByteArray());
          GMTrace.o(10622930518016L, 79147);
          return;
        }
        catch (Exception paramParcel)
        {
          w.e("MicroMsg.AppBrandIDKeyBatchReport", "write WxaAppRecord to parcel, e = %s", new Object[] { paramParcel });
        }
      }
      GMTrace.o(10622930518016L, 79147);
    }
  }
  
  private static final class a
  {
    private static final byte[] jnO;
    
    static
    {
      GMTrace.i(16165451595776L, 120442);
      jnO = new byte[0];
      GMTrace.o(16165451595776L, 120442);
    }
    
    public static void b(bsq parambsq)
    {
      GMTrace.i(16165317378048L, 120441);
      synchronized (jnO)
      {
        AppBrandIDKeyBatchReport.Zx().jnR = parambsq;
        AppBrandIDKeyBatchReport.Zx().jnP = 3;
        AppBrandMainProcessService.a(AppBrandIDKeyBatchReport.Zx());
        GMTrace.o(16165317378048L, 120441);
        return;
      }
    }
  }
  
  private static final class b
  {
    private static volatile aj iUX;
    private static final ReentrantReadWriteLock jnS;
    private static volatile aj jnT;
    public static volatile int jnU;
    
    static
    {
      GMTrace.i(16164780507136L, 120437);
      jnS = new ReentrantReadWriteLock();
      iUX = null;
      jnT = null;
      GMTrace.o(16164780507136L, 120437);
    }
    
    public static void ZA()
    {
      GMTrace.i(16163840983040L, 120430);
      Object localObject1 = ZC();
      if (bg.bX((List)localObject1))
      {
        i = 0;
        if (i != 0)
        {
          i = jnU;
          if (i > 0) {
            break label308;
          }
        }
      }
      label308:
      for (int i = 300000;; i = (i + 5) * 60000)
      {
        if (jnT != null)
        {
          jnT.MM();
          jnT = null;
        }
        localObject1 = new aj(new aj.a()
        {
          public final boolean pO()
          {
            GMTrace.i(16165048942592L, 120439);
            AppBrandIDKeyBatchReport.b.ZB();
            w.d("MicroMsg.AppBrandIDKeyBatchReport", "on timer expired in monitor timer!");
            GMTrace.o(16165048942592L, 120439);
            return true;
          }
        }, false);
        jnT = (aj)localObject1;
        long l = i;
        ((aj)localObject1).w(l, l);
        GMTrace.o(16163840983040L, 120430);
        return;
        Object localObject2 = new b.a();
        ((b.a)localObject2).hlX = new bsk();
        ((b.a)localObject2).hlY = new bsl();
        ((b.a)localObject2).uri = "/cgi-bin/mmbiz-bin/wxausrevent/wxaappidkeybatchreport";
        ((b.a)localObject2).hlW = 1009;
        ((b.a)localObject2).hlZ = 0;
        ((b.a)localObject2).hma = 0;
        localObject2 = ((b.a)localObject2).DA();
        awr localawr = new awr();
        localawr.jXB = Build.MANUFACTURER;
        localawr.urk = 2;
        localawr.tBR = com.tencent.mm.protocal.d.toR;
        localawr.tBS = com.tencent.mm.protocal.d.toQ;
        localawr.pFt = ab.getResources().getDisplayMetrics().widthPixels;
        localawr.urm = ab.getResources().getDisplayMetrics().heightPixels;
        localawr.tBT = com.tencent.mm.protocal.d.toT;
        localawr.tBU = com.tencent.mm.protocal.d.toU;
        localawr.urn = ab.getResources().getConfiguration().locale.getLanguage();
        ((bsk)((com.tencent.mm.ac.b)localObject2).hlU.hmc).uHg = localawr;
        ((bsk)((com.tencent.mm.ac.b)localObject2).hlU.hmc).uHf = ((LinkedList)localObject1);
        u.a((com.tencent.mm.ac.b)localObject2, new u.a()
        {
          public final int a(int paramAnonymousInt1, int paramAnonymousInt2, String paramAnonymousString, com.tencent.mm.ac.b paramAnonymousb, k paramAnonymousk)
          {
            GMTrace.i(16167330643968L, 120456);
            if ((paramAnonymousInt1 == 0) && (paramAnonymousInt2 == 0))
            {
              paramAnonymousInt1 = ((bsl)paramAnonymousb.hlV.hmc).uHh;
              AppBrandIDKeyBatchReport.b.jnU = paramAnonymousInt1;
              AppBrandIDKeyBatchReport.b.jp(paramAnonymousInt1);
            }
            for (;;)
            {
              GMTrace.o(16167330643968L, 120456);
              return 0;
              paramAnonymousString = this.jnV.iterator();
              while (paramAnonymousString.hasNext()) {
                AppBrandIDKeyBatchReport.b.b((bsq)paramAnonymousString.next());
              }
            }
          }
        }, true);
        i = 1;
        break;
      }
    }
    
    public static void ZB()
    {
      GMTrace.i(16163975200768L, 120431);
      if (iUX != null)
      {
        iUX.MM();
        iUX = null;
      }
      GMTrace.o(16163975200768L, 120431);
    }
    
    private static LinkedList<bsq> ZC()
    {
      GMTrace.i(16164512071680L, 120435);
      jnS.readLock().lock();
      for (;;)
      {
        try
        {
          Object localObject2 = new File(AppBrandIDKeyBatchReport.Zz());
          if (!((File)localObject2).exists())
          {
            w.d("MicroMsg.AppBrandIDKeyBatchReport", "reportFile not exist!");
            jnS.readLock().unlock();
            ZD();
            GMTrace.o(16164512071680L, 120435);
            return null;
          }
          LinkedList localLinkedList = new LinkedList();
          long l = ((File)localObject2).length();
          int i = 0;
          localObject2 = com.tencent.mm.a.e.c(AppBrandIDKeyBatchReport.Zz(), i, 4);
          if (localObject2 == null)
          {
            w.e("MicroMsg.AppBrandIDKeyBatchReport", "preData is null!");
            jnS.readLock().unlock();
            ZD();
            GMTrace.o(16164512071680L, 120435);
            return null;
          }
          int j = new DataInputStream(new ByteArrayInputStream((byte[])localObject2)).readInt();
          localObject2 = com.tencent.mm.a.e.c(AppBrandIDKeyBatchReport.Zz(), i + 4, j);
          localLinkedList.add((bsq)new bsq().aC((byte[])localObject2));
          i = j + 4 + i;
          if (i >= l)
          {
            jnS.readLock().unlock();
            ZD();
            GMTrace.o(16164512071680L, 120435);
            return localLinkedList;
          }
        }
        catch (IOException localIOException)
        {
          w.e("MicroMsg.AppBrandIDKeyBatchReport", "read file error %s", new Object[] { localIOException.getMessage() });
          w.printErrStackTrace("MicroMsg.AppBrandIDKeyBatchReport", localIOException, "", new Object[0]);
          jnS.readLock().unlock();
          ZD();
          GMTrace.o(16164512071680L, 120435);
          return null;
        }
        finally
        {
          jnS.readLock().unlock();
          ZD();
        }
      }
    }
    
    private static void ZD()
    {
      GMTrace.i(16164646289408L, 120436);
      jnS.writeLock().lock();
      com.tencent.mm.loader.stub.b.deleteFile(AppBrandIDKeyBatchReport.Zz());
      jnS.writeLock().unlock();
      GMTrace.o(16164646289408L, 120436);
    }
    
    public static void b(bsq parambsq)
    {
      GMTrace.i(16164377853952L, 120434);
      jnS.writeLock().lock();
      try
      {
        parambsq = parambsq.toByteArray();
        Object localObject = new File(AppBrandIDKeyBatchReport.Zy());
        if (!((File)localObject).exists()) {
          ((File)localObject).mkdir();
        }
        localObject = new File(AppBrandIDKeyBatchReport.Zz());
        if (!((File)localObject).exists()) {
          ((File)localObject).createNewFile();
        }
        int i = parambsq.length;
        localObject = new ByteArrayOutputStream();
        new DataOutputStream((OutputStream)localObject).writeInt(i);
        localObject = ((ByteArrayOutputStream)localObject).toByteArray();
        com.tencent.mm.a.e.d(AppBrandIDKeyBatchReport.Zz(), (byte[])localObject);
        com.tencent.mm.a.e.d(AppBrandIDKeyBatchReport.Zz(), parambsq);
        jnS.writeLock().unlock();
        GMTrace.o(16164377853952L, 120434);
        return;
      }
      catch (Exception parambsq)
      {
        w.e("MicroMsg.AppBrandIDKeyBatchReport", "appendToFile exception:%s", new Object[] { parambsq.getMessage() });
        w.printErrStackTrace("MicroMsg.AppBrandIDKeyBatchReport", parambsq, "", new Object[0]);
        jnS.writeLock().unlock();
        GMTrace.o(16164377853952L, 120434);
        return;
      }
      finally
      {
        jnS.writeLock().unlock();
      }
    }
    
    public static void c(bsq parambsq)
    {
      GMTrace.i(16164243636224L, 120433);
      if (parambsq == null)
      {
        GMTrace.o(16164243636224L, 120433);
        return;
      }
      com.tencent.mm.plugin.appbrand.o.d.xC().C(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(16165988466688L, 120446);
          AppBrandIDKeyBatchReport.b.b(this.jnW);
          GMTrace.o(16165988466688L, 120446);
        }
      });
      GMTrace.o(16164243636224L, 120433);
    }
    
    public static void jp(int paramInt)
    {
      int i = 60000;
      GMTrace.i(16164109418496L, 120432);
      if (paramInt <= 0) {}
      for (paramInt = i;; paramInt = 60000 * paramInt)
      {
        ZB();
        aj localaj = new aj(new aj.a()
        {
          public final boolean pO()
          {
            GMTrace.i(16165720031232L, 120444);
            w.d("MicroMsg.AppBrandIDKeyBatchReport", "startReport run in TimerTask!");
            AppBrandIDKeyBatchReport.b.ZA();
            GMTrace.o(16165720031232L, 120444);
            return true;
          }
        }, true);
        iUX = localaj;
        long l = paramInt;
        localaj.w(l, l);
        GMTrace.o(16164109418496L, 120432);
        return;
      }
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/report/AppBrandIDKeyBatchReport.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */