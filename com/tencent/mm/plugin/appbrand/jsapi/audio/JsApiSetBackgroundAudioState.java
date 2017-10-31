package com.tencent.mm.plugin.appbrand.jsapi.audio;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.a.jg;
import com.tencent.mm.kernel.h;
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

public final class JsApiSetBackgroundAudioState
  extends com.tencent.mm.plugin.appbrand.jsapi.a
{
  public static final int CTRL_INDEX = 160;
  public static final String NAME = "setBackgroundAudioState";
  public static int iSC;
  public SetBackgroundAudioStateTask iSD;
  
  static
  {
    GMTrace.i(19714302541824L, 146883);
    iSC = 0;
    GMTrace.o(19714302541824L, 146883);
  }
  
  public JsApiSetBackgroundAudioState()
  {
    GMTrace.i(19714034106368L, 146881);
    GMTrace.o(19714034106368L, 146881);
  }
  
  public final void a(final k paramk, JSONObject paramJSONObject, final int paramInt)
  {
    GMTrace.i(19714168324096L, 146882);
    if (paramJSONObject == null)
    {
      paramk.v(paramInt, d("fail:data is null", null));
      w.e("MicroMsg.JsApiSetBackgroundAudioState", "setBackgroundAudioState data is null");
      GMTrace.o(19714168324096L, 146882);
      return;
    }
    ??? = paramk.iqL;
    w.i("MicroMsg.JsApiSetBackgroundAudioState", "setBackgroundAudioState appId:%s ,data:%s", new Object[] { ???, paramJSONObject.toString() });
    if (this.iSD == null) {
      this.iSD = new SetBackgroundAudioStateTask(this, paramk, paramInt);
    }
    this.iSD.iQC = paramInt;
    this.iSD.appId = ((String)???);
    this.iSD.iSa = paramJSONObject.toString();
    final AppBrandSysConfig localAppBrandSysConfig1 = com.tencent.mm.plugin.appbrand.a.nx((String)???);
    this.iSD.fBH = localAppBrandSysConfig1.iJa.iCx;
    this.iSD.fxq = localAppBrandSysConfig1.fxq;
    this.iSD.fBG = localAppBrandSysConfig1.ftu;
    w.i("MicroMsg.JsApiSetBackgroundAudioState", "pkgType:%d, brandName:%s, appUserName", new Object[] { Integer.valueOf(this.iSD.fBH), this.iSD.fxq, this.iSD.fBG });
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
              GMTrace.i(19745441054720L, 147115);
              String str = localObject.getString("appId", "");
              int i = localObject.getInt("pkgType", 0);
              if (((!str.equals(paramAnonymousString)) || (i != paramAnonymousInt)) && (localObject.gj("setBackgroundAudioState#isPlaying")) && (com.tencent.mm.plugin.appbrand.d.nK(str) != d.a.iqv))
              {
                w.i("MicroMsg.JsApiSetBackgroundAudioState", "onStickyBannerChanged, pause the music");
                paramAnonymousString = new JSONObject();
              }
              try
              {
                paramAnonymousString.put("operationType", "pause");
                if (JsApiSetBackgroundAudioState.this.iSD == null) {
                  JsApiSetBackgroundAudioState.this.iSD = new JsApiSetBackgroundAudioState.SetBackgroundAudioStateTask(JsApiSetBackgroundAudioState.this, paramk, paramInt);
                }
                JsApiSetBackgroundAudioState.this.iSD.iSa = paramAnonymousString.toString();
                JsApiSetBackgroundAudioState.this.iSD.appId = str;
                JsApiSetBackgroundAudioState.this.iSD.iLn = localObject;
                JsApiSetBackgroundAudioState.this.iSD.fBH = localAppBrandSysConfig1.iJa.iCx;
                JsApiSetBackgroundAudioState.this.iSD.fxq = localAppBrandSysConfig1.fxq;
                JsApiSetBackgroundAudioState.this.iSD.fBG = localAppBrandSysConfig1.ftu;
                AppBrandMainProcessService.a(JsApiSetBackgroundAudioState.this.iSD);
                GMTrace.o(19745441054720L, 147115);
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
                GMTrace.i(19713899888640L, 146880);
                String str = localObject.getString("appId", "");
                w.i("MicroMsg.JsApiSetBackgroundAudioState", "onDestroy, appId:%s", new Object[] { str });
                JSONObject localJSONObject = new JSONObject();
                try
                {
                  localJSONObject.put("operationType", "stop");
                  if (JsApiSetBackgroundAudioState.this.iSD == null) {
                    JsApiSetBackgroundAudioState.this.iSD = new JsApiSetBackgroundAudioState.SetBackgroundAudioStateTask(JsApiSetBackgroundAudioState.this, paramk, paramInt);
                  }
                  JsApiSetBackgroundAudioState.this.iSD.iSa = localJSONObject.toString();
                  JsApiSetBackgroundAudioState.this.iSD.appId = str;
                  JsApiSetBackgroundAudioState.this.iSD.action = -1;
                  JsApiSetBackgroundAudioState.this.iSD.iLn = localObject;
                  JsApiSetBackgroundAudioState.this.iSD.fBH = localAppBrandSysConfig1.iJa.iCx;
                  JsApiSetBackgroundAudioState.this.iSD.fxq = localAppBrandSysConfig1.fxq;
                  JsApiSetBackgroundAudioState.this.iSD.fBG = localAppBrandSysConfig1.ftu;
                  AppBrandMainProcessService.b(JsApiSetBackgroundAudioState.this.iSD);
                  GMTrace.o(19713899888640L, 146880);
                  return;
                }
                catch (JSONException localJSONException)
                {
                  for (;;) {}
                }
              }
            };
            ((q.b)???).k("AppBrandLifeCycle.Listener", paramk);
            this.iSD.iRZ = paramk;
          }
          this.iSD.iRY = paramJSONObject;
          this.iSD.iLn = ((q.b)???);
          AppBrandMainProcessService.a(this.iSD);
          GMTrace.o(19714168324096L, 146882);
          return;
        }
      }
    }
  }
  
  private static class SetBackgroundAudioStateTask
    extends MainProcessTask
  {
    public static final Parcelable.Creator<SetBackgroundAudioStateTask> CREATOR;
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
      GMTrace.i(19726650572800L, 146975);
      CREATOR = new Parcelable.Creator() {};
      GMTrace.o(19726650572800L, 146975);
    }
    
    public SetBackgroundAudioStateTask(Parcel paramParcel)
    {
      GMTrace.i(19725711048704L, 146968);
      this.iRF = false;
      this.iRD = "";
      this.iSb = new com.tencent.mm.sdk.b.c() {};
      f(paramParcel);
      GMTrace.o(19725711048704L, 146968);
    }
    
    public SetBackgroundAudioStateTask(com.tencent.mm.plugin.appbrand.jsapi.a parama, k paramk, int paramInt)
    {
      GMTrace.i(19725576830976L, 146967);
      this.iRF = false;
      this.iRD = "";
      this.iSb = new com.tencent.mm.sdk.b.c() {};
      this.iQA = parama;
      this.iQB = paramk;
      this.iQC = paramInt;
      GMTrace.o(19725576830976L, 146967);
    }
    
    public final void RS()
    {
      GMTrace.i(19725845266432L, 146969);
      w.i("MicroMsg.JsApiSetBackgroundAudioState", "runInMainProcess");
      String str3;
      String str4;
      String str5;
      String str6;
      String str7;
      boolean bool;
      int i;
      try
      {
        localObject2 = new JSONObject(this.iSa);
        str3 = ((JSONObject)localObject2).optString("src");
        str4 = ((JSONObject)localObject2).optString("title");
        str5 = ((JSONObject)localObject2).optString("epname");
        str6 = ((JSONObject)localObject2).optString("singer");
        str2 = ((JSONObject)localObject2).optString("coverImgUrl");
        str7 = ((JSONObject)localObject2).optString("webUrl");
        bool = ((JSONObject)localObject2).optBoolean("isLive", false);
        i = ((JSONObject)localObject2).optInt("startTime", 0);
        String str1 = c.a.jhi.jhg;
        localObject2 = ((JSONObject)localObject2).optString("operationType");
        if (TextUtils.isEmpty((CharSequence)localObject2)) {
          break label357;
        }
        w.i("MicroMsg.JsApiSetBackgroundAudioState", "come from onStickyBannerChanged pause or lifeCycleListener onDestroy");
        str1 = c.a.jhi.jhg;
        if ((!bg.mZ(str1)) && (!str1.equals(this.appId)))
        {
          w.i("MicroMsg.JsApiSetBackgroundAudioState", "appid not match cannot operate, preAppId:%s, appId:%s", new Object[] { str1, this.appId });
          GMTrace.o(19725845266432L, 146969);
          return;
        }
      }
      catch (JSONException localJSONException)
      {
        w.e("MicroMsg.JsApiSetBackgroundAudioState", "new json exists exception, data is invalid");
        this.iRF = true;
        this.action = -1;
        this.iRD = "parser data fail, data is invalid";
        w.e("MicroMsg.JsApiSetBackgroundAudioState", "exception:%s" + localJSONException.getMessage());
        GMTrace.o(19725845266432L, 146969);
        return;
      }
      this.iRF = false;
      this.action = -1;
      if (((String)localObject2).equalsIgnoreCase("pause")) {
        if (com.tencent.mm.as.c.JS())
        {
          w.i("MicroMsg.JsApiSetBackgroundAudioState", "pause music ok");
          this.action = -2;
        }
      }
      for (;;)
      {
        VC();
        GMTrace.o(19725845266432L, 146969);
        return;
        this.iRF = true;
        this.iRD = "pause music fail";
        continue;
        if (((String)localObject2).equalsIgnoreCase("stop")) {
          if (com.tencent.mm.as.c.JT())
          {
            w.i("MicroMsg.JsApiSetBackgroundAudioState", "stop music ok");
            this.action = -2;
          }
          else
          {
            this.iRF = true;
            this.iRD = "stop music fail";
          }
        }
      }
      label357:
      if (TextUtils.isEmpty(str3))
      {
        w.e("MicroMsg.JsApiSetBackgroundAudioState", "src is null");
        this.iRF = true;
        this.action = -1;
        this.iRD = "src is null";
        VC();
        GMTrace.o(19725845266432L, 146969);
        return;
      }
      Object localObject2 = new jg();
      ((jg)localObject2).fGj.action = 10;
      ((jg)localObject2).fGj.state = "preempted";
      ((jg)localObject2).fGj.appId = this.appId;
      ((jg)localObject2).fGj.fGl = true;
      com.tencent.mm.sdk.b.a.uLm.m((com.tencent.mm.sdk.b.b)localObject2);
      w.i("MicroMsg.JsApiSetBackgroundAudioState", "src;%s, title:%s, epname:%s, singer:%s, coverImgUrl:%s, isLive:%b, webUrl:%s, startTime:%d", new Object[] { str3, str4, str5, str6, str2, Boolean.valueOf(bool), str7, Integer.valueOf(i) });
      if (!bg.mZ(localJSONException))
      {
        w.i("MicroMsg.JsApiSetBackgroundAudioState", "remove listener preAppid is %s, appid is %s", new Object[] { localJSONException, this.appId });
        c.a.jhi.pU(localJSONException);
      }
      Object localObject1 = str2;
      if (str2 == null) {
        localObject1 = "";
      }
      String str2 = new StringBuilder().append(this.appId).append(str3).append((String)localObject1).toString().hashCode();
      localObject1 = ((com.tencent.mm.as.a.a)h.h(com.tencent.mm.as.a.a.class)).a(11, (String)localObject1, str4, str6, str7, str3, str3, str2, com.tencent.mm.compatible.util.e.gZT, com.tencent.mm.plugin.m.b.yV() + ((String)localObject1).hashCode(), str5, "");
      ((aol)localObject1).hkl = (i * 1000);
      c.a.jhi.a(this.iSb, this.appId);
      c.a.jhi.c(this.appId, this.fBH, this.fxq, this.fBG);
      c.a.jhi.jhh = ((aol)localObject1).tIh;
      com.tencent.mm.as.b.b((aol)localObject1);
      w.i("MicroMsg.JsApiSetBackgroundAudioState", "runInMainProcess startPlayMusic");
      w.i("MicroMsg.JsApiSetBackgroundAudioState", "setBackgroundAudioState ok");
      this.iRF = false;
      this.action = -1;
      VC();
      GMTrace.o(19725845266432L, 146969);
    }
    
    public final void VB()
    {
      GMTrace.i(19725979484160L, 146970);
      if (this.iQB == null)
      {
        w.e("MicroMsg.JsApiSetBackgroundAudioState", "service is null, don't callback");
        GMTrace.o(19725979484160L, 146970);
        return;
      }
      if (this.action == -1)
      {
        if (!this.iRF)
        {
          w.i("MicroMsg.JsApiSetBackgroundAudioState", "setBackgroundAudioState ok");
          this.iQB.v(this.iQC, this.iQA.d("ok", null));
          GMTrace.o(19725979484160L, 146970);
          return;
        }
        w.e("MicroMsg.JsApiSetBackgroundAudioState", "setBackgroundAudioState fail:%s", new Object[] { this.iRD });
        this.iQB.v(this.iQC, this.iQA.d("fail:" + this.iRD, null));
        GMTrace.o(19725979484160L, 146970);
        return;
      }
      if (this.action == -2)
      {
        w.i("MicroMsg.JsApiSetBackgroundAudioState", "NOT_CALLBACK_EVENT, do nothing");
        GMTrace.o(19725979484160L, 146970);
        return;
      }
      switch (this.action)
      {
      }
      for (;;)
      {
        w.i("MicroMsg.JsApiSetBackgroundAudioState", "runInClientProcess callback action:%d, retJson:%s, lockCount:%d", new Object[] { Integer.valueOf(this.action), this.iRS, Integer.valueOf(JsApiSetBackgroundAudioState.iSC) });
        com.tencent.mm.plugin.appbrand.jsapi.e locale = new JsApiOperateBackgroundAudio.a().a(this.iQB);
        locale.mData = this.iRS;
        locale.VI();
        GMTrace.o(19725979484160L, 146970);
        return;
        this.iLn.k("setBackgroundAudioState#isPlaying", Boolean.valueOf(true));
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
          this.iLn.k("setBackgroundAudioState#isPlaying", Boolean.valueOf(false));
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
      GMTrace.i(19726113701888L, 146971);
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
        GMTrace.o(19726113701888L, 146971);
        return;
        bool = false;
      }
    }
    
    public void writeToParcel(Parcel paramParcel, int paramInt)
    {
      GMTrace.i(19726247919616L, 146972);
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
        GMTrace.o(19726247919616L, 146972);
        return;
      }
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/audio/JsApiSetBackgroundAudioState.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */