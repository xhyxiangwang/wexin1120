package com.tencent.mm.plugin.appbrand.jsapi;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.opensdk.channel.MMessageActV2;
import com.tencent.mm.opensdk.channel.MMessageActV2.Args;
import com.tencent.mm.opensdk.modelbiz.WXLaunchMiniProgram.Resp;
import com.tencent.mm.plugin.appbrand.config.AppBrandInitConfig;
import com.tencent.mm.plugin.appbrand.config.AppBrandLaunchReferrer;
import com.tencent.mm.plugin.appbrand.ipc.AppBrandMainProcessService;
import com.tencent.mm.plugin.appbrand.ipc.MainProcessTask;
import com.tencent.mm.plugin.appbrand.k;
import com.tencent.mm.pluginsdk.model.app.g;
import com.tencent.mm.pluginsdk.model.app.p;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bg;
import org.json.JSONObject;

public final class JsApiNavigateBackApplication
  extends a
{
  private static final int CTRL_INDEX = 288;
  private static final String NAME = "navigateBackApplication";
  
  public JsApiNavigateBackApplication()
  {
    GMTrace.i(18201131876352L, 135609);
    GMTrace.o(18201131876352L, 135609);
  }
  
  public final void a(k paramk, JSONObject paramJSONObject, int paramInt)
  {
    GMTrace.i(18201266094080L, 135610);
    Object localObject = paramk.irS.iqN.iIA;
    if ((bg.mZ(((AppBrandLaunchReferrer)localObject).appId)) || (((AppBrandLaunchReferrer)localObject).iIB != 4))
    {
      paramk.v(paramInt, d("fail:not from opensdk", null));
      GMTrace.o(18201266094080L, 135610);
      return;
    }
    paramJSONObject = paramJSONObject.optJSONObject("extraData");
    localObject = ((AppBrandLaunchReferrer)localObject).appId;
    if (paramJSONObject == null) {}
    for (paramJSONObject = "{}";; paramJSONObject = paramJSONObject.toString())
    {
      AppBrandMainProcessService.a(new NavigateBackAppTask((String)localObject, paramJSONObject));
      paramk.v(paramInt, d("ok", null));
      GMTrace.o(18201266094080L, 135610);
      return;
    }
  }
  
  private static final class NavigateBackAppTask
    extends MainProcessTask
  {
    public static final Parcelable.Creator<NavigateBackAppTask> CREATOR;
    public String appId;
    public String data;
    
    static
    {
      GMTrace.i(18202071400448L, 135616);
      CREATOR = new Parcelable.Creator() {};
      GMTrace.o(18202071400448L, 135616);
    }
    
    public NavigateBackAppTask()
    {
      GMTrace.i(18201400311808L, 135611);
      GMTrace.o(18201400311808L, 135611);
    }
    
    public NavigateBackAppTask(String paramString1, String paramString2)
    {
      GMTrace.i(18201534529536L, 135612);
      this.appId = paramString1;
      this.data = paramString2;
      GMTrace.o(18201534529536L, 135612);
    }
    
    public final void RS()
    {
      GMTrace.i(18201668747264L, 135613);
      com.tencent.mm.pluginsdk.model.app.f localf = g.aM(this.appId, true);
      if (localf == null)
      {
        GMTrace.o(18201668747264L, 135613);
        return;
      }
      Bundle localBundle = new Bundle();
      WXLaunchMiniProgram.Resp localResp = new WXLaunchMiniProgram.Resp(localBundle);
      localResp.extMsg = this.data;
      localResp.openId = localf.field_openId;
      MMessageActV2.Args localArgs = new MMessageActV2.Args();
      localArgs.targetPkgName = localf.field_packageName;
      localResp.toBundle(localBundle);
      localArgs.bundle = localBundle;
      p.af(localBundle);
      p.ag(localBundle);
      MMessageActV2.send(ab.getContext(), localArgs);
      GMTrace.o(18201668747264L, 135613);
    }
    
    public final void f(Parcel paramParcel)
    {
      GMTrace.i(18201937182720L, 135615);
      this.appId = paramParcel.readString();
      this.data = paramParcel.readString();
      GMTrace.o(18201937182720L, 135615);
    }
    
    public final void writeToParcel(Parcel paramParcel, int paramInt)
    {
      GMTrace.i(18201802964992L, 135614);
      paramParcel.writeString(this.appId);
      paramParcel.writeString(this.data);
      GMTrace.o(18201802964992L, 135614);
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/JsApiNavigateBackApplication.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */