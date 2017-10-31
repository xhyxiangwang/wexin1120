package com.tencent.mm.plugin.appbrand.jsapi.bio.soter;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.kernel.h;
import com.tencent.mm.plugin.appbrand.ipc.AppBrandMainProcessService;
import com.tencent.mm.plugin.appbrand.ipc.MainProcessTask;
import com.tencent.mm.plugin.appbrand.k;
import com.tencent.mm.plugin.appbrand.o.d;
import com.tencent.mm.sdk.platformtools.w;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class JsApiCheckIsSupportSoterAuthentication
  extends com.tencent.mm.plugin.appbrand.jsapi.a
{
  public static final int CTRL_INDEX = 276;
  public static final String NAME = "checkIsSupportSoterAuthentication";
  private GetIsSupportSoterTask iUF;
  
  public JsApiCheckIsSupportSoterAuthentication()
  {
    GMTrace.i(16540590145536L, 123237);
    this.iUF = null;
    GMTrace.o(16540590145536L, 123237);
  }
  
  public final void a(k paramk, JSONObject paramJSONObject, int paramInt)
  {
    GMTrace.i(16540724363264L, 123238);
    w.i("MicroMsg.JsApiCheckIsSupportSoterAuthentication", "hy: subapp start do check is support soter authentication");
    this.iUF = new GetIsSupportSoterTask(paramk, paramInt, this);
    d.aQ(this.iUF);
    AppBrandMainProcessService.a(this.iUF);
    GMTrace.o(16540724363264L, 123238);
  }
  
  private static class GetIsSupportSoterTask
    extends MainProcessTask
  {
    public static final Parcelable.Creator<GetIsSupportSoterTask> CREATOR;
    private int iPM;
    private JsApiCheckIsSupportSoterAuthentication iUG;
    private int iUH;
    private k iqQ;
    
    static
    {
      GMTrace.i(16541798105088L, 123246);
      CREATOR = new Parcelable.Creator() {};
      GMTrace.o(16541798105088L, 123246);
    }
    
    protected GetIsSupportSoterTask(Parcel paramParcel)
    {
      GMTrace.i(16541529669632L, 123244);
      this.iqQ = null;
      this.iPM = -1;
      this.iUH = 0;
      f(paramParcel);
      GMTrace.o(16541529669632L, 123244);
    }
    
    public GetIsSupportSoterTask(k paramk, int paramInt, JsApiCheckIsSupportSoterAuthentication paramJsApiCheckIsSupportSoterAuthentication)
    {
      GMTrace.i(16541127016448L, 123241);
      this.iqQ = null;
      this.iPM = -1;
      this.iUH = 0;
      this.iqQ = paramk;
      this.iPM = paramInt;
      this.iUG = paramJsApiCheckIsSupportSoterAuthentication;
      GMTrace.o(16541127016448L, 123241);
    }
    
    public final void RS()
    {
      GMTrace.i(16540992798720L, 123240);
      this.iUH = ((com.tencent.mm.plugin.appbrand.compat.a.a)h.h(com.tencent.mm.plugin.appbrand.compat.a.a.class)).TN();
      w.i("MicroMsg.GetIsSupportSoterTask", "hy: supportMode: %d", new Object[] { Integer.valueOf(this.iUH) });
      VC();
      GMTrace.o(16540992798720L, 123240);
    }
    
    public final void VB()
    {
      GMTrace.i(16540858580992L, 123239);
      super.VB();
      w.d("MicroMsg.GetIsSupportSoterTask", "hy: callback. supportMode: %d", new Object[] { Integer.valueOf(this.iUH) });
      HashMap localHashMap = new HashMap(2);
      localHashMap.put("supportMode", a.iz(this.iUH));
      this.iqQ.v(this.iPM, this.iUG.d("ok", localHashMap));
      d.aR(this);
      GMTrace.o(16540858580992L, 123239);
    }
    
    public int describeContents()
    {
      GMTrace.i(16541261234176L, 123242);
      GMTrace.o(16541261234176L, 123242);
      return 0;
    }
    
    public final void f(Parcel paramParcel)
    {
      GMTrace.i(16541663887360L, 123245);
      super.f(paramParcel);
      this.iUH = paramParcel.readInt();
      GMTrace.o(16541663887360L, 123245);
    }
    
    public void writeToParcel(Parcel paramParcel, int paramInt)
    {
      GMTrace.i(16541395451904L, 123243);
      super.writeToParcel(paramParcel, paramInt);
      paramParcel.writeInt(this.iUH);
      GMTrace.o(16541395451904L, 123243);
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/bio/soter/JsApiCheckIsSupportSoterAuthentication.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */