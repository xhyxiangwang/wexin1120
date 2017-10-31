package com.tencent.mm.plugin.appbrand.jsapi;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ac.b;
import com.tencent.mm.ac.b.a;
import com.tencent.mm.ac.u;
import com.tencent.mm.ac.u.a;
import com.tencent.mm.plugin.appbrand.ipc.AppBrandMainProcessService;
import com.tencent.mm.plugin.appbrand.ipc.MainProcessTask;
import com.tencent.mm.protocal.c.bka;
import com.tencent.mm.protocal.c.bkb;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.x.br;
import org.json.JSONObject;

public class JsApiUploadWeRunData
  extends a
{
  public static final int CTRL_INDEX = 323;
  public static final String NAME = "uploadWeRunData";
  private UploadMiniAppStepTask iRr;
  
  public JsApiUploadWeRunData()
  {
    GMTrace.i(19802886242304L, 147543);
    GMTrace.o(19802886242304L, 147543);
  }
  
  public final void a(d paramd, com.tencent.mm.plugin.appbrand.k paramk, int paramInt1, int paramInt2, boolean paramBoolean)
  {
    GMTrace.i(19803154677760L, 147545);
    if (paramInt2 <= 0)
    {
      paramk.v(paramInt1, paramd.d("fail:step invalid", null));
      GMTrace.o(19803154677760L, 147545);
      return;
    }
    this.iRr = new UploadMiniAppStepTask(paramd, paramk, paramInt1, paramInt2, paramBoolean);
    this.iRr.VD();
    AppBrandMainProcessService.a(this.iRr);
    GMTrace.o(19803154677760L, 147545);
  }
  
  public void a(com.tencent.mm.plugin.appbrand.k paramk, JSONObject paramJSONObject, int paramInt)
  {
    GMTrace.i(19803020460032L, 147544);
    w.d("MicroMsg.JsApiUploadWeRunData", "JsApiUploadWeRunData!");
    if (paramJSONObject == null)
    {
      paramk.v(paramInt, d("fail:data is null", null));
      w.e("MicroMsg.JsApiUploadWeRunData", "data is null");
      GMTrace.o(19803020460032L, 147544);
      return;
    }
    a(this, paramk, paramInt, paramJSONObject.optInt("step"), false);
    GMTrace.o(19803020460032L, 147544);
  }
  
  private static class UploadMiniAppStepTask
    extends MainProcessTask
  {
    public static final Parcelable.Creator<UploadMiniAppStepTask> CREATOR;
    private String appId;
    public boolean fxs;
    private d iQA;
    private com.tencent.mm.plugin.appbrand.k iQB;
    private int iQC;
    private int iRs;
    private boolean iRt;
    
    static
    {
      GMTrace.i(19771747729408L, 147311);
      CREATOR = new Parcelable.Creator() {};
      GMTrace.o(19771747729408L, 147311);
    }
    
    public UploadMiniAppStepTask(Parcel paramParcel)
    {
      GMTrace.i(19770942423040L, 147305);
      f(paramParcel);
      GMTrace.o(19770942423040L, 147305);
    }
    
    public UploadMiniAppStepTask(d paramd, com.tencent.mm.plugin.appbrand.k paramk, int paramInt1, int paramInt2, boolean paramBoolean)
    {
      GMTrace.i(19770808205312L, 147304);
      w.d("MicroMsg.JsApiUploadWeRunData", "UploadMiniAppStepTask");
      this.iQA = paramd;
      this.iQB = paramk;
      this.iQC = paramInt1;
      this.iRs = paramInt2;
      this.iRt = paramBoolean;
      this.appId = paramk.iqL;
      GMTrace.o(19770808205312L, 147304);
    }
    
    public final void RS()
    {
      GMTrace.i(19771076640768L, 147306);
      long l2 = br.BU();
      w.d("MicroMsg.JsApiUploadWeRunData", "UploadMiniAppStepTask currentTime %d", new Object[] { Long.valueOf(l2 / 1000L) });
      long l1 = l2;
      if (l2 == 0L) {
        l1 = System.currentTimeMillis();
      }
      b.a locala = new b.a();
      bka localbka = new bka();
      locala.hlX = localbka;
      locala.hlY = new bkb();
      locala.uri = "/cgi-bin/mmoc-bin/hardware/uploadminiappstep";
      locala.hlW = 1949;
      locala.hlZ = 0;
      locala.hma = 0;
      localbka.mDD = this.appId;
      localbka.jXN = this.iRs;
      localbka.uAi = this.iRt;
      localbka.mEh = ((int)(l1 / 1000L));
      u.a(locala.DA(), new u.a()
      {
        public final int a(int paramAnonymousInt1, int paramAnonymousInt2, String paramAnonymousString, b paramAnonymousb, com.tencent.mm.ac.k paramAnonymousk)
        {
          GMTrace.i(19803423113216L, 147547);
          if (paramAnonymousk.getType() != 1949)
          {
            GMTrace.o(19803423113216L, 147547);
            return 0;
          }
          if ((paramAnonymousInt1 == 0) && (paramAnonymousInt2 == 0))
          {
            JsApiUploadWeRunData.UploadMiniAppStepTask.this.fxs = true;
            w.d("MicroMsg.JsApiUploadWeRunData", "UploadMiniAppStepTask ok.");
          }
          for (;;)
          {
            JsApiUploadWeRunData.UploadMiniAppStepTask.a(JsApiUploadWeRunData.UploadMiniAppStepTask.this);
            GMTrace.o(19803423113216L, 147547);
            return 0;
            JsApiUploadWeRunData.UploadMiniAppStepTask.this.fxs = false;
            w.i("MicroMsg.JsApiUploadWeRunData", "UploadMiniAppStepTask fail: errType %d,errCode %d,errMsg %s", new Object[] { Integer.valueOf(paramAnonymousInt1), Integer.valueOf(paramAnonymousInt2), paramAnonymousString });
          }
        }
      }, true);
      GMTrace.o(19771076640768L, 147306);
    }
    
    public final void VB()
    {
      GMTrace.i(19771210858496L, 147307);
      if (this.fxs) {
        this.iQB.v(this.iQC, this.iQA.d("ok", null));
      }
      for (;;)
      {
        VE();
        GMTrace.o(19771210858496L, 147307);
        return;
        this.iQB.v(this.iQC, this.iQA.d("fail", null));
      }
    }
    
    public final void f(Parcel paramParcel)
    {
      boolean bool2 = true;
      GMTrace.i(19771345076224L, 147308);
      this.iRs = paramParcel.readInt();
      if (paramParcel.readByte() != 0)
      {
        bool1 = true;
        this.iRt = bool1;
        if (paramParcel.readByte() == 0) {
          break label68;
        }
      }
      label68:
      for (boolean bool1 = bool2;; bool1 = false)
      {
        this.fxs = bool1;
        this.appId = paramParcel.readString();
        GMTrace.o(19771345076224L, 147308);
        return;
        bool1 = false;
        break;
      }
    }
    
    public void writeToParcel(Parcel paramParcel, int paramInt)
    {
      byte b2 = 1;
      GMTrace.i(19771479293952L, 147309);
      paramParcel.writeInt(this.iRs);
      if (this.iRt)
      {
        b1 = 1;
        paramParcel.writeByte(b1);
        if (!this.fxs) {
          break label70;
        }
      }
      label70:
      for (byte b1 = b2;; b1 = 0)
      {
        paramParcel.writeByte(b1);
        paramParcel.writeString(this.appId);
        GMTrace.o(19771479293952L, 147309);
        return;
        b1 = 0;
        break;
      }
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/JsApiUploadWeRunData.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */