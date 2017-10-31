package com.tencent.mm.plugin.appbrand.jsapi.audio;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.modelvoice.u;
import com.tencent.mm.plugin.appbrand.appstorage.AppBrandLocalMediaObject;
import com.tencent.mm.plugin.appbrand.appstorage.c;
import com.tencent.mm.plugin.appbrand.ipc.AppBrandMainProcessService;
import com.tencent.mm.plugin.appbrand.ipc.MainProcessTask;
import com.tencent.mm.plugin.appbrand.j;
import com.tencent.mm.plugin.appbrand.k;
import com.tencent.mm.plugin.appbrand.p.i;
import com.tencent.mm.plugin.appbrand.page.AppBrandPageView;
import com.tencent.mm.plugin.appbrand.page.AppBrandPageView.b;
import com.tencent.mm.plugin.appbrand.page.AppBrandPageView.c;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class JsApiStartRecordVoice
  extends com.tencent.mm.plugin.appbrand.jsapi.a
{
  public static final int CTRL_INDEX = 31;
  public static final String NAME = "startRecord";
  static volatile String iSM;
  private StartRecordVoice iSN;
  public AppBrandPageView iSn;
  private int iSo;
  
  static
  {
    GMTrace.i(19739803910144L, 147073);
    iSM = null;
    GMTrace.o(19739803910144L, 147073);
  }
  
  public JsApiStartRecordVoice()
  {
    GMTrace.i(19739401256960L, 147070);
    GMTrace.o(19739401256960L, 147070);
  }
  
  public final void a(final k paramk, final JSONObject paramJSONObject, final int paramInt)
  {
    int j = 600;
    GMTrace.i(19739535474688L, 147071);
    com.tencent.mm.plugin.appbrand.a.a(paramk.iqL, new android.support.v4.app.a.a()
    {
      public final void onRequestPermissionsResult(int paramAnonymousInt, String[] paramAnonymousArrayOfString, int[] paramAnonymousArrayOfInt)
      {
        GMTrace.i(19724771524608L, 146961);
        if (paramAnonymousInt != 116)
        {
          GMTrace.o(19724771524608L, 146961);
          return;
        }
        if (paramAnonymousArrayOfInt[0] == 0)
        {
          JsApiStartRecordVoice.this.a(paramk, paramJSONObject, paramInt);
          GMTrace.o(19724771524608L, 146961);
          return;
        }
        paramk.v(paramInt, JsApiStartRecordVoice.this.d("fail:system permission denied", null));
        GMTrace.o(19724771524608L, 146961);
      }
    });
    MMActivity localMMActivity = a(paramk);
    int m;
    if (localMMActivity == null)
    {
      paramk.v(paramInt, d("fail", null));
      m = 0;
    }
    while (m == 0)
    {
      paramk.v(paramInt, d("fail", null));
      GMTrace.o(19739535474688L, 147071);
      return;
      boolean bool = com.tencent.mm.pluginsdk.h.a.a(localMMActivity, "android.permission.RECORD_AUDIO", 116, "", "");
      m = bool;
      if (bool)
      {
        com.tencent.mm.plugin.appbrand.a.nw(paramk.iqL);
        m = bool;
      }
    }
    this.iSn = b(paramk);
    if (this.iSn == null)
    {
      paramk.v(paramInt, d("fail", null));
      GMTrace.o(19739535474688L, 147071);
      return;
    }
    int k = paramJSONObject.optInt("duration", 60);
    int i = k;
    if (k <= 0)
    {
      w.e("MicroMsg.JsApiStartRecordVoice", "duration is invalid, less than 0");
      i = 60;
    }
    if (i > 600)
    {
      w.e("MicroMsg.JsApiStartRecordVoice", "duration is invalid, more than %d", new Object[] { Integer.valueOf(600) });
      i = j;
    }
    for (;;)
    {
      this.iSn.a(new AppBrandPageView.b()
      {
        public final void VS()
        {
          GMTrace.i(19719939686400L, 146925);
          JsApiStopRecordVoice.d(paramk);
          JsApiStartRecordVoice.this.iSn.b(this);
          GMTrace.o(19719939686400L, 146925);
        }
      });
      this.iSn.a(new AppBrandPageView.c()
      {
        public final void onDestroy()
        {
          GMTrace.i(19740072345600L, 147075);
          JsApiStopRecordVoice.d(paramk);
          JsApiStartRecordVoice.this.iSn.b(this);
          GMTrace.o(19740072345600L, 147075);
        }
      });
      this.iSN = new StartRecordVoice(this, paramk, i, paramInt);
      iSM = this.iSN.filePath;
      AppBrandMainProcessService.a(this.iSN);
      cd(true);
      GMTrace.o(19739535474688L, 147071);
      return;
    }
  }
  
  public final void cd(final boolean paramBoolean)
  {
    GMTrace.i(19739669692416L, 147072);
    if (this.iSn == null)
    {
      GMTrace.o(19739669692416L, 147072);
      return;
    }
    if (!af.isMainThread())
    {
      af.u(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(19743562006528L, 147101);
          JsApiStartRecordVoice.this.cd(paramBoolean);
          GMTrace.o(19743562006528L, 147101);
        }
      });
      GMTrace.o(19739669692416L, 147072);
      return;
    }
    if (paramBoolean)
    {
      this.iSo = com.tencent.mm.plugin.appbrand.page.a.e(this.iSn.irS).iY(p.i.ixt);
      j.nR(this.iSn.iqL).irR = this.iSo;
      GMTrace.o(19739669692416L, 147072);
      return;
    }
    com.tencent.mm.plugin.appbrand.page.a.e(this.iSn.irS).iZ(this.iSo);
    GMTrace.o(19739669692416L, 147072);
  }
  
  private static class StartRecordVoice
    extends MainProcessTask
  {
    public static final Parcelable.Creator<StartRecordVoice> CREATOR;
    private String appId;
    public int duration;
    public String filePath;
    private k iQB;
    private int iQC;
    private JsApiStartRecordVoice iSP;
    public boolean iSQ;
    public int result;
    
    static
    {
      GMTrace.i(19719402815488L, 146921);
      CREATOR = new Parcelable.Creator() {};
      GMTrace.o(19719402815488L, 146921);
    }
    
    StartRecordVoice(Parcel paramParcel)
    {
      GMTrace.i(19718329073664L, 146913);
      this.iSQ = false;
      f(paramParcel);
      GMTrace.o(19718329073664L, 146913);
    }
    
    StartRecordVoice(JsApiStartRecordVoice paramJsApiStartRecordVoice, k paramk, int paramInt1, int paramInt2)
    {
      GMTrace.i(19718194855936L, 146912);
      this.iSQ = false;
      this.iSP = paramJsApiStartRecordVoice;
      this.iQB = paramk;
      this.duration = paramInt1;
      this.iQC = paramInt2;
      this.appId = paramk.iqL;
      paramJsApiStartRecordVoice = u.mH(this.appId);
      this.filePath = c.aD(this.appId, paramJsApiStartRecordVoice);
      GMTrace.o(19718194855936L, 146912);
    }
    
    public final void RS()
    {
      GMTrace.i(19718463291392L, 146914);
      com.tencent.mm.plugin.appbrand.o.d.xC().C(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(19712691929088L, 146871);
          JsApiStartRecordVoice.StartRecordVoice.this.iSQ = com.tencent.mm.plugin.appbrand.media.a.a(JsApiStartRecordVoice.StartRecordVoice.this.filePath, new com.tencent.mm.plugin.appbrand.media.a.a()
          {
            public final void iy(int paramAnonymous2Int)
            {
              GMTrace.i(19714570977280L, 146885);
              JsApiStartRecordVoice.StartRecordVoice.this.result = paramAnonymous2Int;
              JsApiStartRecordVoice.StartRecordVoice.a(JsApiStartRecordVoice.StartRecordVoice.this);
              GMTrace.o(19714570977280L, 146885);
            }
          }, JsApiStartRecordVoice.StartRecordVoice.this.duration * 1000);
          if (!JsApiStartRecordVoice.StartRecordVoice.this.iSQ) {
            JsApiStartRecordVoice.StartRecordVoice.b(JsApiStartRecordVoice.StartRecordVoice.this);
          }
          GMTrace.o(19712691929088L, 146871);
        }
      });
      GMTrace.o(19718463291392L, 146914);
    }
    
    public final void VB()
    {
      GMTrace.i(19718597509120L, 146915);
      if (this.result == -1)
      {
        w.e("MicroMsg.JsApiStartRecordVoice", "fail:record_error");
        this.iQB.v(this.iQC, this.iSP.d("fail:record_error", null));
        GMTrace.o(19718597509120L, 146915);
        return;
      }
      if (this.iSQ)
      {
        AppBrandLocalMediaObject localAppBrandLocalMediaObject = c.b(this.iQB.iqL, this.filePath, "silk", true);
        if (localAppBrandLocalMediaObject != null)
        {
          HashMap localHashMap = new HashMap(1);
          localHashMap.put("tempFilePath", localAppBrandLocalMediaObject.fAx);
          this.iQB.v(this.iQC, this.iSP.d("ok", localHashMap));
        }
      }
      for (;;)
      {
        w.i("MicroMsg.JsApiStartRecordVoice", "runInClientProcess, appId = %s, startRecordOk = %b", new Object[] { this.appId, Boolean.valueOf(this.iSQ) });
        this.iSP.cd(false);
        GMTrace.o(19718597509120L, 146915);
        return;
        this.iQB.v(this.iQC, this.iSP.d("fail", null));
      }
    }
    
    public int describeContents()
    {
      GMTrace.i(19718865944576L, 146917);
      GMTrace.o(19718865944576L, 146917);
      return 0;
    }
    
    public final void f(Parcel paramParcel)
    {
      GMTrace.i(19718731726848L, 146916);
      this.iQC = paramParcel.readInt();
      this.appId = paramParcel.readString();
      this.filePath = paramParcel.readString();
      if (paramParcel.readByte() != 0) {}
      for (boolean bool = true;; bool = false)
      {
        this.iSQ = bool;
        this.duration = paramParcel.readInt();
        this.result = paramParcel.readInt();
        GMTrace.o(19718731726848L, 146916);
        return;
      }
    }
    
    public void writeToParcel(Parcel paramParcel, int paramInt)
    {
      GMTrace.i(19719000162304L, 146918);
      paramParcel.writeInt(this.iQC);
      paramParcel.writeString(this.appId);
      paramParcel.writeString(this.filePath);
      if (this.iSQ) {}
      for (byte b = 1;; b = 0)
      {
        paramParcel.writeByte(b);
        paramParcel.writeInt(this.duration);
        paramParcel.writeInt(this.result);
        GMTrace.o(19719000162304L, 146918);
        return;
      }
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/audio/JsApiStartRecordVoice.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */