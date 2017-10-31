package com.tencent.mm.plugin.appbrand.jsapi.bio.soter;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.a.he;
import com.tencent.mm.g.a.he.b;
import com.tencent.mm.plugin.appbrand.ipc.AppBrandMainProcessService;
import com.tencent.mm.plugin.appbrand.ipc.MainProcessTask;
import com.tencent.mm.plugin.appbrand.k;
import com.tencent.mm.plugin.appbrand.o.d;
import com.tencent.mm.sdk.platformtools.w;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class JsApiCheckBioEnrollment
  extends com.tencent.mm.plugin.appbrand.jsapi.a
{
  public static final int CTRL_INDEX = 344;
  public static final String NAME = "checkIsSoterEnrolledInDevice";
  private GetIsEnrolledTask iUB;
  
  public JsApiCheckBioEnrollment()
  {
    GMTrace.i(19833487884288L, 147771);
    this.iUB = null;
    GMTrace.o(19833487884288L, 147771);
  }
  
  public final void a(k paramk, JSONObject paramJSONObject, int paramInt)
  {
    GMTrace.i(19833622102016L, 147772);
    w.i("MicroMsg.JsApiCheckBioEnrollment", "hy: subapp start do check is enrolled");
    this.iUB = new GetIsEnrolledTask(paramk, paramInt, a.qc(paramJSONObject.optString("checkAuthMode")), this);
    d.aQ(this.iUB);
    AppBrandMainProcessService.a(this.iUB);
    GMTrace.o(19833622102016L, 147772);
  }
  
  private static class GetIsEnrolledTask
    extends MainProcessTask
  {
    public static final Parcelable.Creator<GetIsEnrolledTask> CREATOR;
    private int iPM;
    private JsApiCheckBioEnrollment iUC;
    private int iUD;
    private int iUE;
    private k iqQ;
    
    static
    {
      GMTrace.i(19834695843840L, 147780);
      CREATOR = new Parcelable.Creator() {};
      GMTrace.o(19834695843840L, 147780);
    }
    
    protected GetIsEnrolledTask(Parcel paramParcel)
    {
      GMTrace.i(19834427408384L, 147778);
      this.iqQ = null;
      this.iPM = -1;
      this.iUD = -1;
      this.iUE = -1;
      f(paramParcel);
      GMTrace.o(19834427408384L, 147778);
    }
    
    public GetIsEnrolledTask(k paramk, int paramInt1, int paramInt2, JsApiCheckBioEnrollment paramJsApiCheckBioEnrollment)
    {
      GMTrace.i(19834024755200L, 147775);
      this.iqQ = null;
      this.iPM = -1;
      this.iUD = -1;
      this.iUE = -1;
      this.iqQ = paramk;
      this.iPM = paramInt1;
      this.iUC = paramJsApiCheckBioEnrollment;
      this.iUD = paramInt2;
      GMTrace.o(19834024755200L, 147775);
    }
    
    public final void RS()
    {
      GMTrace.i(19833890537472L, 147774);
      he localhe = new he();
      localhe.fDv.fDx = this.iUD;
      com.tencent.mm.sdk.b.a.uLm.m(localhe);
      this.iUE = localhe.fDw.fDy;
      w.i("MicroMsg.GetIsEnrolledTask", "hy: enrollResult: %d", new Object[] { Integer.valueOf(this.iUE) });
      VC();
      GMTrace.o(19833890537472L, 147774);
    }
    
    public final void VB()
    {
      boolean bool = false;
      GMTrace.i(19833756319744L, 147773);
      super.VB();
      w.d("MicroMsg.GetIsEnrolledTask", "hy: callback. enrollResult: %d", new Object[] { Integer.valueOf(this.iUE) });
      HashMap localHashMap = new HashMap(2);
      if (this.iUE == 1) {
        bool = true;
      }
      localHashMap.put("isEnrolled", Boolean.valueOf(bool));
      if (this.iUE == 0) {
        this.iqQ.v(this.iPM, this.iUC.d("ok", localHashMap));
      }
      for (;;)
      {
        d.aR(this);
        GMTrace.o(19833756319744L, 147773);
        return;
        if (this.iUE == -1) {
          this.iqQ.v(this.iPM, this.iUC.d("fail not support", localHashMap));
        } else if (this.iUE == 1) {
          this.iqQ.v(this.iPM, this.iUC.d("ok", localHashMap));
        } else {
          this.iqQ.v(this.iPM, this.iUC.d("fail unknown error", localHashMap));
        }
      }
    }
    
    public int describeContents()
    {
      GMTrace.i(19834158972928L, 147776);
      GMTrace.o(19834158972928L, 147776);
      return 0;
    }
    
    public final void f(Parcel paramParcel)
    {
      GMTrace.i(19834561626112L, 147779);
      super.f(paramParcel);
      this.iUE = paramParcel.readInt();
      this.iUD = paramParcel.readInt();
      GMTrace.o(19834561626112L, 147779);
    }
    
    public void writeToParcel(Parcel paramParcel, int paramInt)
    {
      GMTrace.i(19834293190656L, 147777);
      super.writeToParcel(paramParcel, paramInt);
      paramParcel.writeInt(this.iUE);
      paramParcel.writeInt(this.iUD);
      GMTrace.o(19834293190656L, 147777);
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/bio/soter/JsApiCheckBioEnrollment.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */