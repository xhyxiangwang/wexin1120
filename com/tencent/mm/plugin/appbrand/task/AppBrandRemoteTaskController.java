package com.tencent.mm.plugin.appbrand.task;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Process;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.ipc.AppBrandMainProcessService;
import com.tencent.mm.plugin.appbrand.ipc.MainProcessTask;
import com.tencent.mm.plugin.appbrand.jsapi.i;
import com.tencent.mm.sdk.platformtools.MultiProcessSharedPreferences;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.w;
import junit.framework.Assert;

public class AppBrandRemoteTaskController
  extends MainProcessTask
{
  public static final Parcelable.Creator<AppBrandRemoteTaskController> CREATOR;
  private static long jpC;
  public String iqL;
  public b irn;
  public c irz;
  public int jpA;
  public long jpB;
  public int jpx;
  public String jpy;
  public int jpz;
  
  static
  {
    GMTrace.i(10650847805440L, 79355);
    CREATOR = new Parcelable.Creator() {};
    GMTrace.o(10650847805440L, 79355);
  }
  
  public AppBrandRemoteTaskController()
  {
    GMTrace.i(10648297668608L, 79336);
    this.irz = null;
    this.irn = null;
    this.jpz = a.jpE;
    GMTrace.o(10648297668608L, 79336);
  }
  
  private void ZN()
  {
    GMTrace.i(10650042499072L, 79349);
    c localc = b.rR(this.jpy);
    if (localc == null)
    {
      GMTrace.o(10650042499072L, 79349);
      return;
    }
    localc.a(this.iqL, this.jpx, this);
    b.a(localc);
    GMTrace.o(10650042499072L, 79349);
  }
  
  private void ZO()
  {
    GMTrace.i(10650176716800L, 79350);
    if (b.bf(this.iqL, this.jpy) == null)
    {
      GMTrace.o(10650176716800L, 79350);
      return;
    }
    b.rT(this.iqL);
    GMTrace.o(10650176716800L, 79350);
  }
  
  public final void RS()
  {
    GMTrace.i(10649908281344L, 79348);
    switch (2.jpD[(this.jpz - 1)])
    {
    }
    for (;;)
    {
      GMTrace.o(10649908281344L, 79348);
      return;
      ZN();
      try
      {
        if (jpC == 0L)
        {
          long l = System.currentTimeMillis();
          jpC = l;
          SharedPreferences.Editor localEditor = MultiProcessSharedPreferences.getSharedPreferences(ab.getContext(), "pref_appbrand_process", 4).edit();
          localEditor.putLong("on_wxa_process_connected_time", l);
          localEditor.commit();
          w.v("MicroMsg.AppBrandReporter", "update timestamp(%s)", new Object[] { Long.valueOf(l) });
        }
        this.jpB = jpC;
        VC();
        GMTrace.o(10649908281344L, 79348);
        return;
      }
      finally {}
      ZN();
      GMTrace.o(10649908281344L, 79348);
      return;
      ZO();
      GMTrace.o(10649908281344L, 79348);
      return;
      b.jr(this.jpA);
      GMTrace.o(10649908281344L, 79348);
      return;
      b.rO(this.iqL);
      GMTrace.o(10649908281344L, 79348);
      return;
      b.ZQ();
    }
  }
  
  public final void VB()
  {
    GMTrace.i(10650310934528L, 79351);
    switch (2.jpD[(this.jpz - 1)])
    {
    }
    for (;;)
    {
      GMTrace.o(10650310934528L, 79351);
      return;
      this.irn.finish();
      GMTrace.o(10650310934528L, 79351);
      return;
      switch (this.jpA)
      {
      }
      for (;;)
      {
        GMTrace.o(10650310934528L, 79351);
        return;
        com.tencent.mm.modelappbrand.b.gZ(ab.vR());
        this.irz.finish();
        Process.killProcess(Process.myPid());
        GMTrace.o(10650310934528L, 79351);
        return;
        this.irz.a(this);
      }
      Assert.assertTrue("AppBrand Test Assert", false);
      GMTrace.o(10650310934528L, 79351);
      return;
      i.onNetworkChange();
    }
  }
  
  public final void as(String paramString, int paramInt)
  {
    GMTrace.i(17271405674496L, 128682);
    this.jpz = a.jpF;
    this.iqL = paramString;
    this.jpx = paramInt;
    AppBrandMainProcessService.a(this);
    GMTrace.o(17271405674496L, 128682);
  }
  
  public final void f(Parcel paramParcel)
  {
    GMTrace.i(10650713587712L, 79354);
    this.iqL = paramParcel.readString();
    this.jpx = paramParcel.readInt();
    this.jpy = paramParcel.readString();
    int i = paramParcel.readInt();
    if (i == -1) {}
    for (i = 0;; i = a.ZP()[i])
    {
      this.jpz = i;
      this.jpA = paramParcel.readInt();
      this.jpB = paramParcel.readLong();
      GMTrace.o(10650713587712L, 79354);
      return;
    }
  }
  
  final void rN(String paramString)
  {
    GMTrace.i(17271539892224L, 128683);
    this.jpz = a.jpH;
    this.iqL = paramString;
    ZO();
    VC();
    GMTrace.o(17271539892224L, 128683);
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    GMTrace.i(10650579369984L, 79353);
    paramParcel.writeString(this.iqL);
    paramParcel.writeInt(this.jpx);
    paramParcel.writeString(this.jpy);
    if (this.jpz == 0) {}
    for (paramInt = -1;; paramInt = this.jpz - 1)
    {
      paramParcel.writeInt(paramInt);
      paramParcel.writeInt(this.jpA);
      paramParcel.writeLong(this.jpB);
      GMTrace.o(10650579369984L, 79353);
      return;
    }
  }
  
  private static enum a
  {
    static
    {
      GMTrace.i(10647223926784L, 79328);
      jpE = 1;
      jpF = 2;
      jpG = 3;
      jpH = 4;
      jpI = 5;
      jpJ = 6;
      jpK = 7;
      jpL = 8;
      jpM = 9;
      jpN = 10;
      jpO = 11;
      jpP = new int[] { jpE, jpF, jpG, jpH, jpI, jpJ, jpK, jpL, jpM, jpN, jpO };
      GMTrace.o(10647223926784L, 79328);
    }
    
    public static int[] ZP()
    {
      GMTrace.i(10647089709056L, 79327);
      int[] arrayOfInt = (int[])jpP.clone();
      GMTrace.o(10647089709056L, 79327);
      return arrayOfInt;
    }
  }
  
  public static abstract interface b
  {
    public abstract void finish();
  }
  
  public static abstract interface c
  {
    public abstract void a(AppBrandRemoteTaskController paramAppBrandRemoteTaskController);
    
    public abstract void finish();
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/task/AppBrandRemoteTaskController.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */