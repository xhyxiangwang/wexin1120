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
import com.tencent.mm.plugin.appbrand.d.c;
import com.tencent.mm.plugin.appbrand.ipc.AppBrandMainProcessService;
import com.tencent.mm.plugin.appbrand.ipc.MainProcessTask;
import com.tencent.mm.plugin.appbrand.k;
import com.tencent.mm.plugin.appbrand.media.c.a;
import com.tencent.mm.plugin.appbrand.report.AppBrandStatObject;
import com.tencent.mm.plugin.appbrand.ui.banner.AppBrandStickyBannerLogic.a;
import com.tencent.mm.protocal.c.aol;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.x.q;
import com.tencent.mm.x.q.b;
import org.json.JSONException;
import org.json.JSONObject;

public final class JsApiOperateMusicPlayer
  extends com.tencent.mm.plugin.appbrand.jsapi.a
{
  public static final int CTRL_INDEX = 47;
  public static final String NAME = "operateMusicPlayer";
  public OperateMusicPlayer iSd;
  
  public JsApiOperateMusicPlayer()
  {
    GMTrace.i(19722221387776L, 146942);
    GMTrace.o(19722221387776L, 146942);
  }
  
  public final void a(final k paramk, JSONObject paramJSONObject, int paramInt)
  {
    GMTrace.i(19722355605504L, 146943);
    this.iSd = new OperateMusicPlayer(this, paramk, paramInt);
    Object localObject1 = q.gi("AppBrandService#" + paramk.hashCode());
    for (;;)
    {
      synchronized (q.Aw().n((String)localObject1, true))
      {
        localObject1 = (com.tencent.mm.plugin.appbrand.ui.banner.e)???.get("StickyBannerChangeListener", null);
        if (localObject1 == null)
        {
          localObject1 = new com.tencent.mm.plugin.appbrand.ui.banner.e()
          {
            public final void X(String paramAnonymousString, int paramAnonymousInt)
            {
              GMTrace.i(19717121114112L, 146904);
              String str = localb.getString("appId", "");
              int i = localb.getInt("pkgType", 0);
              if (((!str.equals(paramAnonymousString)) || (i != paramAnonymousInt)) && (localb.gj("Music#isPlaying")) && (com.tencent.mm.plugin.appbrand.d.nK(str) != d.a.iqv)) {
                paramAnonymousString = new JSONObject();
              }
              try
              {
                paramAnonymousString.put("operationType", "pause");
                JsApiOperateMusicPlayer.OperateMusicPlayer localOperateMusicPlayer = new JsApiOperateMusicPlayer.OperateMusicPlayer(JsApiOperateMusicPlayer.this, paramk, JsApiOperateMusicPlayer.this.iSd.iQC);
                localOperateMusicPlayer.fHI = paramAnonymousString.toString();
                localOperateMusicPlayer.fKY = str;
                localOperateMusicPlayer.iLn = localb;
                AppBrandMainProcessService.a(localOperateMusicPlayer);
                GMTrace.o(19717121114112L, 146904);
                return;
              }
              catch (JSONException localJSONException)
              {
                for (;;) {}
              }
            }
          };
          Object localObject2 = com.tencent.mm.plugin.appbrand.a.nx(paramk.iqL);
          if (localObject2 != null) {
            ???.k("pkgType", Integer.valueOf(((AppBrandSysConfig)localObject2).iJa.iCx));
          }
          ???.k("StickyBannerChangeListener", localObject1);
          ???.k("appId", paramk.iqL);
          if ((d.b)???.get("AppBrandLifeCycle.Listener", null) == null)
          {
            localObject2 = new d.b()
            {
              public final void a(d.c paramAnonymousc)
              {
                GMTrace.i(19748796497920L, 147140);
                String str = localb.getString("appId", "");
                int i = localb.getInt("pkgType", 0);
                switch (JsApiOperateMusicPlayer.3.iDm[paramAnonymousc.ordinal()])
                {
                }
                for (;;)
                {
                  GMTrace.o(19748796497920L, 147140);
                  return;
                  int j = com.tencent.mm.plugin.appbrand.a.ny(str).scene;
                  if ((AppBrandStickyBannerLogic.a.aw(str, i)) || (j == 1023)) {
                    continue;
                  }
                  paramAnonymousc = new JSONObject();
                  try
                  {
                    paramAnonymousc.put("operationType", "pause");
                    JsApiOperateMusicPlayer.OperateMusicPlayer localOperateMusicPlayer = new JsApiOperateMusicPlayer.OperateMusicPlayer(JsApiOperateMusicPlayer.this, paramk, JsApiOperateMusicPlayer.this.iSd.iQC);
                    localOperateMusicPlayer.fHI = paramAnonymousc.toString();
                    localOperateMusicPlayer.fKY = str;
                    localOperateMusicPlayer.iLn = localb;
                    AppBrandMainProcessService.a(localOperateMusicPlayer);
                  }
                  catch (JSONException localJSONException)
                  {
                    for (;;) {}
                  }
                }
              }
              
              public final void onDestroy()
              {
                GMTrace.i(19748930715648L, 147141);
                w.d("MicroMsg.JsApiOperateMusicPlayer", "onDestroy");
                String str = localb.getString("appId", "");
                localb.getInt("pkgType", 0);
                JSONObject localJSONObject = new JSONObject();
                try
                {
                  localJSONObject.put("operationType", "stop");
                  JsApiOperateMusicPlayer.OperateMusicPlayer localOperateMusicPlayer = new JsApiOperateMusicPlayer.OperateMusicPlayer(JsApiOperateMusicPlayer.this, paramk, JsApiOperateMusicPlayer.this.iSd.iQC);
                  localOperateMusicPlayer.fHI = localJSONObject.toString();
                  localOperateMusicPlayer.fKY = str;
                  localOperateMusicPlayer.action = -1;
                  localOperateMusicPlayer.iLn = localb;
                  AppBrandMainProcessService.b(localOperateMusicPlayer);
                  GMTrace.o(19748930715648L, 147141);
                  return;
                }
                catch (JSONException localJSONException)
                {
                  for (;;) {}
                }
              }
            };
            ???.k("AppBrandLifeCycle.Listener", localObject2);
            this.iSd.iRZ = ((d.b)localObject2);
          }
          this.iSd.iRY = ((com.tencent.mm.plugin.appbrand.ui.banner.e)localObject1);
          this.iSd.iLn = ???;
          this.iSd.fHI = paramJSONObject.toString();
          this.iSd.fKY = paramk.iqL;
          AppBrandMainProcessService.a(this.iSd);
          GMTrace.o(19722355605504L, 146943);
          return;
        }
      }
    }
  }
  
  private static class OperateMusicPlayer
    extends MainProcessTask
  {
    public static final Parcelable.Creator<OperateMusicPlayer> CREATOR;
    public int action;
    public String errorMsg;
    public String fHI;
    public String fKY;
    q.b iLn;
    private com.tencent.mm.plugin.appbrand.jsapi.d iQA;
    private k iQB;
    public int iQC;
    public boolean iRF;
    public String iRS;
    com.tencent.mm.plugin.appbrand.ui.banner.e iRY;
    d.b iRZ;
    public final com.tencent.mm.sdk.b.c iSb;
    
    static
    {
      GMTrace.i(19724100435968L, 146956);
      CREATOR = new Parcelable.Creator() {};
      GMTrace.o(19724100435968L, 146956);
    }
    
    public OperateMusicPlayer(Parcel paramParcel)
    {
      GMTrace.i(19722624040960L, 146945);
      this.iRF = false;
      this.iSb = new com.tencent.mm.sdk.b.c() {};
      f(paramParcel);
      GMTrace.o(19722624040960L, 146945);
    }
    
    public OperateMusicPlayer(com.tencent.mm.plugin.appbrand.jsapi.d paramd, k paramk, int paramInt)
    {
      GMTrace.i(19722489823232L, 146944);
      this.iRF = false;
      this.iSb = new com.tencent.mm.sdk.b.c() {};
      this.iQA = paramd;
      this.iQB = paramk;
      this.iQC = paramInt;
      GMTrace.o(19722489823232L, 146944);
    }
    
    public final void RS()
    {
      GMTrace.i(19722758258688L, 146946);
      final Object localObject2;
      final String str1;
      final String str2;
      try
      {
        localObject2 = new JSONObject(this.fHI);
        str1 = ((JSONObject)localObject2).optString("operationType");
        str2 = ((JSONObject)localObject2).optString("dataUrl");
        if (bg.mZ(str1))
        {
          this.action = -1;
          this.iRF = true;
          this.errorMsg = "operationType is null or nil";
          VC();
          GMTrace.o(19722758258688L, 146946);
          return;
        }
      }
      catch (Exception localException)
      {
        w.e("MicroMsg.JsApiOperateMusicPlayer", localException.toString());
        this.action = -1;
        this.iRF = true;
        this.errorMsg = "data is null";
        VC();
        GMTrace.o(19722758258688L, 146946);
        return;
      }
      if (!c.a.jhi.ba(this.fKY, str1))
      {
        w.i("MicroMsg.JsApiOperateMusicPlayer", "appid not match cannot operate");
        this.action = -1;
        this.iRF = true;
        this.errorMsg = "appid not match cannot operate";
        VC();
        GMTrace.o(19722758258688L, 146946);
        return;
      }
      final Object localObject1 = str1;
      if (com.tencent.mm.as.b.JO())
      {
        localObject1 = str1;
        if (!com.tencent.mm.as.b.JN())
        {
          localObject1 = str1;
          if (str1.equalsIgnoreCase("play"))
          {
            localObject1 = com.tencent.mm.as.b.JP();
            if ((localObject1 == null) || ((!bg.mZ(str2)) && (!str2.equals(((aol)localObject1).ukj)))) {
              break label346;
            }
            if (!c.a.jhi.ba(this.fKY, "resume")) {
              break label334;
            }
            w.i("MicroMsg.JsApiOperateMusicPlayer", "same appid %s, change play to resume", new Object[] { this.fKY });
            localObject1 = "resume";
          }
        }
      }
      while (((String)localObject1).equalsIgnoreCase("play"))
      {
        localObject1 = ((JSONObject)localObject2).optString("title");
        str1 = ((JSONObject)localObject2).optString("singer");
        final String str3 = ((JSONObject)localObject2).optString("epname");
        localObject2 = ((JSONObject)localObject2).optString("coverImgUrl");
        if (bg.mZ(str2))
        {
          this.action = -1;
          this.iRF = true;
          this.errorMsg = "dataUrl is null or nil";
          VC();
          GMTrace.o(19722758258688L, 146946);
          return;
          label334:
          w.i("MicroMsg.JsApiOperateMusicPlayer", "not same not same appid ,restart play");
          localObject1 = str1;
          continue;
          label346:
          w.i("MicroMsg.JsApiOperateMusicPlayer", "data url has changed ,restart play");
          localObject1 = str1;
        }
        else
        {
          w.i("MicroMsg.JsApiOperateMusicPlayer", "title : %s, singer : %s, epName : %s, coverImgUrl : %s, dataUrl : %s, lowbandUrl : %s, webUrl : %s", new Object[] { localObject1, str1, str3, localObject2, str2, str2, str2 });
          com.tencent.mm.as.b.JL();
          String str4 = c.a.jhi.jhg;
          if (!bg.mZ(str4))
          {
            w.i("MicroMsg.JsApiOperateMusicPlayer", "remove listener preAppid is %s, appid is %s", new Object[] { str4, this.fKY });
            c.a.jhi.pU(str4);
          }
          af.i(new Runnable()
          {
            public final void run()
            {
              GMTrace.i(19717792202752L, 146909);
              Object localObject = new StringBuilder().append(JsApiOperateMusicPlayer.OperateMusicPlayer.this.fKY).append(str2).append(localObject2).toString().hashCode();
              localObject = ((com.tencent.mm.as.a.a)h.h(com.tencent.mm.as.a.a.class)).a(localObject2, localObject2, localObject1, str1, str2, str2, str2, (String)localObject, com.tencent.mm.compatible.util.e.gZT, com.tencent.mm.plugin.m.b.yV() + localObject2.hashCode(), str3, "");
              ((aol)localObject).ukw = true;
              com.tencent.mm.as.b.b((aol)localObject);
              c.a.jhi.a(JsApiOperateMusicPlayer.OperateMusicPlayer.this.iSb, JsApiOperateMusicPlayer.OperateMusicPlayer.this.fKY);
              c.a.jhi.jhg = JsApiOperateMusicPlayer.OperateMusicPlayer.this.fKY;
              c.a.jhi.jhh = ((aol)localObject).tIh;
              w.i("MicroMsg.JsApiOperateMusicPlayer", "startPlayMusic");
              JsApiOperateMusicPlayer.OperateMusicPlayer.this.action = -1;
              JsApiOperateMusicPlayer.OperateMusicPlayer.this.errorMsg = "";
              JsApiOperateMusicPlayer.OperateMusicPlayer.this.iRF = false;
              JsApiOperateMusicPlayer.OperateMusicPlayer.a(JsApiOperateMusicPlayer.OperateMusicPlayer.this);
              GMTrace.o(19717792202752L, 146909);
            }
          }, 500L);
          GMTrace.o(19722758258688L, 146946);
          return;
        }
      }
      if (((String)localObject1).equalsIgnoreCase("resume"))
      {
        localObject1 = c.a.jhi.jhg;
        if (!bg.mZ((String)localObject1))
        {
          w.i("MicroMsg.JsApiOperateMusicPlayer", "remove listener preAppid is %s, appid is %s", new Object[] { localObject1, this.fKY });
          c.a.jhi.pU((String)localObject1);
        }
        c.a.jhi.a(this.iSb, this.fKY);
        c.a.jhi.jhg = this.fKY;
        localObject1 = com.tencent.mm.as.b.JP();
        if (localObject1 != null) {
          c.a.jhi.jhh = ((aol)localObject1).tIh;
        }
        if (com.tencent.mm.as.c.JR())
        {
          af.i(new Runnable()
          {
            public final void run()
            {
              GMTrace.i(19740877651968L, 147081);
              w.i("MicroMsg.JsApiOperateMusicPlayer", "resume ok");
              JsApiOperateMusicPlayer.OperateMusicPlayer.this.action = -1;
              JsApiOperateMusicPlayer.OperateMusicPlayer.this.errorMsg = "";
              JsApiOperateMusicPlayer.OperateMusicPlayer.this.iRF = false;
              JsApiOperateMusicPlayer.OperateMusicPlayer.b(JsApiOperateMusicPlayer.OperateMusicPlayer.this);
              GMTrace.o(19740877651968L, 147081);
            }
          }, 500L);
          GMTrace.o(19722758258688L, 146946);
          return;
        }
        w.i("MicroMsg.JsApiOperateMusicPlayer", "resume fail");
        this.action = -1;
        this.iRF = true;
        this.errorMsg = "resume play fail";
        VC();
        GMTrace.o(19722758258688L, 146946);
        return;
      }
      if (((String)localObject1).equalsIgnoreCase("pause"))
      {
        if (com.tencent.mm.as.c.JS())
        {
          af.i(new Runnable()
          {
            public final void run()
            {
              GMTrace.i(19742890917888L, 147096);
              w.i("MicroMsg.JsApiOperateMusicPlayer", "pause ok");
              JsApiOperateMusicPlayer.OperateMusicPlayer.this.action = -1;
              JsApiOperateMusicPlayer.OperateMusicPlayer.this.iRF = false;
              JsApiOperateMusicPlayer.OperateMusicPlayer.this.errorMsg = "";
              JsApiOperateMusicPlayer.OperateMusicPlayer.c(JsApiOperateMusicPlayer.OperateMusicPlayer.this);
              GMTrace.o(19742890917888L, 147096);
            }
          }, 500L);
          GMTrace.o(19722758258688L, 146946);
          return;
        }
        w.i("MicroMsg.JsApiOperateMusicPlayer", "pause fail");
        this.action = -1;
        this.iRF = true;
        this.errorMsg = "pause play fail";
        VC();
        GMTrace.o(19722758258688L, 146946);
        return;
      }
      if (((String)localObject1).equalsIgnoreCase("seek"))
      {
        if (com.tencent.mm.as.b.gu(bg.getInt(bg.bD(((JSONObject)localObject2).optString("position")), -1) * 1000))
        {
          af.i(new Runnable()
          {
            public final void run()
            {
              GMTrace.i(19733629894656L, 147027);
              w.i("MicroMsg.JsApiOperateMusicPlayer", "seek ok");
              JsApiOperateMusicPlayer.OperateMusicPlayer.this.action = -1;
              JsApiOperateMusicPlayer.OperateMusicPlayer.this.iRF = false;
              JsApiOperateMusicPlayer.OperateMusicPlayer.this.errorMsg = "";
              JsApiOperateMusicPlayer.OperateMusicPlayer.d(JsApiOperateMusicPlayer.OperateMusicPlayer.this);
              GMTrace.o(19733629894656L, 147027);
            }
          }, 500L);
          GMTrace.o(19722758258688L, 146946);
          return;
        }
        w.i("MicroMsg.JsApiOperateMusicPlayer", "seek fail");
        this.action = -1;
        this.iRF = true;
        this.errorMsg = "seek fail";
        VC();
        GMTrace.o(19722758258688L, 146946);
        return;
      }
      if (((String)localObject1).equalsIgnoreCase("stop"))
      {
        if (com.tencent.mm.as.c.JT())
        {
          af.i(new Runnable()
          {
            public final void run()
            {
              GMTrace.i(19729871798272L, 146999);
              w.i("MicroMsg.JsApiOperateMusicPlayer", "stop ok");
              JsApiOperateMusicPlayer.OperateMusicPlayer.this.action = -1;
              JsApiOperateMusicPlayer.OperateMusicPlayer.this.iRF = false;
              JsApiOperateMusicPlayer.OperateMusicPlayer.this.errorMsg = "";
              JsApiOperateMusicPlayer.OperateMusicPlayer.e(JsApiOperateMusicPlayer.OperateMusicPlayer.this);
              GMTrace.o(19729871798272L, 146999);
            }
          }, 500L);
          GMTrace.o(19722758258688L, 146946);
          return;
        }
        w.i("MicroMsg.JsApiOperateMusicPlayer", "stop fail");
        this.action = -1;
        this.iRF = false;
        this.errorMsg = "stop play fail";
        VC();
        GMTrace.o(19722758258688L, 146946);
        return;
      }
      this.action = -1;
      this.iRF = true;
      VC();
      GMTrace.o(19722758258688L, 146946);
    }
    
    public final void VB()
    {
      GMTrace.i(19722892476416L, 146947);
      w.i("MicroMsg.JsApiOperateMusicPlayer", "runInClientProcess(action : %s)", new Object[] { Integer.valueOf(this.action) });
      k localk = this.iQB;
      int i = this.iQC;
      com.tencent.mm.plugin.appbrand.jsapi.d locald = this.iQA;
      Object localObject;
      if (this.iRF)
      {
        StringBuilder localStringBuilder = new StringBuilder("fail");
        if (TextUtils.isEmpty(this.errorMsg))
        {
          localObject = "";
          localObject = (String)localObject;
          label90:
          localk.v(i, locald.d((String)localObject, null));
          switch (this.action)
          {
          }
        }
      }
      for (;;)
      {
        GMTrace.o(19722892476416L, 146947);
        return;
        localObject = ":" + this.errorMsg;
        break;
        localObject = "ok";
        break label90;
        w.i("MicroMsg.JsApiOperateMusicPlayer", "onMusicPlay in");
        localObject = new JsApiOperateMusicPlayer.c().a(this.iQB);
        ((com.tencent.mm.plugin.appbrand.jsapi.e)localObject).mData = this.iRS;
        ((com.tencent.mm.plugin.appbrand.jsapi.e)localObject).VI();
        this.iLn.k("Music#isPlaying", Boolean.valueOf(true));
        AppBrandStickyBannerLogic.a.d(this.iRY);
        com.tencent.mm.plugin.appbrand.d.a(this.iQB.iqL, this.iRZ);
        GMTrace.o(19722892476416L, 146947);
        return;
        w.i("MicroMsg.JsApiOperateMusicPlayer", "onMusicResume in");
        this.iLn.k("Music#isPlaying", Boolean.valueOf(true));
        AppBrandStickyBannerLogic.a.d(this.iRY);
        com.tencent.mm.plugin.appbrand.d.a(this.iQB.iqL, this.iRZ);
        GMTrace.o(19722892476416L, 146947);
        return;
        w.i("MicroMsg.JsApiOperateMusicPlayer", "onMusicStop in");
        localObject = new JsApiOperateMusicPlayer.a().a(this.iQB);
        ((com.tencent.mm.plugin.appbrand.jsapi.e)localObject).mData = this.iRS;
        ((com.tencent.mm.plugin.appbrand.jsapi.e)localObject).VI();
        w.i("MicroMsg.JsApiOperateMusicPlayer", "onMusicEnd in");
        this.iLn.k("Music#isPlaying", Boolean.valueOf(false));
        AppBrandStickyBannerLogic.a.c(this.iRY);
        com.tencent.mm.plugin.appbrand.d.b(this.iQB.iqL, this.iRZ);
        GMTrace.o(19722892476416L, 146947);
        return;
        w.i("MicroMsg.JsApiOperateMusicPlayer", "onMusicPause in");
        localObject = new JsApiOperateMusicPlayer.b().a(this.iQB);
        ((com.tencent.mm.plugin.appbrand.jsapi.e)localObject).mData = this.iRS;
        ((com.tencent.mm.plugin.appbrand.jsapi.e)localObject).VI();
        this.iLn.k("Music#isPlaying", Boolean.valueOf(false));
        AppBrandStickyBannerLogic.a.c(this.iRY);
        com.tencent.mm.plugin.appbrand.d.b(this.iQB.iqL, this.iRZ);
        GMTrace.o(19722892476416L, 146947);
        return;
        w.i("MicroMsg.JsApiOperateMusicPlayer", "onMusicError in");
        this.iQB.h("onMusicError", this.iRS, 0);
        this.iLn.k("Music#isPlaying", Boolean.valueOf(false));
        AppBrandStickyBannerLogic.a.c(this.iRY);
        com.tencent.mm.plugin.appbrand.d.b(this.iQB.iqL, this.iRZ);
      }
    }
    
    public final void f(Parcel paramParcel)
    {
      GMTrace.i(19723026694144L, 146948);
      this.fHI = paramParcel.readString();
      this.fKY = paramParcel.readString();
      if (paramParcel.readByte() != 0) {}
      for (boolean bool = true;; bool = false)
      {
        this.iRF = bool;
        this.iRS = paramParcel.readString();
        this.action = paramParcel.readInt();
        this.errorMsg = paramParcel.readString();
        GMTrace.o(19723026694144L, 146948);
        return;
      }
    }
    
    public void writeToParcel(Parcel paramParcel, int paramInt)
    {
      GMTrace.i(19723160911872L, 146949);
      paramParcel.writeString(this.fHI);
      paramParcel.writeString(this.fKY);
      if (this.iRF) {}
      for (byte b = 1;; b = 0)
      {
        paramParcel.writeByte(b);
        paramParcel.writeString(this.iRS);
        paramParcel.writeInt(this.action);
        paramParcel.writeString(this.errorMsg);
        GMTrace.o(19723160911872L, 146949);
        return;
      }
    }
  }
  
  private static final class a
    extends com.tencent.mm.plugin.appbrand.jsapi.e
  {
    private static final int CTRL_INDEX = 82;
    private static final String NAME = "onMusicEnd";
    
    public a()
    {
      GMTrace.i(19743696224256L, 147102);
      GMTrace.o(19743696224256L, 147102);
    }
  }
  
  private static final class b
    extends com.tencent.mm.plugin.appbrand.jsapi.e
  {
    private static final int CTRL_INDEX = 81;
    private static final String NAME = "onMusicPause";
    
    public b()
    {
      GMTrace.i(19750004457472L, 147149);
      GMTrace.o(19750004457472L, 147149);
    }
  }
  
  private static final class c
    extends com.tencent.mm.plugin.appbrand.jsapi.e
  {
    private static final int CTRL_INDEX = 80;
    private static final String NAME = "onMusicPlay";
    
    public c()
    {
      GMTrace.i(19746112143360L, 147120);
      GMTrace.o(19746112143360L, 147120);
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/audio/JsApiOperateMusicPlayer.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */