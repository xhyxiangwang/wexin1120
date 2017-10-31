package com.tencent.mm.plugin.wallet_core.model;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.net.wifi.WifiInfo;
import android.util.Base64;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.e;
import com.tencent.mm.R.l;
import com.tencent.mm.jniinterface.AesEcb;
import com.tencent.mm.modelgeo.a.a;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.protocal.c.at;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.am;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.ar;
import com.tencent.mm.storage.t;
import com.tencent.mm.storage.w.a;
import com.tencent.mm.storage.x;
import com.tencent.mm.ui.MMAppMgr;
import com.tencent.mm.x.ap;
import java.lang.ref.WeakReference;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class h
{
  public static com.tencent.mm.modelgeo.c nrH;
  private static a rOx;
  private static h rOy;
  public static at rOz;
  public JSONArray rOA;
  
  static
  {
    GMTrace.i(6907381153792L, 51464);
    rOz = null;
    GMTrace.o(6907381153792L, 51464);
  }
  
  private h()
  {
    GMTrace.i(6905904758784L, 51453);
    init();
    GMTrace.o(6905904758784L, 51453);
  }
  
  public static com.tencent.mm.modelgeo.c Io()
  {
    GMTrace.i(6906307411968L, 51456);
    if (nrH == null) {
      nrH = com.tencent.mm.modelgeo.c.Io();
    }
    com.tencent.mm.modelgeo.c localc = nrH;
    GMTrace.o(6906307411968L, 51456);
    return localc;
  }
  
  protected static void Jl(String paramString)
  {
    GMTrace.i(17628424830976L, 131342);
    if (rOz == null) {
      rOz = new at();
    }
    w.d("MicroMsg.GpsReportHelper", "encrpydata %s", new Object[] { paramString });
    byte[] arrayOfByte = new byte[16];
    Object localObject2 = com.tencent.mm.wallet_core.c.m.ciJ().getBytes();
    if (localObject2 != null)
    {
      localObject1 = localObject2;
      if (localObject2.length > 0) {}
    }
    else
    {
      localObject1 = System.currentTimeMillis().getBytes();
    }
    int j = 0;
    int i = 0;
    int k;
    do
    {
      arrayOfByte[i] = localObject1[j];
      k = i + 1;
      j += 1;
      i = j;
      if (j >= localObject1.length) {
        i = 0;
      }
      j = i;
      i = k;
    } while (k < 16);
    Object localObject1 = Base64.encode(arrayOfByte, 0);
    localObject2 = rOz;
    if (k.rOC == null) {
      k.rOC = new k();
    }
    ((at)localObject2).tum = k.rOC.aM((byte[])localObject1);
    w.d("MicroMsg.GpsReportHelper", "mLocationInfo.encrypt_key %s", new Object[] { rOz.tum });
    paramString = Base64.encode(AesEcb.aesCryptEcb(paramString.getBytes(), arrayOfByte, true, true), 0);
    rOz.tul = new String(paramString);
    w.d("MicroMsg.GpsReportHelper", "mLocationInfo.encrypt_userinfo %s", new Object[] { new String(paramString) });
    GMTrace.o(17628424830976L, 131342);
  }
  
  public static h bwv()
  {
    GMTrace.i(6906173194240L, 51455);
    if (rOy == null) {
      rOy = new h();
    }
    h localh = rOy;
    GMTrace.o(6906173194240L, 51455);
    return localh;
  }
  
  public static at bww()
  {
    GMTrace.i(6906575847424L, 51458);
    at localat = rOz;
    GMTrace.o(6906575847424L, 51458);
    return localat;
  }
  
  public static void g(Activity paramActivity, final int paramInt)
  {
    int i = 1;
    GMTrace.i(6906441629696L, 51457);
    w.i("MicroMsg.GpsReportHelper", "reflashLocationInfo " + paramInt);
    Object localObject1 = m.bwE().bxc();
    if ((((ac)localObject1).rRn & 0x2000) > 0) {}
    Object localObject2;
    for (boolean bool = true;; bool = false)
    {
      w.i("MicroMsg.WalletSwitchConfig", "isReportLocation, ret = %s switchBit %s", new Object[] { Boolean.valueOf(bool), Integer.valueOf(((ac)localObject1).rRn) });
      if (!bool) {
        break label426;
      }
      if ((com.tencent.mm.modelgeo.c.Ip()) || (com.tencent.mm.modelgeo.c.Iq())) {
        break label280;
      }
      if (!bwv().wy(paramInt)) {
        break;
      }
      w.i("MicroMsg.GpsReportHelper", "should show lbs dialog,scene:%d", new Object[] { Integer.valueOf(paramInt) });
      ap.AS();
      localObject1 = (String)com.tencent.mm.x.c.xi().get(w.a.uYy, paramActivity.getString(R.l.eYQ));
      ap.AS();
      localObject2 = (String)com.tencent.mm.x.c.xi().get(w.a.uYz, paramActivity.getString(R.l.eYP));
      ap.AS();
      com.tencent.mm.x.c.xi().a(w.a.uYw, Long.valueOf(bg.Po()));
      com.tencent.mm.ui.base.h.a(paramActivity, (String)localObject2, (String)localObject1, paramActivity.getString(R.l.ejv), paramActivity.getString(R.l.duP), false, new DialogInterface.OnClickListener()new DialogInterface.OnClickListener
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(6865102569472L, 51149);
          this.ne.startActivity(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"));
          g.paX.i(13446, new Object[] { Integer.valueOf(paramInt), Integer.valueOf(2), Long.valueOf(bg.Po()) });
          paramAnonymousDialogInterface.dismiss();
          GMTrace.o(6865102569472L, 51149);
        }
      }, new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(6899730743296L, 51407);
          paramAnonymousDialogInterface.dismiss();
          GMTrace.o(6899730743296L, 51407);
        }
      }, R.e.aQR);
      GMTrace.o(6906441629696L, 51457);
      return;
    }
    w.i("MicroMsg.GpsReportHelper", "should'n show lbs dialog,scene:%d", new Object[] { Integer.valueOf(paramInt) });
    GMTrace.o(6906441629696L, 51457);
    return;
    label280:
    w.i("MicroMsg.GpsReportHelper", "reflashLocationInfo scene:%d", new Object[] { Integer.valueOf(paramInt) });
    if (paramActivity != null)
    {
      localObject1 = Io();
      if (rOx == null) {
        rOx = new a(paramActivity);
      }
      label411:
      for (;;)
      {
        if (rOx != null) {
          rOx.hkI = 0;
        }
        ((com.tencent.mm.modelgeo.c)localObject1).a(rOx, false);
        GMTrace.o(6906441629696L, 51457);
        return;
        localObject2 = rOx;
        if ((paramActivity != null) && (((a)localObject2).rOB != null) && (paramActivity.equals(((a)localObject2).rOB.get()))) {}
        for (paramInt = i;; paramInt = 0)
        {
          if (paramInt != 0) {
            break label411;
          }
          rOx = new a(paramActivity);
          break;
        }
      }
    }
    rOx = null;
    GMTrace.o(6906441629696L, 51457);
    return;
    label426:
    rOx = null;
    paramActivity = m.bwE().bxc();
    if ((paramActivity.rRn & 0x40000) > 0) {}
    for (bool = true;; bool = false)
    {
      w.i("MicroMsg.WalletSwitchConfig", "isReportWifiSSid, ret = %s switchBit %s", new Object[] { Boolean.valueOf(bool), Integer.valueOf(paramActivity.rRn) });
      if (bool)
      {
        WifiInfo localWifiInfo = am.getWifiInfo(ab.getContext());
        localObject2 = "";
        localObject1 = "";
        paramActivity = "";
        if (localWifiInfo != null)
        {
          localObject2 = localWifiInfo.getSSID();
          localObject1 = System.currentTimeMillis();
          paramActivity = localWifiInfo.getBSSID();
        }
        Jl(String.format("wifissid=%s&wifibssid=%s&ssid_timestamp=%s", new Object[] { localObject2, paramActivity, localObject1 }));
      }
      GMTrace.o(6906441629696L, 51457);
      return;
    }
  }
  
  private void init()
  {
    GMTrace.i(6906038976512L, 51454);
    ap.AS();
    String str = (String)com.tencent.mm.x.c.xi().get(w.a.uYx, "");
    w.i("MicroMsg.GpsReportHelper", "GpsReportHelper " + str);
    if (!bg.mZ(str)) {
      try
      {
        this.rOA = new JSONArray(str);
        GMTrace.o(6906038976512L, 51454);
        return;
      }
      catch (JSONException localJSONException)
      {
        w.printErrStackTrace("MicroMsg.GpsReportHelper", localJSONException, "", new Object[0]);
        w.e("MicroMsg.GpsReportHelper", "parse lbs config error", new Object[] { localJSONException });
      }
    }
    GMTrace.o(6906038976512L, 51454);
  }
  
  private boolean wy(int paramInt)
  {
    GMTrace.i(6906710065152L, 51459);
    if ((paramInt == 5) || (paramInt == 6))
    {
      GMTrace.o(6906710065152L, 51459);
      return false;
    }
    boolean bool2 = false;
    boolean bool1 = false;
    ap.AS();
    long l1 = ((Long)com.tencent.mm.x.c.xi().get(w.a.uYw, Long.valueOf(0L))).longValue();
    if (this.rOA == null) {
      init();
    }
    if (this.rOA != null)
    {
      int i = 0;
      bool2 = bool1;
      if (i < this.rOA.length())
      {
        JSONObject localJSONObject = this.rOA.optJSONObject(i);
        bool2 = bool1;
        if (localJSONObject != null)
        {
          bool2 = bool1;
          if (localJSONObject.optInt("scene") == paramInt) {
            if (localJSONObject.optInt("is_show_tips", 0) != 1) {
              break label201;
            }
          }
        }
        label201:
        for (int j = 1;; j = 0)
        {
          int k = localJSONObject.optInt("show_interval", 0);
          long l2 = bg.Po();
          bool2 = bool1;
          if (j != 0)
          {
            bool2 = bool1;
            if (l2 - l1 > k) {
              bool2 = true;
            }
          }
          i += 1;
          bool1 = bool2;
          break;
        }
      }
    }
    w.i("MicroMsg.GpsReportHelper", "shouldShow? %s mLbsConfig: %s ", new Object[] { Boolean.valueOf(bool2), this.rOA });
    GMTrace.o(6906710065152L, 51459);
    return bool2;
  }
  
  private static final class a
    implements a.a
  {
    int hkI;
    WeakReference<Activity> rOB;
    
    public a(Activity paramActivity)
    {
      GMTrace.i(6866310529024L, 51158);
      this.hkI = 0;
      this.rOB = new WeakReference(paramActivity);
      GMTrace.o(6866310529024L, 51158);
    }
    
    public final boolean a(boolean paramBoolean, float paramFloat1, float paramFloat2, int paramInt, double paramDouble1, double paramDouble2, double paramDouble3)
    {
      GMTrace.i(15394773401600L, 114700);
      if (paramBoolean)
      {
        if (h.rOz == null) {
          h.rOz = new at();
        }
        Object localObject = com.tencent.mm.x.m.zF();
        ap.AS();
        localObject = com.tencent.mm.x.c.yL().SL((String)localObject);
        h.rOz.gbX = ((x)localObject).getCityCode();
        h.rOz.gbW = ((x)localObject).bPL();
        long l = h.Io().hxj;
        WifiInfo localWifiInfo = am.getWifiInfo(ab.getContext());
        String str2 = "";
        String str1 = "";
        localObject = "";
        if (localWifiInfo != null)
        {
          str2 = localWifiInfo.getSSID();
          str1 = System.currentTimeMillis();
          localObject = localWifiInfo.getBSSID();
        }
        h.Jl(String.format("latitude=%.6f&longitude=%.6f&location_timestamp=%s&wifissid=%s&wifibssid=%s&ssid_timestamp=%s", new Object[] { Float.valueOf(paramFloat2), Float.valueOf(paramFloat1), Long.valueOf(l), str2, localObject, str1 }));
        w.i("MicroMsg.GpsReportHelper", "fLongitude=" + paramFloat1 + ";fLatitude=" + paramFloat2 + " tryCount: " + this.hkI);
        this.hkI += 1;
        if (this.hkI > 3) {
          h.nrH.c(this);
        }
        GMTrace.o(15394773401600L, 114700);
        return true;
      }
      w.e("MicroMsg.GpsReportHelper", "get Location fail;isOk=" + paramBoolean);
      h.nrH.c(this);
      if ((this.rOB != null) && (this.rOB.get() != null)) {
        MMAppMgr.an((Context)this.rOB.get());
      }
      GMTrace.o(15394773401600L, 114700);
      return false;
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/wallet_core/model/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */