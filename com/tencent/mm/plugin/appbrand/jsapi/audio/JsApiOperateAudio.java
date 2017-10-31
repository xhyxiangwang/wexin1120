package com.tencent.mm.plugin.appbrand.jsapi.audio;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.a.t;
import com.tencent.mm.g.a.t.b;
import com.tencent.mm.g.a.u;
import com.tencent.mm.plugin.appbrand.ipc.AppBrandMainProcessService;
import com.tencent.mm.plugin.appbrand.ipc.MainProcessTask;
import com.tencent.mm.plugin.appbrand.jsapi.d;
import com.tencent.mm.plugin.appbrand.jsapi.e;
import com.tencent.mm.plugin.appbrand.k;
import com.tencent.mm.sdk.b.c;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import org.json.JSONObject;

public final class JsApiOperateAudio
  extends com.tencent.mm.plugin.appbrand.jsapi.a
{
  public static final int CTRL_INDEX = 297;
  public static final String NAME = "operateAudio";
  private OperateAudioTask iRQ;
  
  public JsApiOperateAudio()
  {
    GMTrace.i(19741951393792L, 147089);
    GMTrace.o(19741951393792L, 147089);
  }
  
  public final void a(k paramk, JSONObject paramJSONObject, int paramInt)
  {
    GMTrace.i(19742085611520L, 147090);
    if (paramJSONObject == null)
    {
      w.e("MicroMsg.JsApiOperateAudio", "operateAudio data is null");
      paramk.v(paramInt, d("fail:data is null", null));
      GMTrace.o(19742085611520L, 147090);
      return;
    }
    w.i("MicroMsg.JsApiOperateAudio", "operateAudio appId:%s, data:%s", new Object[] { paramk.iqL, paramJSONObject.toString() });
    String str = paramJSONObject.optString("audioId");
    int i = paramJSONObject.optInt("currentTime", 0);
    paramJSONObject = paramJSONObject.optString("operationType");
    if (TextUtils.isEmpty(str))
    {
      w.e("MicroMsg.JsApiOperateAudio", "audioId is empty");
      paramk.v(paramInt, d("fail:audioId is empty", null));
      GMTrace.o(19742085611520L, 147090);
      return;
    }
    if (TextUtils.isEmpty(paramJSONObject))
    {
      w.e("MicroMsg.JsApiOperateAudio", "operationType is empty");
      paramk.v(paramInt, d("fail:operationType is empty", null));
      GMTrace.o(19742085611520L, 147090);
      return;
    }
    if (this.iRQ == null) {
      this.iRQ = new OperateAudioTask(this, paramk, paramInt);
    }
    this.iRQ.appId = paramk.iqL;
    this.iRQ.ftO = str;
    this.iRQ.ftP = i;
    this.iRQ.iRR = paramJSONObject;
    AppBrandMainProcessService.a(this.iRQ);
    GMTrace.o(19742085611520L, 147090);
  }
  
  private static final class OperateAudioTask
    extends MainProcessTask
  {
    public static final Parcelable.Creator<OperateAudioTask> CREATOR;
    public int action;
    public String appId;
    public String ftO;
    public int ftP;
    private d iQA;
    public k iQB;
    public int iQC;
    public String iRD;
    public boolean iRF;
    public String iRR;
    public String iRS;
    private c iRT;
    
    static
    {
      GMTrace.i(19737119555584L, 147053);
      CREATOR = new Parcelable.Creator() {};
      GMTrace.o(19737119555584L, 147053);
    }
    
    public OperateAudioTask(Parcel paramParcel)
    {
      GMTrace.i(19736314249216L, 147047);
      this.appId = "";
      this.ftO = "";
      this.iRR = "";
      this.ftP = 0;
      this.iRF = false;
      this.iRT = new c() {};
      f(paramParcel);
      GMTrace.o(19736314249216L, 147047);
    }
    
    public OperateAudioTask(d paramd, k paramk, int paramInt)
    {
      GMTrace.i(19736180031488L, 147046);
      this.appId = "";
      this.ftO = "";
      this.iRR = "";
      this.ftP = 0;
      this.iRF = false;
      this.iRT = new c() {};
      this.iQA = paramd;
      this.iQB = paramk;
      this.iQC = paramInt;
      GMTrace.o(19736180031488L, 147046);
    }
    
    public final void RS()
    {
      boolean bool1 = false;
      boolean bool3 = false;
      boolean bool2 = false;
      GMTrace.i(19736448466944L, 147048);
      w.i("MicroMsg.JsApiOperateAudio", "runInMainProcess");
      String str = com.tencent.mm.plugin.appbrand.media.b.Yn();
      if ((!bg.mZ(str)) && (!str.equals(this.appId)))
      {
        w.i("MicroMsg.JsApiOperateAudio", "appid not match, cannot operate, currentPlayAppId:%s, appId:%s", new Object[] { str, this.appId });
        this.iRF = true;
        this.iRD = "appid not match,  cannot operate";
        VC();
        GMTrace.o(19736448466944L, 147048);
        return;
      }
      w.i("MicroMsg.JsApiOperateAudio", "operationType;%s, currentTime:%d", new Object[] { this.iRR, Integer.valueOf(this.ftP) });
      this.iRF = false;
      this.action = -1;
      str = this.iRR;
      if (str.equalsIgnoreCase("play"))
      {
        com.tencent.mm.plugin.appbrand.media.b.qP(this.appId);
        com.tencent.mm.plugin.appbrand.media.b.qN(this.appId);
        com.tencent.mm.plugin.appbrand.media.b.b(this.appId, this.iRT);
        str = this.ftO;
        if (!com.tencent.mm.aa.b.hs(str))
        {
          bool1 = com.tencent.mm.aa.b.hq(str);
          if (!bool1) {
            break label269;
          }
          w.i("MicroMsg.JsApiOperateAudio", "play audio ok");
          this.action = -1;
        }
      }
      for (;;)
      {
        if (this.iRF) {
          w.e("MicroMsg.JsApiOperateAudio", this.iRD);
        }
        VC();
        GMTrace.o(19736448466944L, 147048);
        return;
        bool1 = bool2;
        if (!com.tencent.mm.aa.b.hs(str)) {
          break;
        }
        bool1 = bool2;
        if (com.tencent.mm.aa.b.hr(str)) {
          break;
        }
        bool1 = com.tencent.mm.aa.b.hq(str);
        break;
        label269:
        if (com.tencent.mm.aa.b.hr(this.ftO))
        {
          this.iRF = true;
          this.iRD = "audio is playing, don't play again";
        }
        else
        {
          this.iRF = true;
          this.iRD = "play audio fail";
          continue;
          t localt;
          if (str.equalsIgnoreCase("pause"))
          {
            str = this.ftO;
            if (com.tencent.mm.aa.b.hr(str))
            {
              w.i("MicroMsg.AudioPlayerHelper", "pauseAudio, audioId:%s", new Object[] { str });
              localt = new t();
              localt.ftM.action = 2;
              localt.ftM.ftO = str;
              com.tencent.mm.sdk.b.a.uLm.m(localt);
              bool1 = localt.ftN.ftR;
            }
            if (bool1)
            {
              w.i("MicroMsg.JsApiOperateAudio", "pause audio ok");
              this.action = -1;
            }
            else
            {
              this.iRF = true;
              this.iRD = "pause audio fail";
            }
          }
          else if (str.equalsIgnoreCase("seek"))
          {
            if (this.ftP < 0)
            {
              w.e("MicroMsg.JsApiOperateAudio", "currentTime %d is invalid!", new Object[] { Integer.valueOf(this.ftP) });
              this.iRF = true;
              this.iRD = "currentTime is invalid";
            }
            else
            {
              str = this.ftO;
              int i = this.ftP;
              w.i("MicroMsg.AudioPlayerHelper", "seekToAudio, audioId:%s, currentTime:%d", new Object[] { str, Integer.valueOf(i) });
              localt = new t();
              localt.ftM.action = 4;
              localt.ftM.ftO = str;
              localt.ftM.ftP = i;
              com.tencent.mm.sdk.b.a.uLm.m(localt);
              if (localt.ftN.ftR)
              {
                w.i("MicroMsg.JsApiOperateAudio", "seek audio ok");
                this.action = -1;
              }
              else
              {
                this.iRF = true;
                this.iRD = "seek audio fail";
              }
            }
          }
          else if (str.equalsIgnoreCase("stop"))
          {
            str = this.ftO;
            if (com.tencent.mm.aa.b.hs(str))
            {
              w.i("MicroMsg.AudioPlayerHelper", "stopAudio, audioId:%s", new Object[] { str });
              localt = new t();
              localt.ftM.action = 3;
              localt.ftM.ftO = str;
              com.tencent.mm.sdk.b.a.uLm.m(localt);
              bool1 = localt.ftN.ftR;
            }
            for (;;)
            {
              if (!bool1) {
                break label821;
              }
              this.action = -1;
              w.i("MicroMsg.JsApiOperateAudio", "stop audio ok");
              break;
              localt = new t();
              localt.ftM.action = 13;
              localt.ftM.ftO = str;
              com.tencent.mm.sdk.b.a.uLm.m(localt);
              bool1 = bool3;
              if (localt.ftN.ftR)
              {
                w.i("MicroMsg.AudioPlayerHelper", "stopAudioOnBackground, audioId:%s", new Object[] { str });
                localt = new t();
                localt.ftM.action = 14;
                localt.ftM.ftO = str;
                com.tencent.mm.sdk.b.a.uLm.m(localt);
                bool1 = localt.ftN.ftR;
              }
            }
            label821:
            this.iRF = true;
            this.iRD = "stop audio fail";
          }
          else
          {
            w.e("MicroMsg.JsApiOperateAudio", "operationType is invalid");
            this.iRF = true;
            this.iRD = "operationType is invalid";
          }
        }
      }
    }
    
    public final void VB()
    {
      GMTrace.i(19736582684672L, 147049);
      if (this.iQB == null)
      {
        w.e("MicroMsg.JsApiOperateAudio", "server is null");
        GMTrace.o(19736582684672L, 147049);
        return;
      }
      if (this.action == -1)
      {
        if (this.iRF)
        {
          this.iQB.v(this.iQC, this.iQA.d("fail:" + this.iRD, null));
          GMTrace.o(19736582684672L, 147049);
          return;
        }
        this.iQB.v(this.iQC, this.iQA.d("ok", null));
        GMTrace.o(19736582684672L, 147049);
        return;
      }
      w.i("MicroMsg.JsApiOperateAudio", "runInClientProcess callback action:%d, retJson:%s", new Object[] { Integer.valueOf(this.action), this.iRS });
      e locale = new JsApiSetAudioState.a().a(this.iQB);
      locale.mData = this.iRS;
      locale.VI();
      GMTrace.o(19736582684672L, 147049);
    }
    
    public final void f(Parcel paramParcel)
    {
      boolean bool = true;
      GMTrace.i(19736716902400L, 147050);
      this.appId = paramParcel.readString();
      this.ftO = paramParcel.readString();
      this.iRR = paramParcel.readString();
      this.ftP = paramParcel.readInt();
      if (paramParcel.readInt() == 1) {}
      for (;;)
      {
        this.iRF = bool;
        this.iRD = paramParcel.readString();
        this.iRS = paramParcel.readString();
        this.action = paramParcel.readInt();
        GMTrace.o(19736716902400L, 147050);
        return;
        bool = false;
      }
    }
    
    public final void writeToParcel(Parcel paramParcel, int paramInt)
    {
      GMTrace.i(19736851120128L, 147051);
      paramParcel.writeString(this.appId);
      paramParcel.writeString(this.ftO);
      paramParcel.writeString(this.iRR);
      paramParcel.writeInt(this.ftP);
      if (this.iRF) {}
      for (paramInt = 1;; paramInt = 0)
      {
        paramParcel.writeInt(paramInt);
        paramParcel.writeString(this.iRD);
        paramParcel.writeString(this.iRS);
        paramParcel.writeInt(this.action);
        GMTrace.o(19736851120128L, 147051);
        return;
      }
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/audio/JsApiOperateAudio.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */