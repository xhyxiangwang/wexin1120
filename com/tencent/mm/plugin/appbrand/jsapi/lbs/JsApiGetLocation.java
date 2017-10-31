package com.tencent.mm.plugin.appbrand.jsapi.lbs;

import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.view.View;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.kernel.h;
import com.tencent.mm.modelgeo.a.a;
import com.tencent.mm.modelgeo.c;
import com.tencent.mm.plugin.appbrand.ipc.AppBrandMainProcessService;
import com.tencent.mm.plugin.appbrand.ipc.MainProcessTask;
import com.tencent.mm.plugin.appbrand.k;
import com.tencent.mm.plugin.appbrand.p.i;
import com.tencent.mm.plugin.appbrand.page.AppBrandPageView;
import com.tencent.mm.plugin.appbrand.page.AppBrandPageView.b;
import com.tencent.mm.sdk.a.b;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import org.json.JSONObject;

public final class JsApiGetLocation
  extends com.tencent.mm.plugin.appbrand.jsapi.a
{
  public static final int CTRL_INDEX = 37;
  public static final String NAME = "getLocation";
  private static final HashSet<String> iWH;
  
  static
  {
    GMTrace.i(19710007574528L, 146851);
    HashSet localHashSet = new HashSet();
    iWH = localHashSet;
    localHashSet.add("gcj02");
    iWH.add("wgs84");
    GMTrace.o(19710007574528L, 146851);
  }
  
  public JsApiGetLocation()
  {
    GMTrace.i(19709739139072L, 146849);
    GMTrace.o(19709739139072L, 146849);
  }
  
  public final void a(k paramk, JSONObject paramJSONObject, int paramInt)
  {
    GMTrace.i(19709873356800L, 146850);
    Object localObject2 = paramJSONObject.optString("type", "wgs84");
    w.v("MicroMsg.JsApiGetLocation", "doGeoLocation, geoType = %s", new Object[] { localObject2 });
    Object localObject1 = localObject2;
    if (bg.mZ((String)localObject2)) {
      localObject1 = "wgs84";
    }
    if ((!bg.mZ((String)localObject1)) && (!iWH.contains(localObject1)))
    {
      w.e("MicroMsg.JsApiGetLocation", "doGeoLocation fail, unsupported type = %s", new Object[] { localObject1 });
      paramk.v(paramInt, d("fail:unsupported type", null));
      GMTrace.o(19709873356800L, 146850);
      return;
    }
    localObject2 = b(paramk);
    if (localObject2 == null)
    {
      paramk.v(paramInt, d("fail", null));
      GMTrace.o(19709873356800L, 146850);
      return;
    }
    LocationTask localLocationTask = new LocationTask();
    localLocationTask.iqQ = paramk;
    localLocationTask.iPM = paramInt;
    localLocationTask.iWJ = this;
    localLocationTask.iWK = ((String)localObject1);
    localLocationTask.iWI = new WeakReference(localObject2);
    localLocationTask.iWL = paramJSONObject.optBoolean("altitude", false);
    com.tencent.mm.plugin.appbrand.o.d.aQ(localLocationTask);
    if ((localLocationTask.iWI != null) && (localLocationTask.iWI.get() != null))
    {
      ((AppBrandPageView)localLocationTask.iWI.get()).a(localLocationTask);
      af.u(new JsApiGetLocation.LocationTask.1(localLocationTask));
    }
    localLocationTask.iWU = 1;
    AppBrandMainProcessService.a(localLocationTask);
    GMTrace.o(19709873356800L, 146850);
  }
  
  private static final class LocationTask
    extends MainProcessTask
    implements AppBrandPageView.b
  {
    public static final Parcelable.Creator<LocationTask> CREATOR;
    public double aEP;
    public double aEQ;
    public double aES;
    public c gBR;
    public int iPM;
    int iSo;
    public WeakReference<AppBrandPageView> iWI;
    public JsApiGetLocation iWJ;
    public String iWK;
    public boolean iWL;
    public boolean iWM;
    public float iWN;
    public float iWO;
    public double iWP;
    public double iWQ;
    public int iWR;
    public volatile a.a iWS;
    private ae iWT;
    int iWU;
    long iWV;
    public k iqQ;
    
    static
    {
      GMTrace.i(19706786349056L, 146827);
      CREATOR = new Parcelable.Creator() {};
      GMTrace.o(19706786349056L, 146827);
    }
    
    LocationTask()
    {
      GMTrace.i(19706115260416L, 146822);
      this.gBR = null;
      this.iWS = null;
      this.iWU = 0;
      this.iWV = 0L;
      this.iSo = 0;
      GMTrace.o(19706115260416L, 146822);
    }
    
    LocationTask(Parcel paramParcel)
    {
      GMTrace.i(19706249478144L, 146823);
      this.gBR = null;
      this.iWS = null;
      this.iWU = 0;
      this.iWV = 0L;
      this.iSo = 0;
      f(paramParcel);
      GMTrace.o(19706249478144L, 146823);
    }
    
    public final void RS()
    {
      GMTrace.i(19705175736320L, 146815);
      com.tencent.mm.plugin.appbrand.o.d.aQ(this);
      switch (this.iWU)
      {
      default: 
        this.iWM = false;
        VC();
        GMTrace.o(19705175736320L, 146815);
        return;
      case 2: 
        WH();
        GMTrace.o(19705175736320L, 146815);
        return;
      }
      if (this.gBR == null) {
        this.gBR = c.Io();
      }
      if (this.gBR == null)
      {
        w.e("MicroMsg.JsApiGetLocation", "getLocationInMMProcess, iGetLocation == null");
        this.iWM = false;
        VC();
        GMTrace.o(19705175736320L, 146815);
        return;
      }
      if (this.iWS == null) {
        this.iWS = new a.a()
        {
          public final boolean a(boolean paramAnonymousBoolean, float paramAnonymousFloat1, float paramAnonymousFloat2, int paramAnonymousInt, double paramAnonymousDouble1, double paramAnonymousDouble2, double paramAnonymousDouble3)
          {
            GMTrace.i(19709336485888L, 146846);
            if (!paramAnonymousBoolean)
            {
              GMTrace.o(19709336485888L, 146846);
              return true;
            }
            w.v("MicroMsg.JsApiGetLocation", "doGeoLocation.onGetLocation, fLongitude:%f, fLatitude:%f, locType:%d, speed:%f, accuracy:%f, altitude : %s", new Object[] { Float.valueOf(paramAnonymousFloat1), Float.valueOf(paramAnonymousFloat2), Integer.valueOf(paramAnonymousInt), Double.valueOf(paramAnonymousDouble1), Double.valueOf(paramAnonymousDouble2), Double.valueOf(paramAnonymousDouble3) });
            if ((paramAnonymousDouble3 != 0.0D) && (JsApiGetLocation.LocationTask.this.gBR != null)) {
              JsApiGetLocation.LocationTask.this.gBR.c(JsApiGetLocation.LocationTask.this.iWS);
            }
            if (JsApiGetLocation.LocationTask.this.iWS == null)
            {
              w.w("MicroMsg.JsApiGetLocation", "already callback");
              GMTrace.o(19709336485888L, 146846);
              return false;
            }
            JsApiGetLocation.LocationTask.this.iWM = true;
            JsApiGetLocation.LocationTask.this.iWN = paramAnonymousFloat2;
            JsApiGetLocation.LocationTask.this.iWO = paramAnonymousFloat1;
            JsApiGetLocation.LocationTask localLocationTask = JsApiGetLocation.LocationTask.this;
            double d = paramAnonymousDouble1;
            if (paramAnonymousDouble1 == 0.0D) {
              d = -1.0D;
            }
            localLocationTask.aES = d;
            JsApiGetLocation.LocationTask.this.aEQ = paramAnonymousDouble2;
            JsApiGetLocation.LocationTask.this.aEP = paramAnonymousDouble3;
            JsApiGetLocation.LocationTask.this.iWP = 0.0D;
            JsApiGetLocation.LocationTask.this.iWQ = paramAnonymousDouble2;
            JsApiGetLocation.LocationTask.this.iWR = paramAnonymousInt;
            if ((paramAnonymousDouble3 != 0.0D) || (!JsApiGetLocation.LocationTask.this.iWL))
            {
              JsApiGetLocation.LocationTask.a(JsApiGetLocation.LocationTask.this);
              JsApiGetLocation.LocationTask.this.iWS = null;
            }
            for (;;)
            {
              GMTrace.o(19709336485888L, 146846);
              return false;
              h.xC().h(new Runnable()
              {
                public final void run()
                {
                  GMTrace.i(19710544445440L, 146855);
                  if (JsApiGetLocation.LocationTask.this.iWS == null)
                  {
                    GMTrace.o(19710544445440L, 146855);
                    return;
                  }
                  if (JsApiGetLocation.LocationTask.this.gBR != null) {
                    JsApiGetLocation.LocationTask.this.gBR.c(JsApiGetLocation.LocationTask.this.iWS);
                  }
                  JsApiGetLocation.LocationTask.b(JsApiGetLocation.LocationTask.this);
                  JsApiGetLocation.LocationTask.this.iWS = null;
                  GMTrace.o(19710544445440L, 146855);
                }
              }, 5000L);
              w.i("MicroMsg.JsApiGetLocation", "post delay 5 sec.");
            }
          }
        };
      }
      if (this.iWT == null) {
        this.iWT = new ae(Looper.getMainLooper());
      }
      this.iWT.postDelayed(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(19704907300864L, 146813);
          if (JsApiGetLocation.LocationTask.this.WH())
          {
            JsApiGetLocation.LocationTask.this.iWM = false;
            JsApiGetLocation.LocationTask.c(JsApiGetLocation.LocationTask.this);
          }
          GMTrace.o(19704907300864L, 146813);
        }
      }, 20000L);
      if (this.iWK.equalsIgnoreCase("gcj02"))
      {
        this.gBR.b(this.iWS, false);
        GMTrace.o(19705175736320L, 146815);
        return;
      }
      if (this.iWK.equalsIgnoreCase("wgs84")) {
        this.gBR.a(this.iWS, false);
      }
      GMTrace.o(19705175736320L, 146815);
    }
    
    public final void VB()
    {
      GMTrace.i(19705041518592L, 146814);
      super.VB();
      WI();
      com.tencent.mm.plugin.appbrand.o.d.aR(this);
      if (this.iqQ != null)
      {
        if (this.iWM)
        {
          HashMap localHashMap = new HashMap(4);
          localHashMap.put("latitude", Float.valueOf(this.iWN));
          localHashMap.put("longitude", Float.valueOf(this.iWO));
          localHashMap.put("speed", Double.valueOf(this.aES));
          localHashMap.put("accuracy", Double.valueOf(this.aEQ));
          if (this.iWL) {
            localHashMap.put("altitude", Double.valueOf(this.aEP));
          }
          if (b.bMv()) {
            localHashMap.put("provider", Integer.valueOf(this.iWR));
          }
          localHashMap.put("verticalAccuracy", Double.valueOf(this.iWP));
          localHashMap.put("horizontalAccuracy", Double.valueOf(this.iWQ));
          this.iqQ.v(this.iPM, this.iWJ.d("ok", localHashMap));
          GMTrace.o(19705041518592L, 146814);
          return;
        }
        this.iqQ.v(this.iPM, this.iWJ.d("fail", null));
      }
      GMTrace.o(19705041518592L, 146814);
    }
    
    public final void VS()
    {
      GMTrace.i(19705578389504L, 146818);
      if ((this.iWI != null) && (this.iWI.get() != null)) {
        ((AppBrandPageView)this.iWI.get()).b(this);
      }
      WI();
      this.iWU = 2;
      AppBrandMainProcessService.a(this);
      GMTrace.o(19705578389504L, 146818);
    }
    
    public final boolean WH()
    {
      GMTrace.i(19705309954048L, 146816);
      if (this.gBR != null) {
        this.gBR.c(this.iWS);
      }
      if (this.iWS == null)
      {
        w.w("MicroMsg.JsApiGetLocation", "already callback");
        GMTrace.o(19705309954048L, 146816);
        return false;
      }
      this.iWS = null;
      GMTrace.o(19705309954048L, 146816);
      return true;
    }
    
    public final void WI()
    {
      GMTrace.i(19705444171776L, 146817);
      AppBrandPageView localAppBrandPageView;
      if (this.iWI != null)
      {
        localAppBrandPageView = (AppBrandPageView)this.iWI.get();
        if (localAppBrandPageView != null) {}
      }
      else
      {
        GMTrace.o(19705444171776L, 146817);
        return;
      }
      long l = System.currentTimeMillis() - this.iWV;
      if (l < 3000L)
      {
        localAppBrandPageView.jjV.postDelayed(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(19708531179520L, 146840);
            JsApiGetLocation.LocationTask.this.WI();
            GMTrace.o(19708531179520L, 146840);
          }
        }, 3000L - l);
        GMTrace.o(19705444171776L, 146817);
        return;
      }
      com.tencent.mm.plugin.appbrand.page.a.e(localAppBrandPageView.irS).iZ(this.iSo);
      GMTrace.o(19705444171776L, 146817);
    }
    
    public final int describeContents()
    {
      GMTrace.i(19705712607232L, 146819);
      GMTrace.o(19705712607232L, 146819);
      return 0;
    }
    
    public final void f(Parcel paramParcel)
    {
      boolean bool2 = true;
      GMTrace.i(19705981042688L, 146821);
      super.f(paramParcel);
      this.iWK = paramParcel.readString();
      if (paramParcel.readByte() != 0)
      {
        bool1 = true;
        this.iWL = bool1;
        if (paramParcel.readByte() == 0) {
          break label139;
        }
      }
      label139:
      for (boolean bool1 = bool2;; bool1 = false)
      {
        this.iWM = bool1;
        this.iWN = paramParcel.readFloat();
        this.iWO = paramParcel.readFloat();
        this.aES = paramParcel.readDouble();
        this.aEQ = paramParcel.readDouble();
        this.aEP = paramParcel.readDouble();
        this.iWP = paramParcel.readDouble();
        this.iWQ = paramParcel.readDouble();
        this.iWU = paramParcel.readInt();
        this.iWR = paramParcel.readInt();
        GMTrace.o(19705981042688L, 146821);
        return;
        bool1 = false;
        break;
      }
    }
    
    public final void writeToParcel(Parcel paramParcel, int paramInt)
    {
      byte b2 = 1;
      GMTrace.i(19705846824960L, 146820);
      super.writeToParcel(paramParcel, paramInt);
      paramParcel.writeString(this.iWK);
      if (this.iWL)
      {
        b1 = 1;
        paramParcel.writeByte(b1);
        if (!this.iWM) {
          break label142;
        }
      }
      label142:
      for (byte b1 = b2;; b1 = 0)
      {
        paramParcel.writeByte(b1);
        paramParcel.writeFloat(this.iWN);
        paramParcel.writeFloat(this.iWO);
        paramParcel.writeDouble(this.aES);
        paramParcel.writeDouble(this.aEQ);
        paramParcel.writeDouble(this.aEP);
        paramParcel.writeDouble(this.iWP);
        paramParcel.writeDouble(this.iWQ);
        paramParcel.writeInt(this.iWU);
        paramParcel.writeInt(this.iWR);
        GMTrace.o(19705846824960L, 146820);
        return;
        b1 = 0;
        break;
      }
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/lbs/JsApiGetLocation.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */