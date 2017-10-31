package com.tencent.mm.plugin.appbrand.jsapi.bio.face;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.a.hf;
import com.tencent.mm.g.a.hf.a;
import com.tencent.mm.plugin.appbrand.ipc.AppBrandMainProcessService;
import com.tencent.mm.plugin.appbrand.ipc.MainProcessTask;
import com.tencent.mm.plugin.appbrand.k;
import com.tencent.mm.plugin.appbrand.o.d;
import com.tencent.mm.sdk.platformtools.w;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class JsApiCheckIsSupportFaceDetect
  extends com.tencent.mm.plugin.appbrand.jsapi.a
{
  public static final int CTRL_INDEX = 214;
  public static final String NAME = "checkIsSupportFacialRecognition";
  private GetIsSupportFaceTask iUx;
  
  public JsApiCheckIsSupportFaceDetect()
  {
    GMTrace.i(14565442060288L, 108521);
    this.iUx = null;
    GMTrace.o(14565442060288L, 108521);
  }
  
  public final void a(k paramk, JSONObject paramJSONObject, int paramInt)
  {
    GMTrace.i(14565576278016L, 108522);
    w.i("MicroMsg.JsApiCheckIsSupportFaceDetect", "hy: subapp start do check is support face detect");
    this.iUx = new GetIsSupportFaceTask(paramk, paramInt, this);
    d.aQ(this.iUx);
    AppBrandMainProcessService.a(this.iUx);
    GMTrace.o(14565576278016L, 108522);
  }
  
  private static class GetIsSupportFaceTask
    extends MainProcessTask
  {
    public static final Parcelable.Creator<GetIsSupportFaceTask> CREATOR;
    private int errCode;
    private boolean fOs;
    private String ftU;
    private int iPM;
    private JsApiCheckIsSupportFaceDetect iUy;
    private int iUz;
    private k iqQ;
    
    static
    {
      GMTrace.i(14566650019840L, 108530);
      CREATOR = new Parcelable.Creator() {};
      GMTrace.o(14566650019840L, 108530);
    }
    
    protected GetIsSupportFaceTask(Parcel paramParcel)
    {
      GMTrace.i(14566381584384L, 108528);
      this.iqQ = null;
      this.iPM = -1;
      this.fOs = false;
      this.errCode = -1;
      this.ftU = "not returned";
      this.iUz = -1;
      f(paramParcel);
      GMTrace.o(14566381584384L, 108528);
    }
    
    public GetIsSupportFaceTask(k paramk, int paramInt, JsApiCheckIsSupportFaceDetect paramJsApiCheckIsSupportFaceDetect)
    {
      GMTrace.i(14566247366656L, 108527);
      this.iqQ = null;
      this.iPM = -1;
      this.fOs = false;
      this.errCode = -1;
      this.ftU = "not returned";
      this.iUz = -1;
      this.iqQ = paramk;
      this.iPM = paramInt;
      this.iUy = paramJsApiCheckIsSupportFaceDetect;
      GMTrace.o(14566247366656L, 108527);
    }
    
    public final void RS()
    {
      GMTrace.i(14565844713472L, 108524);
      hf localhf = new hf();
      com.tencent.mm.sdk.b.a.uLm.m(localhf);
      this.fOs = localhf.fDz.fDA;
      this.errCode = localhf.fDz.fDB;
      this.ftU = localhf.fDz.fDC;
      this.iUz = localhf.fDz.fDD;
      w.i("MicroMsg.GetIsSupportFaceTask", "hy: is support: %b, errCode: %d, errMsg: %s, ilbVersion: %d", new Object[] { Boolean.valueOf(this.fOs), Integer.valueOf(this.errCode), this.ftU, Integer.valueOf(this.iUz) });
      VC();
      GMTrace.o(14565844713472L, 108524);
    }
    
    public final void VB()
    {
      GMTrace.i(14565710495744L, 108523);
      super.VB();
      w.d("MicroMsg.GetIsSupportFaceTask", "hy: callback. isSupport: %b, errCode: %d, errMsg: %s, libVersion: %d", new Object[] { Boolean.valueOf(this.fOs), Integer.valueOf(this.errCode), this.ftU, Integer.valueOf(this.iUz) });
      HashMap localHashMap = new HashMap(3);
      localHashMap.put("errCode", Integer.valueOf(this.errCode));
      localHashMap.put("libVersionCode", Integer.valueOf(this.iUz));
      if (this.errCode == 0) {
        this.iqQ.v(this.iPM, this.iUy.d("ok", localHashMap));
      }
      for (;;)
      {
        d.aR(this);
        GMTrace.o(14565710495744L, 108523);
        return;
        this.iqQ.v(this.iPM, this.iUy.d("fail " + this.ftU, localHashMap));
      }
    }
    
    public int describeContents()
    {
      GMTrace.i(14565978931200L, 108525);
      GMTrace.o(14565978931200L, 108525);
      return 0;
    }
    
    public final void f(Parcel paramParcel)
    {
      GMTrace.i(14566515802112L, 108529);
      super.f(paramParcel);
      if (paramParcel.readByte() != 0) {}
      for (boolean bool = true;; bool = false)
      {
        this.fOs = bool;
        this.errCode = paramParcel.readInt();
        this.ftU = paramParcel.readString();
        this.iUz = paramParcel.readInt();
        GMTrace.o(14566515802112L, 108529);
        return;
      }
    }
    
    public void writeToParcel(Parcel paramParcel, int paramInt)
    {
      GMTrace.i(14566113148928L, 108526);
      super.writeToParcel(paramParcel, paramInt);
      if (this.fOs) {}
      for (byte b = 1;; b = 0)
      {
        paramParcel.writeByte(b);
        paramParcel.writeInt(this.errCode);
        paramParcel.writeString(this.ftU);
        paramParcel.writeInt(this.iUz);
        GMTrace.o(14566113148928L, 108526);
        return;
      }
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/bio/face/JsApiCheckIsSupportFaceDetect.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */