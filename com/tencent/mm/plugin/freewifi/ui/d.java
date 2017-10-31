package com.tencent.mm.plugin.freewifi.ui;

import android.os.Looper;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.modelgeo.a;
import com.tencent.mm.plugin.freewifi.m;
import com.tencent.mm.plugin.freewifi.model.j;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.w;

public final class d
{
  public static void rB()
  {
    GMTrace.i(7206418251776L, 53692);
    try
    {
      c localc = c.aAU();
      c.a local1 = new c.a()
      {
        public final void t(float paramAnonymousFloat1, float paramAnonymousFloat2)
        {
          GMTrace.i(7192728043520L, 53590);
          try
          {
            String str1 = String.valueOf(paramAnonymousFloat1);
            String str2 = String.valueOf(paramAnonymousFloat2);
            com.tencent.mm.plugin.freewifi.g.c localc = j.aAe().yb(com.tencent.mm.plugin.freewifi.model.d.azV());
            if (localc != null)
            {
              g.paX.i(12073, new Object[] { localc.field_ssid, localc.field_mac, localc.field_url, localc.field_url, str2, str1 });
              w.i("MicroMsg.FreeWifi.FreeWifiLocationReporter", "report location. ssid=%s, mac=%s, mp_url=%s, qrcode=%s, longtitued=%s, latitude=%s", new Object[] { localc.field_ssid, localc.field_mac, localc.field_url, localc.field_url, str1, str2 });
            }
            GMTrace.o(7192728043520L, 53590);
            return;
          }
          catch (Exception localException)
          {
            w.e("MicroMsg.FreeWifi.FreeWifiLocationReporter", "report location exception. " + localException.getMessage() + m.e(localException));
            GMTrace.o(7192728043520L, 53590);
          }
        }
      };
      if (!localc.aDR)
      {
        localc.aDR = true;
        localc.mhh = com.tencent.mm.modelgeo.c.Io();
        if (localc.mhh == null)
        {
          w.e(c.TAG, "doGeoLocation fail, iGetLocation is null");
          GMTrace.o(7206418251776L, 53692);
          return;
        }
        if (localc.iWS == null) {
          localc.iWS = new c.1(localc, local1);
        }
        if (localc.iWT == null) {
          localc.iWT = new ae(Looper.myLooper());
        }
        localc.iWT.postDelayed(new c.2(localc), 20000L);
        localc.mhh.a(localc.iWS);
      }
      GMTrace.o(7206418251776L, 53692);
      return;
    }
    catch (Exception localException)
    {
      w.e("MicroMsg.FreeWifi.FreeWifiLocationReporter", "report location error. " + localException.getMessage());
      GMTrace.o(7206418251776L, 53692);
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/freewifi/ui/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */