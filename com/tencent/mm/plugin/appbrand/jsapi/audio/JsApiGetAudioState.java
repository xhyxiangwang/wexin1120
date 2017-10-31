package com.tencent.mm.plugin.appbrand.jsapi.audio;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.aa.c;
import com.tencent.mm.g.a.t;
import com.tencent.mm.g.a.t.b;
import com.tencent.mm.plugin.appbrand.ipc.AppBrandMainProcessService;
import com.tencent.mm.plugin.appbrand.ipc.MainProcessTask;
import com.tencent.mm.plugin.appbrand.jsapi.d;
import com.tencent.mm.plugin.appbrand.k;
import com.tencent.mm.plugin.appbrand.media.b;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class JsApiGetAudioState
  extends com.tencent.mm.plugin.appbrand.jsapi.a
{
  public static final int CTRL_INDEX = 293;
  public static final String NAME = "getAudioState";
  
  public JsApiGetAudioState()
  {
    GMTrace.i(19742219829248L, 147091);
    GMTrace.o(19742219829248L, 147091);
  }
  
  public final void a(k paramk, JSONObject paramJSONObject, int paramInt)
  {
    GMTrace.i(19742354046976L, 147092);
    if (paramJSONObject == null)
    {
      w.e("MicroMsg.JsApiGetAudioState", "getAudioState data is null");
      paramk.v(paramInt, d("fail:data is null", null));
      GMTrace.o(19742354046976L, 147092);
      return;
    }
    paramJSONObject = paramJSONObject.optString("audioId");
    if (TextUtils.isEmpty(paramJSONObject))
    {
      w.e("MicroMsg.JsApiGetAudioState", "getAudioState audioId is empty");
      paramk.v(paramInt, d("fail:audioId is empty", null));
      GMTrace.o(19742354046976L, 147092);
      return;
    }
    GetAudioStateTask localGetAudioStateTask = new GetAudioStateTask(this, paramk, paramInt);
    localGetAudioStateTask.appId = paramk.iqL;
    localGetAudioStateTask.ftO = paramJSONObject;
    AppBrandMainProcessService.a(localGetAudioStateTask);
    GMTrace.o(19742354046976L, 147092);
  }
  
  private static class GetAudioStateTask
    extends MainProcessTask
  {
    public static final Parcelable.Creator<GetAudioStateTask> CREATOR;
    public String appId;
    public int duration;
    public String ftO;
    public int ftP;
    public int hkl;
    public int hkp;
    public String hkq;
    private d iQA;
    public k iQB;
    public int iQC;
    public String iRD;
    public boolean iRF;
    public int iRG;
    
    static
    {
      GMTrace.i(19729066491904L, 146993);
      CREATOR = new Parcelable.Creator() {};
      GMTrace.o(19729066491904L, 146993);
    }
    
    public GetAudioStateTask(Parcel paramParcel)
    {
      GMTrace.i(19728395403264L, 146988);
      this.appId = "";
      this.ftO = "";
      this.duration = 0;
      this.iRF = false;
      f(paramParcel);
      GMTrace.o(19728395403264L, 146988);
    }
    
    public GetAudioStateTask(d paramd, k paramk, int paramInt)
    {
      GMTrace.i(19728261185536L, 146987);
      this.appId = "";
      this.ftO = "";
      this.duration = 0;
      this.iRF = false;
      this.iQA = paramd;
      this.iQB = paramk;
      this.iQC = paramInt;
      GMTrace.o(19728261185536L, 146987);
    }
    
    public final void RS()
    {
      GMTrace.i(19728529620992L, 146989);
      Object localObject = b.Yn();
      if ((!bg.mZ((String)localObject)) && (!((String)localObject).equals(this.appId)))
      {
        w.i("MicroMsg.JsApiGetAudioState", "appId not match, cannot get audio state, currentPlayAppId:%s, appId:%s", new Object[] { localObject, this.appId });
        this.iRF = true;
        this.iRD = "appId not match, cannot get audio state";
        VC();
        GMTrace.o(19728529620992L, 146989);
        return;
      }
      localObject = this.ftO;
      t localt = new t();
      localt.ftM.action = 6;
      localt.ftM.ftO = ((String)localObject);
      com.tencent.mm.sdk.b.a.uLm.m(localt);
      localObject = localt.ftN.ftS;
      if (localObject == null)
      {
        w.e("MicroMsg.JsApiGetAudioState", "return parameter is invalid, audioState is null");
        this.iRF = true;
        this.iRD = "return parameter is invalid";
        VC();
        GMTrace.o(19728529620992L, 146989);
        return;
      }
      if ((((c)localObject).duration < 0) || (((c)localObject).ftP < 0))
      {
        w.e("MicroMsg.JsApiGetAudioState", "return parameter is invalid, duration:%d, currentTime:%d", new Object[] { Integer.valueOf(((c)localObject).duration), Integer.valueOf(((c)localObject).ftP) });
        this.iRF = true;
        this.iRD = "return parameter is invalid";
        VC();
        GMTrace.o(19728529620992L, 146989);
        return;
      }
      this.duration = ((c)localObject).duration;
      this.ftP = ((c)localObject).ftP;
      if (((c)localObject).hko) {}
      for (int i = 1;; i = 0)
      {
        this.iRG = i;
        this.hkq = ((c)localObject).hkq;
        this.hkp = ((c)localObject).hkp;
        this.hkl = ((c)localObject).hkl;
        w.d("MicroMsg.JsApiGetAudioState", "duration: %d , currentTime: %d ,paused: %d , buffered: %d , src: %s, startTime:%d", new Object[] { Integer.valueOf(this.duration), Integer.valueOf(this.ftP), Integer.valueOf(this.iRG), Integer.valueOf(this.hkp), this.hkq, Integer.valueOf(this.hkl) });
        VC();
        GMTrace.o(19728529620992L, 146989);
        return;
      }
    }
    
    public final void VB()
    {
      GMTrace.i(19728663838720L, 146990);
      if (this.iQB == null)
      {
        w.e("MicroMsg.JsApiGetAudioState", "service is null");
        GMTrace.o(19728663838720L, 146990);
        return;
      }
      HashMap localHashMap = new HashMap();
      localHashMap.put("duration", Integer.valueOf(this.duration));
      localHashMap.put("currentTime", Integer.valueOf(this.ftP));
      boolean bool;
      if (this.iRG == 1)
      {
        bool = true;
        localHashMap.put("paused", Boolean.valueOf(bool));
        localHashMap.put("buffered", Integer.valueOf(this.hkp));
        localHashMap.put("src", this.hkq);
        localHashMap.put("startTime", Integer.valueOf(this.hkl));
        if (!TextUtils.isEmpty(this.iRD)) {
          break label223;
        }
      }
      label223:
      for (String str = "";; str = this.iRD)
      {
        if (!this.iRF) {
          break label231;
        }
        w.e("MicroMsg.JsApiGetAudioState", "getAudioState fail, err:%s", new Object[] { str });
        this.iQB.v(this.iQC, this.iQA.d("fail:" + str, null));
        GMTrace.o(19728663838720L, 146990);
        return;
        bool = false;
        break;
      }
      label231:
      this.iQB.v(this.iQC, this.iQA.d("ok", localHashMap));
      GMTrace.o(19728663838720L, 146990);
    }
    
    public final void f(Parcel paramParcel)
    {
      GMTrace.i(19728798056448L, 146991);
      this.appId = paramParcel.readString();
      this.ftO = paramParcel.readString();
      this.duration = paramParcel.readInt();
      this.ftP = paramParcel.readInt();
      this.iRG = paramParcel.readInt();
      this.hkp = paramParcel.readInt();
      this.hkq = paramParcel.readString();
      this.hkl = paramParcel.readInt();
      GMTrace.o(19728798056448L, 146991);
    }
    
    public void writeToParcel(Parcel paramParcel, int paramInt)
    {
      GMTrace.i(19728932274176L, 146992);
      paramParcel.writeString(this.appId);
      paramParcel.writeString(this.ftO);
      paramParcel.writeInt(this.duration);
      paramParcel.writeInt(this.ftP);
      paramParcel.writeInt(this.iRG);
      paramParcel.writeInt(this.hkp);
      paramParcel.writeString(this.hkq);
      paramParcel.writeInt(this.hkl);
      GMTrace.o(19728932274176L, 146992);
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/audio/JsApiGetAudioState.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */