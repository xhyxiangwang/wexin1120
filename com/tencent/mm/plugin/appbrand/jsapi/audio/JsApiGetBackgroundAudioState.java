package com.tencent.mm.plugin.appbrand.jsapi.audio;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.as.b;
import com.tencent.mm.plugin.appbrand.ipc.AppBrandMainProcessService;
import com.tencent.mm.plugin.appbrand.ipc.MainProcessTask;
import com.tencent.mm.plugin.appbrand.jsapi.a;
import com.tencent.mm.plugin.appbrand.k;
import com.tencent.mm.plugin.appbrand.media.c;
import com.tencent.mm.plugin.appbrand.media.c.a;
import com.tencent.mm.protocal.c.aol;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class JsApiGetBackgroundAudioState
  extends a
{
  public static final int CTRL_INDEX = 159;
  public static final String NAME = "getBackgroundAudioState";
  
  public JsApiGetBackgroundAudioState()
  {
    GMTrace.i(19731213975552L, 147009);
    GMTrace.o(19731213975552L, 147009);
  }
  
  public final void a(k paramk, JSONObject paramJSONObject, int paramInt)
  {
    GMTrace.i(19731348193280L, 147010);
    paramJSONObject = paramk.iqL;
    paramk = new GetBackgroundAudioStateTask(this, paramk, paramInt);
    paramk.appId = paramJSONObject;
    AppBrandMainProcessService.a(paramk);
    GMTrace.o(19731348193280L, 147010);
  }
  
  private static class GetBackgroundAudioStateTask
    extends MainProcessTask
  {
    public static final Parcelable.Creator<GetBackgroundAudioStateTask> CREATOR;
    public String appId;
    public int duration;
    public int ftP;
    public int hkl;
    public int hkp;
    public String hkq;
    private com.tencent.mm.plugin.appbrand.jsapi.d iQA;
    public k iQB;
    public int iQC;
    public String iRD;
    public boolean iRF;
    public int iRG;
    public String iRH;
    public String iRI;
    public String iRJ;
    public String iRK;
    public int iRL;
    public String title;
    
    static
    {
      GMTrace.i(19741817176064L, 147088);
      CREATOR = new Parcelable.Creator() {};
      GMTrace.o(19741817176064L, 147088);
    }
    
    public GetBackgroundAudioStateTask(Parcel paramParcel)
    {
      GMTrace.i(19741146087424L, 147083);
      this.appId = "";
      this.duration = 0;
      this.iRF = false;
      f(paramParcel);
      GMTrace.o(19741146087424L, 147083);
    }
    
    public GetBackgroundAudioStateTask(com.tencent.mm.plugin.appbrand.jsapi.d paramd, k paramk, int paramInt)
    {
      GMTrace.i(19741011869696L, 147082);
      this.appId = "";
      this.duration = 0;
      this.iRF = false;
      this.iQA = paramd;
      this.iQB = paramk;
      this.iQC = paramInt;
      GMTrace.o(19741011869696L, 147082);
    }
    
    public final void RS()
    {
      GMTrace.i(19741280305152L, 147084);
      Object localObject = c.a.jhi.jhg;
      if ((!bg.mZ((String)localObject)) && (!((String)localObject).equals(this.appId)))
      {
        w.i("MicroMsg.JsApiGetBackgroundAudioState", "appid not match cannot get background audio state, preAppId:%s, appId:%s", new Object[] { localObject, this.appId });
        this.iRF = true;
        this.iRD = "appid not match cannot get background audio state";
        VC();
        GMTrace.o(19741280305152L, 147084);
        return;
      }
      localObject = b.JP();
      int j;
      int k;
      int m;
      if (localObject != null)
      {
        com.tencent.mm.as.d locald = b.JQ();
        j = -1;
        i = -1;
        if (locald != null)
        {
          j = locald.kH;
          i = locald.jR;
        }
        if ((locald == null) || (j < 0) || (i < 0))
        {
          w.e("MicroMsg.JsApiGetBackgroundAudioState", "return parameter is invalid, duration_t:%d, position:%d", new Object[] { Integer.valueOf(j), Integer.valueOf(i) });
          this.iRF = true;
          this.iRD = "return parameter is invalid";
          VC();
          GMTrace.o(19741280305152L, 147084);
          return;
        }
        j /= 1000;
        k = i / 1000;
        m = locald.mStatus;
        i = locald.hHc;
        if (j <= 0) {
          break label456;
        }
      }
      label456:
      for (int i = i * j / 100;; i = 0)
      {
        this.duration = j;
        this.ftP = k;
        if (m == 1)
        {
          j = 0;
          this.iRG = j;
          this.hkq = ((aol)localObject).ukj;
          this.hkp = i;
          this.title = ((aol)localObject).ukf;
          this.iRH = ((aol)localObject).ukh;
          this.iRI = ((aol)localObject).ukg;
          this.iRJ = ((aol)localObject).uki;
          this.iRK = ((aol)localObject).ukl;
          this.iRL = 0;
          this.hkl = ((aol)localObject).hkl;
          w.d("MicroMsg.JsApiGetBackgroundAudioState", "duration: %d , currentTime: %d ,paused: %d , buffered: %d , src: %s, startTime:%d, title:%s, singer:%s, webUrl:%s, coverImgUrl:%s", new Object[] { Integer.valueOf(this.duration), Integer.valueOf(this.ftP), Integer.valueOf(this.iRG), Integer.valueOf(this.hkp), this.hkq, Integer.valueOf(this.hkl), this.title, this.iRI, this.iRK, this.iRJ });
        }
        for (;;)
        {
          VC();
          GMTrace.o(19741280305152L, 147084);
          return;
          j = 1;
          break;
          w.e("MicroMsg.JsApiGetBackgroundAudioState", "currentWrapper is null");
          this.iRF = true;
          this.iRD = "currentWrapper is null";
        }
      }
    }
    
    public final void VB()
    {
      GMTrace.i(19741414522880L, 147085);
      if (this.iQB == null)
      {
        w.e("MicroMsg.JsApiGetBackgroundAudioState", "service is null");
        GMTrace.o(19741414522880L, 147085);
        return;
      }
      HashMap localHashMap = new HashMap();
      localHashMap.put("duration", Integer.valueOf(this.duration));
      localHashMap.put("currentTime", Integer.valueOf(this.ftP));
      boolean bool;
      label209:
      label259:
      label282:
      k localk;
      int i;
      com.tencent.mm.plugin.appbrand.jsapi.d locald;
      if (this.iRG == 1)
      {
        bool = true;
        localHashMap.put("paused", Boolean.valueOf(bool));
        localHashMap.put("buffered", Integer.valueOf(this.hkp));
        localHashMap.put("src", this.hkq);
        localHashMap.put("title", this.title);
        localHashMap.put("epname", this.iRH);
        localHashMap.put("singer", this.iRI);
        localHashMap.put("coverImgUrl", this.iRJ);
        localHashMap.put("webUrl", this.iRK);
        if (this.iRL != 1) {
          break label352;
        }
        bool = true;
        localHashMap.put("isLive", Boolean.valueOf(bool));
        localHashMap.put("startTime", Integer.valueOf(this.hkl / 1000));
        if (!TextUtils.isEmpty(this.iRD)) {
          break label357;
        }
        str = "";
        if (!this.iRF) {
          break label365;
        }
        w.e("MicroMsg.JsApiGetBackgroundAudioState", "getBackgroundAudioState fail, err:%s", new Object[] { str });
        localk = this.iQB;
        i = this.iQC;
        locald = this.iQA;
        if (!this.iRF) {
          break label376;
        }
      }
      label352:
      label357:
      label365:
      label376:
      for (String str = "fail:" + str;; str = "ok")
      {
        localk.v(i, locald.d(str, localHashMap));
        GMTrace.o(19741414522880L, 147085);
        return;
        bool = false;
        break;
        bool = false;
        break label209;
        str = this.iRD;
        break label259;
        w.d("MicroMsg.JsApiGetBackgroundAudioState", "getBackgroundAudioState is ok");
        break label282;
      }
    }
    
    public final void f(Parcel paramParcel)
    {
      GMTrace.i(19741548740608L, 147086);
      this.appId = paramParcel.readString();
      this.duration = paramParcel.readInt();
      this.ftP = paramParcel.readInt();
      this.iRG = paramParcel.readInt();
      this.hkp = paramParcel.readInt();
      this.hkq = paramParcel.readString();
      this.title = paramParcel.readString();
      this.iRH = paramParcel.readString();
      this.iRI = paramParcel.readString();
      this.iRJ = paramParcel.readString();
      this.iRK = paramParcel.readString();
      this.iRL = paramParcel.readInt();
      this.hkl = paramParcel.readInt();
      GMTrace.o(19741548740608L, 147086);
    }
    
    public void writeToParcel(Parcel paramParcel, int paramInt)
    {
      GMTrace.i(19741682958336L, 147087);
      paramParcel.writeString(this.appId);
      paramParcel.writeInt(this.duration);
      paramParcel.writeInt(this.ftP);
      paramParcel.writeInt(this.iRG);
      paramParcel.writeInt(this.hkp);
      paramParcel.writeString(this.hkq);
      paramParcel.writeString(this.title);
      paramParcel.writeString(this.iRH);
      paramParcel.writeString(this.iRI);
      paramParcel.writeString(this.iRJ);
      paramParcel.writeString(this.iRK);
      paramParcel.writeInt(this.iRL);
      paramParcel.writeInt(this.hkl);
      GMTrace.o(19741682958336L, 147087);
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/audio/JsApiGetBackgroundAudioState.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */