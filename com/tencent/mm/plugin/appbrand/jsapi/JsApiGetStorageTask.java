package com.tencent.mm.plugin.appbrand.jsapi;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.app.f;
import com.tencent.mm.plugin.appbrand.appstorage.b;
import com.tencent.mm.plugin.appbrand.appstorage.b.a;
import com.tencent.mm.plugin.appbrand.ipc.MainProcessTask;
import com.tencent.mm.sdk.platformtools.w;

class JsApiGetStorageTask
  extends MainProcessTask
{
  public static final Parcelable.Creator<JsApiGetStorageTask> CREATOR;
  public String amo;
  public String appId;
  public Runnable iQi;
  private boolean iQr;
  private int iQs;
  private int iQt;
  private int iQu;
  public String type;
  public String value;
  
  static
  {
    GMTrace.i(10385230921728L, 77376);
    CREATOR = new Parcelable.Creator() {};
    GMTrace.o(10385230921728L, 77376);
  }
  
  public JsApiGetStorageTask()
  {
    GMTrace.i(10384559833088L, 77371);
    GMTrace.o(10384559833088L, 77371);
  }
  
  public final void RS()
  {
    GMTrace.i(10384694050816L, 77372);
    Object localObject1 = f.RZ();
    if (localObject1 == null)
    {
      VC();
      GMTrace.o(10384694050816L, 77372);
      return;
    }
    Object localObject2 = ((b)localObject1).aB(this.appId, this.amo);
    if ((b.a)localObject2[0] == b.a.iDp)
    {
      localObject1 = (String)localObject2[1];
      localObject2 = (String)localObject2[2];
      if (by.g(new String[] { localObject1, localObject2 }) <= 102400) {
        break label170;
      }
      this.iQt = by.g(new String[] { localObject1 });
      this.iQu = by.g(new String[] { localObject2 });
    }
    for (;;)
    {
      try
      {
        by.f(this.iPd, new String[] { localObject1, localObject2 });
        this.iQr = true;
        VC();
        GMTrace.o(10384694050816L, 77372);
        return;
      }
      catch (Exception localException)
      {
        w.e("MicroMsg.JsApiGetStorageTask", localException.getMessage());
        continue;
      }
      label170:
      this.iQr = false;
      this.value = localException;
      this.type = ((String)localObject2);
    }
  }
  
  public final void VB()
  {
    GMTrace.i(10384828268544L, 77373);
    if (this.iQr) {}
    try
    {
      String str = by.pW(this.iPd);
      if (str.length() == this.iQt + this.iQu)
      {
        this.value = str.substring(0, this.iQt);
        this.type = str.substring(this.iQt, this.iQt + this.iQu);
      }
    }
    catch (Exception localException)
    {
      for (;;)
      {
        w.e("MicroMsg.JsApiGetStorageTask", localException.getMessage());
        by.pX(this.iPd);
      }
    }
    finally
    {
      by.pX(this.iPd);
    }
    if (this.iQi != null) {
      this.iQi.run();
    }
    GMTrace.o(10384828268544L, 77373);
  }
  
  public final void f(Parcel paramParcel)
  {
    GMTrace.i(10384962486272L, 77374);
    this.appId = paramParcel.readString();
    if (paramParcel.readByte() != 0) {}
    for (boolean bool = true;; bool = false)
    {
      this.iQr = bool;
      this.iQs = paramParcel.readInt();
      this.iQt = paramParcel.readInt();
      this.iQu = paramParcel.readInt();
      this.amo = paramParcel.readString();
      this.value = paramParcel.readString();
      this.type = paramParcel.readString();
      GMTrace.o(10384962486272L, 77374);
      return;
    }
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    GMTrace.i(10385096704000L, 77375);
    paramParcel.writeString(this.appId);
    if (this.iQr) {}
    for (byte b = 1;; b = 0)
    {
      paramParcel.writeByte(b);
      paramParcel.writeInt(this.iQs);
      paramParcel.writeInt(this.iQt);
      paramParcel.writeInt(this.iQu);
      paramParcel.writeString(this.amo);
      paramParcel.writeString(this.value);
      paramParcel.writeString(this.type);
      GMTrace.o(10385096704000L, 77375);
      return;
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/JsApiGetStorageTask.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */