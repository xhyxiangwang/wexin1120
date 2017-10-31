package com.tencent.mm.plugin.appbrand.jsapi.audio;

import android.os.Parcelable.Creator;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.ipc.AppBrandMainProcessService;
import com.tencent.mm.plugin.appbrand.ipc.MainProcessTask;
import com.tencent.mm.plugin.appbrand.j;
import com.tencent.mm.plugin.appbrand.k;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.bg;
import org.json.JSONObject;

public final class JsApiStopRecordVoice
  extends com.tencent.mm.plugin.appbrand.jsapi.a
{
  public static final int CTRL_INDEX = 32;
  public static final String NAME = "stopRecord";
  
  public JsApiStopRecordVoice()
  {
    GMTrace.i(19715107848192L, 146889);
    GMTrace.o(19715107848192L, 146889);
  }
  
  static void d(k paramk)
  {
    GMTrace.i(19715376283648L, 146891);
    if (bg.mZ(JsApiStartRecordVoice.iSM))
    {
      GMTrace.o(19715376283648L, 146891);
      return;
    }
    com.tencent.mm.plugin.appbrand.page.a.e(paramk.irS).iZ(j.nQ(paramk.iqL).irR);
    AppBrandMainProcessService.a(new StopRecordVoice());
    JsApiStartRecordVoice.iSM = null;
    GMTrace.o(19715376283648L, 146891);
  }
  
  public final void a(k paramk, JSONObject paramJSONObject, int paramInt)
  {
    GMTrace.i(19715242065920L, 146890);
    d(paramk);
    paramk.v(paramInt, d("ok", null));
    GMTrace.o(19715242065920L, 146890);
  }
  
  private static class StopRecordVoice
    extends MainProcessTask
  {
    public static final Parcelable.Creator<StopRecordVoice> CREATOR;
    
    static
    {
      GMTrace.i(19727053225984L, 146978);
      CREATOR = new Parcelable.Creator() {};
      GMTrace.o(19727053225984L, 146978);
    }
    
    public StopRecordVoice()
    {
      GMTrace.i(19726784790528L, 146976);
      GMTrace.o(19726784790528L, 146976);
    }
    
    public final void RS()
    {
      GMTrace.i(19726919008256L, 146977);
      com.tencent.mm.plugin.appbrand.o.d.xC().C(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(19749467586560L, 147145);
          com.tencent.mm.plugin.appbrand.media.a.iQ(1);
          GMTrace.o(19749467586560L, 147145);
        }
      });
      GMTrace.o(19726919008256L, 146977);
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/audio/JsApiStopRecordVoice.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */