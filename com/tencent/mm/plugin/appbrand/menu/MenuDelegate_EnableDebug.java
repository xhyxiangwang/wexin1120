package com.tencent.mm.plugin.appbrand.menu;

import android.app.Activity;
import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.widget.Toast;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo;
import com.tencent.mm.plugin.appbrand.config.AppBrandSysConfig;
import com.tencent.mm.plugin.appbrand.config.c;
import com.tencent.mm.plugin.appbrand.ipc.AppBrandMainProcessService;
import com.tencent.mm.plugin.appbrand.ipc.MainProcessTask;
import com.tencent.mm.plugin.appbrand.p.i;
import com.tencent.mm.plugin.appbrand.page.AppBrandPageView;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.ui.base.m;

public final class MenuDelegate_EnableDebug
  extends com.tencent.mm.plugin.appbrand.menu.a.a
{
  public MenuDelegate_EnableDebug()
  {
    super(l.jik - 1);
    GMTrace.i(15552747667456L, 115877);
    GMTrace.o(15552747667456L, 115877);
  }
  
  public static void e(Context paramContext, final String paramString, boolean paramBoolean)
  {
    GMTrace.i(17326300725248L, 129091);
    SetAppDebugModeTask localSetAppDebugModeTask = new SetAppDebugModeTask();
    localSetAppDebugModeTask.appId = paramString;
    localSetAppDebugModeTask.fwS = paramBoolean;
    AppBrandMainProcessService.a(localSetAppDebugModeTask);
    if (localSetAppDebugModeTask.fwS) {}
    for (paramString = paramContext.getString(p.i.iwD);; paramString = paramContext.getString(p.i.iwC))
    {
      if ((paramContext instanceof Activity)) {
        ((Activity)paramContext).runOnUiThread(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(17326166507520L, 129090);
            Toast.makeText(this.val$context, paramString, 0).show();
            ((Activity)this.val$context).finish();
            GMTrace.o(17326166507520L, 129090);
          }
        });
      }
      GMTrace.o(17326300725248L, 129091);
      return;
    }
  }
  
  public final void a(Context paramContext, AppBrandPageView paramAppBrandPageView, m paramm, String paramString)
  {
    GMTrace.i(17667482189824L, 131633);
    int i;
    if (!bg.mZ(paramString))
    {
      paramString = com.tencent.mm.plugin.appbrand.a.nx(paramString);
      if ((paramString != null) && (paramString.iJa.iCx != 0))
      {
        i = 1;
        if (i != 0) {
          if (!paramAppBrandPageView.irS.iqO.iIH) {
            break label94;
          }
        }
      }
    }
    label94:
    for (paramContext = paramContext.getString(p.i.iwJ);; paramContext = paramContext.getString(p.i.iwK))
    {
      paramm.e(l.jik - 1, paramContext);
      GMTrace.o(17667482189824L, 131633);
      return;
      i = 0;
      break;
    }
  }
  
  public final void a(Context paramContext, AppBrandPageView paramAppBrandPageView, String paramString, k paramk)
  {
    GMTrace.i(15553016102912L, 115879);
    if (!paramAppBrandPageView.irS.iqO.iIH) {}
    for (boolean bool = true;; bool = false)
    {
      e(paramContext, paramString, bool);
      GMTrace.o(15553016102912L, 115879);
      return;
    }
  }
  
  private static class SetAppDebugModeTask
    extends MainProcessTask
  {
    public static final Parcelable.Creator<SetAppDebugModeTask> CREATOR;
    public String appId;
    public boolean fwS;
    
    static
    {
      GMTrace.i(15557713723392L, 115914);
      CREATOR = new Parcelable.Creator() {};
      GMTrace.o(15557713723392L, 115914);
    }
    
    public SetAppDebugModeTask()
    {
      GMTrace.i(15557042634752L, 115909);
      GMTrace.o(15557042634752L, 115909);
    }
    
    public final void RS()
    {
      GMTrace.i(15557176852480L, 115910);
      String str = this.appId;
      boolean bool = this.fwS;
      if ((bg.mZ(str)) || (com.tencent.mm.plugin.appbrand.app.f.Se() == null))
      {
        GMTrace.o(15557176852480L, 115910);
        return;
      }
      com.tencent.mm.plugin.appbrand.app.f.Se().aP(str + "_AppDebugEnabled", String.valueOf(bool));
      GMTrace.o(15557176852480L, 115910);
    }
    
    public final void f(Parcel paramParcel)
    {
      GMTrace.i(15557311070208L, 115911);
      this.appId = paramParcel.readString();
      if (paramParcel.readByte() != 0) {}
      for (boolean bool = true;; bool = false)
      {
        this.fwS = bool;
        GMTrace.o(15557311070208L, 115911);
        return;
      }
    }
    
    public void writeToParcel(Parcel paramParcel, int paramInt)
    {
      GMTrace.i(15557445287936L, 115912);
      paramParcel.writeString(this.appId);
      if (this.fwS) {}
      for (byte b = 1;; b = 0)
      {
        paramParcel.writeByte(b);
        GMTrace.o(15557445287936L, 115912);
        return;
      }
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/menu/MenuDelegate_EnableDebug.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */