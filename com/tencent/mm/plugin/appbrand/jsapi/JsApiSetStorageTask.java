package com.tencent.mm.plugin.appbrand.jsapi;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.app.f;
import com.tencent.mm.plugin.appbrand.appstorage.b;
import com.tencent.mm.plugin.appbrand.appstorage.b.a;
import com.tencent.mm.plugin.appbrand.ipc.MainProcessTask;
import com.tencent.mm.sdk.platformtools.w;

class JsApiSetStorageTask
  extends MainProcessTask
{
  public static final Parcelable.Creator<JsApiSetStorageTask> CREATOR;
  private String amo;
  public String appId;
  public Runnable iQi;
  private boolean iQr;
  private int iQs;
  private int iQt;
  private int iQu;
  public String result;
  private String type;
  private String value;
  
  static
  {
    GMTrace.i(10297184092160L, 76720);
    CREATOR = new Parcelable.Creator() {};
    GMTrace.o(10297184092160L, 76720);
  }
  
  JsApiSetStorageTask()
  {
    GMTrace.i(10296244568064L, 76713);
    GMTrace.o(10296244568064L, 76713);
  }
  
  private void VO()
  {
    GMTrace.i(10296513003520L, 76715);
    this.amo = null;
    this.value = null;
    this.type = null;
    GMTrace.o(10296513003520L, 76715);
  }
  
  public final void RS()
  {
    GMTrace.i(10296781438976L, 76717);
    if (this.iQr) {}
    try
    {
      localObject1 = by.pW(this.iPd);
      if (((String)localObject1).length() == this.iQs + this.iQt + this.iQu)
      {
        this.amo = ((String)localObject1).substring(0, this.iQs);
        this.value = ((String)localObject1).substring(this.iQs, this.iQs + this.iQt);
        this.type = ((String)localObject1).substring(this.iQs + this.iQt, this.iQs + this.iQt + this.iQu);
      }
    }
    catch (Exception localException)
    {
      for (;;)
      {
        Object localObject1;
        w.e("MicroMsg.JsApiSetStorageTask", localException.getMessage());
        by.pX(this.iPd);
      }
    }
    finally
    {
      by.pX(this.iPd);
    }
    localObject1 = f.RZ();
    if (localObject1 == null)
    {
      this.result = "fail";
      VO();
      VC();
      GMTrace.o(10296781438976L, 76717);
      return;
    }
    b.a locala = ((b)localObject2).e(this.appId, this.amo, this.value, this.type);
    if (locala == b.a.iDp) {
      this.result = "ok";
    }
    for (;;)
    {
      VO();
      VC();
      GMTrace.o(10296781438976L, 76717);
      return;
      if (locala == b.a.iDt) {
        this.result = "fail:quota reached";
      } else {
        this.result = "fail";
      }
    }
  }
  
  public final void VB()
  {
    GMTrace.i(10296647221248L, 76716);
    if (this.iQi != null) {
      this.iQi.run();
    }
    GMTrace.o(10296647221248L, 76716);
  }
  
  public final void f(Parcel paramParcel)
  {
    GMTrace.i(10296915656704L, 76718);
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
      this.result = paramParcel.readString();
      GMTrace.o(10296915656704L, 76718);
      return;
    }
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    GMTrace.i(10297049874432L, 76719);
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
      paramParcel.writeString(this.result);
      GMTrace.o(10297049874432L, 76719);
      return;
    }
  }
  
  public final void x(String paramString1, String paramString2, String paramString3)
  {
    GMTrace.i(10296378785792L, 76714);
    if (by.g(new String[] { paramString1, paramString2, paramString3 }) > 102400)
    {
      this.iQs = by.g(new String[] { paramString1 });
      this.iQt = by.g(new String[] { paramString2 });
      this.iQu = by.g(new String[] { paramString3 });
      try
      {
        by.f(this.iPd, new String[] { paramString1, paramString2, paramString3 });
        this.iQr = true;
        GMTrace.o(10296378785792L, 76714);
        return;
      }
      catch (Exception paramString1)
      {
        for (;;)
        {
          w.e("MicroMsg.JsApiSetStorageTask", paramString1.getMessage());
        }
      }
    }
    this.iQr = false;
    this.amo = paramString1;
    this.value = paramString2;
    this.type = paramString3;
    GMTrace.o(10296378785792L, 76714);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/JsApiSetStorageTask.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */