package com.tencent.mm.plugin.appbrand.jsapi.auth;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ac.n;
import com.tencent.mm.jsapi.a.d;
import com.tencent.mm.jsapi.a.d.a;
import com.tencent.mm.kernel.h;
import com.tencent.mm.plugin.appbrand.a;
import com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo;
import com.tencent.mm.plugin.appbrand.config.AppBrandSysConfig;
import com.tencent.mm.plugin.appbrand.f;
import com.tencent.mm.plugin.appbrand.ipc.AppBrandMainProcessService;
import com.tencent.mm.plugin.appbrand.ipc.MainProcessTask;
import com.tencent.mm.plugin.appbrand.k;
import com.tencent.mm.plugin.appbrand.report.AppBrandStatObject;
import com.tencent.mm.protocal.c.ayd;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.w;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import org.json.JSONObject;

public final class JsApiLogin
  extends b
{
  public static final int CTRL_INDEX = 52;
  public static final String NAME = "login";
  
  public JsApiLogin()
  {
    GMTrace.i(18221801406464L, 135763);
    GMTrace.o(18221801406464L, 135763);
  }
  
  public final void a(k paramk, JSONObject paramJSONObject, int paramInt, b.a parama)
  {
    GMTrace.i(18221935624192L, 135764);
    LoginTask localLoginTask = new LoginTask();
    localLoginTask.appId = paramk.iqL;
    localLoginTask.iTd = "login";
    Object localObject = a.nx(paramk.iqL);
    if (localObject != null) {
      localLoginTask.iQS = ((AppBrandSysConfig)localObject).iJa.iCx;
    }
    localObject = a.ny(paramk.iqL);
    if (localObject != null) {
      localLoginTask.iQT = ((AppBrandStatObject)localObject).scene;
    }
    paramJSONObject = paramJSONObject.toString();
    localLoginTask.iTa = this;
    localLoginTask.iQB = paramk;
    localLoginTask.data = paramJSONObject;
    localLoginTask.iQC = paramInt;
    localLoginTask.iTb = parama;
    localLoginTask.iTj = new Bundle();
    localLoginTask.VD();
    AppBrandMainProcessService.a(localLoginTask);
    GMTrace.o(18221935624192L, 135764);
  }
  
  private static class LoginTask
    extends MainProcessTask
  {
    public static final Parcelable.Creator<LoginTask> CREATOR;
    public String appId;
    public String code;
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
    public int iTp;
    public String iTq;
    
    static
    {
      GMTrace.i(18216701132800L, 135725);
      CREATOR = new Parcelable.Creator() {};
      GMTrace.o(18216701132800L, 135725);
    }
    
    public LoginTask()
    {
      GMTrace.i(18215224737792L, 135714);
      GMTrace.o(18215224737792L, 135714);
    }
    
    public LoginTask(Parcel paramParcel)
    {
      GMTrace.i(18215358955520L, 135715);
      f(paramParcel);
      GMTrace.o(18215358955520L, 135715);
    }
    
    private void a(String paramString1, Bundle paramBundle, int paramInt1, String paramString2, int paramInt2, final int paramInt3, final a parama)
    {
      GMTrace.i(18216030044160L, 135720);
      Object localObject = (ArrayList)paramBundle.getSerializable("key_scope");
      paramBundle = new LinkedList();
      localObject = ((ArrayList)localObject).iterator();
      while (((Iterator)localObject).hasNext()) {
        paramBundle.add((String)((Iterator)localObject).next());
      }
      h.xy().gQO.a(new d(paramString1, paramBundle, paramInt1, paramString2, paramInt2, paramInt3, this.iQT, new d.a() {}), 0);
      GMTrace.o(18216030044160L, 135720);
    }
    
    public final void RS()
    {
      GMTrace.i(18215493173248L, 135716);
      final a local1 = new a()
      {
        public final void VY()
        {
          GMTrace.i(18225022631936L, 135787);
          w.i("MicroMsg.JsApiLogin", "onFailure !");
          JsApiLogin.LoginTask.this.iTe = "fail";
          JsApiLogin.LoginTask.b(JsApiLogin.LoginTask.this);
          GMTrace.o(18225022631936L, 135787);
        }
        
        public final void a(LinkedList<ayd> paramAnonymousLinkedList, String paramAnonymousString1, String paramAnonymousString2, String paramAnonymousString3)
        {
          GMTrace.i(18225156849664L, 135788);
          w.i("MicroMsg.JsApiLogin", "onConfirm !");
          JsApiLogin.LoginTask.this.iTi = paramAnonymousLinkedList.size();
          int i = 0;
          while (i < JsApiLogin.LoginTask.this.iTi)
          {
            ayd localayd = (ayd)paramAnonymousLinkedList.get(i);
            try
            {
              JsApiLogin.LoginTask.this.iTj.putByteArray(String.valueOf(i), localayd.toByteArray());
              i += 1;
            }
            catch (IOException paramAnonymousLinkedList)
            {
              w.e("MicroMsg.JsApiLogin", "IOException %s", new Object[] { paramAnonymousLinkedList.getMessage() });
              w.printErrStackTrace("MicroMsg.JsApiLogin", paramAnonymousLinkedList, "", new Object[0]);
              JsApiLogin.LoginTask.this.iTe = "fail";
              JsApiLogin.LoginTask.c(JsApiLogin.LoginTask.this);
              GMTrace.o(18225156849664L, 135788);
              return;
            }
          }
          JsApiLogin.LoginTask.this.iTq = paramAnonymousString3;
          JsApiLogin.LoginTask.this.iTg = paramAnonymousString1;
          JsApiLogin.LoginTask.this.iTh = paramAnonymousString2;
          JsApiLogin.LoginTask.this.iTe = "needConfirm";
          JsApiLogin.LoginTask.d(JsApiLogin.LoginTask.this);
          GMTrace.o(18225156849664L, 135788);
        }
        
        public final void pY(String paramAnonymousString)
        {
          GMTrace.i(18224888414208L, 135786);
          w.i("MicroMsg.JsApiLogin", "onSuccess !");
          JsApiLogin.LoginTask.this.code = paramAnonymousString;
          JsApiLogin.LoginTask.this.iTe = "ok";
          JsApiLogin.LoginTask.a(JsApiLogin.LoginTask.this);
          GMTrace.o(18224888414208L, 135786);
        }
      };
      if (this.iTd.equals("login"))
      {
        w.i("MicroMsg.JsApiLogin", "start login");
        LinkedList localLinkedList = new LinkedList();
        this.iTp = 1;
        this.iTq = "";
        String str1 = this.appId;
        int i = this.iTp;
        String str2 = this.iTq;
        int j = this.iQS;
        h.xy().gQO.a(new com.tencent.mm.jsapi.a.c(str1, localLinkedList, i, "", str2, j, this.iQT, new com.tencent.mm.jsapi.a.c.a() {}), 0);
        GMTrace.o(18215493173248L, 135716);
        return;
      }
      if (this.iTd.equals("loginConfirm"))
      {
        w.i("MicroMsg.JsApiLogin", "start loginConfirm");
        a(this.appId, this.iTc, this.iTp, this.iTq, this.iQS, this.iTf, local1);
      }
      GMTrace.o(18215493173248L, 135716);
    }
    
    public final void VB()
    {
      GMTrace.i(18215627390976L, 135717);
      VE();
      if (!this.iQB.UF)
      {
        GMTrace.o(18215627390976L, 135717);
        return;
      }
      Object localObject;
      if (this.iTe.equals("ok"))
      {
        localObject = new HashMap();
        ((Map)localObject).put("code", this.code);
        localObject = this.iTa.d("ok", (Map)localObject);
        this.iQB.v(this.iQC, (String)localObject);
        this.iTb.VU();
        GMTrace.o(18215627390976L, 135717);
        return;
      }
      if (this.iTe.equals("fail"))
      {
        this.iTa.a(this.iQB, this.iQC, "fail");
        this.iTb.VU();
        GMTrace.o(18215627390976L, 135717);
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
            w.e("MicroMsg.JsApiLogin", "parse scope info error %s", new Object[] { localIOException.getMessage() });
            w.printErrStackTrace("MicroMsg.JsApiLogin", localIOException, "", new Object[0]);
            this.iTa.a(this.iQB, this.iQC, "fail");
            this.iTb.VU();
            GMTrace.o(18215627390976L, 135717);
            return;
          }
        }
        if (localIOException.size() > 0)
        {
          af.u(new Runnable()
          {
            public final void run()
            {
              GMTrace.i(18228243857408L, 135811);
              com.tencent.mm.plugin.appbrand.widget.c.a local1 = new com.tencent.mm.plugin.appbrand.widget.c.a()
              {
                public final void c(int paramAnonymous2Int, Bundle paramAnonymous2Bundle)
                {
                  GMTrace.i(18226096373760L, 135795);
                  w.i("MicroMsg.JsApiLogin", "stev onRevMsg resultCode %d", new Object[] { Integer.valueOf(paramAnonymous2Int) });
                  switch (paramAnonymous2Int)
                  {
                  default: 
                    w.d("MicroMsg.JsApiLogin", "press back button!");
                    JsApiLogin.LoginTask.this.iTa.a(JsApiLogin.LoginTask.this.iQB, JsApiLogin.LoginTask.this.iQC, "fail auth cancel");
                    JsApiLogin.LoginTask.this.iTb.VU();
                  }
                  do
                  {
                    GMTrace.o(18226096373760L, 135795);
                    return;
                    JsApiLogin.LoginTask.this.iTd = "loginConfirm";
                    JsApiLogin.LoginTask.this.iTc = paramAnonymous2Bundle;
                    JsApiLogin.LoginTask.this.iTf = paramAnonymous2Int;
                    AppBrandMainProcessService.a(JsApiLogin.LoginTask.this);
                  } while (paramAnonymous2Int != 2);
                  JsApiLogin.LoginTask.this.iTa.a(JsApiLogin.LoginTask.this.iQB, JsApiLogin.LoginTask.this.iQC, "fail auth deny");
                  JsApiLogin.LoginTask.this.iTb.VU();
                  GMTrace.o(18226096373760L, 135795);
                }
              };
              JsApiLogin.LoginTask.this.iQB.irS.a(new com.tencent.mm.plugin.appbrand.widget.c(JsApiLogin.LoginTask.this.iTa.a(JsApiLogin.LoginTask.this.iQB), localIOException, JsApiLogin.LoginTask.this.iTg, JsApiLogin.LoginTask.this.iTh, local1));
              GMTrace.o(18228243857408L, 135811);
            }
          });
          GMTrace.o(18215627390976L, 135717);
          return;
        }
        this.iTa.a(this.iQB, this.iQC, "fail");
        this.iTb.VU();
      }
      GMTrace.o(18215627390976L, 135717);
    }
    
    public final void f(Parcel paramParcel)
    {
      GMTrace.i(18215761608704L, 135718);
      this.data = paramParcel.readString();
      this.iQC = paramParcel.readInt();
      this.iTd = paramParcel.readString();
      this.appId = paramParcel.readString();
      this.code = paramParcel.readString();
      this.iTe = paramParcel.readString();
      this.iTq = paramParcel.readString();
      this.iTp = paramParcel.readInt();
      this.iTg = paramParcel.readString();
      this.iTh = paramParcel.readString();
      this.iTi = paramParcel.readInt();
      this.iTj = paramParcel.readBundle(JsApiLogin.class.getClassLoader());
      this.iTc = paramParcel.readBundle(JsApiLogin.class.getClassLoader());
      this.iQS = paramParcel.readInt();
      this.iTf = paramParcel.readInt();
      this.iQT = paramParcel.readInt();
      GMTrace.o(18215761608704L, 135718);
    }
    
    public void writeToParcel(Parcel paramParcel, int paramInt)
    {
      GMTrace.i(18215895826432L, 135719);
      paramParcel.writeString(this.data);
      paramParcel.writeInt(this.iQC);
      paramParcel.writeString(this.iTd);
      paramParcel.writeString(this.appId);
      paramParcel.writeString(this.code);
      paramParcel.writeString(this.iTe);
      paramParcel.writeString(this.iTq);
      paramParcel.writeInt(this.iTp);
      paramParcel.writeString(this.iTg);
      paramParcel.writeString(this.iTh);
      paramParcel.writeInt(this.iTi);
      paramParcel.writeBundle(this.iTj);
      paramParcel.writeBundle(this.iTc);
      paramParcel.writeInt(this.iQS);
      paramParcel.writeInt(this.iTf);
      paramParcel.writeInt(this.iQT);
      GMTrace.o(18215895826432L, 135719);
    }
    
    static abstract interface a
    {
      public abstract void VY();
      
      public abstract void a(LinkedList<ayd> paramLinkedList, String paramString1, String paramString2, String paramString3);
      
      public abstract void pY(String paramString);
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/auth/JsApiLogin.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */