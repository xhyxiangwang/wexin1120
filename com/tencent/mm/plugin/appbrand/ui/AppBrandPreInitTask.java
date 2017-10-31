package com.tencent.mm.plugin.appbrand.ui;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.config.AppBrandInitConfig;
import com.tencent.mm.plugin.appbrand.ipc.MainProcessTask;
import com.tencent.mm.plugin.appbrand.launching.c;
import com.tencent.mm.plugin.appbrand.launching.c.a;
import com.tencent.mm.plugin.appbrand.o.d;
import com.tencent.mm.plugin.appbrand.report.AppBrandStatObject;
import com.tencent.mm.sdk.platformtools.af;

public final class AppBrandPreInitTask
  extends MainProcessTask
{
  public static final Parcelable.Creator<AppBrandPreInitTask> CREATOR;
  private String appId;
  private int iQS;
  private transient a jqS;
  public AppBrandInitConfig jqT;
  public AppBrandStatObject jqU;
  
  static
  {
    GMTrace.i(17308852420608L, 128961);
    CREATOR = new Parcelable.Creator() {};
    GMTrace.o(17308852420608L, 128961);
  }
  
  public AppBrandPreInitTask(Parcel paramParcel)
  {
    GMTrace.i(17308583985152L, 128959);
    f(paramParcel);
    GMTrace.o(17308583985152L, 128959);
  }
  
  public AppBrandPreInitTask(String paramString, int paramInt, AppBrandStatObject paramAppBrandStatObject, a parama)
  {
    GMTrace.i(17307778678784L, 128953);
    this.appId = paramString;
    this.iQS = paramInt;
    this.jqU = paramAppBrandStatObject;
    this.jqS = parama;
    GMTrace.o(17307778678784L, 128953);
  }
  
  public final void RS()
  {
    GMTrace.i(17308047114240L, 128955);
    c localc = new c(this.appId, this.iQS, this.jqU, new c.a()
    {
      public final void b(AppBrandInitConfig paramAnonymousAppBrandInitConfig, AppBrandStatObject paramAnonymousAppBrandStatObject)
      {
        GMTrace.i(17310060380160L, 128970);
        AppBrandPreInitTask.this.jqT = paramAnonymousAppBrandInitConfig;
        AppBrandPreInitTask.this.jqU = paramAnonymousAppBrandStatObject;
        AppBrandPreInitTask.a(AppBrandPreInitTask.this);
        GMTrace.o(17310060380160L, 128970);
      }
    });
    d.xC().C(localc);
    GMTrace.o(17308047114240L, 128955);
  }
  
  public final void VB()
  {
    GMTrace.i(17307912896512L, 128954);
    if (this.jqS != null) {
      this.jqS.a(this.jqT);
    }
    VE();
    GMTrace.o(17307912896512L, 128954);
  }
  
  public final int describeContents()
  {
    GMTrace.i(17308181331968L, 128956);
    GMTrace.o(17308181331968L, 128956);
    return 0;
  }
  
  public final void f(Parcel paramParcel)
  {
    GMTrace.i(17308449767424L, 128958);
    this.appId = paramParcel.readString();
    this.iQS = paramParcel.readInt();
    this.jqT = ((AppBrandInitConfig)paramParcel.readParcelable(AppBrandInitConfig.class.getClassLoader()));
    this.jqU = ((AppBrandStatObject)paramParcel.readParcelable(AppBrandStatObject.class.getClassLoader()));
    GMTrace.o(17308449767424L, 128958);
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    GMTrace.i(17308315549696L, 128957);
    paramParcel.writeString(this.appId);
    paramParcel.writeInt(this.iQS);
    paramParcel.writeParcelable(this.jqT, paramInt);
    paramParcel.writeParcelable(this.jqU, paramInt);
    GMTrace.o(17308315549696L, 128957);
  }
  
  public static abstract interface a
  {
    public abstract void a(AppBrandInitConfig paramAppBrandInitConfig);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/ui/AppBrandPreInitTask.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */