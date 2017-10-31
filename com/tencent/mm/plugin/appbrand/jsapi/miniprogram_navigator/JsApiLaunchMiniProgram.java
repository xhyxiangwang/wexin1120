package com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator;

import android.app.Activity;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.compatible.util.p;
import com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo;
import com.tencent.mm.plugin.appbrand.config.AppBrandLaunchReferrer;
import com.tencent.mm.plugin.appbrand.config.AppBrandSysConfig;
import com.tencent.mm.plugin.appbrand.d.c;
import com.tencent.mm.plugin.appbrand.ipc.AppBrandMainProcessService;
import com.tencent.mm.plugin.appbrand.ipc.MMToClientEvent;
import com.tencent.mm.plugin.appbrand.ipc.MMToClientEvent.a;
import com.tencent.mm.plugin.appbrand.ipc.MainProcessTask;
import com.tencent.mm.plugin.appbrand.k;
import com.tencent.mm.plugin.appbrand.launching.AppBrandLaunchProxyUI;
import com.tencent.mm.plugin.appbrand.launching.LaunchBroadCast;
import com.tencent.mm.plugin.appbrand.page.AppBrandPageView;
import com.tencent.mm.plugin.appbrand.page.s;
import com.tencent.mm.plugin.appbrand.report.AppBrandStatObject;
import com.tencent.mm.plugin.appbrand.task.b;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.bg;
import junit.framework.Assert;
import org.json.JSONObject;

public final class JsApiLaunchMiniProgram
  extends com.tencent.mm.plugin.appbrand.jsapi.a
{
  public static final int CTRL_INDEX = 166;
  public static final String NAME = "launchMiniProgram";
  
  public JsApiLaunchMiniProgram()
  {
    GMTrace.i(19832682577920L, 147765);
    GMTrace.o(19832682577920L, 147765);
  }
  
  public final void a(final k paramk, JSONObject paramJSONObject, final int paramInt)
  {
    final int i = 1;
    GMTrace.i(19832816795648L, 147766);
    final String str1 = paramJSONObject.optString("appId", null);
    if (bg.mZ(str1))
    {
      paramk.v(paramInt, d("fail:invalid data", null));
      GMTrace.o(19832816795648L, 147766);
      return;
    }
    if (str1.equals(paramk.iqL))
    {
      paramk.v(paramInt, d("fail target appId is the same as the caller appId", null));
      GMTrace.o(19832816795648L, 147766);
      return;
    }
    final String str2 = paramJSONObject.optString("path", null);
    final String str3 = paramJSONObject.optString("extraData", null);
    if ((com.tencent.mm.plugin.appbrand.a.nx(paramk.iqL).iJa.iCx == 1) && (paramJSONObject.optBoolean("isDev", false))) {}
    for (;;)
    {
      af.u(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(19828387610624L, 147733);
          Object localObject3 = JsApiLaunchMiniProgram.this;
          k localk = paramk;
          String str1 = str1;
          int i = i;
          String str2 = str2;
          String str3 = str3;
          int j = paramInt;
          Object localObject1 = new JsApiLaunchMiniProgram.LaunchPreconditionTask();
          ((JsApiLaunchMiniProgram.LaunchPreconditionTask)localObject1).iZk = str1;
          ((JsApiLaunchMiniProgram.LaunchPreconditionTask)localObject1).iZl = i;
          if (!AppBrandMainProcessService.b((MainProcessTask)localObject1))
          {
            localk.v(j, ((com.tencent.mm.plugin.appbrand.jsapi.d)localObject3).d("fail precondition error", null));
            GMTrace.o(19828387610624L, 147733);
            return;
          }
          Object localObject2 = JsApiLaunchMiniProgram.LaunchPreconditionTask.a.iC(((JsApiLaunchMiniProgram.LaunchPreconditionTask)localObject1).iZm);
          localObject1 = localObject2;
          if (localObject2 == null) {
            localObject1 = JsApiLaunchMiniProgram.LaunchPreconditionTask.a.iZn;
          }
          if (JsApiLaunchMiniProgram.LaunchPreconditionTask.a.iZp != localObject1)
          {
            localk.v(j, ((com.tencent.mm.plugin.appbrand.jsapi.d)localObject3).d(((JsApiLaunchMiniProgram.LaunchPreconditionTask.a)localObject1).fvk, null));
            GMTrace.o(19828387610624L, 147733);
            return;
          }
          localk.irS.irh = true;
          com.tencent.mm.plugin.appbrand.d.a(localk.iqL, d.c.iqG);
          MMToClientEvent.a(new JsApiLaunchMiniProgram.2((JsApiLaunchMiniProgram)localObject3, str1, i, localk, j));
          if ((localk.mContext != null) && ((localk.mContext instanceof Activity)) && (!((Activity)localk.mContext).isFinishing()))
          {
            localObject2 = new AppBrandStatObject();
            ((AppBrandStatObject)localObject2).scene = 1037;
            localObject1 = com.tencent.mm.plugin.appbrand.a.ny(localk.iqL);
            if (localObject1 != null) {
              ((AppBrandStatObject)localObject2).fNU = ((AppBrandStatObject)localObject1).fNU;
            }
            localObject1 = "";
            localObject3 = JsApiLaunchMiniProgram.b(localk);
            if (localObject3 != null) {
              localObject1 = ((AppBrandPageView)localObject3).jlc.jlW;
            }
            localObject3 = new StringBuilder(localk.iqL);
            ((StringBuilder)localObject3).append(":");
            ((StringBuilder)localObject3).append(bg.mY(p.encode((String)localObject1)));
            ((AppBrandStatObject)localObject2).fty = ((StringBuilder)localObject3).toString();
            localObject3 = new AppBrandLaunchReferrer();
            ((AppBrandLaunchReferrer)localObject3).appId = localk.iqL;
            ((AppBrandLaunchReferrer)localObject3).iIC = str3;
            ((AppBrandLaunchReferrer)localObject3).iIB = 1;
            ((AppBrandLaunchReferrer)localObject3).url = ((String)localObject1);
            AppBrandLaunchProxyUI.a(localk.mContext, null, str1, str2, i, -1, (AppBrandStatObject)localObject2, (AppBrandLaunchReferrer)localObject3, null);
            Assert.assertTrue(true);
          }
          GMTrace.o(19828387610624L, 147733);
        }
      });
      GMTrace.o(19832816795648L, 147766);
      return;
      i = 0;
    }
  }
  
  private static final class LaunchPreconditionTask
    extends MainProcessTask
  {
    public static final Parcelable.Creator<LaunchPreconditionTask> CREATOR;
    public String iZk;
    public int iZl;
    public int iZm;
    
    static
    {
      GMTrace.i(19828119175168L, 147731);
      CREATOR = new Parcelable.Creator() {};
      GMTrace.o(19828119175168L, 147731);
    }
    
    LaunchPreconditionTask()
    {
      GMTrace.i(19827850739712L, 147729);
      this.iZm = a.iZn.ordinal();
      GMTrace.o(19827850739712L, 147729);
    }
    
    LaunchPreconditionTask(Parcel paramParcel)
    {
      GMTrace.i(19827984957440L, 147730);
      this.iZm = a.iZn.ordinal();
      f(paramParcel);
      GMTrace.o(19827984957440L, 147730);
    }
    
    public final void RS()
    {
      GMTrace.i(19827448086528L, 147726);
      b.rS(this.iZk);
      this.iZm = a.iZp.ordinal();
      GMTrace.o(19827448086528L, 147726);
    }
    
    public final int describeContents()
    {
      GMTrace.i(19827582304256L, 147727);
      GMTrace.o(19827582304256L, 147727);
      return 0;
    }
    
    public final void f(Parcel paramParcel)
    {
      GMTrace.i(19827313868800L, 147725);
      this.iZk = paramParcel.readString();
      this.iZl = paramParcel.readInt();
      this.iZm = paramParcel.readInt();
      GMTrace.o(19827313868800L, 147725);
    }
    
    public final void writeToParcel(Parcel paramParcel, int paramInt)
    {
      GMTrace.i(19827716521984L, 147728);
      paramParcel.writeString(this.iZk);
      paramParcel.writeInt(this.iZl);
      paramParcel.writeInt(this.iZm);
      GMTrace.o(19827716521984L, 147728);
    }
    
    static enum a
    {
      public final String fvk;
      
      static
      {
        GMTrace.i(19831206182912L, 147754);
        iZn = new a("FAIL", 0, "fail");
        iZo = new a("FAIL_MORE_THAN_ONE_TASK", 1, "fail can not launch more than 1 mini program");
        iZp = new a("OK", 2, "ok");
        iZq = new a[] { iZn, iZo, iZp };
        GMTrace.o(19831206182912L, 147754);
      }
      
      private a(String paramString)
      {
        GMTrace.i(19830937747456L, 147752);
        this.fvk = paramString;
        GMTrace.o(19830937747456L, 147752);
      }
      
      public static a iC(int paramInt)
      {
        GMTrace.i(19831071965184L, 147753);
        a[] arrayOfa = values();
        int j = arrayOfa.length;
        int i = 0;
        while (i < j)
        {
          a locala = arrayOfa[i];
          if (paramInt == locala.ordinal())
          {
            GMTrace.o(19831071965184L, 147753);
            return locala;
          }
          i += 1;
        }
        GMTrace.o(19831071965184L, 147753);
        return null;
      }
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/miniprogram_navigator/JsApiLaunchMiniProgram.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */