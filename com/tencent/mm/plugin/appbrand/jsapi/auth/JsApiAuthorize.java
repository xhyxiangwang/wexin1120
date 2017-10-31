package com.tencent.mm.plugin.appbrand.jsapi.auth;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ac.n;
import com.tencent.mm.jsapi.a.a.a;
import com.tencent.mm.kernel.h;
import com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo;
import com.tencent.mm.plugin.appbrand.config.AppBrandSysConfig;
import com.tencent.mm.plugin.appbrand.f;
import com.tencent.mm.plugin.appbrand.ipc.AppBrandMainProcessService;
import com.tencent.mm.plugin.appbrand.ipc.MainProcessTask;
import com.tencent.mm.plugin.appbrand.k;
import com.tencent.mm.plugin.appbrand.report.AppBrandStatObject;
import com.tencent.mm.plugin.appbrand.widget.c;
import com.tencent.mm.plugin.appbrand.widget.c.a;
import com.tencent.mm.protocal.c.ayd;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.w;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import org.json.JSONArray;
import org.json.JSONObject;

public final class JsApiAuthorize
  extends b
{
  private static final int CTRL_INDEX = 54;
  private static final String NAME = "authorize";
  
  public JsApiAuthorize()
  {
    GMTrace.i(18222740930560L, 135770);
    GMTrace.o(18222740930560L, 135770);
  }
  
  public final void a(k paramk, JSONObject paramJSONObject, int paramInt, b.a parama)
  {
    GMTrace.i(18222875148288L, 135771);
    w.d("MicroMsg.JsApiAuthorize", "stev JsApiAuthorize!");
    AuthorizeTask localAuthorizeTask = new AuthorizeTask();
    localAuthorizeTask.appId = paramk.iqL;
    localAuthorizeTask.iTd = "authorize";
    Object localObject = com.tencent.mm.plugin.appbrand.a.nx(paramk.iqL);
    if (localObject != null) {
      localAuthorizeTask.iQS = ((AppBrandSysConfig)localObject).iJa.iCx;
    }
    localObject = com.tencent.mm.plugin.appbrand.a.ny(paramk.iqL);
    if (localObject != null) {
      localAuthorizeTask.iQT = ((AppBrandStatObject)localObject).scene;
    }
    paramJSONObject = paramJSONObject.toString();
    localAuthorizeTask.iTa = this;
    localAuthorizeTask.iQB = paramk;
    localAuthorizeTask.data = paramJSONObject;
    localAuthorizeTask.iQC = paramInt;
    localAuthorizeTask.iTb = parama;
    localAuthorizeTask.iTj = new Bundle();
    localAuthorizeTask.VD();
    AppBrandMainProcessService.a(localAuthorizeTask);
    GMTrace.o(18222875148288L, 135771);
  }
  
  private static class AuthorizeTask
    extends MainProcessTask
  {
    public static final Parcelable.Creator<AuthorizeTask> CREATOR;
    public String appId;
    public String data;
    k iQB;
    public int iQC;
    public int iQS;
    public int iQT;
    b iTa;
    b.a iTb;
    public Bundle iTc;
    public String iTd;
    public String iTe;
    public int iTf;
    public String iTg;
    public String iTh;
    public int iTi;
    public Bundle iTj;
    
    static
    {
      GMTrace.i(18214553649152L, 135709);
      CREATOR = new Parcelable.Creator() {};
      GMTrace.o(18214553649152L, 135709);
    }
    
    public AuthorizeTask()
    {
      GMTrace.i(18213077254144L, 135698);
      GMTrace.o(18213077254144L, 135698);
    }
    
    public AuthorizeTask(Parcel paramParcel)
    {
      GMTrace.i(18213211471872L, 135699);
      f(paramParcel);
      GMTrace.o(18213211471872L, 135699);
    }
    
    private void a(String paramString, Bundle paramBundle, int paramInt1, final int paramInt2, final a parama)
    {
      GMTrace.i(18213882560512L, 135704);
      Object localObject = (ArrayList)paramBundle.getSerializable("key_scope");
      paramBundle = new LinkedList();
      localObject = ((ArrayList)localObject).iterator();
      while (((Iterator)localObject).hasNext()) {
        paramBundle.add((String)((Iterator)localObject).next());
      }
      h.xy().gQO.a(new com.tencent.mm.jsapi.a.b(paramString, paramBundle, paramInt1, paramInt2, this.iQT, new com.tencent.mm.jsapi.a.b.a() {}), 0);
      GMTrace.o(18213882560512L, 135704);
    }
    
    public final void RS()
    {
      GMTrace.i(18213345689600L, 135700);
      a local1 = new a()
      {
        public final void VY()
        {
          GMTrace.i(18222472495104L, 135768);
          w.e("MicroMsg.JsApiAuthorize", "onFailure !");
          JsApiAuthorize.AuthorizeTask.this.iTe = "fail";
          JsApiAuthorize.AuthorizeTask.b(JsApiAuthorize.AuthorizeTask.this);
          GMTrace.o(18222472495104L, 135768);
        }
        
        public final void a(LinkedList<ayd> paramAnonymousLinkedList, String paramAnonymousString1, String paramAnonymousString2)
        {
          GMTrace.i(18222606712832L, 135769);
          w.d("MicroMsg.JsApiAuthorize", "onConfirm !");
          JsApiAuthorize.AuthorizeTask.this.iTi = paramAnonymousLinkedList.size();
          int i = 0;
          while (i < JsApiAuthorize.AuthorizeTask.this.iTi)
          {
            ayd localayd = (ayd)paramAnonymousLinkedList.get(i);
            try
            {
              JsApiAuthorize.AuthorizeTask.this.iTj.putByteArray(String.valueOf(i), localayd.toByteArray());
              i += 1;
            }
            catch (IOException paramAnonymousLinkedList)
            {
              w.e("MicroMsg.JsApiAuthorize", "IOException %s", new Object[] { paramAnonymousLinkedList.getMessage() });
              w.printErrStackTrace("MicroMsg.JsApiAuthorize", paramAnonymousLinkedList, "", new Object[0]);
              JsApiAuthorize.AuthorizeTask.this.iTe = "fail";
              JsApiAuthorize.AuthorizeTask.c(JsApiAuthorize.AuthorizeTask.this);
              GMTrace.o(18222606712832L, 135769);
              return;
            }
          }
          JsApiAuthorize.AuthorizeTask.this.iTg = paramAnonymousString1;
          JsApiAuthorize.AuthorizeTask.this.iTh = paramAnonymousString2;
          JsApiAuthorize.AuthorizeTask.this.iTe = "needConfirm";
          JsApiAuthorize.AuthorizeTask.d(JsApiAuthorize.AuthorizeTask.this);
          GMTrace.o(18222606712832L, 135769);
        }
        
        public final void onSuccess()
        {
          GMTrace.i(18222338277376L, 135767);
          w.d("MicroMsg.JsApiAuthorize", "onSuccess !");
          JsApiAuthorize.AuthorizeTask.this.iTe = "ok";
          JsApiAuthorize.AuthorizeTask.a(JsApiAuthorize.AuthorizeTask.this);
          GMTrace.o(18222338277376L, 135767);
        }
      };
      if (this.iTd.equals("authorize"))
      {
        Object localObject;
        LinkedList localLinkedList;
        try
        {
          localObject = new JSONArray(new JSONObject(this.data).optString("scope"));
          localLinkedList = new LinkedList();
          i = 0;
          while (i < ((JSONArray)localObject).length())
          {
            localLinkedList.add(((JSONArray)localObject).optString(i));
            i += 1;
          }
          localObject = this.appId;
        }
        catch (Exception localException)
        {
          w.e("MicroMsg.JsApiAuthorize", "Exception %s", new Object[] { localException.getMessage() });
          this.iTe = "fail";
          VC();
          GMTrace.o(18213345689600L, 135700);
          return;
        }
        int i = this.iQS;
        h.xy().gQO.a(new com.tencent.mm.jsapi.a.a((String)localObject, localLinkedList, i, this.iQT, new a.a() {}), 0);
        GMTrace.o(18213345689600L, 135700);
        return;
      }
      if (this.iTd.equals("authorizeConfirm")) {
        a(this.appId, this.iTc, this.iQS, this.iTf, localException);
      }
      GMTrace.o(18213345689600L, 135700);
    }
    
    public final void VB()
    {
      GMTrace.i(18213479907328L, 135701);
      VE();
      if (!this.iQB.UF)
      {
        GMTrace.o(18213479907328L, 135701);
        return;
      }
      if (this.iTe.equals("ok"))
      {
        this.iTa.a(this.iQB, this.iQC, "ok");
        this.iTb.VU();
        GMTrace.o(18213479907328L, 135701);
        return;
      }
      if (this.iTe.equals("fail"))
      {
        this.iTa.a(this.iQB, this.iQC, "fail");
        this.iTb.VU();
        GMTrace.o(18213479907328L, 135701);
        return;
      }
      if (this.iTe.equals("needConfirm"))
      {
        LinkedList localLinkedList = new LinkedList();
        int i = 0;
        while (i < this.iTi)
        {
          byte[] arrayOfByte = this.iTj.getByteArray(String.valueOf(i));
          ayd localayd = new ayd();
          try
          {
            localayd.aC(arrayOfByte);
            localLinkedList.add(localayd);
            i += 1;
          }
          catch (IOException localIOException)
          {
            w.e("MicroMsg.JsApiAuthorize", "IOException %s", new Object[] { localIOException.getMessage() });
            w.printErrStackTrace("MicroMsg.JsApiAuthorize", localIOException, "", new Object[0]);
            this.iTa.a(this.iQB, this.iQC, "fail");
            this.iTb.VU();
            GMTrace.o(18213479907328L, 135701);
            return;
          }
        }
        if (localIOException.size() > 0)
        {
          af.u(new Runnable()
          {
            public final void run()
            {
              GMTrace.i(18214822084608L, 135711);
              c.a local1 = new c.a()
              {
                public final void c(int paramAnonymous2Int, Bundle paramAnonymous2Bundle)
                {
                  GMTrace.i(18221667188736L, 135762);
                  w.i("MicroMsg.JsApiAuthorize", "stev onRevMsg resultCode %d", new Object[] { Integer.valueOf(paramAnonymous2Int) });
                  switch (paramAnonymous2Int)
                  {
                  default: 
                    w.d("MicroMsg.JsApiAuthorize", "press back button!");
                    JsApiAuthorize.AuthorizeTask.this.iTa.a(JsApiAuthorize.AuthorizeTask.this.iQB, JsApiAuthorize.AuthorizeTask.this.iQC, "fail auth cancel");
                    JsApiAuthorize.AuthorizeTask.this.iTb.VU();
                  }
                  do
                  {
                    GMTrace.o(18221667188736L, 135762);
                    return;
                    JsApiAuthorize.AuthorizeTask.this.iTd = "authorizeConfirm";
                    JsApiAuthorize.AuthorizeTask.this.iTc = paramAnonymous2Bundle;
                    JsApiAuthorize.AuthorizeTask.this.iTf = paramAnonymous2Int;
                    AppBrandMainProcessService.a(JsApiAuthorize.AuthorizeTask.this);
                  } while (paramAnonymous2Int != 2);
                  JsApiAuthorize.AuthorizeTask.this.iTa.a(JsApiAuthorize.AuthorizeTask.this.iQB, JsApiAuthorize.AuthorizeTask.this.iQC, "fail auth deny");
                  JsApiAuthorize.AuthorizeTask.this.iTb.VU();
                  GMTrace.o(18221667188736L, 135762);
                }
              };
              JsApiAuthorize.AuthorizeTask.this.iQB.irS.a(new c(JsApiAuthorize.AuthorizeTask.this.iTa.a(JsApiAuthorize.AuthorizeTask.this.iQB), localIOException, JsApiAuthorize.AuthorizeTask.this.iTg, JsApiAuthorize.AuthorizeTask.this.iTh, local1));
              GMTrace.o(18214822084608L, 135711);
            }
          });
          GMTrace.o(18213479907328L, 135701);
          return;
        }
        this.iTa.a(this.iQB, this.iQC, "fail");
        this.iTb.VU();
      }
      GMTrace.o(18213479907328L, 135701);
    }
    
    public final void f(Parcel paramParcel)
    {
      GMTrace.i(18213614125056L, 135702);
      this.data = paramParcel.readString();
      this.iQC = paramParcel.readInt();
      this.appId = paramParcel.readString();
      this.iTe = paramParcel.readString();
      this.iTd = paramParcel.readString();
      this.iTg = paramParcel.readString();
      this.iTh = paramParcel.readString();
      this.iTi = paramParcel.readInt();
      this.iTj = paramParcel.readBundle(JsApiAuthorize.class.getClassLoader());
      this.iTc = paramParcel.readBundle(JsApiAuthorize.class.getClassLoader());
      this.iQS = paramParcel.readInt();
      this.iTf = paramParcel.readInt();
      this.iQT = paramParcel.readInt();
      GMTrace.o(18213614125056L, 135702);
    }
    
    public void writeToParcel(Parcel paramParcel, int paramInt)
    {
      GMTrace.i(18213748342784L, 135703);
      paramParcel.writeString(this.data);
      paramParcel.writeInt(this.iQC);
      paramParcel.writeString(this.appId);
      paramParcel.writeString(this.iTe);
      paramParcel.writeString(this.iTd);
      paramParcel.writeString(this.iTg);
      paramParcel.writeString(this.iTh);
      paramParcel.writeInt(this.iTi);
      paramParcel.writeBundle(this.iTj);
      paramParcel.writeBundle(this.iTc);
      paramParcel.writeInt(this.iQS);
      paramParcel.writeInt(this.iTf);
      paramParcel.writeInt(this.iQT);
      GMTrace.o(18213748342784L, 135703);
    }
    
    public static abstract interface a
    {
      public abstract void VY();
      
      public abstract void a(LinkedList<ayd> paramLinkedList, String paramString1, String paramString2);
      
      public abstract void onSuccess();
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/auth/JsApiAuthorize.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */