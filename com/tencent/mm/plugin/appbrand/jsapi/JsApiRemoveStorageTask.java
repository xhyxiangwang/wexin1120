package com.tencent.mm.plugin.appbrand.jsapi;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.app.f;
import com.tencent.mm.plugin.appbrand.appstorage.b;
import com.tencent.mm.plugin.appbrand.ipc.MainProcessTask;

public class JsApiRemoveStorageTask
  extends MainProcessTask
{
  public static final Parcelable.Creator<JsApiRemoveStorageTask> CREATOR;
  public String amo;
  public String appId;
  
  static
  {
    GMTrace.i(10481062379520L, 78090);
    CREATOR = new Parcelable.Creator() {};
    GMTrace.o(10481062379520L, 78090);
  }
  
  public JsApiRemoveStorageTask()
  {
    GMTrace.i(10480525508608L, 78086);
    GMTrace.o(10480525508608L, 78086);
  }
  
  public final void RS()
  {
    GMTrace.i(10480659726336L, 78087);
    b localb = f.RZ();
    if (localb == null)
    {
      GMTrace.o(10480659726336L, 78087);
      return;
    }
    localb.aC(this.appId, this.amo);
    GMTrace.o(10480659726336L, 78087);
  }
  
  public final void f(Parcel paramParcel)
  {
    GMTrace.i(10480928161792L, 78089);
    this.appId = paramParcel.readString();
    this.amo = paramParcel.readString();
    GMTrace.o(10480928161792L, 78089);
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    GMTrace.i(10480793944064L, 78088);
    paramParcel.writeString(this.appId);
    paramParcel.writeString(this.amo);
    GMTrace.o(10480793944064L, 78088);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/JsApiRemoveStorageTask.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */