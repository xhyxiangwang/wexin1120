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

public final class JsApiGetMusicPlayerState
  extends a
{
  public static final int CTRL_INDEX = 46;
  public static final String NAME = "getMusicPlayerState";
  private GetMusicPlayerState iRM;
  
  public JsApiGetMusicPlayerState()
  {
    GMTrace.i(19716718460928L, 146901);
    GMTrace.o(19716718460928L, 146901);
  }
  
  public final void a(k paramk, JSONObject paramJSONObject, int paramInt)
  {
    GMTrace.i(19716852678656L, 146902);
    this.iRM = new GetMusicPlayerState(this, paramk, paramInt);
    this.iRM.iRN = paramk.iqL;
    AppBrandMainProcessService.a(this.iRM);
    GMTrace.o(19716852678656L, 146902);
  }
  
  private static class GetMusicPlayerState
    extends MainProcessTask
  {
    public static final Parcelable.Creator<GetMusicPlayerState> CREATOR;
    private com.tencent.mm.plugin.appbrand.jsapi.d iQA;
    private k iQB;
    private int iQC;
    public String iRD;
    public boolean iRF;
    public String iRN;
    public int iRO;
    public String iRP;
    public int jR;
    public int kH;
    public int mStatus;
    
    static
    {
      GMTrace.i(19731079757824L, 147008);
      CREATOR = new Parcelable.Creator() {};
      GMTrace.o(19731079757824L, 147008);
    }
    
    public GetMusicPlayerState(Parcel paramParcel)
    {
      GMTrace.i(19730408669184L, 147003);
      this.iRF = false;
      f(paramParcel);
      GMTrace.o(19730408669184L, 147003);
    }
    
    public GetMusicPlayerState(com.tencent.mm.plugin.appbrand.jsapi.d paramd, k paramk, int paramInt)
    {
      GMTrace.i(19730274451456L, 147002);
      this.iRF = false;
      this.iQA = paramd;
      this.iQB = paramk;
      this.iQC = paramInt;
      GMTrace.o(19730274451456L, 147002);
    }
    
    public final void RS()
    {
      int i = -1;
      GMTrace.i(19730542886912L, 147004);
      Object localObject = c.a.jhi.jhg;
      if ((!bg.mZ((String)localObject)) && (!((String)localObject).equals(this.iRN)))
      {
        w.i("MicroMsg.JsApiGetMusicPlayerState", "appid not match cannot operate");
        this.iRF = true;
        this.iRD = "appid not match cannot operate";
        VC();
        GMTrace.o(19730542886912L, 147004);
        return;
      }
      localObject = b.JP();
      int j;
      if (localObject != null)
      {
        com.tencent.mm.as.d locald = b.JQ();
        if (locald == null) {
          break label243;
        }
        j = locald.kH;
        i = locald.jR;
        this.mStatus = locald.mStatus;
        this.iRO = locald.hHc;
      }
      for (;;)
      {
        this.kH = (j / 1000);
        this.jR = (i / 1000);
        this.iRP = ((aol)localObject).ukj;
        this.iRD = "";
        for (this.iRF = false;; this.iRF = false)
        {
          w.i("MicroMsg.JsApiGetMusicPlayerState", "duration %d , position %d ,status %s , downloadpercent %d , dataurl %s", new Object[] { Integer.valueOf(this.kH), Integer.valueOf(this.jR), Integer.valueOf(this.mStatus), Integer.valueOf(this.iRO), this.iRP });
          VC();
          GMTrace.o(19730542886912L, 147004);
          return;
          this.mStatus = 2;
          this.iRD = "";
        }
        label243:
        j = -1;
      }
    }
    
    public final void VB()
    {
      GMTrace.i(19730677104640L, 147005);
      HashMap localHashMap = new HashMap();
      localHashMap.put("duration", Integer.valueOf(this.kH));
      localHashMap.put("currentPosition", Integer.valueOf(this.jR));
      localHashMap.put("status", Integer.valueOf(this.mStatus));
      localHashMap.put("downloadPercent", Integer.valueOf(this.iRO));
      localHashMap.put("dataUrl", this.iRP);
      k localk = this.iQB;
      int i = this.iQC;
      com.tencent.mm.plugin.appbrand.jsapi.d locald = this.iQA;
      StringBuilder localStringBuilder;
      if (this.iRF)
      {
        localStringBuilder = new StringBuilder("fail");
        if (TextUtils.isEmpty(this.iRD)) {
          str = "";
        }
      }
      for (String str = str;; str = "ok")
      {
        localk.v(i, locald.d(str, localHashMap));
        GMTrace.o(19730677104640L, 147005);
        return;
        str = ":" + this.iRD;
        break;
      }
    }
    
    public final void f(Parcel paramParcel)
    {
      GMTrace.i(19730811322368L, 147006);
      this.iRN = paramParcel.readString();
      if (paramParcel.readByte() != 0) {}
      for (boolean bool = true;; bool = false)
      {
        this.iRF = bool;
        this.kH = paramParcel.readInt();
        this.jR = paramParcel.readInt();
        this.mStatus = paramParcel.readInt();
        this.iRO = paramParcel.readInt();
        this.iRP = paramParcel.readString();
        this.iRD = paramParcel.readString();
        GMTrace.o(19730811322368L, 147006);
        return;
      }
    }
    
    public void writeToParcel(Parcel paramParcel, int paramInt)
    {
      GMTrace.i(19730945540096L, 147007);
      paramParcel.writeString(this.iRN);
      if (this.iRF) {}
      for (byte b = 1;; b = 0)
      {
        paramParcel.writeByte(b);
        paramParcel.writeInt(this.kH);
        paramParcel.writeInt(this.jR);
        paramParcel.writeInt(this.mStatus);
        paramParcel.writeInt(this.iRO);
        paramParcel.writeString(this.iRP);
        paramParcel.writeString(this.iRD);
        GMTrace.o(19730945540096L, 147007);
        return;
      }
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/audio/JsApiGetMusicPlayerState.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */