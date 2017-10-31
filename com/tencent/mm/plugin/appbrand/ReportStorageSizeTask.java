package com.tencent.mm.plugin.appbrand;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.app.f;
import com.tencent.mm.plugin.appbrand.appstorage.b;
import com.tencent.mm.plugin.appbrand.appstorage.c;
import com.tencent.mm.plugin.appbrand.ipc.MainProcessTask;
import com.tencent.mm.plugin.report.service.g;

public class ReportStorageSizeTask
  extends MainProcessTask
{
  public static final Parcelable.Creator<ReportStorageSizeTask> CREATOR;
  public String appId;
  
  static
  {
    GMTrace.i(15562545561600L, 115950);
    CREATOR = new Parcelable.Creator() {};
    GMTrace.o(15562545561600L, 115950);
  }
  
  public ReportStorageSizeTask()
  {
    GMTrace.i(15562008690688L, 115946);
    GMTrace.o(15562008690688L, 115946);
  }
  
  public final void RS()
  {
    GMTrace.i(15562142908416L, 115947);
    b localb = f.RZ();
    if (localb == null)
    {
      GMTrace.o(15562142908416L, 115947);
      return;
    }
    g.paX.i(14073, new Object[] { this.appId, "", "", localb.og(this.appId)[1], Long.valueOf(c.ol(this.appId)), Long.valueOf(c.om(this.appId)) });
    GMTrace.o(15562142908416L, 115947);
  }
  
  public final void f(Parcel paramParcel)
  {
    GMTrace.i(15562411343872L, 115949);
    this.appId = paramParcel.readString();
    GMTrace.o(15562411343872L, 115949);
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    GMTrace.i(15562277126144L, 115948);
    paramParcel.writeString(this.appId);
    GMTrace.o(15562277126144L, 115948);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/ReportStorageSizeTask.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */