package com.tencent.mm.plugin.appbrand.jsapi;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.config.k;
import com.tencent.mm.plugin.appbrand.config.k.c;
import com.tencent.mm.plugin.appbrand.ipc.MainProcessTask;

class JsApiGetAppConfigTask
  extends MainProcessTask
{
  public static final Parcelable.Creator<JsApiGetAppConfigTask> CREATOR;
  public String amo;
  public String appId;
  public Runnable iQi;
  public int type;
  public String value;
  
  static
  {
    GMTrace.i(10424959369216L, 77672);
    CREATOR = new Parcelable.Creator() {};
    GMTrace.o(10424959369216L, 77672);
  }
  
  public JsApiGetAppConfigTask()
  {
    GMTrace.i(10424019845120L, 77665);
    GMTrace.o(10424019845120L, 77665);
  }
  
  public JsApiGetAppConfigTask(Parcel paramParcel)
  {
    GMTrace.i(10424154062848L, 77666);
    f(paramParcel);
    GMTrace.o(10424154062848L, 77666);
  }
  
  public final void RS()
  {
    GMTrace.i(10424288280576L, 77667);
    k.a(this.appId, this.type, 0, new k.c()
    {
      public final void oc(String paramAnonymousString)
      {
        GMTrace.i(10371943366656L, 77277);
        JsApiGetAppConfigTask.this.value = paramAnonymousString;
        JsApiGetAppConfigTask.a(JsApiGetAppConfigTask.this);
        GMTrace.o(10371943366656L, 77277);
      }
    }, true);
    GMTrace.o(10424288280576L, 77667);
  }
  
  public final void VB()
  {
    GMTrace.i(10424422498304L, 77668);
    if (this.iQi != null) {
      this.iQi.run();
    }
    GMTrace.o(10424422498304L, 77668);
  }
  
  public final void f(Parcel paramParcel)
  {
    GMTrace.i(10424556716032L, 77669);
    this.appId = paramParcel.readString();
    this.amo = paramParcel.readString();
    this.value = paramParcel.readString();
    this.type = paramParcel.readInt();
    GMTrace.o(10424556716032L, 77669);
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    GMTrace.i(10424690933760L, 77670);
    paramParcel.writeString(this.appId);
    paramParcel.writeString(this.amo);
    paramParcel.writeString(this.value);
    paramParcel.writeInt(this.type);
    GMTrace.o(10424690933760L, 77670);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/JsApiGetAppConfigTask.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */