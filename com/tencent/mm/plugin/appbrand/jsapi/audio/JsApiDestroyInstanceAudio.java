package com.tencent.mm.plugin.appbrand.jsapi.audio;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.a.t;
import com.tencent.mm.g.a.t.b;
import com.tencent.mm.plugin.appbrand.ipc.AppBrandMainProcessService;
import com.tencent.mm.plugin.appbrand.ipc.MainProcessTask;
import com.tencent.mm.plugin.appbrand.jsapi.d;
import com.tencent.mm.plugin.appbrand.k;
import com.tencent.mm.sdk.platformtools.w;
import org.json.JSONObject;

public final class JsApiDestroyInstanceAudio
  extends com.tencent.mm.plugin.appbrand.jsapi.a
{
  public static final int CTRL_INDEX = 290;
  public static final String NAME = "destroyAudioInstance";
  
  public JsApiDestroyInstanceAudio()
  {
    GMTrace.i(19717926420480L, 146910);
    GMTrace.o(19717926420480L, 146910);
  }
  
  public final void a(k paramk, JSONObject paramJSONObject, int paramInt)
  {
    GMTrace.i(19718060638208L, 146911);
    if (paramJSONObject == null)
    {
      w.e("MicroMsg.JsApiDestroyInstanceAudio", "destroyAudioInstance fail, data is null");
      paramk.v(paramInt, d("fail:data is null", null));
      GMTrace.o(19718060638208L, 146911);
      return;
    }
    w.i("MicroMsg.JsApiDestroyInstanceAudio", "destroyAudioInstance data:%s", new Object[] { paramJSONObject.toString() });
    paramJSONObject = paramJSONObject.optString("audioId");
    if (TextUtils.isEmpty(paramJSONObject))
    {
      w.e("MicroMsg.JsApiDestroyInstanceAudio", "audioId is empty");
      paramk.v(paramInt, d("fail:audioId is empty", null));
      GMTrace.o(19718060638208L, 146911);
      return;
    }
    DestroyAudioTask localDestroyAudioTask = new DestroyAudioTask(this, paramk, paramInt);
    localDestroyAudioTask.appId = paramk.iqL;
    localDestroyAudioTask.ftO = paramJSONObject;
    AppBrandMainProcessService.a(localDestroyAudioTask);
    GMTrace.o(19718060638208L, 146911);
  }
  
  private static class DestroyAudioTask
    extends MainProcessTask
  {
    public static final Parcelable.Creator<DestroyAudioTask> CREATOR;
    public String appId;
    public String ftO;
    private d iQA;
    public k iQB;
    public int iQC;
    public boolean iRF;
    
    static
    {
      GMTrace.i(19720879210496L, 146932);
      CREATOR = new Parcelable.Creator() {};
      GMTrace.o(19720879210496L, 146932);
    }
    
    public DestroyAudioTask(Parcel paramParcel)
    {
      GMTrace.i(19720208121856L, 146927);
      this.appId = "";
      this.ftO = "";
      this.iRF = false;
      f(paramParcel);
      GMTrace.o(19720208121856L, 146927);
    }
    
    public DestroyAudioTask(d paramd, k paramk, int paramInt)
    {
      GMTrace.i(19720073904128L, 146926);
      this.appId = "";
      this.ftO = "";
      this.iRF = false;
      this.iQA = paramd;
      this.iQB = paramk;
      this.iQC = paramInt;
      GMTrace.o(19720073904128L, 146926);
    }
    
    public final void RS()
    {
      GMTrace.i(19720342339584L, 146928);
      w.i("MicroMsg.JsApiDestroyInstanceAudio", "runInMainProcess");
      String str = this.ftO;
      w.i("MicroMsg.AudioPlayerHelper", "destroyAudio, audioId:%s", new Object[] { str });
      t localt = new t();
      localt.ftM.action = 5;
      localt.ftM.ftO = str;
      com.tencent.mm.sdk.b.a.uLm.m(localt);
      this.iRF = localt.ftN.ftR;
      VC();
      GMTrace.o(19720342339584L, 146928);
    }
    
    public final void VB()
    {
      GMTrace.i(19720476557312L, 146929);
      w.i("MicroMsg.JsApiDestroyInstanceAudio", "runInClientProcess");
      if (this.iQB == null)
      {
        w.e("MicroMsg.JsApiDestroyInstanceAudio", "server is null");
        GMTrace.o(19720476557312L, 146929);
        return;
      }
      if (this.iRF)
      {
        this.iQB.v(this.iQC, this.iQA.d("fail", null));
        GMTrace.o(19720476557312L, 146929);
        return;
      }
      this.iQB.v(this.iQC, this.iQA.d("ok", null));
      GMTrace.o(19720476557312L, 146929);
    }
    
    public final void f(Parcel paramParcel)
    {
      GMTrace.i(19720610775040L, 146930);
      this.appId = paramParcel.readString();
      this.ftO = paramParcel.readString();
      GMTrace.o(19720610775040L, 146930);
    }
    
    public void writeToParcel(Parcel paramParcel, int paramInt)
    {
      GMTrace.i(19720744992768L, 146931);
      paramParcel.writeString(this.appId);
      paramParcel.writeString(this.ftO);
      GMTrace.o(19720744992768L, 146931);
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/audio/JsApiDestroyInstanceAudio.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */