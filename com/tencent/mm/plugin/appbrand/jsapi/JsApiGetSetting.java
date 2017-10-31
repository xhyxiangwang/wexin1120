package com.tencent.mm.plugin.appbrand.jsapi;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ac.b;
import com.tencent.mm.ac.b.a;
import com.tencent.mm.ac.b.c;
import com.tencent.mm.ac.u;
import com.tencent.mm.ac.u.a;
import com.tencent.mm.plugin.appbrand.ipc.AppBrandMainProcessService;
import com.tencent.mm.plugin.appbrand.ipc.MainProcessTask;
import com.tencent.mm.plugin.appbrand.o.d;
import com.tencent.mm.protocal.c.bkw;
import com.tencent.mm.protocal.c.bsd;
import com.tencent.mm.protocal.c.bse;
import com.tencent.mm.protocal.c.dq;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.util.Iterator;
import java.util.LinkedList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class JsApiGetSetting
  extends a
{
  public static final int CTRL_INDEX = 236;
  public static final String NAME = "getSetting";
  
  public JsApiGetSetting()
  {
    GMTrace.i(15477719957504L, 115318);
    GMTrace.o(15477719957504L, 115318);
  }
  
  public final void a(com.tencent.mm.plugin.appbrand.k paramk, JSONObject paramJSONObject, int paramInt)
  {
    GMTrace.i(15477854175232L, 115319);
    paramJSONObject = new GetSettingTask();
    paramJSONObject.iqL = paramk.iqL;
    paramJSONObject.iPM = paramInt;
    paramJSONObject.iqQ = paramk;
    d.aQ(paramJSONObject);
    AppBrandMainProcessService.a(paramJSONObject);
    GMTrace.o(15477854175232L, 115319);
  }
  
  private static final class GetSettingTask
    extends MainProcessTask
  {
    public static final Parcelable.Creator<GetSettingTask> CREATOR;
    public int iPM;
    public String iQk;
    public String iqL;
    public com.tencent.mm.plugin.appbrand.k iqQ;
    
    static
    {
      GMTrace.i(15489799553024L, 115408);
      CREATOR = new Parcelable.Creator() {};
      GMTrace.o(15489799553024L, 115408);
    }
    
    public GetSettingTask()
    {
      GMTrace.i(15488725811200L, 115400);
      GMTrace.o(15488725811200L, 115400);
    }
    
    public GetSettingTask(Parcel paramParcel)
    {
      GMTrace.i(15488860028928L, 115401);
      f(paramParcel);
      GMTrace.o(15488860028928L, 115401);
    }
    
    public final void RS()
    {
      GMTrace.i(15489128464384L, 115403);
      b.a locala = new b.a();
      locala.hlX = new bsd();
      locala.hlY = new bse();
      locala.uri = "/cgi-bin/mmbiz-bin/wxaapp_getauthinfo";
      locala.hlW = 1196;
      locala.hlZ = 0;
      locala.hma = 0;
      bsd localbsd = new bsd();
      localbsd.appId = this.iqL;
      locala.hlX = localbsd;
      u.a(locala.DA(), new u.a()
      {
        public final int a(int paramAnonymousInt1, int paramAnonymousInt2, String paramAnonymousString, b paramAnonymousb, com.tencent.mm.ac.k paramAnonymousk)
        {
          GMTrace.i(15484565061632L, 115369);
          w.d("MicroMsg.JsApiGetSetting", "WxaAppGetAuthInfoReq errType = %d, errCode = %d ,errMsg = %s", new Object[] { Integer.valueOf(paramAnonymousInt1), Integer.valueOf(paramAnonymousInt2), paramAnonymousString });
          if ((paramAnonymousInt1 != 0) || (paramAnonymousInt2 != 0))
          {
            JsApiGetSetting.GetSettingTask.a(JsApiGetSetting.GetSettingTask.this);
            GMTrace.o(15484565061632L, 115369);
            return 0;
          }
          paramAnonymousString = (bse)paramAnonymousb.hlV.hmc;
          if (paramAnonymousString == null) {
            w.e("MicroMsg.JsApiGetSetting", "WxaAppGetAuthInfoReq failed, response is null!");
          }
          for (;;)
          {
            JsApiGetSetting.GetSettingTask.b(JsApiGetSetting.GetSettingTask.this);
            GMTrace.o(15484565061632L, 115369);
            return 0;
            paramAnonymousInt1 = paramAnonymousString.uGY.errCode;
            paramAnonymousb = paramAnonymousString.uGY.ftU;
            if (paramAnonymousInt1 == 0)
            {
              paramAnonymousb = paramAnonymousString.uGZ;
              paramAnonymousString = new JSONArray();
              paramAnonymousb = paramAnonymousb.iterator();
              while (paramAnonymousb.hasNext())
              {
                paramAnonymousk = (dq)paramAnonymousb.next();
                JSONObject localJSONObject = new JSONObject();
                try
                {
                  localJSONObject.put("scope", paramAnonymousk.scope);
                  localJSONObject.put("state", paramAnonymousk.state);
                  localJSONObject.put("desc", paramAnonymousk.txn);
                  paramAnonymousString.put(localJSONObject);
                }
                catch (Exception paramAnonymousk)
                {
                  w.e("MicroMsg.JsApiGetSetting", "parse json failed : %s", new Object[] { paramAnonymousk.getMessage() });
                }
              }
              JsApiGetSetting.GetSettingTask.this.iQk = paramAnonymousString.toString();
              w.d("MicroMsg.JsApiGetSetting", "authInfo %s", new Object[] { paramAnonymousString });
            }
            else
            {
              w.e("MicroMsg.JsApiGetSetting", "WxaAppGetAuthInfoReq error %s", new Object[] { paramAnonymousb });
            }
          }
        }
      }, true);
      GMTrace.o(15489128464384L, 115403);
    }
    
    public final void VB()
    {
      GMTrace.i(15488994246656L, 115402);
      w.i("MicroMsg.JsApiGetSetting", "runInClientProcess");
      JSONObject localJSONObject = new JSONObject();
      try
      {
        localJSONObject.put("errMsg", "getSetting:ok");
        localJSONObject.put("authSetting", new JSONArray(bg.mY(this.iQk)));
        this.iqQ.v(this.iPM, localJSONObject.toString());
        d.aR(this);
        GMTrace.o(15488994246656L, 115402);
        return;
      }
      catch (JSONException localJSONException)
      {
        for (;;)
        {
          w.e("MicroMsg.JsApiGetSetting", "set json error!");
        }
      }
    }
    
    public final void f(Parcel paramParcel)
    {
      GMTrace.i(15489262682112L, 115404);
      this.iQk = paramParcel.readString();
      this.iqL = paramParcel.readString();
      this.iPM = paramParcel.readInt();
      GMTrace.o(15489262682112L, 115404);
    }
    
    public final void writeToParcel(Parcel paramParcel, int paramInt)
    {
      GMTrace.i(15489396899840L, 115405);
      paramParcel.writeString(this.iQk);
      paramParcel.writeString(this.iqL);
      paramParcel.writeInt(this.iPM);
      GMTrace.o(15489396899840L, 115405);
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/JsApiGetSetting.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */