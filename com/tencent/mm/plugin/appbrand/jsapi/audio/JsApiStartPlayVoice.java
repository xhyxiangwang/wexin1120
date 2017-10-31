package com.tencent.mm.plugin.appbrand.jsapi.audio;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ac.g.a;
import com.tencent.mm.ac.g.b;
import com.tencent.mm.kernel.h;
import com.tencent.mm.plugin.appbrand.appstorage.AppBrandLocalMediaObject;
import com.tencent.mm.plugin.appbrand.appstorage.c;
import com.tencent.mm.plugin.appbrand.compat.a.g;
import com.tencent.mm.plugin.appbrand.ipc.AppBrandMainProcessService;
import com.tencent.mm.plugin.appbrand.ipc.MainProcessTask;
import com.tencent.mm.plugin.appbrand.jsapi.a;
import com.tencent.mm.plugin.appbrand.jsapi.d;
import com.tencent.mm.plugin.appbrand.k;
import com.tencent.mm.plugin.appbrand.page.AppBrandPageView;
import com.tencent.mm.plugin.appbrand.page.AppBrandPageView.b;
import com.tencent.mm.plugin.appbrand.page.AppBrandPageView.c;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.x.q;
import com.tencent.mm.x.q.b;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class JsApiStartPlayVoice
  extends a
{
  public static final int CTRL_INDEX = 33;
  public static final String NAME = "playVoice";
  public static String iSG;
  private StartPlayVoice iSH;
  
  static
  {
    GMTrace.i(19735240507392L, 147039);
    iSG = null;
    GMTrace.o(19735240507392L, 147039);
  }
  
  public JsApiStartPlayVoice()
  {
    GMTrace.i(19734972071936L, 147037);
    GMTrace.o(19734972071936L, 147037);
  }
  
  public final void a(k paramk, JSONObject paramJSONObject, int paramInt)
  {
    GMTrace.i(19735106289664L, 147038);
    String str = bg.ap(paramJSONObject.optString("filePath", null), paramJSONObject.optString("localId"));
    w.i("MicroMsg.JsApiStartPlayVoice", "doPlayVoice, appId : %s, localId : %s", new Object[] { paramk.iqL, str });
    if (bg.mZ(str))
    {
      paramk.v(paramInt, d("fail_missing arguments", null));
      GMTrace.o(19735106289664L, 147038);
      return;
    }
    AppBrandLocalMediaObject localAppBrandLocalMediaObject = c.aI(paramk.iqL, str);
    final AppBrandPageView localAppBrandPageView = b(paramk);
    if ((localAppBrandLocalMediaObject == null) || (bg.mZ(localAppBrandLocalMediaObject.hhT)) || (localAppBrandPageView == null))
    {
      paramk.v(paramInt, d("fail", null));
      GMTrace.o(19735106289664L, 147038);
      return;
    }
    q.b localb1 = q.Aw().n("JsApi@" + localAppBrandPageView.hashCode(), true);
    AppBrandPageView.b localb = (AppBrandPageView.b)localb1.get("onBackgroundListener", null);
    paramJSONObject = localb;
    if (localb == null)
    {
      paramJSONObject = new AppBrandPageView.b()
      {
        public final void VS()
        {
          GMTrace.i(19732153499648L, 147016);
          JsApiStopPlayVoice.VT();
          localAppBrandPageView.b(this);
          GMTrace.o(19732153499648L, 147016);
        }
      };
      localb1.k("onBackgroundListener", paramJSONObject);
    }
    localAppBrandPageView.a(paramJSONObject);
    if ((AppBrandPageView.c)localb1.get("onDestroyListener", null) == null)
    {
      paramJSONObject = new AppBrandPageView.c()
      {
        public final void onDestroy()
        {
          GMTrace.i(19730140233728L, 147001);
          JsApiStopPlayVoice.VT();
          localAppBrandPageView.b(this);
          q.b localb = q.Aw().gh("JsApi@" + localAppBrandPageView.hashCode());
          if (localb != null) {
            localb.recycle();
          }
          GMTrace.o(19730140233728L, 147001);
        }
      };
      localb1.k("onDestroyListener", paramJSONObject);
      localAppBrandPageView.a(paramJSONObject);
    }
    if (this.iSH == null) {
      this.iSH = new StartPlayVoice(this, paramk, paramInt);
    }
    if (iSG != null)
    {
      paramJSONObject = new HashMap();
      paramJSONObject.put("localId", this.iSH.fAx);
      paramk.v(this.iSH.iQC, d("fail", paramJSONObject));
      GMTrace.o(19735106289664L, 147038);
      return;
    }
    this.iSH.iQA = this;
    this.iSH.iQB = paramk;
    this.iSH.iQC = paramInt;
    this.iSH.fAx = str;
    this.iSH.filePath = localAppBrandLocalMediaObject.hhT;
    AppBrandMainProcessService.a(this.iSH);
    iSG = str;
    GMTrace.o(19735106289664L, 147038);
  }
  
  private static class StartPlayVoice
    extends MainProcessTask
  {
    public static final Parcelable.Creator<StartPlayVoice> CREATOR;
    public String fAx;
    public String filePath;
    public d iQA;
    public k iQB;
    public int iQC;
    public boolean iRF;
    
    static
    {
      GMTrace.i(19716584243200L, 146900);
      CREATOR = new Parcelable.Creator() {};
      GMTrace.o(19716584243200L, 146900);
    }
    
    public StartPlayVoice(Parcel paramParcel)
    {
      GMTrace.i(19715644719104L, 146893);
      this.iRF = false;
      f(paramParcel);
      GMTrace.o(19715644719104L, 146893);
    }
    
    public StartPlayVoice(d paramd, k paramk, int paramInt)
    {
      GMTrace.i(19715510501376L, 146892);
      this.iRF = false;
      this.iQA = paramd;
      this.iQB = paramk;
      this.iQC = paramInt;
      GMTrace.o(19715510501376L, 146892);
    }
    
    public final void RS()
    {
      GMTrace.i(19715778936832L, 146894);
      af.u(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(19748125409280L, 147135);
          ((g)h.h(g.class)).a(JsApiStartPlayVoice.StartPlayVoice.this.filePath, new g.a()new g.b
          {
            public final void qq()
            {
              GMTrace.i(19729603362816L, 146997);
              JsApiStartPlayVoice.StartPlayVoice.this.iRF = false;
              JsApiStartPlayVoice.StartPlayVoice.a(JsApiStartPlayVoice.StartPlayVoice.this);
              GMTrace.o(19729603362816L, 146997);
            }
          }, new g.b()
          {
            public final void onError()
            {
              GMTrace.i(19747588538368L, 147131);
              JsApiStartPlayVoice.StartPlayVoice.this.iRF = true;
              JsApiStartPlayVoice.StartPlayVoice.b(JsApiStartPlayVoice.StartPlayVoice.this);
              GMTrace.o(19747588538368L, 147131);
            }
          });
          GMTrace.o(19748125409280L, 147135);
        }
      });
      GMTrace.o(19715778936832L, 146894);
    }
    
    public final void VB()
    {
      GMTrace.i(19715913154560L, 146895);
      HashMap localHashMap = new HashMap();
      localHashMap.put("localId", this.fAx);
      k localk = this.iQB;
      int i = this.iQC;
      d locald = this.iQA;
      if (this.iRF) {}
      for (String str = "fail";; str = "ok")
      {
        localk.v(i, locald.d(str, localHashMap));
        JsApiStartPlayVoice.iSG = null;
        GMTrace.o(19715913154560L, 146895);
        return;
      }
    }
    
    public final void f(Parcel paramParcel)
    {
      GMTrace.i(19716047372288L, 146896);
      this.fAx = paramParcel.readString();
      this.filePath = paramParcel.readString();
      if (paramParcel.readByte() != 0) {}
      for (boolean bool = true;; bool = false)
      {
        this.iRF = bool;
        GMTrace.o(19716047372288L, 146896);
        return;
      }
    }
    
    public void writeToParcel(Parcel paramParcel, int paramInt)
    {
      GMTrace.i(19716181590016L, 146897);
      paramParcel.writeString(this.fAx);
      paramParcel.writeString(this.filePath);
      if (this.iRF) {}
      for (byte b = 1;; b = 0)
      {
        paramParcel.writeByte(b);
        GMTrace.o(19716181590016L, 146897);
        return;
      }
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/audio/JsApiStartPlayVoice.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */