package com.tencent.mm.plugin.appbrand.jsapi.audio;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.a.t;
import com.tencent.mm.g.a.t.a;
import com.tencent.mm.plugin.appbrand.d.b;
import com.tencent.mm.plugin.appbrand.d.c;
import com.tencent.mm.plugin.appbrand.ipc.AppBrandMainProcessService;
import com.tencent.mm.plugin.appbrand.ipc.MainProcessTask;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.platformtools.w;
import java.util.HashMap;
import java.util.Map;
import java.util.Vector;
import org.json.JSONObject;

public final class JsApiCreateAudioInstance
  extends com.tencent.mm.plugin.appbrand.jsapi.k
{
  public static final int CTRL_INDEX = 291;
  public static final String NAME = "createAudioInstance";
  public static Vector<String> iRB;
  
  static
  {
    GMTrace.i(19737924861952L, 147059);
    iRB = new Vector();
    GMTrace.o(19737924861952L, 147059);
  }
  
  public JsApiCreateAudioInstance()
  {
    GMTrace.i(19737656426496L, 147057);
    GMTrace.o(19737656426496L, 147057);
  }
  
  public final String a(final com.tencent.mm.plugin.appbrand.k paramk, final JSONObject paramJSONObject)
  {
    GMTrace.i(19737790644224L, 147058);
    paramJSONObject = paramk.iqL;
    w.i("MicroMsg.JsApiCreateAudioInstance", "createAudioInstance appId:%s", new Object[] { paramJSONObject });
    Object localObject = new CreateAudioTask(this, paramk);
    ((CreateAudioTask)localObject).fJg = 3;
    ((CreateAudioTask)localObject).appId = paramJSONObject;
    AppBrandMainProcessService.b((MainProcessTask)localObject);
    if (!((CreateAudioTask)localObject).iRE)
    {
      w.e("MicroMsg.JsApiCreateAudioInstance", "can not create audio instance");
      paramk = d("fail:" + ((CreateAudioTask)localObject).iRD, null);
      GMTrace.o(19737790644224L, 147058);
      return paramk;
    }
    String str = com.tencent.mm.aa.b.Dg();
    localObject = new HashMap();
    ((HashMap)localObject).put("audioId", str);
    w.i("MicroMsg.JsApiCreateAudioInstance", "createAudioInstance ok audioId:%s", new Object[] { str });
    CreateAudioTask localCreateAudioTask = new CreateAudioTask(this, paramk);
    localCreateAudioTask.ftO = str;
    localCreateAudioTask.fJg = 0;
    localCreateAudioTask.appId = paramJSONObject;
    AppBrandMainProcessService.a(localCreateAudioTask);
    paramk = new d.b()
    {
      public final void a(d.c paramAnonymousc)
      {
        GMTrace.i(19733227241472L, 147024);
        w.i("MicroMsg.JsApiCreateAudioInstance", "onPause, appId:%s", new Object[] { paramJSONObject });
        paramAnonymousc = new JsApiCreateAudioInstance.CreateAudioTask();
        paramAnonymousc.fJg = 1;
        paramAnonymousc.appId = paramJSONObject;
        paramAnonymousc.iQB = paramk;
        AppBrandMainProcessService.b(paramAnonymousc);
        GMTrace.o(19733227241472L, 147024);
      }
      
      public final void onDestroy()
      {
        GMTrace.i(19733361459200L, 147025);
        w.i("MicroMsg.JsApiCreateAudioInstance", "onDestroy, appId:%s", new Object[] { paramJSONObject });
        JsApiCreateAudioInstance.CreateAudioTask localCreateAudioTask = new JsApiCreateAudioInstance.CreateAudioTask();
        localCreateAudioTask.fJg = 2;
        localCreateAudioTask.appId = paramJSONObject;
        localCreateAudioTask.iQB = paramk;
        AppBrandMainProcessService.b(localCreateAudioTask);
        com.tencent.mm.plugin.appbrand.d.b(paramJSONObject, this);
        com.tencent.mm.plugin.appbrand.media.b.qP(paramJSONObject);
        JsApiCreateAudioInstance.iRB.remove(paramJSONObject);
        GMTrace.o(19733361459200L, 147025);
      }
    };
    if (!iRB.contains(paramJSONObject))
    {
      com.tencent.mm.plugin.appbrand.d.a(paramJSONObject, paramk);
      iRB.add(paramJSONObject);
    }
    paramk = d("ok", (Map)localObject);
    GMTrace.o(19737790644224L, 147058);
    return paramk;
  }
  
  private static class CreateAudioTask
    extends MainProcessTask
  {
    public static final Parcelable.Creator<CreateAudioTask> CREATOR;
    public String appId;
    public int fJg;
    public String ftO;
    private com.tencent.mm.plugin.appbrand.jsapi.d iQA;
    public com.tencent.mm.plugin.appbrand.k iQB;
    public String iRD;
    public boolean iRE;
    
    static
    {
      GMTrace.i(19739267039232L, 147069);
      CREATOR = new Parcelable.Creator() {};
      GMTrace.o(19739267039232L, 147069);
    }
    
    public CreateAudioTask()
    {
      GMTrace.i(19738461732864L, 147063);
      this.appId = "";
      this.ftO = "";
      this.iRD = "";
      this.fJg = 0;
      this.iRE = false;
      GMTrace.o(19738461732864L, 147063);
    }
    
    public CreateAudioTask(Parcel paramParcel)
    {
      GMTrace.i(19738595950592L, 147064);
      this.appId = "";
      this.ftO = "";
      this.iRD = "";
      this.fJg = 0;
      this.iRE = false;
      f(paramParcel);
      GMTrace.o(19738595950592L, 147064);
    }
    
    public CreateAudioTask(com.tencent.mm.plugin.appbrand.jsapi.d paramd, com.tencent.mm.plugin.appbrand.k paramk)
    {
      GMTrace.i(19738327515136L, 147062);
      this.appId = "";
      this.ftO = "";
      this.iRD = "";
      this.fJg = 0;
      this.iRE = false;
      this.iQA = paramd;
      this.iQB = paramk;
      GMTrace.o(19738327515136L, 147062);
    }
    
    public final void RS()
    {
      GMTrace.i(19738730168320L, 147065);
      w.i("MicroMsg.JsApiCreateAudioInstance", "runInMainProcess flag:%d, appId:%s", new Object[] { Integer.valueOf(this.fJg), this.appId });
      this.iRD = "";
      int i;
      String str;
      Object localObject;
      if (this.fJg == 0)
      {
        i = com.tencent.mm.aa.b.ht(this.appId);
        if (i < 5)
        {
          str = this.appId;
          localObject = this.ftO;
          w.i("MicroMsg.AudioPlayerHelper", "createAudioPlayer, appId:%s, audioId:%s", new Object[] { str, localObject });
          t localt = new t();
          localt.ftM.action = 10;
          localt.ftM.appId = str;
          localt.ftM.ftO = ((String)localObject);
          a.uLm.m(localt);
          this.ftO = localt.ftM.ftO;
          w.i("MicroMsg.JsApiCreateAudioInstance", "player audioId:%s", new Object[] { this.ftO });
          if (TextUtils.isEmpty(this.ftO)) {
            this.iRD = "fail to create audio instance";
          }
        }
      }
      for (;;)
      {
        VC();
        GMTrace.o(19738730168320L, 147065);
        return;
        w.e("MicroMsg.JsApiCreateAudioInstance", "create audio player count:%d  is exceed max count:%d", new Object[] { Integer.valueOf(i), Integer.valueOf(5) });
        this.iRD = "create audio player count is exceed max count";
        continue;
        if (this.fJg == 3)
        {
          i = com.tencent.mm.aa.b.ht(this.appId);
          w.i("MicroMsg.JsApiCreateAudioInstance", "getAudioPlayerCount appId:%s, count:%d", new Object[] { this.appId, Integer.valueOf(i) });
          if (i < 5)
          {
            this.iRE = true;
          }
          else
          {
            this.iRE = false;
            this.iRD = "create audio player count is exceed max count";
          }
        }
        else if (this.fJg == 1)
        {
          w.i("MicroMsg.JsApiCreateAudioInstance", "pauseAllAudioPlayer");
          str = this.appId;
          w.i("MicroMsg.AudioPlayerHelper", "pauseAllAudioPlayer appId:%s", new Object[] { str });
          localObject = new t();
          ((t)localObject).ftM.action = 12;
          ((t)localObject).ftM.appId = str;
          a.uLm.m((com.tencent.mm.sdk.b.b)localObject);
        }
        else if (this.fJg == 2)
        {
          w.i("MicroMsg.JsApiCreateAudioInstance", "stopAllAudioPlayer");
          str = this.appId;
          w.i("MicroMsg.AudioPlayerHelper", "destroyAllAudioPlayer appId:%s", new Object[] { str });
          localObject = new t();
          ((t)localObject).ftM.action = 9;
          ((t)localObject).ftM.appId = str;
          a.uLm.m((com.tencent.mm.sdk.b.b)localObject);
          com.tencent.mm.plugin.appbrand.media.b.qP(this.appId);
        }
      }
    }
    
    public final void VB()
    {
      GMTrace.i(19738864386048L, 147066);
      if (this.fJg == 0)
      {
        if (!TextUtils.isEmpty(this.ftO))
        {
          w.i("MicroMsg.JsApiCreateAudioInstance", "create player ok");
          GMTrace.o(19738864386048L, 147066);
          return;
        }
        w.e("MicroMsg.JsApiCreateAudioInstance", "create player failed");
        GMTrace.o(19738864386048L, 147066);
        return;
      }
      if (this.fJg == 3)
      {
        w.i("MicroMsg.JsApiCreateAudioInstance", "can create player? isCanCreate:%b", new Object[] { Boolean.valueOf(this.iRE) });
        GMTrace.o(19738864386048L, 147066);
        return;
      }
      w.e("MicroMsg.JsApiCreateAudioInstance", "destroy audio instance end");
      GMTrace.o(19738864386048L, 147066);
    }
    
    public final void f(Parcel paramParcel)
    {
      boolean bool = true;
      GMTrace.i(19738998603776L, 147067);
      this.fJg = paramParcel.readInt();
      this.appId = paramParcel.readString();
      this.ftO = paramParcel.readString();
      this.iRD = paramParcel.readString();
      if (paramParcel.readInt() == 1) {}
      for (;;)
      {
        this.iRE = bool;
        GMTrace.o(19738998603776L, 147067);
        return;
        bool = false;
      }
    }
    
    public void writeToParcel(Parcel paramParcel, int paramInt)
    {
      GMTrace.i(19739132821504L, 147068);
      paramParcel.writeInt(this.fJg);
      paramParcel.writeString(this.appId);
      paramParcel.writeString(this.ftO);
      paramParcel.writeString(this.iRD);
      if (this.iRE) {}
      for (paramInt = 1;; paramInt = 0)
      {
        paramParcel.writeInt(paramInt);
        GMTrace.o(19739132821504L, 147068);
        return;
      }
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/audio/JsApiCreateAudioInstance.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */