package com.tencent.mm.plugin.appbrand.jsapi;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.a.qb;
import com.tencent.mm.plugin.appbrand.config.AppBrandSysConfig;
import com.tencent.mm.plugin.appbrand.ipc.AppBrandMainProcessService;
import com.tencent.mm.plugin.appbrand.ipc.MainProcessTask;
import com.tencent.mm.plugin.appbrand.k;
import com.tencent.mm.sdk.b.c;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import org.json.JSONObject;

public final class JsApiMakeVoIPCall
  extends a
{
  public static final int CTRL_INDEX = 154;
  public static final String NAME = "makeVoIPCall";
  private int iPM;
  private k iqQ;
  
  public JsApiMakeVoIPCall()
  {
    GMTrace.i(10307653074944L, 76798);
    GMTrace.o(10307653074944L, 76798);
  }
  
  public final void a(k paramk, JSONObject paramJSONObject, int paramInt)
  {
    GMTrace.i(10307787292672L, 76799);
    this.iqQ = paramk;
    this.iPM = paramInt;
    String str1 = paramJSONObject.optString("context");
    String str2 = paramJSONObject.optString("avatarUrl");
    boolean bool1 = paramJSONObject.optBoolean("showOther");
    boolean bool2 = paramJSONObject.optBoolean("allowBackCamera");
    Object localObject = paramJSONObject.optString("toUserName");
    String str3 = bg.mY(paramJSONObject.optString("scene"));
    String str4 = bg.mY(paramJSONObject.optString("type"));
    AppBrandSysConfig localAppBrandSysConfig = com.tencent.mm.plugin.appbrand.a.nx(paramk.iqL);
    paramJSONObject = (JSONObject)localObject;
    if (bg.mZ((String)localObject))
    {
      paramJSONObject = (JSONObject)localObject;
      if (localAppBrandSysConfig != null) {
        paramJSONObject = localAppBrandSysConfig.ftu;
      }
    }
    if ((bg.mZ(paramk.iqL)) || (bg.mZ(paramJSONObject)))
    {
      w.e("MicroMsg.JsApiMakeVoIPCall", "appId or toUserName invalid!");
      paramk.v(paramInt, d("fail", null));
      GMTrace.o(10307787292672L, 76799);
      return;
    }
    w.d("MicroMsg.JsApiMakeVoIPCall", "allowBackCamera: %s, showOther: %s, avatarUrl: %s, context: %s, toUserName: %s", new Object[] { Boolean.valueOf(bool2), Boolean.valueOf(bool1), str2, str1, paramJSONObject });
    localObject = new StartVoIPCall(this, paramk, paramInt);
    ((StartVoIPCall)localObject).VD();
    AppBrandMainProcessService.a((MainProcessTask)localObject);
    localObject = new Intent();
    ((Intent)localObject).putExtra("voipCSBizId", paramJSONObject);
    ((Intent)localObject).putExtra("voipCSAppId", paramk.iqL);
    if (bool2)
    {
      paramJSONObject = "1";
      ((Intent)localObject).putExtra("voipCSAllowBackCamera", paramJSONObject);
      if (!bool1) {
        break label363;
      }
    }
    label363:
    for (paramJSONObject = "1";; paramJSONObject = "0")
    {
      ((Intent)localObject).putExtra("voipCSShowOther", paramJSONObject);
      ((Intent)localObject).putExtra("voipCSAvatarUrl", str2);
      ((Intent)localObject).putExtra("voipCSContext", str1);
      ((Intent)localObject).putExtra("voipCSScene", str3);
      ((Intent)localObject).putExtra("voipCSType", str4);
      ((Intent)localObject).putExtra("launch_from_appbrand", true);
      com.tencent.mm.bi.d.b(paramk.mContext, "voip_cs", ".ui.VoipCSMainUI", (Intent)localObject);
      GMTrace.o(10307787292672L, 76799);
      return;
      paramJSONObject = "0";
      break;
    }
  }
  
  private static class StartVoIPCall
    extends MainProcessTask
  {
    public static final Parcelable.Creator<StartVoIPCall> CREATOR;
    private d iQA;
    private k iQB;
    private int iQC;
    public c iQD;
    public int status;
    
    static
    {
      GMTrace.i(10414624604160L, 77595);
      CREATOR = new Parcelable.Creator() {};
      GMTrace.o(10414624604160L, 77595);
    }
    
    public StartVoIPCall(Parcel paramParcel)
    {
      GMTrace.i(10413685080064L, 77588);
      this.iQD = new c() {};
      f(paramParcel);
      GMTrace.o(10413685080064L, 77588);
    }
    
    public StartVoIPCall(d paramd, k paramk, int paramInt)
    {
      GMTrace.i(10413550862336L, 77587);
      this.iQD = new c() {};
      this.iQA = paramd;
      this.iQB = paramk;
      this.iQC = paramInt;
      GMTrace.o(10413550862336L, 77587);
    }
    
    public final void RS()
    {
      GMTrace.i(10413819297792L, 77589);
      com.tencent.mm.sdk.b.a.uLm.b(this.iQD);
      GMTrace.o(10413819297792L, 77589);
    }
    
    public final void VB()
    {
      GMTrace.i(10413953515520L, 77590);
      VE();
      w.i("MicroMsg.JsApiMakeVoIPCall", "makeVoIPCall = %d", new Object[] { Integer.valueOf(this.status) });
      if (this.status == 1)
      {
        this.iQB.v(this.iQC, this.iQA.d("cancel", null));
        GMTrace.o(10413953515520L, 77590);
        return;
      }
      if (this.status == 2)
      {
        this.iQB.v(this.iQC, this.iQA.d("ok", null));
        GMTrace.o(10413953515520L, 77590);
        return;
      }
      if (this.status == 3)
      {
        this.iQB.v(this.iQC, this.iQA.d("fail:network error", null));
        GMTrace.o(10413953515520L, 77590);
        return;
      }
      if (this.status == 4)
      {
        this.iQB.v(this.iQC, this.iQA.d("fail:param not match", null));
        GMTrace.o(10413953515520L, 77590);
        return;
      }
      this.iQB.v(this.iQC, this.iQA.d("fail:unknow", null));
      GMTrace.o(10413953515520L, 77590);
    }
    
    public final void f(Parcel paramParcel)
    {
      GMTrace.i(10414087733248L, 77591);
      this.status = paramParcel.readInt();
      GMTrace.o(10414087733248L, 77591);
    }
    
    public void writeToParcel(Parcel paramParcel, int paramInt)
    {
      GMTrace.i(10414221950976L, 77592);
      paramParcel.writeInt(this.status);
      GMTrace.o(10414221950976L, 77592);
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/JsApiMakeVoIPCall.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */