package com.tencent.mm.plugin.appbrand.jsapi;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ac.b;
import com.tencent.mm.ac.b.a;
import com.tencent.mm.ac.b.c;
import com.tencent.mm.ac.u;
import com.tencent.mm.ac.u.a;
import com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo;
import com.tencent.mm.plugin.appbrand.config.AppBrandSysConfig;
import com.tencent.mm.plugin.appbrand.ipc.AppBrandMainProcessService;
import com.tencent.mm.plugin.appbrand.ipc.MainProcessTask;
import com.tencent.mm.plugin.appbrand.report.AppBrandStatObject;
import com.tencent.mm.protocal.c.ahr;
import com.tencent.mm.protocal.c.ain;
import com.tencent.mm.protocal.c.aio;
import com.tencent.mm.protocal.c.bta;
import com.tencent.mm.sdk.platformtools.w;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class JsApiRefreshSession
  extends a
{
  private static final int CTRL_INDEX = 118;
  private static final String NAME = "refreshSession";
  
  public JsApiRefreshSession()
  {
    GMTrace.i(10384291397632L, 77369);
    GMTrace.o(10384291397632L, 77369);
  }
  
  public final void a(com.tencent.mm.plugin.appbrand.k paramk, JSONObject paramJSONObject, int paramInt)
  {
    GMTrace.i(10384425615360L, 77370);
    paramJSONObject = new RefreshSessionTask();
    Object localObject = com.tencent.mm.plugin.appbrand.a.nx(paramk.iqL);
    if (localObject != null) {
      paramJSONObject.iQS = ((AppBrandSysConfig)localObject).iJa.iCx;
    }
    localObject = paramk.iqL;
    paramJSONObject.iQO = this;
    paramJSONObject.iQB = paramk;
    paramJSONObject.iQC = paramInt;
    paramJSONObject.appId = ((String)localObject);
    paramk = com.tencent.mm.plugin.appbrand.a.ny((String)localObject);
    if (paramk != null) {
      paramJSONObject.iQT = paramk.scene;
    }
    paramJSONObject.VD();
    AppBrandMainProcessService.a(paramJSONObject);
    GMTrace.o(10384425615360L, 77370);
  }
  
  public static class RefreshSessionTask
    extends MainProcessTask
  {
    public static final Parcelable.Creator<RefreshSessionTask> CREATOR;
    String appId;
    com.tencent.mm.plugin.appbrand.k iQB;
    int iQC;
    d iQO;
    public int iQP;
    public int iQQ;
    public int iQR;
    public int iQS;
    int iQT;
    
    static
    {
      GMTrace.i(10310471647232L, 76819);
      CREATOR = new Parcelable.Creator() {};
      GMTrace.o(10310471647232L, 76819);
    }
    
    public RefreshSessionTask()
    {
      GMTrace.i(10308458381312L, 76804);
      GMTrace.o(10308458381312L, 76804);
    }
    
    public RefreshSessionTask(Parcel paramParcel)
    {
      GMTrace.i(10308592599040L, 76805);
      f(paramParcel);
      GMTrace.o(10308592599040L, 76805);
    }
    
    public final void RS()
    {
      GMTrace.i(10308726816768L, 76806);
      VD();
      b.a locala = new b.a();
      locala.hlX = new ain();
      locala.hlY = new aio();
      locala.uri = "/cgi-bin/mmbiz-bin/js-refreshsession";
      locala.hlW = 1196;
      locala.hlZ = 0;
      locala.hma = 0;
      ain localain = new ain();
      localain.mDD = this.appId;
      localain.ude = this.iQS;
      locala.hlX = localain;
      if (this.iQT > 0)
      {
        localain.udf = new bta();
        localain.udf.scene = this.iQT;
      }
      w.i("MicroMsg.JsApiRefreshSession", "refreshSession appId %s, versionType, statScene %d", new Object[] { this.appId, Integer.valueOf(this.iQS), Integer.valueOf(this.iQT) });
      u.a(locala.DA(), new u.a()
      {
        public final int a(int paramAnonymousInt1, int paramAnonymousInt2, String paramAnonymousString, b paramAnonymousb, com.tencent.mm.ac.k paramAnonymousk)
        {
          GMTrace.i(10355166150656L, 77152);
          w.d("MicroMsg.JsApiRefreshSession", "JSRefreshSessionRequest errType = %d, errCode = %d ,errMsg = %s", new Object[] { Integer.valueOf(paramAnonymousInt1), Integer.valueOf(paramAnonymousInt2), paramAnonymousString });
          if ((paramAnonymousInt1 != 0) || (paramAnonymousInt2 != 0))
          {
            JsApiRefreshSession.RefreshSessionTask.this.iQR = 0;
            JsApiRefreshSession.RefreshSessionTask.a(JsApiRefreshSession.RefreshSessionTask.this);
            GMTrace.o(10355166150656L, 77152);
            return 0;
          }
          paramAnonymousString = (aio)paramAnonymousb.hlV.hmc;
          if (paramAnonymousString == null)
          {
            JsApiRefreshSession.RefreshSessionTask.this.iQR = 0;
            w.e("MicroMsg.JsApiRefreshSession", "JSRefreshSessionRequest failed, response is null!");
            JsApiRefreshSession.RefreshSessionTask.b(JsApiRefreshSession.RefreshSessionTask.this);
          }
          for (;;)
          {
            GMTrace.o(10355166150656L, 77152);
            return 0;
            JsApiRefreshSession.RefreshSessionTask.this.iQQ = paramAnonymousString.udg.fzx;
            paramAnonymousb = paramAnonymousString.udg.fzy;
            if (JsApiRefreshSession.RefreshSessionTask.this.iQQ == 0)
            {
              JsApiRefreshSession.RefreshSessionTask.this.iQP = paramAnonymousString.udo;
              JsApiRefreshSession.RefreshSessionTask.this.iQQ = paramAnonymousString.udg.fzx;
              JsApiRefreshSession.RefreshSessionTask.this.iQR = 1;
              JsApiRefreshSession.RefreshSessionTask.c(JsApiRefreshSession.RefreshSessionTask.this);
            }
            else
            {
              JsApiRefreshSession.RefreshSessionTask.this.iQQ = paramAnonymousString.udg.fzx;
              JsApiRefreshSession.RefreshSessionTask.this.iQR = 2;
              w.e("MicroMsg.JsApiRefreshSession", "JSRefreshSessionRequest ERROR %s", new Object[] { paramAnonymousb });
              JsApiRefreshSession.RefreshSessionTask.d(JsApiRefreshSession.RefreshSessionTask.this);
            }
          }
        }
      }, true);
      GMTrace.o(10308726816768L, 76806);
    }
    
    public final void VB()
    {
      GMTrace.i(10308861034496L, 76807);
      HashMap localHashMap = new HashMap();
      switch (this.iQR)
      {
      default: 
        localHashMap.put("errCode", "-1");
        this.iQB.v(this.iQC, this.iQO.d("fail", localHashMap));
      }
      for (;;)
      {
        VE();
        GMTrace.o(10308861034496L, 76807);
        return;
        localHashMap.put("expireIn", this.iQP);
        localHashMap.put("errCode", this.iQQ);
        this.iQB.v(this.iQC, this.iQO.d("ok", localHashMap));
        continue;
        localHashMap.put("errCode", this.iQQ);
        this.iQB.v(this.iQC, this.iQO.d("fail", localHashMap));
      }
    }
    
    public final void f(Parcel paramParcel)
    {
      GMTrace.i(10308995252224L, 76808);
      this.iQP = paramParcel.readInt();
      this.iQQ = paramParcel.readInt();
      this.iQR = paramParcel.readInt();
      this.iQC = paramParcel.readInt();
      this.appId = paramParcel.readString();
      this.iQS = paramParcel.readInt();
      this.iQT = paramParcel.readInt();
      GMTrace.o(10308995252224L, 76808);
    }
    
    public void writeToParcel(Parcel paramParcel, int paramInt)
    {
      GMTrace.i(10309129469952L, 76809);
      paramParcel.writeInt(this.iQP);
      paramParcel.writeInt(this.iQQ);
      paramParcel.writeInt(this.iQR);
      paramParcel.writeInt(this.iQC);
      paramParcel.writeString(this.appId);
      paramParcel.writeInt(this.iQS);
      paramParcel.writeInt(this.iQT);
      GMTrace.o(10309129469952L, 76809);
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/JsApiRefreshSession.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */