package com.tencent.mm.plugin.appbrand.jsapi.audio;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.a.t;
import com.tencent.mm.g.a.u;
import com.tencent.mm.plugin.appbrand.appstorage.AppBrandLocalMediaObject;
import com.tencent.mm.plugin.appbrand.ipc.AppBrandMainProcessService;
import com.tencent.mm.plugin.appbrand.ipc.MainProcessTask;
import com.tencent.mm.plugin.appbrand.jsapi.d;
import com.tencent.mm.plugin.appbrand.jsapi.e;
import com.tencent.mm.plugin.appbrand.k;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import org.json.JSONObject;

public final class JsApiSetAudioState
  extends com.tencent.mm.plugin.appbrand.jsapi.a
{
  public static final int CTRL_INDEX = 292;
  public static final String NAME = "setAudioState";
  private SetAudioTask iSA;
  
  public JsApiSetAudioState()
  {
    GMTrace.i(19749064933376L, 147142);
    GMTrace.o(19749064933376L, 147142);
  }
  
  public final void a(k paramk, JSONObject paramJSONObject, int paramInt)
  {
    GMTrace.i(19749199151104L, 147143);
    if (paramJSONObject == null)
    {
      w.e("MicroMsg.JsApiSetAudioState", "setAudioState data is null");
      paramk.v(paramInt, d("fail:data is null", null));
      GMTrace.o(19749199151104L, 147143);
      return;
    }
    w.i("MicroMsg.JsApiSetAudioState", "setAudioState data:%s", new Object[] { paramJSONObject.toString() });
    String str1 = paramJSONObject.optString("audioId");
    int i = paramJSONObject.optInt("startTime", 0);
    String str2 = paramJSONObject.optString("src");
    boolean bool1 = paramJSONObject.optBoolean("autoplay", false);
    boolean bool2 = paramJSONObject.optBoolean("loop", false);
    if (TextUtils.isEmpty(str1))
    {
      w.e("MicroMsg.JsApiSetAudioState", "audioId is empty");
      paramk.v(paramInt, d("fail:audioId is empty", null));
      GMTrace.o(19749199151104L, 147143);
      return;
    }
    if (TextUtils.isEmpty(str2))
    {
      w.e("MicroMsg.JsApiSetAudioState", "src is empty");
      paramk.v(paramInt, d("fail:src is empty", null));
      GMTrace.o(19749199151104L, 147143);
      return;
    }
    if (this.iSA == null) {
      this.iSA = new SetAudioTask(this, paramk, paramInt);
    }
    this.iSA.appId = paramk.iqL;
    this.iSA.ftO = str1;
    this.iSA.hkq = str2;
    this.iSA.hkl = i;
    this.iSA.hkm = bool1;
    this.iSA.hkn = bool2;
    AppBrandMainProcessService.a(this.iSA);
    GMTrace.o(19749199151104L, 147143);
  }
  
  private static class SetAudioTask
    extends MainProcessTask
  {
    public static final Parcelable.Creator<SetAudioTask> CREATOR;
    public int action;
    public String appId;
    public String ftO;
    public int hkl;
    public boolean hkm;
    public boolean hkn;
    public String hkq;
    private d iQA;
    public k iQB;
    public int iQC;
    public String iRD;
    public boolean iRF;
    public String iRS;
    private com.tencent.mm.sdk.b.c iRT;
    
    static
    {
      GMTrace.i(19734703636480L, 147035);
      CREATOR = new Parcelable.Creator() {};
      GMTrace.o(19734703636480L, 147035);
    }
    
    public SetAudioTask(Parcel paramParcel)
    {
      GMTrace.i(19733898330112L, 147029);
      this.appId = "";
      this.ftO = "";
      this.hkq = "";
      this.hkl = 0;
      this.hkm = false;
      this.hkn = false;
      this.iRF = false;
      this.iRT = new com.tencent.mm.sdk.b.c() {};
      f(paramParcel);
      GMTrace.o(19733898330112L, 147029);
    }
    
    public SetAudioTask(d paramd, k paramk, int paramInt)
    {
      GMTrace.i(19733764112384L, 147028);
      this.appId = "";
      this.ftO = "";
      this.hkq = "";
      this.hkl = 0;
      this.hkm = false;
      this.hkn = false;
      this.iRF = false;
      this.iRT = new com.tencent.mm.sdk.b.c() {};
      this.iQA = paramd;
      this.iQB = paramk;
      this.iQC = paramInt;
      GMTrace.o(19733764112384L, 147028);
    }
    
    public final void RS()
    {
      GMTrace.i(19734032547840L, 147030);
      w.i("MicroMsg.JsApiSetAudioState", "runInClientProcess");
      this.action = -1;
      this.iRF = false;
      this.iRD = "";
      if (com.tencent.mm.aa.b.hr(this.ftO))
      {
        this.iRF = true;
        this.iRD = "is playing audio, not to start again";
        w.e("MicroMsg.JsApiSetAudioState", "is playing audio, not to start again");
      }
      label358:
      label385:
      for (;;)
      {
        VC();
        GMTrace.o(19734032547840L, 147030);
        return;
        w.i("MicroMsg.JsApiSetAudioState", "appId:%s, audioId:%s, src:%s, startTime:%d", new Object[] { this.appId, this.ftO, this.hkq, Integer.valueOf(this.hkl) });
        com.tencent.mm.aa.a locala = new com.tencent.mm.aa.a();
        locala.ftO = this.ftO;
        locala.hkk = this.hkq;
        locala.hkl = this.hkl;
        locala.hkm = this.hkm;
        locala.hkn = this.hkn;
        locala.fromScene = 0;
        Object localObject;
        if (this.hkq.startsWith("wxfile://"))
        {
          localObject = com.tencent.mm.plugin.appbrand.appstorage.c.aI(this.appId, this.hkq);
          if ((localObject != null) && (!bg.mZ(((AppBrandLocalMediaObject)localObject).hhT))) {
            break label358;
          }
          this.iRF = true;
          this.iRD = "the file not exist for src";
          w.e("MicroMsg.JsApiSetAudioState", "the file not found for src %s", new Object[] { this.hkq });
        }
        for (;;)
        {
          if (this.iRF) {
            break label385;
          }
          com.tencent.mm.plugin.appbrand.media.b.qP(this.appId);
          com.tencent.mm.plugin.appbrand.media.b.qN(this.appId);
          com.tencent.mm.plugin.appbrand.media.b.b(this.appId, this.iRT);
          w.i("MicroMsg.AudioPlayerHelper", "startAudio, audioId:%s, src:%s, startTime:%d, fromScene:%d", new Object[] { locala.ftO, locala.hkk, Integer.valueOf(locala.hkl), Integer.valueOf(locala.fromScene) });
          localObject = new t();
          ((t)localObject).ftM.action = 0;
          ((t)localObject).ftM.ftO = locala.ftO;
          ((t)localObject).ftM.ftQ = locala;
          com.tencent.mm.sdk.b.a.uLm.m((com.tencent.mm.sdk.b.b)localObject);
          break;
          locala.filePath = ((AppBrandLocalMediaObject)localObject).hhT;
          w.i("MicroMsg.JsApiSetAudioState", "filePath:%s", new Object[] { locala.filePath });
        }
      }
    }
    
    public final void VB()
    {
      GMTrace.i(19734166765568L, 147031);
      if (this.iQB == null)
      {
        w.e("MicroMsg.JsApiSetAudioState", "server is null");
        GMTrace.o(19734166765568L, 147031);
        return;
      }
      if (this.action == -1)
      {
        if (this.iRF)
        {
          this.iQB.v(this.iQC, this.iQA.d("fail:" + this.iRD, null));
          GMTrace.o(19734166765568L, 147031);
          return;
        }
        this.iQB.v(this.iQC, this.iQA.d("ok", null));
        GMTrace.o(19734166765568L, 147031);
        return;
      }
      w.i("MicroMsg.JsApiSetAudioState", "runInClientProcess callback action:%d, retJson:%s", new Object[] { Integer.valueOf(this.action), this.iRS });
      e locale = new JsApiSetAudioState.a().a(this.iQB);
      locale.mData = this.iRS;
      locale.VI();
      GMTrace.o(19734166765568L, 147031);
    }
    
    public final void f(Parcel paramParcel)
    {
      boolean bool2 = true;
      GMTrace.i(19734300983296L, 147032);
      this.appId = paramParcel.readString();
      this.ftO = paramParcel.readString();
      this.hkq = paramParcel.readString();
      this.hkl = paramParcel.readInt();
      if (paramParcel.readInt() == 1)
      {
        bool1 = true;
        this.hkm = bool1;
        if (paramParcel.readInt() != 1) {
          break label127;
        }
        bool1 = true;
        label68:
        this.hkn = bool1;
        if (paramParcel.readInt() != 1) {
          break label132;
        }
      }
      label127:
      label132:
      for (boolean bool1 = bool2;; bool1 = false)
      {
        this.iRF = bool1;
        this.iRD = paramParcel.readString();
        this.iRS = paramParcel.readString();
        this.action = paramParcel.readInt();
        GMTrace.o(19734300983296L, 147032);
        return;
        bool1 = false;
        break;
        bool1 = false;
        break label68;
      }
    }
    
    public void writeToParcel(Parcel paramParcel, int paramInt)
    {
      int i = 1;
      GMTrace.i(19734435201024L, 147033);
      paramParcel.writeString(this.appId);
      paramParcel.writeString(this.ftO);
      paramParcel.writeString(this.hkq);
      paramParcel.writeInt(this.hkl);
      if (this.hkm)
      {
        paramInt = 1;
        paramParcel.writeInt(paramInt);
        if (!this.hkn) {
          break label124;
        }
        paramInt = 1;
        label66:
        paramParcel.writeInt(paramInt);
        if (!this.iRF) {
          break label129;
        }
      }
      label124:
      label129:
      for (paramInt = i;; paramInt = 0)
      {
        paramParcel.writeInt(paramInt);
        paramParcel.writeString(this.iRD);
        paramParcel.writeString(this.iRS);
        paramParcel.writeInt(this.action);
        GMTrace.o(19734435201024L, 147033);
        return;
        paramInt = 0;
        break;
        paramInt = 0;
        break label66;
      }
    }
  }
  
  public static final class a
    extends e
  {
    private static final int CTRL_INDEX = -2;
    private static final String NAME = "onAudioStateChange";
    
    public a()
    {
      GMTrace.i(19713228800000L, 146875);
      GMTrace.o(19713228800000L, 146875);
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/audio/JsApiSetAudioState.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */