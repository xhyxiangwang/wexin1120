package com.tencent.mm.plugin.appbrand.launching;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.ServiceInfo;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.view.Window;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.modelappbrand.LaunchParamsOptional;
import com.tencent.mm.plugin.appbrand.config.AppBrandInitConfig;
import com.tencent.mm.plugin.appbrand.config.AppBrandLaunchReferrer;
import com.tencent.mm.plugin.appbrand.o.d;
import com.tencent.mm.plugin.appbrand.p.i;
import com.tencent.mm.plugin.appbrand.report.AppBrandStatObject;
import com.tencent.mm.plugin.appbrand.task.b;
import com.tencent.mm.plugin.appbrand.ui.AppBrandTBSDownloadProxyUI;
import com.tencent.mm.plugin.appbrand.ui.banner.AppBrandStickyBannerLogic.b;
import com.tencent.mm.plugin.appbrand.ui.g;
import com.tencent.mm.pluginsdk.model.w.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.base.q;
import java.util.Map;

@com.tencent.mm.ui.base.a(7)
public final class AppBrandLaunchProxyUI
  extends MMActivity
{
  private q jfR;
  private LaunchParcel jfS;
  
  public AppBrandLaunchProxyUI()
  {
    GMTrace.i(14430016372736L, 107512);
    GMTrace.o(14430016372736L, 107512);
  }
  
  private static void a(Context paramContext, String paramString1, AppBrandInitConfig paramAppBrandInitConfig, String arg3, AppBrandStatObject paramAppBrandStatObject, AppBrandLaunchReferrer paramAppBrandLaunchReferrer, LaunchParamsOptional paramLaunchParamsOptional)
  {
    Object localObject = null;
    GMTrace.i(17327240249344L, 129098);
    Context localContext = paramContext;
    if (paramContext == null) {
      localContext = ab.getContext();
    }
    paramAppBrandInitConfig.startTime = bg.Pp();
    paramAppBrandInitConfig.iIy = com.tencent.mm.plugin.appbrand.appcache.a.nW(???);
    paramAppBrandInitConfig.iIA.a(paramAppBrandLaunchReferrer);
    paramAppBrandInitConfig.iIz = AppBrandStickyBannerLogic.b.aw(paramAppBrandInitConfig.appId, paramAppBrandInitConfig.iCo);
    label82:
    boolean bool;
    if (paramLaunchParamsOptional == null)
    {
      paramContext = null;
      paramAppBrandInitConfig.hjt = paramContext;
      if (paramLaunchParamsOptional != null) {
        break label164;
      }
      paramContext = (Context)localObject;
      paramAppBrandInitConfig.hju = paramContext;
      bool = com.tencent.mm.plugin.appbrand.app.f.Sf().aa(paramString1, paramAppBrandInitConfig.iCo);
      if (!com.tencent.mm.plugin.appbrand.app.f.Sg().Z(paramString1, paramAppBrandInitConfig.iCo)) {
        break label173;
      }
      paramAppBrandStatObject.joc = 1;
    }
    for (;;)
    {
      b.a(localContext, paramAppBrandInitConfig, paramAppBrandStatObject);
      paramContext = a.XT();
      if ((paramAppBrandInitConfig != null) && (!bg.mZ(paramAppBrandInitConfig.appId))) {
        break label196;
      }
      GMTrace.o(17327240249344L, 129098);
      return;
      paramContext = paramLaunchParamsOptional.hjt;
      break;
      label164:
      paramContext = paramLaunchParamsOptional.hju;
      break label82;
      label173:
      if (bool) {
        paramAppBrandStatObject.joc = 2;
      } else {
        paramAppBrandStatObject.joc = 3;
      }
    }
    label196:
    synchronized (paramContext.jfK)
    {
      paramContext.jfK.put(paramAppBrandInitConfig.appId, paramAppBrandInitConfig);
      if (bg.mZ(paramString1)) {
        break label270;
      }
    }
    synchronized (paramContext.jfL)
    {
      paramContext.jfL.put(paramString1, paramAppBrandInitConfig.appId);
      GMTrace.o(17327240249344L, 129098);
      return;
      paramContext = finally;
      throw paramContext;
    }
    label270:
    GMTrace.o(17327240249344L, 129098);
  }
  
  public static void a(Context paramContext, String paramString1, String paramString2, int paramInt1, int paramInt2, AppBrandStatObject paramAppBrandStatObject, LaunchParamsOptional paramLaunchParamsOptional)
  {
    GMTrace.i(15440004775936L, 115037);
    a(paramContext, paramString1, null, paramString2, paramInt1, paramInt2, paramAppBrandStatObject, null, paramLaunchParamsOptional);
    GMTrace.o(15440004775936L, 115037);
  }
  
  private static void a(AppBrandInitConfig paramAppBrandInitConfig, Context paramContext)
  {
    GMTrace.i(20349420830720L, 151615);
    if ((paramContext instanceof AppBrandLaunchProxyUI))
    {
      paramContext = ((AppBrandLaunchProxyUI)paramContext).getIntent().getStringExtra("launch_source_context");
      if ((!paramContext.contains("WebView")) && (!qK(paramContext).contains(":tools"))) {
        break label76;
      }
    }
    label76:
    for (boolean bool = true;; bool = false)
    {
      paramAppBrandInitConfig.iIx = bool;
      GMTrace.o(20349420830720L, 151615);
      return;
      paramContext = paramContext.getClass().getName();
      break;
    }
  }
  
  public static boolean a(Context paramContext, String paramString1, String paramString2, String paramString3, int paramInt1, int paramInt2, AppBrandStatObject paramAppBrandStatObject, AppBrandLaunchReferrer paramAppBrandLaunchReferrer, LaunchParamsOptional paramLaunchParamsOptional)
  {
    GMTrace.i(15440138993664L, 115038);
    if ((bg.mZ(paramString1)) && (bg.mZ(paramString2)))
    {
      GMTrace.o(15440138993664L, 115038);
      return false;
    }
    if (paramContext == null) {
      paramContext = ab.getContext();
    }
    for (;;)
    {
      String str = paramString2;
      if (bg.mZ(paramString2)) {
        str = a.XT().qH(paramString1);
      }
      if ((!bg.mZ(str)) && (paramInt1 != 2) && (b.rS(str)))
      {
        paramString2 = a.XT().qJ(str);
        if ((paramString2 != null) && (paramString2.iCo == paramInt1))
        {
          a(paramString2, paramContext);
          a(paramContext, paramString1, paramString2, paramString3, paramAppBrandStatObject, paramAppBrandLaunchReferrer, paramLaunchParamsOptional);
          GMTrace.o(15440138993664L, 115038);
          return true;
        }
      }
      LaunchParcel localLaunchParcel = new LaunchParcel();
      localLaunchParcel.username = paramString1;
      localLaunchParcel.appId = str;
      if (paramString3 == null) {}
      for (paramString2 = null;; paramString2 = paramString3.trim())
      {
        localLaunchParcel.iIy = paramString2;
        localLaunchParcel.iQS = paramInt1;
        localLaunchParcel.version = paramInt2;
        localLaunchParcel.jfW = paramAppBrandStatObject;
        localLaunchParcel.iIA = paramAppBrandLaunchReferrer;
        localLaunchParcel.jfX = paramLaunchParamsOptional;
        paramString2 = new Intent(paramContext, AppBrandLaunchProxyUI.class).putExtra("launch_parcel", localLaunchParcel);
        if (!(paramContext instanceof Activity)) {
          paramString2.addFlags(268435456);
        }
        w.v("MicroMsg.AppBrandLaunchProxyUI", "start we app with username(%s) and appId(%s) and statObj(%s)", new Object[] { paramString1, str, paramAppBrandStatObject });
        paramString2.putExtra("appbrand_report_key_appid", str);
        paramString2.putExtra("appbrand_report_key_username", paramString1);
        paramString2.putExtra("launch_source_context", paramContext.getClass().getName());
        paramContext.startActivity(paramString2);
        GMTrace.o(15440138993664L, 115038);
        return true;
      }
    }
  }
  
  private static String qK(String paramString)
  {
    GMTrace.i(19676184707072L, 146599);
    if (bg.mZ(paramString))
    {
      GMTrace.o(19676184707072L, 146599);
      return "";
    }
    paramString = new ComponentName(ab.getContext(), paramString);
    PackageManager localPackageManager = ab.getContext().getPackageManager();
    if (localPackageManager == null)
    {
      GMTrace.o(19676184707072L, 146599);
      return "";
    }
    try
    {
      Object localObject = localPackageManager.getActivityInfo(paramString, 128);
      if (localObject == null)
      {
        GMTrace.o(19676184707072L, 146599);
        return "";
      }
      localObject = ((ActivityInfo)localObject).processName;
      GMTrace.o(19676184707072L, 146599);
      return (String)localObject;
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException)
    {
      try
      {
        paramString = localPackageManager.getServiceInfo(paramString, 128);
        if (paramString == null)
        {
          GMTrace.o(19676184707072L, 146599);
          return "";
        }
        paramString = paramString.processName;
        GMTrace.o(19676184707072L, 146599);
        return paramString;
      }
      catch (PackageManager.NameNotFoundException paramString)
      {
        GMTrace.o(19676184707072L, 146599);
      }
    }
    return "";
  }
  
  protected final int Qb()
  {
    GMTrace.i(20349286612992L, 151614);
    GMTrace.o(20349286612992L, 151614);
    return 1;
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(14430284808192L, 107514);
    GMTrace.o(14430284808192L, 107514);
    return -1;
  }
  
  public final void onCreate(Bundle paramBundle)
  {
    GMTrace.i(14430419025920L, 107515);
    super.onCreate(paramBundle);
    g.a(getWindow());
    try
    {
      this.jfS = ((LaunchParcel)getIntent().getParcelableExtra("launch_parcel"));
      if (this.jfS == null)
      {
        finish();
        GMTrace.o(14430419025920L, 107515);
        return;
      }
      getString(p.i.dxm);
      this.jfR = h.a(this, getString(p.i.bUo), true, new DialogInterface.OnCancelListener()
      {
        public final void onCancel(DialogInterface paramAnonymousDialogInterface)
        {
          GMTrace.i(14429211066368L, 107506);
          AppBrandLaunchProxyUI.this.finish();
          GMTrace.o(14429211066368L, 107506);
        }
      });
      if (this.jfR.getWindow() != null)
      {
        paramBundle = this.jfR.getWindow().getAttributes();
        paramBundle.dimAmount = 0.0F;
        this.jfR.getWindow().setAttributes(paramBundle);
      }
      d.xC().C(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(14428942630912L, 107504);
          d.aaV();
          new c(AppBrandLaunchProxyUI.a(AppBrandLaunchProxyUI.this), new c.a()
          {
            public final void b(final AppBrandInitConfig paramAnonymous2AppBrandInitConfig, AppBrandStatObject paramAnonymous2AppBrandStatObject)
            {
              GMTrace.i(17334353788928L, 129151);
              if (AppBrandLaunchProxyUI.b(AppBrandLaunchProxyUI.this))
              {
                GMTrace.o(17334353788928L, 129151);
                return;
              }
              if (paramAnonymous2AppBrandInitConfig == null)
              {
                AppBrandLaunchProxyUI.this.finish();
                GMTrace.o(17334353788928L, 129151);
                return;
              }
              String str = paramAnonymous2AppBrandInitConfig.appId;
              AppBrandLaunchProxyUI.b(paramAnonymous2AppBrandInitConfig, AppBrandLaunchProxyUI.this);
              paramAnonymous2AppBrandStatObject = new j(str)
              {
                final void XU()
                {
                  GMTrace.i(17326971813888L, 129096);
                  AppBrandLaunchProxyUI.this.finish();
                  GMTrace.o(17326971813888L, 129096);
                }
                
                final void XV()
                {
                  GMTrace.i(17327106031616L, 129097);
                  super.XV();
                  AppBrandLaunchProxyUI.this.finish();
                  GMTrace.o(17327106031616L, 129097);
                }
                
                final void onReady()
                {
                  GMTrace.i(17326837596160L, 129095);
                  if (AppBrandLaunchProxyUI.b(AppBrandLaunchProxyUI.this))
                  {
                    GMTrace.o(17326837596160L, 129095);
                    return;
                  }
                  AppBrandLaunchProxyUI.b(AppBrandLaunchProxyUI.this, AppBrandLaunchProxyUI.a(AppBrandLaunchProxyUI.this).username, paramAnonymous2AppBrandInitConfig, AppBrandLaunchProxyUI.a(AppBrandLaunchProxyUI.this).iIy, AppBrandLaunchProxyUI.a(AppBrandLaunchProxyUI.this).jfW, AppBrandLaunchProxyUI.a(AppBrandLaunchProxyUI.this).iIA, AppBrandLaunchProxyUI.a(AppBrandLaunchProxyUI.this).jfX);
                  AppBrandLaunchProxyUI.this.finish();
                  GMTrace.o(17326837596160L, 129095);
                }
              };
              if ((b.rS(str)) || (paramAnonymous2AppBrandInitConfig.iIx) || (Build.VERSION.SDK_INT >= 17))
              {
                paramAnonymous2AppBrandStatObject.onReady();
                GMTrace.o(17334353788928L, 129151);
                return;
              }
              paramAnonymous2AppBrandInitConfig = AppBrandLaunchProxyUI.this;
              long l = bg.Pp();
              int i = w.a.bGq();
              w.d("MicroMsg.AppBrand.PreLaunchCheckForTBS", "check tbs download, cost = %d, cheTBSRet = %d", new Object[] { Long.valueOf(bg.Pp() - l), Integer.valueOf(i) });
              switch (i)
              {
              }
              for (;;)
              {
                GMTrace.o(17334353788928L, 129151);
                return;
                w.i("MicroMsg.AppBrand.PreLaunchCheckForTBS", "check(Activity), onReady");
                paramAnonymous2AppBrandStatObject.onReady();
                GMTrace.o(17334353788928L, 129151);
                return;
                w.i("MicroMsg.AppBrand.PreLaunchCheckForTBS", "check(Activity), goProxyUI");
                if ((paramAnonymous2AppBrandInitConfig == null) || (paramAnonymous2AppBrandInitConfig.isFinishing()))
                {
                  GMTrace.o(17334353788928L, 129151);
                  return;
                }
                paramAnonymous2AppBrandInitConfig.a(paramAnonymous2AppBrandStatObject, new Intent().setClass(paramAnonymous2AppBrandInitConfig, AppBrandTBSDownloadProxyUI.class).putExtra("intent_extra_download_ignore_network_type", true), paramAnonymous2AppBrandStatObject.fEJ);
                GMTrace.o(17334353788928L, 129151);
                return;
                w.i("MicroMsg.AppBrand.PreLaunchCheckForTBS", "check(Activity), dealCannotDownload");
                paramAnonymous2AppBrandStatObject.Yc();
              }
            }
          }).run();
          GMTrace.o(14428942630912L, 107504);
        }
      });
      GMTrace.o(14430419025920L, 107515);
      return;
    }
    catch (Exception paramBundle)
    {
      for (;;) {}
    }
  }
  
  protected final void onDestroy()
  {
    GMTrace.i(14430553243648L, 107516);
    super.onDestroy();
    if (this.jfR != null)
    {
      this.jfR.dismiss();
      this.jfR = null;
    }
    GMTrace.o(14430553243648L, 107516);
  }
  
  static final class LaunchParcel
    implements Parcelable
  {
    public static final Parcelable.Creator<LaunchParcel> CREATOR;
    String appId;
    AppBrandLaunchReferrer iIA;
    String iIy;
    int iQS;
    AppBrandStatObject jfW;
    LaunchParamsOptional jfX;
    String username;
    int version;
    
    static
    {
      GMTrace.i(14432029638656L, 107527);
      CREATOR = new Parcelable.Creator() {};
      GMTrace.o(14432029638656L, 107527);
    }
    
    LaunchParcel()
    {
      GMTrace.i(14431761203200L, 107525);
      GMTrace.o(14431761203200L, 107525);
    }
    
    LaunchParcel(Parcel paramParcel)
    {
      GMTrace.i(14431895420928L, 107526);
      this.username = paramParcel.readString();
      this.appId = paramParcel.readString();
      this.version = paramParcel.readInt();
      this.iQS = paramParcel.readInt();
      this.iIy = paramParcel.readString();
      this.jfW = ((AppBrandStatObject)paramParcel.readParcelable(AppBrandStatObject.class.getClassLoader()));
      this.iIA = ((AppBrandLaunchReferrer)paramParcel.readParcelable(AppBrandLaunchReferrer.class.getClassLoader()));
      this.jfX = ((LaunchParamsOptional)paramParcel.readParcelable(LaunchParamsOptional.class.getClassLoader()));
      GMTrace.o(14431895420928L, 107526);
    }
    
    public final int describeContents()
    {
      GMTrace.i(14431492767744L, 107523);
      GMTrace.o(14431492767744L, 107523);
      return 0;
    }
    
    public final void writeToParcel(Parcel paramParcel, int paramInt)
    {
      GMTrace.i(14431626985472L, 107524);
      paramParcel.writeString(this.username);
      paramParcel.writeString(this.appId);
      paramParcel.writeInt(this.version);
      paramParcel.writeInt(this.iQS);
      paramParcel.writeString(this.iIy);
      paramParcel.writeParcelable(this.jfW, paramInt);
      paramParcel.writeParcelable(this.iIA, paramInt);
      paramParcel.writeParcelable(this.jfX, paramInt);
      GMTrace.o(14431626985472L, 107524);
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/launching/AppBrandLaunchProxyUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */