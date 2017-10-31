package com.tencent.mm.plugin.appbrand.appcache;

import android.os.SystemClock;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mars.smc.IDKey;
import com.tencent.mm.plugin.appbrand.performance.AppBrandPerformanceManager;
import com.tencent.mm.plugin.appbrand.report.a;
import com.tencent.mm.plugin.report.d;
import com.tencent.mm.sdk.platformtools.w;
import java.util.ArrayList;

public final class f
  implements g.b
{
  public f()
  {
    GMTrace.i(19689606479872L, 146699);
    GMTrace.o(19689606479872L, 146699);
  }
  
  public final g.a a(p paramp)
  {
    GMTrace.i(19689740697600L, 146700);
    if ((p.class == paramp.getClass()) || (o.b.class == paramp.getClass()) || (l.class == paramp.getClass()))
    {
      paramp = new a(paramp);
      GMTrace.o(19689740697600L, 146700);
      return paramp;
    }
    GMTrace.o(19689740697600L, 146700);
    return null;
  }
  
  private static final class a
    implements g.a
  {
    private final p iAH;
    private a iAI;
    private ArrayList<IDKey> iAJ;
    private long iAK;
    private long iAL;
    private long iAM;
    
    public a(p paramp)
    {
      GMTrace.i(19686653689856L, 146677);
      this.iAK = 0L;
      this.iAL = 0L;
      this.iAM = 0L;
      this.iAH = paramp;
      GMTrace.o(19686653689856L, 146677);
    }
    
    private void Su()
    {
      GMTrace.i(19687056343040L, 146680);
      try
      {
        d.oZR.b(this.iAJ, false);
        this.iAJ.clear();
        GMTrace.o(19687056343040L, 146680);
        return;
      }
      catch (Exception localException)
      {
        GMTrace.o(19687056343040L, 146680);
      }
    }
    
    private void bj(int paramInt1, int paramInt2)
    {
      GMTrace.i(19686922125312L, 146679);
      if (this.iAJ == null) {
        this.iAJ = new ArrayList();
      }
      this.iAJ.add(new IDKey(paramInt1, paramInt2, 1));
      GMTrace.o(19686922125312L, 146679);
    }
    
    private void hM(int paramInt)
    {
      GMTrace.i(19686787907584L, 146678);
      bj(368, paramInt);
      GMTrace.o(19686787907584L, 146678);
    }
    
    public final void Sp()
    {
      GMTrace.i(19687190560768L, 146681);
      int i;
      if ("@LibraryAppId".equals(this.iAH.appId))
      {
        this.iAI = a.iAP;
        switch (f.1.iAG[this.iAI.ordinal()])
        {
        default: 
          i = 0;
        }
      }
      for (;;)
      {
        hM(i);
        this.iAK = SystemClock.elapsedRealtime();
        GMTrace.o(19687190560768L, 146681);
        return;
        if (c.a.hK(this.iAH.fBH))
        {
          if (com.tencent.mm.plugin.appbrand.app.f.Sh() == null)
          {
            i = 1;
            label116:
            if (i <= 1) {
              break label157;
            }
          }
          label157:
          for (a locala = a.iAO;; locala = a.iAN)
          {
            this.iAI = locala;
            break;
            i = com.tencent.mm.plugin.appbrand.app.f.Sh().U(this.iAH.appId, this.iAH.fBH);
            break label116;
          }
        }
        this.iAI = a.iAN;
        break;
        i = 1;
        continue;
        i = 10;
        continue;
        i = 20;
        continue;
        i = 35;
      }
    }
    
    public final void Sq()
    {
      GMTrace.i(19687324778496L, 146682);
      switch (f.1.iAG[this.iAI.ordinal()])
      {
      }
      for (int i = 31;; i = 30)
      {
        hM(i);
        GMTrace.o(19687324778496L, 146682);
        return;
      }
    }
    
    public final void Sr()
    {
      GMTrace.i(19687593213952L, 146684);
      this.iAM = SystemClock.elapsedRealtime();
      bj(697, 1);
      GMTrace.o(19687593213952L, 146684);
    }
    
    public final void Ss()
    {
      GMTrace.i(19687861649408L, 146686);
      if (a.iAP != this.iAI) {
        a.x(this.iAH.appId, 20, this.iAH.fBH + 1);
      }
      GMTrace.o(19687861649408L, 146686);
    }
    
    public final void St()
    {
      GMTrace.i(19687995867136L, 146687);
      this.iAL = SystemClock.elapsedRealtime();
      switch (f.1.iAG[this.iAI.ordinal()])
      {
      }
      for (;;)
      {
        GMTrace.o(19687995867136L, 146687);
        return;
        hM(5);
        GMTrace.o(19687995867136L, 146687);
        return;
        hM(14);
        GMTrace.o(19687995867136L, 146687);
        return;
        hM(24);
        GMTrace.o(19687995867136L, 146687);
        return;
        hM(41);
      }
    }
    
    public final void a(com.tencent.mm.pluginsdk.j.a.d.l paraml)
    {
      int k = 2;
      GMTrace.i(19687458996224L, 146683);
      long l = SystemClock.elapsedRealtime() - this.iAK;
      int i;
      if ((paraml != null) && (paraml.status == 2)) {
        i = 1;
      }
      for (;;)
      {
        switch (f.1.iAG[this.iAI.ordinal()])
        {
        default: 
          if ((i == 0) && (!"@LibraryAppId".equals(this.iAH.appId)) && (999 != this.iAH.fBH))
          {
            if ((paraml != null) && ((paraml.httpStatusCode == 404) || (paraml.httpStatusCode == 403)))
            {
              i = 23;
              label135:
              a.x(this.iAH.appId, i, this.iAH.fBH + 1);
            }
          }
          else {
            if (paraml == null) {
              break label314;
            }
          }
          break;
        }
        try
        {
          if (paraml.status == 2)
          {
            i = 1;
            label169:
            if (a.iAP != this.iAI) {
              break label337;
            }
          }
          label314:
          label337:
          for (paraml = "";; paraml = this.iAH.appId)
          {
            a.a(paraml, this.iAI.value, i, l);
            AppBrandPerformanceManager.p(this.iAH.appId, l);
            Su();
            GMTrace.o(19687458996224L, 146683);
            return;
            i = 0;
            break;
            if (i != 0) {}
            for (int j = 2;; j = 3)
            {
              hM(j);
              break;
            }
            if (i != 0) {}
            for (j = 11;; j = 12)
            {
              hM(j);
              break;
            }
            if (i != 0) {}
            for (j = 21;; j = 22)
            {
              hM(j);
              break;
            }
            if (i != 0) {}
            for (j = 36;; j = 37)
            {
              hM(j);
              break;
            }
            i = 19;
            break label135;
            i = k;
            if (paraml == null) {
              break label169;
            }
            i = k;
            if (paraml.status != 4) {
              break label169;
            }
            i = 3;
            break label169;
          }
          return;
        }
        catch (Exception paraml)
        {
          w.printErrStackTrace("MicroMsg.AppBrand.PkgDownloadReporterImpl", paraml, "report onEnd, appId %s", new Object[] { this.iAH.appId });
          GMTrace.o(19687458996224L, 146683);
        }
      }
    }
    
    public final void bT(boolean paramBoolean)
    {
      GMTrace.i(19688130084864L, 146688);
      long l1 = SystemClock.elapsedRealtime();
      long l2 = this.iAL;
      String str;
      label85:
      int j;
      switch (f.1.iAG[this.iAI.ordinal()])
      {
      default: 
        i = 0;
        hM(i);
        Su();
        if (a.iAP == this.iAI)
        {
          str = "";
          j = this.iAI.value;
          if (!paramBoolean) {
            break label223;
          }
        }
        break;
      }
      label223:
      for (int i = 1;; i = 2)
      {
        a.a(str, j + 1, i, l1 - l2);
        if (!paramBoolean) {
          a.x(this.iAH.appId, 22, this.iAH.fBH + 1);
        }
        GMTrace.o(19688130084864L, 146688);
        return;
        if (paramBoolean)
        {
          i = 6;
          break;
        }
        i = 7;
        break;
        if (paramBoolean)
        {
          i = 15;
          break;
        }
        i = 16;
        break;
        if (paramBoolean)
        {
          i = 25;
          break;
        }
        i = 26;
        break;
        if (paramBoolean)
        {
          i = 42;
          break;
        }
        i = 43;
        break;
        str = this.iAH.appId;
        break label85;
      }
    }
    
    public final void hL(int paramInt)
    {
      GMTrace.i(19687727431680L, 146685);
      SystemClock.elapsedRealtime();
      if (paramInt == 0) {
        bj(697, 2);
      }
      for (;;)
      {
        Su();
        GMTrace.o(19687727431680L, 146685);
        return;
        if (paramInt < 0) {
          bj(697, -paramInt);
        } else if (paramInt == 1) {
          bj(697, 10);
        }
      }
    }
    
    private static enum a
    {
      final int value;
      
      static
      {
        GMTrace.i(19689338044416L, 146697);
        iAN = new a("DOWNLOAD", 0, 1);
        iAO = new a("UPDATE", 1, 4);
        iAP = new a("LIB_UPDATE", 2, 7);
        iAQ = new a("INCREMENTAL_UPDATE", 3, 10);
        iAR = new a[] { iAN, iAO, iAP, iAQ };
        GMTrace.o(19689338044416L, 146697);
      }
      
      private a(int paramInt)
      {
        GMTrace.i(19689203826688L, 146696);
        this.value = paramInt;
        GMTrace.o(19689203826688L, 146696);
      }
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/appcache/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */