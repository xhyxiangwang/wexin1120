package com.tencent.mm.plugin.appbrand.jsapi.auth;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ac.n;
import com.tencent.mm.kernel.h;
import com.tencent.mm.plugin.appbrand.a;
import com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo;
import com.tencent.mm.plugin.appbrand.config.AppBrandSysConfig;
import com.tencent.mm.plugin.appbrand.f;
import com.tencent.mm.plugin.appbrand.ipc.AppBrandMainProcessService;
import com.tencent.mm.plugin.appbrand.ipc.MainProcessTask;
import com.tencent.mm.plugin.appbrand.jsapi.d;
import com.tencent.mm.plugin.appbrand.k;
import com.tencent.mm.plugin.appbrand.report.AppBrandStatObject;
import com.tencent.mm.plugin.appbrand.widget.c;
import com.tencent.mm.plugin.appbrand.widget.c.a;
import com.tencent.mm.protocal.c.ayd;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.w;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import org.json.JSONObject;

public final class JsApiOperateWXData
  extends b
{
  public static final int CTRL_INDEX = 79;
  public static final String NAME = "operateWXData";
  
  public JsApiOperateWXData()
  {
    GMTrace.i(18221130317824L, 135758);
    GMTrace.o(18221130317824L, 135758);
  }
  
  public final void a(k paramk, JSONObject paramJSONObject, int paramInt, b.a parama)
  {
    GMTrace.i(18221264535552L, 135759);
    try
    {
      String str = paramJSONObject.getString("data");
      paramJSONObject = new OperateWXDataTask();
      paramJSONObject.appId = paramk.iqL;
      paramJSONObject.iTd = "operateWXData";
      AppBrandSysConfig localAppBrandSysConfig = a.nx(paramk.iqL);
      if (localAppBrandSysConfig != null) {
        paramJSONObject.iQS = localAppBrandSysConfig.iJa.iCx;
      }
      paramJSONObject.iTa = this;
      paramJSONObject.iQB = paramk;
      paramJSONObject.iTu = str;
      paramJSONObject.iQC = paramInt;
      paramJSONObject.iTb = parama;
      paramJSONObject.iTj = new Bundle();
      paramk = a.ny(paramJSONObject.appId);
      if (paramk != null) {
        paramJSONObject.iQT = paramk.scene;
      }
      paramJSONObject.VD();
      AppBrandMainProcessService.a(paramJSONObject);
      GMTrace.o(18221264535552L, 135759);
      return;
    }
    catch (Exception paramJSONObject)
    {
      w.e("MicroMsg.JsApiOperateWXData", "Exception %s", new Object[] { paramJSONObject.getMessage() });
      paramk.v(paramInt, d("fail", null));
      GMTrace.o(18221264535552L, 135759);
    }
  }
  
  private static class OperateWXDataTask
    extends MainProcessTask
  {
    public static final Parcelable.Creator<OperateWXDataTask> CREATOR;
    public String appId;
    k iQB;
    public int iQC;
    public int iQS;
    int iQT;
    b iTa;
    b.a iTb;
    public String iTd;
    public String iTe;
    public int iTf;
    public String iTg;
    public String iTh;
    public int iTi;
    public Bundle iTj;
    public String iTu;
    public String iTv;
    public String iTw;
    
    static
    {
      GMTrace.i(18227975421952L, 135809);
      CREATOR = new Parcelable.Creator() {};
      GMTrace.o(18227975421952L, 135809);
    }
    
    public OperateWXDataTask()
    {
      GMTrace.i(18226499026944L, 135798);
      GMTrace.o(18226499026944L, 135798);
    }
    
    public OperateWXDataTask(Parcel paramParcel)
    {
      GMTrace.i(18226633244672L, 135799);
      f(paramParcel);
      GMTrace.o(18226633244672L, 135799);
    }
    
    private void a(String paramString1, String paramString2, String paramString3, int paramInt1, final int paramInt2, final a parama)
    {
      GMTrace.i(18227304333312L, 135804);
      h.xy().gQO.a(new com.tencent.mm.plugin.appbrand.g.b(paramString1, paramString2, paramString3, paramInt1, paramInt2, this.iQT, new com.tencent.mm.plugin.appbrand.g.b.a() {}), 0);
      GMTrace.o(18227304333312L, 135804);
    }
    
    public final void RS()
    {
      GMTrace.i(18226767462400L, 135800);
      a local1 = new a()
      {
        public final void a(LinkedList<ayd> paramAnonymousLinkedList, String paramAnonymousString1, String paramAnonymousString2)
        {
          GMTrace.i(18218580180992L, 135739);
          w.d("MicroMsg.JsApiOperateWXData", "onConfirm !");
          JsApiOperateWXData.OperateWXDataTask.this.iTi = paramAnonymousLinkedList.size();
          int i = 0;
          while (i < JsApiOperateWXData.OperateWXDataTask.this.iTi)
          {
            ayd localayd = (ayd)paramAnonymousLinkedList.get(i);
            try
            {
              JsApiOperateWXData.OperateWXDataTask.this.iTj.putByteArray(String.valueOf(i), localayd.toByteArray());
              i += 1;
            }
            catch (IOException paramAnonymousLinkedList)
            {
              w.e("MicroMsg.JsApiOperateWXData", "IOException %s", new Object[] { paramAnonymousLinkedList.getMessage() });
              w.printErrStackTrace("MicroMsg.JsApiOperateWXData", paramAnonymousLinkedList, "", new Object[0]);
              JsApiOperateWXData.OperateWXDataTask.this.iTe = "fail";
              JsApiOperateWXData.OperateWXDataTask.c(JsApiOperateWXData.OperateWXDataTask.this);
              GMTrace.o(18218580180992L, 135739);
              return;
            }
          }
          JsApiOperateWXData.OperateWXDataTask.this.iTg = paramAnonymousString1;
          JsApiOperateWXData.OperateWXDataTask.this.iTh = paramAnonymousString2;
          JsApiOperateWXData.OperateWXDataTask.this.iTe = "needConfirm";
          JsApiOperateWXData.OperateWXDataTask.d(JsApiOperateWXData.OperateWXDataTask.this);
          GMTrace.o(18218580180992L, 135739);
        }
        
        public final void ep(String paramAnonymousString)
        {
          GMTrace.i(18218445963264L, 135738);
          w.e("MicroMsg.JsApiOperateWXData", "onFailure !");
          JsApiOperateWXData.OperateWXDataTask.this.iTe = ("fail:" + paramAnonymousString);
          JsApiOperateWXData.OperateWXDataTask.b(JsApiOperateWXData.OperateWXDataTask.this);
          GMTrace.o(18218445963264L, 135738);
        }
        
        public final void pY(String paramAnonymousString)
        {
          GMTrace.i(18218311745536L, 135737);
          w.d("MicroMsg.JsApiOperateWXData", "onSuccess !");
          JsApiOperateWXData.OperateWXDataTask.this.iTv = paramAnonymousString;
          JsApiOperateWXData.OperateWXDataTask.this.iTe = "ok";
          JsApiOperateWXData.OperateWXDataTask.a(JsApiOperateWXData.OperateWXDataTask.this);
          GMTrace.o(18218311745536L, 135737);
        }
      };
      if (this.iTd.equals("operateWXData"))
      {
        a(this.appId, this.iTu, "", this.iQS, this.iTf, local1);
        GMTrace.o(18226767462400L, 135800);
        return;
      }
      if (this.iTd.equals("operateWXDataConfirm")) {
        a(this.appId, this.iTu, this.iTw, this.iQS, this.iTf, local1);
      }
      GMTrace.o(18226767462400L, 135800);
    }
    
    public final void VB()
    {
      GMTrace.i(18226901680128L, 135801);
      VE();
      if (!this.iQB.UF)
      {
        GMTrace.o(18226901680128L, 135801);
        return;
      }
      Object localObject;
      if (this.iTe.equals("ok"))
      {
        localObject = new HashMap();
        ((Map)localObject).put("data", this.iTv);
        this.iQB.v(this.iQC, this.iTa.d("ok", (Map)localObject));
        this.iTb.VU();
        GMTrace.o(18226901680128L, 135801);
        return;
      }
      if (this.iTe.contains("fail"))
      {
        this.iTa.a(this.iQB, this.iQC, this.iTe);
        this.iTb.VU();
        GMTrace.o(18226901680128L, 135801);
        return;
      }
      if (this.iTe.equals("needConfirm"))
      {
        localObject = new LinkedList();
        int i = 0;
        while (i < this.iTi)
        {
          byte[] arrayOfByte = this.iTj.getByteArray(String.valueOf(i));
          ayd localayd = new ayd();
          try
          {
            localayd.aC(arrayOfByte);
            ((LinkedList)localObject).add(localayd);
            i += 1;
          }
          catch (IOException localIOException)
          {
            w.e("MicroMsg.JsApiOperateWXData", "IOException %s", new Object[] { localIOException.getMessage() });
            w.printErrStackTrace("MicroMsg.JsApiOperateWXData", localIOException, "", new Object[0]);
            this.iTa.a(this.iQB, this.iQC, "fail");
            this.iTb.VU();
            GMTrace.o(18226901680128L, 135801);
            return;
          }
        }
        if (localIOException.size() > 0)
        {
          af.u(new Runnable()
          {
            public final void run()
            {
              GMTrace.i(18216969568256L, 135727);
              c.a local1 = new c.a()
              {
                public final void c(int paramAnonymous2Int, Bundle paramAnonymous2Bundle)
                {
                  GMTrace.i(18215090520064L, 135713);
                  w.i("MicroMsg.JsApiOperateWXData", "stev onRevMsg resultCode %d", new Object[] { Integer.valueOf(paramAnonymous2Int) });
                  switch (paramAnonymous2Int)
                  {
                  default: 
                    w.d("MicroMsg.JsApiOperateWXData", "press back button!");
                    JsApiOperateWXData.OperateWXDataTask.this.iTa.a(JsApiOperateWXData.OperateWXDataTask.this.iQB, JsApiOperateWXData.OperateWXDataTask.this.iQC, "fail auth cancel");
                    JsApiOperateWXData.OperateWXDataTask.this.iTb.VU();
                    GMTrace.o(18215090520064L, 135713);
                    return;
                  }
                  JsApiOperateWXData.OperateWXDataTask.this.iTd = "operateWXDataConfirm";
                  paramAnonymous2Bundle = (ArrayList)paramAnonymous2Bundle.getSerializable("key_scope");
                  if ((paramAnonymous2Bundle != null) && (paramAnonymous2Bundle.size() > 0)) {}
                  for (JsApiOperateWXData.OperateWXDataTask.this.iTw = ((String)paramAnonymous2Bundle.get(0));; JsApiOperateWXData.OperateWXDataTask.this.iTw = "")
                  {
                    JsApiOperateWXData.OperateWXDataTask.this.iTf = paramAnonymous2Int;
                    AppBrandMainProcessService.a(JsApiOperateWXData.OperateWXDataTask.this);
                    if (paramAnonymous2Int != 2) {
                      break;
                    }
                    JsApiOperateWXData.OperateWXDataTask.this.iTa.a(JsApiOperateWXData.OperateWXDataTask.this.iQB, JsApiOperateWXData.OperateWXDataTask.this.iQC, "fail auth deny");
                    JsApiOperateWXData.OperateWXDataTask.this.iTb.VU();
                    GMTrace.o(18215090520064L, 135713);
                    return;
                  }
                }
              };
              JsApiOperateWXData.OperateWXDataTask.this.iQB.irS.a(new c(JsApiOperateWXData.OperateWXDataTask.this.iTa.a(JsApiOperateWXData.OperateWXDataTask.this.iQB), localIOException, JsApiOperateWXData.OperateWXDataTask.this.iTg, JsApiOperateWXData.OperateWXDataTask.this.iTh, local1));
              GMTrace.o(18216969568256L, 135727);
            }
          });
          GMTrace.o(18226901680128L, 135801);
          return;
        }
        this.iTa.a(this.iQB, this.iQC, "fail");
        this.iTb.VU();
      }
      GMTrace.o(18226901680128L, 135801);
    }
    
    public final void f(Parcel paramParcel)
    {
      GMTrace.i(18227035897856L, 135802);
      this.appId = paramParcel.readString();
      this.iTe = paramParcel.readString();
      this.iTg = paramParcel.readString();
      this.iTh = paramParcel.readString();
      this.iTu = paramParcel.readString();
      this.iTv = paramParcel.readString();
      this.iQC = paramParcel.readInt();
      this.iTd = paramParcel.readString();
      this.iTw = paramParcel.readString();
      this.iTi = paramParcel.readInt();
      this.iTj = paramParcel.readBundle(JsApiOperateWXData.class.getClassLoader());
      this.iQS = paramParcel.readInt();
      this.iTf = paramParcel.readInt();
      this.iQT = paramParcel.readInt();
      GMTrace.o(18227035897856L, 135802);
    }
    
    public void writeToParcel(Parcel paramParcel, int paramInt)
    {
      GMTrace.i(18227170115584L, 135803);
      paramParcel.writeString(this.appId);
      paramParcel.writeString(this.iTe);
      paramParcel.writeString(this.iTg);
      paramParcel.writeString(this.iTh);
      paramParcel.writeString(this.iTu);
      paramParcel.writeString(this.iTv);
      paramParcel.writeInt(this.iQC);
      paramParcel.writeString(this.iTd);
      paramParcel.writeString(this.iTw);
      paramParcel.writeInt(this.iTi);
      paramParcel.writeBundle(this.iTj);
      paramParcel.writeInt(this.iQS);
      paramParcel.writeInt(this.iTf);
      paramParcel.writeInt(this.iQT);
      GMTrace.o(18227170115584L, 135803);
    }
    
    public static abstract interface a
    {
      public abstract void a(LinkedList<ayd> paramLinkedList, String paramString1, String paramString2);
      
      public abstract void ep(String paramString);
      
      public abstract void pY(String paramString);
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/auth/JsApiOperateWXData.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */