package com.tencent.mm.plugin.appbrand.performance;

import android.annotation.SuppressLint;
import android.os.Build.VERSION;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Process;
import android.util.SparseArray;
import android.view.Choreographer;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.app.f;
import com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo;
import com.tencent.mm.plugin.appbrand.config.AppBrandSysConfig;
import com.tencent.mm.plugin.appbrand.debugger.DebuggerShell;
import com.tencent.mm.plugin.appbrand.ipc.AppBrandMainProcessService;
import com.tencent.mm.plugin.appbrand.ipc.MainProcessTask;
import com.tencent.mm.plugin.appbrand.jsapi.JsApiGetStorageInfoTask;
import com.tencent.mm.plugin.appbrand.ui.e;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.x.q;
import com.tencent.mm.x.q.b;
import java.util.Iterator;
import java.util.Set;

@SuppressLint({"DefaultLocale"})
public final class AppBrandPerformanceManager
{
  private static SparseArray<a> jmH;
  
  static
  {
    GMTrace.i(15451815936000L, 115125);
    jmH = new SparseArray();
    GMTrace.o(15451815936000L, 115125);
  }
  
  public static final void B(String paramString1, String paramString2, String paramString3)
  {
    GMTrace.i(15451279065088L, 115121);
    e locale = com.tencent.mm.plugin.appbrand.a.nz(paramString1);
    if (locale == null)
    {
      q.Aw().n(paramString1.hashCode() + "performance_custom_data", true).k(paramString2, paramString3);
      GMTrace.o(15451279065088L, 115121);
      return;
    }
    locale.bi(paramString2, paramString3);
    GMTrace.o(15451279065088L, 115121);
  }
  
  public static final void b(String paramString, int paramInt, long paramLong)
  {
    GMTrace.i(15451010629632L, 115119);
    g(paramString, paramInt, String.format("%d ms", new Object[] { Long.valueOf(paramLong) }));
    GMTrace.o(15451010629632L, 115119);
  }
  
  public static final void g(String paramString1, int paramInt, String paramString2)
  {
    GMTrace.i(15451144847360L, 115120);
    e locale = com.tencent.mm.plugin.appbrand.a.nz(paramString1);
    if (locale == null)
    {
      q.Aw().n(paramString1.hashCode() + "performance_data", true).k(String.valueOf(paramInt), paramString2);
      GMTrace.o(15451144847360L, 115120);
      return;
    }
    locale.C(paramInt, paramString2);
    GMTrace.o(15451144847360L, 115120);
  }
  
  public static final void p(String paramString, long paramLong)
  {
    GMTrace.i(19683969335296L, 146657);
    f.Se().aP(paramString + "_PkgDownloadCost", String.valueOf(paramLong));
    GMTrace.o(19683969335296L, 146657);
  }
  
  public static final void rD(String paramString)
  {
    GMTrace.i(15450339540992L, 115114);
    w.d("MicroMsg.AppBrandPerformanceManager", "startMonitoring, appId: %s", new Object[] { paramString });
    a locala2 = (a)jmH.get(paramString.hashCode());
    a locala1 = locala2;
    if (locala2 == null)
    {
      locala1 = new a(paramString);
      jmH.put(paramString.hashCode(), locala1);
    }
    locala1.Af = true;
    com.tencent.mm.plugin.appbrand.o.d.xC().C(locala1);
    if ((a.Zs()) && (locala1.jmN != null))
    {
      paramString = locala1.jmN;
      paramString.Af = true;
      paramString.jnc.postFrameCallback(paramString);
    }
    if (!locala1.jmL)
    {
      paramString = new GetPkgDownloadCostTask();
      paramString.iqL = locala1.iqL;
      AppBrandMainProcessService.a(paramString);
      locala1.jmL = true;
    }
    GMTrace.o(15450339540992L, 115114);
  }
  
  public static final void rE(String paramString)
  {
    GMTrace.i(15450473758720L, 115115);
    w.d("MicroMsg.AppBrandPerformanceManager", "stopMonitoring, appId: %s", new Object[] { paramString });
    paramString = (a)jmH.get(paramString.hashCode());
    if (paramString != null)
    {
      paramString.Af = false;
      if ((a.Zs()) && (paramString.jmN != null))
      {
        paramString = paramString.jmN;
        paramString.Af = false;
        paramString.jnd = 0L;
        paramString.jne = 0;
        paramString.jnc.removeFrameCallback(paramString);
      }
    }
    GMTrace.o(15450473758720L, 115115);
  }
  
  public static final void rF(String paramString)
  {
    GMTrace.i(15450607976448L, 115116);
    w.d("MicroMsg.AppBrandPerformanceManager", "enablePanel for AppId %s", new Object[] { paramString });
    SetAppPerformanceModeTask localSetAppPerformanceModeTask = new SetAppPerformanceModeTask();
    localSetAppPerformanceModeTask.iqL = paramString;
    localSetAppPerformanceModeTask.mEnable = true;
    AppBrandMainProcessService.a(localSetAppPerformanceModeTask);
    GMTrace.o(15450607976448L, 115116);
  }
  
  public static final void rG(String paramString)
  {
    GMTrace.i(15450742194176L, 115117);
    w.d("MicroMsg.AppBrandPerformanceManager", "disablePanel for AppId %s", new Object[] { paramString });
    SetAppPerformanceModeTask localSetAppPerformanceModeTask = new SetAppPerformanceModeTask();
    localSetAppPerformanceModeTask.iqL = paramString;
    localSetAppPerformanceModeTask.mEnable = false;
    AppBrandMainProcessService.a(localSetAppPerformanceModeTask);
    GMTrace.o(15450742194176L, 115117);
  }
  
  public static final boolean rH(String paramString)
  {
    GMTrace.i(15450876411904L, 115118);
    if (DebuggerShell.Ux())
    {
      GMTrace.o(15450876411904L, 115118);
      return true;
    }
    paramString = com.tencent.mm.plugin.appbrand.a.nx(paramString);
    if ((paramString != null) && (paramString.iII) && (paramString.iJa.iCx == 1))
    {
      GMTrace.o(15450876411904L, 115118);
      return true;
    }
    GMTrace.o(15450876411904L, 115118);
    return false;
  }
  
  public static final void rI(String paramString)
  {
    GMTrace.i(15451413282816L, 115122);
    e locale = com.tencent.mm.plugin.appbrand.a.nz(paramString);
    q.b localb = q.Aw().gh(paramString.hashCode() + "performance_data");
    if (locale == null) {
      w.e("MicroMsg.AppBrandPerformanceManager", "insertCachedPerformanceData panel is not ready.");
    }
    for (;;)
    {
      rJ(paramString);
      GMTrace.o(15451413282816L, 115122);
      return;
      if (localb == null)
      {
        w.d("MicroMsg.AppBrandPerformanceManager", "insertCachedPerformanceData cache is empty.");
      }
      else
      {
        Iterator localIterator = localb.Ax().iterator();
        while (localIterator.hasNext())
        {
          String str1 = (String)localIterator.next();
          String str2 = (String)localb.get(str1);
          if (str2 != null) {
            locale.C(Integer.valueOf(str1).intValue(), str2);
          }
        }
      }
    }
  }
  
  private static final void rJ(String paramString)
  {
    GMTrace.i(15451547500544L, 115123);
    e locale = com.tencent.mm.plugin.appbrand.a.nz(paramString);
    paramString = q.Aw().gh(paramString.hashCode() + "performance_custom_data");
    if (locale == null)
    {
      w.e("MicroMsg.AppBrandPerformanceManager", "insertCachedCustomData panel is not ready.");
      GMTrace.o(15451547500544L, 115123);
      return;
    }
    if (paramString == null)
    {
      w.d("MicroMsg.AppBrandPerformanceManager", "insertCachedCustomData cache is empty.");
      GMTrace.o(15451547500544L, 115123);
      return;
    }
    Iterator localIterator = paramString.Ax().iterator();
    while (localIterator.hasNext())
    {
      String str1 = (String)localIterator.next();
      String str2 = (String)paramString.get(str1);
      if (str2 != null) {
        locale.bi(str1, str2);
      }
    }
    GMTrace.o(15451547500544L, 115123);
  }
  
  private static class GetPkgDownloadCostTask
    extends MainProcessTask
  {
    public static final Parcelable.Creator<GetPkgDownloadCostTask> CREATOR;
    public String iqL;
    private long jmI;
    
    static
    {
      GMTrace.i(15454097637376L, 115142);
      CREATOR = new Parcelable.Creator() {};
      GMTrace.o(15454097637376L, 115142);
    }
    
    public GetPkgDownloadCostTask()
    {
      GMTrace.i(15453158113280L, 115135);
      GMTrace.o(15453158113280L, 115135);
    }
    
    public final void RS()
    {
      GMTrace.i(15453292331008L, 115136);
      w.d("MicroMsg.AppBrandPerformanceManager", "try to get pkg download cost in main process.");
      String str1 = this.iqL + "_PkgDownloadCost";
      String str2 = f.Se().get(str1, null);
      if (str2 != null) {
        f.Se().aP(str1, null);
      }
      try
      {
        this.jmI = Long.parseLong(str2);
        VC();
        GMTrace.o(15453292331008L, 115136);
        return;
      }
      catch (Exception localException)
      {
        for (;;)
        {
          w.e("MicroMsg.AppBrandPerformanceManager", "GetPkgDownloadCost error.");
        }
      }
    }
    
    public final void VB()
    {
      GMTrace.i(15453426548736L, 115137);
      w.d("MicroMsg.AppBrandPerformanceManager", "received pkg download cost from main process: %d ms", new Object[] { Long.valueOf(this.jmI) });
      if (this.jmI != 0L) {
        AppBrandPerformanceManager.b(this.iqL, 201, this.jmI);
      }
      VE();
      GMTrace.o(15453426548736L, 115137);
    }
    
    public final void f(Parcel paramParcel)
    {
      GMTrace.i(15453560766464L, 115138);
      this.iqL = paramParcel.readString();
      this.jmI = paramParcel.readLong();
      GMTrace.o(15453560766464L, 115138);
    }
    
    public void writeToParcel(Parcel paramParcel, int paramInt)
    {
      GMTrace.i(15453694984192L, 115139);
      paramParcel.writeString(this.iqL);
      paramParcel.writeLong(this.jmI);
      GMTrace.o(15453694984192L, 115139);
    }
  }
  
  private static class SetAppPerformanceModeTask
    extends MainProcessTask
  {
    public static final Parcelable.Creator<SetAppPerformanceModeTask> CREATOR;
    public String iqL;
    public boolean mEnable;
    
    static
    {
      GMTrace.i(15448863145984L, 115103);
      CREATOR = new Parcelable.Creator() {};
      GMTrace.o(15448863145984L, 115103);
    }
    
    public SetAppPerformanceModeTask()
    {
      GMTrace.i(15447923621888L, 115096);
      GMTrace.o(15447923621888L, 115096);
    }
    
    public final void RS()
    {
      GMTrace.i(15448057839616L, 115097);
      com.tencent.mm.plugin.appbrand.config.c localc = f.Se();
      String str2 = this.iqL + "_PerformancePanelEnabled";
      if (this.mEnable) {}
      for (String str1 = "1";; str1 = "0")
      {
        localc.aP(str2, str1);
        GMTrace.o(15448057839616L, 115097);
        return;
      }
    }
    
    public final void f(Parcel paramParcel)
    {
      GMTrace.i(15448192057344L, 115098);
      this.iqL = paramParcel.readString();
      if (paramParcel.readByte() != 0) {}
      for (boolean bool = true;; bool = false)
      {
        this.mEnable = bool;
        GMTrace.o(15448192057344L, 115098);
        return;
      }
    }
    
    public void writeToParcel(Parcel paramParcel, int paramInt)
    {
      GMTrace.i(15448326275072L, 115099);
      paramParcel.writeString(this.iqL);
      if (this.mEnable) {}
      for (byte b = 1;; b = 0)
      {
        paramParcel.writeByte(b);
        GMTrace.o(15448326275072L, 115099);
        return;
      }
    }
  }
  
  private static final class a
    implements Runnable
  {
    volatile boolean Af;
    public final String iqL;
    public volatile double jmJ;
    private volatile int jmK;
    volatile boolean jmL;
    private c jmM;
    d jmN;
    d.a jmO;
    
    public a(String paramString)
    {
      GMTrace.i(15452352806912L, 115129);
      this.jmJ = 0.0D;
      this.jmK = 4;
      this.Af = true;
      this.jmL = false;
      this.jmO = new d.a()
      {
        public final void i(double paramAnonymousDouble)
        {
          GMTrace.i(15449534234624L, 115108);
          if (Math.round(AppBrandPerformanceManager.a.this.jmJ) != Math.round(paramAnonymousDouble))
          {
            AppBrandPerformanceManager.a.this.jmJ = paramAnonymousDouble;
            String str = Math.round(AppBrandPerformanceManager.a.this.jmJ) + " fps";
            AppBrandPerformanceManager.g(AppBrandPerformanceManager.a.this.iqL, 303, str);
            a.a(AppBrandPerformanceManager.a.this.iqL, "Hardware", "FPS", AppBrandPerformanceManager.a.this.jmJ);
          }
          GMTrace.o(15449534234624L, 115108);
        }
      };
      this.iqL = paramString;
      this.jmM = new c(Process.myPid());
      if (Zs())
      {
        this.jmN = new d();
        this.jmN.jnf = 100L;
        this.jmN.jmO = this.jmO;
      }
      GMTrace.o(15452352806912L, 115129);
    }
    
    static boolean Zs()
    {
      GMTrace.i(15452487024640L, 115130);
      if (Build.VERSION.SDK_INT >= 16)
      {
        GMTrace.o(15452487024640L, 115130);
        return true;
      }
      GMTrace.o(15452487024640L, 115130);
      return false;
    }
    
    public final void run()
    {
      GMTrace.i(15452621242368L, 115131);
      if (this.Af)
      {
        double d = this.jmM.Zt();
        AppBrandPerformanceManager.g(this.iqL, 101, (int)d + "%");
        a.a(this.iqL, "Hardware", "CPU", d);
        int i = bg.bOj();
        AppBrandPerformanceManager.g(this.iqL, 102, i + "m");
        a.a(this.iqL, "Hardware", "MEMORY", i);
        this.jmK += 1;
        if (this.jmK >= 4)
        {
          this.jmK = 0;
          final JsApiGetStorageInfoTask localJsApiGetStorageInfoTask = new JsApiGetStorageInfoTask();
          localJsApiGetStorageInfoTask.appId = this.iqL;
          localJsApiGetStorageInfoTask.iQi = new Runnable()
          {
            public final void run()
            {
              GMTrace.i(15450205323264L, 115113);
              AppBrandPerformanceManager.g(AppBrandPerformanceManager.a.this.iqL, 401, bg.aD(localJsApiGetStorageInfoTask.size));
              localJsApiGetStorageInfoTask.VE();
              GMTrace.o(15450205323264L, 115113);
            }
          };
          localJsApiGetStorageInfoTask.VD();
          AppBrandMainProcessService.a(localJsApiGetStorageInfoTask);
        }
        com.tencent.mm.plugin.appbrand.o.d.xC().h(this, 3000L);
      }
      GMTrace.o(15452621242368L, 115131);
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/performance/AppBrandPerformanceManager.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */