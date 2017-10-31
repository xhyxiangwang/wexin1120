package com.tencent.mm.plugin.ipcall.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.av.j;
import com.tencent.mm.av.m;
import com.tencent.mm.g.a.ci;
import com.tencent.mm.k.g;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.w.a;
import com.tencent.mm.x.ap;
import java.io.File;
import java.util.ArrayList;

public final class d
  implements com.tencent.mm.ac.e
{
  private static d mWc;
  private boolean hjm;
  com.tencent.mm.sdk.b.c mWd;
  private int retryCount;
  
  static
  {
    GMTrace.i(11620034019328L, 86576);
    mWc = null;
    GMTrace.o(11620034019328L, 86576);
  }
  
  private d()
  {
    GMTrace.i(11619228712960L, 86570);
    this.retryCount = 0;
    this.hjm = false;
    this.mWd = new com.tencent.mm.sdk.b.c()
    {
      private boolean a(ci paramAnonymousci)
      {
        GMTrace.i(11572923596800L, 86225);
        Object localObject;
        if ((paramAnonymousci instanceof ci))
        {
          w.d("MicroMsg.IPCallCoutryConfigUpdater", "detect DynamicConfigUpdatedEvent");
          ap.AS();
          int i = ((Integer)com.tencent.mm.x.c.xi().get(w.a.uWg, Integer.valueOf(0))).intValue();
          int j = g.uz().getInt("WeChatOutCountryCodeRestrictionPackageID", 0);
          w.d("MicroMsg.IPCallCoutryConfigUpdater", "oldConfig: %d, newConfig: %d", new Object[] { Integer.valueOf(i), Integer.valueOf(j) });
          if (i != j)
          {
            ap.AS();
            com.tencent.mm.x.c.xi().a(w.a.uWg, Integer.valueOf(j));
            com.tencent.mm.av.t.Kg().gw(26);
            paramAnonymousci = c.aGX();
            localObject = com.tencent.mm.compatible.util.e.gZP + "ipcallCountryCodeConfig.cfg";
            w.d("MicroMsg.IPCallCountryCodeConfig", "deleteRestrictionCountryConfigIfExist, path: %s", new Object[] { localObject });
          }
        }
        try
        {
          localObject = new File((String)localObject);
          if (((File)localObject).exists()) {
            ((File)localObject).delete();
          }
          paramAnonymousci.isInit = false;
          paramAnonymousci.mWb.clear();
        }
        catch (Exception paramAnonymousci)
        {
          for (;;)
          {
            w.e("MicroMsg.IPCallCountryCodeConfig", "deleteRestrictionCountryConfigIfExist, error: %s", new Object[] { paramAnonymousci.getMessage() });
          }
        }
        d.this.fi(true);
        GMTrace.o(11572923596800L, 86225);
        return false;
      }
    };
    GMTrace.o(11619228712960L, 86570);
  }
  
  public static d aHb()
  {
    GMTrace.i(11619362930688L, 86571);
    if (mWc == null) {
      mWc = new d();
    }
    d locald = mWc;
    GMTrace.o(11619362930688L, 86571);
    return locald;
  }
  
  private static void aHc()
  {
    GMTrace.i(11619631366144L, 86573);
    Object localObject = com.tencent.mm.av.t.Kg().gx(26);
    if ((localObject != null) && (localObject.length > 0)) {}
    for (boolean bool = true;; bool = false)
    {
      localObject = new com.tencent.mm.av.k(bool);
      ap.wT().a((com.tencent.mm.ac.k)localObject, 0);
      GMTrace.o(11619631366144L, 86573);
      return;
    }
  }
  
  private void aHd()
  {
    GMTrace.i(11619899801600L, 86575);
    this.hjm = false;
    this.retryCount = 0;
    long l = System.currentTimeMillis();
    ap.AS();
    com.tencent.mm.x.c.xi().a(w.a.uWh, Long.valueOf(l));
    GMTrace.o(11619899801600L, 86575);
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ac.k paramk)
  {
    GMTrace.i(11619765583872L, 86574);
    w.d("MicroMsg.IPCallCoutryConfigUpdater", "onSceneEnd, errType: %d, errCode: %d, isUpdating: %b", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Boolean.valueOf(this.hjm) });
    if (!this.hjm)
    {
      GMTrace.o(11619765583872L, 86574);
      return;
    }
    boolean bool2 = true;
    boolean bool1 = bool2;
    if (paramInt1 != 0)
    {
      bool1 = bool2;
      if (paramInt2 != 0) {
        bool1 = false;
      }
    }
    w.d("MicroMsg.IPCallCoutryConfigUpdater", "onSceneEnd, isSuccess: %b", new Object[] { Boolean.valueOf(bool1) });
    if (paramk.getType() == 159)
    {
      if (bool1)
      {
        w.d("MicroMsg.IPCallCoutryConfigUpdater", "get package list success, start download");
        paramString = com.tencent.mm.av.t.Kg().gx(26);
        if ((paramString == null) || (paramString.length == 0))
        {
          w.d("MicroMsg.IPCallCoutryConfigUpdater", "do not exist package info");
          aHd();
          GMTrace.o(11619765583872L, 86574);
          return;
        }
        w.d("MicroMsg.IPCallCoutryConfigUpdater", "infos.length: %d", new Object[] { Integer.valueOf(paramString.length) });
        paramString = paramString[0];
        w.d("MicroMsg.IPCallCoutryConfigUpdater", "stored info type: %d, id: %d, version: %d, status: %d, name: %s", new Object[] { Integer.valueOf(paramString.fBH), Integer.valueOf(paramString.id), Integer.valueOf(paramString.version), Integer.valueOf(paramString.status), paramString.Kb() });
        if (paramString.status == 3)
        {
          w.d("MicroMsg.IPCallCoutryConfigUpdater", "downloading this package, ignore");
          GMTrace.o(11619765583872L, 86574);
          return;
        }
        if (paramString.status != 5)
        {
          w.d("MicroMsg.IPCallCoutryConfigUpdater", "already download this package");
          c.aGX().fh(true);
          aHd();
          GMTrace.o(11619765583872L, 86574);
          return;
        }
        paramString = new j(paramString.id, 26);
        ap.wT().a(paramString, 0);
        GMTrace.o(11619765583872L, 86574);
        return;
      }
      if (this.retryCount < 3)
      {
        this.retryCount += 1;
        aHc();
        w.d("MicroMsg.IPCallCoutryConfigUpdater", "retry get package list, retryCount: %d", new Object[] { Integer.valueOf(this.retryCount) });
        GMTrace.o(11619765583872L, 86574);
        return;
      }
      w.e("MicroMsg.IPCallCoutryConfigUpdater", "reach retry limit");
      GMTrace.o(11619765583872L, 86574);
      return;
    }
    if ((paramk.getType() == 160) && (bool1))
    {
      w.d("MicroMsg.IPCallCoutryConfigUpdater", "download package success");
      c.aGX().fh(true);
      aHd();
    }
    GMTrace.o(11619765583872L, 86574);
  }
  
  public final void fi(boolean paramBoolean)
  {
    GMTrace.i(11619497148416L, 86572);
    if (!ap.AV())
    {
      w.i("MicroMsg.IPCallCoutryConfigUpdater", "tryUpdate, acc not ready");
      GMTrace.o(11619497148416L, 86572);
      return;
    }
    if (this.hjm)
    {
      w.i("MicroMsg.IPCallCoutryConfigUpdater", "tryUpdate updating");
      GMTrace.o(11619497148416L, 86572);
      return;
    }
    w.d("MicroMsg.IPCallCoutryConfigUpdater", "tryupdate, isForce: %b", new Object[] { Boolean.valueOf(paramBoolean) });
    if (!paramBoolean)
    {
      ap.AS();
      long l1 = ((Long)com.tencent.mm.x.c.xi().get(w.a.uWh, Long.valueOf(0L))).longValue();
      long l2 = System.currentTimeMillis();
      if ((l1 != 0L) && (Math.abs(l2 - l1) < 86400000L))
      {
        w.i("MicroMsg.IPCallCoutryConfigUpdater", "tryUpdate, not reach the update time limit");
        GMTrace.o(11619497148416L, 86572);
        return;
      }
    }
    w.i("MicroMsg.IPCallCoutryConfigUpdater", "try update now");
    this.hjm = true;
    ap.wT().a(159, this);
    ap.wT().a(160, this);
    aHc();
    GMTrace.o(11619497148416L, 86572);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/ipcall/a/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */