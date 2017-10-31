package com.tencent.mm.plugin.appbrand.ui;

import android.content.Context;
import android.content.ContextWrapper;
import android.os.HandlerThread;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.kernel.h;
import com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo;
import com.tencent.mm.plugin.appbrand.config.AppBrandInitConfig;
import com.tencent.mm.plugin.appbrand.config.AppBrandLaunchReferrer;
import com.tencent.mm.plugin.appbrand.config.AppBrandSysConfig;
import com.tencent.mm.plugin.appbrand.f;
import com.tencent.mm.plugin.appbrand.i;
import com.tencent.mm.plugin.appbrand.ipc.MainProcessTask;
import com.tencent.mm.plugin.appbrand.launching.AppBrandLaunchErrorAction;
import com.tencent.mm.plugin.appbrand.launching.e.1;
import com.tencent.mm.plugin.appbrand.o.d;
import com.tencent.mm.plugin.appbrand.report.AppBrandStatObject;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import java.lang.ref.WeakReference;
import java.util.Locale;

public final class AppBrandPrepareTask
  extends MainProcessTask
{
  public static final Parcelable.Creator<AppBrandPrepareTask> CREATOR;
  public String iqL;
  public int jpx;
  private int jqW;
  private int jqX;
  private String jqY;
  private boolean jqZ;
  private int jqt;
  private String jra;
  private AppBrandLaunchReferrer jrb;
  private String jrc;
  public AppBrandSysConfig jrd;
  public AppBrandLaunchErrorAction jre;
  public volatile transient a jrf;
  private volatile transient WeakReference<MMActivity> jrg;
  
  static
  {
    GMTrace.i(10535823212544L, 78498);
    CREATOR = new Parcelable.Creator() {};
    GMTrace.o(10535823212544L, 78498);
  }
  
  public AppBrandPrepareTask(Parcel paramParcel)
  {
    GMTrace.i(10534615252992L, 78489);
    this.jqW = 0;
    f(paramParcel);
    GMTrace.o(10534615252992L, 78489);
  }
  
  public AppBrandPrepareTask(MMActivity paramMMActivity, f paramf)
  {
    GMTrace.i(19699672809472L, 146774);
    this.jqW = 0;
    AppBrandStatObject localAppBrandStatObject = paramf.iqW;
    this.jrg = new WeakReference(paramMMActivity);
    this.iqL = paramf.iqL;
    this.jpx = paramf.iqN.iCo;
    if (localAppBrandStatObject == null)
    {
      i = 0;
      this.jqX = i;
      if (localAppBrandStatObject != null) {
        break label133;
      }
    }
    label133:
    for (int i = j;; i = localAppBrandStatObject.scene)
    {
      this.jqt = i;
      this.jqY = paramf.iqN.iIy;
      this.jrb = paramf.iqN.iIA;
      this.jrc = i.b(paramf).irM;
      GMTrace.o(19699672809472L, 146774);
      return;
      i = localAppBrandStatObject.fNV;
      break;
    }
  }
  
  public final void RS()
  {
    GMTrace.i(10534749470720L, 78490);
    if (bg.mZ(this.iqL))
    {
      GMTrace.o(10534749470720L, 78490);
      return;
    }
    d.aQ(this);
    Object localObject1 = this.iqL;
    int i = this.jpx;
    int j = this.jqt;
    Object localObject2 = this.jqY;
    localObject1 = new com.tencent.mm.plugin.appbrand.launching.e((String)localObject1, i, this.jqX, j, (String)localObject2, this.jrb, this.jrc)
    {
      public final void XX()
      {
        GMTrace.i(10492873539584L, 78178);
        AppBrandPrepareTask.this.jt(1);
        GMTrace.o(10492873539584L, 78178);
      }
      
      public final void a(AppBrandSysConfig paramAnonymousAppBrandSysConfig, AppBrandLaunchErrorAction paramAnonymousAppBrandLaunchErrorAction)
      {
        GMTrace.i(17307644461056L, 128952);
        AppBrandPrepareTask.this.jrd = paramAnonymousAppBrandSysConfig;
        if (AppBrandPrepareTask.this.jrd != null)
        {
          paramAnonymousAppBrandSysConfig = AppBrandPrepareTask.this.jrd;
          h.xx();
          paramAnonymousAppBrandSysConfig.uin = com.tencent.mm.kernel.a.wy();
        }
        AppBrandPrepareTask.this.jre = paramAnonymousAppBrandLaunchErrorAction;
        AppBrandPrepareTask.this.jt(2);
        GMTrace.o(17307644461056L, 128952);
      }
    };
    localObject2 = com.tencent.mm.sdk.f.e.Sc(String.format(Locale.US, "AppLaunchPrepareProcess[%s %d]", new Object[] { ((com.tencent.mm.plugin.appbrand.launching.e)localObject1).appId, Integer.valueOf(((com.tencent.mm.plugin.appbrand.launching.e)localObject1).iQS) }));
    ((HandlerThread)localObject2).start();
    new ae(((HandlerThread)localObject2).getLooper()).post(new e.1((com.tencent.mm.plugin.appbrand.launching.e)localObject1, (HandlerThread)localObject2));
    GMTrace.o(10534749470720L, 78490);
  }
  
  public final void VB()
  {
    GMTrace.i(10534883688448L, 78491);
    w.i("MicroMsg.AppBrandPrepareTask", "runInClientProcess, event = %d", new Object[] { Integer.valueOf(this.jqW) });
    switch (this.jqW)
    {
    default: 
    case 1: 
      do
      {
        GMTrace.o(10534883688448L, 78491);
        return;
      } while (this.jrf == null);
      this.jrf.onDownloadStarted();
      GMTrace.o(10534883688448L, 78491);
      return;
    }
    if ((this.jrd == null) && (this.jre == null)) {
      d.xC().C(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(19702625599488L, 146796);
          g.paX.a(369L, 3L, 1L, false);
          com.tencent.mm.plugin.appbrand.report.a.b(AppBrandPrepareTask.this.iqL, 0, AppBrandPrepareTask.this.jpx, 369, 3);
          GMTrace.o(19702625599488L, 146796);
        }
      });
    }
    if (this.jrf != null) {
      if (this.jrd != null)
      {
        final Object localObject1 = this.jrd.iJa;
        final Object localObject2 = this.jrd.iJb;
        d.xC().C(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(19699941244928L, 146776);
            w.i("MicroMsg.AppBrandPrepareTask", "runInClientProcess, prepare done, appPkg [%d | %s], libPkg [%d | %s]", new Object[] { Integer.valueOf(localObject1.iCy), bg.eF(localObject1.iCz), Integer.valueOf(localObject2.iCy), bg.eF(localObject2.iCz) });
            GMTrace.o(19699941244928L, 146776);
          }
        });
        label166:
        this.jrf.b(this.jrd);
        if ((this.jre != null) && (this.jrg != null))
        {
          localObject2 = (MMActivity)this.jrg.get();
          if (localObject2 != null)
          {
            AppBrandLaunchErrorAction localAppBrandLaunchErrorAction = this.jre;
            if (localObject2 != null)
            {
              if (!((MMActivity)localObject2).isFinishing())
              {
                localObject1 = localObject2;
                if (!((MMActivity)localObject2).vox) {}
              }
              else
              {
                localObject1 = new ContextWrapper((Context)localObject2);
              }
              localAppBrandLaunchErrorAction.bO((Context)localObject1);
            }
          }
        }
      }
    }
    for (;;)
    {
      d.aR(this);
      break;
      w.i("MicroMsg.AppBrandPrepareTask", "runInClientProcess, config null");
      break label166;
      w.e("MicroMsg.AppBrandPrepareTask", "runInClientProcess, prepare done, but callback is null");
    }
  }
  
  public final void f(Parcel paramParcel)
  {
    GMTrace.i(10535017906176L, 78492);
    this.iqL = paramParcel.readString();
    this.jpx = paramParcel.readInt();
    this.jra = paramParcel.readString();
    if (paramParcel.readByte() != 0) {}
    for (boolean bool = true;; bool = false)
    {
      this.jqZ = bool;
      this.jqX = paramParcel.readInt();
      this.jqt = paramParcel.readInt();
      this.jqW = paramParcel.readInt();
      this.jqY = paramParcel.readString();
      this.jrc = paramParcel.readString();
      this.jrb = ((AppBrandLaunchReferrer)paramParcel.readParcelable(AppBrandLaunchReferrer.class.getClassLoader()));
      this.jre = ((AppBrandLaunchErrorAction)paramParcel.readParcelable(AppBrandLaunchErrorAction.class.getClassLoader()));
      this.jrd = ((AppBrandSysConfig)paramParcel.readParcelable(AppBrandSysConfig.class.getClassLoader()));
      GMTrace.o(10535017906176L, 78492);
      return;
    }
  }
  
  public final void jt(int paramInt)
  {
    GMTrace.i(16056466800640L, 119630);
    this.jqW = paramInt;
    switch (paramInt)
    {
    }
    for (;;)
    {
      VC();
      GMTrace.o(16056466800640L, 119630);
      return;
      d.aR(this);
    }
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    GMTrace.i(10535152123904L, 78493);
    paramParcel.writeString(this.iqL);
    paramParcel.writeInt(this.jpx);
    paramParcel.writeString(this.jra);
    if (this.jqZ) {}
    for (byte b = 1;; b = 0)
    {
      paramParcel.writeByte(b);
      paramParcel.writeInt(this.jqX);
      paramParcel.writeInt(this.jqt);
      paramParcel.writeInt(this.jqW);
      paramParcel.writeString(this.jqY);
      paramParcel.writeString(this.jrc);
      paramParcel.writeParcelable(this.jrb, paramInt);
      paramParcel.writeParcelable(this.jre, paramInt);
      paramParcel.writeParcelable(this.jrd, paramInt);
      GMTrace.o(10535152123904L, 78493);
      return;
    }
  }
  
  public static abstract interface a
  {
    public abstract void b(AppBrandSysConfig paramAppBrandSysConfig);
    
    public abstract void onDownloadStarted();
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/ui/AppBrandPrepareTask.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */