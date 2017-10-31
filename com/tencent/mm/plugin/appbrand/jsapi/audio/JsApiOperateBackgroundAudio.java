package com.tencent.mm.plugin.appbrand.jsapi.audio;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.as.b;
import com.tencent.mm.g.a.jg;
import com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo;
import com.tencent.mm.plugin.appbrand.config.AppBrandSysConfig;
import com.tencent.mm.plugin.appbrand.d.a;
import com.tencent.mm.plugin.appbrand.d.b;
import com.tencent.mm.plugin.appbrand.f;
import com.tencent.mm.plugin.appbrand.ipc.AppBrandMainProcessService;
import com.tencent.mm.plugin.appbrand.ipc.MainProcessTask;
import com.tencent.mm.plugin.appbrand.k;
import com.tencent.mm.plugin.appbrand.media.AppBrandMusicClientService;
import com.tencent.mm.plugin.appbrand.media.c.a;
import com.tencent.mm.plugin.appbrand.ui.banner.AppBrandStickyBannerLogic.a;
import com.tencent.mm.protocal.c.aol;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.x.q;
import com.tencent.mm.x.q.b;
import org.json.JSONException;
import org.json.JSONObject;

public final class JsApiOperateBackgroundAudio
  extends com.tencent.mm.plugin.appbrand.jsapi.a
{
  public static final int CTRL_INDEX = 161;
  public static final String NAME = "operateBackgroundAudio";
  public OperateBackgroundAudioTask iRV;
  
  public JsApiOperateBackgroundAudio()
  {
    GMTrace.i(19747722756096L, 147132);
    GMTrace.o(19747722756096L, 147132);
  }
  
  public final void a(final k paramk, JSONObject paramJSONObject, final int paramInt)
  {
    GMTrace.i(19747856973824L, 147133);
    if (paramJSONObject == null)
    {
      paramk.v(paramInt, d("fail:data is null", null));
      w.e("MicroMsg.JsApiOperateBackgroundAudio", "operateBackgroundAudio data is null");
      GMTrace.o(19747856973824L, 147133);
      return;
    }
    ??? = paramk.iqL;
    w.i("MicroMsg.JsApiOperateBackgroundAudio", "operateBackgroundAudio appId:%s", new Object[] { ??? });
    if (this.iRV == null) {
      this.iRV = new OperateBackgroundAudioTask(this, paramk, paramInt);
    }
    this.iRV.iQC = paramInt;
    this.iRV.appId = ((String)???);
    this.iRV.iSa = paramJSONObject.toString();
    final AppBrandSysConfig localAppBrandSysConfig1 = com.tencent.mm.plugin.appbrand.a.nx((String)???);
    this.iRV.fBH = localAppBrandSysConfig1.iJa.iCx;
    this.iRV.fxq = localAppBrandSysConfig1.fxq;
    this.iRV.fBG = localAppBrandSysConfig1.ftu;
    paramJSONObject = q.gi("AppBrandService#" + paramk.hashCode());
    for (;;)
    {
      synchronized (q.Aw().n(paramJSONObject, true))
      {
        paramJSONObject = (com.tencent.mm.plugin.appbrand.ui.banner.e)((q.b)???).get("StickyBannerChangeListener", null);
        if (paramJSONObject == null)
        {
          paramJSONObject = new com.tencent.mm.plugin.appbrand.ui.banner.e()
          {
            public final void X(String paramAnonymousString, int paramAnonymousInt)
            {
              GMTrace.i(19745709490176L, 147117);
              String str = localObject.getString("appId", "");
              int i = localObject.getInt("pkgType", 0);
              if (((!str.equals(paramAnonymousString)) || (i != paramAnonymousInt)) && (localObject.gj("operateBackgroundAudio#isPlaying")) && (com.tencent.mm.plugin.appbrand.d.nK(str) != d.a.iqv))
              {
                w.i("MicroMsg.JsApiOperateBackgroundAudio", "onStickyBannerChanged, pause the music");
                paramAnonymousString = new JSONObject();
              }
              try
              {
                paramAnonymousString.put("operationType", "pause");
                if (JsApiOperateBackgroundAudio.this.iRV == null) {
                  JsApiOperateBackgroundAudio.this.iRV = new JsApiOperateBackgroundAudio.OperateBackgroundAudioTask(JsApiOperateBackgroundAudio.this, paramk, paramInt);
                }
                JsApiOperateBackgroundAudio.this.iRV.iSa = paramAnonymousString.toString();
                JsApiOperateBackgroundAudio.this.iRV.appId = str;
                JsApiOperateBackgroundAudio.this.iRV.iLn = localObject;
                JsApiOperateBackgroundAudio.this.iRV.fBH = localAppBrandSysConfig1.iJa.iCx;
                JsApiOperateBackgroundAudio.this.iRV.fxq = localAppBrandSysConfig1.fxq;
                JsApiOperateBackgroundAudio.this.iRV.fBG = localAppBrandSysConfig1.ftu;
                AppBrandMainProcessService.a(JsApiOperateBackgroundAudio.this.iRV);
                GMTrace.o(19745709490176L, 147117);
                return;
              }
              catch (JSONException localJSONException)
              {
                for (;;) {}
              }
            }
          };
          AppBrandSysConfig localAppBrandSysConfig2 = com.tencent.mm.plugin.appbrand.a.nx(paramk.iqL);
          if (localAppBrandSysConfig2 != null) {
            ((q.b)???).k("pkgType", Integer.valueOf(localAppBrandSysConfig2.iJa.iCx));
          }
          ((q.b)???).k("StickyBannerChangeListener", paramJSONObject);
          ((q.b)???).k("appId", paramk.iqL);
          if ((d.b)((q.b)???).get("AppBrandLifeCycle.Listener", null) == null)
          {
            paramk = new d.b()
            {
              public final void onDestroy()
              {
                GMTrace.i(19727321661440L, 146980);
                String str = localObject.getString("appId", "");
                w.i("MicroMsg.JsApiOperateBackgroundAudio", "onDestroy, appId:%s", new Object[] { str });
                JSONObject localJSONObject = new JSONObject();
                try
                {
                  localJSONObject.put("operationType", "stop");
                  if (JsApiOperateBackgroundAudio.this.iRV == null) {
                    JsApiOperateBackgroundAudio.this.iRV = new JsApiOperateBackgroundAudio.OperateBackgroundAudioTask(JsApiOperateBackgroundAudio.this, paramk, paramInt);
                  }
                  JsApiOperateBackgroundAudio.this.iRV.iSa = localJSONObject.toString();
                  JsApiOperateBackgroundAudio.this.iRV.appId = str;
                  JsApiOperateBackgroundAudio.this.iRV.action = -1;
                  JsApiOperateBackgroundAudio.this.iRV.iLn = localObject;
                  JsApiOperateBackgroundAudio.this.iRV.fBH = localAppBrandSysConfig1.iJa.iCx;
                  JsApiOperateBackgroundAudio.this.iRV.fxq = localAppBrandSysConfig1.fxq;
                  JsApiOperateBackgroundAudio.this.iRV.fBG = localAppBrandSysConfig1.ftu;
                  AppBrandMainProcessService.b(JsApiOperateBackgroundAudio.this.iRV);
                  GMTrace.o(19727321661440L, 146980);
                  return;
                }
                catch (JSONException localJSONException)
                {
                  for (;;) {}
                }
              }
            };
            ((q.b)???).k("AppBrandLifeCycle.Listener", paramk);
            this.iRV.iRZ = paramk;
          }
          this.iRV.iRY = paramJSONObject;
          this.iRV.iLn = ((q.b)???);
          AppBrandMainProcessService.a(this.iRV);
          GMTrace.o(19747856973824L, 147133);
          return;
        }
      }
    }
  }
  
  private static class OperateBackgroundAudioTask
    extends MainProcessTask
  {
    public static final Parcelable.Creator<OperateBackgroundAudioTask> CREATOR;
    public int action;
    public String appId;
    public String fBG;
    public int fBH;
    public String fxq;
    q.b iLn;
    private com.tencent.mm.plugin.appbrand.jsapi.d iQA;
    public k iQB;
    public int iQC;
    public String iRD;
    public boolean iRF;
    public String iRS;
    com.tencent.mm.plugin.appbrand.ui.banner.e iRY;
    d.b iRZ;
    public String iSa;
    private final com.tencent.mm.sdk.b.c iSb;
    
    static
    {
      GMTrace.i(19722087170048L, 146941);
      CREATOR = new Parcelable.Creator() {};
      GMTrace.o(19722087170048L, 146941);
    }
    
    public OperateBackgroundAudioTask(Parcel paramParcel)
    {
      GMTrace.i(19721147645952L, 146934);
      this.iRF = false;
      this.iRD = "";
      this.iSb = new com.tencent.mm.sdk.b.c() {};
      f(paramParcel);
      GMTrace.o(19721147645952L, 146934);
    }
    
    public OperateBackgroundAudioTask(com.tencent.mm.plugin.appbrand.jsapi.a parama, k paramk, int paramInt)
    {
      GMTrace.i(19721013428224L, 146933);
      this.iRF = false;
      this.iRD = "";
      this.iSb = new com.tencent.mm.sdk.b.c() {};
      this.iQA = parama;
      this.iQB = paramk;
      this.iQC = paramInt;
      GMTrace.o(19721013428224L, 146933);
    }
    
    public final void RS()
    {
      GMTrace.i(19721281863680L, 146935);
      w.i("MicroMsg.JsApiOperateBackgroundAudio", "runInMainProcess");
      String str1 = c.a.jhi.jhg;
      if ((!bg.mZ(str1)) && (!str1.equals(this.appId)))
      {
        w.i("MicroMsg.JsApiOperateBackgroundAudio", "appid not match cannot operate, preAppId:%s, appId:%s", new Object[] { str1, this.appId });
        this.iRF = true;
        this.iRD = "appid not match cannot operate";
        VC();
        GMTrace.o(19721281863680L, 146935);
        return;
      }
      String str2;
      int i;
      try
      {
        JSONObject localJSONObject = new JSONObject(this.iSa);
        str2 = localJSONObject.optString("operationType");
        i = localJSONObject.optInt("currentTime", -1);
        if (TextUtils.isEmpty(str2))
        {
          w.e("MicroMsg.JsApiOperateBackgroundAudio", "operationType is null");
          this.iRF = true;
          this.action = -1;
          this.iRD = "operationType is null";
          VC();
          GMTrace.o(19721281863680L, 146935);
          return;
        }
      }
      catch (JSONException localJSONException)
      {
        w.e("MicroMsg.JsApiOperateBackgroundAudio", "new json exists exception, data is invalid, jsonStr:%s", new Object[] { this.iSa });
        this.iRF = true;
        this.action = -1;
        this.iRD = "parser data fail, data is invalid";
        w.e("MicroMsg.JsApiOperateBackgroundAudio", "exception:%s" + localJSONException.getMessage());
        VC();
        GMTrace.o(19721281863680L, 146935);
        return;
      }
      w.i("MicroMsg.JsApiOperateBackgroundAudio", "operationType;%s, currentTime:%d", new Object[] { str2, Integer.valueOf(i) });
      this.iRF = false;
      this.action = -1;
      if (str2.equalsIgnoreCase("play"))
      {
        if (!bg.mZ(localJSONException))
        {
          w.i("MicroMsg.JsApiOperateBackgroundAudio", "remove listener preAppid is %s, appid is %s", new Object[] { localJSONException, this.appId });
          c.a.jhi.pU(localJSONException);
        }
        c.a.jhi.a(this.iSb, this.appId);
        c.a.jhi.c(this.appId, this.fBH, this.fxq, this.fBG);
        aol localaol = b.JP();
        if (localaol != null) {
          c.a.jhi.jhh = localaol.tIh;
        }
        if (com.tencent.mm.as.c.JR()) {
          w.i("MicroMsg.JsApiOperateBackgroundAudio", "play music ok");
        }
      }
      for (;;)
      {
        if (this.iRF) {
          w.e("MicroMsg.JsApiOperateBackgroundAudio", this.iRD);
        }
        VC();
        GMTrace.o(19721281863680L, 146935);
        return;
        if (b.JN())
        {
          this.iRF = true;
          this.iRD = "music is playing, don't play again";
        }
        else
        {
          this.iRF = true;
          this.iRD = "play music fail";
          continue;
          if (str2.equalsIgnoreCase("pause"))
          {
            if (com.tencent.mm.as.c.JS())
            {
              w.i("MicroMsg.JsApiOperateBackgroundAudio", "pause music ok");
            }
            else
            {
              this.iRF = true;
              this.iRD = "pause music fail";
            }
          }
          else if (str2.equalsIgnoreCase("seek"))
          {
            if (i < 0)
            {
              w.e("MicroMsg.JsApiOperateBackgroundAudio", "currentTime is invalid!");
              this.iRF = true;
              this.iRD = "currentTime is invalid";
            }
            else if (b.gu(i * 1000))
            {
              w.i("MicroMsg.JsApiOperateBackgroundAudio", "seek music ok");
            }
            else
            {
              this.iRF = true;
              this.iRD = "seek music fail";
            }
          }
          else if (str2.equalsIgnoreCase("stop"))
          {
            if (com.tencent.mm.as.c.JT())
            {
              w.i("MicroMsg.JsApiOperateBackgroundAudio", "stop music ok");
            }
            else
            {
              this.iRF = true;
              this.iRD = "stop music fail";
            }
          }
          else
          {
            w.e("MicroMsg.JsApiOperateBackgroundAudio", "operationType is invalid");
            this.iRF = true;
            this.iRD = "operationType is invalid";
          }
        }
      }
    }
    
    public final void VB()
    {
      GMTrace.i(19721416081408L, 146936);
      if (this.iQB == null)
      {
        w.e("MicroMsg.JsApiOperateBackgroundAudio", "service is null, don't callback");
        GMTrace.o(19721416081408L, 146936);
        return;
      }
      if (this.action == -1)
      {
        if (!this.iRF)
        {
          w.i("MicroMsg.JsApiOperateBackgroundAudio", "operateBackgroundAudio ok");
          this.iQB.v(this.iQC, this.iQA.d("ok", null));
          GMTrace.o(19721416081408L, 146936);
          return;
        }
        w.e("MicroMsg.JsApiOperateBackgroundAudio", "operateBackgroundAudio fail:%s", new Object[] { this.iRD });
        this.iQB.v(this.iQC, this.iQA.d("fail:" + this.iRD, null));
        GMTrace.o(19721416081408L, 146936);
        return;
      }
      switch (this.action)
      {
      }
      for (;;)
      {
        w.i("MicroMsg.JsApiOperateBackgroundAudio", "operateBackgroundAudio onBackgroundAudioStateChange callback action:%d, retJson:%s, lockCount:%d", new Object[] { Integer.valueOf(this.action), this.iRS, Integer.valueOf(JsApiSetBackgroundAudioState.iSC) });
        com.tencent.mm.plugin.appbrand.jsapi.e locale = new JsApiOperateBackgroundAudio.a().a(this.iQB);
        locale.mData = this.iRS;
        locale.VI();
        GMTrace.o(19721416081408L, 146936);
        return;
        this.iLn.k("operateBackgroundAudio#isPlaying", Boolean.valueOf(true));
        AppBrandStickyBannerLogic.a.d(this.iRY);
        com.tencent.mm.plugin.appbrand.d.a(this.appId, this.iRZ);
        AppBrandMusicClientService.jhe.jhf = this.appId;
        if (JsApiSetBackgroundAudioState.iSC > 0)
        {
          JsApiSetBackgroundAudioState.iSC -= 1;
          this.iQB.irS.RG();
        }
        if (JsApiSetBackgroundAudioState.iSC == 0)
        {
          JsApiSetBackgroundAudioState.iSC += 1;
          this.iQB.irS.RF();
          continue;
          this.iLn.k("operateBackgroundAudio#isPlaying", Boolean.valueOf(false));
          AppBrandStickyBannerLogic.a.c(this.iRY);
          com.tencent.mm.plugin.appbrand.d.b(this.appId, this.iRZ);
          if (JsApiSetBackgroundAudioState.iSC > 0)
          {
            JsApiSetBackgroundAudioState.iSC -= 1;
            this.iQB.irS.RG();
          }
          AppBrandMusicClientService.jhe.iR(this.action);
          continue;
          AppBrandMusicClientService.jhe.iR(this.action);
        }
      }
    }
    
    public final void f(Parcel paramParcel)
    {
      boolean bool = true;
      GMTrace.i(19721550299136L, 146937);
      this.appId = paramParcel.readString();
      this.iSa = paramParcel.readString();
      if (paramParcel.readInt() == 1) {}
      for (;;)
      {
        this.iRF = bool;
        this.iRD = paramParcel.readString();
        this.iRS = paramParcel.readString();
        this.action = paramParcel.readInt();
        this.fBH = paramParcel.readInt();
        this.fxq = paramParcel.readString();
        this.fBG = paramParcel.readString();
        GMTrace.o(19721550299136L, 146937);
        return;
        bool = false;
      }
    }
    
    public void writeToParcel(Parcel paramParcel, int paramInt)
    {
      GMTrace.i(19721684516864L, 146938);
      paramParcel.writeString(this.appId);
      paramParcel.writeString(this.iSa);
      if (this.iRF) {}
      for (paramInt = 1;; paramInt = 0)
      {
        paramParcel.writeInt(paramInt);
        paramParcel.writeString(this.iRD);
        paramParcel.writeString(this.iRS);
        paramParcel.writeInt(this.action);
        paramParcel.writeInt(this.fBH);
        paramParcel.writeString(this.fxq);
        paramParcel.writeString(this.fBG);
        GMTrace.o(19721684516864L, 146938);
        return;
      }
    }
  }
  
  public static final class a
    extends com.tencent.mm.plugin.appbrand.jsapi.e
  {
    private static final int CTRL_INDEX = 162;
    private static final String NAME = "onBackgroundAudioStateChange";
    
    public a()
    {
      GMTrace.i(19740609216512L, 147079);
      GMTrace.o(19740609216512L, 147079);
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/audio/JsApiOperateBackgroundAudio.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */