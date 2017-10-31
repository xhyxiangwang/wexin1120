package com.tencent.mm.plugin.appbrand.launching;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.kernel.a;
import com.tencent.mm.kernel.h;
import com.tencent.mm.plugin.appbrand.config.AppBrandInitConfig;
import com.tencent.mm.plugin.appbrand.config.AppBrandLaunchReferrer;
import com.tencent.mm.plugin.appbrand.ipc.MainProcessTask;
import com.tencent.mm.plugin.appbrand.report.AppBrandStatObject;
import com.tencent.mm.protocal.c.bsb;
import com.tencent.mm.protocal.c.btb;
import com.tencent.mm.protocal.c.bth;

public final class AppBrandTaskUsageRecorder
{
  private static final class LaunchCheckParams
    implements Parcelable
  {
    public static final Parcelable.Creator<LaunchCheckParams> CREATOR;
    final int iCy;
    final boolean iMy;
    final int iUz;
    final String irM;
    final AppBrandInitConfig jgb;
    final AppBrandStatObject jgc;
    
    static
    {
      GMTrace.i(15445373485056L, 115077);
      CREATOR = new Parcelable.Creator() {};
      GMTrace.o(15445373485056L, 115077);
    }
    
    LaunchCheckParams(Parcel paramParcel)
    {
      GMTrace.i(15445239267328L, 115076);
      this.iMy = true;
      this.jgb = ((AppBrandInitConfig)paramParcel.readParcelable(AppBrandInitConfig.class.getClassLoader()));
      this.jgc = ((AppBrandStatObject)paramParcel.readParcelable(AppBrandStatObject.class.getClassLoader()));
      this.iCy = paramParcel.readInt();
      this.iUz = paramParcel.readInt();
      this.irM = paramParcel.readString();
      GMTrace.o(15445239267328L, 115076);
    }
    
    public LaunchCheckParams(AppBrandInitConfig paramAppBrandInitConfig, AppBrandStatObject paramAppBrandStatObject, int paramInt1, int paramInt2, String paramString)
    {
      GMTrace.i(19677258448896L, 146607);
      this.iMy = true;
      this.jgb = paramAppBrandInitConfig;
      this.jgc = paramAppBrandStatObject;
      this.iCy = paramInt1;
      this.iUz = paramInt2;
      this.irM = paramString;
      GMTrace.o(19677258448896L, 146607);
    }
    
    public final int describeContents()
    {
      GMTrace.i(15444836614144L, 115073);
      GMTrace.o(15444836614144L, 115073);
      return 0;
    }
    
    public final void writeToParcel(Parcel paramParcel, int paramInt)
    {
      GMTrace.i(15444970831872L, 115074);
      paramParcel.writeParcelable(this.jgb, paramInt);
      paramParcel.writeParcelable(this.jgc, paramInt);
      paramParcel.writeInt(this.iCy);
      paramParcel.writeInt(this.iUz);
      paramParcel.writeString(this.irM);
      GMTrace.o(15444970831872L, 115074);
    }
  }
  
  private static final class UpdateTask
    extends MainProcessTask
  {
    public static final Parcelable.Creator<UpdateTask> CREATOR;
    AppBrandTaskUsageRecorder.LaunchCheckParams jgd;
    
    static
    {
      GMTrace.i(15441212735488L, 115046);
      CREATOR = new Parcelable.Creator() {};
      GMTrace.o(15441212735488L, 115046);
    }
    
    UpdateTask(Parcel paramParcel)
    {
      GMTrace.i(15440675864576L, 115042);
      f(paramParcel);
      GMTrace.o(15440675864576L, 115042);
    }
    
    public UpdateTask(AppBrandTaskUsageRecorder.LaunchCheckParams paramLaunchCheckParams)
    {
      GMTrace.i(15440541646848L, 115041);
      this.jgd = paramLaunchCheckParams;
      GMTrace.o(15440541646848L, 115041);
    }
    
    public final void RS()
    {
      bsb localbsb = null;
      GMTrace.i(15440407429120L, 115040);
      if (!h.xx().wM())
      {
        GMTrace.o(15440407429120L, 115040);
        return;
      }
      this.jgd.getClass();
      AppBrandLaunchReferrer localAppBrandLaunchReferrer = this.jgd.jgb.iIA;
      btb localbtb;
      if ((localAppBrandLaunchReferrer != null) && (1 == localAppBrandLaunchReferrer.iIB))
      {
        localbtb = new btb();
        localbtb.ucY = localAppBrandLaunchReferrer.appId;
      }
      for (;;)
      {
        Object localObject = localbsb;
        if (localAppBrandLaunchReferrer != null)
        {
          localObject = localbsb;
          if (2 == localAppBrandLaunchReferrer.iIB)
          {
            localObject = new bth();
            ((bth)localObject).mGI = localAppBrandLaunchReferrer.appId;
            ((bth)localObject).mDo = localAppBrandLaunchReferrer.url;
          }
        }
        localbsb = new bsb();
        localbsb.ude = this.jgd.jgb.iCo;
        localbsb.tAS = this.jgd.iCy;
        localbsb.ttY = this.jgd.jgc.scene;
        localbsb.ugx = this.jgd.jgb.iIy;
        localbsb.ugw = 1;
        localbsb.ugv = this.jgd.jgc.fNV;
        new f(this.jgd.jgb.appId, false, localbsb, (bth)localObject, localbtb, this.jgd.irM, this.jgd.iUz).Yb();
        GMTrace.o(15440407429120L, 115040);
        return;
        localbtb = null;
      }
    }
    
    public final int describeContents()
    {
      GMTrace.i(15440810082304L, 115043);
      GMTrace.o(15440810082304L, 115043);
      return 0;
    }
    
    public final void f(Parcel paramParcel)
    {
      GMTrace.i(15440944300032L, 115044);
      this.jgd = ((AppBrandTaskUsageRecorder.LaunchCheckParams)paramParcel.readParcelable(AppBrandTaskUsageRecorder.LaunchCheckParams.class.getClassLoader()));
      GMTrace.o(15440944300032L, 115044);
    }
    
    public final void writeToParcel(Parcel paramParcel, int paramInt)
    {
      GMTrace.i(15441078517760L, 115045);
      paramParcel.writeParcelable(this.jgd, paramInt);
      GMTrace.o(15441078517760L, 115045);
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/launching/AppBrandTaskUsageRecorder.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */