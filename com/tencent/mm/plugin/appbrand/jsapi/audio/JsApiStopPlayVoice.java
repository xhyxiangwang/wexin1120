package com.tencent.mm.plugin.appbrand.jsapi.audio;

import android.os.Parcelable.Creator;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.kernel.h;
import com.tencent.mm.plugin.appbrand.compat.a.g;
import com.tencent.mm.plugin.appbrand.ipc.AppBrandMainProcessService;
import com.tencent.mm.plugin.appbrand.ipc.MainProcessTask;
import com.tencent.mm.plugin.appbrand.jsapi.a;
import com.tencent.mm.plugin.appbrand.jsapi.d;
import com.tencent.mm.plugin.appbrand.k;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import org.json.JSONObject;

public final class JsApiStopPlayVoice
  extends a
{
  public static final int CTRL_INDEX = 35;
  public static final String NAME = "stopVoice";
  
  public JsApiStopPlayVoice()
  {
    GMTrace.i(19748259627008L, 147136);
    GMTrace.o(19748259627008L, 147136);
  }
  
  public static void VT()
  {
    GMTrace.i(19748528062464L, 147138);
    if (bg.mZ(JsApiStartPlayVoice.iSG))
    {
      GMTrace.o(19748528062464L, 147138);
      return;
    }
    AppBrandMainProcessService.a(new StopPlayVoice());
    JsApiStartPlayVoice.iSG = null;
    GMTrace.o(19748528062464L, 147138);
  }
  
  public final void a(k paramk, JSONObject paramJSONObject, int paramInt)
  {
    GMTrace.i(19748393844736L, 147137);
    paramJSONObject = paramJSONObject.optString("localId");
    w.i("MicroMsg.JsApiStopPlayVoice", "doStopVoice, appId : %s, localId : %s", new Object[] { paramk.iqL, paramJSONObject });
    AppBrandMainProcessService.a(new StopPlayVoice());
    paramk.v(paramInt, d("ok", null));
    JsApiStartPlayVoice.iSG = null;
    GMTrace.o(19748393844736L, 147137);
  }
  
  private static class StopPlayVoice
    extends MainProcessTask
  {
    public static final Parcelable.Creator<StopPlayVoice> CREATOR;
    
    static
    {
      GMTrace.i(19740474998784L, 147078);
      CREATOR = new Parcelable.Creator() {};
      GMTrace.o(19740474998784L, 147078);
    }
    
    public StopPlayVoice()
    {
      GMTrace.i(19740206563328L, 147076);
      GMTrace.o(19740206563328L, 147076);
    }
    
    public final void RS()
    {
      GMTrace.i(19740340781056L, 147077);
      af.u(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(19732690370560L, 147020);
          ((g)h.h(g.class)).stop();
          GMTrace.o(19732690370560L, 147020);
        }
      });
      GMTrace.o(19740340781056L, 147077);
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/audio/JsApiStopPlayVoice.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */